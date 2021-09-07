package models;

import java.time.LocalDateTime;
import java.util.StringJoiner;

public class Customer {

    private Long id;
    private String first_name;
    private String last_name;
    private LocalDateTime date_of_birth;
    private String status;
    private Long open_branch_id;
    private LocalDateTime inserted_date;
    private String inserted_by;

    public Customer(Long id, String first_name, String last_name, LocalDateTime date_of_birth, String status, Long open_branch_id, LocalDateTime inserted_date, String inserted_by) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
        this.status = status;
        this.open_branch_id = open_branch_id;
        this.inserted_date = inserted_date;
        this.inserted_by = inserted_by;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public LocalDateTime getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(LocalDateTime date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getOpen_branch_id() {
        return open_branch_id;
    }

    public void setOpen_branch_id(Long open_branch_id) {
        this.open_branch_id = open_branch_id;
    }

    public LocalDateTime getInserted_date() {
        return inserted_date;
    }

    public void setInserted_date(LocalDateTime inserted_date) {
        this.inserted_date = inserted_date;
    }

    public String getInserted_by() {
        return inserted_by;
    }

    public void setInserted_by(String inserted_by) {
        this.inserted_by = inserted_by;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Customer.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("first_name='" + first_name + "'")
                .add("last_name='" + last_name + "'")
                .add("date_of_birth=" + date_of_birth)
                .add("status='" + status + "'")
                .add("open_branch_id=" + open_branch_id)
                .add("inserted_date=" + inserted_date)
                .add("inserted_by='" + inserted_by + "'")
                .toString();
    }
}
