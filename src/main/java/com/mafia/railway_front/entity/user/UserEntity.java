package com.mafia.railway_front.entity.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mafia.railway_front.entity.BaseEntity;
import com.mafia.railway_front.entity.ticket.TicketEntity;
import lombok.*;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserEntity  extends BaseEntity {
    private UserRole userRole;
    private String name;
    private String passport;
    private String email;
    private String username;
    private Boolean IsActive=true;
    private String password;
    private List< TicketEntity > ticketEntity;


}
