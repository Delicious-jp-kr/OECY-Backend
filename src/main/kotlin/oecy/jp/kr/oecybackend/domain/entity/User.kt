package oecy.jp.kr.oecybackend.domain.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table(name = "tbl_user")
data class User(
    @Id
    val id: Long,
    val accountId: String,
    val password: String,
    val name: String
)
