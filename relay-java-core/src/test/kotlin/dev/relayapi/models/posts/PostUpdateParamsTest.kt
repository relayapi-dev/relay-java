// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.posts

import dev.relayapi.core.JsonValue
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostUpdateParamsTest {

    @Test
    fun create() {
        PostUpdateParams.builder()
            .id("id")
            .content("content")
            .addMedia(
                PostUpdateParams.Media.builder()
                    .url("https://example.com")
                    .type(PostUpdateParams.Media.Type.IMAGE)
                    .build()
            )
            .notes("notes")
            .recycling(
                PostUpdateParams.Recycling.builder()
                    .gap(1L)
                    .gapFreq(PostUpdateParams.Recycling.GapFreq.DAY)
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addContentVariation("string")
                    .enabled(true)
                    .expireCount(1L)
                    .expireDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .scheduledAt("now")
            .targetOptions(
                PostUpdateParams.TargetOptions.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
            .addTarget("string")
            .timezone("timezone")
            .build()
    }

    @Test
    fun pathParams() {
        val params = PostUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PostUpdateParams.builder()
                .id("id")
                .content("content")
                .addMedia(
                    PostUpdateParams.Media.builder()
                        .url("https://example.com")
                        .type(PostUpdateParams.Media.Type.IMAGE)
                        .build()
                )
                .notes("notes")
                .recycling(
                    PostUpdateParams.Recycling.builder()
                        .gap(1L)
                        .gapFreq(PostUpdateParams.Recycling.GapFreq.DAY)
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addContentVariation("string")
                        .enabled(true)
                        .expireCount(1L)
                        .expireDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .scheduledAt("now")
                .targetOptions(
                    PostUpdateParams.TargetOptions.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .addTarget("string")
                .timezone("timezone")
                .build()

        val body = params._body()

        assertThat(body.content()).contains("content")
        assertThat(body.media().getOrNull())
            .containsExactly(
                PostUpdateParams.Media.builder()
                    .url("https://example.com")
                    .type(PostUpdateParams.Media.Type.IMAGE)
                    .build()
            )
        assertThat(body.notes()).contains("notes")
        assertThat(body.recycling())
            .contains(
                PostUpdateParams.Recycling.builder()
                    .gap(1L)
                    .gapFreq(PostUpdateParams.Recycling.GapFreq.DAY)
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addContentVariation("string")
                    .enabled(true)
                    .expireCount(1L)
                    .expireDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(body.scheduledAt()).contains("now")
        assertThat(body.targetOptions())
            .contains(
                PostUpdateParams.TargetOptions.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
        assertThat(body.targets().getOrNull()).containsExactly("string")
        assertThat(body.timezone()).contains("timezone")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PostUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
