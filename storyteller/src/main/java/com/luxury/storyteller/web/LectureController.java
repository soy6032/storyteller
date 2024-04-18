package com.luxury.storyteller.web;

import com.luxury.storyteller.dto.CommunityDto;
import com.luxury.storyteller.service.community.CommunityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/lecture")
public class LectureController {

    private final CommunityService communityService;

    @GetMapping("/")
    public String retrieveSiteList() {

        List<CommunityDto> list = communityService.findCommunityListAll();
        System.out.println("=============== : "+list.size());

        return "login";
    }
}