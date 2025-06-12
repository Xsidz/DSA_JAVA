public class recursionjava {

    public static void decreasingNum(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        decreasingNum(n - 1);

    }

    public static void increasingNum(int n) {
        if (n < 1) {
            return;
        }
        increasingNum(n - 1);
        System.out.println(n);

    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fact = n * factorial(n - 1);
        return fact;
    }

    public static int sumOfNaturalNum(int n) {
        if (n == 0) {
            return 0;
        }

        return n + sumOfNaturalNum(n - 1);

    }

    public static int fibonaaci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonaaci(n - 1) + fibonaaci(n - 2);
    }

    public static boolean sortedArray(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return sortedArray(arr, i + 1);

    }

    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length - 1) {
            return 0;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i + 1);
    }

    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        int restIndex = lastOccurence(arr, key, i + 1);

        if (restIndex != -1) {
            return restIndex;
        }

        if (arr[i] == key) {
            return i;
        }

        return -1;
    }

    public static int powerOfX(int n, int pow) {
        if (pow == 1) {
            return n;
        }
        return n * powerOfX(n, pow - 1);
    }

    public static int tilingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int verticaltiles = tilingProblem(n - 1);
        int horizontaltiles = tilingProblem(n - 1);

        int totalways = verticaltiles + horizontaltiles;
        return totalways;
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newsb, boolean map[]) {
              if(idx == str.length()){
                System.out.println(newsb);
                return;
              }

              char currentChar = str.charAt(idx);
              if(map[currentChar-'a']){
                    removeDuplicates(str, idx+1, newsb, map);
              }else{
                map[currentChar-'a' ] = true;
                removeDuplicates(str, idx+1, newsb.append(currentChar), map);
              }
    } 

    public static void main(String[] args) {
          removeDuplicates("appnnacollege", 0, new StringBuilder(""), new boolean[26]);
    }
}
