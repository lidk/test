package com.test.entity;


public class Takelookinfo {
    private Integer id;

    private Integer empid;

    private Integer customerid;

    private Integer houseid;
    
    private Emp emp;	
    
    private House house;
    
    private Customer customer;
    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return empid
     */
    public Integer getEmpid() {
        return empid;
    }

    /**
     * @param empid
     */
    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    /**
     * @return customerid
     */
    public Integer getCustomerid() {
        return customerid;
    }

    /**
     * @param customerid
     */
    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    /**
     * @return houseid
     */
    public Integer getHouseid() {
        return houseid;
    }

    /**
     * @param houseid
     */
    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

	/**
	 * @return the emp
	 */
	public Emp getEmp() {
		return emp;
	}

	/**
	 * @param emp the emp to set
	 */
	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	/**
	 * @return the house
	 */
	public House getHouse() {
		return house;
	}

	/**
	 * @param house the house to set
	 */
	public void setHouse(House house) {
		this.house = house;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Takelookinfo [id=" + id + ", empid=" + empid + ", customerid=" + customerid + ", houseid=" + houseid
				+ ", emp=" + emp + ", house=" + house + ", customer=" + customer + "]";
	}
    
    
}