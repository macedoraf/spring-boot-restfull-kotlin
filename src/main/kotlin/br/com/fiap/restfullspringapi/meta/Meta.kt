package br.com.fiap.restfullspringapi.meta

import br.com.fiap.restfullspringapi.funcionario.Funcionario
import javax.persistence.*

@Entity
@Table(name = "Meta")
data class Meta(
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE) val id: Long,
    val description: String,
    val data: String,
    @ManyToOne(fetch = FetchType.LAZY) val funcionario: Funcionario?
) {
    constructor() : this(0, "", "", null)
}