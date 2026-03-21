// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect.facebook.pages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PageListResponseTest {

    @Test
    fun create() {
        val pageListResponse =
            PageListResponse.builder()
                .addPage(
                    PageListResponse.Page.builder()
                        .id("id")
                        .name("name")
                        .category("category")
                        .pictureUrl("picture_url")
                        .build()
                )
                .build()

        assertThat(pageListResponse.pages())
            .containsExactly(
                PageListResponse.Page.builder()
                    .id("id")
                    .name("name")
                    .category("category")
                    .pictureUrl("picture_url")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pageListResponse =
            PageListResponse.builder()
                .addPage(
                    PageListResponse.Page.builder()
                        .id("id")
                        .name("name")
                        .category("category")
                        .pictureUrl("picture_url")
                        .build()
                )
                .build()

        val roundtrippedPageListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pageListResponse),
                jacksonTypeRef<PageListResponse>(),
            )

        assertThat(roundtrippedPageListResponse).isEqualTo(pageListResponse)
    }
}
