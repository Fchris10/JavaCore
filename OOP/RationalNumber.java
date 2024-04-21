package OOP;
import java.util.Objects;
public class RationalNumber {

    int numerator;
    int denominator;

    public RationalNumber(int numerator, int denominator) {
        int op = greatestCommonDivisor(numerator, denominator);
        this.numerator = numerator / op;
        this.denominator = denominator / op;
    }
    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }

    public RationalNumber add(RationalNumber o){
        int minCM = leastCommonMultiple(o.denominator, this.denominator);
        int sum =  ((minCM / o.denominator)* o.numerator) + ((minCM / this.denominator)* this.numerator);
        return new RationalNumber(sum, minCM);
    }
    RationalNumber multiply(RationalNumber o){
        int numMy = this.numerator * o.numerator;
        int denMy = this.denominator * o.denominator;
        return new RationalNumber(numMy, denMy);
    }
    public static int greatestCommonDivisor(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int rest = max % min;
        if (max % min == 0) {
            return min;
        } else {
            return greatestCommonDivisor(min, rest);
        }
    }

    public static int leastCommonMultiple(int a, int b) {
        return Math.abs(a * b) / greatestCommonDivisor(a, b);
    }

    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o == null || this.getClass() != o.getClass()){
            return false;
        }
        RationalNumber other = (RationalNumber) o;
        return (numerator == other.numerator && denominator == other.denominator);
    }
    public int hashCode(){
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return "RationalNumber{" + "numerator=" + numerator + ", denominator=" + denominator + '}';
    }
}
