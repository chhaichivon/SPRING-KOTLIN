package com.chhaichivon.util

import com.chhaichivon.enitities.Movie
import org.hibernate.SessionFactory
import org.hibernate.cfg.Configuration

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 7/12/2017
 * TIME   : 12:44 AM
 */
class HibernateUtil {
    var sessionFactory : SessionFactory = buildSessionFactory()

    // hibernate.properties
    fun  buildSessionFactory() : SessionFactory {
        val configuration : Configuration? = null
        val addProperties = configuration.addProperties(Movie:class)
        return configuration.buildSessionFactory(new StandardServiceRegistryBuilder().build());
    }

}