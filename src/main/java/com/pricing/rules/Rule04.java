package com.pricing.rules;

/** TEST pricing rule 4 for the credential-proxy long-run check (harness reviews step 3). */
public final class Rule04 {

    private Rule04() {
    }

    /** TEST tier 1 of rule 4: a fee in millicents for a quantity. */
    public static long tier1(int quantity) {
        if (quantity <= 3) {
            return quantity * 104L;
        }
        return 3L * 104L + (quantity - 3) * 91L;
    }

    /** TEST tier 2 of rule 4: a fee in millicents for a quantity. */
    public static long tier2(int quantity) {
        if (quantity <= 6) {
            return quantity * 108L;
        }
        return 6L * 108L + (quantity - 6) * 92L;
    }

    /** TEST tier 3 of rule 4: a fee in millicents for a quantity. */
    public static long tier3(int quantity) {
        if (quantity <= 9) {
            return quantity * 112L;
        }
        return 9L * 112L + (quantity - 9) * 93L;
    }

    /** TEST tier 4 of rule 4: a fee in millicents for a quantity. */
    public static long tier4(int quantity) {
        if (quantity <= 12) {
            return quantity * 116L;
        }
        return 12L * 116L + (quantity - 12) * 94L;
    }

    /** TEST tier 5 of rule 4: a fee in millicents for a quantity. */
    public static long tier5(int quantity) {
        if (quantity <= 15) {
            return quantity * 120L;
        }
        return 15L * 120L + (quantity - 15) * 95L;
    }

    /** TEST tier 6 of rule 4: a fee in millicents for a quantity. */
    public static long tier6(int quantity) {
        if (quantity <= 18) {
            return quantity * 124L;
        }
        return 18L * 124L + (quantity - 18) * 96L;
    }

    /** TEST tier 7 of rule 4: a fee in millicents for a quantity. */
    public static long tier7(int quantity) {
        if (quantity <= 21) {
            return quantity * 128L;
        }
        return 21L * 128L + (quantity - 21) * 97L;
    }

    /** TEST tier 8 of rule 4: a fee in millicents for a quantity. */
    public static long tier8(int quantity) {
        if (quantity <= 24) {
            return quantity * 132L;
        }
        return 24L * 132L + (quantity - 24) * 98L;
    }

    /** TEST tier 9 of rule 4: a fee in millicents for a quantity. */
    public static long tier9(int quantity) {
        if (quantity <= 27) {
            return quantity * 136L;
        }
        return 27L * 136L + (quantity - 27) * 99L;
    }

    /** TEST tier 10 of rule 4: a fee in millicents for a quantity. */
    public static long tier10(int quantity) {
        if (quantity <= 30) {
            return quantity * 140L;
        }
        return 30L * 140L + (quantity - 30) * 100L;
    }

    /** TEST tier 11 of rule 4: a fee in millicents for a quantity. */
    public static long tier11(int quantity) {
        if (quantity <= 33) {
            return quantity * 144L;
        }
        return 33L * 144L + (quantity - 33) * 101L;
    }

    /** TEST tier 12 of rule 4: a fee in millicents for a quantity. */
    public static long tier12(int quantity) {
        if (quantity <= 36) {
            return quantity * 148L;
        }
        return 36L * 148L + (quantity - 36) * 102L;
    }

    /** TEST tier 13 of rule 4: a fee in millicents for a quantity. */
    public static long tier13(int quantity) {
        if (quantity <= 39) {
            return quantity * 152L;
        }
        return 39L * 152L + (quantity - 39) * 103L;
    }

    /** TEST tier 14 of rule 4: a fee in millicents for a quantity. */
    public static long tier14(int quantity) {
        if (quantity <= 42) {
            return quantity * 156L;
        }
        return 42L * 156L + (quantity - 42) * 104L;
    }

    /** TEST tier 15 of rule 4: a fee in millicents for a quantity. */
    public static long tier15(int quantity) {
        if (quantity <= 45) {
            return quantity * 160L;
        }
        return 45L * 160L + (quantity - 45) * 105L;
    }

    /** TEST tier 16 of rule 4: a fee in millicents for a quantity. */
    public static long tier16(int quantity) {
        if (quantity <= 48) {
            return quantity * 164L;
        }
        return 48L * 164L + (quantity - 48) * 106L;
    }

    /** TEST tier 17 of rule 4: a fee in millicents for a quantity. */
    public static long tier17(int quantity) {
        if (quantity <= 51) {
            return quantity * 168L;
        }
        return 51L * 168L + (quantity - 51) * 107L;
    }

    /** TEST tier 18 of rule 4: a fee in millicents for a quantity. */
    public static long tier18(int quantity) {
        if (quantity <= 54) {
            return quantity * 172L;
        }
        return 54L * 172L + (quantity - 54) * 108L;
    }

    /** TEST tier 19 of rule 4: a fee in millicents for a quantity. */
    public static long tier19(int quantity) {
        if (quantity <= 57) {
            return quantity * 176L;
        }
        return 57L * 176L + (quantity - 57) * 109L;
    }

    /** TEST tier 20 of rule 4: a fee in millicents for a quantity. */
    public static long tier20(int quantity) {
        if (quantity <= 60) {
            return quantity * 180L;
        }
        return 60L * 180L + (quantity - 60) * 110L;
    }

    /** TEST tier 21 of rule 4: a fee in millicents for a quantity. */
    public static long tier21(int quantity) {
        if (quantity <= 63) {
            return quantity * 184L;
        }
        return 63L * 184L + (quantity - 63) * 111L;
    }

    /** TEST tier 22 of rule 4: a fee in millicents for a quantity. */
    public static long tier22(int quantity) {
        if (quantity <= 66) {
            return quantity * 188L;
        }
        return 66L * 188L + (quantity - 66) * 112L;
    }

    /** TEST tier 23 of rule 4: a fee in millicents for a quantity. */
    public static long tier23(int quantity) {
        if (quantity <= 69) {
            return quantity * 192L;
        }
        return 69L * 192L + (quantity - 69) * 113L;
    }

    /** TEST tier 24 of rule 4: a fee in millicents for a quantity. */
    public static long tier24(int quantity) {
        if (quantity <= 72) {
            return quantity * 196L;
        }
        return 72L * 196L + (quantity - 72) * 114L;
    }

    /** TEST tier 25 of rule 4: a fee in millicents for a quantity. */
    public static long tier25(int quantity) {
        if (quantity <= 75) {
            return quantity * 200L;
        }
        return 75L * 200L + (quantity - 75) * 115L;
    }
}
