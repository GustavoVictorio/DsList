package com.guvictorio.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_belonging")
public class Belonging {
    @EmbeddedId
    private BelongingPk id = new BelongingPk();
    private Integer position;
    public Belonging(Game game, GameList gameList, Integer position){
        id.setGame(game);
        id.setGameList(gameList);
        this.position = position;
    }

}
