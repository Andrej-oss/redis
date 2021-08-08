package com.example.redis.dao;

import com.example.redis.entity.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ReactiveRedisOperations;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class LanguageDao{

//    private ReactiveRedisOperations<String, Language> template;
//
//    @Autowired
//    public LanguageDao(ReactiveRedisOperations<String, Language> template) {
//        this.template = template;
//    }
//
//    public Flux<Language> findAll(){
//        return template.<String, Language>opsForHash().values("language");
//    }
//    public Mono<Language> findById(String id){
//        return template.<String, Language>opsForHash().get("language", id);
//    }
//    public Mono<Language> save(Language language){
//        return template.<String, Language>opsForHash().put("language", language.getId(), language)
//                .map(aBoolean -> language);
//    }
}
