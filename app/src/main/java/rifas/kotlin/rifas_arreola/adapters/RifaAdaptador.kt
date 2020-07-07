package rifas.kotlin.rifas_arreola.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.list_items_rifas.view.*
import rifas.kotlin.rifas_arreola.Clases.Rifa.Rifa
import rifas.kotlin.rifas_arreola.R

class RifaAdaptador(private val mContext: Context, private val listaRifas: List<Rifa>) : ArrayAdapter<Rifa>(mContext, 0, listaRifas) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(mContext).inflate(R.layout.list_items_rifas, parent, false)

        // Información de la lista
        val rifa = listaRifas[position]

        layout.tvNombre.text = rifa.titulo
        layout.tvCantidad.text = rifa.cant_usuarios.toString()

        return layout
    }
}