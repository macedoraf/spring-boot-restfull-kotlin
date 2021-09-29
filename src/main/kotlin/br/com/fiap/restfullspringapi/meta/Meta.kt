package br.com.fiap.restfullspringapi.meta

import javax.persistence.*

@Entity
@Table(name = "Meta")
data class Meta(
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE) val id: Long,
    val description: String,
    val data: String
) {
    constructor() : this(0, "", "")
}