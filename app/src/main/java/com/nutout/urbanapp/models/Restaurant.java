package com.nutout.urbanapp.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Restaurant implements Parcelable {
    public static final String RESTAURANT_KEY = "RESTAURANT";
    public String m_Name;
    public String m_Address;
    public ArrayList<MenuItem> m_Menu;

    public Restaurant(){

    }
    public Restaurant(String name, String address){
        m_Name = name;
        m_Address = address;
        m_Menu = new ArrayList<MenuItem>();
    }

    public String getName(){
        return m_Name;
    }

    public String getAddress(){
        return m_Address;
    }

    public ArrayList<MenuItem> getMenu(){
        return m_Menu;
    }

    public void addItem(MenuItem menuItem){
        this.m_Menu.add(menuItem);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    protected Restaurant(Parcel in){
        m_Name = in.readString();
        m_Address = in.readString();
        m_Menu = new ArrayList<>();
        in.readTypedList(m_Menu, MenuItem.CREATOR);
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(m_Name);
        dest.writeString(m_Address);
        dest.writeTypedList(m_Menu);
    }

    public static final Parcelable.Creator<Restaurant> CREATOR = new Parcelable.Creator<Restaurant>(){

        @Override
        public Restaurant createFromParcel(Parcel source) {
            return new Restaurant(source);
        }

        @Override
        public Restaurant[] newArray(int size) {
            return new Restaurant[size];
        }
    };

    public String toString(){
        return getName();
    }
}
