package Lab2_0;

import java.util.Arrays;
import java.util.Random;
import java.util.SplittableRandom;

class PseudoRandomNumbers {
    static int[] generate(Random random, int n, int bound) { 
        int[] v = new int[n];

        for (int i = 0; i < n; i++) 
            v[i] = random.nextInt(bound); 

        return v; 
    }

    static int[] generate(SplittableRandom splitRandom, int n, int bound) {
        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            v[i] = splitRandom.nextInt(bound);
        }

        return v;
    }

    public static void main(String[] args) {
        final Long SEED = 42L;

        // ============= RANDOM =============
        Random r1 = new Random(SEED);
        Random r2 = new Random(SEED);

        int[] seqA = generate(r1, 10, 100);
        int[] seqB = generate(r2, 10, 100);

        System.out.println("Seq A: "+Arrays.toString(seqA));
        System.out.println("Seq B: "+Arrays.toString(seqB));

        // ====================================

        SplittableRandom s1 = new SplittableRandom(SEED);
        SplittableRandom s2 = new SplittableRandom(SEED);

        int[] seqC = generate(s1, 10, 200);
        int[] seqD = generate(s2, 10, 200);

        System.out.println("Seq C: "+Arrays.toString(seqC));
        System.out.println("Seq D: "+Arrays.toString(seqD));

        // Nota sobre SecureRandom ---------- 
        // SecureRandom é para segurança/criptografia. Não é voltado a reproduzir 
        // sequências com a mesma seed (comportamento depende do provedor). 
        // Use-o quando NÃO quiser previsibilidade. 
    }

}
