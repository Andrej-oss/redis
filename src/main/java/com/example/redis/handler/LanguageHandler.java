package com.example.redis.handler;

import com.example.redis.dao.LanguageDao;
import com.example.redis.entity.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;
import reactor.core.publisher.Mono;

@Service
public class LanguageHandler {

//    private LanguageDao languageDao;
//
//    @Autowired
//    public LanguageHandler(LanguageDao languageDao) {
//        this.languageDao = languageDao;
//    }
//
//    public Mono<ServerResponse> all(ServerRequest serverRequest) {
//        return ServerResponse.ok().body(languageDao.findAll(), Language.class);
//    }
//
//    public Mono<ServerResponse> get(ServerRequest serverRequest) {
//        return ServerResponse.ok().body(languageDao.findById(serverRequest.pathVariable("id"))
//        .flatMap(language -> ServerResponse.ok().body(Mono.just(language), Language.class))
//        .switchIfEmpty(ServerResponse.notFound().build()));
//    }
}
