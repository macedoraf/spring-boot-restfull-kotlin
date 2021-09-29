package br.com.fiap.restfullspringapi.funcionario

import br.com.fiap.restfullspringapi.meta.Meta
import javax.persistence.*

@Entity
@Table(name = "Funcionario")
data class Funcionario(
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE) val id: Long,
    val name: String,
    val lastName: String,
    @OneToMany(
        cascade = [CascadeType.ALL],
        orphanRemoval = true,
        mappedBy = "funcionario"
    ) val metas: List<Meta>
) {
    constructor() : this(0, "", "", listOf())
}