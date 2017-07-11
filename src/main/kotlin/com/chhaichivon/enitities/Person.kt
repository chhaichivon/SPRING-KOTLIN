package com.chhaichivon.enitities

import com.fasterxml.jackson.annotation.JsonIdentityInfo
import com.voodoodyne.jackson.jsog.JSOGGenerator
import org.neo4j.ogm.annotation.GraphId
import org.neo4j.ogm.annotation.NodeEntity
import org.neo4j.ogm.annotation.Relationship

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 7/12/2017
 * TIME   : 12:20 AM
 */
@NodeEntity
@JsonIdentityInfo(generator = JSOGGenerator::class)
open class Person {
    @GraphId
    var id: Long? = null
    var name: String? = null
    var born: Int? = null
    @Relationship(type = "ACTED_IN")
    var movies: MutableList<Movie>? = null
}