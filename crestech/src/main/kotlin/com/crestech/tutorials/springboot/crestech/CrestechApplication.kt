package com.crestech.tutorials.springboot.crestech

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CrestechApplication

fun main(args: Array<String>) {
	runApplication<CrestechApplication>(*args)
}
