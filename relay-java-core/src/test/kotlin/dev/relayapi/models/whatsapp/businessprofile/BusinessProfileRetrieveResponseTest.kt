// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.businessprofile

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BusinessProfileRetrieveResponseTest {

    @Test
    fun create() {
        val businessProfileRetrieveResponse =
            BusinessProfileRetrieveResponse.builder()
                .about("about")
                .address("address")
                .description("description")
                .email("email")
                .profilePictureUrl("profile_picture_url")
                .addWebsite("string")
                .build()

        assertThat(businessProfileRetrieveResponse.about()).contains("about")
        assertThat(businessProfileRetrieveResponse.address()).contains("address")
        assertThat(businessProfileRetrieveResponse.description()).contains("description")
        assertThat(businessProfileRetrieveResponse.email()).contains("email")
        assertThat(businessProfileRetrieveResponse.profilePictureUrl())
            .contains("profile_picture_url")
        assertThat(businessProfileRetrieveResponse.websites().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val businessProfileRetrieveResponse =
            BusinessProfileRetrieveResponse.builder()
                .about("about")
                .address("address")
                .description("description")
                .email("email")
                .profilePictureUrl("profile_picture_url")
                .addWebsite("string")
                .build()

        val roundtrippedBusinessProfileRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(businessProfileRetrieveResponse),
                jacksonTypeRef<BusinessProfileRetrieveResponse>(),
            )

        assertThat(roundtrippedBusinessProfileRetrieveResponse)
            .isEqualTo(businessProfileRetrieveResponse)
    }
}
