package br.com.fiap.restfullspringapi.usuario

import br.com.fiap.restfullspringapi.base.BaseService
import org.springframework.stereotype.Service

@Service
class UsuarioService(override val repository: UsuarioRepository) : BaseService<Usuario>()