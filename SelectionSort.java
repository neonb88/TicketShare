

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.List;
import java.util.Arrays;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class SelectionSort
{
  public static void main(String[] args)
  {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; ++i)
    {
      list.add(ThreadLocalRandom.current().nextInt(0, 100));
    }
    System.out.println(Arrays.toString(list.toArray()) + "\n\n\n");

    selection_sort(list);

    System.out.println(Arrays.toString(list.toArray()));
  }
  
  public static void selection_sort(List<Integer> L) // only for Integers, but should be able to genericize easily enough
  {
    int n = L.size();
    int i = 0;
    while (i < n)
    {
      int min = L.get(i);
      int min_index = i;
      int j = i + 1;
      while (j < n)
      {
        if (L.get(j) < min)
        {
          min = L.get(j);
          min_index = j;
        }
        ++j;
      }
      int tmp = L.get(i);
      L.set(i, min);
      L.set(min_index, tmp);
      ++i;
    }
  }
}

/*

function SELECTION SORT ( List L with elements
a0, a1, a2, … , an-1 :
comparable by a “<” operator, that takes two arguments ai and aj and returns a boolean )
  i := 0            # I am indexing from 0 to n-1
  while i < n do
    min := ai
    min_index := i
    j := i + 1
    while j < n do
      if aj < min then
        min := aj
        min_index := j
      j := j + 1
    tmp := ai
    ai := min
    amin_index := tmp
    i := i + 1
  return L


 */
