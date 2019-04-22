package net.stxy.one.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 分页结果集
 */
public class PageResult implements Serializable {
	private List pageData;//通过SQL查询出的结果集
	private Integer totalCount; //总页数
	private Integer currentPage;//当前页码
	private Integer pageSize;//当前页的数据总量

	private Integer beganPage=1;//首页
	private Integer prevPage; //上一页
	private Integer nextPage;//下一页
	private Integer endPage;//末页

	@Override
	public String toString() {
		return "PageResult{" +
				"pageData=" + pageData +
				", totalCount=" + totalCount +
				", currentPage=" + currentPage +
				", pageSize=" + pageSize +
				", beganPage=" + beganPage +
				", prevPage=" + prevPage +
				", nextPage=" + nextPage +
				", endPage=" + endPage +
				'}';
	}

	public List getPageData() {
		return pageData;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public Integer getBeganPage() {
		return beganPage;
	}

	public Integer getPrevPage() {
		return prevPage;
	}

	public Integer getNextPage() {
		return nextPage;
	}

	public Integer getEndPage() {
		return endPage;
	}

	public PageResult(List pageData, Integer totalCount, Integer currentPage,
					  Integer pageSize) {
		super();
		this.pageData = pageData;
		this.totalCount = totalCount;
		this.currentPage = currentPage;
		this.pageSize = pageSize;

		//-----------------
		this.endPage = totalCount % pageSize == 0 ? totalCount / pageSize
				: totalCount / pageSize + 1;
		this.prevPage = currentPage - 1 >= 1 ? currentPage - 1 : 1;
		this.nextPage = currentPage + 1 <= endPage ? currentPage + 1 : endPage;
	}
        //当查询结果总数为空时，调用该方法.
	public static void emptyResult(Integer pageSize) {
		new PageResult(Collections.EMPTY_LIST, 0, 1, pageSize);
	}
}
