package com.acs.entity

import org.springframework.data.neo4j.core.schema.RelationshipId
import org.springframework.data.neo4j.core.schema.RelationshipProperties
import org.springframework.data.neo4j.core.schema.TargetNode

@RelationshipProperties
data class BelongTo(
    @RelationshipId val id:Long,
    @TargetNode val targetNode: AccNode,
)

@RelationshipProperties
data class ChildTo(
    @RelationshipId val id:Long,
    @TargetNode val targetNode: AccNode,
)