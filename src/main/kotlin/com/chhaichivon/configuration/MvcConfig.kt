package com.chhaichivon.configuration

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 7/11/2017
 * TIME   : 11:17 PM
 */
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter

@Configuration
@Import(DatabaseConfig::class)
open class MvcConfig : WebMvcConfigurerAdapter()