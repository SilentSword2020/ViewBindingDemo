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
 * 官方资料：
 * https://mp.weixin.qq.com/s/TDlE-YkiUN6TDU8MRYf4cw
 * https://zhuanlan.zhihu.com/p/88762604
 *
 *  <!--tools:viewBindingIgnore="true" :
 *  在生成 binding class 时忽略某个布局文件, 在该布局文件的根元素添加, 如：main_fragment2.xml-->
 *
 *
 *  请注意，视图绑定生成的真正的 bind 方法要来的更长，
 *  并且其中使用了一个标记 break 语句来优化字节码，
 *  您可以查看 Jake Wharton 撰写的这篇文章来了解更多优化有关的内容。
 *  在每个绑定对象中，都会暴露三个静态方法来创建绑定对象实例，下
 *  面是每个方法使用场景的简要说明:
 *  inflate(inflater) -- 在例如 Activity onCreate 方法里，这类没有父视图需要被传入的场合使用
 *
 *  inflate(inflater, parent, attachToParent) -- 在 Fragment 或 RecyclerView Adapter (或者说 ViewHolder 中) ，这类您需要传递父级 ViewGroup 给绑定对象时使用。
 *
 *  bind(rootView) -- 在您已经获得对应视图，并且只想通过视图绑定来避免使用 findViewById 时使用。这个方法在使用视图绑定改造和重构现有代码时非常有用。
 */
class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private val viewModel: MainViewModel by viewModels()

    private lateinit var binding: MainFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = MainFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        //
        binding.message1.text = "message 111"

        //
        binding.message2.text = "message 222"

        binding.vTestContain.tvTest.text = "TEST MODIFY"
    }

}
