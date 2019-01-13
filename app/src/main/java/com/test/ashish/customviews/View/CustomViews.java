package com.test.ashish.customviews.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.constraint.solver.widgets.Rectangle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.test.ashish.customviews.R;

import org.jetbrains.annotations.Nullable;

public class CustomViews extends View {


    private ViewGroup.LayoutParams params;
    private Path path = new Path();
    private Paint brush = new Paint();

    public CustomViews(Context context, AttributeSet set) {
        super(context);
        brush.setAntiAlias(true);
        brush.setColor(Color.RED);
        brush.setStyle(Paint.Style.STROKE);
        brush.setStrokeJoin(Paint.Join.ROUND);
        brush.setStrokeWidth(8f);
        params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawPath(path,brush);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        float x = event.getX();
        float y = event.getY();
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                path.moveTo(x,y);
                return  true;
            case MotionEvent.ACTION_MOVE:
                path.lineTo(x,y);
                return true;

        }
        postInvalidate();
        return true;

    }
}
