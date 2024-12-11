package collectionframeworks.arraylistofmodel;

public class StudentModel {
    private Long id;
    private String name;
    private int rollNumber;
    private char section;

    public StudentModel(){

    }

    public StudentModel(Long id, char section, int rollNumber, String name) {
        this.id = id;
        this.section = section;
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }
}
