package br.com.fiap.restfullspringapi.base

import org.springframework.web.bind.annotation.*
import javax.websocket.server.PathParam

abstract class BaseController<S> {

    abstract val service: BaseService<S>

    @GetMapping
    fun getAll(): List<S> = service.list()

    @GetMapping("/{id}")
    fun findById(@PathVariable("id") id: Long): S? = service.findById(id)

    @PostMapping
    fun create(@RequestBody entity: S): S = service.create(entity)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id: Long) = service.deleteById(id)

    @PutMapping("/{id}")
    fun update(@RequestBody entity: S, @PathVariable("id") id: Long): S = service.update(entity, id)

}