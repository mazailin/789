package com.icebreak.p2p.dal.dataobject;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 *
 * @create by CodeMaker
 * @Description 自动生成DO
 * @Version 1.0
 * @Author xy
 * @Email xy@taogushen.com
 * @History
 *<li>Author: xy</li>
 *<li>Date: </li>
 *<li>Version: 1.0</li>
 *<li>Content: create</li>
 *
 */
public class ExtendAttrDO extends ExtendAttrDOAbstract implements Serializable {

	private static final long	serialVersionUID		= 553693809339563710L;
	
	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}