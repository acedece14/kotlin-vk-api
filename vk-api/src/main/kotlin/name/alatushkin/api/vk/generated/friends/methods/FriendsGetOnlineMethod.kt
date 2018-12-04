package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Returns a list of user IDs of a user's friends who are online.
 *
 *  [https://vk.com/dev/friends.getOnline]
 *  @property [user_id] User ID.
 *  @property [list_id] Friend list ID. If this parameter is not set, information about all online friends is returned.
 *  @property [order] Sort order: 'random' — random order
 *  @property [count] Number of friends to return.
 *  @property [offset] Offset needed to return a specific subset of friends.
 */
class FriendsGetOnlineMethod() : VkMethod<Array<Long>>(
    "friends.getOnline",
    mutableMapOf()
) {

    var userId: Long? by props
    var listId: Long? by props
    var order: String? by props
    var count: Long? by props
    var offset: Long? by props

    constructor(
        userId: Long? = null,
        listId: Long? = null,
        order: String? = null,
        count: Long? = null,
        offset: Long? = null
    ) : this() {
        this.userId = userId
        this.listId = listId
        this.order = order
        this.count = count
        this.offset = offset
    }

    fun setUserId(userId: Long): FriendsGetOnlineMethod {
        this.userId = userId
        return this
    }

    fun setListId(listId: Long): FriendsGetOnlineMethod {
        this.listId = listId
        return this
    }

    fun setOrder(order: String): FriendsGetOnlineMethod {
        this.order = order
        return this
    }

    fun setCount(count: Long): FriendsGetOnlineMethod {
        this.count = count
        return this
    }

    fun setOffset(offset: Long): FriendsGetOnlineMethod {
        this.offset = offset
        return this
    }

    override val classRef = FriendsGetOnlineMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Array<Long>>>() {}
    }
}
