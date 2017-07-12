package org.social_network;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;


public class TimeLineTest {

    private static final String TIME = LocalDateTime.now().toString();
    private Post post;
    private TimeLine timeLine;

    @Before
    public void setUp() throws Exception {
        post = new Post("Alice", "Hi", TIME);
        timeLine = new TimeLine();
    }

    @Test
    public void testUserCanPostMessages() throws Exception {
        assertThat( timeLine.postMessage(post)).isEqualTo("<Alice> Hi   "+ TIME);
    }

    @Test
    public void testUserCanReadPost() throws Exception {
        timeLine.postMessage(post);

        Post newPost = new Post("Bob", "Hello Alice",TIME);
        timeLine.postMessage(newPost);

        assertThat(timeLine.readPost()).isEqualTo(Arrays.asList(post,newPost));
    }
}
