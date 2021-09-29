package br.com.fiap.restfullspringapi.funcionario

import javax.persistence.*

@Entity
@Table(name = "Funcionario")
data class Funcionario(
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE) val id: Long, val name: String, val lastName: String
) {
    constructor() : this(0, "", "")
}