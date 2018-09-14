package com.example.demo;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
/**
 * Ref: https://www.baeldung.com/restclienttest-in-spring-boot
 * @author Hiu Kwok
 *
 *
 * A Basic controller which reutrn a Details class by call endpoint: /{name}/details.
 */
@Service
public class UserServiceClient {
	

	private final RestTemplate restTemplate;
	private final String queryDetail = "/{name}/details";
	 
	 
	/**
	 * Constructor for Spirng Boot to use.
	 * @param restTemplateBuilder
	 */
    public UserServiceClient(RestTemplateBuilder restTemplateBuilder) {
        restTemplate = restTemplateBuilder.build();
    }
 
    public Users getUserDetails(String name) {
        return restTemplate.getForObject(queryDetail, Users.class, name);
    }
}
