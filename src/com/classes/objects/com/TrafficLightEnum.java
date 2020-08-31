package com.classes.objects.com;

public enum TrafficLightEnum {
	 RED(1),
	 GREEN(3),
	 YELLOW(50);
	 private final int time;
	 
	 TrafficLightEnum(int r){
	  this.time=r;
	  
	 }
	 
	 public int getTime(){
	  
	  return time;
	 }
	}

