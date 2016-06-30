package enquire.ie.voicetalentireland;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
private ItemData[] itemsData;




    public MyAdapter(ItemData[] itemsData) {
        this.itemsData = itemsData;
        }




// Create new views (invoked by the layout manager)
@Override
public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
        int viewType) {
        // create a new view
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent,false);

        // create ViewHolder

    ViewHolder viewHolder = new ViewHolder(itemLayoutView);


        return viewHolder;
        }





    // Replace the contents of a view (invoked by the layout manager)
@Override
public void onBindViewHolder(final ViewHolder viewHolder, int position) {

        // - get data from your itemsData at this position
        // - replace the contents of the view with that itemsData

        viewHolder.txtViewTitle.setText(itemsData[position].getTitle());
        viewHolder.imgViewIcon.setImageResource(itemsData[position].getImageUrl());
        viewHolder.detailtxt.setText(itemsData[position].getDetails());



}


    // inner class to hold a reference to each item of RecyclerView
public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{




    public TextView txtViewTitle,detailtxt;
    public ImageView imgViewIcon;
        public Button button;

    public ViewHolder(View itemLayoutView) {
        super(itemLayoutView);
        txtViewTitle = (TextView) itemLayoutView.findViewById(R.id.item_title);
        imgViewIcon = (ImageView) itemLayoutView.findViewById(R.id.item_icon);
        detailtxt=(TextView)itemLayoutView.findViewById(R.id.textViewVersion);
        button=(Button)itemLayoutView.findViewById(R.id.button);


    }


    @Override
    public void onClick(View v) {
        Log.w("myApp", "no network");
    }
}


    // Return the size of your itemsData (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return itemsData.length;
    }


    public ItemData[] getItemsData() {
        return itemsData;
    }




    }
