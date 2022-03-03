package com.mafia.railway_front.controller.wagon;

import com.mafia.railway_api.model.receive.WagonReceiveDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uz.mafia.railway_frontend.controller.BaseController;


@RequiredArgsConstructor
@RequestMapping("api/wagon")
public class WagonController implements BaseController< WagonReceiveDTO > {
    private final WagonController wagonController;

    @PostMapping("/add")
    @Override
    public String add(Model model, WagonReceiveDTO wagonReceiveDTO) {
        return null;
    }

    @GetMapping("/list")
    @Override
    public String list(Model model) {
        return null;
    }

    @GetMapping("/get/{id}")
    @Override
    public String get(Model model,Long id, WagonReceiveDTO wagonReceiveDTO) {
        return null;
    }

    @PutMapping("/update/{id}")
    @Override
    public String update(Model model,Long id, WagonReceiveDTO wagonReceiveDTO) {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public String delete(Model model,Long id) {
        return null;
    }
}
