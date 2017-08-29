package kr.co.tjeit.socialloginpractice;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by tjoeun on 2017-08-29.
 */

public abstract class BaseActivity  extends AppCompatActivity{


    Context mContext = this;

    public abstract  void setupEvent();
    public abstract  void setValues();
    public abstract  void bindViews();


}
