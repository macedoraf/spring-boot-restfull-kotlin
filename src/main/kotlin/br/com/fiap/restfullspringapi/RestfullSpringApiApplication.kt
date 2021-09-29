package br.com.fiap.restfullspringapi

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody


@SpringBootApplication
@EnableAutoConfiguration
@Controller
class RestfullSpringApiApplication {
    companion object {

    }


    @RequestMapping("/")
    @ResponseBody
    fun home(): String? {
        return "Hello World!"
    }
}
fun main(args: Array<String>) {
    runApplication<RestfullSpringApiApplication>(*args)
}
