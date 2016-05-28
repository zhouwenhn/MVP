package presenter;

import android.os.Bundle;

import model.biz.OnLoginListener;
import model.biz.UserBiz;
import view.IViewAble;

/**
 * Created by zw on 2015/10/31.
 */
public class UserPresenter extends BasePresenter<IViewAble> implements OnLoginListener {

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
        if (mViewCallBack != null){
            mViewCallBack.hideLoadView();
            mViewCallBack.switchToPage(bundle);
            mViewCallBack.success(bundle);
        }
    }

    @Override
    public void loginFailed(int errorCode) {
        if(mViewCallBack != null){
            mViewCallBack.hideLoadView();
            mViewCallBack.failed(errorCode);
        }
    }

    @Override
    public void onAttach() {
        
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onCreateView() {

    }

    @Override
    public void onActivityCreated() {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onDestroyView() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void onDetach() {
        // TODO: 2016/5/28 销毁，防止内存泄露 
        mViewCallBack = null;
    }
}
