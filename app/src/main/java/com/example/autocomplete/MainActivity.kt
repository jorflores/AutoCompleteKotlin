package com.example.autocomplete

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.autocomplete.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val Empleados = arrayOf(Empleado("Jorge Flores", "IT","jorge@email.com"), Empleado("Enrique Ayala", "RH","enrique@email.com"), Empleado("Rodolfo Garza", "Operaciones","rodolfo@email.com"), Empleado("Luis Quintero", "Donaciones","luis@email.com"), Empleado("Alexis Barbaro", "IT","alexis@email.com"), Empleado("Mario Wong", "IT","mario@email.com"), Empleado("Karina Montemayor", "RH","karina@email.com"), Empleado("Eduardo Lopez", "Operaciones","eduardo@email.com"))
     /*   val adapter2 = ArrayAdapter(this, android.R.layout.select_dialog_item, Empleados)*/
        val adapter2 = AutoCompleteTextViewAdapter(this,android.R.layout.simple_expandable_list_item_1,Empleados)

//actv is the AutoCompleteTextView from your layout file

        binding.autoCompleteTextView.threshold = 1
        binding.autoCompleteTextView.setAdapter(adapter2)



    }
}