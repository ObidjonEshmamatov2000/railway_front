package com.mafia.railway_front.controller.connection;


import com.mafia.railway_api.model.receive.ConnectionReceiveDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uz.mafia.railway_frontend.controller.BaseController;
import uz.mafia.railway_frontend.service.ConnectionService;


@RestController
@RequiredArgsConstructor
@RequestMapping("api/connection")
public class ConnectionController implements BaseController< ConnectionReceiveDTO > {
    @Autowired
    private final ConnectionService connectionService;

    @PostMapping("/add")
    @Override
    public String add(Model model,ConnectionReceiveDTO connectionReceiveDTO) {
        return null;
    }

    @GetMapping("/list")
    @Override
    public String list(Model model) {
        return null;
    }

    @GetMapping("/get/{id}")
    @Override
    public String get(Model model,Long id, ConnectionReceiveDTO connectionReceiveDTO) {
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
