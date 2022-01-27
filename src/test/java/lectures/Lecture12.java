package lectures;

import beans.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import mockdata.MockData;
import org.junit.Test;

public class Lecture12 {
  @Test
  public void understandingCollect() throws Exception {
    List<String> emails = MockData.getPeople()
        .stream()
        .map(Person::getEmail)
            //Mehtod references
            .collect(ArrayList::new,
                    ArrayList::add,
                    ArrayList::addAll);
            //Lambda function
            /*.collect(() -> new ArrayList<String>(),
                    ((list, element) -> list.add(element)),
                    (list,list2) -> list.addAll(list2));*/

        //.collect(Collectors.toList());

    emails.forEach(System.out::println);
  }
}
