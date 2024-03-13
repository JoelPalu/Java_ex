package sql.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "transaction")
public class Transaction {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    //@JoinColumn(name="currency_from_id", referencedColumnName="id")
    private Currency currency_from;

    @ManyToOne
    //@JoinColumn(name="currency_to_id", referencedColumnName="id")
    private Currency currency_to;
    private double amount_from;
    private double amount_to;


    public Transaction(Currency currency_from, Currency currency_to, double amount_from, double amount_to) {
        this();
        this.currency_from = currency_from;
        this.currency_to = currency_to;
        this.amount_from = amount_from;
        this.amount_to = amount_to;
    }

    public Transaction() {

    }

    public Currency getCurrency_from() {
        return currency_from;
    }

    public Currency getCurrency_to() {
        return currency_to;
    }

    public double getAmount_from() {
        return amount_from;
    }

    public double getAmount_to() {
        return amount_to;
    }

    public int getId() {
        return id;
    }




}
