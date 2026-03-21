// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.whatsapp

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.whatsapp.contacts.ContactBulkOperationsParams
import dev.relayapi.models.whatsapp.contacts.ContactCreateParams
import dev.relayapi.models.whatsapp.contacts.ContactImportParams
import dev.relayapi.models.whatsapp.contacts.ContactListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ContactServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val contactService = client.whatsapp().contacts()

        val contact =
            contactService.create(
                ContactCreateParams.builder()
                    .accountId("account_id")
                    .phone("phone")
                    .email("email")
                    .name("name")
                    .addTag("string")
                    .build()
            )

        contact.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val contactService = client.whatsapp().contacts()

        val contact = contactService.retrieve("contact_id")

        contact.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val contactService = client.whatsapp().contacts()

        val contacts =
            contactService.list(
                ContactListParams.builder()
                    .accountId("account_id")
                    .cursor("cursor")
                    .limit(1L)
                    .search("search")
                    .tag("tag")
                    .build()
            )

        contacts.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val contactService = client.whatsapp().contacts()

        contactService.delete("contact_id")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun bulkOperations() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val contactService = client.whatsapp().contacts()

        val response =
            contactService.bulkOperations(
                ContactBulkOperationsParams.builder()
                    .accountId("account_id")
                    .action(ContactBulkOperationsParams.Action.ADD_TAGS)
                    .addContactId("string")
                    .addTag("string")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun import_() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val contactService = client.whatsapp().contacts()

        val response =
            contactService.import_(
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

        response.validate()
    }
}
