package com.sanha.maskwhere;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HelpActivity extends AppCompatActivity {

    ListView help_list;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        help_list = findViewById(R.id.help_view);
        setAdapter();
        tv = (TextView) findViewById(R.id.textView);
        tv.setMovementMethod(new ScrollingMovementMethod());


    }

    private void setAdapter(){
        final ArrayAdapter<String> adapter
                = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1);
        help_list.setAdapter(adapter);
        adapter.add("개발자 : 이산하(tksgk77@gmail.com)");
        adapter.add("사용 API : 카카오링크 / 네이버 MAP API");
        adapter.add("마스크데이터 : 공공데이터포털 건강보험심사평가원");

        //adapter.add(" 이 어플이 마음에 들었다면 오른쪽 아래 \n 카카오톡으로 공유 해주세요!");
    }
}
