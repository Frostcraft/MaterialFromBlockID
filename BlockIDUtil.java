import org.bukkit.Material;

//This function gets a material from a block ID
//ToDo Finish this function
//     Some values aren't needed. Mostly need this for shops to continue working correctly.
public class BlockIDUtil {
	public static Material getMaterialFromID(int blockID, int dmgValue) {
		Material returnMaterial = null;
		
		switch (blockID) {
			case 1: returnMaterial = Material.STONE;
					break;
			case 2: returnMaterial = Material.GRASS;
					break; 
			case 3: returnMaterial = Material.DIRT;
				break;		
			case 4: returnMaterial = Material.COBBLESTONE;
				break;
			case 5: returnMaterial = Material.OAK_PLANKS;
				break;
			case 6: returnMaterial = Material.OAK_SAPLING;
				break;
			case 7: returnMaterial = Material.BEDROCK;
				break;
			case 8: returnMaterial = Material.WATER;
				break;			
			case 9: returnMaterial = Material.WATER;
				break;		
			case 10: returnMaterial = Material.LAVA;
				break;
			case 11: returnMaterial = Material.LAVA;
				break;
			case 12: returnMaterial = Material.SAND;
				break;
			case 13: returnMaterial = Material.GRAVEL;
				break;
			case 14: returnMaterial = Material.GOLD_ORE;
				break;				
			case 15: returnMaterial = Material.IRON_ORE;
				break;			
			case 16: returnMaterial = Material.COAL_ORE;
				break;
			case 17: returnMaterial = Material.OAK_LOG;
				break;			
			case 18: returnMaterial = Material.OAK_LEAVES;
				break;		
			case 19: returnMaterial = Material.SPONGE;
				break;			
			case 20: returnMaterial = Material.GLASS;
				break;			
			case 21: returnMaterial = Material.LAPIS_ORE;
				break;			
			case 22: returnMaterial = Material.LAPIS_BLOCK;
				break;			
			case 23: returnMaterial = Material.DISPENSER;
				break;			
			case 24: returnMaterial = Material.SANDSTONE;
				break;
			case 25: returnMaterial = Material.NOTE_BLOCK;
				break;	
			case 26: returnMaterial = Material.RED_BED;
				break;	
			case 27: returnMaterial = Material.POWERED_RAIL;
				break;	
			case 28: returnMaterial = Material.DETECTOR_RAIL;
				break;	
			case 29: returnMaterial = Material.STICKY_PISTON;
				break;	
			case 30: returnMaterial = Material.COBWEB;
				break;	
			case 31: returnMaterial = Material.GRASS;
				break;	
			case 32: returnMaterial = Material.DEAD_BUSH;
				break;	
			case 33: returnMaterial = Material.PISTON;
				break;	
			case 34: returnMaterial = null; //Not needed
				break;	
			case 35: returnMaterial = Material.WHITE_WOOL;
				break;	
			case 36: returnMaterial = null; //Not needed
				break;	
			case 37: returnMaterial = Material.DANDELION_YELLOW; //ToDo Check, is this correct? yellow flower to dandelion_yellow?
				break;	
			case 38: returnMaterial = Material.ROSE_BUSH; //ToDo Check if this is correct.
				break;	
			case 39: returnMaterial = Material.BROWN_MUSHROOM;
				break;	
			case 40: returnMaterial = Material.RED_MUSHROOM;
				break;	
			case 41: returnMaterial = Material.GOLD_BLOCK;
				break;	
			case 42: returnMaterial = Material.IRON_BLOCK;
				break;	
			case 43: returnMaterial = null; //Not needed
				break;	
			case 44: returnMaterial = Material.STONE_SLAB;
				break;	
			case 45: returnMaterial = Material.BRICKS;
				break;	
			case 46: returnMaterial = Material.TNT;
				break;	
			case 47: returnMaterial = Material.BOOKSHELF;
				break;	
			case 48: returnMaterial = Material.MOSSY_COBBLESTONE;
				break;	
			case 49: returnMaterial = Material.OBSIDIAN;
				break;	
			case 50: returnMaterial = Material.TORCH;
				break;	
			case 51: returnMaterial = Material.FIRE;
				break;	
			case 52: returnMaterial = null; //Spawner, not needed
				break;	
			case 53: returnMaterial = Material.OAK_STAIRS;
				break;	
			case 54: returnMaterial = Material.CHEST;
				break;	
			case 55: returnMaterial = null; //Not needed
				break;	
			case 56: returnMaterial = Material.DIAMOND_ORE;
				break;	
			case 57: returnMaterial = Material.DIAMOND_BLOCK;
				break;	
			case 58: returnMaterial = Material.CRAFTING_TABLE;
				break;	
			case 59: returnMaterial = Material.WHEAT;
				break;	
			case 60: returnMaterial = null; //Not needed
				break;	
			case 61: returnMaterial = Material.FURNACE;
				break;	
			case 62: returnMaterial = null; //Not needed
				break;	
			case 63: returnMaterial = null; Not needed
				break;	
			case 64: returnMaterial = Material.OAK_DOOR;
				break;	
			case 65: returnMaterial = Material.LADDER;
				break;	
			case 66: returnMaterial = Material.RAIL;
				break;	
			case 67: returnMaterial = Material.COBBLESTONE_STAIRSs;
				break;	
			case 68: returnMaterial = null; //not needed
				break;	
			case 69: returnMaterial = Material.LEVER;
				break;	
			case 70: returnMaterial = Material.STONE_PRESSURE_PLATE;
				break;	
			case 71: returnMaterial = Material.IRON_DOOR;
			break;	
			case 72: returnMaterial = Material.;
			break;	
			case 73: returnMaterial = Material.;
			break;	
			case 74: returnMaterial = Material.;
			break;	
			case 75: returnMaterial = Material.;
			break;	
			case 76: returnMaterial = Material.;
			break;	
			case 77: returnMaterial = Material.;
			break;	
			case 78: returnMaterial = Material.;
			break;	
			case 79: returnMaterial = Material.;
			break;	
			case 80: returnMaterial = Material.;
			break;	
			case 81: returnMaterial = Material.;
			break;	
			case 82: returnMaterial = Material.;
			break;	
			case 83: returnMaterial = Material.;
			break;	
			case 84: returnMaterial = Material.;
			break;	
			case 85: returnMaterial = Material.;
			break;	
			case 86: returnMaterial = Material.;
			break;	
			case 87: returnMaterial = Material.;
			break;	
			case 88: returnMaterial = Material.;
			break;	
			case 89: returnMaterial = Material.;
			break;	
			case 90: returnMaterial = Material.;
			break;	
			case 91: returnMaterial = Material.;
			break;		
		}
		return returnMaterial;			
	}
}
