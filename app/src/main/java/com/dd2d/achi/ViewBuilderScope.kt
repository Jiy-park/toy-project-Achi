package com.dd2d.achi

import android.content.res.Resources
import android.graphics.Color
import android.view.Gravity
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import kotlin.math.roundToInt

open class ViewBuilderScope {
    var leftPadding: Int = 0
    var topPadding: Int = 0
    var rightPadding: Int = 0
    var bottomPadding: Int = 0

    var gravity = Gravity.NO_GRAVITY

    var width: Int = WRAP_CONTENT
    var height: Int = WRAP_CONTENT

    var backgroundColor = Color.WHITE
}


val Int.dp: Int
    get() = (this * Resources.getSystem().displayMetrics.density).roundToInt()

val Float.dp: Float
    get() = this * Resources.getSystem().displayMetrics.density