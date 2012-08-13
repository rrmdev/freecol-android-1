/**
 *	Copyright (C) 2012   The FreeCol-Android Team
 *
 *  This file is part of FreeCol-Android.
 *
 *  FreeCol-Android is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  FreeCol is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with FreeCol-Android.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.freecolandroid.repackaged.java.awt;

import org.freecolandroid.repackaged.java.awt.image.BufferedImage;

public class GraphicsConfiguration {
	
	private static Rectangle bounds;
	
	public BufferedImage createCompatibleImage(int width, int height,
			int translucent) {
		// TODO Auto-generated method stub
		System.out.println("ERROR!");new Exception().printStackTrace();throw new UnsupportedOperationException("Broken!");
	}

	public Rectangle getBounds() {
		return GraphicsConfiguration.bounds;
	}
	
	public static void setBounds(int width, int height) {
		bounds = new Rectangle(0, 0, width, height);
	}

}