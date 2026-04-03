// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.core.JsonValue
import dev.relayapi.core.jsonMapper
import dev.relayapi.models.posts.PostCreateResponse
import java.time.OffsetDateTime
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/relay-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.posts()).isNotNull()
        assertThat(client.accounts()).isNotNull()
        assertThat(client.media()).isNotNull()
        assertThat(client.webhooks()).isNotNull()
        assertThat(client.apiKeys()).isNotNull()
        assertThat(client.usage()).isNotNull()
        assertThat(client.accountGroups()).isNotNull()
        assertThat(client.connect()).isNotNull()
        assertThat(client.connections()).isNotNull()
        assertThat(client.analytics()).isNotNull()
        assertThat(client.tools()).isNotNull()
        assertThat(client.queue()).isNotNull()
        assertThat(client.twitter()).isNotNull()
        assertThat(client.inbox()).isNotNull()
        assertThat(client.reddit()).isNotNull()
        assertThat(client.whatsapp()).isNotNull()
    }

    @Test
    fun postCreateResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val postCreateResponse =
            PostCreateResponse.builder()
                .id("id")
                .content("content")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addMedia(
                    PostCreateResponse.Media.builder()
                        .url("https://example.com")
                        .type(PostCreateResponse.Media.Type.IMAGE)
                        .build()
                )
                .publishedAt("published_at")
                .recycledFromId("recycled_from_id")
                .recycling(
                    PostCreateResponse.Recycling.builder()
                        .id("id")
                        .contentVariationIndex(0.0)
                        .addContentVariation("string")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .enabled(true)
                        .expireCount(0.0)
                        .expireDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .gap(0.0)
                        .gapFreq(PostCreateResponse.Recycling.GapFreq.DAY)
                        .lastRecycledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .nextRecycleAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .recycleCount(0.0)
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .scheduledAt("scheduled_at")
                .status(PostCreateResponse.Status.DRAFT)
                .targets(
                    PostCreateResponse.Targets.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "platform" to "twitter",
                                    "status" to "draft",
                                    "accounts" to
                                        listOf(
                                            mapOf(
                                                "id" to "id",
                                                "avatar_url" to "avatar_url",
                                                "display_name" to "display_name",
                                                "platform_post_id" to "platform_post_id",
                                                "url" to "url",
                                                "username" to "username",
                                            )
                                        ),
                                    "error" to mapOf("code" to "code", "message" to "message"),
                                )
                            ),
                        )
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metrics(
                    PostCreateResponse.Metrics.builder()
                        .clicks(0.0)
                        .comments(0.0)
                        .engagementRate(0.0)
                        .impressions(0.0)
                        .likes(0.0)
                        .reach(0.0)
                        .saves(0.0)
                        .shares(0.0)
                        .views(0.0)
                        .build()
                )
                .targetOptions(
                    PostCreateResponse.TargetOptions.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .timezone("timezone")
                .build()

        val roundtrippedPostCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(postCreateResponse),
                jacksonTypeRef<PostCreateResponse>(),
            )

        assertThat(roundtrippedPostCreateResponse).isEqualTo(postCreateResponse)
    }
}
