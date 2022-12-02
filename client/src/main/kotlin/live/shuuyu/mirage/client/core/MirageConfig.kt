package live.shuuyu.mirage.client.core

import live.shuuyu.mirage.ui.MirageUI
import live.shuuyu.mirage.ui.data.Switch
import java.util.Locale

object MirageConfig: MirageUI("Mirage") {
    @Switch(
        name = "test", description = "test description", category = "test"
    )
    val switch = 1
}