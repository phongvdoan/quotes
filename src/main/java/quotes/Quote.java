package quotes;

public class Quote {
    String author;
    String likes;
    String text;
    String [] tags;

    public Quote(String author, String likes, String text, String[] tags) {
        this.author = author;
        this.likes = likes;
        this.text = text;
        this.tags = tags;
    }

    public String toString() {
        String[] tagArr = this.tags;
        String parsedTag = "";
        for (int i = 0; i < tagArr.length; i++) {
            parsedTag += tagArr[i];
        }
        String randomQuote = "Author: "+ this.author + ", Likes: " + this.likes + ", Quote: " + this.text + ", Tags: " + parsedTag;

        return randomQuote;
    }

}
