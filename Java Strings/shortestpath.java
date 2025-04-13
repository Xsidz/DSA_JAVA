
public class shortestpath {
    public static void ShortestPath(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);
            if (dir == 'W') {
                x--;
            } else if (dir == 'E') {
                x++;
            } else if (dir == 'S') {
                y--;
            } else {
                y++;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        float displacement = (float) Math.sqrt(x2 + y2);

        System.out.println("Shortest path is :" + displacement);
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        ShortestPath(str);
    }
}
