package com.example.pethaven.presentation.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.pethaven.presentation.home.component.AppBottomBar
import com.example.pethaven.presentation.home.component.CustomSearchBar
import com.example.pethaven.presentation.home.component.HomeScreenTopComponent
import com.example.pethaven.presentation.home.component.MemorialComponent

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        bottomBar = {
            AppBottomBar(
                selectedIndex = selectedIndex,
                onItemSelected = { selectedIndex = it }
            )
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier.padding(paddingValues)
        ) {
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
    }


}


@Preview
@Composable
fun PreviewHomeScreen(modifier: Modifier = Modifier) {
    HomeScreen()
}