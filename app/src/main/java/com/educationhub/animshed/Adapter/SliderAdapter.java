package com.educationhub.animshed.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

import com.educationhub.animshed.R;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    int image[]={
            R.drawable.question_mark_,
            R.drawable.helper,
            R.drawable.ngo_animal,
            R.drawable.placeicon,
            R.drawable.animal_injury
    };

    int title[]={
            R.string.how_it_works,
            R.string.Helper,
            R.string.ngo,
            R.string.location,
            R.string.Injured

    };

    int descriptions[]={
            R.string.how_it_works_description,
            R.string.helper,
            R.string.animal_welfare_ngo,
            R.string.location_of_injured_animal,
            R.string.injured_animal

    };

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (ConstraintLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.onboarding_slider, container, false);

        //hooks


        ImageView imageView = view.findViewById(R.id.imageView);
        TextView heading = view.findViewById(R.id.sliderHeading);
        TextView description = view.findViewById(R.id.sliderDescription);

        imageView.setImageResource(image[position]);
        heading.setText(title[position]);
        description.setText(descriptions[position]);
        container.addView(view);
        return view;
    }
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout)object);
    }
}
