package sql.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import sql.entity.Currency;
import sql.datasource.MariaDbJpaConnection;

import java.util.ArrayList;

public class CurrencyDao {

    public Currency getCurrency(String code) {
        EntityManager em = MariaDbJpaConnection.getInstanceC();
        // Create a query using JPQL to search by the non-primary attribute
        Query query = em.createQuery("SELECT c FROM Currency c WHERE c.code = :code", Currency.class);
        query.setParameter("code", code);
        Currency c = (Currency) query.getSingleResult();
        System.out.println(c.getName() + " " + c.getCode() + " " + c.getRate());

        return c;

    }
    public ArrayList<String> getCurrencyCodes() {
        EntityManager em = MariaDbJpaConnection.getInstanceC();
        Query query = em.createQuery("SELECT c.code FROM Currency c");
        ArrayList<String> codes = (ArrayList<String>) query.getResultList();
        return codes;
    }

    public void addCurrency(Currency c) {
        EntityManager em = MariaDbJpaConnection.getInstanceC();
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
    }

    public boolean connectionToString() {
        EntityManager em = MariaDbJpaConnection.getInstanceC();
        try {
            Query query = em.createQuery("SELECT 1");
            query.getSingleResult();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void addCurrency(String text, String text1, double v) {
        persist(new Currency(text, text1, v));
    }

    private void persist(Currency currency) {
        EntityManager em = MariaDbJpaConnection.getInstanceC();
        em.getTransaction().begin();
        em.persist(currency);
        em.getTransaction().commit();
    }
}
