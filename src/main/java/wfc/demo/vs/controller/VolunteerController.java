package wfc.demo.vs.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import wfc.demo.vs.domain.Volunteer;
import wfc.demo.vs.service.VolunteerService;

@RestController
public class VolunteerController {

	@RequestMapping("/")
	public String home() {
		return "Hello World from Volunteer application";
	}

	@RequestMapping(value = "/volunteers/{servicename}", method = RequestMethod.GET)
	public List<String> listVolunteers(@PathVariable("servicename") String servicename) {
		System.out.println("listVolunteers");
		VolunteerService service = new VolunteerService();
		return service.findVolunteers(servicename);

	}
}
