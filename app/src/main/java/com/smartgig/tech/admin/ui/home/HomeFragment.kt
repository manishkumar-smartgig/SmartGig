package com.smartgig.tech.admin.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.smartgig.tech.R
import com.smartgig.tech.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        val homeViewModel =
//            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.addEmployeeCardView.setOnClickListener {
            findNavController().navigate(R.id.action_nav_home_to_addEmployeeFragment)
        }

        binding.assignedProjCardView.setOnClickListener {
            findNavController().navigate(R.id.action_nav_home_to_assignedProjectFragment)

        }

        binding.adminAccessCardView.setOnClickListener {
            findNavController().navigate(R.id.action_nav_home_to_adminAccessFragment)

        }
    }




    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}