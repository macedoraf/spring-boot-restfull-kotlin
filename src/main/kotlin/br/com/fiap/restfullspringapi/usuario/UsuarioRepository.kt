package br.com.fiap.restfullspringapi.usuario

import br.com.fiap.restfullspringapi.meta.Meta
import org.springframework.data.jpa.repository.JpaRepository

interface UsuarioRepository : JpaRepository<Meta, Long>