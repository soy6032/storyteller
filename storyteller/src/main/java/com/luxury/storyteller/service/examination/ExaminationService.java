package com.luxury.storyteller.service.examination;

import com.luxury.storyteller.dto.ExaminationDto;

import java.util.List;

public interface ExaminationService {
    /**
     * 전체 쳅터 목록
     */
    List<ExaminationDto> findExaminationChapterAll();

    /**
     * 과목 목록
     */
    List<ExaminationDto> findExaminationMajorAll();

    /**
     * 과목의 챕터 목록
     */
    List<ExaminationDto> findExaminationChapterByExaminationMajorIdx(int examinationMajorIdx);

    /**
     * 챕터의 번호별 문제
     */
    List<ExaminationDto> findExaminationSelectByChapter(ExaminationDto examinationDto);

    /**
     * 챕터 모든 문제
     */
    List<ExaminationDto> findExaminationByChapter(int examinationChapterIdx);





}
