package com.example.android.javatrialtwo;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.BitmapImageViewTarget;

import java.util.List;

/**
 * Created by g50 on 28-03-2017.
 */

public class MessageAdapter extends ArrayAdapter<ForumMessages> {

    public MessageAdapter(Context context, int resource, List<ForumMessages> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.item_messages, parent, false);
        }

        ImageView photoImageView = (ImageView) convertView.findViewById(R.id.photoImageView);
        TextView messageTextView = (TextView) convertView.findViewById(R.id.messageTextView);
        TextView authorTextView = (TextView) convertView.findViewById(R.id.nameTextView);
        final ImageView userPhoto = (ImageView) convertView.findViewById(R.id.userImage);


        ForumMessages message = getItem(position);

        boolean isPhoto = message.getPhotoUrl() != null;
        if (isPhoto) {
            messageTextView.setVisibility(View.GONE);
            photoImageView.setVisibility(View.VISIBLE);
            Glide.with(photoImageView.getContext())
                    .load(message.getPhotoUrl())
                    .into(photoImageView);
            Glide.with(userPhoto.getContext())
                    .load(message.getUserPhoto())
                    .asBitmap()
                    .placeholder(R.drawable.welcome)
                    .into(new BitmapImageViewTarget(userPhoto) {

                        @Override
                        protected void setResource(Bitmap resource) {
                            RoundedBitmapDrawable circularBitmapDrawable =
                                    RoundedBitmapDrawableFactory.create(userPhoto.getContext().getResources(), resource);
                            circularBitmapDrawable.setCircular(true);
                            userPhoto.setImageDrawable(circularBitmapDrawable);
                        }
                    });
        } else {
            messageTextView.setVisibility(View.VISIBLE);
            photoImageView.setVisibility(View.GONE);
            messageTextView.setText(message.getText());

            Glide.with(userPhoto.getContext())
                    .load(message.getUserPhoto())
                    .asBitmap()
                    .placeholder(R.drawable.welcome)
                    .into(new BitmapImageViewTarget(userPhoto) {

                        @Override
                        protected void setResource(Bitmap resource) {
                            RoundedBitmapDrawable circularBitmapDrawable =
                                    RoundedBitmapDrawableFactory.create(userPhoto.getContext().getResources(), resource);
                            circularBitmapDrawable.setCircular(true);
                            userPhoto.setImageDrawable(circularBitmapDrawable);
                        }
                    });

        }
            authorTextView.setText(message.getName());

            return convertView;

    }
}

