package com.example.masror_mehedi.videoplay;

import android.app.Activity;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends Activity {

    VideoView videoView;
    MediaController Controller;//for controling video
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.videoView);
        Controller = new MediaController(this);
        videoView.setMediaController(Controller);

        videoView.setVideoURI(Uri.parse("android.resource://com.example.masror_mehedi.videoplay/raw/video"));
        //videoView.setVideoPath("http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4");
        videoView.start();
    }
}
