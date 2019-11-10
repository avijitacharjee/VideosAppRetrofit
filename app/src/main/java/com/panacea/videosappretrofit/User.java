package com.panacea.videosappretrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by DELL on 11/10/2019.
 */

public class User {
    @SerializedName("Id")
    private String id;

    @SerializedName("name")
    private String name;

    @SerializedName("email")
    private String email;

    @SerializedName("password")
    private String password;

    public String getId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public String getEmail()
    {
        return this.email;
    }
    public String getPassword()
    {
        return this.password;
    }


}
