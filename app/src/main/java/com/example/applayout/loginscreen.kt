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