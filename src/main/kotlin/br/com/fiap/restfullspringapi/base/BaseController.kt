package br.com.fiap.restfullspringapi.base

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.websocket.server.PathParam

abstract class BaseController<S> {

    abstract val service: BaseService<S>

    @GetMapping
    @CrossOrigin
    fun getAll(): ResponseEntity<List<S>> = execute { service.list() }

    @GetMapping("/{id}")
    @CrossOrigin
    fun findById(@PathVariable("id") id: Long): ResponseEntity<S?> = execute { service.findById(id) }

    @PostMapping
    @CrossOrigin
    fun create(@RequestBody entity: S): ResponseEntity<S> = execute { service.create(entity) }

    @DeleteMapping("/{id}")
    @CrossOrigin
    fun delete(@PathVariable("id") id: Long): ResponseEntity<Unit> = execute { service.deleteById(id) }

    @PutMapping("/{id}")
    @CrossOrigin
    fun update(@RequestBody entity: S, @PathVariable("id") id: Long): ResponseEntity<S> =
        execute { service.update(entity, id) }

    private fun <T> execute(function: () -> T): ResponseEntity<T> {
        return try {
            val result = function.invoke()
            ResponseEntity.ok(result)
        } catch (e: Exception) {
            e.printStackTrace()
            ResponseEntity.internalServerError().body(null)
        }
    }
}