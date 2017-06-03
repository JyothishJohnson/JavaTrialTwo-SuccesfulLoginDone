package com.example.android.javatrialtwo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.ErrorReason;
import com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener;
import com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener;
import com.google.android.youtube.player.YouTubePlayerView;


public class Explain extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    public static final String API_KEY = "AIzaSyA7AHpgqyozHStbOkKRZzzxhCf8TUYx9mg";
   public static final String VIDEO_ID = "YnwsMEabmSo";
    //String videoArray[]= getResources().getStringArray(R.array.videoLinks);
String text;
    int x;
    String z="check";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explain);
        String videoArray[]= getResources().getStringArray(R.array.videoLinks);

        Bundle bundle= getIntent().getExtras();
        if(bundle != null){
            x= bundle.getInt("position");

          //  String y= bundle.getString("clickedItem");
            z= bundle.getString("basic");
          //  Toast.makeText(Explain.this, videoArray[0],Toast.LENGTH_SHORT).show();
         //   Toast.makeText(Explain.this, x + " " + y, Toast.LENGTH_SHORT).show();
        }

        String subTopicText[] = getResources().getStringArray(R.array.basicTopics);
       String subTopicText2[]= getResources().getStringArray(R.array.basicTopics);
        Intent i = getIntent();
        text = i.getStringExtra("clickedItem");

        TextView txt= (TextView)findViewById(R.id.detailedDescription);
        txt.setText(subTopicText[0]);
        TextView txt2= (TextView)findViewById(R.id.detailedDescription2);
        txt2.setText(subTopicText2[1]);

        TextView textView = (TextView)  findViewById(R.id.titleView);
        textView.setText(text);

        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_view);
        youTubePlayerView.initialize(API_KEY, this);



    }
    @Override

    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult result) {
        Toast.makeText(this, "Failed to Initialize!", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean wasRestored) {


        // String videoArray[]= getResources().getStringArray(R.array.videoLinks);
       String videoArray[]={
            "mKzLoZFz8PE","aIbdKrb0qQk","2n73O65J4_U","Wlls4CgRR1M","pv2-c8wPmHU","Zy_6zOwDTpA","Dq0F4Sg4GTs","koXHJMr6EHs","mZg9O5CjKg4","_lT5b_22VSM"
       };
        player.setPlayerStateChangeListener(playerStateChangeListener);
        player.setPlaybackEventListener(playbackEventListener);
      //  Toast.makeText(Explain.this, videoArray[0],Toast.LENGTH_SHORT).show();

       // Toast.makeText(Explain.this, "Inside " + x  + " " + z, Toast.LENGTH_SHORT).show();
      //  String xx= String.valueOf(x);
      //  int xxx= Integer.parseInt(xx);
        if(!wasRestored) {
            if(z.equals("basic")) {

                Toast.makeText(getApplicationContext(),"Inside Basic",Toast.LENGTH_SHORT).show();
                switch (x) {
                    case 0:
                        Toast.makeText(Explain.this, "one", Toast.LENGTH_SHORT).show();
                        player.cueVideo(videoArray[0]);

                        break;
                    case 1:
                        Toast.makeText(Explain.this, "two", Toast.LENGTH_SHORT).show();
                        player.cueVideo(videoArray[1]);

                        break;
                    case 2:
                        player.cueVideo(videoArray[2]);
                        Toast.makeText(Explain.this, "three", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        player.cueVideo(videoArray[3]);
                        Toast.makeText(Explain.this, "four", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        player.cueVideo(videoArray[4]);
                        Toast.makeText(Explain.this, "five", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        player.cueVideo(videoArray[5]);
                        Toast.makeText(Explain.this, "six", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        player.cueVideo(videoArray[6]);
                        Toast.makeText(Explain.this, "seven", Toast.LENGTH_SHORT).show();

                        break;
                    case 7:
                        player.cueVideo(videoArray[7]);
                        Toast.makeText(Explain.this, "eight", Toast.LENGTH_SHORT).show();
                        break;
                    case 8:
                        player.cueVideo(videoArray[8]);
                        Toast.makeText(Explain.this, "nine", Toast.LENGTH_SHORT).show();
                        break;
                    case 9:
                        player.cueVideo(videoArray[9]);
                        Toast.makeText(Explain.this, "ten", Toast.LENGTH_SHORT).show();
                        break;

                    default:
                        player.cueVideo(VIDEO_ID);
                }
            }
            else if(z.equals("controlStatements")) {

                Toast.makeText(getApplicationContext(),"Inside Control Statements",Toast.LENGTH_SHORT).show();
                switch (x) {
                    case 0:
                        Toast.makeText(Explain.this, "one", Toast.LENGTH_SHORT).show();
                        player.cueVideo(videoArray[0]);

                        break;
                    case 1:
                        Toast.makeText(Explain.this, "two", Toast.LENGTH_SHORT).show();
                        player.cueVideo(videoArray[1]);

                        break;
                    case 2:
                        player.cueVideo(videoArray[2]);
                        Toast.makeText(Explain.this, "three", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        player.cueVideo(videoArray[3]);
                        Toast.makeText(Explain.this, "four", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        player.cueVideo(videoArray[4]);
                        Toast.makeText(Explain.this, "five", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        player.cueVideo(videoArray[5]);
                        Toast.makeText(Explain.this, "six", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        player.cueVideo(videoArray[6]);
                        Toast.makeText(Explain.this, "seven", Toast.LENGTH_SHORT).show();

                        break;
                    case 7:
                        player.cueVideo(videoArray[7]);
                        Toast.makeText(Explain.this, "eight", Toast.LENGTH_SHORT).show();
                        break;
                    case 8:
                        player.cueVideo(videoArray[8]);
                        Toast.makeText(Explain.this, "nine", Toast.LENGTH_SHORT).show();
                        break;
                    case 9:
                        player.cueVideo(videoArray[9]);
                        Toast.makeText(Explain.this, "ten", Toast.LENGTH_SHORT).show();
                        break;

                    default:
                        player.cueVideo(VIDEO_ID);
                }
            }
          else  if(z.equals("arraysTopic")) {

                Toast.makeText(getApplicationContext(),"Inside Arrays",Toast.LENGTH_SHORT).show();
                switch (x) {
                    case 0:
                        Toast.makeText(Explain.this, "one", Toast.LENGTH_SHORT).show();
                        player.cueVideo(videoArray[0]);

                        break;
                    case 1:
                        Toast.makeText(Explain.this, "two", Toast.LENGTH_SHORT).show();
                        player.cueVideo(videoArray[1]);

                        break;
                    case 2:
                        player.cueVideo(videoArray[2]);
                        Toast.makeText(Explain.this, "three", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        player.cueVideo(videoArray[3]);
                        Toast.makeText(Explain.this, "four", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        player.cueVideo(videoArray[4]);
                        Toast.makeText(Explain.this, "five", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        player.cueVideo(videoArray[5]);
                        Toast.makeText(Explain.this, "six", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        player.cueVideo(videoArray[6]);
                        Toast.makeText(Explain.this, "seven", Toast.LENGTH_SHORT).show();

                        break;
                    case 7:
                        player.cueVideo(videoArray[7]);
                        Toast.makeText(Explain.this, "eight", Toast.LENGTH_SHORT).show();
                        break;
                    case 8:
                        player.cueVideo(videoArray[8]);
                        Toast.makeText(Explain.this, "nine", Toast.LENGTH_SHORT).show();
                        break;
                    case 9:
                        player.cueVideo(videoArray[9]);
                        Toast.makeText(Explain.this, "ten", Toast.LENGTH_SHORT).show();
                        break;

                    default:
                        player.cueVideo(VIDEO_ID);
                }
            }
            else  if(z.equals("classes")) {

                Toast.makeText(getApplicationContext(),"Inside Classes",Toast.LENGTH_SHORT).show();
                switch (x) {
                    case 0:
                        Toast.makeText(Explain.this, "one", Toast.LENGTH_SHORT).show();
                        player.cueVideo(videoArray[0]);

                        break;
                    case 1:
                        Toast.makeText(Explain.this, "two", Toast.LENGTH_SHORT).show();
                        player.cueVideo(videoArray[1]);

                        break;
                    case 2:
                        player.cueVideo(videoArray[2]);
                        Toast.makeText(Explain.this, "three", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        player.cueVideo(videoArray[3]);
                        Toast.makeText(Explain.this, "four", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        player.cueVideo(videoArray[4]);
                        Toast.makeText(Explain.this, "five", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        player.cueVideo(videoArray[5]);
                        Toast.makeText(Explain.this, "six", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        player.cueVideo(videoArray[6]);
                        Toast.makeText(Explain.this, "seven", Toast.LENGTH_SHORT).show();

                        break;
                    case 7:
                        player.cueVideo(videoArray[7]);
                        Toast.makeText(Explain.this, "eight", Toast.LENGTH_SHORT).show();
                        break;
                    case 8:
                        player.cueVideo(videoArray[8]);
                        Toast.makeText(Explain.this, "nine", Toast.LENGTH_SHORT).show();
                        break;
                    case 9:
                        player.cueVideo(videoArray[9]);
                        Toast.makeText(Explain.this, "ten", Toast.LENGTH_SHORT).show();
                        break;

                    default:
                        player.cueVideo(VIDEO_ID);
                }
            }

            else  if(z.equals("moreClasses")) {

                Toast.makeText(getApplicationContext(),"Inside More Classes",Toast.LENGTH_SHORT).show();
                switch (x) {
                    case 0:
                        Toast.makeText(Explain.this, "one", Toast.LENGTH_SHORT).show();
                        player.cueVideo(videoArray[0]);

                        break;
                    case 1:
                        Toast.makeText(Explain.this, "two", Toast.LENGTH_SHORT).show();
                        player.cueVideo(videoArray[1]);

                        break;
                    case 2:
                        player.cueVideo(videoArray[2]);
                        Toast.makeText(Explain.this, "three", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        player.cueVideo(videoArray[3]);
                        Toast.makeText(Explain.this, "four", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        player.cueVideo(videoArray[4]);
                        Toast.makeText(Explain.this, "five", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        player.cueVideo(videoArray[5]);
                        Toast.makeText(Explain.this, "six", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        player.cueVideo(videoArray[6]);
                        Toast.makeText(Explain.this, "seven", Toast.LENGTH_SHORT).show();

                        break;
                    case 7:
                        player.cueVideo(videoArray[7]);
                        Toast.makeText(Explain.this, "eight", Toast.LENGTH_SHORT).show();
                        break;
                    case 8:
                        player.cueVideo(videoArray[8]);
                        Toast.makeText(Explain.this, "nine", Toast.LENGTH_SHORT).show();
                        break;
                    case 9:
                        player.cueVideo(videoArray[9]);
                        Toast.makeText(Explain.this, "ten", Toast.LENGTH_SHORT).show();
                        break;

                    default:
                        player.cueVideo(VIDEO_ID);
                }
            }
            else  if(z.equals("exception")) {

                Toast.makeText(getApplicationContext(),"Inside Exception",Toast.LENGTH_SHORT).show();
                switch (x) {
                    case 0:
                        Toast.makeText(Explain.this, "one", Toast.LENGTH_SHORT).show();
                        player.cueVideo(videoArray[0]);

                        break;
                    case 1:
                        Toast.makeText(Explain.this, "two", Toast.LENGTH_SHORT).show();
                        player.cueVideo(videoArray[1]);

                        break;
                    case 2:
                        player.cueVideo(videoArray[2]);
                        Toast.makeText(Explain.this, "three", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        player.cueVideo(videoArray[3]);
                        Toast.makeText(Explain.this, "four", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        player.cueVideo(videoArray[4]);
                        Toast.makeText(Explain.this, "five", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        player.cueVideo(videoArray[5]);
                        Toast.makeText(Explain.this, "six", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        player.cueVideo(videoArray[6]);
                        Toast.makeText(Explain.this, "seven", Toast.LENGTH_SHORT).show();

                        break;
                    case 7:
                        player.cueVideo(videoArray[7]);
                        Toast.makeText(Explain.this, "eight", Toast.LENGTH_SHORT).show();
                        break;
                    case 8:
                        player.cueVideo(videoArray[8]);
                        Toast.makeText(Explain.this, "nine", Toast.LENGTH_SHORT).show();
                        break;
                    case 9:
                        player.cueVideo(videoArray[9]);
                        Toast.makeText(Explain.this, "ten", Toast.LENGTH_SHORT).show();
                        break;

                    default:
                        player.cueVideo(VIDEO_ID);
                }
            }

        }
    }
    private PlaybackEventListener playbackEventListener = new PlaybackEventListener() {
        @Override
        public void onBuffering(boolean arg0) {
        }
        @Override
        public void onPaused() {
        }
        @Override
        public void onPlaying() {
        }
        @Override
        public void onSeekTo(int arg0) {
        }
        @Override
        public void onStopped() {
        }
    };
    private PlayerStateChangeListener playerStateChangeListener = new PlayerStateChangeListener() {
        @Override
        public void onAdStarted() {
        }
        @Override
        public void onError(ErrorReason arg0) {
        }
        @Override
        public void onLoaded(String arg0) {
        }
        @Override
        public void onLoading() {
        }
        @Override
        public void onVideoEnded() {
        }
        @Override
        public void onVideoStarted() {
        }
    };

}
