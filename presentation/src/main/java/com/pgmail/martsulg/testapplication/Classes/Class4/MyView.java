package com.pgmail.martsulg.testapplication.Classes.Class4;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;

import com.pgmail.martsulg.testapplication.R;

/**
 * Created by lenovo on 31.07.2017.
 */

public class MyView extends View {

    int cx;
    int cy;
    private Paint myPan = new Paint();
    private RectF arcRectf = new RectF();



    public MyView(Context context) {
        super(context);
        initialize();
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initialize();
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initialize();
    }

    private void initialize(){

        myPan.setAntiAlias(true);
        int color = ContextCompat.getColor(getContext(), R.color.DZ_NOTreadyColor);
        myPan.setColor(color);
        myPan.setStyle(Paint.Style.STROKE);

        Resources r = getResources();
        float strokeWidthInPx = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                2, r.getDisplayMetrics());
        myPan.setStrokeWidth(strokeWidthInPx);

    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }



    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        arcRectf.left = getWidth()/6;
        arcRectf.top = getHeight()/5;
        arcRectf.right = getWidth()*5/6;
        arcRectf.bottom = getHeight()*4/5;

        canvas.drawCircle(cx,cy,getWidth()/3,myPan);

        canvas.drawLine(20,20,getWidth()-20,getHeight()-20,myPan);

        canvas.drawArc(arcRectf,0,90,true,myPan);
        canvas.drawRect(100,100,200,200,myPan);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        if(event.getAction() == MotionEvent.ACTION_MOVE) {
            cx = (int) event.getX();
            cy = (int) event.getY();
            invalidate();
        }


            return true;

    }
}
