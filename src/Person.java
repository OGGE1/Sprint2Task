/**
 * Created by Oscar Norman <br>
 * Date: 2020-10-11   <br>
 * Time: 13:18   <br>
 * Project: Sprint 2 Inlämningsuppgift <br>
 */
public abstract class Person {
    private String personnummer;
    private String namn;

    Person(String personnummer, String namn) {
        this.personnummer = personnummer;
        this.namn = namn;
    }
}
