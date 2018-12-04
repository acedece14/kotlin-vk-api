package name.alatushkin.api.vk.generated.users.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.common.NameCase

/**
 *  Returns a list of IDs of followers of the user in question, sorted by date added, most recent first.
 *
 *  [https://vk.com/dev/users.getFollowers]
 *  @property [user_id] User ID.
 *  @property [offset] Offset needed to return a specific subset of followers.
 *  @property [count] Number of followers to return.
 *  @property [fields] Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate' (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile', 'rate', 'contacts', 'education', 'online'.
 *  @property [name_case] Case for declension of user name and surname: 'nom' — nominative (default), 'gen' — genitive , 'dat' — dative, 'acc' — accusative , 'ins' — instrumental , 'abl' — prepositional
 */
class UsersGetFollowersMethod() : VkMethod<VkList<Long>>(
    "users.getFollowers",
    HashMap()
) {

    var userId: Long? by props
    var offset: Long? by props
    var count: Long? by props
    var fields: Array<String>? by props
    var nameCase: NameCase? by props

    constructor(
        userId: Long? = null,
        offset: Long? = null,
        count: Long? = null,
        fields: Array<String>? = null,
        nameCase: NameCase? = null
    ) : this() {
        this.userId = userId
        this.offset = offset
        this.count = count
        this.fields = fields
        this.nameCase = nameCase
    }

    fun setUserId(userId: Long): UsersGetFollowersMethod {
        this.userId = userId
        return this
    }

    fun setOffset(offset: Long): UsersGetFollowersMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): UsersGetFollowersMethod {
        this.count = count
        return this
    }

    fun setFields(fields: Array<String>): UsersGetFollowersMethod {
        this.fields = fields
        return this
    }

    fun setNameCase(nameCase: NameCase): UsersGetFollowersMethod {
        this.nameCase = nameCase
        return this
    }

    override val classRef = UsersGetFollowersMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<Long>>>() {}
    }
}
