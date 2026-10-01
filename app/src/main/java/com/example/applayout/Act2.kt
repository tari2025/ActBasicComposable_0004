package com.example.applayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.applayout.ui.theme.AppLayoutTheme

// 👇 BARIS BARU — taruh di sini
val Teal = Color(0xFF008080)

class Act2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppLayoutTheme {
                MyScaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TataletakBoxColumnRow(
                        modifier = Modifier.padding(paddingValues = innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun MyScaffold(
    modifier: Modifier = Modifier,
    content: @Composable (PaddingValues) -> Unit
) {
    Scaffold(modifier = modifier) { innerPadding ->
        content(innerPadding)
    }
}

// ... (semua fungsi ContohColumn, ContohRow, dll. tidak berubah) ...

@Composable
fun TataletakBoxColumnRow(modifier: Modifier = Modifier) {
    // val gambar = painterResource(id = R.drawable.notasibolok)
    Column {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(height = 110.dp)
                .background(Teal),   // 👈 DIUBAH dari Color.Teal jadi Teal
            contentAlignment = Alignment.Center
        ) {
            Column {
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "Col1_Row1_Komponen1")
                    Text(text = "Col1_Row1_Komponen2")
                    Text(text = "Col1_Row1_Komponen3")
                }
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "Col1_Row2_Komponen1")
                    Text(text = "Col1_Row2_Komponen2")
                    Text(text = "Col1_Row2_Komponen3")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTataletak() {
    AppLayoutTheme {
        TataletakBoxColumnRow(modifier = Modifier.fillMaxSize())
    }
}