package com.assignment.expedia.base.db.storage;

import com.assignment.expedia.model.HotelDeal;
import com.assignment.expedia.utils.misc.Filter;
import com.assignment.expedia.utils.misc.Pair;
import com.assignment.expedia.utils.misc.SavingActionType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author sandeepandey
 *
 */
public class DealStorage {
	
	private static Map<String,List<HotelDeal>> 				cityMap;
	private static Map<String,List<HotelDeal>> 				addressMap;
	private static Map<Pair<Double,Double>,List<HotelDeal>> lattitudeAndLongtitudeMap;
	private static List<HotelDeal>							dealsAsModelObject;
	private static boolean									LOADED						=	false;
	private static int 										dealCount					=	0;
	//--------------------------------------------------------------------------------------------
	
	
	public static void initDeals(List<HotelDeal> p_hotel_deals) {
		dealsAsModelObject	=	p_hotel_deals;
	}
	/**
	 * 
	 * @param p_input_value
	 */
	public static void init(List<Object> p_input_value) {
        System.out.println("Things have been initializes "+LOADED);
		if(!LOADED) {

            dealCount					=	p_input_value.size();
			cityMap						=	new HashMap<>();
			addressMap					=	new HashMap<>();
			lattitudeAndLongtitudeMap	=	new HashMap();
			LOADED						=	true;
			
		}
	}
	
	//-----------------------------------------------------------------------------------------
	/**
	 * 
	 * @param p_first_value
	 * @param p_second_value
	 * @param p_action_helper
	 */
	public static <P,Q> void addEntry(P p_first_value,Q p_second_value,String p_action_helper) {
		switch(SavingActionType.fromType(p_action_helper)) {
			case CITY:
                addEntryForCity((String)p_first_value, (HotelDeal)p_second_value);
				break;
			case ADDRESS:
				addEntryForAddress((String)p_first_value, (HotelDeal)p_second_value);
				break;
			case LONGITUDE_AND_LATITUDE:
				addEntryForLongitudeAndLatitude((Pair<Double,Double>)p_first_value, (HotelDeal)p_second_value);
				break;
			default :
				throw new RuntimeException();
		}
		
	}
	
	//------------------------------------------------------------------------------------------
	/**
	 * 
	 * @param p_city_name
	 * @param p_hotel_deal
	 */
	private static void addEntryForCity(String p_city_name,HotelDeal p_hotel_deal) {
        List<HotelDeal> l_hotel_list	=	null;
        p_city_name =   p_city_name.toLowerCase();
		if(!cityMap.containsKey(p_city_name)) {
			l_hotel_list	=	new ArrayList<>();
			l_hotel_list.add(p_hotel_deal);
			cityMap.put(p_city_name, l_hotel_list);
			return;
		}
		
		l_hotel_list	=	cityMap.get(p_city_name);
		l_hotel_list.add(p_hotel_deal);
		cityMap.put(p_city_name,l_hotel_list);
	}
	
	//-------------------------------------------------------------------------------------------
	/**
	 * 
	 * @param p_street_address
	 * @param p_hotel_deal
	 */
	private static void addEntryForAddress(String p_street_address,HotelDeal p_hotel_deal) {
		List<HotelDeal> l_hotel_list	=	null;
        p_street_address    =   p_street_address.toLowerCase();
        if(!addressMap.containsKey(p_street_address.trim())) {
			l_hotel_list	=	new ArrayList<>();
			l_hotel_list.add(p_hotel_deal);
			addressMap.put(p_street_address.trim(), l_hotel_list);
			return;
		}
		l_hotel_list	=	addressMap.get(p_street_address.trim());
		l_hotel_list.add(p_hotel_deal);
		addressMap.put(p_street_address.trim(),l_hotel_list);
	}
	

	//----------------------------------------------------------------------------------------------------
	/**
	 * 
	 * @param p_latitude_and_longitude_detail
	 * @param p_hotel_deal
	 */
	private static void addEntryForLongitudeAndLatitude(Pair<Double,Double> p_latitude_and_longitude_detail,
			HotelDeal p_hotel_deal) {
		List<HotelDeal> l_hotel_list	=	null;
		if(!lattitudeAndLongtitudeMap.containsKey(p_latitude_and_longitude_detail)) {
			l_hotel_list	=	new ArrayList<>();
			l_hotel_list.add(p_hotel_deal);
			lattitudeAndLongtitudeMap.put(p_latitude_and_longitude_detail, l_hotel_list);
			return;
		}
		l_hotel_list	=	lattitudeAndLongtitudeMap.get(p_latitude_and_longitude_detail);
		l_hotel_list.add(p_hotel_deal);
		lattitudeAndLongtitudeMap.put(p_latitude_and_longitude_detail,l_hotel_list);
	}
	
	
	//-----------------------------------------------------------------------------------------------------------

    /**
     *
     * @param p_city_name
     * @return
     */
	protected static List<HotelDeal> getResultsByCityName(String p_city_name) {

		if(!cityMap.containsKey(p_city_name) ) {
			System.out.println("[Unable to find Hotel Deal Mapped for city]:("+p_city_name+")");
			return new ArrayList<>();
		}

        List<HotelDeal> l_result_list   =   new ArrayList<HotelDeal>();

        l_result_list   =   cityMap.get(p_city_name) ;
        return l_result_list;

	}
	
	//------------------------------------------------------------------------------------------------------------

    /**
     *
     * @param p_street_address
     * @return
     */
	protected static List<HotelDeal> getResultsByAddress(String p_street_address) {
		if(!addressMap.containsKey(p_street_address.trim())) {
			System.out.println("[Unable to find Hotel Deal Mapped for city]:("+p_street_address.trim()+")");
			return new ArrayList<>();
		}
		return addressMap.get(p_street_address);
	
	}

    //-------------------------------------------------------------------------------------------------------------

    /**
     *
     * @param p_long_and_lat_deatils
     * @return
     */
	protected static List<HotelDeal> getResultsByLongitudeAndLatitude(Pair<Double,Double> p_long_and_lat_deatils) {
		if(!lattitudeAndLongtitudeMap.containsKey(p_long_and_lat_deatils) && 
				!(lattitudeAndLongtitudeMap.containsKey(p_long_and_lat_deatils.swap()))) {
			System.out.println("[Unable to find Hotel Deal Mapped for city]:("+p_long_and_lat_deatils+")");
			return new ArrayList<>();
		}
		
		if(lattitudeAndLongtitudeMap.containsKey(p_long_and_lat_deatils)) {
			return lattitudeAndLongtitudeMap.get(p_long_and_lat_deatils);
		}
		
		return lattitudeAndLongtitudeMap.get(p_long_and_lat_deatils.swap());
	}
	
	//----------------------------------------------------------------------------------------
	/**
	 * 
	 * @param p_min_value
	 * @param p_max_value
	 * @return
	 */
	protected static List<HotelDeal> getResultByStarRating(final Double p_min_value,final Double p_max_value) {
		return accumlateDealHotels(dealsAsModelObject, new Filter<HotelDeal>() {
			@Override
			public boolean isAcceptable(HotelDeal p_value_to_accept) {
				return (p_value_to_accept.getStarRating().compareTo(p_min_value)>=0)
						&& (p_value_to_accept.getStarRating().compareTo(p_max_value)<=0);
			}
		});
		
	}
	//---------------------------------------------------------------------------------------------------
	/**
	 * 
	 * @param p_min_value
	 * @param p_max_value
	 * @return
	 */
	protected static List<HotelDeal> getResultByTotalRate(final Double p_min_value,final Double p_max_value) {
		return accumlateDealHotels(dealsAsModelObject, new Filter<HotelDeal>() {

			@Override
			public boolean isAcceptable(HotelDeal p_value_to_accept) {
				return (p_value_to_accept.getTotalRate().compareTo(p_min_value)>=0)
						&& (p_value_to_accept.getTotalRate().compareTo(p_max_value)<=0);
			}
		});
		
	}
	
	//------------------------------------------------------------------------------------------------------------

    /**
     *
     * @param p_hotel_list
     * @param p_filter
     * @return
     */
	private static List<HotelDeal> accumlateDealHotels(List<HotelDeal> p_hotel_list,Filter<HotelDeal> p_filter) {
		
		List<HotelDeal> l_result_list	=	new ArrayList<HotelDeal>();
		for(HotelDeal l_hotel_deal : p_hotel_list) {
			
			if(p_filter.isAcceptable(l_hotel_deal)) {
				l_result_list.add(l_hotel_deal);
			}
		}
		return l_result_list;
	}
}
