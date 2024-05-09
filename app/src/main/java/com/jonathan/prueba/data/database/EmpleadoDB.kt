package com.jonathan.prueba.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jonathan.prueba.data.dao.EmpleadoDao
import com.jonathan.prueba.data.entity.EmpleadoEntity

@Database(entities = [EmpleadoEntity::class], version = 1)
abstract class EmpleadoDB: RoomDatabase() {

    abstract fun empleadoDao(): EmpleadoDao
}