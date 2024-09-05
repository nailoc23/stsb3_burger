package com.touzone.stsb.controller;

import com.touzone.stsb.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/board")
    public String board(Model model) throws Exception{

        int total = boardService.getBoardCount();

        model.addAttribute("boardcnt", total);

        return "board";
    }
}
