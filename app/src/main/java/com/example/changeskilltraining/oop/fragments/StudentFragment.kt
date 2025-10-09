package com.example.changeskilltraining.oop.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.changeskilltraining.R
import com.example.changeskilltraining.oop.interfaces.IOnCall

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [StudentFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class StudentFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var item: String? = null
    private var param2: String? = null
    lateinit var tvTitle: TextView
    lateinit var btnClose: Button
    private var onCallFragment: IOnCall? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            item = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_student, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Initialize your views here
        tvTitle = view.findViewById(R.id.tv_item)
        btnClose = view.findViewById(R.id.btn_close)

        tvTitle.apply {
            text = item
        }

        btnClose.setOnClickListener {
            Log.e("TeacherDetailsFragment-StudentFragment","on close" )
            onCallFragment?.popFragment()
        }
    }

    override fun onPause() {
        super.onPause()
        Log.e("TeacherDetailsFragment-StudentFragment","onPause" )
    }

    override fun onResume() {
        super.onResume()
        Log.e("TeacherDetailsFragment-StudentFragment","onResume" )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("TeacherDetailsFragment-StudentFragment","onDestroy" )
    }

    fun setOnCallFragment(onCall: IOnCall?) {
        this.onCallFragment = onCall
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment StudentFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            StudentFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}