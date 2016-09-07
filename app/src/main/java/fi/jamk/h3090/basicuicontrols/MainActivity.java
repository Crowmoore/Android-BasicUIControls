package fi.jamk.h3090.basicuicontrols;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectButtonClicked(View view) {
        RadioGroup group = (RadioGroup) findViewById(R.id.foodRadioGroup);
        int id = group.getCheckedRadioButtonId();

        RadioButton button = (RadioButton) findViewById(id);
        String text = (String) button.getText();

        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }

    public void switchToLoginView(View view) {
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }
}
