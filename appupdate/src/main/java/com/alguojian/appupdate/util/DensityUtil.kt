package com.alguojian.appupdate.util

import android.content.Context



class DensityUtil {
    companion object {
        fun dip2px(context: Context, dpValue: Float): Float {
            val scale = context.resources.displayMetrics.density
            return dpValue * scale + 0.5f
        }
    }
}