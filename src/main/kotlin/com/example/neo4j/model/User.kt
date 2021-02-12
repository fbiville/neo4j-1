package com.example.neo4j.model

import org.springframework.data.neo4j.core.schema.GeneratedValue
import org.springframework.data.neo4j.core.schema.Id
import org.springframework.data.neo4j.core.schema.Node

@Node
data class User(
    @Id
    @GeneratedValue
    val id: Long?,
    val userId: Long,
    val username: String,
    val fullName: String?,
) {
    constructor(userId: Long, username: String, fullName: String?) : this(null, userId, username, fullName)
}
