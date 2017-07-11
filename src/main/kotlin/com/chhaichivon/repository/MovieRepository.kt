package com.chhaichivon.repository

import com.chhaichivon.enitities.Movie
import org.springframework.data.neo4j.annotation.Query
import org.springframework.data.neo4j.repository.GraphRepository
import org.springframework.data.repository.query.Param

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 7/12/2017
 * TIME   : 12:28 AM
 */
interface MovieRepository : GraphRepository<Movie> {

    @Query("MATCH (m:Movie) WHERE m.title =~ ('(?i).*'+{title}+'.*') RETURN m")
    fun findByTitleIgnoreCaseContaining(@Param("title") title: String): List<Movie>

    @Query("MATCH (m:Movie)<-[:ACTED_IN]-(a:Person) RETURN m.title as movie, collect(a.name) as cast LIMIT {limit}")
    fun graph(@Param("limit") limit: Int): List<Map<String, Any>>

}