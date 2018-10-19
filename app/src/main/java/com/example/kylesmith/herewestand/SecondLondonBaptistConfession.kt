package com.example.kylesmith.herewestand

import android.content.res.Resources.getSystem as res

data class SecondLondonBaptistConfession(val chapter: Int) {
    var chapters : Array<String> = res().getStringArray(R.array.second_london_baptist_confession_chapter_1)
}