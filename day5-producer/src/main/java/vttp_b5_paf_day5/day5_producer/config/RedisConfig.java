package vttp_b5_paf_day5.day5_producer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import vttp_b5_paf_day5.day5_producer.model.Todo;

@Configuration
public class RedisConfig {
    
    @Bean("todo")
    RedisTemplate<String, Todo> RedisTemplate(RedisConnectionFactory connFac, Jackson2JsonRedisSerializer<Todo> serializer){
        
        RedisTemplate<String, Todo> redisTemplate = new RedisTemplate<>();

        redisTemplate.setConnectionFactory(connFac);
        redisTemplate.setDefaultSerializer(serializer);
        redisTemplate.afterPropertiesSet();

        return redisTemplate;   
    }

    @Bean
    public Jackson2JsonRedisSerializer<Todo> jackson2JsonRedisSerializer(){
        return new Jackson2JsonRedisSerializer<>(Todo.class);
    }
}
