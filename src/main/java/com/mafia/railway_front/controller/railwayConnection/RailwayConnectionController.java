package com.mafia.railway_front.controller.railwayConnection;


import com.mafia.railway_api.model.receive.RailwayConnectionReceiveDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uz.mafia.railway_frontend.controller.BaseController;
import uz.mafia.railway_frontend.service.RailwayConnectionService;


@RequiredArgsConstructor
@RequestMapping("api/railway-connection")
public class RailwayConnectionController implements BaseController< RailwayConnectionReceiveDTO > {

    private RailwayConnectionService railwayConnectionService;

    @PostMapping("/add")
    @Override
    public String add(Model model, RailwayConnectionReceiveDTO railwayConnectionReceiveDTO) {
        return null;
    }

    @GetMapping("/list")
    @Override
    public String list(Model model) {
        return null;
    }

    @GetMapping("/get/{id}")
    @Override
    public String get(Model model,Long id, RailwayConnectionReceiveDTO railwayConnectionReceiveDTO) {
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
