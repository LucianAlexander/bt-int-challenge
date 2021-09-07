package models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.StringJoiner;

public class Transaction {

    private Long id;
    private Long debitAccId;
    private Long creditAccId;
    private Long transactionBranchId;
    private BigDecimal amount;
    private String status;
    private LocalDateTime insertedDate;

    public Transaction(Long id, Long debitAccId, Long creditAccId, Long transactionBranchId, BigDecimal amount, String status, LocalDateTime insertedDate) {
        this.id = id;
        this.debitAccId = debitAccId;
        this.creditAccId = creditAccId;
        this.transactionBranchId = transactionBranchId;
        this.amount = amount;
        this.status = status;
        this.insertedDate = insertedDate;
    }

    public Transaction() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDebitAccId() {
        return debitAccId;
    }

    public void setDebitAccId(Long debitAccId) {
        this.debitAccId = debitAccId;
    }

    public Long getCreditAccId() {
        return creditAccId;
    }

    public void setCreditAccId(Long creditAccId) {
        this.creditAccId = creditAccId;
    }

    public Long getTransactionBranchId() {
        return transactionBranchId;
    }

    public void setTransactionBranchId(Long transactionBranchId) {
        this.transactionBranchId = transactionBranchId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getInsertedDate() {
        return insertedDate;
    }

    public void setInsertedDate(LocalDateTime insertedDate) {
        this.insertedDate = insertedDate;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Transaction.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("debitAccId=" + debitAccId)
                .add("creditAccId=" + creditAccId)
                .add("transactionBranchId=" + transactionBranchId)
                .add("amount=" + amount)
                .add("status='" + status + "'")
                .add("insertedDate=" + insertedDate)
                .toString();
    }
}
