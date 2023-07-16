package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    } // this is the constructor. it created a music object

    public Integer selection(Integer startIndex, String selection) {
        int selectionIndex = -1;
        for (int i = 0; i < playList.length; i++) {
            // this checks to make sure the code is checking for the song collected
            if (playList[i].equals(selection)) {
                selectionIndex = i;
            }

        }
        int forward = Math.abs(selectionIndex - startIndex);
        int backward = playList.length - Math.abs(selectionIndex - startIndex);
        if (forward < backward) {
            return forward;
        } else {
            return backward;
        }

    }
}
