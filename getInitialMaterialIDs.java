//Function that helped get the initial material IDs from 1.12

		for (Material material: Material.values()) {
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter("out_ids.txt", true));
				writer.write("\ncase: "+ material.getId() + " returnMaterial = Material." + material.name() + ";\nbreak;");
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}					
		}	
