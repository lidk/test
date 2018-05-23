package com.test.entity;


public class House {
    private Integer id;

    private String housename;

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
     * @return housename
     */
    public String getHousename() {
        return housename;
    }

    /**
     * @param housename
     */
    public void setHousename(String housename) {
        this.housename = housename == null ? null : housename.trim();
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "House [id=" + id + ", housename=" + housename + "]";
	}
    
    
}