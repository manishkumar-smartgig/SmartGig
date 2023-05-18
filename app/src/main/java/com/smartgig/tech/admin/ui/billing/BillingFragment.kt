package com.smartgig.tech.admin.ui.billing

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.smartgig.tech.R
import com.smartgig.tech.databinding.FragmentAssignedProjectBinding
import com.smartgig.tech.databinding.FragmentBillingBinding


class BillingFragment : Fragment() {

    private lateinit var binding: FragmentBillingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBillingBinding.inflate(inflater,container,false)
        return inflater.inflate(R.layout.fragment_billing, container, false)
    }


    }
