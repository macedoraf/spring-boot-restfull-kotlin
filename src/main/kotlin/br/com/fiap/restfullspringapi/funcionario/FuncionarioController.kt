package br.com.fiap.restfullspringapi.funcionario

import br.com.fiap.restfullspringapi.base.BaseController
import br.com.fiap.restfullspringapi.base.BaseService
import br.com.fiap.restfullspringapi.meta.Meta
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("funcionario")
class FuncionarioController(
    override val service: BaseService<Funcionario>
) : BaseController<Funcionario>() {

}