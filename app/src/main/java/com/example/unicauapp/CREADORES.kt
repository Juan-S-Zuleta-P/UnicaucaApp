package com.example.unicauapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun creadores() {

    /*Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF9AB8A7))
    ){*/
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(10.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.height(150.dp))
            Image(
                painter = painterResource(id = R.drawable.sebas),
                contentDescription = "foto perfil"
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(text = "Sebastian Zuleta", style = TextStyle(fontSize = 20.sp))
                Text(
                    text = "Android Developer Extraordinaire",
                    color = Color(0xFF02602B),
                    style = TextStyle(fontSize = 20.sp),
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.height(150.dp))
            Image(
                painter = painterResource(id = R.drawable.foto),
                contentDescription = "foto perfil"
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(text = "Andres Rubiano", style = TextStyle(fontSize = 20.sp))
                Text(
                    text = "Android Developer Extraordinaire",
                    color = Color(0xFF02602B),
                    style = TextStyle(fontSize = 20.sp),
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.height(150.dp))
            Image(
                painter = painterResource(id = R.drawable.foto),
                contentDescription = "foto perfil"
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(text = "Miguel Urbano", style = TextStyle(fontSize = 20.sp))
                Text(
                    text = "Android Developer Extraordinaire",
                    color = Color(0xFF02602B),
                    style = TextStyle(fontSize = 20.sp),
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}