package com.example.ghaniapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}    @Override
     public boolean onCreateOptionMenu (Menu menu) {
    getMenuInFlater().Inflate(R.Menu.main_menu, menu);
    return super.omCreateOptions(Menu);

        case R.id.mi_input_control:
            startActivity(new Intent( packageContent: this,InputControl.class));
            break;

        case R.id.mi_input_control:
        startActivity(new Intent( packageContent: this,InputControl.class));
        break;

        case R.id.mi_input_control:
        startActivity(new Intent( packageContent: this,InputControl.class));
        break;

        case R.id.mi_input_control:
        startActivity(new Intent( packageContent: this,InputControl.class));
        break;
        }

}