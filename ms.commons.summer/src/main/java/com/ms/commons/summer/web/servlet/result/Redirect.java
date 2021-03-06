/*
 * Copyright 2011-2016 ZXC.com All right reserved. This software is the confidential and proprietary information of
 * ZXC.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with ZXC.com.
 */
package com.ms.commons.summer.web.servlet.result;

/**
 * 实现重定向的WebResult
 * 
 * @author zxc Apr 12, 2013 4:45:19 PM
 */
public class Redirect extends AbstractWebResult {

    public Redirect(String uri) {
        super(REDIRECT_URL_PREFIX + uri);
    }

    public String getView() {
        return super.getPath();
    }
}
