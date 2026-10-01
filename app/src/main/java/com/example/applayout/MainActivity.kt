package com.example.applayout

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.example.applayout.ui.theme.AppLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppLayoutTheme {
                MyScaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Tombol untuk pindah ke Act2
                    val context = LocalContext.current
                    Button(onClick = {
                        context.startActivity(Intent(context, Act2::class.java))
                    }) {
                        Text("Buka Act2")
                    }
                }
            }
        }
    }
}

// MyScaffold tetap di sini, biar bisa dipanggil dari mana saja
@Composable
fun MyScaffold(
    modifier: Modifier = Modifier,
    content: @Composable (PaddingValues) -> Unit
) {
    Scaffold(modifier = modifier) { innerPadding ->
        content(innerPadding)
    }
}