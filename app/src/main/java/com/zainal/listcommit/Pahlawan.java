package com.zainal.listcommit;

import android.os.Parcel;
import android.os.Parcelable;

public class Pahlawan implements Parcelable {
    private String name;
    private String photo;
    private String discription;

    Pahlawan(Parcel in) {
        name = in.readString();
        photo = in.readString();
        discription = in.readString();
    }

    public static final Creator<Pahlawan> CREATOR = new Creator<Pahlawan>() {
        @Override
        public Pahlawan createFromParcel(Parcel in) {
            return new Pahlawan(in);
        }

        @Override
        public Pahlawan[] newArray(int size) {
            return new Pahlawan[size];
        }
    };

    public Pahlawan() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(photo);
        dest.writeString(discription);
    }
}
