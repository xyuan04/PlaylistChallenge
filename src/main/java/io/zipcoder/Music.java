package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int clickUp = 0;
        int clickDown = 0;

        if(startIndex == 0 && this.playList[this.playList.length-1].equals(selection)) {
            return 1;
        }

        for(int i = startIndex; i < this.playList.length; i++) {
            if(!this.playList[i].equals(selection)) {
                clickDown++;
            } else break;
        }

        for(int i = startIndex; i >= 0; i--) {
            if(!this.playList[i].equals(selection)) {
                clickUp++;
            } else break;
        }

        if (clickDown < clickUp) {
            return clickDown;
        } else return clickUp;
    }

}
