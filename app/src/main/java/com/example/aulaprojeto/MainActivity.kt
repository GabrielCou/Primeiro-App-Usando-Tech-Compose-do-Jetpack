package com.example.aulaprojeto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.aulaprojeto.ui.theme.AulaProjetoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AulaProjetoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    AppNameESubName("Meu 1 Compose APP", "Primeiro mesmo")
                }
            }
        }
    }
}

@Composable
fun AppNameESubName(appName: String, appSubName: String) {
    Column() {
    Text(text = " $appName!")
    Text(text = " $appSubName!")

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AulaProjetoTheme {
        AppNameESubName("Meu 1 Compose APP", "Primeiro mesmo" )
    }
}