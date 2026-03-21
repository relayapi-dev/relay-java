package dev.relayapi.errors

class RelayIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RelayException(message, cause)
