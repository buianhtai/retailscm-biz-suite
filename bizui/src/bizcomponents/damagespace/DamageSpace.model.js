
<<<<<<< HEAD

=======
import React from 'react'
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
import pathToRegexp from 'path-to-regexp'
import { routerRedux } from 'dva/router'
import { notification } from 'antd'
import GlobalComponents from '../../custcomponents';
<<<<<<< HEAD

import modeltool from '../../utils/modeltool'
const {setupModel,hasError,handleClientError,handleServerError,keepValueWithKeySuffix}=modeltool

=======
import appLocaleName from '../../common/Locale.tool'
import modeltool from '../../utils/modeltool'
const {setupModel,hasError,handleClientError,handleServerError,keepValueWithKeySuffix}=modeltool

const notifySuccess=(userContext)=>{

	notification.success({
        message: appLocaleName(userContext,'Success'),
        description: appLocaleName(userContext,'Success'),
      })

}

>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854

export default {

  namespace: '_damageSpace',

  state: {},

  subscriptions: {
    
    setup({ dispatch, history }) { 
      history.listen((location) => {
      	const modelName = 'damageSpace'
      	const parameter = {dispatch,history,location,modelName}
        //console.log("setupModel",setupModel,typeof(setupModel))
      	setupModel(parameter)

      })
    },
  },
  effects: {
    *view({ payload }, { call, put, select }) { 
    
      const cachedData = yield select(state => state._damageSpace)
      //if the data in the cache, just show it, there is no delay
      const link = payload.pathname
      //if the data in the cache, just show it, there is no delay
      if(cachedData.class){
        //yield put({ type: 'breadcrumb/gotoLink', payload: { displayName:cachedData.displayName,link }} )
        yield put({ type: 'updateState', payload: cachedData })
        
        if(payload.useCache){
        	return //use cache for returning page
        }
        
      }else{
        yield put({ type: 'showLoading', payload })
      }
      
      const {DamageSpaceService} = GlobalComponents;
      const data = yield call(DamageSpaceService.view, payload.id)
      
      const displayName = payload.displayName||data.displayName
      
      
      yield put({ type: 'breadcrumb/gotoLink', payload: { displayName,link }} )
      

      yield put({ type: 'updateState', payload: data })
    },
    *load({ payload }, { call, put }) { 
      const {DamageSpaceService} = GlobalComponents;
      //yield put({ type: 'showLoading', payload })
      const data = yield call(DamageSpaceService.load, payload.id, payload.parameters)
      const newPlayload = { ...payload, ...data }
      
      console.log('this is the data id: ', data.id)
      yield put({ type: 'updateState', payload: newPlayload })
    },
    
    *doJob({ payload }, { call, put }) { 
<<<<<<< HEAD
=======
      const userContext = null
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
      const {TaskService} = GlobalComponents;
      //yield put({ type: 'showLoading', payload })      
      const {serviceNameToCall, id, parameters} = payload;
      if(!serviceNameToCall){
<<<<<<< HEAD
      	handleClientError("没有提供后台服务的名字, 该服务没有注册")
      	return;
      }
      
=======
      	handleClientError(appLocaleName(userContext,'ServiceNotRegistered'))
      	return;
      }
      "react/dva_object_model.jsp"
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
      
      const data = yield call(serviceNameToCall, id, parameters)
      if(handleServerError(data)){
      	return
      }
      const newPlayload = { ...payload, ...data }
      
      console.log('this is the data id: ', data.id)
      yield put({ type: 'updateState', payload: newPlayload })
    },
       
    
    
    *gotoCreateForm({ payload }, { put }) {
      const { id, role } = payload
      yield put(routerRedux.push(`/damageSpace/${id}/list/${role}CreateForm`))
    },
    *gotoUpdateForm({ payload }, { put }) {
      const { id, role, selectedRows, currentUpdateIndex } = payload
      const state = { id, role, selectedRows, currentUpdateIndex }
      const location = { pathname: `/damageSpace/${id}/list/${role}UpdateForm`, state }
      yield put(routerRedux.push(location))
    },
    *goback({ payload }, { put }) {
      const { id, type,listName } = payload
      yield put(routerRedux.push(`/damageSpace/${id}/list/${type}List/${listName}`))
    },




    *addGoodsShelf({ payload }, { call, put }) {
<<<<<<< HEAD
=======
      const userContext = null
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
      const {DamageSpaceService} = GlobalComponents;

      const { id, role, parameters, continueNext } = payload
      console.log('get form parameters', parameters)
      const data = yield call(DamageSpaceService.addGoodsShelf, id, parameters)
      if (hasError(data)) {
        handleServerError(data)
        return
      }
      const newPlayload = { ...payload, ...data }
      yield put({ type: 'updateState', payload: newPlayload })
      // yield put(routerRedux.push(`/damageSpace/${id}/list/${role}CreateForm'))
<<<<<<< HEAD
      notification.success({
        message: '执行成功',
        description: '执行成功',
      })
=======
      notifySuccess(userContext)
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
      if (continueNext) {
        return
      }
      const partialList = true
      const newState = {...data, partialList}
<<<<<<< HEAD
      const location = { pathname: `/damageSpace/${id}/list/\GoodsShelfList/货架列表`, state: newState }
      yield put(routerRedux.push(location))
    },
    *updateGoodsShelf({ payload }, { call, put }) {
=======
      const location = { pathname: `/damageSpace/${id}/list/GoodsShelfList/货架+${appLocaleName(userContext,'List')}`, state: newState }
      yield put(routerRedux.push(location))
    },
    *updateGoodsShelf({ payload }, { call, put }) {
      const userContext = null
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
      const {DamageSpaceService} = GlobalComponents;      
      const { id, type, parameters, continueNext, selectedRows, currentUpdateIndex } = payload
      console.log('get form parameters', parameters)
      const data = yield call(DamageSpaceService.updateGoodsShelf, id, parameters)
      if (hasError(data)) {
        handleServerError(data)
        return
      }
      const partialList = true
      
      const newPlayload = { ...payload, ...data, selectedRows, currentUpdateIndex,partialList }
      yield put({ type: 'updateState', payload: newPlayload })
<<<<<<< HEAD
      notification.success({
        message: '执行成功',
        description: '执行成功',
      })
=======
      notifySuccess(userContext)
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
      
      if (continueNext) {
        return
      }
<<<<<<< HEAD
      const location = { pathname: `/damageSpace/${id}/list/\GoodsShelfList/货架列表`, state: newPlayload }
=======
      const location = { pathname: `/damageSpace/${id}/list/GoodsShelfList/货架列表`, state: newPlayload }
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
      yield put(routerRedux.push(location))
    },
    *gotoNextGoodsShelfUpdateRow({ payload }, { call, put }) {
      const { id, type, parameters, continueNext, selectedRows, currentUpdateIndex } = payload
      const newPlayload = { ...payload, selectedRows, currentUpdateIndex }
      yield put({ type: 'updateState', payload: newPlayload })
    },
    *removeGoodsShelfList({ payload }, { call, put }) {
<<<<<<< HEAD
=======
     const userContext = null
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
      const {DamageSpaceService} = GlobalComponents; 
      const { id, role, parameters, continueNext } = payload
      console.log('get form parameters', parameters)
      const data = yield call(DamageSpaceService.removeGoodsShelfList, id, parameters)
      if (hasError(data)) {
        handleServerError(data)
        return
      }
      const newPlayload = { ...payload, ...data }

      yield put({ type: 'updateState', payload: newPlayload })
<<<<<<< HEAD
        
     
      notification.success({
        message: '执行成功',
        description: '执行成功',
      })

=======
      notifySuccess(userContext)
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
    },

  },
  
  reducers: {
    updateState(state, action) {
      const payload = { ...action.payload, loading: true }
      const valueToKeep = keepValueWithKeySuffix(state,"Parameters") 
      return { ...valueToKeep, ...payload}
    },
    showLoading(state, action) {
      // const loading=true
      const payload = { ...action.payload, loading: true }
      const valueToKeep = keepValueWithKeySuffix(state,"Parameters") 
      return { ...valueToKeep, ...payload}
    },
  },
}

