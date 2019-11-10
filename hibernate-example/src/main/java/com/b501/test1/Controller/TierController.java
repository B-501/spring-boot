package com.b501.test1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.b501.test1.DAO.Tier;
import com.b501.test1.Repository.TierRepository;

@Controller
@RequestMapping(path="/tier")
public class TierController {
		@Autowired
		private TierRepository tierRepository;

		@GetMapping(path="/add")
		public @ResponseBody String addNewLevel (@RequestParam String name) {
			
			Tier n = new Tier();
			n.setName(name);
			tierRepository.save(n);
			return "Saved";
		}

		@GetMapping(path="/all")
		public @ResponseBody Iterable<Tier> getAllTiers() {
			return tierRepository.findAll();
		}
}
