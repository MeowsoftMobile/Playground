package com.meowsoft.playground.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.meowsoft.playground.testLog

open class BaseFragment : Fragment() {

    private val className = javaClass.simpleName

    init {
        testLog("$className - init{}")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        testLog("$className - onAttach()")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        testLog("$className - onCreate()")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        testLog("$className - onCreateView()")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        testLog("$className - onViewCreated()")
    }

    override fun onStart() {
        super.onStart()
        testLog("$className - onStart()")
    }

    override fun onResume() {
        super.onResume()
        testLog("$className - onResume()")
    }

    override fun onStop() {
        super.onStop()
        testLog("$className - onStop()")
    }

    override fun onPause() {
        super.onPause()
        testLog("$className - onPause()")
    }

    override fun onDestroy() {
        super.onDestroy()
        testLog("$className - onDestroy()")
    }

    override fun onDetach() {
        super.onDetach()
        testLog("$className - onDetach()")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        testLog("$className - onDestroyView()")
    }
}
