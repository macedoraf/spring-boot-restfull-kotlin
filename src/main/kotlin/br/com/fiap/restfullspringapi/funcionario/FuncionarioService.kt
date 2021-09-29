package br.com.fiap.restfullspringapi.funcionario

import br.com.fiap.restfullspringapi.base.BaseService
import br.com.fiap.restfullspringapi.usuario.Usuario
import br.com.fiap.restfullspringapi.usuario.UsuarioRepository
import org.springframework.stereotype.Service

@Service
class FuncionarioService(override val repository: UsuarioRepository) : BaseService<Usuario>()