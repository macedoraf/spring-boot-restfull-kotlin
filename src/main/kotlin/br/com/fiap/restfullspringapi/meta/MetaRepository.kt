package br.com.fiap.restfullspringapi.meta

import org.springframework.data.jpa.repository.JpaRepository

interface MetaRepository : JpaRepository<Meta, Long>