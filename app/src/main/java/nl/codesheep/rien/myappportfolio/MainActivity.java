package nl.codesheep.rien.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openSpotifyStreamer(View view) {
        showToast("This button will launch my Spotify streamer app");
    }

    public void openScoresApp(View view) {
        showToast("This button will launch my scores app");
    }

    public void openLibraryApp(View view) {
        showToast("This button will launch my library app");
    }

    public void openBuildItBigger(View view) {
        showToast("This button will launch my build it bigger app");
    }

    public void openXYZReader(View view) {
        showToast("This button will launch my xyz reader app");
    }

    public void openCapstone(View view) {
        showToast("This button will launch my capstone app");
    }

    private void showToast(String text) {
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        toast.show();
    }


}
