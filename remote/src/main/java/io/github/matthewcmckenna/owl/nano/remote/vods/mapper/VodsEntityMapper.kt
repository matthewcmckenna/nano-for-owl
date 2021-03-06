package io.github.matthewcmckenna.owl.nano.remote.vods.mapper

import io.github.matthewcmckenna.owl.nano.data.model.VodsEntity
import io.github.matthewcmckenna.owl.nano.domain.model.VodsModel
import io.github.matthewcmckenna.owl.nano.remote.mapper.EntityMapper
import io.github.matthewcmckenna.owl.nano.remote.vods.model.DataItem
import io.github.matthewcmckenna.owl.nano.remote.vods.model.VideoAssetsItem
import javax.inject.Inject

/**
 * Map a [VodsModel] to and from a [VodsEntity] instance when data is moving between
 * this later and the Data layer
 */
open class VodsEntityMapper @Inject constructor() : EntityMapper<DataItem, VodsEntity> {

    /**
     * Map an instance of a [VodsModel] to a [VodsEntity] model
     */
    override fun mapFromRemote(type: DataItem): VodsEntity {
        return VodsEntity(type.title!!, type.thumbnail!!, type.status!!, getProperStreamLink(type.videoAssets!!))
    }

    private fun getProperStreamLink(videoAssets: List<VideoAssetsItem?>): String {
        val streamLink = videoAssets
                .first { it?.sourceUrl?.endsWith(".m3u8") == true }
                ?.sourceUrl
                .orEmpty()

        return when {
            streamLink.isNotBlank() -> "https:$streamLink"
            else -> ""
        }
    }
}
