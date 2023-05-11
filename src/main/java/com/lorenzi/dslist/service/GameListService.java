package com.lorenzi.dslist.service;

import com.lorenzi.dslist.dto.GameDTO;
import com.lorenzi.dslist.dto.GameListDTO;
import com.lorenzi.dslist.dto.GameMinDTO;
import com.lorenzi.dslist.entities.Game;
import com.lorenzi.dslist.entities.GameList;
import com.lorenzi.dslist.repositories.GameListRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;



    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();

    }

}
