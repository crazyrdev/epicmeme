package com.bocor.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

public class MyView extends View {
	public Paint mPaint;
	Paint paint;
	RectF rect;

	public MyView(Context context) {
		super(context);
		rect = new RectF(20, 20, 100, 100);

		mPaint = new Paint();
		mPaint.setAntiAlias(true);
		mPaint.setDither(true);
		mPaint.setStyle(Paint.Style.STROKE);
		mPaint.setStrokeJoin(Paint.Join.ROUND);
		mPaint.setStrokeCap(Paint.Cap.ROUND);
		mPaint.setStrokeWidth(20);
		mPaint.setShader(new LinearGradient(0.40f, 0.0f, 100.60f, 100.0f,
				Color.RED, Color.RED, Shader.TileMode.CLAMP));

		// canvas.drawOval(new RectF(50, 50, 20, 40), p)
	}

	public MyView(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		//gunakan konstruktor ini buat custom view 
		rect = new RectF(20, 20, 100, 100);

		mPaint = new Paint();
		mPaint.setAntiAlias(true);
		mPaint.setDither(true);
		mPaint.setStyle(Paint.Style.STROKE);
		mPaint.setStrokeJoin(Paint.Join.ROUND);
		mPaint.setStrokeCap(Paint.Cap.ROUND);
		mPaint.setStrokeWidth(20);
		mPaint.setShader(new LinearGradient(0.40f, 0.0f, 100.60f, 100.0f,
				Color.RED, Color.RED, Shader.TileMode.CLAMP));
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

		setMeasuredDimension(200, 200);

	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);

		canvas.drawOval(rect, mPaint);

	}
}