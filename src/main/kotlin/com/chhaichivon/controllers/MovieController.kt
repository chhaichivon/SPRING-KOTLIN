package com.chhaichivon.controllers

import com.chhaichivon.enitities.Movie
import com.chhaichivon.services.MovieService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 7/12/2017
 * TIME   : 12:34 AM
 */
@RestController
@RequestMapping("/movies")
class MovieController @Autowired constructor(val movieService: MovieService) {

    @RequestMapping("/graph")
    fun displayD3Graph(@RequestParam(value = "limit", required = false) limit: Int?): Map<String, Any> {
        return movieService.graph(limit ?: 100)
    }

    @RequestMapping("/{title}")
    fun retrieveByTitle(@PathVariable(value = "title") title: String): List<Movie> {
        val movies: List<Movie> = movieService.retrieveByTitle(title)
        if (movies.isEmpty()) throw NotFoundException()
        return movies
    }

}