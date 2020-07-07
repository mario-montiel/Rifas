package rifas.kotlin.rifas_arreola

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detalles_rifas.*
import rifas.kotlin.rifas_arreola.Clases.Rifa.Rifa

class activity_detalles_rifas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles_rifas)

        this.atras()

        this.abrirActivityConDetalles()
    }

    fun abrirActivityConDetalles() {
        val rifa = intent.getSerializableExtra("rifa") as Rifa

        tv2_detalles_act.text = rifa.titulo
        tv3_detalles_act.text = rifa.descripcion
        tv4_detalles_act.text = rifa.costo_numero.toString()
        tv5_detalles_act.text = rifa.cant_usuarios.toString()
        tv6_detalles_act.text = "2020-01-01"
        tv7_detalles_act.text = "2020-07-06"
    }

    fun atras() {
        btnAtras.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
