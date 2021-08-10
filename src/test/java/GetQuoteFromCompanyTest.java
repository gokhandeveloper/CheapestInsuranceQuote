import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class GetQuoteFromCompanyTest {

    @Test
    public void nothing() {
        Map<InsuranceCompany, Quote> quotes = new HashMap<>();
        var company1 = new InsuranceCompany();
        company1.companyName="site1";
        var getQuote=  new GetQuoteFromCompany(company1);
        Quote quote = getQuote.getQUote();
        quotes.put(company1,quote);
        quotes.forEach((i,q) -> System.out.println(i.companyName + q.price));

    }





}
