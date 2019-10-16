
package com.doublechaintech.retailscm.userapp;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import com.doublechaintech.retailscm.BaseEntity;
import com.doublechaintech.retailscm.SmartList;
import com.doublechaintech.retailscm.MultipleAccessKey;
import com.doublechaintech.retailscm.RetailscmUserContext;
<<<<<<< HEAD
import com.doublechaintech.retailscm.secuser.SecUserDAO;
=======

import com.doublechaintech.retailscm.quicklink.QuickLink;
import com.doublechaintech.retailscm.objectaccess.ObjectAccess;
import com.doublechaintech.retailscm.listaccess.ListAccess;
import com.doublechaintech.retailscm.secuser.SecUser;

import com.doublechaintech.retailscm.secuser.SecUserDAO;
import com.doublechaintech.retailscm.quicklink.QuickLinkDAO;
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
import com.doublechaintech.retailscm.listaccess.ListAccessDAO;
import com.doublechaintech.retailscm.objectaccess.ObjectAccessDAO;


public interface UserAppDAO{

	
	public UserApp load(String id, Map<String,Object> options) throws Exception;
	public void enhanceList(List<UserApp> userAppList);
	public void collectAndEnhance(BaseEntity ownerEntity);
	
	public void alias(List<BaseEntity> entityList);
	
	
	
	
	public UserApp present(UserApp userApp,Map<String,Object> options) throws Exception;
	public UserApp clone(String id, Map<String,Object> options) throws Exception;
	
	
	
	public UserApp save(UserApp userApp,Map<String,Object> options);
	public SmartList<UserApp> saveUserAppList(SmartList<UserApp> userAppList,Map<String,Object> options);
	public SmartList<UserApp> removeUserAppList(SmartList<UserApp> userAppList,Map<String,Object> options);
	public SmartList<UserApp> findUserAppWithKey(MultipleAccessKey key,Map<String, Object> options);
	public int countUserAppWithKey(MultipleAccessKey key,Map<String, Object> options);
	public Map<String, Integer> countUserAppWithGroupKey(String groupKey, MultipleAccessKey filterKey,
			Map<String, Object> options);
	public void delete(String userAppId, int version) throws Exception;
	public UserApp disconnectFromAll(String userAppId, int version) throws Exception;
	public int deleteAll() throws Exception;

<<<<<<< HEAD
=======
	public QuickLinkDAO getQuickLinkDAO();
		
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
	public ListAccessDAO getListAccessDAO();
		
	public ObjectAccessDAO getObjectAccessDAO();
		
	
<<<<<<< HEAD
=======
 	public SmartList<UserApp> requestCandidateUserAppForQuickLink(RetailscmUserContext userContext, String ownerClass, String id, String filterKey, int pageNo, int pageSize) throws Exception;
		
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
 	public SmartList<UserApp> requestCandidateUserAppForListAccess(RetailscmUserContext userContext, String ownerClass, String id, String filterKey, int pageNo, int pageSize) throws Exception;
		
 	public SmartList<UserApp> requestCandidateUserAppForObjectAccess(RetailscmUserContext userContext, String ownerClass, String id, String filterKey, int pageNo, int pageSize) throws Exception;
		
	
<<<<<<< HEAD
=======
	public UserApp planToRemoveQuickLinkList(UserApp userApp, String quickLinkIds[], Map<String,Object> options)throws Exception;


>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
	public UserApp planToRemoveListAccessList(UserApp userApp, String listAccessIds[], Map<String,Object> options)throws Exception;


	public UserApp planToRemoveObjectAccessList(UserApp userApp, String objectAccessIds[], Map<String,Object> options)throws Exception;


	
	public SmartList<UserApp> queryList(String sql, Object ... parmeters);
 
 	public SmartList<UserApp> findUserAppBySecUser(String secUserId, Map<String,Object> options);
 	public int countUserAppBySecUser(String secUserId, Map<String,Object> options);
 	public Map<String, Integer> countUserAppBySecUserIds(String[] ids, Map<String,Object> options);
 	public SmartList<UserApp> findUserAppBySecUser(String secUserId, int start, int count, Map<String,Object> options);
 	public void analyzeUserAppBySecUser(SmartList<UserApp> resultList, String secUserId, Map<String,Object> options);

 
<<<<<<< HEAD
 }
=======
 
	// 需要一个加载引用我的对象的enhance方法:QuickLink的app的QuickLinkList
	public SmartList<QuickLink> loadOurQuickLinkList(RetailscmUserContext userContext, List<UserApp> us, Map<String,Object> options) throws Exception;
	
	// 需要一个加载引用我的对象的enhance方法:ListAccess的app的ListAccessList
	public SmartList<ListAccess> loadOurListAccessList(RetailscmUserContext userContext, List<UserApp> us, Map<String,Object> options) throws Exception;
	
	// 需要一个加载引用我的对象的enhance方法:ObjectAccess的app的ObjectAccessList
	public SmartList<ObjectAccess> loadOurObjectAccessList(RetailscmUserContext userContext, List<UserApp> us, Map<String,Object> options) throws Exception;
	
}
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854


