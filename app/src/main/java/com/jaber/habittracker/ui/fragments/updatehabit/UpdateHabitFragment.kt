package com.jaber.habittracker.ui.fragments.updatehabit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jaber.habittracker.R
import com.jaber.habittracker.databinding.FragmentCreateHabitBinding
import com.jaber.habittracker.databinding.FragmentUpdateHabitBinding


class UpdateHabitFragment : Fragment() {
  private lateinit var habitUpdateBinding: FragmentUpdateHabitBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        habitUpdateBinding = FragmentUpdateHabitBinding.inflate(layoutInflater)



        return habitUpdateBinding.root
    }

}