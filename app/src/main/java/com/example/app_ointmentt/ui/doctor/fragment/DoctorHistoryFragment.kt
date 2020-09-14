package com.example.app_ointmentt.ui.doctor.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.app_ointmentt.IHomepage
import com.example.app_ointmentt.R
import com.example.app_ointmentt.adaptersNew.HistoryAdapter
import com.example.app_ointmentt.dataset.HistoryRawData
import kotlinx.android.synthetic.main.fragment_doctor_history.view.*

class DoctorHistoryFragment : Fragment() {
    private lateinit var historyAdapter: HistoryAdapter
    private lateinit var iHomeFragment: IHomepage

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        iHomeFragment.setToolbarTitle("History")
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_doctor_history,container,false)
        initRecyclerView(rootView)
        return rootView
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        iHomeFragment = activity as IHomepage
    }

    private fun initRecyclerView(rootView: View){
    }
}