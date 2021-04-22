package com.streetflo.miocat.util.page;

import java.util.ArrayList;

public interface ScrollPagingDao {
	
	ArrayList<?> paging(ScrollPagingDto pagingDto);

}
