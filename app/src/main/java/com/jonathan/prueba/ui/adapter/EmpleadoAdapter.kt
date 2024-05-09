package com.jonathan.prueba.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.jonathan.prueba.databinding.ItemEmpleadoBinding
import com.jonathan.prueba.domain.model.Empleado

class EmpleadoAdapter(private val myEmpleado: ArrayList<Empleado>): Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemEmpleadoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = myEmpleado.size


    inner class ViewHolder(val binding: ItemEmpleadoBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(empleados: Empleado) {
        }
    }
}