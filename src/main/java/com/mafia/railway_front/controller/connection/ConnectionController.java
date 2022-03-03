package com.mafia.railway_front.controller.connection;



import com.mafia.railway_front.controller.BaseController;
import com.mafia.railway_front.model.receive.ConnectionReceiveDTO;
import com.mafia.railway_front.model.receive.UserReceiveDTO;
import com.mafia.railway_front.model.response.ApiResponse;
import com.mafia.railway_front.service.ConnectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequiredArgsConstructor
@RequestMapping("api/connection")
public class ConnectionController implements BaseController< ConnectionReceiveDTO > {
    private final ConnectionService connectionService;

    @PostMapping("/add")
    @Override
    public String add(Model model,ConnectionReceiveDTO connectionReceiveDTO) {
        ApiResponse apiResponse = connectionService.add(connectionReceiveDTO);
        list(model);
        return "index";
    }

    @GetMapping("/list")
    @Override
    public String list(Model model) {
        ApiResponse apiResponse = connectionService.list();
        List< ConnectionReceiveDTO > list = (List<ConnectionReceiveDTO>) apiResponse.getData();
        model.addAttribute("status", apiResponse.getStatusCode());
        model.addAttribute("message", apiResponse.getMessage());
        model.addAttribute("list", list);
        return "index";
    }

    @GetMapping("/get/{id}")
    @Override
    public String get(Model model,Long id) {
        return null;
    }

    @PutMapping("/update/{id}")
    @Override
    public String update(Model model,Long id, ConnectionReceiveDTO connectionReceiveDTO) {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public String delete(Model model,Long id) {
        return null;
    }

}
