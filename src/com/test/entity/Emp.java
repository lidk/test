package com.test.entity;


public class Emp {
    private Integer id;

    private String empName;

    private Integer empAge;

    private Double empSalary;

    private String empDept;

    private String empPost;

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
     * @return emp_name
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * @param empName
     */
    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    /**
     * @return emp_age
     */
    public Integer getEmpAge() {
        return empAge;
    }

    /**
     * @param empAge
     */
    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    /**
     * @return emp_salary
     */
    public Double getEmpSalary() {
        return empSalary;
    }

    /**
     * @param empSalary
     */
    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }

    /**
     * @return emp_dept
     */
    public String getEmpDept() {
        return empDept;
    }

    /**
     * @param empDept
     */
    public void setEmpDept(String empDept) {
        this.empDept = empDept == null ? null : empDept.trim();
    }

    /**
     * @return emp_post
     */
    public String getEmpPost() {
        return empPost;
    }

    /**
     * @param empPost
     */
    public void setEmpPost(String empPost) {
        this.empPost = empPost == null ? null : empPost.trim();
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Emp [id=" + id + ", empName=" + empName + ", empAge=" + empAge + ", empSalary=" + empSalary
				+ ", empDept=" + empDept + ", empPost=" + empPost + "]";
	}
    
    
}