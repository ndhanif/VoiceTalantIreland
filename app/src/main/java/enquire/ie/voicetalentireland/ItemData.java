package enquire.ie.voicetalentireland;

/**
 * Created by barryoreilly on 18/3/16.
 */

public class ItemData {


        private String title,details;
        private int imageUrl;


        public ItemData(String title, int imageUrl,String details){

            this.title = title;
            this.imageUrl = imageUrl;
            this.details=details;

        }
        // getters & setters


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }




}


