import java.util.Date;

class Designer extends Person {
    private String designSpecialty;
    private String positionInCompany;

    public Designer(String name, Date birthDate, String designSpecialty, String positionInCompany) {
        super(name, birthDate);
        this.designSpecialty = designSpecialty;
        this.positionInCompany = positionInCompany;
    }

    public String getDesignerSpecialty() {
        return this.designSpecialty;
    }

    public String getPositionInCompany() {
        return this.positionInCompany;
    }
}