package live.shuuyu.mirage.client

import live.shuuyu.mirage.client.core.MirageConfig
import net.fabricmc.api.ClientModInitializer

class MirageCore: ClientModInitializer {
    override fun onInitializeClient() {
        MirageConfig.initialize()
    }
}