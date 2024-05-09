package com.jonathan.prueba.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "empleados")
data class EmpleadoEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "Id") val id: Int? = 0,
    @ColumnInfo(name = "nombre") val nombre: String? = null,
    @ColumnInfo(name = "apellido") val apellido: String? = null,
    @ColumnInfo(name = "salario") val salario: Double? = null
)
