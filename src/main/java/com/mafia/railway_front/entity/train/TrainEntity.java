package com.mafia.railway_front.entity.train;

import com.mafia.railway_front.entity.BaseEntity;
import com.mafia.railway_front.entity.railway.RailwayEntity;
import com.mafia.railway_front.entity.wagon.WagonEntity;

import java.time.LocalDateTime;
import java.util.List;

public class TrainEntity extends BaseEntity {

    private String name;

    private String number;
    private int speed;
    private RailwayEntity railwayEntity;
    private LocalDateTime startTime;
    private TrainStatus trainStatus;
    private List< WagonEntity > wagonEntity;
}
