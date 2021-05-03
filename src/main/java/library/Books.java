package library;

public class Books {
    private String name;
    private String paperQuality;
    private String type;
    private int pageNumbers;

    public Books() {
        this.name = name;
        this.paperQuality = paperQuality;
        this.type = type;
        this.pageNumbers = pageNumbers;
    }

    public Books(String name, String type, int pagenumbers) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaperQuality() {
        return paperQuality;
    }

    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }

    public int getPageNumbers() {
        return pageNumbers;
    }

    public void setPagenumbers(int pageNumbers) {
        this.pageNumbers = pageNumbers;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}