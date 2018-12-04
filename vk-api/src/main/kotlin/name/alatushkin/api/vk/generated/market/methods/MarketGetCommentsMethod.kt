package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.market.GetCommentsSort
import name.alatushkin.api.vk.generated.wall.WallComment

/**
 *  Returns comments list for an item.
 *
 *  [https://vk.com/dev/market.getComments]
 *  @property [owner_id] ID of an item owner community
 *  @property [item_id] Item ID.
 *  @property [need_likes] '1' — to return likes info.
 *  @property [start_comment_id] ID of a comment to start a list from (details below).
 *  @property [count] Number of results to return.
 *  @property [sort] Sort order ('asc' — from old to new, 'desc' — from new to old)
 *  @property [extended] '1' — comments will be returned as numbered objects, in addition lists of 'profiles' and 'groups' objects will be returned.
 *  @property [fields] List of additional profile fields to return. See the [vk.com/dev/fields|details]
 */
class MarketGetCommentsMethod() : VkMethod<VkList<WallComment>>(
    "market.getComments",
    HashMap()
) {

    var ownerId: Long? by props
    var itemId: Long? by props
    var needLikes: Boolean? by props
    var startCommentId: Long? by props
    var count: Long? by props
    var sort: GetCommentsSort? by props
    var extended: Boolean? by props
    var fields: Array<String>? by props

    constructor(
        ownerId: Long? = null,
        itemId: Long? = null,
        needLikes: Boolean? = null,
        startCommentId: Long? = null,
        count: Long? = null,
        sort: GetCommentsSort? = null,
        extended: Boolean? = null,
        fields: Array<String>? = null
    ) : this() {
        this.ownerId = ownerId
        this.itemId = itemId
        this.needLikes = needLikes
        this.startCommentId = startCommentId
        this.count = count
        this.sort = sort
        this.extended = extended
        this.fields = fields
    }

    fun setOwnerId(ownerId: Long): MarketGetCommentsMethod {
        this.ownerId = ownerId
        return this
    }

    fun setItemId(itemId: Long): MarketGetCommentsMethod {
        this.itemId = itemId
        return this
    }

    fun setNeedLikes(needLikes: Boolean): MarketGetCommentsMethod {
        this.needLikes = needLikes
        return this
    }

    fun setStartCommentId(startCommentId: Long): MarketGetCommentsMethod {
        this.startCommentId = startCommentId
        return this
    }

    fun setCount(count: Long): MarketGetCommentsMethod {
        this.count = count
        return this
    }

    fun setSort(sort: GetCommentsSort): MarketGetCommentsMethod {
        this.sort = sort
        return this
    }

    fun setExtended(extended: Boolean): MarketGetCommentsMethod {
        this.extended = extended
        return this
    }

    fun setFields(fields: Array<String>): MarketGetCommentsMethod {
        this.fields = fields
        return this
    }

    override val classRef = MarketGetCommentsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<WallComment>>>() {}
    }
}
