package com.mafia.railway_front.controller.railway;



import com.mafia.railway_front.controller.BaseController;
import com.mafia.railway_front.model.receive.RailwayReceiveDTO;
import com.mafia.railway_front.model.receive.UserReceiveDTO;
import com.mafia.railway_front.model.response.ApiResponse;
import com.mafia.railway_front.service.RailwayService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("api/railway")
public class RailwayController implements BaseController< RailwayReceiveDTO > {

    @Autowired
    private final RailwayService railwayService;

    @PostMapping("/add")
    @Override
    public String add(Model model, RailwayReceiveDTO railwayReceiveDTO) {
        ApiResponse apiResponse = railwayService.add(railwayReceiveDTO);
        list(model);
        return "index";
    }

    @GetMapping("/list")
    @Override
    public String list(Model model) {
        ApiResponse apiResponse = railwayService.list();
        List< RailwayReceiveDTO > list = (List<RailwayReceiveDTO>) apiResponse.getData();
        model.addAttribute("status", apiResponse.getStatusCode());
        model.addAttribute("message", apiResponse.getMessage());
        model.addAttribute("list", list);
        return "index";
    }

    @GetMapping("/get/{id}")
    @Override
    public String get(Model model,Long id, RailwayReceiveDTO railwayReceiveDTO) {
        return null;
    }

    @PutMapping("/update/{id}")
    @Override
    public String update(Model model,Long id, RailwayReceiveDTO railwayReceiveDTO) {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public String delete(Model model,Long id) {
        return null;
    }
}
