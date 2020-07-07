package rifas.kotlin.rifas_arreola

import android.app.Application
import android.content.Context

class AppRifas: Application() {
    lateinit var CONTEXT: Context
    val DB_NAME = "rifas.db"
    val VERSION = 1
    val TB_RIFAS = "tbRifas"

    override fun onCreate() {
        super.onCreate()
        CONTEXT = applicationContext
    }
}