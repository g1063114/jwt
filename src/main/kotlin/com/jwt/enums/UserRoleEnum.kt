package com.jwt.enums

enum class UserRoleEnum(
    val desc: String
) {
    ROLE_USER("사용자"),
    ROLE_MANAGER("매니저"),
    ROLE_ADMIN("관리자")
}