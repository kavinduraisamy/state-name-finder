package com.geo.reversegeocode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.geo.reversegeocode.repo.GeoIndiaRepo;

@SpringBootApplication
public class ReverseGeocodeApplication {

	public static void main(String[] args) throws NumberFormatException, IOException {
		ApplicationContext context=SpringApplication.run(ReverseGeocodeApplication.class, args);
		GeoIndiaRepo geoIndia=context.getBean(GeoIndiaRepo.class);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("Enter Lat");
			double lat=Double.parseDouble(br.readLine());
			System.out.println("Enter Lon");
			double lon=Double.parseDouble(br.readLine());
		System.out.println(geoIndia.findState(lat,lon).getProperties().get("NAME_1"));
		}
		
	
	}

}
