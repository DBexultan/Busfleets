package com.example.busf

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_main.*

data class Movie(val title: String, val year: Int, val image: String)

class MainFragment : Fragment() {

    private val nicCageMovies = listOf(
        timetable("Aida", 5678),
        timetable("Ahmed, 3453),
        timetable("Eraxyl", 3452),
        timetable("Batyr", 2345),
        timetable("Maulen", 3453),
        timetable("Tolik", 2434)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_main, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list_recycler_view.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = ListAdapter(nicCageMovies)
        }
    }

    companion object {
        fun newInstance(): MainFragment = MainFragment()
    }
}