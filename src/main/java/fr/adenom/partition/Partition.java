package fr.adenom.partition;

import fr.adenom.partition.exceptions.InvalidInputException;

import java.util.Collection;
import java.util.List;

public interface Partition {

    <T> Collection<List<T>> partition(List<T> data , int chunkSize) throws InvalidInputException;
}
