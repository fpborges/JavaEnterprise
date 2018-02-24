package fborges8262;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class ExerciseHibernateApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session tempSession = null;
        SessionFactory tempSessionFactory = null;
        Transaction tempTransaction = null;

        try {

/*
 * We create a SessionFactory based on the hibernate.cfg.xml
 * file; then from a SessionFactory, we can create an individual
 * Session object. The Configuration object changed significantly with
 * Hibernate Version 4; examples from older sources will not work with
 * Version 4 libraries.
 * */

// Create a Hibernate session to CanadaCensusDB
            Configuration tempConfiguration = new Configuration();
            tempConfiguration.configure("/resources/Hibernate.cfg.xml");

            tempSessionFactory = tempConfiguration.buildSessionFactory();
            tempSession = tempSessionFactory.openSession();

// Begin a transaction within the session
            tempTransaction = tempSession.beginTransaction();

// HQL (Hibernate Query Language) SELECT statements will return a set of Objects
// or a set of Object arrays.  This depends on how many items are being queried for.
          String tempHQLSelectString = "SELECT AGEGROUP.description, CENSUSYEAR.censusYear, GEOGRAPHICAREA.alternativeCode FROM AGEGROUP "
                  + "JOIN CENSUSYEAR "
                  + "JOIN GEOGRAPHICAREA "
                  + "WHERE CENSUSYEAR.censusYear LIKE :censusYear";

            Query <Object[]> tempQuery = tempSession.createQuery(tempHQLSelectString)
                    .setParameter("censusYear", "2016");

// Setting maximum number of results may be useful in some cases for pagination
            tempQuery.setMaxResults(25);

// Retrieve the results from the database and store as a collection
            List <Object[]> tempResultList = tempQuery.getResultList();

// Use an iterator to the collection to traverse the results
            Iterator <Object[]> tempResultListIterator = tempResultList.iterator();

// Produce a simple report showing some data about the retrieved teams
            System.out.println("Begin Report.");

            List <String> tempOutputTable = new ArrayList <String>();

            tempOutputTable.add(String.format("%-20s", "Age")
                    + String.format("%-15s", "AgeGroup")
                    + String.format("%-25s", "CensusYear")
                    + String.format("%-25s", "GeographicArea"));

            Boolean tempIsFirstResultFlag = true;
            

            while (tempResultListIterator.hasNext())
            {

                Object[] tempResultSet = tempResultListIterator.next();

                Age tempAge = (Age) tempResultSet[0];
                AgeGroup tempAgeGroup = (AgeGroup) tempResultSet[1];
                CensusYear tempCensusYear = (CensusYear) tempResultSet[2];
                GeographicArea tempGeographicArea = (GeographicArea) tempResultSet[3];

                if (tempIsFirstResultFlag)
                {

                    tempAge = tempAge.getAge();
                    tempIsFirstResultFlag = false;

                }

               /* String tempPosition = tempRoster.getPosition();
                int tempJersey = tempRoster.getJersey();
                String tempLastName = tempPlayer.getLastName();
                String tempFirstName = tempPlayer.getFirstName();

                tempOutputTable.add(String.format("%-20s", tempPosition)
                        + String.format("%-15d", tempJersey)
                        + String.format("%-25s", tempFirstName)
                        + String.format("%-25s", tempLastName));

            }

            PrintOutput("LeagueDB - " + tempTeamName, tempOutputTable);
            System.out.println("Report done.");*/

// If the transaction should be reverted or completed, use rollback() or commit(), respectively
            if (tempTransaction != null)
            {

                tempTransaction.rollback();
//              tempTransaction.commit();

            }

        }
        catch(Exception e)
        {

            if (tempTransaction != null)
            {

                tempTransaction.rollback();

            }

            System.out.println(e.getMessage());
            e.printStackTrace();

        }
        finally
        {

// Free the resources devoted to the Hibernate session
            if (tempSession != null)
            {

                tempSession.close();

            }

            tempSessionFactory.close();

        }

    }

    private static void PrintOutput(String tempOutputTableTitle, List <String> tempOutputTable)
    {

        System.out.println("******************************************************************************************");
        System.out.println();
        System.out.println(tempOutputTableTitle);
        System.out.println();

        for (String tempOutputTableElement : tempOutputTable)
        {

            System.out.println(tempOutputTableElement);

        }

        System.out.println();
        System.out.println("******************************************************************************************");

		
	}

}








