/*
 * Copyright 2017 the original author or authors.
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
package com.greglturnquist.learningspringboot;

import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * @author Greg Turnquist
 */
/**
 * Bean always come with a repo. So method can be used. 
 *
 */
public interface EmployeeRepository extends
	ReactiveCrudRepository<Employee, String>,
//	Mix-in interface that introduces the Query by Example operations.
	ReactiveQueryByExampleExecutor<Employee> {
	
		/**
		 * The whole of implementing ReactiveQuerByExample is to let 
		 * ppl can search the obj on DB via partial info (proba).
		 * Then called with Example.of(e);
		 */

}
// end::code[]
