package fr.adenom.partition;

import fr.adenom.partition.exceptions.InvalidInputException;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class PartitionImp implements Partition {


    @Override
    public <T> Collection<List<T>> partition(List<T> data, int chunkSize) throws InvalidInputException {
        if (chunkSize <= 0){
            throw new InvalidInputException("The typed number should be greater than 0");
        }

        final AtomicInteger counter = new AtomicInteger();

        return data.stream()
                .collect(Collectors.groupingBy(it -> counter.getAndIncrement() / chunkSize))
                .values();
    }
}
