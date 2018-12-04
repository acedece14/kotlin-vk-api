package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.ads.CreateTargetGroupResponse

/**
 *  Creates a group to re-target ads for users who visited advertiser's site (viewed information about the product, registered, etc.).
 *
 *  [https://vk.com/dev/ads.createTargetGroup]
 *  @property [account_id] Advertising account ID.
 *  @property [client_id] 'Only for advertising agencies.', ID of the client with the advertising account where the group will be created.
 *  @property [name] Name of the target group — a string up to 64 characters long.
 *  @property [domain] Domain of the site where user accounting code will be placed.
 *  @property [lifetime] 'For groups with auditory created with pixel code only.', , Number of days after that users will be automatically removed from the group. '0' — not to remove users.
 */
class AdsCreateTargetGroupMethod() : VkMethod<CreateTargetGroupResponse>(
    "ads.createTargetGroup",
    HashMap()
) {

    var accountId: Long? by props
    var clientId: Long? by props
    var name: String? by props
    var domain: String? by props
    var lifetime: Long? by props

    constructor(
        accountId: Long? = null,
        clientId: Long? = null,
        name: String? = null,
        domain: String? = null,
        lifetime: Long? = null
    ) : this() {
        this.accountId = accountId
        this.clientId = clientId
        this.name = name
        this.domain = domain
        this.lifetime = lifetime
    }

    fun setAccountId(accountId: Long): AdsCreateTargetGroupMethod {
        this.accountId = accountId
        return this
    }

    fun setClientId(clientId: Long): AdsCreateTargetGroupMethod {
        this.clientId = clientId
        return this
    }

    fun setName(name: String): AdsCreateTargetGroupMethod {
        this.name = name
        return this
    }

    fun setDomain(domain: String): AdsCreateTargetGroupMethod {
        this.domain = domain
        return this
    }

    fun setLifetime(lifetime: Long): AdsCreateTargetGroupMethod {
        this.lifetime = lifetime
        return this
    }

    override val classRef = AdsCreateTargetGroupMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<CreateTargetGroupResponse>>() {}
    }
}
