
package com.suhane.flickr.repository.model.photos.getinfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Comments {

    @SerializedName("_content")
    @Expose
    private Integer content;

    public Integer getContent() {
        return content;
    }

    public void setContent(Integer content) {
        this.content = content;
    }

}
