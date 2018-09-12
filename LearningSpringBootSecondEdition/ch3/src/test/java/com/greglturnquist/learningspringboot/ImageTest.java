package com.greglturnquist.learningspringboot;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ImageTest {

	@Test
	public void test() {
		
		String id = "id";
		String fname = "file-name.jpg";
		Image image = new Image(id,  fname);
		assertThat(image.getId()).isEqualTo(id);
		assertThat(image.getName()).isEqualTo(fname);
		
	}

}
