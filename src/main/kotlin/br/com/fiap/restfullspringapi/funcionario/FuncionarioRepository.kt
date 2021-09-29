package br.com.fiap.restfullspringapi.funcionario

import br.com.fiap.restfullspringapi.meta.Meta
import org.springframework.data.jpa.repository.JpaRepository

interface FuncionarioRepository : JpaRepository<Funcionario, Long>