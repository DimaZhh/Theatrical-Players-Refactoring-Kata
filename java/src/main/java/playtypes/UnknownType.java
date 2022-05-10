package playtypes;

public class UnknownType implements PlayType{

    @Override
    public int calculateAmountForPerformance(int audience) {
        throw new RuntimeException("unknown type");
    }

    @Override
    public int calculateVolumeCredit(int audience) {
        throw new RuntimeException("unknown type");
    }
}
