package tw.com.mobilogics.extendsviewgroupsdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;

/**
 * Created by xuyouren on 14/11/6.
 */

public class CustomerViewGroups extends ViewGroup {
  private final String TAG = CustomerViewGroups.class.getSimpleName();
  private final int LOG_D = 0;
  private final int LOG_I = 1;
  private final int LOG_E = 2;

  private int mMeasureHeight, mHeight;
  private int mMeasureWidth, mWidth;

  public CustomerViewGroups(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  @Override
  protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    mMeasureHeight = getMeasuredHeight();
    mHeight = getHeight();
    mMeasureWidth = getMeasuredWidth();
    mWidth = getWidth();
  }

  @Override
  protected void onLayout(boolean changed, int l, int t, int r, int b) {
    LogPrintln(LOG_E, "mH = " + mMeasureHeight);
    LogPrintln(LOG_E, "H = " + mHeight);
    LogPrintln(LOG_E, "mW = " + mMeasureWidth);
    LogPrintln(LOG_E, "W = " + mWidth);
  }


  void LogPrintln(int level, String msg) {
    switch (level) {
      case LOG_D :
        Log.d(TAG, msg);
        break;
      case LOG_E :
        Log.e(TAG, msg);
        break;
      case LOG_I :
        Log.i(TAG, msg);
        break;
    }
  }

}
