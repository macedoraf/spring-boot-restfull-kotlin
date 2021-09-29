package br.com.fiap.restfullspringapi.usuario

import javax.persistence.*

@Entity
@Table(name = "Funcionario")
data class Usuario(
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE) val id: Long,
    val name: String,
    val lastName: String,
    val password: String
) {
    constructor() : this(0, "", "", "")
}