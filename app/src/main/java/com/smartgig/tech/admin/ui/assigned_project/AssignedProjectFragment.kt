package com.smartgig.tech.admin.ui.assigned_project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.smartgig.tech.R
import com.smartgig.tech.databinding.FragmentAssignedProjectBinding


class AssignedProjectFragment : Fragment() {

    private lateinit var binding:FragmentAssignedProjectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAssignedProjectBinding.inflate(inflater,container,false)
        return binding.root
    }


}