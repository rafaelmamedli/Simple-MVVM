package com.example.practicssimplemvvm

import android.text.Editable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivityViewModel: ViewModel() {

   // var cem = "0"

    var cem = MutableLiveData<String>()  //1

    init {
        cem = MutableLiveData<String>("0")  //2
    }

    fun topla(eded_1: Editable,eded_2 :Editable){

        var number1 = eded_1.toString().toInt()
        var number2 = eded_2.toString().toInt()

        val toplam = number1 + number2
        cem.value = toplam.toString()   //3
    }

    fun cixma(eded_1: Editable,eded_2 :Editable){

        var number1 = eded_1.toString().toInt()
        var number2 = eded_2.toString().toInt()

        val toplam = number1 - number2
        cem.value = toplam.toString() //4
    }

}