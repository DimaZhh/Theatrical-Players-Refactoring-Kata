package types;

public class TragedyType implements Type {

    @Override
    public int calculateAmountForPerformance(int audience) {
        int amount = 40000;
        if (audience > 30) {
            amount += 1000 * (audience - 30);
        }
        return amount;
    }

    @Override
    public int calculateVolumeCredit(int audience) {
        return Math.max(audience - 30, 0);
    }
}
