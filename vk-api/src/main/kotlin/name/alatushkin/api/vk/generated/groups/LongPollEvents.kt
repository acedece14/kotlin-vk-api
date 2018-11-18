package name.alatushkin.api.vk.generated.groups


open class LongPollEvents(
    val messageNew: Boolean,
    val messageReply: Boolean,
    val photoNew: Boolean,
    val audioNew: Boolean,
    val videoNew: Boolean,
    val wallReplyNew: Boolean,
    val wallReplyEdit: Boolean,
    val wallReplyDelete: Boolean,
    val wallReplyRestore: Boolean,
    val wallPostNew: Boolean,
    val boardPostNew: Boolean,
    val boardPostEdit: Boolean,
    val boardPostRestore: Boolean,
    val boardPostDelete: Boolean,
    val photoCommentNew: Boolean,
    val photoCommentEdit: Boolean,
    val photoCommentDelete: Boolean,
    val photoCommentRestore: Boolean,
    val videoCommentNew: Boolean,
    val videoCommentEdit: Boolean,
    val videoCommentDelete: Boolean,
    val videoCommentRestore: Boolean,
    val marketCommentNew: Boolean,
    val marketCommentEdit: Boolean,
    val marketCommentDelete: Boolean,
    val marketCommentRestore: Boolean,
    val pollVoteNew: Boolean,
    val groupJoin: Boolean,
    val groupLeave: Boolean,
    val groupChangeSettings: Boolean,
    val groupChangePhoto: Boolean,
    val groupOfficersEdit: Boolean,
    val messageAllow: Boolean,
    val messageDeny: Boolean,
    val wallRepost: Boolean,
    val userBlock: Boolean,
    val userUnblock: Boolean,
    val messagesEdit: Boolean,
    val messageTypingState: Boolean,
    val leadFormsNew: Boolean? = null
)