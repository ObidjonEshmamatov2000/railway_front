package com.mafia.railway_front.service;



import com.mafia.railway_front.model.response.ApiResponse;
import org.springframework.stereotype.Service;


@Service
public interface BaseService <T>{

    String BASE_URL = "http://192.168.43.24:8080";

    //USER
    String ADD_USER_URL = "/api/user/add";
    String EDIT_USER_URL = "/api/user/edit";
    String DELETE_USER_URL = "/api/user/delete";
    String GET_USER_URL = "/api/user/list";

    //CONNECTION
    String ADD_CONNECTION_URL = "/api/connection/add";
    String EDIT_CONNECTION_URL = "/api/connection/edit";
    String DELETE_CONNECTION_URL = "/api/connection/delete";
    String GET_CONNECTION_URL = "/api/connection/list";

    //RAILWAY_CONNECTION
    String ADD_RAILWAY_CONNECTION_URL = "/api/railway_connection/add";
    String EDIT_RAILWAY_CONNECTION_URL = "/api/railway_connection/edit";
    String DELETE_RAILWAY_CONNECTION_URL = "/api/railway_connection/delete";
    String GET_RAILWAY_CONNECTION_URL = "/api/railway_connection/list";

    //RAILWAY
    String ADD_RAILWAY_URL = "/api/railway/add";
    String EDIT_RAILWAY_URL = "/api/railway/edit";
    String DELETE_RAILWAY_URL = "/api/railway/delete";
    String GET_RAILWAY_URL = "/api/railway/list";

    //TICKET
    String ADD_TICKET_URL = "/api/ticket/add";
    String EDIT_TICKET_URL = "/api/ticket/edit";
    String DELETE_TICKET_URL = "/api/ticket/delete";
    String GET_TICKET_URL = "/api/ticket/list";

    //TRAIN
    String ADD_TRAIN_URL = "/api/train/add";
    String EDIT_TRAIN_URL = "/api/train/edit";
    String DELETE_TRAIN_URL = "/api/train/delete";
    String GET_TRAIN_URL = "/api/train/list";

    //WAGON
    String ADD_WAGON_URL = "/api/wagon/add";
    String EDIT_WAGON_URL = "/api/wagon/edit";
    String DELETE_WAGON_URL = "/api/wagon/delete";
    String GET_WAGON_URL = "/api/wagon/list";



    public ApiResponse add(T t);
    public ApiResponse list();
    public ApiResponse get(Long id);
    public ApiResponse update(Long id,T t);
    public ApiResponse delete(Long id);
}
