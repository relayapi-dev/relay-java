@file:JvmName("EmptyHandler")

package dev.relayapi.core.handlers

import dev.relayapi.core.http.HttpResponse
import dev.relayapi.core.http.HttpResponse.Handler

@JvmSynthetic internal fun emptyHandler(): Handler<Void?> = EmptyHandlerInternal

private object EmptyHandlerInternal : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}
