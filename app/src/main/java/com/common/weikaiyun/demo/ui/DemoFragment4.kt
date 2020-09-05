package com.common.weikaiyun.demo.ui

import android.os.Bundle
import android.view.View
import com.common.weikaiyun.R
import com.common.weikaiyun.fragmentation.SupportFragment
import com.common.weikaiyun.fragmentation.fragmentargument.argument
import kotlinx.android.synthetic.main.fragment_demo4.*

class DemoFragment4: SupportFragment() {
    private var param1: Int by argument()
    private var param2: String by argument()
    private var param3: String by argument()
    companion object {
        fun newInstance(param1: Int, param2: String, param3: String): DemoFragment4 =
            DemoFragment4().apply {
                this.param1 = param1
                this.param2 = param2
                this.param3 = param3
            }
    }

    override fun initView(view: View, savedInstanceState: Bundle?) {
        title.text = "DemoFragment$param1"
        button.text = param2
        button.setOnClickListener {
            popTo(DemoFragment1::class.java, false)
        }

        button2.text = param3

        button2.setOnClickListener {
            startWithPopTo(DemoFragment5.newInstance(5, "test"),
                DemoFragment1::class.java, false)
        }
    }

    override fun getLayoutId(): Int = R.layout.fragment_demo4
}