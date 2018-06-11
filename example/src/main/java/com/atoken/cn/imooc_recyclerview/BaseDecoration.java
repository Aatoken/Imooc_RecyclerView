package com.atoken.cn.imooc_recyclerview;

import android.support.annotation.ColorInt;

import com.choices.divider.DividerItemDecoration;



public class BaseDecoration extends DividerItemDecoration {

    private BaseDecoration()
    {}

    private BaseDecoration(@ColorInt int color, int size) {
        setDividerLookup(new DividerLookupImpl(color,size));
    }

    public static BaseDecoration create(@ColorInt int color, int size)
    {
        return new BaseDecoration(color,size);
    }


}
