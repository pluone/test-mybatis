package com.example.testmybatis.model;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.id
     *
     * @mbg.generated Wed Apr 12 11:38:17 CST 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.name
     *
     * @mbg.generated Wed Apr 12 11:38:17 CST 2023
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.age
     *
     * @mbg.generated Wed Apr 12 11:38:17 CST 2023
     */
    private Integer age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.clue_status
     *
     * @mbg.generated Wed Apr 12 11:38:17 CST 2023
     */
    private Integer clueStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.id
     *
     * @return the value of t_user.id
     *
     * @mbg.generated Wed Apr 12 11:38:17 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.id
     *
     * @param id the value for t_user.id
     *
     * @mbg.generated Wed Apr 12 11:38:17 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.name
     *
     * @return the value of t_user.name
     *
     * @mbg.generated Wed Apr 12 11:38:17 CST 2023
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.name
     *
     * @param name the value for t_user.name
     *
     * @mbg.generated Wed Apr 12 11:38:17 CST 2023
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.age
     *
     * @return the value of t_user.age
     *
     * @mbg.generated Wed Apr 12 11:38:17 CST 2023
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.age
     *
     * @param age the value for t_user.age
     *
     * @mbg.generated Wed Apr 12 11:38:17 CST 2023
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.clue_status
     *
     * @return the value of t_user.clue_status
     *
     * @mbg.generated Wed Apr 12 11:38:17 CST 2023
     */
    public Integer getClueStatus() {
        return clueStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.clue_status
     *
     * @param clueStatus the value for t_user.clue_status
     *
     * @mbg.generated Wed Apr 12 11:38:17 CST 2023
     */
    public void setClueStatus(Integer clueStatus) {
        this.clueStatus = clueStatus;
    }
}