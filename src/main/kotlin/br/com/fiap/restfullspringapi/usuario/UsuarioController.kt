package br.com.fiap.restfullspringapi.usuario

import br.com.fiap.restfullspringapi.base.BaseController
import br.com.fiap.restfullspringapi.base.BaseService
import br.com.fiap.restfullspringapi.meta.Meta
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("usuario")
class UsuarioController(
    override val service: BaseService<Usuario>
) : BaseController<Usuario>() {

}