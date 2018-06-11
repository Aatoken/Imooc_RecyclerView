package com.atoken.cn.imooc_recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class StaggeAdapter extends RecyclerView.Adapter<StaggeAdapter.StaggeHolderView> {

    private Context mContext;

    private List<String> mDatas;

    List<Integer> mHeights;

    public StaggeAdapter(Context mContext, List<String> mDatas) {
        this.mContext = mContext;
        this.mDatas = mDatas;

        mHeights=new ArrayList<>();
        for (int i=0;i<mDatas.size();i++)
        {
            mHeights.add((int)(100+Math.random()*300));
        }
    }

    @Override
    public StaggeHolderView onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(mContext).inflate(R.layout.item_stagge_tv,parent,false);
        StaggeHolderView viewHolder=new StaggeHolderView(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(StaggeHolderView holder, int position) {
        ViewGroup.LayoutParams lp = holder.itemView.getLayoutParams();

        lp.height=mHeights.get(position);

        holder.itemView.setLayoutParams(lp);

        holder.tv.setText(mDatas.get(position));
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    class StaggeHolderView extends RecyclerView.ViewHolder{
        TextView tv;
        public StaggeHolderView(View itemView) {
            super(itemView);
            tv = (TextView)itemView.findViewById(R.id.id_stagge_tv);
        }
    }
}
