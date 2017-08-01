package m5.gitproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     Toast t =  new Toast(this);
        t.setDuration(Toast.LENGTH_LONG);
        t.setText("How are you");
        t.show();
    }
}
