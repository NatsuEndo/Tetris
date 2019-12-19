package application;

import javafx.scene.shape.*;

public class Controller {

	//getting numbers and MESH from Tetris class
	public static final int MOVE = Tetris.MOVE;
	public static final int SIZE = Tetris.SIZE;
	public static int XMAX = Tetris.XMAX;
	public static int YMAX = Tetris.YMAX;
	public static int [][] MESH = Tetris.MESH;
	
	//moving the blocks
	public static void MoveRight(Form form) {
		if (form.a.getX() + MOVE <= XMAX - SIZE && form.b.getX() + MOVE <= XMAX - SIZE
			&& form.c.getX() + MOVE <= XMAX - SIZE && form.d.getX() + MOVE <= XMAX - SIZE) {
			
			int move_a = MESH[((int) form.a.getX() / SIZE) + 1][((int) form.a.getY() / SIZE)];
			int move_b = MESH[((int) form.b.getX() / SIZE) + 1][((int) form.b.getY() / SIZE)];
			int move_c = MESH[((int) form.c.getX() / SIZE) + 1][((int) form.c.getY() / SIZE)];
			int move_d = MESH[((int) form.d.getX() / SIZE) + 1][((int) form.d.getY() / SIZE)];
			
			if(move_a == 0 && move_a == move_b && move_b == move_c && move_c == move_d) {
				form.a.setX(form.a.getX() + MOVE);
				form.b.setX(form.b.getX() + MOVE);
				form.c.setX(form.c.getX() + MOVE);
				form.d.setX(form.d.getX() + MOVE);
			}
		}
	}
	
	//the same for moving left
	public static void MoveLeft(Form form) {
		if (form.a.getX() - MOVE >= 0 && form.b.getX() - MOVE >= 0
			&& form.c.getX() - MOVE >= 0 && form.d.getX() - MOVE >= 0) {
			
			int move_a = MESH[((int) form.a.getX() / SIZE) - 1][((int) form.a.getY() / SIZE)];
			int move_b = MESH[((int) form.b.getX() / SIZE) - 1][((int) form.b.getY() / SIZE)];
			int move_c = MESH[((int) form.c.getX() / SIZE) - 1][((int) form.c.getY() / SIZE)];
			int move_d = MESH[((int) form.d.getX() / SIZE) - 1][((int) form.d.getY() / SIZE)];
			
			if(move_a == 0 && move_a == move_b && move_b == move_c && move_c == move_d) {
				form.a.setX(form.a.getX() - MOVE);
				form.b.setX(form.b.getX() - MOVE);
				form.c.setX(form.c.getX() - MOVE);
				form.d.setX(form.d.getX() - MOVE);
			}
		}
	}

	
	//create the stones
		public static Form makeRect() {
			//random color for the stones
			
			int block = (int) (Math.random() * 100);
			String name;
			
			Rectangle a = new Rectangle(SIZE - 1, SIZE -1),
					b = new Rectangle(SIZE - 1, SIZE -1),
					c = new Rectangle(SIZE - 1, SIZE -1),
					d = new Rectangle(SIZE - 1, SIZE -1);
			
		if(block < 15) {
			a.setX(XMAX / 2 - SIZE);
			b.setX(XMAX / 2 - SIZE);
			b.setY(SIZE);
			c.setX(XMAX / 2);
			c.setY(SIZE);
			d.setX(XMAX / 2 + SIZE);
			d.setY(SIZE);
			name = "j";
		} else if(block < 30) {
			a.setX(XMAX / 2 + SIZE);
			b.setX(XMAX / 2 - SIZE);
			b.setY(SIZE);
			c.setX(XMAX / 2);
			c.setY(SIZE);
			d.setX(XMAX / 2);
			d.setY(SIZE);
			name = "l";
		} else if(block < 45) {
			a.setX(XMAX / 2 - SIZE);
			b.setX(XMAX / 2);
			b.setY(XMAX / 2 - SIZE);
			c.setY(SIZE);
			d.setX(XMAX / 2 - SIZE);
			d.setY(SIZE);
			name = "l";
		} else if(block < 60) {
			a.setX(XMAX / 2 + SIZE);
			b.setX(XMAX / 2);
			b.setY(XMAX / 2);
			c.setY(SIZE);
			d.setX(XMAX / 2 - SIZE);
			d.setY(SIZE);
			name = "s";
		} else if(block < 75) {
			a.setX(XMAX / 2 - SIZE);
			b.setX(XMAX / 2);
			b.setY(XMAX / 2);
			c.setY(SIZE);
			d.setX(XMAX / 2 + SIZE);
			d.setY(SIZE);
			name = "t";
		} else if(block < 90) {
			a.setX(XMAX / 2 + SIZE);
			b.setX(XMAX / 2);
			b.setY(XMAX / 2 + SIZE);
			c.setY(SIZE);
			d.setX(XMAX / 2 + SIZE + SIZE);
			d.setY(SIZE);
			name = "z";
		} else {
			a.setX(XMAX / 2 - SIZE - SIZE);
			b.setX(XMAX / 2 - SIZE);
			b.setY(XMAX / 2);
			d.setX(XMAX / 2 + SIZE);
			d.setY(SIZE);
			name = "i";
		}
			return new Form(a, b, c, d, name);	
		}
	
	
	
}

