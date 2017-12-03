package ca.jfmcode.heartmonitoralarm.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import ca.jfmcode.heartmonitoralarm.R;
import ca.jfmcode.heartmonitoralarm.System.HeartMonitorSystem;
import ca.jfmcode.heartmonitoralarm.Tools.HMSysListener;

import static ca.jfmcode.heartmonitoralarm.Tools.FinalVariables.*;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
    }

    @Override
    protected void onStart() {
        super.onStart();

        HeartMonitorSystem.getInstance().init(LaunchActivity.this, new HMSysListener() {
            @Override
            public void successful() {
                startActivity(new Intent(LaunchActivity.this, MainActivity.class));
                finish();
            }

            @Override
            public void enableBT(Intent intent) {
                startActivityForResult(intent, REQUEST_ENABLE_BT);
            }

            @Override
            public void error(String message) {
                Toast.makeText(LaunchActivity.this, message, Toast.LENGTH_LONG).show();//debug

                //TODO: Open dialog showing error message with "ok" btn that closes the app
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_ENABLE_BT){

        }
    }
}
