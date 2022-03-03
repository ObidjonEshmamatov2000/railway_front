package com.mafia.railway_front.entity.wagon;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mafia.railway_front.entity.BaseEntity;
import com.mafia.railway_front.entity.ticket.TicketEntity;
import com.mafia.railway_front.entity.train.TrainEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class WagonEntity extends BaseEntity {

    private TrainEntity trainEntity;
    private WagonType wagonType;
    private int size;
    private int number;
    private double pricePerKM;
    private List< TicketEntity > ticketEntities;


}
