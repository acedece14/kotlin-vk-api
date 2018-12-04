package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.account.SaveProfileInfoBdateVisibility
import name.alatushkin.api.vk.generated.account.SaveProfileInfoRelation
import name.alatushkin.api.vk.generated.account.SaveProfileInfoResponse
import name.alatushkin.api.vk.generated.account.SaveProfileInfoSex

/**
 *  Edits current profile info.
 *
 *  [https://vk.com/dev/account.saveProfileInfo]
 *  @property [first_name] User first name.
 *  @property [last_name] User last name.
 *  @property [maiden_name] User maiden name (female only)
 *  @property [screen_name] User screen name.
 *  @property [cancel_request_id] ID of the name change request to be canceled. If this parameter is sent, all the others are ignored.
 *  @property [sex] User sex. Possible values: , * '1' – female,, * '2' – male.
 *  @property [relation] User relationship status. Possible values: , * '1' – single,, * '2' – in a relationship,, * '3' – engaged,, * '4' – married,, * '5' – it's complicated,, * '6' – actively searching,, * '7' – in love,, * '0' – not specified.
 *  @property [relation_partner_id] ID of the relationship partner.
 *  @property [bdate] User birth date, format: DD.MM.YYYY.
 *  @property [bdate_visibility] Birth date visibility. Returned values: , * '1' – show birth date,, * '2' – show only month and day,, * '0' – hide birth date.
 *  @property [home_town] User home town.
 *  @property [country_id] User country.
 *  @property [city_id] User city.
 *  @property [status] Status text.
 */
class AccountSaveProfileInfoMethod() : VkMethod<SaveProfileInfoResponse>(
    "account.saveProfileInfo",
    HashMap()
) {

    var firstName: String? by props
    var lastName: String? by props
    var maidenName: String? by props
    var screenName: String? by props
    var cancelRequestId: Long? by props
    var sex: SaveProfileInfoSex? by props
    var relation: SaveProfileInfoRelation? by props
    var relationPartnerId: Long? by props
    var bdate: String? by props
    var bdateVisibility: SaveProfileInfoBdateVisibility? by props
    var homeTown: String? by props
    var countryId: Long? by props
    var cityId: Long? by props
    var status: String? by props

    constructor(
        firstName: String? = null,
        lastName: String? = null,
        maidenName: String? = null,
        screenName: String? = null,
        cancelRequestId: Long? = null,
        sex: SaveProfileInfoSex? = null,
        relation: SaveProfileInfoRelation? = null,
        relationPartnerId: Long? = null,
        bdate: String? = null,
        bdateVisibility: SaveProfileInfoBdateVisibility? = null,
        homeTown: String? = null,
        countryId: Long? = null,
        cityId: Long? = null,
        status: String? = null
    ) : this() {
        this.firstName = firstName
        this.lastName = lastName
        this.maidenName = maidenName
        this.screenName = screenName
        this.cancelRequestId = cancelRequestId
        this.sex = sex
        this.relation = relation
        this.relationPartnerId = relationPartnerId
        this.bdate = bdate
        this.bdateVisibility = bdateVisibility
        this.homeTown = homeTown
        this.countryId = countryId
        this.cityId = cityId
        this.status = status
    }

    fun setFirstName(firstName: String): AccountSaveProfileInfoMethod {
        this.firstName = firstName
        return this
    }

    fun setLastName(lastName: String): AccountSaveProfileInfoMethod {
        this.lastName = lastName
        return this
    }

    fun setMaidenName(maidenName: String): AccountSaveProfileInfoMethod {
        this.maidenName = maidenName
        return this
    }

    fun setScreenName(screenName: String): AccountSaveProfileInfoMethod {
        this.screenName = screenName
        return this
    }

    fun setCancelRequestId(cancelRequestId: Long): AccountSaveProfileInfoMethod {
        this.cancelRequestId = cancelRequestId
        return this
    }

    fun setSex(sex: SaveProfileInfoSex): AccountSaveProfileInfoMethod {
        this.sex = sex
        return this
    }

    fun setRelation(relation: SaveProfileInfoRelation): AccountSaveProfileInfoMethod {
        this.relation = relation
        return this
    }

    fun setRelationPartnerId(relationPartnerId: Long): AccountSaveProfileInfoMethod {
        this.relationPartnerId = relationPartnerId
        return this
    }

    fun setBdate(bdate: String): AccountSaveProfileInfoMethod {
        this.bdate = bdate
        return this
    }

    fun setBdateVisibility(bdateVisibility: SaveProfileInfoBdateVisibility): AccountSaveProfileInfoMethod {
        this.bdateVisibility = bdateVisibility
        return this
    }

    fun setHomeTown(homeTown: String): AccountSaveProfileInfoMethod {
        this.homeTown = homeTown
        return this
    }

    fun setCountryId(countryId: Long): AccountSaveProfileInfoMethod {
        this.countryId = countryId
        return this
    }

    fun setCityId(cityId: Long): AccountSaveProfileInfoMethod {
        this.cityId = cityId
        return this
    }

    fun setStatus(status: String): AccountSaveProfileInfoMethod {
        this.status = status
        return this
    }

    override val classRef = AccountSaveProfileInfoMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<SaveProfileInfoResponse>>() {}
    }
}
