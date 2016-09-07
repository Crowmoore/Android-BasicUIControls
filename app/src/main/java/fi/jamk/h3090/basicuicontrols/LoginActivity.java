package fi.jamk.h3090.basicuicontrols;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private String[] names = {"Tester", "Millhouse", "Bart", "Marge", "Homer", "Lisa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.loginText);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line, names);
        actv.setAdapter(adapter);
    }

    public void switchToRadioView(View view) {
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }

    public void loginButtonClicked(View view) {
        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.loginText);
        String username = actv.getText().toString();

        EditText passwordField = (EditText) findViewById(R.id.passwordText);
        String password = passwordField.getText().toString();

        Toast.makeText(getApplicationContext(), username + " " + password, Toast.LENGTH_SHORT).show();
    }
}
