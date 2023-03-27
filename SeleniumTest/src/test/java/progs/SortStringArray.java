package progs;

public class SortStringArray  {

	public static String[] stringArraySort(String[] words)
    {
        for(int i = 0; i < words.length - 1; i++)
        {
            for(int j = i+1; j < words.length; j++)
            {
                if(words[i].compareTo(words[j]) > 0)//words[i] is greater than words[j]
                {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        return words;
    }
    public static void main(String[] args)
    {
        String[] arrToSort = {"apple", "oranges", "bananas", "Strawberry", "Blueberry"};
        String[] sortedArr = stringArraySort(arrToSort);
        for(int i = 0; i < sortedArr.length; i++)
            System.out.print(sortedArr[i] + " ");
    }
}
