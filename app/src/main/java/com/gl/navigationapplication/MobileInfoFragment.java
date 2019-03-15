package com.gl.navigationapplication;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MobileInfoFragment extends Fragment {

    private TextView mModelTextView;
    private TextView mDeviceName;
    private TextView mWifiTextView;
    private TextView mInfoDeviceName;
    private TextView mDeviceBrand;
    private TextView mDeviceBootloaderName;
    private TextView mDeviceIdName;
    private TextView mDeviceHOstName;
    private TextView mDeviceVersion;
    private TextView mDeviceFingerPrintNumber;
    private TextView mDeviceHardwareName;

    public interface OnFragmentInteractionListener {
        public void onFragmentInteraction(Uri uri);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mobile_info, container, false);
        initView(view);
        getDeviceInformation();
        return view;
    }

    private void initView(View view) {
        mModelTextView = view.findViewById(R.id.modelTextView);
        mDeviceName = view.findViewById(R.id.modelDeviceName);
        mWifiTextView = view.findViewById(R.id.wifiTextView);
        mInfoDeviceName = view.findViewById(R.id.infoTextView);
        mDeviceBrand = view.findViewById(R.id.brandTextView);
        mDeviceFingerPrintNumber= view.findViewById(R.id.fingerprintTextView);
        mDeviceBootloaderName = view.findViewById(R.id.bootLoaderTextView);
        mDeviceHOstName = view.findViewById(R.id.hostTextView);
        mDeviceIdName = view.findViewById(R.id.deviceIdTextView);
        mDeviceVersion = view.findViewById(R.id.versionTextView);
        mDeviceHardwareName = view.findViewById(R.id.hardwareTextView);
    }


    private void getDeviceInformation() {
        mDeviceName.setText(Build.PRODUCT);
        mModelTextView.setText(Build.MODEL); // get model name
        mWifiTextView.setText(Build.getRadioVersion());
        mInfoDeviceName.setText(Build.DISPLAY);
        mDeviceBrand.setText(Build.BRAND);
        mDeviceBootloaderName.setText(Build.BOOTLOADER);
        mDeviceHardwareName.setText(Build.HARDWARE);
        mDeviceIdName.setText(Build.ID);
        mDeviceHOstName.setText(Build.HOST);
        mDeviceVersion.setText(Build.VERSION.RELEASE);
        mDeviceFingerPrintNumber.setText(Build.FINGERPRINT);
    }

}
