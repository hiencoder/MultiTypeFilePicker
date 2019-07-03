package com.vincent.filepicker.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.vincent.filepicker.R;
import com.vincent.filepicker.filter.entity.BaseFile;
import com.vincent.filepicker.filter.entity.ImageFile;
import com.vincent.filepicker.filter.entity.VideoFile;

import java.util.ArrayList;
import java.util.List;

public class FileMediaAdapter extends BaseAdapter<BaseFile, RecyclerView.ViewHolder> {
    public static final int TYPE_VIDEO = 1;
    public static final int TYPE_IMAGE = 2;

    private Context context;
    private List<BaseFile> list;

    public FileMediaAdapter(Context ctx, ArrayList<BaseFile> list) {
        super(ctx, list);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == TYPE_VIDEO) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vw_layout_item_video_pick, parent, false);
            return new VideoHolder(view);
        } else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vw_layout_item_image_pick, parent, false);
            return new ImageHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (getItemViewType(position) == TYPE_VIDEO) {

        } else {

        }
    }

    @Override
    public int getItemViewType(int position) {
        BaseFile baseFile = list.get(position);
        if (baseFile instanceof VideoFile) {
            return TYPE_VIDEO;
        } else {
            return TYPE_IMAGE;
        }
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ImageHolder extends RecyclerView.ViewHolder {
        ImageView thumbnail, camera, cbx, shadow;

        public ImageHolder(View itemView) {
            super(itemView);
            thumbnail = itemView.findViewById(R.id.iv_thumbnail);
            camera = itemView.findViewById(R.id.iv_camera);
            cbx = itemView.findViewById(R.id.cbx);
            shadow = itemView.findViewById(R.id.shadow);
        }

        public void bindFindImage(ImageFile imageFile) {

        }
    }

    public class VideoHolder extends RecyclerView.ViewHolder {
        ImageView thumbnail, camera, cbx;
        public VideoHolder(View itemView) {
            super(itemView);
            thumbnail = itemView.findViewById(R.id.iv_thumbnail);
            camera = itemView.findViewById(R.id.iv_camera);
            cbx = itemView.findViewById(R.id.cbx);
        }
    }

}
