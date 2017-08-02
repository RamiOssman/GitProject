package m5.gitproject;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by rami on 02/08/2017.
 */

public class ViewHolder extends RecyclerView.ViewHolder {

    public TextView text ;
    public ViewHolder(Context c , View itemView , model[] m) {
        super(itemView);
        text = (TextView)itemView.findViewById(R.id.textView) ;
    }
}
