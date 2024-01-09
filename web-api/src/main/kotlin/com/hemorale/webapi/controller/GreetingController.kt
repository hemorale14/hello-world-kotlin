package com.hemorale.webapi.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {

	@GetMapping("/greeting")
	fun get(): Array<String> {
		return arrayOf(
			"Hello World kotlin web API!",
			"Alumno: Hector Rocha Morales",
			"Materia: Contenedores",
			"Universidad Internacional de La Rioja en México"
		)
	}
}