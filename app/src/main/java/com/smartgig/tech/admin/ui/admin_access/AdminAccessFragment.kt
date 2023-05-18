package com.smartgig.tech.admin.ui.admin_access

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.smartgig.tech.R
import com.smartgig.tech.databinding.FragmentAddEmployeeBinding
import com.smartgig.tech.databinding.FragmentAdminAccessBinding


class AdminAccessFragment : Fragment() {

    private lateinit var binding: FragmentAdminAccessBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAdminAccessBinding.inflate(inflater,container,false)
        return binding.root
    }


    }
