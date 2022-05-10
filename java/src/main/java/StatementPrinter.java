import java.text.NumberFormat;
import java.util.Locale;

public class StatementPrinter {

    private static final NumberFormat formatting = NumberFormat.getCurrencyInstance(Locale.US);
    private final StringBuilder result = new StringBuilder();

    public String print(Invoice invoice) {

        //Calculate totalAmount for each performance
        int totalAmount = invoice.getPerformances().stream().mapToInt(p -> p.getPlay().getType()
                .calculateAmountForPerformance(p.getAudience())).sum();
        //Calculate volumeCredits for each performance
        int volumeCredits = invoice.getPerformances().stream().mapToInt(p -> p.getPlay().getType()
                .calculateVolumeCredit(p.getAudience())).sum();

        //Print to file
        result.append(String.format("Statement for %s\n", invoice.getCustomer()));

        //Add information into file about each type of play
        invoice.getPerformances().forEach(p ->
            result.append(String.format("  %s: %s (%s seats)\n",
                    p.getPlay().getName(),
                    formatting.format(p.getPlay().getType().calculateAmountForPerformance(p.getAudience()) / 100),
                    p.getAudience())));

        //Print to file
        result.append(String.format("Amount owed is %s\n", formatting.format(totalAmount / 100)));
        result.append(String.format("You earned %s credits\n", volumeCredits));
        return result.toString();
    }
}
