package com.chhaichivon.repository

import com.chhaichivon.enitities.Person
import org.springframework.data.neo4j.annotation.Query
import org.springframework.data.neo4j.repository.GraphRepository
import org.springframework.data.repository.query.Param
/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 7/12/2017
 * TIME   : 12:29 AM
 */
interface PersonRepository : GraphRepository<Person> {

    @Query("MATCH (p:Person) WHERE p.name =~ ('(?i).*'+{name}+'.*') RETURN p")
    fun findByNameIgnoreCaseContaining(@Param("name") name: String): List<Person>

}