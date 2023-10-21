package com.example.android_sdk_learning

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.android_sdk_learning.ui.theme.Android_SDK_learningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Android_SDK_learningTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("World!")
                }
            }
        }
        logs()
    }
}

fun logs(){
    // (tag,msg)
    // tag 类名
    // msg 日志消息
    var s = "MainActivity"
    Log.v(s,"verbose")
    Log.d(s,"debug")
    Log.i(s,"info")
    Log.w(s,"warn")
    Log.e(s,"error")
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Android_SDK_learningTheme {
        Greeting("Android")
    }
}