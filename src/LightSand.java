import static org.lwjgl.opengl.GL11.glColor3f;

public class LightSand extends Tile {
	public LightSand(Player p1, int y_coordinate, int x_coordinate) {
		super(p1, y_coordinate, x_coordinate );
	}
	
	SensorReader r1 = new SensorReader();
	
	
	public void doEffects(){		
		r1.readTemperature();
		if(r1.light != 0 )
			glColor3f(1f, 1f, 1f);	
		
		else
			glColor3f(.9f, .94f, .69f);	
		//draw quad
		drawTile();
		reset();
		
		System.out.println(r1.light);
		System.out.println(r1.temperature);
	}
}
