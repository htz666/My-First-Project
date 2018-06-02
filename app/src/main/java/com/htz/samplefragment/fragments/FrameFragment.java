package com.htz.samplefragment.fragments;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.htz.samplefragment.R;

public class FrameFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.frame_layout,container,false);

        ImageView simpleImageView = (ImageView) v.findViewById(R.id.frame_img);
        TextView simpleTextView = (TextView) v.findViewById(R.id.frame_txt) ;
        simpleImageView.setImageResource(R.drawable.photo);

        simpleImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(),"Frame",Toast.LENGTH_SHORT).show();
            }
        });
        return v;
    }
}
