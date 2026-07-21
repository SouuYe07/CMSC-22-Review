public class FeatureFilm {
    Actor star;
    String title;
    String theater;
    String category;

    public void setStar(Actor star){
        this.star = star;
    }

    public Actor getStar(){
        return this.star;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTheater(String theater){
        this.theater = theater;
    }

    public String getTheater(){
        return this.theater;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getCategory(){
        return this.category;
    }

    public void update(Actor star, String title){
        this.setStar(star);
        this.setTitle(title);
    }
}
