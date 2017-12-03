package ca.jfmcode.heartmonitoralarm.System.Object;

import static ca.jfmcode.heartmonitoralarm.Tools.FinalVariables.*;

/**
 * Created by ONi on 01/12/2017.
 */

public class Alarm {
    //region private variables
    private byte option; //0=equals, 1=less than, 2=greater than, 3=greater or equal than, 4=less or equal than
    private short value;
    private String soundDir;
    //endregion

    //region constructor method
    public Alarm(byte option, short value, String soundDir) {
        this.option = option;
        this.value = value;
        this.soundDir = soundDir;
    }
    //endregion

    //region setter methods
    public void setOption(byte option) {
        this.option = option;
    }

    public void setValue(short value) {
        this.value = value;
    }

    public void setSoundDir(String soundDir) {
        this.soundDir = soundDir;
    }
    //endregion

    //region getter methods
    public byte getOption() {
        return option;
    }

    public short getValue() {
        return value;
    }

    public String getSoundDir() {
        return soundDir;
    }
    //endregion

    public boolean equals(int amount){
        switch(option){
            case EQUALS:
                if(amount==value){
                    return true;
                }else{
                    return false;
                }
            case LESSTHAN:
                if(amount<value){
                    return true;
                }else{
                    return false;
                }
            case GREATERTHAN:
                if(amount>value){
                    return true;
                }else{
                    return false;
                }
            case GREATOREQL:
                if(amount>=value){
                    return true;
                }else{
                    return false;
                }
            case LESSOREQL:
                if(amount<=value){
                    return true;
                }else{
                    return false;
                }
        }

        return false;
    }
}
