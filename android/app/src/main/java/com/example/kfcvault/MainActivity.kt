
package com.example.kfcvault
import android.Manifest
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.core.app.ActivityCompat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityCompat.requestPermissions(this,
            arrayOf(
                Manifest.permission.SEND_SMS,
                Manifest.permission.RECEIVE_SMS,
                Manifest.permission.READ_SMS
            ), 1)

        setContent {
            MaterialTheme {
                Scaffold(
                    topBar = { TopAppBar(title = { Text("KFC Gift Card Vault") }) },
                    floatingActionButton = {
                        FloatingActionButton(onClick = {
                            SmsHelper.sendBalanceSms("1234567890123456")
                        }) { Text("↻") }
                    }
                ) {
                    Text("Auto SMS enabled (private use)")
                }
            }
        }
    }
}
