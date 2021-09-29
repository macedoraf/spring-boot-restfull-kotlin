package br.com.fiap.restfullspringapi.base

import org.springframework.web.bind.annotation.*
import javax.websocket.server.PathParam

abstract class BaseController<S> {

    abstract val service: BaseService<S>

    @GetMapping
    @CrossOrigin
    fun getAll(): List<S> = service.list()

    @GetMapping("/{id}")
    @CrossOrigin
    fun findById(@PathVariable("id") id: Long): S? = service.findById(id)

    @PostMapping
    @CrossOrigin
    fun create(@RequestBody entity: S): S = service.create(entity)

    @DeleteMapping("/{id}")
    @CrossOrigin
    fun delete(@PathVariable("id") id: Long) = service.deleteById(id)

    @PutMapping("/{id}")
    @CrossOrigin
    fun update(@RequestBody entity: S, @PathVariable("id") id: Long): S = service.update(entity, id)

}