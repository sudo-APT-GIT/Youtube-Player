package shreyapai.examples.youtubeplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//to put or copy anything switch from android to project view
//add "implementation files('libs/YouTubeAndroidPlayerApi.jar') whatever in 'android view>gradlebuild(module:app)'
//to make a new activity go to app>java>Right click on the package>activity>gallery>empty>'Lauch activity ticked'
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSingle = (Button) findViewById(R.id.btnPlaySingle);
        Button btnStandalone = (Button) findViewById(R.id.btnStandAlone);

        btnSingle.setOnClickListener(this);
        btnStandalone.setOnClickListener(this);
    }
    //make changes in the android manifest.xml if you've used intentfilter for youtubeactivity class
    @Override
    public void onClick(View view) {
        Intent intent = null;

        switch (view.getId()) {
            case R.id.btnPlaySingle:
                intent = new Intent(this, YoutubeActivity.class);
                break;
            case R.id.btnStandAlone:
                intent = new Intent(this, StandaloneActivity.class);
                break;
            default:

        }

        if (intent != null) {
            startActivity(intent);
        }
    }
}
