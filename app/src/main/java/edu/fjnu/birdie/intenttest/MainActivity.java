package edu.fjnu.birdie.intenttest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click_surface(View source){
        EditText editText = (EditText) findViewById(R.id.url);
        String contentUrl = editText.getText().toString();

        Intent intent = new Intent();
        //intent.setAction("android.intent.action.VIEW");
        Uri content_url = Uri.parse(contentUrl);
        intent.setData(content_url);
        //intent.addCategory(Intent.CATEGORY_DEFAULT);
        //intent.putExtra("url", contentUrl);
        //intent.setClassName("com.android.browser","com.android.browser.BrowserActivity");
        startActivity(intent);
    }
}
