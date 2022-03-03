package com.mafia.railway_front.controller.train;

import com.mafia.railway_api.model.receive.TrainReceiveDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uz.mafia.railway_frontend.controller.BaseController;
import uz.mafia.railway_frontend.service.TrainService;


@RequiredArgsConstructor
@RequestMapping("api/train")
public class TrainController implements BaseController< TrainReceiveDTO > {
    private final TrainService trainService;


    @PostMapping("/add")
    @Override
    public String add(Model model,TrainReceiveDTO trainReceiveDTO) {
        return null;
    }

    @GetMapping("/list")
    @Override
    public String list(Model model) {
        return null;
    }

    @GetMapping("/get/{id}")
    @Override
    public String get(Model model,Long id, TrainReceiveDTO trainReceiveDTO) {
        return null;
    }

    @PutMapping("/update/{id}")
    @Override
    public String update(Model model,Long id, TrainReceiveDTO trainReceiveDTO) {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public String delete(Model model,Long id) {
        return null;
    }
}
