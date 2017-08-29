package kr.co.tjeit.socialloginpractice.data;

/**
 * Created by tjoeun on 2017-08-29.
 */

public class User {
    private String userId;
    private String password;
    private String name;
    private String profileURL;

    public User() {
    }



    public User(String userId, String password, String name, String profileURL) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.profileURL = profileURL;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileURL() {
        return profileURL;
    }

    public void setProfileURL(String profileURL) {
        this.profileURL = profileURL;
    }
}
