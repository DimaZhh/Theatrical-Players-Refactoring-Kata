package types;

public class UnknownType implements Type {

    @Override
    public int calculateAmountForPerformance(int audience) {
        throw new RuntimeException("unknown type");
    }

    @Override
    public int calculateVolumeCredit(int audience) {
        throw new RuntimeException("unknown type");
    }
}
