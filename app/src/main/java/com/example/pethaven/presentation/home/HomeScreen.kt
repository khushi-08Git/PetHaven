package com.example.pethaven.presentation.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.pethaven.presentation.home.component.CustomSearchBar
import com.example.pethaven.presentation.home.component.HomeScreenTopComponent
import com.example.pethaven.presentation.home.component.MemorialComponent

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(color = Color.White)
            .fillMaxSize()
    ) {
        HomeScreenTopComponent()
        CustomSearchBar(
            query = "",
            onQueryChange = {},
            onSearchClick = {},
            placeholder = "Search for pets, name, location..."
        )

        MemorialComponent()
    }
}


@Preview
@Composable
fun PreviewHomeScreen(modifier: Modifier = Modifier) {
    HomeScreen()
}