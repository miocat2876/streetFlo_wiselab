package com.streetflo.miocat.service.rest.impl;


import com.streetflo.miocat.dao.rest.ReviewPopupWordAbverbMapper;
import com.streetflo.miocat.dto.rest.WordAbverbDto;
import com.streetflo.miocat.service.rest.ReviewPopupWordAbverbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewPopupWordAbverbServiceImpl implements ReviewPopupWordAbverbService {

    @Autowired
    private ReviewPopupWordAbverbMapper reviewPopupWordAbverb;

    public List<WordAbverbDto> reviewPopupWordAbverbFind(WordAbverbDto dto) {
        return reviewPopupWordAbverb.reviewPopupWordAbverbFind(dto);
    }
}