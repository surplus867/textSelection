package com.example.textselection

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.textselection.ui.theme.TextSelectionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextSelectionTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    CustomText()
                }
            }
        }
    }
}

@Composable
fun CustomText() {
    SelectionContainer {
        Column {
            Text(text = "Hello Minyu!")
            DisableSelection {
                Text(text = "Hello Minyu!")
            }
            Text(text = "Hello Minyu!")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TextSelectionTheme {
        Column(modifier = Modifier.fillMaxSize()) {

        }
    }
}