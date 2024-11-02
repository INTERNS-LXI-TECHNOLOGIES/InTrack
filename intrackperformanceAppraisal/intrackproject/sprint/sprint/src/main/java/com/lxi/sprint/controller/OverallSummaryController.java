package com.lxi.sprint.controller;


import com.lxi.sprint.model.OverallSummaryEntity;
import com.lxi.sprint.service.OverallSummaryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import com.lxi.sprint.model.OverallSummaryEntity;

@RestController
@RequestMapping("/overallsummary")
public class OverallSummaryController {

    private final OverallSummaryService overallSummaryService;

    @Autowired
    public OverallSummaryController(OverallSummaryService overallSummaryService) {
        this.overallSummaryService = overallSummaryService;
    }

    @PostMapping
    public ResponseEntity<OverallSummaryEntity> createOverallSummary(@RequestBody OverallSummaryEntity overallSummary) {
        OverallSummaryEntity savedSummary = overallSummaryService.saveOverallSummary(overallSummary);
        return ResponseEntity.ok(savedSummary);
    }

    @GetMapping("/{internId}")
    public ResponseEntity<OverallSummaryEntity> getOverallSummaryByInternId(@PathVariable Long internId) {
        Optional<OverallSummaryEntity> overallSummary = overallSummaryService.getOverallSummaryByInternId(internId);
        return overallSummary.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
