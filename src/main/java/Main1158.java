import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main1158 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        List<Integer> people = new ArrayList<>();
        List<String> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            people.add(i);
        }
        int person = 0;
        int index = 0;
        while (!people.isEmpty()) {
            index = (index + k) % people.size();
            person = people.get(index);
            answer.add(Integer.toString(person));
            people.remove((Integer) person);
        }
        System.out.println("<" + String.join(", ", answer) + ">");
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
