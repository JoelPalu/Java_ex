package sql.dao;

import jakarta.persistence.EntityManager;
import sql.datasource.MariaDbJpaConnection;
import sql.entity.Currency;
import sql.entity.Transaction;

public class TransactionDao {

    public void addTransaction(Currency currency_from, Currency currency_to, double amount_from, double amount_to){
        Transaction t = new Transaction(currency_from, currency_to, amount_from, amount_to);
        persist(t);
    }

    private void persist(Transaction t) {
        EntityManager em = MariaDbJpaConnection.getInstanceC();
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();

    }
}
