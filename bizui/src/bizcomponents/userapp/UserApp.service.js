import { get,postForm,PREFIX,joinParameters,joinPostParameters } from '../../axios/tools'


const view = (targetObjectId) => {
  return get({
    url: `${PREFIX}userAppManager/view/${targetObjectId}/`,
  })
}



const load = (targetObjectId, parameters) => {
  const parametersExpr = joinParameters(parameters)
  return get({
    url: `${PREFIX}userAppManager/loadUserApp/${targetObjectId}/${parametersExpr}/`,
  })
}



const requestCandidateSecUser = (ownerClass, id, filterKey, pageNo) => {
 
  const url = `${PREFIX}userAppManager/requestCandidateSecUser/ownerClass/id/filterKey/pageNo/`
  const requestParameters = {id, ownerClass,filterKey, pageNo}
  return postForm({url,requestParameters})
}	

const transferToAnotherSecUser = (id, parameters) => {
  //const parametersExpr = joinParameters(parameters)
  const url = `${PREFIX}userAppManager/transferToAnotherSecUser/id/anotherSecUserId/`
  const requestParameters = {id, ...parameters}
  return postForm({url,requestParameters})
}







<<<<<<< HEAD
=======
const addQuickLink = (targetObjectId, parameters) => {
  const url = `${PREFIX}userAppManager/addQuickLink/userAppId/name/icon/imagePath/linkTarget/tokensExpr/`
  const userAppId = targetObjectId
  const requestParameters = { ...parameters, userAppId, tokensExpr: 'none' }
  return postForm({ url,requestParameters})
}

const updateQuickLink = (targetObjectId, parameters) => {
  const url = `${PREFIX}userAppManager/updateQuickLinkProperties/userAppId/id/name/icon/imagePath/linkTarget/tokensExpr/`
  const userAppId = targetObjectId
  const requestParameters = { ...parameters, userAppId, tokensExpr: 'none' }
  return postForm({ url,requestParameters})
}

const removeQuickLinkList = (targetObjectId, parameters) => {
  const url = `${PREFIX}userAppManager/removeQuickLinkList/userAppId/quickLinkIds/tokensExpr/`
  const requestParameters = { ...parameters, userAppId: targetObjectId, tokensExpr: 'none' }
  return postForm({ url,requestParameters})
}



>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
const addListAccess = (targetObjectId, parameters) => {
  const url = `${PREFIX}userAppManager/addListAccess/userAppId/name/internalName/readPermission/createPermission/deletePermission/updatePermission/executionPermission/tokensExpr/`
  const userAppId = targetObjectId
  const requestParameters = { ...parameters, userAppId, tokensExpr: 'none' }
  return postForm({ url,requestParameters})
}

const updateListAccess = (targetObjectId, parameters) => {
  const url = `${PREFIX}userAppManager/updateListAccessProperties/userAppId/id/name/internalName/readPermission/createPermission/deletePermission/updatePermission/executionPermission/tokensExpr/`
  const userAppId = targetObjectId
  const requestParameters = { ...parameters, userAppId, tokensExpr: 'none' }
  return postForm({ url,requestParameters})
}

const removeListAccessList = (targetObjectId, parameters) => {
  const url = `${PREFIX}userAppManager/removeListAccessList/userAppId/listAccessIds/tokensExpr/`
  const requestParameters = { ...parameters, userAppId: targetObjectId, tokensExpr: 'none' }
  return postForm({ url,requestParameters})
}



const addObjectAccess = (targetObjectId, parameters) => {
  const url = `${PREFIX}userAppManager/addObjectAccess/userAppId/name/objectType/list1/list2/list3/list4/list5/list6/list7/list8/list9/tokensExpr/`
  const userAppId = targetObjectId
  const requestParameters = { ...parameters, userAppId, tokensExpr: 'none' }
  return postForm({ url,requestParameters})
}

const updateObjectAccess = (targetObjectId, parameters) => {
  const url = `${PREFIX}userAppManager/updateObjectAccessProperties/userAppId/id/name/objectType/list1/list2/list3/list4/list5/list6/list7/list8/list9/tokensExpr/`
  const userAppId = targetObjectId
  const requestParameters = { ...parameters, userAppId, tokensExpr: 'none' }
  return postForm({ url,requestParameters})
}

const removeObjectAccessList = (targetObjectId, parameters) => {
  const url = `${PREFIX}userAppManager/removeObjectAccessList/userAppId/objectAccessIds/tokensExpr/`
  const requestParameters = { ...parameters, userAppId: targetObjectId, tokensExpr: 'none' }
  return postForm({ url,requestParameters})
}


const UserAppService = { view,
  load,
<<<<<<< HEAD
  addListAccess,
  addObjectAccess,
  updateListAccess,
  updateObjectAccess,
=======
  addQuickLink,
  addListAccess,
  addObjectAccess,
  updateQuickLink,
  updateListAccess,
  updateObjectAccess,
  removeQuickLinkList,
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
  removeListAccessList,
  removeObjectAccessList,
  requestCandidateSecUser,
  transferToAnotherSecUser }
export default UserAppService

