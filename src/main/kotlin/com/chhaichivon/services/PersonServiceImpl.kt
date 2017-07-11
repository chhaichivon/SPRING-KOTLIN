package com.chhaichivon.services


import com.chhaichivon.enitities.Person
import com.chhaichivon.repository.PersonRepository
import org.springframework.beans.factory.annotation.Autowired

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 7/12/2017
 * TIME   : 12:26 AM
 */
@TransactionalService
internal class PersonServiceImpl @Autowired constructor(val personRepository: PersonRepository?): PersonService {

    override fun findByName(name: String): List<Person> {
        return personRepository!!.findByNameIgnoreCaseContaining(name)
    }

}