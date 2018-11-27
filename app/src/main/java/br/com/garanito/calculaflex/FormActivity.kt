package br.com.garanito.calculaflex

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_form.*

class FormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)
        btCalculate.setOnClickListener{
            val proximaTela = Intent(this,ResultActivity::class.java)
            proximaTela.putExtra("GAS_PRICE",etGasPrice.text.toString())
            proximaTela.putExtra("ETHANOL_PRICE",etEthanolPrice.text.toString())
            proximaTela.putExtra("GAS_AVERAGE",etGasAverage.text.toString())
            proximaTela.putExtra("ETHANOL_AVERAGE",etEthanolAverage.text.toString())
            startActivity(proximaTela)
        }
    }
}
