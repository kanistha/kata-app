package org.social_network;

import java.util.ArrayList;
import java.util.List;

public class TimeLine {

    private List<Post> posts;

    public TimeLine() {
        posts = new ArrayList<Post>();
    }

    public String postMessage(Post post) {
        posts.add(post);
        return formatString(post);
    }

    private String formatString(Post post) {
        return "<"+post.getUserName()+"> "+post.getMessage()+"   "+post.getTime();
    }

    public List<Post> readPost() {
        for (Post post : posts) {
            System.out.println(formatString(post));
        }
        return posts;
    }
}
