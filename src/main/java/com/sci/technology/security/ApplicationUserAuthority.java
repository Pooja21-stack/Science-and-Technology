package com.sci.technology.security;

public enum ApplicationUserAuthority {
		CATEGORIES_READ("categories:read"),
		CATEGORIES_WRITE("categories:write"),
		BOOKS_CATEGORIES_READ("book_categories:read"),
		BOOKS_CATEGORIES_WRITE("book_categories:write"),
	    BOOKS_READ("book:read"),
	    BOOKS_WRITE("book:write"),
	    USER_READ("user:read"),
	    USER_WRITE("user:write");
	   

	    private final String permission;

	    ApplicationUserAuthority(String permission) {
	        this.permission = permission;
	    }

	    public String getPermission() {
	        return permission;
	    }
}
