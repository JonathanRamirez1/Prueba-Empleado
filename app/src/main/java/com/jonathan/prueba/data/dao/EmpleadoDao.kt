package com.jonathan.prueba.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.jonathan.prueba.data.entity.EmpleadoEntity

@Dao
interface EmpleadoDao {

    @Query("SELECT * FROM empleados ORDER BY id ASC")
    suspend fun getAll(): List<EmpleadoEntity>

    @Insert
    suspend fun insertAll(empleados: List<EmpleadoEntity>)
}