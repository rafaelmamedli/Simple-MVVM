package com.example.practicssimplemvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import androidx.activity.viewModels
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val viewModel : MainActivityViewModel by viewModels ()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gettoplama(editTextTextPersonName.text,editTextTextPersonName2.text)
        getcixma(editTextTextPersonName.text,editTextTextPersonName2.text)

        viewModel.cem.observe(this) {            //5
            result.text = it
        }

    }

    private fun gettoplama(eded_1: Editable, eded_2: Editable) {
       button.setOnClickListener {
          viewModel.topla(eded_1, eded_2)
       }
    }
    private fun getcixma(eded_1: Editable, eded_2: Editable) {
        button2.setOnClickListener {
            viewModel.cixma(eded_1, eded_2)
        }
    }


}