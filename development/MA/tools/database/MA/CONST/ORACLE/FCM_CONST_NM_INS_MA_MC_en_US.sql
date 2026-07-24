DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_DAY_WEEK_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_DAY_WEEK_TYP',
	'en_US',
	'Day type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DAY_WEEK_TYP' AND C_KEY = 'SUN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DAY_WEEK_TYP',
	'SUN',
	'1',
	'en_US',
	'Sun.' ,
	'Sunday');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DAY_WEEK_TYP' AND C_KEY = 'MON' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DAY_WEEK_TYP',
	'MON',
	'2',
	'en_US',
	'Mon.' ,
	'Monday');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DAY_WEEK_TYP' AND C_KEY = 'TUE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DAY_WEEK_TYP',
	'TUE',
	'3',
	'en_US',
	'Tue.' ,
	'Tuesday');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DAY_WEEK_TYP' AND C_KEY = 'WED' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DAY_WEEK_TYP',
	'WED',
	'4',
	'en_US',
	'Wed.' ,
	'Wednesday');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DAY_WEEK_TYP' AND C_KEY = 'THU' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DAY_WEEK_TYP',
	'THU',
	'5',
	'en_US',
	'Thu.' ,
	'Thursday');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DAY_WEEK_TYP' AND C_KEY = 'FRI' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DAY_WEEK_TYP',
	'FRI',
	'6',
	'en_US',
	'Fri.' ,
	'Friday');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DAY_WEEK_TYP' AND C_KEY = 'SAT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DAY_WEEK_TYP',
	'SAT',
	'7',
	'en_US',
	'Sat.' ,
	'Saturday');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_STR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_STR',
	'en_US',
	'Constant for string' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STR' AND C_KEY = 'NULL_VAL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STR',
	'NULL_VAL',
	'*',
	'en_US',
	'NULL character' ,
	'NULL character.\nIf you change this value, please also change the database definition setup file in Excel. (*NULL_VAL=''*'' in 2 DEF_CONST)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STR' AND C_KEY = 'REAL_NULL_VAL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STR',
	'REAL_NULL_VAL',
	' ',
	'en_US',
	'This NULL character' ,
	'Character for real NULL (initial value is single-byte space) \nString to identify NULL that is different from NULL character. Assume to be used in search process using work.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STR' AND C_KEY = 'CD_NM_DLM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STR',
	'CD_NM_DLM',
	':',
	'en_US',
	'Display delimited code names' ,
	'Display delimited code names');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STR' AND C_KEY = 'DEF_NUM_PTN_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STR',
	'DEF_NUM_PTN_CD',
	'0',
	'en_US',
	'Default numbering pattern cd.' ,
	'Default numbering pattern cd.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STR' AND C_KEY = 'BTN_GRP_NM_DLM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STR',
	'BTN_GRP_NM_DLM',
	':',
	'en_US',
	'Button group name separator' ,
	'Button group name separator');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STR' AND C_KEY = 'PRNT_CHK_TRUE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STR',
	'PRNT_CHK_TRUE',
	'T',
	'en_US',
	'Y' ,
	'Characters that indicates check on in report');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STR' AND C_KEY = 'PRNT_CHK_FALSE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STR',
	'PRNT_CHK_FALSE',
	'F',
	'en_US',
	'N' ,
	'Characters that indicates check off in report');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STR' AND C_KEY = 'PRNT_NOTE_MARK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STR',
	'PRNT_NOTE_MARK',
	'NOTE_MARK',
	'en_US',
	'*' ,
	'Characters to be displayed in reports for alerting');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STR' AND C_KEY = 'PRNT_INC_TAX' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STR',
	'PRNT_INC_TAX',
	'1',
	'en_US',
	'Tax inclusive' ,
	'Characters that indicates tax inclusive in report');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STR' AND C_KEY = 'PRNT_INTERIM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STR',
	'PRNT_INTERIM',
	'1',
	'en_US',
	'Temporary' ,
	'Characters that indicates temporary unit price in report');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STR' AND C_KEY = 'MSG_FLG_ON' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STR',
	'MSG_FLG_ON',
	'T',
	'en_US',
	'On' ,
	'Character indicate flg. on in messages');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STR' AND C_KEY = 'MSG_FLG_OFF' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STR',
	'MSG_FLG_OFF',
	'F',
	'en_US',
	'Off' ,
	'Character indicate flg. off in messages');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STR' AND C_KEY = 'PRNT_SNO1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STR',
	'PRNT_SNO1',
	'sno1',
	'en_US',
	'SEIBAN No. 1' ,
	'String indicating label for SEIBAN No. 1 in the report \n*Use if required when renaming label of SEIBAN No. 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STR' AND C_KEY = 'PRNT_SNO2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STR',
	'PRNT_SNO2',
	'sno2',
	'en_US',
	'SEIBAN No. 2' ,
	'String indicating label for SEIBAN No. 2 in the report \n*Use if required when renaming label of SEIBAN No. 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STR' AND C_KEY = 'PRNT_SNO3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STR',
	'PRNT_SNO3',
	'sno3',
	'en_US',
	'SEIBAN No. 3' ,
	'String indicating label for SEIBAN No. 3 in the report \n*Use if required when renaming label of SEIBAN No. 3');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STR' AND C_KEY = 'PRNT_SNO4' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STR',
	'PRNT_SNO4',
	'sno4',
	'en_US',
	'SEIBAN No. 4' ,
	'String indicating label for SEIBAN No. 4 in the report \n*Use if required when renaming label of SEIBAN No. 4');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STR' AND C_KEY = 'DISP_SNO_DLM1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STR',
	'DISP_SNO_DLM1',
	':',
	'en_US',
	'SEIBAN No. delimiter 1 for display' ,
	'Delimiter for indicating SEIBAN No. 1 and 2 in message dialog');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STR' AND C_KEY = 'DISP_SNO_DLM2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STR',
	'DISP_SNO_DLM2',
	':',
	'en_US',
	'SEIBAN No. delimiter 2 for display' ,
	'Delimiter for indicating SEIBAN No. 2 and 3 in message dialog');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STR' AND C_KEY = 'DISP_SNO_DLM3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STR',
	'DISP_SNO_DLM3',
	':',
	'en_US',
	'SEIBAN No. delimiter 3 for display' ,
	'Delimiter for indicating SEIBAN No. 3 and 4 in message dialog');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STR' AND C_KEY = 'DISP_SNO_PREFIX' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STR',
	'DISP_SNO_PREFIX',
	'sno',
	'en_US',
	'SEIBAN No.' ,
	'Prefix for indicating SEIBAN No. in message dialog');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STR' AND C_KEY = 'DISP_SNO1_PREFIX' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STR',
	'DISP_SNO1_PREFIX',
	'sno1',
	'en_US',
	'SEIBAN No. 1:' ,
	'Prefix for indicating SEIBAN No. 1 in message dialog');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STR' AND C_KEY = 'DISP_SNO2_PREFIX' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STR',
	'DISP_SNO2_PREFIX',
	'sno2',
	'en_US',
	'SEIBAN No. 2:' ,
	'Prefix for indicating SEIBAN No. 2 in message dialog');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STR' AND C_KEY = 'DISP_SNO3_PREFIX' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STR',
	'DISP_SNO3_PREFIX',
	'sno3',
	'en_US',
	'SEIBAN No. 3:' ,
	'Prefix for indicating SEIBAN No. 3 in message dialog');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STR' AND C_KEY = 'DISP_SNO4_PREFIX' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STR',
	'DISP_SNO4_PREFIX',
	'sno4',
	'en_US',
	'SEIBAN No. 4:' ,
	'Prefix for indicating SEIBAN No. 4 in message dialog');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STR' AND C_KEY = 'DISP_ITM_DLM1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STR',
	'DISP_ITM_DLM1',
	':',
	'en_US',
	'Item delimiter 1 for display' ,
	'Delimiter for indicating item cd. and branch No. 1 in message dialog');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STR' AND C_KEY = 'DISP_ITM_DLM2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STR',
	'DISP_ITM_DLM2',
	':',
	'en_US',
	'Item delimiter 2 for display' ,
	'Delimiter for indicating branch No. 1 and 2 in message dialog');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STR' AND C_KEY = 'DISP_ITM_DLM3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STR',
	'DISP_ITM_DLM3',
	':',
	'en_US',
	'Item delimiter 3 for display' ,
	'Delimiter for indicating branch No. 2 and 3 in message dialog');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STR' AND C_KEY = 'DISP_ITM_PREFIX' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STR',
	'DISP_ITM_PREFIX',
	'itm',
	'en_US',
	'Item' ,
	'Prefix when display item in message dialog');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_Y4M' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_Y4M',
	'en_US',
	'Constant for month' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_Y4M' AND C_KEY = 'NULL_VAL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_D, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_Y4M',
	'NULL_VAL',
	to_date('19000101000000','YYYYMMDDHH24MISS'),
	'en_US',
	'NULL character' ,
	'Characters that showing null value of month');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_RND_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_RND_TYP',
	'en_US',
	'Rounding type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RND_TYP' AND C_KEY = 'RNDUP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RND_TYP',
	'RNDUP',
	'1',
	'en_US',
	'Round up' ,
	'Round up');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RND_TYP' AND C_KEY = 'CUTOFF' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RND_TYP',
	'CUTOFF',
	'2',
	'en_US',
	'Round down' ,
	'Round down');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RND_TYP' AND C_KEY = 'RNDOFF' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RND_TYP',
	'RNDOFF',
	'3',
	'en_US',
	'Round off' ,
	'Round off');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_DATA_CRUD_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_DATA_CRUD_TYP',
	'en_US',
	'Data update type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DATA_CRUD_TYP' AND C_KEY = 'CRT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DATA_CRUD_TYP',
	'CRT',
	'1',
	'en_US',
	'New' ,
	'Indicate new record entry execution');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DATA_CRUD_TYP' AND C_KEY = 'UPD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DATA_CRUD_TYP',
	'UPD',
	'2',
	'en_US',
	'Update' ,
	'Indicate record update execution');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DATA_CRUD_TYP' AND C_KEY = 'DEL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DATA_CRUD_TYP',
	'DEL',
	'3',
	'en_US',
	'Delete' ,
	'Indicate record cancel execution');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_MST_SET_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_MST_SET_TYP',
	'en_US',
	'Master setting type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_SET_TYP' AND C_KEY = 'ALL_COM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_SET_TYP',
	'ALL_COM',
	'1',
	'en_US',
	'* common' ,
	'Master used in common for whole company');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_SET_TYP' AND C_KEY = 'COM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_SET_TYP',
	'COM',
	'2',
	'en_US',
	'By company' ,
	'Master used per company');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_SET_TYP' AND C_KEY = 'ALL_COM_COM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_SET_TYP',
	'ALL_COM_COM',
	'3',
	'en_US',
	'*Common / By company' ,
	'Master used in common / per company');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_MST_NM',
	'en_US',
	'Master name' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_CO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_CO',
	'CO',
	'en_US',
	'Company master' ,
	'Company master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_ITM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_ITM',
	'ITM',
	'en_US',
	'Item master' ,
	'Item master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_ITM_GRP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_ITM_GRP',
	'ITM_GRP',
	'en_US',
	'Item classification master' ,
	'Item classification master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_SLS_ITM_GRP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_SLS_ITM_GRP',
	'SLS_ITM_GRP',
	'en_US',
	'Sales item system master' ,
	'Sales item system master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_ITM_SUB' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_ITM_SUB',
	'ITM_SUB',
	'en_US',
	'Item auxiliary master' ,
	'Item auxiliary master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_ITM_TYP_D' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_ITM_TYP_D',
	'ITM_TYP_D',
	'en_US',
	'Item type details master' ,
	'Item type details master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_BP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_BP',
	'BP',
	'en_US',
	'BP master' ,
	'BP master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_BP_GRP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_BP_GRP',
	'BP_GRP',
	'en_US',
	'BP classification master' ,
	'BP classification master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_BP_SUB' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_BP_SUB',
	'BP_SUB',
	'en_US',
	'BP auxiliary master' ,
	'BP auxiliary master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_DPT_BASE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_DPT_BASE',
	'DPT_BASE',
	'en_US',
	'Dept. basic master' ,
	'Dept. basic master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_DPT_LVL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_DPT_LVL',
	'DPT_LVL',
	'en_US',
	'Dept. hierarchy master' ,
	'Dept. hierarchy master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_DPT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_DPT',
	'DPT',
	'en_US',
	'Dept. master' ,
	'Dept. master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_DPT_HIS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_DPT_HIS',
	'DPT_HIS',
	'en_US',
	'Organizational changes history master' ,
	'Organizational changes history master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_DPT_MAP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_DPT_MAP',
	'DPT_MAP',
	'en_US',
	'Dept. changes corresponding master' ,
	'Dept. changes corresponding master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_USR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_USR',
	'USR',
	'en_US',
	'PIC master' ,
	'PIC master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_LOC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_LOC',
	'LOC',
	'en_US',
	'Location master' ,
	'Location master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_STR_LN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_STR_LN',
	'STR_LN',
	'en_US',
	'Rack/line master' ,
	'Rack/line master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_LOC_SUB' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_LOC_SUB',
	'LOC_SUB',
	'en_US',
	'Location auxiliary master' ,
	'Location auxiliary master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_SPEC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_SPEC',
	'SPEC',
	'en_US',
	'Specification master' ,
	'Specification master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_SPEC_DESC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_SPEC_DESC',
	'SPEC_DESC',
	'en_US',
	'Specification detail master' ,
	'Specification detail master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_TERM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_TERM',
	'TERM',
	'en_US',
	'Term master' ,
	'Term master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_APRV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_APRV',
	'APRV',
	'en_US',
	'Approval info. master' ,
	'Approval info. master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_APRV_RT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_APRV_RT',
	'APRV_RT',
	'en_US',
	'Approval route master' ,
	'Approval route master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_DA' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_DA',
	'DA',
	'en_US',
	'Data access basic master' ,
	'DAC basic master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_DA_CTL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_DA_CTL',
	'DA_CTL',
	'en_US',
	'Data access control master' ,
	'DAC control master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_TAX' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_TAX',
	'TAX',
	'en_US',
	'Tax master' ,
	'Tax master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_CAL_BASE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_CAL_BASE',
	'CAL_BASE',
	'en_US',
	'Calendar basic master' ,
	'Calendar basic master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_CAL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_CAL',
	'CAL',
	'en_US',
	'Calendar master' ,
	'Calendar master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_CAL_EXT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_CAL_EXT',
	'CAL_EXT',
	'en_US',
	'Temporary calendar master' ,
	'Temporary calendar master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_CUR_XRATE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_CUR_XRATE',
	'CUR_XRATE',
	'en_US',
	'Exchange rate master' ,
	'Exchange rate master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_UNIT_CONV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_UNIT_CONV',
	'UNIT_CONV',
	'en_US',
	'Unit conversion master' ,
	'Unit conversion master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_HS_GRP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_HS_GRP',
	'HS_GRP',
	'en_US',
	'HS classification master' ,
	'HS classification master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_HS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_HS',
	'HS',
	'en_US',
	'HS master' ,
	'HS master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_EX_CTRL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_EX_CTRL',
	'EX_CTRL',
	'en_US',
	'Export prohibition master' ,
	'Export prohibition master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_BIZ_RSN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_BIZ_RSN',
	'BIZ_RSN',
	'en_US',
	'Business reason master' ,
	'Business reason master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_SLS_ANLY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_SLS_ANLY',
	'SLS_ANLY',
	'en_US',
	'Sales analysis master' ,
	'Sales analysis master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_TTERM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_TTERM',
	'TTERM',
	'en_US',
	'Transaction terms master' ,
	'Transaction terms master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_PO_PRINT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_PO_PRINT',
	'PO_PRINT',
	'en_US',
	'Display PO sheet master' ,
	'Display PO sheet master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_BP_STOP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_BP_STOP',
	'BP_STOP',
	'en_US',
	'BP prohibit master' ,
	'BP prohibit master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_CRED_CTRL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_CRED_CTRL',
	'CRED_CTRL',
	'en_US',
	'Credit limit master' ,
	'Credit limit master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_ATTACH_INFO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_ATTACH_INFO',
	'ATTACH_INFO',
	'en_US',
	'Item additional info. master' ,
	'Item additional info. master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_ITM_UNIT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_ITM_UNIT',
	'ITM_UNIT',
	'en_US',
	'Item unit master' ,
	'Item unit master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_ITM_STOP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_ITM_STOP',
	'ITM_STOP',
	'en_US',
	'Item prohibit master' ,
	'Item prohibit master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_SPLN_ITM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_SPLN_ITM',
	'SPLN_ITM',
	'en_US',
	'Sales plan item master' ,
	'Sales plan item master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_STTL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_STTL',
	'STTL',
	'en_US',
	'Settlement method master' ,
	'Settlement method master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_AC_DPT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_AC_DPT',
	'AC_DPT',
	'en_US',
	'Accounting dept. master' ,
	'Accounting dept. master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_AC_SUBTYPEM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_AC_SUBTYPEM',
	'AC_SUBTYPEM',
	'en_US',
	'Spare account type master' ,
	'Spare account type master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_AC_TAX' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_AC_TAX',
	'AC_TAX',
	'en_US',
	'Accounting tax master' ,
	'Accounting tax master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_AC_TAX_MAP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_AC_TAX_MAP',
	'AC_TAX_MAP',
	'en_US',
	'Accounting tax mapping master' ,
	'Accounting tax mapping master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_ACCOUNT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_ACCOUNT',
	'ACCOUNT',
	'en_US',
	'Account master' ,
	'Account master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_SUB_ACCOUNT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_SUB_ACCOUNT',
	'SUB_ACCOUNT',
	'en_US',
	'Subsidiary account master' ,
	'Subsidiary account master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_AUTO_JNL_KEY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_AUTO_JNL_KEY',
	'AUTO_JNL_KEY',
	'en_US',
	'Auto-journal key master' ,
	'Auto-journal key master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_AUTO_JNL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_AUTO_JNL',
	'AUTO_JNL',
	'en_US',
	'Auto-journal master' ,
	'Auto-journal master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_NOTE_RSN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_NOTE_RSN',
	'NOTE_RSN',
	'en_US',
	'Note reason master' ,
	'Bill reason master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_COL_MAP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_COL_MAP',
	'COL_MAP',
	'en_US',
	'Aggregation column mapping master' ,
	'Aggregation column related master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_JNL_PTN_BASE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_JNL_PTN_BASE',
	'JNL_PTN_BASE',
	'en_US',
	'Auto-journal pattern basic master' ,
	'Auto-journal pattern basic master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_JNL_PTN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_JNL_PTN',
	'JNL_PTN',
	'en_US',
	'Auto-journal pattern master' ,
	'Auto-journal pattern master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_JNL_GRP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_JNL_GRP',
	'JNL_GRP',
	'en_US',
	'Journal group master' ,
	'Journal group master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_JNL_AC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_JNL_AC',
	'JNL_AC',
	'en_US',
	'Item journal account setting master' ,
	'Item journal account setting master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_BAC_AC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_BAC_AC',
	'BAC_AC',
	'en_US',
	'Bank account type setting master' ,
	'Bank account type setting master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_RSN_AC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_RSN_AC',
	'RSN_AC',
	'en_US',
	'Accounting reason account setting master' ,
	'Accounting reason account setting master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_SLIP_JNL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_SLIP_JNL',
	'SLIP_JNL',
	'en_US',
	'Accounting slip type journal master' ,
	'Accounting slip type journal master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_EXPNS_GRP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_EXPNS_GRP',
	'EXPNS_GRP',
	'en_US',
	'Cost element group master' ,
	'Cost element group master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_EXPNS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_EXPNS',
	'EXPNS',
	'en_US',
	'Cost element master' ,
	'Cost element master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_COST_MENU' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_COST_MENU',
	'COST_MENU',
	'en_US',
	'Cost menu master' ,
	'Cost menu master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_MENU_CONFIG' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_MENU_CONFIG',
	'MENU_CONFIG',
	'en_US',
	'Cost menu structure master' ,
	'Cost menu structure master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_ALC_AC_GRP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_ALC_AC_GRP',
	'ALC_AC_GRP',
	'en_US',
	'Allocation account group master' ,
	'Allocation account group master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_ALC_AC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_ALC_AC',
	'ALC_AC',
	'en_US',
	'Allocation account master' ,
	'Allocation account master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_COST_CTG' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_COST_CTG',
	'COST_CTG',
	'en_US',
	'Cost item category master' ,
	'Cost item category master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_CTG_CONFIG' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_CTG_CONFIG',
	'CTG_CONFIG',
	'en_US',
	'Cost item category structure master' ,
	'Cost item category structure master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_CTG_GRP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_CTG_GRP',
	'CTG_GRP',
	'en_US',
	'Cost item category group master' ,
	'Cost item category group master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_COST_DPT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_COST_DPT',
	'COST_DPT',
	'en_US',
	'Cost dept. master' ,
	'Cost dept. master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_DPT_CONFIG' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_DPT_CONFIG',
	'DPT_CONFIG',
	'en_US',
	'Cost dept. structure master' ,
	'Cost dept. structure master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_EXT_SYS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_EXT_SYS',
	'EXT_SYS',
	'en_US',
	'External system master' ,
	'External system master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_IF_PROTOCOL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_IF_PROTOCOL',
	'IF_PROTOCOL',
	'en_US',
	'IF communication rules master' ,
	'IF communication rules master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_IF_ADAPTER' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_IF_ADAPTER',
	'IF_ADAPTER',
	'en_US',
	'IF adapter master' ,
	'IF adapter master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_HTTP_HEADER' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_HTTP_HEADER',
	'HTTP_HEADER',
	'en_US',
	'HTTP header master' ,
	'HTTP header master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_EXT_SYS_USR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_EXT_SYS_USR',
	'EXT_SYS_USR',
	'en_US',
	'External system user master' ,
	'External system user master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_IF_CD_RULE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_IF_CD_RULE',
	'IF_CD_RULE',
	'en_US',
	'IF code rule master' ,
	'IF code rule master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_IF_X' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_IF_X',
	'IF_X',
	'en_US',
	'IF code conversion master' ,
	'IF code conversion master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_APRV_ROLE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_APRV_ROLE',
	'APRV_ROLE',
	'en_US',
	'Approval role master' ,
	'Approval role master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_CNTRY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_CNTRY',
	'CNTRY',
	'en_US',
	'Country master' ,
	'Country master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_AREA' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_AREA',
	'AREA',
	'en_US',
	'Region master' ,
	'Region master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_CUR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_CUR',
	'CUR',
	'en_US',
	'Currency master' ,
	'Currency master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_UNIT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_UNIT',
	'UNIT',
	'en_US',
	'Unit master' ,
	'Unit master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_BANK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_BANK',
	'BANK',
	'en_US',
	'Bank master' ,
	'Bank master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_BANK_BRANCH' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_BANK_BRANCH',
	'BANK_BRANCH',
	'en_US',
	'Bank branch master' ,
	'Bank branch master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_BANK_AC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_BANK_AC',
	'BANK_AC',
	'en_US',
	'Bank account master' ,
	'Bank account master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_XRATE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_XRATE',
	'XRATE',
	'en_US',
	'Exchange rate basic master' ,
	'Exchange rate basic master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_ITM_JNL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_ITM_JNL',
	'ITM_JNL',
	'en_US',
	'Item journal master' ,
	'Item journal master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_AC_ITM_GRP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_AC_ITM_GRP',
	'AC_ITM_GRP',
	'en_US',
	'Accounting item classification master' ,
	'Accounting item classification master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_AC_RSN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_AC_RSN',
	'AC_RSN',
	'en_US',
	'Accounting reason master' ,
	'Accounting reason master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_SITE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_SITE',
	'SITE',
	'en_US',
	'Factory/distribution warehouse master' ,
	'Factory/distribution warehouse master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_LOC_GRP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_LOC_GRP',
	'LOC_GRP',
	'en_US',
	'Mfg. location group master' ,
	'Mfg. location group master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_LG_GRP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_LG_GRP',
	'LG_GRP',
	'en_US',
	'Distribution group master' ,
	'Logistics group master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_ALLOC_GRP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_ALLOC_GRP',
	'ALLOC_GRP',
	'en_US',
	'Gross allocation location group master' ,
	'Gross allocation location group master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_WG' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_WG',
	'WG',
	'en_US',
	'WG master' ,
	'WG master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_OPER' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_OPER',
	'OPER',
	'en_US',
	'Operation master' ,
	'Operation master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_WK_COST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_WK_COST',
	'WK_COST',
	'en_US',
	'Work element master' ,
	'Work element master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_WK_RSN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_WK_RSN',
	'WK_RSN',
	'en_US',
	'Man-hour reason master' ,
	'Man-hour reason master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_WK_DAY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_WK_DAY',
	'WK_DAY',
	'en_US',
	'Work type master' ,
	'Work type master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_RSRC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_RSRC',
	'RSRC',
	'en_US',
	'Resource master' ,
	'Resource master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_PF_GRP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_PF_GRP',
	'PF_GRP',
	'en_US',
	'Purchase forecast group Master' ,
	'Purchase forecast group Master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_SLS_UPRI_GRP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_SLS_UPRI_GRP',
	'SLS_UPRI_GRP',
	'en_US',
	'Sales unit price classification master' ,
	'Sales unit price classification master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_SLS_UPRI_RANK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_SLS_UPRI_RANK',
	'SLS_UPRI_RANK',
	'en_US',
	'Sales unit price rank master' ,
	'Sales unit price rank master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_SETOFF_GRP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_SETOFF_GRP',
	'SETOFF_GRP',
	'en_US',
	'Offset group master' ,
	'Offset group master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_SHIP_VALID' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_SHIP_VALID',
	'SHIP_VALID',
	'en_US',
	'Shipping expiration date group master' ,
	'Shipping expiration date group master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_ITM_SHIP_GRP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_ITM_SHIP_GRP',
	'ITM_SHIP_GRP',
	'en_US',
	'Item shipping group master' ,
	'Item shipping group master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_TRNSPT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_TRNSPT',
	'TRNSPT',
	'en_US',
	'Transportation method master' ,
	'Transportation method master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_SHIP_TERM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_SHIP_TERM',
	'SHIP_TERM',
	'en_US',
	'Shipping conditions master' ,
	'Shipping conditions master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_SHIP_WK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_SHIP_WK',
	'SHIP_WK',
	'en_US',
	'Shipping operation master' ,
	'Shipping operation master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_EX_CNTNR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_EX_CNTNR',
	'EX_CNTNR',
	'en_US',
	'Export package container master' ,
	'Export package container master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_EXIM_PORT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_EXIM_PORT',
	'EXIM_PORT',
	'en_US',
	'Port master' ,
	'Port master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_STK_GD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_STK_GD',
	'STK_GD',
	'en_US',
	'Grading master' ,
	'Grading master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_TRD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_TRD',
	'TRD',
	'en_US',
	'Transaction master' ,
	'Biz transaction master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_SLIP_FORM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_SLIP_FORM',
	'SLIP_FORM',
	'en_US',
	'Slip report master' ,
	'Slip report master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_ITM_SPEC_GRP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_ITM_SPEC_GRP',
	'ITM_SPEC_GRP',
	'en_US',
	'Item specification classification master' ,
	'Item specification classification master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_ITM_COMP_GRP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_ITM_COMP_GRP',
	'ITM_COMP_GRP',
	'en_US',
	'Item configuration group master' ,
	'Item configuration group master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_JNL_ACT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_JNL_ACT',
	'JNL_ACT',
	'en_US',
	'Journalizing master' ,
	'Journal execution master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_ALC_PTN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_ALC_PTN',
	'ALC_PTN',
	'en_US',
	'Allocation pattern master' ,
	'Allocation pattern master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_ACT_PTN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_ACT_PTN',
	'ACT_PTN',
	'en_US',
	'Calculation run pattern master' ,
	'Calculation execute pattern master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_GP_ALC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_GP_ALC',
	'GP_ALC',
	'en_US',
	'General purpose allocation classification master' ,
	'General allocation classification master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_CALC_CTG' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_CALC_CTG',
	'CALC_CTG',
	'en_US',
	'Calculation category master' ,
	'Calculation category master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_RPT_PTN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_RPT_PTN',
	'RPT_PTN',
	'en_US',
	'Cost report pattern master' ,
	'Cost report pattern master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_CALC_PTN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_CALC_PTN',
	'CALC_PTN',
	'en_US',
	'Calculation pattern master' ,
	'Calculation pattern master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_COST_SLS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_COST_SLS',
	'COST_SLS',
	'en_US',
	'Cost sales classification master' ,
	'Cost sales classification master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_COST_IO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_COST_IO',
	'COST_IO',
	'en_US',
	'Custom T account master' ,
	'Custom T account master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_COST_IO_CONF' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_COST_IO_CONF',
	'COST_IO_CONF',
	'en_US',
	'Custom T account configuration master' ,
	'Custom T account configuration master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_COST_IO_COL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_COST_IO_COL',
	'COST_IO_COL',
	'en_US',
	'Custom T account column master' ,
	'Custom T account column master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_RPT_KEY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_RPT_KEY',
	'RPT_KEY',
	'en_US',
	'Cost report key master' ,
	'Cost report key master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_RPT_CONF' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_RPT_CONF',
	'RPT_CONF',
	'en_US',
	'Cost report structure master' ,
	'Cost report structure master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_RPT_ROW_SML' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_RPT_ROW_SML',
	'RPT_ROW_SML',
	'en_US',
	'Cost report row aggregated master' ,
	'Cost report row aggregated master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_PRE_ALC_PTN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_PRE_ALC_PTN',
	'PRE_ALC_PTN',
	'en_US',
	'Departmental alloc. pattern master' ,
	'Pre-allocation pattern master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_INSP_PTN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_INSP_PTN',
	'INSP_PTN',
	'en_US',
	'Inspection pattern master' ,
	'Inspection pattern master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_INSP_POINT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_INSP_POINT',
	'INSP_POINT',
	'en_US',
	'Inspection checkpoint master' ,
	'Inspection checkpoint master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_SHIP_WK_GRP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_SHIP_WK_GRP',
	'SHIP_WK_GRP',
	'en_US',
	'Shipping operation group master' ,
	'Shipping operation group master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_SET_GRP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_SET_GRP',
	'SET_GRP',
	'en_US',
	'Assortment group master' ,
	'Assortment group master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_MPS_GRP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_MPS_GRP',
	'MPS_GRP',
	'en_US',
	'MPS group master' ,
	'MPS group master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_CALC_GRP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_CALC_GRP',
	'CALC_GRP',
	'en_US',
	'Calculation group master' ,
	'Calculation group master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_ALC_COEF' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_ALC_COEF',
	'ALC_COEF',
	'en_US',
	'Allocation coefficient master' ,
	'Allocation coefficient master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_RPT_CMP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_RPT_CMP',
	'RPT_CMP',
	'en_US',
	'Cost report comparison master' ,
	'Cost report comparison master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_RPT_CMP_CONF' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_RPT_CMP_CONF',
	'RPT_CMP_CONF',
	'en_US',
	'Cost report comparison structure master' ,
	'Cost report comparison structure master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_STK_EVAL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_STK_EVAL',
	'STK_EVAL',
	'en_US',
	'Inventory revaluation master' ,
	'Inventory revaluation master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_PRE_ALC_RATE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_PRE_ALC_RATE',
	'PRE_ALC_RATE',
	'en_US',
	'Departmental alloc. basis master' ,
	'Pre-allocation basis master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_NUM_PTN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_NUM_PTN',
	'NUM_PTN',
	'en_US',
	'Numbering pattern master' ,
	'Numbering pattern master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_GP_GRP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_GP_GRP',
	'GP_GRP',
	'en_US',
	'General purpose classification master' ,
	'General classification master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_GP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_GP',
	'GP',
	'en_US',
	'General purpose master' ,
	'General master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_JNL_KEY_MAP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_JNL_KEY_MAP',
	'JNL_KEY_MAP',
	'en_US',
	'Journal key mapping master' ,
	'Journal key mapping master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_SITE_CO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_SITE_CO',
	'SITE_CO',
	'en_US',
	'Warehousing business master' ,
	'Warehousing business master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MST_NM' AND C_KEY = 'MAM_SCHD_PAY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MST_NM',
	'MAM_SCHD_PAY',
	'SCHD_PAY',
	'en_US',
	'Payment request account master' ,
	'Payment request account master');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_SEQ_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_SEQ_TYP',
	'en_US',
	'Sequence type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SEQ_TYP' AND C_KEY = 'SAME_TRAN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SEQ_TYP',
	'SAME_TRAN',
	'0',
	'en_US',
	'Counter table (Skipping in auto-numbering: no, Performance: low)' ,
	'Manage and acquire in counter table\n(Acquiring in same session will prevent skipping number, but waiting time for numbering would occur and significantly decreases its performance)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SEQ_TYP' AND C_KEY = 'ATNMS_TRAN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SEQ_TYP',
	'ATNMS_TRAN',
	'1',
	'en_US',
	'Counter table (Skipping in auto-numbering: yes, Performance: medium)' ,
	'Manage and acquire in counter table\n(Acquiring in another session will shorten waiting time, but skipping number risk would rise)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SEQ_TYP' AND C_KEY = 'ORA_SEQ' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SEQ_TYP',
	'ORA_SEQ',
	'2',
	'en_US',
	'Sequence (Skipping in auto-numbering: yes, Performance: high)' ,
	'Generate numbers with sequences. \n(Fastest numbering method, but some numbers may be skipped. Due to the cash function, numbers may be skipped when restarting the DB server. When migrating data, status of sequences must be migrated as well.)');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_DGT_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_DGT_TYP',
	'en_US',
	'Number of digits processing method' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DGT_TYP' AND C_KEY = 'CHAR_CNT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DGT_TYP',
	'CHAR_CNT',
	'A',
	'en_US',
	'Number of characters' ,
	'Use number of characters of fixed value columns specified in numbering pattern master as digits.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DGT_TYP' AND C_KEY = 'FIX_DGT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DGT_TYP',
	'FIX_DGT',
	'B',
	'en_US',
	'Fixed value' ,
	'Use the numbers defined by attribute fix_dgt in attribute type as the number of digits');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DGT_TYP' AND C_KEY = 'ELM_DGT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DGT_TYP',
	'ELM_DGT',
	'C',
	'en_US',
	'Setting digits' ,
	'Use specified digits in numbering pattern master.');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'en_US',
	'Element type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'FIX' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'FIX',
	'FIX',
	'en_US',
	'Fixed value' ,
	'Fixed value');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'SP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'SP',
	'SP',
	'en_US',
	'Space' ,
	'Space');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'YYYY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'YYYY',
	'YYYY',
	'en_US',
	'Year 4 digit' ,
	'Year 4 digit');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'YY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'YY',
	'YY',
	'en_US',
	'Year 2 digit' ,
	'Lower 2 digit of year');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'Y' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'Y',
	'Y',
	'en_US',
	'Year 1 digit' ,
	'Lower 1 digit of year');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'M' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'M',
	'MAC_',
	'en_US',
	'Month 1 digit (1-C)' ,
	'Numbers for January to September, Alphabets (A-C) for October to December');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'MA' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'MA',
	'MA',
	'en_US',
	'Month 1 digit (A-L)' ,
	'"A" to "L" alphabet start from "A" as "January"');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'MM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'MM',
	'MM',
	'en_US',
	'Month 2 digit' ,
	'Month 2 digit');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'DD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'DD',
	'DD',
	'en_US',
	'2 digit day' ,
	'2 digit day');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'STR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'STR',
	'STR',
	'en_US',
	'String' ,
	'String');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'STR2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'STR2',
	'STR2',
	'en_US',
	'String 2' ,
	'String 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'STR3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'STR3',
	'STR3',
	'en_US',
	'String 3' ,
	'String 3');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'NUM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'NUM',
	'NUM',
	'en_US',
	'Number' ,
	'Number');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'SEQ' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'SEQ',
	'SEQ',
	'en_US',
	'Sequence number' ,
	'Sequence number');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'ITM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'ITM',
	'ITM',
	'en_US',
	'Item cd.' ,
	'Item cd.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'ITM_SUB1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'ITM_SUB1',
	'ITM_SUB1',
	'en_US',
	'Branch No. 1' ,
	'Branch No. 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'ITM_SUB2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'ITM_SUB2',
	'ITM_SUB2',
	'en_US',
	'Branch No. 2' ,
	'Branch No. 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'ITM_SUB3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'ITM_SUB3',
	'ITM_SUB3',
	'en_US',
	'Branch No. 3' ,
	'Branch No. 3');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'LOC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'LOC',
	'LOC',
	'en_US',
	'Location cd.' ,
	'Location cd. \n(Use numbering id. if it''s specified for corresponding location cd. 1 )');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'DPT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'DPT',
	'DPT',
	'en_US',
	'Dept. cd.' ,
	'Dept. cd.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'CO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'CO',
	'CO',
	'en_US',
	'Company cd.' ,
	'Company cd.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'BP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'BP',
	'BP',
	'en_US',
	'BP cd.' ,
	'BP cd.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'WG' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'WG',
	'WG',
	'en_US',
	'WG cd.' ,
	'WG cd.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'TRD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'TRD',
	'TRD',
	'en_US',
	'Transaction cd.' ,
	'Transaction cd.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'SITE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'SITE',
	'SITE',
	'en_US',
	'Factory/distribution warehouse cd.' ,
	'Factory/distribution warehouse cd.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'LOT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'LOT',
	'LOT',
	'en_US',
	'Lot No.' ,
	'Lot No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'CHD_LOT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'CHD_LOT',
	'CHD_LOT',
	'en_US',
	'Child item lot No.' ,
	'Child item lot No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'CHD_SUBLOT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'CHD_SUBLOT',
	'CHD_SUBLOT',
	'en_US',
	'Child item sublot No.' ,
	'Child item sublot No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'BP_LOT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'BP_LOT',
	'BP_LOT',
	'en_US',
	'Vendor lot No.' ,
	'Vendor lot No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'SNO1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'SNO1',
	'SNO1',
	'en_US',
	'SEIBAN No. 1' ,
	'SEIBAN No. 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'SNO2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'SNO2',
	'SNO2',
	'en_US',
	'SEIBAN No. 2' ,
	'SEIBAN No. 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'SNO3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'SNO3',
	'SNO3',
	'en_US',
	'SEIBAN No. 3' ,
	'SEIBAN No. 3');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'SNO4' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'SNO4',
	'SNO4',
	'en_US',
	'SEIBAN No. 4' ,
	'SEIBAN No. 4');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'ITM_SITE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'ITM_SITE',
	'ITM_SITE',
	'en_US',
	'Item (Base/delivery warehouse)' ,
	'Numbering ID specified in item master (Factory/distribution warehouse) for item, factory, and distribution warehouse cd.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'ITM_GRP01' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'ITM_GRP01',
	'ITM_GRP01',
	'en_US',
	'Item classification 1' ,
	'Item type cd. 1 (Use numbering id. if it''s specified for the item type cd. 1)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'ITM_GRP02' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'ITM_GRP02',
	'ITM_GRP02',
	'en_US',
	'Item classification 2' ,
	'Item type cd. 2 (Use numbering id. if it''s specified for the item type cd. 2)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'ITM_GRP03' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'ITM_GRP03',
	'ITM_GRP03',
	'en_US',
	'Item classification 3' ,
	'Item type cd. 3 (Use numbering id. if it''s specified for the item type cd. 3)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'ITM_GRP04' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'ITM_GRP04',
	'ITM_GRP04',
	'en_US',
	'Item classification 4' ,
	'Item type cd. 4 (Use numbering id. if it''s specified for the item type cd. 4)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'ITM_GRP05' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'ITM_GRP05',
	'ITM_GRP05',
	'en_US',
	'Item classification 5' ,
	'Item type cd. 5 (Use numbering id. if it''s specified for the item type cd. 5)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'ITM_GRP06' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'ITM_GRP06',
	'ITM_GRP06',
	'en_US',
	'Item classification 6' ,
	'Item type cd. 6 (Use numbering id. if it''s specified for the item type cd. 6)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'ITM_GRP07' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'ITM_GRP07',
	'ITM_GRP07',
	'en_US',
	'Item classification 7' ,
	'Item type cd. 7 (Use numbering id. if it''s specified for the item type cd. 7)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'ITM_GRP08' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'ITM_GRP08',
	'ITM_GRP08',
	'en_US',
	'Item classification 8' ,
	'Item type cd. 8 (Use numbering id. if it''s specified for the item type cd. 8)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'ITM_GRP09' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'ITM_GRP09',
	'ITM_GRP09',
	'en_US',
	'Item classification 9' ,
	'Item type cd. 9 (Use numbering id. if it''s specified for the item type cd. 9)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'ITM_GRP10' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'ITM_GRP10',
	'ITM_GRP10',
	'en_US',
	'Item classification 10' ,
	'Item type cd. 10 (Use numbering id. if it''s specified for the item type cd. 10)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'BP_GRP01' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'BP_GRP01',
	'BP_GRP01',
	'en_US',
	'BP classification 1' ,
	'BP classification cd. 1 (Use numbering id. if it''s specified to target BP classification cd. 1)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'BP_GRP02' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'BP_GRP02',
	'BP_GRP02',
	'en_US',
	'BP classification 2' ,
	'BP classification cd. 2 (Use numbering id. if it''s specified to target BP classification cd. 2)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'BP_GRP03' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'BP_GRP03',
	'BP_GRP03',
	'en_US',
	'BP classification 3' ,
	'BP classification cd. 3 (Use numbering id. if it''s specified to target BP classification cd. 3)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'BP_GRP04' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'BP_GRP04',
	'BP_GRP04',
	'en_US',
	'BP classification 4' ,
	'BP classification cd. 4 (Use numbering id. if it''s specified to target BP classification cd. 4)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'BP_GRP05' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'BP_GRP05',
	'BP_GRP05',
	'en_US',
	'BP classification 5' ,
	'BP classification cd. 5 (Use numbering id. if it''s specified to target BP classification cd. 5)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'BP_GRP06' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'BP_GRP06',
	'BP_GRP06',
	'en_US',
	'BP classification 6' ,
	'BP classification cd. 6 (Use numbering id. if it''s specified to target BP classification cd. 6)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'BP_GRP07' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'BP_GRP07',
	'BP_GRP07',
	'en_US',
	'BP classification 7' ,
	'BP classification cd. 7 (Use numbering id. if it''s specified to target BP classification cd. 7)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'BP_GRP08' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'BP_GRP08',
	'BP_GRP08',
	'en_US',
	'BP classification 8' ,
	'BP classification cd. 8 (Use numbering id. if it''s specified to target BP classification cd. 8)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'BP_GRP09' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'BP_GRP09',
	'BP_GRP09',
	'en_US',
	'BP classification 9' ,
	'BP classification cd. 9 (Use numbering id. if it''s specified to target BP classification cd. 9)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ELM_TYP' AND C_KEY = 'BP_GRP10' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ELM_TYP',
	'BP_GRP10',
	'BP_GRP10',
	'en_US',
	'BP classification 10' ,
	'BP classification cd. 10 (Use numbering id. if it''s specified to target BP classification cd. 10)');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'en_US',
	'Numbering operation type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'LOT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'LOT',
	'LOT',
	'en_US',
	'Lot No.' ,
	'Lot No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'SUBLOT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'SUBLOT',
	'SUBLOT',
	'en_US',
	'Sublot No.' ,
	'Sublot No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'SNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'SNO',
	'SNO',
	'en_US',
	'SEIBAN No.' ,
	'SEIBAN No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'APRV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'APRV',
	'APRV',
	'en_US',
	'Approval No.' ,
	'Approval No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'APRVAPL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'APRVAPL',
	'APRVAPL',
	'en_US',
	'Approval application No.' ,
	'Approval application No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'ITMINST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'ITMINST',
	'ITMINST',
	'en_US',
	'Item mfg. order No.' ,
	'Item mfg. order No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'MFGINST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'MFGINST',
	'MFGINST',
	'en_US',
	'Mfg. order No.' ,
	'Mfg. order No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'MFGACT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'MFGACT',
	'MFGACT',
	'en_US',
	'Mfg. result No.' ,
	'Mfg. result No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'CSTFRCST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'CSTFRCST',
	'CSTFRCST',
	'en_US',
	'Sales forecast No.' ,
	'Customer period forecast No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'PFRPT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'PFRPT',
	'PFRPT',
	'en_US',
	'Forecast list No.' ,
	'Forecast list No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'SIMMRP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'SIMMRP',
	'SIMMRP',
	'en_US',
	'Simulation No.' ,
	'Simulation No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'MRPCLC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'MRPCLC',
	'MRPCLC',
	'en_US',
	'MRP calculation No.' ,
	'MRP calculation No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'INSP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'INSP',
	'INSP',
	'en_US',
	'Inspection No.' ,
	'Inspection No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'INSPL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'INSPL',
	'INSPL',
	'en_US',
	'Inspection order list No.' ,
	'Inspection order list No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'PO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'PO',
	'PO',
	'en_US',
	'PO No.' ,
	'PO No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'POD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'POD',
	'POD',
	'en_US',
	'PO details No.' ,
	'PO details No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'DLVINST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'DLVINST',
	'DLVINST',
	'en_US',
	'Delivery order No.' ,
	'Delivery order No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'DLVINSTD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'DLVINSTD',
	'DLVINSTD',
	'en_US',
	'Delivery order details No.' ,
	'Delivery order details No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'PURCRETSCHD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'PURCRETSCHD',
	'PURCRETSCHD',
	'en_US',
	'Purchase return schedule No.' ,
	'Purchase return schedule No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'PURCRETACT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'PURCRETACT',
	'PURCRETACT',
	'en_US',
	'Purchase return result No.' ,
	'Purchase return result No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'PURCACT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'PURCACT',
	'PURCACT',
	'en_US',
	'Purchase result No.' ,
	'Purchase result No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'BILL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'BILL',
	'BILL',
	'en_US',
	'Invoice No.' ,
	'Invoice No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'RCV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'RCV',
	'RCV',
	'en_US',
	'Payment received No.' ,
	'Payment received No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'RCVACT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'RCVACT',
	'RCVACT',
	'en_US',
	'Payment received result No.' ,
	'Payment received result No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'QTN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'QTN',
	'QTN',
	'en_US',
	'Quotation No.' ,
	'Quotation No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'SLO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'SLO',
	'SLO',
	'en_US',
	'Sales order No.' ,
	'Sales order No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'SLOD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'SLOD',
	'SLOD',
	'en_US',
	'Sales order details No.' ,
	'Sales order details No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'WRK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'WRK',
	'WRK',
	'en_US',
	'Sales project No.' ,
	'Sales project No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'SLSRETSCHD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'SLSRETSCHD',
	'SLSRETSCHD',
	'en_US',
	'Sales return schedule No.' ,
	'Sales return schedule No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'SLSACT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'SLSACT',
	'SLSACT',
	'en_US',
	'Sales result No.' ,
	'Sales result No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'DLVSLIP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'DLVSLIP',
	'DLVSLIP',
	'en_US',
	'Delivery note No.' ,
	'Delivery note No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'IV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'IV',
	'IV',
	'en_US',
	'Invoice No.' ,
	'Invoice No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'SHIPINST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'SHIPINST',
	'SHIPINST',
	'en_US',
	'Shipping order No.' ,
	'Shipping order No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'SHIPINSTD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'SHIPINSTD',
	'SHIPINSTD',
	'en_US',
	'Shipping order details No.' ,
	'Shipping order details No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'SHIPACT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'SHIPACT',
	'SHIPACT',
	'en_US',
	'Shipping result No.' ,
	'Shipping result No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'ARRACT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'ARRACT',
	'ARRACT',
	'en_US',
	'Receipt result No.' ,
	'Receipt result No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'XFRSCHD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'XFRSCHD',
	'XFRSCHD',
	'en_US',
	'Movement/transport schedule No.' ,
	'Movement/transport schedule No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'XFRINST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'XFRINST',
	'XFRINST',
	'en_US',
	'Movement order No.' ,
	'Movement order No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'XFRINSTD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'XFRINSTD',
	'XFRINSTD',
	'en_US',
	'Movement order details No.' ,
	'Movement order details No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'XFRACT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'XFRACT',
	'XFRACT',
	'en_US',
	'Movement result No.' ,
	'Movement result No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'PROVACT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'PROVACT',
	'PROVACT',
	'en_US',
	'Supply result No.' ,
	'Supply result No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'DSPSL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'DSPSL',
	'DSPSL',
	'en_US',
	'Discard application No.' ,
	'Discard application No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'ACXACT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'ACXACT',
	'ACXACT',
	'en_US',
	'Other accounting transfer result No.' ,
	'Other accounting transfer result No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'ACXINST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'ACXINST',
	'ACXINST',
	'en_US',
	'Other accounting transfer order No.' ,
	'Other accounting transfer order No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'ACXSCHD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'ACXSCHD',
	'ACXSCHD',
	'en_US',
	'Other accounting transfer schedule No.' ,
	'Other accounting transfer schedule No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'STKXACT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'STKXACT',
	'STKXACT',
	'en_US',
	'Inventory transfer result No.' ,
	'Inventory transfer result No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'PAYCHK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'PAYCHK',
	'PAYCHK',
	'en_US',
	'Payment collation No.' ,
	'Payment collation No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'PAYACT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'PAYACT',
	'PAYACT',
	'en_US',
	'Payment result No.' ,
	'Payment result No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'ESBNUM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'ESBNUM',
	'ESBNUM',
	'en_US',
	'Dedicated No. for ESB (Numerical value)' ,
	'Dedicated No. for ESB (Numerical value)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'ESBSTR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'ESBSTR',
	'ESBSTR',
	'en_US',
	'Dedicated No. for ESB (String)' ,
	'Dedicated No. for ESB (String)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'SLOPRMSH' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'SLOPRMSH',
	'SLOPRMSH',
	'en_US',
	'Sales order promising header No.' ,
	'Sales order promising header No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_BIZ_TYP' AND C_KEY = 'SLOPRMS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_BIZ_TYP',
	'SLOPRMS',
	'SLOPRMS',
	'en_US',
	'Sales order promising No.' ,
	'Sales order promising No.');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'en_US',
	'Numbering system type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'BOM_KEY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'BOM_KEY',
	'MAS_BOM_KEY',
	'en_US',
	'BOM key' ,
	'BOM key');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'GP_BOM_KEY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'GP_BOM_KEY',
	'MAS_GP_BOM_KEY',
	'en_US',
	'General purpose BOM key' ,
	'General BOM key');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'BIZ_DAT_DL_HST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'BIZ_DAT_DL_HST',
	'MAS_BIZ_DAT_DL_HST',
	'en_US',
	'Business data download history No.' ,
	'Business data download history No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'BATCH_DATA' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'BATCH_DATA',
	'MAS_BATCH_DATA',
	'en_US',
	'Batch data No.' ,
	'Batch data No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'PUSH_NTC_NO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'PUSH_NTC_NO',
	'MAS_PUSH_NTC',
	'en_US',
	'Push Notifications No.' ,
	'Push Notifications No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'ATTACH_INFO_ID' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'ATTACH_INFO_ID',
	'MAS_ATTACH_INFO_ID',
	'en_US',
	'Additional info. ID' ,
	'Additional info. id.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'ESB_FILE_ID' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'ESB_FILE_ID',
	'MAS_ESB_FILE_ID',
	'en_US',
	'ESB file ID' ,
	'ESB file id.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'ESB_DATA_NO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'ESB_DATA_NO',
	'MAS_ESB_DATA_NO',
	'en_US',
	'ESB data No.' ,
	'ESB data No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'AC_COST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'AC_COST',
	'MBS_AC_COST',
	'en_US',
	'Data No. of accounting cost' ,
	'Data No. of accounting cost');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'AC_IO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'AC_IO',
	'MBS_AC_IO',
	'en_US',
	'Data No. of Accounting GR/GI' ,
	'Data No. of Accounting GR/GI');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'AC_STK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'AC_STK',
	'MBS_AC_STK',
	'en_US',
	'Data No. of Accounting inventory' ,
	'Data No. of Accounting inventory');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'AC_RCV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'AC_RCV',
	'MBS_AC_RCV',
	'en_US',
	'Data No. of accounting payment received' ,
	'Data No. of accounting payment received');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'AC_NOTE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'AC_NOTE',
	'MBS_AC_NOTE',
	'en_US',
	'Data No. of notes receivable' ,
	'Data No. of Accounting bill');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'JOURNAL_SND_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'JOURNAL_SND_IF_DATA_LNO',
	'MBS_JOURNAL_SND_IF_DATA_LNO',
	'en_US',
	'Data row No. of journal export IF' ,
	'Data row No. of journal IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'NOTE_SND_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'NOTE_SND_IF_DATA_LNO',
	'MBS_NOTE_SND_IF_DATA_LNO',
	'en_US',
	'Data row No. of notes export IF' ,
	'Data row No. of bill sending IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'BP_SND_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'BP_SND_IF_DATA_LNO',
	'MBS_BP_SND_IF_DATA_LNO',
	'en_US',
	'Data row No. of BP master export IF' ,
	'Data row No. of BP master sending IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'ACCOUNT_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'ACCOUNT_IF_DATA_LNO',
	'MBS_ACCOUNT_IF_DATA_LNO',
	'en_US',
	'Data row No. of account master import IF' ,
	'Data row No. of account master receiving IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'SUB_ACCOUNT_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'SUB_ACCOUNT_IF_DATA_LNO',
	'MBS_SUB_ACCOUNT_IF_DATA_LNO',
	'en_US',
	'Data row No. of subsidiary account master import IF' ,
	'Data row No. of subsidiary account master receiving IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'AC_DPT_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'AC_DPT_IF_DATA_LNO',
	'MBS_AC_DPT_IF_DATA_LNO',
	'en_US',
	'Data row No. of accounting dept. master import IF' ,
	'Data row No. of accounting dept. master receiving IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'BANK_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'BANK_IF_DATA_LNO',
	'MBS_BANK_IF_DATA_LNO',
	'en_US',
	'Data row No. of bank master import IF' ,
	'Data row No. of bank master receiving IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'BANK_BRANCH_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'BANK_BRANCH_IF_DATA_LNO',
	'MBS_BANK_BRANCH_IF_DATA_LNO',
	'en_US',
	'Data row No. of bank branch master import IF' ,
	'Data row No. of bank branch master receiving IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'BANK_AC_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'BANK_AC_IF_DATA_LNO',
	'MBS_BANK_AC_IF_DATA_LNO',
	'en_US',
	'Data row No. of bank account master import IF' ,
	'Data row No. of bank account master receiving IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'CUR_XRATE_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'CUR_XRATE_IF_DATA_LNO',
	'MBS_CUR_XRATE_IF_DATA_LNO',
	'en_US',
	'Data row No. of exchange rate master import IF' ,
	'Data row No. of exchange rate master receiving IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'AC_TAX_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'AC_TAX_IF_DATA_LNO',
	'MBS_AC_TAX_IF_DATA_LNO',
	'en_US',
	'Data row No. of accounting tax master import IF' ,
	'Data row No. of accounting tax master receiving IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'BAC_AC_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'BAC_AC_IF_DATA_LNO',
	'MBS_BAC_AC_IF_DATA_LNO',
	'en_US',
	'Data row No. of bank account type setting master import IF' ,
	'Data row No. of bank account type setting master receiving IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'AC_PAY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'AC_PAY',
	'MBS_AC_PAY',
	'en_US',
	'Data No. of accounting payment' ,
	'Data No. of accounting payment');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'AC_SCHD_PAY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'AC_SCHD_PAY',
	'MBS_AC_SCHD_PAY',
	'en_US',
	'Data No. of accounting payment request' ,
	'Data No. of accounting payment request');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'SCHD_PAY_SND_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'SCHD_PAY_SND_IF_DATA_LNO',
	'MBS_SCHD_PAY_SND_IF_DATA_LNO',
	'en_US',
	'Data row No. of payment request export IF' ,
	'Data row No. of payment request export IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'BP_SND_IF_EXT_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'BP_SND_IF_EXT_DATA_LNO',
	'MBS_BP_SND_IF_EXT_DATA_LNO',
	'en_US',
	'Data row No. of BP master export IF (External system linkage)' ,
	'Data row No. of BP master export IF (external system linkage)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'ITM_SND_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'ITM_SND_IF_DATA_LNO',
	'MBS_ITM_SND_IF_DATA_LNO',
	'en_US',
	'Data row No. of item master export IF' ,
	'Data row No. of item master export');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'BP_STOP_SND_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'BP_STOP_SND_IF_DATA_LNO',
	'MBS_BP_STOP_SND_IF_DATA_LNO',
	'en_US',
	'Data row No. of BP prohibition master export IF' ,
	'Data row No. of BP prohibition master export');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'ITM_STOP_SND_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'ITM_STOP_SND_IF_DATA_LNO',
	'MBS_ITM_STOP_SND_IF_DATA_LNO',
	'en_US',
	'Data row No. of item prohibition master export IF' ,
	'Data row No. of item prohibition master export');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'EX_CTRL_SND_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'EX_CTRL_SND_IF_DATA_LNO',
	'MBS_EX_CTRL_SND_IF_DATA_LNO',
	'en_US',
	'Data row No. of export prohibition master export IF' ,
	'Data row No. of export prohibition master export');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'MST_SND_IF_DATA_NO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'MST_SND_IF_DATA_NO',
	'MAS_MST_SND_IF_DATA_NO',
	'en_US',
	'Data No. of master export IF' ,
	'Data No. of master export IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'SLS_SLIP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'SLS_SLIP',
	'MBS_SLS_SLIP',
	'en_US',
	'Sales slip No.' ,
	'Sales slip No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'PURC_SLIP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'PURC_SLIP',
	'MBS_PURC_SLIP',
	'en_US',
	'Purchase slip No.' ,
	'Purchase slip No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'SLS_SLIP_SND_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'SLS_SLIP_SND_IF_DATA_LNO',
	'MBS_SLS_SLIP_SND_IF_DATA_LNO',
	'en_US',
	'Data row No. of sales slip export IF' ,
	'Data row No. of sales slip export IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'PURC_SLIP_SND_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'PURC_SLIP_SND_IF_DATA_LNO',
	'MBS_PURC_SLIP_SND_IF_DATA_LNO',
	'en_US',
	'Data row No. of purchase slip export IF' ,
	'Data row No. of purchase slip export IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'PURC_UPRI_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'PURC_UPRI_IF_DATA_LNO',
	'MBS_PURC_UPRI_IF_DATA_LNO',
	'en_US',
	'Data row No. of purchase unit price master import IF' ,
	'Data row No. of purchase unit price master import IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'PROC_UPRI_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'PROC_UPRI_IF_DATA_LNO',
	'MBS_PROC_UPRI_IF_DATA_LNO',
	'en_US',
	'Data row No. of subcontracting unit price master import IF' ,
	'Data row No. of subcontracting unit price master import IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'BP_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'BP_IF_DATA_LNO',
	'MBS_BP_IF_DATA_LNO',
	'en_US',
	'Data row No. of BP master import IF' ,
	'Data row No. of BP master import IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'ATTACHMENT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'ATTACHMENT',
	'MBS_ATTACHMENT',
	'en_US',
	'Report management ID of attachment file info.' ,
	'Report management ID of attachment file info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_SYS_TYP' AND C_KEY = 'FILENM_SEQ' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_SYS_TYP',
	'FILENM_SEQ',
	'MBS_FILENM_SEQ',
	'en_US',
	'Sequence number for report name' ,
	'Sequence number for report name');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_NUM_PROC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_NUM_PROC',
	'en_US',
	'Constant for numbering process' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_PROC' AND C_KEY = 'SEQ_MIN_VAL_DEF' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_PROC',
	'SEQ_MIN_VAL_DEF',
	'0',
	'en_US',
	'Default value (Min. value)' ,
	'Default of sequence min.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_PROC' AND C_KEY = 'SEQ_MAX_VAL_DEF' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_PROC',
	'SEQ_MAX_VAL_DEF',
	'99999999999999999999',
	'en_US',
	'Default value (Max. value)' ,
	'Default of sequence max.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_PROC' AND C_KEY = 'SEQ_INC_DEF' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_PROC',
	'SEQ_INC_DEF',
	'1',
	'en_US',
	'Default value (increment)' ,
	'Default of sequence increase');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_PROC' AND C_KEY = 'SEQ_CYCL_FLG_DEF' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_PROC',
	'SEQ_CYCL_FLG_DEF',
	'0',
	'en_US',
	'Default of allow auto-reset flg.' ,
	'Initial value for controlling flg. either counter value can be re-numbered from initial after sequence took a round.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_PROC' AND C_KEY = 'LAST_VAL_DEF' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_PROC',
	'LAST_VAL_DEF',
	'0',
	'en_US',
	'Initial value of current value' ,
	'Default for current sequence value\n*Specify in numbers. Value set here +1 will be the first value.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_PROC' AND C_KEY = 'ORA_SEQ_OPT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_PROC',
	'ORA_SEQ_OPT',
	'NOCACHE',
	'en_US',
	'String for specifying sequence option' ,
	'String for specifying sequence option used in creating sequences');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_PROC' AND C_KEY = 'PAD_STR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_PROC',
	'PAD_STR',
	'X',
	'en_US',
	'Filling character (For string)' ,
	'A character that fills in blank space of the character string in the numbering process.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_PROC' AND C_KEY = 'PAD_NUM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_PROC',
	'PAD_NUM',
	'0',
	'en_US',
	'Filling character (For number)' ,
	'A character that fills in blank spaces of numbers in numbering process.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_PROC' AND C_KEY = 'MFG_CHD_LOT_NO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_PROC',
	'MFG_CHD_LOT_NO',
	'MFG_CHD_LOT_NO',
	'en_US',
	'Copy-from child item lot No.' ,
	'Use for check process of mfg. lot numbering');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_PROC' AND C_KEY = 'MFG_CHD_SUBLOT_NO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_PROC',
	'MFG_CHD_SUBLOT_NO',
	'MFG_CHD_SUBLOT_NO',
	'en_US',
	'Copy-from child item sublot No.' ,
	'Use for check process of mfg. lot numbering');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_NUM_PROC' AND C_KEY = 'MFG_YIELD_SCHD_DT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_NUM_PROC',
	'MFG_YIELD_SCHD_DT',
	'MFG_YIELD_SCHD_DT',
	'en_US',
	'Scheduled output date' ,
	'Use for check process of mfg. lot numbering');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'en_US',
	'IF process type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PO_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PO_SEND',
	'A0010',
	'en_US',
	'Export PO info.' ,
	'Export PO info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PO_PRMS_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PO_PRMS_RECV',
	'A0020',
	'en_US',
	'Import order promising info.' ,
	'Import order promising info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'SHIP_ACT_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'SHIP_ACT_RECV',
	'A0030',
	'en_US',
	'Import shipping result info.' ,
	'Import shipping result info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'ACCPT_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'ACCPT_SEND',
	'A0040',
	'en_US',
	'Export acceptance info.' ,
	'Export acceptance info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'DLV_INST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'DLV_INST_SEND',
	'A0050',
	'en_US',
	'Export delivery order info.' ,
	'Export delivery order info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BILL_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BILL_RECV',
	'A0100',
	'en_US',
	'Import billing info.' ,
	'Import billing info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'SLO_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'SLO_RECV',
	'B0010',
	'en_US',
	'Import sales order info.' ,
	'Import sales order info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'SLO_PRMS_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'SLO_PRMS_SEND',
	'B0020',
	'en_US',
	'Export order promising info.' ,
	'Export order promising info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'SHIP_ACT_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'SHIP_ACT_SEND',
	'B0030',
	'en_US',
	'Export shipping result info.' ,
	'Export shipping result info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'ACCPT_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'ACCPT_RECV',
	'B0040',
	'en_US',
	'Import acceptance info.' ,
	'Import acceptance info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'DLV_INST_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'DLV_INST_RECV',
	'B0050',
	'en_US',
	'Import delivery order info.' ,
	'Import delivery order info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BILL_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BILL_SEND',
	'B0100',
	'en_US',
	'Export billing info.' ,
	'Export billing info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_CHNG_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_CHNG_RECV',
	'C0010',
	'en_US',
	'Import PLM change info. details' ,
	'Import PLM change info. details');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_ITM_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_ITM_RECV',
	'C0020',
	'en_US',
	'Import PLM item' ,
	'Import PLM item');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_ITM_D_PURC_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_ITM_D_PURC_RECV',
	'C0030',
	'en_US',
	'Import PLM item details (Purchasing item)' ,
	'Import PLM item details (Purchasing item)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_ITM_D_PROD_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_ITM_D_PROD_RECV',
	'C0040',
	'en_US',
	'Import PLM item details (In-house item)' ,
	'Import PLM item details (In-house item)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_ITM_D_SBCN_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_ITM_D_SBCN_RECV',
	'C0050',
	'en_US',
	'Import PLM item details (Subcontracting item)' ,
	'Import PLM item details (Subcontracting item)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_ITM_D_RQST_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_ITM_D_RQST_RECV',
	'C0060',
	'en_US',
	'Import PLM item details (Other factory procurement item)' ,
	'Import PLM item details (Other factory procurement item)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_ITM_STRG_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_ITM_STRG_RECV',
	'C0070',
	'en_US',
	'Import PLM item storage' ,
	'Import PLM item storage');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_BOM_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_BOM_RECV',
	'C0080',
	'en_US',
	'Import PLM BOM' ,
	'Import PLM BOM');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_ITM_OPER_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_ITM_OPER_RECV',
	'C0090',
	'en_US',
	'Import PLM item operation' ,
	'Import PLM item operation');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_OPER_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_OPER_RECV',
	'C0100',
	'en_US',
	'Import PLM operation' ,
	'Import PLM operation');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_ITM_TMB_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_ITM_TMB_RECV',
	'C0110',
	'en_US',
	'Import PLM item thumbnail' ,
	'Import PLM item thumbnail');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_ITM_INSP_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_ITM_INSP_RECV',
	'C0120',
	'en_US',
	'Import PLM item inspection' ,
	'Import PLM item inspection');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_WK_COST_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_WK_COST_RECV',
	'C0130',
	'en_US',
	'Import PLM work element' ,
	'Import PLM work element');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_OPR_WK_CST_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_OPR_WK_CST_RECV',
	'C0140',
	'en_US',
	'Import PLM operation man-hour' ,
	'Import PLM operation man-hour');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_LOC_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_LOC_SEND',
	'C3010',
	'en_US',
	'Export PLM location master' ,
	'Export PLM location master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_BP_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_BP_SEND',
	'C3020',
	'en_US',
	'Export PLM BP master' ,
	'Export PLM BP master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_ITM_DTL_LT_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_ITM_DTL_LT_SEND',
	'C3030',
	'en_US',
	'Export PLM item details master lead time' ,
	'Export PLM item details master lead time');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_PURC_UPRI_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_PURC_UPRI_SEND',
	'C3040',
	'en_US',
	'Export PLM purchasing unit price master' ,
	'Export PLM purchasing unit price master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_PA_QTY_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_PA_QTY_SEND',
	'C3050',
	'en_US',
	'Export PLM plan result qty.' ,
	'Export PLM plan result qty.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_ITM_STOP_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_ITM_STOP_SEND',
	'C3060',
	'en_US',
	'Export PLM item prohibit master' ,
	'Export PLM item prohibit master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_MFG_COST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_MFG_COST_SEND',
	'C3070',
	'en_US',
	'Export PLM mfg. cost' ,
	'Export PLM mfg. cost');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_PURC_COST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_PURC_COST_SEND',
	'C3080',
	'en_US',
	'Export PLM purchasing cost' ,
	'Export PLM purchasing cost');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_MFG_STD_COST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_MFG_STD_COST_SEND',
	'C3090',
	'en_US',
	'Export PLM mfg. standard cost' ,
	'Export PLM mfg. standard cost');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_PURC_STD_COST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_PURC_STD_COST_SEND',
	'C3100',
	'en_US',
	'Export PLM purchasing standard cost' ,
	'Export PLM purchasing standard cost');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_WK_COST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_WK_COST_SEND',
	'C3110',
	'en_US',
	'Export PLM man-hour cost' ,
	'Export PLM man-hour cost');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_WK_STD_COST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_WK_STD_COST_SEND',
	'C3120',
	'en_US',
	'Export PLM man-hour standard cost' ,
	'Export PLM man-hour standard cost');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_MFG_YIELD_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_MFG_YIELD_SEND',
	'C3130',
	'en_US',
	'Export PLM mfg. yield' ,
	'Export PLM mfg. yield');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_CHNG_IN_IF_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_CHNG_IN_IF_RECV',
	'C4010',
	'en_US',
	'Import PLM change info. internal IF' ,
	'Import PLM change info. internal IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_ITM_DTL_IN_IF_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_ITM_DTL_IN_IF_RECV',
	'C4020',
	'en_US',
	'Import PLM item details internal IF' ,
	'Import PLM item details internal IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_BOM_IN_IF_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_BOM_IN_IF_RECV',
	'C4030',
	'en_US',
	'Import PLM BOM internal IF' ,
	'Import PLM BOM internal IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_ITM_OPER_IN_IF_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_ITM_OPER_IN_IF_RECV',
	'C4040',
	'en_US',
	'Import PLM item operation internal IF' ,
	'Import PLM item operation internal IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_OPER_IN_IF_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_OPER_IN_IF_RECV',
	'C4050',
	'en_US',
	'Import PLM operation internal IF' ,
	'Import PLM operation internal IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_ITM_IN_IF_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_ITM_IN_IF_RECV',
	'C4060',
	'en_US',
	'Import PLM item internal IF' ,
	'Import PLM item internal IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_ATTACH_INFO_IN_IF_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_ATTACH_INFO_IN_IF_RECV',
	'C4070',
	'en_US',
	'Import PLM item additional info. internal IF' ,
	'Import PLM item additional info. internal IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_ITM_INSP_P_IN_IF_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_ITM_INSP_P_IN_IF_RECV',
	'C4080',
	'en_US',
	'Import PLM item inspection pattern internal IF' ,
	'Import PLM item inspection pattern internal IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_ITM_STRG_IN_IF_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_ITM_STRG_IN_IF_RECV',
	'C4090',
	'en_US',
	'Import PLM storage internal IF' ,
	'Import PLM storage internal IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_ITM_WG_IN_IF_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_ITM_WG_IN_IF_RECV',
	'C4100',
	'en_US',
	'Import PLM item (WG) internal IF' ,
	'Import PLM item (WG) internal IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_ITM_SUB_IN_IF_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_ITM_SUB_IN_IF_RECV',
	'C4110',
	'en_US',
	'Import PLM item auxiliary internal IF' ,
	'Import PLM item auxiliary internal IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_ITM_UNIT_IN_IF_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_ITM_UNIT_IN_IF_RECV',
	'C4120',
	'en_US',
	'Import PLM item unit internal IF' ,
	'Import PLM item unit internal IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_ITM_NOT_FIX_IN_IF_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_ITM_NOT_FIX_IN_IF_RECV',
	'C4130',
	'en_US',
	'Import PLM item procurement disapproval internal IF' ,
	'Import PLM item procurement disapproval internal IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_ITM_INSP_IN_IF_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_ITM_INSP_IN_IF_RECV',
	'C4140',
	'en_US',
	'Import PLM item inspection internal IF' ,
	'Import PLM item inspection internal IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_WK_COST_IN_IF_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_WK_COST_IN_IF_RECV',
	'C4150',
	'en_US',
	'Import PLM work element internal IF' ,
	'Import PLM work element internal IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PLM_OPR_WK_CST_IN_IF_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PLM_OPR_WK_CST_IN_IF_RECV',
	'C4160',
	'en_US',
	'Import PLM operation man-hour internal IF' ,
	'Import PLM operation man-hour internal IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'AC_ACCOUNT_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'AC_ACCOUNT_RECV',
	'D1010',
	'en_US',
	'Import account master' ,
	'Import account master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'AC_SUB_ACCOUNT_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'AC_SUB_ACCOUNT_RECV',
	'D1020',
	'en_US',
	'Import subsidiary account master' ,
	'Import subsidiary account master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'AC_AC_DPT_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'AC_AC_DPT_RECV',
	'D1030',
	'en_US',
	'Import account dept. master' ,
	'Import account dept. master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'AC_BANK_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'AC_BANK_RECV',
	'D1040',
	'en_US',
	'Import bank master' ,
	'Import bank master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'AC_BANK_BRANCH_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'AC_BANK_BRANCH_RECV',
	'D1050',
	'en_US',
	'Import bank branch master' ,
	'Import bank branch master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'AC_BANK_AC_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'AC_BANK_AC_RECV',
	'D1060',
	'en_US',
	'Import account master' ,
	'Import account master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'AC_CUR_XRATE_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'AC_CUR_XRATE_RECV',
	'D1070',
	'en_US',
	'Import exchange rate master' ,
	'Import exchange rate master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'AC_AC_TAX_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'AC_AC_TAX_RECV',
	'D1080',
	'en_US',
	'Import account tax master' ,
	'Import account tax master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'AC_BAC_AC_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'AC_BAC_AC_RECV',
	'D1090',
	'en_US',
	'Import Bank account type setting master' ,
	'Import Bank account type setting master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'AC_JOURNAL_GL_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'AC_JOURNAL_GL_SEND',
	'D2010',
	'en_US',
	'Export journal info. (GL)' ,
	'Export journal info. (GL)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'AC_JOURNAL_AP_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'AC_JOURNAL_AP_SEND',
	'D2020',
	'en_US',
	'Export journal info. (AP)' ,
	'Export journal info. (AP)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'AC_JOURNAL_AR_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'AC_JOURNAL_AR_SEND',
	'D2030',
	'en_US',
	'Export journal info. (AR)' ,
	'Export journal info. (AR)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'AC_NOTE_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'AC_NOTE_SEND',
	'D2040',
	'en_US',
	'Export notes info.' ,
	'Export notes info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'AC_BP_CST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'AC_BP_CST_SEND',
	'D2050',
	'en_US',
	'Export BP master (Customer)' ,
	'Export BP master (Customer)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'AC_BP_SPPL_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'AC_BP_SPPL_SEND',
	'D2060',
	'en_US',
	'Export BP master (Supplier)' ,
	'Export BP master (Supplier)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'AC_SCHD_PAY_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'AC_SCHD_PAY_SEND',
	'D2070',
	'en_US',
	'Export payment request' ,
	'Export payment request');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'AC_SLS_SLIP_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'AC_SLS_SLIP_SEND',
	'D2080',
	'en_US',
	'Export sales slip' ,
	'Export sales slip');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'AC_PURC_SLIP_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'AC_PURC_SLIP_SEND',
	'D2090',
	'en_US',
	'Export purchase slip' ,
	'Export purchase slip');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'AC_PLN_ALC_AMT_RCV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'AC_PLN_ALC_AMT_RCV',
	'D3010',
	'en_US',
	'Import allocable expenses plan IF' ,
	'Import allocable expenses plan IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'AC_ACT_ALC_AMT_RCV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'AC_ACT_ALC_AMT_RCV',
	'D3020',
	'en_US',
	'Import allocable expenses result IF' ,
	'Import allocable expenses result IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'SCM_ACT_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'SCM_ACT_RECV',
	'E0000',
	'en_US',
	'Import SCM result' ,
	'Import SCM result');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'WMS_SHIP_INST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'WMS_SHIP_INST_SEND',
	'E0010',
	'en_US',
	'Export shipping order' ,
	'Export shipping order');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'WMS_SHIP_ACT_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'WMS_SHIP_ACT_RECV',
	'E0020',
	'en_US',
	'Import  shipping result' ,
	'Import  shipping result');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'WMS_ARR_SCHD_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'WMS_ARR_SCHD_SEND',
	'E0030',
	'en_US',
	'Export receipt schedule' ,
	'Export receipt schedule');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'WMS_ARR_ACT_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'WMS_ARR_ACT_RECV',
	'E0040',
	'en_US',
	'Import receipt result' ,
	'Import receipt result');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'WMS_XFR_INST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'WMS_XFR_INST_SEND',
	'E0050',
	'en_US',
	'Export movement order' ,
	'Export movement order');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'WMS_XFR_ACT_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'WMS_XFR_ACT_RECV',
	'E0060',
	'en_US',
	'Import movement result' ,
	'Import movement result');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'WMS_ACXFR_ACT_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'WMS_ACXFR_ACT_RECV',
	'E0070',
	'en_US',
	'Other accouting transfer result import' ,
	'Other accounting transfer result import');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'MES_YIELD_SCHD_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'MES_YIELD_SCHD_SEND',
	'F1010',
	'en_US',
	'Export output schedule' ,
	'Export output schedule');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'MES_YIELD_ACT_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'MES_YIELD_ACT_RECV',
	'F1020',
	'en_US',
	'Import output result' ,
	'Import output result');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'MES_OPER_INST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'MES_OPER_INST_SEND',
	'F1030',
	'en_US',
	'Export operation order' ,
	'Export operation order');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'MES_OPER_ACT_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'MES_OPER_ACT_RECV',
	'F1040',
	'en_US',
	'Import operation result' ,
	'Import operation result');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'MES_INPT_SCHD_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'MES_INPT_SCHD_SEND',
	'F1050',
	'en_US',
	'Export input schedule' ,
	'Export input schedule');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'MES_INPT_ACT_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'MES_INPT_ACT_RECV',
	'F1060',
	'en_US',
	'Import input result' ,
	'Import input result');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'MES_WK_ACT_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'MES_WK_ACT_RECV',
	'F1070',
	'en_US',
	'Import man-hour result' ,
	'Import man-hour result');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'MES_WK_SCHD_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'MES_WK_SCHD_SEND',
	'F1080',
	'en_US',
	'Export man-hour schedule' ,
	'Export man-hour schedule');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'MES_ORDER_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'MES_ORDER_RECV',
	'F2010',
	'en_US',
	'Import order' ,
	'Import order');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'MES_ORDER_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'MES_ORDER_SEND',
	'F2020',
	'en_US',
	'Export order' ,
	'Export order');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'MES_ORDER_SEND_ITM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'MES_ORDER_SEND_ITM',
	'F2030',
	'en_US',
	'Item master for order export' ,
	'Item master for order export');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'MES_ORDER_SEND_ITM_OPER' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'MES_ORDER_SEND_ITM_OPER',
	'F2040',
	'en_US',
	'Item operation master for order export' ,
	'Item operation master for order export');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'MES_ORDER_SEND_ITM_DTL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'MES_ORDER_SEND_ITM_DTL',
	'F2050',
	'en_US',
	'Item details master for order export' ,
	'Item details master for order export');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'MES_ORDER_SEND_BOM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'MES_ORDER_SEND_BOM',
	'F2060',
	'en_US',
	'BOM master for order export' ,
	'BOM master for order export');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'MES_ORDER_SEND_LOC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'MES_ORDER_SEND_LOC',
	'F2070',
	'en_US',
	'Location master for order export' ,
	'Location master for order export');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'MES_ORDER_SEND_CAL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'MES_ORDER_SEND_CAL',
	'F2080',
	'en_US',
	'Work calendar master for order export' ,
	'Work calendar master for order export');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'MES_ORDER_SEND_CAL_EXT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'MES_ORDER_SEND_CAL_EXT',
	'F2090',
	'en_US',
	'Temporary calendar master for order export' ,
	'Temporary calendar master for order export');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'MES_ORDER_SEND_STK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'MES_ORDER_SEND_STK',
	'F2100',
	'en_US',
	'Inventory info. for order export' ,
	'Inventory info. for order export');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'MES_ORDER_SEND_GR_SCHD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'MES_ORDER_SEND_GR_SCHD',
	'F2110',
	'en_US',
	'GR schedule for order export' ,
	'GR schedule for order export');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'MES_ORDER_SEND_GI_SCHD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'MES_ORDER_SEND_GI_SCHD',
	'F2120',
	'en_US',
	'GI schedule for order export' ,
	'GI schedule for order export');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'MES_ORDER_SEND_DLY_DMND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'MES_ORDER_SEND_DLY_DMND',
	'F2130',
	'en_US',
	'Daily demand for order export' ,
	'Daily demand for order export');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'MES_ORDER_SEND_ITM_DTL_BOM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'MES_ORDER_SEND_ITM_DTL_BOM',
	'F2140',
	'en_US',
	'Item details BOM master for order export' ,
	'Item details BOM master for order export');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'MES_ORDER_SEND_ORD_LNK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'MES_ORDER_SEND_ORD_LNK',
	'F2150',
	'en_US',
	'Order allocation info. for order export' ,
	'Order allocation info. for order export');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'MES_ORDER_SEND_OPER' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'MES_ORDER_SEND_OPER',
	'F2160',
	'en_US',
	'Operation order result info. for order export' ,
	'Operation order result info. for order export');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'MES_ORDER_SEND_ACT_QTY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'MES_ORDER_SEND_ACT_QTY',
	'F2170',
	'en_US',
	'Result qty. for order export' ,
	'Result qty. for order export');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'MES_INSP_INST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'MES_INSP_INST_SEND',
	'F3010',
	'en_US',
	'Inspection order export' ,
	'Inspection order export');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'MES_INSP_ACT_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'MES_INSP_ACT_RECV',
	'F3020',
	'en_US',
	'Inspection result import' ,
	'Inspection result import');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'EXT_BP_CST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'EXT_BP_CST_SEND',
	'G0010',
	'en_US',
	'Export BP master (Customer)' ,
	'Export BP master (Customer)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'EXT_BP_DLV_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'EXT_BP_DLV_SEND',
	'G0020',
	'en_US',
	'Export BP master (Delivery destination)' ,
	'Export BP master (Delivery destination)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'EXT_BP_DEST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'EXT_BP_DEST_SEND',
	'G0030',
	'en_US',
	'Export BP master (Distribution channel)' ,
	'Export BP master (Distribution channel)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'EXT_BP_SPPL_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'EXT_BP_SPPL_SEND',
	'G0040',
	'en_US',
	'Export BP master (Supplier)' ,
	'Export BP master (Supplier)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'EXT_ITM_PROD_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'EXT_ITM_PROD_SEND',
	'G0110',
	'en_US',
	'Export item master (Product)' ,
	'Export item master (Product)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'EXT_ITM_OTHER_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'EXT_ITM_OTHER_SEND',
	'G0120',
	'en_US',
	'Export item master (Others)' ,
	'Export item master (Others)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'EXT_ITM_GOODS_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'EXT_ITM_GOODS_SEND',
	'G0130',
	'en_US',
	'Export item master (Goods)' ,
	'Export item master (Goods)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'EXT_ITM_WIP_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'EXT_ITM_WIP_SEND',
	'G0140',
	'en_US',
	'Export item master (WIP)' ,
	'Export item master (WIP)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'EXT_ITM_PARTS_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'EXT_ITM_PARTS_SEND',
	'G0150',
	'en_US',
	'Export item master (Parts)' ,
	'Export item master (Parts)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'EXT_ITM_MATE_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'EXT_ITM_MATE_SEND',
	'G0160',
	'en_US',
	'Export item master (Material)' ,
	'Export item master (Material)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'EXT_ITM_RAWMATE_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'EXT_ITM_RAWMATE_SEND',
	'G0170',
	'en_US',
	'Export item master (Raw material)' ,
	'Export item master (Raw material)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'EXT_BP_STOP_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'EXT_BP_STOP_SEND',
	'G0210',
	'en_US',
	'Export BP prohibition master' ,
	'Export BP prohibition master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'EXT_ITM_STOP_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'EXT_ITM_STOP_SEND',
	'G0220',
	'en_US',
	'Export item prohibition master' ,
	'Export item prohibition master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'EXT_EX_CTRL_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'EXT_EX_CTRL_SEND',
	'G0230',
	'en_US',
	'Export export prohibition master' ,
	'Export export prohibition master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'EXT_PURC_UPRI_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'EXT_PURC_UPRI_RECV',
	'G0240',
	'en_US',
	'Import purchase unit price master' ,
	'Import purchase unit price master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'EXT_PROC_UPRI_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'EXT_PROC_UPRI_RECV',
	'G0250',
	'en_US',
	'Import subcontracting unit price master' ,
	'Import subcontracting unit price master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'EXT_BP_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'EXT_BP_RECV',
	'G0260',
	'en_US',
	'Import BP master' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'RCV_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'RCV_RECV',
	'H0010',
	'en_US',
	'Import payment received info.' ,
	'Import payment received info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PO_RECV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PO_RECV',
	'H0110',
	'en_US',
	'Import PO' ,
	'Import PO');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'ACC_COST1_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'ACC_COST1_SEND',
	'J0010',
	'en_US',
	'Export cost calculation result 1' ,
	'Export cost calculation result 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'ACC_COST2_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'ACC_COST2_SEND',
	'J0020',
	'en_US',
	'Export cost calculation result 2' ,
	'Export cost calculation result 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'ACC_COST3_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'ACC_COST3_SEND',
	'J0030',
	'en_US',
	'Export cost calculation result 3' ,
	'Export cost calculation result 3');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'ACC_COST4_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'ACC_COST4_SEND',
	'J0040',
	'en_US',
	'Export cost calculation result 4' ,
	'Export cost calculation result 4');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'ACC_COST5_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'ACC_COST5_SEND',
	'J0050',
	'en_US',
	'Export cost calculation result 5' ,
	'Export cost calculation result 5');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'ACC_OPER_COST1_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'ACC_OPER_COST1_SEND',
	'J0060',
	'en_US',
	'Export operation cost calculation result 1' ,
	'Export operation cost calculation result 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'ACC_OPER_COST2_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'ACC_OPER_COST2_SEND',
	'J0070',
	'en_US',
	'Export operation cost calculation result 2' ,
	'Export operation cost calculation result 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'ACC_OPER_COST3_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'ACC_OPER_COST3_SEND',
	'J0080',
	'en_US',
	'Export operation cost calculation result 3' ,
	'Export operation cost calculation result 3');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'ACC_OPER_COST4_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'ACC_OPER_COST4_SEND',
	'J0090',
	'en_US',
	'Export operation cost calculation result 4' ,
	'Export operation cost calculation result 4');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'ACC_OPER_COST5_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'ACC_OPER_COST5_SEND',
	'J0100',
	'en_US',
	'Export operation cost calculation result 5' ,
	'Export operation cost calculation result 5');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'IO_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'IO_SEND',
	'J0110',
	'en_US',
	'Export T account' ,
	'Export T account');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'MLY_STK_DTL_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'MLY_STK_DTL_SEND',
	'J0210',
	'en_US',
	'Export ending inventory' ,
	'Export ending inventory');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'IO_ACT_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'IO_ACT_SEND',
	'J0220',
	'en_US',
	'Export GR/GI result' ,
	'Export GR/GI result');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'IO_SCHD_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'IO_SCHD_SEND',
	'J0230',
	'en_US',
	'Export GR/GI schedule' ,
	'Export GR/GI schedule');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'ITM_ORDER_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'ITM_ORDER_SEND',
	'J0240',
	'en_US',
	'Export item order info.' ,
	'Export item order info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'SHIP_PR_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'SHIP_PR_SEND',
	'J0250',
	'en_US',
	'Export shipping progress' ,
	'Export shipping progress');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'NON_MOV_STK_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'NON_MOV_STK_SEND',
	'J0260',
	'en_US',
	'Export non-moving inventory info.' ,
	'Export non-moving inventory info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'ARR_PR_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'ARR_PR_SEND',
	'J0270',
	'en_US',
	'Export receipt progress' ,
	'Export receipt progress');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'INSP_ACT_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'INSP_ACT_SEND',
	'J0280',
	'en_US',
	'Export inspection result' ,
	'Export inspection result');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_BP_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_BP_MST_SEND',
	'J0310',
	'en_US',
	'Export BP master' ,
	'Export BP master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_ITM_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_ITM_MST_SEND',
	'J0320',
	'en_US',
	'Export item master' ,
	'Export item master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_LOC_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_LOC_MST_SEND',
	'J0330',
	'en_US',
	'Export location master' ,
	'Export location master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_DPT_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_DPT_MST_SEND',
	'J0340',
	'en_US',
	'Export dept. master' ,
	'Export dept. master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_OPER_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_OPER_MST_SEND',
	'J0350',
	'en_US',
	'Export operation master' ,
	'Export operation master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_USR_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_USR_MST_SEND',
	'J0360',
	'en_US',
	'Export PIC master' ,
	'Export PIC master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_BIZ_RSN_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_BIZ_RSN_MST_SEND',
	'J0370',
	'en_US',
	'Export business reason master' ,
	'Export business reason master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_STR_LN_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_STR_LN_MST_SEND',
	'J0380',
	'en_US',
	'Export rack/line master' ,
	'Export rack/line master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_CUR_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_CUR_MST_SEND',
	'J0390',
	'en_US',
	'Export currency master' ,
	'Export currency master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_TERM_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_TERM_MST_SEND',
	'J0400',
	'en_US',
	'Export term master' ,
	'Export term master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_CALC_GRP_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_CALC_GRP_MST_SEND',
	'J0410',
	'en_US',
	'Export calculation group master' ,
	'Export calculation group master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_COST_DPT_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_COST_DPT_MST_SEND',
	'J0420',
	'en_US',
	'Export cost dept. master' ,
	'Export cost dept. master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_COST_SLS_MST1_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_COST_SLS_MST1_SEND',
	'J0430',
	'en_US',
	'Export cost sales classification master 1' ,
	'Export cost sales classification master 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_COST_SLS_MST2_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_COST_SLS_MST2_SEND',
	'J0440',
	'en_US',
	'Export cost sales classification master 2' ,
	'Export cost sales classification master 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_COST_SLS_MST3_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_COST_SLS_MST3_SEND',
	'J0450',
	'en_US',
	'Export cost sales classification master 3' ,
	'Export cost sales classification master 3');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_COST_SLS_MST4_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_COST_SLS_MST4_SEND',
	'J0460',
	'en_US',
	'Export cost sales classification master 4' ,
	'Export cost sales classification master 4');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_COST_SLS_MST5_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_COST_SLS_MST5_SEND',
	'J0470',
	'en_US',
	'Export cost sales classification master 5' ,
	'Export cost sales classification master 5');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_EXPNS_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_EXPNS_MST_SEND',
	'J0480',
	'en_US',
	'Export cost element master' ,
	'Export cost element master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_AC_RSN_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_AC_RSN_MST_SEND',
	'J0490',
	'en_US',
	'Export accounting reason master' ,
	'Export accounting reason master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_WG_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_WG_MST_SEND',
	'J0500',
	'en_US',
	'Export WG master' ,
	'Export WG master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_UNIT_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_UNIT_MST_SEND',
	'J0510',
	'en_US',
	'Export unit master' ,
	'Export unit master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_TAX_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_TAX_MST_SEND',
	'J0520',
	'en_US',
	'Export tax master' ,
	'Export tax master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_LG_GRP_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_LG_GRP_MST_SEND',
	'J0530',
	'en_US',
	'Export distribution group master' ,
	'Export distribution group master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'ACT_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'ACT_SEND',
	'J0600',
	'en_US',
	'Export cost result' ,
	'Export cost result');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'ACT_FXD_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'ACT_FXD_SEND',
	'J0610',
	'en_US',
	'Export cost result fixed cost' ,
	'Export cost result fixed cost');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'SIM_BDG_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'SIM_BDG_SEND',
	'J0620',
	'en_US',
	'Export sales budget simulation info.' ,
	'Export sales budget simulation info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'SIM_FXD_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'SIM_FXD_SEND',
	'J0630',
	'en_US',
	'Export fixed cost simulation info.' ,
	'Export fixed cost simulation info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_ALC_AC_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_ALC_AC_MST_SEND',
	'J0700',
	'en_US',
	'Export allocation account master' ,
	'Export allocation account master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_DPT_CONFIG_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_DPT_CONFIG_SEND',
	'J0710',
	'en_US',
	'Export cost dept. structure master' ,
	'Export cost dept. structure master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_BDG_SCENARIO_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_BDG_SCENARIO_SEND',
	'J0720',
	'en_US',
	'Export budget scenario' ,
	'Export budget scenario');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'ACC_CFP1_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'ACC_CFP1_SEND',
	'J1010',
	'en_US',
	'Export CFP calculation result 1' ,
	'Export CFP calculation result 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'ACC_CFP2_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'ACC_CFP2_SEND',
	'J1020',
	'en_US',
	'Export CFP calculation result 2' ,
	'Export CFP calculation result 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'ACC_CFP3_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'ACC_CFP3_SEND',
	'J1030',
	'en_US',
	'Export CFP calculation result 3' ,
	'Export CFP calculation result 3');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'ACC_CFP4_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'ACC_CFP4_SEND',
	'J1040',
	'en_US',
	'Export CFP calculation result 4' ,
	'Export CFP calculation result 4');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'ACC_CFP5_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'ACC_CFP5_SEND',
	'J1050',
	'en_US',
	'Export CFP calculation result 5' ,
	'Export CFP calculation result 5');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'ACC_OPER_CFP1_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'ACC_OPER_CFP1_SEND',
	'J1060',
	'en_US',
	'Export operation CFP calculation result 1' ,
	'Export operation CFP calculation result 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'ACC_OPER_CFP2_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'ACC_OPER_CFP2_SEND',
	'J1070',
	'en_US',
	'Export operation CFP calculation result 2' ,
	'Export operation CFP calculation result 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'ACC_OPER_CFP3_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'ACC_OPER_CFP3_SEND',
	'J1080',
	'en_US',
	'Export operation CFP calculation result 3' ,
	'Export operation CFP calculation result 3');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'ACC_OPER_CFP4_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'ACC_OPER_CFP4_SEND',
	'J1090',
	'en_US',
	'Export operation CFP calculation result 4' ,
	'Export operation CFP calculation result 4');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'ACC_OPER_CFP5_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'ACC_OPER_CFP5_SEND',
	'J1100',
	'en_US',
	'Export operation CFP calculation result 5' ,
	'Export operation CFP calculation result 5');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'ACC_INPT_CFP1_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'ACC_INPT_CFP1_SEND',
	'J1210',
	'en_US',
	'Export CFP breakdown 1' ,
	'Export CFP breakdown 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'ACC_INPT_CFP2_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'ACC_INPT_CFP2_SEND',
	'J1220',
	'en_US',
	'Export CFP breakdown 2' ,
	'Export CFP breakdown 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'ACC_INPT_CFP3_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'ACC_INPT_CFP3_SEND',
	'J1230',
	'en_US',
	'Export CFP breakdown 3' ,
	'Export CFP breakdown 3');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'ACC_INPT_CFP4_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'ACC_INPT_CFP4_SEND',
	'J1240',
	'en_US',
	'Export CFP breakdown 4' ,
	'Export CFP breakdown 4');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'ACC_INPT_CFP5_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'ACC_INPT_CFP5_SEND',
	'J1250',
	'en_US',
	'Export CFP breakdown 5' ,
	'Export CFP breakdown 5');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'CFP_IO_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'CFP_IO_SEND',
	'J1110',
	'en_US',
	'Export T account' ,
	'Export T account');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_CFP_BP_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_CFP_BP_MST_SEND',
	'J2010',
	'en_US',
	'Export BP master' ,
	'Export BP master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_CFP_ITM_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_CFP_ITM_MST_SEND',
	'J2020',
	'en_US',
	'Export item master' ,
	'Export item master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_CFP_LOC_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_CFP_LOC_MST_SEND',
	'J2030',
	'en_US',
	'Export location master' ,
	'Export location master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_CFP_OPER_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_CFP_OPER_MST_SEND',
	'J2040',
	'en_US',
	'Export operation master' ,
	'Export operation master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_CFP_USR_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_CFP_USR_MST_SEND',
	'J2050',
	'en_US',
	'Export PIC master' ,
	'Export PIC master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_CFP_STR_LN_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_CFP_STR_LN_MST_SEND',
	'J2060',
	'en_US',
	'Export rack/line master' ,
	'Export rack/line master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_CFP_CUR_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_CFP_CUR_MST_SEND',
	'J2070',
	'en_US',
	'Export environmental unit master' ,
	'Export environmental unit master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_CFP_TERM_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_CFP_TERM_MST_SEND',
	'J2080',
	'en_US',
	'Export term master' ,
	'Export term master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_CFP_CALC_GRP_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_CFP_CALC_GRP_MST_SEND',
	'J2090',
	'en_US',
	'Export calculation group master' ,
	'Export calculation group master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_CFP_DPT_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_CFP_DPT_MST_SEND',
	'J2100',
	'en_US',
	'Export CFP dept. master' ,
	'Export CFP dept. master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_CFP_SLS_MST1_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_CFP_SLS_MST1_SEND',
	'J2110',
	'en_US',
	'Export CFP sales classification master 1' ,
	'Export CFP sales classification master 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_CFP_SLS_MST2_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_CFP_SLS_MST2_SEND',
	'J2120',
	'en_US',
	'Export CFP sales classification master 2' ,
	'Export CFP sales classification master 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_CFP_SLS_MST3_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_CFP_SLS_MST3_SEND',
	'J2130',
	'en_US',
	'Export CFP sales classification master 3' ,
	'Export CFP sales classification master 3');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_CFP_SLS_MST4_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_CFP_SLS_MST4_SEND',
	'J2140',
	'en_US',
	'Export CFP sales classification master 4' ,
	'Export CFP sales classification master 4');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_CFP_SLS_MST5_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_CFP_SLS_MST5_SEND',
	'J2150',
	'en_US',
	'Export CFP sales classification master 5' ,
	'Export CFP sales classification master 5');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_CFP_EXPNS_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_CFP_EXPNS_MST_SEND',
	'J2160',
	'en_US',
	'Export CFP element master' ,
	'Export CFP element master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_CFP_AC_RSN_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_CFP_AC_RSN_MST_SEND',
	'J2170',
	'en_US',
	'Export accounting reason master' ,
	'Export accounting reason master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_CFP_WG_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_CFP_WG_MST_SEND',
	'J2180',
	'en_US',
	'Export WG master' ,
	'Export WG master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_CFP_ALC_AC_MST_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_CFP_ALC_AC_MST_SEND',
	'J2190',
	'en_US',
	'Export allocation account master' ,
	'Export allocation account master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_CFP_DPT_CONFIG_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_CFP_DPT_CONFIG_SEND',
	'J2200',
	'en_US',
	'Export CFP dept. structure master' ,
	'Export CFP dept. structure master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'BI_CFP_EXPNS_CONFIG_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'BI_CFP_EXPNS_CONFIG_SEND',
	'J2210',
	'en_US',
	'Export CFP element display structure master' ,
	'Export CFP element display structure master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'SAP_JOURNAL_SEND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'SAP_JOURNAL_SEND',
	'K0010',
	'en_US',
	'Export SAP journal' ,
	'Export SAP journal');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'SAP_COST_CENTER' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'SAP_COST_CENTER',
	'K1010',
	'en_US',
	'Acquire SAP cost center master data' ,
	'Acquire SAP cost center master data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PCM_IO_ACT_RCV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PCM_IO_ACT_RCV',
	'L0010',
	'en_US',
	'Import PCM GR/GI result' ,
	'Import PCM GR/GI result');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PCM_ACT_WK_RCV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PCM_ACT_WK_RCV',
	'L0020',
	'en_US',
	'Import PCM man-hour info.' ,
	'Import PCM man-hour info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PCM_ACT_INST_WIP_RCV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PCM_ACT_INST_WIP_RCV',
	'L0030',
	'en_US',
	'Import PCM WIP info.' ,
	'Import PCM WIP info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IF_PROC_TYP' AND C_KEY = 'PCM_ACT_STK_RCV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IF_PROC_TYP',
	'PCM_ACT_STK_RCV',
	'L0040',
	'en_US',
	'Import PCM Inventory info.' ,
	'Import PCM Inventory info.');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_PUSH_NTC_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_PUSH_NTC_TYP',
	'en_US',
	'Push notification type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PUSH_NTC_TYP' AND C_KEY = 'APRV_RQST_MAIN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PUSH_NTC_TYP',
	'APRV_RQST_MAIN',
	'APRV_RQST_MAIN',
	'en_US',
	'Approval request (To main PIC)' ,
	'Notification to approval main PIC');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PUSH_NTC_TYP' AND C_KEY = 'APRV_RQST_SUB' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PUSH_NTC_TYP',
	'APRV_RQST_SUB',
	'APRV_RQST_SUB',
	'en_US',
	'Approval request (To sub PIC)' ,
	'Notification to approval sub PIC');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PUSH_NTC_TYP' AND C_KEY = 'APRV_RESULT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PUSH_NTC_TYP',
	'APRV_RESULT',
	'APRV_RESULT',
	'en_US',
	'Approval result' ,
	'Notification of approval result to requesting PIC');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PUSH_NTC_TYP' AND C_KEY = 'APRV_DEPUTY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PUSH_NTC_TYP',
	'APRV_DEPUTY',
	'APRV_DEPUTY',
	'en_US',
	'Alternate approval' ,
	'Notification of alternate approved result for main PIC');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PUSH_NTC_TYP' AND C_KEY = 'WG_RQST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PUSH_NTC_TYP',
	'WG_RQST',
	'WG_RQST',
	'en_US',
	'Inventory request from other WG' ,
	'Notify about request process between WGs from requesting WG to requested WG');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PUSH_NTC_TYP' AND C_KEY = 'WG_RQST_PRMS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PUSH_NTC_TYP',
	'WG_RQST_PRMS',
	'WG_RQST_PRMS',
	'en_US',
	'Inventory request from other WG replied' ,
	'Notify about request process between WGs from requested WG to requesting WG');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PUSH_NTC_TYP' AND C_KEY = 'MFG_INST_APRV_RQST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PUSH_NTC_TYP',
	'MFG_INST_APRV_RQST',
	'MFG_INST_APRV_RQST',
	'en_US',
	'Mfg. order approval request' ,
	'Notification to mfg. order approval PIC');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PUSH_NTC_TYP' AND C_KEY = 'MFG_INST_APRV_RESULT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PUSH_NTC_TYP',
	'MFG_INST_APRV_RESULT',
	'MFG_INST_APRV_RESULT',
	'en_US',
	'Mfg. orders approval result' ,
	'Notification of approval result for PIC/dept. in charge of mfg. order');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PUSH_NTC_TYP' AND C_KEY = 'MFG_ACT_APRV_RQST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PUSH_NTC_TYP',
	'MFG_ACT_APRV_RQST',
	'MFG_ACT_APRV_RQST',
	'en_US',
	'Mfg. record approval request' ,
	'Notification to Mfg. approval PIC');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PUSH_NTC_TYP' AND C_KEY = 'MFG_ACT_APRV_RESULT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PUSH_NTC_TYP',
	'MFG_ACT_APRV_RESULT',
	'MFG_ACT_APRV_RESULT',
	'en_US',
	'Mfg. record approval result' ,
	'Notification of approval result for PIC/dept. in charge of mfg.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PUSH_NTC_TYP' AND C_KEY = 'INSP_APRV_RQST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PUSH_NTC_TYP',
	'INSP_APRV_RQST',
	'INSP_APRV_RQST',
	'en_US',
	'Inspection order approval request' ,
	'Notification to Inspection order approval PIC');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PUSH_NTC_TYP' AND C_KEY = 'INSP_APRV_RESULT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PUSH_NTC_TYP',
	'INSP_APRV_RESULT',
	'INSP_APRV_RESULT',
	'en_US',
	'Inspection order approval result' ,
	'Notification of approval result to PIC of inspection order and dept. in charge of inspection order');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PUSH_NTC_TYP' AND C_KEY = 'INSP_JUDG_RQST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PUSH_NTC_TYP',
	'INSP_JUDG_RQST',
	'INSP_JUDG_RQST',
	'en_US',
	'Inspection decision request' ,
	'Notification to inspection decision PIC');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PUSH_NTC_TYP' AND C_KEY = 'INSP_JUDG_RESULT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PUSH_NTC_TYP',
	'INSP_JUDG_RESULT',
	'INSP_JUDG_RESULT',
	'en_US',
	'Inspection decision request result' ,
	'Notification of inspection decision result to inspection implementor and dept. in charge for inspection');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PUSH_NTC_TYP' AND C_KEY = 'PLNT_APRV_RQST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PUSH_NTC_TYP',
	'PLNT_APRV_RQST',
	'PLNT_APRV_RQST',
	'en_US',
	'Factory release approval request' ,
	'Notification to release from factory approval PIC');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PUSH_NTC_TYP' AND C_KEY = 'PLNT_APRV_RESULT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PUSH_NTC_TYP',
	'PLNT_APRV_RESULT',
	'PLNT_APRV_RESULT',
	'en_US',
	'Factory release approval result' ,
	'Notification of release from factory approval result for dept. in charge');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PUSH_NTC_TYP' AND C_KEY = 'MRKT_JUDG_RQST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PUSH_NTC_TYP',
	'MRKT_JUDG_RQST',
	'MRKT_JUDG_RQST',
	'en_US',
	'Market release approval request' ,
	'Notification to market release approval PIC');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PUSH_NTC_TYP' AND C_KEY = 'MRKT_JUDG_RESULT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PUSH_NTC_TYP',
	'MRKT_JUDG_RESULT',
	'MRKT_JUDG_RESULT',
	'en_US',
	'Market release approval result' ,
	'Notification of market release approval for dept. in charge');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_STK_MNG_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_STK_MNG_TYP',
	'en_US',
	'Inventory management type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STK_MNG_TYP' AND C_KEY = 'MNG' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STK_MNG_TYP',
	'MNG',
	'1',
	'en_US',
	'Manage inventory' ,
	'Inventory management item');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STK_MNG_TYP' AND C_KEY = 'NOT_MNG' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STK_MNG_TYP',
	'NOT_MNG',
	'2',
	'en_US',
	'Not inventory management' ,
	'Inventory unmanaged item');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STK_MNG_TYP' AND C_KEY = 'PHANTOM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STK_MNG_TYP',
	'PHANTOM',
	'3',
	'en_US',
	'Phantom item' ,
	'Phantom item');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_ASSET_MNG_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_ASSET_MNG_TYP',
	'en_US',
	'Asset management type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ASSET_MNG_TYP' AND C_KEY = 'MNG' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ASSET_MNG_TYP',
	'MNG',
	'1',
	'en_US',
	'Manage asset' ,
	'Asset management item');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ASSET_MNG_TYP' AND C_KEY = 'NOT_MNG' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ASSET_MNG_TYP',
	'NOT_MNG',
	'2',
	'en_US',
	'Do not manage asset' ,
	'Asset unmanaged item');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ASSET_MNG_TYP' AND C_KEY = 'PHANTOM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ASSET_MNG_TYP',
	'PHANTOM',
	'3',
	'en_US',
	'Phantom item' ,
	'Phantom item');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_ITM_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_ITM_TYP',
	'en_US',
	'Item type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ITM_TYP' AND C_KEY = 'GOODS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ITM_TYP',
	'GOODS',
	'1',
	'en_US',
	'Goods' ,
	'Goods');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ITM_TYP' AND C_KEY = 'PROD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ITM_TYP',
	'PROD',
	'2',
	'en_US',
	'Product' ,
	'Product');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ITM_TYP' AND C_KEY = 'INT_PROD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ITM_TYP',
	'INT_PROD',
	'3',
	'en_US',
	'WIP' ,
	'WIP');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ITM_TYP' AND C_KEY = 'PART' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ITM_TYP',
	'PART',
	'4',
	'en_US',
	'Parts' ,
	'Parts');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ITM_TYP' AND C_KEY = 'MATERIAL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ITM_TYP',
	'MATERIAL',
	'5',
	'en_US',
	'Material' ,
	'Material');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ITM_TYP' AND C_KEY = 'RM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ITM_TYP',
	'RM',
	'6',
	'en_US',
	'Raw material' ,
	'Raw material');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ITM_TYP' AND C_KEY = 'PHANTOM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ITM_TYP',
	'PHANTOM',
	'7',
	'en_US',
	'Phantom item' ,
	'Phantom item');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ITM_TYP' AND C_KEY = 'OTHER' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ITM_TYP',
	'OTHER',
	'9',
	'en_US',
	'Other' ,
	'Other');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_LOT_MNG_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_LOT_MNG_TYP',
	'en_US',
	'Lot management type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_LOT_MNG_TYP' AND C_KEY = 'NOT_MNG' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_LOT_MNG_TYP',
	'NOT_MNG',
	'1',
	'en_US',
	'Do not manage lot No.' ,
	'Do not number lot automatically or manually');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_LOT_MNG_TYP' AND C_KEY = 'DUPL_ABL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_LOT_MNG_TYP',
	'DUPL_ABL',
	'2',
	'en_US',
	'Allow same lot No.' ,
	'Allow numbering same value as existing lot No. at receipt or mfg.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_LOT_MNG_TYP' AND C_KEY = 'UNIQ' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_LOT_MNG_TYP',
	'UNIQ',
	'3',
	'en_US',
	'Do not allow same lot no.' ,
	'Do not allow numbering same value as existing lot No. at receipt or mfg.');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_SUBLOT_MNG_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_SUBLOT_MNG_TYP',
	'en_US',
	'Sublot management type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SUBLOT_MNG_TYP' AND C_KEY = 'NOT_MNG' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SUBLOT_MNG_TYP',
	'NOT_MNG',
	'1',
	'en_US',
	'Not manage sublot No.' ,
	'Neither numbering sublot No. in auto-or manually');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SUBLOT_MNG_TYP' AND C_KEY = 'DUPL_ABL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SUBLOT_MNG_TYP',
	'DUPL_ABL',
	'2',
	'en_US',
	'Allow same sublot in a lot' ,
	'Allow numbering same value as existing sublot No. within same lot at receipt or mfg.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SUBLOT_MNG_TYP' AND C_KEY = 'UNIQ' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SUBLOT_MNG_TYP',
	'UNIQ',
	'3',
	'en_US',
	'Prohibit same sublot in a lot' ,
	'Do not allow numbering same value as existing sublot No. within same lot at receipt or mfg.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SUBLOT_MNG_TYP' AND C_KEY = 'STK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SUBLOT_MNG_TYP',
	'STK',
	'4',
	'en_US',
	'Sublot management only inventory' ,
	'Manage sublot for result or inventory, but do not create lot management info. (Quality info.) for each sublot');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_SNO_MNG_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_SNO_MNG_TYP',
	'en_US',
	'SEIBAN No. management type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SNO_MNG_TYP' AND C_KEY = 'NOT_MNG' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SNO_MNG_TYP',
	'NOT_MNG',
	'1',
	'en_US',
	'Do not manage' ,
	'Not possible to input SEIBAN No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SNO_MNG_TYP' AND C_KEY = 'MNG_REQ' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SNO_MNG_TYP',
	'MNG_REQ',
	'2',
	'en_US',
	'Manage (Required)' ,
	'SEIBAN No. required');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SNO_MNG_TYP' AND C_KEY = 'MNG_ARB' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SNO_MNG_TYP',
	'MNG_ARB',
	'3',
	'en_US',
	'Manage (Optional)' ,
	'Possible to input SEIBAN No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SNO_MNG_TYP' AND C_KEY = 'MNG_NOT_STK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SNO_MNG_TYP',
	'MNG_NOT_STK',
	'4',
	'en_US',
	'Manage (Optional/Not for inventory)' ,
	'SEIBAN No. for order or mfg. order can be entered, but not assigned when inventory posting.');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_BILL_CL_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_BILL_CL_TYP',
	'en_US',
	'Billing closing type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BILL_CL_TYP' AND C_KEY = 'BATCH' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BILL_CL_TYP',
	'BATCH',
	'1',
	'en_US',
	'Billing by batch closing day' ,
	'Invoice by batch closing day');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BILL_CL_TYP' AND C_KEY = 'MANUAL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BILL_CL_TYP',
	'MANUAL',
	'2',
	'en_US',
	'Billing by manual closing day' ,
	'Invoice by manual closing day');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BILL_CL_TYP' AND C_KEY = 'SEL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BILL_CL_TYP',
	'SEL',
	'3',
	'en_US',
	'Billing by manual selection' ,
	'Invoice by manual selection');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BILL_CL_TYP' AND C_KEY = 'EACH_SLS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BILL_CL_TYP',
	'EACH_SLS',
	'4',
	'en_US',
	'Each time sales invoicing' ,
	'Each time sales invoicing');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_ASST_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_ASST_TYP',
	'en_US',
	'Asset type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ASST_TYP' AND C_KEY = 'CO_SLS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ASST_TYP',
	'CO_SLS',
	'1',
	'en_US',
	'Own company (Sales)' ,
	'Own company (Sales)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ASST_TYP' AND C_KEY = 'CO_PROD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ASST_TYP',
	'CO_PROD',
	'2',
	'en_US',
	'Own company (Production)' ,
	'Own company (Production)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ASST_TYP' AND C_KEY = 'OTH' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ASST_TYP',
	'OTH',
	'3',
	'en_US',
	'Other company' ,
	'Other company');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_PROV_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_PROV_TYP',
	'en_US',
	'Supply type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PROV_TYP' AND C_KEY = 'FFR_PROV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PROV_TYP',
	'FFR_PROV',
	'1',
	'en_US',
	'Non-chargeable supply' ,
	'Supply at free of charge');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PROV_TYP' AND C_KEY = 'ONR_PROV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PROV_TYP',
	'ONR_PROV',
	'2',
	'en_US',
	'chargeable supply' ,
	'Chargeable supply');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PROV_TYP' AND C_KEY = 'SS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PROV_TYP',
	'SS',
	'3',
	'en_US',
	'Self supply' ,
	'Subcontracting procurement independently');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'en_US',
	'Accounting slip type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'PURC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'PURC',
	'10101',
	'en_US',
	'Purchase' ,
	'Purchase');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'PURC_COST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'PURC_COST',
	'10102',
	'en_US',
	'Purchase cost' ,
	'Purchase cost');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'PURC_XPNS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'PURC_XPNS',
	'10103',
	'en_US',
	'Expense purchase' ,
	'Expenses recording');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'PURC_IN_TRANSIT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'PURC_IN_TRANSIT',
	'10104',
	'en_US',
	'Purchase of not arrived item' ,
	'Purchase posting before receipt');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'ARR_IN_TRANSIT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'ARR_IN_TRANSIT',
	'10105',
	'en_US',
	'Receipt of item in transit' ,
	'Receipt of item in transit');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'PURC_RET' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'PURC_RET',
	'10111',
	'en_US',
	'Purchase return' ,
	'Purchase return');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'PURC_RET_XPNS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'PURC_RET_XPNS',
	'10112',
	'en_US',
	'Purchase return (Expense)' ,
	'Return to expenses');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'PURC_DSCNT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'PURC_DSCNT',
	'10121',
	'en_US',
	'Purchase discount' ,
	'Purchase discount');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'PURC_DSCNT_XPNS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'PURC_DSCNT_XPNS',
	'10122',
	'en_US',
	'Expenses discount' ,
	'Expenses discount');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'PURC_XTRA' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'PURC_XTRA',
	'10131',
	'en_US',
	'Purchase markup' ,
	'Purchase surplus');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'PURC_XTRA_XPNS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'PURC_XTRA_XPNS',
	'10132',
	'en_US',
	'Expenses markup' ,
	'Expenses surplus');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'SLS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'SLS',
	'10201',
	'en_US',
	'Sales result' ,
	'Sales');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'SLS_COST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'SLS_COST',
	'10202',
	'en_US',
	'Cost of goods sold' ,
	'Cost of goods sales (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'SLS_RET' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'SLS_RET',
	'10211',
	'en_US',
	'Sales return' ,
	'Sales return');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'SLS_DSCNT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'SLS_DSCNT',
	'10221',
	'en_US',
	'Sales discount' ,
	'Sales discount');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'SLS_XTRA' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'SLS_XTRA',
	'10231',
	'en_US',
	'Sales markup' ,
	'Sales surplus');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'MFG' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'MFG',
	'10301',
	'en_US',
	'Mfg.' ,
	'Mfg. (Output result of inventory management item)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'BYPROD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'BYPROD',
	'10302',
	'en_US',
	'By-product mfg.' ,
	'By-product mfg.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'INPUT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'INPUT',
	'10401',
	'en_US',
	'Input' ,
	'Input of own assets');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'IN_ONR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'IN_ONR',
	'10402',
	'en_US',
	'Input (Chargeable supply)' ,
	'Input of chargeable supply item');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'IN_SS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'IN_SS',
	'10403',
	'en_US',
	'Input (Self supply)' ,
	'Input of self supply item');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'IN_ONR_DIFF' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'IN_ONR_DIFF',
	'10411',
	'en_US',
	'Input (Gain of chargeable supply)' ,
	'Difference gain incurred at input of chargeable supply item (Chargeable supply amount - input cost) (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'FFR_PROV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'FFR_PROV',
	'10501',
	'en_US',
	'Non-chargeable supply' ,
	'Non-chargeable supply');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'ONR_PROV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'ONR_PROV',
	'10502',
	'en_US',
	'chargeable supply' ,
	'chargeable supply');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'FFR_PRVR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'FFR_PRVR',
	'10511',
	'en_US',
	'Return (Non-chargeable supply)' ,
	'Return of non-chargeable supply (Subcontractor -> own company)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'ONR_PRVR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'ONR_PRVR',
	'10512',
	'en_US',
	'Return (chargeable supply)' ,
	'Return of chargeable supply item (Subcontractor -> own company)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'FFR_PROV_CST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'FFR_PROV_CST',
	'10521',
	'en_US',
	'Non-chargeable supply cost' ,
	'GI cost incurred at non-chargeable supply (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'ONR_PROV_CST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'ONR_PROV_CST',
	'10522',
	'en_US',
	'Cost of chargeable supply item' ,
	'GI cost incurred at chargeable supply (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'INSP_SMPL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'INSP_SMPL',
	'10601',
	'en_US',
	'Sampling' ,
	'Sampling');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'DISP_SCRP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'DISP_SCRP',
	'10602',
	'en_US',
	'Disposal' ,
	'Disposal');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'SO_STKTK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'SO_STKTK',
	'10611',
	'en_US',
	'Inventory count variance GI' ,
	'Inventory count variance GI');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'IN_STKTK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'IN_STKTK',
	'10612',
	'en_US',
	'Inventory count variance GR' ,
	'Inventory count variance GR');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'PROD_ITM_SO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'PROD_ITM_SO',
	'10701',
	'en_US',
	'Sales warehousing' ,
	'Sales warehousing (transfer of asset type: own company (production) -> own company (sales)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'PROD_ITM_RET_SO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'PROD_ITM_RET_SO',
	'10712',
	'en_US',
	'Production returning' ,
	'Production returning (transfer of asset type: own company (sales) -> own company (production)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'DPT_XFR_SO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'DPT_XFR_SO',
	'10801',
	'en_US',
	'Inter dept. movement' ,
	'Inter dept. movement');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'OTH_CCN_SO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'OTH_CCN_SO',
	'10811',
	'en_US',
	'Other accounting GI' ,
	'Other accounting GI');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'OTH_CCN_GR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'OTH_CCN_GR',
	'10812',
	'en_US',
	'Other accounting GR' ,
	'Other accounting GR');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'STK_SW_SO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'STK_SW_SO',
	'10821',
	'en_US',
	'Inventory transfer GI' ,
	'Inventory transfer GI');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'STK_SW_GR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'STK_SW_GR',
	'10822',
	'en_US',
	'Inventory transfer GR' ,
	'Inventory transfer GR');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'SHIP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'SHIP',
	'10901',
	'en_US',
	'Shipping' ,
	'Shipping');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'SHIP_RET' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'SHIP_RET',
	'10902',
	'en_US',
	'Shipping return' ,
	'Shipping return');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'EOM_STK_PROD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'EOM_STK_PROD',
	'20101',
	'en_US',
	'Ending inventory (Production)' ,
	'Inventory classified as own asset (production) or other company''s asset');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'EOM_STK_SLS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'EOM_STK_SLS',
	'20102',
	'en_US',
	'Ending inventory (Sales)' ,
	'Inventory classified as own asset (sales) or other company''s asset');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'INP_WIP_CST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'INP_WIP_CST',
	'20201',
	'en_US',
	'WIP cost' ,
	'WIP cost (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'STK_ASM_DIFF' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'STK_ASM_DIFF',
	'30101',
	'en_US',
	'Inventory revaluation variance' ,
	'Amount to be incurred by beginning inventory revaluation in cost control (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'ONR_PROV_DIFF' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'ONR_PROV_DIFF',
	'30201',
	'en_US',
	'chargeable supply gain' ,
	'Difference gain incurred at chargeable supply (Chargeable supply amount - GI cost) (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'CST_IO_AOD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'CST_IO_AOD',
	'30301',
	'en_US',
	'GR/GI difference' ,
	'GR/GI difference (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'EOM_STK_ASM_MIS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'EOM_STK_ASM_MIS',
	'30401',
	'en_US',
	'Ending inventory revaluation loss' ,
	'Amount to be incurred by recording revaluation loss in cost management (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'COMP_CST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'COMP_CST',
	'30501',
	'en_US',
	'Cost of completed item' ,
	'Cost for finished goods (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'DPT_ALC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'DPT_ALC',
	'30601',
	'en_US',
	'Inter department allocation' ,
	'Inter department allocation amount (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'ITM_ALC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'ITM_ALC',
	'30611',
	'en_US',
	'Item allocation' ,
	'Item allocation amount (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'PROD_ITM_GR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'PROD_ITM_GR',
	'30701',
	'en_US',
	'Sales warehousing (GR)' ,
	'GR cost in sales warehousing (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'PROD_ITM_DIFF' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'PROD_ITM_DIFF',
	'30702',
	'en_US',
	'Sales warehousing (Difference)' ,
	'Cost variance incurred by GR/GI in sales in (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'PROD_ITM_RET_GR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'PROD_ITM_RET_GR',
	'30711',
	'en_US',
	'Production returning (GR)' ,
	'GR cost in production returning (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'PROD_ITM_RET_DIFF' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'PROD_ITM_RET_DIFF',
	'30712',
	'en_US',
	'Production returning (Variance)' ,
	'Cost variance incurred by GR/GI in production returning (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'DPT_XFR_GR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'DPT_XFR_GR',
	'30801',
	'en_US',
	'Inter dept. movement (GR)' ,
	'GR cost for inter dept. movement (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'DPT_XFR_DIFF' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'DPT_XFR_DIFF',
	'30802',
	'en_US',
	'Inter dept. movement (Difference)' ,
	'Cost variance incurred by GR/GI for inter dept. movement (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'DIFF_IO_SUM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'DIFF_IO_SUM',
	'30901',
	'en_US',
	'Receipt price variance (Total)' ,
	'Receipt price variance (Total) (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'DIFF_IO_PRI' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'DIFF_IO_PRI',
	'30902',
	'en_US',
	'Receipt unit price variance (Unit price variance)' ,
	'Receipt unit price variance (Unit price variance) (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'DIFF_IO_RATE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'DIFF_IO_RATE',
	'30903',
	'en_US',
	'Receipt unit price variance (Rate variance)' ,
	'Receipt unit price variance (Rate variance) (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'DIFF_QT_PAR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'DIFF_QT_PAR',
	'30904',
	'en_US',
	'Qty. variance (Parent)' ,
	'Qty. variance (Parent) (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'DIFF_QT_CHD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'DIFF_QT_CHD',
	'30905',
	'en_US',
	'Qty. variance (Child)' ,
	'Qty. variance (Child) (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'DIFF_PR_PAR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'DIFF_PR_PAR',
	'30906',
	'en_US',
	'Issue price variance (Parent)' ,
	'Issue price variance (Parent) (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'DIFF_PR_CHD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'DIFF_PR_CHD',
	'30907',
	'en_US',
	'Issue price variance (Child)' ,
	'Issue price variance (Child) (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'DIFF_WK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'DIFF_WK',
	'30910',
	'en_US',
	'Time variance' ,
	'Time variance (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'DIFF_ACT1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'DIFF_ACT1',
	'30911',
	'en_US',
	'Result variance 1' ,
	'Result variance 1 (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'DIFF_ACT2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'DIFF_ACT2',
	'30912',
	'en_US',
	'Result variance 2' ,
	'Result variance 2 (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'DIFF_ACT3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'DIFF_ACT3',
	'30913',
	'en_US',
	'Result variance 3' ,
	'Result variance 3 (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'DIFF_ACT4' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'DIFF_ACT4',
	'30914',
	'en_US',
	'Result variance 4' ,
	'Result variance 4 (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'DIFF_ACT5' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'DIFF_ACT5',
	'30915',
	'en_US',
	'Result variance 5' ,
	'Result variance 5 (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'DIFF_RATE_ALC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'DIFF_RATE_ALC',
	'30920',
	'en_US',
	'Allocation rate variance (Allocation account)' ,
	'Allocation rate variance (Allocation account) (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'DIFF_RATE_ITM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'DIFF_RATE_ITM',
	'30921',
	'en_US',
	'Allocation rate variance (Item)' ,
	'Allocation rate variance (Item) (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'DIFF_OUTSRC_SUM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'DIFF_OUTSRC_SUM',
	'30931',
	'en_US',
	'Subcontracting unit price variance (Total)' ,
	'Subcontracting unit price variance (Total) (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'DIFF_OUTSRC_PRI' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'DIFF_OUTSRC_PRI',
	'30932',
	'en_US',
	'Subcontracting unit price variance (Unit price variance)' ,
	'Subcontracting unit price variance (Unit price variance) (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'DIFF_OUTSRC_RATE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'DIFF_OUTSRC_RATE',
	'30933',
	'en_US',
	'Subcontracting unit price variance (Rate variance)' ,
	'Subcontracting unit price variance (Rate variance) (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'DIFF_SS_PAR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'DIFF_SS_PAR',
	'30935',
	'en_US',
	'Self supply unit price variance (Parent)' ,
	'Self supply unit price variance (Parent) (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'DIFF_SS_CHD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'DIFF_SS_CHD',
	'30936',
	'en_US',
	'Self supply unit price variance (Child)' ,
	'Self supply unit price variance (Child) (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'DIFF_STD_ADJ' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'DIFF_STD_ADJ',
	'30950',
	'en_US',
	'Standard adjustment variance' ,
	'Standard adjustment variance (Cost management)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'RCV_ENT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'RCV_ENT',
	'40101',
	'en_US',
	'Payment received entry' ,
	'Suspense received');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'ADV_ENT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'ADV_ENT',
	'40102',
	'en_US',
	'Advanced received entry' ,
	'Advance received');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'ADV_SW' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'ADV_SW',
	'40103',
	'en_US',
	'Advance received transfer' ,
	'Transfer of suspense received/advance received');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'AR_FAD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'AR_FAD',
	'40201',
	'en_US',
	'AR reconciliation' ,
	'AR reconciliation amount');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'AR_EX_GAIN_APPL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'AR_EX_GAIN_APPL',
	'40301',
	'en_US',
	'Exchange gain (AR reconciliation)' ,
	'Exchange gain generated at AR settlement');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'AR_EX_LOSS_APPL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'AR_EX_LOSS_APPL',
	'40302',
	'en_US',
	'Exchange loss (AR reconciliation)' ,
	'Exchange loss generated at AR settlement');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'AR_EX_GAIN_REV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'AR_EX_GAIN_REV',
	'40401',
	'en_US',
	'Exchange gain (AR revaluation)' ,
	'Exchange gain incurred at exchange rate revaluation');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'AR_EX_LOSS_REV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'AR_EX_LOSS_REV',
	'40402',
	'en_US',
	'Exchange loss (AR revaluation)' ,
	'Exchange loss incurred at exchange rate revaluation');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'AC_FAD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'AC_FAD',
	'40202',
	'en_US',
	'Other accounts receivable reconciliation' ,
	'Reconciled amount of other accounts receivable');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'AC_EX_GAIN_APPL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'AC_EX_GAIN_APPL',
	'40303',
	'en_US',
	'Exchange gain (Other accounts receivable reconciliation)' ,
	'Exchange gain generated at settlement of AR (Other accounts receivable)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'AC_EX_LOSS_APPL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'AC_EX_LOSS_APPL',
	'40304',
	'en_US',
	'Exchange loss (Other accounts receivable reconciliation)' ,
	'Exchange loss generated at settlement of AR (Other accounts receivable)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'AC_EX_GAIN_REV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'AC_EX_GAIN_REV',
	'40403',
	'en_US',
	'Exchange gain (Other accounts receivable revaluation)' ,
	'Exchange gain generated at revaluation of exchange rate of other accounts receivable');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'AC_EX_LOSS_REV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'AC_EX_LOSS_REV',
	'40404',
	'en_US',
	'Exchange loss (Other accounts receivable revaluation)' ,
	'Exchange loss generated at revaluation of exchange rate of other accounts receivable');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'PAY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'PAY',
	'50101',
	'en_US',
	'Payment' ,
	'Payment amount for AP');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'XPNS_PAY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'XPNS_PAY',
	'50102',
	'en_US',
	'Payment (Other accounts payable amount)' ,
	'Payment amount for other accounts payable');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'ADV_PAY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'ADV_PAY',
	'50201',
	'en_US',
	'Advance payment entry' ,
	'Advance payment amount');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'AP_EX_GAIN_APPL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'AP_EX_GAIN_APPL',
	'50301',
	'en_US',
	'Exchange gain (AP reconciliation)' ,
	'Exchange gain generated at AP settlement');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'AP_EX_LOSS_APPL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'AP_EX_LOSS_APPL',
	'50302',
	'en_US',
	'Exchange loss (AP reconciliation)' ,
	'Exchange loss generated at AP settlement');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'AE_EX_GAIN_APPL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'AE_EX_GAIN_APPL',
	'50303',
	'en_US',
	'Exchange gain (Other accounts payable reconciliation)' ,
	'Exchange gain generated at other accounts payable settlement');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'AE_EX_LOSS_APPL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'AE_EX_LOSS_APPL',
	'50304',
	'en_US',
	'Exchange loss (Other accounts payable reconciliation)' ,
	'Exchange loss generated at other accounts payable settlement');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'AP_EX_GAIN_REV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'AP_EX_GAIN_REV',
	'50401',
	'en_US',
	'Exchange gain (AP revaluation)' ,
	'Exchange gain generated at exchange rate revaluation of AP');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'AP_EX_LOSS_REV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'AP_EX_LOSS_REV',
	'50402',
	'en_US',
	'Exchange loss (AP revaluation)' ,
	'Exchange loss generated at exchange rate revaluation of AP');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'AE_EX_GAIN_REV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'AE_EX_GAIN_REV',
	'50403',
	'en_US',
	'Exchange gain (Other accounts payable revaluation)' ,
	'Exchange gain generated at exchange rate revaluation of other accounts payable');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'AE_EX_LOSS_REV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'AE_EX_LOSS_REV',
	'50404',
	'en_US',
	'Exchange loss (Other accounts payable revaluation)' ,
	'Exchange loss generated at exchange rate revaluation of other accounts payable');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_SLIP_TYP' AND C_KEY = 'PAY_COM_PAID' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_SLIP_TYP',
	'PAY_COM_PAID',
	'50501',
	'en_US',
	'Transfer fee' ,
	'Payment of transfer fee');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_SLS_BASIS_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_SLS_BASIS_TYP',
	'en_US',
	'Revenue recording type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SLS_BASIS_TYP' AND C_KEY = 'SHIP_BASIS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SLS_BASIS_TYP',
	'SHIP_BASIS',
	'1',
	'en_US',
	'Shipping base' ,
	'Record sales result at shipping result entry');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SLS_BASIS_TYP' AND C_KEY = 'IN_BASIS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SLS_BASIS_TYP',
	'IN_BASIS',
	'2',
	'en_US',
	'Acceptance base' ,
	'Record sales result at acceptance entry');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SLS_BASIS_TYP' AND C_KEY = 'ARRIVAL_BASIS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SLS_BASIS_TYP',
	'ARRIVAL_BASIS',
	'3',
	'en_US',
	'Arrival base' ,
	'Record sales result upon arrival at the delivery destination');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_SLO_PROC_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_SLO_PROC_TYP',
	'en_US',
	'Sales order procurement type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SLO_PROC_TYP' AND C_KEY = 'ALLOC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SLO_PROC_TYP',
	'ALLOC',
	'1',
	'en_US',
	'Inventory allocation' ,
	'Inventory allocation');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SLO_PROC_TYP' AND C_KEY = 'PURC_DDLV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SLO_PROC_TYP',
	'PURC_DDLV',
	'2',
	'en_US',
	'Direct delivery' ,
	'Direct delivery');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SLO_PROC_TYP' AND C_KEY = 'PROC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SLO_PROC_TYP',
	'PROC',
	'3',
	'en_US',
	'Procurement request' ,
	'Procurement request');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SLO_PROC_TYP' AND C_KEY = 'ALLOC_PROC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SLO_PROC_TYP',
	'ALLOC_PROC',
	'4',
	'en_US',
	'Procurement after allocation' ,
	'Procurement after allocation');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_ITM_GRP_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_ITM_GRP_TYP',
	'en_US',
	'Item classification type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ITM_GRP_TYP' AND C_KEY = 'GRP1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ITM_GRP_TYP',
	'GRP1',
	'01',
	'en_US',
	'Item classification 1' ,
	'Item classification 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ITM_GRP_TYP' AND C_KEY = 'GRP2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ITM_GRP_TYP',
	'GRP2',
	'02',
	'en_US',
	'Item classification 2' ,
	'Item classification 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ITM_GRP_TYP' AND C_KEY = 'GRP3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ITM_GRP_TYP',
	'GRP3',
	'03',
	'en_US',
	'Item classification 3' ,
	'Item classification 3');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ITM_GRP_TYP' AND C_KEY = 'GRP4' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ITM_GRP_TYP',
	'GRP4',
	'04',
	'en_US',
	'Item classification 4' ,
	'Item classification 4');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ITM_GRP_TYP' AND C_KEY = 'GRP5' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ITM_GRP_TYP',
	'GRP5',
	'05',
	'en_US',
	'Item classification 5' ,
	'Item classification 5');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ITM_GRP_TYP' AND C_KEY = 'GRP6' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ITM_GRP_TYP',
	'GRP6',
	'06',
	'en_US',
	'Item classification 6' ,
	'Item classification 6');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ITM_GRP_TYP' AND C_KEY = 'GRP7' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ITM_GRP_TYP',
	'GRP7',
	'07',
	'en_US',
	'Item classification 7' ,
	'Item classification 7');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ITM_GRP_TYP' AND C_KEY = 'GRP8' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ITM_GRP_TYP',
	'GRP8',
	'08',
	'en_US',
	'Item classification 8' ,
	'Item classification 8');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ITM_GRP_TYP' AND C_KEY = 'GRP9' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ITM_GRP_TYP',
	'GRP9',
	'09',
	'en_US',
	'Item classification 9' ,
	'Item classification 9');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ITM_GRP_TYP' AND C_KEY = 'GRP10' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ITM_GRP_TYP',
	'GRP10',
	'10',
	'en_US',
	'Item classification 10' ,
	'Item classification 10');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_BP_GRP_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_BP_GRP_TYP',
	'en_US',
	'BP classification type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_GRP_TYP' AND C_KEY = 'GRP1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_GRP_TYP',
	'GRP1',
	'01',
	'en_US',
	'BP classification 1' ,
	'BP classification 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_GRP_TYP' AND C_KEY = 'GRP2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_GRP_TYP',
	'GRP2',
	'02',
	'en_US',
	'BP classification 2' ,
	'BP classification 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_GRP_TYP' AND C_KEY = 'GRP3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_GRP_TYP',
	'GRP3',
	'03',
	'en_US',
	'BP classification 3' ,
	'BP classification 3');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_GRP_TYP' AND C_KEY = 'GRP4' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_GRP_TYP',
	'GRP4',
	'04',
	'en_US',
	'BP classification 4' ,
	'BP classification 4');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_GRP_TYP' AND C_KEY = 'GRP5' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_GRP_TYP',
	'GRP5',
	'05',
	'en_US',
	'BP classification 5' ,
	'BP classification 5');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_GRP_TYP' AND C_KEY = 'GRP6' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_GRP_TYP',
	'GRP6',
	'06',
	'en_US',
	'BP classification 6' ,
	'BP classification 6');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_GRP_TYP' AND C_KEY = 'GRP7' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_GRP_TYP',
	'GRP7',
	'07',
	'en_US',
	'BP classification 7' ,
	'BP classification 7');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_GRP_TYP' AND C_KEY = 'GRP8' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_GRP_TYP',
	'GRP8',
	'08',
	'en_US',
	'BP classification 8' ,
	'BP classification 8');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_GRP_TYP' AND C_KEY = 'GRP9' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_GRP_TYP',
	'GRP9',
	'09',
	'en_US',
	'BP classification 9' ,
	'BP classification 9');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_GRP_TYP' AND C_KEY = 'GRP10' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_GRP_TYP',
	'GRP10',
	'10',
	'en_US',
	'BP classification 10' ,
	'BP classification 10');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_APRV_STS_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_APRV_STS_TYP',
	'en_US',
	'Approval status type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_APRV_STS_TYP' AND C_KEY = 'OPN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_APRV_STS_TYP',
	'OPN',
	'1',
	'en_US',
	'Waiting' ,
	'Not approved state');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_APRV_STS_TYP' AND C_KEY = 'FIX' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_APRV_STS_TYP',
	'FIX',
	'2',
	'en_US',
	'Preliminary approval' ,
	'Status with partially approved when approval for other phase required');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_APRV_STS_TYP' AND C_KEY = 'ACPT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_APRV_STS_TYP',
	'ACPT',
	'9',
	'en_US',
	'Final approval' ,
	'Approved by all approver');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_APRV_STS_TYP' AND C_KEY = 'RJCT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_APRV_STS_TYP',
	'RJCT',
	'C',
	'en_US',
	'Reject' ,
	'Approval rejected state');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_APRV_STS_TYP' AND C_KEY = 'LAST_RJCT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_APRV_STS_TYP',
	'LAST_RJCT',
	'X',
	'en_US',
	'Denied' ,
	'If approval PIC of final approval stage rejects');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_SNO_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_SNO_TYP',
	'en_US',
	'SEIBAN No. type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SNO_TYP' AND C_KEY = 'EXTND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SNO_TYP',
	'EXTND',
	'1',
	'en_US',
	'Explosion' ,
	'Explode SEIBAN No. to child item.\nOnly inventory/remaining order with same SEIBAN No. as the parent order should allocated, and set SEIBAN No. of generated order to be same as SEIBAN No. of the parent order.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SNO_TYP' AND C_KEY = 'NO_EXTND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SNO_TYP',
	'NO_EXTND',
	'2',
	'en_US',
	'No explosion' ,
	'Do not explode SEIBAN No. to child item.\nOnly inventory/remaining order without SEIBAN No. will be allocated, and no SEIBAN No. should be set on generated order.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SNO_TYP' AND C_KEY = 'EXTND_NULL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SNO_TYP',
	'EXTND_NULL',
	'3',
	'en_US',
	'Explosion (Opt)' ,
	'Explode SEIBAN No. to child item.\nInventory/remaining order with same SEIBAN No. as the parent order or with no SEIBAN No. will be allocated, and set SEIBAN No. of generated order to be SEIBAN No. of the parent order.');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_ALT_ITM_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_ALT_ITM_TYP',
	'en_US',
	'Alternative item selection type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ALT_ITM_TYP' AND C_KEY = 'MIX' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ALT_ITM_TYP',
	'MIX',
	'1',
	'en_US',
	'Allow mix' ,
	'Allocate proportionally among alternative items');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ALT_ITM_TYP' AND C_KEY = 'MONO_PRIO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ALT_ITM_TYP',
	'MONO_PRIO',
	'2',
	'en_US',
	'Do not allow mix/allocation first' ,
	'Allocate according to allocation priority to avoid mixture');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ALT_ITM_TYP' AND C_KEY = 'MONO_FIFO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ALT_ITM_TYP',
	'MONO_FIFO',
	'3',
	'en_US',
	'Do not allow mix/oldest GR first' ,
	'Allocate according to first-in first-out principle to make sure no mixture existed');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_YIELD_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_YIELD_TYP',
	'en_US',
	'Output type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_YIELD_TYP' AND C_KEY = 'GOOD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_YIELD_TYP',
	'GOOD',
	'1',
	'en_US',
	'Conforming item' ,
	'Conforming item');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_YIELD_TYP' AND C_KEY = 'DFCT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_YIELD_TYP',
	'DFCT',
	'2',
	'en_US',
	'Defective item' ,
	'Defective item');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_YIELD_TYP' AND C_KEY = 'BYPROD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_YIELD_TYP',
	'BYPROD',
	'3',
	'en_US',
	'By-product' ,
	'By-product');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_MRP_PROC_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_MRP_PROC_TYP',
	'en_US',
	'MRP process type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MRP_PROC_TYP' AND C_KEY = 'RATE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MRP_PROC_TYP',
	'RATE',
	'1',
	'en_US',
	'Order ratio' ,
	'Perform normal explosion and allocation. Generate orders based on required qty. divided proportionally by the order ratio of item details.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MRP_PROC_TYP' AND C_KEY = 'BATCH_REP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MRP_PROC_TYP',
	'BATCH_REP',
	'2',
	'en_US',
	'Batch (Repeat)' ,
	'Perform normal deployment and allocation. Generate multiple orders from one item details record based on priority/maximum order number of item details. Assume to generate an order for each batch size.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MRP_PROC_TYP' AND C_KEY = 'BATCH_AVE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MRP_PROC_TYP',
	'BATCH_AVE',
	'3',
	'en_US',
	'Batch (Average)' ,
	'Perform normal deployment and allocation. Generate number of orders specified as maximum order number from one item details record. Assume that the batch number of times has been decided and order will be generated according to this number count.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MRP_PROC_TYP' AND C_KEY = 'EXCLD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MRP_PROC_TYP',
	'EXCLD',
	'4',
	'en_US',
	'Non-target' ,
	'Do not generate allocation schedule/new order from corresponding item requirement. Also, do not explode configuration from corresponding item order');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MRP_PROC_TYP' AND C_KEY = 'EXTND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MRP_PROC_TYP',
	'EXTND',
	'5',
	'en_US',
	'Explosion only' ,
	'Do not generate allocation schedule/new order from corresponding item requirement. However, explode configuration from corresponding item order');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_PURC_ID_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_PURC_ID_TYP',
	'en_US',
	'Purchase identification type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PURC_ID_TYP' AND C_KEY = 'PURC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PURC_ID_TYP',
	'PURC',
	'1',
	'en_US',
	'Normal purchase' ,
	'Normal purchase');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PURC_ID_TYP' AND C_KEY = 'FFR_RCV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PURC_ID_TYP',
	'FFR_RCV',
	'2',
	'en_US',
	'Receiving free of charge' ,
	'Receiving free of charge item from supplier (Accepted as other company''s assets)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PURC_ID_TYP' AND C_KEY = 'ONR_RCV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PURC_ID_TYP',
	'ONR_RCV',
	'3',
	'en_US',
	'Receiving for a fee' ,
	'Receiving item for a fee from supplier (Accepted as own assets)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PURC_ID_TYP' AND C_KEY = 'VMI' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PURC_ID_TYP',
	'VMI',
	'4',
	'en_US',
	'VMI' ,
	'Accept as VMI');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_INSP_MTD_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_INSP_MTD_TYP',
	'en_US',
	'Inspection method type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_INSP_MTD_TYP' AND C_KEY = 'SMPL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_INSP_MTD_TYP',
	'SMPL',
	'1',
	'en_US',
	'Sampling inspection' ,
	'Inspect partially and select one decision result');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_INSP_MTD_TYP' AND C_KEY = 'TTL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_INSP_MTD_TYP',
	'TTL',
	'2',
	'en_US',
	'100% inspection' ,
	'Inspect whole qty. and assign them to pass/fail');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_INSP_MTD_TYP' AND C_KEY = 'SPEC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_INSP_MTD_TYP',
	'SPEC',
	'4',
	'en_US',
	'Sampling specific inspection' ,
	'Perform specific inspection (Pass/fail-decision process is same as sampling inspection)');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_APRV_FUNC_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_APRV_FUNC_TYP',
	'en_US',
	'Approval function type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_APRV_FUNC_TYP' AND C_KEY = 'QTN_SLO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_APRV_FUNC_TYP',
	'QTN_SLO',
	'11',
	'en_US',
	'Sales order quotation' ,
	'Approval process for sales orders quotation');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_APRV_FUNC_TYP' AND C_KEY = 'SLO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_APRV_FUNC_TYP',
	'SLO',
	'12',
	'en_US',
	'Sales order' ,
	'Approval process for sales order');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_APRV_FUNC_TYP' AND C_KEY = 'SLS_DSCNT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_APRV_FUNC_TYP',
	'SLS_DSCNT',
	'13',
	'en_US',
	'Sales discount' ,
	'Approval process for sales discount');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_APRV_FUNC_TYP' AND C_KEY = 'SLS_XTRA' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_APRV_FUNC_TYP',
	'SLS_XTRA',
	'14',
	'en_US',
	'Sales markup' ,
	'Approval process for sales markup');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_APRV_FUNC_TYP' AND C_KEY = 'PO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_APRV_FUNC_TYP',
	'PO',
	'21',
	'en_US',
	'PO' ,
	'Approval process for PO');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_APRV_FUNC_TYP' AND C_KEY = 'XPNS_PO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_APRV_FUNC_TYP',
	'XPNS_PO',
	'22',
	'en_US',
	'Expense PO' ,
	'Approval process for expenses PO');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_APRV_FUNC_TYP' AND C_KEY = 'SCRP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_APRV_FUNC_TYP',
	'SCRP',
	'41',
	'en_US',
	'Disposal schedule' ,
	'Approval process for disposal schedule');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_APRV_FUNC_TYP' AND C_KEY = 'STK_OTH_GI' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_APRV_FUNC_TYP',
	'STK_OTH_GI',
	'42',
	'en_US',
	'Other accounting GI schedule' ,
	'Approval process for other accounting GI schedule');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_APRV_FUNC_TYP' AND C_KEY = 'STK_OTH_GR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_APRV_FUNC_TYP',
	'STK_OTH_GR',
	'43',
	'en_US',
	'Other accounting GR schedule' ,
	'Approval process for other accounting GR schedule');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_APRV_FUNC_TYP' AND C_KEY = 'PAY_SCHD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_APRV_FUNC_TYP',
	'PAY_SCHD',
	'51',
	'en_US',
	'Payment schedule' ,
	'Approval process for payment schedule');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_APRV_FUNC_TYP' AND C_KEY = 'MST_STD_SLS_UPRI' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_APRV_FUNC_TYP',
	'MST_STD_SLS_UPRI',
	'A1',
	'en_US',
	'Master (Standard sales unit price)' ,
	'Approval process for standard sales price unit master.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_APRV_FUNC_TYP' AND C_KEY = 'MST_ITM_SLS_UPRI' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_APRV_FUNC_TYP',
	'MST_ITM_SLS_UPRI',
	'A2',
	'en_US',
	'Master (Item sales unit price)' ,
	'Approval process for item sales unit price master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_APRV_FUNC_TYP' AND C_KEY = 'MST_CST_SLS_UPRI' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_APRV_FUNC_TYP',
	'MST_CST_SLS_UPRI',
	'A3',
	'en_US',
	'Master (Customer sales unit price)' ,
	'Approval process for customer sales unit price master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_APRV_FUNC_TYP' AND C_KEY = 'MST_PURC_UPRI' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_APRV_FUNC_TYP',
	'MST_PURC_UPRI',
	'B1',
	'en_US',
	'Master (Purchasing unit price)' ,
	'Approval process for purchase unit price master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_APRV_FUNC_TYP' AND C_KEY = 'MST_PROC_UPRI' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_APRV_FUNC_TYP',
	'MST_PROC_UPRI',
	'B2',
	'en_US',
	'Master (Subcontracting unit price)' ,
	'Approval process for subcontracting unit price master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_APRV_FUNC_TYP' AND C_KEY = 'MST_PROV_UPRI' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_APRV_FUNC_TYP',
	'MST_PROV_UPRI',
	'B3',
	'en_US',
	'Master (Supply unit price)' ,
	'Approval process for supply unit price master');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_AR_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_AR_TYP',
	'en_US',
	'AR type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AR_TYP' AND C_KEY = 'AR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AR_TYP',
	'AR',
	'1',
	'en_US',
	'AR amount' ,
	'AR amount');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AR_TYP' AND C_KEY = 'AC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AR_TYP',
	'AC',
	'2',
	'en_US',
	'Other accounts receivable amount' ,
	'Other accounts receivable amount');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_INPT_CTL_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_INPT_CTL_TYP',
	'en_US',
	'Input control type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_INPT_CTL_TYP' AND C_KEY = 'MRP_INPT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_INPT_CTL_TYP',
	'MRP_INPT',
	'1',
	'en_US',
	'For MRP/Input' ,
	'Include in MRP or input');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_INPT_CTL_TYP' AND C_KEY = 'NO_MRP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_INPT_CTL_TYP',
	'NO_MRP',
	'2',
	'en_US',
	'Not for MRP (Allow input)' ,
	'Do not include in MRP process, but possible to input');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_INPT_CTL_TYP' AND C_KEY = 'NO_MRP_INST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_INPT_CTL_TYP',
	'NO_MRP_INST',
	'3',
	'en_US',
	'Not for MRP (Only order sheet)' ,
	'Do not include in MRP process or input (only for output to order sheet)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_INPT_CTL_TYP' AND C_KEY = 'MRP_NOT_FIX' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_INPT_CTL_TYP',
	'MRP_NOT_FIX',
	'4',
	'en_US',
	'For MRP/order not firm' ,
	'Include in MRP process, but created order cannot be firmed');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_PROC_UPRI_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_PROC_UPRI_TYP',
	'en_US',
	'Subcontracting unit price type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PROC_UPRI_TYP' AND C_KEY = 'ITM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PROC_UPRI_TYP',
	'ITM',
	'1',
	'en_US',
	'Item subcontracting' ,
	'Unit price at item subcontracting');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_MFG_INST_UNIT_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_MFG_INST_UNIT_TYP',
	'en_US',
	'Mfg. order unit type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MFG_INST_UNIT_TYP' AND C_KEY = 'ITM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MFG_INST_UNIT_TYP',
	'ITM',
	'1',
	'en_US',
	'Item unit' ,
	'Order mfg. in item unit');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MFG_INST_UNIT_TYP' AND C_KEY = 'OPER' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MFG_INST_UNIT_TYP',
	'OPER',
	'2',
	'en_US',
	'Operation unit' ,
	'Perform mfg. order per operation');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_COMP_SPEC_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_COMP_SPEC_TYP',
	'en_US',
	'Configuration/specification management type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COMP_SPEC_TYP' AND C_KEY = 'NO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COMP_SPEC_TYP',
	'NO',
	'1',
	'en_US',
	'Do not manage configuration/specification' ,
	'Do not manage configuration/specification');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COMP_SPEC_TYP' AND C_KEY = 'COMP_SPEC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COMP_SPEC_TYP',
	'COMP_SPEC',
	'2',
	'en_US',
	'Manage configuration/specification' ,
	'Enter configuration and specification in quotation entry / sales order entry');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COMP_SPEC_TYP' AND C_KEY = 'SPEC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COMP_SPEC_TYP',
	'SPEC',
	'3',
	'en_US',
	'Manage specification only' ,
	'Enter specification but not configuration in quotation entry / sales order entry');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_AR_TRD_GRP_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_AR_TRD_GRP_TYP',
	'en_US',
	'AR transaction group type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AR_TRD_GRP_TYP' AND C_KEY = 'SLS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AR_TRD_GRP_TYP',
	'SLS',
	'1',
	'en_US',
	'Sales result' ,
	'Sales');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AR_TRD_GRP_TYP' AND C_KEY = 'SLS_RTN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AR_TRD_GRP_TYP',
	'SLS_RTN',
	'2',
	'en_US',
	'Sales return' ,
	'Sales return');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AR_TRD_GRP_TYP' AND C_KEY = 'SLS_DSCNT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AR_TRD_GRP_TYP',
	'SLS_DSCNT',
	'3',
	'en_US',
	'Sales discount' ,
	'Sales discount');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AR_TRD_GRP_TYP' AND C_KEY = 'RCV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AR_TRD_GRP_TYP',
	'RCV',
	'4',
	'en_US',
	'Payment received' ,
	'Payment received');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AR_TRD_GRP_TYP' AND C_KEY = 'SETOFF' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AR_TRD_GRP_TYP',
	'SETOFF',
	'5',
	'en_US',
	'Offset' ,
	'Offset');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AR_TRD_GRP_TYP' AND C_KEY = 'ARSW' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AR_TRD_GRP_TYP',
	'ARSW',
	'6',
	'en_US',
	'AR balance transfer' ,
	'AR balance transfer');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AR_TRD_GRP_TYP' AND C_KEY = 'TAX_DIFF' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AR_TRD_GRP_TYP',
	'TAX_DIFF',
	'7',
	'en_US',
	'Tax difference' ,
	'Tax difference');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_SLIP_TITLE_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_SLIP_TITLE_TYP',
	'en_US',
	'Slip title type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SLIP_TITLE_TYP' AND C_KEY = 'DLV_SLIP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SLIP_TITLE_TYP',
	'DLV_SLIP',
	'1',
	'en_US',
	'Delivery note' ,
	'Print "delivery note" in title of slip (Report)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SLIP_TITLE_TYP' AND C_KEY = 'PROV_SLIP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SLIP_TITLE_TYP',
	'PROV_SLIP',
	'2',
	'en_US',
	'Supply report' ,
	'Print "supply note" in title of slip (Report)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SLIP_TITLE_TYP' AND C_KEY = 'XFR_SLIP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SLIP_TITLE_TYP',
	'XFR_SLIP',
	'3',
	'en_US',
	'Transfer slip' ,
	'Print "transfer slip" in title of slip (Report)');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'en_US',
	'Transaction pattern type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'SLS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'SLS',
	'A010',
	'en_US',
	'Sales result' ,
	'Record shipping/sales result');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'SLS_CNSGN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'SLS_CNSGN',
	'A011',
	'en_US',
	'Consignment sales' ,
	'Record the sales result according to the usage level of delivery destination inventory');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'SLS_RTN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'SLS_RTN',
	'A020',
	'en_US',
	'Sales return' ,
	'Record receipt/sales result due to sales returns from customers');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'SLS_DSCNT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'SLS_DSCNT',
	'A030',
	'en_US',
	'Sales discount' ,
	'Record sales result with sales discount');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'SLS_XTRA' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'SLS_XTRA',
	'A040',
	'en_US',
	'Sales markup' ,
	'Record sales result with sales surplus');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'MFG' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'MFG',
	'B010',
	'en_US',
	'Mfg.' ,
	'Record output result/input result due to mfg.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'PURC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'PURC',
	'C010',
	'en_US',
	'Purchase' ,
	'Record the purchase result associated with purchasing');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'PURC_VMI' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'PURC_VMI',
	'C011',
	'en_US',
	'VMI purchase' ,
	'Record purchase result incurred by VMI item usage');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'PURC_XPNS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'PURC_XPNS',
	'C020',
	'en_US',
	'Expense purchase' ,
	'Record purchase result with expense purchase');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'PURC_RTN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'PURC_RTN',
	'C030',
	'en_US',
	'Purchase return' ,
	'Record purchase return result due to purchase return to the supplier');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'PURC_RTN_XPNS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'PURC_RTN_XPNS',
	'C040',
	'en_US',
	'Expense purchase return' ,
	'Record purchase return result for expense purchase to the supplier');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'PURC_DSCNT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'PURC_DSCNT',
	'C050',
	'en_US',
	'Purchase discount' ,
	'Record purchase result with purchase discount');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'PURC_DSCNT_XPNS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'PURC_DSCNT_XPNS',
	'C060',
	'en_US',
	'Expenses discount' ,
	'Record purchase result with expenses discount');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'PURC_XTRA' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'PURC_XTRA',
	'C070',
	'en_US',
	'Purchase markup' ,
	'Record purchase result with purchase surplus');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'PURC_XTRA_XPNS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'PURC_XTRA_XPNS',
	'C080',
	'en_US',
	'Expenses markup' ,
	'Record purchase result with expenses surplus');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'SHIP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'SHIP',
	'D010',
	'en_US',
	'Shipping' ,
	'Record shipping result without sales at the customer');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'SHIP_RTN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'SHIP_RTN',
	'D020',
	'en_US',
	'Shipping return' ,
	'Record receipt result due to inventory return before acceptance by the customer');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'XFR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'XFR',
	'D030',
	'en_US',
	'Movement/transport' ,
	'Record the movement result with inventory movement within distribution group, or the result of shipment/receipt with inventory transfer between distribution groups');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'XFR_RTN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'XFR_RTN',
	'D040',
	'en_US',
	'Movement/transport return' ,
	'Record the movement result due to returns within distribution group, or the result of shipment/receipt due to returns between distribution groups');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'PROV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'PROV',
	'D050',
	'en_US',
	'Supply' ,
	'Record non-chargeable/chargeable result for supplier');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'PROV_RTN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'PROV_RTN',
	'D060',
	'en_US',
	'Supply return' ,
	'Record non-chargeable/chargeable result due to supply item returns from supplier');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'ARR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'ARR',
	'D070',
	'en_US',
	'Receipt' ,
	'Record receipt of VMI items or customer inventory items');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'ARR_RTN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'ARR_RTN',
	'D080',
	'en_US',
	'Receipt return' ,
	'Record the return result of other company''s asset inventory due to purchasing');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'STK_OTH_GR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'STK_OTH_GR',
	'D090',
	'en_US',
	'Other accounting GR' ,
	'Record other accounting result with other accounting GR');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'STK_OTH_GI' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'STK_OTH_GI',
	'D100',
	'en_US',
	'Other accounting GI' ,
	'Record other accounting result with other accounting GI');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'SCRP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'SCRP',
	'D110',
	'en_US',
	'Disposal' ,
	'Record other accounting result due to disposal');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'XFR_ITM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'XFR_ITM',
	'D120',
	'en_US',
	'Item transfer' ,
	'Record inventory transfer result with item transfer');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'XFR_LOT_SNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'XFR_LOT_SNO',
	'D130',
	'en_US',
	'Lot/SEIBAN No. transfer' ,
	'Record inventory transfer result occurred with lot/SEIBAN No. transfer');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'XFR_GRD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'XFR_GRD',
	'D140',
	'en_US',
	'Grading/conforming type transfer' ,
	'Record inventory transfer result due to grading/conforming transfer');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'XFR_PACK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'XFR_PACK',
	'D150',
	'en_US',
	'SKU transfer' ,
	'Record inventory transfer result due to SKU transfer');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'STK_ADJST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'STK_ADJST',
	'D160',
	'en_US',
	'Inventory count' ,
	'Record counted result by applied inventory variance');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'INSP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'INSP',
	'E010',
	'en_US',
	'Inspection' ,
	'Record the inspection result due to inspection request');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'REINSP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'REINSP',
	'E020',
	'en_US',
	'Re-inspect' ,
	'Record inspection result with re-explosion request');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'INSP_SMPL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'INSP_SMPL',
	'E030',
	'en_US',
	'Sampling' ,
	'Record inspection result due to sampling inspection');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'RCV_AR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'RCV_AR',
	'0102',
	'en_US',
	'Sales payment received' ,
	'Record result of sales payment received');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'RCV_ADV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'RCV_ADV',
	'0103',
	'en_US',
	'Advance received payment' ,
	'Record results of advance payment received');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'RCV_SUSP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'RCV_SUSP',
	'0104',
	'en_US',
	'Suspense received payment' ,
	'Record suspense received payment result');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'SETOFF_ADV_AR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'SETOFF_ADV_AR',
	'0302',
	'en_US',
	'Advance received/AR offset' ,
	'Record result of advance received/AR offset');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'SETOFF_ADV_OTH' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'SETOFF_ADV_OTH',
	'0309',
	'en_US',
	'Advance received/other accounting offset' ,
	'Record the results of advance received/other accounting offset');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'SETOFF_SUSP_AR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'SETOFF_SUSP_AR',
	'0402',
	'en_US',
	'Suspense received/AR offset' ,
	'Record suspense received/AR offset result');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'SETOFF_SUSP_ADV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'SETOFF_SUSP_ADV',
	'0403',
	'en_US',
	'Suspense received/advance received offset' ,
	'Record suspense received/advance received offset result');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'SETOFF_SUSP_OTH' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'SETOFF_SUSP_OTH',
	'0409',
	'en_US',
	'Suspense received/other accounting offset' ,
	'Record suspense received/other accounting offset result');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'SETOFF_OTR_AR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'SETOFF_OTR_AR',
	'0902',
	'en_US',
	'Other accounting/AR offset' ,
	'Record result of other account/AR offset');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'ARSW_OUT_BILL_BAL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'ARSW_OUT_BILL_BAL',
	'1011',
	'en_US',
	'Billing balance transfer issue' ,
	'Record result of billing balance transfer issue');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'ARSW_OUT_NOT_BILL_BAL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'ARSW_OUT_NOT_BILL_BAL',
	'1012',
	'en_US',
	'Unbilled balance transfer issue' ,
	'Record result of unbilled balance transfer issue');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'ARSW_IN_BILL_BAL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'ARSW_IN_BILL_BAL',
	'2011',
	'en_US',
	'Billing balance transfer receipt' ,
	'Record result of billing balance transfer receipt');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'ARSW_IN_NOT_BILL_BAL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'ARSW_IN_NOT_BILL_BAL',
	'2012',
	'en_US',
	'Unbilled balance transfer receipt' ,
	'Record result of unbilled balance transfer receipt');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'TAX_DIFF_BILL_CL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'TAX_DIFF_BILL_CL',
	'3031',
	'en_US',
	'Tax difference at billing' ,
	'Record result of tax difference at billing');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'TAX_DIFF_PAY_SCHD_CL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'TAX_DIFF_PAY_SCHD_CL',
	'F010',
	'en_US',
	'Tax difference at payment schedule' ,
	'Record result of tax difference at payment schedule');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TRD_PTN_TYP' AND C_KEY = 'APSW_IN_CHK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TRD_PTN_TYP',
	'APSW_IN_CHK',
	'F011',
	'en_US',
	'Collated balance transfer receipt' ,
	'Record result of collated balance transfer receipt');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_BILL_DPT_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_BILL_DPT_TYP',
	'en_US',
	'Billing dept. type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BILL_DPT_TYP' AND C_KEY = 'SLS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BILL_DPT_TYP',
	'SLS',
	'1',
	'en_US',
	'Sales dept.' ,
	'Copy sales dept. to billing dept.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BILL_DPT_TYP' AND C_KEY = 'AR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BILL_DPT_TYP',
	'AR',
	'2',
	'en_US',
	'AR dept.' ,
	'Copy AR dept. to billing dept.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BILL_DPT_TYP' AND C_KEY = 'BILL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BILL_DPT_TYP',
	'BILL',
	'3',
	'en_US',
	'Billing dept.' ,
	'Copy billing dept. in charge that is set to a billing customer');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_SHIP_INST_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_SHIP_INST_TYP',
	'en_US',
	'Shipping order type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SHIP_INST_TYP' AND C_KEY = 'PICK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SHIP_INST_TYP',
	'PICK',
	'1',
	'en_US',
	'With picking' ,
	'Perform shipping order and process shipping with picking and distribution functions. *Available for both inventory and MRO supply');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SHIP_INST_TYP' AND C_KEY = 'NO_PICK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SHIP_INST_TYP',
	'NO_PICK',
	'2',
	'en_US',
	'Without picking' ,
	'Perform shipping order but not picking work (Not list on picking list). *Available for MRO supply (Assume items that appear only on reports such as freight, insurance, etc.)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SHIP_INST_TYP' AND C_KEY = 'NON' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SHIP_INST_TYP',
	'NON',
	'3',
	'en_US',
	'Non-target' ,
	'Perform shipping/sales entry without performing shipping order (Without using distribution function) *Available for both inventory and MRO supply');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_AP_STTL_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_AP_STTL_TYP',
	'en_US',
	'AP settlement type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AP_STTL_TYP' AND C_KEY = 'ACNT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AP_STTL_TYP',
	'ACNT',
	'1',
	'en_US',
	'Deposit' ,
	'Indicates to pay from deposit');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AP_STTL_TYP' AND C_KEY = 'ACNT_COM_PAID' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AP_STTL_TYP',
	'ACNT_COM_PAID',
	'2',
	'en_US',
	'Deposit (Fee)' ,
	'Means to pay fee from deposit');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AP_STTL_TYP' AND C_KEY = 'CASH' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AP_STTL_TYP',
	'CASH',
	'3',
	'en_US',
	'Cash' ,
	'Indicate to pay in cash');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AP_STTL_TYP' AND C_KEY = 'CASH_COM_PAID' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AP_STTL_TYP',
	'CASH_COM_PAID',
	'4',
	'en_US',
	'Cash (Fee)' ,
	'Means to pay fee in cash');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AP_STTL_TYP' AND C_KEY = 'NOTE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AP_STTL_TYP',
	'NOTE',
	'5',
	'en_US',
	'Notes' ,
	'Indicate to pay by note');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AP_STTL_TYP' AND C_KEY = 'SETOFF' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AP_STTL_TYP',
	'SETOFF',
	'6',
	'en_US',
	'Offset' ,
	'Indicate to offset');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AP_STTL_TYP' AND C_KEY = 'WTAX' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AP_STTL_TYP',
	'WTAX',
	'7',
	'en_US',
	'Withholding tax' ,
	'Indicate to pay withholding tax');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AP_STTL_TYP' AND C_KEY = 'APSW_OUT_CHK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AP_STTL_TYP',
	'APSW_OUT_CHK',
	'A',
	'en_US',
	'Collated balance transfer issue' ,
	'Means to issue a collated balance transfer');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AP_STTL_TYP' AND C_KEY = 'APSW_IN_CHK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AP_STTL_TYP',
	'APSW_IN_CHK',
	'B',
	'en_US',
	'Collated balance transfer receipt' ,
	'Means to receive a collated balance transfer');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AP_STTL_TYP' AND C_KEY = 'APSW_OUT_NOT_CHK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AP_STTL_TYP',
	'APSW_OUT_NOT_CHK',
	'C',
	'en_US',
	'Uncollated balance transfer issue' ,
	'Means to issue an uncollated balance transfer');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AP_STTL_TYP' AND C_KEY = 'APSW_IN_NOT_CHK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AP_STTL_TYP',
	'APSW_IN_NOT_CHK',
	'D',
	'en_US',
	'Uncollated balance transfer receipt' ,
	'Means to receive an uncollated balance transfer');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_PERIOD_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_PERIOD_TYP',
	'en_US',
	'Period type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PERIOD_TYP' AND C_KEY = 'DAILY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PERIOD_TYP',
	'DAILY',
	'1',
	'en_US',
	'Daily' ,
	'Indicate processing daily');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PERIOD_TYP' AND C_KEY = 'WEEKLY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PERIOD_TYP',
	'WEEKLY',
	'2',
	'en_US',
	'Weekly' ,
	'Indicate processing weekly');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PERIOD_TYP' AND C_KEY = 'TENDAYS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PERIOD_TYP',
	'TENDAYS',
	'3',
	'en_US',
	'Every 10 days' ,
	'Indicate processing with 10 days unit');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PERIOD_TYP' AND C_KEY = 'MONTHLY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PERIOD_TYP',
	'MONTHLY',
	'4',
	'en_US',
	'Monthly' ,
	'Indicate processing monthly');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_VIA_DLV_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_VIA_DLV_TYP',
	'en_US',
	'Receiving point stopover type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_VIA_DLV_TYP' AND C_KEY = 'VIA' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_VIA_DLV_TYP',
	'VIA',
	'1',
	'en_US',
	'With stopover' ,
	'After shipping to receiving point, it will be the inventory of receiving point');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_VIA_DLV_TYP' AND C_KEY = 'NOT_VIA' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_VIA_DLV_TYP',
	'NOT_VIA',
	'2',
	'en_US',
	'Without stopover' ,
	'Ships to receiving point, but will not be the inventory of receiving point');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_RQMT_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_RQMT_TYP',
	'en_US',
	'Requirements type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RQMT_TYP' AND C_KEY = 'NON' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RQMT_TYP',
	'NON',
	'1',
	'en_US',
	'Ignore inventory' ,
	'Do not consider current inventory or remaining order (GR schedule) for data entered in daily production request, but create an order');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RQMT_TYP' AND C_KEY = 'ALLOC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RQMT_TYP',
	'ALLOC',
	'2',
	'en_US',
	'Add inventory' ,
	'Consider current inventory or remaining order (GR schedule) for data entered in daily production request, and create shortage qty. as an order');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_SLIP_STS_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_SLIP_STS_TYP',
	'en_US',
	'Slip status type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SLIP_STS_TYP' AND C_KEY = 'CRT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SLIP_STS_TYP',
	'CRT',
	'1',
	'en_US',
	'New' ,
	'Show new slip');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SLIP_STS_TYP' AND C_KEY = 'DIS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SLIP_STS_TYP',
	'DIS',
	'2',
	'en_US',
	'Invalid' ,
	'Show invalid slip');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SLIP_STS_TYP' AND C_KEY = 'CAN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SLIP_STS_TYP',
	'CAN',
	'3',
	'en_US',
	'Cancel' ,
	'Display cancel slip');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_BP_ADDR_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_BP_ADDR_TYP',
	'en_US',
	'BP destination type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_ADDR_TYP' AND C_KEY = 'ZIP_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_ADDR_TYP',
	'ZIP_CD',
	'11',
	'en_US',
	'Zip code' ,
	'BP zip code');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_ADDR_TYP' AND C_KEY = 'ADDR1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_ADDR_TYP',
	'ADDR1',
	'12',
	'en_US',
	'Address 1' ,
	'BP 1 address');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_ADDR_TYP' AND C_KEY = 'ADDR2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_ADDR_TYP',
	'ADDR2',
	'13',
	'en_US',
	'Address 2' ,
	'BP 2 address');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_ADDR_TYP' AND C_KEY = 'ADDR3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_ADDR_TYP',
	'ADDR3',
	'14',
	'en_US',
	'Address 3' ,
	'BP 3 address');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_ADDR_TYP' AND C_KEY = 'ADDR4' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_ADDR_TYP',
	'ADDR4',
	'15',
	'en_US',
	'Address 4' ,
	'BP 4 address');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_ADDR_TYP' AND C_KEY = 'TEL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_ADDR_TYP',
	'TEL',
	'16',
	'en_US',
	'TEL' ,
	'BP TEL');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_ADDR_TYP' AND C_KEY = 'FAX' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_ADDR_TYP',
	'FAX',
	'17',
	'en_US',
	'FAX' ,
	'BP FAX');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_ADDR_TYP' AND C_KEY = 'CST_CNTCT_DPT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_ADDR_TYP',
	'CST_CNTCT_DPT',
	'21',
	'en_US',
	'Customer dept.' ,
	'Dept. for customer');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_ADDR_TYP' AND C_KEY = 'CST_CNTCT_PSN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_ADDR_TYP',
	'CST_CNTCT_PSN',
	'22',
	'en_US',
	'Customer PIC' ,
	'PIC for customer');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_ADDR_TYP' AND C_KEY = 'CST_CNTCT_PSN_TITLE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_ADDR_TYP',
	'CST_CNTCT_PSN_TITLE',
	'23',
	'en_US',
	'Form of address for Customer PIC' ,
	'PIC form of address for customer');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_ADDR_TYP' AND C_KEY = 'SPPL_CNTCT_DPT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_ADDR_TYP',
	'SPPL_CNTCT_DPT',
	'61',
	'en_US',
	'Supplier dept.' ,
	'Dept. for supplier');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_ADDR_TYP' AND C_KEY = 'SPPL_CNTCT_PSN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_ADDR_TYP',
	'SPPL_CNTCT_PSN',
	'62',
	'en_US',
	'Supplier PIC' ,
	'PIC for supplier');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_ADDR_TYP' AND C_KEY = 'SPPL_CNTCT_PSN_TITLE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_ADDR_TYP',
	'SPPL_CNTCT_PSN_TITLE',
	'63',
	'en_US',
	'Supplier PIC form of address' ,
	'PIC form of address for supplier');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_ADDR_TYP' AND C_KEY = 'DLV_CNTCT_DPT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_ADDR_TYP',
	'DLV_CNTCT_DPT',
	'31',
	'en_US',
	'Delivery destination dept.' ,
	'Dept. for delivery destination');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_ADDR_TYP' AND C_KEY = 'DLV_CNTCT_PSN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_ADDR_TYP',
	'DLV_CNTCT_PSN',
	'32',
	'en_US',
	'Delivery destination PIC' ,
	'PIC for delivery destination');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_ADDR_TYP' AND C_KEY = 'DLV_CNTCT_PSN_TITLE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_ADDR_TYP',
	'DLV_CNTCT_PSN_TITLE',
	'33',
	'en_US',
	'Delivery destination PIC honorific' ,
	'PIC form of address for delivery destination');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_ADDR_TYP' AND C_KEY = 'BILL_ZIP_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_ADDR_TYP',
	'BILL_ZIP_CD',
	'41',
	'en_US',
	'Invoice send-to zip code' ,
	'Invoice send-to ZIP code');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_ADDR_TYP' AND C_KEY = 'BILL_ADDR1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_ADDR_TYP',
	'BILL_ADDR1',
	'42',
	'en_US',
	'Invoice send-to address 1' ,
	'Invoice send-to address 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_ADDR_TYP' AND C_KEY = 'BILL_ADDR2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_ADDR_TYP',
	'BILL_ADDR2',
	'43',
	'en_US',
	'Invoice send-to address 2' ,
	'Invoice send-to address 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_ADDR_TYP' AND C_KEY = 'BILL_ADDR3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_ADDR_TYP',
	'BILL_ADDR3',
	'44',
	'en_US',
	'Invoice send-to address 3' ,
	'Invoice send-to address 3');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_ADDR_TYP' AND C_KEY = 'BILL_ADDR4' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_ADDR_TYP',
	'BILL_ADDR4',
	'45',
	'en_US',
	'Invoice send-to address 4' ,
	'Invoice send-to address 4');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_ADDR_TYP' AND C_KEY = 'BILL_TEL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_ADDR_TYP',
	'BILL_TEL',
	'46',
	'en_US',
	'Invoice send-to TEL' ,
	'Invoice send-to TEL No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_ADDR_TYP' AND C_KEY = 'BILL_BCST_NM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_ADDR_TYP',
	'BILL_BCST_NM',
	'47',
	'en_US',
	'Invoice destination' ,
	'Invoice send-to destination');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_ADDR_TYP' AND C_KEY = 'BILL_BCST_DPT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_ADDR_TYP',
	'BILL_BCST_DPT',
	'51',
	'en_US',
	'Invoice send-to dept.' ,
	'Invoice send-to dept.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_ADDR_TYP' AND C_KEY = 'BILL_BCST_PSN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_ADDR_TYP',
	'BILL_BCST_PSN',
	'52',
	'en_US',
	'Invoice send-to PIC' ,
	'Invoice send-to PIC');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_ADDR_TYP' AND C_KEY = 'BILL_BCST_PSN_TITLE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_ADDR_TYP',
	'BILL_BCST_PSN_TITLE',
	'53',
	'en_US',
	'Invoice send-to PIC honorific' ,
	'Invoice send-to PIC honorific tile');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_LOC_ADDR_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_LOC_ADDR_TYP',
	'en_US',
	'Location destination type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_LOC_ADDR_TYP' AND C_KEY = 'ZIP_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_LOC_ADDR_TYP',
	'ZIP_CD',
	'11',
	'en_US',
	'Zip code' ,
	'Zip code');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_LOC_ADDR_TYP' AND C_KEY = 'ADDR1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_LOC_ADDR_TYP',
	'ADDR1',
	'12',
	'en_US',
	'Address 1' ,
	'Address 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_LOC_ADDR_TYP' AND C_KEY = 'ADDR2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_LOC_ADDR_TYP',
	'ADDR2',
	'13',
	'en_US',
	'Address 2' ,
	'Address 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_LOC_ADDR_TYP' AND C_KEY = 'ADDR3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_LOC_ADDR_TYP',
	'ADDR3',
	'14',
	'en_US',
	'Address 3' ,
	'Address 3');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_LOC_ADDR_TYP' AND C_KEY = 'ADDR4' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_LOC_ADDR_TYP',
	'ADDR4',
	'15',
	'en_US',
	'Address 4' ,
	'Address 4');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_LOC_ADDR_TYP' AND C_KEY = 'TEL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_LOC_ADDR_TYP',
	'TEL',
	'16',
	'en_US',
	'TEL' ,
	'TEL');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_LOC_ADDR_TYP' AND C_KEY = 'FAX' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_LOC_ADDR_TYP',
	'FAX',
	'17',
	'en_US',
	'FAX' ,
	'FAX');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_PROD_PLN_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_PROD_PLN_TYP',
	'en_US',
	'Production planning type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PROD_PLN_TYP' AND C_KEY = 'DMND_USE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PROD_PLN_TYP',
	'DMND_USE',
	'1',
	'en_US',
	'Use supply and demand management function' ,
	'Create data corresponding to the daily production request based on the supply and demand management function (demand based on sales plan/customers period forecast)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PROD_PLN_TYP' AND C_KEY = 'MLY_RQMT_USE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PROD_PLN_TYP',
	'MLY_RQMT_USE',
	'2',
	'en_US',
	'Use the monthly production request function' ,
	'Create daily production request based on monthly production request');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PROD_PLN_TYP' AND C_KEY = 'NOT_USE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PROD_PLN_TYP',
	'NOT_USE',
	'3',
	'en_US',
	'Do not plan production' ,
	'Do not be created from demand and supply management nor monthly production management');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_INPT_ITM_ADD_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_INPT_ITM_ADD_TYP',
	'en_US',
	'Input item addition allowed type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_INPT_ITM_ADD_TYP' AND C_KEY = 'OK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_INPT_ITM_ADD_TYP',
	'OK',
	'1',
	'en_US',
	'Allow addition' ,
	'Can add any input item');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_INPT_ITM_ADD_TYP' AND C_KEY = 'NG' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_INPT_ITM_ADD_TYP',
	'NG',
	'2',
	'en_US',
	'Not add' ,
	'Can not add any input item');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_INPT_ITM_DEL_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_INPT_ITM_DEL_TYP',
	'en_US',
	'Input item deletion allowed type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_INPT_ITM_DEL_TYP' AND C_KEY = 'OK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_INPT_ITM_DEL_TYP',
	'OK',
	'1',
	'en_US',
	'Allow delete' ,
	'Can delete input item defined in BOM');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_INPT_ITM_DEL_TYP' AND C_KEY = 'NG' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_INPT_ITM_DEL_TYP',
	'NG',
	'2',
	'en_US',
	'Undeletable' ,
	'Cannot delete input item defined in BOM');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_SCH_TGT_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_SCH_TGT_TYP',
	'en_US',
	'Scheduler target type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SCH_TGT_TYP' AND C_KEY = 'LINK_SCH' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SCH_TGT_TYP',
	'LINK_SCH',
	'1',
	'en_US',
	'Target' ,
	'Cooperate with external scheduler system');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SCH_TGT_TYP' AND C_KEY = 'NON' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SCH_TGT_TYP',
	'NON',
	'2',
	'en_US',
	'Non-target' ,
	'Do not cooperate with external scheduler system');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_STD_UPRI_SEL_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_STD_UPRI_SEL_TYP',
	'en_US',
	'Standard unit cost acquisition type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STD_UPRI_SEL_TYP' AND C_KEY = 'STD_UPRI' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STD_UPRI_SEL_TYP',
	'STD_UPRI',
	'1',
	'en_US',
	'Standard unit price' ,
	'Acquire value from standard unit price.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STD_UPRI_SEL_TYP' AND C_KEY = 'SUB_UPRI1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STD_UPRI_SEL_TYP',
	'SUB_UPRI1',
	'2',
	'en_US',
	'Spare unit price 1 -> Standard unit price' ,
	'Acquire value from spare unit price 1.\n* If no spare unit price 1 is set, acquire from standard unit price.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STD_UPRI_SEL_TYP' AND C_KEY = 'SUB_UPRI2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STD_UPRI_SEL_TYP',
	'SUB_UPRI2',
	'3',
	'en_US',
	'Spare unit price 2 -> Standard unit price' ,
	'Acquire value from spare unit price 2.\n* If no spare unit price 2 is set, acquire from standard unit price.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_STD_UPRI_SEL_TYP' AND C_KEY = 'SUB_UPRI3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_STD_UPRI_SEL_TYP',
	'SUB_UPRI3',
	'4',
	'en_US',
	'Spare unit price 3 -> Standard unit price' ,
	'Acquire value from spare unit price 3.\n* If no spare unit price 3 is set, acquire from standard unit price.');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_WG_RQST_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_WG_RQST_TYP',
	'en_US',
	'Type of inventory request from other WG' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_WG_RQST_TYP' AND C_KEY = 'XFR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_WG_RQST_TYP',
	'XFR',
	'1',
	'en_US',
	'Transport request' ,
	'Inventory transfer request for supplying to request source');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_WG_RQST_TYP' AND C_KEY = 'PURC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_WG_RQST_TYP',
	'PURC',
	'2',
	'en_US',
	'Purchase request' ,
	'Purchase request for supplying to request source');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_WG_RQST_TYP' AND C_KEY = 'SHIP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_WG_RQST_TYP',
	'SHIP',
	'3',
	'en_US',
	'Shipping request' ,
	'Shipping request to delivery destination');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_OUTSRC_UPRI_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_OUTSRC_UPRI_TYP',
	'en_US',
	'Subcontracting unit price type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_OUTSRC_UPRI_TYP' AND C_KEY = 'PROC_PROV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_OUTSRC_UPRI_TYP',
	'PROC_PROV',
	'1',
	'en_US',
	'Subcontracting unit price + Chargeable supply unit price' ,
	'Acquired from the Subcontracting unit price and the Chargeable supply unit price\n※Unit price that does not include the Chargeable supply unit price should be set in the Subcontracting unit price master.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_OUTSRC_UPRI_TYP' AND C_KEY = 'PROC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_OUTSRC_UPRI_TYP',
	'PROC',
	'2',
	'en_US',
	'Subcontracting unit price' ,
	'Acquired from the Subcontracting unit price\n※Unit price including the Chargeable supply unit price should be set in the Subcontracting unit price master.');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_PURC_BASIS_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_PURC_BASIS_TYP',
	'en_US',
	'Purchase recording type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PURC_BASIS_TYP' AND C_KEY = 'ARR_BASIS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PURC_BASIS_TYP',
	'ARR_BASIS',
	'1',
	'en_US',
	'Receipt base' ,
	'Record purchase result at receipt result entry (Always record  simultaneously)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PURC_BASIS_TYP' AND C_KEY = 'IN_BASIS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PURC_BASIS_TYP',
	'IN_BASIS',
	'2',
	'en_US',
	'Acceptance base' ,
	'Record purchase result at acceptance entry (Do not record simultaneously)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PURC_BASIS_TYP' AND C_KEY = 'ANY_BASIS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PURC_BASIS_TYP',
	'ANY_BASIS',
	'9',
	'en_US',
	'Any time' ,
	'Record purchase result at any time');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_PRNT_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_PRNT_TYP',
	'en_US',
	'Report issue type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PRNT_TYP' AND C_KEY = 'INDIV_PRNT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PRNT_TYP',
	'INDIV_PRNT',
	'1',
	'en_US',
	'Issue individually' ,
	'Issue reports for each slip No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PRNT_TYP' AND C_KEY = 'NOT_INDIV_PRNT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PRNT_TYP',
	'NOT_INDIV_PRNT',
	'2',
	'en_US',
	'Do not issue individually' ,
	'Issue reports for each BP');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_DC_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_DC_TYP',
	'en_US',
	'Debit and credit type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DC_TYP' AND C_KEY = 'DR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DC_TYP',
	'DR',
	'1',
	'en_US',
	'Debit' ,
	'Debit');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DC_TYP' AND C_KEY = 'CR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DC_TYP',
	'CR',
	'2',
	'en_US',
	'Credit' ,
	'Credit');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_BP_SET_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_BP_SET_TYP',
	'en_US',
	'BP output type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_SET_TYP' AND C_KEY = 'NON' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_SET_TYP',
	'NON',
	'X',
	'en_US',
	'Do not use' ,
	'No output to journal data BP column');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_SET_TYP' AND C_KEY = 'AR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_SET_TYP',
	'AR',
	'1',
	'en_US',
	'AR customer' ,
	'Output AR customer to journal data BP column');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_SET_TYP' AND C_KEY = 'CST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_SET_TYP',
	'CST',
	'2',
	'en_US',
	'Customer' ,
	'Output customer to journal data BP column');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_SET_TYP' AND C_KEY = 'SPL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_SET_TYP',
	'SPL',
	'3',
	'en_US',
	'Supplier' ,
	'Output supplier to journal data BP column');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_SET_TYP' AND C_KEY = 'AP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_SET_TYP',
	'AP',
	'4',
	'en_US',
	'AP supplier' ,
	'Output AP supplier to journal data BP column');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_SET_TYP' AND C_KEY = 'CRE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_SET_TYP',
	'CRE',
	'5',
	'en_US',
	'Payer/Payee' ,
	'Output payer or payee to journal data BP column');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_SET_TYP' AND C_KEY = 'FIX_CST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_SET_TYP',
	'FIX_CST',
	'6',
	'en_US',
	'Fixed value (Company type = 1)' ,
	'Output BP specified in master to journal data BP column\nOutput 1 for BP type');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_SET_TYP' AND C_KEY = 'FIX_SPL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_SET_TYP',
	'FIX_SPL',
	'7',
	'en_US',
	'Fixed value (Company type = 2)' ,
	'Output BP specified in master to journal data BP column\nOutput 2 for BP type');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_SET_TYP' AND C_KEY = 'SO_CST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_SET_TYP',
	'SO_CST',
	'8',
	'en_US',
	'Offset destination (Company type = 1)' ,
	'Output offset destination to journal data BP column\nOutput BP type as 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BP_SET_TYP' AND C_KEY = 'SO_SPL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BP_SET_TYP',
	'SO_SPL',
	'9',
	'en_US',
	'Offset destination (Company type = 2)' ,
	'Output offset destination to journal data BP column\nOutput BP type as 2');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_ITM_SET_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_ITM_SET_TYP',
	'en_US',
	'Item output type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ITM_SET_TYP' AND C_KEY = 'NON' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ITM_SET_TYP',
	'NON',
	'X',
	'en_US',
	'Do not use' ,
	'No output to journal data item column');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ITM_SET_TYP' AND C_KEY = 'ITM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ITM_SET_TYP',
	'ITM',
	'1',
	'en_US',
	'Normal item' ,
	'Output own company item cd. to journal data item column');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ITM_SET_TYP' AND C_KEY = 'CST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ITM_SET_TYP',
	'CST',
	'2',
	'en_US',
	'Customer item' ,
	'Output customer item cd. to journal data item column');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ITM_SET_TYP' AND C_KEY = 'SPL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ITM_SET_TYP',
	'SPL',
	'3',
	'en_US',
	'Supplier item' ,
	'Output supplier item cd. to journal data item column');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ITM_SET_TYP' AND C_KEY = 'TRD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ITM_SET_TYP',
	'TRD',
	'4',
	'en_US',
	'Transfer item' ,
	'Output transfer item to journal data item column');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_AMT_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_AMT_TYP',
	'en_US',
	'Journal amount type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AMT_TYP' AND C_KEY = 'ZERO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AMT_TYP',
	'ZERO',
	'1',
	'en_US',
	'Amount is 0' ,
	'Set amount to export to 0');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AMT_TYP' AND C_KEY = 'AMT_TAX' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AMT_TYP',
	'AMT_TAX',
	'2',
	'en_US',
	'Amount without tax (Output tax amount)' ,
	'Output amount without tax to amount column\nOutput tax amount to tax column');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AMT_TYP' AND C_KEY = 'AMT_ONLY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AMT_TYP',
	'AMT_ONLY',
	'3',
	'en_US',
	'Amount without tax (Not output tax amount)' ,
	'Output only amount without tax to amount column (Tax amount is not output)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AMT_TYP' AND C_KEY = 'TAX_IN_AMT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AMT_TYP',
	'TAX_IN_AMT',
	'4',
	'en_US',
	'Tax amount (Output to amount column)' ,
	'Output tax amount to amount column');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AMT_TYP' AND C_KEY = 'TAX_IN_TAX' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AMT_TYP',
	'TAX_IN_TAX',
	'5',
	'en_US',
	'Tax amount (Output to tax amount column)' ,
	'Output tax amount to consumption tax column (Amount column is 0)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AMT_TYP' AND C_KEY = 'SML' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AMT_TYP',
	'SML',
	'6',
	'en_US',
	'Amount without tax + tax amount' ,
	'Output amount without tax + tax amount to amount column');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AMT_TYP' AND C_KEY = 'STD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AMT_TYP',
	'STD',
	'7',
	'en_US',
	'Standard evaluation amount' ,
	'Output the amount evaluated by standard cost price to the amount column');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AMT_TYP' AND C_KEY = 'AMT_STD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AMT_TYP',
	'AMT_STD',
	'8',
	'en_US',
	'Amount without tax - standard cost' ,
	'Output amount without tax - standard evaluation amount to amount column');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AMT_TYP' AND C_KEY = 'NON_JNL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AMT_TYP',
	'NON_JNL',
	'X',
	'en_US',
	'Not for journal' ,
	'Journal info. for corresponding record is not created');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AMT_TYP' AND C_KEY = 'PROC_AMT_TAX' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AMT_TYP',
	'PROC_AMT_TAX',
	'A',
	'en_US',
	'Subcontracting amount (Output tax amount)' ,
	'Output subcontracting amount to amount column\nOutput tax amount to tax column');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AMT_TYP' AND C_KEY = 'PROC_AMT_ONLY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AMT_TYP',
	'PROC_AMT_ONLY',
	'B',
	'en_US',
	'Subcontracting amount (Not output tax amount)' ,
	'Output only subcontracting amount to amount column (Tax amount is not output)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AMT_TYP' AND C_KEY = 'PROC_SML' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AMT_TYP',
	'PROC_SML',
	'C',
	'en_US',
	'Subcontracting amount + tax amount' ,
	'Output subcontracting amount + tax amount to amount column');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AMT_TYP' AND C_KEY = 'ONR_PROV_AMT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AMT_TYP',
	'ONR_PROV_AMT',
	'D',
	'en_US',
	'Chargeable supply amount' ,
	'Output chargeable supply amount to amount column');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_FOREIGN_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_FOREIGN_TYP',
	'en_US',
	'Foreign transaction type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_FOREIGN_TYP' AND C_KEY = 'INTERNAL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_FOREIGN_TYP',
	'INTERNAL',
	'1',
	'en_US',
	'Domestic transaction' ,
	'Create journal only for domestic transaction');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_FOREIGN_TYP' AND C_KEY = 'ABROAD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_FOREIGN_TYP',
	'ABROAD',
	'2',
	'en_US',
	'Foreign transaction' ,
	'Create journal only for foreign transaction');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_UN_FIX_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_UN_FIX_TYP',
	'en_US',
	'Amount unfirm type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_UN_FIX_TYP' AND C_KEY = 'FIX' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_UN_FIX_TYP',
	'FIX',
	'1',
	'en_US',
	'Firmed amount' ,
	'Create journal entries only for records with firmed amount');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_UN_FIX_TYP' AND C_KEY = 'UN_FIX' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_UN_FIX_TYP',
	'UN_FIX',
	'2',
	'en_US',
	'Unfirm amount' ,
	'Create journal for only record of temporary unit price or before invoice receiving');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_UN_FIX_TYP' AND C_KEY = 'TEMP_AP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_UN_FIX_TYP',
	'TEMP_AP',
	'3',
	'en_US',
	'Temporary AP' ,
	'Create journal for only records of temporary AP');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_QUALITY_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_QUALITY_TYP',
	'en_US',
	'Inventory conforming type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_QUALITY_TYP' AND C_KEY = 'GOOD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_QUALITY_TYP',
	'GOOD',
	'1',
	'en_US',
	'Conforming item' ,
	'Conforming item');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_QUALITY_TYP' AND C_KEY = 'DFCT_OPER' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_QUALITY_TYP',
	'DFCT_OPER',
	'2',
	'en_US',
	'Operation defective' ,
	'Defective item decided other than in inspection result');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_QUALITY_TYP' AND C_KEY = 'DFCT_INSP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_QUALITY_TYP',
	'DFCT_INSP',
	'3',
	'en_US',
	'Inspection defective' ,
	'Defective item decided in inspection result');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_QUALITY_TYP' AND C_KEY = 'SSPND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_QUALITY_TYP',
	'SSPND',
	'4',
	'en_US',
	'Pending' ,
	'Pending items not decided because of inspection cancellation');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_INV_LOC_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_INV_LOC_TYP',
	'en_US',
	'Inventory location type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_INV_LOC_TYP' AND C_KEY = 'COM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_INV_LOC_TYP',
	'COM',
	'1',
	'en_US',
	'Internal inventory' ,
	'Create journals only for inventory within own company');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_INV_LOC_TYP' AND C_KEY = 'OTH' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_INV_LOC_TYP',
	'OTH',
	'2',
	'en_US',
	'Inventory of other company' ,
	'Create journal only for inventory outside the company');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_INV_LOC_TYP' AND C_KEY = 'REPURC_OBLI' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_INV_LOC_TYP',
	'REPURC_OBLI',
	'3',
	'en_US',
	'Inventory of other company (Repurchase obligation)' ,
	'Create journal only for inventory with repurchase obligation');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_DPT_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_DPT_TYP',
	'en_US',
	'Journal dept. type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DPT_TYP' AND C_KEY = 'FIX' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DPT_TYP',
	'FIX',
	'M',
	'en_US',
	'Constant dept.' ,
	'Set specified dept. in master to dept. cd. of journal data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DPT_TYP' AND C_KEY = 'PURC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DPT_TYP',
	'PURC',
	'1',
	'en_US',
	'Purchasing dept.' ,
	'Set purchasing dept. to dept. code of journal data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DPT_TYP' AND C_KEY = 'AP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DPT_TYP',
	'AP',
	'2',
	'en_US',
	'AP dept.' ,
	'Set AP dept. to dept. code of journal data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DPT_TYP' AND C_KEY = 'SLS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DPT_TYP',
	'SLS',
	'3',
	'en_US',
	'Sales dept.' ,
	'Set sales dept. to dept. code of journal data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DPT_TYP' AND C_KEY = 'AR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DPT_TYP',
	'AR',
	'4',
	'en_US',
	'AR dept.' ,
	'Set AR dept. to dept. code of journal data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DPT_TYP' AND C_KEY = 'GI' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DPT_TYP',
	'GI',
	'5',
	'en_US',
	'GI dept.' ,
	'Set GI dept. to dept. cd. of journal data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DPT_TYP' AND C_KEY = 'GR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DPT_TYP',
	'GR',
	'6',
	'en_US',
	'GR dept.' ,
	'Set GR dept. to dept. cd. of journal data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DPT_TYP' AND C_KEY = 'BD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DPT_TYP',
	'BD',
	'7',
	'en_US',
	'Charged dept.' ,
	'Set charged dept. to dept. code of journal data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DPT_TYP' AND C_KEY = 'CR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DPT_TYP',
	'CR',
	'8',
	'en_US',
	'Payment received dept.' ,
	'Set payment receiving dept. or payment dept. to dept. cd. of journal data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DPT_TYP' AND C_KEY = 'SO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DPT_TYP',
	'SO',
	'9',
	'en_US',
	'Offset dept.' ,
	'Set offset dept. to dept. cd. of journal data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DPT_TYP' AND C_KEY = 'SUB1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DPT_TYP',
	'SUB1',
	'X',
	'en_US',
	'Spare dept. 1' ,
	'Set spare dept. 1 to dept. cd. of journal data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DPT_TYP' AND C_KEY = 'SUB2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DPT_TYP',
	'SUB2',
	'Y',
	'en_US',
	'Spare dept. 2' ,
	'Set spare dept. 2 to dept. cd. of journal data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DPT_TYP' AND C_KEY = 'SUB3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DPT_TYP',
	'SUB3',
	'Z',
	'en_US',
	'Spare dept. 3' ,
	'Set spare dept. 3 to dept. cd. of journal data');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_SUMMARY_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_SUMMARY_TYP',
	'en_US',
	'Aggregation type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SUMMARY_TYP' AND C_KEY = 'NON' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SUMMARY_TYP',
	'NON',
	'X',
	'en_US',
	'Do not aggregate' ,
	'Create journal data without aggregated');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SUMMARY_TYP' AND C_KEY = 'SLIP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SUMMARY_TYP',
	'SLIP',
	'1',
	'en_US',
	'Per slip' ,
	'Create journal data in slip No. unit');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SUMMARY_TYP' AND C_KEY = 'DD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SUMMARY_TYP',
	'DD',
	'2',
	'en_US',
	'Daily basis (Recording date)' ,
	'Create journal data by recording date');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SUMMARY_TYP' AND C_KEY = 'MM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SUMMARY_TYP',
	'MM',
	'3',
	'en_US',
	'Month basis' ,
	'Create journal data on monthly base');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_SUM_COL_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_SUM_COL_TYP',
	'en_US',
	'Aggregation column type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SUM_COL_TYP' AND C_KEY = 'SUM0' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SUM_COL_TYP',
	'SUM0',
	'110',
	'en_US',
	'Aggregated cd. 0' ,
	'Aggregated cd. 0');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SUM_COL_TYP' AND C_KEY = 'SUM1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SUM_COL_TYP',
	'SUM1',
	'111',
	'en_US',
	'Aggregated cd. 1' ,
	'Aggregated cd. 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SUM_COL_TYP' AND C_KEY = 'SUM2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SUM_COL_TYP',
	'SUM2',
	'112',
	'en_US',
	'Aggregated cd. 2' ,
	'Aggregated cd. 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SUM_COL_TYP' AND C_KEY = 'SUM3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SUM_COL_TYP',
	'SUM3',
	'113',
	'en_US',
	'Aggregated cd. 3' ,
	'Aggregated cd. 3');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SUM_COL_TYP' AND C_KEY = 'SUM4' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SUM_COL_TYP',
	'SUM4',
	'114',
	'en_US',
	'Aggregated cd. 4' ,
	'Aggregated cd. 4');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SUM_COL_TYP' AND C_KEY = 'SUM5' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SUM_COL_TYP',
	'SUM5',
	'115',
	'en_US',
	'Aggregated cd. 5' ,
	'Aggregated cd. 5');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SUM_COL_TYP' AND C_KEY = 'PROJ' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SUM_COL_TYP',
	'PROJ',
	'120',
	'en_US',
	'Project cd.' ,
	'Project cd.');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_SET_COL_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_SET_COL_TYP',
	'en_US',
	'Setting column type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SET_COL_TYP' AND C_KEY = 'LOC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SET_COL_TYP',
	'LOC',
	'211',
	'en_US',
	'Location' ,
	'Location cd.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SET_COL_TYP' AND C_KEY = 'AREA' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SET_COL_TYP',
	'AREA',
	'212',
	'en_US',
	'Region' ,
	'Region cd.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SET_COL_TYP' AND C_KEY = 'CNTRY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SET_COL_TYP',
	'CNTRY',
	'213',
	'en_US',
	'Country' ,
	'Country cd.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SET_COL_TYP' AND C_KEY = 'USR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SET_COL_TYP',
	'USR',
	'214',
	'en_US',
	'PIC' ,
	'PIC cd.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SET_COL_TYP' AND C_KEY = 'CATEG' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SET_COL_TYP',
	'CATEG',
	'221',
	'en_US',
	'Accounting item classification' ,
	'Accounting item classification cd.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SET_COL_TYP' AND C_KEY = 'JNL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SET_COL_TYP',
	'JNL',
	'222',
	'en_US',
	'Item journal' ,
	'Item journal cd.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SET_COL_TYP' AND C_KEY = 'AR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SET_COL_TYP',
	'AR',
	'241',
	'en_US',
	'AR customer' ,
	'AR customer cd.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SET_COL_TYP' AND C_KEY = 'CST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SET_COL_TYP',
	'CST',
	'242',
	'en_US',
	'Customer' ,
	'Customer cd.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SET_COL_TYP' AND C_KEY = 'AP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SET_COL_TYP',
	'AP',
	'243',
	'en_US',
	'AP supplier' ,
	'AP supplier cd.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SET_COL_TYP' AND C_KEY = 'SPL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SET_COL_TYP',
	'SPL',
	'244',
	'en_US',
	'Supplier' ,
	'Supplier cd.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SET_COL_TYP' AND C_KEY = 'SNO1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SET_COL_TYP',
	'SNO1',
	'251',
	'en_US',
	'SEIBAN No. 1' ,
	'SEIBAN No. 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SET_COL_TYP' AND C_KEY = 'SNO2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SET_COL_TYP',
	'SNO2',
	'252',
	'en_US',
	'SEIBAN No. 2' ,
	'SEIBAN No. 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SET_COL_TYP' AND C_KEY = 'SNO3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SET_COL_TYP',
	'SNO3',
	'253',
	'en_US',
	'SEIBAN No. 3' ,
	'SEIBAN No. 3');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SET_COL_TYP' AND C_KEY = 'SNO4' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SET_COL_TYP',
	'SNO4',
	'254',
	'en_US',
	'SEIBAN No. 4' ,
	'SEIBAN No. 4');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SET_COL_TYP' AND C_KEY = 'SUB1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SET_COL_TYP',
	'SUB1',
	'301',
	'en_US',
	'Spare CHAR column 1' ,
	'Spare CHAR column 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SET_COL_TYP' AND C_KEY = 'SUB2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SET_COL_TYP',
	'SUB2',
	'302',
	'en_US',
	'Spare CHAR column 2' ,
	'Spare CHAR column 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SET_COL_TYP' AND C_KEY = 'SUB3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SET_COL_TYP',
	'SUB3',
	'303',
	'en_US',
	'Spare CHAR column 3' ,
	'Spare CHAR column 3');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SET_COL_TYP' AND C_KEY = 'SUB4' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SET_COL_TYP',
	'SUB4',
	'304',
	'en_US',
	'Spare CHAR column 4' ,
	'Spare CHAR column 4');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SET_COL_TYP' AND C_KEY = 'SUB5' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SET_COL_TYP',
	'SUB5',
	'305',
	'en_US',
	'Spare CHAR column 5' ,
	'Spare CHAR column 5');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SET_COL_TYP' AND C_KEY = 'SUB6' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SET_COL_TYP',
	'SUB6',
	'306',
	'en_US',
	'Spare CHAR column 6' ,
	'Spare CHAR column 6');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SET_COL_TYP' AND C_KEY = 'SUB7' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SET_COL_TYP',
	'SUB7',
	'307',
	'en_US',
	'Spare CHAR column 7' ,
	'Spare CHAR column 7');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SET_COL_TYP' AND C_KEY = 'SUB8' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SET_COL_TYP',
	'SUB8',
	'308',
	'en_US',
	'Spare CHAR column 8' ,
	'Spare CHAR column 8');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SET_COL_TYP' AND C_KEY = 'SUB9' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SET_COL_TYP',
	'SUB9',
	'309',
	'en_US',
	'Spare CHAR column 9' ,
	'Spare CHAR column 9');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SET_COL_TYP' AND C_KEY = 'SUB10' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SET_COL_TYP',
	'SUB10',
	'310',
	'en_US',
	'Spare CHAR column 10' ,
	'Spare CHAR column 10');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_DATA_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_DATA_TYP',
	'en_US',
	'Data status type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DATA_TYP' AND C_KEY = 'ERR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DATA_TYP',
	'ERR',
	'1',
	'en_US',
	'Journalizing error' ,
	'Status with error in journalizing');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DATA_TYP' AND C_KEY = 'JNL_MK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DATA_TYP',
	'JNL_MK',
	'2',
	'en_US',
	'Journal created' ,
	'Status with journal data created');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DATA_TYP' AND C_KEY = 'AC_MK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DATA_TYP',
	'AC_MK',
	'3',
	'en_US',
	'Sent' ,
	'Sent to ESB interface table');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_ABS_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_ABS_TYP',
	'en_US',
	'Abstract type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ABS_TYP' AND C_KEY = 'MST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ABS_TYP',
	'MST',
	'M',
	'en_US',
	'Master value' ,
	'Set master input value to remark field');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ABS_TYP' AND C_KEY = 'SLIP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ABS_TYP',
	'SLIP',
	'1',
	'en_US',
	'Slip No. info.' ,
	'Output value of slip No. to memo fields');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ABS_TYP' AND C_KEY = 'INV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ABS_TYP',
	'INV',
	'2',
	'en_US',
	'Invoice No./Billing No.' ,
	'Output invoice No. or billing No. to remark field');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ABS_TYP' AND C_KEY = 'AC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ABS_TYP',
	'AC',
	'3',
	'en_US',
	'Bank account name' ,
	'Output account name to memo fields');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ABS_TYP' AND C_KEY = 'TRANS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ABS_TYP',
	'TRANS',
	'4',
	'en_US',
	'Payment person name' ,
	'Output payment person name to memo fields');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ABS_TYP' AND C_KEY = 'ITM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ABS_TYP',
	'ITM',
	'5',
	'en_US',
	'Item name' ,
	'Output item name to memo fields');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ABS_TYP' AND C_KEY = 'ORD_NO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ABS_TYP',
	'ORD_NO',
	'6',
	'en_US',
	'PO No./sales order No.' ,
	'Output PO No. or sales order No. to summary field');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ABS_TYP' AND C_KEY = 'TRD_RMRKS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ABS_TYP',
	'TRD_RMRKS',
	'7',
	'en_US',
	'Transaction remarks' ,
	'Output value of transaction remark to memo fields');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ABS_TYP' AND C_KEY = 'TRD_D_RMRKS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ABS_TYP',
	'TRD_D_RMRKS',
	'8',
	'en_US',
	'Transaction details remarks' ,
	'Output value of transaction details remark to memo fields');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ABS_TYP' AND C_KEY = 'APAR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ABS_TYP',
	'APAR',
	'A',
	'en_US',
	'AR customer/AP supplier' ,
	'Output AR customer name or AP supplier name to memo fields');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ABS_TYP' AND C_KEY = 'CSTSPL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ABS_TYP',
	'CSTSPL',
	'B',
	'en_US',
	'Customer name/Supplier name' ,
	'Output customer name or supplier name to memo field');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ABS_TYP' AND C_KEY = 'CRE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ABS_TYP',
	'CRE',
	'C',
	'en_US',
	'Payer name/Payee name' ,
	'Output payer name or payee name to memo fields');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ABS_TYP' AND C_KEY = 'SO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ABS_TYP',
	'SO',
	'D',
	'en_US',
	'Offset BP name' ,
	'Output offset BP name to memo field');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ABS_TYP' AND C_KEY = 'TRD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ABS_TYP',
	'TRD',
	'E',
	'en_US',
	'Transfer item name' ,
	'Output transfer destination item name to memo fields');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ABS_TYP' AND C_KEY = 'WRK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ABS_TYP',
	'WRK',
	'F',
	'en_US',
	'Sales project No.' ,
	'Output sales project No. to memo fields');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ABS_TYP' AND C_KEY = 'SUB1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ABS_TYP',
	'SUB1',
	'V',
	'en_US',
	'Spare CHAR column 1' ,
	'Output value of spare CHAR column 1 to memo fields');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ABS_TYP' AND C_KEY = 'SUB2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ABS_TYP',
	'SUB2',
	'W',
	'en_US',
	'Spare CHAR column 2' ,
	'Output value of spare CHAR column 2 to memo fields');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ABS_TYP' AND C_KEY = 'SUB3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ABS_TYP',
	'SUB3',
	'X',
	'en_US',
	'Spare CHAR column 3' ,
	'Output value of spare CHAR column 3 to memo fields');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ABS_TYP' AND C_KEY = 'SUB4' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ABS_TYP',
	'SUB4',
	'Y',
	'en_US',
	'Spare CHAR column 4' ,
	'Output value of spare CHAR column 4 to memo fields');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ABS_TYP' AND C_KEY = 'SUB5' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ABS_TYP',
	'SUB5',
	'Z',
	'en_US',
	'Spare CHAR column 5' ,
	'Output value of spare CHAR column 5 to memo fields');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_PTN_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_PTN_TYP',
	'en_US',
	'Journal pattern setting type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PTN_TYP' AND C_KEY = 'MST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PTN_TYP',
	'MST',
	'M',
	'en_US',
	'Master value' ,
	'Set account info. to journal pattern master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PTN_TYP' AND C_KEY = 'RSN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PTN_TYP',
	'RSN',
	'1',
	'en_US',
	'Accounting reason account' ,
	'Refer to accounting reason account setting master for account info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PTN_TYP' AND C_KEY = 'JNL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PTN_TYP',
	'JNL',
	'2',
	'en_US',
	'Item journal account' ,
	'Refer to item journal account setting master for account info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PTN_TYP' AND C_KEY = 'AC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PTN_TYP',
	'AC',
	'3',
	'en_US',
	'Bank account type' ,
	'Refer to bank account type setting master for account info.');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_ID_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_ID_TYP',
	'en_US',
	'Slip ID type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ID_TYP' AND C_KEY = 'MST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ID_TYP',
	'MST',
	'M',
	'en_US',
	'Master value' ,
	'Use slip group ID of auto-journal master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ID_TYP' AND C_KEY = 'PURC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ID_TYP',
	'PURC',
	'1',
	'en_US',
	'Purchasing dept.' ,
	'To use slip group ID of purchasing dept.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ID_TYP' AND C_KEY = 'AP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ID_TYP',
	'AP',
	'2',
	'en_US',
	'AP dept.' ,
	'Use slip group ID of AP dept.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ID_TYP' AND C_KEY = 'SLS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ID_TYP',
	'SLS',
	'3',
	'en_US',
	'Sales dept.' ,
	'Use slip group ID of sales dept.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ID_TYP' AND C_KEY = 'AR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ID_TYP',
	'AR',
	'4',
	'en_US',
	'AR dept.' ,
	'Use slip group ID of AR dept.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ID_TYP' AND C_KEY = 'GI' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ID_TYP',
	'GI',
	'5',
	'en_US',
	'GI dept.' ,
	'Use slip group ID of GI dept.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ID_TYP' AND C_KEY = 'GR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ID_TYP',
	'GR',
	'6',
	'en_US',
	'GR dept.' ,
	'Use GR dept. slip group ID');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ID_TYP' AND C_KEY = 'BD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ID_TYP',
	'BD',
	'7',
	'en_US',
	'Charged dept.' ,
	'Use slip group ID of charged dept.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ID_TYP' AND C_KEY = 'CR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ID_TYP',
	'CR',
	'8',
	'en_US',
	'Payment received dept.' ,
	'Use slip group ID of payment receiving dept.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ID_TYP' AND C_KEY = 'SO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ID_TYP',
	'SO',
	'9',
	'en_US',
	'Offset dept.' ,
	'Use slip group ID of offset dept.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ID_TYP' AND C_KEY = 'SUB1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ID_TYP',
	'SUB1',
	'X',
	'en_US',
	'Spare dept. 1' ,
	'Use slip group ID of spare dept. 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ID_TYP' AND C_KEY = 'SUB2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ID_TYP',
	'SUB2',
	'Y',
	'en_US',
	'Spare dept. 2' ,
	'Use slip group ID of spare dept. 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ID_TYP' AND C_KEY = 'SUB3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ID_TYP',
	'SUB3',
	'Z',
	'en_US',
	'Spare dept. 3' ,
	'Use slip group ID of spare dept. 3');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_MASTER_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_MASTER_TYP',
	'en_US',
	'Master linkage type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MASTER_TYP' AND C_KEY = 'CST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MASTER_TYP',
	'CST',
	'1',
	'en_US',
	'Customer' ,
	'Send data about customer');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MASTER_TYP' AND C_KEY = 'SPL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MASTER_TYP',
	'SPL',
	'2',
	'en_US',
	'Supplier' ,
	'Send supplier data');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_AMT_SIGN_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_AMT_SIGN_TYP',
	'en_US',
	'Amount sign type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AMT_SIGN_TYP' AND C_KEY = 'PLS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AMT_SIGN_TYP',
	'PLS',
	'1',
	'en_US',
	'Normal voucher (+) credit voucher (-)' ,
	'Create journal only for normal voucher with positive amount and credit voucher with negative amount');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AMT_SIGN_TYP' AND C_KEY = 'MNS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AMT_SIGN_TYP',
	'MNS',
	'2',
	'en_US',
	'Normal voucher (-) credit voucher (+)' ,
	'Create journal only for normal voucher with negative amount and credit voucher with negative amount');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_AC_TABLE_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_AC_TABLE_TYP',
	'en_US',
	'Accounting IF table type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_TABLE_TYP' AND C_KEY = 'AC_IO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_TABLE_TYP',
	'AC_IO',
	'1',
	'en_US',
	'GR/GI data for accounting IF' ,
	'GR/GI data for accounting IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_TABLE_TYP' AND C_KEY = 'AC_STK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_TABLE_TYP',
	'AC_STK',
	'2',
	'en_US',
	'Inventory data for Accounting IF' ,
	'Inventory data for Accounting IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_TABLE_TYP' AND C_KEY = 'AC_COST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_TABLE_TYP',
	'AC_COST',
	'3',
	'en_US',
	'Cost data for Accounting IF' ,
	'Cost data for Accounting IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_TABLE_TYP' AND C_KEY = 'AC_RCV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_TABLE_TYP',
	'AC_RCV',
	'4',
	'en_US',
	'Payment received data for accounting IF' ,
	'Payment received data for accounting IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_TABLE_TYP' AND C_KEY = 'AC_PAY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_TABLE_TYP',
	'AC_PAY',
	'5',
	'en_US',
	'Payment data for accounting IF' ,
	'Payment data for accounting IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AC_TABLE_TYP' AND C_KEY = 'AC_NOTE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AC_TABLE_TYP',
	'AC_NOTE',
	'6',
	'en_US',
	'Note data for Accounting IF' ,
	'Note data for Accounting IF');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_COL_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_JNL_KEY_COL_TYP',
	'en_US',
	'Journal key column type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_COL_TYP' AND C_KEY = 'JNL_KEY1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_COL_TYP',
	'JNL_KEY1',
	'01',
	'en_US',
	'Journal key column 1' ,
	'Journal key column 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_COL_TYP' AND C_KEY = 'JNL_KEY2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_COL_TYP',
	'JNL_KEY2',
	'02',
	'en_US',
	'Journal key column 2' ,
	'Journal key column 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_COL_TYP' AND C_KEY = 'JNL_KEY3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_COL_TYP',
	'JNL_KEY3',
	'03',
	'en_US',
	'Journal key column 3' ,
	'Journal key column 3');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_COL_TYP' AND C_KEY = 'JNL_KEY4' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_COL_TYP',
	'JNL_KEY4',
	'04',
	'en_US',
	'Journal key column 4' ,
	'Journal key column 4');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_COL_TYP' AND C_KEY = 'JNL_KEY5' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_COL_TYP',
	'JNL_KEY5',
	'05',
	'en_US',
	'Journal key column 5' ,
	'Journal key column 5');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_COL_TYP' AND C_KEY = 'JNL_KEY6' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_COL_TYP',
	'JNL_KEY6',
	'06',
	'en_US',
	'Journal key column 6' ,
	'Journal key column 6');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_COL_TYP' AND C_KEY = 'JNL_KEY7' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_COL_TYP',
	'JNL_KEY7',
	'07',
	'en_US',
	'Journal key column 7' ,
	'Journal key column 7');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_COL_TYP' AND C_KEY = 'JNL_KEY8' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_COL_TYP',
	'JNL_KEY8',
	'08',
	'en_US',
	'Journal key column 8' ,
	'Journal key column 8');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_COL_TYP' AND C_KEY = 'JNL_KEY9' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_COL_TYP',
	'JNL_KEY9',
	'09',
	'en_US',
	'Journal key column 9' ,
	'Journal key column 9');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_COL_TYP' AND C_KEY = 'JNL_KEY10' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_COL_TYP',
	'JNL_KEY10',
	'10',
	'en_US',
	'Journal key column 10' ,
	'Journal key column 10');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'en_US',
	'Journal key setting column type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'WG_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'WG_CD',
	'101',
	'en_US',
	'WG' ,
	'WG');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'PURC_DPT_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'PURC_DPT_CD',
	'201',
	'en_US',
	'Purchasing dept.' ,
	'Purchasing dept.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'AP_DPT_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'AP_DPT_CD',
	'202',
	'en_US',
	'AP dept.' ,
	'AP dept.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'SLS_DPT_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'SLS_DPT_CD',
	'203',
	'en_US',
	'Sales dept.' ,
	'Sales dept.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'AR_DPT_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'AR_DPT_CD',
	'204',
	'en_US',
	'AR dept.' ,
	'AR dept.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'RCV_DPT_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'RCV_DPT_CD',
	'205',
	'en_US',
	'Payment received dept.' ,
	'Payment received dept.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'SO_DPT_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'SO_DPT_CD',
	'206',
	'en_US',
	'Offset dept.' ,
	'Offset dept.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'GI_DPT_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'GI_DPT_CD',
	'207',
	'en_US',
	'GI dept.' ,
	'GI dept.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'GR_DPT_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'GR_DPT_CD',
	'208',
	'en_US',
	'GR dept.' ,
	'GR dept.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'BD_DPT_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'BD_DPT_CD',
	'209',
	'en_US',
	'Charged dept.' ,
	'Charged dept.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'DPT_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'DPT_CD',
	'210',
	'en_US',
	'Dept.' ,
	'Dept.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'SUB_DPT_CD1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'SUB_DPT_CD1',
	'211',
	'en_US',
	'Spare dept. 1' ,
	'Spare dept. 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'SUB_DPT_CD2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'SUB_DPT_CD2',
	'212',
	'en_US',
	'Spare dept. 2' ,
	'Spare dept. 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'SUB_DPT_CD3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'SUB_DPT_CD3',
	'213',
	'en_US',
	'Spare dept. 3' ,
	'Spare dept. 3');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'LOC_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'LOC_CD',
	'301',
	'en_US',
	'Location' ,
	'Location');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'STR_LN_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'STR_LN_CD',
	'302',
	'en_US',
	'Rack/line' ,
	'Rack/line');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'ACST_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'ACST_CD',
	'401',
	'en_US',
	'AR customer' ,
	'AR customer');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'CST_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'CST_CD',
	'402',
	'en_US',
	'Customer' ,
	'Customer');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'ASPPL_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'ASPPL_CD',
	'403',
	'en_US',
	'AP supplier' ,
	'AP supplier');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'SPPL_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'SPPL_CD',
	'404',
	'en_US',
	'Supplier' ,
	'Supplier');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'INV_COM_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'INV_COM_CD',
	'405',
	'en_US',
	'Inventory storage destination' ,
	'Inventory storage destination');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'RCST_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'RCST_CD',
	'406',
	'en_US',
	'Payer' ,
	'Payer');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'SETOFF_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'SETOFF_CD',
	'407',
	'en_US',
	'Offset against' ,
	'Offset against');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'AC_ITM_GRP_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'AC_ITM_GRP_CD',
	'501',
	'en_US',
	'Accounting item classification' ,
	'Accounting item classification');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'ITM_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'ITM_CD',
	'502',
	'en_US',
	'Item' ,
	'Item');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'ITM_SUB1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'ITM_SUB1',
	'503',
	'en_US',
	'Branch No. 1' ,
	'Branch No. 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'ITM_SUB2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'ITM_SUB2',
	'504',
	'en_US',
	'Branch No. 2' ,
	'Branch No. 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'ITM_SUB3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'ITM_SUB3',
	'505',
	'en_US',
	'Branch No. 3' ,
	'Branch No. 3');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'SNO1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'SNO1',
	'506',
	'en_US',
	'SEIBAN No. 1' ,
	'SEIBAN No. 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'SNO2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'SNO2',
	'507',
	'en_US',
	'SEIBAN No. 2' ,
	'SEIBAN No. 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'SNO3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'SNO3',
	'508',
	'en_US',
	'SEIBAN No. 3' ,
	'SEIBAN No. 3');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'SNO4' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'SNO4',
	'509',
	'en_US',
	'SEIBAN No. 4' ,
	'SEIBAN No. 4');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'ITM_GRP_CD1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'ITM_GRP_CD1',
	'551',
	'en_US',
	'Item classification 1' ,
	'Item classification 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'ITM_GRP_CD2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'ITM_GRP_CD2',
	'552',
	'en_US',
	'Item classification 2' ,
	'Item classification 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'ITM_GRP_CD3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'ITM_GRP_CD3',
	'553',
	'en_US',
	'Item classification 3' ,
	'Item classification 3');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'ITM_GRP_CD4' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'ITM_GRP_CD4',
	'554',
	'en_US',
	'Item classification 4' ,
	'Item classification 4');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'ITM_GRP_CD5' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'ITM_GRP_CD5',
	'555',
	'en_US',
	'Item classification 5' ,
	'Item classification 5');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'ITM_GRP_CD6' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'ITM_GRP_CD6',
	'556',
	'en_US',
	'Item classification 6' ,
	'Item classification 6');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'ITM_GRP_CD7' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'ITM_GRP_CD7',
	'557',
	'en_US',
	'Item classification 7' ,
	'Item classification 7');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'ITM_GRP_CD8' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'ITM_GRP_CD8',
	'558',
	'en_US',
	'Item classification 8' ,
	'Item classification 8');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'ITM_GRP_CD9' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'ITM_GRP_CD9',
	'559',
	'en_US',
	'Item classification 9' ,
	'Item classification 9');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'ITM_GRP_CD10' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'ITM_GRP_CD10',
	'560',
	'en_US',
	'Item classification 10' ,
	'Item classification 10');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'TRD_AC_ITM_GRP_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'TRD_AC_ITM_GRP_CD',
	'601',
	'en_US',
	'Transfer accounting item classification' ,
	'Transfer accounting item classification');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'TRD_ITM_JNL_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'TRD_ITM_JNL_CD',
	'602',
	'en_US',
	'Transfer item journal' ,
	'Transfer item journal');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'TRD_ITM_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'TRD_ITM_CD',
	'603',
	'en_US',
	'Transfer item' ,
	'Transfer item');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'TRD_ITM_SUB1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'TRD_ITM_SUB1',
	'604',
	'en_US',
	'Transfer branch No. 1' ,
	'Transfer branch No. 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'TRD_ITM_SUB2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'TRD_ITM_SUB2',
	'605',
	'en_US',
	'Transfer branch No. 2' ,
	'Transfer branch No. 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'TRD_ITM_SUB3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'TRD_ITM_SUB3',
	'606',
	'en_US',
	'Transfer branch No. 3' ,
	'Transfer branch No. 3');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'TRD_SNO1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'TRD_SNO1',
	'607',
	'en_US',
	'Transfer SEIBAN No. 1' ,
	'Transfer SEIBAN No. 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'TRD_SNO2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'TRD_SNO2',
	'608',
	'en_US',
	'Transfer SEIBAN No. 2' ,
	'Transfer SEIBAN No. 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'TRD_SNO3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'TRD_SNO3',
	'609',
	'en_US',
	'Transfer SEIBAN No. 3' ,
	'Transfer SEIBAN No. 3');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'TRD_SNO4' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'TRD_SNO4',
	'610',
	'en_US',
	'Transfer SEIBAN No. 4' ,
	'Transfer SEIBAN No. 4');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'TRD_ITM_GRP_CD1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'TRD_ITM_GRP_CD1',
	'651',
	'en_US',
	'Transfer item classification 1' ,
	'Transfer item classification 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'TRD_ITM_GRP_CD2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'TRD_ITM_GRP_CD2',
	'652',
	'en_US',
	'Transfer item classification 2' ,
	'Transfer item classification 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'TRD_ITM_GRP_CD3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'TRD_ITM_GRP_CD3',
	'653',
	'en_US',
	'Transfer item classification 3' ,
	'Transfer item classification 3');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'TRD_ITM_GRP_CD4' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'TRD_ITM_GRP_CD4',
	'654',
	'en_US',
	'Transfer item classification 4' ,
	'Transfer item classification 4');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'TRD_ITM_GRP_CD5' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'TRD_ITM_GRP_CD5',
	'655',
	'en_US',
	'Transfer item classification 5' ,
	'Transfer item classification 5');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'TRD_ITM_GRP_CD6' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'TRD_ITM_GRP_CD6',
	'656',
	'en_US',
	'Transfer item classification 6' ,
	'Transfer item classification 6');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'TRD_ITM_GRP_CD7' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'TRD_ITM_GRP_CD7',
	'657',
	'en_US',
	'Transfer item classification 7' ,
	'Transfer item classification 7');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'TRD_ITM_GRP_CD8' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'TRD_ITM_GRP_CD8',
	'658',
	'en_US',
	'Transfer item classification 8' ,
	'Transfer item classification 8');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'TRD_ITM_GRP_CD9' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'TRD_ITM_GRP_CD9',
	'659',
	'en_US',
	'Transfer item classification 9' ,
	'Transfer item classification 9');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'TRD_ITM_GRP_CD10' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'TRD_ITM_GRP_CD10',
	'660',
	'en_US',
	'Transfer item classification 10' ,
	'Transfer item classification 10');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'AREA_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'AREA_CD',
	'701',
	'en_US',
	'Region' ,
	'Region');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'CNTRY_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'CNTRY_CD',
	'702',
	'en_US',
	'Country' ,
	'Country');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'TAX_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'TAX_CD',
	'703',
	'en_US',
	'Tax' ,
	'Tax');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'ALC_AC_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'ALC_AC_CD',
	'704',
	'en_US',
	'Allocation account' ,
	'Allocation account');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'SRC_ALC_AC_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'SRC_ALC_AC_CD',
	'705',
	'en_US',
	'Allocation source allocation account' ,
	'Allocation source allocation account');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'GD_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'GD_CD',
	'706',
	'en_US',
	'Grading' ,
	'Grading');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'BP_GRP_CD1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'BP_GRP_CD1',
	'801',
	'en_US',
	'BP classification 1' ,
	'BP classification 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'BP_GRP_CD2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'BP_GRP_CD2',
	'802',
	'en_US',
	'BP classification 2' ,
	'BP classification 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'BP_GRP_CD3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'BP_GRP_CD3',
	'803',
	'en_US',
	'BP classification 3' ,
	'BP classification 3');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'BP_GRP_CD4' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'BP_GRP_CD4',
	'804',
	'en_US',
	'BP classification 4' ,
	'BP classification 4');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'BP_GRP_CD5' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'BP_GRP_CD5',
	'805',
	'en_US',
	'BP classification 5' ,
	'BP classification 5');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'BP_GRP_CD6' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'BP_GRP_CD6',
	'806',
	'en_US',
	'BP classification 6' ,
	'BP classification 6');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'BP_GRP_CD7' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'BP_GRP_CD7',
	'807',
	'en_US',
	'BP classification 7' ,
	'BP classification 7');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'BP_GRP_CD8' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'BP_GRP_CD8',
	'808',
	'en_US',
	'BP classification 8' ,
	'BP classification 8');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'BP_GRP_CD9' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'BP_GRP_CD9',
	'809',
	'en_US',
	'BP classification 9' ,
	'BP classification 9');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'BP_GRP_CD10' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'BP_GRP_CD10',
	'810',
	'en_US',
	'BP classification 10' ,
	'BP classification 10');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'SUB_CHAR1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'SUB_CHAR1',
	'901',
	'en_US',
	'Spare CHAR column 1' ,
	'Spare CHAR column 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'SUB_CHAR2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'SUB_CHAR2',
	'902',
	'en_US',
	'Spare CHAR column 2' ,
	'Spare CHAR column 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'SUB_CHAR3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'SUB_CHAR3',
	'903',
	'en_US',
	'Spare CHAR column 3' ,
	'Spare CHAR column 3');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'SUB_CHAR4' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'SUB_CHAR4',
	'904',
	'en_US',
	'Spare CHAR column 4' ,
	'Spare CHAR column 4');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'SUB_CHAR5' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'SUB_CHAR5',
	'905',
	'en_US',
	'Spare CHAR column 5' ,
	'Spare CHAR column 5');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'SUB_CHAR6' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'SUB_CHAR6',
	'906',
	'en_US',
	'Spare CHAR column 6' ,
	'Spare CHAR column 6');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'SUB_CHAR7' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'SUB_CHAR7',
	'907',
	'en_US',
	'Spare CHAR column 7' ,
	'Spare CHAR column 7');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'SUB_CHAR8' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'SUB_CHAR8',
	'908',
	'en_US',
	'Spare CHAR column 8' ,
	'Spare CHAR column 8');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'SUB_CHAR9' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'SUB_CHAR9',
	'909',
	'en_US',
	'Spare CHAR column 9' ,
	'Spare CHAR column 9');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'SUB_CHAR10' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'SUB_CHAR10',
	'910',
	'en_US',
	'Spare CHAR column 10' ,
	'Spare CHAR column 10');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'PAY_DPT_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'PAY_DPT_CD',
	'214',
	'en_US',
	'Payment dept.' ,
	'Payment dept.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'BSPPL_DPT_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'BSPPL_DPT_CD',
	'215',
	'en_US',
	'Scheduled payee dept.' ,
	'Scheduled payee dept.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'PSPPL_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'PSPPL_CD',
	'408',
	'en_US',
	'Payee' ,
	'Payee');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'BSPPL_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'BSPPL_CD',
	'409',
	'en_US',
	'Scheduled payee' ,
	'Scheduled payee');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'EXPNS_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'EXPNS_CD',
	'707',
	'en_US',
	'Cost element item' ,
	'Cost element item');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_JNL_KEY_SET_COL_TYP' AND C_KEY = 'TRD_CD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_JNL_KEY_SET_COL_TYP',
	'TRD_CD',
	'708',
	'en_US',
	'Transaction' ,
	'Transaction');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_COMPOUND_JNL_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_COMPOUND_JNL_TYP',
	'en_US',
	'Compound journal type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COMPOUND_JNL_TYP' AND C_KEY = 'D1C1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COMPOUND_JNL_TYP',
	'D1C1',
	'1',
	'en_US',
	'1 to 1' ,
	'Dr. to Cr. = 1 to 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COMPOUND_JNL_TYP' AND C_KEY = 'DNC1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COMPOUND_JNL_TYP',
	'DNC1',
	'2',
	'en_US',
	'N to 1' ,
	'Dr. to Cr. = N to 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COMPOUND_JNL_TYP' AND C_KEY = 'D1CN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COMPOUND_JNL_TYP',
	'D1CN',
	'3',
	'en_US',
	'1 to N' ,
	'Dr. to Cr. = 1 to N');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COMPOUND_JNL_TYP' AND C_KEY = 'OTHER' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COMPOUND_JNL_TYP',
	'OTHER',
	'9',
	'en_US',
	'Any' ,
	'Any (Allow N to N)');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_EXPNS_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_EXPNS_TYP',
	'en_US',
	'Cost element type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_EXPNS_TYP' AND C_KEY = 'PROD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_EXPNS_TYP',
	'PROD',
	'1',
	'en_US',
	'Mfg./Cost of goods sold element' ,
	'Cost element which indicates mfg. cost/sales cost element');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_EXPNS_TYP' AND C_KEY = 'SGA' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_EXPNS_TYP',
	'SGA',
	'2',
	'en_US',
	'SGA cost element' ,
	'Cost element indicates non-mfg. cost element such as sales management expenses');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_EXPNS_TYP' AND C_KEY = 'SPPL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_EXPNS_TYP',
	'SPPL',
	'3',
	'en_US',
	'Gain or loss of chargeable supply cost element' ,
	'Cost element which indicates differences with chargeable supply amount');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_DIRECT_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_DIRECT_TYP',
	'en_US',
	'Direct/Indirect type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DIRECT_TYP' AND C_KEY = 'DIRECT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DIRECT_TYP',
	'DIRECT',
	'1',
	'en_US',
	'Direct cost' ,
	'Direct cost');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DIRECT_TYP' AND C_KEY = 'INDIRECT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DIRECT_TYP',
	'INDIRECT',
	'2',
	'en_US',
	'Indirect cost' ,
	'Indirect cost');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_VAR_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_VAR_TYP',
	'en_US',
	'Constant/variable type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_VAR_TYP' AND C_KEY = 'FXD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_VAR_TYP',
	'FXD',
	'1',
	'en_US',
	'Fixed cost' ,
	'Fixed cost');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_VAR_TYP' AND C_KEY = 'VAR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_VAR_TYP',
	'VAR',
	'2',
	'en_US',
	'Variable cost' ,
	'Variable cost');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_COST_CALC_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_COST_CALC_TYP',
	'en_US',
	'Calculation type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COST_CALC_TYP' AND C_KEY = 'COST_STD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COST_CALC_TYP',
	'COST_STD',
	'1',
	'en_US',
	'Standard unit cost' ,
	'Calculate standard unit cost (Cost standard)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COST_CALC_TYP' AND C_KEY = 'NOT_STK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COST_CALC_TYP',
	'NOT_STK',
	'2',
	'en_US',
	'Calculation (Not for inventory)' ,
	'Do not calculate inventory qty. calculation and inventory revaluation');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COST_CALC_TYP' AND C_KEY = 'CALC_STK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COST_CALC_TYP',
	'CALC_STK',
	'3',
	'en_US',
	'Calculation (Inventory calculation)' ,
	'Calculate inventory qty. calculation and inventory revaluation');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COST_CALC_TYP' AND C_KEY = 'OTHER' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COST_CALC_TYP',
	'OTHER',
	'4',
	'en_US',
	'Other' ,
	'Perform only explosion calculation or allocation rate calculation');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_SA_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_SA_TYP',
	'en_US',
	'Plan/Result type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SA_TYP' AND C_KEY = 'PLN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SA_TYP',
	'PLN',
	'1',
	'en_US',
	'Planning data' ,
	'Use planning data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SA_TYP' AND C_KEY = 'ACT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SA_TYP',
	'ACT',
	'2',
	'en_US',
	'Result data' ,
	'Use result data');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_EXP_CALC_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_EXP_CALC_TYP',
	'en_US',
	'BOM explosion calculation type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_EXP_CALC_TYP' AND C_KEY = 'NON' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_EXP_CALC_TYP',
	'NON',
	'1',
	'en_US',
	'Not to calculate' ,
	'No explosion calculation');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_EXP_CALC_TYP' AND C_KEY = 'RQMT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_EXP_CALC_TYP',
	'RQMT',
	'2',
	'en_US',
	'Calculation (Monthly plan)' ,
	'Calculate based on monthly planning data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_EXP_CALC_TYP' AND C_KEY = 'MFG' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_EXP_CALC_TYP',
	'MFG',
	'3',
	'en_US',
	'Calculation (Mfg. data)' ,
	'Calculate purchasing data for the bottom item based on mfg. data (Plan or result)');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_PRE_ALC_CALC_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_PRE_ALC_CALC_TYP',
	'en_US',
	'Departmental alloc. calculation type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PRE_ALC_CALC_TYP' AND C_KEY = 'NON' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PRE_ALC_CALC_TYP',
	'NON',
	'1',
	'en_US',
	'Not to calculate' ,
	'Do not calculate departmental alloc.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PRE_ALC_CALC_TYP' AND C_KEY = 'CALC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PRE_ALC_CALC_TYP',
	'CALC',
	'2',
	'en_US',
	'Calculation' ,
	'Calculate departmental alloc.');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_ALC_CALC_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_ALC_CALC_TYP',
	'en_US',
	'Allocation rate calculation type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ALC_CALC_TYP' AND C_KEY = 'NON' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ALC_CALC_TYP',
	'NON',
	'1',
	'en_US',
	'Not to calculate' ,
	'Do not calculate allocation rate (Use standard allocation rate)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ALC_CALC_TYP' AND C_KEY = 'MONTH_ALC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ALC_CALC_TYP',
	'MONTH_ALC',
	'2',
	'en_US',
	'Allocation rate calculation (Monthly)' ,
	'Calculate allocation rate on monthly basis or use monthly predetermined allocation rate data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ALC_CALC_TYP' AND C_KEY = 'TERM_ALC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ALC_CALC_TYP',
	'TERM_ALC',
	'3',
	'en_US',
	'Allocation rate calculation (Period)' ,
	'Calculate allocation rate on period basis or use predetermined allocation rate data configured on final month of that period');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_COST_SLS_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_COST_SLS_TYP',
	'en_US',
	'Cost sales classification type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COST_SLS_TYP' AND C_KEY = 'S1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COST_SLS_TYP',
	'S1',
	'1',
	'en_US',
	'Sales classification 1' ,
	'Display sales classification 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COST_SLS_TYP' AND C_KEY = 'S2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COST_SLS_TYP',
	'S2',
	'2',
	'en_US',
	'Sales classification 2' ,
	'Display sales classification 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COST_SLS_TYP' AND C_KEY = 'S3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COST_SLS_TYP',
	'S3',
	'3',
	'en_US',
	'Sales classification 3' ,
	'Display sales classification 3');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COST_SLS_TYP' AND C_KEY = 'S4' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COST_SLS_TYP',
	'S4',
	'4',
	'en_US',
	'Sales classification 4' ,
	'Display sales classification 4');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COST_SLS_TYP' AND C_KEY = 'S5' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COST_SLS_TYP',
	'S5',
	'5',
	'en_US',
	'Sales classification 5' ,
	'Display sales classification 5');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_MFG_PURC_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_MFG_PURC_TYP',
	'en_US',
	'Mfg. purchase type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MFG_PURC_TYP' AND C_KEY = 'MFG' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MFG_PURC_TYP',
	'MFG',
	'1',
	'en_US',
	'Mfg. item' ,
	'Indicate mfg. item. Shall be previous operation cost at the time of input');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MFG_PURC_TYP' AND C_KEY = 'PURC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MFG_PURC_TYP',
	'PURC',
	'2',
	'en_US',
	'Purchasing item' ,
	'Indicate purchasing item. This will become own operation cost at input');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_EVAL_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_EVAL_TYP',
	'en_US',
	'Amount evaluation type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_EVAL_TYP' AND C_KEY = 'MONTH_AVE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_EVAL_TYP',
	'MONTH_AVE',
	'1',
	'en_US',
	'Monthly average' ,
	'Evaluate on monthly moving average');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_EVAL_TYP' AND C_KEY = 'TERM_AVE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_EVAL_TYP',
	'TERM_AVE',
	'2',
	'en_US',
	'Period average' ,
	'Evaluate on period average');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_EVAL_TYP' AND C_KEY = 'STD_UNIT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_EVAL_TYP',
	'STD_UNIT',
	'A',
	'en_US',
	'Standard unit cost' ,
	'Evaluate on standard unit cost');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_UNIT_CALC_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_UNIT_CALC_TYP',
	'en_US',
	'Unit price calculation type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_UNIT_CALC_TYP' AND C_KEY = 'NON' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_UNIT_CALC_TYP',
	'NON',
	'1',
	'en_US',
	'Not to calculate (Without inventory)' ,
	'Exclude from unit price calculation. Do not consider at inventory/GI calculation (Null character will be set)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_UNIT_CALC_TYP' AND C_KEY = 'NON_STK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_UNIT_CALC_TYP',
	'NON_STK',
	'2',
	'en_US',
	'Not to calculate (With inventory)' ,
	'Exclude from unit price calculation. Consider at inventory/GI calculation');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_UNIT_CALC_TYP' AND C_KEY = 'CALC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_UNIT_CALC_TYP',
	'CALC',
	'3',
	'en_US',
	'To calculate' ,
	'Calculate unit price');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_ACT_SET_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_ACT_SET_TYP',
	'en_US',
	'Result setting type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ACT_SET_TYP' AND C_KEY = 'NON' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ACT_SET_TYP',
	'NON',
	'1',
	'en_US',
	'Non-target' ,
	'Do not set for any result data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ACT_SET_TYP' AND C_KEY = 'ALL_SET' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ACT_SET_TYP',
	'ALL_SET',
	'2',
	'en_US',
	'Settings' ,
	'Set for all result data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ACT_SET_TYP' AND C_KEY = 'IN_SET' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ACT_SET_TYP',
	'IN_SET',
	'3',
	'en_US',
	'Set only receipt' ,
	'Set mfg. purchase data, but do not set for issue or inventory data');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_EXP_SET_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_EXP_SET_TYP',
	'en_US',
	'Explosion copy type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_EXP_SET_TYP' AND C_KEY = 'NON' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_EXP_SET_TYP',
	'NON',
	'1',
	'en_US',
	'Not copy' ,
	'Do not copy values from parent item');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_EXP_SET_TYP' AND C_KEY = 'EXP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_EXP_SET_TYP',
	'EXP',
	'2',
	'en_US',
	'Copy' ,
	'Copy values from parent item');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_BD_AGG_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_BD_AGG_TYP',
	'en_US',
	'Breakdown aggregated type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BD_AGG_TYP' AND C_KEY = 'NON' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BD_AGG_TYP',
	'NON',
	'1',
	'en_US',
	'Do not aggregate' ,
	'Do not aggregate breakdown info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BD_AGG_TYP' AND C_KEY = 'AGG' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BD_AGG_TYP',
	'AGG',
	'2',
	'en_US',
	'Aggregate' ,
	'Aggregate breakdown info. to level 1 record');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_ALC_TGT_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_ALC_TGT_TYP',
	'en_US',
	'Allocation target type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ALC_TGT_TYP' AND C_KEY = 'MFG' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ALC_TGT_TYP',
	'MFG',
	'1',
	'en_US',
	'Mfg.' ,
	'Process allocation for mfg. data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ALC_TGT_TYP' AND C_KEY = 'PURC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ALC_TGT_TYP',
	'PURC',
	'2',
	'en_US',
	'Purchase' ,
	'Process allocation for purchasing data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ALC_TGT_TYP' AND C_KEY = 'MFG_PURC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ALC_TGT_TYP',
	'MFG_PURC',
	'3',
	'en_US',
	'Mfg./purchasing' ,
	'Process allocation for mfg./purchasing data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ALC_TGT_TYP' AND C_KEY = 'SLS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ALC_TGT_TYP',
	'SLS',
	'4',
	'en_US',
	'Sales result' ,
	'Allocate for sales data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ALC_TGT_TYP' AND C_KEY = 'ALC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ALC_TGT_TYP',
	'ALC',
	'5',
	'en_US',
	'General purpose allocation' ,
	'Process allocation for general purpose allocation data');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_ALC_RULE_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_ALC_RULE_TYP',
	'en_US',
	'Allocation basis type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ALC_RULE_TYP' AND C_KEY = 'WK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ALC_RULE_TYP',
	'WK',
	'1',
	'en_US',
	'Man-hour' ,
	'Process allocation of man-hour for corresponding record');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ALC_RULE_TYP' AND C_KEY = 'QTY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ALC_RULE_TYP',
	'QTY',
	'2',
	'en_US',
	'Quantity' ,
	'Process allocation of qty. for corresponding record');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ALC_RULE_TYP' AND C_KEY = 'AMT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ALC_RULE_TYP',
	'AMT',
	'3',
	'en_US',
	'Amount' ,
	'Process allocation of amount for corresponding record');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ALC_RULE_TYP' AND C_KEY = 'EXPNS_COST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ALC_RULE_TYP',
	'EXPNS_COST',
	'4',
	'en_US',
	'Cost by cost element' ,
	'Process allocation of cost for corresponding record');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ALC_RULE_TYP' AND C_KEY = 'PROFIT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ALC_RULE_TYP',
	'PROFIT',
	'5',
	'en_US',
	'Operating income' ,
	'Process allocation of profit for corresponding records (Amount - cost)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ALC_RULE_TYP' AND C_KEY = 'INPT_QTY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ALC_RULE_TYP',
	'INPT_QTY',
	'6',
	'en_US',
	'Input qty.' ,
	'Process allocation of input qty. for corresponding record');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ALC_RULE_TYP' AND C_KEY = 'OTHER_VAL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ALC_RULE_TYP',
	'OTHER_VAL',
	'7',
	'en_US',
	'Optional allocation value' ,
	'Process allocation of base allocation value column for corresponding record');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_ALC_AC_GRP_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_ALC_AC_GRP_TYP',
	'en_US',
	'Allocation account group type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ALC_AC_GRP_TYP' AND C_KEY = 'GRP1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ALC_AC_GRP_TYP',
	'GRP1',
	'1',
	'en_US',
	'Allocation account group 1' ,
	'Indicate allocation account group 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ALC_AC_GRP_TYP' AND C_KEY = 'GRP2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ALC_AC_GRP_TYP',
	'GRP2',
	'2',
	'en_US',
	'Allocation account group 2' ,
	'Indicate allocation account group 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ALC_AC_GRP_TYP' AND C_KEY = 'GRP3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ALC_AC_GRP_TYP',
	'GRP3',
	'3',
	'en_US',
	'Allocation account group 3' ,
	'Indicate allocation account group 3');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_CALC_CTG_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_CALC_CTG_TYP',
	'en_US',
	'Calculation category type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CALC_CTG_TYP' AND C_KEY = 'CALC_ITM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CALC_CTG_TYP',
	'CALC_ITM',
	'10',
	'en_US',
	'Calculation item' ,
	'Cost item operation info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CALC_CTG_TYP' AND C_KEY = 'ITM_DTL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CALC_CTG_TYP',
	'ITM_DTL',
	'20',
	'en_US',
	'Item details' ,
	'Show cost item details info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CALC_CTG_TYP' AND C_KEY = 'ITM_OPER' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CALC_CTG_TYP',
	'ITM_OPER',
	'21',
	'en_US',
	'Item operation' ,
	'Cost item operation info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CALC_CTG_TYP' AND C_KEY = 'BOM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CALC_CTG_TYP',
	'BOM',
	'22',
	'en_US',
	'BOM' ,
	'Cost BOM info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CALC_CTG_TYP' AND C_KEY = 'ITM_WK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CALC_CTG_TYP',
	'ITM_WK',
	'23',
	'en_US',
	'Item man-hour' ,
	'Cost item man-hour info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CALC_CTG_TYP' AND C_KEY = 'ITM_PURC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CALC_CTG_TYP',
	'ITM_PURC',
	'24',
	'en_US',
	'Purchase unit price' ,
	'Show cost item purchase unit price info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CALC_CTG_TYP' AND C_KEY = 'ITM_PROC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CALC_CTG_TYP',
	'ITM_PROC',
	'25',
	'en_US',
	'Subcontracting unit price' ,
	'Show cost item subcontracting unit price info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CALC_CTG_TYP' AND C_KEY = 'ITM_PROV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CALC_CTG_TYP',
	'ITM_PROV',
	'26',
	'en_US',
	'Supply unit price' ,
	'Show cost item supply unit price info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CALC_CTG_TYP' AND C_KEY = 'ITM_SLS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CALC_CTG_TYP',
	'ITM_SLS',
	'27',
	'en_US',
	'Sales unit price' ,
	'Show cost item sales unit price info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CALC_CTG_TYP' AND C_KEY = 'ITM_FIX' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CALC_CTG_TYP',
	'ITM_FIX',
	'28',
	'en_US',
	'Limit unit price' ,
	'Show cost item limit unit price info.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CALC_CTG_TYP' AND C_KEY = 'ALC_RATE_M' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CALC_CTG_TYP',
	'ALC_RATE_M',
	'30',
	'en_US',
	'Standard allocation rate' ,
	'Show standard allocation rate');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CALC_CTG_TYP' AND C_KEY = 'ALC_PTN_SEL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CALC_CTG_TYP',
	'ALC_PTN_SEL',
	'31',
	'en_US',
	'Allocation pattern selection' ,
	'Indicate allocation pattern selection master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CALC_CTG_TYP' AND C_KEY = 'PRE_ALC_RATE_SEL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CALC_CTG_TYP',
	'PRE_ALC_RATE_SEL',
	'32',
	'en_US',
	'Departmental alloc. basis selection' ,
	'Show departmental alloc. basis selection master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CALC_CTG_TYP' AND C_KEY = 'ALC_AMT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CALC_CTG_TYP',
	'ALC_AMT',
	'40',
	'en_US',
	'Allocation Amount' ,
	'Indicate allocable expenses data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CALC_CTG_TYP' AND C_KEY = 'ALC_RATE_T' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CALC_CTG_TYP',
	'ALC_RATE_T',
	'41',
	'en_US',
	'Predetermined allocation rate' ,
	'Show predetermined allocation rate data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CALC_CTG_TYP' AND C_KEY = 'PRE_RATE_TERM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CALC_CTG_TYP',
	'PRE_RATE_TERM',
	'42',
	'en_US',
	'Departmental alloc. fixed ratio' ,
	'Show departmental alloc. term ratio data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CALC_CTG_TYP' AND C_KEY = 'PRE_RATE_MLY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CALC_CTG_TYP',
	'PRE_RATE_MLY',
	'43',
	'en_US',
	'Departmental alloc. variable ratio' ,
	'Show departmental alloc. monthly ratio data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CALC_CTG_TYP' AND C_KEY = 'RQMT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CALC_CTG_TYP',
	'RQMT',
	'50',
	'en_US',
	'Monthly plan' ,
	'Show monthly planning data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CALC_CTG_TYP' AND C_KEY = 'MFG' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CALC_CTG_TYP',
	'MFG',
	'51',
	'en_US',
	'Mfg.' ,
	'Show mfg. data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CALC_CTG_TYP' AND C_KEY = 'PURC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CALC_CTG_TYP',
	'PURC',
	'52',
	'en_US',
	'Purchase' ,
	'Indicate purchasing data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CALC_CTG_TYP' AND C_KEY = 'SLS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CALC_CTG_TYP',
	'SLS',
	'53',
	'en_US',
	'Sales result' ,
	'Display sales data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CALC_CTG_TYP' AND C_KEY = 'INPT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CALC_CTG_TYP',
	'INPT',
	'54',
	'en_US',
	'Input' ,
	'Show input data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CALC_CTG_TYP' AND C_KEY = 'WK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CALC_CTG_TYP',
	'WK',
	'55',
	'en_US',
	'Order man-hour/Item man-hour' ,
	'Indicates order direct man-hour result or item man-hour plan');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CALC_CTG_TYP' AND C_KEY = 'OTHER_WK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CALC_CTG_TYP',
	'OTHER_WK',
	'56',
	'en_US',
	'Indirect man-hour' ,
	'Indicate indirect man-hour result or item indirect man-hour plan');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CALC_CTG_TYP' AND C_KEY = 'IO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CALC_CTG_TYP',
	'IO',
	'57',
	'en_US',
	'GR/GI' ,
	'Show GR/GI data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CALC_CTG_TYP' AND C_KEY = 'INST_WIP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CALC_CTG_TYP',
	'INST_WIP',
	'58',
	'en_US',
	'In process order' ,
	'Show in process order data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CALC_CTG_TYP' AND C_KEY = 'END_STK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CALC_CTG_TYP',
	'END_STK',
	'59',
	'en_US',
	'Inventory result' ,
	'Show inventory result data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CALC_CTG_TYP' AND C_KEY = 'GP_ALC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CALC_CTG_TYP',
	'GP_ALC',
	'60',
	'en_US',
	'General purpose allocation' ,
	'Show general purpose allocation data');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_CTG_CONFIG_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_CTG_CONFIG_TYP',
	'en_US',
	'Item category configuration type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CTG_CONFIG_TYP' AND C_KEY = 'NON' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CTG_CONFIG_TYP',
	'NON',
	'1',
	'en_US',
	'Not for item category configuration' ,
	'Do not create item category configuration');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CTG_CONFIG_TYP' AND C_KEY = 'CONFIG' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CTG_CONFIG_TYP',
	'CONFIG',
	'2',
	'en_US',
	'Item category configuration master' ,
	'Create item category configuration using item category configuration master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CTG_CONFIG_TYP' AND C_KEY = 'ITM_JNL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CTG_CONFIG_TYP',
	'ITM_JNL',
	'3',
	'en_US',
	'Item journal' ,
	'Place on top of the item with specified item journal cd. settings');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CTG_CONFIG_TYP' AND C_KEY = 'ITM_GRP1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CTG_CONFIG_TYP',
	'ITM_GRP1',
	'A',
	'en_US',
	'Item classification 1' ,
	'Place on top of the item with specified item classification cd. 1 settings');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CTG_CONFIG_TYP' AND C_KEY = 'ITM_GRP2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CTG_CONFIG_TYP',
	'ITM_GRP2',
	'B',
	'en_US',
	'Item classification 2' ,
	'Place on top of the item with specified item classification cd. 2 settings');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CTG_CONFIG_TYP' AND C_KEY = 'ITM_GRP3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CTG_CONFIG_TYP',
	'ITM_GRP3',
	'C',
	'en_US',
	'Item classification 3' ,
	'Place on top of the item with specified item classification cd. 3 settings');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CTG_CONFIG_TYP' AND C_KEY = 'ITM_GRP4' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CTG_CONFIG_TYP',
	'ITM_GRP4',
	'D',
	'en_US',
	'Item classification 4' ,
	'Place on top of the item with specified item classification cd. 4 settings');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CTG_CONFIG_TYP' AND C_KEY = 'ITM_GRP5' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CTG_CONFIG_TYP',
	'ITM_GRP5',
	'E',
	'en_US',
	'Item classification 5' ,
	'Place on top of the item with specified item classification cd. 5 settings');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CTG_CONFIG_TYP' AND C_KEY = 'ITM_GRP6' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CTG_CONFIG_TYP',
	'ITM_GRP6',
	'F',
	'en_US',
	'Item classification 6' ,
	'Place on top of the item with specified item classification cd. 6 settings');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CTG_CONFIG_TYP' AND C_KEY = 'ITM_GRP7' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CTG_CONFIG_TYP',
	'ITM_GRP7',
	'G',
	'en_US',
	'Item classification 7' ,
	'Place on top of the item with specified item classification cd. 7 settings');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CTG_CONFIG_TYP' AND C_KEY = 'ITM_GRP8' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CTG_CONFIG_TYP',
	'ITM_GRP8',
	'H',
	'en_US',
	'Item classification 8' ,
	'Place on top of the item with specified item classification cd. 8 settings');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CTG_CONFIG_TYP' AND C_KEY = 'ITM_GRP9' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CTG_CONFIG_TYP',
	'ITM_GRP9',
	'I',
	'en_US',
	'Item classification 9' ,
	'Place on top of the item with specified item classification cd. 9 settings');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_CTG_CONFIG_TYP' AND C_KEY = 'ITM_GRP10' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_CTG_CONFIG_TYP',
	'ITM_GRP10',
	'J',
	'en_US',
	'Item classification 10' ,
	'Place on top of the item with specified item classification cd. 10 settings');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_DPT_CONFIG_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_DPT_CONFIG_TYP',
	'en_US',
	'Dept. structure type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DPT_CONFIG_TYP' AND C_KEY = 'NON' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DPT_CONFIG_TYP',
	'NON',
	'1',
	'en_US',
	'Not for dept. structure' ,
	'Do not create dept. structure');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DPT_CONFIG_TYP' AND C_KEY = 'CONFIG' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DPT_CONFIG_TYP',
	'CONFIG',
	'2',
	'en_US',
	'Dept. structure master' ,
	'Create dept. structure with dept. structure master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DPT_CONFIG_TYP' AND C_KEY = 'LG_GRP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DPT_CONFIG_TYP',
	'LG_GRP',
	'3',
	'en_US',
	'Distribution G' ,
	'Place on top of the location with specified distribution group cd. settings');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DPT_CONFIG_TYP' AND C_KEY = 'LOC_GRP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DPT_CONFIG_TYP',
	'LOC_GRP',
	'4',
	'en_US',
	'Mfg. location G' ,
	'Place on top of the location with specified mfg. location group cd. settings');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DPT_CONFIG_TYP' AND C_KEY = 'WG' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DPT_CONFIG_TYP',
	'WG',
	'5',
	'en_US',
	'WG' ,
	'Place on top of the location with specified WG cd. settings');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_DPT_CONFIG_TYP' AND C_KEY = 'SITE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_DPT_CONFIG_TYP',
	'SITE',
	'6',
	'en_US',
	'Factory/distribution warehouse' ,
	'Place on top of the location with specified factory/distribution warehouse cd. settings');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_COEF_CONFIG_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_COEF_CONFIG_TYP',
	'en_US',
	'Allocation coefficient structure type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COEF_CONFIG_TYP' AND C_KEY = 'CONFIG' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COEF_CONFIG_TYP',
	'CONFIG',
	'1',
	'en_US',
	'Allocation coefficient structure master' ,
	'Create allocation coefficient structure with allocation coefficient structure master');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COEF_CONFIG_TYP' AND C_KEY = 'ITM_JNL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COEF_CONFIG_TYP',
	'ITM_JNL',
	'2',
	'en_US',
	'Item journal' ,
	'Set allocation coefficient to item journal cd. unit');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COEF_CONFIG_TYP' AND C_KEY = 'ITM_GRP1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COEF_CONFIG_TYP',
	'ITM_GRP1',
	'A',
	'en_US',
	'Item classification 1' ,
	'Set allocation coefficient to item classification cd. 1 unit');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COEF_CONFIG_TYP' AND C_KEY = 'ITM_GRP2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COEF_CONFIG_TYP',
	'ITM_GRP2',
	'B',
	'en_US',
	'Item classification 2' ,
	'Set allocation coefficient to item classification cd. 2 unit');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COEF_CONFIG_TYP' AND C_KEY = 'ITM_GRP3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COEF_CONFIG_TYP',
	'ITM_GRP3',
	'C',
	'en_US',
	'Item classification 3' ,
	'Set allocation coefficient to item classification cd. 3 unit');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COEF_CONFIG_TYP' AND C_KEY = 'ITM_GRP4' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COEF_CONFIG_TYP',
	'ITM_GRP4',
	'D',
	'en_US',
	'Item classification 4' ,
	'Set allocation coefficient to item classification cd. 4 unit');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COEF_CONFIG_TYP' AND C_KEY = 'ITM_GRP5' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COEF_CONFIG_TYP',
	'ITM_GRP5',
	'E',
	'en_US',
	'Item classification 5' ,
	'Set allocation coefficient to item classification cd. 5 unit');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COEF_CONFIG_TYP' AND C_KEY = 'ITM_GRP6' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COEF_CONFIG_TYP',
	'ITM_GRP6',
	'F',
	'en_US',
	'Item classification 6' ,
	'Set allocation coefficient to item classification cd. 6 unit');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COEF_CONFIG_TYP' AND C_KEY = 'ITM_GRP7' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COEF_CONFIG_TYP',
	'ITM_GRP7',
	'G',
	'en_US',
	'Item classification 7' ,
	'Set allocation coefficient to item classification cd. 7 unit');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COEF_CONFIG_TYP' AND C_KEY = 'ITM_GRP8' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COEF_CONFIG_TYP',
	'ITM_GRP8',
	'H',
	'en_US',
	'Item classification 8' ,
	'Set allocation coefficient to item classification cd. 8 unit');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COEF_CONFIG_TYP' AND C_KEY = 'ITM_GRP9' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COEF_CONFIG_TYP',
	'ITM_GRP9',
	'I',
	'en_US',
	'Item classification 9' ,
	'Set allocation coefficient to item classification cd. 9 unit');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COEF_CONFIG_TYP' AND C_KEY = 'ITM_GRP10' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COEF_CONFIG_TYP',
	'ITM_GRP10',
	'J',
	'en_US',
	'Item classification 10' ,
	'Set allocation coefficient to item classification cd. 10 unit');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COEF_CONFIG_TYP' AND C_KEY = 'NON' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COEF_CONFIG_TYP',
	'NON',
	'X',
	'en_US',
	'Release all' ,
	'Do not set allocation coefficient by item attribute');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_RPT_KEY_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_RPT_KEY_TYP',
	'en_US',
	'Report key type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_KEY_TYP' AND C_KEY = 'MNG_DPT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_KEY_TYP',
	'MNG_DPT',
	'1',
	'en_US',
	'Management dept.' ,
	'Create by management dept. cd.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_KEY_TYP' AND C_KEY = 'WG' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_KEY_TYP',
	'WG',
	'2',
	'en_US',
	'WG' ,
	'Create by WG cd.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_KEY_TYP' AND C_KEY = 'ITM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_KEY_TYP',
	'ITM',
	'3',
	'en_US',
	'Item' ,
	'Create per item cd.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_KEY_TYP' AND C_KEY = 'ITM_JNL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_KEY_TYP',
	'ITM_JNL',
	'4',
	'en_US',
	'Item journal' ,
	'Create by item journal cd.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_KEY_TYP' AND C_KEY = 'GRP1' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_KEY_TYP',
	'GRP1',
	'A',
	'en_US',
	'Item classification 1' ,
	'Create by item classification cd. 1');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_KEY_TYP' AND C_KEY = 'GRP2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_KEY_TYP',
	'GRP2',
	'B',
	'en_US',
	'Item classification 2' ,
	'Create by item classification cd. 2');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_KEY_TYP' AND C_KEY = 'GRP3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_KEY_TYP',
	'GRP3',
	'C',
	'en_US',
	'Item classification 3' ,
	'Create by item classification cd. 3');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_KEY_TYP' AND C_KEY = 'GRP4' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_KEY_TYP',
	'GRP4',
	'D',
	'en_US',
	'Item classification 4' ,
	'Create by item classification cd. 4');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_KEY_TYP' AND C_KEY = 'GRP5' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_KEY_TYP',
	'GRP5',
	'E',
	'en_US',
	'Item classification 5' ,
	'Create by item classification cd. 5');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_KEY_TYP' AND C_KEY = 'GRP6' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_KEY_TYP',
	'GRP6',
	'F',
	'en_US',
	'Item classification 6' ,
	'Create by item classification cd. 6');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_KEY_TYP' AND C_KEY = 'GRP7' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_KEY_TYP',
	'GRP7',
	'G',
	'en_US',
	'Item classification 7' ,
	'Create by item classification cd. 7');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_KEY_TYP' AND C_KEY = 'GRP8' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_KEY_TYP',
	'GRP8',
	'H',
	'en_US',
	'Item classification 8' ,
	'Create by item classification cd. 8');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_KEY_TYP' AND C_KEY = 'GRP9' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_KEY_TYP',
	'GRP9',
	'I',
	'en_US',
	'Item classification 9' ,
	'Create by item classification cd. 9');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_KEY_TYP' AND C_KEY = 'GRP10' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_KEY_TYP',
	'GRP10',
	'J',
	'en_US',
	'Item classification 10' ,
	'Create by item classification cd. 10');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_PRE_ALC_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_PRE_ALC_TYP',
	'en_US',
	'Departmental alloc. type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PRE_ALC_TYP' AND C_KEY = 'NON_OVER' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PRE_ALC_TYP',
	'NON_OVER',
	'1',
	'en_US',
	'Unnecessary (Copied)' ,
	'Exclude from allocation and do not copy the value of allocation source');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PRE_ALC_TYP' AND C_KEY = 'NON_NULL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PRE_ALC_TYP',
	'NON_NULL',
	'2',
	'en_US',
	'Unnecessary (Not copied)' ,
	'Exclude from allocation and the value will be NULL without copying from allocation source');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PRE_ALC_TYP' AND C_KEY = 'TARGET' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PRE_ALC_TYP',
	'TARGET',
	'3',
	'en_US',
	'Target' ,
	'Include in allocation and set allocation ratio');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'en_US',
	'Report type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'ST_STK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'ST_STK',
	'1',
	'en_US',
	'Beginning inventory' ,
	'Include beginning inventory data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'ST_WIP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'ST_WIP',
	'2',
	'en_US',
	'Beginning WIP' ,
	'Include beginning WIP data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'PURC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'PURC',
	'3',
	'en_US',
	'Purchase cost' ,
	'Include purchasing cost data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'COMP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'COMP',
	'4',
	'en_US',
	'Completed' ,
	'Include completed data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'IO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'IO',
	'5',
	'en_US',
	'GR/GI' ,
	'Include GR/GI data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'INPT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'INPT',
	'6',
	'en_US',
	'Input' ,
	'Include input data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'SLS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'SLS',
	'7',
	'en_US',
	'Cost of goods sold' ,
	'Include cost of goods sold data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'END_STK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'END_STK',
	'8',
	'en_US',
	'Ending inventory' ,
	'Include ending inventory');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'END_WIP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'END_WIP',
	'9',
	'en_US',
	'Ending WIP' ,
	'Include ending WIP data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'INST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'INST',
	'A',
	'en_US',
	'Incurred' ,
	'Process incurred cost');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'ST_STKWIP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'ST_STKWIP',
	'I',
	'en_US',
	'Beginning WIP inventory' ,
	'Include beginning inventory + beginning WIP data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'END_STKWIP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'END_STKWIP',
	'J',
	'en_US',
	'Ending inventory WIP' ,
	'Include ending inventory + ending WIP data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'GP_ALC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'GP_ALC',
	'L',
	'en_US',
	'General purpose allocation' ,
	'Include general purpose allocation data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'PURC_AMT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'PURC_AMT',
	'P',
	'en_US',
	'Purchase amount' ,
	'Include the amount set for purchasing data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'SLS_AMT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'SLS_AMT',
	'Q',
	'en_US',
	'Sales amount' ,
	'Target amount of set for sales data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'IO_AMT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'IO_AMT',
	'R',
	'en_US',
	'GR/GI amount' ,
	'Include the amount set for GR/GI data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'OUTSRC_AMT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'OUTSRC_AMT',
	'S',
	'en_US',
	'Subcontracting purchase amount' ,
	'Include the amount set for mfg. data (Subcontracting amount)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'OUTSRC_PAY_AMT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'OUTSRC_PAY_AMT',
	'T',
	'en_US',
	'Subcontracting payment amount' ,
	'Include the amount deducted chargeable amount from amount set for mfg. data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'IN_ONR_DIFF' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'IN_ONR_DIFF',
	'U',
	'en_US',
	'Input fee supplied gain' ,
	'Include the amount of chargeable supply gain input');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'ST_DIFF' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'ST_DIFF',
	'V',
	'en_US',
	'Beginning revised variance' ,
	'Include beginning inventory revaluation variance data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'STK_LOSS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'STK_LOSS',
	'W',
	'en_US',
	'Inventory revaluation loss' ,
	'Include inventory revaluation loss data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'ADJ' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'ADJ',
	'X',
	'en_US',
	'GR/GI difference' ,
	'Include GR/GI difference data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'ALC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'ALC',
	'Z',
	'en_US',
	'Allocation' ,
	'Include allocation data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'DIFF_QTY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'DIFF_QTY',
	'a',
	'en_US',
	'Qty. variance' ,
	'Include qty. variance data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'DIFF_UP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'DIFF_UP',
	'b',
	'en_US',
	'Issue price variance' ,
	'Include issue price variance data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'DIFF_OUTSRC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'DIFF_OUTSRC',
	'c',
	'en_US',
	'Subcontracting unit price variance' ,
	'Include subcontracting unit price variance data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'DIFF_SS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'DIFF_SS',
	'd',
	'en_US',
	'Self supply unit price variance' ,
	'Include self supply unit price variance data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'DIFF_WK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'DIFF_WK',
	'e',
	'en_US',
	'Time variance' ,
	'Include time variance data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'DIFF_A' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'DIFF_A',
	'f',
	'en_US',
	'Result variance 1' ,
	'Include variance 1 data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'DIFF_B' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'DIFF_B',
	'g',
	'en_US',
	'Result variance 2' ,
	'Include variance 2 data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'DIFF_C' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'DIFF_C',
	'h',
	'en_US',
	'Result variance 3' ,
	'Include variance 3 data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'DIFF_D' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'DIFF_D',
	'i',
	'en_US',
	'Result variance 4' ,
	'Include variance 4 data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'DIFF_E' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'DIFF_E',
	'j',
	'en_US',
	'Result variance 5' ,
	'Include variance 5 data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'DIFF_RT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'DIFF_RT',
	'k',
	'en_US',
	'Allocation rate variance' ,
	'Include allocation rate variance data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'DIFF_STD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'DIFF_STD',
	'l',
	'en_US',
	'Standard adjustment variance' ,
	'Include standard adjustment variance data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'DIFF_INST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'DIFF_INST',
	'm',
	'en_US',
	'Mfg. cost variance' ,
	'Include mfg. cost variance data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'DIFF_IO_PRI' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'DIFF_IO_PRI',
	'n',
	'en_US',
	'Receipt price variance' ,
	'Include receipt price variance data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'DIFF_QTY_CHD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'DIFF_QTY_CHD',
	'o',
	'en_US',
	'Qty. variance' ,
	'Include qty. variance data in units of child item');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'DIFF_UP_CHD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'DIFF_UP_CHD',
	'p',
	'en_US',
	'Issue price variance (Child)' ,
	'Include issue price variance data in units of child item');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RPT_TGT_TYP' AND C_KEY = 'DIFF_SS_CHD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RPT_TGT_TYP',
	'DIFF_SS_CHD',
	'q',
	'en_US',
	'Self supply unit price variance (Child)' ,
	'Include self supply unit price variance data in units of child item');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_QTY_UNIT_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_QTY_UNIT_TYP',
	'en_US',
	'Quantity unit type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_QTY_UNIT_TYP' AND C_KEY = 'BASE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_QTY_UNIT_TYP',
	'BASE',
	'1',
	'en_US',
	'Base unit' ,
	'Base unit qty.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_QTY_UNIT_TYP' AND C_KEY = 'DIM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_QTY_UNIT_TYP',
	'DIM',
	'2',
	'en_US',
	'Volume unit' ,
	'Quantity in volume unit');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_QTY_UNIT_TYP' AND C_KEY = 'WT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_QTY_UNIT_TYP',
	'WT',
	'3',
	'en_US',
	'Weight unit' ,
	'Quantity in weight units');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_QTY_UNIT_TYP' AND C_KEY = 'CONTS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_QTY_UNIT_TYP',
	'CONTS',
	'4',
	'en_US',
	'Conversion unit' ,
	'Quantity of conversion unit');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_UPRI_SET_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_UPRI_SET_TYP',
	'en_US',
	'Evaluation unit price setting type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_UPRI_SET_TYP' AND C_KEY = 'STD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_UPRI_SET_TYP',
	'STD',
	'1',
	'en_US',
	'Calculation result of standard unit cost' ,
	'Use calculation result of standard unit cost');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_UPRI_SET_TYP' AND C_KEY = 'AVG_PURC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_UPRI_SET_TYP',
	'AVG_PURC',
	'2',
	'en_US',
	'Average purchase unit price in specified period' ,
	'Use average purchase unit price in specified period');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_UPRI_SET_TYP' AND C_KEY = 'AVG_SLS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_UPRI_SET_TYP',
	'AVG_SLS',
	'3',
	'en_US',
	'Average sales unit price in specified period' ,
	'Use average sales unit price in specified period');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_UPRI_SET_TYP' AND C_KEY = 'PREV_PURC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_UPRI_SET_TYP',
	'PREV_PURC',
	'4',
	'en_US',
	'Latest purchase unit price in specified period' ,
	'Use latest purchase unit price in specified period');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_UPRI_SET_TYP' AND C_KEY = 'PREV_SLS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_UPRI_SET_TYP',
	'PREV_SLS',
	'5',
	'en_US',
	'Latest sales unit price in specified period' ,
	'Use latest sales unit price in specified period');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_IO_TGT_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_IO_TGT_TYP',
	'en_US',
	'GR/GI type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IO_TGT_TYP' AND C_KEY = 'ST_STK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IO_TGT_TYP',
	'ST_STK',
	'1',
	'en_US',
	'Beginning inventory' ,
	'Include beginning inventory data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IO_TGT_TYP' AND C_KEY = 'ST_WIP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IO_TGT_TYP',
	'ST_WIP',
	'2',
	'en_US',
	'Beginning WIP' ,
	'Include beginning WIP data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IO_TGT_TYP' AND C_KEY = 'PURC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IO_TGT_TYP',
	'PURC',
	'3',
	'en_US',
	'Purchase' ,
	'Include purchasing data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IO_TGT_TYP' AND C_KEY = 'COMP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IO_TGT_TYP',
	'COMP',
	'4',
	'en_US',
	'Completed' ,
	'Include completed data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IO_TGT_TYP' AND C_KEY = 'INST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IO_TGT_TYP',
	'INST',
	'5',
	'en_US',
	'Incurred' ,
	'Process incurred cost');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IO_TGT_TYP' AND C_KEY = 'INPT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IO_TGT_TYP',
	'INPT',
	'6',
	'en_US',
	'Input' ,
	'Include input data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IO_TGT_TYP' AND C_KEY = 'SLS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IO_TGT_TYP',
	'SLS',
	'7',
	'en_US',
	'Sales result' ,
	'Target sales data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IO_TGT_TYP' AND C_KEY = 'END_STK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IO_TGT_TYP',
	'END_STK',
	'8',
	'en_US',
	'Ending inventory' ,
	'Include ending inventory data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IO_TGT_TYP' AND C_KEY = 'END_WIP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IO_TGT_TYP',
	'END_WIP',
	'9',
	'en_US',
	'Ending WIP' ,
	'Include ending WIP data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IO_TGT_TYP' AND C_KEY = 'FFR_PROV_IN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IO_TGT_TYP',
	'FFR_PROV_IN',
	'A',
	'en_US',
	'Non-chargeable supply GR' ,
	'Include receipt data which cost GR/GI type is non-chargeable supply in GR/GI data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IO_TGT_TYP' AND C_KEY = 'FFR_PROV_OUT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IO_TGT_TYP',
	'FFR_PROV_OUT',
	'B',
	'en_US',
	'Non-chargeable supply issue' ,
	'Include issue data which cost GR/GI type is non-chargeable supply in GR/GI data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IO_TGT_TYP' AND C_KEY = 'ONR_PROV_IN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IO_TGT_TYP',
	'ONR_PROV_IN',
	'C',
	'en_US',
	'GR (chargeable supply)' ,
	'Include receipt data which cost GR/GI type is chargeable supply in GR/GI data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IO_TGT_TYP' AND C_KEY = 'ONR_PROV_OUT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IO_TGT_TYP',
	'ONR_PROV_OUT',
	'D',
	'en_US',
	'Chargeable supply issue' ,
	'Include issue data which cost GR/GI type is chargeable supply in GR/GI data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IO_TGT_TYP' AND C_KEY = 'STK_IN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IO_TGT_TYP',
	'STK_IN',
	'E',
	'en_US',
	'GR' ,
	'Include data which cost GR/GI type is GR in GR/GI data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IO_TGT_TYP' AND C_KEY = 'STK_OUT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IO_TGT_TYP',
	'STK_OUT',
	'F',
	'en_US',
	'GI' ,
	'Include data which cost GR/GI type is GI in GR/GI data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IO_TGT_TYP' AND C_KEY = 'STK_IO_IN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IO_TGT_TYP',
	'STK_IO_IN',
	'G',
	'en_US',
	'GR/GI receipt' ,
	'Include receipt data which cost GR/GI type is GR/GI in GR/GI data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IO_TGT_TYP' AND C_KEY = 'STK_IO_OUT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IO_TGT_TYP',
	'STK_IO_OUT',
	'H',
	'en_US',
	'GR/GI issue' ,
	'Include issue data which cost GR/GI type is GR/GI in GR/GI data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IO_TGT_TYP' AND C_KEY = 'ST_STKWIP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IO_TGT_TYP',
	'ST_STKWIP',
	'I',
	'en_US',
	'Beginning WIP inventory' ,
	'Include beginning inventory + beginning WIP data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IO_TGT_TYP' AND C_KEY = 'END_STKWIP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IO_TGT_TYP',
	'END_STKWIP',
	'J',
	'en_US',
	'Ending inventory WIP' ,
	'Include ending inventory + ending WIP data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IO_TGT_TYP' AND C_KEY = 'LOSS_EVAL' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IO_TGT_TYP',
	'LOSS_EVAL',
	'K',
	'en_US',
	'Revaluation loss' ,
	'Include evaluation loss data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IO_TGT_TYP' AND C_KEY = 'GP_ALC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IO_TGT_TYP',
	'GP_ALC',
	'L',
	'en_US',
	'General purpose allocation' ,
	'Include general purpose allocation data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IO_TGT_TYP' AND C_KEY = 'AVE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IO_TGT_TYP',
	'AVE',
	'T',
	'en_US',
	'Weighted average unit price' ,
	'Include weighted average unit price data');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_IO_SML_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_IO_SML_TYP',
	'en_US',
	'GR/GI aggregated unit type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IO_SML_TYP' AND C_KEY = 'IO_TGT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IO_SML_TYP',
	'IO_TGT',
	'1',
	'en_US',
	'GR/GI unit' ,
	'Aggregate data in GR/GI type unit');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IO_SML_TYP' AND C_KEY = 'AC_SLIP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IO_SML_TYP',
	'AC_SLIP',
	'2',
	'en_US',
	'GR/GI object/accounting slip unit' ,
	'Aggregate data per GR/GI type and accounting slip type');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IO_SML_TYP' AND C_KEY = 'AC_RSN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IO_SML_TYP',
	'AC_RSN',
	'3',
	'en_US',
	'GR/GI object/accounting slip/accounting reason' ,
	'Aggregate data per GR/GI type, accounting slip type, and accounting reason cd.');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_BAL_CALC_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_BAL_CALC_TYP',
	'en_US',
	'Variance calculation type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BAL_CALC_TYP' AND C_KEY = 'NON' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BAL_CALC_TYP',
	'NON',
	'1',
	'en_US',
	'Non-target' ,
	'Exclude from GR/GI difference calculation');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BAL_CALC_TYP' AND C_KEY = 'PLUS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BAL_CALC_TYP',
	'PLUS',
	'2',
	'en_US',
	'Plus' ,
	'Plus column in GR/GI difference calculation');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_BAL_CALC_TYP' AND C_KEY = 'NEGATIVE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_BAL_CALC_TYP',
	'NEGATIVE',
	'3',
	'en_US',
	'Minus' ,
	'Minus column in GR/GI difference calculation');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_EXP_ALLOC_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_EXP_ALLOC_TYP',
	'en_US',
	'Explosion allocation type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_EXP_ALLOC_TYP' AND C_KEY = 'COST_RATIO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_EXP_ALLOC_TYP',
	'COST_RATIO',
	'1',
	'en_US',
	'Cost ratio' ,
	'Distribute and allocate by cost ratio');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_EXP_ALLOC_TYP' AND C_KEY = 'EXP_PRIO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_EXP_ALLOC_TYP',
	'EXP_PRIO',
	'2',
	'en_US',
	'Explosion priority' ,
	'Allocate in order from where the lowest explosion priority');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_IO_TRANS_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_IO_TRANS_TYP',
	'en_US',
	'GR/GI transfer type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IO_TRANS_TYP' AND C_KEY = 'ALC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IO_TRANS_TYP',
	'ALC',
	'1',
	'en_US',
	'Expense transfer' ,
	'Indicate allocating GI amount');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IO_TRANS_TYP' AND C_KEY = 'INPT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IO_TRANS_TYP',
	'INPT',
	'2',
	'en_US',
	'Input transfer' ,
	'Indicates to be input result');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IO_TRANS_TYP' AND C_KEY = 'GR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IO_TRANS_TYP',
	'GR',
	'3',
	'en_US',
	'GR transfer' ,
	'Indicate to process as GR data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_IO_TRANS_TYP' AND C_KEY = 'NON' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_IO_TRANS_TYP',
	'NON',
	'X',
	'en_US',
	'Non-target' ,
	'Indicate not to transfer');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_SET_TGT_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_SET_TGT_TYP',
	'en_US',
	'Setting type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SET_TGT_TYP' AND C_KEY = 'INPT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SET_TGT_TYP',
	'INPT',
	'1',
	'en_US',
	'Input' ,
	'Create cost by cost element for input result');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SET_TGT_TYP' AND C_KEY = 'IO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SET_TGT_TYP',
	'IO',
	'2',
	'en_US',
	'GR/GI' ,
	'Create cost by cost element for GR/GI result');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SET_TGT_TYP' AND C_KEY = 'SLS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SET_TGT_TYP',
	'SLS',
	'3',
	'en_US',
	'Sales result' ,
	'Create cost for result cost by cost element');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SET_TGT_TYP' AND C_KEY = 'IO_IN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SET_TGT_TYP',
	'IO_IN',
	'4',
	'en_US',
	'GR/GI (GR)' ,
	'Create cost by cost element for GR/GI result (Only for GR)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SET_TGT_TYP' AND C_KEY = 'IO_OUT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SET_TGT_TYP',
	'IO_OUT',
	'5',
	'en_US',
	'GR/GI (GI)' ,
	'Create cost by cost element for GR/GI result (Only for GI)');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_AMT_SET_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_AMT_SET_TYP',
	'en_US',
	'Amount setting type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AMT_SET_TYP' AND C_KEY = 'STD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AMT_SET_TYP',
	'STD',
	'1',
	'en_US',
	'Standard cost unit cost at calculation' ,
	'Calculate using standard unit cost data calculated at price calculation');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AMT_SET_TYP' AND C_KEY = 'ZERO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AMT_SET_TYP',
	'ZERO',
	'2',
	'en_US',
	'0 evaluation' ,
	'Amount is 0');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AMT_SET_TYP' AND C_KEY = 'AVE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AMT_SET_TYP',
	'AVE',
	'3',
	'en_US',
	'Latest firm weighted average unit price' ,
	'Calculate using latest firmed weighted average unit price');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_AMT_SET_TYP' AND C_KEY = 'AVE_STD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_AMT_SET_TYP',
	'AVE_STD',
	'4',
	'en_US',
	'Latest firm weighted average unit price (Standard)' ,
	'If no latest firmed weighted average unit cost exist, it shall be standard unit cost evaluation');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_COST_IO_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_COST_IO_TYP',
	'en_US',
	'Cost GR/GI type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COST_IO_TYP' AND C_KEY = 'FFR_PROV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COST_IO_TYP',
	'FFR_PROV',
	'11',
	'en_US',
	'Non-chargeable supply' ,
	'data to be non-chargeable supply');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COST_IO_TYP' AND C_KEY = 'ONR_PROV' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COST_IO_TYP',
	'ONR_PROV',
	'12',
	'en_US',
	'chargeable supply' ,
	'Data to chargeable supply');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COST_IO_TYP' AND C_KEY = 'STK_IN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COST_IO_TYP',
	'STK_IN',
	'20',
	'en_US',
	'GR' ,
	'Data to GR');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COST_IO_TYP' AND C_KEY = 'STK_OUT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COST_IO_TYP',
	'STK_OUT',
	'30',
	'en_US',
	'GI' ,
	'GI data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COST_IO_TYP' AND C_KEY = 'STK_IO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COST_IO_TYP',
	'STK_IO',
	'40',
	'en_US',
	'GR/GI' ,
	'Data to GR/GI');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_PRE_ALC_SET_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_PRE_ALC_SET_TYP',
	'en_US',
	'Departmental alloc. setting type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PRE_ALC_SET_TYP' AND C_KEY = 'WK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PRE_ALC_SET_TYP',
	'WK',
	'1',
	'en_US',
	'Man-hour' ,
	'Create ratio data with man-hour');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PRE_ALC_SET_TYP' AND C_KEY = 'MFG_QTY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PRE_ALC_SET_TYP',
	'MFG_QTY',
	'2',
	'en_US',
	'Mfg. qty.' ,
	'Create ratio data with mfg. qty.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PRE_ALC_SET_TYP' AND C_KEY = 'MFG_AMT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PRE_ALC_SET_TYP',
	'MFG_AMT',
	'3',
	'en_US',
	'Mfg. amount' ,
	'Create ratio data with mfg. (Subcontracting) amount');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PRE_ALC_SET_TYP' AND C_KEY = 'PURC_QTY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PRE_ALC_SET_TYP',
	'PURC_QTY',
	'4',
	'en_US',
	'Purchase qty.' ,
	'Create ratio data with purchase qty.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PRE_ALC_SET_TYP' AND C_KEY = 'PURC_AMT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PRE_ALC_SET_TYP',
	'PURC_AMT',
	'5',
	'en_US',
	'Purchase amount' ,
	'Create ratio data with purchase amount as target');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PRE_ALC_SET_TYP' AND C_KEY = 'SLS_QTY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PRE_ALC_SET_TYP',
	'SLS_QTY',
	'6',
	'en_US',
	'Sales qty.' ,
	'Create ratio data with sales qty.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PRE_ALC_SET_TYP' AND C_KEY = 'SLS_AMT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PRE_ALC_SET_TYP',
	'SLS_AMT',
	'7',
	'en_US',
	'Sales amount' ,
	'Create ratio data with sales amount');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_RQMT_PLN_IMP_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_RQMT_PLN_IMP_TYP',
	'en_US',
	'Monthly plan import type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RQMT_PLN_IMP_TYP' AND C_KEY = 'MLY_RQMT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RQMT_PLN_IMP_TYP',
	'MLY_RQMT',
	'1',
	'en_US',
	'Monthly production request' ,
	'Import plan from monthly production request table');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RQMT_PLN_IMP_TYP' AND C_KEY = 'RQMT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RQMT_PLN_IMP_TYP',
	'RQMT',
	'2',
	'en_US',
	'Daily production request' ,
	'Import plan from daily production request info. table');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RQMT_PLN_IMP_TYP' AND C_KEY = 'DMND' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RQMT_PLN_IMP_TYP',
	'DMND',
	'3',
	'en_US',
	'Daily demand' ,
	'Import plan from daily demand table');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RQMT_PLN_IMP_TYP' AND C_KEY = 'DMND_RQMT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RQMT_PLN_IMP_TYP',
	'DMND_RQMT',
	'4',
	'en_US',
	'Daily production request + Daily demand' ,
	'Import plan from daily production request info. + daily demand table');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RQMT_PLN_IMP_TYP' AND C_KEY = 'PRCD_RQMT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RQMT_PLN_IMP_TYP',
	'PRCD_RQMT',
	'5',
	'en_US',
	'Daily production request + Long LT daily production request' ,
	'Import plan from daily production request info. + long LT daily production request info. table');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_RQMT_PLN_IMP_TYP' AND C_KEY = 'SIM_RQMT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_RQMT_PLN_IMP_TYP',
	'SIM_RQMT',
	'6',
	'en_US',
	'Request for simulation' ,
	'Import plan from daily production request info. for simulation');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_MFG_PLN_IMP_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_MFG_PLN_IMP_TYP',
	'en_US',
	'Mfg. plan import type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MFG_PLN_IMP_TYP' AND C_KEY = 'ITM_ORDER' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MFG_PLN_IMP_TYP',
	'ITM_ORDER',
	'1',
	'en_US',
	'Item order' ,
	'Import plan from item order info. table');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MFG_PLN_IMP_TYP' AND C_KEY = 'PRCD_ITM_ORDER' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MFG_PLN_IMP_TYP',
	'PRCD_ITM_ORDER',
	'2',
	'en_US',
	'Item order + Long LT item order' ,
	'Import plan from item order + Long LT item order info. table');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MFG_PLN_IMP_TYP' AND C_KEY = 'SIM_ITM_ORDER' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MFG_PLN_IMP_TYP',
	'SIM_ITM_ORDER',
	'3',
	'en_US',
	'Item order for simulation' ,
	'Import plan from simulation item order info. table');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_PURC_PLN_IMP_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_PURC_PLN_IMP_TYP',
	'en_US',
	'Purchase plan import type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PURC_PLN_IMP_TYP' AND C_KEY = 'ITM_ORDER' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PURC_PLN_IMP_TYP',
	'ITM_ORDER',
	'1',
	'en_US',
	'Item order' ,
	'Import plan from item order info. table');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PURC_PLN_IMP_TYP' AND C_KEY = 'PRCD_ITM_ORDER' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PURC_PLN_IMP_TYP',
	'PRCD_ITM_ORDER',
	'2',
	'en_US',
	'Item order + Long LT item order' ,
	'Import plan from item order + Long LT item order info. table');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PURC_PLN_IMP_TYP' AND C_KEY = 'SIM_ITM_ORDER' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PURC_PLN_IMP_TYP',
	'SIM_ITM_ORDER',
	'3',
	'en_US',
	'Item order for simulation' ,
	'Import plan from simulation item order info. table');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_SLS_PLN_IMP_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_SLS_PLN_IMP_TYP',
	'en_US',
	'Sales plan import type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SLS_PLN_IMP_TYP' AND C_KEY = 'MLY_SPLN_AMT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SLS_PLN_IMP_TYP',
	'MLY_SPLN_AMT',
	'1',
	'en_US',
	'Monthly sales plan (With amount)' ,
	'Import plan from latest sales plan by item by aggregation table. Interface qty. and amount');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SLS_PLN_IMP_TYP' AND C_KEY = 'MLY_SPLN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SLS_PLN_IMP_TYP',
	'MLY_SPLN',
	'2',
	'en_US',
	'Monthly sales plan (Without amount)' ,
	'Import plan from latest sales plan by item by aggregation table. Interface quantities only');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_LOSS_EVAL_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_LOSS_EVAL_TYP',
	'en_US',
	'Evaluation loss calculation type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_LOSS_EVAL_TYP' AND C_KEY = 'NON' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_LOSS_EVAL_TYP',
	'NON',
	'1',
	'en_US',
	'Non-target' ,
	'Set to column not used in unit price evaluation at the time of evaluation loss calculation');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_LOSS_EVAL_TYP' AND C_KEY = 'TGT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_LOSS_EVAL_TYP',
	'TGT',
	'2',
	'en_US',
	'Target' ,
	'Set to column used in unit price evaluation at the time of evaluation loss calculation');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_PS_USE_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_PS_USE_TYP',
	'en_US',
	'Production/sales use type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PS_USE_TYP' AND C_KEY = 'PRODSLS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PS_USE_TYP',
	'PRODSLS',
	'1',
	'en_US',
	'Used in production/sales data' ,
	'Use for production asset/sales asset data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PS_USE_TYP' AND C_KEY = 'PROD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PS_USE_TYP',
	'PROD',
	'2',
	'en_US',
	'Use production asset only' ,
	'Use for production asset data');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_PS_USE_TYP' AND C_KEY = 'SLS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_PS_USE_TYP',
	'SLS',
	'3',
	'en_US',
	'Use sales asset only' ,
	'Use for data of sales assets');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_WIP_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_WIP_TYP',
	'en_US',
	'WIP type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_WIP_TYP' AND C_KEY = 'NON' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_WIP_TYP',
	'NON',
	'1',
	'en_US',
	'Non-target' ,
	'Not to be WIP managed');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_WIP_TYP' AND C_KEY = 'TGT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_WIP_TYP',
	'TGT',
	'2',
	'en_US',
	'Target' ,
	'To be WIP managed');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_WIP_TYP' AND C_KEY = 'TGT_IN' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_WIP_TYP',
	'TGT_IN',
	'3',
	'en_US',
	'Target (In-house)' ,
	'WIP managed (Only in-house data will be WIP managed, not subcontracting data)');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_INPT_LOC_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_INPT_LOC_TYP',
	'en_US',
	'Input location type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_INPT_LOC_TYP' AND C_KEY = 'DPT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_INPT_LOC_TYP',
	'DPT',
	'1',
	'en_US',
	'Dept. structure' ,
	'Include input result of location within the dept. structure');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_INPT_LOC_TYP' AND C_KEY = 'LOC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_INPT_LOC_TYP',
	'LOC',
	'2',
	'en_US',
	'Location' ,
	'Include input result with matching location');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_INPT_LOC_TYP' AND C_KEY = 'NON' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_INPT_LOC_TYP',
	'NON',
	'3',
	'en_US',
	'Release all' ,
	'Do not consider location');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_INPT_LOC_TYP' AND C_KEY = 'MNG_DPT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_INPT_LOC_TYP',
	'MNG_DPT',
	'4',
	'en_US',
	'Management dept.' ,
	'Include input result with matching management dept.');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_SLS_UPRI_IMP_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_SLS_UPRI_IMP_TYP',
	'en_US',
	'Sales unit price import type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SLS_UPRI_IMP_TYP' AND C_KEY = 'STD' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SLS_UPRI_IMP_TYP',
	'STD',
	'1',
	'en_US',
	'Standard sales unit price' ,
	'Import standard sales unit price master only.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SLS_UPRI_IMP_TYP' AND C_KEY = 'ITM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SLS_UPRI_IMP_TYP',
	'ITM',
	'2',
	'en_US',
	'Item sales unit price' ,
	'Import item sales unit price master only.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SLS_UPRI_IMP_TYP' AND C_KEY = 'CST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SLS_UPRI_IMP_TYP',
	'CST',
	'3',
	'en_US',
	'Customer sales unit price' ,
	'Import customer sales unit price master only.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SLS_UPRI_IMP_TYP' AND C_KEY = 'STD_ITM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SLS_UPRI_IMP_TYP',
	'STD_ITM',
	'4',
	'en_US',
	'Standard sales unit price + Item sales unit price' ,
	'Import standard sales unit price master and item sales unit price master.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_SLS_UPRI_IMP_TYP' AND C_KEY = 'STD_ITM_CST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_SLS_UPRI_IMP_TYP',
	'STD_ITM_CST',
	'5',
	'en_US',
	'Standard sales unit price + Item sales unit price + Customer sales unit price' ,
	'Import standard sales unit price master, item sales unit price master, and customer sales unit price master.');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_COST_TABLE_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_COST_TABLE_TYP',
	'en_US',
	'Cost table type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COST_TABLE_TYP' AND C_KEY = 'ITM_MFG_INST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COST_TABLE_TYP',
	'ITM_MFG_INST',
	'ITM_MFG_INST',
	'en_US',
	'Item mfg. order info.' ,
	'Item mfg. order info. is processed');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COST_TABLE_TYP' AND C_KEY = 'ACT_PURC_IF' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COST_TABLE_TYP',
	'ACT_PURC_IF',
	'ACT_PURC_IF',
	'en_US',
	'Purchase result IF' ,
	'Process purchase result IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COST_TABLE_TYP' AND C_KEY = 'ACT_SLS_IF' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COST_TABLE_TYP',
	'ACT_SLS_IF',
	'ACT_SLS_IF',
	'en_US',
	'Sales result IF' ,
	'Process sales result IF.');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_TGT_COL_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_TGT_COL_TYP',
	'en_US',
	'Column type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TGT_COL_TYP' AND C_KEY = 'PO_NO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TGT_COL_TYP',
	'PO_NO',
	'PO_NO',
	'en_US',
	'PO No.' ,
	'Process PO No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TGT_COL_TYP' AND C_KEY = 'SLO_NO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TGT_COL_TYP',
	'SLO_NO',
	'SLO_NO',
	'en_US',
	'Sales order No.' ,
	'Process sales order No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_TGT_COL_TYP' AND C_KEY = 'IV_NO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_TGT_COL_TYP',
	'IV_NO',
	'IV_NO',
	'en_US',
	'Invoice No.' ,
	'Invoice No. should be processed.');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_COL_PROC_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_COL_PROC_TYP',
	'en_US',
	'Column process type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COL_PROC_TYP' AND C_KEY = 'SET_UP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COL_PROC_TYP',
	'SET_UP',
	'1',
	'en_US',
	'Set' ,
	'Set value.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_COL_PROC_TYP' AND C_KEY = 'NOT_SET' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_COL_PROC_TYP',
	'NOT_SET',
	'2',
	'en_US',
	'Do not set' ,
	'Do not set value.');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_ITM_MFG_INST_NO_SET_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_ITM_MFG_INST_NO_SET_TYP',
	'en_US',
	'Item mfg. order No. setting type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_ITM_MFG_INST_NO_SET_TYP' AND C_KEY = 'LOC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_ITM_MFG_INST_NO_SET_TYP',
	'LOC',
	'1',
	'en_US',
	'Location' ,
	'Set location cd. to item manufacturing order No. (Aggregate  manufacturing information for each location)');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_MFG_ACT_NO_SET_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_MFG_ACT_NO_SET_TYP',
	'en_US',
	'Mfg. result No. setting type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_MFG_ACT_NO_SET_TYP' AND C_KEY = 'NON' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_MFG_ACT_NO_SET_TYP',
	'NON',
	'1',
	'en_US',
	'No setting' ,
	'Do not set manufacturing result No. (Ignore manufacturing result No. and aggregate manufacturing information)');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MAC_OPER_ACT_NO_SET_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MAC_OPER_ACT_NO_SET_TYP',
	'en_US',
	'Operation result No. setting type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_OPER_ACT_NO_SET_TYP' AND C_KEY = 'NON' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_OPER_ACT_NO_SET_TYP',
	'NON',
	'1',
	'en_US',
	'No setting' ,
	'Do not set operation result No. (Ignore operation and aggregate production information)');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MAC_OPER_ACT_NO_SET_TYP' AND C_KEY = 'OPER' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MAC_OPER_ACT_NO_SET_TYP',
	'OPER',
	'2',
	'en_US',
	'Operation' ,
	'Set operation cd. to manufacturing result No. (Aggregate manufacturing information for each operation)');
