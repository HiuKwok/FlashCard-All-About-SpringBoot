package com.example.demo;


import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockRestServiceServer;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Of course improvement can be made by fetch the end point from the central point for both src and test. 
 * 
 * Always mock up Json can be loaded from resource instead, so even remote call may evolve but no code 
 * change on test-side is require.
 */
@RunWith(SpringRunner.class)
@RestClientTest(UserServiceClient.class)
public class UserServiceClientTest {
 
    @Autowired
    private UserServiceClient user;
 
    @Autowired
    private MockRestServiceServer server;
 
    @Autowired
    private ObjectMapper objectMapper;
 
    @Before
    public void setUp() throws Exception {
        String detailsString = 
          objectMapper.writeValueAsString(new Users("Hiu Kwok", "Hiu"));
         
        //Set up behavior, to return the String constructed just one line above. 
        this.server.expect(requestTo("/hiu/details"))
          .andRespond(withSuccess(detailsString, MediaType.APPLICATION_JSON));
    }
 
    @Test
    public void getUserOnSuccess() 
      throws Exception {
 
    	// Call (Which involve remote call underneath)
        Users details = this.user.getUserDetails("hiu");
        // Test
        assertThat(details.getLogin()).isEqualTo("Hiu");
        assertThat(details.getName()).isEqualTo("Hiu Kwok");
    }
}