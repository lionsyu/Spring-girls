package com.spring.entity;

import java.io.Serializable;
import java.util.Date;

public class Cherry implements Serializable {

    public interface cherryTypes {
        Integer meizao = 1;
        Integer hongdeng = 2;
    }

    public interface isClean{
        Integer clean = 1;
        Integer noClean = 0;
    }

    private static final long serialVersionUID = 9139705961860790707L;

    private Long id;

    private String consumer_name;

    private String consumer_tel;

    private String consumer_addr;

    private Integer cherry_type;

    private Integer weight;

    private Long cost_price;

    private Long sell_price;

    private String user;

    private String order_no;

    private Integer is_clean;

    private Date create_time;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConsumer_name() {
        return consumer_name;
    }

    public void setConsumer_name(String consumer_name) {
        this.consumer_name = consumer_name == null ? null : consumer_name.trim();
    }

    public String getConsumer_tel() {
        return consumer_tel;
    }

    public void setConsumer_tel(String consumer_tel) {
        this.consumer_tel = consumer_tel == null ? null : consumer_tel.trim();
    }

    public String getConsumer_addr() {
        return consumer_addr;
    }

    public void setConsumer_addr(String consumer_addr) {
        this.consumer_addr = consumer_addr == null ? null : consumer_addr.trim();
    }

    public Integer getCherry_type() {
        return cherry_type;
    }

    public void setCherry_type(Integer cherry_type) {
        this.cherry_type = cherry_type;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Long getCost_price() {
        return cost_price;
    }

    public void setCost_price(Long cost_price) {
        this.cost_price = cost_price;
    }

    public Long getSell_price() {
        return sell_price;
    }

    public void setSell_price(Long sell_price) {
        this.sell_price = sell_price;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no == null ? null : order_no.trim();
    }

    public Integer getIs_clean() {
        return is_clean;
    }

    public void setIs_clean(Integer is_clean) {
        this.is_clean = is_clean;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Cherry other = (Cherry) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getConsumer_name() == null ? other.getConsumer_name() == null : this.getConsumer_name().equals(other.getConsumer_name()))
                && (this.getConsumer_tel() == null ? other.getConsumer_tel() == null : this.getConsumer_tel().equals(other.getConsumer_tel()))
                && (this.getConsumer_addr() == null ? other.getConsumer_addr() == null : this.getConsumer_addr().equals(other.getConsumer_addr()))
                && (this.getCherry_type() == null ? other.getCherry_type() == null : this.getCherry_type().equals(other.getCherry_type()))
                && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
                && (this.getCost_price() == null ? other.getCost_price() == null : this.getCost_price().equals(other.getCost_price()))
                && (this.getSell_price() == null ? other.getSell_price() == null : this.getSell_price().equals(other.getSell_price()))
                && (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
                && (this.getOrder_no() == null ? other.getOrder_no() == null : this.getOrder_no().equals(other.getOrder_no()))
                && (this.getIs_clean() == null ? other.getIs_clean() == null : this.getIs_clean().equals(other.getIs_clean()))
                && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
                && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getConsumer_name() == null) ? 0 : getConsumer_name().hashCode());
        result = prime * result + ((getConsumer_tel() == null) ? 0 : getConsumer_tel().hashCode());
        result = prime * result + ((getConsumer_addr() == null) ? 0 : getConsumer_addr().hashCode());
        result = prime * result + ((getCherry_type() == null) ? 0 : getCherry_type().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getCost_price() == null) ? 0 : getCost_price().hashCode());
        result = prime * result + ((getSell_price() == null) ? 0 : getSell_price().hashCode());
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getOrder_no() == null) ? 0 : getOrder_no().hashCode());
        result = prime * result + ((getIs_clean() == null) ? 0 : getIs_clean().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return result;
    }
}