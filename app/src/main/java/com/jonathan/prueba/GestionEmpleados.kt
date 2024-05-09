package com.jonathan.prueba

import com.jonathan.prueba.data.entity.EmpleadoEntity
import kotlin.random.Random

class GestionEmpleados {

    fun main(): ArrayList<EmpleadoEntity> {
        val myEmpleadoEntities = ArrayList<EmpleadoEntity>()
        val name = listOf("1", "2", "3", "4", "5")
        repeat(5) {
            myEmpleadoEntities.add(EmpleadoEntity(it, "John${name[it]}", "Valdez${name[it]}", Random(1000L).nextLong().toDouble()))
        }

        return myEmpleadoEntities
    }

    fun calcularPromedioSalario(myEmpleadoEntities: ArrayList<EmpleadoEntity>): Double {
        var totalSalario = 0.0
        myEmpleadoEntities.forEach {
            totalSalario += it.salario ?: 0.0
        }
        return totalSalario / myEmpleadoEntities.size
    }
}