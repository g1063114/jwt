package com.jwt.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.UrlBasedCorsConfigurationSource
import org.springframework.web.filter.CorsFilter

@Configuration
class CorsConfig {

    @Bean
    fun corsFilter(): CorsFilter {
        val source = UrlBasedCorsConfigurationSource()
        val config = CorsConfiguration()
        config.allowCredentials = true  // 서버 응답할 때 json을 js에서 처리할 수 있게 할지 설정
        config.addAllowedOrigin("*")    // 모든 ip에 응답을 허용
        config.addAllowedHeader("*")    // 모든 header에 응답을 허용
        config.addAllowedMethod("*")    // 모든 http method에 응답을 허용
        source.registerCorsConfiguration("/api/**", config)
        return CorsFilter(source)
    }
}