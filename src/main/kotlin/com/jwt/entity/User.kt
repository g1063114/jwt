package com.jwt.entity

import com.jwt.enums.UserRoleEnum
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import org.springframework.data.annotation.CreatedDate
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "user", catalog = "security")
class User(

    @Column(name = "user_name")
    val userName: String? = null,

    @Column(name = "password")
    val password: String? = null,

    @Column(name = "email")
    val email: String? = null,

    @Column(name = "role")
    @Enumerated(value = EnumType.STRING)
    var role: UserRoleEnum? = null,

    @Column(name = "created_at")
    @CreatedDate
    val createdAt: LocalDateTime? = null,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
) {
}