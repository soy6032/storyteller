package com.luxury.storyteller.service.community;

import com.luxury.storyteller.dto.CommunityDto;
import com.luxury.storyteller.mapper.CommunityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommunityServiceImpl implements CommunityService{

    private final CommunityMapper communityMapper;

    @Override
    public List<CommunityDto> findCommunityListAll() {
        return communityMapper.findCommunityListAll();
    }

    @Override
    public CommunityDto findCommunityByCommunityIdx(int communityIdx) {
        return communityMapper.findCommunityByCommunityIdx(communityIdx);
    }

    @Override
    public int createCommunity(CommunityDto communityDto) {
        return communityMapper.createCommunity(communityDto);
    }

    @Override
    public int modifyCommunity(CommunityDto communityDto) {
        return communityMapper.modifyCommunity(communityDto);
    }

    @Override
    public int deleteCommunity(int communityIdx) {
        return communityMapper.deleteCommunity(communityIdx);
    }

    @Override
    public CommunityDto lastCommunity() {
        return communityMapper.lastCommunity();
    }
}