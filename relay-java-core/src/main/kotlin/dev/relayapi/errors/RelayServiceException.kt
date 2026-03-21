// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.errors

import dev.relayapi.core.JsonValue
import dev.relayapi.core.http.Headers

abstract class RelayServiceException
protected constructor(message: String, cause: Throwable? = null) : RelayException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
