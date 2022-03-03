package com.mafia.railway_front.controller.ticket;

import com.mafia.railway_front.controller.BaseController;
import com.mafia.railway_front.model.receive.TicketReceiveDTO;
import com.mafia.railway_front.model.receive.UserReceiveDTO;
import com.mafia.railway_front.model.response.ApiResponse;
import com.mafia.railway_front.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RequestMapping("api/ticket")
public class TicketController implements BaseController< TicketReceiveDTO > {

    @Autowired
    private  final TicketService ticketService;

    @PostMapping("/add")
    @Override
    public String add(Model model, TicketReceiveDTO ticketReceiveDTO) {
        ApiResponse apiResponse = ticketService.add(ticketReceiveDTO);
        list(model);
        return "index";
    }

    @GetMapping("/list")
    @Override
    public String list(Model model) {
        ApiResponse apiResponse = ticketService.list();
        List< TicketReceiveDTO > list = (List<TicketReceiveDTO>) apiResponse.getData();
        model.addAttribute("status", apiResponse.getStatusCode());
        model.addAttribute("message", apiResponse.getMessage());
        model.addAttribute("list", list);
        return "index";
    }

    @GetMapping("/get/{id}")
    @Override
    public String get(Model model,Long id, TicketReceiveDTO ticketReceiveDTO) {
        return null;
    }

    @PutMapping("/update/{id}")
    @Override
    public String update(Model model,Long id, TicketReceiveDTO ticketReceiveDTO) {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public String delete(Model model,Long id) {
        return null;
    }
}
