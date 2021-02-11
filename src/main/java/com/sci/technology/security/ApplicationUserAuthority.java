package com.sci.technology.security;

public enum ApplicationUserAuthority {
		CATEGORIES_READ("categories:read"),
		CATEGORIES_WRITE("categories:write"),
		CATEGORIES_DELETE("categories:delete"),
		BOOKS_CATEGORIES_READ("books_categories:read"),
		BOOKS_CATEGORIES_WRITE("books_categories:write"),
		BOOKS_CATEGORIES_DELETE("books_categories:delete"),
	    BOOKS_READ("books:read"),
	    BOOKS_WRITE("books:write"),
	    BOOKS_DELETE("books:delete"),
	    USER_READ("user:read"),
	    USER_WRITE("user:write"),
	    USER_DELETE("user:delete");
	   

	    private final String permission;

	    ApplicationUserAuthority(String permission) {
	        this.permission = permission;
	    }

	    public String getPermission() {
	        return permission;
	    }
}
