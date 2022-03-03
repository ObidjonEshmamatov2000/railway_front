package com.mafia.railway_front.controller.railway;


import com.mafia.railway_api.model.receive.RailwayReceiveDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uz.mafia.railway_frontend.controller.BaseController;
import uz.mafia.railway_frontend.service.RailwayService;


@RequiredArgsConstructor
@RequestMapping("api/railway")
public class RailwayController implements BaseController< RailwayReceiveDTO > {
    private final RailwayService railwayService;

    @PostMapping("/add")
    @Override
    public String add(Model model, RailwayReceiveDTO railwayReceiveDTO) {
        return null;
    }

    @GetMapping("/list")
    @Override
    public String list(Model model) {
        return null;
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
