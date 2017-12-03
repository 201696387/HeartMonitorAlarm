package ca.jfmcode.heartmonitoralarm.System;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothHealth;
import android.bluetooth.BluetoothHealthCallback;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import ca.jfmcode.heartmonitoralarm.Activity.MainActivity;
import ca.jfmcode.heartmonitoralarm.Tools.HMSysListener;

/**
 * Created by ONi on 01/12/2017.
 */

public class HeartMonitorSystem {
    private BluetoothAdapter bluetoothAdapter;
    private BluetoothHealth bluetoothHealthDevice;

    //region singleton methods
    private static final HeartMonitorSystem ourInstance = new HeartMonitorSystem();

    public static HeartMonitorSystem getInstance() {
        return ourInstance;
    }

    private HeartMonitorSystem() {
    }
    //endregion

    public void init(Context context, HMSysListener hmSysListener){
        //TODO: Get necessary permissions
        enableBluetoothOnPhone(context, hmSysListener);

        //TODO: Call dialog requesting scan BLE Heart monitoring device

        hmSysListener.successful();
    }

    private void enableBluetoothOnPhone(Context context, HMSysListener hmSysListener){
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

        if(bluetoothAdapter == null){
            hmSysListener.error("enableBluetoothOnPhone Error : Device does not support Bluetooth");
            Log.e("enableBluetooth Error","Device does not support Bluetooth");
            return;
        }

        if(bluetoothAdapter.isEnabled()){
            hmSysListener.enableBT(new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE));
            Log.d("enableBluetooth","Success");
        }
    }

    public void connect(){

    }
}
