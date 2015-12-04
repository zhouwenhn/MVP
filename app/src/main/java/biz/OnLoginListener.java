package biz;

import android.os.Bundle;

/**
 * Created by zw on 2015/10/31.
 */
public interface OnLoginListener {

    void loginSuccess(Bundle bundle);

    void loginFailed(int errorCode);
}
