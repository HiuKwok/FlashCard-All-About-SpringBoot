/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.greglturnquist.learningspringboot.comments;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author Greg Turnquist
 * @author Hiu Kwok
 */

/**
 * Used to replaces the normal SpringBootApplication,
 * it extends all the funcaionality that previous annotation have,
 * also it add add EnableDiscoveryClient to register with Eureka and 
 * EnableCircuitBreaker, for fallback commands if remote service is down.
 */
@SpringCloudApplication
public class LearningSpringBootCommentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(
			LearningSpringBootCommentsApplication.class);
	}
}
// end::code[]