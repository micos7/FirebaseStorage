package ro.mihai.firebasestorage;

public class Upload {
    private String mName;
    private String mImageUrl;

    public Upload(){
        //empty constructor
    }

    public Upload(String name,String imageUrl){
        if(name.trim().equals("")){
            name = "No Name";
        }
        name = mName;
        imageUrl = mImageUrl;
    }

    public String getName() {
        return mName;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public void setImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }
}
