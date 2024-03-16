package org.mwatt.algorithms.dynamic.medium;

import java.util.*;

public class FindFourSum {
    int[] reducedNums;

    public static class PairOfInts {
        public long sum;
        public int int1;
        public int index1;
        public int int2;
        public int index2;

        public PairOfInts(int int1, int int2, int index1, int index2) {
            sum = int1 + int2;

            if (int1 < int2) {
                this.int1 = int1;
                this.index1 = index1;
                this.int2 = int2;
                this.index2 = index2;
            } else {
                this.int1 = int2;
                this.index1 = index2;
                this.int2 = int1;
                this.index2 = index1;
            }
        }
    }

    public static class TrupleOfInts {
        public long sum;
        public int int1;
        public int index1;
        public int int2;
        public int index2;
        public int int3;
        public int index3;


        public TrupleOfInts(PairOfInts pairOfInts, int int3, int index3) {
            sum = pairOfInts.sum + int3;
            if (int3 < pairOfInts.int1) {
                int1 = int3;
                index1 = index3;
                int2 = pairOfInts.int1;
                index2 = pairOfInts.index1;
                this.int3 = pairOfInts.int2;
                this.index3 = pairOfInts.index2;
            } else if (int3 < pairOfInts.int2) {
                int1 = pairOfInts.int1;
                index1 = pairOfInts.index1;
                int2 = int3;
                index2 = index3;
                this.int3 = pairOfInts.int2;
                this.index3 = pairOfInts.index2;
            } else {
                int1 = pairOfInts.int1;
                index1 = pairOfInts.index1;
                int2 = pairOfInts.int2;
                index2 = pairOfInts.index2;
                this.int3 = int3;
                this.index3 = index3;
            }
        }
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums == null || nums.length < 4) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);

        // Remove duplicates and limit to 4 occurrences
        // nDistinctInts is a method in the ArrayUtils class
        int slow = 0;
        int count = 1;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {
                count = 1;
                nums[++slow] = nums[fast];
            } else if (count < 4) {
                count++;
                nums[++slow] = nums[fast];
            }
        }

        reducedNums = Arrays.copyOf(nums, slow + 1);

        List<PairOfInts> partialSums = new ArrayList<>();

        for (int i = 0; i < reducedNums.length; i++) {
            for (int j = i + 1; j < reducedNums.length; j++) {
                PairOfInts part = new PairOfInts(reducedNums[i], reducedNums[j], i, j);
                partialSums.add(part);
            }
        }


        List<TrupleOfInts> triples = new ArrayList<>();

        for (PairOfInts partialSum : partialSums) {
            for (int i = 0;  i < reducedNums.length; i++) {
                if (i != partialSum.index1 && i != partialSum.index2) {
                    triples.add(new TrupleOfInts(partialSum, reducedNums[i], i));
                }
            }
        }

        Set<List<Integer>> quads = new HashSet<>();

        for (TrupleOfInts triple : triples) {
            for (int i = 0; i < reducedNums.length; i++) {
                long sum = triple.sum + reducedNums[i];
                if (sum == target && i != triple.index1 && i != triple.index2 && i != triple.index3) {
                    List<Integer> quadList = new ArrayList<>();
                    quadList.add(triple.int1);
                    quadList.add(triple.int2);
                    quadList.add(triple.int3);
                    quadList.add(reducedNums[i]);
                    quadList.sort(Comparator.naturalOrder());
                    quads.add(quadList);
                }
            }
        }

        return new ArrayList<>(quads);
    }
}
