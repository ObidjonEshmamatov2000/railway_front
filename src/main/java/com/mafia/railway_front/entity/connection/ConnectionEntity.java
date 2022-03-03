package com.mafia.railway_front.entity.connection;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mafia.railway_front.entity.BaseEntity;
import com.mafia.railway_front.entity.railwayConnection.RailwayConnectionEntity;
import lombok.*;


import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConnectionEntity extends BaseEntity {

    private String station1;

    private String station2;

    private double distance;

    private double commuteCoefficient  ;
    private List< RailwayConnectionEntity > railwayConnectionEntities;


}
