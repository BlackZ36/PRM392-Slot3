package com.example.slot3_android_app.DisplayData;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.slot3_android_app.R;

public class DisplayDataActivity extends AppCompatActivity {

    private Button displayDataBtn;
    private ListView dataListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_display_data);

        //data template
        String[] users = {
                "user1:password1",
                "user2:password2",
                "user3:password3",
                "user4:password4",
                "user5:password5",
                "user6:password6",
                "user7:password7",
                "user8:password8",
                "user9:password9",
                "user10:password10",
                "user11:password11",
                "user12:password12",
                "user13:password13",
                "user14:password14",
                "user15:password15",
        };

        displayDataBtn = findViewById(R.id.displayDataBtn);
        dataListView = findViewById(R.id.dataListView);

        displayDataBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(DisplayDataActivity.this, android.R.layout.simple_list_item_1, users);
                dataListView.setAdapter(adapter);
            }
        });

    }
}