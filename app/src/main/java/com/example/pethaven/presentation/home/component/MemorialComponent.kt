package com.example.pethaven.presentation.home.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.material.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pethaven.R

@Composable
fun MemorialComponent(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    ) {
        val items = listOf(
            MemorialItem("Ginger", "1,068", R.drawable.img_animal1, 220.dp),
            MemorialItem("Jeffry", "1,100", R.drawable.img_animal2, 180.dp),
            MemorialItem("Brownie", "1,008", R.drawable.img_animal3, 210.dp),
            MemorialItem("Snow", "1,120", R.drawable.img_animal4, 190.dp) ,
            MemorialItem("Beige", "1,120", R.drawable.img_animal5, 190.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
                .padding(top = 32.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        )
        {
            Text(
                text = "Memorial",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold
                )
            )

            Icon(
                painter = painterResource(R.drawable.ic_menu),
                contentDescription = "menu icon"
            )
        }

        LazyVerticalStaggeredGrid(
            modifier = Modifier
                .padding(top = 12.dp, start = 24.dp),
            columns = StaggeredGridCells.Fixed(2),
            verticalItemSpacing = 12.dp,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(items) { item ->
                MemorialCard(item)
            }

        }
    }
}


@Preview
@Composable
fun MemorialComponentPreview(modifier: Modifier = Modifier) {
    MemorialComponent()
}