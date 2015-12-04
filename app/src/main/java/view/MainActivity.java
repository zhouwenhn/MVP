package view;

import android.app.Activity;
import android.os.Bundle;

import presenter.UserPresenter;


public class MainActivity extends Activity {
    private UserPresenter mUserPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        mUserPresenter = new UserPresenter(new IView() {

            @Override
            public void success(Bundle bundle) {

            }

            @Override
            public void failed(int errorCode) {

            }

            @Override
            public void showLoadView() {

            }

            @Override
            public void hideLoadView() {

            }

            @Override
            public String getUserName() {
                return "chowen";
            }

            @Override
            public String getPassWord() {
                return "123456";
            }

            @Override
            public void switchToPage(Bundle bundle) {

            }
        });
    }

}
