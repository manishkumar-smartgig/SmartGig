package com.smartgig.tech.admin.ui.add_employee

import android.app.DatePickerDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.smartgig.tech.R
import com.smartgig.tech.databinding.FragmentAddEmployeeBinding
import java.util.*


class AddEmployeeFragment : Fragment() {

    private lateinit var binding: FragmentAddEmployeeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAddEmployeeBinding.inflate(inflater, container, false)

        binding.etDobAddEmployee.setOnClickListener {
            showDatePickerDialog()
        }

        return binding.root
    }

    private fun showDatePickerDialog() {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            requireContext(),
            { _, selectedYear, selectedMonth, selectedDayOfMonth ->
                // Set the selected date in the EditText
                binding.etDobAddEmployee.setText(
                    String.format(
                        Locale.getDefault(),
                        "%02d/%02d/%d",
                        selectedDayOfMonth,
                        selectedMonth + 1,
                        selectedYear
                    )
                )
            },
            year,
            month,
            day
        )

        // Show the calendar dialog
        datePickerDialog.show()
    }
}



     /*   binding.etDojAddEmplyee.setOnClickListener {
            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)

            val datePickerDialog = DatePickerDialog(
                requireContext(),
                { _, selectedYear, selectedMonth, selectedDayOfMonth ->
                    // Add your code here to handle the selected date
                },
                year,
                month,
                day
            )

            // Show the calendar dialog
            datePickerDialog.show()
        }

        binding.etDomAddEmployee.setOnClickListener {
            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)

            val datePickerDialog = DatePickerDialog(
                requireContext(),
                { _, selectedYear, selectedMonth, selectedDayOfMonth ->
                    // Add your code here to handle the selected date
                },
                year,
                month,
                day
            )

            // Show the calendar dialog
            datePickerDialog.show()
        }



        binding.etLastworkingdayAddEmplyee.setOnClickListener {
            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)

            val datePickerDialog = DatePickerDialog(
                requireContext(),
                { _, selectedYear, selectedMonth, selectedDayOfMonth ->
                    // Add your code here to handle the selected date
                },
                year,
                month,
                day
            )

            // Show the calendar dialog
            datePickerDialog.show()
        }


        return binding.root
    }
}
*/