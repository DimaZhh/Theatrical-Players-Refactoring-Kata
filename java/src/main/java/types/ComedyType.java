package types;

public class ComedyType implements Type {

    @Override
    public int calculateAmountForPerformance(int audience) {
        int amount = 30000;
        if (audience > 20) {
            amount += 10000 + 500 * (audience - 20);
        }
        return amount + 300 * audience;
    }

    @Override
    public int calculateVolumeCredit(int audience) {
        return (int) (Math.max(audience - 30, 0) + Math.floor(audience/ 5));
    }
}
