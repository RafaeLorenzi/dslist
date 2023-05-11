package com.lorenzi.dslist.repositories;

import com.lorenzi.dslist.entities.Game;
import com.lorenzi.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
