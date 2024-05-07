package com.example.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.navigation.ui.theme.NavigationTheme

@Composable
fun Page2(modifier: Modifier = Modifier) {
    Text(text = "Page 2!")
}

@Preview(showBackground = true)
@Composable
fun Page2Preview() {
    NavigationTheme {
        Page2()
    }
}