import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List < Integer > sequence = new ArrayList< >();
        while (scanner.hasNextInt()) {
            int numberOfSequence = scanner.nextInt();
            if (numberOfSequence == 0) {
                break;
            }
            sequence.add(numberOfSequence);
        }

        System.out.println(isSequenceAcsOrDesc(sequence));
    }
    
    private static boolean isSequenceAcsOrDesc(List<Integer> sequence) {
        for (int i = 0; i < sequence.size() - 2; i++) {
            Integer previous = sequence.get(i);
            Integer next = sequence.get(i + 1);
            Integer subsequent = sequence.get(i + 2);
            if (next >= previous && subsequent >= next
                    || next <= previous && subsequent <= next) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

}
