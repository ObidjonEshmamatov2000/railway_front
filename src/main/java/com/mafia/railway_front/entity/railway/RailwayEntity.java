package com.mafia.railway_front.entity.railway;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mafia.railway_front.entity.BaseEntity;
import com.mafia.railway_front.entity.railwayConnection.RailwayConnectionEntity;
import com.mafia.railway_front.entity.train.TrainEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class RailwayEntity extends BaseEntity {

    private String fromStation;
    private String toStation;
    private List< RailwayConnectionEntity > railwayConnectionEntity;
    private List< TrainEntity > trainEntity;
}
