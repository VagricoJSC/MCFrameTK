delete from FCM_RESOURCE WHERE 0=0 AND RES_KEY LIKE 'system_location2.System.MS.MSBFP0110.%'; 
insert into FCM_RESOURCE (USER_ID,PGM_ID,CO_CD,EXT_ATTR1,EXT_ATTR2,EXT_ATTR3,LOCALE,NAME,RES_KEY,RES_VAL) values ('?ALL','ALL',null,null,null,null,null,'MCAppClient','system_location2.System.MS.MSBFP0110.list.item0','MSBFP0110,Tab1,Cnd.bp_lot_no,true,true,false'); 
