package com.example.applayout

fun HalamanProfilKucing(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {

        // Background full screen
        Image(
            painter = painterResource(id = R.drawable.gunung),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        // Komposisi utama
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        )
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