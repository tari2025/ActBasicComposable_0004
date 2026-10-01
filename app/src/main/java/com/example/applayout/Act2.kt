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

// ===================== KODE TAMBAHAN =====================

@Composable
fun ContohColumn(modifier: Modifier) {
    Column(
        modifier = modifier.padding(top = 20.dp, start = 20.dp)
    ) {
        Text("Hello")
        Text("World")
    }
}

@Composable
fun ContohRow(modifier: Modifier) {
    val kata = stringResource(id = R.string.kata)
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
fun ContohColumn2(modifier: Modifier) {
    Column(
        modifier = modifier.padding(top = 20.dp, start = 20.dp)
    ) {
        Text("Hello")
        Text("Word")
    }
}

@Composable
fun ContohRow1(modifier: Modifier) {
    val kota = stringResource(id = R.string.kota)
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
fun TataletakColumn(modifier: Modifier) {
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
fun TataletakColumnRow(modifier: Modifier = Modifier) {
    Column {
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen1Baris1")
            Text(text = "Komponen2Baris1")
            Text(text = "Komponen3Baris1")
        }
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen1Baris2")
            Text(text = "Komponen2Baris2")
            Text(text = "Komponen3Baris2")
        }
    }
}

@Composable
fun TataletakRowColumn(modifier: Modifier = Modifier) {
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
fun TataletakBoxColumnRow(modifier: Modifier = Modifier) {
    // Jika gambar belum ada, komentari baris di bawah
    // val gambar = painterResource(id = R.drawable.notasibolok)
    Column {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(height = 110.dp)
                .background(Color.Teal),
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

// ===================== PREVIEW =====================

@Preview(showBackground = true)
@Composable
fun PreviewTataletak() {
    AppLayoutTheme {
        TataletakBoxColumnRow(modifier = Modifier.fillMaxSize())
    }
}