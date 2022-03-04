package com.mafia.railway_front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @GetMapping("/index")
    public String goIndex() {
        return "index";
    }

    @GetMapping("/formComponent")
    public String goFormComponent() {
        return "form_component";
    }

    @GetMapping("/404html")
    public String go404html() {
        return "404";
    }

    @GetMapping("/basicTable")
    public String goBasicTable() {
        return "basic_table";
    }

    @GetMapping("/blank")
    public String goBlank() {
        return "blank";
    }

    @GetMapping("/buttons")
    public String goButtons() {
        return "buttons";
    }

    @GetMapping("/chartChartjs")
    public String goChart() {
        return "chart-chartjs";
    }

    @GetMapping("/contact")
    public String goContact() {
        return "contact";
    }

    @GetMapping("/formValidation")
    public String goFormValidation() {
        return "form_validation";
    }

    @GetMapping("/general")
    public String goGeneral() {
        return "general";
    }

    @GetMapping("/grids")
    public String goGrids() {
        return "grids";
    }

    @GetMapping("/profile")
    public String goProfile() {
        return "profile";
    }

    @GetMapping("/widgets")
    public String goWidgets() {
        return "widgets";
    }

    @GetMapping("/addRailway")
    public String addRailway() {
        return "addRailway";
    }

    @GetMapping("/addConnection")
    public String addConnection() {
        return "addConnection";
    }

    @GetMapping("/addRailwayConnection")
    public String addRailwayConnection() {
        return "addRailwayConnection";
    }

    @GetMapping("/addTrain")
    public String addTrain() {
        return "addTrain";
    }

    @GetMapping("/addWagon")
    public String addWagon() {
        return "addWagon";
    }
}
