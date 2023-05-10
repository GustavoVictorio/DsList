package com.guvictorio.dslist.controllers;

import com.guvictorio.dslist.dto.GameListDTO;
import com.guvictorio.dslist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService service;

    @GetMapping
    public List<GameListDTO> findall() {
        List<GameListDTO> result = service.findAll();
        return result;
    }
}
