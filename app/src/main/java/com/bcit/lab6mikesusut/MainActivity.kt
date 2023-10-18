package com.bcit.lab6mikesusut

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bcit.lab6mikesusut.ui.theme.Lab6MikeSusutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab6MikeSusutTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0x00005FF)
                ) {
                    doThing()
                }
            }
        }
    }
}

@Composable
fun doThing(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF6697A7))
    ) {
        Row (
            modifier = Modifier
                .padding(top = 80.dp),
            verticalAlignment = Alignment.Bottom
        ){
            Box(
                modifier = Modifier
                    .size(200.dp)
                    .background(Color(0xFF0022FF))
            )
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(Color(0xFFFF0000))
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 350.dp)
                .height(100.dp)
                .background(Color(0xFFC063C7)),
            verticalAlignment = Alignment.CenterVertically,

        ){
            Box(modifier = Modifier
                .padding(start = 100.dp)
                .background(Color(0xFFFFB8AB))
                .size(75.dp))
            Box(modifier = Modifier
                .background(Color(0xFF349635))
                .size(60.dp))
            Box(modifier = Modifier
                .background(Color(0xFFFFC800))
                .size(90.dp))
        }
        Box(modifier = Modifier
            .padding(top = 500.dp)
            .padding(horizontal = 100.dp)
            .background(Color(0xFF693221))
            .size(150.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Lab 6",
                style = TextStyle(fontSize = 30.sp, color = Color.White)
            )

        }
    }
}

