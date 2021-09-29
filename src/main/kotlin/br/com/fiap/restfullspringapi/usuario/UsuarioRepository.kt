package br.com.fiap.restfullspringapi.usuario

import br.com.fiap.restfullspringapi.usuario.Usuario
import org.springframework.data.jpa.repository.JpaRepository

interface UsuarioRepository : JpaRepository<Usuario, Long>