package br.com.fiap.restfullspringapi.usuario

import br.com.fiap.restfullspringapi.meta.Meta
import javax.persistence.*

@Entity
@Table(name = "Funcionario")
data class Usuario(
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE) val id: Long,
    val name: String,
    val lastName: String,
    val password: String,
    @OneToMany(mappedBy = "metas") val metas: List<Meta>
) {
    constructor() : this(0, "", "", "", listOf())
}