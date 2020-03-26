package info.devexchanges.mylogin;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText Username, Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Username = (EditText)findViewById(R.id.IdUser);
        Password = (EditText)findViewById(R.id.IdPass);
    }



    public void OnLogin(View view){
        String username = Username.getText().toString();
        String password = Password.getText().toString();
        String type = "login";
        Background Background = new Background(this);
        Background.execute(type, username, password);
    }
}
