package kosa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kosa.model.Board;
import kosa.model.BoardDao;

@Controller
public class BoardController {

	@Autowired
	private BoardDao dao;

	@GetMapping("/board_insert")
	public String board_form() {
		return "insert_form";
	}

	@PostMapping("/board_insert")
	public String board_insert(Board board) {
		dao.insertBoard(board);
		return "redirect:board_list";
	}

	@GetMapping("/board_list")
	public String board_list(Model model) {
		List<Board> list = dao.listBoard();
		model.addAttribute("list", list);
		return "list";
	}


	 @RequestMapping("/board_detail{seq}")
	   public String board_detail(Model model,@PathVariable int seq) {
	      Board board = dao.detailBoard(seq);
	      model.addAttribute("board", board);
	      
	      return "detail";
	   }
}
