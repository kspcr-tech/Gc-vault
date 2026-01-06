
package com.example.kfcvault
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.telephony.SmsMessage
import android.util.Log

class SmsReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val bundle = intent.extras ?: return
        val pdus = bundle["pdus"] as Array<*>
        for (pdu in pdus) {
            val msg = SmsMessage.createFromPdu(pdu as ByteArray)
            val body = msg.messageBody
            if (body.contains("KFC", true)) {
                Log.d("KFC_SMS", body)
            }
        }
    }
}
