package com.example.andriod;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;


public class MainActivity extends AppCompatActivity implements OnClickListener {
    private String text = String.valueOf(R.string.defaultPassword);
    private boolean blank = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Toast t = Toast.makeText(this,"Hello",Toast.LENGTH_LONG);
        t.show();
        Toast t2 = Toast.makeText(this,"Android",Toast.LENGTH_SHORT);
        t2.show();
        */
        Button btnl = (Button) findViewById(R.id.button_1);
        btnl.setOnClickListener(this);

        Button btnl2 = (Button) findViewById(R.id.button_2);
        btnl2.setOnClickListener(this);

        Button btnl3 = (Button) findViewById(R.id.button_3);
        btnl3.setOnClickListener(this);

        Button btnl4 = (Button) findViewById(R.id.button_4);
        btnl4.setOnClickListener(this);

        Button btnl5 = (Button) findViewById(R.id.button_5);
        btnl5.setOnClickListener(this);

        Button btnl6 = (Button) findViewById(R.id.button_6);
        btnl6.setOnClickListener(this);

        Button btnl7 = (Button) findViewById(R.id.button_7);
        btnl7.setOnClickListener(this);

        Button btnl8 = (Button) findViewById(R.id.button_8);
        btnl8.setOnClickListener(this);

        Button btnl9 = (Button) findViewById(R.id.button_9);
        btnl9.setOnClickListener(this);

        Button btnl0 = (Button) findViewById(R.id.button_0);
        btnl0.setOnClickListener(this);

        Button btnl_clear = (Button) findViewById(R.id.clear_button);
        btnl_clear.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        String add = null;
        int id = v.getId();
        TextView t = (TextView) findViewById(R.id.digit_text_view);
        switch (id) {
            case R.id.button_1:
                add = "1";
                break;
            case R.id.button_2:
                add = "2";
                break;
            case R.id.button_3:
                add = "3";
                break;
            case R.id.button_4:
                add = "4";
                break;
            case R.id.button_5:
                add = "5";
                break;
            case R.id.button_6:
                add = "6";
                break;
            case R.id.button_7:
                add = "7";
                break;
            case R.id.button_8:
                add = "8";
                break;
            case R.id.button_9:
                add = "9";
                break;
            case R.id.button_0:
                add = "0";
                break;
            case R.id.clear_button:
                clear();
                break;

            default:
                break;
        }
        if (add != null) {
            if (blank)
                text = add;
            else text += add;
            blank = false;
        }
        t.setText(text);
    }

    private void clear() {
        text = getResources().getString(R.string.defaultPassword);
        blank = true;
    }

}
