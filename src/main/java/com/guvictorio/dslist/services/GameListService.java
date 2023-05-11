package com.guvictorio.dslist.services;

import com.guvictorio.dslist.dto.GameListDTO;
import com.guvictorio.dslist.entities.GameList;
import com.guvictorio.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository repository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = repository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
