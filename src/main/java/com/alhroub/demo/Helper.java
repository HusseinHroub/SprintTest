package com.alhroub.demo;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class Helper {
    public static boolean isRTLDirection(HttpServletRequest request) {
        for (int i = 0; i < request.getCookies().length; i++) {
            Cookie cookie = request.getCookies()[i];
            if (cookie.getName().equals("language")) {
                if (cookie.getValue().equals("ar")) {
                    return true;
                }
            }
        }
        return false;
    }
}
