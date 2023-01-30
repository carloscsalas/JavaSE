package com.exercises.basedatos.domain;

public class PaginationDTO {
    private LinksDTO links;
    private Long pageSize;
    private Long page;
    private Long totalPages;
    private Long totalElements;

    public LinksDTO getLinks() {
        return links;
    }

    public void setLinks(LinksDTO links) {
        this.links = links;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public Long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
    }

    public Long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
    }

    @Override
    public String toString() {
        return "Pagination{" +
                "links=" + links +
                ", pageSize=" + pageSize +
                ", page=" + page +
                ", totalPages=" + totalPages +
                ", totalElements=" + totalElements +
                '}';
    }
}
