package com.example.pethaven.presentation.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pethaven.R

@Composable
fun MemorialCard(
    item:MemorialItem,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .paint(painter = painterResource(id = item.image))
            .clip(RoundedCornerShape(24.dp))
            .padding(start = 18.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            modifier = Modifier
                .padding(top = 18.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Icon(
                Icons.Default.Favorite,
                contentDescription = "heart",
                tint = Color.Red
            )
            Text(
                text = item.likes,
                modifier = Modifier
                    .padding(start = 2.dp)
            )
        }
        Text(
            text = item.name,
            fontSize = 28.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color.White,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )
    }
}

@Preview
@Composable
fun MemorialCardPreview(modifier: Modifier = Modifier) {
    MemorialCard(
        item = MemorialItem("Beige", "1,068", R.drawable.img_animal1, 220.dp)
    )
}