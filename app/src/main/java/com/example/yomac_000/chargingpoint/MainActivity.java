package com.example.yomac_000.chargingpoint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnChargingPointsMapScreen;
    Button btnChargingPointsScreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChargingPointsMapScreen = (Button) findViewById(R.id.btnLinkToChargingPointsMapScreen);
        btnChargingPointsScreen = (Button) findViewById(R.id.btnLinkToChargingPointsScreen);

        View.OnClickListener myOnlyhandler = new View.OnClickListener() {
            public void onClick(View v) {
                switch(v.getId()) {
                    case R.id.btnLinkToChargingPointsMapScreen:

                        break;
                    case R.id.btnLinkToChargingPointsScreen:
                        Intent i = new Intent(getApplicationContext(),
                                AllStores.class);
                        startActivity(i);
                        finish();
                        break;
                }
            }
        };

        btnChargingPointsMapScreen.setOnClickListener(myOnlyhandler);
        btnChargingPointsScreen.setOnClickListener(myOnlyhandler);
    }
}
