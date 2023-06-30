package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.Alein;
import com.example.demo.dao.aleinrepo;

@RestController
public class AleinController 
{
	@Autowired
	aleinrepo arepo;
	
//	@RequestMapping("home")
//	public ModelAndView home( @RequestParam("name") String aname)
//	{
//		ModelAndView mv=new  ModelAndView();
//		mv.addObject("name",aname);
//		mv.setViewName("home");
//		return mv;
//	}
	@RequestMapping("/home")
	public ModelAndView homeAlien(Alein alien)
	{
		ModelAndView mv=new  ModelAndView();
		mv.addObject("name",alien);
		mv.setViewName("home");
		return mv;
	}
	@RequestMapping("/addAlien")
	public String addAlien(Alein alien)
	{
		arepo.save(alien);
		return "home";
	}
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int ano)
	{
		ModelAndView mv=new  ModelAndView("showAlein.jsp");
		Alein alein =arepo.findById(ano).orElse(new Alein());
		System.out.print(mv.addObject(alein));
		System.out.print(arepo.findByaname("Singhal"));
		System.out.print(arepo.findByanoGreaterThan(102));
		System.out.print(arepo.findByanameSorted("Singhal"));
		mv.addObject(alein);
		return mv;
	}
//	@RequestMapping(path= "/aliens", produces= {"application/xml"})
//	@ResponseBody
//	public List<Alein> getAlien()
//	{
//		
//		return arepo.findAll();
//	}
	
//	@PostMapping(path= "/alien", consumes= {"application/json"})
//	public Alein addAlienUsingPost(@RequestBody Alein alein)
//	{
//		arepo.save(alein);
//		return alein;
//	}
	
	@RequestMapping("/alien/102")
	public Optional<Alein> getAlienbyPerticularId()
	{
		
		return arepo.findById(102);
	}
	
	@RequestMapping("/alien/Akhilesh")
	public List<Alein> getAlienbyPerticularaname()
	{
		
		return arepo.findByaname("Akhilesh");
	}
	
	@RequestMapping("/alien/{ano}")
	public Optional<Alein> getAlienById(@PathVariable("ano") int ano)
	{
		
		return arepo.findById(ano);
	}
	
	@RequestMapping(path= "/alien")
	public List<Alein> getAlien()
	{
		
		return arepo.findAll();
	}
	@PostMapping(path= "/alien")
	public Alein addAlienUsingPost(@RequestBody Alein alein)
	{
		arepo.save(alein);
		return alein;
	}
	@DeleteMapping(path= "/alien/{ano}")
	public String deleteAlien(@PathVariable int ano)
	{
		Alein a= arepo.getOne(ano);
		arepo.delete(a);
		return "Deleted";
	}
	@PutMapping(path= "/alien")
	public Alein saveandUpdateAlien(@RequestBody Alein alein)
	{
				arepo.save(alein);
		return alein;
	}
}
