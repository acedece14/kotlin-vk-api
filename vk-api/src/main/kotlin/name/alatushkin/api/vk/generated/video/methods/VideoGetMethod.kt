package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.video.Video

/**
 *  Returns detailed information about videos.
 *
 *  [https://vk.com/dev/video.get]
 *  @property [owner_id] ID of the user or community that owns the video(s).
 *  @property [videos] Video IDs, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", Use a negative value to designate a community ID. Example: "-4363_136089719,13245770_137352259"
 *  @property [album_id] ID of the album containing the video(s).
 *  @property [count] Number of videos to return.
 *  @property [offset] Offset needed to return a specific subset of videos.
 */
class VideoGetMethod() : VkMethod<VkList<Video>>(
    "video.get",
    mutableMapOf()
) {

    var ownerId: Long? by props
    var videos: Array<String>? by props
    var albumId: Long? by props
    var count: Long? by props
    var offset: Long? by props

    constructor(
        ownerId: Long? = null,
        videos: Array<String>? = null,
        albumId: Long? = null,
        count: Long? = null,
        offset: Long? = null
    ) : this() {
        this.ownerId = ownerId
        this.videos = videos
        this.albumId = albumId
        this.count = count
        this.offset = offset
    }

    fun setOwnerId(ownerId: Long): VideoGetMethod {
        this.ownerId = ownerId
        return this
    }

    fun setVideos(videos: Array<String>): VideoGetMethod {
        this.videos = videos
        return this
    }

    fun setAlbumId(albumId: Long): VideoGetMethod {
        this.albumId = albumId
        return this
    }

    fun setCount(count: Long): VideoGetMethod {
        this.count = count
        return this
    }

    fun setOffset(offset: Long): VideoGetMethod {
        this.offset = offset
        return this
    }

    override val classRef = VideoGetMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<Video>>>() {}
    }
}
