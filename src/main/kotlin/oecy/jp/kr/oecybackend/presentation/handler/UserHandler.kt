package oecy.jp.kr.oecybackend.presentation.handler

import java.net.URI
import kotlinx.coroutines.reactor.awaitSingle
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse

@Component
class UserHandler {

    suspend fun signUp(serverRequest: ServerRequest): ServerResponse {
        // TODO usecase 구현
        return ServerResponse.created(URI("/signup")).bodyValue("TODO").awaitSingle()
    }
}