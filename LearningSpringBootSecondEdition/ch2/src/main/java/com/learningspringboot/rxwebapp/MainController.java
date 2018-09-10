package com.learningspringboot.rxwebapp;

import com.learngingspringboot.obj.Image;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
public class MainController {


    private static final Logger log = LoggerFactory.getLogger(MainController.class);

    private static final String API_BASE_PATH = "/api";


    @GetMapping(API_BASE_PATH + "/images")
    Flux<Image> images() {
        return Flux.just(
                new Image("1", "learning-spring-boot-cover.jpg"),
                new Image("2", "learning-spring-boot-2nd-edition-cover.jpg"),
                new Image("3", "bazinga.png")
        );
    }

/*
* One of the goodie of Rx is not need to specific taking a list of Images or just single one
* cuz gonna be the same in Rx perspective.
* */
    @PostMapping(API_BASE_PATH + "/images")
    Mono<Void> create(@RequestBody Flux<Image> images) {
        return images
//                Simply log
                .map(image -> {
                    log.info("We will save " + image +
                            " to a Reactive database soon!");
                    return image;
                })
                .then();
    }


}
