package com.zfw.common;

import java.util.LinkedHashMap;

public class FilterChainDefinitionMapBuilder {

	public LinkedHashMap<String,String> builderChainDefinitionMap(){
		LinkedHashMap<String, String> filterChainDefinitionMap=new LinkedHashMap<String,String>();
		filterChainDefinitionMap.put("/login.jsp", "anon");
		filterChainDefinitionMap.put("/test1.do", "anon");
		filterChainDefinitionMap.put("/test2.do", "anon");
		filterChainDefinitionMap.put("/shiroLogin.do", "anon");
		filterChainDefinitionMap.put("/shiroLogout.do", "logout");
		filterChainDefinitionMap.put("/index.jsp", "authc");
		filterChainDefinitionMap.put("/user.jsp", "authc,roles[user]");
		filterChainDefinitionMap.put("/admin.jsp", "authc,roles[admin]");
		
		filterChainDefinitionMap.put("/**", "authc");
		return filterChainDefinitionMap;
	}
}
