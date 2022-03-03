package com.mafia.railway_front.service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.mafia.railway_api.model.receive.UserReceiveDTO;
import com.mafia.railway_api.model.response.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Service
public class UserService implements BaseService< UserReceiveDTO > {

    @Autowired
    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;
    private final Gson gson;

//    public ApiResponse addUser(UserReceiveDTO userReceiveDTO ){
//        String response
//                = restTemplate.postForObject(BASE_URL + ADD_USER_URL, userReceiveDTO, String.class);
//
//        try {
//            return objectMapper.readValue(response, ApiResponse.class);
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }

//    public ApiResponse getUserList(){
//        String response = restTemplate.getForObject(BASE_URL + GET_USER_URL, String.class);
//
//        try {
//            return gson.fromJson(response, ApiResponse.class);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }

    @Override
    public ApiResponse add(UserReceiveDTO userReceiveDTO) {
        String response
                = restTemplate.postForObject(BASE_URL + ADD_USER_URL, userReceiveDTO, String.class);

        try {
            return objectMapper.readValue(response, ApiResponse.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ApiResponse list() {
        String response = restTemplate.getForObject(BASE_URL + GET_USER_URL, String.class);

        try {
            return gson.fromJson(response, ApiResponse.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ApiResponse get(Long id) {
        return null;
    }

    @Override
    public ApiResponse update(Long id, UserReceiveDTO userReceiveDTO) {
        return null;
    }

    @Override
    public ApiResponse delete(Long id) {
        return null;
    }


}
