package httpserver.handlers;

import cs601.project1.SearchTableP1;
import cs601.project1.SearchableP1;
import java.io.IOException;
import java.util.stream.Stream;

public class FindHandler<T extends SearchableP1> extends SearchTableHandler<T> {

  public FindHandler(String domain, SearchTableP1<T> table) {
    super(domain, table);
  }

  @Override
  protected String initPostKey() {
    return "find";
  }

  @Override
  protected String getPostTermResponse(String term) throws IOException {
    return null;
  }

  @Override
  protected String getInputTextBoxLabel() {
    return "ASIN to search for";
  }

  @Override
  protected String getGetPageTitle() {
    return "ASIN Search";
  }

  @Override
  protected Stream<T> searchResults(String term) {
    return table.findAsinStream(term);
  }
}
