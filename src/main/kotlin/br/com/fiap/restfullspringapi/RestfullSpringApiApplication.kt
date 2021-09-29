package br.com.fiap.restfullspringapi

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
@EnableAutoConfiguration
class RestfullSpringApiApplication

fun main(args: Array<String>) {
    runApplication<RestfullSpringApiApplication>(*args)
}