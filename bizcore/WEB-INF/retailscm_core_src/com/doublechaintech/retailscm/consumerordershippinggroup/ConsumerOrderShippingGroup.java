
package com.doublechaintech.retailscm.consumerordershippinggroup;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
<<<<<<< HEAD
=======
import java.util.stream.Collectors;
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
import java.math.BigDecimal;
import com.terapico.caf.DateTime;
import com.doublechaintech.retailscm.BaseEntity;
import com.doublechaintech.retailscm.SmartList;
import com.doublechaintech.retailscm.KeyValuePair;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.doublechaintech.retailscm.consumerorder.ConsumerOrder;

@JsonSerialize(using = ConsumerOrderShippingGroupSerializer.class)
public class ConsumerOrderShippingGroup extends BaseEntity implements  java.io.Serializable{

	
	public static final String ID_PROPERTY                    = "id"                ;
	public static final String NAME_PROPERTY                  = "name"              ;
	public static final String BIZ_ORDER_PROPERTY             = "bizOrder"          ;
	public static final String AMOUNT_PROPERTY                = "amount"            ;
	public static final String VERSION_PROPERTY               = "version"           ;


	public static final String INTERNAL_TYPE="ConsumerOrderShippingGroup";
	public String getInternalType(){
		return INTERNAL_TYPE;
	}
	
	public String getDisplayName(){
	
		String displayName = getName();
		if(displayName!=null){
			return displayName;
		}
		
		return super.getDisplayName();
		
	}

	private static final long serialVersionUID = 1L;
	

	protected		String              	mId                 ;
	protected		String              	mName               ;
	protected		ConsumerOrder       	mBizOrder           ;
	protected		BigDecimal          	mAmount             ;
	protected		int                 	mVersion            ;
	
	
	
		
	public 	ConsumerOrderShippingGroup(){
<<<<<<< HEAD
		//lazy load for all the properties
	}
	//disconnect from all, 中文就是一了百了，跟所有一切尘世断绝往来藏身于茫茫数据海洋
=======
		// lazy load for all the properties
	}
	public 	static ConsumerOrderShippingGroup withId(String id){
		ConsumerOrderShippingGroup consumerOrderShippingGroup = new ConsumerOrderShippingGroup();
		consumerOrderShippingGroup.setId(id);
		consumerOrderShippingGroup.setVersion(Integer.MAX_VALUE);
		return consumerOrderShippingGroup;
	}
	public 	static ConsumerOrderShippingGroup refById(String id){
		return withId(id);
	}
	
	// disconnect from all, 中文就是一了百了，跟所有一切尘世断绝往来藏身于茫茫数据海洋
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
	public 	void clearFromAll(){
		setBizOrder( null );

		this.changed = true;
	}
	
	public 	ConsumerOrderShippingGroup(String name, ConsumerOrder bizOrder, BigDecimal amount)
	{
		setName(name);
		setBizOrder(bizOrder);
		setAmount(amount);
	
	}
	
	//Support for changing the property
	
	public void changeProperty(String property, String newValueExpr) {
     	
		if(NAME_PROPERTY.equals(property)){
			changeNameProperty(newValueExpr);
		}
		if(AMOUNT_PROPERTY.equals(property)){
			changeAmountProperty(newValueExpr);
		}

      
	}
    
    
	protected void changeNameProperty(String newValueExpr){
		String oldValue = getName();
		String newValue = parseString(newValueExpr);
		if(equalsString(oldValue , newValue)){
			return;//they can be both null, or exact the same object, this is much faster than equals function
		}
		//they are surely different each other
		updateName(newValue);
		this.onChangeProperty(NAME_PROPERTY, oldValue, newValue);
		return;
  
	}
			
			
			
	protected void changeAmountProperty(String newValueExpr){
		BigDecimal oldValue = getAmount();
		BigDecimal newValue = parseBigDecimal(newValueExpr);
		if(equalsBigDecimal(oldValue , newValue)){
			return;//they can be both null, or exact the same object, this is much faster than equals function
		}
		//they are surely different each other
		updateAmount(newValue);
		this.onChangeProperty(AMOUNT_PROPERTY, oldValue, newValue);
		return;
  
	}
			
			
			


	
<<<<<<< HEAD
=======
	public Object propertyOf(String property) {
     	
		if(NAME_PROPERTY.equals(property)){
			return getName();
		}
		if(BIZ_ORDER_PROPERTY.equals(property)){
			return getBizOrder();
		}
		if(AMOUNT_PROPERTY.equals(property)){
			return getAmount();
		}

    		//other property not include here
		return super.propertyOf(property);
	}
    
    


	
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
	
	
	public void setId(String id){
		this.mId = trimString(id);;
	}
	public String getId(){
		return this.mId;
	}
	public ConsumerOrderShippingGroup updateId(String id){
		this.mId = trimString(id);;
		this.changed = true;
		return this;
	}
<<<<<<< HEAD
=======
	public void mergeId(String id){
		if(id != null) { setId(id);}
	}
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
	
	
	public void setName(String name){
		this.mName = trimString(name);;
	}
	public String getName(){
		return this.mName;
	}
	public ConsumerOrderShippingGroup updateName(String name){
		this.mName = trimString(name);;
		this.changed = true;
		return this;
	}
<<<<<<< HEAD
=======
	public void mergeName(String name){
		if(name != null) { setName(name);}
	}
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
	
	
	public void setBizOrder(ConsumerOrder bizOrder){
		this.mBizOrder = bizOrder;;
	}
	public ConsumerOrder getBizOrder(){
		return this.mBizOrder;
	}
	public ConsumerOrderShippingGroup updateBizOrder(ConsumerOrder bizOrder){
		this.mBizOrder = bizOrder;;
		this.changed = true;
		return this;
	}
<<<<<<< HEAD
=======
	public void mergeBizOrder(ConsumerOrder bizOrder){
		if(bizOrder != null) { setBizOrder(bizOrder);}
	}
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
	
	
	public void clearBizOrder(){
		setBizOrder ( null );
		this.changed = true;
	}
	
	public void setAmount(BigDecimal amount){
		this.mAmount = amount;;
	}
	public BigDecimal getAmount(){
		return this.mAmount;
	}
	public ConsumerOrderShippingGroup updateAmount(BigDecimal amount){
		this.mAmount = amount;;
		this.changed = true;
		return this;
	}
<<<<<<< HEAD
=======
	public void mergeAmount(BigDecimal amount){
		setAmount(amount);
	}
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
	
	
	public void setVersion(int version){
		this.mVersion = version;;
	}
	public int getVersion(){
		return this.mVersion;
	}
	public ConsumerOrderShippingGroup updateVersion(int version){
		this.mVersion = version;;
		this.changed = true;
		return this;
	}
<<<<<<< HEAD
=======
	public void mergeVersion(int version){
		setVersion(version);
	}
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
	
	

	public void collectRefercences(BaseEntity owner, List<BaseEntity> entityList, String internalType){

		addToEntityList(this, entityList, getBizOrder(), internalType);

		
	}
	
	public List<BaseEntity>  collectRefercencesFromLists(String internalType){
		
		List<BaseEntity> entityList = new ArrayList<BaseEntity>();

		return entityList;
	}
	
	public  List<SmartList<?>> getAllRelatedLists() {
		List<SmartList<?>> listOfList = new ArrayList<SmartList<?>>();
		
			

		return listOfList;
	}

	
	public List<KeyValuePair> keyValuePairOf(){
		List<KeyValuePair> result =  super.keyValuePairOf();

		appendKeyValuePair(result, ID_PROPERTY, getId());
		appendKeyValuePair(result, NAME_PROPERTY, getName());
		appendKeyValuePair(result, BIZ_ORDER_PROPERTY, getBizOrder());
		appendKeyValuePair(result, AMOUNT_PROPERTY, getAmount());
		appendKeyValuePair(result, VERSION_PROPERTY, getVersion());

		
		return result;
	}
	
	
	public BaseEntity copyTo(BaseEntity baseDest){
		
		
		if(baseDest instanceof ConsumerOrderShippingGroup){
		
		
			ConsumerOrderShippingGroup dest =(ConsumerOrderShippingGroup)baseDest;
		
			dest.setId(getId());
			dest.setName(getName());
			dest.setBizOrder(getBizOrder());
			dest.setAmount(getAmount());
			dest.setVersion(getVersion());

		}
		super.copyTo(baseDest);
		return baseDest;
	}
<<<<<<< HEAD
=======
	public BaseEntity mergeDataTo(BaseEntity baseDest){
		
		
		if(baseDest instanceof ConsumerOrderShippingGroup){
		
			
			ConsumerOrderShippingGroup dest =(ConsumerOrderShippingGroup)baseDest;
		
			dest.mergeId(getId());
			dest.mergeName(getName());
			dest.mergeBizOrder(getBizOrder());
			dest.mergeAmount(getAmount());
			dest.mergeVersion(getVersion());

		}
		super.copyTo(baseDest);
		return baseDest;
	}
	
	public BaseEntity mergePrimitiveDataTo(BaseEntity baseDest){
		
		
		if(baseDest instanceof ConsumerOrderShippingGroup){
		
			
			ConsumerOrderShippingGroup dest =(ConsumerOrderShippingGroup)baseDest;
		
			dest.mergeId(getId());
			dest.mergeName(getName());
			dest.mergeAmount(getAmount());
			dest.mergeVersion(getVersion());

		}
		return baseDest;
	}
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
	
	public String toString(){
		StringBuilder stringBuilder=new StringBuilder(128);

		stringBuilder.append("ConsumerOrderShippingGroup{");
		stringBuilder.append("\tid='"+getId()+"';");
		stringBuilder.append("\tname='"+getName()+"';");
		if(getBizOrder() != null ){
 			stringBuilder.append("\tbizOrder='ConsumerOrder("+getBizOrder().getId()+")';");
 		}
		stringBuilder.append("\tamount='"+getAmount()+"';");
		stringBuilder.append("\tversion='"+getVersion()+"';");
		stringBuilder.append("}");

		return stringBuilder.toString();
	}
	
	//provide number calculation function
	

}

