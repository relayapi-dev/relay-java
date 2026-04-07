// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import dev.relayapi.client.RelayClient
import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.core.JsonValue
import dev.relayapi.core.http.Headers
import dev.relayapi.core.jsonMapper
import dev.relayapi.errors.BadRequestException
import dev.relayapi.errors.InternalServerException
import dev.relayapi.errors.NotFoundException
import dev.relayapi.errors.PermissionDeniedException
import dev.relayapi.errors.RateLimitException
import dev.relayapi.errors.RelayException
import dev.relayapi.errors.UnauthorizedException
import dev.relayapi.errors.UnexpectedStatusCodeException
import dev.relayapi.errors.UnprocessableEntityException
import dev.relayapi.models.posts.PostListParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: RelayClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            RelayOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun postsList400() {
        val postService = client.posts()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                postService.list(
                    PostListParams.builder()
                        .accountId("account_id")
                        .cursor("cursor")
                        .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .include("include")
                        .includeExternal(PostListParams.IncludeExternal.TRUE)
                        .limit(1L)
                        .status(PostListParams.Status.DRAFT)
                        .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun postsList400WithRawResponse() {
        val postService = client.posts().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                postService.list(
                    PostListParams.builder()
                        .accountId("account_id")
                        .cursor("cursor")
                        .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .include("include")
                        .includeExternal(PostListParams.IncludeExternal.TRUE)
                        .limit(1L)
                        .status(PostListParams.Status.DRAFT)
                        .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun postsList401() {
        val postService = client.posts()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                postService.list(
                    PostListParams.builder()
                        .accountId("account_id")
                        .cursor("cursor")
                        .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .include("include")
                        .includeExternal(PostListParams.IncludeExternal.TRUE)
                        .limit(1L)
                        .status(PostListParams.Status.DRAFT)
                        .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun postsList401WithRawResponse() {
        val postService = client.posts().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                postService.list(
                    PostListParams.builder()
                        .accountId("account_id")
                        .cursor("cursor")
                        .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .include("include")
                        .includeExternal(PostListParams.IncludeExternal.TRUE)
                        .limit(1L)
                        .status(PostListParams.Status.DRAFT)
                        .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun postsList403() {
        val postService = client.posts()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                postService.list(
                    PostListParams.builder()
                        .accountId("account_id")
                        .cursor("cursor")
                        .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .include("include")
                        .includeExternal(PostListParams.IncludeExternal.TRUE)
                        .limit(1L)
                        .status(PostListParams.Status.DRAFT)
                        .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun postsList403WithRawResponse() {
        val postService = client.posts().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                postService.list(
                    PostListParams.builder()
                        .accountId("account_id")
                        .cursor("cursor")
                        .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .include("include")
                        .includeExternal(PostListParams.IncludeExternal.TRUE)
                        .limit(1L)
                        .status(PostListParams.Status.DRAFT)
                        .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun postsList404() {
        val postService = client.posts()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                postService.list(
                    PostListParams.builder()
                        .accountId("account_id")
                        .cursor("cursor")
                        .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .include("include")
                        .includeExternal(PostListParams.IncludeExternal.TRUE)
                        .limit(1L)
                        .status(PostListParams.Status.DRAFT)
                        .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun postsList404WithRawResponse() {
        val postService = client.posts().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                postService.list(
                    PostListParams.builder()
                        .accountId("account_id")
                        .cursor("cursor")
                        .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .include("include")
                        .includeExternal(PostListParams.IncludeExternal.TRUE)
                        .limit(1L)
                        .status(PostListParams.Status.DRAFT)
                        .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun postsList422() {
        val postService = client.posts()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                postService.list(
                    PostListParams.builder()
                        .accountId("account_id")
                        .cursor("cursor")
                        .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .include("include")
                        .includeExternal(PostListParams.IncludeExternal.TRUE)
                        .limit(1L)
                        .status(PostListParams.Status.DRAFT)
                        .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun postsList422WithRawResponse() {
        val postService = client.posts().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                postService.list(
                    PostListParams.builder()
                        .accountId("account_id")
                        .cursor("cursor")
                        .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .include("include")
                        .includeExternal(PostListParams.IncludeExternal.TRUE)
                        .limit(1L)
                        .status(PostListParams.Status.DRAFT)
                        .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun postsList429() {
        val postService = client.posts()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                postService.list(
                    PostListParams.builder()
                        .accountId("account_id")
                        .cursor("cursor")
                        .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .include("include")
                        .includeExternal(PostListParams.IncludeExternal.TRUE)
                        .limit(1L)
                        .status(PostListParams.Status.DRAFT)
                        .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun postsList429WithRawResponse() {
        val postService = client.posts().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                postService.list(
                    PostListParams.builder()
                        .accountId("account_id")
                        .cursor("cursor")
                        .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .include("include")
                        .includeExternal(PostListParams.IncludeExternal.TRUE)
                        .limit(1L)
                        .status(PostListParams.Status.DRAFT)
                        .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun postsList500() {
        val postService = client.posts()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                postService.list(
                    PostListParams.builder()
                        .accountId("account_id")
                        .cursor("cursor")
                        .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .include("include")
                        .includeExternal(PostListParams.IncludeExternal.TRUE)
                        .limit(1L)
                        .status(PostListParams.Status.DRAFT)
                        .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun postsList500WithRawResponse() {
        val postService = client.posts().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                postService.list(
                    PostListParams.builder()
                        .accountId("account_id")
                        .cursor("cursor")
                        .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .include("include")
                        .includeExternal(PostListParams.IncludeExternal.TRUE)
                        .limit(1L)
                        .status(PostListParams.Status.DRAFT)
                        .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun postsList999() {
        val postService = client.posts()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                postService.list(
                    PostListParams.builder()
                        .accountId("account_id")
                        .cursor("cursor")
                        .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .include("include")
                        .includeExternal(PostListParams.IncludeExternal.TRUE)
                        .limit(1L)
                        .status(PostListParams.Status.DRAFT)
                        .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun postsList999WithRawResponse() {
        val postService = client.posts().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                postService.list(
                    PostListParams.builder()
                        .accountId("account_id")
                        .cursor("cursor")
                        .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .include("include")
                        .includeExternal(PostListParams.IncludeExternal.TRUE)
                        .limit(1L)
                        .status(PostListParams.Status.DRAFT)
                        .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun postsListInvalidJsonBody() {
        val postService = client.posts()
        stubFor(
            get(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<RelayException> {
                postService.list(
                    PostListParams.builder()
                        .accountId("account_id")
                        .cursor("cursor")
                        .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .include("include")
                        .includeExternal(PostListParams.IncludeExternal.TRUE)
                        .limit(1L)
                        .status(PostListParams.Status.DRAFT)
                        .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
