package com.example.firstprojectcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstprojectcompose.components.SearchBar
import com.example.firstprojectcompose.ui.theme.FirstProjectComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstProjectComposeTheme {
                FirstProjectComposeApp()
            }
        }
    }
}

@Composable
fun FirstProjectComposeApp() {
    Column {
        Banner()
    }
}

@Composable
fun Banner(
    modifier: Modifier = Modifier,
){
    Box(modifier = modifier){
        Image(
            painter = painterResource(R.drawable.banner),
            contentDescription = "Banner Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.height(160.dp)
        )
        SearchBar()
    }
}

@Preview(showBackground = true)
@Composable
fun FirstProjectComposePreview() {
    FirstProjectComposeTheme {
        FirstProjectComposeApp()
    }
}