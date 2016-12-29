package com.example.giannig.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by giannig on 29/12/16. boh
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private final static String TAG = "MainAdapter";

    /** Execution context */
    private final Context mContext;

    /** Dataset */
    private final List<BeerData> mBeerDataset;

    public MainAdapter(Context mContext, List<BeerData> beerDataList) {
        this.mContext = mContext;
        this.mBeerDataset = beerDataList;
    }

    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MainAdapter.ViewHolder holder, int position) {
        Log.d(TAG, mBeerDataset.get(position).getName());

        BeerData beer = mBeerDataset.get(position);
        holder.setmBeerImage(beer.getUrlLogo(), mContext);
        holder.setmBeerText(beer.getName());
    }

    @Override
    public int getItemCount() {
        return mBeerDataset.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View container;

        public final TextView mBeerName;
        public final ImageView mBeerImage;


        public ViewHolder(View itemView) {
            super(itemView);

            container = itemView.findViewById(R.id.beer_element);
            mBeerName = (TextView) itemView.findViewById(R.id.beer_name);
            mBeerImage = (ImageView) itemView.findViewById(R.id.beer_thumbs);
        }

        public void setmBeerImage(String url,  Context ctx){
            if(url.isEmpty()){
                mBeerImage.setVisibility(View.GONE);
            }else{
                Log.d(TAG, "PICASSO: Loading " + url);
                mBeerImage.setVisibility(View.VISIBLE);
                Picasso.with(ctx).load(url).fit().centerInside().into(mBeerImage);
            }
        }

        public void setmBeerText(String name) {
            if(name.isEmpty()) {
                mBeerName.setText("NO NAME");
            }else{
                mBeerName.setText(name);
            }
        }
    }
}

