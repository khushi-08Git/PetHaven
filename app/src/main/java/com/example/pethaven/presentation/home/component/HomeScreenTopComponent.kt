package com.example.pethaven.presentation.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pethaven.R


@Composable
fun HomeScreenTopComponent(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(color = Color.White)
            .padding(horizontal = 24.dp)
            .padding(top = 16.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.img_toppetimage),
            contentDescription = "pet image"
        )

        Column(
            modifier = Modifier
                .padding(start = 14.dp)
                .weight(1f)
        ) {
            Text(
                text = "Hello, Daisy!",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            )

            Text(
                text = "Share your pet memorials",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.DarkGray
                )
            )
        }

        Icon(
            painter = painterResource(R.drawable.ic_notification),
            contentDescription = "notification icon",
        )
    }
}

@Preview
@Composable
fun HomeScreenTopComponentPreview(modifier: Modifier = Modifier) {
    HomeScreenTopComponent()
}