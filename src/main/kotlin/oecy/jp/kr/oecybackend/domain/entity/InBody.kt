package oecy.jp.kr.oecybackend.domain.entity

import oecy.jp.kr.oecybackend.domain.Sex
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table(name = "tbl_inbody")
data class InBody(
    @Id
    val userId: Long,
    val age: Int,
    val height: Double,
    val sex: Sex,
    val weight: Double,
    val skeletalMuscleMass: Double,
    val bodyFatPercentage: Double,
    val upDownBalance: String,
    val upLeftRightBalance: String,
    val downLeftRightBalance: String,
    val visceralFatLevel: Int
)