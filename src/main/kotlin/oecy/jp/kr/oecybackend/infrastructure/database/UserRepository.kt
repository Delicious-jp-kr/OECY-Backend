package oecy.jp.kr.oecybackend.infrastructure.database

import oecy.jp.kr.oecybackend.domain.entity.User
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : CoroutineCrudRepository<User, Long> {
}