package com.assignment.expedia.base.db.storage;

import com.assignment.expedia.model.HotelDeal;
import com.assignment.expedia.utils.misc.BoundryUtils;
import com.assignment.expedia.utils.misc.Pair;
import com.assignment.expedia.utils.misc.SavingActionType;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author sandeepandey
 *
 */
public class DealStorageHelper {
	
	public static void init(List<HotelDeal> p_hotel_deals) {
		DealStorage.initDeals(p_hotel_deals);
	}
	
	public static List<HotelDeal> getResults(String p_param_name,String p_param_value) {
        p_param_name    =   p_param_name.trim();
        p_param_value   =   p_param_value.trim();
		String[] l_splitted_array	=	null;
		if(BoundryUtils.isNullOrEmpty(p_param_name) || BoundryUtils.isNullOrEmpty(p_param_value)) {
			System.out.println("[Collected City Name is Blank.Nothing is there to fetch.]");
			return new ArrayList<>();
		}
	    switch(SavingActionType.fromType(p_param_name)) {
			case CITY:
				return DealStorage.getResultsByCityName(p_param_value);
			case ADDRESS:
				return DealStorage.getResultsByAddress(p_param_value);
			case LONGITUDE_AND_LATITUDE:
				l_splitted_array	=	p_param_value.split(",");
				if(l_splitted_array.length < 2) {
					return new ArrayList<>();
				}
				return DealStorage.getResultsByLongitudeAndLatitude(Pair.makePair(
						Double.valueOf(l_splitted_array[0]),Double.valueOf(l_splitted_array[1])));
			case STAR_RATING:
				l_splitted_array	=	p_param_value.split(",");
				if(l_splitted_array.length < 2) {
					return new ArrayList<>();
				}
			
				return DealStorage.getResultByStarRating(Double.valueOf(l_splitted_array[0]),Double.valueOf(l_splitted_array[1]));
			case TOTAL_RATE:
				l_splitted_array	=	p_param_value.split(",");
				if(l_splitted_array.length < 2) {
					return new ArrayList<>();
				}
				return DealStorage.getResultByTotalRate(Double.valueOf(l_splitted_array[0]),Double.valueOf(l_splitted_array[1]));
			
			default:
				System.out.println("Query Param is Unsupported for now.");
				throw new RuntimeException("Query Param is Unsupported for now.");
		}

    }



	
}
