package m5.gitproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView view = (RecyclerView)findViewById(R.id.recycler) ;
        view.setLayoutManager(new LinearLayoutManager(this));

        model[] m = new model[3] ;
        for(int x = 0 ; x < m.length ; x++){
            m[x] = new model() ;
            m[x].setName("Name Is Here");
        }

        adapter a = new adapter(this , m) ;
        view.setAdapter(a);
    }
}
