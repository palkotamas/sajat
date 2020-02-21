package hu.uni.eszterhazy.mobil.sajat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView view = findViewById(R.id.textView);
        Intent intent = getIntent();
        view.setText(intent.getStringExtra("info"));

        WebView wv = findViewById(R.id.webnezet);
        wv.loadUrl("https://www.index.hu");
    }
}
