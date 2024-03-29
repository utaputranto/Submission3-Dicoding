package com.example.utaputranto.thirdsubmission.model.movie;


import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import static android.provider.BaseColumns._ID;
import static com.example.utaputranto.thirdsubmission.database.DbContract.FavoriteColumns.ID;
import static com.example.utaputranto.thirdsubmission.database.DbContract.FavoriteColumns.OVERVIEW;
import static com.example.utaputranto.thirdsubmission.database.DbContract.FavoriteColumns.POSTER;
import static com.example.utaputranto.thirdsubmission.database.DbContract.FavoriteColumns.RELEASE_DATE;
import static com.example.utaputranto.thirdsubmission.database.DbContract.FavoriteColumns.TITLE;
import static com.example.utaputranto.thirdsubmission.database.DbContract.FavoriteColumns.getColumnInt;
import static com.example.utaputranto.thirdsubmission.database.DbContract.FavoriteColumns.getColumnString;


public class Movie implements Parcelable {

    @SerializedName("title")
    private String title;

    @SerializedName("poster_path")
    private String poster_path;

    @SerializedName("overview")
    private String overview;

    @SerializedName("release_date")
    private String release_date;

    @SerializedName("backdrop_path")
    private String backdrop_path;

    @SerializedName("id")
    private String movieId;

    @SerializedName("vote_average")
    private String vote_average;

    @SerializedName("original_language")
    private String original_language;

    @SerializedName("popularity")
    private String popularity;

    private int idMovie;

    public int getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getVote_average() {
        return vote_average;
    }

    public void setVote_average(String vote_average) {
        this.vote_average = vote_average;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.poster_path);
        dest.writeString(this.overview);
        dest.writeString(this.release_date);
        dest.writeString(this.backdrop_path);
        dest.writeString(this.movieId);
        dest.writeString(this.vote_average);
        dest.writeString(this.original_language);
        dest.writeString(this.popularity);
    }

    public Movie() {
    }

    public Movie(Cursor cursor) {
        this.idMovie = getColumnInt(cursor, _ID);
        this.title = getColumnString(cursor, TITLE);
        this.overview = getColumnString(cursor, OVERVIEW);
        this.release_date = getColumnString(cursor, RELEASE_DATE);
        this.poster_path = getColumnString(cursor, POSTER);
        this.movieId = getColumnString(cursor, ID);
    }

    protected Movie(Parcel in) {
        this.title = in.readString();
        this.poster_path = in.readString();
        this.overview = in.readString();
        this.release_date = in.readString();
        this.backdrop_path = in.readString();
        this.movieId = in.readString();
        this.vote_average = in.readString();
        this.original_language = in.readString();
        this.popularity = in.readString();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel source) {
            return new Movie(source);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };
}
