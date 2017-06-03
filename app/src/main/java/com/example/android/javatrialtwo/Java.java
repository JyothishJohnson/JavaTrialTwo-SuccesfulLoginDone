package com.example.android.javatrialtwo;

/**
 * Created by g50 on 26-02-2017.
 */

public class Java  {

    private String mTopicName;

    private String mQuestions;

    private String mTotalTopics;


    public Java (String topicName, String questionsInside, String totalTopics){

        super();
        mTopicName= topicName;
        mQuestions=questionsInside;
        mTotalTopics=totalTopics;
    }

    public String getmTopicName() {
        return mTopicName;
    }



    public String getmQuestionsInside() {
        return mQuestions;
    }


    public String getmTotalTopics() {
        return mTotalTopics;
    }

@Override
    public String toString(){
    return mTopicName;
}
}
