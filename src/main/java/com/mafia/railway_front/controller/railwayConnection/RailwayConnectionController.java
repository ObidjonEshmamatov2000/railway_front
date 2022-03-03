package com.mafia.railway_front.controller.railwayConnection;



import com.mafia.railway_front.controller.BaseController;
import com.mafia.railway_front.model.receive.RailwayConnectionReceiveDTO;
import com.mafia.railway_front.model.receive.UserReceiveDTO;
import com.mafia.railway_front.model.response.ApiResponse;
import com.mafia.railway_front.service.RailwayConnectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RequestMapping("api/railway-connection")
public class RailwayConnectionController implements BaseController< RailwayConnectionReceiveDTO > {

    @Autowired
    private  final RailwayConnectionService railwayConnectionService;

    @PostMapping("/add")
    @Override
    public String add(Model model, RailwayConnectionReceiveDTO railwayConnectionReceiveDTO) {
        ApiResponse apiResponse = railwayConnectionService.add(railwayConnectionReceiveDTO);
        list(model);
        return "index";
    }

    @GetMapping("/list")
    @Override
    public String list(Model model) {
        ApiResponse apiResponse = railwayConnectionService.list();
        List< RailwayConnectionReceiveDTO > list = (List<RailwayConnectionReceiveDTO>) apiResponse.getData();
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
    public String update(Model model,Long id, RailwayConnectionReceiveDTO railwayConnectionReceiveDTO) {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public String delete(Model model,Long id) {
        return null;
    }
}
