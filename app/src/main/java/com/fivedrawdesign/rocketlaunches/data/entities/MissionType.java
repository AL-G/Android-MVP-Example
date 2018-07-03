package com.fivedrawdesign.rocketlaunches.data.entities;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MissionType implements Parcelable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("changed")
    @Expose
    private String changed;

    public final static Creator<MissionType> CREATOR = new Creator<MissionType>() {


        @SuppressWarnings({
                "unchecked"
        })
        public MissionType createFromParcel(Parcel in) {
            return new MissionType(in);
        }

        public MissionType[] newArray(int size) {
            return (new MissionType[size]);
        }

    }
            ;

    protected MissionType(Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.changed = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public MissionType() {
    }

    /**
     *
     * @param id
     * @param name
     * @param changed
     */
    public MissionType(Integer id, String name, String changed) {
        super();
        this.id = id;
        this.name = name;
        this.changed = changed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChanged() {
        return changed;
    }

    public void setChanged(String changed) {
        this.changed = changed;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(name);
        dest.writeValue(changed);
    }

    public int describeContents() {
        return 0;
    }

}