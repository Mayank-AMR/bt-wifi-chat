package com.amrtech.bt_wificonnectionplayaround.domain.chat

/**
 * @Project Bt-Wifi Connection Play Around
 * @Created_by Mayank Kumar on 27-04-2026 05:56 pm
 */
typealias BluetoothDeviceDomain = BluetoothDevice

data class BluetoothDevice(
    val name: String?,
    val address: String
)
