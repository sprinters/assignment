package com.assignment.expedia.utils.misc;



import java.util.HashMap;
import java.util.Map;

/**
 * This is enum class..This enum will represent saving type action present in the system.
 * 
 * @author sandeepandey
 *
 */
public enum SavingActionType {
	
	//	--------------------------------------------------------------------------
	/**
	 * Enum constants
	 */
	CITY("0"),
	ADDRESS("1"),
	LONGITUDE_AND_LATITUDE("2"),
	STAR_RATING("3"),
	TOTAL_RATE("4");
	
	//--------------------------------------------------------------------------
	/**
	 * Private variables
	 */
	private String savingActionType	=	null;
	private static Map<String,SavingActionType> savingActionTypeEnum	=	new HashMap<String,SavingActionType>();
	
	
	//---------------------------------------------------------------------------
	static {
		for(SavingActionType mappingType : SavingActionType.values()) {
			savingActionTypeEnum.put(mappingType.getSavingActionType(), mappingType);
		}
	}
	//--------------------------------------------------------------------------
	/**
	 * Creates a new instance of SavingActionType
	 * 
	 * @param p_saving_type Name of the data type
	 */
	SavingActionType(String p_saving_type) {
		this.savingActionType	=	p_saving_type;
	}
	
	
	//--------------------------------------------------------------------------
	/**
	 * Returns the name of the saving action type
	 * 
	 * @return String
	 */
	public String getSavingActionType() {
		return savingActionType;
	}
	
	
	
	//--------------------------------------------------------------------------
	/**
	 * Returns Saving Action enum based on name
	 * 
	 * @param p_saving_type
	 * 
	 * @return MappingType
	 */
	public static SavingActionType fromType(String p_saving_type) {
		return savingActionTypeEnum.get(p_saving_type);
	}
	
	
}