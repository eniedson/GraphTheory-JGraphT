package util;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 21 00:30:01 GMT 2020
 */
// PLUS MANUAL TESTS

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.generate.NamedGraphGenerator;


public class PrintUtilTest {
		
	///////////////////////////////
	// Auxiliary Methods
	static List <String> makeStringList (String [] arrayLabels) {
		List <String> listv = new ArrayList <> ();
		for (int i = 0; i < arrayLabels.length; i++) {
			listv.add(arrayLabels[i]);
		}
		return listv;
	}

	////////////////////////////
	// MANUAL TESTS 	
	
	  // printGraph
	  @Test
	  public void printGraphTest() {
		  @SuppressWarnings("unchecked")
		Graph <String,DefaultEdge> mockedgraph = mock(Graph.class);
		  PrintUtil.printGraph(mockedgraph);
		  verify(mockedgraph).edgeSet();
		  verify(mockedgraph).vertexSet();
 	  }
	  
	  // printGraph with title
	  @Test
	  public void printGraphwithTitleTest() {
		  @SuppressWarnings("unchecked")
		Graph <String,DefaultEdge> mockedgraph = mock(Graph.class);
		  PrintUtil.printGraph(mockedgraph, "title");
		  verify(mockedgraph).edgeSet();
		  verify(mockedgraph).vertexSet();
	  }
	
	  // printWeightedGraph
	  @Test
	  public void printGraphWeightedGraphTest() {
		  Graph<Integer,DefaultEdge> g = NamedGraphGenerator.bullGraph();
		  Graph<Integer,DefaultEdge> gspy = spy(g);
		  PrintUtil.printWeightedGraph(gspy);
		  verify(gspy, atLeastOnce()).edgeSet();
		  verify(gspy, atLeastOnce()).vertexSet();
		  verify(gspy, times(g.edgeSet().size())).getEdgeWeight(any(DefaultEdge.class));
	  }
	
	  // printWeightedGraph with title
	  @Test
	  public void printGraphWeightedGraphwithTitleTest() {
		  Graph<Integer,DefaultEdge> g = NamedGraphGenerator.bullGraph();
		  Graph<Integer,DefaultEdge> gspy = spy(g);
		  PrintUtil.printWeightedGraph(gspy,"title");
		  verify(gspy, atLeastOnce()).edgeSet();
		  verify(gspy, atLeastOnce()).vertexSet();
		  verify(gspy, times(g.edgeSet().size())).getEdgeWeight(any(DefaultEdge.class));
	  }
	  
	  // printGraphSize
	  @Test
	  public void printGraphSizeTest() {
		  @SuppressWarnings("unchecked")
		Graph <String,DefaultEdge> mockedgraph = mock(Graph.class);
		  PrintUtil.printGraphSize(mockedgraph);
		  verify(mockedgraph, atLeastOnce()).edgeSet();
		  verify(mockedgraph, atLeastOnce()).vertexSet();
	  }
	  
  
  //////////////////////////////////////////	
  // TESTS BY EVOSUITE	
  @Test
  public void test0()  throws Throwable  {
      HashMap<Double, Double> hashMap0 = new HashMap<Double, Double>();
      PrintUtil.printOrderedVertexMeasures((Map<Double, Double>) hashMap0, (-1193), false);
      assertEquals(0, hashMap0.size());
  }

  @Test
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        PrintUtil.printWeightedGraph((Graph<Integer, Integer>) null, "d|GRuFY4>}Q_z/'");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //verifyException("util.PrintUtil", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        PrintUtil.printWeightedGraph((Graph<AbstractMap.SimpleEntry<Double, AbstractMap.SimpleEntry>, String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //verifyException("util.PrintUtil", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        PrintUtil.printGraphSize((Graph<Object, Double>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //verifyException("util.PrintUtil", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        PrintUtil.printGraph((Graph<Object, AbstractMap.SimpleImmutableEntry<Object, Double>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //verifyException("util.PrintUtil", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        PrintUtil.printGraph((Graph<Double, Object>) null, "\n");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //verifyException("util.PrintUtil", e);
      }
  }

  @Test
  public void test6()  throws Throwable  {
      PrintUtil printUtil0 = new PrintUtil();
  }

  @Test
  public void test7()  throws Throwable  {
      HashMap<String, Double> hashMap0 = new HashMap<String, Double>();
      Double double0 = Double.valueOf(366);
      hashMap0.put("", double0);
      hashMap0.put("RM", double0);
      // Undeclared exception!
      try { 
        PrintUtil.printOrderedVertexMeasures((Map<String, Double>) hashMap0, 366, false);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2, Size: 2
         //
         //verifyException("java.util.ArrayList", e);
      }
  }

  @Test
  public void test8()  throws Throwable  {
      HashMap<Double, Double> hashMap0 = new HashMap<Double, Double>();
      Double double0 = Double.valueOf(1.0);
      Double double1 = hashMap0.put(double0, double0);
      hashMap0.put(double1, double1);
      // Undeclared exception!
      try { 
        PrintUtil.printOrderedVertexMeasures((Map<Double, Double>) hashMap0, 0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //verifyException("java.lang.Double", e);
      }
  }

  @Test
  public void test9()  throws Throwable  {
      HashMap<Double, Double> hashMap0 = new HashMap<Double, Double>();
      PrintUtil.printOrderedVertexMeasures((Map<Double, Double>) hashMap0, 0, true);
      assertEquals(0, hashMap0.size());
  }
  
}
