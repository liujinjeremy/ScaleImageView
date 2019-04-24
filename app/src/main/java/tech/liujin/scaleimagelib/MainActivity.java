package tech.liujin.scaleimagelib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener {

      private Button mButton;
      private Button mButton2;

      @Override
      protected void onCreate ( Bundle savedInstanceState ) {

            super.onCreate( savedInstanceState );
            setContentView( R.layout.activity_main );
            initView();
      }

      private void initView ( ) {

            mButton = (Button) findViewById( R.id.button );
            mButton.setOnClickListener( this );
            mButton2 = (Button) findViewById( R.id.button2 );
            mButton2.setOnClickListener( this );
      }

      @Override
      public void onClick ( View v ) {

            switch( v.getId() ) {
                  case R.id.button:
                        ViewActivity.start( this );
                        break;
                  case R.id.button2:
                        PagerActivity.start( this );
                        break;
                  default:
                        break;
            }
      }
}
