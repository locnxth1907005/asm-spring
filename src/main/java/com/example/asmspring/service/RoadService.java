package com.example.asmspring.service;

import com.example.asmspring.dto.CountryDTO;
import com.example.asmspring.dto.RoadDTO;
import com.example.asmspring.entity.Country;
import com.example.asmspring.entity.Road;
import com.example.asmspring.repository.JPACountryRepository;
import com.example.asmspring.repository.JPARoadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class RoadService {
    @Autowired
    public JPARoadRepository jpaRoadRepository;
    @Autowired
    public JPACountryRepository jpaCountryRepository;


    public RoadDTO createRoad(Road road) {

        Country country = jpaCountryRepository.getOne(road.getCountryId());
        road.setCountry(country);
        Road road1 = jpaRoadRepository.save(road);

        return new RoadDTO().roadDTO(road1);
    }

    public List<RoadDTO> findAll() {
        List<Road> listRoad = jpaRoadRepository.findAll();
        List<RoadDTO> roadDTOS = new ArrayList<RoadDTO>();
        listRoad.forEach(t -> {
            roadDTOS.add(new RoadDTO().roadDTO(t));
        });
        return roadDTOS;
    }

    public List<RoadDTO> searchbyName(String roadname, String countryname) {

        List<RoadDTO> roadDTOS = new ArrayList<RoadDTO>();
        List<Road> listRoad = jpaRoadRepository.searchbyName(roadname, countryname);
        listRoad.forEach(t -> {
            roadDTOS.add(new RoadDTO().roadDTO(t));
        });
        return roadDTOS;
    }
}
