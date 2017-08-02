package m5.gitproject;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by rami on 02/08/2017.
 */

public class adapter extends RecyclerView.Adapter<ViewHolder>{

    model[] m ;
    Context c;

    public adapter(Context c ,model[] m){
        this.m = m ;
        this.c = c ;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(c).inflate(R.layout.view , parent , false) ;
        return new ViewHolder(c , v , m) ;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.text.setText(m[position].getName());

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
