package fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.valen.proyectobitnext.MainActivity;
import com.example.valen.proyectobitnext.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentHome extends Fragment
{


    public FragmentHome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        final View v = inflater.inflate(R.layout.fragment_home,container,false);
        ((MainActivity)getActivity()).getSupportActionBar().setTitle("Home");
        return v;
    }

}
