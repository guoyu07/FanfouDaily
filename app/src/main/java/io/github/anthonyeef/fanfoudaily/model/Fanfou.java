package io.github.anthonyeef.fanfoudaily.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by anthonyeef on 10/13/15.
 */
public class Fanfou implements Parcelable{

    public static final Parcelable.Creator<Fanfou> CREATOR
            = new Parcelable.Creator<Fanfou>() {
        public Fanfou createFromParcel(Parcel in) {
            return new Fanfou(in);
        }

        public Fanfou[] newArray(int size) {
            return new Fanfou[size];
        }
    };

    public Fanfou(Parcel in) {
        readFromParcel(in);
    }

    public Fanfou(String screenName, String status, String avatarUrl, String imageUrl, String timeStamp) {
        super();
        this.screenName = screenName;
        this.status = status;
        this.avatarUrl = avatarUrl;
        this.imageUrl = imageUrl;
        this.timeStamp = timeStamp;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    private String screenName;
    private String status;
    private String avatarUrl;
    private String imageUrl;
    private String timeStamp;

    public Fanfou() {

    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public int describeContents() {

        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(screenName);
        dest.writeString(status);
        dest.writeString(avatarUrl);
        dest.writeString(imageUrl);
        dest.writeString(timeStamp);
    }
    private void readFromParcel(Parcel in) {
        screenName = in.readString();
        status = in.readString();
        avatarUrl = in.readString();
        imageUrl = in.readString();
        timeStamp = in.readString();
    }
}
