package com.lorenzi.dslist.repositories;

import com.lorenzi.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
