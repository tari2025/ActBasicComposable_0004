package com.example.applayout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun ContohColumn(modifier: Modifier) {
    Column(
        modifier = modifier.padding(top = 20.dp, start = 20.dp)
    ) {
        Text("Hello")
        Text("anyeonghaseyo")
    }
}

@Composable
fun ContohRow(modifier: Modifier) {
    val kota = stringResource(id = R.string.kota)
    Row(
        modifier = modifier
            .padding(top = 60.dp, start = 60.dp)
            .fillMaxWidth()
    ) {
        Text(text = "Hello")
        Text(text = kota)
    }
}