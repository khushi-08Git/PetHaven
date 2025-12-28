package com.example.pethaven.presentation.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pethaven.R

@Composable
fun CustomSearchBar(
    query: String,
    onQueryChange: (String) -> Unit,
    onSearchClick: () -> Unit,
    placeholder: String = "Search..."
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            //.height(60.dp)
            .padding(horizontal = 24.dp)
            .padding(top = 24.dp)
            .background(
                color = Color(0xFFFFFFFF),
                shape = RoundedCornerShape(16.dp)
            )
            .border(
                width = 1.dp,
                color = Color.Gray,
                shape = RoundedCornerShape(16.dp)
            )
            .padding(horizontal = 20.dp)
            .padding(vertical = 20.dp),
        contentAlignment = Alignment.CenterStart
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            BasicTextField(
                value = query,
                onValueChange = onQueryChange,
                singleLine = true,
                modifier = Modifier
                    .weight(1f),
                textStyle = TextStyle(
                    fontSize = 16.sp,
                    color = Color.Black
                ),
                decorationBox = { innerTextField ->
                    if (query.isEmpty()) {
                        Text(
                            text = placeholder,
                            color = Color.Gray,
                            fontSize = 16.sp
                        )
                    }
                    innerTextField()
                }
            )

            Icon(
                painter = painterResource(R.drawable.ic_search),
                contentDescription = "Search",
                tint = Color.Gray,
                modifier = Modifier
                    .size(22.dp)
                    .clickable {
                        onSearchClick()
                    }
            )
        }
    }
}



@Preview
@Composable
fun CustomSearchBarPreview(modifier: Modifier = Modifier) {
    CustomSearchBar(
        query = "",
        onQueryChange = {},
        onSearchClick = {},
        placeholder = "Search for pets, name, location..."
    )
}