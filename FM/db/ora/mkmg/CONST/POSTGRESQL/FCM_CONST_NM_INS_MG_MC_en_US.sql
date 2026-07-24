DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'en_US',
	'Numbering system type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'ST_STK_KEY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'ST_STK_KEY',
	'MGS_ST_STK_KEY',
	'en_US',
	'Beginning inventory key' ,
	'Key of beginning inventory');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'ST_WIP_KEY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'ST_WIP_KEY',
	'MGS_ST_WIP_KEY',
	'en_US',
	'Beginning WIP key' ,
	'Key of beginning WIP');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'PLN_RQMT_KEY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'PLN_RQMT_KEY',
	'MGS_PLN_RQMT_KEY',
	'en_US',
	'Monthly plan key' ,
	'Key of monthly plan');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'PLN_MFG_KEY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'PLN_MFG_KEY',
	'MGS_PLN_MFG_KEY',
	'en_US',
	'Mfg. plan key' ,
	'Key of mfg. plan');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'PLN_PURC_KEY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'PLN_PURC_KEY',
	'MGS_PLN_PURC_KEY',
	'en_US',
	'Purchase plan key' ,
	'Key of purchase plan');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'PLN_SLS_KEY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'PLN_SLS_KEY',
	'MGS_PLN_SLS_KEY',
	'en_US',
	'Sales plan key' ,
	'Key of sales plan');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'PLN_ITM_WK_KEY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'PLN_ITM_WK_KEY',
	'MGS_PLN_ITM_WK_KEY',
	'en_US',
	'Item man-hour plan key' ,
	'Key of item man-hour plan');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'PLN_OTHER_WK_KEY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'PLN_OTHER_WK_KEY',
	'MGS_PLN_OTHER_WK_KEY',
	'en_US',
	'Indirect man-hour plan key' ,
	'Key of indirect man-hour plan');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'PLN_INPT_KEY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'PLN_INPT_KEY',
	'MGS_PLN_INPT_KEY',
	'en_US',
	'Input plan key' ,
	'Key of input plan');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'PLN_ALC_AMT_KEY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'PLN_ALC_AMT_KEY',
	'MGS_PLN_ALC_AMT_KEY',
	'en_US',
	'Allocable expenses plan key' ,
	'Key of allocable expenses plan');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'ACT_ALC_AMT_KEY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'ACT_ALC_AMT_KEY',
	'MGS_ACT_ALC_AMT_KEY',
	'en_US',
	'Allocable expenses result key' ,
	'Key of allocable expenses result IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'PLN_ALC_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'PLN_ALC_IF_DATA_LNO',
	'MGS_PLN_ALC_IF_DATA_LNO',
	'en_US',
	'Data row No. of allocable expenses plan IF' ,
	'Data row No. of allocable expenses plan IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'ACT_ALC_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'ACT_ALC_IF_DATA_LNO',
	'MGS_ACT_ALC_IF_DATA_LNO',
	'en_US',
	'Data row No. of allocable expenses result IF' ,
	'Data row No. of allocable expenses result IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'ITM_MFG_INST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'ITM_MFG_INST',
	'MGS_ITM_MFG_INST',
	'en_US',
	'Item mfg. order No.' ,
	'Item mfg. order No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'ACT_MFG_ID' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'ACT_MFG_ID',
	'MGS_ACT_MFG_ID',
	'en_US',
	'Mfg. result ID' ,
	'ID of mfg. result');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'ACT_PURC_ID' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'ACT_PURC_ID',
	'MGS_ACT_PURC_ID',
	'en_US',
	'Purchase result ID' ,
	'ID of purchasing result');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'ACT_INPT_ID' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'ACT_INPT_ID',
	'MGS_ACT_INPT_ID',
	'en_US',
	'Input result ID' ,
	'ID of input result');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'ACT_INST_WK_ID' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'ACT_INST_WK_ID',
	'MGS_ACT_INST_WK_ID',
	'en_US',
	'Order direct man-hour result ID' ,
	'ID of order direct man-hour');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'ACT_OTHER_WK_ID' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'ACT_OTHER_WK_ID',
	'MGS_ACT_OTHER_WK_ID',
	'en_US',
	'Indirect man-hour result ID' ,
	'ID of indirect man-hour result');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'ACT_IO_ID' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'ACT_IO_ID',
	'MGS_ACT_IO_ID',
	'en_US',
	'GR/GI result ID' ,
	'ID of GR/GI result');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'ACT_SLS_ID' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'ACT_SLS_ID',
	'MGS_ACT_SLS_ID',
	'en_US',
	'Sales result ID' ,
	'ID of sales result');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'ACT_MFG_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'ACT_MFG_IF_DATA_LNO',
	'MGS_ACT_MFG_IF_DATA_LNO',
	'en_US',
	'Data rows No. of mfg. result IF' ,
	'Data rows No. of mfg. result IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'ACT_PURC_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'ACT_PURC_IF_DATA_LNO',
	'MGS_ACT_PURC_IF_DATA_LNO',
	'en_US',
	'Data row No. of purchasing result IF' ,
	'Data row No. of purchasing result IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'ACT_INPT_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'ACT_INPT_IF_DATA_LNO',
	'MGS_ACT_INPT_IF_DATA_LNO',
	'en_US',
	'Data row No. of input result IF.' ,
	'Data row No. of input result IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'ACT_INST_WK_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'ACT_INST_WK_IF_DATA_LNO',
	'MGS_ACT_INST_WK_IF_DATA_LNO',
	'en_US',
	'Order direct man-hour result IF data row No.' ,
	'Data row No. of order direct man-hour result IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'ACT_OTHER_WK_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'ACT_OTHER_WK_IF_DATA_LNO',
	'MGS_ACT_OTHER_WK_IF_DATA_LNO',
	'en_US',
	'Indirect man-hour result IF data row No.' ,
	'Data row No. of indirect man-hour result IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'ACT_IO_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'ACT_IO_IF_DATA_LNO',
	'MGS_ACT_IO_IF_DATA_LNO',
	'en_US',
	'Data row No. of GR/GI result IF' ,
	'Data row No. of GR/GI result IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'ACT_SLS_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'ACT_SLS_IF_DATA_LNO',
	'MGS_ACT_SLS_IF_DATA_LNO',
	'en_US',
	'Sales result IF rows of data No.' ,
	'Data row No. of sales result IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'ACT_INST_WIP_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'ACT_INST_WIP_IF_DATA_LNO',
	'MGS_ACT_INST_WIP_IF_DATA_LNO',
	'en_US',
	'In process order result data row No.' ,
	'Data row No. of in process order result');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'ACT_STK_IF_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'ACT_STK_IF_DATA_LNO',
	'MGS_ACT_STK_IF_DATA_LNO',
	'en_US',
	'Data row No. of inventory result IF' ,
	'Data row No. of inventory result IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'IO_ACT_RCV_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'IO_ACT_RCV_DATA_LNO',
	'MGS_IO_ACT_RCV_DATA_LNO',
	'en_US',
	'Data row No. of GR/GI result import IF' ,
	'Data row No. of allocable expenses plan IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'ACT_WK_RCV_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'ACT_WK_RCV_DATA_LNO',
	'MGS_ACT_WK_RCV_DATA_LNO',
	'en_US',
	'Data row No. of man-hour info. import IF' ,
	'Data row No. of allocable expenses result IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'ACT_INST_WIP_RCV_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'ACT_INST_WIP_RCV_DATA_LNO',
	'MGS_ACT_INST_WIP_RCV_DATA_LNO',
	'en_US',
	'Data row No. of WIP info. import IF' ,
	'Data row No. of allocable expenses plan IF');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_NUM_SYS_TYP' AND C_KEY = 'ACT_STK_RCV_DATA_LNO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_NUM_SYS_TYP',
	'ACT_STK_RCV_DATA_LNO',
	'MGS_ACT_STK_RCV_DATA_LNO',
	'en_US',
	'Data row No. of inventory info. import IF' ,
	'Data row No. of allocable expenses result IF');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MGC_ALC_REC_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MGC_ALC_REC_TYP',
	'en_US',
	'Expense incurred type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_ALC_REC_TYP' AND C_KEY = 'AC_IMP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_ALC_REC_TYP',
	'AC_IMP',
	'1',
	'en_US',
	'Import expense' ,
	'Expense interfaced from an external system');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_ALC_REC_TYP' AND C_KEY = 'PURC_ALC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_ALC_REC_TYP',
	'PURC_ALC',
	'2',
	'en_US',
	'Purchase transfer' ,
	'Expense transferred from an expense item in a purchasing result');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_ALC_REC_TYP' AND C_KEY = 'OTHER_WG' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_ALC_REC_TYP',
	'OTHER_WG',
	'3',
	'en_US',
	'Other WG' ,
	'Expense allocated from other WG cd. in departmental allocation');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_ALC_REC_TYP' AND C_KEY = 'MY_WG' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_ALC_REC_TYP',
	'MY_WG',
	'4',
	'en_US',
	'Own WG' ,
	'Expense allocated from own WG cd. in departmental allocation');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_ALC_REC_TYP' AND C_KEY = 'CARRY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_ALC_REC_TYP',
	'CARRY',
	'5',
	'en_US',
	'Carry-over' ,
	'Unallocated expense that has been carried forward');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MGC_INPT_ALC_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MGC_INPT_ALC_TYP',
	'en_US',
	'Input expense type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_INPT_ALC_TYP' AND C_KEY = 'ALC_AMT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_INPT_ALC_TYP',
	'ALC_AMT',
	'1',
	'en_US',
	'Allocable expenses' ,
	'Amount allocated from allocable expenses');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_INPT_ALC_TYP' AND C_KEY = 'PRE_ALC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_INPT_ALC_TYP',
	'PRE_ALC',
	'2',
	'en_US',
	'Departmental alloc.' ,
	'Amount allocated from departmental allocation');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_INPT_ALC_TYP' AND C_KEY = 'ALC_RATE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_INPT_ALC_TYP',
	'ALC_RATE',
	'3',
	'en_US',
	'Predetermined allocation rate' ,
	'Amount allocated from predetermined allocation rate');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_INPT_ALC_TYP' AND C_KEY = 'STD_RATE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_INPT_ALC_TYP',
	'STD_RATE',
	'4',
	'en_US',
	'Standard allocation rate' ,
	'Amount allocated from standard allocation rate');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_INPT_ALC_TYP' AND C_KEY = 'SO_ALC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_INPT_ALC_TYP',
	'SO_ALC',
	'5',
	'en_US',
	'GI transfer' ,
	'Amount allocated from GI transfer');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_INPT_ALC_TYP' AND C_KEY = 'WK_ALC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_INPT_ALC_TYP',
	'WK_ALC',
	'6',
	'en_US',
	'Man-hour transfer' ,
	'Amount allocated from man-hour transfer');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MGC_REC_EVAL_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MGC_REC_EVAL_TYP',
	'en_US',
	'Individual evaluation type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_REC_EVAL_TYP' AND C_KEY = 'STD_UNIT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_REC_EVAL_TYP',
	'STD_UNIT',
	'1',
	'en_US',
	'Standard unit cost' ,
	'Calculate issue amount based on the standard unit cost at the time of calculation');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_REC_EVAL_TYP' AND C_KEY = 'ZERO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_REC_EVAL_TYP',
	'ZERO',
	'2',
	'en_US',
	'0 evaluation' ,
	'Issue amount is 0');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_REC_EVAL_TYP' AND C_KEY = 'EXPNS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_REC_EVAL_TYP',
	'EXPNS',
	'3',
	'en_US',
	'Cost by cost element' ,
	'Use the amount in the cost by cost element table');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MGC_CALC_REC_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MGC_CALC_REC_TYP',
	'en_US',
	'Calculation record type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_CALC_REC_TYP' AND C_KEY = 'ST_STK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_CALC_REC_TYP',
	'ST_STK',
	'1',
	'en_US',
	'Beginning inventory' ,
	'Calculation result for beginning inventory');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_CALC_REC_TYP' AND C_KEY = 'ST_WIP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_CALC_REC_TYP',
	'ST_WIP',
	'2',
	'en_US',
	'Beginning WIP' ,
	'Calculation result for beginning WIP');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_CALC_REC_TYP' AND C_KEY = 'PURC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_CALC_REC_TYP',
	'PURC',
	'3',
	'en_US',
	'Purchase' ,
	'Calculation results for purchase');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_CALC_REC_TYP' AND C_KEY = 'COMP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_CALC_REC_TYP',
	'COMP',
	'4',
	'en_US',
	'Completed' ,
	'Calculation results on mfg. completion');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_CALC_REC_TYP' AND C_KEY = 'IO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_CALC_REC_TYP',
	'IO',
	'5',
	'en_US',
	'GR/GI' ,
	'Calculation result on GR/GI/supply');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_CALC_REC_TYP' AND C_KEY = 'INPT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_CALC_REC_TYP',
	'INPT',
	'6',
	'en_US',
	'Input' ,
	'Calculation result for input');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_CALC_REC_TYP' AND C_KEY = 'SLS' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_CALC_REC_TYP',
	'SLS',
	'7',
	'en_US',
	'Sales result' ,
	'Calculation result for sales');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_CALC_REC_TYP' AND C_KEY = 'END_STK' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_CALC_REC_TYP',
	'END_STK',
	'8',
	'en_US',
	'Ending inventory' ,
	'Calculation result for ending inventory');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_CALC_REC_TYP' AND C_KEY = 'END_WIP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_CALC_REC_TYP',
	'END_WIP',
	'9',
	'en_US',
	'Ending WIP' ,
	'Calculation result for Ending WIP');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_CALC_REC_TYP' AND C_KEY = 'INST' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_CALC_REC_TYP',
	'INST',
	'A',
	'en_US',
	'Incurred' ,
	'Calculation result on mfg. occurrence');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_CALC_REC_TYP' AND C_KEY = 'GP_ALC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_CALC_REC_TYP',
	'GP_ALC',
	'L',
	'en_US',
	'General purpose allocation' ,
	'Calculation result on general purpose allocation');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_CALC_REC_TYP' AND C_KEY = 'AVE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_CALC_REC_TYP',
	'AVE',
	'T',
	'en_US',
	'Weighted average unit price' ,
	'Calculation result for weighted average unit price');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_CALC_REC_TYP' AND C_KEY = 'ADJ' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_CALC_REC_TYP',
	'ADJ',
	'X',
	'en_US',
	'GR/GI difference' ,
	'Calculation result for GR/GI difference');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MGC_BATCH_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MGC_BATCH_TYP',
	'en_US',
	'Cost batch type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_BATCH_TYP' AND C_KEY = 'WIP_LOC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_BATCH_TYP',
	'WIP_LOC',
	'01',
	'en_US',
	'Creation for WIP cost data by location' ,
	'Create WIP cost data by location');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_BATCH_TYP' AND C_KEY = 'IO' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_BATCH_TYP',
	'IO',
	'02',
	'en_US',
	'Create T account list data' ,
	'Create cost GR/GI list');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_BATCH_TYP' AND C_KEY = 'CARRY' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_BATCH_TYP',
	'CARRY',
	'03',
	'en_US',
	'Carry-over' ,
	'Perform carry-over of beginning inventory data and beginning WIP data');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MGC_STR' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MGC_STR',
	'en_US',
	'Constant for string' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_STR' AND C_KEY = 'ACT_ID_DLM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_STR',
	'ACT_ID_DLM',
	'-',
	'en_US',
	'Character for separator 1' ,
	'Delimiter for generating result ID in cost result data creation');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_STR' AND C_KEY = 'CHK_STR_DLM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_STR',
	'CHK_STR_DLM',
	'#',
	'en_US',
	'Character for separator 2' ,
	'Delimiter for check process in cost IF data import');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_STR' AND C_KEY = 'COL_DLM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_STR',
	'COL_DLM',
	'^',
	'en_US',
	'Character for separator 3' ,
	'Delimiter for communicating dynamic columns in bulk');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_STR' AND C_KEY = 'ITM_DLM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_STR',
	'ITM_DLM',
	':',
	'en_US',
	'Item delimiter' ,
	'Delimiter for concatenating item cd., branch No. 1, branch No. 2, branch No. 3');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_STR' AND C_KEY = 'ITM_MFG_INST_NO_PREFIX' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_STR',
	'ITM_MFG_INST_NO_PREFIX',
	'G',
	'en_US',
	'Prefix for item mfg. order No. (Charged item)' ,
	'Prefix added to item mfg. order No. to be numbered when transferring expense purchasing or GR/GI with charged item to input');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_STR' AND C_KEY = 'ITM_MFG_INST_NO_PREFIX2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_STR',
	'ITM_MFG_INST_NO_PREFIX2',
	'W',
	'en_US',
	'Prefix for item mfg. order No. (Man-hours)' ,
	'Prefix added to item mfg. order No. numbered when importing item specified man-hour result with indirect order');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_STR' AND C_KEY = 'ITM_MFG_INST_NO_PREFIX3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_STR',
	'ITM_MFG_INST_NO_PREFIX3',
	'L',
	'en_US',
	'Prefix for item manufacturing order No. (location specification)' ,
	'Prefix to be added in setting location cd. in item manufacturing order No.');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_STR' AND C_KEY = 'TRD_PREFIX' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_STR',
	'TRD_PREFIX',
	'T',
	'en_US',
	'Prefix for transfer G (Dept. for transfer)' ,
	'Prefixes to be added to the transfer group of inter dept. movement created by cost result data entry at transfer dept. configuration');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_STR' AND C_KEY = 'TRD_PREFIX2' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_STR',
	'TRD_PREFIX2',
	'S',
	'en_US',
	'Prefix for transfer G (Inventory transfer)' ,
	'Prefixes to be added to the transfer group of inventory transfer GI/GR in cost IF data import');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_STR' AND C_KEY = 'TRD_PREFIX3' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_STR',
	'TRD_PREFIX3',
	'G',
	'en_US',
	'Prefix for transfer G (Other inventory transfer)' ,
	'Prefixes to be added to the transfer group other than inventory transfer GI/GR in cost IF data import');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MGC_PTN_SET_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MGC_PTN_SET_TYP',
	'en_US',
	'BOM/Operation pattern setting type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_PTN_SET_TYP' AND C_KEY = 'ITM' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_PTN_SET_TYP',
	'ITM',
	'1',
	'en_US',
	'Use a same pattern for same items' ,
	'Use the same pattern for same items');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_PTN_SET_TYP' AND C_KEY = 'IN_OUT' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_PTN_SET_TYP',
	'IN_OUT',
	'2',
	'en_US',
	'Use different patterns between in-house and outsourcing for same items' ,
	'Use different patterns between in-house and subcontracting for the same items');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_PTN_SET_TYP' AND C_KEY = 'LOC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_PTN_SET_TYP',
	'LOC',
	'3',
	'en_US',
	'Use a different pattern for each location' ,
	'Use a different pattern for each location');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MGC_AMT_ADD_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MGC_AMT_ADD_TYP',
	'en_US',
	'Amount addition type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_AMT_ADD_TYP' AND C_KEY = 'ALC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_AMT_ADD_TYP',
	'ALC',
	'1',
	'en_US',
	'Transfer allocable expenses' ,
	'Data for transferring allocable expenses of GI amount');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_AMT_ADD_TYP' AND C_KEY = 'OTHER_CALC' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_AMT_ADD_TYP',
	'OTHER_CALC',
	'2',
	'en_US',
	'Calculation group linkage' ,
	'Data inherited from a different calculation group');
DELETE FROM FCM_CONST_GRP_NM WHERE C_GRP_CD = 'MGC_IMP_OPE_TYP' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_GRP_NM (C_GRP_CD, LOCALE_CD, C_GRP_NM, C_GRP_RMRKS) VALUES(
	'MGC_IMP_OPE_TYP',
	'en_US',
	'Master import processing type' ,
	null);
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_IMP_OPE_TYP' AND C_KEY = 'BATCH' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_IMP_OPE_TYP',
	'BATCH',
	'1',
	'en_US',
	'Bulk import' ,
	'Import masters in bulk using the Master Import screen');
DELETE FROM FCM_CONST_NM WHERE C_GRP_CD = 'MGC_IMP_OPE_TYP' AND C_KEY = 'INTERACTIVE' AND LOCALE_CD = 'en_US';
INSERT INTO FCM_CONST_NM (C_GRP_CD, C_KEY,V_S, LOCALE_CD, C_NAME, C_RMRKS) VALUES(
	'MGC_IMP_OPE_TYP',
	'INTERACTIVE',
	'2',
	'en_US',
	'Individual import' ,
	'Specify a master and import');
