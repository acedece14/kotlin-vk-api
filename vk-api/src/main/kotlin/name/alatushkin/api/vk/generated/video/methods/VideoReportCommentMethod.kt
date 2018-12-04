package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.common.Reason

/**
 *  Reports (submits a complaint about) a comment on a video.
 *
 *  [https://vk.com/dev/video.reportComment]
 *  @property [owner_id] ID of the user or community that owns the video.
 *  @property [comment_id] ID of the comment being reported.
 *  @property [reason] Reason for the complaint: , 0 – spam , 1 – child pornography , 2 – extremism , 3 – violence , 4 – drug propaganda , 5 – adult material , 6 – insult, abuse
 */
class VideoReportCommentMethod() : VkMethod<Boolean>(
    "video.reportComment",
    HashMap()
) {

    var ownerId: Long? by props
    var commentId: Long? by props
    var reason: Reason? by props

    constructor(
        ownerId: Long? = null,
        commentId: Long? = null,
        reason: Reason? = null
    ) : this() {
        this.ownerId = ownerId
        this.commentId = commentId
        this.reason = reason
    }

    fun setOwnerId(ownerId: Long): VideoReportCommentMethod {
        this.ownerId = ownerId
        return this
    }

    fun setCommentId(commentId: Long): VideoReportCommentMethod {
        this.commentId = commentId
        return this
    }

    fun setReason(reason: Reason): VideoReportCommentMethod {
        this.reason = reason
        return this
    }

    override val classRef = VideoReportCommentMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
