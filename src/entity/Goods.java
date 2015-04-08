/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author asus
 */
@Entity
@Table(name = "goods")
public class Goods implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "goods_id")
    private Long goodsId;
    
    @Column(name = "name_goods")
    private String nameGoods;
    
    @Column(name = "price_goods")
    private long priceGoods;
    
    @Column(name = "information")
    private String infomation;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    private Category category;
     
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "club_id")
    private Club club;

 
    public Goods() {
    }

  
    public Goods(String nameGoods, long priceGoods, String infomation, Category category, Club club) {
        this.nameGoods = nameGoods;
        this.priceGoods = priceGoods;
        this.infomation = infomation;
        this.category = category;
        this.club = club;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getNameGoods() {
        return nameGoods;
    }

    public void setNameGoods(String nameGoods) {
        this.nameGoods = nameGoods;
    }

    public long getPriceGoods() {
        return priceGoods;
    }

    public void setPriceGoods(long priceGoods) {
        this.priceGoods = priceGoods;
    }

    public String getInfomation() {
        return infomation;
    }

    public void setInfomation(String infomation) {
        this.infomation = infomation;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    
       public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    @Override
    public String toString() {
        return "Goods{" + "goodsId=" + goodsId + ", nameGoods=" + nameGoods + ", priceGoods=" 
                + priceGoods + ", infomation=" + infomation + ", category=" + category + ", "
                + "club=" + club + '}';
    }

    

}
