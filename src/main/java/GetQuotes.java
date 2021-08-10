import java.util.List;
import java.util.stream.Collectors;

public class GetQuotes {


    private List<InsuranceCompany> companyList;

    public GetQuotes(List<InsuranceCompany> companyList) {

        this.companyList = companyList;
    }

    public List<Quote> getQuotes() {
        return companyList.stream()
                .map(company -> new GetQuoteFromCompany(company).getQuote())
                .collect(Collectors.toList());
    }
}
