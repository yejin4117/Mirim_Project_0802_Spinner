package kr.hs.emirim.yejin.mirim_project_0802_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    int[] posterId={R.drawable.pos1,R.drawable.pos2,R.drawable.pos3,R.drawable.pos4,R.drawable.pos5,
            R.drawable.pos6,R.drawable.pos7,R.drawable.pos8,R.drawable.pos9,R.drawable.pos10};
    String[] items={"구르미 그린 달빛","그해 우리는","런온","스타트 업","쌈마이웨이","여신강림",
                "유미의 세포들","에이틴2","호텔델루나","어느날 우리집 현관으로 멸망이 들어왔다"};
    ImageView imgv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgv = findViewById(R.id.imgv);
        Spinner spinner= findViewById(R.id.spinner);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                imgv.setImageResource(posterId[i]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}