package com.example.login.controller;

import com.example.login.model.House;
import com.example.login.service.HouseService;
import com.example.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/houses")
public class HouseController {
    @Autowired
    private UserService userService;

    private HouseService houseService;

    @Autowired
    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    @GetMapping("/all")
    public String listHouse(Model model){
        Iterable<House> houses = houseService.findAll();
        model.addAttribute("houses",houses);
        return "house/listHouse";
    }

    @GetMapping("/addHouse")
    public String addHouse(Model model){
        model.addAttribute("house", new House());
        return "house/createHouse";
    }

    @PostMapping("/addHouse/")
    public String addedHouse(House house,Model model){
        houseService.save(house);
        model.addAttribute("house", new House());
        model.addAttribute("message","Success a new House");
        return "house/createHouse";
    }

    @GetMapping("/editHouse/{id}")
    public String getHouseById(@PathVariable("id") Long id, Model model){
        Optional<House> house = houseService.findById(id);
        if (!house.isPresent()){
           return "errors/access_denied";
        }else {
            model.addAttribute("house",house);
            return "house/editHouse";
        }
    }
    @PostMapping("/editHouse/")
    public String editedHouse(@ModelAttribute("house") House house, Model model){
        houseService.save(house);
        model.addAttribute("house",house);
        model.addAttribute("message","Update Successful the House! ");
        return "house/editHouse";
    }

    @GetMapping("/deleteHouse/{id}")
    public String deleteHouse(@PathVariable Long id, Model model){
        Optional<House> house = houseService.findById(id);

        if (house!=null){
            model.addAttribute("house",house);
            return "house/deleteHouse";
        }else {
            return "errors/access_denied";
        }
    }
    @PostMapping("/deleteHouse/")
    public String deletedHouse(@ModelAttribute("house") House house){
        houseService.remove(house.getId());
        return "home/index";
    }

    @GetMapping("/view/{id}/view")
    public String viewHouse(@PathVariable Long id, Model model){
        Optional<House> house = houseService.findById(id);
        model.addAttribute("house", house);
        return "house/viewHouse";
    }
}
