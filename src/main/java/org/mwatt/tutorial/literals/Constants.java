package org.mwatt.tutorial.literals;

public class Constants {
    /*
            Data Type	Size	    Description
            byte	    1 byte	    Stores whole numbers from -128 to 127
            short	    2 bytes	    Stores whole numbers from -32,768 to 32,767
            int	        4 bytes	    Stores whole numbers from -2,147,483,648 to 2,147,483,647
            long	    8 bytes	    Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
            float	    4 bytes	    Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
            double	    8 bytes	    Stores fractional numbers. Sufficient for storing 15 decimal digits
            boolean	    1 bit	    Stores true or false values
            char	    2 bytes 	Stores a single character/letter or ASCII values
     */
    public static final short[] bitMasks = {1, 2, 4, 8, 16, 32, 64, 128};
    public static final short[] bitMasks2 = {
            0b000000001,
            0b000000010,
            0b000000100,
            0b000001000,
            0b000010000,
            0b000100000,
            0b001000000,
            0b010000000,
            0b100000000
    };

    public static final byte WHITE_RED   = (byte) 0xFF;
    public static final byte WHITE_GREEN = (byte) 0xFF;
    public static final byte WHITE_BLUE = (byte) 0xFF;

    long creditCardNumber = 1234_5678_9012_3456L;
    long socialSecurityNumber = 999_99_9999L;
    float pi =      3.14_15F;
    long hexBytes = 0xFF_EC_DE_5E;
    long hexWords = 0xCAFE_BABE;
    long maxLong = 0x7fff_ffff_ffff_ffffL;
    byte nybbles = 0b0010_0101;
    long bytes = 0b11010010_01101001_10010100_10010010;
}
