package model.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by zw on 2015/10/31.
 */
public class UserInfo implements Parcelable{
    private String userName;

    private String passWord;

    protected UserInfo(Parcel in) {
        userName = in.readString();
        passWord = in.readString();
    }

    public static final Creator<UserInfo> CREATOR = new Creator<UserInfo>() {
        @Override
        public UserInfo createFromParcel(Parcel in) {
            return new UserInfo(in);
        }

        @Override
        public UserInfo[] newArray(int size) {
            return new UserInfo[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(userName);
        dest.writeString(passWord);
    }
}
