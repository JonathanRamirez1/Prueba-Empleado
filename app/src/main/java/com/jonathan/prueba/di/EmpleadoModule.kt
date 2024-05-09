package com.jonathan.prueba.di

import android.content.Context
import androidx.room.Room
import com.jonathan.prueba.data.database.EmpleadoDB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    @Singleton
    @Provides
    fun provideRoom(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, EmpleadoDB::class.java, "empleados_Database").build()

    @Singleton
    @Provides
    fun provideItemsDatabase(empleadoDatabase: EmpleadoDB) = empleadoDatabase.empleadoDao()
}