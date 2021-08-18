package com.streetflo.miocat.util.page;

import java.util.List;

public interface ScrollPagingDao {
	
	List<?> paging(ScrollPagingDto pagingDto);

}
