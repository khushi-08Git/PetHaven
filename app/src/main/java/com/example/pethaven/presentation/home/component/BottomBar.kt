package com.example.pethaven.presentation.home.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pethaven.R

@Composable
fun AppBottomBar(
    selectedIndex: Int,
    onItemSelected: (Int) -> Unit
) {
    NavigationBar(
        containerColor = Color.White,
        tonalElevation = 8.dp
    ) {

        NavigationBarItem(
            selected = selectedIndex == 0,
            onClick = { onItemSelected(0) },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.ic_home),
                    contentDescription = "Home"
                )
            },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = Color(0xFF4F46E5),
                unselectedIconColor = Color.Gray,
                indicatorColor = Color.Transparent
            )
        )

        NavigationBarItem(
            selected = selectedIndex == 1,
            onClick = { onItemSelected(1) },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.ic_paw),
                    contentDescription = "Pets"
                )
            },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = Color(0xFF4F46E5),
                unselectedIconColor = Color.Gray,
                indicatorColor = Color.Transparent
            )
        )

        NavigationBarItem(
            selected = selectedIndex == 2,
            onClick = { onItemSelected(2) },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.ic_message),
                    contentDescription = "messages"
                )
            },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = Color(0xFF4F46E5),
                unselectedIconColor = Color.Gray,
                indicatorColor = Color.Transparent
            )
        )

        NavigationBarItem(
            selected = selectedIndex == 3,
            onClick = { onItemSelected(3) },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.ic_person),
                    contentDescription = "Profile"
                )
            },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = Color(0xFF4F46E5),
                unselectedIconColor = Color.Gray,
                indicatorColor = Color.Transparent
            )
        )
    }
}


@Preview 
@Composable
private fun AppBottomBarPreview() {
    AppBottomBar(
        selectedIndex = 1,
        onItemSelected = {}
    ) 
}