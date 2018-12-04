package name.alatushkin.api.vk.generated.newsfeed.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.newsfeed.GetSuggestedSourcesResponse

/**
 *  Returns communities and users that current user is suggested to follow.
 *
 *  [https://vk.com/dev/newsfeed.getSuggestedSources]
 *  @property [offset] offset required to choose a particular subset of communities or users.
 *  @property [count] amount of communities or users to return.
 *  @property [shuffle] shuffle the returned list or not.
 *  @property [fields] list of extra fields to be returned. See available fields for [vk.com/dev/fields|users] and [vk.com/dev/fields_groups|communities].
 */
class NewsfeedGetSuggestedSourcesMethod() : VkMethod<VkList<GetSuggestedSourcesResponse>>(
    "newsfeed.getSuggestedSources",
    HashMap()
) {

    var offset: Long? by props
    var count: Long? by props
    var shuffle: Boolean? by props
    var fields: Array<String>? by props

    constructor(
        offset: Long? = null,
        count: Long? = null,
        shuffle: Boolean? = null,
        fields: Array<String>? = null
    ) : this() {
        this.offset = offset
        this.count = count
        this.shuffle = shuffle
        this.fields = fields
    }

    fun setOffset(offset: Long): NewsfeedGetSuggestedSourcesMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): NewsfeedGetSuggestedSourcesMethod {
        this.count = count
        return this
    }

    fun setShuffle(shuffle: Boolean): NewsfeedGetSuggestedSourcesMethod {
        this.shuffle = shuffle
        return this
    }

    fun setFields(fields: Array<String>): NewsfeedGetSuggestedSourcesMethod {
        this.fields = fields
        return this
    }

    override val classRef = NewsfeedGetSuggestedSourcesMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<GetSuggestedSourcesResponse>>>() {}
    }
}
