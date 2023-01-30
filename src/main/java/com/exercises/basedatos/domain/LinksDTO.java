package com.exercises.basedatos.domain;

public class LinksDTO {
    private Long first;
    private Long last;
    private Long previous;
    private Long next;

    public Long getFirst() {
        return first;
    }

    public void setFirst(Long first) {
        this.first = first;
    }

    public Long getLast() {
        return last;
    }

    public void setLast(Long last) {
        this.last = last;
    }

    public Long getPrevious() {
        return previous;
    }

    public void setPrevious(Long previous) {
        this.previous = previous;
    }

    public Long getNext() {
        return next;
    }

    public void setNext(Long next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Links{" +
                "first=" + first +
                ", last=" + last +
                ", previous=" + previous +
                ", next=" + next +
                '}';
    }
}
