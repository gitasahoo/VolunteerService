package wfc.demo.vs.bootstrap;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Scope;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import wfc.demo.vs.domain.Volunteer;
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
@Component
public class DataInitializer  {

	public  static List<Volunteer> vols = new ArrayList<Volunteer>();


	public DataInitializer() {
		super();
		System.out.println("Initializing data...");
		initializeData();
		// TODO Auto-generated constructor stub
	}
	
	public void initializeData() {
		Volunteer vol1 = new Volunteer();
		Volunteer vol2 = new Volunteer();
		Volunteer vol3 = new Volunteer();

		vol1.setFirstname("Jason");
		vol1.setLastname("Brenner");
		vol1.addService("droptoschool");
		vol1.addService("donateblood");

		vol2.setFirstname("David");
		vol2.setLastname("Kelly");
		vol2.addService("droptoschool");
		vol3.setFirstname("John");
		vol3.setLastname("Lebannon");
		vol3.addService("donateblood");
		vols.add(vol1);
		vols.add(vol2);
		vols.add(vol3);
		
		System.out.println("Number of Volunteers:"+vols.size());
		}

}
