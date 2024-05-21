package com.dd2d.achi

import android.content.Context
import android.view.ViewGroup
import android.widget.TextView

object ViewBuilder{
    fun textOf(context: Context, scope: ViewBuilderScope.()->Unit): TextView{
        val builder = ViewBuilderScope().apply(scope)
        return TextView(context).apply {
            layoutParams = ViewGroup.LayoutParams(builder.width, builder.height)
            text = "임시"
            gravity = builder.gravity
            setBackgroundColor(builder.backgroundColor)
            setPadding(builder.leftPadding, builder.topPadding, builder.rightPadding, builder.bottomPadding)
        }
    }
}