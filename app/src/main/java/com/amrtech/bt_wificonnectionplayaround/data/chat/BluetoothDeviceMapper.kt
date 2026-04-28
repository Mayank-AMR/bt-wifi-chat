package com.amrtech.bt_wificonnectionplayaround.data.chat

/**
 * @Project Bt-Wifi Connection Play Around
 * @Created_by Mayank Kumar on 27-04-2026 05:57 pm
 */

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.amrtech.bt_wificonnectionplayaround.domain.chat.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}