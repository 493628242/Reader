package com.gray.reader;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

/**
 * @author wjy on 2018/4/4.
 */
class ReadTextView extends TextView {
    public ReadTextView(Context context) {
        super(context);
    }

    public ReadTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ReadTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setText(String s) {
        int height = getHeight();
        int width = getWidth();

        super.setText(height + "==" + width);
    }
}
