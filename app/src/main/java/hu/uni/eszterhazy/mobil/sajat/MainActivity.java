package hu.uni.eszterhazy.mobil.sajat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.inputmethodservice.Keyboard;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText nevMezo =findViewById(R.id.editText);
        nevMezo.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable)
            {
                Button gomb = findViewById(R.id.button);
                if(editable.length()>0)
            {
                gomb.setEnabled(true);
            }
            else {
                gomb.setEnabled(false);
            }
            }
        });
    }
    public void koszonj(View v){
        EditText nevMezo =findViewById(R.id.editText);
        TextView hello = findViewById(R.id.textView3);
        InputMethodManager imm  = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),0);
        if(!nevMezo.getText().toString().isEmpty()){
            if(nevMezo.getText().toString().matches( "[0-9]*"))
            {
                Toast.makeText(getApplicationContext(), "Nem tartalmazhat szamot", Toast.LENGTH_SHORT).show();
            } else
            {
                hello.setText(nevMezo.getText());
                findViewById(R.id.imageView).setVisibility(View.VISIBLE);
            }
        }
    }
    public  void kovetkezo (View v)
    {
     Intent intent = new Intent(this, Second.class);
     intent.putExtra("info", "Sziasztok");
     startActivity(intent);
    }
}
