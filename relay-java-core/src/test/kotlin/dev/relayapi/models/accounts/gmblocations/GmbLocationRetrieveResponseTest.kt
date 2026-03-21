// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accounts.gmblocations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GmbLocationRetrieveResponseTest {

    @Test
    fun create() {
        val gmbLocationRetrieveResponse =
            GmbLocationRetrieveResponse.builder()
                .addData(
                    GmbLocationRetrieveResponse.Data.builder()
                        .id("id")
                        .address("address")
                        .name("name")
                        .build()
                )
                .build()

        assertThat(gmbLocationRetrieveResponse.data())
            .containsExactly(
                GmbLocationRetrieveResponse.Data.builder()
                    .id("id")
                    .address("address")
                    .name("name")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val gmbLocationRetrieveResponse =
            GmbLocationRetrieveResponse.builder()
                .addData(
                    GmbLocationRetrieveResponse.Data.builder()
                        .id("id")
                        .address("address")
                        .name("name")
                        .build()
                )
                .build()

        val roundtrippedGmbLocationRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(gmbLocationRetrieveResponse),
                jacksonTypeRef<GmbLocationRetrieveResponse>(),
            )

        assertThat(roundtrippedGmbLocationRetrieveResponse).isEqualTo(gmbLocationRetrieveResponse)
    }
}
