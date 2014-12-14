package com.assignment.expedia.model;

import com.assignment.expedia.utils.json.JSONizable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author sandeepandey
 *
 */
		
public class HotelDeal implements JSONizable {
	
    private Map<String,Object> jsonMap;
	private Double 	movingAverageScore;
	private Double 	rawAppealScore;
	private Double 	relevanceScore;
	private String 	userCity;
	private String 	userOrigin;
	private Date    checkInDate;
	private Date	checkOutDate;
	private Long	hotelId;
	private String	name;
	private String	streetAddress;
	private String	city;
	private String	province;
	private String	country;
	private	Double	latitude;
	private	Double	longitude;
	private String	description;
	private String	destination;
	private	String	longDestinationName;
	private	Long	regionId;
	private Long 	statusCode;
	private String	statusDescription;
	private Double	baseRate;
	private Double	originalBaseRate;
	private String	currency;
	private Double	taxesAndFees;
	private	Double	totalRate;
	private Double	promotionAmount;
	private String	promotionDescription;
	private	String	dealDeepLink;
	private	String	similarDeepLink;
	private	Double	starRating;
	private Double	guestRating;
	private Long	lengthofStay;
	private	Double	pricePerNight;
	private Double	originalPricePerNight;
	private Double	percentSavings;
	private Boolean	isDRR;
	private Boolean	isAllInclusive;
	private List<Double>	location;
	private String  imageUrl;
	private String	language;
	private Double	mandatoryTaxesAndFees;
	private String	promotionTag;
	private Boolean carPackage;
	private Double	carPackageScore;	
	private Double	distanceFromUser;
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	@SuppressWarnings("unchecked")
	public void setProperties(Map<String,Object> p_map) throws ParseException {

        this.jsonMap=   p_map;
		setBaseRate((Double)p_map.get("baseRate"));
		setCarPackage((Boolean)p_map.get("carPackage"));
		setCarPackageScore((Double)p_map.get("carPackageScore"));
		setCheckInDate(sdf.parse((String) p_map.get("checkInDate")));
		setCheckOutDate(sdf.parse((String)p_map.get("checkOutDate")));
		setCity((String)p_map.get("city"));
		setCountry((String)p_map.get("country"));
		setCurrency((String)p_map.get("currency"));
		setDealDeepLink((String)p_map.get("dealDeepLink"));
		setDescription((String)p_map.get("description"));
		setDestination((String)p_map.get("destination"));
		setDistanceFromUser((Double)p_map.get("distanceFromUser"));
		setGuestRating((Double)p_map.get("guestRating"));
		setHotelId(Long.valueOf(String.valueOf(p_map.get("hotelId"))));
		setImageUrl((String)p_map.get("imageUrl"));
		setIsAllInclusive((Boolean)p_map.get("isAllInclusive"));
		setIsDRR((Boolean)p_map.get("isDRR"));
		setLanguage((String)p_map.get("language"));
		setLatitude((Double)p_map.get("latitude"));
		setLengthofStay(Long.valueOf(String.valueOf(p_map.get("lengthofStay"))));
		setLocation((List<Double>)p_map.get("location"));
		setLongDestinationName((String)p_map.get("longDestinationName"));
		setLongitude((Double)p_map.get("longitude"));
		setMandatoryTaxesAndFees((Double)p_map.get("mandatoryTaxesAndFees"));
		setMovingAverageScore((Double)p_map.get("movingAverageScore"));
		setName((String)p_map.get("longDestinationName"));
		setOriginalBaseRate((Double)p_map.get("originalBaseRate"));
		setOriginalPricePerNight((Double)p_map.get("originalPricePerNight"));
		setPercentSavings((Double)p_map.get("percentSavings"));
		setPricePerNight((Double)p_map.get("originalPricePerNight"));
		setPromotionAmount((Double)p_map.get("promotionAmount"));
		setPromotionDescription((String)p_map.get("promotionDescription"));
		setPromotionTag((String)p_map.get("promotionTag"));
		setProvince((String)p_map.get("province"));
		setRawAppealScore((Double)p_map.get("rawAppealScore"));
		setRegionId(Long.valueOf(String.valueOf(p_map.get("regionId"))));
		setRelevanceScore((Double)p_map.get("relevanceScore"));
		setSimilarDeepLink((String)p_map.get("similarDeepLink"));
		setStarRating((Double)p_map.get("starRating"));
		setStatusCode(Long.valueOf(String.valueOf(p_map.get("statusCode"))));
		setStatusDescription((String)p_map.get("statusDescription"));
		setStreetAddress((String)p_map.get("streetAddress"));
		setTaxesAndFees((Double)p_map.get("taxesAndFees"));
		setTotalRate((Double)p_map.get("totalRate"));
		setUserCity((String)p_map.get("userCity"));
		setUserOrigin(((String)p_map.get("userOrigin")).trim());
	}
	

	public Double getMovingAverageScore() {
		return movingAverageScore;
	}
	public void setMovingAverageScore(Double movingAverageScore) {
		this.movingAverageScore = movingAverageScore;
	}
	public Double getRawAppealScore() {
		return rawAppealScore;
	}
	public void setRawAppealScore(Double rawAppealScore) {
		this.rawAppealScore = rawAppealScore;
	}
	public Double getRelevanceScore() {
		return relevanceScore;
	}
	public void setRelevanceScore(Double relevanceScore) {
		this.relevanceScore = relevanceScore;
	}
	public String getUserCity() {
		return userCity;
	}
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	public String getUserOrigin() {
		return userOrigin;
	}
	public void setUserOrigin(String userOrigin) {
		this.userOrigin = userOrigin;
	}
	public Date getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}
	public Date getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public Long getHotelId() {
		return hotelId;
	}
	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getLongDestinationName() {
		return longDestinationName;
	}
	public void setLongDestinationName(String longDestinationName) {
		this.longDestinationName = longDestinationName;
	}
	public Long getRegionId() {
		return regionId;
	}
	public void setRegionId(Long regionId) {
		this.regionId = regionId;
	}
	public Long getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Long statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusDescription() {
		return statusDescription;
	}
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}
	public Double getBaseRate() {
		return baseRate;
	}
	public void setBaseRate(Double baseRate) {
		this.baseRate = baseRate;
	}
	public Double getOriginalBaseRate() {
		return originalBaseRate;
	}
	public void setOriginalBaseRate(Double originalBaseRate) {
		this.originalBaseRate = originalBaseRate;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Double getTaxesAndFees() {
		return taxesAndFees;
	}
	public void setTaxesAndFees(Double taxesAndFees) {
		this.taxesAndFees = taxesAndFees;
	}
	public Double getTotalRate() {
		return totalRate;
	}
	public void setTotalRate(Double totalRate) {
		this.totalRate = totalRate;
	}
	public Double getPromotionAmount() {
		return promotionAmount;
	}
	public void setPromotionAmount(Double promotionAmount) {
		this.promotionAmount = promotionAmount;
	}
	public String getPromotionDescription() {
		return promotionDescription;
	}
	public void setPromotionDescription(String promotionDescription) {
		this.promotionDescription = promotionDescription;
	}
	public String getDealDeepLink() {
		return dealDeepLink;
	}
	public void setDealDeepLink(String dealDeepLink) {
		this.dealDeepLink = dealDeepLink;
	}
	public String getSimilarDeepLink() {
		return similarDeepLink;
	}
	public void setSimilarDeepLink(String similarDeepLink) {
		this.similarDeepLink = similarDeepLink;
	}
	public Double getStarRating() {
		return starRating;
	}
	public void setStarRating(Double starRating) {
		this.starRating = starRating;
	}
	public Double getGuestRating() {
		return guestRating;
	}
	public void setGuestRating(Double guestRating) {
		this.guestRating = guestRating;
	}
	public Long getLengthofStay() {
		return lengthofStay;
	}
	public void setLengthofStay(Long lengthofStay) {
		this.lengthofStay = lengthofStay;
	}
	public Double getPricePerNight() {
		return pricePerNight;
	}
	public void setPricePerNight(Double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
	public Double getOriginalPricePerNight() {
		return originalPricePerNight;
	}
	public void setOriginalPricePerNight(Double originalPricePerNight) {
		this.originalPricePerNight = originalPricePerNight;
	}
	public Double getPercentSavings() {
		return percentSavings;
	}
	public void setPercentSavings(Double percentSavings) {
		this.percentSavings = percentSavings;
	}
	public Boolean getIsDRR() {
		return isDRR;
	}
	public void setIsDRR(Boolean isDRR) {
		this.isDRR = isDRR;
	}
	public Boolean getIsAllInclusive() {
		return isAllInclusive;
	}
	public void setIsAllInclusive(Boolean isAllInclusive) {
		this.isAllInclusive = isAllInclusive;
	}
	public List<Double> getLocation() {
		return location;
	}
	public void setLocation(List<Double> location) {
		this.location = location;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Double getMandatoryTaxesAndFees() {
		return mandatoryTaxesAndFees;
	}
	public void setMandatoryTaxesAndFees(Double mandatoryTaxesAndFees) {
		this.mandatoryTaxesAndFees = mandatoryTaxesAndFees;
	}
	public String getPromotionTag() {
		return promotionTag;
	}
	public void setPromotionTag(String promotionTag) {
		this.promotionTag = promotionTag;
	}
	public Boolean getCarPackage() {
		return carPackage;
	}
	public void setCarPackage(Boolean carPackage) {
		this.carPackage = carPackage;
	}
	public Double getCarPackageScore() {
		return carPackageScore;
	}
	public void setCarPackageScore(Double carPackageScore) {
		this.carPackageScore = carPackageScore;
	}
	public Double getDistanceFromUser() {
		return distanceFromUser;
	}
	public void setDistanceFromUser(Double distanceFromUser) {
		this.distanceFromUser = distanceFromUser;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((baseRate == null) ? 0 : baseRate.hashCode());
		result = prime * result
				+ ((carPackage == null) ? 0 : carPackage.hashCode());
		result = prime * result
				+ ((carPackageScore == null) ? 0 : carPackageScore.hashCode());
		result = prime * result
				+ ((checkInDate == null) ? 0 : checkInDate.hashCode());
		result = prime * result
				+ ((checkOutDate == null) ? 0 : checkOutDate.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result
				+ ((currency == null) ? 0 : currency.hashCode());
		result = prime * result
				+ ((dealDeepLink == null) ? 0 : dealDeepLink.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result
				+ ((destination == null) ? 0 : destination.hashCode());
		result = prime
				* result
				+ ((distanceFromUser == null) ? 0 : distanceFromUser.hashCode());
		result = prime * result
				+ ((guestRating == null) ? 0 : guestRating.hashCode());
		result = prime * result + ((hotelId == null) ? 0 : hotelId.hashCode());
		result = prime * result
				+ ((imageUrl == null) ? 0 : imageUrl.hashCode());
		result = prime * result
				+ ((isAllInclusive == null) ? 0 : isAllInclusive.hashCode());
		result = prime * result + ((isDRR == null) ? 0 : isDRR.hashCode());
		result = prime * result
				+ ((language == null) ? 0 : language.hashCode());
		result = prime * result
				+ ((latitude == null) ? 0 : latitude.hashCode());
		result = prime * result
				+ ((lengthofStay == null) ? 0 : lengthofStay.hashCode());
		result = prime * result
				+ ((location == null) ? 0 : location.hashCode());
		result = prime
				* result
				+ ((longDestinationName == null) ? 0 : longDestinationName
						.hashCode());
		result = prime * result
				+ ((longitude == null) ? 0 : longitude.hashCode());
		result = prime
				* result
				+ ((mandatoryTaxesAndFees == null) ? 0 : mandatoryTaxesAndFees
						.hashCode());
		result = prime
				* result
				+ ((movingAverageScore == null) ? 0 : movingAverageScore
						.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime
				* result
				+ ((originalBaseRate == null) ? 0 : originalBaseRate.hashCode());
		result = prime
				* result
				+ ((originalPricePerNight == null) ? 0 : originalPricePerNight
						.hashCode());
		result = prime * result
				+ ((percentSavings == null) ? 0 : percentSavings.hashCode());
		result = prime * result
				+ ((pricePerNight == null) ? 0 : pricePerNight.hashCode());
		result = prime * result
				+ ((promotionAmount == null) ? 0 : promotionAmount.hashCode());
		result = prime
				* result
				+ ((promotionDescription == null) ? 0 : promotionDescription
						.hashCode());
		result = prime * result
				+ ((promotionTag == null) ? 0 : promotionTag.hashCode());
		result = prime * result
				+ ((province == null) ? 0 : province.hashCode());
		result = prime * result
				+ ((rawAppealScore == null) ? 0 : rawAppealScore.hashCode());
		result = prime * result
				+ ((regionId == null) ? 0 : regionId.hashCode());
		result = prime * result
				+ ((relevanceScore == null) ? 0 : relevanceScore.hashCode());
		result = prime * result
				+ ((similarDeepLink == null) ? 0 : similarDeepLink.hashCode());
		result = prime * result
				+ ((starRating == null) ? 0 : starRating.hashCode());
		result = prime * result
				+ ((statusCode == null) ? 0 : statusCode.hashCode());
		result = prime
				* result
				+ ((statusDescription == null) ? 0 : statusDescription
						.hashCode());
		result = prime * result
				+ ((streetAddress == null) ? 0 : streetAddress.hashCode());
		result = prime * result
				+ ((taxesAndFees == null) ? 0 : taxesAndFees.hashCode());
		result = prime * result
				+ ((totalRate == null) ? 0 : totalRate.hashCode());
		result = prime * result
				+ ((userCity == null) ? 0 : userCity.hashCode());
		result = prime * result
				+ ((userOrigin == null) ? 0 : userOrigin.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HotelDeal other = (HotelDeal) obj;
		if (baseRate == null) {
			if (other.baseRate != null)
				return false;
		} else if (!baseRate.equals(other.baseRate))
			return false;
		if (carPackage == null) {
			if (other.carPackage != null)
				return false;
		} else if (!carPackage.equals(other.carPackage))
			return false;
		if (carPackageScore == null) {
			if (other.carPackageScore != null)
				return false;
		} else if (!carPackageScore.equals(other.carPackageScore))
			return false;
		if (checkInDate == null) {
			if (other.checkInDate != null)
				return false;
		} else if (!checkInDate.equals(other.checkInDate))
			return false;
		if (checkOutDate == null) {
			if (other.checkOutDate != null)
				return false;
		} else if (!checkOutDate.equals(other.checkOutDate))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (dealDeepLink == null) {
			if (other.dealDeepLink != null)
				return false;
		} else if (!dealDeepLink.equals(other.dealDeepLink))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (distanceFromUser == null) {
			if (other.distanceFromUser != null)
				return false;
		} else if (!distanceFromUser.equals(other.distanceFromUser))
			return false;
		if (guestRating == null) {
			if (other.guestRating != null)
				return false;
		} else if (!guestRating.equals(other.guestRating))
			return false;
		if (hotelId == null) {
			if (other.hotelId != null)
				return false;
		} else if (!hotelId.equals(other.hotelId))
			return false;
		if (imageUrl == null) {
			if (other.imageUrl != null)
				return false;
		} else if (!imageUrl.equals(other.imageUrl))
			return false;
		if (isAllInclusive == null) {
			if (other.isAllInclusive != null)
				return false;
		} else if (!isAllInclusive.equals(other.isAllInclusive))
			return false;
		if (isDRR == null) {
			if (other.isDRR != null)
				return false;
		} else if (!isDRR.equals(other.isDRR))
			return false;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (latitude == null) {
			if (other.latitude != null)
				return false;
		} else if (!latitude.equals(other.latitude))
			return false;
		if (lengthofStay == null) {
			if (other.lengthofStay != null)
				return false;
		} else if (!lengthofStay.equals(other.lengthofStay))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (longDestinationName == null) {
			if (other.longDestinationName != null)
				return false;
		} else if (!longDestinationName.equals(other.longDestinationName))
			return false;
		if (longitude == null) {
			if (other.longitude != null)
				return false;
		} else if (!longitude.equals(other.longitude))
			return false;
		if (mandatoryTaxesAndFees == null) {
			if (other.mandatoryTaxesAndFees != null)
				return false;
		} else if (!mandatoryTaxesAndFees.equals(other.mandatoryTaxesAndFees))
			return false;
		if (movingAverageScore == null) {
			if (other.movingAverageScore != null)
				return false;
		} else if (!movingAverageScore.equals(other.movingAverageScore))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (originalBaseRate == null) {
			if (other.originalBaseRate != null)
				return false;
		} else if (!originalBaseRate.equals(other.originalBaseRate))
			return false;
		if (originalPricePerNight == null) {
			if (other.originalPricePerNight != null)
				return false;
		} else if (!originalPricePerNight.equals(other.originalPricePerNight))
			return false;
		if (percentSavings == null) {
			if (other.percentSavings != null)
				return false;
		} else if (!percentSavings.equals(other.percentSavings))
			return false;
		if (pricePerNight == null) {
			if (other.pricePerNight != null)
				return false;
		} else if (!pricePerNight.equals(other.pricePerNight))
			return false;
		if (promotionAmount == null) {
			if (other.promotionAmount != null)
				return false;
		} else if (!promotionAmount.equals(other.promotionAmount))
			return false;
		if (promotionDescription == null) {
			if (other.promotionDescription != null)
				return false;
		} else if (!promotionDescription.equals(other.promotionDescription))
			return false;
		if (promotionTag == null) {
			if (other.promotionTag != null)
				return false;
		} else if (!promotionTag.equals(other.promotionTag))
			return false;
		if (province == null) {
			if (other.province != null)
				return false;
		} else if (!province.equals(other.province))
			return false;
		if (rawAppealScore == null) {
			if (other.rawAppealScore != null)
				return false;
		} else if (!rawAppealScore.equals(other.rawAppealScore))
			return false;
		if (regionId == null) {
			if (other.regionId != null)
				return false;
		} else if (!regionId.equals(other.regionId))
			return false;
		if (relevanceScore == null) {
			if (other.relevanceScore != null)
				return false;
		} else if (!relevanceScore.equals(other.relevanceScore))
			return false;
		if (similarDeepLink == null) {
			if (other.similarDeepLink != null)
				return false;
		} else if (!similarDeepLink.equals(other.similarDeepLink))
			return false;
		if (starRating == null) {
			if (other.starRating != null)
				return false;
		} else if (!starRating.equals(other.starRating))
			return false;
		if (statusCode == null) {
			if (other.statusCode != null)
				return false;
		} else if (!statusCode.equals(other.statusCode))
			return false;
		if (statusDescription == null) {
			if (other.statusDescription != null)
				return false;
		} else if (!statusDescription.equals(other.statusDescription))
			return false;
		if (streetAddress == null) {
			if (other.streetAddress != null)
				return false;
		} else if (!streetAddress.equals(other.streetAddress))
			return false;
		if (taxesAndFees == null) {
			if (other.taxesAndFees != null)
				return false;
		} else if (!taxesAndFees.equals(other.taxesAndFees))
			return false;
		if (totalRate == null) {
			if (other.totalRate != null)
				return false;
		} else if (!totalRate.equals(other.totalRate))
			return false;
		if (userCity == null) {
			if (other.userCity != null)
				return false;
		} else if (!userCity.equals(other.userCity))
			return false;
		if (userOrigin == null) {
			if (other.userOrigin != null)
				return false;
		} else if (!userOrigin.equals(other.userOrigin))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "HotelDeal [movingAverageScore=" + movingAverageScore
				+ ", rawAppealScore=" + rawAppealScore + ", relevanceScore="
				+ relevanceScore + ", userCity=" + userCity + ", userOrigin="
				+ userOrigin + ", checkInDate=" + checkInDate
				+ ", checkOutDate=" + checkOutDate + ", hotelId=" + hotelId
				+ ", name=" + name + ", streetAddress=" + streetAddress
				+ ", city=" + city + ", province=" + province + ", country="
				+ country + ", latitude=" + latitude + ", longitude="
				+ longitude + ", description=" + description + ", destination="
				+ destination + ", longDestinationName=" + longDestinationName
				+ ", regionId=" + regionId + ", statusCode=" + statusCode
				+ ", statusDescription=" + statusDescription + ", baseRate="
				+ baseRate + ", originalBaseRate=" + originalBaseRate
				+ ", currency=" + currency + ", taxesAndFees=" + taxesAndFees
				+ ", totalRate=" + totalRate + ", promotionAmount="
				+ promotionAmount + ", promotionDescription="
				+ promotionDescription + ", dealDeepLink=" + dealDeepLink
				+ ", similarDeepLink=" + similarDeepLink + ", starRating="
				+ starRating + ", guestRating=" + guestRating
				+ ", lengthofStay=" + lengthofStay + ", pricePerNight="
				+ pricePerNight + ", originalPricePerNight="
				+ originalPricePerNight + ", percentSavings=" + percentSavings
				+ ", isDRR=" + isDRR + ", isAllInclusive=" + isAllInclusive
				+ ", location=" + location + ", imageUrl=" + imageUrl
				+ ", language=" + language + ", mandatoryTaxesAndFees="
				+ mandatoryTaxesAndFees + ", promotionTag=" + promotionTag
				+ ", carPackage=" + carPackage + ", carPackageScore="
				+ carPackageScore + ", distanceFromUser=" + distanceFromUser
				+ "]";
	}

    @Override
    public Map<String, Object> toJSON() {
        return jsonMap;
    }
}
