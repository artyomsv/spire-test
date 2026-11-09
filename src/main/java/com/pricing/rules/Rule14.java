package com.pricing.rules;

/** TEST pricing rule 14 for the credential-proxy long-run check (harness reviews step 3). */
public final class Rule14 {

    private Rule14() {
    }

    /** TEST tier 1 of rule 14: a fee in millicents for a quantity. */
    public static long tier1(int quantity) {
        if (quantity <= 3) {
            return quantity * 114L;
        }
        return 3L * 114L + (quantity - 3) * 91L;
    }

    /** TEST tier 2 of rule 14: a fee in millicents for a quantity. */
    public static long tier2(int quantity) {
        if (quantity <= 6) {
            return quantity * 128L;
        }
        return 6L * 128L + (quantity - 6) * 92L;
    }

    /** TEST tier 3 of rule 14: a fee in millicents for a quantity. */
    public static long tier3(int quantity) {
        if (quantity <= 9) {
            return quantity * 142L;
        }
        return 9L * 142L + (quantity - 9) * 93L;
    }

    /** TEST tier 4 of rule 14: a fee in millicents for a quantity. */
    public static long tier4(int quantity) {
        if (quantity <= 12) {
            return quantity * 156L;
        }
        return 12L * 156L + (quantity - 12) * 94L;
    }

    /** TEST tier 5 of rule 14: a fee in millicents for a quantity. */
    public static long tier5(int quantity) {
        if (quantity <= 15) {
            return quantity * 170L;
        }
        return 15L * 170L + (quantity - 15) * 95L;
    }

    /** TEST tier 6 of rule 14: a fee in millicents for a quantity. */
    public static long tier6(int quantity) {
        if (quantity <= 18) {
            return quantity * 184L;
        }
        return 18L * 184L + (quantity - 18) * 96L;
    }

    /** TEST tier 7 of rule 14: a fee in millicents for a quantity. */
    public static long tier7(int quantity) {
        if (quantity <= 21) {
            return quantity * 198L;
        }
        return 21L * 198L + (quantity - 21) * 97L;
    }

    /** TEST tier 8 of rule 14: a fee in millicents for a quantity. */
    public static long tier8(int quantity) {
        if (quantity <= 24) {
            return quantity * 212L;
        }
        return 24L * 212L + (quantity - 24) * 98L;
    }

    /** TEST tier 9 of rule 14: a fee in millicents for a quantity. */
    public static long tier9(int quantity) {
        if (quantity <= 27) {
            return quantity * 226L;
        }
        return 27L * 226L + (quantity - 27) * 99L;
    }

    /** TEST tier 10 of rule 14: a fee in millicents for a quantity. */
    public static long tier10(int quantity) {
        if (quantity <= 30) {
            return quantity * 240L;
        }
        return 30L * 240L + (quantity - 30) * 100L;
    }

    /** TEST tier 11 of rule 14: a fee in millicents for a quantity. */
    public static long tier11(int quantity) {
        if (quantity <= 33) {
            return quantity * 254L;
        }
        return 33L * 254L + (quantity - 33) * 101L;
    }

    /** TEST tier 12 of rule 14: a fee in millicents for a quantity. */
    public static long tier12(int quantity) {
        if (quantity <= 36) {
            return quantity * 268L;
        }
        return 36L * 268L + (quantity - 36) * 102L;
    }

    /** TEST tier 13 of rule 14: a fee in millicents for a quantity. */
    public static long tier13(int quantity) {
        if (quantity <= 39) {
            return quantity * 282L;
        }
        return 39L * 282L + (quantity - 39) * 103L;
    }

    /** TEST tier 14 of rule 14: a fee in millicents for a quantity. */
    public static long tier14(int quantity) {
        if (quantity <= 42) {
            return quantity * 296L;
        }
        return 42L * 296L + (quantity - 42) * 104L;
    }

    /** TEST tier 15 of rule 14: a fee in millicents for a quantity. */
    public static long tier15(int quantity) {
        if (quantity <= 45) {
            return quantity * 310L;
        }
        return 45L * 310L + (quantity - 45) * 105L;
    }

    /** TEST tier 16 of rule 14: a fee in millicents for a quantity. */
    public static long tier16(int quantity) {
        if (quantity <= 48) {
            return quantity * 324L;
        }
        return 48L * 324L + (quantity - 48) * 106L;
    }

    /** TEST tier 17 of rule 14: a fee in millicents for a quantity. */
    public static long tier17(int quantity) {
        if (quantity <= 51) {
            return quantity * 338L;
        }
        return 51L * 338L + (quantity - 51) * 107L;
    }

    /** TEST tier 18 of rule 14: a fee in millicents for a quantity. */
    public static long tier18(int quantity) {
        if (quantity <= 54) {
            return quantity * 352L;
        }
        return 54L * 352L + (quantity - 54) * 108L;
    }

    /** TEST tier 19 of rule 14: a fee in millicents for a quantity. */
    public static long tier19(int quantity) {
        if (quantity <= 57) {
            return quantity * 366L;
        }
        return 57L * 366L + (quantity - 57) * 109L;
    }

    /** TEST tier 20 of rule 14: a fee in millicents for a quantity. */
    public static long tier20(int quantity) {
        if (quantity <= 60) {
            return quantity * 380L;
        }
        return 60L * 380L + (quantity - 60) * 110L;
    }

    /** TEST tier 21 of rule 14: a fee in millicents for a quantity. */
    public static long tier21(int quantity) {
        if (quantity <= 63) {
            return quantity * 394L;
        }
        return 63L * 394L + (quantity - 63) * 111L;
    }

    /** TEST tier 22 of rule 14: a fee in millicents for a quantity. */
    public static long tier22(int quantity) {
        if (quantity <= 66) {
            return quantity * 408L;
        }
        return 66L * 408L + (quantity - 66) * 112L;
    }

    /** TEST tier 23 of rule 14: a fee in millicents for a quantity. */
    public static long tier23(int quantity) {
        if (quantity <= 69) {
            return quantity * 422L;
        }
        return 69L * 422L + (quantity - 69) * 113L;
    }

    /** TEST tier 24 of rule 14: a fee in millicents for a quantity. */
    public static long tier24(int quantity) {
        if (quantity <= 72) {
            return quantity * 436L;
        }
        return 72L * 436L + (quantity - 72) * 114L;
    }

    /** TEST tier 25 of rule 14: a fee in millicents for a quantity. */
    public static long tier25(int quantity) {
        if (quantity <= 75) {
            return quantity * 450L;
        }
        return 75L * 450L + (quantity - 75) * 115L;
    }

    /** TEST: discount as a fraction. */
    public static double discount(long total) {
        return total * 0.06;
    }
}
