package models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.StringJoiner;

public class Account {
    private Long id;
    private String accountNumber;
    private String currency;
    private String iban;
    private Long accountClassId;
    private BigDecimal availableBalance;
    private String status;
    private Long customerId;
    private Long openBranch;
    private LocalDateTime insertedDate;
    private String insertedBy;

    public Account() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Long getAccountClassId() {
        return accountClassId;
    }

    public void setAccountClassId(Long accountClassId) {
        this.accountClassId = accountClassId;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getOpenBranch() {
        return openBranch;
    }

    public void setOpenBranch(Long openBranch) {
        this.openBranch = openBranch;
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
        return new StringJoiner(", ", Account.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("accountNumber='" + accountNumber + "'")
                .add("currency='" + currency + "'")
                .add("iban='" + iban + "'")
                .add("accountClassId=" + accountClassId)
                .add("availableBalance=" + availableBalance)
                .add("status='" + status + "'")
                .add("customerId=" + customerId)
                .add("openBranch=" + openBranch)
                .add("insertedDate=" + insertedDate)
                .add("insertedBy='" + insertedBy + "'")
                .toString();
    }
}
