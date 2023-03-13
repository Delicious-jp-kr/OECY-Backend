package oecy.jp.kr.oecybackend.presentation.router

import oecy.jp.kr.oecybackend.presentation.handler.HealthCheckHandler
import oecy.jp.kr.oecybackend.presentation.handler.UserHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.coRouter

@Configuration
class RouterConfig(
    private val healthCheckHandler: HealthCheckHandler,
    private val userHandler: UserHandler
) {

    @Bean
    fun apiRouter() = coRouter {
        "/".nest {
            contentType(MediaType.APPLICATION_JSON)
            GET("/", healthCheckHandler::healthCheck)
        }
        "/api/v1/users".nest {
            contentType(MediaType.APPLICATION_JSON)
            POST("/signup", userHandler::signUp)
        }
    }
}