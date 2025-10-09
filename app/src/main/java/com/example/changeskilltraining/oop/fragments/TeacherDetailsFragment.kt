package com.example.changeskilltraining.oop.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.changeskilltraining.R
import com.example.changeskilltraining.oop.StudentDetails
import com.example.changeskilltraining.oop.adpters.WordItemsAdapter
import com.example.changeskilltraining.oop.interfaces.IOnCall
import com.example.changeskilltraining.oop.interfaces.IStudentCallback


class TeacherDetailsFragment : Fragment(), IStudentCallback {

    private val ARG_PARAM1 = "param1"
    private val ARG_PARAM2 = "param2"

    private var rcvItems: RecyclerView? = null
    private val list = arrayListOf("Word 1", "Word 2", "Word 3", "Word 4", "Word 5")
    private var data1: String = ""
    private var data2: String = ""
    private var onCallFragment: IOnCall? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
           data1 = it.getString(ARG_PARAM1).toString()
            data2 = it.getString(ARG_PARAM2).toString()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_teacher_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mAdapter = WordItemsAdapter()
        mAdapter.setAdapter(list,this)
        rcvItems = view.findViewById(R.id.rcv_items)
        rcvItems?.adapter = mAdapter

        Log.e("TeacherDetailsFragment","Data1: $data1, Data2: $data2" )
    }

    override fun onPause() {
        super.onPause()
        Log.e("TeacherDetailsFragment","onPause" )
    }

    override fun onStop() {
        super.onStop()
        Log.e("TeacherDetailsFragment","onStop" )
    }

    fun setOnCallFragment(onCall: IOnCall) {
        this.onCallFragment = onCall
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            TeacherDetailsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onSuccess(studentDetails: StudentDetails) {
        TODO("Not yet implemented")
    }

    override fun onError(error: String) {
        TODO("Not yet implemented")
    }

    override fun onClick(item: String) {
        Log.e("TeacherDetailsFragment","Item clicked: $item" )
        val frag = StudentFragment.newInstance(item,"Data from TeacherDetailsFragment")
        frag.setOnCallFragment(onCallFragment)
        onCallFragment?.navigateFragment(frag)
//        requireActivity().supportFragmentManager
//            .beginTransaction()
//            .add(
//            R.id.container,
//            frag,
//            "TeacherDetailsFragment")
//            .commit()

    }
}
