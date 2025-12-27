package com.example.pethaven.presentation.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pethaven.R

@Composable
fun OnBoardingScreen(
    modifier: Modifier = Modifier,
    title: String,
    subtitle: String,
    img:Int
)
{
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xffffffff)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_logo),
            contentDescription = "logo",
            modifier = Modifier
                .padding(top = 56.dp)
        )
        Text(
            text = title,
            style = TextStyle(
                fontSize = 34.sp,
                fontWeight = FontWeight.ExtraBold
            ),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 42.dp)
        )

        Text(
            text = subtitle,
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal
            ),
            textAlign = TextAlign.Center,

            modifier = Modifier
                .padding(top = 42.dp)
        )

        Image(
            painter = painterResource(id = img),
            contentDescription = "1st image",

            modifier = Modifier
                .padding(top = 37.dp)
        )

    }


}

val onboardingPages = listOf(
    OnBoardingPage(
        title = "Welcome to Pets Forever",
        subtitle = "Personalise your pet’s page with photos, details and memories.",
        image = R.drawable.img_onboarding1
    ),
    OnBoardingPage(
        title = "Create your page",
        subtitle = "Add photos, details and memories of your pet.",
        image = R.drawable.img_onboarding2
    ),
    OnBoardingPage(
        title = "Share it",
        subtitle = "Share your pet’s page with friends and family.",
        image = R.drawable.img_onboarding3
    ),
    OnBoardingPage(
        title = "Save memories",
        subtitle = "Keep all your lovely pet moments in one place.",
        image = R.drawable.img_onboarding4
    )
)


@Preview
@Composable
fun PreviewOnBoardingScreen(modifier: Modifier = Modifier) {
    OnBoardingScreen(
        modifier = modifier,
        title = "Welcome to\n" +
                "Pets Forever",
        subtitle = "Personalise your pet’s page with \n photos, details and memories.",
        img = R.drawable.img_onboarding1
    )
}