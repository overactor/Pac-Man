package PacMan;

import java.awt.Point;

public class PakuPaku {
	
	class Square {
		private boolean northWall, eastWall, southWall, westWall;
		private char lastSeenContent;
		private int lastSeen = -1;
		private int x, y;
		
		public Square(int walls, int x, int y) {
			this.x = x;
			this.y = y;

			northWall = walls%2 == 1;
			eastWall = (walls/2)%2 == 1;
			southWall = (walls/4)%2 == 1;
			westWall = (walls/8)%2 == 1;
		}
		
		public Point getCoordinates() {
			return new Point(x, y);
		}
		
		public int getX() {
			return x;
		}
		
		public int getY() {
			return y;
		}
		
		public boolean getWall(char wall) {
			switch (wall) {
			case 'N':
				return northWall;
			case 'E':
				return eastWall;
			case 'S':
				return southWall;
			case 'W':
				return westWall;
			}
			
			return true;
		}
		
		public void increaseLastSeen() {
			lastSeen += (lastSeen>=0)?1:0;
		}
		
		public void setLastSeenContent(char content) {
			lastSeenContent = content;
			lastSeen = 0;
		}
		
		public char getLastSeenContent() {
			return lastSeenContent;
		}
		
		public int getLastSeen() {
			return lastSeen;
		}
	}
	
}
