package presenter;

import android.os.Bundle;

import model.biz.OnLoginListener;
import model.biz.UserBiz;
import view.IViewAble;

/**
 * Created by zw on 2015/10/31.
 */
public class UserPresenter implements OnLoginListener {

    private IViewAble mViewCallBack;

    private UserBiz mUserBiz;

    public UserPresenter(IViewAble viewCallBack){
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
