package com.acs.entity

import org.springframework.data.neo4j.core.Neo4jClient
import org.springframework.data.neo4j.core.schema.GeneratedValue
import org.springframework.data.neo4j.core.schema.Id
import org.springframework.data.neo4j.core.schema.IdGenerator
import org.springframework.data.neo4j.core.schema.Node
import org.springframework.stereotype.Component
/*

@Component
data class MyIdGenerator(
    val neo4jClient:Neo4jClient,

): IdGenerator<String> {
    override fun generateId(primaryLabel: String, entity: Any): String {
        return neo4jClient.query("")
            .fetchAs(String::class.java)
            .one()
            .get()
    }
}

@Node("Movie")
class MovieEntity {
    @Id
    @GeneratedValue(generatorRef = "myIdGenerator")
    private val id: String? = null
    private val name: String? = null
}
 */

