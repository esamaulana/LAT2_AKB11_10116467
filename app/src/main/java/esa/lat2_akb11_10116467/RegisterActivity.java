package esa.lat2_akb11_10116467;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// Esa M
// 10116467
// IF 11 - AKB 11
// 16-4-19

public class RegisterActivity extends AppCompatActivity {

    Button btn_Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btn_Register = (Button) findViewById(R.id.btn_Register);
        btn_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegisterActivity.this, AThereActivity.class);
                startActivity(i);
            }
        });

    }
}
