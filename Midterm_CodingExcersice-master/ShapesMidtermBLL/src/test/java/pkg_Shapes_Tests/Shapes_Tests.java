package pkg_Shapes_Tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.lang.reflect.*;

import org.junit.Test;

import pkg_Shapes.Cuboid;
import pkg_Shapes.Cuboid.SortByArea;
import pkg_Shapes.Cuboid.SortByVolume;
import pkg_Shapes.Rectangle;

public class Shapes_Tests {

	
	@Test
	public void Rectangle_Test1() {
		Rectangle rect1 = new Rectangle(3, 4);
		assertTrue(rect1 instanceof Rectangle);
	}
	
	@Test
	public void RectanglegetiLength_Test1() {
		Rectangle rect1 = new Rectangle(3, 4);
		assertTrue(rect1.getiLength() == 3);
	}
	
	@Test
	public void RectanglesetiLength_Test1() {
		Rectangle rect1 = new Rectangle(3, 4);
		rect1.setiLength(5);
		assertTrue(rect1.getiLength() == 5);
	}
	
	@Test
	public void RectanglegetiWidth_Test1() {
		Rectangle rect1 = new Rectangle(3, 4);
		assertTrue(rect1.getiWidth() == 4);
	}
	
	@Test
	public void RectanglesetiWidth_Test1() {
		Rectangle rect1 = new Rectangle(3, 4);
		rect1.setiWidth(6);
		assertTrue(rect1.getiWidth() == 6);
	}
	
	@Test
	public void RectangleArea_Test1() {
		Rectangle rect1 = new Rectangle(3, 4);
		assertTrue(rect1.area() == 12.0);
	}
	
	@Test
	public void RectanglePerimeter_Test1() {
		Rectangle rect1 = new Rectangle(4, 8);
		assertTrue(rect1.perimeter() == 24.0);
	}
	
	@Test
	public void RectangleCompareTo_Test1() {
		Rectangle rect1 = new Rectangle(4, 8);
		Rectangle rect2 = new Rectangle(2, 3);
		Rectangle rect3 = new Rectangle(3, 4);
		ArrayList<Rectangle> rectList = new ArrayList<Rectangle>();
		rectList.add(rect1);
		rectList.add(rect2);
		rectList.add(rect3);
		Collections.sort(rectList);
		assertTrue(rectList.get(0).area() == 6);
		assertTrue(rectList.get(1).area() == 12);
		assertTrue(rectList.get(2).area() == 32);
	}
	
	@Test
	public void Cuboid_Test1() {
		Cuboid cub1 = new Cuboid(3, 4, 5);
		assertTrue(cub1 instanceof Cuboid);
	}
	
	@Test
	public void CuboidiLength_Test1() {
		Cuboid cub1 = new Cuboid(3, 4, 5);
		assertTrue(cub1.getiLength() == 3);
	}
	
	@Test
	public void CuboidsetiLength_Test1() {
		Cuboid cub1 = new Cuboid(3, 4, 5);
		cub1.setiLength(2);
		assertTrue(cub1.getiLength() == 2);
	}
	
	@Test
	public void CuboidgetiWidth_Test1() {
		Cuboid cub1 = new Cuboid(3, 4, 5);
		assertTrue(cub1.getiWidth() == 4);
	}
	
	@Test
	public void CuboidsetiWidth_Test1() {
		Cuboid cub1 = new Cuboid(3, 4, 5);
		cub1.setiWidth(2);
		assertTrue(cub1.getiWidth() == 2);
	}
	
	@Test
	public void CuboidgetiDepth_Test1() {
		Cuboid cub1 = new Cuboid(3, 4, 5);
		assertTrue(cub1.getiDepth() == 5);
	}
	
	@Test
	public void CuboidsetiDepth_Test1() {
		Cuboid cub1 = new Cuboid(3, 4, 5);
		cub1.setiDepth(6);
		assertTrue(cub1.getiDepth() == 6);
	}
	
	@Test
	public void CuboidArea_Test1() {
		Cuboid cub1 = new Cuboid(3, 4, 5);
		assertTrue(cub1.area() == 94.0);
	}
	
	@Test
	public void CuboidPerimeter_Test1() {
		boolean thrownE = false;
		try {
			Cuboid cub1 = new Cuboid(3, 4, 5);
			cub1.perimeter();
		} catch(UnsupportedOperationException unsupportedOperationException) {
			thrownE = true;
		}
		assertTrue(thrownE);
	}
	
	@Test
	public void CuboidVolume_Test1() {
		Cuboid cub1 = new Cuboid(3, 4, 5);
		assertTrue(cub1.volume() == 60.0);
	}
	
	@Test
	public void CuboidCompareTo_Test1() {
		Cuboid cubCompare = new Cuboid(0, 0, 0);
		Cuboid cub1 = new Cuboid(3, 4, 5);
		Cuboid cub2 = new Cuboid(4, 5, 6);
		Cuboid cub3 = new Cuboid(1, 3, 12);
		ArrayList<Cuboid> cubList1 = new ArrayList<Cuboid>();
		cubList1.add(cub1);
		cubList1.add(cub2);
		cubList1.add(cub3);
		SortByArea sortByArea;
		
	}
	
	@Test
	public void CuboidCompareTo_Test2() {
		Cuboid cub1 = new Cuboid(3, 4, 5);
		Cuboid cub2 = new Cuboid(4, 5, 6);
		Cuboid cub3 = new Cuboid(1, 3, 12);
		ArrayList<Cuboid> cubList1 = new ArrayList<Cuboid>();
		cubList1.add(cub1);
		cubList1.add(cub2);
		cubList1.add(cub3);
		Collections.sort(cubList1);
		assertTrue(cubList1.get(0).area() == 94.0);
		assertTrue(cubList1.get(1).area() == 102.0);
		assertTrue(cubList1.get(2).area() == 148.0);

	}

}
