package com.guvictorio.dslist.repositories;

import com.guvictorio.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
