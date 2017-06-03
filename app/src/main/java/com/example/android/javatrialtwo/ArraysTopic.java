package com.example.android.javatrialtwo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by g50 on 26-02-2017.
 */

public class ArraysTopic extends AppCompatActivity {


    String myUserName;
    String myUrl;
    private JavaAdapter javaAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topiclist);

        Bundle bundle= getIntent().getExtras();
        if(bundle!= null){
            myUserName= bundle.getString("username");
            myUrl= bundle.getString("userPhoto");

        }

        // final String[] subTopics = new String[]{
        //         "Introduction2","Introduction1","Introduction1","Introduction1","Introduction1","Introduction1","Introduction1","Introduction1","Introduction1","Introduction1"
        // };

        final ArrayList<Java> java = new ArrayList<Java>();

        java.add(new Java("Introduction 1", "1 Questions", "1/14"));
        java.add(new Java("Introduction 2", "2 Questions", "1/14"));
        java.add(new Java("Introduction 3", "3 Questions", "1/14"));
        java.add(new Java("Introduction 4", "4 Questions", "1/14"));
        java.add(new Java("Introduction 5", "5 Questions", "1/14"));
        java.add(new Java("Introduction 6", "6 Questions", "1/14"));
        java.add(new Java("Introduction 7", "7 Questions", "1/14"));
        java.add(new Java("Introduction 8", "8 Questions", "1/14"));
        java.add(new Java("Introduction 9", "9 Questions", "1/14"));
        java.add(new Java("Introduction 10", "10 Questions", "1/14"));

        ListAdapter adapter = new JavaAdapter(this, java);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //   String topicsList = subTopics[position];

                // String[] basicTopics = getResources().getStringArray(R.array.basicTopics);
                // final String basicTopics1= basicTopics[position];

                Java clickedItem = java.get(position);
                String arraysTopic = "arraysTopic";
                String message = "You Clicked Position" + position + clickedItem.getmTopicName();
                Toast.makeText(ArraysTopic.this, message, Toast.LENGTH_SHORT).show();
                switch (position) {
                    case 0:
                        Intent i0 = new Intent(ArraysTopic.this, Explain.class);
                        i0.putExtra("clickedItem", clickedItem.getmTopicName());
                        i0.putExtra("position", position);
                        i0.putExtra("basic", arraysTopic);
                        startActivity(i0);
                        break;
                    case 1:
                        Intent i1 = new Intent(ArraysTopic.this, Explain.class);
                        i1.putExtra("clickedItem", clickedItem.getmTopicName());
                        i1.putExtra("position", position);
                        i1.putExtra("basic", arraysTopic);
                        startActivity(i1);
                        break;
                    case 2:
                        Intent i2 = new Intent(ArraysTopic.this, Explain.class);
                        i2.putExtra("clickedItem", clickedItem.getmTopicName());
                        i2.putExtra("position", position);
                        i2.putExtra("basic", arraysTopic);
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3 = new Intent(ArraysTopic.this, Explain.class);
                        i3.putExtra("clickedItem", clickedItem.getmTopicName());
                        i3.putExtra("position", position);
                        i3.putExtra("basic", arraysTopic);
                        startActivity(i3);
                        break;
                    case 4:
                        Intent i4 = new Intent(ArraysTopic.this, Explain.class);
                        i4.putExtra("clickedItem", clickedItem.getmTopicName());
                        i4.putExtra("position", position);
                        i4.putExtra("basic", arraysTopic);
                        startActivity(i4);
                        break;
                    case 5:
                        Intent i5 = new Intent(ArraysTopic.this, Explain.class);
                        i5.putExtra("clickedItem", clickedItem.getmTopicName());
                        i5.putExtra("position", position);
                        i5.putExtra("basic", arraysTopic);
                        startActivity(i5);
                        break;
                    case 6:
                        Intent i6 = new Intent(ArraysTopic.this, Explain.class);
                        i6.putExtra("clickedItem", clickedItem.getmTopicName());
                        i6.putExtra("position", position);
                        i6.putExtra("basic", arraysTopic);
                        startActivity(i6);
                        break;
                    case 7:
                        Intent i7 = new Intent(ArraysTopic.this, Explain.class);
                        i7.putExtra("clickedItem", clickedItem.getmTopicName());
                        i7.putExtra("position", position);
                        i7.putExtra("basic", arraysTopic);
                        startActivity(i7);
                        break;
                    case 8:
                        Intent i8 = new Intent(ArraysTopic.this, Explain.class);
                        i8.putExtra("clickedItem", clickedItem.getmTopicName());
                        i8.putExtra("position", position);
                        i8.putExtra("basic", arraysTopic);
                        startActivity(i8);
                        break;
                    case 9:
                        Intent i9 = new Intent(ArraysTopic.this, Explain.class);
                        i9.putExtra("clickedItem", clickedItem.getmTopicName());
                        i9.putExtra("position", position);
                        i9.putExtra("basic", arraysTopic);
                        startActivity(i9);
                        break;

                }

            }
        });

        FloatingActionButton fab1 = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent basicConceptsIntent = new Intent(ArraysTopic.this, ForumActivity.class);
                basicConceptsIntent.putExtra("username",myUserName);
                basicConceptsIntent.putExtra("userPhoto",myUrl);
                startActivity(basicConceptsIntent);
            }
        });
    }

}
