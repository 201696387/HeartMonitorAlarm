package ca.jfmcode.heartmonitoralarm.System;

import android.content.Context;
import android.content.Intent;

import ca.jfmcode.heartmonitoralarm.Activity.MainActivity;
import ca.jfmcode.heartmonitoralarm.Tools.HMSysListener;

/**
 * Created by ONi on 01/12/2017.
 */

public class HeartMonitorSystem {
    //region singleton methods
    private static final HeartMonitorSystem ourInstance = new HeartMonitorSystem();

    public static HeartMonitorSystem getInstance() {
        return ourInstance;
    }

    private HeartMonitorSystem() {
    }
    //endregion

    public void init(HMSysListener hmSysListener){
        //TODO: Get necessary permissions

        //TODO: Call dialog requesting scan BLE Heart monitoring device

        hmSysListener.successful();
    }
}
