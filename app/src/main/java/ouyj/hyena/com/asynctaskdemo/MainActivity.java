package ouyj.hyena.com.asynctaskdemo;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnTest;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //查找按钮引用，设置事件侦听
        btnTest = findViewById(R.id.btn_test);
        btnTest.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                new PostToTwitter().execute("ouyj");
            }
        });
    }
    class PostToTwitter extends AsyncTask<String, Integer, Void> {


        @Override
        protected Void doInBackground(String... strings) {
            String str=String.format("doInBackground：%s",strings[0]);
            Log.d(TAG, str);
            return null;
        }
        @Override
        protected void onPreExecute() {
            Log.d(TAG, "onPreExecute");
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            Log.d(TAG, "onPostExecute");
            super.onPostExecute(aVoid);
        }
        @Override
        protected void onProgressUpdate(Integer... values) {
            Log.d(TAG, "onProgressUpdate");
            super.onProgressUpdate(values);
        }
        @Override
        protected void onCancelled() {
            Log.d(TAG, "onCancelled");
            super.onCancelled();
        }



    }
}
