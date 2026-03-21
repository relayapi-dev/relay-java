// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.usage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageRetrieveResponseTest {

    @Test
    fun create() {
        val usageRetrieveResponse =
            UsageRetrieveResponse.builder()
                .plan(
                    UsageRetrieveResponse.Plan.builder()
                        .apiCallsLimit(0.0)
                        .apiCallsPerMin(0.0)
                        .features(
                            UsageRetrieveResponse.Plan.Features.builder()
                                .analytics(true)
                                .inbox(true)
                                .build()
                        )
                        .name(UsageRetrieveResponse.Plan.Name.FREE)
                        .build()
                )
                .rateLimit(
                    UsageRetrieveResponse.RateLimit.builder()
                        .currentMinute(0.0)
                        .limitPerMinute(0.0)
                        .build()
                )
                .subscription(
                    UsageRetrieveResponse.Subscription.builder()
                        .monthlyPriceCents(0.0)
                        .pricePerThousandCallsCents(0.0)
                        .status("status")
                        .build()
                )
                .usage(
                    UsageRetrieveResponse.Usage.builder()
                        .apiCallsRemaining(0.0)
                        .apiCallsUsed(0.0)
                        .cycleEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cycleStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .overageCalls(0.0)
                        .overageCostCents(0.0)
                        .build()
                )
                .build()

        assertThat(usageRetrieveResponse.plan())
            .isEqualTo(
                UsageRetrieveResponse.Plan.builder()
                    .apiCallsLimit(0.0)
                    .apiCallsPerMin(0.0)
                    .features(
                        UsageRetrieveResponse.Plan.Features.builder()
                            .analytics(true)
                            .inbox(true)
                            .build()
                    )
                    .name(UsageRetrieveResponse.Plan.Name.FREE)
                    .build()
            )
        assertThat(usageRetrieveResponse.rateLimit())
            .isEqualTo(
                UsageRetrieveResponse.RateLimit.builder()
                    .currentMinute(0.0)
                    .limitPerMinute(0.0)
                    .build()
            )
        assertThat(usageRetrieveResponse.subscription())
            .isEqualTo(
                UsageRetrieveResponse.Subscription.builder()
                    .monthlyPriceCents(0.0)
                    .pricePerThousandCallsCents(0.0)
                    .status("status")
                    .build()
            )
        assertThat(usageRetrieveResponse.usage())
            .isEqualTo(
                UsageRetrieveResponse.Usage.builder()
                    .apiCallsRemaining(0.0)
                    .apiCallsUsed(0.0)
                    .cycleEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .cycleStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .overageCalls(0.0)
                    .overageCostCents(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageRetrieveResponse =
            UsageRetrieveResponse.builder()
                .plan(
                    UsageRetrieveResponse.Plan.builder()
                        .apiCallsLimit(0.0)
                        .apiCallsPerMin(0.0)
                        .features(
                            UsageRetrieveResponse.Plan.Features.builder()
                                .analytics(true)
                                .inbox(true)
                                .build()
                        )
                        .name(UsageRetrieveResponse.Plan.Name.FREE)
                        .build()
                )
                .rateLimit(
                    UsageRetrieveResponse.RateLimit.builder()
                        .currentMinute(0.0)
                        .limitPerMinute(0.0)
                        .build()
                )
                .subscription(
                    UsageRetrieveResponse.Subscription.builder()
                        .monthlyPriceCents(0.0)
                        .pricePerThousandCallsCents(0.0)
                        .status("status")
                        .build()
                )
                .usage(
                    UsageRetrieveResponse.Usage.builder()
                        .apiCallsRemaining(0.0)
                        .apiCallsUsed(0.0)
                        .cycleEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cycleStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .overageCalls(0.0)
                        .overageCostCents(0.0)
                        .build()
                )
                .build()

        val roundtrippedUsageRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageRetrieveResponse),
                jacksonTypeRef<UsageRetrieveResponse>(),
            )

        assertThat(roundtrippedUsageRetrieveResponse).isEqualTo(usageRetrieveResponse)
    }
}
