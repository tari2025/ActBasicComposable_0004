package com.example.applayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HalamanProfilKucing(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {

        // Background full screen
        Image(
            painter = painterResource(id = R.drawable.gunung),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )


        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            HeaderSection()
            Spacer(modifier = Modifier.height(20.dp))
            LogoSection()
            Spacer(modifier = Modifier.height(20.dp))
            DataMahasiswaSection()
            Spacer(modifier = Modifier.height(30.dp))
            GambarKucingOrenSection()
        }
    }
}

@Composable
fun HeaderSection() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Login",
            color = Color.Blue,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Ini adalah halaman login,",
            color = Color.White,
            fontSize = 16.sp
        )
    }
}

@Composable
fun LogoSection() {
    Image(
        painter = painterResource(id = R.drawable.logo_umy),
        contentDescription = "Logo UMY",
        modifier = Modifier.size(120.dp),
        contentScale = ContentScale.Fit
    )
}


