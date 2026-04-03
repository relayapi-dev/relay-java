// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.inbox.comments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommentListResponseTest {

    @Test
    fun create() {
        val commentListResponse =
            CommentListResponse.builder()
                .addData(
                    CommentListResponse.Data.builder()
                        .id("id")
                        .authorName("author_name")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .platform(CommentListResponse.Data.Platform.TWITTER)
                        .text("text")
                        .accountAvatarUrl("account_avatar_url")
                        .accountId("account_id")
                        .authorAvatar("author_avatar")
                        .hidden(true)
                        .likes(0.0)
                        .parentId("parent_id")
                        .postId("post_id")
                        .postPlatformUrl("post_platform_url")
                        .postText("post_text")
                        .postThumbnailUrl("post_thumbnail_url")
                        .repliesCount(0.0)
                        .build()
                )
                .hasMore(true)
                .nextCursor("next_cursor")
                .platform(CommentListResponse.Platform.TWITTER)
                .postId("post_id")
                .build()

        assertThat(commentListResponse.data())
            .containsExactly(
                CommentListResponse.Data.builder()
                    .id("id")
                    .authorName("author_name")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .platform(CommentListResponse.Data.Platform.TWITTER)
                    .text("text")
                    .accountAvatarUrl("account_avatar_url")
                    .accountId("account_id")
                    .authorAvatar("author_avatar")
                    .hidden(true)
                    .likes(0.0)
                    .parentId("parent_id")
                    .postId("post_id")
                    .postPlatformUrl("post_platform_url")
                    .postText("post_text")
                    .postThumbnailUrl("post_thumbnail_url")
                    .repliesCount(0.0)
                    .build()
            )
        assertThat(commentListResponse.hasMore()).contains(true)
        assertThat(commentListResponse.nextCursor()).contains("next_cursor")
        assertThat(commentListResponse.platform()).contains(CommentListResponse.Platform.TWITTER)
        assertThat(commentListResponse.postId()).contains("post_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val commentListResponse =
            CommentListResponse.builder()
                .addData(
                    CommentListResponse.Data.builder()
                        .id("id")
                        .authorName("author_name")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .platform(CommentListResponse.Data.Platform.TWITTER)
                        .text("text")
                        .accountAvatarUrl("account_avatar_url")
                        .accountId("account_id")
                        .authorAvatar("author_avatar")
                        .hidden(true)
                        .likes(0.0)
                        .parentId("parent_id")
                        .postId("post_id")
                        .postPlatformUrl("post_platform_url")
                        .postText("post_text")
                        .postThumbnailUrl("post_thumbnail_url")
                        .repliesCount(0.0)
                        .build()
                )
                .hasMore(true)
                .nextCursor("next_cursor")
                .platform(CommentListResponse.Platform.TWITTER)
                .postId("post_id")
                .build()

        val roundtrippedCommentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(commentListResponse),
                jacksonTypeRef<CommentListResponse>(),
            )

        assertThat(roundtrippedCommentListResponse).isEqualTo(commentListResponse)
    }
}
