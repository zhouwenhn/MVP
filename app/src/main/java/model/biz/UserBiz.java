package model.biz;

import android.os.Bundle;

/**
 * Created by zw on 2015/10/31.
 */
public class UserBiz implements IUserAble {

    public UserBiz(){
    }
    @Override
    public void login(String userName, String passWord, final OnLoginListener userListener) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                if (true){
                    userListener.loginSuccess(new Bundle());
                } else {
                    userListener.loginFailed(-1);
                }
            }
        }).start();
    }
}
