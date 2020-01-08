package com.theocho.youflix;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {
        corsRegistry.addMapping("/**")
                .allowedOrigins("*", "https://angular-youflix-videoapp.herokuapp.com", "https://safe-springs-62086.herokuapp.com/videos", "https://safe-springs-62086.herokuapp.com", "https://angular-youflix-videoapp.herokuapp.com/videos", "https://github.com", "https://s3-S3_REGION_ID.amazonaws.com/S3_BUCKET/SampleVideo_1280x720_5mb.mp4")
                .allowedMethods("POST")
                .allowedHeaders("Content-Type", "Authorization")
                .allowCredentials(false)
                .maxAge(32400);  // 9 hours max age;
    }
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedOrigins("*")
//                .allowedMethods("POST")
//                .allowedHeaders("Content-Type", "Authorization")
//                .allowCredentials(false)
//                .maxAge(32400);  // 9 hours max age
//    }
}