package com.chhaichivon.services

import com.chhaichivon.enitities.Person

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 7/12/2017
 * TIME   : 12:26 AM
 */
interface PersonService {
    fun findByName(name: String): List<Person>
}