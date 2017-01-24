/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinggit;

/**
 *
 * @author user
 */
public class Movie {
    
    private String title;
    private String auther;
    private int numberPages;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public Movie(String title, String auther, int numberPages) {
        this.title = title;
        this.auther = auther;
        this.numberPages = numberPages;
    }


    
    
}
