package models;

import java.util.StringJoiner;

public class Branch {

    private Long id;
    private String shortDescription;
    private String longDescription;
    private String adress;
    private Long parentBranchId;

    public Branch(Long id, String shortDescription, String longDescription, String adress, Long parentBranchId) {
        this.id = id;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.adress = adress;
        this.parentBranchId = parentBranchId;
    }

    public Branch() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Long getParentBranchId() {
        return parentBranchId;
    }

    public void setParentBranchId(Long parentBranchId) {
        this.parentBranchId = parentBranchId;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Branch.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("shortDescription='" + shortDescription + "'")
                .add("longDescription='" + longDescription + "'")
                .add("adress='" + adress + "'")
                .add("parentBranchId=" + parentBranchId)
                .toString();
    }
}
