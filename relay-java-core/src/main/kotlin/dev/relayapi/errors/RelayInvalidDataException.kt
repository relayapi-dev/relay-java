package dev.relayapi.errors

class RelayInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RelayException(message, cause)
