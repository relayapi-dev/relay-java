// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.whatsapp

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.whatsapp.contacts.ContactBulkOperationsParams
import dev.relayapi.models.whatsapp.contacts.ContactCreateParams
import dev.relayapi.models.whatsapp.contacts.ContactImportParams
import dev.relayapi.models.whatsapp.contacts.ContactListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ContactServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val contactServiceAsync = client.whatsapp().contacts()

        val contactFuture =
            contactServiceAsync.create(
                ContactCreateParams.builder()
                    .accountId("account_id")
                    .phone("phone")
                    .email("email")
                    .name("name")
                    .addTag("string")
                    .workspaceId("workspace_id")
                    .build()
            )

        val contact = contactFuture.get()
        contact.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val contactServiceAsync = client.whatsapp().contacts()

        val contactFuture = contactServiceAsync.retrieve("contact_id")

        val contact = contactFuture.get()
        contact.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val contactServiceAsync = client.whatsapp().contacts()

        val contactsFuture =
            contactServiceAsync.list(
                ContactListParams.builder()
                    .accountId("account_id")
                    .cursor("cursor")
                    .limit(1L)
                    .search("search")
                    .tag("tag")
                    .workspaceId("workspace_id")
                    .build()
            )

        val contacts = contactsFuture.get()
        contacts.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val contactServiceAsync = client.whatsapp().contacts()

        val future = contactServiceAsync.delete("contact_id")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun bulkOperations() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val contactServiceAsync = client.whatsapp().contacts()

        val responseFuture =
            contactServiceAsync.bulkOperations(
                ContactBulkOperationsParams.builder()
                    .accountId("account_id")
                    .action(ContactBulkOperationsParams.Action.ADD_TAGS)
                    .addContactId("string")
                    .addTag("string")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun import_() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val contactServiceAsync = client.whatsapp().contacts()

        val responseFuture =
            contactServiceAsync.import_(
                ContactImportParams.builder()
                    .accountId("account_id")
                    .addContact(
                        ContactImportParams.Contact.builder()
                            .phone("phone")
                            .email("email")
                            .name("name")
                            .addTag("string")
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
