package com.mafia.railway_front.controller.user;


import com.mafia.railway_api.entity.user.UserModel;
import com.mafia.railway_api.model.receive.UserReceiveDTO;
import com.mafia.railway_api.model.response.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uz.mafia.railway_frontend.controller.BaseController;
import uz.mafia.railway_frontend.service.UserService;

import java.util.List;


@RequestMapping("/admin/user")
@RequiredArgsConstructor
public class UserController implements BaseController< UserReceiveDTO > {

    @Autowired
    UserService userService;

//    @PostMapping("/add")
//    public String addUser(Model model, @ModelAttribute UserReceiveDTO userReceiveDTO ) {
//        ApiResponse apiResponse = userService.add(userReceiveDTO);
//        getUser(model);
//        return "index";
//    }

//    @GetMapping("/list")
//    public String getUser( Model model
//    ){
//        ApiResponse apiResponse = userService.getUserList();
//        List< UserModel > list = (List<UserModel>) apiResponse.getData();
//        model.addAttribute("status", apiResponse.getStatusCode());
//        model.addAttribute("message", apiResponse.getMessage());
//        model.addAttribute("list", list);
//        return "index";
//    }



    @PostMapping("/add")
    @Override
    public String add(Model model,UserReceiveDTO userReceiveDTO) {
        ApiResponse apiResponse = userService.add(userReceiveDTO);
        list(model);
        return "index";
    }

    @GetMapping("/list")
    @Override
    public String list(Model model) {
        ApiResponse apiResponse = userService.list();
        List< UserModel > list = (List<UserModel>) apiResponse.getData();
        model.addAttribute("status", apiResponse.getStatusCode());
        model.addAttribute("message", apiResponse.getMessage());
        model.addAttribute("list", list);
        return "index";
    }

    @GetMapping("/get/{id}")
    @Override
    public String get(Model model,Long id, UserReceiveDTO userReceiveDTO) {
        return null;
    }

    @PutMapping("/update/{id}")
    @Override
    public String update(Model model,Long id, UserReceiveDTO userReceiveDTO) {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public String delete(Model model,Long id) {
        return null;
    }
}