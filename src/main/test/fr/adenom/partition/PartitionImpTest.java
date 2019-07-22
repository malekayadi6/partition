package fr.adenom.partition;

import fr.adenom.partition.exceptions.InvalidInputException;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PartitionImpTest {
    Partition partition ;
    @Before
    public void setUp() {
        partition = new PartitionImp();
    }

    @Test(expected= InvalidInputException.class)
    public void partitionSouldReturnException() throws InvalidInputException {
       partition.partition(Arrays.asList(1,2,3,4,5),0) ;

    }

    @Test
    public void partition() throws InvalidInputException {
        List<String> data =  Arrays.asList("malek","ayadi" , "test" , "java") ;
        Collection<List<String>>  result = partition.partition(data,2) ;
        Collection<List<String>> listOLists = new ArrayList<>() ;
        listOLists.add(Arrays.asList("malek","ayadi"));
        listOLists.add(Arrays.asList("test","java"));
        assertEquals(result.toString(),listOLists.toString());
    }

    @Test
    public void partition2() throws InvalidInputException {
        Collection<List<Integer>>  result = partition.partition(Arrays.asList(1,2,3,4,5),2) ;
        Collection<List<Integer>> listOLists = new ArrayList<>() ;
        listOLists.add(Arrays.asList(1,2));
        listOLists.add(Arrays.asList(3,4));
        listOLists.add(Arrays.asList(5));
        assertEquals(result.toString(),listOLists.toString());
    }

    @Test
    public void partition3() throws InvalidInputException {
        Collection<List<Integer>>  result = partition.partition(Arrays.asList(1,2,3,4,5),3) ;
        Collection<List<Integer>> listOLists = new ArrayList<>() ;
        listOLists.add(Arrays.asList(1,2,3));
        listOLists.add(Arrays.asList(4,5));
        assertEquals(result.toString(),listOLists.toString());
    }

    @Test
    public void partition4() throws InvalidInputException {
        Collection<List<Integer>>  result = partition.partition(Arrays.asList(1,2,3,4,5),1) ;
        Collection<List<Integer>> listOLists = new ArrayList<>() ;
        listOLists.add(Arrays.asList(1));
        listOLists.add(Arrays.asList(2));
        listOLists.add(Arrays.asList(3));
        listOLists.add(Arrays.asList(4));
        listOLists.add(Arrays.asList(5));
        assertEquals(result.toString(),listOLists.toString());
    }




}