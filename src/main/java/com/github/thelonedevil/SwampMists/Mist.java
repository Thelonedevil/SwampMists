package com.github.thelonedevil.SwampMists;

public class Mist {
	String biome; //contains all biomes in memory
	String swamp; //= swamp biome ID
	void mistGenerator(){
		if (SwampMists.Mist == true){
		      if (biome == swamp) {
				generateMist();
			}
		}
	}
	void generateMist(){
		//add code to generate mist
	}

}
