package name.alatushkin.api.vk

import name.alatushkin.httpclient.httpClient
import java.io.FileInputStream
import java.nio.file.Paths
import java.util.*

val groupAccessToken = readConfigParam("groupAccessToken")
val userAccessToken = readConfigParam("userAccessToken")
val groupId = readConfigParam("groupId")
val peerId: Long = readConfigParam("peerId").toLong()


private fun readConfigParam(name: String): String {
    val testParams: Map<out Any, Any> =
        readPropsFrom("gradle.properties") ?: readPropsFrom("../gradle.properties")
        ?: System.getenv()

    return (testParams[name]?.toString()) ?: error("$name not found. provide it vias gradle.properties or env")


}

private fun readPropsFrom(strPath: String): Properties? {
    val path = Paths.get(strPath)
    val file = path.toAbsolutePath().toFile()
    if (!file.exists())
        return null

    FileInputStream(file).use { fis ->
        val props = Properties()
        props.load(fis)
        return props
    }
}

private val timeOut = 95
private val httpClient = httpClient(readTimeout = timeOut * 1000)
private val methodExecutor = MethodExecutorImpl(httpClient)
val groupTokenTestApi = methodExecutor.withToken(groupAccessToken).throwExceptionsOnError()
val userTokenTestApi = methodExecutor.withToken(userAccessToken).throwExceptionsOnError()