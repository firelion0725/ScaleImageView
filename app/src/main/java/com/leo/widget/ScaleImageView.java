package com.leo.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.util.Log;

/**
 * @author leo, ZhangWei
 * @date 2018/6/28
 */
public class ScaleImageView extends AppCompatImageView {

    private float scale = 0;

    public ScaleImageView(Context context) {
        super(context);
        initView(context, null);
    }

    public ScaleImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(context, attrs);
    }

    public ScaleImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context, attrs);
    }

    private void initView(Context context, AttributeSet attrs) {
        Log.i("ScaleImageView", "initView");
        if (attrs != null) {
            TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.ScaleImageView);
            scale = ta.getFloat(R.styleable.ScaleImageView_scale, 0);
            ta.recycle();
        }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.i("ScaleImageView", "onMeasure");
        Log.i("ScaleImageView", "widthMeasureSpec:" + widthMeasureSpec);
        Log.i("ScaleImageView", "heightMeasureSpec:" + heightMeasureSpec);

        int width = getMeasuredWidth();
        int height = getMeasuredHeight();

        Log.i("ScaleImageView", "width:" + width);
        Log.i("ScaleImageView", "height:" + height);

        float h = width * scale;

        setMeasuredDimension(width, (int) h);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);

        int width = getMeasuredWidth();
        int height = getMeasuredHeight();

        Log.i("ScaleImageView", "width2:" + width);
        Log.i("ScaleImageView", "height2t:" + height);
    }
}
