package java_0703;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class _06_Lotto {
    public static void main(String[] args) {
        Set<Integer> lottoNumbers = new HashSet<>();

        // 로또 번호 생성
        while (lottoNumbers.size() < 6) {
            int randomNumber = RandomNumber();
            lottoNumbers.add(randomNumber);
        }

        // 결과 출력
        System.out.println("로또 번호: " + lottoNumbers);
    }

    // 1부터 45 사이의 난수 생성
    private static int RandomNumber() {
        Random random = new Random();
        return random.nextInt(45) + 1;
    }
}

