package com.jonathan.prueba

import com.jonathan.prueba.data.entity.EmpleadoEntity
import io.mockk.impl.annotations.MockK
import org.junit.Assert.assertArrayEquals
import org.junit.Before
import org.junit.Test
import kotlin.random.Random

class GestionEmpleadosTest {

    @MockK
    private lateinit var gestionEmpleados: GestionEmpleados

    @Before
    fun setUp() {
        gestionEmpleados = GestionEmpleados()
    }

    @Test
    fun whenTheMainIsAddEmpleados() {
        val myEmpleadoEntities = ArrayList<EmpleadoEntity>()
        val name = listOf("1", "2", "3", "4", "5")

        repeat(5) {
            myEmpleadoEntities.add(EmpleadoEntity(it, "John${name[it]}", "Valdez${name[it]}", Random(1000L).nextLong().toDouble()))
        }

        val oldEmpleados = gestionEmpleados.main()
        assertArrayEquals(arrayOf(myEmpleadoEntities.size), arrayOf(oldEmpleados.size))
    }
}