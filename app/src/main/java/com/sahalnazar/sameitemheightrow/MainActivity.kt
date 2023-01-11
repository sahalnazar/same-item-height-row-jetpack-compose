package com.sahalnazar.sameitemheightrow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sahalnazar.sameitemheightrow.ui.theme.SameItemHeightRowTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SameItemHeightRowTheme {

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(vertical = 16.dp),
                ) {
                    ScrollableRow()
                }
            }
        }
    }
}

@Composable
fun ScrollableRow() {
    Row(
        Modifier
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        content = {
            repeat(4) {
                RowItem(
                    modifier = Modifier,
                    textCount = it.plus(1)
                )
            }
        },
    )
}

@Composable
fun RowItem(modifier: Modifier = Modifier, textCount: Int) {
    Surface(
        modifier = modifier,
        color = Color.Gray,
        shape = RoundedCornerShape(12.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.padding(16.dp)
        ) {
            repeat(textCount) {
                Text(
                    text = "item $it",
                    color = Color.White,
                    modifier = Modifier.padding(
                        horizontal = 16.dp,
                        vertical = 4.dp
                    )
                )
            }

            Button(onClick = {
            }) { Text(text = "Button") }
        }
    }
}
