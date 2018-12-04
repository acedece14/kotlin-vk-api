package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Edits a retarget group.
 *
 *  [https://vk.com/dev/ads.updateTargetGroup]
 *  @property [account_id] Advertising account ID.
 *  @property [client_id] 'Only for advertising agencies.' , ID of the client with the advertising account where the group will be created.
 *  @property [target_group_id] Group ID.
 *  @property [name] New name of the target group — a string up to 64 characters long.
 *  @property [domain] Domain of the site where user accounting code will be placed.
 *  @property [lifetime] 'Only for the groups that get audience from sites with user accounting code.', Time in days when users added to a retarget group will be automatically excluded from it. '0' – automatic exclusion is off.
 */
class AdsUpdateTargetGroupMethod() : VkMethod<Boolean>(
    "ads.updateTargetGroup",
    HashMap()
) {

    var accountId: Long? by props
    var clientId: Long? by props
    var targetGroupId: Long? by props
    var name: String? by props
    var domain: String? by props
    var lifetime: Long? by props

    constructor(
        accountId: Long? = null,
        clientId: Long? = null,
        targetGroupId: Long? = null,
        name: String? = null,
        domain: String? = null,
        lifetime: Long? = null
    ) : this() {
        this.accountId = accountId
        this.clientId = clientId
        this.targetGroupId = targetGroupId
        this.name = name
        this.domain = domain
        this.lifetime = lifetime
    }

    fun setAccountId(accountId: Long): AdsUpdateTargetGroupMethod {
        this.accountId = accountId
        return this
    }

    fun setClientId(clientId: Long): AdsUpdateTargetGroupMethod {
        this.clientId = clientId
        return this
    }

    fun setTargetGroupId(targetGroupId: Long): AdsUpdateTargetGroupMethod {
        this.targetGroupId = targetGroupId
        return this
    }

    fun setName(name: String): AdsUpdateTargetGroupMethod {
        this.name = name
        return this
    }

    fun setDomain(domain: String): AdsUpdateTargetGroupMethod {
        this.domain = domain
        return this
    }

    fun setLifetime(lifetime: Long): AdsUpdateTargetGroupMethod {
        this.lifetime = lifetime
        return this
    }

    override val classRef = AdsUpdateTargetGroupMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
