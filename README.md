## 图片缩放,查看

### 引入

```
implementation 'tech.liujin:scaleImage:1.0.1'
```

![](img/1.gif)



## 使用

和正常的ImageView使用一样

```
<tech.liujin.widget.ScaleImageView
    android:id="@+id/scaleImage"
    android:layout_width="match_parent"
    android:layout_height="400dp"
    android:src="@drawable/a207"
    android:background="@color/colorAccent"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintTop_toTopOf="parent"/>
```

```
// 重置缩放
mScaleImage.reset();
```



Pager使用

```
<tech.liujin.widget.ScaleImagePager
    android:id="@+id/pager"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
</tech.liujin.widget.ScaleImagePager>
```

```
// 需要使用一个特殊的Adapter SimpleImageAdapter或者自己实现BaseImageAdapter
private class PagerAdapter extends SimpleImageAdapter {
      private Context mContext;
      public PagerAdapter ( Context context ) {
            mContext = context;
      }
      private int[] res = {
          R.drawable.a292,
          R.drawable.a207,
          R.drawable.a188
      };
      @Override
      protected Bitmap getBitmapAt ( int position ) {
            return BitmapFactory.decodeResource( mContext.getResources(), res[ position ] );
      }
      @Override
      public int getCount ( ) {
            return res.length;
      }
}
```

```
mPager.setAdapter( new PagerAdapter( getContext() ) );
```

