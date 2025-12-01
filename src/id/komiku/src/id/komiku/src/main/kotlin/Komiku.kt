package eu.kanade.tachiyomi.extension.id.komiku

import eu.kanade.tachiyomi.source.online.HttpSource
import okhttp3.Request
import okhttp3.Response

class Komiku : HttpSource() {

    override val name = "Komiku"
    override val baseUrl = "https://komiku.org"
    override val lang = "id"
    override val supportsLatest = true

    override fun popularMangaRequest(page: Int): Request {
        return GET("$baseUrl/daftar-manga/?page=$page")
    }

    override fun popularMangaParse(response: Response) {
        // parser nanti dibuat setelah build pertama berhasil
        throw Exception("Parsing belum dibuat")
    }
}
