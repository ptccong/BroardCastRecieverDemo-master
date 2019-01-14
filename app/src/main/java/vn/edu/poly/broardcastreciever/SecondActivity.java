package vn.edu.poly.broardcastreciever;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    private Button btnSend;
    private TextView txtHt;




    public static final String ACTION_TEST = "ABC";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txtHt = (TextView) findViewById(R.id.txtHt);
        btnSend = findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtHt.setText("Hello Pham Cong");

                Intent intent = new Intent(ACTION_TEST);
                intent.putExtra("data", "Hello Huy Nguyen!!!");


                // gui toi broardcast intent voi du lieu la data
                sendBroadcast(intent);
            }
        });

    }
}
