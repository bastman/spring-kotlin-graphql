package com.example.graphql.familytree

import java.time.Instant

data class Person(
        val id: String,
        val name: String,
        val createdAt: Instant
)
