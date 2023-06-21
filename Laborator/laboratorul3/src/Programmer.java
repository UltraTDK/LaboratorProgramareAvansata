import java.util.Date;

class Programmer extends Person {
    private String programmingLanguage;
    private String positionInCompany;


    public Programmer(String name, Date birthDate, String programmingLanguage, String positionInCompany) {
        super(name, birthDate);
        this.programmingLanguage = programmingLanguage;
        this.positionInCompany = positionInCompany;
    }


    public String getProgrammingLanguage() {
        return this.programmingLanguage;
    }


    public String getPositionInCompany() {
        return this.positionInCompany;
    }
}
