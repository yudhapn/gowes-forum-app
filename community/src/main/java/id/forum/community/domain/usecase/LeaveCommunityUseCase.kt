package id.forum.community.domain.usecase

import id.forum.community.domain.repository.CommunityRepository
import id.forum.core.community.domain.model.Community
import id.forum.core.data.Resource

class LeaveCommunityUseCase(private val communityRepository: CommunityRepository) {
    suspend fun execute(communityId: String, userId: String): Resource<Community> =
        communityRepository.leaveCommunity(communityId, userId)
}