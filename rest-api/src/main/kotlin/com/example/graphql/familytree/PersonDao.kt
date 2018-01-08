package com.example.graphql.familytree

import org.springframework.stereotype.Component
import java.time.Instant
import java.util.*

@Component
class PersonDao {
    private val data = mutableListOf(
            Person(id = "qeii", name = "Queen Elizabeth II", createdAt = Instant.now()),
            Person(id = "pp", name = "Prince Philip", createdAt = Instant.now()),
            Person(id = "pc", name = "Prince Charles", createdAt = Instant.now()),
            Person(id = "pw", name = "Prince William", createdAt = Instant.now())
    )

    fun getPersonById(id: String) = data.firstOrNull { person -> person.id == id }

    fun createPerson(name: String): Person {
        val person = Person(id = UUID.randomUUID().toString(), name = name, createdAt = Instant.now())
        data.add(person)
        return person
    }
}
