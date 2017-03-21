package com.springSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

import static org.springframework.session.data.redis.RedisFlushMode.ON_SAVE;

/**
 * Created by Administrator on 2017/3/21 0021.
 */
@SpringBootApplication
/**
 * maxInactiveIntervalInSeconds: 设置Session失效时间（单位：秒），使用Redis Session之后，原Boot的server.session.timeout属性不再生效
 * redisNamespace: 命名空间
 * redisFlushMode: ON_SAVE,IMMEDIATE两种模式
 */
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 10, redisNamespace = "abc", redisFlushMode = ON_SAVE)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
