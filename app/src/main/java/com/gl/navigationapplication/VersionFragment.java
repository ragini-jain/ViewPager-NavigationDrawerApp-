package com.gl.navigationapplication;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class VersionFragment extends Fragment {

    private TextView mVersionText;

    public interface OnFragmentInteractionListener {
        public void onFragmentInteraction(Uri uri);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_version, container, false);
        mVersionText = (TextView)view.findViewById(R.id.versionNameTextView);
        mVersionText.setText(BuildConfig.VERSION_NAME);
        return view;
    }
}
