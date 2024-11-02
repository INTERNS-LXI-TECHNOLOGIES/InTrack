package com.demo.interns.Controller;

import java.util.List;

import org.openapitools.client.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.interns.Entity.InternEntity;
import com.demo.interns.Service.InternService;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/rest/intern")
public class InternsController {

@Autowired
private InternService internService;

/*@GetMapping("/addInterns")
public String addInterns(Model model) {
    model.addAttribute("internEntity", new InternEntity());
    return "addintern"; 
}

*/

@GetMapping("/getAll")
public String getAll(Model model) throws ApiException {
    List<org.openapitools.client.model.InternEntity> interns = internService.searchIntern();
    model.addAttribute("interns", interns); 
    return "intern"; 
}

 
}