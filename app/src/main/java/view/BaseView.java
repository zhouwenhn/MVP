package view;

import android.os.Bundle;

/**
 * Created by zw on 2016/5/28.
 */
public interface BaseView {

    void success(Bundle bundle);

    void failed(int errorCode);

    void showLoadView();

    void hideLoadView();
}
