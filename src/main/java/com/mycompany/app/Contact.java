package com.mycompany.app;

import java.util.Date;


 
public class Contact 
{
		private long id;

    private String firstName;

    private String lastName;

    private String homePhone;

    private String cellPhone;
        
    private Date bornDate;
    
    /**
     * Constructor
     */
    public Contact()
    {

    }
    
    public Contact(long id, String firstName, String lastName)
    {
				this.id = id;
				this.firstName = firstName;
				this.lastName = lastName;
				bornDate = new Date();
    }

    /**
     * @param id
     */
    public void setId(long id)
    {
        this.id = id;
    }

    /**
     * @return id
     */
    public long getId()
    {
        return id;
    }

    /**
     * Constructor
     * 
     * @param firstName
     * @param lastName
     */
    public Contact(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * @return cellPhone
     */
    public String getCellPhone()
    {
        return cellPhone;
    }

    /**
     * @param cellPhone
     */
    public void setCellPhone(String cellPhone)
    {
        this.cellPhone = cellPhone;
    }

    /**
     * @return firstName
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * @param firstName
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * @return homePhone
     */
    public String getHomePhone()
    {
        return homePhone;
    }

    /**
     * @param homePhone
     */
    public void setHomePhone(String homePhone)
    {
        this.homePhone = homePhone;
    }

    /**
     * @return lastName
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * @param lastName
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * 
     * @return bornDate
     */
    public Date getBornDate()
    {
        return bornDate;
    }

    /**
     * 
     * @param bornDate
     */
    public void setBornDate(Date bornDate)
    {
        this.bornDate = bornDate;
    }
}
