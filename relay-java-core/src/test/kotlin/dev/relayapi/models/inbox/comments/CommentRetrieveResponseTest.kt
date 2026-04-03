// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.inbox.comments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommentRetrieveResponseTest {

    @Test
    fun create() {
        val commentRetrieveResponse =
            CommentRetrieveResponse.builder()
                .addData(
                    CommentRetrieveResponse.Data.builder()
                        .id("id")
                        .authorName("author_name")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .platform(CommentRetrieveResponse.Data.Platform.TWITTER)
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
                .platform(CommentRetrieveResponse.Platform.TWITTER)
                .postId("post_id")
                .build()

        assertThat(commentRetrieveResponse.data())
            .containsExactly(
                CommentRetrieveResponse.Data.builder()
                    .id("id")
                    .authorName("author_name")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .platform(CommentRetrieveResponse.Data.Platform.TWITTER)
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
        assertThat(commentRetrieveResponse.hasMore()).contains(true)
        assertThat(commentRetrieveResponse.nextCursor()).contains("next_cursor")
        assertThat(commentRetrieveResponse.platform())
            .contains(CommentRetrieveResponse.Platform.TWITTER)
        assertThat(commentRetrieveResponse.postId()).contains("post_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val commentRetrieveResponse =
            CommentRetrieveResponse.builder()
                .addData(
                    CommentRetrieveResponse.Data.builder()
                        .id("id")
                        .authorName("author_name")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .platform(CommentRetrieveResponse.Data.Platform.TWITTER)
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
                .platform(CommentRetrieveResponse.Platform.TWITTER)
                .postId("post_id")
                .build()

        val roundtrippedCommentRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(commentRetrieveResponse),
                jacksonTypeRef<CommentRetrieveResponse>(),
            )

        assertThat(roundtrippedCommentRetrieveResponse).isEqualTo(commentRetrieveResponse)
    }
}
