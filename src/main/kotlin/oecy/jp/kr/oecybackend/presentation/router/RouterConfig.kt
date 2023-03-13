package oecy.jp.kr.oecybackend.presentation.router

import oecy.jp.kr.oecybackend.presentation.handler.HealthCheckHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.coRouter

@Configuration
class RouterConfig {

    @Bean
    fun apiRouter(healthCheckHandler: HealthCheckHandler) = coRouter {
        "/".nest {
            contentType(MediaType.APPLICATION_JSON)
            GET("/", healthCheckHandler::healthCheck)
        }
    }
}