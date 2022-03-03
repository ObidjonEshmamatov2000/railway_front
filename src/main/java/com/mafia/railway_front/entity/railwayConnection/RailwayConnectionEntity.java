package com.mafia.railway_front.entity.railwayConnection;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mafia.railway_front.entity.BaseEntity;
import com.mafia.railway_front.entity.connection.ConnectionEntity;
import com.mafia.railway_front.entity.railway.RailwayEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class RailwayConnectionEntity extends BaseEntity {

    private RailwayEntity railwayEntity;
    private List< ConnectionEntity > connectionEntity;
    private boolean isFirst;
    private int ordering;


}
