package tw.com.mobilogics.extendsviewgroupsdemo;

import org.w3c.dom.Text;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by xuyouren on 14/11/6.
 */

public class CustomerViewGroups extends ViewGroup {
  private final String TAG = CustomerViewGroups.class.getSimpleName();

  private View mView;
  private int mIndex;

  public CustomerViewGroups(Context context, AttributeSet attrs) {
    super(context, attrs);
    mIndex = 0;
  }

  @Override
  protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);

  }

  @Override
  protected void onLayout(boolean changed, int l, int t, int r, int b) {
    mView = getChildAt(0);
    mView.measure(0,0);

    Log.e(TAG, "width = " + mView.getWidth());
    Log.e(TAG, "mwidth = " + mView.getMeasuredWidth());

    Log.e(TAG, "height = " + mView.getHeight());
    Log.e(TAG, "mheight = " + mView.getMeasuredHeight());

    ((TextView)mView).setTextSize(180);
     mView.layout(l, t, r, b);

    // Do nothing, is only call measure Method to calculate View Height, Width
    mView.measure(0,0);
  }

  @Override
  protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);

//    Log.e(TAG, "width = " + mView.getWidth());
//    Log.e(TAG, "mwidth = " + mView.getMeasuredWidth());
//
//    Log.e(TAG, "height = " + mView.getHeight());
//    Log.e(TAG, "mheight = " + mView.getMeasuredHeight());

    /**
     * 總結
     * getWidth, getHeight
     *    得到的是view在父Layout中布局好后的宽度值，如果没有父布局，那么默认的父布局就是真个屏幕。
     *    根據 layout(l,t,r,b) 去調整在父Layout 位置
     *
     * getMeasuredWidth, getMeasureHeight
     *    得到的是某个View想要在parent view里面占的大小
     *
     *    Log result
     *    width 0 => 900
     *    mwidth 222 => 2859
     *    height 0 => 450
     *    mheight 57 = > 718
     */
  }
}
