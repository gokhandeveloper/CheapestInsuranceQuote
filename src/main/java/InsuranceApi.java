import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class InsuranceApi {

    public static Quote getQuote(InsuranceCompany company1) {
        var quote = new Quote();
        var slowApiFuture
                = CompletableFuture.supplyAsync(()-> {
            System.out.println("Getting a quote from -->" + company1.companyName);
            simulateApiDelay();
            var randomprice = new Random();
            return String.valueOf(299+ randomprice.nextInt(10));
        });

        try {
            var result = slowApiFuture
                    .completeOnTimeout("Could not get the price",2, TimeUnit.SECONDS)
                    .get();
            quote.price = result;
            quote.siteName = company1.companyName;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
      return quote;

    }

    private static void simulateApiDelay() {
        try {
            var delay = Math.random()*2000;
            System.out.println("api delay of " + delay);
            Thread.sleep((long) (delay));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
