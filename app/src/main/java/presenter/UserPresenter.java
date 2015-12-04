package presenter;

import android.os.Bundle;

import biz.UserBiz;
import biz.OnLoginListener;
import view.IView;

/**
 * Created by zw on 2015/10/31.
 */
public class UserPresenter implements OnLoginListener {

    private IView mViewCallBack;

    private UserBiz mUserBiz;

    public UserPresenter(IView viewCallBack){
        mViewCallBack = viewCallBack;
        mUserBiz = new UserBiz();
        mViewCallBack.showLoadView();
        mUserBiz.login(mViewCallBack.getUserName(), mViewCallBack.getPassWord(), this);
    }

    @Override
    public void loginSuccess(Bundle bundle) {
        mViewCallBack.hideLoadView();
        mViewCallBack.switchToPage(bundle);
        mViewCallBack.success(bundle);
    }

    @Override
    public void loginFailed(int errorCode) {
        mViewCallBack.hideLoadView();
        mViewCallBack.failed(errorCode);
    }
}
