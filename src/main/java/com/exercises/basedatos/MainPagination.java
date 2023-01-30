package com.exercises.basedatos;

import com.exercises.basedatos.domain.LinksDTO;
import com.exercises.basedatos.domain.PaginationDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.MessageFormat;

public class MainPagination {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainPagination.class);

    public static void main(String[] args) {

        Integer page = 1;
        Integer pageSize = 5;
        Integer total = 26;

        PaginationDTO paginationDTO = createPagination(page,pageSize,total);
        LOGGER.info(":::RESULT::paginationDTO:: {}", paginationDTO);

    }

    private static PaginationDTO createPagination(Integer paginationKey, Integer pageSize, Integer total) {
        int pFirst = 0;
        int pNext = paginationKey + 1;
        int pLast = (int) Math.ceil(total.doubleValue() / pageSize);
        int pPrevious = paginationKey - 1;
        int last = pLast -1;
        LOGGER.info("[APX] pFirst    : {}", pFirst);
        LOGGER.info("[APX] pNext     : {}", pNext);
        LOGGER.info("[APX] pLast     : {}", pLast);
        LOGGER.info("[APX] pPrevious : {}", pPrevious);
        LinksDTO paginationLinks = new LinksDTO();
        paginationLinks.setFirst(Long.valueOf(pFirst));
        paginationLinks.setLast(Long.valueOf(last));
        if (pNext < pLast) {
            paginationLinks.setNext(Long.valueOf(pNext));
        }
        if (pPrevious >= 0) {
            paginationLinks.setPrevious(Long.valueOf(pPrevious));
        }
        LOGGER.info("[APX] PaginationLinks : {}", paginationLinks);
        PaginationDTO paginationDTO = new PaginationDTO();
        paginationDTO.setPageSize(Long.valueOf(pageSize));
        paginationDTO.setPage(Long.valueOf(paginationKey));
        paginationDTO.setTotalElements(Long.valueOf(total));
        paginationDTO.setTotalPages(Long.valueOf(pLast));
        paginationDTO.setLinks(paginationLinks);

        LOGGER.info("[APX] PaginationDTO : {}", paginationDTO);
        return paginationDTO;
    }
}
