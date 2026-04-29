package com.amrtech.bt_wificonnectionplayaround.domain.chat

/**
 * @Project Bt-Wifi Connection Play Around
 * @Created_by Mayank Kumar on 28-04-2026 06:37 pm
 */
sealed interface ConnectionResult {
    object ConnectionEstablished: ConnectionResult
    data class TransferSucceeded(val message: BluetoothMessage): ConnectionResult
    data class Error(val message: String): ConnectionResult
}