import java.util.*;

 public class Java24_5 {

    static Map<String, List<Character>> map = new HashMap<>();
    static Map<String, Boolean> memo = new HashMap<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter bottom string: ");
        String bottom = sc.next();

        System.out.print("Enter number of allowed patterns: ");
        int n = sc.nextInt();

        List<String> allowed = new ArrayList<>();
        System.out.println("Enter allowed patterns:");
        for (int i = 0; i < n; i++) {
            allowed.add(sc.next());
        }

        boolean result = pyramidTransition(bottom, allowed);
        System.out.println("Can build pyramid: " + result);

        sc.close();
    }

    public static boolean pyramidTransition(String bottom, List<String> allowed) {

        // Build allowed map
        for (String s : allowed) {
            String key = s.substring(0, 2);
            char top = s.charAt(2);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(top);
        }

        return dfs(bottom);
    }

    static boolean dfs(String bottom) {

        if (memo.containsKey(bottom))
            return memo.get(bottom);

        if (bottom.length() == 1)
            return true;

        List<String> nextRows = new ArrayList<>();
        buildNextRow(bottom, 0, new StringBuilder(), nextRows);

        for (String row : nextRows) {
            if (dfs(row)) {
                memo.put(bottom, true);
                return true;
            }
        }

        memo.put(bottom, false);
        return false;
    }

    static void buildNextRow(String bottom, int index,
                             StringBuilder current, List<String> result) {

        if (index == bottom.length() - 1) {
            result.add(current.toString());
            return;
        }

        String key = bottom.substring(index, index + 2);
        if (!map.containsKey(key)) return;

        for (char c : map.get(key)) {
            current.append(c);
            buildNextRow(bottom, index + 1, current, result);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
