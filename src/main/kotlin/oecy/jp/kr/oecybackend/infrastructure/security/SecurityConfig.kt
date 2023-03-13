package oecy.jp.kr.oecybackend.infrastructure.security

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpMethod
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity
import org.springframework.security.config.web.server.ServerHttpSecurity
import org.springframework.security.web.server.SecurityWebFilterChain

@Configuration
@EnableWebFluxSecurity
class SecurityConfig {

    @Bean
    protected fun configureSecurityWebFilterChain(http: ServerHttpSecurity): SecurityWebFilterChain {
        http
            .csrf().disable()
            .formLogin().disable()
            .cors().and()
            .authorizeExchange()
            .pathMatchers(HttpMethod.GET, "/").permitAll()
            .anyExchange().authenticated()
        return http.build()
    }
}