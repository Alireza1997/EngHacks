//import static org.lwjgl.opengl.GL11.GL_BLEND;
//import static org.lwjgl.opengl.GL11.GL_MODELVIEW;
//import static org.lwjgl.opengl.GL11.GL_ONE_MINUS_SRC_ALPHA;
//import static org.lwjgl.opengl.GL11.GL_PROJECTION;
//import static org.lwjgl.opengl.GL11.GL_SRC_ALPHA;
//import static org.lwjgl.opengl.GL11.GL_TEXTURE_2D;
//import static org.lwjgl.opengl.GL11.glBlendFunc;
//import static org.lwjgl.opengl.GL11.glDisable;
//import static org.lwjgl.opengl.GL11.glEnable;
//import static org.lwjgl.opengl.GL11.glLoadIdentity;
//import static org.lwjgl.opengl.GL11.glMatrixMode;
//import static org.lwjgl.opengl.GL11.glOrtho;
//
//import org.lwjgl.LWJGLException;
//import org.lwjgl.opengl.Display;
//import org.lwjgl.opengl.DisplayMode;
//
////import BuildingManager;
//
// 
//public class DisplayExample {
//    public void start() {
//    	Player p1 = new Player();
//    	Sand s1 = new Sand(p1,0,0);
//    	BuildingManager b1 = new BuildingManager(p1);
//    	
//        try {
//            Display.setDisplayMode(new DisplayMode(800,600));
//            Display.create();
//        } catch (LWJGLException e) {
//            e.printStackTrace();
//            System.exit(0);
//        }
//         
//        // init OpenGL here
//        glMatrixMode(GL_PROJECTION);
//		glLoadIdentity();
//		glOrtho(0, 800, 0, 600, 1, -1);	
//		glMatrixMode(GL_MODELVIEW);
//		glEnable(GL_BLEND);
//		glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
//        
//        while (!Display.isCloseRequested()) {
//             
//            // render OpenGL here
//        	Display.update();
//			Display.sync(60);
//			//glEnable(GL_TEXTURE_2D);
//			s1.doEffects();
//			p1.render();
//        	
//        	//glDisable(GL_TEXTURE_2D);
//            
//        }
//         
//        Display.destroy();
//    }
//     
//    public static void main(String[] argv) {
//        DisplayExample displayExample = new DisplayExample();
//        displayExample.start();
//    }
//}