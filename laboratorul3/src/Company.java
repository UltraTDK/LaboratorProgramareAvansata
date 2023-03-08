class Company implements Comparable<Company>, Node {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Company company) {
        return name.compareTo(company.name);
    }
}