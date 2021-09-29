package br.com.fiap.restfullspringapi.funcionario

import br.com.fiap.restfullspringapi.base.BaseService
import br.com.fiap.restfullspringapi.meta.Meta
import br.com.fiap.restfullspringapi.meta.MetaRepository
import org.springframework.stereotype.Service

@Service
class FuncionarioService(override val repository: MetaRepository) : BaseService<Meta>()