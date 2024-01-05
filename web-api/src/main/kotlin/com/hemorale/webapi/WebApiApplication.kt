package com.hemorale.webapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.hemorale.webapi")
class WebApiApplication

fun main(args: Array<String>) {
	runApplication<WebApiApplication>(*args)
}
