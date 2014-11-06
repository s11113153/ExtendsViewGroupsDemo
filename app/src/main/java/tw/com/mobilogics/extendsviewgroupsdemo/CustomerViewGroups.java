package tw.com.mobilogics.extendsviewgroupsdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/**
 * Created by xuyouren on 14/11/6.
 */

public class CustomerViewGroups extends ViewGroup {

  public CustomerViewGroups(Context context, AttributeSet attrs) {
    super(context, attrs);
  }


  @Override
  protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
  }

  @Override
  protected void onLayout(boolean changed, int l, int t, int r, int b) {

  }
}
