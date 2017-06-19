package goals.dream.snippets;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
//permissions
//
public class MainActivity extends AppCompatActivity {
//use ctr shift + or - to expand all will save a LOT of scorlling
      //SharedPreferences========================================================
    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String key_1 = "k1";
    public static final String key_2 = "k2";
    public static final String key_3 = "k3";
       public static final String key_font_size = "key_font_size"; //x
       public static final String key_user_email = "key_user_email"; //x
       public static final String key_password = "key_password"; //x
    //can also use integers
    SharedPreferences sharedpreferences;
//SharedPreferences========================================================
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

 /* --- Code block ---- */
 /*
rotation
suppress keyboard
hide curser
get shared prefs
restart app
intent to open other app
button clicks
menu clicks
async post in background
async read remote file
click button
get value from specific element by id
webview-
-setup
-url
-onfinish
set-colors-programically
xml-center text
show/hide - layout
play sound
text to speech
vibrate
flash light
read and speak text from webpage by id

 */


//
//you can use fold selection
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
//
//end of on create
    }
//end of on create
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
