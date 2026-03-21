// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.businessprofile

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BusinessProfileUpdateResponseTest {

    @Test
    fun create() {
        val businessProfileUpdateResponse =
            BusinessProfileUpdateResponse.builder()
                .about("about")
                .address("address")
                .description("description")
                .email("email")
                .profilePictureUrl("profile_picture_url")
                .addWebsite("string")
                .build()

        assertThat(businessProfileUpdateResponse.about()).contains("about")
        assertThat(businessProfileUpdateResponse.address()).contains("address")
        assertThat(businessProfileUpdateResponse.description()).contains("description")
        assertThat(businessProfileUpdateResponse.email()).contains("email")
        assertThat(businessProfileUpdateResponse.profilePictureUrl())
            .contains("profile_picture_url")
        assertThat(businessProfileUpdateResponse.websites().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val businessProfileUpdateResponse =
            BusinessProfileUpdateResponse.builder()
                .about("about")
                .address("address")
                .description("description")
                .email("email")
                .profilePictureUrl("profile_picture_url")
                .addWebsite("string")
                .build()

        val roundtrippedBusinessProfileUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(businessProfileUpdateResponse),
                jacksonTypeRef<BusinessProfileUpdateResponse>(),
            )

        assertThat(roundtrippedBusinessProfileUpdateResponse)
            .isEqualTo(businessProfileUpdateResponse)
    }
}
