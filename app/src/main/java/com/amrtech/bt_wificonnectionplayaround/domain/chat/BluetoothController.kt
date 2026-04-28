package com.amrtech.bt_wificonnectionplayaround.domain.chat

/**
 * @Project Bt-Wifi Connection Play Around
 * @Created_by Mayank Kumar on 27-04-2026 05:54 pm
 */
import kotlinx.coroutines.flow.StateFlow

interface BluetoothController {
    val scannedDevices: StateFlow<List<BluetoothDevice>>
    val pairedDevices: StateFlow<List<BluetoothDevice>>

    fun startDiscovery()
    fun stopDiscovery()

    fun release()
}