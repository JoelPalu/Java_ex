package sql.entity;
import jakarta.persistence.*;
import sql.dao.TransactionDao;


@Entity
@Table(name = "currencyt")
public class Currency {
    @Column(name = "c_name")
    private String name;
    @Column(name = "abbreviation")
    private String code;
    @Column(name = "rate")
    private double rate;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    public Currency(String name, String code, double rate) {
        this();
        this.name = name;
        this.code = code;
        this.rate = rate;
    }

    public Currency() {

    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public double getRate() {
        return rate;
    }



}
