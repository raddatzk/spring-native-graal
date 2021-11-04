package com.raddatzk.springnativegraal

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class Application {
	@GetMapping("/test")
	fun test(): String {
		return "test"
	}
}

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}
