package com.example.asmspring.controller;


import com.example.asmspring.dto.RoadDTO;
import com.example.asmspring.entity.Road;
import com.example.asmspring.service.RoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/asm")
public class RoadController {
    @Autowired
    private RoadService roadService;


    @PostMapping(value = "/createRoad")
    public RoadDTO save(@RequestBody Road road) {
        return roadService.createRoad(road);
    }

    @GetMapping(value = "/findAllRoad")
    public List<RoadDTO> findAll() {
        return roadService.findAll();

    }

    @GetMapping(value = "/searchByName/{roadname}/{countryname}")
    public List<RoadDTO> searchByName(@PathVariable String roadname, @PathVariable String countryname) {
        return roadService.searchbyName(roadname, countryname);
    }
}
