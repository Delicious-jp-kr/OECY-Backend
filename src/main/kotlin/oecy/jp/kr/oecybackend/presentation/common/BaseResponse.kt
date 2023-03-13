package oecy.jp.kr.oecybackend.presentation.common

import oecy.jp.kr.oecybackend.application.error.BaseException

data class BaseResponse(
    val status: Int,
    val message: String,
    val data: Any?
) {

    companion object {
        fun exception(e: BaseException) = BaseResponse(
            status = e.status,
            message = e.message,
            data = null
        )
    }
}
