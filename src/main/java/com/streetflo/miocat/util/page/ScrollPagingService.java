package com.streetflo.miocat.util.page;

import java.util.List;

public interface ScrollPagingService<T extends PageDto> {
	
	List<? extends PageDto> paging(T pagingDto);

}
