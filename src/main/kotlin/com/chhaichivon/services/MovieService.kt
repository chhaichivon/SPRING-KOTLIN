package com.chhaichivon.services

import com.chhaichivon.enitities.Movie

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 7/12/2017
 * TIME   : 12:25 AM
 */
interface MovieService {
    fun retrieveByTitle(title: String?): List<Movie>
    fun graph(limit: Int): Map<String, Any>
}