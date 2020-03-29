package com.example.drivetomsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button driveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        driveButton = findViewById(R.id.buttonDrive);

        driveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri montclairURI = Uri.parse("google.navigation:q=Montclair+State+University,+Montclair+New+Jersey");
                Intent driveToMSU = new Intent(Intent.ACTION_VIEW, montclairURI);
                driveToMSU.setPackage("com.google.android.apps.maps");
                startActivity(driveToMSU);
            }
        });

    }
}
