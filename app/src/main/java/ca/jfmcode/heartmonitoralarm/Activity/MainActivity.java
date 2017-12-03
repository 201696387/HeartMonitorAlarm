package ca.jfmcode.heartmonitoralarm.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import ca.jfmcode.heartmonitoralarm.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.act_main_toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.act_main_alarmFAB);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alarmAction();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.appbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case R.id.appbar_menu_settings:
                settingsAction();
                break;
            case R.id.appbar_menu_about:
                aboutAction();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    private void settingsAction(){
        startActivity(new Intent(MainActivity.this, SettingsActivity.class));
    }

    private void aboutAction(){
        startActivity(new Intent(MainActivity.this, AboutActivity.class));
    }

    private void alarmAction(){
        startActivity(new Intent(MainActivity.this, AlarmActivity.class));
    }
}
