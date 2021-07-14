package com.crowdin.platform.widget

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

/**
 * @author : naiyu
 * date : 2021/7/14
 * e-mail: hnaiyu@gmail.com
 * description: 目前发现Crowdin Android sdk 跑马灯效果的一个bug，
 * 即当在代码中动态修改textview的值之后，跑马灯变成省略号了
 * https://github.com/crowdin/mobile-sdk-android/issues/139
 **/
class CrowdinMarqueeTextView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr) {

    override fun isSelected(): Boolean = true
}