package tech.liujin.scaleimagelib;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

public class PagerActivity extends AppCompatActivity {

      private FrameLayout mContainer;

      public static void start ( Context context ) {

            Intent starter = new Intent( context, PagerActivity.class );
            context.startActivity( starter );
      }

      @Override
      protected void onCreate ( Bundle savedInstanceState ) {

            super.onCreate( savedInstanceState );
            setContentView( R.layout.activity_pager );
            initView();
      }

      private void initView ( ) {

            mContainer = findViewById( R.id.container );
            getSupportFragmentManager().beginTransaction()
                                       .replace( R.id.container, ScalePagerFragment.newInstance() )
                                       .commit();
      }
}
