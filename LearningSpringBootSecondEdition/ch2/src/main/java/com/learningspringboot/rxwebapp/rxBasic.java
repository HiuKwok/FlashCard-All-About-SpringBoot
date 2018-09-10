package com.learningspringboot.rxwebapp;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

//Mono is subset of Flux.
public class rxBasic {

    public static void main(String[] args) {
        Flux.just("alpha", "bravo", "charlie")
                .map(String::toUpperCase)
                .flatMap(s -> Flux.fromArray(s.split("")))
                .groupBy(String::toString)
                .sort((o1, o2) -> o1.key().compareTo(o2.key()))
                .flatMap(group -> Mono.just(group.key()).and(group.count()))
                .subscribe(System.out::println);

        Flux.just("alpha", "bravo", "charlie")
            .subscribe(o -> System.out.println(o));
    }
}
