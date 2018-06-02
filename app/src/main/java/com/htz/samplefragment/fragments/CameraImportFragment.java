package com.htz.samplefragment.fragments;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.htz.samplefragment.R;

public class CameraImportFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.camera_import_fragment,container,false);

        ImageView simpleImageView = (ImageView) v.findViewById(R.id.camera_img);
        simpleImageView.setImageResource(R.drawable.camera_import);

        simpleImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(),"Camera Import",Toast.LENGTH_SHORT).show();
            }
        });
        return v;
    }
}
