package com.mafia.railway_front.controller.wagon;


import com.mafia.railway_front.controller.BaseController;
import com.mafia.railway_front.model.receive.UserReceiveDTO;
import com.mafia.railway_front.model.receive.WagonReceiveDTO;
import com.mafia.railway_front.model.response.ApiResponse;
import com.mafia.railway_front.service.WagonService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RequestMapping("api/wagon")
public class WagonController implements BaseController< WagonReceiveDTO > {
    @Autowired
    private final WagonService wagonService;

    @PostMapping("/add")
    @Override
    public String add(Model model, WagonReceiveDTO wagonReceiveDTO) {
        ApiResponse apiResponse = wagonService.add(wagonReceiveDTO);
        list(model);
        return "index";
    }

    @GetMapping("/list")
    @Override
    public String list(Model model) {
        ApiResponse apiResponse = wagonService.list();
        List< WagonReceiveDTO > list = (List<WagonReceiveDTO>) apiResponse.getData();
        model.addAttribute("status", apiResponse.getStatusCode());
        model.addAttribute("message", apiResponse.getMessage());
        model.addAttribute("list", list);
        return "index";
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
