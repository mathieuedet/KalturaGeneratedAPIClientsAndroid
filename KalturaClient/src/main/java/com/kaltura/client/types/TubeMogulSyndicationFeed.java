// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platfroms allow them to do with
// text.
//
// Copyright (C) 2006-2018  Kaltura Inc.
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as
// published by the Free Software Foundation, either version 3 of the
// License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
// @ignore
// ===================================================================================================
package com.kaltura.client.types;

import android.os.Parcel;
import com.google.gson.JsonObject;
import com.kaltura.client.Params;
import com.kaltura.client.enums.TubeMogulSyndicationFeedCategories;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(TubeMogulSyndicationFeed.Tokenizer.class)
public class TubeMogulSyndicationFeed extends BaseSyndicationFeed {
	
	public interface Tokenizer extends BaseSyndicationFeed.Tokenizer {
	}

	private TubeMogulSyndicationFeedCategories category;

	// category:
	public TubeMogulSyndicationFeedCategories getCategory(){
		return this.category;
	}

	public TubeMogulSyndicationFeed() {
		super();
	}

	public TubeMogulSyndicationFeed(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		category = TubeMogulSyndicationFeedCategories.get(GsonParser.parseString(jsonObject.get("category")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaTubeMogulSyndicationFeed");
		return kparams;
	}


    public static final Creator<TubeMogulSyndicationFeed> CREATOR = new Creator<TubeMogulSyndicationFeed>() {
        @Override
        public TubeMogulSyndicationFeed createFromParcel(Parcel source) {
            return new TubeMogulSyndicationFeed(source);
        }

        @Override
        public TubeMogulSyndicationFeed[] newArray(int size) {
            return new TubeMogulSyndicationFeed[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.category == null ? -1 : this.category.ordinal());
    }

    public TubeMogulSyndicationFeed(Parcel in) {
        super(in);
        int tmpCategory = in.readInt();
        this.category = tmpCategory == -1 ? null : TubeMogulSyndicationFeedCategories.values()[tmpCategory];
    }
}

