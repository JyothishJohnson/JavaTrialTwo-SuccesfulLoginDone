package com.example.android.javatrialtwo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by g50 on 26-02-2017.
 */

public class JavaAdapter extends ArrayAdapter<Java>  {



    public JavaAdapter (Context context, ArrayList<Java> java){
        super(context,0,java);
    }

    @Override
    public View getView (int position, View counterview , ViewGroup parent){

        View listItemView = counterview;
        if(listItemView== null){

            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        }
        Java currentJava = getItem(position);

        TextView topicName = (TextView) listItemView.findViewById(R.id.topicname);

        topicName.setText(currentJava.getmTopicName());

        TextView questions = (TextView) listItemView.findViewById(R.id.questions);

        questions.setText(currentJava.getmQuestionsInside());

        TextView totalTopics = (TextView) listItemView.findViewById(R.id.totalTopics);

        totalTopics.setText(currentJava.getmTotalTopics());

        return listItemView;
    }
}
