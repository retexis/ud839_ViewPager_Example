package com.example.android.viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by matev on 2018. 02. 06..
 */

public class DayFragment extends Fragment {

    private TextView dayTextView;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_day, container, false);
        dayTextView = (TextView) view.findViewById(R.id.day_textView);
        dayTextView.setText(getDayNameTextResId());
        return view;
    }

    public static DayFragment newInstance(int dayNameTextResId) {
        DayFragment f = new DayFragment();

        Bundle args = new Bundle();
        args.putInt("dayNameTextResId", dayNameTextResId);
        f.setArguments(args);

        return f;
    }

    public int getDayNameTextResId() {
        return getArguments().getInt("dayNameTextResId", R.string.monday);
    }
}
