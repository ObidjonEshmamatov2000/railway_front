package com.mafia.railway_front.controller.ticket;
import com.mafia.railway_api.model.receive.TicketReceiveDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uz.mafia.railway_frontend.controller.BaseController;
import uz.mafia.railway_frontend.service.TicketService;


@RequiredArgsConstructor
@RequestMapping("api/ticket")
public class TicketController implements BaseController< TicketReceiveDTO > {
    private  final TicketService ticketService;

    @PostMapping("/add")
    @Override
    public String add(Model model, TicketReceiveDTO ticketReceiveDTO) {
        return null;
    }

    @GetMapping("/list")
    @Override
    public String list(Model model) {
        return null;
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
