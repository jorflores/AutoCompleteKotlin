package com.example.autocomplete

data class Empleado (
    val nombre : String,
    val departamento: String,
    val correo: String
        )
{

    override fun toString(): String {
        return nombre.plus(" (" + departamento + ")" )
    }

}