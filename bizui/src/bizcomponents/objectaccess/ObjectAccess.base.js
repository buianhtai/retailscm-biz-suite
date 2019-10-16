<<<<<<< HEAD

import ImagePreview from '../../components/ImagePreview'
import { Link } from 'dva/router'
import moment from 'moment'


=======
import React from 'react'
import { Icon,Divider } from 'antd'

import { Link } from 'dva/router'
import moment from 'moment'
import ImagePreview from '../../components/ImagePreview'
import appLocaleName from '../../common/Locale.tool'
import BaseTool from '../../common/Base.tool'
import GlobalComponents from '../../custcomponents'
import DescriptionList from '../../components/DescriptionList'
const { Description } = DescriptionList
const {
	defaultRenderReferenceCell,
	defaultRenderBooleanCell,
	defaultRenderMoneyCell,
	defaultRenderDateTimeCell,
	defaultRenderImageCell,
	defaultRenderDateCell,
	defaultRenderIdentifier,
	defaultRenderTextCell,
} = BaseTool

const renderTextCell=defaultRenderTextCell
const renderIdentifier=defaultRenderIdentifier
const renderDateCell=defaultRenderDateCell
const renderDateTimeCell=defaultRenderDateTimeCell
const renderImageCell=defaultRenderImageCell
const renderMoneyCell=defaultRenderMoneyCell
const renderBooleanCell=defaultRenderBooleanCell
const renderReferenceCell=defaultRenderReferenceCell
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854


const menuData = {menuName:"对象访问", menuFor: "objectAccess",
  		subItems: [
  
  		],
}

<<<<<<< HEAD
const renderTextCell=(value, record)=>{

	if(!value){
		return '';
	}
	if(value==null){
		return '';
	}
	if(value.length>15){
		return value.substring(0,15)+"...("+value.length+"字)"
	}
	return value
	
}

const renderIdentifier=(value, record, targtObjectType)=>{

	return (<Link to={`/${targtObjectType}/${value}/dashboard`}>{value}</Link>)
	
}

const renderDateCell=(value, record)=>{
	return moment(value).format('YYYY-MM-DD');
}
const renderDateTimeCell=(value, record)=>{
	return moment(value).format('YYYY-MM-DD HH:mm');	
}

const renderImageCell=(value, record, title)=>{
	return (<ImagePreview imageTitle={title} imageLocation={value} />)	
}

const renderMoneyCell=(value, record)=>{
	if(!value){
		return '空'
	}
	if(value == null){
		return '空'
	}
	return (`￥${value.toFixed(2)}`)
}

const renderBooleanCell=(value, record)=>{

	return  (value? '是' : '否')

}

const renderReferenceCell=(value, record)=>{

	return (value ? value.displayName : '暂无') 
=======

const settingMenuData = {menuName:"对象访问", menuFor: "objectAccess",
  		subItems: [
  
  		],
}

const fieldLabels = {
  id: 'ID',
  name: '名称',
  objectType: '访问对象类型',
  list1: '列表1',
  list2: '列表2',
  list3: '列表3',
  list4: '列表4',
  list5: '列表5',
  list6: '列表6',
  list7: '列表7',
  list8: '列表8',
  list9: '列表9',
  app: '应用程序',
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854

}

const displayColumns = [
<<<<<<< HEAD
  { title: '序号', debugtype: 'string', dataIndex: 'id', width: '20',render: (text, record)=>renderTextCell(text,record) },
  { title: '名称', debugtype: 'string', dataIndex: 'name', width: '11',render: (text, record)=>renderTextCell(text,record) },
  { title: '对象类型', debugtype: 'string', dataIndex: 'objectType', width: '32',render: (text, record)=>renderTextCell(text,record) },
  { title: '表', debugtype: 'string', dataIndex: 'list1', width: '24',render: (text, record)=>renderTextCell(text,record) },
  { title: '清单', debugtype: 'string', dataIndex: 'list2', width: '24',render: (text, record)=>renderTextCell(text,record) },
  { title: '目录3', debugtype: 'string', dataIndex: 'list3', width: '24',render: (text, record)=>renderTextCell(text,record) },
  { title: '清单', debugtype: 'string', dataIndex: 'list4', width: '24',render: (text, record)=>renderTextCell(text,record) },
  { title: '列表6', debugtype: 'string', dataIndex: 'list5', width: '24',render: (text, record)=>renderTextCell(text,record) },
  { title: 'list6', debugtype: 'string', dataIndex: 'list6', width: '24',render: (text, record)=>renderTextCell(text,record) },
  { title: 'list7', debugtype: 'string', dataIndex: 'list7', width: '24',render: (text, record)=>renderTextCell(text,record) },
  { title: 'list8', debugtype: 'string', dataIndex: 'list8', width: '24',render: (text, record)=>renderTextCell(text,record) },
  { title: 'list9', debugtype: 'string', dataIndex: 'list9', width: '24',render: (text, record)=>renderTextCell(text,record) },
  { title: '应用程序', dataIndex: 'app', render: (text, record) => renderReferenceCell(text, record)},

]

const fieldLabels = {
  id: '序号',
  name: '名称',
  objectType: '对象类型',
  list1: '表',
  list2: '清单',
  list3: '目录3',
  list4: '清单',
  list5: '列表6',
  list6: 'list6',
  list7: 'list7',
  list8: 'list8',
  list9: 'list9',
  app: '应用程序',

}


const ObjectAccessBase={menuData,displayColumns,fieldLabels,displayColumns}
=======
  { title: fieldLabels.id, debugtype: 'string', dataIndex: 'id', width: '8', render: (text, record)=>renderTextCell(text,record,'objectAccess') , sorter: true },
  { title: fieldLabels.name, debugtype: 'string', dataIndex: 'name', width: '11',render: (text, record)=>renderTextCell(text,record)},
  { title: fieldLabels.objectType, debugtype: 'string', dataIndex: 'objectType', width: '32',render: (text, record)=>renderTextCell(text,record)},
  { title: fieldLabels.list1, debugtype: 'string', dataIndex: 'list1', width: '24',render: (text, record)=>renderTextCell(text,record)},
  { title: fieldLabels.list2, debugtype: 'string', dataIndex: 'list2', width: '24',render: (text, record)=>renderTextCell(text,record)},
  { title: fieldLabels.list3, debugtype: 'string', dataIndex: 'list3', width: '24',render: (text, record)=>renderTextCell(text,record)},
  { title: fieldLabels.list4, debugtype: 'string', dataIndex: 'list4', width: '24',render: (text, record)=>renderTextCell(text,record)},
  { title: fieldLabels.list5, debugtype: 'string', dataIndex: 'list5', width: '24',render: (text, record)=>renderTextCell(text,record)},
  { title: fieldLabels.list6, debugtype: 'string', dataIndex: 'list6', width: '24',render: (text, record)=>renderTextCell(text,record)},
  { title: fieldLabels.list7, debugtype: 'string', dataIndex: 'list7', width: '24',render: (text, record)=>renderTextCell(text,record)},
  { title: fieldLabels.list8, debugtype: 'string', dataIndex: 'list8', width: '24',render: (text, record)=>renderTextCell(text,record)},
  { title: fieldLabels.list9, debugtype: 'string', dataIndex: 'list9', width: '24',render: (text, record)=>renderTextCell(text,record)},
  { title: fieldLabels.app, dataIndex: 'app', render: (text, record) => renderReferenceCell(text, record), sorter:true},

]
// refernce to https://ant.design/components/list-cn/
const renderItemOfList=(objectAccess,targetComponent)=>{

  const userContext = null
  return (
    <div key={objectAccess.id}>
	
      <DescriptionList  key={objectAccess.id} size="small" col="4">
        <Description term="ID">{objectAccess.id}</Description> 
        <Description term="名称">{objectAccess.name}</Description> 
        <Description term="访问对象类型">{objectAccess.objectType}</Description> 
        <Description term="列表1">{objectAccess.list1}</Description> 
        <Description term="列表2">{objectAccess.list2}</Description> 
        <Description term="列表3">{objectAccess.list3}</Description> 
        <Description term="列表4">{objectAccess.list4}</Description> 
        <Description term="列表5">{objectAccess.list5}</Description> 
        <Description term="列表6">{objectAccess.list6}</Description> 
        <Description term="列表7">{objectAccess.list7}</Description> 
        <Description term="列表8">{objectAccess.list8}</Description> 
        <Description term="列表9">{objectAccess.list9}</Description> 
        <Description term="应用程序"><div>{objectAccess.app==null?appLocaleName(userContext,"NotAssigned"):`${objectAccess.app.displayName}(${objectAccess.app.id})`}
        </div></Description>
	
        
      </DescriptionList>
      <Divider style={{ height: '2px' }} />
    </div>
	)

}
	



const ObjectAccessBase={menuData,displayColumns,fieldLabels,renderItemOfList}
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
export default ObjectAccessBase



