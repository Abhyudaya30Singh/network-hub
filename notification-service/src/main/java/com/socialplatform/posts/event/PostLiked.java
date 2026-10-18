package com.socialplatform.posts.event;

import lombok.Data;

@Data
public class PostLiked {
    private Long postId;
    private Long ownerUserId;
    private Long likedByUserId;
}
