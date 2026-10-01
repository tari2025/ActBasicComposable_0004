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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.applayout.ui.theme.AppLayoutTheme

class Act2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppLayoutTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Act2TataletakBoxColumnRow(
                        modifier = Modifier.padding(paddingValues = innerPadding)
                    )
                }
            }
        }
    }
}

// ===================== KODE TAMBAHAN =====================

@Composable
fun Act2ContohColumn(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(top = 20.dp, start = 20.dp)
    ) {
        Text("Hello")
        Text("World")
    }
}

@Composable
fun Act2ContohRow(modifier: Modifier = Modifier) {
    val kata = "Contoh Kata" // Ganti dari stringResource
    Row(
        modifier = modifier
            .padding(top = 60.dp, start = 60.dp)
            .fillMaxWidth()
    ) {
        Text(text = "Hello")
        Text(text = kata)
    }
}

@Composable
fun Act2ContohColumn2(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(top = 20.dp, start = 20.dp)
    ) {
        Text("Hello")
        Text("Word")
    }
}

@Composable
fun Act2ContohRow2(modifier: Modifier = Modifier) {
    val kota = "Contoh Kota" // Ganti dari stringResource
    Row(
        modifier = modifier
            .padding(top = 60.dp, start = 60.dp)
            .fillMaxWidth()
    ) {
        Text(text = "Komponen4")
        Text(text = "hello")
        Text(text = kota)
    }
}

@Composable
fun Act2TataletakColumn(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp)
    ) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

// ===================== KODE DARI PDF =====================

@Composable
fun Act2TataletakColumnRow(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen1Baris1")
            Text(text = "Komponen2Baris1")
            Text(text = "Komponen3Baris1")
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen1Baris2")
            Text(text = "Komponen2Baris2")
            Text(text = "Komponen3Baris2")
        }
    }
}

@Composable
fun Act2TataletakRowColumn(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Column {
            Text(text = "Komponen1Kolon1")
            Text(text = "Komponen2Kolon1")
            Text(text = "Komponen3Kolon1")
        }
        Column {
            Text(text = "Komponen1Kolon2")
            Text(text = "Komponen2Kolon2")
            Text(text = "Komponen3Kolon2")
        }
    }
}

@Composable
fun Act2TataletakBoxColumnRow(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(height = 110.dp)
                .background(Color(0xFF008080)), // Hex Teal langsung
            contentAlignment = Alignment.Center
        ) {
            Column {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "Col1_Row1_Komponen1")
                    Text(text = "Col1_Row1_Komponen2")
                    Text(text = "Col1_Row1_Komponen3")
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
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

// ===================== PREVIEW =====================

@Preview(showBackground = true)
@Composable
fun Act2PreviewTataletak() {
    AppLayoutTheme {
        Act2TataletakBoxColumnRow(modifier = Modifier.fillMaxSize())
    }
}