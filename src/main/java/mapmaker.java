package main.java;

import java.util.HashMap;
import java.util.Map;

public class mapmaker {
	private Map <Integer, String> mapmakermap = new HashMap<Integer, String>();

	public Map <Integer, String> getMapmakermap() {
		return mapmakermap;
	}

	public void setMapmakermap(Integer key, String object) {
		this.mapmakermap.put(key, object);
	}
	         
	        
	        
	        
}