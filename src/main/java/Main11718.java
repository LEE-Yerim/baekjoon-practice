import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 그대로 출력하기
public class Main11718 {
    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = "";

            while((str = br.readLine()) != null)
            {
                System.out.println(str);
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
