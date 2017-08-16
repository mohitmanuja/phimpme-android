package org.fossasia.phimpme.leafpic.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.fossasia.phimpme.R;
import org.fossasia.phimpme.leafpic.data.Media;

import java.util.ArrayList;

/**
 * Created by dnld on 18/02/16.
 */

public class MediaPagerAdapter extends PagerAdapter {

    private ArrayList<Media> media;
    private Context context;


    public MediaPagerAdapter(ArrayList<Media> media, Context context) {
        this.media = media;
        this.context =context;
    }




    @Override public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater)  context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View imageLayout =  layoutInflater.inflate(R.layout.item_pager_image, null);
/*        ImageView imageView = (ImageView) imageLayout.findViewById(R.id.image_view);
        imageView.setImageURI(media.get(position).getUri());*/
        container.addView(imageLayout, 0);
        return imageLayout;

    }


    @Override public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
        container.removeView((View) object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }


    @Override public int getItemPosition(Object object) {
        return PagerAdapter.POSITION_NONE;
    }

    @Override public int getCount() {
        return media.size();
    }
}