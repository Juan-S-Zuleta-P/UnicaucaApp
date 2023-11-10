package com.example.unicauapp

import android.content.Context
import android.util.Patterns
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true)
@Composable

fun Olvido(){
    val context= LocalContext.current

    // Correo Electrónico
    var email by remember{
        mutableStateOf("")
    }

    var isValidEmail by remember {
        mutableStateOf(false)
    }

    // Código
    var codigo by remember{
        mutableStateOf("")
    }

    var isValidcodigo by remember {
        mutableStateOf(false)
    }

    var codigoVisible by remember {
        mutableStateOf(false)
    }

    Box(modifier= Modifier
        .fillMaxSize()
        .background(Color(0xffFFFFFF))){

        Column(
            Modifier
                .align(Alignment.Center)
                .padding(16.dp)
                .fillMaxWidth())
        {
            Card(modifier= Modifier.padding(12.dp),
                shape = RoundedCornerShape(10.dp),
                elevation= CardDefaults.cardElevation(defaultElevation = 20.dp) )
            {

            }
        }
    }
    Column(Modifier.padding(16.dp)) {
        RowLogo()
        RowCorreoI(
            email= email,
            emailChage = {
                email = it
                isValidEmail = Patterns.EMAIL_ADDRESS.matcher(email).matches()
            },
            isValidEmail

        )
        RowCodigo(
            codigo = codigo,
            codigoChange = {
                codigo=it
                isValidcodigo= codigo.length>=6
            },
            codigoVisible = codigoVisible,
            isValidcodigo = isValidcodigo
        )


        RowEnviar(context = context, isValidEmail = isValidEmail, isValidcodigo = isValidcodigo )

    }

}


@Composable
fun RowLogo() {

    Row(
        Modifier
            .fillMaxWidth()
            .padding(70.dp),
        horizontalArrangement = Arrangement.Center
    ) {

        Image(
            modifier = Modifier.width(1000.dp),
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo"
        )

    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RowCorreoI(email: String, emailChage: (String) -> Unit, isValidEmail: Boolean)
{
    Row(
        Modifier
            .fillMaxWidth()
            .padding(10.dp), horizontalArrangement = Arrangement.Center) {

        OutlinedTextField(
            value =email ,
            onValueChange = emailChage,
            label = { Text(text="Email") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            maxLines = 1,
            singleLine = true,
            colors = if(isValidEmail){
                TextFieldDefaults.outlinedTextFieldColors(
                    focusedLabelColor = Color.Green,
                    focusedBorderColor = Color.Green
                )
            } else{
                TextFieldDefaults.outlinedTextFieldColors(
                    focusedLabelColor = Color.Red,
                    focusedBorderColor = Color.Red
                )
            }

        )
    }

}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RowCodigo(
    codigo: String, codigoChange: (String) -> Unit, codigoVisible: Boolean,
    isValidcodigo: Boolean
)
{
    Row(
        Modifier
            .fillMaxWidth()
            .padding(10.dp), horizontalArrangement = Arrangement.Center)
    {
        OutlinedTextField(
            value =codigo ,
            onValueChange = codigoChange,
            label = { Text(text="Código Estudiantil") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            maxLines = 1,
            singleLine = true,

            colors = if(isValidcodigo){
                TextFieldDefaults.outlinedTextFieldColors(
                    focusedLabelColor = Color.Green,
                    focusedBorderColor = Color.Green
                )
            } else{
                TextFieldDefaults.outlinedTextFieldColors(
                    focusedLabelColor = Color.Red,
                    focusedBorderColor = Color.Red
                )
            }


        )
    }
}
@Composable
fun RowEnviar(
    context:Context,
    isValidEmail: Boolean,
    isValidcodigo:Boolean
) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.Center) {
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { login(context) },
            enabled = isValidEmail && isValidcodigo
        ) {
            Text(text = "Enviar")
        }
    }
}

fun login(context: Context){

    Toast.makeText(context,"Los pasos que debe seguir para recuperar su contraseña, han sido enviados a su correo institucional.",Toast.LENGTH_LONG).show()
}
