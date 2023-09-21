package me.nettychannell.api.math;

import lombok.experimental.UtilityClass;
import org.bukkit.ChatColor;

import java.util.Random;

@UtilityClass
public class GameRandom {

    public <T> T getRandomEnumValue(Class<T> enumClass) {
        return enumClass.getEnumConstants()[new Random().nextInt(enumClass.getEnumConstants().length)];
    }

    public int getRandomInt(int min, int max) {
        return new Random().nextInt(max - min) + min;
    }

    public double getRandomDouble(double min, double max) {
        return new Random().nextDouble() * (max - min) + min;
    }

    public float getRandomFloat(float min, float max) {
        return new Random().nextFloat() * (max - min) + min;
    }

    public long getRandomLong(long min, long max) {
        return new Random().nextLong() * (max - min) + min;
    }

    public boolean getRandomBoolean() {
        return new Random().nextBoolean();
    }

    public byte getRandomByte() {
        return (byte) new Random().nextInt();
    }

    public short getRandomShort() {
        return (short) new Random().nextInt();
    }

    public char getRandomChar() {
        return (char) new Random().nextInt();
    }

    public ChatColor getRandomChatColor() {
        return ChatColor.values()[new Random().nextInt(ChatColor.values().length)];
    }

    public String getRandomString(int length) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append(getRandomChar());
        }
        return builder.toString();
    }

}
