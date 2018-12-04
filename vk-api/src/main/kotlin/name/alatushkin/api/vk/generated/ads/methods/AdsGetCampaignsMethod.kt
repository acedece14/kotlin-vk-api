package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.ads.Campaign

/**
 *  Returns a list of campaigns in an advertising account.
 *
 *  [https://vk.com/dev/ads.getCampaigns]
 *  @property [account_id] Advertising account ID.
 *  @property [client_id] 'For advertising agencies'. ID of the client advertising campaigns are retrieved from.
 *  @property [include_deleted] Flag that specifies whether archived ads shall be shown. *0 — show only active campaigns,, *1 — show all campaigns.
 *  @property [campaign_ids] Filter of advertising campaigns to show. Serialized JSON array with campaign IDs. Only campaigns that exist in 'campaign_ids' and belong to the specified advertising account will be shown. If the parameter is null, all campaigns will be shown.
 */
class AdsGetCampaignsMethod() : VkMethod<Array<Campaign>>(
    "ads.getCampaigns",
    HashMap()
) {

    var accountId: Long? by props
    var clientId: Long? by props
    var includeDeleted: Boolean? by props
    var campaignIds: String? by props

    constructor(
        accountId: Long? = null,
        clientId: Long? = null,
        includeDeleted: Boolean? = null,
        campaignIds: String? = null
    ) : this() {
        this.accountId = accountId
        this.clientId = clientId
        this.includeDeleted = includeDeleted
        this.campaignIds = campaignIds
    }

    fun setAccountId(accountId: Long): AdsGetCampaignsMethod {
        this.accountId = accountId
        return this
    }

    fun setClientId(clientId: Long): AdsGetCampaignsMethod {
        this.clientId = clientId
        return this
    }

    fun setIncludeDeleted(includeDeleted: Boolean): AdsGetCampaignsMethod {
        this.includeDeleted = includeDeleted
        return this
    }

    fun setCampaignIds(campaignIds: String): AdsGetCampaignsMethod {
        this.campaignIds = campaignIds
        return this
    }

    override val classRef = AdsGetCampaignsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Array<Campaign>>>() {}
    }
}
