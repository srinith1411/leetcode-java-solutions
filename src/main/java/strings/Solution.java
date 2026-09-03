import java.util.HashSet;

public class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<Long> visited = new HashSet<>();
        int x = 0, y = 0;
        
        // Pack (0,0) into a single long and add to set
        visited.add(((long) x << 32) | (y & 0xFFFFFFFFL));

        for (int i = 0; i < path.length(); i++) {
            char c = path.charAt(i);
            if (c == 'N') y++;
            else if (c == 'S') y--;
            else if (c == 'E') x++;
            else if (c == 'W') x--;

            // Pack the new x and y into a unique 64-bit key
            long key = ((long) x << 32) | (y & 0xFFFFFFFFL);
            
            if (!visited.add(key)) {
                return true; // HashSet.add() returns false if the element already exists
            }
        }
        return false;
    }
}
