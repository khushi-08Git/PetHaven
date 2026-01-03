package com.example.pethaven.presentation.home.component

import androidx.compose.ui.unit.Dp
import com.example.pethaven.R

data class MemorialItem(
    val title: String,
    val likes: Int,
    val imageRes: Int,
    val height: Int
)

val memorialItems = listOf(
    MemorialItem("Ginger", 1268, R.drawable.img_animal1, 220),
    MemorialItem("Beige", 1068, R.drawable.img_animal2, 270),
    MemorialItem("Jeffry", 1100, R.drawable.img_animal3, 192),
    MemorialItem("Flur", 1008, R.drawable.img_animal4, 270),
    MemorialItem("Baxter", 1008, R.drawable.img_animal5, 192)
)