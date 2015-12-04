package biz;

/**
 * Created by zw on 2015/10/31.
 */
public interface IUser {
    void login(String userName, String passWord, OnLoginListener userListener);
}
