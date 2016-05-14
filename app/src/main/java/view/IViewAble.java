package view;

import android.os.Bundle;

/**
 * Created by zw on 2015/10/31.
 */
public interface IViewAble {

    void success(Bundle bundle);

    void failed(int errorCode);

    void showLoadView();

    void hideLoadView();

    String getUserName();

    String getPassWord();

    void switchToPage(Bundle bundle);
}
