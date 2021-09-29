package br.com.fiap.restfullspringapi.funcionario

import br.com.fiap.restfullspringapi.usuario.Usuario
import org.springframework.data.jpa.repository.JpaRepository

interface FuncionarioRepository : JpaRepository<Usuario, Long>