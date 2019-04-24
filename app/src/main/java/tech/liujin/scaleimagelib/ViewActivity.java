package tech.liujin.scaleimagelib;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import tech.liujin.widget.ScaleImageView;

public class ViewActivity extends AppCompatActivity implements OnClickListener {

      private ScaleImageView mScaleImage;
      private Button         mReset;

      public static void start ( Context context ) {

            Intent starter = new Intent( context, ViewActivity.class );
            context.startActivity( starter );
      }

      @Override
      protected void onCreate ( Bundle savedInstanceState ) {

            super.onCreate( savedInstanceState );
            setContentView( R.layout.activity_view );
            initView();
      }

      private void initView ( ) {

            mScaleImage = (ScaleImageView) findViewById( R.id.scaleImage );
            mReset = (Button) findViewById( R.id.reset );
            mReset.setOnClickListener( this );
      }

      @Override
      public void onClick ( View v ) {

            switch( v.getId() ) {
                  case R.id.reset:
                        mScaleImage.reset();
                        break;
                  default:
                        break;
            }
      }
}
