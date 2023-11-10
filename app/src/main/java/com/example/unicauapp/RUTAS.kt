package com.example.unicauapp

sealed class RUTAS(val ruta:String ){
    object P1: RUTAS("LOGIN")
    object P2: RUTAS("OLVIDO")
    object P3: RUTAS("CARNET")
    object P4: RUTAS("HORARIO")
    object P5: RUTAS("NOTAS")
    object P6: RUTAS("NOTICIAS")
    object P7: RUTAS("CREADORES")
}
