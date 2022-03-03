package com.mafia.railway_front.entity.ticket;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mafia.railway_front.entity.BaseEntity;
import com.mafia.railway_front.entity.user.UserEntity;
import com.mafia.railway_front.entity.wagon.WagonEntity;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TicketEntity extends BaseEntity {
    private List< UserEntity > userEntity;
    private String passengerName;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private List< WagonEntity > wagonEntity;
    private int seatNumber;
    private double price;

    private boolean status;
}
