package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    /* Declarando uma constante não irá precisar instanciar toda vez o SimpleDateFormat
    * não gerando uma cópia desse objeto para cada  post da aplicaçao, haverá
    * apenas uma cópia para a aplicação inteira*/
    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> comments = new ArrayList<>(); // associação da classe Comment

    public Post() {
    }

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }
    /* Quanto há uma coleção / array não é feito o metodo set
    e sim o o método add / remove */

    public void addComment(Comment comment) { // add comentario e recebe comentario como argumento
        comments.add(comment);

    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    public String toString() { //metodo para Cosole output - Fazer String
        StringBuilder sb = new StringBuilder(); // o StringBuilder é usado quando é preciso montar um String muito
        // grande a partir de vários Strings pequenos
        sb.append(title + "\n"); // acrescentar
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(moment) +"\n");
        sb.append(content + "\n");
        sb.append("Comments: \n");
        for (Comment c : comments){ // cada coment c acrescenta coemnatrio no StringBuilder
            sb.append(c.getText() + "\n");

    }
        return sb.toString();
    }
}
