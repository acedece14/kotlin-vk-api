package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Edits the caption of a photo.
 *
 *  [https://vk.com/dev/photos.edit]
 *  @property [owner_id] ID of the user or community that owns the photo.
 *  @property [photo_id] Photo ID.
 *  @property [caption] New caption for the photo. If this parameter is not set, it is considered to be equal to an empty string.
 *  @property [latitude]
 *  @property [longitude]
 *  @property [place_str]
 *  @property [foursquare_id]
 *  @property [delete_place]
 */
class PhotosEditMethod() : VkMethod<Boolean>(
    "photos.edit",
    HashMap()
) {

    var ownerId: Long? by props
    var photoId: Long? by props
    var caption: String? by props
    var latitude: Double? by props
    var longitude: Double? by props
    var placeStr: String? by props
    var foursquareId: String? by props
    var deletePlace: Boolean? by props

    constructor(
        ownerId: Long? = null,
        photoId: Long? = null,
        caption: String? = null,
        latitude: Double? = null,
        longitude: Double? = null,
        placeStr: String? = null,
        foursquareId: String? = null,
        deletePlace: Boolean? = null
    ) : this() {
        this.ownerId = ownerId
        this.photoId = photoId
        this.caption = caption
        this.latitude = latitude
        this.longitude = longitude
        this.placeStr = placeStr
        this.foursquareId = foursquareId
        this.deletePlace = deletePlace
    }

    fun setOwnerId(ownerId: Long): PhotosEditMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPhotoId(photoId: Long): PhotosEditMethod {
        this.photoId = photoId
        return this
    }

    fun setCaption(caption: String): PhotosEditMethod {
        this.caption = caption
        return this
    }

    fun setLatitude(latitude: Double): PhotosEditMethod {
        this.latitude = latitude
        return this
    }

    fun setLongitude(longitude: Double): PhotosEditMethod {
        this.longitude = longitude
        return this
    }

    fun setPlaceStr(placeStr: String): PhotosEditMethod {
        this.placeStr = placeStr
        return this
    }

    fun setFoursquareId(foursquareId: String): PhotosEditMethod {
        this.foursquareId = foursquareId
        return this
    }

    fun setDeletePlace(deletePlace: Boolean): PhotosEditMethod {
        this.deletePlace = deletePlace
        return this
    }

    override val classRef = PhotosEditMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
