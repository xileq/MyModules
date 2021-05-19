package sg.edu.rp.c346.id20002288.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
TextView tvdisplay;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);
        tvdisplay=findViewById(R.id.tvdisplay);

        Intent intentreceive = getIntent();
        String value = intentreceive.getStringExtra("ap");
        tvdisplay.setText(value);

        Intent intentreceive1 = getIntent();
        String value1 = intentreceive.getStringExtra("sd");
        tvdisplay.setText(value1);

        Intent intentreceive2 = getIntent();
        String value2 = intentreceive.getStringExtra("it");
        tvdisplay.setText(value2);

        Intent intentreceive3 = getIntent();
        String value3 = intentreceive.getStringExtra("bs");
        tvdisplay.setText(value3);

        Intent intentreceive4 = getIntent();
        String value4 = intentreceive.getStringExtra("ma");
        tvdisplay.setText(value4);

        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }
}