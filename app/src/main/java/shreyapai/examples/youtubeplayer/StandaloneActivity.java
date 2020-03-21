package shreyapai.examples.youtubeplayer;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class StandaloneActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        Intent intent = null;

        switch (view.getId()) {
            case R.id.btnPlayVideo:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID,0,true,true);
                break;
            case R.id.btnPlaylist:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_PLAYLIST,0,0, true, true);
                break;
            default:


        }
        if (intent != null) {
            startActivity(intent);
        }

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvity_standalone);

        Button btnPlayVideo = (Button) findViewById(R.id.btnPlayVideo);
        Button btnPlayList = (Button) findViewById(R.id.btnPlaylist);

        /*ONE WAY OF ASSIGNING ONCLICKLISTENER (this) because we are implementing View.OnClickListener*/
        btnPlayVideo.setOnClickListener(this);
        btnPlayList.setOnClickListener(this);



        /* HOW WE ACTUALLY USED TO DO IT IN CALCULATOR APP*/
       /* View.OnClickListener ourListener= new View.OnClickListener(){

            @Override
            public void onClick(View view) {

            }
        };
        btnPlayVideo.setOnClickListener(ourListener);
        btnPlayList.setOnClickListener(ourListener);*/



        /*ANOTHER WAY OF DOING IT(BUT USED ONLY FOR ONE BUTTON)*/
      /* btnPlayVideo.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view) {

           }
       });*/
    }
}
