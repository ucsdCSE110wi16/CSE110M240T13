package cse110mt13.tritonprofessorraterv1;

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.ParseClassName;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.List;


@ParseClassName("Comment")
public class Comment extends ParseObject implements Comparable{

    public void setup(String comment){
        put("comment", comment);
        put("numLikes", 0);
    }

    public String getComment() {
        return getString("comment");
    }

    public int getNumLikes() {
        return getInt("numLikes");
    }

    public String getCourseName() {
        return getString("CourseName");
    }

    public void setCourseName(String courseName){
        put("CourseName", courseName);
    }

    public void putComment(String comment){
        put("comment",comment);
    }

    public void addNumLikes(){
        put("numLikes",getNumLikes()+1);
    }

    // used for ParseQuery only, do not use this method to add new comment
    public void makeNewComment(String comment, int numLikes, String courseName){
        put("comment", comment);
        put("numLikes", numLikes);
        put("CourseName", courseName);
    }

    public void setComment(String comment, int numLikes){
        put("comment", comment);
        put("numLikes", numLikes);
    }

    public void setComment(String comment){
        put("comment", comment);
    }

    public void get()

   /* when user clicks like, this method should be provoked.
      this method adds user's id to the comment indicating the user liked the comment
    Parameter: String - object id of the user
    */
    public void addUserLike(String userID){
        add("UsersLiked", userID);
    }

    @Override
    public String toString(){
        return getComment() + "\nLikes: "+getNumLikes();
    }


    @Override
    public int compareTo(Object another) {
        return ((Comment)another).getNumLikes() - this.getNumLikes();
    }
}
