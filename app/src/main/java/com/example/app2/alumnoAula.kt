package com.example.app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout

class alumnoAula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alumno_aula)

        val tabLayout = findViewById<TabLayout>(R.id.tlalumnoAula)
        val viewPager2 = findViewById<ViewPager2>(R.id.vp1)
        val myViewPagerAdapterAlumno = MyViewPagerAdapterAlumno(this)
        viewPager2.setAdapter(myViewPagerAdapterAlumno)

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab != null) {
                    viewPager2.setCurrentItem(tab.getPosition())
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                // Código a ejecutar cuando se desmarca una pestaña
            }


            override fun onTabReselected(tab: TabLayout.Tab?) {
                // Código a ejecutar cuando se vuelve a seleccionar la misma pestaña
            }

        })

        viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                tabLayout.getTabAt(position)?.select()
            }
        })

    }
}