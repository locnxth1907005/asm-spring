package com.example.asmspring.controller;

import com.example.asmspring.dto.CountryDTO;
import com.example.asmspring.dto.RoadDTO;
import com.example.asmspring.entity.Country;
import com.example.asmspring.entity.Road;
import com.example.asmspring.repository.JPACountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/asm")
public class CountryController {
    @Autowired
    private JPACountryRepository jpaCountryRepository;


    @Deprecated
    @GetMapping(value = "/findAllCountry")
    public List<CountryDTO> findAll() {
        List<CountryDTO> countryDTOS = new ArrayList<CountryDTO>();
        List<Country> listCountry = jpaCountryRepository.findAll();
        listCountry.forEach(t -> {
            countryDTOS.add(new CountryDTO().countryDTO(t));
        });
        return countryDTOS;
    }
}