package com.example.mini_project_1_randall_larsen;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class quiz_frag_top extends Fragment {
    private static final String[] WORDS ={"Tiger","Lion","Snow Leopard"};
    String word ="";
    View myView;
    ImageView imv;


    public quiz_frag_top() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       // String strtext = getArguments().getString("edttext");
        return inflater.inflate(R.layout.fragment_quiz_frag_top, container, false);
    }

}
