package br.com.garanito.calculaflex

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.garanito.calculaflex.extensions.getDouble
import br.com.garanito.calculaflex.watchers.DecimalTextWatcher
import kotlinx.android.synthetic.main.activity_form.*

class FormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        etGasPrice.addTextChangedListener(DecimalTextWatcher(etGasPrice))
        etEthanolPrice.addTextChangedListener(DecimalTextWatcher(etEthanolPrice))

        etEthanolAverage.addTextChangedListener(DecimalTextWatcher(etEthanolAverage,1))
        etGasAverage.addTextChangedListener(DecimalTextWatcher(etGasAverage,1))

        btCalculate.setOnClickListener{
            val proximaTela = Intent(this,ResultActivity::class.java)
            proximaTela.putExtra("GAS_PRICE",etGasPrice.getDouble())
            proximaTela.putExtra("ETHANOL_PRICE",etEthanolPrice.getDouble())
            proximaTela.putExtra("GAS_AVERAGE",etGasAverage.getDouble())
            proximaTela.putExtra("ETHANOL_AVERAGE",etEthanolAverage.getDouble())
            startActivity(proximaTela)
        }
    }
}
