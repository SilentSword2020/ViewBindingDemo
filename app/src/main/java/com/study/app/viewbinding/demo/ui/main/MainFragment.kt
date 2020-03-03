package com.study.app.viewbinding.demo.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.study.app.viewbinding.demo.databinding.MainFragmentBinding

/**
 * View Binding 的使用
 *
 * https://zhuanlan.zhihu.com/p/88762604
 *
 *  <!--tools:viewBindingIgnore="true" :
 *  在生成 binding class 时忽略某个布局文件, 在该布局文件的根元素添加, 如：main_fragment2.xml-->
 */
class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private val viewModel: MainViewModel by viewModels()

    private lateinit var binding: MainFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = MainFragmentBinding.inflate(inflater)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        //
        binding.message1.text = "message 111"

        //
        binding.message2.text = "message 222"
    }

}
