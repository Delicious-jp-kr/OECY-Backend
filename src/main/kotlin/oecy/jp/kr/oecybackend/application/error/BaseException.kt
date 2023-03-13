package oecy.jp.kr.oecybackend.application.error

class BaseException(
    val status: Int,
    override val message: String
) : RuntimeException()