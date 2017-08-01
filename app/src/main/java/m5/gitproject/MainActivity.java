package m5.gitproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onFragmentInteraction(View v) {
        switch (v.getId()){
            case R.id.button:

                Toast t = Toast.makeText(this , "" , Toast.LENGTH_LONG);
                t.setText("How are you");
                t.show();
                break;


        }
    }
}
