package com.example.neo4j.model

import org.springframework.data.neo4j.core.schema.GeneratedValue
import org.springframework.data.neo4j.core.schema.Id
import org.springframework.data.neo4j.core.schema.Relationship

data class Post(
    @Id
    @GeneratedValue
    val id: Long?,
    val postId: Long,
    val mediaType: String,
    val caption: String?,

    @Relationship(type = "CREATED", direction = Relationship.Direction.INCOMING)
    val user: User
) {
    constructor(postId: Long, mediaType: String, caption: String?, user: User) : this(
        null,
        postId,
        mediaType,
        caption,
        user
    )
}
