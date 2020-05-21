package com.baeldung.cloud.openfeign.config;

import feign.Logger;
import feign.RequestInterceptor;
import feign.codec.ErrorDecoder;
import feign.okhttp.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfiguration {

    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public ErrorDecoder errorDecoder() {
        return new ErrorDecoder.Default();
    }

    @Bean
    public OkHttpClient client() {
        return new OkHttpClient();
    }

    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            requestTemplate.header("Authorization", "Bearer 3_d7OOLAkxisaArZ7pkFBWXNiWJB4OpyBZ4KZ4iFV9Ku6ga0I4kiRe0gqt6sLKbzGY-VggS7l56u63uqVACwOOYeEDqt1_fVLA_3M3QFg3Z9WzDz9udY4n5TCKsFART7juAJtDVXvjjNQDb7sUK_M6vbwMmeenWpdtjMlOR6Zu3ThauQ7RnAnVAZPyljlN7NZ5-mU9hpkAmcIcIeOojzjILkPUjmE7g_sKOoXoft6G8mXdQKl_6F8QnlYXObOUY01McFOuX4QtsGpFAGmXwgE9DXy4bAnZMn6YRMSy_iDMpbybrXlgm_JP4InHFmCb8jDYDclO7qawrE3uhCB4Wzuh0WGh5v2fR5-sZ-hLbRZp61mUOCesMihSfT5qBQrPCMNW-wjIwAyO-_q5GjQRE3bq2oZK9aa_EOxQgv7u8H0PZHaPtML5n9UHOWM_YOqL5ocyU91RGy7anitGhbffdV9BXaTDh3vNXgwK-UrZLcV2TOzsdO1A8abvepWgvjYGeaWL_hxdysedfMeX_3YNofhQ");
//            requestTemplate.header("Cookie", ".AspNet.Cookies=IFKdIsDAZKBeZsQXRcPKulE0GBnJ5MkabHEdA3izTl3TU3kgPv33dGMpLM5UO0lv7KUiqNxg2V0N3etgbkIqbMiF32Gq4IGzSAGW93KrCkGe6qjY-exvXwk6L1e1gtSQCfm6IvHgN0ng1se3BPVP6OEI_K2Zg9DhsC8hP8rPzy3Ww8Lxa5fMLhIjuTXbdY5-PH0TmWvq-JbOzPeScU2QtmM6Q5Nw9tPuUUefatdzNADqexNfFHz-IqfZGjbMgRRQusLXDjkAnKDAToQ22ckMcPYkm-LIaxkbdrCEeY4NRceJJQe5mqV1Y4jcnJKQp1MYd-1_OGSlVXHkE6OMVslmu5T6pShxzv3usvNoTIdOc65AgGUE0Ugyb9GGjJYqCGaP4uFG30lDYH5Cyn6mnIzFRFmgaGfmVhIEz7yRMuhagHxTcUsV9X9vtI-Rgd3BhjcGWN7D0q3wFAXTaGIGz8YMhiIDYb1M9OYgA0diWz_x4vOPZqMASdpjC03BJx6_l8kaOM3jN7lf2AFBiTWxtlIRUw");
//            requestTemplate.header("Cache-Control", "no-cache");
//            requestTemplate.header("Postman-Token", "<calculated when request is sent>");
//            requestTemplate.header("Content-Length", "0");
//            requestTemplate.header("Host", "<calculated when request is sent>");
//            requestTemplate.header("User-Agent", "PostmanRuntime/7.24.1");
//            requestTemplate.header("Accept", "*/*");
//            requestTemplate.header("Accept-Encoding", "gzip, deflate, br");
//            requestTemplate.header("Connection", "keep-alive");
        };
    }
}
