package com.fantacg.common.pojo.worker;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * 开发公司：深圳市九象数字科技有限公司
 * 版权：深圳市九象数字科技有限公司
 * <P>
 * @author 智慧安全云
 * @Classname BirthPlace 籍贯表
 * @Created by Dupengfei 2019/11/26 9:57
 * @Version 2.0
 */
@Data
@Table(name = "tb_birth_place")
public class BirthPlace implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 籍贯名
     */
    private String name;
}
