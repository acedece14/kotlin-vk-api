package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Reorders the album in the list of user video albums.
 *
 *  [https://vk.com/dev/video.reorderAlbums]
 *  @property [owner_id] ID of the user or community that owns the albums..
 *  @property [album_id] Album ID.
 *  @property [before] ID of the album before which the album in question shall be placed.
 *  @property [after] ID of the album after which the album in question shall be placed.
 */
class VideoReorderAlbumsMethod() : VkMethod<Boolean>(
    "video.reorderAlbums",
    HashMap()
) {

    var ownerId: Long? by props
    var albumId: Long? by props
    var before: Long? by props
    var after: Long? by props

    constructor(
        ownerId: Long? = null,
        albumId: Long? = null,
        before: Long? = null,
        after: Long? = null
    ) : this() {
        this.ownerId = ownerId
        this.albumId = albumId
        this.before = before
        this.after = after
    }

    fun setOwnerId(ownerId: Long): VideoReorderAlbumsMethod {
        this.ownerId = ownerId
        return this
    }

    fun setAlbumId(albumId: Long): VideoReorderAlbumsMethod {
        this.albumId = albumId
        return this
    }

    fun setBefore(before: Long): VideoReorderAlbumsMethod {
        this.before = before
        return this
    }

    fun setAfter(after: Long): VideoReorderAlbumsMethod {
        this.after = after
        return this
    }

    override val classRef = VideoReorderAlbumsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
