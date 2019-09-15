package ouyj.hyena.com.asynctaskdemo;

import android.os.AsyncTask;
public class MyAsyncTask extends AsyncTask<String,Integer,Boolean> {

    @Override
    protected Boolean doInBackground(String... strings) {
        return null;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }
    @Override
    protected void onPostExecute(Boolean b) {
        super.onPostExecute(b);
    }
    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
    }
    @Override
    protected void onCancelled() {
        super.onCancelled();
    }
}
