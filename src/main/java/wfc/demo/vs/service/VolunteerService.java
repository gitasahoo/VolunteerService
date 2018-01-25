package wfc.demo.vs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import wfc.demo.vs.bootstrap.DataInitializer;
import wfc.demo.vs.domain.Volunteer;

public class VolunteerService {
	@Autowired
	DataInitializer initializer;

	public VolunteerService() {
		super();
		// this.initializer = initializer;
	}

	public List<String> findVolunteers(String servicename) {
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%");
		List<String> volnames = new ArrayList<String>();
		List<Volunteer> vols = initializer.vols;
		for (Volunteer vol : vols) {
			System.out.println(vol.getServices() + ":" + vol.getFirstname());
			if (vol.getServices().contains(servicename)) {
				volnames.add(vol.getFirstname() + " " + vol.getLastname());
			}

		}
		System.out.println("FFFFFFFFFFFFFFFFFF");

		return volnames;
	}

}
