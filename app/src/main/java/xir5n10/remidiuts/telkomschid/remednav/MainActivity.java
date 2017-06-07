package xir5n10.remidiuts.telkomschid.remednav;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Navigation");

        Button bt1 = (Button) findViewById(R.id.buttonS);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SatuActivity.class));
            }
        });
        Button bt2 = (Button) findViewById(R.id.buttonD);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DuaActivity.class));
            }
        });
        Button bt3 = (Button) findViewById(R.id.buttonT);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TigaActivity.class));
            }
        });
        Button bt4 = (Button) findViewById(R.id.buttonE);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EmpatActivity.class));
            }
        });
    }
}
