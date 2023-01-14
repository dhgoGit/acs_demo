package com.acs.entity

import org.springframework.data.neo4j.core.schema.GeneratedValue
import org.springframework.data.neo4j.core.schema.Id
import org.springframework.data.neo4j.core.schema.Property
import org.springframework.data.neo4j.core.schema.Relationship
import org.springframework.data.neo4j.core.support.UUIDStringGenerator

class AccNode(
    @Id @GeneratedValue(UUIDStringGenerator::class)
    val id: Long,
    @Property("type")
    val accType:AccType,
    @Property("name")
    val name: String,
    @Relationship(type = "belong", direction = Relationship.Direction.OUTGOING)
    val belong:List<BelongTo>,
    @Relationship(type = "child", direction = Relationship.Direction.OUTGOING)
    val child:List<ChildTo>
)

enum class AccType(type:Int){
    USER(0),
    USER_GROUP(1),
    ACC_LEVEL(2),
    ACC_GROUP(3),
}