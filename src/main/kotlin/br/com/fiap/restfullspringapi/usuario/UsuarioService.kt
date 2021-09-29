package br.com.fiap.restfullspringapi.usuario

import br.com.fiap.restfullspringapi.base.BaseService
import br.com.fiap.restfullspringapi.meta.Meta
import br.com.fiap.restfullspringapi.meta.MetaRepository
import org.springframework.stereotype.Service

@Service
class UsuarioService(override val repository: MetaRepository) : BaseService<Meta>()