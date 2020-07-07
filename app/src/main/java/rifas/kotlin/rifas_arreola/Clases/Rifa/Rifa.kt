package rifas.kotlin.rifas_arreola.Clases.Rifa

import java.io.Serializable
import java.sql.Timestamp

class Rifa (val titulo: String, val descripcion: String,
            val costo_numero: Double, val cant_usuarios: Int): Serializable