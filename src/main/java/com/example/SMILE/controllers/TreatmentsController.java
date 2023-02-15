package com.example.SMILE.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SMILE.models.Treatments;
import com.example.SMILE.services.TreatmentsService;

@RestController
@RequestMapping(path = "/api/treatments")

public class TreatmentsController {
    private Treatments service;
}
