package br.com.garanito.calculaflex.extensions

fun Double.format(digits: Int) = String.format("%.${digits}f",this)