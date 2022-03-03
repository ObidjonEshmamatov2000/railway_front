package com.mafia.railway_front.controller.user;
import com.mafia.railway_front.controller.BaseController;
import com.mafia.railway_front.entity.user.UserEntity;
import com.mafia.railway_front.model.receive.UserReceiveDTO;
import com.mafia.railway_front.model.response.ApiResponse;
import com.mafia.railway_front.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/user")
@RequiredArgsConstructor
public class UserController implements BaseController< UserReceiveDTO > {

    @Autowired
   private final UserService userService;

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
        List< UserEntity> list = (List<UserEntity>) apiResponse.getData();
        System.out.println(list.get(0).getEmail());
        model.addAttribute("status", apiResponse.getStatusCode());
        model.addAttribute("message", apiResponse.getMessage());
        model.addAttribute("list", list);
        return "";
    }

    @GetMapping("/get/{id}")
    @Override
    public String get(Model model,Long id) {
        ApiResponse apiResponse = userService.get(id);
        List< UserEntity > list = (List<UserEntity>) apiResponse.getData();
        model.addAttribute("status", apiResponse.getStatusCode());
        model.addAttribute("message", apiResponse.getMessage());
        model.addAttribute("list", list);
        return "index";
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
