package com.zcm.commons.utils;

import java.util.*;

/**
 * @ClassName: RandomUtil
 * @Author: FJW
 * @Date: 2021/4/28 15:51
 * @Version: 1.0.0
 * @Description: 随机处理类
 */
public class RandomUtil {
    /**
     * An instance of {@link java.util.Random}.
     */
    public static final Random JVM_RANDOM = new Random();

    /**
     * <p>Returns the next pseudorandom, uniformly distributed int value
     * from the Math.random() sequence.</p>
     * <b>N.B. All values are >= 0.<b>
     * @return the random int
     */
    public static int nextInt() {
        return nextInt(JVM_RANDOM);
    }

    /**
     * <p>Returns the next pseudorandom, uniformly distributed int value
     * from the given <code>random</code> sequence.</p>
     *
     * @param random the Random sequence generator.
     * @return the random int
     */
    public static int nextInt(Random random) {
        return random.nextInt();
    }

    /**
     * <p>Returns a pseudorandom, uniformly distributed int value
     * between <code>0</code> (inclusive) and the specified value
     * (exclusive), from the Math.random() sequence.</p>
     *
     * @param n  the specified exclusive max-value
     * @return the random int
     */
    public static int nextInt(int n) {
        return nextInt(JVM_RANDOM, n);
    }

    /**
     * <p>Returns a pseudorandom, uniformly distributed int value
     * between <code>0</code> (inclusive) and the specified value
     * (exclusive), from the given Random sequence.</p>
     *
     * @param random the Random sequence generator.
     * @param n  the specified exclusive max-value
     * @return the random int
     */
    public static int nextInt(Random random, int n) {
        // check this cannot return 'n'
        return random.nextInt(n);
    }

    /**
     * <p>Returns the next pseudorandom, uniformly distributed long value
     * from the Math.random() sequence.</p>
     * <b>N.B. All values are >= 0.<b>
     * @return the random long
     */
    public static long nextLong() {
        return nextLong(JVM_RANDOM);
    }

    /**
     * <p>Returns the next pseudorandom, uniformly distributed long value
     * from the given Random sequence.</p>
     *
     * @param random the Random sequence generator.
     * @return the random long
     */
    public static long nextLong(Random random) {
        return random.nextLong();
    }

    /**
     * <p>Returns the next pseudorandom, uniformly distributed boolean value
     * from the Math.random() sequence.</p>
     *
     * @return the random boolean
     */
    public static boolean nextBoolean() {
        return nextBoolean(JVM_RANDOM);
    }

    /**
     * <p>Returns the next pseudorandom, uniformly distributed boolean value
     * from the given random sequence.</p>
     *
     * @param random the Random sequence generator.
     * @return the random boolean
     */
    public static boolean nextBoolean(Random random) {
        return random.nextBoolean();
    }

    /**
     * <p>Returns the next pseudorandom, uniformly distributed float value
     * between <code>0.0</code> and <code>1.0</code> from the Math.random()
     * sequence.</p>
     *
     * @return the random float
     */
    public static float nextFloat() {
        return nextFloat(JVM_RANDOM);
    }

    /**
     * <p>Returns the next pseudorandom, uniformly distributed float value
     * between <code>0.0</code> and <code>1.0</code> from the given Random
     * sequence.</p>
     *
     * @param random the Random sequence generator.
     * @return the random float
     */
    public static float nextFloat(Random random) {
        return random.nextFloat();
    }

    /**
     * <p>Returns the next pseudorandom, uniformly distributed float value
     * between <code>0.0</code> and <code>1.0</code> from the Math.random()
     * sequence.</p>
     *
     * @return the random double
     */
    public static double nextDouble() {
        return nextDouble(JVM_RANDOM);
    }

    /**
     * <p>Returns the next pseudorandom, uniformly distributed float value
     * between <code>0.0</code> and <code>1.0</code> from the given Random
     * sequence.</p>
     *
     * @param random the Random sequence generator.
     * @return the random double
     */
    public static double nextDouble(Random random) {
        return random.nextDouble();
    }
}
