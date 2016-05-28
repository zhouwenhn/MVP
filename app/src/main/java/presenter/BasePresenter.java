package presenter;

import view.BaseView;

/**
 * Created by zw on 2016/5/28.
 */
public abstract class BasePresenter<T extends BaseView> {

    /*presenter应该具有view的生命周期，防止内存泄露*/
    public abstract void onAttach();

    public abstract void onCreate();

    public abstract void onCreateView();

    public abstract void onActivityCreated();

    public abstract void onStart();

    public abstract void onResume();

    public abstract void onPause();

    public abstract void onStop();

    public abstract void onDestroyView();

    public abstract void onDestroy();

    public abstract void onDetach();
}
