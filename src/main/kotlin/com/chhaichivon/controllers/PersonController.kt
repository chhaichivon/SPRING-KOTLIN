package com.chhaichivon.controllers


import com.chhaichivon.enitities.Person
import com.chhaichivon.services.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 7/12/2017
 * TIME   : 12:32 AM
 */
@RestController
@RequestMapping("/persons")
class PersonController @Autowired constructor(val personService: PersonService) {

    @RequestMapping("/{name}")
    fun retrieveByName(@PathVariable(value = "name") name: String): List<Person> {
        val persons: List<Person> = personService.findByName(name)
        if (persons.isEmpty()) throw NotFoundException()
        return persons
    }

}