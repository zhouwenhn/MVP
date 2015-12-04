package bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by zw on 2015/10/31.
 */
public class User implements Parcelable{
    private String userName;

    private String passWord;

    protected User(Parcel in) {
        userName = in.readString();
        passWord = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
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
