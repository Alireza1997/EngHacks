import static org.lwjgl.opengl.GL11.GL_QUADS;
import static org.lwjgl.opengl.GL11.GL_TEXTURE_2D;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glColor3f;
import static org.lwjgl.opengl.GL11.glDisable;
import static org.lwjgl.opengl.GL11.glEnable;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glTexCoord2f;
import static org.lwjgl.opengl.GL11.glVertex2f;

import org.newdawn.slick.opengl.Texture;

public class IceWall extends Tile {
	public IceWall(Player p1, int y_coordinate, int x_coordinate) {
		super(p1, y_coordinate, x_coordinate );
	}
	Texture iceTexture;
	TemperatureReader r1 = new TemperatureReader();

	public void doEffects(){	
		
		r1.readTemperature();
		if (r1.temperature < 30){
			//color & render
			glColor3f(1f, 1f, 1f);
			glEnable(GL_TEXTURE_2D);
			
			iceTexture =TextureApplier.loadTexture("IceTile");
			iceTexture.bind();
			glBegin(GL_QUADS);
				
				glTexCoord2f(0,1);
				glVertex2f(x_coordinate, y_coordinate);
				glTexCoord2f(1,1);
				glVertex2f(x_coordinate + WIDTH, y_coordinate);
				glTexCoord2f(1,0);
				glVertex2f(x_coordinate + WIDTH, y_coordinate + HEIGHT);
				glTexCoord2f(0,0);
				glVertex2f(x_coordinate, y_coordinate + HEIGHT);			
				
			glEnd();
			glDisable(GL_TEXTURE_2D);
		
		
		
			if(p1.velocity.getX() < 0){
				if (p1.location.getY() + p1.velocity.getY() < y_coordinate + p1.size.getY() && p1.location.getY() + p1.velocity.getY() > y_coordinate - p1.size.getY())
					if (p1.location.getX() + p1.velocity.getX() < x_coordinate + p1.size.getX() && p1.location.getX() + p1.velocity.getX() > x_coordinate ){
						if(p1.velocity.getX() < 0)
							p1.velocity.setX(0);
						System.out.println("hi");
				}
			}
			if(p1.velocity.getX() > 0){
				if (p1.location.getY()  + p1.velocity.getY() < y_coordinate + p1.size.getY() && p1.location.getY()  + p1.velocity.getY() > y_coordinate - p1.size.getY())
					if (p1.location.getX() + p1.velocity.getX() < x_coordinate + p1.size.getX() && p1.location.getX() + p1.velocity.getX() > x_coordinate - p1.size.getX()){
						if(p1.velocity.getX() > 0)
							p1.velocity.setX(0);
						System.out.println("hi2");
					}
			}
			
			if(p1.velocity.getY() < 0){
				if (p1.location.getX() + p1.velocity.getX() < x_coordinate + p1.size.getX() && p1.location.getX() + p1.velocity.getX() > x_coordinate - p1.size.getX())
					if (p1.location.getY() + p1.velocity.getY() < y_coordinate + p1.size.getY() && p1.location.getY()  + p1.velocity.getY() > y_coordinate){
						if(p1.velocity.getY() < 0)
							p1.velocity.setY(0);
						System.out.println("hi3");
					}
			}
			if(p1.velocity.getY() > 0){
				if (p1.location.getX() + p1.velocity.getX() < x_coordinate + p1.size.getX() && p1.location.getX() + p1.velocity.getX() > x_coordinate - p1.size.getX())
					if (p1.location.getY()  + p1.velocity.getY() < y_coordinate + p1.size.getY() && p1.location.getY()  + p1.velocity.getY() > y_coordinate - p1.size.getY()){
						if(p1.velocity.getY() > 0)
							p1.velocity.setY(0);
						System.out.println("hi4");
					}
			}
		}
		else{
			glColor3f(.9f, .94f, .69f);		
			//draw quad
			drawTile();
			reset();
		}
		
	}
}
