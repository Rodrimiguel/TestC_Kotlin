package com.example.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.navigation.ui.theme.NavigationTheme

@Composable
fun Page2(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Column(modifier = modifier) {
        Text(text = "Page2")
        Button(
            onClick = {
                navController.navigate("page1")
            }
        ) {
            Text(text = "Ir a la page1")
        }
    }

}


@Preview(showBackground = true)
@Composable
fun Page2Preview() {
    NavigationTheme {
        var navController = rememberNavController()
        Page1(navController = navController)
    }
}