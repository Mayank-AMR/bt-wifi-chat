package com.amrtech.bt_wificonnectionplayaround.presentation

/**
 * @Project Bt-Wifi Connection Play Around
 * @Created_by Mayank Kumar on 28-04-2026 11:13 am
 */
import com.amrtech.bt_wificonnectionplayaround.domain.chat.BluetoothDevice
import com.amrtech.bt_wificonnectionplayaround.domain.chat.BluetoothMessage

data class BluetoothUiState(
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList(),
    val isConnected: Boolean = false,
    val isConnecting: Boolean = false,
    val errorMessage: String? = null,
    val messages: List<BluetoothMessage> = emptyList()
)
