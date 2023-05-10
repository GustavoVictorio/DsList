package com.guvictorio.dslist.services;

import com.guvictorio.dslist.dto.GameDTO;
import com.guvictorio.dslist.dto.GameMinDTO;
import com.guvictorio.dslist.entities.Game;
import com.guvictorio.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = repository.findById(id).get();
        return new GameDTO(result);
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = repository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
