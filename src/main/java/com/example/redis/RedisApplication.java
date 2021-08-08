package com.example.redis;
import com.example.redis.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class RedisApplication {

    @Bean
    JedisConnectionFactory jedisConnectionFactory(){
        return new JedisConnectionFactory();
    }
    @Bean
    RedisConnectionFactory redisConnectionFactory(){
        return new LettuceConnectionFactory("192.168.99.100", 6379);
    }
    @Bean
    RedisTemplate<String, User> redisTemplate(){
        final RedisTemplate<String, User> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(redisConnectionFactory());
        return redisTemplate;
    }
    public static void main(String[] args) {
        SpringApplication.run(RedisApplication.class, args);
    }

//    @Bean
//    public ReactiveRedisTemplate<String, String> reactiveRedisTemplateJSON(ReactiveRedisConnectionFactory reactiveRedisConnectionFactory){
//        final RedisSerializationContext<String, String> redisSerializationContext = RedisSerializationContext
//                .<String, String>newSerializationContext(new StringRedisSerializer())
//                .hashKey(new StringRedisSerializer())
//                .hashValue(new Jackson2JsonRedisSerializer<>(Language.class))
//                .build();
//        return new ReactiveRedisTemplate<>(reactiveRedisConnectionFactory, redisSerializationContext);
//    }
//    @Bean
//    public RouterFunction<ServerResponse> routes(LanguageHandler languageHandler){
//        return route(GET("/"), languageHandler::all)
//                .andRoute(GET("/{id}"), languageHandler::get);
//    }
//    @Bean
//    public CommandLineRunner commandLineRunner(LanguageDao languageDao){

  //  }
}
