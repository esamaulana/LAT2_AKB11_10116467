package esa.lat2_akb11_10116467;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

// Esa M
// 10116467
// IF 11 - AKB 11
// 16-4-19

public class VerifyActivity extends AppCompatActivity {

    Button btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

        btn_send = (Button) findViewById(R.id.btn_send);
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(VerifyActivity.this, UserActivity.class);
                startActivity(i);
            }
        });

    }
}
