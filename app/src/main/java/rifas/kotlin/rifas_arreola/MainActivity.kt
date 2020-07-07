package rifas.kotlin.rifas_arreola

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_items_rifas.*
import rifas.kotlin.rifas_arreola.Clases.Rifa.Rifa
import rifas.kotlin.rifas_arreola.adapters.RifaAdaptador

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.abrirActivity()
        this.mostrarLista()
    }

    fun abrirActivity() {
        btnAgregarRifa.setOnClickListener {
            startActivity(Intent(this, agregarRifas::class.java))
        }
    }

    fun mostrarLista() {
        val rifa1 = Rifa("Pruebon", "Echo para verificar si funciona", 500.0, 30)
        val rifa2 = Rifa("Pruebon2", "Echo para verificar si funciona 2", 800.0, 25)

        val listaRifas = listOf(rifa1, rifa2)

        val adapter = RifaAdaptador(this, listaRifas)

        listViewRifas.adapter = adapter

        listViewRifas.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, activity_detalles_rifas::class.java)
            intent.putExtra("rifa", listaRifas[position])
            startActivity(intent)
        }
    }
}
