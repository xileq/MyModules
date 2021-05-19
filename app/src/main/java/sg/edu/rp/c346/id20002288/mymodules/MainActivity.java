package sg.edu.rp.c346.id20002288.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView t1,t2,t3,t4,t5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.tv1);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
            intent.putExtra("ap","Module code: C209\nModule Name: Advance Object Oriented Programming\nAcademic Year: 2021\nSemester: 1\nModule Credit: 4\nVenue: W65E");
            startActivity(intent);
            }
        });


        t2=findViewById(R.id.tv2);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("sd","Module code: C206\nModule Name: Software Development Process\nAcademic Year: 2021\nSemester: 1\nModule Credit: 4\nVenue: W67N");
                startActivity(intent);
            }
        });
        t3=findViewById(R.id.tv3);
        t3.setOnClickListener(new View.OnClickListener() {
                                  @Override public void onClick(View v) {
                                      Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                                      intent.putExtra("it", "Module code: C235\nModule Name: IT Security and Management\nAcademic Year: 2021\nSemester:1\nModule Credit:4\nVenue:W65M");
                                      startActivity(intent);
                                  }
                              });

        t4=findViewById(R.id.tv4);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("bs","Module code: C353\nModule Name: Business System\nAcademic Year: 2021\nSemester:1\nModule Credit:4\nVenue:W66R");
                startActivity(intent);
            }
        });

        t5=findViewById(R.id.tv5);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("ma","Module code: C346\nModule Name: Mobile App Developement\nAcademic Year: 2021\nSemester:1\nModule Credit:4\nVenue:E62E");
                startActivity(intent);
            }
        });



    }
}