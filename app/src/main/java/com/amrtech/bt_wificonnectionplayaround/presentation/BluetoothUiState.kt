package com.amrtech.bt_wificonnectionplayaround.presentation

/**
 * @Project Bt-Wifi Connection Play Around
 * @Created_by Mayank Kumar on 28-04-2026 11:13 am
 */
import com.amrtech.bt_wificonnectionplayaround.domain.chat.BluetoothDevice

data class BluetoothUiState(
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList(),
)
