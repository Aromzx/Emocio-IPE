package com.example.app2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.app2.fragmentAlumnoAula.cursosAlumnoFragment;
import com.example.app2.fragmentAlumnoAula.planesFragment;
import com.example.app2.fragmentAlumnoAula.logrosAlumnoFragment;
import com.example.app2.fragmentAlumnoAula.perfilAlumnoFragment;

public class MyViewPagerAdapterAlumno extends FragmentStateAdapter {

    public MyViewPagerAdapterAlumno(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new cursosAlumnoFragment();
            case 1:
                return new logrosAlumnoFragment();
            case 2:
                return new planesFragment();
            case 3:
                return new perfilAlumnoFragment();
            default:
                return new cursosAlumnoFragment();
        }
    }
    @Override
    public int getItemCount() {
        return 4;
    }
}
