package com.nokia.krisk.testtab;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentActivity extends Fragment{
    public CharSequence floor_name;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        Intent intent = new Intent(getActivity(), BuildingPlansTileViewActivity.class );
        startActivity( intent );

        //Intent intent = new Intent(this, BuildingPlansTileViewActivity.class );
        // startActivity( intent );
           /*
            Intent intent = new Intent( MainActivity.this, BuildingPlansTileViewActivity.class );

            startActivity( intent );
           */
            /*
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
            */
        return rootView;
    }
}
