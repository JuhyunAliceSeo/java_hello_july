package java_0703;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class _06_Lotto {
    public static void main(String[] args) {
        Set<Integer> lottoNumbers = new HashSet<>();

        // 로또 번호 생성
        while (lottoNumbers.size() != 6) {
            int randomNumber = (int) (Math.random() *45) + 1;
            lottoNumbers.add(randomNumber);
        }

        // 결과 출력
        System.out.println("로또 번호: " + lottoNumbers);
    }

}

