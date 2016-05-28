package view;

import android.os.Bundle;

/**
 * Created by zw on 2015/10/31.
 */
public interface IViewAble extends BaseView{

    String getUserName();

    String getPassWord();

    void switchToPage(Bundle bundle);
}
