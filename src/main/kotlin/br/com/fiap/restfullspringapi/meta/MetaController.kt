package br.com.fiap.restfullspringapi.meta

import br.com.fiap.restfullspringapi.base.BaseController
import br.com.fiap.restfullspringapi.base.BaseService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("meta")
class MetaController(
    override val service: BaseService<Meta>
) : BaseController<Meta>() {

}