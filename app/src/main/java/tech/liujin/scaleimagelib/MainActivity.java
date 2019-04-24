package tech.liujin.scaleimagelib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

      private FrameLayout mContainer;

      @Override
      protected void onCreate ( Bundle savedInstanceState ) {

            super.onCreate( savedInstanceState );
            setContentView( R.layout.activity_main );
            initView();
      }

      private void initView ( ) {

            mContainer = findViewById( R.id.container );
            getSupportFragmentManager().beginTransaction()
                                       .replace( R.id.container, ScalePagerFragment.newInstance() )
                                       .commit();
      }
}
