package models;

import java.time.LocalDateTime;
import java.util.StringJoiner;

public class Customer {

    private Long id;
    private String firstName;
    private String lastName;
    private LocalDateTime dateOfBirth;
    private String status;
    private Long openBranchId;
    private LocalDateTime insertedDate;
    private String insertedBy;

    public Customer(Long id, String firstName, String lastName, LocalDateTime dateOfBirth, String status, Long openBranchId, LocalDateTime insertedDate, String insertedBy) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.status = status;
        this.openBranchId = openBranchId;
        this.insertedDate = insertedDate;
        this.insertedBy = insertedBy;
    }

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getOpenBranchId() {
        return openBranchId;
    }

    public void setOpenBranchId(Long openBranchId) {
        this.openBranchId = openBranchId;
    }

    public LocalDateTime getInsertedDate() {
        return insertedDate;
    }

    public void setInsertedDate(LocalDateTime insertedDate) {
        this.insertedDate = insertedDate;
    }

    public String getInsertedBy() {
        return insertedBy;
    }

    public void setInsertedBy(String insertedBy) {
        this.insertedBy = insertedBy;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Customer.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .add("dateOfBirth=" + dateOfBirth)
                .add("status='" + status + "'")
                .add("openBranchId=" + openBranchId)
                .add("insertedDate=" + insertedDate)
                .add("insertedBy='" + insertedBy + "'")
                .toString();
    }
}
