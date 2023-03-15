package org.example;

import java.util.ArrayList;
import java.util.Scanner;

class User {
    /*
    * The user should contain username password.
    * The user should contain an ArrayList of favorite shows and watch history.
    * FUNCTION: the user should have a function to watch a show and add it to watch history.
    *  *** NOTE: All search functions in user are for searching in favorite shows ***
    */

    private ArrayList<TVShow> favoriteTVshows = new ArrayList<TVShow>();
    private ArrayList<TVShow> watched = new ArrayList<TVShow>();
    private ArrayList<Movie> favoriteMovies = new ArrayList<Movie>();
    private ArrayList<String> liked = new ArrayList<String>();
    private ArrayList<String> disliked = new ArrayList<String>();


    private String username;
    private String password;


    public User(){}

    public void watch(TVShow show){
        Scanner scan=new Scanner(System.in);

        if(!watched.contains(show)){
            watched.add(show);
            System.out.println("you watched " + show.getTitle());
        }

        else{
            System.out.println("you have already watched " + show.getTitle());
            System.out.println("do you you want to remove it from your watched list? yes/no");

            if (scan.nextLine().equals("yes")){
                watched.remove(show);
            }
        }
    }

    //search movies by different features (m stand for movies)
    public ArrayList<Movie> searchmByTitle(String title) {
        ArrayList<Movie> result=new ArrayList<Movie>();
        for(int i=0;i<favoriteMovies.size();i++){
            if (favoriteMovies.get(i).getTitle().equals(title)){
                result.add(favoriteMovies.get(i));
            }
        }

        if(result.size()>0) {
            return result;
        }

        else{
            System.out.println("there was no movie among your favorites with this title");
            return null;
        }
    }

    public ArrayList<Movie> searchmByGenre(String genre) {
        ArrayList<Movie> result=new ArrayList<Movie>();
        for(int i=0;i<favoriteMovies.size();i++){
            if (favoriteMovies.get(i).getGenre().equals(genre)){
                result.add(favoriteMovies.get(i));
            }
        }

        if(result.size()>0) {
            return result;
        }

        else{
            System.out.println("there was no movie among your favorites with this genre");
            return null;
        }
    }

    public ArrayList<Movie> searchmByReleaseYear(String year) {
        ArrayList<Movie> result=new ArrayList<Movie>();

        for(int i=0;i<favoriteMovies.size();i++){
            if (favoriteMovies.get(i).getYear().equals(year)){
                result.add(favoriteMovies.get(i));
            }
        }

        if(result.size()>0) {
            return result;
        }

        else{
            System.out.println("there was no movie among your favorites starting this year");
            return null;
        }
    }

    public ArrayList<Movie> searchmByCast(String cast) {
        ArrayList<Movie> result=new ArrayList<Movie>();
        for(int i=0;i<favoriteMovies.size();i++){
            if (favoriteMovies.get(i).getCast().contains(cast)){
                result.add(favoriteMovies.get(i));
            }
        }

        if(result.size()>0) {
            return result;
        }

        else{
            System.out.println("there was no movie among your favorites with this actor");
            return null;
        }
    }


    //search tv shows by different features (t stands for tv shows)
    public ArrayList<TVShow> searchtByTitle(String title) {
        ArrayList<TVShow> result=new ArrayList<TVShow>();
        for(int i=0;i<favoriteTVshows.size();i++){
            if (favoriteTVshows.get(i).getTitle().equals(title)){
                result.add(favoriteTVshows.get(i));
            }
        }

        if(result.size()>0) {
            return result;
        }

        else{
            System.out.println("there was no show among your favorites with this title");
            return null;
        }
    }

    public ArrayList<TVShow> searchtByGenre(String genre) {
        ArrayList<TVShow> result=new ArrayList<TVShow>();
        for(int i=0;i<favoriteTVshows.size();i++){
            if (favoriteTVshows.get(i).getGenre().equals(genre)){
                result.add(favoriteTVshows.get(i));
            }
        }

        if(result.size()>0) {
            return result;
        }

        else{
            System.out.println("there was no show among your favorites with this genre");
            return null;
        }
    }

    public ArrayList<TVShow> searchtByReleaseYear(String year) {
        ArrayList<TVShow> result=new ArrayList<TVShow>();

        for(int i=0;i<favoriteTVshows.size();i++){
            if (favoriteTVshows.get(i).getYear().equals(year)){
                result.add(favoriteTVshows.get(i));
            }
        }

        if(result.size()>0) {
            return result;
        }

        else{
            System.out.println("there was no show among your favorites starting this year");
            return null;
        }
    }

    public ArrayList<TVShow> searchtByCast(String cast) {
        ArrayList<TVShow> result=new ArrayList<TVShow>();

        for(int i=0;i<favoriteTVshows.size();i++){
            if (favoriteTVshows.get(i).getCast().contains(cast)){
                result.add(favoriteTVshows.get(i));
            }
        }

        if(result.size()>0) {
            return result;
        }

        else{
            System.out.println("there was no show among your favorites with this actor");
            return null;
        }
    }

    //add a tv show to favorites
    public void addToFavoritest(TVShow show) {
        Scanner scan=new Scanner(System.in);
        if(!favoriteTVshows.contains(show)) {
            favoriteTVshows.add(show);
        }

        else{
            System.out.println(show.getTitle()+ " is already in your favorites, do you want to remove it? yes/no");
            String ch=scan.nextLine();

            if(ch.equals("yes")){
                removeFavoritest(show);
            }
        }
    }

    //remove a tv show from favorites
    public void removeFavoritest(TVShow show) {
        favoriteTVshows.remove(show);
        System.out.println(show.getTitle() + " removed from your favorites");
    }

    //add a movie to favorites
    public void addToFavoritesm(Movie movie) {
        Scanner scan=new Scanner(System.in);
        if(!favoriteMovies.contains(movie)) {
            favoriteMovies.add(movie);
        }

        else{
            System.out.println(movie.getTitle()+ " is already in your favorites, do you want to remove it? yes/no");
            String ch=scan.nextLine();

            if(ch.equals("yes")){
                removeFavoritesm(movie);
            }
        }
    }

    //remove a movie from favorites
    public void removeFavoritesm(Movie movie) {
        favoriteMovies.remove(movie);
        System.out.println(movie.getTitle() + " removed from your favorites");
    }

    //prints favorite shows and movies
    public void viewFavorites() {
        System.out.println("favorite tv shows:");
        for(int i=0;i<favoriteTVshows.size();i++){
            System.out.println(i+1 + ". " + favoriteTVshows.get(i).getTitle());
        }

        System.out.println("favorite movies:");
        for(int i=0;i<favoriteMovies.size();i++){
            System.out.println(i+1 + ". " + favoriteMovies.get(i).getTitle());
        }


    }

    //likes a movie
    public void like(String name){
        Scanner scan=new Scanner(System.in);

        if(!liked.contains(name)){
            liked.add(name);
            System.out.println("you liked " + name);
        }

        else{
            System.out.println("you have already liked " + name);
            System.out.println("do you want to unlike it? yes/no");
            String ch=scan.nextLine();

            if(ch.equals("yes")){
                liked.remove(name);
            }
        }
    }

    //dislikes a movie
    public void dislike(String name){
        Scanner scan=new Scanner(System.in);

        if(!disliked.contains(name)){
            disliked.add(name);
            System.out.println("you disliked " + name);
        }

        else{
            System.out.println("you have already disliked " + name);
            System.out.println("do you want to take it back? yes/no");
            String ch=scan.nextLine();

            if(ch.equals("yes")){
                disliked.remove(name);
            }
        }
    }

    //*METHODS INVOLVED IN RECOMMENDATION*
    //creates a list of every genre appeared in your favorites
    public ArrayList<String> favoriteGenres() {
        ArrayList<String> favGenres = new ArrayList<String>();

        if (favoriteTVshows.size() == 0 && favoriteMovies.size() == 0) {
            System.out.println("you should pick a few favorite shows or movies to get recommendations");
            return null;
        } else {
            for (int i = 0; i < favoriteTVshows.size(); i++) {
                if (!contain(favGenres,favoriteTVshows.get(i).getGenre())) {
                    favGenres.add(favoriteTVshows.get(i).getGenre());
                }
            }

            for (int i = 0; i < favoriteMovies.size(); i++) {
                if (!contain(favGenres,favoriteMovies.get(i).getGenre())) {
                    favGenres.add(favoriteMovies.get(i).getGenre());
                }
            }
            return favGenres;
        }
    }

    //returns name of a movie in your favorites with a certain genre
    public String favoriteMovieWithGenre(String genre){
        for(int i=0;i<favoriteMovies.size();i++){
            if(favoriteMovies.get(i).getGenre().equals(genre)){
                return favoriteMovies.get(i).getTitle();
            }
        }

        for(int i=0;i<favoriteTVshows.size();i++){
            if(favoriteTVshows.get(i).getGenre().equals(genre)){
                return favoriteTVshows.get(i).getTitle();
            }
        }

        return null;
    }

    //main method of recommendation
    public void getRecommendations(NetflixService service) {;
        ArrayList<String> genres=favoriteGenres();

        for(int i=0;i<genres.size();i++){
            System.out.println("because you liked " + favoriteMovieWithGenre(favoriteGenres().get(i)));
            ArrayList<TVShow> recomSeries = service.searchtByGenre(favoriteGenres().get(i));
            ArrayList<Movie> recomMovies = service.searchmByGenre(favoriteGenres().get(i));

            removeSharedMovies(recomMovies,watched);
            removeSharedShows(recomSeries,watched);

            printShowArray(recomSeries);
            printMovieArray(recomMovies);
        }
    }

    // .contains didn't work for some reason so i wrote this
    public boolean contain(ArrayList<String> list,String name){
        for(int i=0;i<list.size();i++){
            if(list.get(i).equals(name)){
                return true;
            }
        }

        return false;
    }

    //removes watched movies from recommendation list
    public void removeSharedMovies(ArrayList<Movie> recom, ArrayList<TVShow> watched){
        for(int i=0;i<recom.size();i++){
            if (watched.contains(recom.get(i))){
                recom.remove(i);
            }
        }
    }

    //removes watched shows from recommendation list
    public void removeSharedShows(ArrayList<TVShow> recom,ArrayList<TVShow> watched){
        for(int i=0;i<recom.size();i++){
            if (watched.contains(recom.get(i))){
                recom.remove(i);
            }
        }
    }

    public void printMovieArray(ArrayList<Movie> list){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    public void printShowArray(ArrayList<TVShow> list){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    //SETTERS
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //GETTERS
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
