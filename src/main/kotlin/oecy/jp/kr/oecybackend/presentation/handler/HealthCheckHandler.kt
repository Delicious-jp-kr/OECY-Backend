package oecy.jp.kr.oecybackend.presentation.handler

import kotlinx.coroutines.reactor.awaitSingle
import oecy.jp.kr.oecybackend.application.error.BaseException
import oecy.jp.kr.oecybackend.presentation.common.BaseResponse
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse

@Component
class HealthCheckHandler {

    suspend fun healthCheck(serverRequest: ServerRequest): ServerResponse = try {
        ServerResponse.ok().bodyValue(
            BaseResponse(
                status = 200,
                message = "OECY SERVER RUNNING 🚀",
                data = null
            )
        ).awaitSingle()
    } catch (e: Exception) {
        ServerResponse.status(500).bodyValue(
            BaseResponse.exception(e as BaseException)
        ).awaitSingle()
    }
}