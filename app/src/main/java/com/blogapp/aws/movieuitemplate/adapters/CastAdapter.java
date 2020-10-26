package com.blogapp.aws.movieuitemplate.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.blogapp.aws.movieuitemplate.R;
import com.blogapp.aws.movieuitemplate.models.Cast;
import com.bumptech.glide.Glide;

import java.util.List;

public class CastAdapter  extends RecyclerView.Adapter<CastAdapter.CastviewHolder> {

    Context mContext;
    List<Cast> mData;

    public CastAdapter(Context mContext, List<Cast> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }


    @NonNull
    @Override
    public CastviewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_cast,viewGroup,false);
        return new CastviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CastviewHolder castviewHolder, int i) {
        Glide.with(mContext).load(mData.get(i).getImg_link()).into(castviewHolder.img);

    }


    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class CastviewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        public CastviewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img_cast);
        }
    }
}
