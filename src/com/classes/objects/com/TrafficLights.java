package com.classes.objects.com;

public class TrafficLights {

	public static void main(String[] args) {
		TrafficLightEnum lights = null;
		
		System.out.println("RED LIGHT : "+lights.RED.getTime()+" MINUTES");
		System.out.println("GREEN LIGHT : "+lights.GREEN.getTime()+" MINUTES");
		System.out.println("YELLOW LIGHT : "+lights.YELLOW.getTime()+" SECONDS ");

	}

}
