// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accounts.facebookpages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FacebookPageRetrieveResponseTest {

    @Test
    fun create() {
        val facebookPageRetrieveResponse =
            FacebookPageRetrieveResponse.builder()
                .addData(
                    FacebookPageRetrieveResponse.Data.builder()
                        .id("id")
                        .name("name")
                        .accessToken("access_token")
                        .build()
                )
                .build()

        assertThat(facebookPageRetrieveResponse.data())
            .containsExactly(
                FacebookPageRetrieveResponse.Data.builder()
                    .id("id")
                    .name("name")
                    .accessToken("access_token")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val facebookPageRetrieveResponse =
            FacebookPageRetrieveResponse.builder()
                .addData(
                    FacebookPageRetrieveResponse.Data.builder()
                        .id("id")
                        .name("name")
                        .accessToken("access_token")
                        .build()
                )
                .build()

        val roundtrippedFacebookPageRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(facebookPageRetrieveResponse),
                jacksonTypeRef<FacebookPageRetrieveResponse>(),
            )

        assertThat(roundtrippedFacebookPageRetrieveResponse).isEqualTo(facebookPageRetrieveResponse)
    }
}
