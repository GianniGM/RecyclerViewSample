package com.example.giannig.recyclerview;

import java.util.ArrayList;

/**
 * Created by giannig on 29/12/16.
 */

public class BeerData {
    private String name;
    private String description;
    private String urlLogo;
    private int abv;

    public BeerData(String n, String d, String url, int abv){
        this.name = n;
        this.description = d;
        this.urlLogo = url;
        this.abv = abv;
    }

    public static ArrayList<BeerData> createBeer(){
        ArrayList<BeerData> beers = new ArrayList<>();

        beers.add(new BeerData("orval",
                "è una birra buona",
                "http://pngimg.com/upload/beer_PNG2364.png",
                6
        ));

        beers.add(new BeerData(
                "maredsous",
                "è una birra belga",
                "https:\\/\\/s3.amazonaws.com\\/brewerydbapi\\/beer\\/IDlepc\\/upload_3zlBuG-icon.png",
                5
        ));

        beers.add(new BeerData(
                "merda",
                "è una birra di merda",
                "http://beertypelogos.com/wp-content/uploads/2015/11/beer-type-logo-pirataone.gif",
                12
        ));

        beers.add(new BeerData(
                "piciolla",
                "è una birra di piciolla",
                "http://pngimg.com/upload/beer_PNG2364.png",
                9
        ));

        beers.add(new BeerData(
                "merdaccia",
                "è una birra di merda",
                "https:\\/\\/s3.amazonaws.com\\/brewerydbapi\\/beer\\/IDlepc\\/upload_3zlBuG-icon.png",
                12
        ));

        beers.add(new BeerData(
                "dreker",
                "è la birra dei muratori",
                "http://www.beverfood.com/wp-content/uploads/2015/05/DREHER.jpg",
                2
        ));

        beers.add(new BeerData(
                "piciolla",
                "è una birra di piciolla",
                "http://pngimg.com/upload/beer_PNG2364.png",
                9
        ));

        beers.add(new BeerData(
                "piciolla",
                "è una birra di piciolla",
                "http://pngimg.com/upload/beer_PNG2364.png",
                9
        ));

        beers.add(new BeerData(
                "piciolla",
                "è una birra di piciolla",
                "http://pngimg.com/upload/beer_PNG2364.png",
                9
        ));

        return beers;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlLogo() {
        return urlLogo;
    }

    public void setUrlLogo(String urlLogo) {
        this.urlLogo = urlLogo;
    }

    public int getAbv() {
        return abv;
    }

    public void setAbv(int abv) {
        this.abv = abv;
    }
}
