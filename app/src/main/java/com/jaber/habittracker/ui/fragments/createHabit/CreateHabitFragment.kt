package com.jaber.habittracker.ui.fragments.createHabit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jaber.habittracker.databinding.FragmentCreateHabitBinding

class CreateHabitFragment : Fragment() {
    private lateinit var habitCreateBinding: FragmentCreateHabitBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        habitCreateBinding = FragmentCreateHabitBinding.inflate(layoutInflater)




        return habitCreateBinding.root
    }


}