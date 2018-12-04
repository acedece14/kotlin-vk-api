package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.common.NameCase
import name.alatushkin.api.vk.generated.users.UserFull

/**
 *  Returns invited users list of a community
 *
 *  [https://vk.com/dev/groups.getInvitedUsers]
 *  @property [group_id] Group ID to return invited users for.
 *  @property [offset] Offset needed to return a specific subset of results.
 *  @property [count] Number of results to return.
 *  @property [fields] List of additional fields to be returned. Available values: 'sex, bdate, city, country, photo_50, photo_100, photo_200_orig, photo_200, photo_400_orig, photo_max, photo_max_orig, online, online_mobile, lists, domain, has_mobile, contacts, connections, site, education, universities, schools, can_post, can_see_all_posts, can_see_audio, can_write_private_message, status, last_seen, common_count, relation, relatives, counters'.
 *  @property [name_case] Case for declension of user name and surname. Possible values: *'nom' — nominative (default),, *'gen' — genitive,, *'dat' — dative,, *'acc' — accusative, , *'ins' — instrumental,, *'abl' — prepositional.
 */
class GroupsGetInvitedUsersMethod() : VkMethod<VkList<UserFull>>(
    "groups.getInvitedUsers",
    HashMap()
) {

    var groupId: Long? by props
    var offset: Long? by props
    var count: Long? by props
    var fields: Array<String>? by props
    var nameCase: NameCase? by props

    constructor(
        groupId: Long? = null,
        offset: Long? = null,
        count: Long? = null,
        fields: Array<String>? = null,
        nameCase: NameCase? = null
    ) : this() {
        this.groupId = groupId
        this.offset = offset
        this.count = count
        this.fields = fields
        this.nameCase = nameCase
    }

    fun setGroupId(groupId: Long): GroupsGetInvitedUsersMethod {
        this.groupId = groupId
        return this
    }

    fun setOffset(offset: Long): GroupsGetInvitedUsersMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): GroupsGetInvitedUsersMethod {
        this.count = count
        return this
    }

    fun setFields(fields: Array<String>): GroupsGetInvitedUsersMethod {
        this.fields = fields
        return this
    }

    fun setNameCase(nameCase: NameCase): GroupsGetInvitedUsersMethod {
        this.nameCase = nameCase
        return this
    }

    override val classRef = GroupsGetInvitedUsersMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<UserFull>>>() {}
    }
}
