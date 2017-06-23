package com.example.mandaleeyp.flixster.models;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

/**
 * Created by mandaleeyp on 6/22/17.
 */

@Parcel
public class Movie {

    // values from API
    String title;
    String overview;
    String posterPath; // only the path, not the full URL
    String backdropPath;
    Double voteAverage;
    Double popularityBar;

    public Movie() {}

    // initialize the JSON data
    public Movie(JSONObject object) throws JSONException {
        title = object.getString("title");
        overview = object.getString("overview");
        posterPath = object.getString("poster_path");
        backdropPath = object.getString("backdrop_path");
        voteAverage = object.getDouble("vote_average");
        popularityBar = object.getDouble("popularity");
    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public Double getPopularityBar() {
        return popularityBar;
    }
}
