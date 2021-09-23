package com.serenitydojo.collection;

import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;


public class WhenWorkingWithJavaLists {

    @Test
    public void creatingASimpleList() {

        List simpleList = new ArrayList();

        simpleList.add("a string value");
        simpleList.add(123);


        assertThat(simpleList).contains("a string value", 123);
    }


    @Test
    public void createATypedList() {

        List<String> names = Arrays.asList("joe", "sally", "peter");
        List<Integer> ages = Arrays.asList(1, 2, 3, 4);
        List<Number> favoriteNumbers = Arrays.asList(10,30,1000000000L, 3.14159);

        assertThat(names).contains("joe", "sally", "peter");
        assertThat(ages).contains(1, 2, 3, 4);
        assertThat(favoriteNumbers).contains(10,30,1000000000L, 3.14159);

    }

    @Test
    public void removingStuff() {
        List<String> names = new ArrayList<>();

        names.add("joe");
        names.add("sally");
        names.add("peter");
        names.remove("sally");

        assertThat(names).contains("joe", "peter");
        names.clear();

        assertThat(names).isEmpty();
    }

    @Test
    public void combiningLists() {
        List<String> names = new ArrayList<>();

        names.add("joe");
        names.add("sally");
        names.add("peter");

        List<String> moreNames = new ArrayList<>();
        names.add("paul");
        names.add("petra");

        names.addAll(moreNames);
        assertThat(names).contains("joe", "sally", "peter", "paul", "petra");

        names.removeAll(moreNames);

    }


    @Test
    public void immutableLists() {
        List<String> names = Arrays.asList("joe", "sally", "peter");

        names.remove("sally");

    }


    @Test
    public void findElementInAList() {
        List<String> names = Arrays.asList("joe", "sally", "peter", "sally", "paul");

        int indexOfSally = names.indexOf("sally");
        int lastIndexOfSally = names.lastIndexOf("sally");

        assertThat(indexOfSally).isEqualTo(1);
        assertThat(lastIndexOfSally).isEqualTo(3);

    }

    @Test
    public void findingASublist() {

        List<String> names = Arrays.asList("joe", "sally", "peter", "sally", "paul");
        List<String> middleName = names.subList(1, 5);
        assertThat(names).contains("sally", "peter", "sally", "paul");

    }

    @Test
    public void findingTheSize() {
        List<String> names = Arrays.asList("joe", "sally", "peter", "sally", "paul");

        names.size();
        assertThat(names.size()).isEqualTo(5);

    }

    @Test
    public void convertingAListToASet() {
        List<String> names = Arrays.asList("joe", "sally", "peter", "sally", "paul");

        Set<String> uniqueNames = new HashSet<>(names);

        assertThat(uniqueNames).containsExactlyInAnyOrder("joe", "sally", "peter", "paul");
    }

    @Test
    public void sortingAList() {
        List<String> names = Arrays.asList("joe", "sally", "peter", "sally", "paul");

        Collections.sort(names);
        assertThat(names).containsExactly("joe", "paul", "peter", "sally", "sally");
    }

    @Test
    public void findingMaxAndMin() {
        List<Integer> ages = Arrays.asList(1, 2, 3, 4);

        assertThat(Collections.max(ages)).isEqualTo(4);
        assertThat(Collections.min(ages)).isEqualTo(1);
    }



}
