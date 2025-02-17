package com.gradle.example.gradlebase.config;

import java.time.Clock;
import java.time.ZoneId;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("!test")
@Configuration
public class ApplicationConfig {


    // 日本向けTimeZoneの設定
    private static final String JP_TIME_ZONE = "Asia/Tokyo";

    /**
     * 日本標準時を持つClockのDI生成
     *
     * @return Clock
     */
    @Bean(name = "clock")
    public Clock clock() {
        return Clock.system(ZoneId.of(JP_TIME_ZONE));
    }
}
