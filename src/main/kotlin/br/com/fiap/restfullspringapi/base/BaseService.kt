package br.com.fiap.restfullspringapi.base

import org.springframework.data.jpa.repository.JpaRepository

abstract class BaseService<S> {
    abstract val repository: JpaRepository<S, Long>

    fun create(entity: S): S = repository.save<S>(entity)

    fun findById(id: Long): S? = repository.findById(id).orElse(null)

    fun list(): List<S> = repository.findAll()

    fun deleteById(id: Long) {
        repository.deleteById(id)
    }

    fun delete(entity: S) {
        repository.delete(entity)
    }

    fun update(entity: S, id: Long): S {
        repository.deleteById(id)
        return repository.save(entity)
    }
}