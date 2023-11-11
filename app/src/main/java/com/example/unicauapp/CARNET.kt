package com.example.unicauapp


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun carnet() {

    /*Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFFFFF))
    ) {*/
        /*Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(10.dp)
        ) {*/
            Spacer(modifier = Modifier.height(150.dp))

            // Utiliza el modificador fillMaxSize para que la imagen ocupe todo el espacio disponible
            Image(
                painter = painterResource(id = R.drawable.profile_picture),
                contentDescription = "foto perfil",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop // Esto recortará la imagen para que llene el espacio sin distorsionarla
            )


        }





