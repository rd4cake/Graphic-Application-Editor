// package assignment;

// import static org.junit.jupiter.api.Assertions.*;

// import java.util.HashSet;
// import java.util.LinkedHashSet;
// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;

// import org.junit.jupiter.api.Test;

// class AssignmentTest {

// 	@Test
// 	void Vertex1() throws Exception{
// 		Vertex v = new Vertex(1, 0, 0);
// 		assertEquals(v.toString(), "1.000000 0.000000 0.000000");
// 	}

// 	@Test
// 	void Vertex2() throws Exception{
// 		Vertex v1 = new Vertex(1, 2, 3);
// 		Vertex v2 = new Vertex(3, 1, 2);
// 		assertEquals(v1.hashCode(), v2.hashCode());
// 	}

// 	@Test
// 	void Vertex3() throws Exception{
// 		Vertex v1 = new Vertex(1, 2, 3);
// 		Vertex v2 = new Vertex(3, 1, 2);
// 		assertEquals(v1.hashCode(), v2.hashCode());
// 	}

// 	@Test
// 	void Vertex4() throws Exception{
// 		Vertex v1 = new Vertex(1, 2, 3);
// 		Vertex v2 = new Vertex(1, 2, 3);
// 		assertEquals(v1.equals(v2), true);
// 	}

// 	@Test
// 	void Vertex5() throws Exception{
// 		Vertex v1 = new Vertex(1, 2, 3);
// 		Vertex v2 = new Vertex(3, 2, 1);
// 		assertEquals(v1.equals(v2), false);
// 	}

// 	@Test
// 	void Vertex6() throws Exception{
// 		Vertex v1 = new Vertex(1, 2, 3);
// 		Object v2 = new Object();
// 		assertEquals(v1.equals(v2), false);
// 	}


// 	@Test
// 	void Vertex7() throws Exception{
// 		Vertex v1 = new Vertex(1, 2, 3);
// 		assertEquals(v1.equals(null), false);
// 	}

// 	@Test
// 	void Vertex8() throws Exception{
// 		Vertex v1 = new Vertex(1, 2, 3);
// 		v1.rotateXAxis(Math.PI);
// 		assertEquals(v1.toString(), "1.000000 -2.000000 -3.000000");
// 	}

// 	@Test
// 	void Polygon1() throws Exception{
// 		Vertex v1 = new Vertex(1, 0, 1);
// 		Vertex v2 = new Vertex(2, 0, 2);
// 		Vertex v3 = new Vertex(3, 0, 3);

// 		Vertex v4 = new Vertex(1, 1, 0);
// 		Vertex v5 = new Vertex(2, 2, 0);
// 		Vertex v6 = new Vertex(3, 3, 0);

// 		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
// 		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();

// 		vertices1.add(v1);
// 		vertices1.add(v2);
// 		vertices1.add(v3);

// 		vertices2.add(v4);
// 		vertices2.add(v5);
// 		vertices2.add(v6);

// 		Polygon poly = new Polygon(vertices1);
// 		Polygon poly2 = new Polygon(vertices2);

// 		assertEquals(poly.hashCode(), poly2.hashCode());
// 	}

// 	@Test
// 	void Polygon2() throws Exception{
// 		Vertex v1 = new Vertex(1, 2, 3);
// 		Vertex v2 = new Vertex(2, 2, 2);
// 		Vertex v3 = new Vertex(3, 3, 3);

// 		Vertex v4 = new Vertex(1, 1, 0);
// 		Vertex v5 = new Vertex(2, 2, 0);
// 		Vertex v6 = new Vertex(3, 3, 0);

// 		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
// 		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();

// 		vertices1.add(v1);
// 		vertices1.add(v2);
// 		vertices1.add(v3);

// 		vertices2.add(v4);
// 		vertices2.add(v5);
// 		vertices2.add(v6);

// 		Polygon poly = new Polygon(vertices1);
// 		Polygon poly2 = new Polygon(vertices2);

// 		assertEquals(poly.equals(poly2), false);
// 	}

// 	@Test
// 	void Polygon3() throws Exception{
// 		Vertex v1 = new Vertex(1, 1, 1);
// 		Vertex v2 = new Vertex(2, 2, 2);
// 		Vertex v3 = new Vertex(3, 3, 3);

// 		Vertex v4 = new Vertex(2, 2, 2);
// 		Vertex v5 = new Vertex(1, 1, 1);
// 		Vertex v6 = new Vertex(3, 3, 3);

// 		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
// 		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();

// 		vertices1.add(v1);
// 		vertices1.add(v2);
// 		vertices1.add(v3);

// 		vertices2.add(v4);
// 		vertices2.add(v5);
// 		vertices2.add(v6);

// 		Polygon poly = new Polygon(vertices1);
// 		Polygon poly2 = new Polygon(vertices2);

// 		assertEquals(poly.equals(poly2), true);
// 	}

// 	@Test
// 	void Polygon4() throws Exception{
// 		Vertex v1 = new Vertex(1, 1, 1);
// 		Vertex v2 = new Vertex(2, 2, 2);
// 		Vertex v3 = new Vertex(3, 3, 3);

// 		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();

// 		vertices1.add(v1);
// 		vertices1.add(v2);
// 		vertices1.add(v3);

// 		Polygon poly = new Polygon(vertices1);
// 		Polygon poly2 = null;

// 		assertEquals(poly.equals(poly2), false);
// 	}

// 	@Test
// 	void Polygon5() throws Exception{
// 		Vertex v1 = new Vertex(1, 1, 1);
// 		Vertex v2 = new Vertex(2, 2, 2);
// 		Vertex v3 = new Vertex(3, 3, 3);

// 		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();

// 		vertices1.add(v1);
// 		vertices1.add(v2);
// 		vertices1.add(v3);

// 		Polygon poly = new Polygon(vertices1);
// 		Vertex v = new Vertex(1,1,1);

// 		assertEquals(poly.equals(v), false);
// 	}

// 	@Test
// 	void Polygon6() throws Exception{
// 		Vertex v1 = new Vertex(1, 1, 1);
// 		Vertex v2 = new Vertex(2, 2, 2);
// 		Vertex v3 = new Vertex(3, 3, 3);

// 		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();

// 		Polygon poly1 = new Polygon(vertices1);
// 		Polygon poly2 = new Polygon(vertices1);

// 		double matrix[][] = {{1,0,0},{0,1,0},{0,0,1}};
// 		poly1.transform(matrix);
// 		assertEquals(poly2.equals(poly1), true);
// 	}

// 	@Test
// 	void GraphicalObject1() throws Exception{
// 		Vertex v1 = new Vertex(1, 1, 1);
// 		v1.rotateYAxis(Math.PI);

// 		assertEquals(v1.toString(),"-1.000000 1.000000 -1.000000");
// 	}

// 	@Test
// 	void GraphicalObject2() throws Exception{
// 		Vertex v1 = new Vertex(1, 1, 1);
// 		v1.rotateZAxis(Math.PI);

// 		assertEquals(v1.toString(),"-1.000000 -1.000000 1.000000");
// 	}

// 	@Test
// 	void OBJMeshWriter() throws Exception{
// 		File file =new File("OBJTest1.obj");

// 		Vertex v1 = new Vertex(1, 1, 1);
// 		Vertex v2 = new Vertex(2, 2, 2);
// 		Vertex v3 = new Vertex(3, 3, 3);

// 		Vertex v4 = new Vertex(3, 2, 2);
// 		Vertex v5 = new Vertex(1, 1, 1);
// 		Vertex v6 = new Vertex(3, 3, 3);

// 		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
// 		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();

// 		vertices1.add(v1);
// 		vertices1.add(v2);
// 		vertices1.add(v3);

// 		vertices2.add(v4);
// 		vertices2.add(v5);
// 		vertices2.add(v6);

// 		Polygon poly1 = new Polygon(vertices1);
// 		Polygon poly2 = new Polygon(vertices2);
// 		;
// 		HashSet<Polygon> polygons = new HashSet<Polygon>();
// 		polygons.add(poly1);
// 		polygons.add(poly2);

// 		OBJMeshWriter writer = new OBJMeshWriter();
// 		writer.write(file.getAbsoluteFile().toString(), polygons);

// 		assertEquals(file.length()>0, true);
// 	}

// 	@Test
// 	void OBJMeshWriter2() throws Exception{
// 		File file =new File("OBJTest2.obj");

// 		Vertex v1 = new Vertex(1, 1, 1);
// 		Vertex v2 = new Vertex(2, 2, 2);
// 		Vertex v3 = new Vertex(3, 3, 3);

// 		Vertex v4 = new Vertex(3, 2, 2);

// 		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
// 		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();

// 		vertices1.add(v1);
// 		vertices1.add(v2);
// 		vertices1.add(v3);

// 		vertices2.add(v4);

// 		Polygon poly1 = new Polygon(vertices1);
// 		Polygon poly2 = new Polygon(vertices2);
// 		;
// 		HashSet<Polygon> polygons = new HashSet<Polygon>();
// 		polygons.add(poly1);
// 		polygons.add(poly2);

// 		OBJMeshWriter writer = new OBJMeshWriter();
// 		try {
// 			writer.write(file.getAbsoluteFile().toString(), polygons);
// 		}
// 		catch(Exception e) {
// 			assertEquals(e.getMessage(), "OBJWriter Went Wrong");
// 		}

// 	}

// 	@Test
// 	void PLYMeshWriter1() throws Exception{
// 		File file =new File("PLYTest1.ply");

// 		Vertex v1 = new Vertex(1, 1, 1);
// 		Vertex v2 = new Vertex(2, 2, 2);
// 		Vertex v3 = new Vertex(3, 3, 3);

// 		Vertex v4 = new Vertex(3, 2, 2);
// 		Vertex v5 = new Vertex(1, 1, 1);
// 		Vertex v6 = new Vertex(3, 3, 3);

// 		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
// 		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();

// 		vertices1.add(v1);
// 		vertices1.add(v2);
// 		vertices1.add(v3);

// 		vertices2.add(v4);
// 		vertices2.add(v5);
// 		vertices2.add(v6);

// 		Polygon poly1 = new Polygon(vertices1);
// 		Polygon poly2 = new Polygon(vertices2);
// 		;
// 		HashSet<Polygon> polygons = new HashSet<Polygon>();
// 		polygons.add(poly1);
// 		polygons.add(poly2);

// 		PLYMeshWriter writer = new PLYMeshWriter();
// 		writer.write(file.getAbsoluteFile().toString(), polygons);

// 		assertEquals(file.length()>0, true);

// 	}

// 	@Test
// 	void PLYMeshWriter2() throws Exception{
// 		File file =new File("PLYTest2.ply");

// 		Vertex v1 = new Vertex(1, 1, 1);
// 		Vertex v2 = new Vertex(2, 2, 2);
// 		Vertex v3 = new Vertex(3, 3, 3);

// 		Vertex v4 = new Vertex(3, 2, 2);

// 		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
// 		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();

// 		vertices1.add(v1);
// 		vertices1.add(v2);
// 		vertices1.add(v3);

// 		vertices2.add(v4);

// 		Polygon poly1 = new Polygon(vertices1);
// 		Polygon poly2 = new Polygon(vertices2);
// 		;
// 		HashSet<Polygon> polygons = new HashSet<Polygon>();
// 		polygons.add(poly1);
// 		polygons.add(poly2);

// 		OBJMeshWriter writer = new OBJMeshWriter();
// 		try {
// 			writer.write(file.getAbsoluteFile().toString(), polygons);
// 		}
// 		catch(Exception e) {
// 			assertEquals(e.getMessage(), "PLYWriter Went Wrong");
// 		}
// 	}

// 	@Test
// 	void OFFMeshWriter1() throws Exception{
// 		File file =new File("OFFTest1.off");

// 		Vertex v1 = new Vertex(1, 1, 1);
// 		Vertex v2 = new Vertex(2, 2, 2);
// 		Vertex v3 = new Vertex(3, 3, 3);

// 		Vertex v4 = new Vertex(3, 2, 2);
// 		Vertex v5 = new Vertex(1, 1, 1);
// 		Vertex v6 = new Vertex(3, 3, 3);

// 		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
// 		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();

// 		vertices1.add(v1);
// 		vertices1.add(v2);
// 		vertices1.add(v3);

// 		vertices2.add(v4);
// 		vertices2.add(v5);
// 		vertices2.add(v6);

// 		Polygon poly1 = new Polygon(vertices1);
// 		Polygon poly2 = new Polygon(vertices2);
// 		;
// 		HashSet<Polygon> polygons = new HashSet<Polygon>();
// 		polygons.add(poly1);
// 		polygons.add(poly2);

// 		OFFMeshWriter writer = new OFFMeshWriter();
// 		writer.write(file.getAbsoluteFile().toString(), polygons);

// 		assertEquals(file.length()>0, true);

// 	}

// 	@Test
// 	void OBJMeshReader1() throws Exception{
// 		File file =new File("OBJTest3.obj");
// 		FileWriter fileOutput = new FileWriter(file.getAbsoluteFile().toString(), false);
// 		fileOutput.write("v 1 2 3" + "\n");
// 		fileOutput.write("v 2 2 3" + "\n");
// 		fileOutput.write("v 3 2 3" + "\n");
// 		fileOutput.write("f 1 2 3" + "\n");
// 		fileOutput.close();

// 		OBJMeshReader reader = new OBJMeshReader();

// 		HashSet<Polygon> polygons = reader.read(file.getAbsoluteFile().toString());
// 		assertEquals(polygons.size(), 1);
// 	}

// 	@Test
// 	void OBJMeshReader2() throws WrongFileFormatException, IOException{
// 		File file =new File("OBJTest4.obj");

// 		FileWriter fileOutput = new FileWriter(file.getAbsoluteFile().toString(), false);
// 		fileOutput.write("v 1 3");
// 		fileOutput.close();


// 		OBJMeshReader reader = new OBJMeshReader();
// 		try {
// 			reader.read(file.getAbsolutePath().toString());
// 		}
// 		catch(WrongFileFormatException e) {
// 			assertEquals(e.message, "a line does not follow standard OBJ format");
// 		}

// 	}

// 	@Test
// 	void PLYMeshReader1() throws Exception{
// 		File file =new File("PLYTest1.ply");

// 		PLYMeshReader reader = new PLYMeshReader();

// 		HashSet<Polygon> polygons = reader.read(file.getAbsoluteFile().toString());
// 		assertEquals(polygons.size(), 2);
// 	}

// 	@Test
// 	void PLYMeshReader2() throws Exception{
// 		File file =new File("PLYTest4.ply");

// 		FileWriter fileOutput = new FileWriter(file.getAbsoluteFile().toString(), false);
// 		fileOutput.write("ply"+"\n");
// 		fileOutput.write("format ascii 2.0");
// 		fileOutput.close();

// 		try {
// 			PLYMeshReader reader = new PLYMeshReader();
// 			HashSet<Polygon> polygons = reader.read(file.getAbsoluteFile().toString());
// 		}
// 		catch(WrongFileFormatException e) {
// 			assertEquals(e.message, "Wrong header format for PLY");
// 		}
// 	}

// 	@Test
// 	void PLYMeshReader3() throws Exception{
// 		File file =new File("PLYTest4.ply");

// 		FileWriter fileOutput = new FileWriter(file.getAbsoluteFile().toString(), false);
// 		fileOutput.write("ply"+"\n");
// 		fileOutput.write("format ascii 1.0");
// 		fileOutput.close();

// 		try {
// 			PLYMeshReader reader = new PLYMeshReader();
// 			HashSet<Polygon> polygons = reader.read(file.getAbsoluteFile().toString());
// 		}
// 		catch(WrongFileFormatException e) {
// 			assertEquals(e.message, "Header missing details in PLY file");
// 		}
// 	}

// 	@Test
// 	void PLYMeshReader4() throws Exception{
// 		File file =new File("PLYTest4.ply");

// 		FileWriter fileOutput = new FileWriter(file.getAbsoluteFile().toString(), false);
// 		fileOutput.write("ply"+"\n");
// 		fileOutput.write("format ascii 1.0"+"\n");
// 		fileOutput.write("element vertex 5247"+"\n");
// 		fileOutput.write("property float32 x"+"\n");
// 		fileOutput.write("property float32 y"+"\n");
// 		fileOutput.write("property float32 z"+"\n");
// 		fileOutput.write("element face 10473"+"\n");
// 		fileOutput.write("property list uint8 int32 vertex_indices"+"\n");
// 		fileOutput.write("end_header"+"\n");
// 		fileOutput.write("12 23 123 1 23");

// 		fileOutput.close();

// 		try {
// 			PLYMeshReader reader = new PLYMeshReader();
// 			HashSet<Polygon> polygons = reader.read(file.getAbsoluteFile().toString());
// 		}
// 		catch(WrongFileFormatException e) {
// 			assertEquals(e.message, "A line does not follow standard PLY format");
// 		}
// 	}

// 	@Test
// 	void OFFMeshReader1() throws Exception{
// 		File file =new File("OFFTest5.off");
// 		FileWriter fileOutput = new FileWriter(file.getAbsoluteFile().toString(), false);
// 		fileOutput.write("OFF"+"\n");
// 		fileOutput.write("3 1 0"+"\n");
// 		fileOutput.write("1 1 1"+"\n");
// 		fileOutput.write("1 2 1"+"\n");
// 		fileOutput.write("1 3 1"+"\n");
// 		fileOutput.write("3 0 1 2  220 220 220"+"\n");
// 		fileOutput.close();

// 		OFFMeshReader reader = new OFFMeshReader();

// 		HashSet<Polygon> polygons = reader.read(file.getAbsoluteFile().toString());
// 		assertEquals(polygons.size(), 1);
// 	}

// 	@Test
// 	void OFFMeshReader2() throws Exception{
// 		File file =new File("OFFTest4.off");

// 		FileWriter fileOutput = new FileWriter(file.getAbsoluteFile().toString(), false);
// 		fileOutput.write("OFF"+"\n");
// 		fileOutput.write("1 3");
// 		fileOutput.close();

// 		try {
// 			OFFMeshReader reader = new OFFMeshReader();
// 			HashSet<Polygon> polygons = reader.read(file.getAbsoluteFile().toString());
// 		}
// 		catch(WrongFileFormatException e) {
// 			assertEquals(e.message, "Wrong header format for OFF");
// 		}
// 	}

// 	@Test
// 	void OFFMeshReader3() throws Exception{
// 		File file =new File("OFFTest4.off");

// 		FileWriter fileOutput = new FileWriter(file.getAbsoluteFile().toString(), false);
// 		fileOutput.write("OFF");
// 		fileOutput.close();

// 		try {
// 			OFFMeshReader reader = new OFFMeshReader();
// 			HashSet<Polygon> polygons = reader.read(file.getAbsoluteFile().toString());
// 		}
// 		catch(WrongFileFormatException e) {
// 			assertEquals(e.message, "Header missing details in OFF file");
// 		}
// 	}

// 	@Test
// 	void OFFMeshReader4() throws Exception{
// 		File file =new File("OFFTest4.off");

// 		FileWriter fileOutput = new FileWriter(file.getAbsoluteFile().toString(), false);
// 		fileOutput.write("OFF"+"\n");
// 		fileOutput.write("3 2 0"+"\n");
// 		fileOutput.write("12 23 123 1 23");

// 		fileOutput.close();

// 		try {
// 			OFFMeshReader reader = new OFFMeshReader();
// 			HashSet<Polygon> polygons = reader.read(file.getAbsoluteFile().toString());
// 		}
// 		catch(WrongFileFormatException e) {
// 			assertEquals(e.message, "A line does not follow standard OFF format");
// 		}
// 	}

// 	@Test
// 	void Mesh1() throws Exception{
// 		File file =new File("MeshTest1.obj");
// 		FileWriter fileOutput = new FileWriter(file.getAbsoluteFile().toString(), false);
// 		fileOutput.write("v 1 2 3" + "\n");
// 		fileOutput.write("v 2 2 3" + "\n");
// 		fileOutput.write("v 3 2 3" + "\n");
// 		fileOutput.write("f 1 2 3" + "\n");
// 		fileOutput.close();

// 		Mesh mesh = new Mesh();
// 		mesh.setReader(new OBJMeshReader());
// 		mesh.readFromFile(file.getAbsolutePath().toString());
// 		assertEquals(mesh.polygons.size(), 1);


// 	}

// 	@Test
// 	void Mesh2() throws Exception{
// 		File file = new File("MeshTest1.obj");
// 		File file2 = new File("MeshTest2.obj");

// 		Mesh mesh = new Mesh();
// 		mesh.setReader(new OBJMeshReader());
// 		mesh.readFromFile(file.getAbsolutePath().toString());

// 		mesh.setWriter(new OBJMeshWriter());
// 		mesh.writeToFile(file2.getAbsolutePath().toString());

// 		assertEquals(file.length()>0, true);
// 	}

// 	@Test
// 	void Mesh3() throws Exception{

// 		File file =new File("MeshTest3.obj");
// 		File file2 =new File("MeshTest4.obj");

// 		FileWriter fileOutput = new FileWriter(file.getAbsoluteFile().toString(), false);
// 		fileOutput.write("v 1 2 3" + "\n");
// 		fileOutput.write("v 2 2 3" + "\n");
// 		fileOutput.write("v 3 2 3" + "\n");
// 		fileOutput.write("f 1 2 3" + "\n");
// 		fileOutput.close();

// 		FileWriter fileOutput2 = new FileWriter(file2.getAbsoluteFile().toString(), false);
// 		fileOutput2.write("v 1 2 3" + "\n");
// 		fileOutput2.write("v 2 2 3" + "\n");
// 		fileOutput2.write("v 3 2 3" + "\n");
// 		fileOutput2.write("f 1 2 3" + "\n");
// 		fileOutput2.close();

// 		Mesh mesh = new Mesh();
// 		Mesh mesh2 = new Mesh();
// 		mesh.setReader(new OBJMeshReader());
// 		mesh2.setReader(new OBJMeshReader());
// 		mesh.readFromFile(file.getAbsolutePath().toString());
// 		mesh2.readFromFile(file2.getAbsolutePath().toString());

// 		assertEquals(mesh.equals(mesh2), true);
// 	}

// 	@Test
// 	void Mesh4() throws Exception{
// 		Mesh mesh = new Mesh();
// 		assertEquals(mesh.equals(null), false);
// 	}

// 	@Test
// 	void Mesh5() throws Exception{
// 		Mesh mesh = new Mesh();
// 		Vertex v = new Vertex(1,1,1);
// 		assertEquals(mesh.equals(v), false);
// 	}

// 	@Test
// 	void Mesh6() throws Exception{
// 		File file =new File("MeshTest6.obj");
// 		FileWriter fileOutput = new FileWriter(file.getAbsoluteFile().toString(), false);
// 		fileOutput.write("v 1 2 3" + "\n");
// 		fileOutput.write("v 2 2 3" + "\n");
// 		fileOutput.write("v 3 2 3" + "\n");
// 		fileOutput.write("f 1 2 3" + "\n");
// 		fileOutput.close();

// 		Mesh mesh = new Mesh();
// 		mesh.setReader(new OBJMeshReader());
// 		mesh.readFromFile(file.getAbsolutePath().toString());
// 		assertEquals(mesh.hashCode(), 1255517875);
// 	}

// 	@Test
// 	void Mesh7() throws Exception{
// 		File file =new File("MeshTest6.obj");
// 		FileWriter fileOutput = new FileWriter(file.getAbsoluteFile().toString(), false);
// 		fileOutput.write("v 1 2 3" + "\n");
// 		fileOutput.write("v 2 2 3" + "\n");
// 		fileOutput.write("v 3 2 3" + "\n");
// 		fileOutput.write("f 1 2 3" + "\n");
// 		fileOutput.close();

// 		Mesh mesh = new Mesh();
// 		mesh.setReader(new OBJMeshReader());
// 		mesh.readFromFile(file.getAbsolutePath().toString());

// 		Mesh mesh2 = new Mesh();
// 		mesh2 = mesh;
// 		mesh.rotateXAxis(2*Math.PI);
// 		assertEquals(mesh.equals(mesh2), true);
// 	}


// }
