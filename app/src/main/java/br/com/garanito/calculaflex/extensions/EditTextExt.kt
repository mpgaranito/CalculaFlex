package br.com.garanito.calculaflex.extensions

import android.widget.EditText

fun EditText.getDouble() : Double{
    return  this.getString().toDouble()
}

fun EditText.getString() : String{
    return  this.text.toString()
}