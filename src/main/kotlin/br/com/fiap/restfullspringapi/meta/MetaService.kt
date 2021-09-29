package br.com.fiap.restfullspringapi.meta

import br.com.fiap.restfullspringapi.base.BaseService
import org.springframework.stereotype.Service

@Service
class MetaService(override val repository: MetaRepository) : BaseService<Meta>()