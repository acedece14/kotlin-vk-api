package name.alatushkin.api.vk.generated.apps.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.apps.App
import name.alatushkin.api.vk.generated.apps.GetPlatform
import name.alatushkin.api.vk.generated.common.NameCase

/**
 *  Returns applications data.
 *
 *  [https://vk.com/dev/apps.get]
 *  @property [app_id] Application ID
 *  @property [app_ids] List of application ID
 *  @property [platform] platform. Possible values: *'ios' — iOS,, *'android' — Android,, *'winphone' — Windows Phone,, *'web' — приложения на vk.com. By default: 'web'.
 *  @property [fields] Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate' (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile', 'contacts', 'education', 'online', 'counters', 'relation', 'last_seen', 'activity', 'can_write_private_message', 'can_see_all_posts', 'can_post', 'universities', (only if return_friends - 1)
 *  @property [name_case] Case for declension of user name and surname: 'nom' — nominative (default),, 'gen' — genitive,, 'dat' — dative,, 'acc' — accusative,, 'ins' — instrumental,, 'abl' — prepositional. (only if 'return_friends' = '1')
 */
class AppsGetMethod() : VkMethod<VkList<App>>(
    "apps.get",
    HashMap()
) {

    var appId: Long? by props
    var appIds: Array<String>? by props
    var platform: GetPlatform? by props
    var fields: Array<String>? by props
    var nameCase: NameCase? by props

    constructor(
        appId: Long? = null,
        appIds: Array<String>? = null,
        platform: GetPlatform? = null,
        fields: Array<String>? = null,
        nameCase: NameCase? = null
    ) : this() {
        this.appId = appId
        this.appIds = appIds
        this.platform = platform
        this.fields = fields
        this.nameCase = nameCase
    }

    fun setAppId(appId: Long): AppsGetMethod {
        this.appId = appId
        return this
    }

    fun setAppIds(appIds: Array<String>): AppsGetMethod {
        this.appIds = appIds
        return this
    }

    fun setPlatform(platform: GetPlatform): AppsGetMethod {
        this.platform = platform
        return this
    }

    fun setFields(fields: Array<String>): AppsGetMethod {
        this.fields = fields
        return this
    }

    fun setNameCase(nameCase: NameCase): AppsGetMethod {
        this.nameCase = nameCase
        return this
    }

    override val classRef = AppsGetMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<App>>>() {}
    }
}
