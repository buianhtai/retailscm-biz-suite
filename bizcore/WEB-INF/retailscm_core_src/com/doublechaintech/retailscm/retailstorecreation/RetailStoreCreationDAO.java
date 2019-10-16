
package com.doublechaintech.retailscm.retailstorecreation;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import com.doublechaintech.retailscm.BaseEntity;
import com.doublechaintech.retailscm.SmartList;
import com.doublechaintech.retailscm.MultipleAccessKey;
import com.doublechaintech.retailscm.RetailscmUserContext;
<<<<<<< HEAD
=======

import com.doublechaintech.retailscm.retailstore.RetailStore;

>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
import com.doublechaintech.retailscm.retailstore.RetailStoreDAO;


public interface RetailStoreCreationDAO{

	
	public RetailStoreCreation load(String id, Map<String,Object> options) throws Exception;
	public void enhanceList(List<RetailStoreCreation> retailStoreCreationList);
	public void collectAndEnhance(BaseEntity ownerEntity);
	
	public void alias(List<BaseEntity> entityList);
	
	
	
	
	public RetailStoreCreation present(RetailStoreCreation retailStoreCreation,Map<String,Object> options) throws Exception;
	public RetailStoreCreation clone(String id, Map<String,Object> options) throws Exception;
	
	
	
	public RetailStoreCreation save(RetailStoreCreation retailStoreCreation,Map<String,Object> options);
	public SmartList<RetailStoreCreation> saveRetailStoreCreationList(SmartList<RetailStoreCreation> retailStoreCreationList,Map<String,Object> options);
	public SmartList<RetailStoreCreation> removeRetailStoreCreationList(SmartList<RetailStoreCreation> retailStoreCreationList,Map<String,Object> options);
	public SmartList<RetailStoreCreation> findRetailStoreCreationWithKey(MultipleAccessKey key,Map<String, Object> options);
	public int countRetailStoreCreationWithKey(MultipleAccessKey key,Map<String, Object> options);
	public Map<String, Integer> countRetailStoreCreationWithGroupKey(String groupKey, MultipleAccessKey filterKey,
			Map<String, Object> options);
	public void delete(String retailStoreCreationId, int version) throws Exception;
	public RetailStoreCreation disconnectFromAll(String retailStoreCreationId, int version) throws Exception;
	public int deleteAll() throws Exception;

	public RetailStoreDAO getRetailStoreDAO();
		
	
 	public SmartList<RetailStoreCreation> requestCandidateRetailStoreCreationForRetailStore(RetailscmUserContext userContext, String ownerClass, String id, String filterKey, int pageNo, int pageSize) throws Exception;
		
	
	public RetailStoreCreation planToRemoveRetailStoreList(RetailStoreCreation retailStoreCreation, String retailStoreIds[], Map<String,Object> options)throws Exception;


	//disconnect RetailStoreCreation with retail_store_country_center in RetailStore
	public RetailStoreCreation planToRemoveRetailStoreListWithRetailStoreCountryCenter(RetailStoreCreation retailStoreCreation, String retailStoreCountryCenterId, Map<String,Object> options)throws Exception;
	public int countRetailStoreListWithRetailStoreCountryCenter(String retailStoreCreationId, String retailStoreCountryCenterId, Map<String,Object> options)throws Exception;
	
	//disconnect RetailStoreCreation with city_service_center in RetailStore
	public RetailStoreCreation planToRemoveRetailStoreListWithCityServiceCenter(RetailStoreCreation retailStoreCreation, String cityServiceCenterId, Map<String,Object> options)throws Exception;
	public int countRetailStoreListWithCityServiceCenter(String retailStoreCreationId, String cityServiceCenterId, Map<String,Object> options)throws Exception;
	
	
	public SmartList<RetailStoreCreation> queryList(String sql, Object ... parmeters);
<<<<<<< HEAD
=======

	// 需要一个加载引用我的对象的enhance方法:RetailStore的creation的RetailStoreList
	public SmartList<RetailStore> loadOurRetailStoreList(RetailscmUserContext userContext, List<RetailStoreCreation> us, Map<String,Object> options) throws Exception;
	
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
}


