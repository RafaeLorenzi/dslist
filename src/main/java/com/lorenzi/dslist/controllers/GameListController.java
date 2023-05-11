package com.lorenzi.dslist.controllers;

import com.lorenzi.dslist.dto.GameDTO;
import com.lorenzi.dslist.dto.GameListDTO;
import com.lorenzi.dslist.dto.GameMinDTO;
import com.lorenzi.dslist.service.GameListService;
import com.lorenzi.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;



    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

}
