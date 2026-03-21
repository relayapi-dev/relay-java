// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect.googlebusiness.locations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocationListResponseTest {

    @Test
    fun create() {
        val locationListResponse =
            LocationListResponse.builder()
                .addLocation(
                    LocationListResponse.Location.builder()
                        .id("id")
                        .name("name")
                        .address("address")
                        .phone("phone")
                        .build()
                )
                .build()

        assertThat(locationListResponse.locations())
            .containsExactly(
                LocationListResponse.Location.builder()
                    .id("id")
                    .name("name")
                    .address("address")
                    .phone("phone")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val locationListResponse =
            LocationListResponse.builder()
                .addLocation(
                    LocationListResponse.Location.builder()
                        .id("id")
                        .name("name")
                        .address("address")
                        .phone("phone")
                        .build()
                )
                .build()

        val roundtrippedLocationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(locationListResponse),
                jacksonTypeRef<LocationListResponse>(),
            )

        assertThat(roundtrippedLocationListResponse).isEqualTo(locationListResponse)
    }
}
