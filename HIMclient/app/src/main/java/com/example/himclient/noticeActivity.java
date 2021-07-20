package com.example.himclient;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class noticeActivity extends AppCompatActivity {

    ListView lv_notice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        lv_notice=findViewById(R.id.lv_notice);
        List<String> notices = new ArrayList<>();


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,notices);
        lv_notice.setAdapter(adapter);

        notices.add("2021/07/18 신규부원 모집");
        notices.add("2021/07/18 신규부원 모집1");
        notices.add("2021/07/18 회식 공지");
        notices.add("2021/07/18 신규부원 모집3");
        notices.add("2021/07/19 신규부원 필독!");
        notices.add("2021/07/19 신규부원 모집5");
        notices.add("2021/07/19 봉사활동");
        notices.add("2021/07/20 신규부원 모집7");
        notices.add("2021/07/20 정규 모임");
        notices.add("2021/07/21 신규부원 모집9");
        notices.add("2021/07/22 신규부원 모집10");
        notices.add("2021/07/23 정규 모임");
        notices.add("2021/07/24 신규부원 모집10");
        notices.add("2021/07/24 정규 모임");
        notices.add("2021/07/25 중요사항 공지");
        notices.add("2021/07/25 신규부원 모집11");
        adapter.notifyDataSetChanged();

        lv_notice.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),NoticeDetail.class);
                startActivity(intent);
            }
        });



    }
}