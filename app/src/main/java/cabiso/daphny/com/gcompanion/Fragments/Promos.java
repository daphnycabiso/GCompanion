package cabiso.daphny.com.gcompanion.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import cabiso.daphny.com.gcompanion.R;

/**
 * Created by Lenovo on 7/9/2017.
 */

public class Promos extends Fragment {

    private FrameLayout first;

    public Promos() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_promos, container, false);

        first = (FrameLayout)view.findViewById(R.id.promoLayout1);


        FragmentManager fm = getFragmentManager();
        FragmentTransaction one = fm.beginTransaction();
        one.add(R.id.promoLayout1, new Promo1());
        one.commit();


        return view;


    }
}
