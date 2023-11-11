package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {

        //minimum number of button presses to switch to the song you want
        // minimumm amount of spaces to basically access an index of an array from the starting point

        int counter = 0;
        int counter1 = 0;

        for (int i = startIndex; i < this.playList.length; i++) {
            // Start at the index and go through the playlist until String value "selection
            if (this.playList[i].equals(selection)) {
                break;
            }
            counter++;
        }

        for (int i = startIndex; i >= 0; i--) {
            if (this.playList[i].equals(selection)) {
                break;
            }

            counter1++;
            // Start index and then going backwards until i ==0 and starts from the length
            if (i == 0 && !this.playList[i].equals(selection)) {
                i = this.playList.length;
                // When I set back i value to something else, its run back through the for loop
                // in this case, i-- will subtract the playlistLength -> don't need to subtract it by 1
            }
            // statement for > or  < and return smallest value?

        }

        if (counter1 < counter) {
            return counter1;
        } else if (counter < counter1) {
            return counter;
        }
        return counter;
    }
}
