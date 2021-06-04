package com.example.asmspring.dto;

import com.example.asmspring.entity.Country;
import com.example.asmspring.entity.Road;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RoadDTO {
    private int roadId;
    private String roadName;
    private String createAt;
    private String description;
    private int status;


    private int countryId;
    private String countryName;


    public  RoadDTO roadDTO (Road road) {
        this.setRoadId(road.getId());
        this.setRoadName(road.getName());
        this.setCreateAt(road.getCreateAt());
        this.setDescription(road.getDescription());
        this.setStatus(road.getStatus());
        this.setCountryId(road.getCountryId());
        this.setCountryName(road.getCountry().getName());

        return this;
    }
}
