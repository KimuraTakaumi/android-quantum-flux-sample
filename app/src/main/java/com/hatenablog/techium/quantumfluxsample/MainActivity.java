package com.hatenablog.techium.quantumfluxsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import info.quantumflux.QuantumFlux;
import info.quantumflux.model.query.Select;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 追加
        Task task = new Task();
        task.subject = "TODO 1";
        task.detail = "記事書く";
        task.save();
        task = new Task();
        task.subject = "TODO 2";
        task.detail = "記事書く";
        task.save();
        task = new Task();
        task.subject = "TODO 3";
        task.detail = "記事書く";
        task.save();
        task = new Task();
        task.subject = "TODO 4";
        task.detail = "記事書く";
        task.save();
        task = new Task();
        task.subject = "TODO 5";
        task.detail = "記事書く";
        task.save();

        // 検索
        Task select = Select.from(Task.class).first();
        Log.d("techium" , "id: " + select.getId() + ", subject: " + select.subject + ", detail: " + select.detail);

        // 更新
        Task item = Select.from(Task.class).first();
        item.detail = "更新しました";
        item.update();

        select = Select.from(Task.class).first();
        Log.d("techium" , "id: " + select.getId() + ", subject: " + select.subject + ", detail: " + select.detail);

        // 削除
        item = Select.from(Task.class).first();
        item.delete();

        select = Select.from(Task.class).first();
        Log.d("techium" , "id: " + select.getId() + ", subject: " + select.subject + ", detail: " + select.detail);
    }
}
