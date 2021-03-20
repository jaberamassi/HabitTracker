package com.jaber.habittracker.ui.fragments.habitList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jaber.habittracker.R
import com.jaber.habittracker.databinding.FragmentCreateHabitBinding
import com.jaber.habittracker.databinding.FragmentHabitListBinding


class HabitListFragment : Fragment() {
    private lateinit var habitListBinding: FragmentHabitListBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       habitListBinding = FragmentHabitListBinding.inflate(layoutInflater)

        return habitListBinding.root
    }

}