package com.suhane.flickr.repository.data;

import io.reactivex.Observer;

/**
 * Created by shashanksuhane on 04/02/18.
 */

public interface PhotoGetInfoAPI {
    /*
     * To search the response for the procedure api
     * and return the response as result observer
     */
    boolean get(String photoId, Observer observer);
}
