// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import dev.relayapi.client.RelayClient
import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.posts.PostListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

    private lateinit var client: RelayClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            RelayOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val postService = client.posts()
        stubFor(get(anyUrl()).willReturn(ok("{}")))

        postService.list(
            PostListParams.builder()
                .accountId("account_id")
                .cursor("cursor")
                .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .include("include")
                .limit(1L)
                .status(PostListParams.Status.DRAFT)
                .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .workspaceId("workspace_id")
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .build()
        )

        verify(
            getRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
        )
    }
}
