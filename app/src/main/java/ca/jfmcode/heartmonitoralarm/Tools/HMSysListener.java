package ca.jfmcode.heartmonitoralarm.Tools;

import android.content.Intent;

/**
 * Created by ONi on 01/12/2017.
 */

public interface HMSysListener {
    void successful();
    void enableBT(Intent intent);
    void error(String message);
}
