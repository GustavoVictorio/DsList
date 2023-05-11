package com.guvictorio.dslist.dto;

import com.guvictorio.dslist.entities.GameList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO(GameList entity){
        id = entity.getId();
        name = entity.getName();
    }
}
