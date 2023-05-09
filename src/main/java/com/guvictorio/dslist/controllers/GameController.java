package com.guvictorio.dslist.controllers;

import com.guvictorio.dslist.dto.GameMinDTO;
import com.guvictorio.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping
    public List<GameMinDTO> findall() {
        List<GameMinDTO> result = service.findAll();
        return result;
    }
}
