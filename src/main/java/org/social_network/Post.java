package org.social_network;


public class Post {

    private String userName;
    private String message;
    private String time;

    public Post(String userName, String message, String time) {

        this.userName = userName;
        this.message = message;
        this.time = time;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Post{" +
                "userName='" + userName + '\'' +
                ", message='" + message + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
