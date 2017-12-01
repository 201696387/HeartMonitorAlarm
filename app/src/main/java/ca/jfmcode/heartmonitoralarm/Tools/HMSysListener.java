package ca.jfmcode.heartmonitoralarm.Tools;

/**
 * Created by ONi on 01/12/2017.
 */

public interface HMSysListener {
    void successful();
    void error(String message);
}
