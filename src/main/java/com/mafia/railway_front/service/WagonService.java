package com.mafia.railway_front.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.mafia.railway_api.model.receive.WagonReceiveDTO;
import com.mafia.railway_api.model.response.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
@RequiredArgsConstructor
public class WagonService implements BaseService< WagonReceiveDTO > {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    ObjectMapper objectMapper;
    @Autowired Gson gson;

    @Override
    public ApiResponse add(WagonReceiveDTO wagonReceiveDTO) {
        String response
                = restTemplate.postForObject(BASE_URL + ADD_WAGON_URL, wagonReceiveDTO, String.class);

        try {
            return objectMapper.readValue(response, ApiResponse.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ApiResponse list() {
        String response = restTemplate.getForObject(BASE_URL + GET_WAGON_URL, String.class);
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
    public ApiResponse update(Long id, WagonReceiveDTO wagonReceiveDTO) {
        return null;
    }

    @Override
    public ApiResponse delete(Long id) {
        return null;
    }
}