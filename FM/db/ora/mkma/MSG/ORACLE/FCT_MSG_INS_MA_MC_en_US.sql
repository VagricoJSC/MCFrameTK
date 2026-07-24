DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCP0001',
	'en_US',
	'W',
	'The following data already exists:\nJournal pattern cd.: {1}\nSequence number: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCP0002',
	'en_US',
	'W',
	'Dept. information has been entered.\nIf you want to change the existing period, specify "Modify" for the operation category.\nTo change the organization, specify "Organizational changes" for the operation category.');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCP0003',
	'en_US',
	'W',
	'There are one or more records whose upper dept. is set as the target dept. \nDelete all those records.');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCP0004',
	'en_US',
	'W',
	'There are one or more records whose upper dept. is set as the target dept. \nDelete all those records.\n(Turn on the "Logical delete".)');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCP0005',
	'en_US',
	'W',
	'The upper dept. has been logically deleted. Cancel the logical deletion for the upper dept. \n(Turn off the "Logical delete".)');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCP0006',
	'en_US',
	'I',
	'The columns related to the customer will be cleared. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCP0007',
	'en_US',
	'I',
	'The columns related to the AR customer will be cleared. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCP0008',
	'en_US',
	'I',
	'The columns related to the billing customer will be cleared. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCP0009',
	'en_US',
	'I',
	'The columns related to the payer will be cleared. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCP0010',
	'en_US',
	'I',
	'The columns related to the delivery destination will be cleared. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCP0011',
	'en_US',
	'I',
	'The columns related to the supplier will be cleared. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCP0012',
	'en_US',
	'I',
	'The columns related to the AP supplier will be cleared. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCP0013',
	'en_US',
	'I',
	'The columns related to the scheduled payee will be cleared. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCP0014',
	'en_US',
	'I',
	'The columns related to the payee will be cleared. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCP0015',
	'en_US',
	'W',
	'There are one or more records whose upper sales item system is set as the target sale item system.\nDelete all those records.');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCP0016',
	'en_US',
	'W',
	'There are one or more records whose upper sales item system is set as the target sale item system.\nDelete all those records.\n(Turn on the "Logical delete".)');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCP0017',
	'en_US',
	'W',
	'The upper sales item system has been logically deleted.\nCancel the logical deletion for the upper sales item system.\n(Turn off the logical deletion.)');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCP0018',
	'en_US',
	'W',
	'Enter this in the Item Unit master.\nColumn: {1}\nUnit cd.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCP0019',
	'en_US',
	'W',
	'Enter this as a packing unit in the Item Unit master.\nColumn: {1}\nUnit cd.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCP0020',
	'en_US',
	'W',
	'The specified file was not found, or failed to run.\nPath: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0001',
	'en_US',
	'W',
	'Targets for deletion do not exist.');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0002',
	'en_US',
	'W',
	'The data whose the "Default" is turned on has already been entered. Within the valid period, you can turn on the "Default" for only one record in the data which has the same Accounting slip type, Auto-journal key, and Auto-journal group.\nAccounting slip type: {1}\nAuto-journal key cd.: {2}\nAuto-journal group: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0003',
	'en_US',
	'W',
	'The journal group cannot be deleted because it is used in the Auto-Journal Pattern master.\nJournal group cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0004',
	'en_US',
	'W',
	'You cannot specify the same value as the conversion source currency and the conversion destination currency.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0005',
	'en_US',
	'W',
	'If you specify an account which uses subsidiary accounts, subsidiary accounts are required.\nAccount cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0006',
	'en_US',
	'W',
	'Specify different units as the conversion source unit and the conversion destination unit.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0007',
	'en_US',
	'W',
	'You can specify the subsidiary account only if you specify an account which uses subsidiary accounts.\nAccount cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0008',
	'en_US',
	'W',
	'You can specify the BP type only if you specify an account that uses BP.\nAccount cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0009',
	'en_US',
	'W',
	'You cannot specify "X: do not use" for the BP type for accounts which use BPs.\nAccount cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0010',
	'en_US',
	'W',
	'The distribution channel 2 cannot be specified if the distribution channel 1 is not specified.');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0011',
	'en_US',
	'W',
	'The distribution channel 3 cannot be specified if the distribution channel 2 is not specified.');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0012',
	'en_US',
	'W',
	'You can turn on the "Constant loss" only if the "Loss" is turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0013',
	'en_US',
	'W',
	'The data whose constant loss is turned on has already been entered. You can turn on the "Constant loss" for only one record in the Business Reason master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0014',
	'en_US',
	'W',
	'You can specify the purchase sort order only if the "Purchase" is turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0015',
	'en_US',
	'W',
	'You can specify the purchase return sort order only if the "Purchase return" is turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0016',
	'en_US',
	'W',
	'You can turn on the "Expense purchase" only if the "Purchase" or "Purchase return" is turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0017',
	'en_US',
	'W',
	'You can specify the Purchase adjustment controlling site type only if the "Purchase adjustment" is turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0018',
	'en_US',
	'W',
	'You can specify the purchase adjustment sort order only if the "Purchase adjustment" is turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0019',
	'en_US',
	'W',
	'You can specify the sales sort order only if the "Sales" is turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0020',
	'en_US',
	'W',
	'You can specify the sales return sort order only if the "Sales return" is turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0021',
	'en_US',
	'W',
	'You can turn on "Sales other accounting" only if the "Sales" or "Sales return" is turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0022',
	'en_US',
	'W',
	'You can specify the sales adjustment sort order only if the "Sales adjustment" is turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0023',
	'en_US',
	'W',
	'You can turn on the "Expense purchase (pegged to sales order)" only if the "Expense purchase" is turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0024',
	'en_US',
	'W',
	'You can specify the disposal sort order only if the "Disposal" is turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0025',
	'en_US',
	'W',
	'You can specify an inventory transfer sort order only if the "Inventory transfer" is turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0026',
	'en_US',
	'W',
	'You can specify the transport sort order only if the "Transport" is turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0027' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0027',
	'en_US',
	'W',
	'You can specify an output sort order only if the "Output" is turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0028' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0028',
	'en_US',
	'W',
	'You can specify an other accounting GR sort order only if the "Other accounting GR" is turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0029' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0029',
	'en_US',
	'W',
	'You can turn on "Exclude from lot trace" only if the "Loss" is turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0030' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0030',
	'en_US',
	'W',
	'You can specify an inspection defective sort order only if the "Inspection defective" is turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0031' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0031',
	'en_US',
	'W',
	'You can specify an other accounting GI sort order only if the "Other accounting GI" is turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0032' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0032',
	'en_US',
	'W',
	'If you specify "2. Not inventory management" for the Inventory management type and "1. Manage asset" for the Asset management type, you need to specify "2. Manage (Required)" for one of the following: SEIBAN No. management types.\nSEIBAN No. 1 management type\nSEIBAN No. 2 management type\nSEIBAN No. 3 management type\nSEIBAN No. 4 management type\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0033' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0033',
	'en_US',
	'W',
	'You can specify an input other accounting sort order only if the "Other accounting GR or GI" is turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0034' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0034',
	'en_US',
	'W',
	'If you specify "7. Phantom item" for the Item type, you cannot turn on the following columns:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0035' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0035',
	'en_US',
	'W',
	'If you specify "7. Phantom item" for the Item type, you cannot specify the following columns:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0036' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0036',
	'en_US',
	'W',
	'You can turn on the "AR dept." only if you specify the WG for AR.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0037' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0037',
	'en_US',
	'W',
	'You can turn on the "AP dept." only if you specify the WG for AP.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0038' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0038',
	'en_US',
	'W',
	'You can turn on the "Sales dept." only if you specify the WG for sales.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0039' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0039',
	'en_US',
	'W',
	'You can turn on the "Purchasing dept." only if you specify the WG for purchase.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0040' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0040',
	'en_US',
	'W',
	'You can turn on the following columns only if you specify the WG for distribution or mfg.:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0041' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0041',
	'en_US',
	'W',
	'You can turn on the "Mfg. dept." only if you specify the WG for mfg.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0042' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0042',
	'en_US',
	'W',
	'You can turn on the "Demand and supply dept." only if you specify the WG for demand and supply.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0043' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0043',
	'en_US',
	'W',
	'You can specify the maker only if you specify the supplier.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0044' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0044',
	'en_US',
	'W',
	'If you specify the supplier, you cannot specify anything other than "2. production" for the Controlling site type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0045' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0045',
	'en_US',
	'W',
	'You can turn on "Exclude from movement/transport allocation" only if you specify the negative value for allocation extra days.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0046' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0046',
	'en_US',
	'W',
	'If you specify the supplier, you cannot turn on the "Distribution standard location".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0047' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0047',
	'en_US',
	'W',
	'The data with "Import bank account type setting master 1" turned on has already been entered.\nYou can turn on "Import bank account type setting master 1" for only one in the Journal Group master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0048' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0048',
	'en_US',
	'W',
	'If you specify "3. Phantom item" for the Inventory management type, you cannot specify anything other than "3. Phantom item" for the Asset management type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0049' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0049',
	'en_US',
	'W',
	'If you specify "3. Phantom item" for the Asset management type,\nyou cannot specify anything other than "3. Phantom item" for the Inventory management type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0050' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0050',
	'en_US',
	'W',
	'If you specify "3. Phantom item" for the Inventory management type, the "Miscellaneous item" cannot be turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0051' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0051',
	'en_US',
	'W',
	'You can turn on the "Discount item" only if you specify "2. Not inventory management" for the Inventory management type\nand "2. Do not manage asset" for the Asset management type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0052' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0052',
	'en_US',
	'W',
	'You can specify only a value whose number of decimal places does not exceed the one set in the Unit master.\nUnit cd.: {1}\nNumber of decimal places: {2}\nNumber of decimal places (Unit master): {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0053' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0053',
	'en_US',
	'W',
	'You can specify the volume only if you specify the volume unit.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0054' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0054',
	'en_US',
	'W',
	'You can specify the weight only if you specify the weight unit.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0055' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0055',
	'en_US',
	'W',
	'You can specify the conversion qty. only if you specify the conversion unit.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0056' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0056',
	'en_US',
	'W',
	'If you specify "1. JAN" for the JAN type, you can only specify the string of 13 or less digits for JAN .\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0057' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0057',
	'en_US',
	'W',
	'If you specify "2. Abbreviation JAN" for the JAN type, you can only specify the string of 8 or less digits for JAN.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0058' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0058',
	'en_US',
	'W',
	'If you specify "3. Phantom item" for the Inventory management type, you cannot specify anything other than "7. Phantom item" for the Item type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0059' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0059',
	'en_US',
	'W',
	'If you specify the value other than "1. Manage inventory" for the Inventory management type, you cannot turn on the following columns:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0060' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0060',
	'en_US',
	'W',
	'If the "Market release decision" is turned off, you cannot specify the following columns:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0061' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0061',
	'en_US',
	'W',
	'If you specify anything other than "3.Do not allow same lot No." for the Lot management type or anything other than "3. Prohibit same sublot in a lot" for the Sublot management type, you cannot turn on the following columns:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0062' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0062',
	'en_US',
	'W',
	'If the "For expiration management" is turned off, you cannot specify the Expiration management type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0063' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0063',
	'en_US',
	'W',
	'If the "For active ingredient" is turned off, you cannot specify the following columns:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0064' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0064',
	'en_US',
	'W',
	'If you specify "3. Phantom item" for the Inventory management type, you can only specify "1. Do no manage".\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0065' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0065',
	'en_US',
	'W',
	'If you specify "1. Do not manage" for the SEIBAN No. management type, the following columns cannot be turned on:\nColumn: {1}\nControl column: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0066' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0066',
	'en_US',
	'W',
	'If you specify "2. Manage (Required)" for the SEIBAN No. management type, the following columns cannot be turned off:\nColumn: {1}\nControl column: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0067' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0067',
	'en_US',
	'W',
	'If you specify "1. Do not manage" for the SEIBAN No. management type, you cannot specify the following columns:\nColumn: {1}\nControl column: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0068' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0068',
	'en_US',
	'W',
	'If you specify "1. Manual" for the Numbering SEIBAN No. type, you cannot specify the following columns:\nColumn: {1}\nControl column: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0069' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0069',
	'en_US',
	'W',
	'If you specify a value other than "1. Manage inventory" for the Inventory management type, you can only specify "1. Do not manage lot No." for the Lot management type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0070' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0070',
	'en_US',
	'W',
	'If you specify "1. Do not manage lot No." for the Lot management type, you cannot specify the Lot No. numbering type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0071' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0071',
	'en_US',
	'W',
	'If you specify "1. Manual" for the Lot No. numbering type, you cannot specify the lot No. numbering pattern cd.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0072' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0072',
	'en_US',
	'W',
	'If you specify "1. Do not manage lot No." for the Lot management type, you can only specify "1. Not manage sublot No." or "4. Sublot management only inventory" for the Sublot management type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0073' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0073',
	'en_US',
	'W',
	'If you specify "1. Not manage sublot No." for the Sublot management type, you cannot specify the Sublot No. numbering type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0074' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0074',
	'en_US',
	'W',
	'If you specify "1. Manual" for the Sublot No. numbering type, you cannot specify the sublot No. numbering pattern cd.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0075' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0075',
	'en_US',
	'W',
	'You can specify the Inspection implementation unit type only if you specify "3. Do not allow same lot No." for the Lot management type or "3. Prohibit same sublot in a lot" for the Sublot management type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0076' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0076',
	'en_US',
	'W',
	'You can specify the import/export charges type only if you specify "2. Not inventory management" for the Inventory management type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0077' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0077',
	'en_US',
	'W',
	'If "Requirements SEIBAN No. required" is turned on, you can specify "2. Automatic" or "3. Manual_Unspecified: Automatic".\nColumn: {1}\nControl column: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0078' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0078',
	'en_US',
	'W',
	'If you specify "3. Phantom item" for the Inventory management type, the following columns cannot be turned on:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0079' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0079',
	'en_US',
	'W',
	'If you specify "3. Phantom item" for the Inventory management type, you cannot specify the following columns:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0080' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0080',
	'en_US',
	'W',
	'There is incompleteness in the following two terms. Specify the terms so that there are no omissions or duplications.\nTerm 1: {1}-{2}\nTerm 2: {3}-{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0081' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0081',
	'en_US',
	'W',
	'You can turn on tax inclusive or specify the tax rate other than 0 only if you specify the tax to be imposed.\nTax cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0082' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0082',
	'en_US',
	'W',
	'If you specify the new dept., specify the data for the new dept. in the new organization list.\nDept. cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0083' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0083',
	'en_US',
	'W',
	'If you specify the new dept., you cannot specify the data for the dept. in the new organization list.\nDept. cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0084' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0084',
	'en_US',
	'W',
	'You cannot specify the past date as the date of change to the new organization.\nSpecify the date that is later than the operation date.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0085' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0085',
	'en_US',
	'W',
	'If you specify "1. Do not manage lot No." for the Lot management type, you cannot specify the for version control.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0086' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0086',
	'en_US',
	'W',
	'You can specify the item only if you specify the Approval function type for which item evaluation is possible.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0087' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0087',
	'en_US',
	'W',
	'You can specify the item classification type only if you specify the Approval function type for which item evaluation is possible.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0088' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0088',
	'en_US',
	'W',
	'You can specify the dept. only if you specify the Approval function type for which dept. evaluation is possible.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0089' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0089',
	'en_US',
	'W',
	'You can specify the BP only if you specify the Approval function type for which BP evaluation is possible.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0090' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0090',
	'en_US',
	'W',
	'You can specify the BP classification type only if you specify the Approval function type for which BP evaluation is possible.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0091' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0091',
	'en_US',
	'W',
	'You can specify the currency 1 only if you specify the Approval function type for which money evaluation 1 is possible.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0092' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0092',
	'en_US',
	'W',
	'You can specify the Join criteria type 1 only if you specify the Approval function type which is evaluated as the approval amount 2, and you specify the currency 1.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0093' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0093',
	'en_US',
	'W',
	'You can specify the Join criteria type 2 only if you specify the Approval function type which is evaluated as an approval amount 3,\nand you specify the currency 1 and currency 2.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0094' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0094',
	'en_US',
	'W',
	'You can specify the lower and upper limits of amount 1 only if you specify the currency 1.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0095' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0095',
	'en_US',
	'W',
	'You can specify the lower and upper limits of amount 2 only if you specify the currency 2.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0096' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0096',
	'en_US',
	'W',
	'You can specify the lower and upper limits of amount 3 only if you specify the currency 3.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0097' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0097',
	'en_US',
	'W',
	'You can specify the concurrent dept. 1 only if you specify the main dept.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0098' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0098',
	'en_US',
	'W',
	'You can specify the concurrent dept. 2 only if you specify the concurrent dept. 1.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0099' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0099',
	'en_US',
	'W',
	'You can specify the concurrent dept. 3 only if you specify the concurrent dept. 2.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0100' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0100',
	'en_US',
	'W',
	'You can specify the concurrent dept. 4 only if you specify the concurrent dept. 3.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0101' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0101',
	'en_US',
	'W',
	'You can specify the concurrent dept. 5 only if you specify the concurrent dept. 4.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0102' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0102',
	'en_US',
	'W',
	'You can specify the concurrent dept. 6 only if you specify the concurrent dept. 5.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0103' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0103',
	'en_US',
	'W',
	'You can specify the concurrent dept. 7 only if you specify the concurrent dept. 6.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0104' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0104',
	'en_US',
	'W',
	'You can specify the concurrent dept. 8 only if you specify the concurrent dept. 7.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0105' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0105',
	'en_US',
	'W',
	'You can specify the concurrent dept. 9 only if you specify the concurrent dept. 8.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0106' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0106',
	'en_US',
	'W',
	'You can specify the approval role 1 (main) only if you specify the approval role (main).\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0107' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0107',
	'en_US',
	'W',
	'You can specify the approval role 2 (main) only if you specify the approval role 1 (main).\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0108' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0108',
	'en_US',
	'W',
	'You can specify the approval role 3 (main) only if you specify the approval role 2 (main).\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0109' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0109',
	'en_US',
	'W',
	'You can specify the approval role 4 (main) only if you specify the approval role 3 (main).\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0110' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0110',
	'en_US',
	'W',
	'You can specify the approval role 5 (main) only if you specify the approval role 4 (main).\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0111' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0111',
	'en_US',
	'W',
	'You can specify the approval role 6 (main) only if you specify the approval role 5 (main).\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0112' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0112',
	'en_US',
	'W',
	'You can specify the approval role 7 (main) only if you specify the approval role 6 (main).\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0113' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0113',
	'en_US',
	'W',
	'You can specify the approval role 8 (main) only if you specify the approval role 7 (main).\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0114' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0114',
	'en_US',
	'W',
	'You can specify the approval role 9 (main) only if you specify the approval role 8 (main).\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0115' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0115',
	'en_US',
	'W',
	'You can specify the approval role 1 (sub) only if you specify the approval role (sub).\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0116' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0116',
	'en_US',
	'W',
	'You can specify the approval role 2 (sub) only if you specify the approval role 1 (sub).\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0117' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0117',
	'en_US',
	'W',
	'You can specify the approval role 3 (sub) only if you specify the approval role 2 (sub).\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0118' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0118',
	'en_US',
	'W',
	'You can specify the approval role 4 (sub) only if you specify the approval role 3 (sub).\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0119' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0119',
	'en_US',
	'W',
	'You can specify the approval role 5 (sub) only if you specify the approval role 4 (sub).\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0120' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0120',
	'en_US',
	'W',
	'You can specify the approval role 6 (sub) only if you specify the approval role 5 (sub).\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0121' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0121',
	'en_US',
	'W',
	'You can specify the approval role 7 (sub) only if you specify the approval role 6 (sub).\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0122' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0122',
	'en_US',
	'W',
	'You can specify the approval role 8 (sub) only if you specify the approval role 7 (sub).\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0123' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0123',
	'en_US',
	'W',
	'You can specify the approval role 9 (sub) only if you specify the approval role 8 (sub).\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0124' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0124',
	'en_US',
	'W',
	'You cannot specify the same value for the main dept. and concurrent dept. 1-9.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0125' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0125',
	'en_US',
	'W',
	'You cannot specify the same value for the approval role (main), approval roles 1-9 (main), approval role (sub) and approval roles 1-9 (sub).\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0126' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0126',
	'en_US',
	'W',
	'The "For subcontract" can be turned on only if the BP is domestic.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0127' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0127',
	'en_US',
	'W',
	'If you turn on the "For subcontract" and specify "1. No receipt entry required (No in-transit management)" for the In-transit supply management type, you must specify "3. Usage criteria" for the Supply recording type. \n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0128' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0128',
	'en_US',
	'W',
	'If you turn off the "For subcontract" and specify "1. No receipt entry required (No in-transit management)" for the In-transit supply management type, you must specify "1. Shipping base” or "3. Usage criteria" for the Supply recording type. \n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0129' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0129',
	'en_US',
	'W',
	'If you specify the value other than "1. No receipt entry required (No in-transit management)" for the In-transit supply management type, you cannot specify anything other than "2. Arrival base" or "3. Usage criteria" for the Supply recording type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0130' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0130',
	'en_US',
	'W',
	'You can specify the billing customer dept. in charge only if you specify "3. Billing dept." for the Billing dept. type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0131' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0131',
	'en_US',
	'W',
	'The delayed days (Billing closing day) can be specified only if you specify “1. Billing by batch closing day” for the Billing closing type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0132' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0132',
	'en_US',
	'W',
	'You can specify the Sales details output type only if you specify "1. Billing by batch closing day", "2. Billing by manual closing day", or "3. Billing by manual selection" for the Billing closing type .\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0133' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0133',
	'en_US',
	'W',
	'If you specify "4. Each time sales invoicing" for the Billing closing type, you cannot turn on "Display previous month-end balance".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0134' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0134',
	'en_US',
	'W',
	'You can turn on "Fee calculation" only if the "Match amount" is turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0135' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0135',
	'en_US',
	'W',
	'You can specify the AR dept. only if you specify "2. AR dept." for the AR dept. type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0136' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0136',
	'en_US',
	'W',
	'If you specify "2. Acceptance Base" for the Revenue recording type, you cannot specify anything other than "1. Base Sales" for the Billing initial base type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0137' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0137',
	'en_US',
	'W',
	'You can specify the Billing initial base type only if you specify the Revenue recording type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0138' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0138',
	'en_US',
	'W',
	'You can specify the item journal only if you specify "3. item journal" for the Item category configuration type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0139' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0139',
	'en_US',
	'W',
	'You can specify the accounting item classification only if you specify "4. Accounting item classification" for the Item category configuration type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0140' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0140',
	'en_US',
	'W',
	'You can specify the Item classification type or the item classification only if you specify the Item category configuration type for which item classification can be specified.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0141' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0141',
	'en_US',
	'W',
	'If you specify "3. Phantom item" for the Inventory management type, you cannot specify anything other than "1. Do not manage configuration/specification" for the Configuration/specification management type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0142' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0142',
	'en_US',
	'W',
	'If the "For expiration management" is turned off, you cannot turn on the "Prohibit shipping lot reversal".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0143' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0143',
	'en_US',
	'W',
	'If you specify "3. Phantom item" for the Inventory management type, or "1. Do not manage lot No." for the Lot management type, you cannot specify the shipping expiration date group.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0144' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0144',
	'en_US',
	'W',
	'If you specify "1. Manage inventory" or "3. Phantom item" for the Inventory management type, you cannot turned on the "Receipt unnecessary". \n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0145' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0145',
	'en_US',
	'W',
	'If the "Discount item" is turned on, you cannot turn off the following columns:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0146' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0146',
	'en_US',
	'W',
	'Specify the value smaller than the difference between the minimum and maximum values for the increment.\nIncrement: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0147' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0147',
	'en_US',
	'W',
	'The specified numbering info. has already been entered.\nNumbering operation type: {1}\nNumbering pattern cd.: {2}\nKey element: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0148' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0148',
	'en_US',
	'W',
	'The maximum value of the sequence exceeds the number of digits of the sequence number specified in the Numbering Pattern master.\nMax. number of digits: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0149' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0149',
	'en_US',
	'W',
	'The data with the distribution standard location turned on has already been entered. You can turn on the only one distribution standard location in the same distribution group.\nDistribution group cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0150' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0150',
	'en_US',
	'W',
	'You cannot specify the same value for the resource 1 and resource 2.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0151' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0151',
	'en_US',
	'W',
	'You can specify the external system only if you specify the IF process type of export process.');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0152' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0152',
	'en_US',
	'W',
	'You cannot specify the same value for the parent item category and the item category.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0153' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0153',
	'en_US',
	'W',
	'You can specify the Receiving point stopover type only if the "Receiving point" is turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0154' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0154',
	'en_US',
	'W',
	'You can specify the Output type only if the "Output" is turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0155' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0155',
	'en_US',
	'W',
	'You can turn on the "MRO supply" only if you specify "2. Defective Item" for the Output type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0156' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0156',
	'en_US',
	'W',
	'The data whose "Expense purchase (pegged to sales order)" is turned on has already been entered. You can turn on the "Expense purchase (pegged to sales order)" for only one record in the Business Reason master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0157' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0157',
	'en_US',
	'W',
	'You can specify the AR settlement type only if you turn on the "AR settlement method".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0158' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0158',
	'en_US',
	'W',
	'You can specify the Payment received entry type only if you specify "1. Cash", "2. Payment" or "3. Notes" for the AR settlement type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0159' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0159',
	'en_US',
	'W',
	'If you specify "7. Transfer" for the AR settlement type, you cannot specify the accounting reason.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0160' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0160',
	'en_US',
	'W',
	'You can specify the Sales purchase tax type only when you specify "4. Offset (Debit)" or "6. Offset" for the AR settlement type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0161' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0161',
	'en_US',
	'W',
	'You can turn on the fee calculation only if you specify "1. Cash", "2. Payment" or "3. Notes" for the AR settlement type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0162' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0162',
	'en_US',
	'W',
	'You can specify the offset method only if you specify "1. Cash", "2. Payment" or "3. Notes" for the AR settlement type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0163' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0163',
	'en_US',
	'W',
	'You can specify the AR/AP BP identification type only if you specify "4. Offset (Debit)" or "5. Offset (Credit)" for the AR settlement type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0164' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0164',
	'en_US',
	'W',
	'You can specify the AP settlement type only if you turn on the "AP settlement method".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0165' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0165',
	'en_US',
	'W',
	'You can specify the AP offset destination type only if you specify "6. Offset" for the AP settlement type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0166' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0166',
	'en_US',
	'W',
	'If you specify the "SEQ. Sequence number" for the Element type, the Default sequence type is required.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0167' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0167',
	'en_US',
	'W',
	'The number of digits for a key column should be less than or equal to the total digits for the elements preceding the sequence number.\nKey column digits: {1}\nTotal digits for elements preceding the sequence number: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0168' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0168',
	'en_US',
	'W',
	'The number of digits for a key column should be less than or equal to the total number of digits for the elements.\nKey column digits: {1}\nTotal digits for the elements: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0169' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0169',
	'en_US',
	'W',
	'No display elements for numbering. Review the numbers of digits and turning on/off of hiding for the elements.\nTotal digits for all the elements: {1}\nTotal digits for the elements to be hidden: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0170' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0170',
	'en_US',
	'W',
	'The digits to display should be {1} digits or less.\nDigits to display: {2}\n{3}\n\nDigits to display = total digits for elements - total digits for hidden elements');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0171' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0171',
	'en_US',
	'W',
	'The digits to display should be {1} or less.\nTotal digits to display: {2}\n{3}\n\nDigits to display = total digits for elements - total digits for hidden elements');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0172' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0172',
	'en_US',
	'W',
	'The total digits for the elements should be {1} or less.\nTotal digits for the elements: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0173' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0173',
	'en_US',
	'W',
	'If you specify the value other than "1. Manage Asset" for the Asset management type, you cannot turn on the Allow supply unit price change.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0174' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0174',
	'en_US',
	'W',
	'If you specify "2. Not inventory management" for the Inventory management type, you can specify only "2. Direct delivery" for the Sales order procurement type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0175' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0175',
	'en_US',
	'W',
	'If you specify "1. Manage inventory" for the Inventory management type, you can specify only "1. With picking" or "3. Non-target" for the Shipping order type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0176' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0176',
	'en_US',
	'W',
	'If you specify "1. Manage inventory" in the Inventory management type for the following columns and if the "Miscellaneous item" is turned on, you cannot specify "4. Manage (Optional/Not for inventory).\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0177' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0177',
	'en_US',
	'W',
	'If you specify "1. Manage inventory" for the Inventory management type and if the "Miscellaneous item" is turned on,\nyou need to specify "2. Manage (Required)" for one of the following: SEIBAN No. management types.\nSEIBAN No. 1 management type\nSEIBAN No. 2 management type\nSEIBAN No. 3 management type\nSEIBAN No. 4 management type');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0178' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0178',
	'en_US',
	'W',
	'You can turn on the "Allow sales order configuration rev." only if you specify "2. Manage configuration/specification" for the Configuration/Specification management type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0179' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0179',
	'en_US',
	'W',
	'If you specify "2. Direct delivery" for the Sales order procurement type, you can specify only "3. Non-target" for the Shipping order type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0180' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0180',
	'en_US',
	'W',
	'You can turn on the following columns only if you specify the supplier:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0181' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0181',
	'en_US',
	'W',
	'If you specify "4. Each time sales invoicing" for the Billing closing type, the "Billing tax calculation" cannot be turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0182' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0182',
	'en_US',
	'W',
	'If you specify "1. Do not manage lot No." for the Lot management type, the "For version control" cannot be turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0183' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0183',
	'en_US',
	'W',
	'If the "Discount item" is turned on, you cannot specify the following columns:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0184' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0184',
	'en_US',
	'W',
	'You can specify the Lot No. numbering type only if you specify the Lot management type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0185' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0185',
	'en_US',
	'W',
	'If you specify "1. Do not manage lot No." for the Lot management type, you cannot specify the Lot No. numbering type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0186' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0186',
	'en_US',
	'W',
	'You can specify the Lot No. numbering pattern only if you specify the Lot No. numbering type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0187' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0187',
	'en_US',
	'W',
	'If you specify "1. Manual" for the Lot No. numbering type, you cannot specify the Lot No. numbering pattern.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0188' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0188',
	'en_US',
	'W',
	'You can specify the Sublot No. numbering type only if you specify the Sublot management type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0189' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0189',
	'en_US',
	'W',
	'If you specify "1. Not manage sublot No." for the Sublot management type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0190' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0190',
	'en_US',
	'W',
	'You can specify the Sublot No. numbering pattern only if you specify the Sublot No. numbering type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0191' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0191',
	'en_US',
	'W',
	'If you specify "1. Manual" for the Sublot No. numbering type, you cannot specify the sublot No. numbering pattern.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0192' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0192',
	'en_US',
	'W',
	'If you specify "1. Do not manage" for the SEIBAN No. 1 management type, the "Sales order SEIBAN No. 1 required" cannot be turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0193' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0193',
	'en_US',
	'W',
	'If you specify "1. Do not manage" for the SEIBAN No. 1 management type, the "Requirements SEIBAN No. 1 required" cannot be turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0194' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0194',
	'en_US',
	'W',
	'If you specify "2. Manage (Required)" for the SEIBAN No. 1 management type, turn on the "Sales order SEIBAN No. 1 required".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0195' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0195',
	'en_US',
	'W',
	'If you specify "2. Manage (Required)" for the SEIBAN No. 1 management type, turn on the "Requirements SEIBAN No. 1 required".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0196' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0196',
	'en_US',
	'W',
	'If you specify "1. Do not manage" for the SEIBAN No. 1 management type, you cannot specify the SEIBAN No. 1 numbering type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0197' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0197',
	'en_US',
	'W',
	'You can specify the SEIBAN No. 1 numbering type only if you specify the SEIBAN No. 1 management type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0198' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0198',
	'en_US',
	'W',
	'If you specify "1. Manual" for the SEIBAN No. 1 numbering type, you cannot specify the SEIBAN No. 1 numbering pattern.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0199' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0199',
	'en_US',
	'W',
	'You can specify the SEIBAN No. 1 numbering pattern only if you specify the SEIBAN No. 1 numbering type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0200' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0200',
	'en_US',
	'W',
	'If you specify "1. Do not manage" for the SEIBAN No. 2 management type, you cannot turn on the "Sales order SEIBAN No. 2 required".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0201' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0201',
	'en_US',
	'W',
	'If you specify "1. Do not manage" for the SEIBAN No. 2 management type, you cannot turn on the "Requirements SEIBAN No. 2 required".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0202' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0202',
	'en_US',
	'W',
	'If you specify "2. Manage (Required)" for the SEIBAN No. 2 management type, turn on the "Sales order SEIBAN No. 2 required".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0203' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0203',
	'en_US',
	'W',
	'If you specify "2. Manage (Required)" for the SEIBAN No. 2 management type, turn on the "Requirements SEIBAN No. 2 required".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0204' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0204',
	'en_US',
	'W',
	'If you specify "1. Do not manage" for the SEIBAN No. 2 management type, you cannot specify the SEIBAN No. 2 numbering type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0205' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0205',
	'en_US',
	'W',
	'You can specify the SEIBAN No. 2 numbering type only if you specify the SEIBAN No. 2 management type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0206' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0206',
	'en_US',
	'W',
	'If you specify "1. Manual" for the SEIBAN No. 2 numbering type, you cannot specify the SEIBAN No. 2 numbering pattern.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0207' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0207',
	'en_US',
	'W',
	'You can specify the SEIBAN No. 2 numbering pattern only if you specify the SEIBAN No. 2 numbering type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0208' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0208',
	'en_US',
	'W',
	'If you specify "1. Do not manage" for the SEIBAN No. 3 management type, you cannot turn on the "Sales order SEIBAN No.3 required".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0209' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0209',
	'en_US',
	'W',
	'If you specify "1. Do not manage" for the SEIBAN No. 3 management type, you cannot turn on the "Requirements SEIBAN No. 3 required".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0210' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0210',
	'en_US',
	'W',
	'If you specify "2. Manage (Required)" for the SEIBAN No. 3 management type, turn on the "Sales order SEIBAN No. 3 required".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0211' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0211',
	'en_US',
	'W',
	'If you specify "2. Manage (Required)" for the SEIBAN No. 3 management type, turn on the "Requirements SEIBAN No. 3 required".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0212' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0212',
	'en_US',
	'W',
	'If you specify "1. Do not manage" for the SEIBAN No. 3 management type, you cannot specify the SEIBAN No. 3 numbering type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0213' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0213',
	'en_US',
	'W',
	'You can specify the SEIBAN No. 3 numbering type only if you specify the SEIBAN No. 3 management type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0214' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0214',
	'en_US',
	'W',
	'If you specify "1. Manual" for the SEIBAN No. 3 numbering type, you cannot specify the SEIBAN No. 3 numbering pattern.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0215' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0215',
	'en_US',
	'W',
	'You can specify the SEIBAN No. 3 numbering pattern only if you specify the SEIBAN No. 3 numbering type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0216' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0216',
	'en_US',
	'W',
	'If you specify "1. Do not manage" for the SEIBAN No. 4 management type, you cannot turn on the "Sales order SEIBAN No.4 required".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0217' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0217',
	'en_US',
	'W',
	'If you specify "1. Do not manage" for the SEIBAN No. 4 management type, you cannot turn on the "Requirements SEIBAN No. 4 required".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0218' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0218',
	'en_US',
	'W',
	'If you specify "2. Manage (Required)" for the SEIBAN No. 4 management type, turn on the "Sales order SEIBAN No. 4 required".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0219' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0219',
	'en_US',
	'W',
	'If you specify "2. Manage (Required)" for the SEIBAN No. 4 management type, turn on the Requirements SEIBAN No. 4 required.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0220' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0220',
	'en_US',
	'W',
	'If you specify "1. Do not manage" for the SEIBAN No. 4 management type, you cannot specify the SEIBAN No. 4 numbering type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0221' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0221',
	'en_US',
	'W',
	'You can specify the SEIBAN No. 4 numbering type only if you specify the SEIBAN No. 4 management type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0222' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0222',
	'en_US',
	'W',
	'If you specify "1. Manual" for the SEIBAN No. 4 numbering type, you cannot specify the SEIBAN No. 4 numbering pattern.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0223' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0223',
	'en_US',
	'W',
	'You can specify the SEIBAN No. 4 numbering pattern only if you specify the SEIBAN No. 4 numbering type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0224' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0224',
	'en_US',
	'W',
	'You can turn on the following columns only if you turn on the "For inventory count":\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0225' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0225',
	'en_US',
	'W',
	'You can specify the factory release approval role only if you turn on the "For factory release approval".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0226' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0226',
	'en_US',
	'W',
	'You can specify the inspection approval role only if you turn on the "For inspection approval".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0227' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0227',
	'en_US',
	'W',
	'You can specify the mfg. approval role only if you turn on the "For mfg. approval".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0228' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0228',
	'en_US',
	'W',
	'If you specify "1. Do not manage" for the SEIBAN No. management type, you cannot specify anything other than "2. No explosion" for the SEIBAN No. type.\nSEIBAN No. column: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0229' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0229',
	'en_US',
	'W',
	'If you specify "2. Manage (Required)" for the SEIBAN No. management type, you cannot specify anything other than "1. Explosion" for the SEIBAN No. type.\nSEIBAN No. column: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0230' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0230',
	'en_US',
	'W',
	'If you specify "4. Manage (Optional/Not for inventory)" for the SEIBAN No. management type,\nyou cannot specify anything other than "3. Explosion (Opt)" for the SEIBAN No. type .\nSEIBAN No. column: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0231' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0231',
	'en_US',
	'W',
	'You can specify the SEIBAN No. type only if you specify the SEIBAN No. management type.\nSEIBAN No. column: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0232' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0232',
	'en_US',
	'W',
	'You can turn on "Disallow new lot input" if you specify the value other than "1. Do not manage lot No." for the Lot management type\nand a value other than "1. Not manage sublot No." for the Sublot management type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0233' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0233',
	'en_US',
	'W',
	'The data with "Bank account type setting master import 2" turned on has already been entered. You can turn on the only one "Bank account type setting master import 2" in the Journal Group master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0244' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0244',
	'en_US',
	'W',
	'You can turn on the Lot mixed only if you specify the value other than "1. Do not manage lot No." for the Lot management type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0245' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0245',
	'en_US',
	'W',
	'You can turn on the Sublots mixed only if you specify the value other than "1. Not manage sublot No." for the Sublot management type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0246' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0246',
	'en_US',
	'W',
	'You can turn on the "Copy-from child item" only if the "By-products" are turned off.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0247' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0247',
	'en_US',
	'W',
	'You can specify the billing closing day only if you specify "1. Billing by batch closing day" or "2. Billing by manual closing day" for the Billing closing type.\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0248' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0248',
	'en_US',
	'W',
	'The sum of the cost elements and the cost element groups pegged with them exceeds 100. Make sure that the number of active cost elements and cost element groups is 100 or less.');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0249' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0249',
	'en_US',
	'W',
	'The entry target already exists. Search first before update.');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0250' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0250',
	'en_US',
	'E',
	'You cannot specify "3. Delete" for the Data update type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0251' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0251',
	'en_US',
	'W',
	'Specify the same item name for the same item/SEIBAN No.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0252' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0252',
	'en_US',
	'W',
	'The specified item and SEIBAN No. have been already entered in the Miscellaneous Item master.\nItem: {1}\nSEIBAN No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0253' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0253',
	'en_US',
	'W',
	'You cannot specify SEIBAN No. 1 because "1. Do not manage" is set for the SEIBAN No. 1 management type in the Item master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0254' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0254',
	'en_US',
	'W',
	'You cannot specify SEIBAN No. 2 because "1. Do not manage" is set for the SEIBAN No. 2 management type in the Item master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0255' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0255',
	'en_US',
	'W',
	'You cannot specify SEIBAN No. 3 because "1. Do not manage" is set for the SEIBAN No. 3 management type in the Item master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0256' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0256',
	'en_US',
	'W',
	'You cannot specify SEIBAN No. 4 because "1. Do not manage" is set for the SEIBAN No. 4 management type in the Item master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0257' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0257',
	'en_US',
	'W',
	'You can specify the following columns only if you turn on the "Address setting":\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0258' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0258',
	'en_US',
	'W',
	'You can specify the following columns only if you turn on the "Mfg.":\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0259' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0259',
	'en_US',
	'W',
	'You can specify the following columns only if you turn on the "Distribution" or "Mfg.":\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0260' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0260',
	'en_US',
	'W',
	'If the "For expiration management" is turned off, you cannot specify the shipping expiration date group.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0261' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0261',
	'en_US',
	'W',
	'If you turn off the "Set location", you cannot specify the following columns:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0262' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0262',
	'en_US',
	'W',
	'You can specify the following columns only if you turn on the "Chargeable supplier":\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0263' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0263',
	'en_US',
	'W',
	'The copy source data does not exist in the target master.\nTarget master: {1}\nItem (Copy from): {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0264' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0264',
	'en_US',
	'W',
	'Already entered as common item info. (whole company).\nItem (Copy to): {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0265' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0265',
	'en_US',
	'W',
	'You cannot specify the same item for the copy-from and the copy-to.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0266' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0266',
	'en_US',
	'W',
	'The attributes of the item (copy from) and the item (copy to) do not match.\nItem (Copy to): {1}\nItem (Copy from): {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0267' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0267',
	'en_US',
	'W',
	'Specify numeric values from 1 to 31 or 99 for the following columns:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0268' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0268',
	'en_US',
	'W',
	'You can specify the distribution group only if you specify "3. Distribution G" for the Dept. structure type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0269' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0269',
	'en_US',
	'W',
	'You can specify the mfg. location group only if you specify "4. Mfg. location G" for the Dept. structure type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0270' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0270',
	'en_US',
	'W',
	'You can specify the WG only if you specify "5. WG" for the Dept. structure type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0271' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0271',
	'en_US',
	'W',
	'You can specify the Factory/Distribution warehouse only if you specify "6. Factory/Distribution warehouse" for the Dept. structure type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0272' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0272',
	'en_US',
	'W',
	'If you specify "1. EDI" or "6. EDI (MCF)" for the External system type, you can specify only the IF process type for EDI.\nExternal system cd.: {1}\nExternal system type: {2}\nIF process type: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0273' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0273',
	'en_US',
	'W',
	'If you specify "3. PLM" for the External system type, you can specify only the IF process type for PLM.\nExternal system cd.: {1}\nExternal system type: {2}\nIF process type: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0274' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0274',
	'en_US',
	'W',
	'You cannot change the External system type\nbecause the IF process type for EDI is set in the corresponding IF Communication Rules master, IF Adapter master, and HTTP Header master.\nExternal system cd.: {1}\nExternal system type: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0275' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0275',
	'en_US',
	'W',
	'You cannot change the External system type\nbecause the IF process type for PLM is set in the corresponding IF Communication Rules master, IF Adapter master, and HTTP Header master.\nExternal system cd.: {1}\nExternal system type: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0276' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0276',
	'en_US',
	'W',
	'This version does not permit specifying "2. Not inventory management" for the Inventory management type\nand "1. Manage asset" for the Asset management type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0278' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0278',
	'en_US',
	'W',
	'If you specify "2. Not inventory management" for the Inventory management type, you can specify only "1. Not manage sublot No." for the Sublot management type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0279' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0279',
	'en_US',
	'W',
	'A settlement method has already been entered with the AR settlement type "6: Withholding tax". Only one settlement method can be entered with the AR settlement type "6: Withholding tax".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0280' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0280',
	'en_US',
	'W',
	'A settlement method has already been entered with the AR settlement type "7: Transfer". Only one settlement method can be entered with the AR settlement type "7: Transfer".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0281' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0281',
	'en_US',
	'W',
	'Weekly forecasts can be entered from today to a maximum of 15 weeks (3 months). Specify the weekly start position and a weekly forecast period so that the sum of them does not exceed 16.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0282' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0282',
	'en_US',
	'W',
	'By 10 days forecasts can be entered from today to a maximum of 9 times 10 days (3 months). Specify the By 10 days starting position and a By 10 days forecast period so that the sum of them does not exceed 10.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0283' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0283',
	'en_US',
	'W',
	'Monthly forecasts can be entered from today to a maximum of 12 months (1 year). Specify the monthly start position and a monthly forecast period so that the sum of them does not exceed 13.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0284' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0284',
	'en_US',
	'W',
	'Specify a value of one or more for any one of the weekly forecast period, by 10 days forecast period, or monthly forecast period.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0285' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0285',
	'en_US',
	'W',
	'If you turn off the "Set location", you cannot turn on the following columns:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0286' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0286',
	'en_US',
	'W',
	'The Transaction pattern type has been specified for which the following columns cannot be set:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0287' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0287',
	'en_US',
	'W',
	'The data whose "Adopt at auto" is turned on has already been entered. You can turn on the only one "Adopt at auto" in the same Transaction pattern type.\nTransaction pattern type: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0288' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0288',
	'en_US',
	'W',
	'You cannot specify the notify-to WG for the specified Push notification type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0289' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0289',
	'en_US',
	'W',
	'You cannot specify the notify-to dept. for the specified Push notification type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0290' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0290',
	'en_US',
	'W',
	'You cannot specify the notify-to approval role for the specified Push notification type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0291' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0291',
	'en_US',
	'W',
	'You cannot specify the same value for the payment closing days 1 to 5.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0292' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0292',
	'en_US',
	'W',
	'You cannot specify the same value for the billing closing days 1 to 5.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0293' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0293',
	'en_US',
	'W',
	'The specified items are not entered in the Item master (common).\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0294' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0294',
	'en_US',
	'W',
	'Cannot be deleted because the Purchase Unit Price master contains the record in the process of approval.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0295' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0295',
	'en_US',
	'W',
	'Cannot be deleted because the Subcontracting Unit Price master contains the record in the process of approval.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0296' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0296',
	'en_US',
	'W',
	'Cannot be deleted because the Supply Unit Price master contains the record in the process of approval.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0297' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0297',
	'en_US',
	'W',
	'Cannot be deleted because the Standard Sales Unit Price master contains the record in the process of approval.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0298' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0298',
	'en_US',
	'W',
	'Cannot be deleted because the Item Sales Unit Price master contains the record in the process of approval.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0299' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0299',
	'en_US',
	'W',
	'Cannot be deleted because the Customer Sales Unit Price master contains the record in the process of approval.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0300' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0300',
	'en_US',
	'W',
	'Cannot be updated because it has already been released.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0301' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0301',
	'en_US',
	'W',
	'You can specify the Billing closing before/after type only if you specify zero for the delayed days (Billing closing day).\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0302' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0302',
	'en_US',
	'W',
	'You can specify the Payment receipt schedule before/after type only if you specify the billing customer calendar.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0303' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0303',
	'en_US',
	'W',
	'You cannot specify the same item for the item and its reference item.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0304' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0304',
	'en_US',
	'W',
	'Cannot be logically deleted or deleted since it is entered in the Item master with the following unit:\nUnit column: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0305' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0305',
	'en_US',
	'W',
	'The unit which is set in the following columns is not entered in the Item Unit master. See the settings of the Item master and the Item Unit master.\nUnit column: {1}\nUnit: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0306' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0306',
	'en_US',
	'W',
	'A value which is not available to enter has been set.\nColumn: {1}\nValue: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0307' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0307',
	'en_US',
	'W',
	'A subsidiary account is specified for the account which does not use subsidiary accounts.\nAccount cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0308' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0308',
	'en_US',
	'W',
	'You cannot specify the base currency for the tax currency.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0309' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0309',
	'en_US',
	'W',
	'Specify the different unit from the base unit.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0310' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0310',
	'en_US',
	'W',
	'Cannot enter since the decimal part may drop during conversion to the base unit.\nItem: {1}\nUnit cd.: {2}\nMin. value: {3}\nMin. value (Base unit): {4}\nNumber of decimal places (Base unit): {5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0311' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0311',
	'en_US',
	'W',
	'If you turn off the "Billing tax calculation", you cannot specify the Billing tax rounding type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0312' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0312',
	'en_US',
	'W',
	'The period for the specified target date has not been entered in the Term master.\nTarget date: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0313' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0313',
	'en_US',
	'W',
	'You can specify the logic ID only if you specify the module ID.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0314' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0314',
	'en_US',
	'W',
	'You can specify the input sort order only if you turn on the "Input".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0315' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0315',
	'en_US',
	'W',
	'Not entered in the Location master.\nLocation cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0316' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0316',
	'en_US',
	'W',
	'Not entered in the Rack/Line master.\nLocation cd.: {1}\nRack/Line cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0317' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0317',
	'en_US',
	'W',
	'The data with the External system type "6. EDI (MCF)" has already been entered. The only one data with the External system type "6. EDI (MCF)" can be entered in the External System master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0318' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0318',
	'en_US',
	'W',
	'You cannot specify the same dept. for the old dept. and the new one.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0319' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0319',
	'en_US',
	'W',
	'You can specify only a location whose "For rack/line" is turned on in the Location master.\nLocation cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0320' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0320',
	'en_US',
	'W',
	'You cannot specify check columns if the following control columns are turned off:\nControl column: {1}\nCheck column: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0321' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0321',
	'en_US',
	'W',
	'The following columns are controlled by system parameters so that they cannot be used:\nParameter: {1}\nColumn: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0322' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0322',
	'en_US',
	'W',
	'While the item cd. is specified, the corresponding branch No. 1 to 3 are not specified.\nSpecify NULL characters for the branch No. if you do not use the branch No.\nOr only branch No. is specified.\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0323' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0323',
	'en_US',
	'W',
	'If you specify other than "3. Phantom item" for the Inventory management type, you cannot specify "7. Phantom item" for the Item type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0501' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0501',
	'en_US',
	'W',
	'You can specify the cd. for own company only if you specify the value other than "ITM. Item" for the IF column type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0502' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0502',
	'en_US',
	'W',
	'You can specify the item only if you specify "ITM. Item" for the IF column type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0503' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0503',
	'en_US',
	'W',
	'You can specify the counterpart branch No. 1 only if you specify "ITM. Item" for the IF column type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0504' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0504',
	'en_US',
	'W',
	'The specified cd. for own company or counterpart cd. has already been entered (or the data with the same value for own company or counterpart cd. is to be entered). The data with the same value for own company or counterpart cd. cannot be entered in the same external system, IF column type, and BP.\n* In order to uniquely determine conversion destinations in sending or receiving conversion.\nExternal system cd.: {1}\nIF column type: {2}\nBP cd.: {3}\nCd. for own company: {4}\nCounterpart cd.: {5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0505' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0505',
	'en_US',
	'W',
	'You can specify the counterpart branch No. 2 only if you specify the counterpart branch No. 1.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0506' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0506',
	'en_US',
	'W',
	'You can specify the counterpart branch No. 3 only if you specify the counterpart branch No. 2.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0507' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0507',
	'en_US',
	'W',
	'The specified item, or counterpart cd. and counterpart branch numbers 1 to 3 have already been entered (or the data with the same value for item, or the counterpart cd. and the counterpart branch No. 1 to 3 is to be entered). The data with the same value for item, or the counterpart cd. and the counterpart branch No. 1 to 3 cannot be entered in the same external system, IF column type, and BP.\n* In order to uniquely determine conversion destinations in sending or receiving conversion\nExternal system cd.: {1}\nIF column type: {2}\nBP cd.: {3}\nItem: {4}\nCounterpart cd.: {5}\nCounterpart branch No. 1: {6}\nCounterpart branch No. 2: {7}\nCounterpart branch No. 3: {8}\n{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0508' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0508',
	'en_US',
	'W',
	'You can specify the BP journal key setting column type only if you specify the BP classification for the Journal key setting column type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0509' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0509',
	'en_US',
	'W',
	'The Accounting slip type for costs has been specified. Turn on the "Cost" on entry.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0510' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0510',
	'en_US',
	'W',
	'The Accounting slip type which is not used for the Cost has been specified. Turn off the "Cost" on entry.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0511' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0511',
	'en_US',
	'W',
	'If you turn on the "Cost", specify columns for the accounting cost information.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0512' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0512',
	'en_US',
	'W',
	'If you specify the Accounting slip type for GR/GI info., specify columns for the accounting GR/GI info.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0513' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0513',
	'en_US',
	'W',
	'If you specify the Accounting slip type for inventory info., specify columns for the accounting inventory info.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0514' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0514',
	'en_US',
	'W',
	'If you specify the Accounting slip type for payment received info., specify columns for the accounting payment received info.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0515' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0515',
	'en_US',
	'W',
	'You can turn on the following columns only if you specify "2. SCM" or "7. SCM (MD)" for the External system type:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0516' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0516',
	'en_US',
	'W',
	'You can specify the following columns only if you specify "2. SCM" or "7. SCM (MD)" for the External system type:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0517' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0517',
	'en_US',
	'W',
	'You can turn on the following columns only if you specify "1. EDI", "2. SCM", "6. EDI (MCF)" or "7. SCM (MD)" for the External system type:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0518' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0518',
	'en_US',
	'W',
	'You can specify the receiving message level only if you turn on the "Business PIC notification".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0519' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0519',
	'en_US',
	'W',
	'The data with the External system type "7. SCM (MD)" has already been entered.\nThe only one data with the External system type "7. SCM (MD)" can be entered in the External System master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0520' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0520',
	'en_US',
	'W',
	'If you specify "7. SCM (MD)" for the External system type, you cannot turn off the following columns:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0521' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0521',
	'en_US',
	'W',
	'If you specify the Accounting slip type of payment info., specify columns of the accounting payment info.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0522' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0522',
	'en_US',
	'W',
	'To enter a value for the parameter "DEF_LOC_GRP_CD", enter a value of the parameter "DEF_WG_CD".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0523' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0523',
	'en_US',
	'W',
	'The value of parameter "DEF_WG_CD" cannot be cleared because the value of parameter "DEF_LOC_GRP_CD" is entered.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0524' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0524',
	'en_US',
	'W',
	'The parameter "DEF_WG_CD" cannot be deleted because the value of parameter "DEF_LOC_GRP_CD" is entered.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0525' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0525',
	'en_US',
	'W',
	'If the parameter "SNO_TYP" is invalid, the parameter "WRK_ENABLE_FLG" must be invalid as well.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0526' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0526',
	'en_US',
	'W',
	'If "Web API" or "Command execution" is turned on, you cannot specify the File I/O operation.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0527' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0527',
	'en_US',
	'W',
	'You cannot specify the Web API operation if the "Web API" is turned off.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0528' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0528',
	'en_US',
	'W',
	'If you specify "5. Accounting" for the External system type, you can specify only the IF process type for accounting.\nExternal system cd.: {1}\nExternal system type: {2}\nIF process type: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0529' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0529',
	'en_US',
	'W',
	'If you specify "2. SCM" or "7. SCM (MD)" for the External system type, you can specify only the IF process type for SCM.\nExternal system cd.: {1}\nExternal system type: {2}\nIF process type: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0530' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0530',
	'en_US',
	'W',
	'If you specify "8. FB" for the External system type, you can specify only the IF process type for FB.\nExternal system cd.: {1}\nExternal system type: {2}\nIF process type: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0531' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0531',
	'en_US',
	'W',
	'You can turn on the following columns only if you specify "1. EDI" or "6. EDI (MCF)" for the External system type:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0532' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0532',
	'en_US',
	'W',
	'If you specify "B.Collated balance transfer receipt" for the AP settlement type, you cannot specify the account reason.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0533' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0533',
	'en_US',
	'W',
	'If you specify "D.Uncollated balance transfer receipt" for the AP settlement type, you cannot specify the account reason.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0534' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0534',
	'en_US',
	'W',
	'A settlement method has already been entered with the AP settlement type "B.Collated balance transfer receipt".\nOnly one settlement method can be entered with the AP settlement type "B.Collated balance transfer receipt".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0535' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0535',
	'en_US',
	'W',
	'A settlement method has already been entered with the AP settlement type "D.Uncollated balance transfer receipt".\nOnly one settlement method can be entered with the AP settlement type "D.Uncollated balance transfer receipt".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0536' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0536',
	'en_US',
	'I',
	'Starting the master export IF processing.\nExternal system cd.: {1}\nIF process type: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0537' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0537',
	'en_US',
	'I',
	'The master export IF processing has been completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0538' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0538',
	'en_US',
	'W',
	'The External system type is not entered as "4.BI" in the External System master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0539' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0539',
	'en_US',
	'W',
	'The IF process type is not for the master export IF processing.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0540' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0540',
	'en_US',
	'W',
	'If you specify "4. BI" for the External system type, you can specify the IF process type for BI only.\nExternal system cd.: {1}\nExternal system type: {2}\nIF process type: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0541' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0541',
	'en_US',
	'W',
	'You can turn on only either "Web API" or "Command execution".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0542' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0542',
	'en_US',
	'W',
	'If you did not turn on "Command execution", you cannot specify the Command execution operation.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0543' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0543',
	'en_US',
	'W',
	'Cannot specify the Purchase recording type if ""For subcontract"" is selected.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0601' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0601',
	'en_US',
	'W',
	'The specified BP is not entered in the BP master (Common).\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0602' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0602',
	'en_US',
	'W',
	'If you specify "3. Arrival base" for the Revenue recording type, you must specify "2. Base delivery" for the Billing initial base type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0603' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0603',
	'en_US',
	'W',
	'Cannot enter if the Supplier flg. and the Receiving point flg. are turned on.\n{1}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0604' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0604',
	'en_US',
	'W',
	'Cannot enter if the Receiving point flg. and the Receiving point required flg. are turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0605' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0605',
	'en_US',
	'W',
	'You cannot change the External system type\nbecause the IF process type for accounting is set in the corresponding IF Communication Rules master, IF Adapter master, and HTTP Header master.\nExternal system cd.: {1}\nExternal system type: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0606' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0606',
	'en_US',
	'W',
	'You cannot change the External system type\nbecause the IF process type for SCM is set in the corresponding IF Communication Rules master, IF Adapter master, and HTTP Header master.\nExternal system cd.: {1}\nExternal system type: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0607' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0607',
	'en_US',
	'W',
	'You cannot change the External system type\nbecause the IF process type for FB is set in the corresponding IF Communication Rules master, IF Adapter master, and HTTP Header master.\nExternal system cd.: {1}\nExternal system type: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0608' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0608',
	'en_US',
	'W',
	'You cannot change the External system type\nbecause the IF process type for BI is set in the corresponding IF Communication Rules master, IF Adapter master, and HTTP Header master.\nExternal system cd.: {1}\nExternal system type: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0651' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0651',
	'en_US',
	'W',
	'You can turn on the "Delivery note at PO", "Delivery note at delivery order", and "Delivery note at order promising result receipt" only if the Supplier delivery note cd. is set.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0652' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0652',
	'en_US',
	'W',
	'You can turn on the "Purchase delivery note target" only if the Receipt unnecessary item is on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0654' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0654',
	'en_US',
	'W',
	'The specified Report ID does not exist.\nReport ID: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCD0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCD0001',
	'en_US',
	'W',
	'Released items cannot be deleted.\nItem: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCD0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCD0002',
	'en_US',
	'W',
	'Not entered for the specified date in the Dept. master. Check the Dept. master.\nDept. cd.: {1}\nDate: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCD0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCD0003',
	'en_US',
	'W',
	'The Term master is not entered.\nBase date: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0655' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0655',
	'en_US',
	'W',
	'If you set the Invoice issue type to "4. Not to issue", you cannot specify check columns.\nCheck column: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0656' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0656',
	'en_US',
	'W',
	'If the "Payment notice to be issued" is turned off, you cannot specify check columns.\nCheck column: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0701' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0701',
	'en_US',
	'W',
	'You cannot change the External system type\nbecause the IF process type for accounting (SAP) is set in the corresponding IF Communication Rules master, IF Adapter master, and HTTP Header master.\nExternal system cd.: {1}\nExternal system type: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0702' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0702',
	'en_US',
	'W',
	'If you specify "A. Accounting (SAP)" for the External system type, you can specify only the IF process type for accounting (SAP).\nExternal system cd.: {1}\nExternal system type: {2}\nIF process type: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0703' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0703',
	'en_US',
	'W',
	'You can turn on the For expiration management only if you specify the value other than "1. Do not manage lot No." for the Lot management type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0704' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0704',
	'en_US',
	'W',
	'You cannot change the External system type\nbecause the IF process type for SCM (PCM) is set in the corresponding IF Communication Rules master, IF Adapter master, and HTTP Header master.\nExternal system cd.: {1}\nExternal system type: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0705' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABCL0705',
	'en_US',
	'W',
	'If you specify "B. SCM (PCM)" for the External system type, you can specify only the IF process type for accounting (SAP).\nExternal system cd.: {1}\nExternal system type: {2}\nIF process type: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSP0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSP0001',
	'en_US',
	'I',
	'The acquire unit price process will be executed. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSP0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSP0002',
	'en_US',
	'W',
	'Could not acquire the unit price.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSP0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSP0003',
	'en_US',
	'W',
	'You cannot specify the same value for the old item and the new item.');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSP0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSP0004',
	'en_US',
	'W',
	'You cannot specify the same value for the old alternative group and the new alternative group.');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0001',
	'en_US',
	'W',
	'You cannot specify the same value for the shipping point distribution group and the receiving point distribution group.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0002',
	'en_US',
	'W',
	'If you specify "1. Qualitative inspection" for the Qualitative/Quantitative type, you cannot specify a unit.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0003',
	'en_US',
	'W',
	'If you specify "1. Qualitative inspection" for the Qualitative/Quantitative type, you cannot turn on the "Auto-decide".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0004',
	'en_US',
	'W',
	'If you specify "2. 100% inspection" for the Inspection method type, you cannot specify a value other than 0 for sampling qty./times.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0005',
	'en_US',
	'W',
	'You can turn on the "Specific inspection confirmation required" only if you turn on the "Specific inspection required".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0006',
	'en_US',
	'W',
	'If you specify "2. Quantitative inspection" for the Qualitative/Quantitative type, you cannot specify the qualitative specific values.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0007',
	'en_US',
	'W',
	'If you specify "1. Qualitative inspection" for the Qualitative/Quantitative type, you cannot specify the following columns:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0008',
	'en_US',
	'W',
	'You can turn on the "Specific inspection required" only if you specify "4. Sampling specific inspection" for the Inspection method type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0009',
	'en_US',
	'W',
	'If you specify "2. Quantitative inspection" for the Qualitative/Quantitative type, at least one of the following columns must be specified:\nLower limit of external specification\nUpper limit of external specification\nLower limit of internal specification\nUpper limit of internal specification\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0010',
	'en_US',
	'W',
	'Set the same value for the Alternative item selection types for the records with the same following columns:\nParent item: {1}\nWG cd.: {2}\nConfiguration pattern: {3}\nOperation cd.: {4}\nOperation sequence number: {5}\nApplication start date: {6}\nApplication end date: {7}\nAlternative group cd.: {8}\n{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0011',
	'en_US',
	'W',
	'Items with different active ingredient managements cannot be contained in the same alternative group.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0012',
	'en_US',
	'W',
	'While the application contains update data to the existing data, the data to be updated does not exist.\nReject the approval and enter the application data again.\nApproval No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0013',
	'en_US',
	'W',
	'If you specify "EQ.=" or "NE.≠" for the Sign type (upper limit of external specification), you cannot specify a lower limit of external specification.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0014',
	'en_US',
	'W',
	'If you specify "EQ.=" or "NE.≠" for the Sign type (lower limit of external specification), you cannot specify the Sign type (upper limit of external specification).\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0015',
	'en_US',
	'W',
	'If you specify "EQ.=" or "NE.≠" for the Sign type (upper limit of internal specification), you cannot specify a lower limit of internal specification.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0016',
	'en_US',
	'W',
	'If you specify "EQ.=" or "NE.≠" for the Sign type (lower limit of internal specification), you cannot specify the Sign type (upper limit of internal specification).\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0017',
	'en_US',
	'W',
	'You can specify the maker only if you specify the supplier.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0018',
	'en_US',
	'W',
	'If you specify the mfg. location or supplier, you cannot specify the factory/distribution warehouse.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0019',
	'en_US',
	'W',
	'If you turn on the not for inspection, you cannot specify the inspection pattern.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0020',
	'en_US',
	'W',
	'If the for expiration management is turned off in the Item master, you can specify the following values for the Expiration base date type:\n"1. Mfg. start date"\n"2. Mfg. completion date"\n"6. Actual receipt date"\n"7. Copy child item base date"\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0021',
	'en_US',
	'W',
	'If the for expiration management is turned off in the Item master, you can specify only 0 for the valid period.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0022',
	'en_US',
	'W',
	'If the for expiration management is turned off in the Item master, you can specify only 0 for the period until expiration.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0023',
	'en_US',
	'W',
	'If the for expiration management is turned off in the Item master, you cannot specify the following columns:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0024',
	'en_US',
	'W',
	'Cannot be updated because the application for approval to change the master is in progress.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0025',
	'en_US',
	'W',
	'If the for expiration management is turned on in the Item master, you can specify the following values for the Expiration base date type (Extended):\n"3. Inspection decision date"\n"8. Current expiration date"\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0026',
	'en_US',
	'W',
	'You cannot specify "8. Current expiration date" for the Expiration base date type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0027' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0027',
	'en_US',
	'W',
	'If you turn on the not for inspection, you cannot turn on the prior inspection valid.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0028' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0028',
	'en_US',
	'W',
	'Cannot delete this because the application for approval to change the master is in progress.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0029' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0029',
	'en_US',
	'W',
	'The same value as the base unit of the item cannot be specified for an operation management unit.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0030' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0030',
	'en_US',
	'W',
	'You can specify the operation base unit qty. only if you specify the operation management unit.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0031' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0031',
	'en_US',
	'W',
	'You can specify the operation exchange unit qty. only if you specify the operation management unit.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0032' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0032',
	'en_US',
	'W',
	'You can specify the number of decimal places only if you specify the operation management unit.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0033' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0033',
	'en_US',
	'W',
	'You can specify the output operation ratio only if you turn on the output recording operation.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0034' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0034',
	'en_US',
	'W',
	'You can only specify the operation location as the location that has the same WG as the WG for the location.\nLocation WG cd.: {1}\nOperation Location WG cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0035' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0035',
	'en_US',
	'W',
	'If you specify the Site type for which scheduled payment date is not used, you cannot specify the scheduled payment date 1.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0036' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0036',
	'en_US',
	'W',
	'You can specify the scheduled payment date 2 only if you specify the scheduled payment date 1.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0037' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0037',
	'en_US',
	'W',
	'You can specify the scheduled payment date 3 only if you specify the scheduled payment date 2.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0038' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0038',
	'en_US',
	'W',
	'You can specify the scheduled payment date 4 only if you specify the scheduled payment date 3.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0039' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0039',
	'en_US',
	'W',
	'You can specify the scheduled payment date 5 only if you specify the scheduled payment date 4.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0040' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0040',
	'en_US',
	'W',
	'You can specify the account payable turnover period 2 only if you specify the account payable turnover period 1.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0041' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0041',
	'en_US',
	'W',
	'You can specify the account payable turnover period 3 only if you specify the account payable turnover period 2.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0042' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0042',
	'en_US',
	'W',
	'You can specify the account payable turnover period 4 only if you specify the account payable turnover period 3.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0043' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0043',
	'en_US',
	'W',
	'You can specify the account payable turnover period 5 only if you specify the account payable turnover period 4.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0044' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0044',
	'en_US',
	'W',
	'If you specify "2. Day" for the Site type, you cannot specify the following columns:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0045' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0045',
	'en_US',
	'W',
	'You can specify the scheduled payment receipt date 2 only if you specify the scheduled payment receipt date 1.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0046' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0046',
	'en_US',
	'W',
	'You can specify the scheduled payment receipt date 3 only if you specify the scheduled payment receipt date 2.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0047' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0047',
	'en_US',
	'W',
	'You can specify the scheduled payment receipt date 4 only if you specify the scheduled payment receipt date 3.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0048' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0048',
	'en_US',
	'W',
	'You can specify the scheduled payment receipt date 5 only if you specify the scheduled payment receipt date 4.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0049' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0049',
	'en_US',
	'W',
	'You can specify the account receivable turnover period 2 only if you specify the account receivable turnover period 1.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0050' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0050',
	'en_US',
	'W',
	'You can specify the account receivable turnover period 3 only if you specify the account receivable turnover period 2.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0051' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0051',
	'en_US',
	'W',
	'You can specify the account receivable turnover period 4 only if you specify the account receivable turnover period 3.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0052' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0052',
	'en_US',
	'W',
	'You can specify the account receivable turnover period 5 only if you specify the account receivable turnover period 4.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0053' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0053',
	'en_US',
	'W',
	'Data whose "Normal configuration" is turned on has already been entered. You can turn on the only one "Normal configuration" in the same item and item configuration group.\nItem: {1}\nItem configuration group cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0054' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0054',
	'en_US',
	'W',
	'You can specify only the location where the Controlling site type is set to "2. Production" in the Location master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0055' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0055',
	'en_US',
	'W',
	'You can specify the Sign type (lower limit of external specification) only if you specify a lower limit of external specification.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0056' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0056',
	'en_US',
	'W',
	'You can specify an upper limit of external specification only if you specify the Sign type (upper limit of external specification).\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0057' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0057',
	'en_US',
	'W',
	'You can specify the Sign type (lower limit of internal specification) only if you specify a lower limit of internal specification.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0058' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0058',
	'en_US',
	'W',
	'You can specify an upper limit of internal specification only if you specify the Sign type (upper limit of internal specification).\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0059' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0059',
	'en_US',
	'W',
	'If you specify the asset unmanaged item, you cannot specify the mfg. location.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0060' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0060',
	'en_US',
	'W',
	'You can specify the maker only if you specify the supplier.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0061' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0061',
	'en_US',
	'W',
	'You can specify the following columns only if you specify a mfg. location:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0062' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0062',
	'en_US',
	'W',
	'If you specify the asset unmanaged item, you cannot specify "4. VMI" for the Purchase identification type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0063' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0063',
	'en_US',
	'W',
	'Not entered in the Alternative Group master.\nWG cd.: {1}\nAlternative group cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0064' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0064',
	'en_US',
	'W',
	'You can specify the following columns only if you specify the supplier:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0065' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0065',
	'en_US',
	'W',
	'You can specify the following columns only if you specify the supplier, or a location considered as a subcontractor for the mfg. location (a location set as a supplier in the Location master):\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0066' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0066',
	'en_US',
	'W',
	'If you specify the item for which the SEIBAN No. management type is set to "1. Do not manage" in the Item master, you cannot specify the SEIBAN No.\nSEIBAN No. column: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0068' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0068',
	'en_US',
	'W',
	'If you specify "2. Receiving free of charge" or "4. VMI" for the Purchase identification type, you cannot specify the acceptance LT.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0069' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0069',
	'en_US',
	'W',
	'If you specify a location considered as a subcontractor\n(a location set as a supplier in the Location master) as the mfg. location, you cannot specify "2. Receiving free of charge" or "4. VMI" for the Purchase identification type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0070' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0070',
	'en_US',
	'W',
	'You can specify the aggregation (by day of week) period (Week) only if you specify the Aggregation (by day of week) type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0072' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0072',
	'en_US',
	'W',
	'You can specify a value other than one for the output schedule qty. only if you specify a location considered as internal location (a location set as a supplier in the Location master) as the mfg. location.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0073' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0073',
	'en_US',
	'W',
	'You can specify a value other than one for a mfg. order qty. only\nif you specify a location considered as internal location (a location set as a supplier in the Location master) as the mfg. location.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0074' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0074',
	'en_US',
	'W',
	'You can specify a value other than zero for the fixed required qty. only if you specify a location considered as internal location (a location set as a supplier in the Location master) as the mfg. location.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0075' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0075',
	'en_US',
	'W',
	'You can specify the Lot numbering timing type only if you specify the mfg. location.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0076' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0076',
	'en_US',
	'W',
	'You can turn on the "Allow backflush" only if you specify the configuration pattern.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0077' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0077',
	'en_US',
	'W',
	'You cannot specify "1. Allow mix" for the Alternative item selection type because an alternative item with a value other than 0 (zero) is set in the child fixed required qty. exists.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0078' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0078',
	'en_US',
	'W',
	'You can specify the following columns only if you specify a location considered as internal location (a location set as a supplier in the Location master) as the mfg. location:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0079' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0079',
	'en_US',
	'W',
	'You can specify the following columns only if the mfg. order approval function is enabled:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0080' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0080',
	'en_US',
	'W',
	'You can turn on the following columns only if you specify a location considered as internal location (a location set as a supplier in the Location master) as the mfg. location:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0085' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0085',
	'en_US',
	'W',
	'If you specify the supplier and the inventory unmanaged item, you cannot specify anything other than "1. Normal purchase" for the Purchase identification type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0086' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0086',
	'en_US',
	'W',
	'If you specify the mfg. location, the configuration pattern is required.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0087' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0087',
	'en_US',
	'W',
	'If you specify the by-product, you cannot specify different values for the child input qty. and the child required qty.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0088' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0088',
	'en_US',
	'W',
	'If you specify the item for which the Asset management type is set to "3. Phantom item" in the Item master for a child item, you cannot turn off the phantom.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0096' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0096',
	'en_US',
	'W',
	'If the distribution groups for the destination and source locations are the same, you cannot enter the transport lot unit qty.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0097' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0097',
	'en_US',
	'W',
	'You cannot specify the same location for the source and destination locations.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0098' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0098',
	'en_US',
	'W',
	'Specify a location whose WG is the same as the WG for the destination location in the source location.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0099' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0099',
	'en_US',
	'W',
	'If the distribution groups for the destination and source locations are different, you cannot turn on the specify input location.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0100' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0100',
	'en_US',
	'W',
	'You cannot specify the same value for the shipping point factory/distribution warehouse and the factory/distribution warehouse.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0101' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0101',
	'en_US',
	'W',
	'You can specify the purchase forecast group only if you specify both the BP serving as a supplier and the non-miscellaneous item.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0102' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0102',
	'en_US',
	'W',
	'You can turn on the "Purchase forecast firm" and "Pickup responsibility" only if you specify the purchase forecast group.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0110' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0110',
	'en_US',
	'W',
	'You can specify the resource standard value 1 only if resource 1 is set for the mfg. location in the Location master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0111' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0111',
	'en_US',
	'W',
	'You can specify the resource unit qty. 1 only if resource 1 is set for the mfg. location in the Location master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0112' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0112',
	'en_US',
	'W',
	'You can specify the resource standard value 2 only if resource 2 is set for the mfg. location in the Location master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0113' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0113',
	'en_US',
	'W',
	'You can specify the resource unit qty. 2 only if resource 2 is set for the mfg. location in the Location master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0114' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0114',
	'en_US',
	'W',
	'You cannot specify a numerical value with integer digits greater than the quantitative integer digits in the lower limit of external specification.\nNumerical value: {1}\nInteger digits: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0115' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0115',
	'en_US',
	'W',
	'When specifying, preserve the relationship that a lower limit of external specification falls below an upper limit of external specification.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0116' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0116',
	'en_US',
	'W',
	'You cannot specify a numerical value with integer digits greater than the quantitative integer digits in the upper limit of external specification. \nNumerical value: {1}\nInteger digits: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0117' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0117',
	'en_US',
	'W',
	'When specifying, preserve the relationship that a lower limit of internal specification falls below an upper limit of internal specification.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0118' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0118',
	'en_US',
	'W',
	'You cannot specify a numerical value with integer digits greater than the quantitative integer digits in the lower limit of internal specification \nNumerical value: {1}\nInteger digits: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0120' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0120',
	'en_US',
	'W',
	'You cannot specify for an upper limit of internal specification a numerical value with integer digits greater than the quantitative integer digits.\nNumerical value: {1}\nInteger digits: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0121' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0121',
	'en_US',
	'W',
	'If you specify the alternative group, you cannot specify "3. Non-MRP (Only order sheet)" for the Input control type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0122' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0122',
	'en_US',
	'W',
	'If a loss reason whose constant loss is turned on in the Business Reason master is specified, the initial display cannot be turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0123' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0123',
	'en_US',
	'W',
	'Data whose initial display is turned on has already been entered. The initial display can be turned on for only one record in the same item type / item type details.\nItem type: {1}\nItem type details cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0124' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0124',
	'en_US',
	'W',
	'If you specify the b-product, you can specify only 0 (zero) for the child fixed required qty.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0125' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0125',
	'en_US',
	'W',
	'The relationship between the min. SEIBAN No. and the max. SEIBAN No. is invalid. You cannot specify a value less than the min. SEIBAN No. (when compared as strings) for the max. SEIBAN No.\n{1}:{2}\n{3}:{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0126' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0126',
	'en_US',
	'W',
	'In the case of the alternative item with the Alternative item selection type "1. Allow mix", you can specify only 0 (zero) for the child fixed required qty.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0127' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0127',
	'en_US',
	'W',
	'You cannot specify the same value as the location.\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0128' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0128',
	'en_US',
	'W',
	'Cannot turn on because the Lot management type is not set to "3. Do not allow same lot No." in the Item master,\nor the Sublot management type is not set to"3. Prohibit same sublot in a lot" in the Item master.\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0129' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0129',
	'en_US',
	'W',
	'You cannot turn on the following columns because the Lot management type is set to "1. Do not manage lot No." in the Item master:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0130' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0130',
	'en_US',
	'W',
	'If the by-product is specified, you cannot turn on the following columns:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0131' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0131',
	'en_US',
	'E',
	'Cannot acquire a response message for the approval providing service.\nApplication No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0132' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0132',
	'en_US',
	'W',
	'The application No. and the approval No. do not correspond uniquely.\nApplication No.: {1}\nApproval No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0133' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0133',
	'en_US',
	'W',
	'The approval information does not exist.\nApplication No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0134' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0134',
	'en_US',
	'W',
	'The approval created-from No. of approval information does not match the application No.\nApplication No.: {1}\nApproval No.: {2}\nApproval created-from No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0135' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0135',
	'en_US',
	'W',
	'Not for approval processing. See the setting of masters for the approval side and the application dept.\nDept. cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0136' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0136',
	'en_US',
	'E',
	'Cannot create a DB container.\nClass: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0137' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0137',
	'en_US',
	'W',
	'If you turn on the not for inspection, you cannot specify "3. Inspection decision date" or "9. Manual entry" for the Expiration base date type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0138' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0138',
	'en_US',
	'W',
	'Entered records exist for the specified parent item, WG, and configuration pattern. Change the operation category to "Modify" before searching.\nParent item: {1}\nWG: {2}\nConfiguration pattern: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0139' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0139',
	'en_US',
	'W',
	'The unit price lot qty. can be specified only if you specify the unit price unit.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0140' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0140',
	'en_US',
	'W',
	'Review the period so that multiple plan items are not assigned to it.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0141' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0141',
	'en_US',
	'W',
	'The records with the same combination of the shipping point distribution group and the receiving point distribution group must have the same setting for invoice transactions.\nYou cannot change the settings for invoice transaction with different shipping conditions.\nShipping point distribution group cd.: {1}\nReceiving point distribution group cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0142' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0142',
	'en_US',
	'W',
	'The specified prefix for MRP numbering is ​​already in use. Specify a different value.\nPrefix for MRP numbering: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0143' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0143',
	'en_US',
	'W',
	'You cannot turn on the "Invoice transaction" if a distribution group for the delivery destination (a distribution group for which a location is not set in the Distribution Group master) is specified in the receiving point distribution group.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0144' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0144',
	'en_US',
	'W',
	'If you turn on the alternative item, you cannot specify the child item. Or, if you turn off the alternative item, specify the child item.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0145' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0145',
	'en_US',
	'W',
	'If you turn on the "Phantom" or specify the child item, you cannot turn on the "Alternative item".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0146' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0146',
	'en_US',
	'W',
	'You cannot specify the version No. if at least one of the following criteria is met:\n-An alternative group is specified and the "Alternative item" is turned on.\n-The "Phantom" is turned on.\n-The "By-product" is turned on.\n-The version uncontrolled item is specified for the child item.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0147' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0147',
	'en_US',
	'W',
	'If the SEIBAN No. management type "1. Do not manage" is set for the child item, you can specify only "2. No explosion" for the SEIBAN No. type. \nSEIBAN No. column: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0148' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0148',
	'en_US',
	'W',
	'If the SEIBAN No. management type "2. Manage (required)" is set for the child item, you can specify only "1. Explosion" for the SEIBAN No. type.\nSEIBAN No. column: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0149' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0149',
	'en_US',
	'W',
	'If the SEIBAN No. management type "4. Manage (Optional/Not for inventory)" is set for the child item, you can specify only "3. Explosion (Opt)" for the SEIBAN No. type.\nSEIBAN No. column: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0150' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0150',
	'en_US',
	'W',
	'If the by-product or phantom is turned on, you can specify only "6. Exclude" for the Backflush type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0151' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0151',
	'en_US',
	'W',
	'If the by-product or phantom is turned on, you cannot specify an alternative group.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0152' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0152',
	'en_US',
	'W',
	'If the by-product or phantom is turned on, you can specify only "1. MRP/Input" for the Input control type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0153' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0153',
	'en_US',
	'W',
	'If the Lot management type "1. Do not manage lot No." and the Sublot management type "1. Not manage sublot No." is set for the child item, or if the phantom is turned on, you cannot turn on the require lot.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0154' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0154',
	'en_US',
	'W',
	'If the Lot management type "1. Do not manage lot No." is set for the child item or the phantom is turned on, you cannot turn on the "Lot mixed".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0155' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0155',
	'en_US',
	'W',
	'If the Sublot management type "1. Not manage sublot No." is set for the child item or the phantom is turned on, you cannot turn on the "Sublots mixed".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0156' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0156',
	'en_US',
	'W',
	'You can specify only "1. Not allocatable" for the Allocation control type if at least one of the following criteria is met:\n-The Inventory management type for a child item is "2. Not inventory management".\n-The Input control type is "3. Non-MRP (Only order sheet)".\n-The "Phantom" is turned on.\n-The "By-product" is turned on.{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0157' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0157',
	'en_US',
	'W',
	'If the "By-product" or "Phantom" is turned on, you cannot turn on the "Copy-from child item".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0158' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0158',
	'en_US',
	'W',
	'If the "By-product" or "Phantom" is turned on, you cannot turn on the "For yield calculation".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0159' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0159',
	'en_US',
	'W',
	'Cannot be entered because the specified WG is different from the WG for the storage location.\nWG cd.: {1}\nStorage location WG cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0160' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0160',
	'en_US',
	'W',
	'If you specify the allocation distribution group, only a location which belongs to the allocation distribution group can be specified for the shipping location.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0161' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0161',
	'en_US',
	'W',
	'If you specify the gross allocation location group, only a location which belongs to the gross allocation distribution group can specified for the shipping location.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0162' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0162',
	'en_US',
	'W',
	'If you specify the allocation location, only the same location as the allocation location can be specified for the shipping location.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0163' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0163',
	'en_US',
	'W',
	'Cannot be entered because the WG for the storage location is the same as the WG for the requested location.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0164' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0164',
	'en_US',
	'W',
	'Cannot be entered because the WG is different from the one for the mfg. location.\nMfg. location WG cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0165' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0165',
	'en_US',
	'W',
	'Cannot be entered because the WG is the same as the WG for the requested location.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0166' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0166',
	'en_US',
	'W',
	'Non-chargeable supply cannot be specified for the Supply type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0167' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0167',
	'en_US',
	'W',
	'If you specify the BP which is not a chargeable supplier or an asset unmanaged item, you can specify only "3. Self supply" for the Supply type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0168' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0168',
	'en_US',
	'W',
	'You cannot specify the same value for the requesting WG and the requested WG.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0169' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0169',
	'en_US',
	'W',
	'The data whose "Default" is turned on has already been entered. You can turn on the "Default" of only one record in the same distribution group, item shipping group, and WG.\nDistribution group cd.: {1}\nItem shipping group cd.: {2}\nWG cd.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0170' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0170',
	'en_US',
	'W',
	'If you specify the allocation location, you cannot specify the allocation distribution group or the gross allocation location group.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0171' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0171',
	'en_US',
	'W',
	'If you specify "1. Location allocation" for the Allocation range type,\nyou can only specify either allocation location or allocation distribution group.\nIn addition, you cannot specify the gross allocation location group.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0172' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0172',
	'en_US',
	'W',
	'A record with the same key exists in the formal Unit Price master. Change the application start date.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0173' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0173',
	'en_US',
	'W',
	'A record with an overlapping period exists in the formal Unit Price master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0174' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0174',
	'en_US',
	'W',
	'A record exists whose period overlaps with the period of the record in the process of application.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0175' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0175',
	'en_US',
	'W',
	'A record exists with the same key as the key of the record in the process of application.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0176' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0176',
	'en_US',
	'W',
	'If "1: Month" is specified for the Site type and a closing date is not set for the BP, you cannot specify the site and the schedule date.\nClosing date column: {1}\nSite column: {2}\nSchedule date column: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0177' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0177',
	'en_US',
	'W',
	'If "1. Month" is specified for the Site type and the closing date is set for the BP, the site and the schedule date are required.\nClosing date column: {1}\nSite column: {2}\nSchedule date column: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0178' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0178',
	'en_US',
	'W',
	'If "2. Day" is specified for the Site type and the closing date is set for the BP, the site is required.\nClosing date column: {1}\nSite column: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0179' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0179',
	'en_US',
	'W',
	'An item for which the SEIBAN No. management type is set to "2. Manage (Required)" in the Item master cannot be specified for a child item of a parent item without SEIBAN No. management\n(for which the SEIBAN No. management type is not set to "2. Manage (Required)").\nSEIBAN No. column: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0180' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0180',
	'en_US',
	'W',
	'If you specify "1. Transport request" for the type of inventory request from other WG, you cannot specify the BP.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0181' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0181',
	'en_US',
	'W',
	'If you specify "1. Transport request" or "3. Shipping request" for type of inventory request from other WG,\na WG with the distribution or mfg. functions can be specified for the requested WG.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0182' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0182',
	'en_US',
	'W',
	'If you specify "2. Purchase Request" for the type of inventory request from other WG, you can specify a WG with the purchase function for the requested WG.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0183' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0183',
	'en_US',
	'W',
	'You cannot specify the same item for the parent item and the child item.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0184' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0184',
	'en_US',
	'W',
	'You must enter a numeric value other than 0 in one of the following columns:\nChild item input ratio\nChild fixed required qty.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0185' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0185',
	'en_US',
	'W',
	'You must enter a numeric value other than 0 in one of the following columns:\nChild input qty.\nChild fixed required qty.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0186' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0186',
	'en_US',
	'W',
	'You can specify the standard receiving point only if the "Invoice transaction" is turned on, or if a distribution group for the delivery destination (a distribution group for which a location is not set in the distribution group master) is specified for the receiving point distribution group.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0187' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0187',
	'en_US',
	'W',
	'If a child item for which the Lot management type is set to a value other than "1. Do not manage lot No." is to be an alternative item,\nthe Alternative item selection type "1. Allow mix" cannot be specified in combination with the "Prohibit mixed lots".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0188' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0188',
	'en_US',
	'W',
	'If a child item for which the Lot management type is set to a value other than "1. Do not manage lot No." is to be an alternative item,\nthe Alternative item selection type "1. Allow mix" cannot be specified in combination with the "Prohibit mixed lots".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0189' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0189',
	'en_US',
	'W',
	'If a child item for which the Sublot management type is set to a value other than "1. Not manage sublot No." is to be an alternative item, the Alternative item selection type "1. Allow mix" cannot be specified in combination with the "Prohibit mixed sublots".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0190' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0190',
	'en_US',
	'W',
	'If the reorder point inventory qty. is not specified, you cannot specify the following columns:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0191' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0191',
	'en_US',
	'W',
	'Cannot enter because the specified distribution group is different from the distribution group for the gross allocation location group.\nDistribution group cd.: {1}\nGross allocation location group cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0192' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0192',
	'en_US',
	'W',
	'Cannot enter because the specified location is different from the location for the gross allocation location group.\nLocation cd.: {1}\nGross allocation location group cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0193' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0193',
	'en_US',
	'W',
	'Cannot enter because the specified location is different from the location for the distribution group.\nLocation cd.: {1}\nDistribution group cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0194' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0194',
	'en_US',
	'W',
	'If you specify the gross allocation location group and the distribution group, you can specify only "2. Gross allocation" for the Allocation range type.\nAllocation range type: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0195' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0195',
	'en_US',
	'W',
	'If you specify the gross allocation location group and the location, you can specify only "1. Location allocation" for the Allocation range type.\nAllocation range type: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0196' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0196',
	'en_US',
	'W',
	'If you specify the distribution group and the location, you can specify only "1. Location allocation" for the Allocation range type.\nAllocation range type: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0197' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0197',
	'en_US',
	'W',
	'You can specify the dept. only if you specify the plan item.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0198' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0198',
	'en_US',
	'W',
	'Records with the same parent item, configuration pattern, operation, operation sequence number, and child item\ncannot have different settings for the lot mixed or sublot mixed.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0199' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0199',
	'en_US',
	'W',
	'You must enter a numeric value other than 0 in one of the following columns:\nChild item requirement ratio\nChild fixed required qty.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0501' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0501',
	'en_US',
	'W',
	'If you specify "ACT_CONT_FCTR. Actual active ingredient coefficient" for the Copy column type, only an item whose active ingredient is turned on can be specified for the child item.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0502' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0502',
	'en_US',
	'W',
	'If you specify "ACT_CONT_FCTR. Actual active ingredient coefficient" for the Copy column type, only an item whose active ingredient is turned on can be specified for the parent item.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0503' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0503',
	'en_US',
	'W',
	'If the active ingredient function is disabled, you cannot specify "ACT_CONT_FCTR. Actual active ingredient coefficient" for the Copy column type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0504' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0504',
	'en_US',
	'W',
	'You can specify "1. Concatenate string" for the Copy method type only if you specify "LOT_SUB_CHAR1 to 5. Lot spare (String) 1 to 5" for the Copy column type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0505' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0505',
	'en_US',
	'W',
	'The same value cannot be specified for the Copy column type and the Additional join column type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0506' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0506',
	'en_US',
	'W',
	'You can specify the Additional join column type only if you specify "1. Concatenate string" for the Copy column type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0507' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0507',
	'en_US',
	'W',
	'Only "LOT_SUB_CHAR1 to 5. Lot spare (String) 1 to 5" or "LOT_RMRKS. Lot note" can be specified for the Additional join item type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0508' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0508',
	'en_US',
	'W',
	'You can turn on the "Error when number of digits exceeded" only if you specify "1. Concatenate string" for the Copy column type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0509' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0509',
	'en_US',
	'W',
	'The column not allowed for the specified IF process type is set.\nIF process type: {1}\nColumn: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0510' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0510',
	'en_US',
	'W',
	'If the IF process type is "F1070. Import man-hour result" or "F1080. Export man-hour schedule" and you want to specify the operation or man-hour management, you must specify a location.');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0511' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0511',
	'en_US',
	'W',
	'You can specify the external system only if you specify the IF process type for the data to be sent.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0512' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0512',
	'en_US',
	'W',
	'The specified GR location is invalid. The following GR locations cannot be specified:\n-If you specify a location, the distribution group of the specified location and the distribution group of the GR location are the same.\n-If you specify a distribution group, the specified distribution group and the distribution group of the GR location are the same.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0513' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0513',
	'en_US',
	'W',
	'If you specify "F1070. Import man-hour result" or "F1080. Export man-hour schedule" for the IF process type, you cannot specify an item.');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0520' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0520',
	'en_US',
	'W',
	'If you specify a settlement method whose AP settlement type is set to "2. Deposit (Fee)" or "4. Cash (Fee)" in the Settlement Method master, you can only enter 0 as a rate.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0521' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0521',
	'en_US',
	'W',
	'If you specify a settlement method whose AP settlement type is not set to "2. Deposit (Fee)" or "4. Cash (Fee)" in the Settlement Method master, you cannot enter 0 as a rate.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0522' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0522',
	'en_US',
	'W',
	'You cannot specify anything other than "1. Cash", "2. Transfer", and "3. Notes" for the AR settlement type in the FB IF Control master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0523' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0523',
	'en_US',
	'W',
	'If you specify a value other than "2. Transfer" for the AR settlement type, you cannot specify the bank.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0524' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0524',
	'en_US',
	'W',
	'If you specify a value other than "2. Transfer" for the AR settlement type, you cannot specify an account.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0525' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0525',
	'en_US',
	'W',
	'If the BP is specified, you cannot turn on the "Without BP".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0526' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0526',
	'en_US',
	'W',
	'If the reorder point inventory qty. is not specified or the reorder point request qty. is specified, you cannot turn on the "Lot sizing".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0527' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0527',
	'en_US',
	'W',
	'The mfg. location group of the input item GI location does not match the mfg. location group of the location.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0528' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0528',
	'en_US',
	'W',
	'The gross allocation location group of the shipping item GI location does not match the gross allocation location group of the location.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0529' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0529',
	'en_US',
	'W',
	'If you specify ""1.Receipt base"" for the Purchase recording type, you cannot specify the acceptance LT.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0530' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0530',
	'en_US',
	'W',
	'If all the following conditions are met, you cannot specify the acceptance LT.\n- The Purchase recording type in the Item Details master is not set.\n- "1.Receipt base" is specified for the Purchase recording type in the BP master.\nBP cd. : {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0531' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0531',
	'en_US',
	'W',
	'If the "For subcontract" is turned on in the BP master, you cannot specify the acceptance LT.\nBP cd. : {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0532' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0532',
	'en_US',
	'W',
	'If the "For subcontract" is turned on in the BP master, you cannot specify the Purchase recording type.\nBP cd. : {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0533' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSL0533',
	'en_US',
	'W',
	'Not entered in the Version master.\nItem: {1}\nVersion No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSD0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSD0001',
	'en_US',
	'W',
	'Although a ratio is to be used, a unit price cannot be acquired because the Standard Sales Unit Price master is not entered.\nItem: {1}\nUnit cd.: {2}\nCurrency cd.: {3}\nWG cd.: {4}\nApplication date: {5}\nQty.: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSD0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSD0002',
	'en_US',
	'W',
	'The date specified by the dept. acquired from the location is not entered in the Dept. master. See the setting of the Dept. master.\nLocation cd.: {1}\nDept. cd.: {2}\nDate: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSD0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSD0003',
	'en_US',
	'W',
	'Cannot acquire the asset management dept. for the location/date. See the settings of the Location master and the Location Auxiliary master.\nLocation cd.: {1}\nDate: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSD0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSD0004',
	'en_US',
	'W',
	'Cannot acquire the sales dept. for the location/date.\nSee the settings of the Location master and the Location Auxiliary master.\nLocation cd.: {1}\nDate: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSD0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSD0005',
	'en_US',
	'W',
	'The dept. acquired from the BP is not entered in the Dept. master for the specified date. See the setting of the Dept. master.\nBP cd.: {1}\nDept. cd.: {2}\nDate: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSD0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSD0006',
	'en_US',
	'W',
	'Cannot acquire the AR dept. for the customer/date. See the settings of BP master and BP Auxiliary master.\nCustomer cd.: {1}\nDate: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSD0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSD0007',
	'en_US',
	'W',
	'Cannot acquire the billing customer dept. in charge for the Billing customer/date. See the settings of the BP master and BP Auxiliary master.\nBilling customer cd.: {1}\nDate: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSD0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSD0008',
	'en_US',
	'W',
	'Cannot acquire the VMI purchasing dept. for the supplier/date. See the settings of the BP master and the BP Auxiliary master.\nSupplier cd.: {1}\nDate: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSD0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSD0009',
	'en_US',
	'W',
	'Cannot acquire the AP dept. for the AP supplier / date. See the settings of the BP master and the BP Auxiliary master.\nAP cd.: {1}\nDate: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSD0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSD0010',
	'en_US',
	'W',
	'Cannot acquire the scheduled payee dept. in charge for the scheduled payee / date. See the settings of the BP master and BP Auxiliary master.\nScheduled payee cd.: {1}\nDate: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSD0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSD0011',
	'en_US',
	'W',
	'Cannot acquire the location for the sales dept. See the settings of the Location master and the Location Auxiliary master.\nSales dept. cd.: {1}\nDate: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSD0050' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABSD0050',
	'en_US',
	'W',
	'Cannot acquire the payment dept. for payee/date. See the settings of the BP master and BP Auxiliary master.\nPayee cd.: {1}\nDate: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGP0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGP0001',
	'en_US',
	'I',
	'The cache of the cost login information was cleared and reset.');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0001',
	'en_US',
	'W',
	'If the "Monthly ratio (plan)" is turned off or the "Monthly ratio (result)" is turned on, you cannot specify the plan base.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0002',
	'en_US',
	'W',
	'If the "Monthly ratio (plan)" is turned off and the "Monthly ratio (result)" is turned off, you cannot specify the Ratio specification type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0003',
	'en_US',
	'W',
	'You cannot specify the same report row for the aggregation report row and the target report row.\nReport row: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0005',
	'en_US',
	'W',
	'If the "Copy dept." is turned on, you cannot specify the allocation destination dept.\nAllocation destination dept. cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0006',
	'en_US',
	'W',
	'If the "Copy BP" is turned on, you cannot specify the allocation destination BP.\nAllocation destination BP cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0007',
	'en_US',
	'W',
	'If the "Copy lot No." is turned on, you cannot specify the allocation destination lot No.\nAllocation destination lot No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0008',
	'en_US',
	'W',
	'If the "Copy sublot No." is turned on, you cannot specify the allocation destination sublot No.\nAllocation destination sublot No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0009',
	'en_US',
	'W',
	'If the "Copy SEIBAN No. 1" is turned on, you cannot specify the allocation destination SEIBAN No. 1.\nAllocation destination SEIBAN No. 1: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0010',
	'en_US',
	'W',
	'If the "Copy SEIBAN No. 2" is turned on, you cannot specify the allocation destination SEIBAN No. 2.\nAllocation destination SEIBAN No. 2: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0011',
	'en_US',
	'W',
	'If the "Copy SEIBAN No. 3" is turned on, you cannot specify the allocation destination SEIBAN No. 3.\nAllocation destination SEIBAN No. 3: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0012',
	'en_US',
	'W',
	'If you specify the departmental alloc. basis for which the "Monthly rate (plan)" is turned on in the Departmental Alloc. Basis master, you cannot specify the Planning data plan/result type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0013',
	'en_US',
	'W',
	'If you specify the departmental alloc. basis for which the "Monthly rate (plan)" is turned on in the Departmental Alloc. Basis master, you cannot specify the Plan key plan/result type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0014',
	'en_US',
	'W',
	'If you specify the departmental alloc. basis for which the "Monthly rate (plan)" is turned on in the Departmental Alloc. Basis master, you cannot specify the plan key target month.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0015',
	'en_US',
	'W',
	'If you specify the departmental alloc. basis for which the "Monthly rate (result)" is turned on in the Departmental Alloc. Basis master, you cannot specify the Result data plan/result type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0016',
	'en_US',
	'W',
	'If you specify the departmental alloc. basis for which the "Monthly rate (result)" is turned on in the Departmental Alloc. Basis master, you cannot specify the Result key plan/result type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0017',
	'en_US',
	'W',
	'If you specify the departmental alloc. basis for which the "Monthly rate (result)" is turned on in the Departmental Alloc. Basis master,\nyou cannot specify the result key target month.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0018',
	'en_US',
	'W',
	'Calculation groups can be specified only if "3. Latest firm weighted average unit price" or "4. Latest firm weighted average unit price (Standard)" is specified for the Amount setting type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0019',
	'en_US',
	'W',
	'The target to be entered already exists. Search it first before update.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0020',
	'en_US',
	'W',
	'If you specify a value other than "4. Sales" for the Allocation target type,\nyou can specify only an element with the Cost element type "1. Mfg./Cost of goods sold element".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0021',
	'en_US',
	'W',
	'If you specify a value other than "4. Sales" for the Allocation target type, you can specify only an element with the Cost element type "2. SGA cost element".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0022',
	'en_US',
	'W',
	'If you specify "1. Mfg." for the Allocation target type, you cannot specify "5. Operating income" for the Allocation basis type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0023',
	'en_US',
	'W',
	'If you specify "2. Purchase" for the Allocation target type,\nyou cannot specify "1. Man-hour", "5. Operating income" or "6. Input qty." for the Allocation basis type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0024',
	'en_US',
	'W',
	'If you specify "3. Mfg./purchasing" for the Allocation target type, you cannot specify "5. Operating income" for the Allocation basis type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0025',
	'en_US',
	'W',
	'If you specify "4. Sales" for the Allocation target type, you cannot specify "1. Man-hour" or "6. Input qty." for the Allocation basis type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0026',
	'en_US',
	'W',
	'If you specify "5. General purpose allocation" for the Allocation target type, you cannot specify "1. Man-hour", "4. Manual cost adjustment",\n"5. Operating income" or "6. Input qty." for the Allocation basis type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0027' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0027',
	'en_US',
	'W',
	'If you specify an allocation pattern with the Allocation target type "4. Sales", you cannot turn on the for own operation.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0028' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0028',
	'en_US',
	'W',
	'If you specify an allocation pattern with the Allocation target type "4. Sales", you cannot specify the Input type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0029' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0029',
	'en_US',
	'W',
	'You can specify an item category or an item only if you specify "4. All input items" for the Input type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0030' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0030',
	'en_US',
	'W',
	'You can specify the Cost GR/GI type only if you specify "5. GR/GI" or "R. GR/GI amount" for the Report type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0031' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0031',
	'en_US',
	'W',
	'An ID not of a slip for cost management is specified for the slip ID.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0032' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0032',
	'en_US',
	'W',
	'The newly added row has already been entered.\nCalculation group cd.: {1}\nPriority: {2}\nCalculation category type: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0057' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0057',
	'en_US',
	'W',
	'You can specify the allocation account groups 1 to 3 and the allocation accounts only if you specify "Z. Allocation" for the Report type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0058' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0058',
	'en_US',
	'W',
	'You can specify the allocation accounts only if you specify "1. Expense transfer" or "2. Input transfer" for the GR/GI transfer type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0059' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0059',
	'en_US',
	'W',
	'You can turn on the "Transfer allocation" only if you specify the allocation account.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0061' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0061',
	'en_US',
	'W',
	'You can turn on the "Copy dept." only if you specify the allocation account.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0062' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0062',
	'en_US',
	'W',
	'You can specify the allocation destination dept. only if you specify the allocation account.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0063' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0063',
	'en_US',
	'W',
	'If the "Copy dept." is turned on, you cannot specify the allocation destination dept.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0064' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0064',
	'en_US',
	'W',
	'You can turn on the "Copy location" only if you specify the allocation account.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0065' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0065',
	'en_US',
	'W',
	'You can specify the allocation destination location only if you specify the allocation account.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0066' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0066',
	'en_US',
	'W',
	'If the "Copy location" is turned on, you cannot specify the allocation destination location.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0067' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0067',
	'en_US',
	'W',
	'You can turn on the "Copy operation" only if you specify the allocation account.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0068' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0068',
	'en_US',
	'W',
	'You can specify the allocation operation only if you specify the allocation account.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0069' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0069',
	'en_US',
	'W',
	'If the "Copy operation" is turned on, you cannot specify the allocation destination operation.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0070' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0070',
	'en_US',
	'W',
	'You can turn on the "Copy BP" only if you specify the allocation account.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0071' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0071',
	'en_US',
	'W',
	'You can specify an allocation destination BP only if you specify the allocation account.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0072' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0072',
	'en_US',
	'W',
	'If the "Copy BP" is turned on, you cannot specify an allocation destination BP.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0073' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0073',
	'en_US',
	'W',
	'You can turn on the "Copy item category" only if you specify the allocation account.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0074' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0074',
	'en_US',
	'W',
	'You can specify an allocation item category only if you specify the allocation account.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0075' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0075',
	'en_US',
	'W',
	'If the Item category copy is turned on, you cannot specify an allocation item category.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0076' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0076',
	'en_US',
	'W',
	'You can turn on the "Copy item" only if you specify the allocation account.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0077' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0077',
	'en_US',
	'W',
	'You can specify an allocation item only if you specify the allocation account.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0078' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0078',
	'en_US',
	'W',
	'If the "Copy item" is turned on, you cannot specify an allocation item.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0079' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0079',
	'en_US',
	'W',
	'You can turn on the "Copy lot No." only if you specify the allocation account.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0080' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0080',
	'en_US',
	'W',
	'You can specify an allocation destination lot No. only if you specify the allocation account.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0081' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0081',
	'en_US',
	'W',
	'If the "Copy lot No." is turned on, you cannot specify an allocation destination lot No.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0082' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0082',
	'en_US',
	'W',
	'You can turn on the "Copy sublot No." only if you specify the allocation account.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0083' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0083',
	'en_US',
	'W',
	'You can specify the allocation destination sublot No. only if you specify the allocation account.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0084' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0084',
	'en_US',
	'W',
	'If the "Copy sublot No." is turned on, you cannot specify the allocation destination sublot No.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0085' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0085',
	'en_US',
	'W',
	'You can turn on the "Copy SEIBAN No. 1" only if you specify the allocation account.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0086' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0086',
	'en_US',
	'W',
	'You can specify the allocation destination SEIBAN No. 1 only if you specify the allocation account.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0087' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0087',
	'en_US',
	'W',
	'If the "Copy SEIBAN No. 1" is turned on, you cannot specify the allocation destination SEIBAN No. 1.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0088' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0088',
	'en_US',
	'W',
	'You can turn on the "Copy SEIBAN No. 2" only if you specify the allocation account.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0089' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0089',
	'en_US',
	'W',
	'You can specify the allocation destination SEIBAN No. 2 only if you specify the allocation account.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0090' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0090',
	'en_US',
	'W',
	'If the "Copy SEIBAN No. 2" is turned on, you cannot specify the allocation destination SEIBAN No. 2.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0091' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0091',
	'en_US',
	'W',
	'You can turn on the "Copy SEIBAN No. 3" only if you specify the allocation account.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0092' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0092',
	'en_US',
	'W',
	'You can specify the allocation destination SEIBAN No. 3 only if you specify the allocation account.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0093' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0093',
	'en_US',
	'W',
	'If the "Copy SEIBAN No. 3" is turned on, you cannot specify the allocation destination SEIBAN No. 3.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0094' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0094',
	'en_US',
	'W',
	'You can turn on the "Copy item order No." only if you specify the allocation account.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0095' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0095',
	'en_US',
	'W',
	'You can specify the input location type 1 only if you specify "2. Input transfer" for the GR/GI transfer type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0096' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0096',
	'en_US',
	'W',
	'You can specify the input location type 2 only if you specify the input location type 1.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0097' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0097',
	'en_US',
	'W',
	'You can specify the input location type 3 only if you specify the input location type 2.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0098' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0098',
	'en_US',
	'W',
	'If you specify the report type without qty. management, you cannot specify the Qty. unit type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0100' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0100',
	'en_US',
	'W',
	'If you specify a value other than "3. Calculation (Inventory calculation)" for the Calculation type, you cannot specify the Amount evaluation type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0101' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0101',
	'en_US',
	'W',
	'You can specify a calculation sequence only if you specify the calculation sequence group.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0102' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0102',
	'en_US',
	'W',
	'If you specify "1. Allocation coefficient structure master" for the Allocation coefficient structure type, you cannot specify the Qty. unit type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0103' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0103',
	'en_US',
	'W',
	'If the "Copy SEIBAN No. 4" is turned on, you cannot specify the allocation destination SEIBAN No. 4.\nAllocation destination SEIBAN No. 4: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0104' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0104',
	'en_US',
	'W',
	'You can turn on the "Copy SEIBAN No. 4" only if you specify the allocation account.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0105' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0105',
	'en_US',
	'W',
	'You can specify the allocation destination SEIBAN No. 4 only if you specify the allocation account.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0106' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0106',
	'en_US',
	'W',
	'If the "Copy SEIBAN No. 4" is turned on, you cannot specify the allocation destination SEIBAN No. 4.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0107' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0107',
	'en_US',
	'W',
	'If the "Aggregation row" is turned on, the following columns cannot be specified:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0108' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0108',
	'en_US',
	'W',
	'If the "Aggregation column" is turned on, the following columns cannot be specified:\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0109' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0109',
	'en_US',
	'W',
	'You cannot specify "2. Unnecessary (Not copied)" for the Allocation account allocation type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0110' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0110',
	'en_US',
	'W',
	'You cannot specify "2. Unnecessary (Not copied)" for the WG allocation type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0111' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0111',
	'en_US',
	'W',
	'You can specify the allocation WG only if you specify the transfer allocation.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0112' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0112',
	'en_US',
	'W',
	'The specified Accounting slip type cannot be specified on this screen.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0113' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0113',
	'en_US',
	'W',
	'If you specify "ACT_SLS_IF. Sales result IF" for the Cost table type, you cannot specify "PO_NO. PO No." for the Column type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0114' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0114',
	'en_US',
	'W',
	'If you turn off the "Round down", you cannot specify the cost element.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0115' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0115',
	'en_US',
	'W',
	'If you turn off the "Bulk specification", you cannot specify the evaluation rate (%).\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0116' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0116',
	'en_US',
	'W',
	'If you turn on the "Bulk specification", you cannot specify the Unit price setting type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0117' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0117',
	'en_US',
	'W',
	'Invalid combination of the Allocation coefficient structure type and the Item classification type for the allocation coefficient.\nAllocation configuration type: {1}\nItem classification type: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0118' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0118',
	'en_US',
	'W',
	'You can specify the item journal only for the allocation coefficient with "2. Item journal" specified for the Allocation coefficient structure type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0119' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0119',
	'en_US',
	'W',
	'You can specify the item classification only for the allocation coefficient with "A. Item classification 1" to "J. Item classification 10"\nspecified for the Allocation coefficient structure type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0120' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0120',
	'en_US',
	'W',
	'You can specify a unit only for the allocation coefficient for which the Unit qty. type is set.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0121' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0121',
	'en_US',
	'W',
	'The Item classification types for the Report key type and for the Item classification do not match.\nItem classification cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0122' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0122',
	'en_US',
	'W',
	'If you specify "1. Not to calculate" for the BOM Explosion calculation type or specify anything other than "3. Calculation (Inventory calculation)" for the Calculation type, you cannot turn on the "Movement calculation".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0123' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0123',
	'en_US',
	'W',
	'If you specify a value other than "3. GR/GI target/accounting slip/accounting reason" for the GR/GI aggregated unit type, you cannot specify the Accounting reason cd.\nGR/GI list ID: {1}\nGR/GI column cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0124' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0124',
	'en_US',
	'W',
	'In the case of the specified GR/GI type, you can specify only "1. GR/GI unit" for the GR/GI aggregated unit type.\nGR/GI list ID: {1}\nGR/GI column cd.: {2}\nGR/GI type: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0125' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MABGL0125',
	'en_US',
	'W',
	'If you specify "T. Weighted average unit price" for the GR/GI type, you can specify only "1. Non-target" for the Variance calculation type.\nGR/GI list ID: {1}\nGR/GI column cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0001',
	'en_US',
	'W',
	'Not entered in the Bank master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0002',
	'en_US',
	'W',
	'Not specified as a branch of the bank in the Bank Branch master.\nBank cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0003',
	'en_US',
	'W',
	'Not entered in the General Purpose Classification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0004',
	'en_US',
	'W',
	'Not entered in the PIC master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0005',
	'en_US',
	'W',
	'Not specified as an accounting dept. for the application date in the Accounting Dept. master.\nApplication date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0006',
	'en_US',
	'W',
	'Not specified as the Account type for the Spare account type in the Spare Account Type master.\nSpare account type: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0007',
	'en_US',
	'W',
	'Not entered in the Accounting Tax master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0008',
	'en_US',
	'W',
	'Not entered in the Account master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0009',
	'en_US',
	'W',
	'Not specified as a subsidiary account for the account in the Subsidiary Account master.\nAccount cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0010',
	'en_US',
	'W',
	'Not entered in the Auto-Journal Key master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0011',
	'en_US',
	'W',
	'Not entered in the Note Reason master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0012',
	'en_US',
	'W',
	'Not entered in the Journalizing master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0013',
	'en_US',
	'W',
	'Not entered in the Journal Group master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0014',
	'en_US',
	'W',
	'Not entered in the Auto-Journal Pattern Basic master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0015',
	'en_US',
	'W',
	'Not entered in the Accounting Reason master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0016',
	'en_US',
	'W',
	'Not entered in the Bank Account master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0017',
	'en_US',
	'W',
	'Not entered in the Item Journal master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0018',
	'en_US',
	'W',
	'Not entered in the Currency master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0019',
	'en_US',
	'W',
	'Not entered in the Gross Allocation Location Group master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0020',
	'en_US',
	'W',
	'Not entered in the Calendar Basic master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0021',
	'en_US',
	'W',
	'Not entered as an other accounting GI reason in the Business Reason master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0022',
	'en_US',
	'W',
	'Not entered in the Country master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0023',
	'en_US',
	'W',
	'Not entered in the Distribution Group master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0024',
	'en_US',
	'W',
	'Not entered in the Mfg. Location Group master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0025',
	'en_US',
	'W',
	'Not entered in the Slip Report master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0026',
	'en_US',
	'W',
	'Not entered in the Transportation Method master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0027' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0027',
	'en_US',
	'W',
	'Not entered in the Unit master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0028' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0028',
	'en_US',
	'W',
	'Not entered in the Region master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0029' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0029',
	'en_US',
	'W',
	'Not entered in the Exchange Rate Basic master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0030' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0030',
	'en_US',
	'W',
	'Not entered in the HS Classification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0031' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0031',
	'en_US',
	'W',
	'Not entered in the HS master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0032' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0032',
	'en_US',
	'W',
	'Not specified as an item classification for the Item classification type in the Item Classification master.\nItem classification type: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0033' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0033',
	'en_US',
	'W',
	'Not entered in the Accounting Item Classification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0034' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0034',
	'en_US',
	'W',
	'Not entered in the Business Reason master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0035' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0035',
	'en_US',
	'W',
	'Not entered in the Man-Hour Reason master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0036' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0036',
	'en_US',
	'W',
	'Not entered in the Work Element master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0037' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0037',
	'en_US',
	'W',
	'Not entered in the Operation master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0038' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0038',
	'en_US',
	'W',
	'Not specified as a BP classification for the BP classification type in the BP Classification master.\nBP classification type: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0039' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0039',
	'en_US',
	'W',
	'Not specified as transaction terms for the Transaction terms type in the Transaction Terms master.\nTransaction terms type: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0040' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0040',
	'en_US',
	'W',
	'Not entered in the Offset Group master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0041' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0041',
	'en_US',
	'W',
	'Not entered in the Shipping Conditions master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0042' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0042',
	'en_US',
	'W',
	'Not entered in the Item Category Group master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0043' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0043',
	'en_US',
	'W',
	'Not entered in the Port master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0044' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0044',
	'en_US',
	'W',
	'Not entered in the Export Packing Container master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0045' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0045',
	'en_US',
	'W',
	'Not entered in the Grading master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0046' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0046',
	'en_US',
	'W',
	'Not specified as a transaction for the following criteria in the Transaction master:\nTransaction pattern type: {1}\nFunction ID: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0047' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0047',
	'en_US',
	'W',
	'Not entered in the Sales Unit Price Classification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0048' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0048',
	'en_US',
	'W',
	'Not entered in the Sales Unit Price Rank master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0049' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0049',
	'en_US',
	'W',
	'Not entered in the Item Shipping Group master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0050' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0050',
	'en_US',
	'W',
	'Not entered in the Shipping Expiration Date Group master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0051' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0051',
	'en_US',
	'W',
	'Not specified as a version No. for the following criteria in the Version master:\nItem: {1}\nFactory/Distribution warehouse cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0052' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0052',
	'en_US',
	'W',
	'Not entered in the Cost Element Group master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0053' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0053',
	'en_US',
	'W',
	'Not entered in the Cost Element master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0054' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0054',
	'en_US',
	'W',
	'Not entered in the Cost Menu master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0055' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0055',
	'en_US',
	'W',
	'Not entered in the Factory/Distribution Warehouse master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0056' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0056',
	'en_US',
	'W',
	'Not entered in the WG master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0057' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0057',
	'en_US',
	'W',
	'Not entered as a valid location in the Location master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0058' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0058',
	'en_US',
	'W',
	'Not specified as a rack/line for the location in the Rack/Line master.\nLocation cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0059' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0059',
	'en_US',
	'W',
	'Not specified as an item type detail for the Item type in the Item Type Details master.\nItem type: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0060' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0060',
	'en_US',
	'W',
	'Not entered in the Specification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0061' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0061',
	'en_US',
	'W',
	'Not specified as a specification column for the specification in the Specification Item master.\nSpecification cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0062' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0062',
	'en_US',
	'W',
	'Not entered in the Item Specification Classification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0063' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0063',
	'en_US',
	'W',
	'Not entered in the Item Configuration Group master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0064' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0064',
	'en_US',
	'W',
	'The specified dept. is invalid. Check the following:\n-The Dept. master is set for the specified dept. and application date.\n-It is set in the PIC Authority master as the dept. to which a PIC belongs.\nApplication date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0065' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0065',
	'en_US',
	'W',
	'Not entered in the Dept. Hierarchy master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0066' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0066',
	'en_US',
	'W',
	'Not entered in the Data Access Basic master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0067' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0067',
	'en_US',
	'W',
	'Not entered in the Approval Role master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0068' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0068',
	'en_US',
	'W',
	'Not specified as a numbering pattern for the Numbering operation type in the Numbering Pattern master.\nNumbering operation type: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0069' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0069',
	'en_US',
	'W',
	'Not entered in the Term master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0070' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0070',
	'en_US',
	'W',
	'Not entered as the Spare account type 1 in the Spare Account Type master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0071' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0071',
	'en_US',
	'W',
	'Not entered as the Spare account type 2 in the Spare Account Type master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0072' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0072',
	'en_US',
	'W',
	'Not entered as the Spare account type 3 in the Spare Account Type master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0073' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0073',
	'en_US',
	'W',
	'Not entered as the Spare account type 4 in the Spare Account Type master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0074' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0074',
	'en_US',
	'W',
	'Not entered as the Spare account type 5 in the Spare Account Type master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0075' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0075',
	'en_US',
	'W',
	'Not entered as the AP account type in the Spare Account Type master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0076' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0076',
	'en_US',
	'W',
	'Not entered as the AR account type in the Spare Account Type master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0077' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0077',
	'en_US',
	'W',
	'Not entered as a sales tax in the Tax master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0078' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0078',
	'en_US',
	'W',
	'Not entered as a purchase tax in the Tax master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0079' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0079',
	'en_US',
	'W',
	'Not entered as a supply tax in the Tax master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0080' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0080',
	'en_US',
	'W',
	'Not entered in the Display PO Sheet master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0081' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0081',
	'en_US',
	'W',
	'Not entered in the Calculation Pattern master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0082' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0082',
	'en_US',
	'W',
	'Not entered in the Calculation Group master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0083' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0083',
	'en_US',
	'W',
	'Not entered as item classification 1 in the Item Classification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0084' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0084',
	'en_US',
	'W',
	'Not entered as item classification 2 in the Item Classification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0085' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0085',
	'en_US',
	'W',
	'Not entered as item classification 3 in the Item Classification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0086' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0086',
	'en_US',
	'W',
	'Not entered as item classification 4 in the Item Classification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0087' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0087',
	'en_US',
	'W',
	'Not entered as item classification 5 in the Item Classification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0088' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0088',
	'en_US',
	'W',
	'Not entered as item classification 6 in the Item Classification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0089' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0089',
	'en_US',
	'W',
	'Not entered as item classification 7 in the Item Classification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0090' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0090',
	'en_US',
	'W',
	'Not entered as item classification 8 in the Item Classification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0091' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0091',
	'en_US',
	'W',
	'Not entered as item classification 9 in the Item Classification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0092' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0092',
	'en_US',
	'W',
	'Not entered as item classification 10 in the Item Classification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0093' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0093',
	'en_US',
	'W',
	'Not entered as BP classification 1 in the BP Classification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0094' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0094',
	'en_US',
	'W',
	'Not entered as BP classification 2 in the BP Classification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0095' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0095',
	'en_US',
	'W',
	'Not entered as BP classification 3 in the BP Classification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0096' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0096',
	'en_US',
	'W',
	'Not entered as BP classification 4 in the BP Classification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0097' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0097',
	'en_US',
	'W',
	'Not entered as BP classification 5 in the BP Classification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0098' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0098',
	'en_US',
	'W',
	'Not entered as BP classification 6 in the BP Classification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0099' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0099',
	'en_US',
	'W',
	'Not entered as BP classification 7 in the BP Classification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0100' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0100',
	'en_US',
	'W',
	'Not entered as BP classification 8 in the BP Classification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0101' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0101',
	'en_US',
	'W',
	'Not entered as BP classification 9 in the BP Classification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0102' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0102',
	'en_US',
	'W',
	'Not entered as BP classification 10 in the BP Classification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0103' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0103',
	'en_US',
	'W',
	'The customer is not turned on in the BP master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0104' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0104',
	'en_US',
	'W',
	'The AR customer is not turned on in the BP master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0105' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0105',
	'en_US',
	'W',
	'The billing customer is not turned on in the BP master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0106' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0106',
	'en_US',
	'W',
	'The payer is not turned on in the BP master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0107' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0107',
	'en_US',
	'W',
	'The supplier is not turned on in the BP master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0108' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0108',
	'en_US',
	'W',
	'The AP supplier is not turned on in the BP master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0109' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0109',
	'en_US',
	'W',
	'The scheduled payee is not turned on in the BP master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0110' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0110',
	'en_US',
	'W',
	'The payee is not turned on in the BP master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0111' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0111',
	'en_US',
	'W',
	'The credit managed BP is not turned on in the BP master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0112' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0112',
	'en_US',
	'W',
	'The delivery destination is not turned on in the BP master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0113' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0113',
	'en_US',
	'W',
	'The maker is not turned on in the BP master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0114' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0114',
	'en_US',
	'W',
	'The distribution channel is not turned on in the BP master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0115' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0115',
	'en_US',
	'W',
	'Not entered in the Purchase Forecast master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0116' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0116',
	'en_US',
	'W',
	'Not entered in the Company master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0117' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0117',
	'en_US',
	'W',
	'Not entered as a valid BP in the BP master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0118' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0118',
	'en_US',
	'W',
	'Not entered in the Custom T Account master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0119' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0119',
	'en_US',
	'W',
	'Not specified as a GR/GI column for the following criteria in the Custom T Account Configuration master:\nGR/GI list ID: {1}\nGR/GI aggregated unit type: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0120' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0120',
	'en_US',
	'W',
	'Not specified as a sequence number for the journal pattern in the Auto-Journal Pattern master.\nJournal pattern cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0121' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0121',
	'en_US',
	'W',
	'Not entered in the Tax master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0122' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0122',
	'en_US',
	'W',
	'Not entered as a purchase reason in the Business Reason master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0123' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0123',
	'en_US',
	'W',
	'Not entered as a purchase return reason in the Business Reason master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0124' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0124',
	'en_US',
	'W',
	'Not entered as a reason for purchase adjustment in the Business Reason master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0125' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0125',
	'en_US',
	'W',
	'Not entered as a sales reason in the Business Reason master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0126' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0126',
	'en_US',
	'W',
	'Not entered as a sales return reason in the Business Reason master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0127' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0127',
	'en_US',
	'W',
	'Not entered as a reason for sales adjustment in the Business Reason master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0128' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0128',
	'en_US',
	'W',
	'Not entered as a reason for an other accounting GR in the Business Reason master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0129' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0129',
	'en_US',
	'W',
	'Not entered as a disposal reason in the Business Reason master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0130' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0130',
	'en_US',
	'W',
	'Not entered as an inventory transfer reason in the Business Reason master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0131' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0131',
	'en_US',
	'W',
	'Not entered as a transport reason in the Business Reason master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0132' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0132',
	'en_US',
	'W',
	'Not entered as an output reason in the Business Reason master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0133' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0133',
	'en_US',
	'W',
	'Not entered as a loss reason in the Business Reason master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0134' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0134',
	'en_US',
	'W',
	'Not entered as a reason for an inspection defective in the Business Reason master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0135' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0135',
	'en_US',
	'W',
	'Not entered as a reason for subcontracting an operation in the Business Reason master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0136' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0136',
	'en_US',
	'W',
	'Not entered as a reason for an input other accounting GR in the Business Reason master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0137' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0137',
	'en_US',
	'W',
	'Not entered in the Allocation Pattern master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0138' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0138',
	'en_US',
	'W',
	'Not specified as an allocation account group for the Allocation account group type in the Allocation Account Group master.\nAllocation account group type: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0139' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0139',
	'en_US',
	'W',
	'Not entered in the Allocation Account master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0140' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0140',
	'en_US',
	'W',
	'A record not entered in the Custom GR/GI Configuration master is not entered in the Custom T Account Configuration master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0141' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0141',
	'en_US',
	'W',
	'Not entered in the Calculation Category master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0142' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0142',
	'en_US',
	'W',
	'Not entered as the Allocation account group type 1 in the Allocation Account Group master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0143' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0143',
	'en_US',
	'W',
	'Not entered as the Allocation account group type 2 in the Allocation Account Group master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0144' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0144',
	'en_US',
	'W',
	'Not entered as the Allocation account group type 3 in the Allocation Account Group master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0145' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0145',
	'en_US',
	'W',
	'Not entered as the Transaction terms type 1 in the Transaction Terms master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0146' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0146',
	'en_US',
	'W',
	'Not entered as the Transaction terms type 2 in the Transaction Terms master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0147' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0147',
	'en_US',
	'W',
	'Not entered as the Transaction terms type 3 in the Transaction Terms master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0148' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0148',
	'en_US',
	'W',
	'Not entered as the Sales analysis type 1 in the Sales Analysis master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0149' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0149',
	'en_US',
	'W',
	'Not entered as the Sales analysis type 2 in the Sales Analysis master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0150' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0150',
	'en_US',
	'W',
	'Not entered as the Sales analysis type 3 in the Sales Analysis master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0151' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0151',
	'en_US',
	'W',
	'Not specified as a sales analysis for the Sales analysis type in the Sales Analysis master.\nSales analysis type: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0152' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0152',
	'en_US',
	'W',
	'Not specified as a sales classification for the Sales classification type in the Sales Classification master.\nSales classification type: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0153' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0153',
	'en_US',
	'W',
	'Not entered as the Sales classification type 1 in the Cost Sales Classification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0154' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0154',
	'en_US',
	'W',
	'Not entered as the Sales classification type 2 in the Cost Sales Classification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0155' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0155',
	'en_US',
	'W',
	'Not entered as the Sales classification type 3 in the Cost Sales Classification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0156' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0156',
	'en_US',
	'W',
	'Not entered as the Sales classification type 4 in the Cost Sales Classification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0157' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0157',
	'en_US',
	'W',
	'Not entered as the Sales classification type 5 in the Cost Sales Classification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0158' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0158',
	'en_US',
	'W',
	'Not entered in the General Purpose Allocation Classification master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0159' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0159',
	'en_US',
	'W',
	'Not entered as a grading allowing shipping in the Grading master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0160' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0160',
	'en_US',
	'W',
	'Not entered as a grading allowing input allocation in the Grading master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0161' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0161',
	'en_US',
	'W',
	'Not entered as a transportation method available for shipping in the Transportation Method master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0162' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0162',
	'en_US',
	'W',
	'Not entered as a transportation method available for export in the Transportation Method master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0163' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0163',
	'en_US',
	'W',
	'Not entered as a transportation method available for import in the Transportation Method master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0164' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0164',
	'en_US',
	'W',
	'Not entered as a WG with the sales function in the WG master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0165' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0165',
	'en_US',
	'W',
	'Not entered as a WG with the distribution function in the WG master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0166' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0166',
	'en_US',
	'W',
	'Not entered as a WG with the mfg. function in the WG master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0167' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0167',
	'en_US',
	'W',
	'Not entered as a WG with the purchase function in the WG master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0168' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0168',
	'en_US',
	'W',
	'Not entered as a WG with the AR function in the WG master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0169' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0169',
	'en_US',
	'W',
	'Not entered as a WG with the AP function in the WG master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0170' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0170',
	'en_US',
	'W',
	'Not entered as a WG with the demand and supply function in the WG master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0171' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0171',
	'en_US',
	'W',
	'Not entered as an internal bank account in the Bank Account master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0172' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0172',
	'en_US',
	'W',
	'Not entered as an external bank account in the Bank Account master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0173' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0173',
	'en_US',
	'W',
	'Not entered in the Settlement Method master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0174' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0174',
	'en_US',
	'W',
	'The AR settlement type is not entered as "4. Offset (Debit)" in the Settlement Method master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0175' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0175',
	'en_US',
	'W',
	'Not entered in the Departmental Alloc. Pattern master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0176' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0176',
	'en_US',
	'W',
	'Not entered in the Allocation Coefficient master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0177' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0177',
	'en_US',
	'W',
	'Not specified as a cost dept. for the application month in the Cost Dept. master.\nApplication month: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0178' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0178',
	'en_US',
	'W',
	'Not specified as an allocation destination dept. pattern for the term in the Departmental Alloc. Destination Dept. master.\nTerm: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0179' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0179',
	'en_US',
	'W',
	'Not entered as a WG with distribution or mfg. function in the WG master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0180' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0180',
	'en_US',
	'W',
	'Not entered as a valid distribution group in the Distribution Group master, or the Set location is turned off in the Distribution Group master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0181' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0181',
	'en_US',
	'W',
	'Not specified as a cost by cost element or a profit for the term in the Allocation Basis master.\nTerm: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0182' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0182',
	'en_US',
	'W',
	'Not entered in the Departmental Alloc. Basis master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0183' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0183',
	'en_US',
	'W',
	'Not specified as a departmental alloc. basis for the calculation category,\nWG, and term in the Departmental Alloc. Basis Category master.\nOr not specified as a departmental alloc. basis for the Rate setting type in the Departmental Alloc. Basis master.\nCalculation category cd.: {1}\nWG cd.: {2}\nTerm: {3}\nRatio setting type: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0184' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0184',
	'en_US',
	'W',
	'Not entered in the Cost Item Category master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0185' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0185',
	'en_US',
	'W',
	'Not entered in the Dept. Basic master, or the same Dept. cd. was used in the past.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0186' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0186',
	'en_US',
	'W',
	'Not entered in the Organizational Changes History master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0187' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0187',
	'en_US',
	'W',
	'The specified dept. is invalid. Check the following:\n-The Dept. master is set for the specified dept. and application date.\n-The asset management dept. is turned on in the Dept. master.\n-It is set in the PIC Authority master as the dept. to which a PIC belongs.\nApplication date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0188' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0188',
	'en_US',
	'W',
	'The specified dept. is invalid. Check the following:\n-The Dept. master is set for the specified dept. and application date.\n-The sales dept. is turned on in the Dept. master.\n-It is set in the PIC Authority master as the dept. to which a PIC belongs.\nApplication date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0189' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0189',
	'en_US',
	'W',
	'Not entered as a valid item in the Item master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0190' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0190',
	'en_US',
	'W',
	'Not entered in the Cost Report Comparison master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0191' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0191',
	'en_US',
	'W',
	'Not entered in the Cost Report Comparison Structure master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0192' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0192',
	'en_US',
	'W',
	'Not entered in the Calculation Group Report master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0193' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0193',
	'en_US',
	'W',
	'Not entered in the Cost Report Pattern master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0194' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0194',
	'en_US',
	'W',
	'Not entered in the Cost Report Key master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0195' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0195',
	'en_US',
	'W',
	'Not specified as a report row for the following criteria in the Cost Report Structure master:\nReport pattern cd.: {1}\nAggregation: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0196' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0196',
	'en_US',
	'W',
	'Not entered as "2. Cost calculation (Exclude inventory)" or "3. Cost calculation (Inventory calculation)" in the Calculation Group master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0197' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0197',
	'en_US',
	'W',
	'Not entered as an item available for the Asset Management in the Item master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0198' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0198',
	'en_US',
	'W',
	'Not entered in the Sales Item System master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0199' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0199',
	'en_US',
	'W',
	'Not entered as an AR settlement method in the Settlement Method master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0200' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0200',
	'en_US',
	'W',
	'Not entered as an item available for the Inventory Management in the Item master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0201' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0201',
	'en_US',
	'W',
	'Not entered as a valid location in the Location master, or a WG for mfg. is not specified for the Location master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0202' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0202',
	'en_US',
	'W',
	'Not entered in the Inspection Checkpoint master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0203' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0203',
	'en_US',
	'W',
	'Not entered in the Item master as branch No. 1 of the specified Item cd.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0204' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0204',
	'en_US',
	'W',
	'Not entered in the Item master as branch No. 2 of the specified Item cd.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0205' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0205',
	'en_US',
	'W',
	'Not entered in the Item master as branch No. 3 of the specified Item cd.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0206' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0206',
	'en_US',
	'W',
	'Not entered as a valid distribution group in the Distribution Group master, or the Set location is turned on in the Distribution Group master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0207' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0207',
	'en_US',
	'W',
	'You cannot specify a report key entered in the Cost Report Key Structure master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0208' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0208',
	'en_US',
	'W',
	'You cannot specify a report pattern entered in the Cost Report Key Structure master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0209' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0209',
	'en_US',
	'W',
	'Not entered in the Inspection Pattern master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0210' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0210',
	'en_US',
	'W',
	'Not entered as the Cost element type "1. Mfg./Cost of goods sold element" or "2. SGA cost element" in the Cost Element master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0211' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0211',
	'en_US',
	'W',
	'Not specified as an allocation pattern for the term in the Allocation Basis master,\nor "1. Man-hour" is not specified for the Allocation basis type in the Allocation Basis master.\nTerm: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0212' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0212',
	'en_US',
	'W',
	'Not entered in the External System master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0213' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0213',
	'en_US',
	'W',
	'Not specified as an approval route pattern of the Approval function type specified in the Approval Route master.\nApproval function type: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0214' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0214',
	'en_US',
	'W',
	'Not entered as a WG with distribution, mfg. or sales function in the WG master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0215' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0215',
	'en_US',
	'W',
	'Not specified as an inspection pattern for the following criteria in the Item Inspection Pattern master.\nItem: {1}\nApplication date: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0216' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0216',
	'en_US',
	'W',
	'The specified dept. is invalid. Check the following:\n-The Dept. master is set for the specified dept. and application date.\n-The AR dept. is turned on in the Dept. master.\n-It is set in the PIC Authority master as the dept. to which a PIC belongs.\nApplication date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0217' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0217',
	'en_US',
	'W',
	'Not entered as the BP not-entered in the Location master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0218' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0218',
	'en_US',
	'W',
	'Neither the customer nor the supplier is specified in the BP master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0219' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0219',
	'en_US',
	'W',
	'Not entered as the Calculation type "3. Costing (Inventory calculation)" in the Calculation Group master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0220' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0220',
	'en_US',
	'W',
	'Not specified as an inspection pattern for the following criteria in the Item Inspection Pattern master,\nor "4. Sampling specific inspection" is not specified for the Inspection method type in the Item Inspection Pattern master:\nItem: {1}\nApplication date: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0221' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0221',
	'en_US',
	'W',
	'Not entered as a searchable WG with sales function in the WG master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0222' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0222',
	'en_US',
	'W',
	'Not entered as an updatable WG with sales function in the WG master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0223' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0223',
	'en_US',
	'W',
	'Not specified as an inspection pattern for the item in the Item Inspection master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0224' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0224',
	'en_US',
	'W',
	'Not entered in the Cost Report Structure master as a report row which uses the Report Pattern Aggregation master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0225' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0225',
	'en_US',
	'W',
	'Not entered in the MPS Group master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0226' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0226',
	'en_US',
	'W',
	'Not entered in the Sales Plan Item master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0227' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0227',
	'en_US',
	'W',
	'The specified location is invalid. Check the following:\n-It is entered as a valid location in the Location master.\n-It is entered as a location different from the destination location in the Location master.\n-The same WG as the WG of the destination location is specified in the Location master.\nDestination location cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0228' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0228',
	'en_US',
	'W',
	'The specified dept. is invalid. Check the following:\n-The Dept. master is set for the specified dept. and application date.\n-The AP dept. is turned on in the Dept. master.\n-It is set in the PIC Authority master as the dept. to which a PIC belongs.\nApplication date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0229' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0229',
	'en_US',
	'W',
	'The specified dept. is invalid. Check the following:\n-The Dept. master is set for the specified dept. and application date.\n-The purchasing dept. is turned on in the Dept. master.\n-It is set in the PIC Authority master as the dept. to which a PIC belongs.\nApplication date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0230' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0230',
	'en_US',
	'W',
	'The specified dept. is invalid. Check the following:\n-The Dept. master is set for the specified dept. and application date.\n-The charged dept. is turned on in the Dept. master.\n-It is set in the PIC Authority master as the dept. to which a PIC belongs.\nApplication date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0231' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0231',
	'en_US',
	'W',
	'Not entered in the Item master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0232' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0232',
	'en_US',
	'W',
	'Not entered in the Work Type master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0233' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0233',
	'en_US',
	'W',
	'Not entered in the Resource master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0234' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0234',
	'en_US',
	'W',
	'Not entered in the Assortment Group master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0235' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0235',
	'en_US',
	'W',
	'The specified dept. is invalid. Check the following:\n-The Dept. master is set for the specified dept. and application date.\n-The inspection dept. is turned on in the Dept. master.\n-It is set in the PIC Authority master as the dept. to which a PIC belongs.\nApplication date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0236' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0236',
	'en_US',
	'W',
	'The specified dept. is invalid. C the following:\n-The Dept. master is set for the specified dept. and application date.\n-The mfg. dept. is turned on in the Dept. master.\n-It is set in the PIC Authority master as the dept. to which a PIC belongs.\nApplication date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0237' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0237',
	'en_US',
	'W',
	'The specified dept. is invalid. Check the following:\n-The Dept. master is set for the specified dept. and application date.\n-The shipping dept. is turned on in the Dept. master.\n-It is set in the PIC Authority master as the dept. to which a PIC belongs.\nApplication date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0238' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0238',
	'en_US',
	'W',
	'The specified dept. is invalid. Check the following:\n-The Dept. master is set for the specified dept. and application date.\n-The receipt dept. is turned on in the Dept. master.\n-It is set in the PIC Authority master as the dept. to which a PIC belongs.\nApplication date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0239' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0239',
	'en_US',
	'W',
	'The specified dept. is invalid. Check the following:\n-The Dept. master is set for the specified dept. and application date.\n-The demand and supply dept. is turned on in the Dept. master.\n-It is set in the PIC Authority master as the dept. to which a PIC belongs.\nApplication date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0240' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0240',
	'en_US',
	'W',
	'Not entered as a WG with PLM function in the WG master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0241' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0241',
	'en_US',
	'W',
	'Not entered as an inventory reason in the Business Reason master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0242' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0242',
	'en_US',
	'W',
	'Not specified as a unit for the item in the Item Unit master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0243' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0243',
	'en_US',
	'W',
	'Not a searchable WG.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0244' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0244',
	'en_US',
	'W',
	'Not an updatable WG.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0245' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0245',
	'en_US',
	'W',
	'Not a searchable distribution group.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0246' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0246',
	'en_US',
	'W',
	'Not an updatable distribution group.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0247' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0247',
	'en_US',
	'W',
	'Not a searchable dept.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0248' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0248',
	'en_US',
	'W',
	'Not an updatable dept.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0249' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0249',
	'en_US',
	'W',
	'Not a searchable location.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0250' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0250',
	'en_US',
	'W',
	'Not an updatable location.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0251' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0251',
	'en_US',
	'W',
	'Not specified as an alternative group for the WG in the Alternative Group master.\nWG cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0252' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0252',
	'en_US',
	'W',
	'Not specified as a specification for the following criteria in the Item Specification master.\nItem: {1}\nItem specification classification cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0253' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0253',
	'en_US',
	'W',
	'Not specified as a BP item for the following criteria in the BP Item master.\nBP cd.: {1}\nItem: {2}\nApplication date: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0254' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0254',
	'en_US',
	'W',
	'Not entered in the Item master (info. by locale).\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0255' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0255',
	'en_US',
	'W',
	'Not specified as an operation pattern for the following criteria in the Item Operation master.\nItem: {1}\nLocation cd.: {2}\nApplication date: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0256' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0256',
	'en_US',
	'W',
	'Not entered in the Item Details master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0257' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0257',
	'en_US',
	'W',
	'Not specified as a loss reason for the following criteria in the Loss Reason master.\nItem type: {1}\nItem type details cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0258' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0258',
	'en_US',
	'W',
	'Not entered in the Shipping Operation master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0259' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0259',
	'en_US',
	'W',
	'Not entered in the Shipping Operation Group master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0260' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0260',
	'en_US',
	'W',
	'A customer is not specified in the BP master, or the Miscellaneous customer is set.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0261' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0261',
	'en_US',
	'W',
	'A receiving point is not specified for the BP master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0262' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0262',
	'en_US',
	'W',
	'The chargeable supplier is not specified in the BP master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0263' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0263',
	'en_US',
	'W',
	'Not entered as a customer for the following criteria in the Customer Delivery Destination master.\nDelivery destination cd.: {1}\nApplication date: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0264' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0264',
	'en_US',
	'W',
	'Not entered as a delivery destination for the following criteria in the Customer Delivery Destination master.\nCustomer cd.: {1}\nApplication date: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0265' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0265',
	'en_US',
	'W',
	'The billing customer is not turned on in the BP master, or it is not specified as a billing customer for the payer in the BP master.\nPayer cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0266' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0266',
	'en_US',
	'W',
	'The delivery destination is not turned on in the BP master, or a role other than a delivery destination is also specified.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0267' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0267',
	'en_US',
	'W',
	'The maker is not turned on in the BP master, or a role other than a maker is also specified.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0268' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0268',
	'en_US',
	'W',
	'The destination channel is not turned on in the BP master, or a role other than a destination channel is also specified.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0269' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0269',
	'en_US',
	'W',
	'Neither the delivery destination nor the supplier is turned on in the BP master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0270' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0270',
	'en_US',
	'W',
	'The purchasing forecast group is not specified in the BP Item master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0271' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0271',
	'en_US',
	'W',
	'Neither the billing customer nor the payer is turned on in the BP master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0272' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0272',
	'en_US',
	'W',
	'A valid sales system is not entered in the Sales Item System master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0273' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0273',
	'en_US',
	'W',
	'A valid system parameters overview is not entered in the System Parameters Overview table.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0274' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0274',
	'en_US',
	'W',
	'A valid business classification is not entered in the System Parameters Overview table.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0275' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0275',
	'en_US',
	'W',
	'Not entered as a dept. for the following criteria in the Dept. master.\nApplication start date: {1}\nApplication end date: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0276' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0276',
	'en_US',
	'W',
	'Not entered as a valid item in the Item master, or "3. Phantom item" is specified for the Asset management type.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0277' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0277',
	'en_US',
	'W',
	'Not entered as a valid item in the Item master, or "1. Manage inventory" is not specified for the Inventory management type.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0278' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0278',
	'en_US',
	'W',
	'Not entered as a valid item in the Item master, or "2. Not inventory management" is not specified for the Inventory management type.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0279' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0279',
	'en_US',
	'W',
	'Not entered as a valid item in the Item master, or "3. Phantom item" is not specified for the Inventory management type.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0280' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0280',
	'en_US',
	'W',
	'Not entered as a valid item in the Item master, or "1. Manage asset" is not specified for the Asset management type.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0281' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0281',
	'en_US',
	'W',
	'Not entered as a valid item in the Item master, or "2. Do not manage asset" is not specified for the Asset management type.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0282' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0282',
	'en_US',
	'W',
	'Not entered as a valid item in the Item master, or "3. Phantom item" is specified for the Asset management type.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0283' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0283',
	'en_US',
	'W',
	'The specified item is invalid. Check the following:\n-It is entered as a valid item in the Item master.\n-The Inventory management type is specified as "1. Manage inventory" in the Item master.\n-The Asset management type is specified as "1. Manage asset" in the Item master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0284' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0284',
	'en_US',
	'W',
	'The specified item is invalid. Check the following:\n-It is entered as a valid item in the Item master.\n-The Inventory management type is specified as "1. Manage inventory" in the Item master.\n-The Asset management type is specified as "2. Do not manage asset" in the Item master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0285' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0285',
	'en_US',
	'W',
	'The specified item is invalid. Check the following:\n-It is entered as a valid item in the Item master.\n-The Inventory management type is specified as "2. Not inventory management" in the Item master.\n-The Asset management type is specified as "1. Manage asset" in the Item master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0286' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0286',
	'en_US',
	'W',
	'The specified item is invalid. Check the following:\n-It is entered as a valid item in the Item master.\n-The Inventory management type is specified as "2. Not inventory management" in the Item master.\n-The Asset management type is specified as "2. Do not manage asset" in the Item master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0287' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0287',
	'en_US',
	'W',
	'Not entered as a valid item in the Item master, or the Miscellaneous item is not turned on in the Item master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0288' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0288',
	'en_US',
	'W',
	'The specified item is invalid. Check the following:\n-It is entered as a valid item in the Item master\n-The Inventory management type is specified as "1. Manage inventory" in the Item master\n-The Miscellaneous item is turned off in the Item master\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0289' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0289',
	'en_US',
	'W',
	'The specified item is invalid. Check the following:\n-It is entered as a valid item in the Item master.\n-The Asset management type is specified as "1. Manage asset" in the Item master.\n-The Miscellaneous item is turned off in the Item master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0290' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0290',
	'en_US',
	'W',
	'The specified item is invalid. Check the following:\n-It is entered as a valid item in the Item master.\n-The Inventory management type is specified as "1. Manage inventory" in the Item master.\n-The Asset management type is specified as "1. Manage asset" in the Item master.\n-The Miscellaneous item is turned off in the Item master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0291' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0291',
	'en_US',
	'W',
	'The specified item is invalid. Check the following:\n-It is entered as a valid item in the Item master.\n-The Inventory management type is specified as "1. Manage inventory" in the Item master.\n-The Asset management type is specified as "2. Do not manage asset" in the Item master.\n-The Miscellaneous item is turned off in the Item master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0292' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0292',
	'en_US',
	'W',
	'The specified item is invalid. Check the following:\n-It is entered as a valid item in the Item master.\n-The Inventory management type is specified as "2.Not inventory management" in the Item master.\n-The Asset management type is specified as "1. Manage asset" in the Item master.\n-The Miscellaneous item is turned off in the Item master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0293' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0293',
	'en_US',
	'W',
	'Not entered as a valid item in the Item master, or the For version control is not turned on in the Item master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0294' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0294',
	'en_US',
	'W',
	'Not entered as a valid item in the Item master, or an item is not entered in the Item Inspection Pattern master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0295' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0295',
	'en_US',
	'W',
	'The specified item is invalid. Check the following:\n-It is entered as a valid item in the Item master.\n-The item is entered in the Sales Plan Item Configuration master.\n-NULL character is specified for the plan item in the Sales Plan Item Configuration master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0296' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0296',
	'en_US',
	'W',
	'Not entered as a valid item in the Item master,\nor "1. Manage asset" or "3. Phantom item" is not specified for the Asset management type in the Item master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0297' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0297',
	'en_US',
	'W',
	'Not entered as a valid item in the Item master, or the configuration main item is not turned on in the Item master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0298' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0298',
	'en_US',
	'W',
	'The specified item is invalid. Check the following:\n-It is entered as a valid item in the Item master.\n-A value other than "3. Phantom item" is specified for the Asset management type in the Item master.\n-A value other than "2. Manage configuration/specification" is specified for the Configuration/Specification management type in the Item master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0299' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0299',
	'en_US',
	'W',
	'The specified item is invalid. Check the following:\n-It is entered as a valid item in the Item master.\n-"1. Manage inventory" is specified for the Inventory management type in the Item master.\n-A value other than "2. Manage configuration/specification" is specified for the Configuration/Specification management type in the Item master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0300' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0300',
	'en_US',
	'W',
	'The specified item is invalid. Check the following:\n-It is entered as a valid item in the Item master.\n-The item is entered in the BP Item master.\n-The purchase forecast group is specified in the BP Item master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0301' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0301',
	'en_US',
	'W',
	'The specified item is invalid. Check the following:\n-It is entered as a valid item in the Item master.\n-The item is entered in the Item Inspection Pattern master.\n-"4. Sampling specific inspection" is specified for the Inspection method type in the Item Inspection Pattern master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0302' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0302',
	'en_US',
	'W',
	'The specified item is invalid. Check the following:\n-It is entered as a valid item in the Item master.\n-"2. Allow same lot No." or "3. Do not allow same lot No." is not specified for the Lot management type in the Item master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0303' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0303',
	'en_US',
	'W',
	'The specified item is invalid. Check the following:\n-It is entered as a valid item in the Item master.\n-The item is entered in the Replenishment master.\n-The reorder point inventory qty. is set to 0 or more in the Replenishment master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0304' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0304',
	'en_US',
	'W',
	'The specified dept. is invalid. Check the following:\n-The Dept. master is set for the specified dept. and application date.\n-The AR or AP dept. is turned on in the Dept. master.\n-It is set in the PIC Authority master as the dept. to which a PIC belongs. Application date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0305' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0305',
	'en_US',
	'W',
	'The specified dept. is invalid. Check the following:\n-The Dept. master is set for the specified dept. and application date.\n-The AR dept. is turned on in the Dept. master.\n-It is set in the PIC Authority master as the dept. to which a PIC belongs.\n-It is not specified as a billing dept. for a billing customer in the BP. master.\nApplication date: {1}\nBilling customer cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0306' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0306',
	'en_US',
	'W',
	'The specified dept. is invalid. Check the following:\n-The Dept. master is set for the specified dept. and application date.\n-The sales, purchasing, shipping, receipt, mfg. or inspection dept. is turned on in the Dept. master.\n-It is set in the PIC Authority master as the dept. to which a PIC belongs.\nApplication date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0307' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0307',
	'en_US',
	'W',
	'Not entered as a valid location in the Location master, or a distribution WG is not specified in the Location master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0308' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0308',
	'en_US',
	'W',
	'The specified location is invalid. Check the following:\n-It is entered as a valid location in the Location master.\n-The specified WG is set in the Location master.\n-Mfg. in the specified WG is turned on in the WG master.\nWG cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0309' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0309',
	'en_US',
	'W',
	'Not entered as a valid location in the Location master, or "1. Sales" is not specified for the Controlling site type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0310' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0310',
	'en_US',
	'W',
	'Not entered as a valid location in the Location master, or "2. Production" is not specified for the Controlling site type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0311' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0311',
	'en_US',
	'W',
	'Not entered as a valid location in the Location master, or the supplier is specified in the Location master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0312' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0312',
	'en_US',
	'W',
	'Not entered as a valid location in the Location master, or the supplier is not specified in the Location master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0313' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0313',
	'en_US',
	'W',
	'The specified location is invalid. Check the following:\n-It is entered as a valid location in the Location master.\n-"2. Production" is specified for the Controlling site type in the Location master.\n-The supplier is specified in the Location master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0314' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0314',
	'en_US',
	'W',
	'The specified location is invalid. Check the following:\n-It is entered as a valid location in the Location master.\n-The specified WG is set in the Location master.\n-A supplier for the specified WG is not specified in the WG master.\nWG cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0315' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0315',
	'en_US',
	'W',
	'Not entered as a valid location in the Location master, or the For inventory count is not turned on in the Location master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0316' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0316',
	'en_US',
	'W',
	'Not entered as a valid location in the Location master, or not entered as a location for the WG in the Location master.\nWG cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0317' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0317',
	'en_US',
	'W',
	'Not entered as a valid location in the Location master, or not entered as a location for the distribution group in the Location master.\nDistribution group cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0318' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0318',
	'en_US',
	'W',
	'Not entered as a valid location in the Location master, or not entered as a location for the factory/distribution warehouse in the Location master.\nFactory/Distribution warehouse cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0319' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0319',
	'en_US',
	'W',
	'Not entered as a valid location in the Location master, or not entered as a location for the mfg. location group in the Location master.\nMfg. location group cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0320' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0320',
	'en_US',
	'W',
	'The specified location is invalid. Check the following:\n-It is entered as a valid location in the Location master\n-The supplier is not specified in the Location master\n-The mfg. WG is specified in the Location master\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0321' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0321',
	'en_US',
	'W',
	'Not specified as a purchase reason for the following criteria in the Business Reason master.\nExpense Purchase: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0322' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0322',
	'en_US',
	'W',
	'Not specified as a purchase return reason for the following criteria in the Business Reason master.\nExpense Purchase: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0323' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0323',
	'en_US',
	'W',
	'Not specified as a distribution group for the WG in the Distribution Group master, or the Set location is turned off in the Distribution Group master.\nWG cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0324' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0324',
	'en_US',
	'W',
	'Not specified as a distribution group for the WG in the Distribution Group master, or the Set location is turned off in the Distribution Group master.\nWG cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0325' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0325',
	'en_US',
	'W',
	'Not specified as a purchase adjustment reason for the Purchase adjustment controlling site type in the Business Reason master.\nPurchase adjustment controlling site type: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0326' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0326',
	'en_US',
	'W',
	'Not specified as an output reason for the Output type in the Business Reason master.\nOutput type: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0327' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0327',
	'en_US',
	'W',
	'Not specified as a distribution group for the WG in the Distribution Group master.\nWG cd.: {1}\nSet location: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0328' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0328',
	'en_US',
	'W',
	'Not specified as a mfg. location group for the WG in the Mfg. Location Group master.\nWG cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0329' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0329',
	'en_US',
	'W',
	'Not specified as a cost element for the following criteria in the Cost Element master.\nCost element type: {1}\nDirect/Indirect type: {2}\nConstant/variable type: {3}\nCost element group cd.: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0330' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0330',
	'en_US',
	'W',
	'Not specified as a settlement method for the AR settlement type in the Settlement Method master.\nAR settlement type: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0331' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0331',
	'en_US',
	'W',
	'Not specified as an item category for the Item category configuration type in the Cost Item Category master.\nItem category configuration type: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0332' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0332',
	'en_US',
	'W',
	'Not specified as the departmental alloc. basis for the departmental alloc. pattern in the Departmental Alloc. Basis master.\nDepartmental alloc. pattern cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0333' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0333',
	'en_US',
	'W',
	'Not specified as an item system for the sales item system hierarchy in the Sales Item System master.\nSales item system hierarchy: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0334' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0334',
	'en_US',
	'W',
	'Not specified as a distribution group for the WG in the Distribution Group master, or the Set location is turned on in the Distribution Group master.\nWG cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0335' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0335',
	'en_US',
	'W',
	'Not specified as a calculation group for the report pattern and the report key in the Calculation Group Report master.\nComparison pattern cd.: {1}\nReport pattern cd.: {2}\nReport key cd.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0336' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0336',
	'en_US',
	'W',
	'Not specified as resource 1 and resource 2 for the location in the Location master.\nLocation cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0337' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0337',
	'en_US',
	'W',
	'Not specified as a business reason for the following criteria in the Business Reason master.\nOther accounting GR: {1}\nOther accounting GI: {2}\nDisposal: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0338' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0338',
	'en_US',
	'W',
	'Not specified as a business reason for the following criteria in the Business Reason master.\nPurchase: {1}\nExpense Purchase: {2}\nSales return: {3}\nTransport: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0339' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0339',
	'en_US',
	'W',
	'Not specified as a business reason for the following criteria in the Business Reason master.\nSales: {1}\nTransport: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0340' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0340',
	'en_US',
	'W',
	'Not specified as a business reason for the following criteria in the Business Reason master.\nSales: {1}\nSales return: {2}\nSales adjustment: {3}\nSales other accounting: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0341' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0341',
	'en_US',
	'W',
	'Not specified as a column for the following criteria in the Cost Report Comparison Structure master.\nComparison pattern cd.: {1}\nAggregation column: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0342' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0342',
	'en_US',
	'W',
	'Not specified as a departmental alloc. basis for the calculation category,\nthe WG, and the term in the Departmental Alloc. Basis Category master,\nor not specified as a departmental alloc. basis for the Ratio setting type in the Departmental Alloc. Basis master,\nor the monthly ratio (plan) is turned off in the Departmental Alloc. Basis master.\nCalculation category cd.: {1}\nWG cd.: {2}\nTerm: {3}\nRatio setting type: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0343' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0343',
	'en_US',
	'W',
	'Not specified as a departmental alloc. basis for the calculation category,\nthe WG, and the term in the Departmental Alloc. Basis Category master,\nor not specified as a departmental alloc. basis for the Ratio setting type in the Departmental Alloc. Basis master,\nor the monthly ratio (result) is turned off in the Departmental Alloc. Basis master.\nCalculation category cd.: {1}\nWG cd.: {2}\nTerm: {3}\nRatio setting type: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0344' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0344',
	'en_US',
	'W',
	'Not specified as a departmental alloc. basis for the calculation category,\nthe WG, and the term in the Departmental Alloc. Basis Category master,\nor not specified as a departmental alloc. basis for the Ratio setting type in the Departmental Alloc. Basis master,\nor either the monthly ratio (plan) or monthly ratio (result) is turned off in the Departmental Alloc. Basis master.\nCalculation category cd.: {1}\nWG cd.: {2}\nTerm: {3}\nRatio setting type: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0345' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0345',
	'en_US',
	'W',
	'Not specified as a departmental alloc. basis for the calculation category,\nthe WG and the term in the Departmental Alloc. Basis Category master,\nor not specified as a departmental alloc. basis for the Ratio setting type in the Departmental Alloc. Basis master,\nor both monthly ratio (plan) and monthly ratio (result) are turned off in the Departmental Alloc. Basis master.\nCalculation category cd.: {1}\nWG cd.: {2}\nTerm: {3}\nRatio setting type: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0346' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0346',
	'en_US',
	'W',
	'Not specified as valid shipping conditions in the Shipping Conditions master, or not specified as shipping conditions for the following criteria in the Distribution Control master:\nShipping point distribution group cd.: {1}\nReceiving point distribution group cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0347' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0347',
	'en_US',
	'W',
	'Not specified as a valid shipping operation in the Shipping Operation master, or not specified as a shipping operation for the following criteria in the Shipping Operation Decision master:\nShipping operation group cd.: {1}\nShipping schedule time: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0348' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0348',
	'en_US',
	'W',
	'Neither the customer, the delivery destination nor the supplier is specified in the BP master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0349' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0349',
	'en_US',
	'W',
	'The supplier is not specified in the BP master, or the supplier invoice transaction is turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0350' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0350',
	'en_US',
	'W',
	'The External system type is not entered as "1. EDI" or "6. EDI (MCF)" in the External System master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0351' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0351',
	'en_US',
	'W',
	'Not entered as an AP settlement method in the Settlement Method master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0352' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0352',
	'en_US',
	'W',
	'The specified dept. is invalid. Check the following:\n-The Dept. master is set for the specified dept. and application date.\nApplication date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0353' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0353',
	'en_US',
	'W',
	'The specified dept. is invalid. Check the following:\n-The Dept. master is set for the specified dept. and application date.\n-The Asset management dept. is turned on in the Dept. master.\nApplication date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0354' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0354',
	'en_US',
	'W',
	'The specified dept. is invalid. Check the following:\n-The Dept. master is set for the specified dept. and application date.\n-The AR dept. is turned on in the Dept. master.\nApplication date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0355' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0355',
	'en_US',
	'W',
	'The specified dept. is invalid. Check the following:\n-The Dept. master is set for the specified dept. and application date.\n-The AP dept. is turned on in the Dept. master.\nApplication date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0356' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0356',
	'en_US',
	'W',
	'The specified dept. is invalid. Check the following:\n-The Dept. master is set for the specified dept. and application date.\n-The sales dept. is turned on in the Dept. master.\nApplication date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0357' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0357',
	'en_US',
	'W',
	'The specified dept. is invalid. Check the following:\n-The Dept. master is set for the specified dept. and application date.\n-The purchasing dept. is turned on in the Dept. master.\nApplication date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0358' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0358',
	'en_US',
	'W',
	'The specified dept. is invalid. Check the following:\n-The Dept. master is set for the specified dept. and application date.\n-The shipping dept. is turned on in the Dept. master.\nApplication date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0359' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0359',
	'en_US',
	'W',
	'The specified dept. is invalid. Check the following:\n-The Dept. master is set for the specified dept. and application date.\n-The receipt dept. is turned on in the Dept. master.\nApplication date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0360' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0360',
	'en_US',
	'W',
	'The specified dept. is invalid. Check the following:\n-The Dept. master is set for the specified dept. and application date.\n-The mfg. dept. is turned on in the Dept. master.\nApplication date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0361' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0361',
	'en_US',
	'W',
	'The specified dept. is invalid. Check the following:\n-The Dept. master is set for the specified dept. and application date.\n-The demand and supply dept. is turned on in the Dept. master.\nApplication date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0362' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0362',
	'en_US',
	'W',
	'The specified dept. is invalid. Check the following:\n-The Dept. master is set for the specified dept. and application date.\n-The inspection dept. is turned on in the Dept. master.\nApplication date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0363' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0363',
	'en_US',
	'W',
	'The specified dept. is invalid. Check the following:\n-The Dept. master is set for the specified dept. and application date.\n-The charged dept. is turned on in the Dept. master.\nApplication date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0364' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0364',
	'en_US',
	'W',
	'The specified dept. is invalid. Check the following:\n-The Dept. master is set for the specified dept. and application date.\n-The AR or AP dept. is turned on in the Dept. master.\nApplication date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0365' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0365',
	'en_US',
	'W',
	'The specified dept. is invalid. Check the following:\n-The Dept. master is set for the specified dept. and application date\n-The AR dept. is turned on in the Dept. master\n-It is not specified as a billing dept. for a billing customer in the BP master.\nApplication date: {1}\nBilling customer cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0366' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0366',
	'en_US',
	'W',
	'The specified dept. is invalid. Check the following:\n-The Dept. master is set for the specified dept. and application date.\n-The sales, purchasing, shipping, receipt, mfg. or inspection dept. is turned on in the Dept. master.\n-It is not specified as a billing dept. for a billing customer in the BP master.\nApplication date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0367' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0367',
	'en_US',
	'W',
	'Not specified as a settlement method with the AR settlement type "Offset (Debit)" or "Withholding tax" in the Settlement Method master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0368' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0368',
	'en_US',
	'W',
	'Not specified as a sales reason for the following criteria in the Business Reason master:\nSales other accounting: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0369' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0369',
	'en_US',
	'W',
	'Not specified as a sales return reason for the following criteria in the Business Reason master:\nSales other accounting: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0370' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0370',
	'en_US',
	'W',
	'Not entered as a gross allocation location group and a distribution group for the location where the gross allocation location group and the distribution group reside.\nCheck the gross allocation location group and the distribution group in the Location master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0371' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0371',
	'en_US',
	'W',
	'Not entered as a WG with one of the functions of sales, distribution, mfg., or purchasing in the WG master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0372' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0372',
	'en_US',
	'W',
	'Not entered in the Cost Dept. master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0373' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0373',
	'en_US',
	'W',
	'Not entered as a dept. allocation group for the term in the Cost Dept. master.\nTerm: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0374' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0374',
	'en_US',
	'W',
	'Not specified as a calculation group for the Calculation type in the Calculation Group master.\nCalculation type: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0375' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0375',
	'en_US',
	'W',
	'Not entered in the Location master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0376' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0376',
	'en_US',
	'W',
	'Not entered in the BP master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0377' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0377',
	'en_US',
	'W',
	'It is not entered in the Cost Report Structure master.\nReport pattern cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0378' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0378',
	'en_US',
	'W',
	'Not specified as a WG for the criteria in the WG master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0379' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0379',
	'en_US',
	'W',
	'Not entered in the calculation run pattern.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0380' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0380',
	'en_US',
	'W',
	'Not specified as an input qty. for the term in the Allocation Basis master.\nTerm: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0381' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0381',
	'en_US',
	'W',
	'Not specified as an optional allocation value for the term in the Allocation Basis master.\nTerm: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0382' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0382',
	'en_US',
	'W',
	'Not specified as a general purpose allocation for the term in the Allocation Basis master.\nTerm: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0383' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0383',
	'en_US',
	'W',
	'Not specified as a departmental alloc. basis for the calculation category, the WG and the term in the Departmental Alloc. Basis Category master.\nCalculation category cd.: {1}\nWG cd.: {2}\nTerm: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0384' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0384',
	'en_US',
	'W',
	'Not specified as a departmental alloc. basis for the calculation category,\nthe WG and the term in the Departmental Alloc. Basis Category master,\nor the monthly ratio (plan) is turned off in the Departmental Alloc. Basis master.\nCalculation category cd.: {1}\nWG cd.: {2}\nTerm: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0385' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0385',
	'en_US',
	'W',
	'Not specified as a departmental alloc. basis for the calculation category,\nthe WG and the term in the Departmental Alloc. Basis Category master,\nor the monthly ratio (result) is turned off in the Departmental Alloc. Basis master.\nCalculation category cd.: {1}\nWG cd.: {2}\nTerm: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0386' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0386',
	'en_US',
	'W',
	'Not specified as a departmental alloc. basis for the calculation category,\nthe WG and the term in the Departmental Alloc. Basis Category master,\nor either the monthly ratio (plan) or the monthly ratio (result) is turned off in the Departmental Alloc. Basis master.\nCalculation category cd.: {1}\nWG cd.: {2}\nTerm: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0387' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0387',
	'en_US',
	'W',
	'Not specified as a departmental alloc. basis for the calculation category,\nthe WG and the term in the Departmental Alloc. Basis Category master,\nor both the monthly ratio (plan) and the monthly ratio (result) are turned off in the Departmental Alloc. Basis master.\nCalculation category cd.: {1}\nWG cd.: {2}\nTerm: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0388' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0388',
	'en_US',
	'W',
	'A record not entered in the Cost Menu Structure master is not entered in the Cost Menu master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0389' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0389',
	'en_US',
	'W',
	'Not specified as the Accounting slip type for the calculation group in the Cost Accounting Slip Type Journal master.\nCalculation group: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0390' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0390',
	'en_US',
	'W',
	'Not entered in the Inventory Revaluation master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0391' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0391',
	'en_US',
	'W',
	'Not entered as a valid allocation coefficient in the Allocation Coefficient master,\nor not specified as "1. Allocation Coefficient Structure master" in the Allocation coefficient structure type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0392' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0392',
	'en_US',
	'W',
	'Not entered as a valid allocation coefficient in the Allocation Coefficient master,\nor not specified as a value other than "1. Allocation Coefficient Structure master" in the Allocation coefficient structure type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0393' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0393',
	'en_US',
	'W',
	'Not entered in the Accounting Dept. master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0394' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0394',
	'en_US',
	'W',
	'Not specified as a WG with no function in the WG master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0395' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0395',
	'en_US',
	'W',
	'The specified location is invalid. Check the following:\n-It is entered as a valid location in the Location master.\n-The specified WG is set in the Location master.\n-The supplier is specified in the Location master.\nWG cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0396' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0396',
	'en_US',
	'W',
	'Not entered as an input reason in the Business Reason master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0397' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0397',
	'en_US',
	'W',
	'None of customer, supplier, billing customer, or scheduled payee are specified in the BP master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0502' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0502',
	'en_US',
	'W',
	'The specified calculation group is invalid. Make sure that one of the following criteria is satisfied in the Calculation Group master:\n- The Calculation type is specified as "2. Cost calculation (Exclude inventory)" or "3. Cost calculation (Inventory calculation)".\n-The Calculation type is specified as "4. Other", and the Departmental alloc. calculation type is specified as "2. Calculation".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0501' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0501',
	'en_US',
	'W',
	'The specified item is invalid. Check the following:\n-It is entered as a valid item in the Item master.\n-The Inventory management type is specified as "1. Manage inventory" in the Item master.\n-The Asset management type is specified as "1. Manage asset" in the Item master.\n-The Lot management type is specified as "3. Do not allow same lot No.", or the Sublot management type is specified as "3. Prohibit same sublot in a lot" in the Item master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0503' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0503',
	'en_US',
	'W',
	'Not entered in the Warehousing Business master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0504' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0504',
	'en_US',
	'W',
	'The External system type is not entered as "2. SCM" or "7. SCM (MD)" in the External System master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0505' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0505',
	'en_US',
	'W',
	'Not entered in the Distribution Control master.\nShipping point distribution group cd.: {1}\nReceiving point distribution group cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0506' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0506',
	'en_US',
	'W',
	'The settlement method is invalid.\nThe AP settlement is turned off in the Settlement Method master,\nor the settlement method in which the following is specified cannot be specified in the AP settlement type:\n- "7. Withholding tax"\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0507' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0507',
	'en_US',
	'W',
	'Not entered as a valid location in the Location master, or the For rack/line in the Location master is not turned.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0508' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0508',
	'en_US',
	'W',
	'The specified location is invalid. Check the following:\n-It is entered as a valid location in the Location master.\n-WG for mfg. or distribution is specified in the Location master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0601' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0601',
	'en_US',
	'W',
	'If you turn on the Repurchase obligation, you cannot specify the tax to be imposed for the Supply tax. {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0701' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUAL0701',
	'en_US',
	'W',
	'The External system type is not entered as "5. Accounting" or "A. Accounting (SAP)" in the External System master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCC0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCC0001',
	'en_US',
	'E',
	'Unexpected data type was set.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCC0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCC0007',
	'en_US',
	'I',
	'{1}:{2}:{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0001',
	'en_US',
	'W',
	'The sign of the total request qty. does not match the sign of the total assignable qty.\nTotal request qty.: {1}\nTotal assignable qty.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0002',
	'en_US',
	'W',
	'The sum of the assignment ratio must be the number other than 0.\nTotal of assignment ratios: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0003',
	'en_US',
	'T',
	'Remains occurred in the assignment processing. Remaining qty.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0004',
	'en_US',
	'W',
	'Could not acquire the own company information.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0005',
	'en_US',
	'W',
	'Could not acquire the base currency information.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0006',
	'en_US',
	'W',
	'Could not acquire the user information.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0007',
	'en_US',
	'E',
	'A net service name is not specified in the ServerConfig resource in your database. A net service name is used in this system.\nKey: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0008',
	'en_US',
	'W',
	'For the following columns, a numerical value that exceeds the allowed number of decimal places is specified:\nColumn: {1}\nNumerical value: {2}\nNumber of decimal places: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0009',
	'en_US',
	'W',
	'Could not acquire the tax currency information.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0010',
	'en_US',
	'W',
	'Could not find the data.\nModule: {1}\nTable: {2}\nKey: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0011',
	'en_US',
	'W',
	'An inconsistent value ​​was specified for the following column:\nColumn: {1}\nRequest message data: {2}\nValue on DB: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0012',
	'en_US',
	'W',
	'A character not allowed for the item is included.\nItem: {1}\nCharacter not allowed: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0013',
	'en_US',
	'W',
	'A character not allowed for branch No. 1 is included.\nBranch No. 1: {1}\nCharacter not allowed: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0014',
	'en_US',
	'W',
	'A character not allowed for branch No. 2 is included.\nBranch No. 2: {1}\nCharacter not allowed: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0015',
	'en_US',
	'W',
	'While the Nth delimiter for the Item cd. is not set, one or more values are set after the branch No. N.\nBranch No. 1: {1}\nBranch No. 2: {2}\nBranch No. 3: {3}\nN: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0016',
	'en_US',
	'D',
	'Skipping the conversion processing to the base unit.\nQty.: {1}\nUnit conversion factor: {2}\nNumber of decimal places: {3}\nUnit conversion rounding type: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0017',
	'en_US',
	'D',
	'Skipping the unit conversion processing.\nBase unit qty.: {1}\nUnit conversion factor: {2}\nNumber of decimal places: {3}\nUnit conversion rounding type: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0018',
	'en_US',
	'D',
	'Skipping the unit conversion processing.\nQty.: {1}\nFactor in convert-from unit: {2}\nFactor in convert-to unit: {2}\nNumber of decimal places: {3}\nUnit conversion rounding type: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0019',
	'en_US',
	'D',
	'Skipping the conversion processing to the active ingredient unit.\nBase unit qty.: {1}\nActive ingredient coefficient: {2}\nActive ingredient number of decimal places: {3}\nRounding type (Active ingredient conversion): {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0020',
	'en_US',
	'D',
	'Skipping the conversion processing from the active ingredient unit to the base unit.\nActive ingredient: {1}\nActive ingredient coefficient: {2}\nBase unit number of decimal places: {3}\nBase unit rounding type: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0021',
	'en_US',
	'D',
	'Skipping the calculation processing of the active ingredient coefficient.\nBase unit qty.: {1}\nActive ingredient: {2}\nActive ingredient number of decimal places: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0022',
	'en_US',
	'D',
	'Caches will be discarded because the upper limit of cache has been exceeded.\nUpper limit value of cache: {1}\nDiscarded key: {2}\nSize after discard: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0023',
	'en_US',
	'T',
	'No cache exists.\nKey value: {1}\nCache class: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0024',
	'en_US',
	'T',
	'Cache was used.\nKey value: {1}\nCache class: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0025',
	'en_US',
	'W',
	'Could not acquire the cost company parameter information.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0026',
	'en_US',
	'E',
	'The list of proportion targets does not exist or it has no records.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0027' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0027',
	'en_US',
	'E',
	'There is no data in the column to store assignment ratio in the list of proportion targets.\nColumn name where assignment ratio is stored: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0028' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0028',
	'en_US',
	'W',
	'Could not acquire the management company parameter information.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0029' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0029',
	'en_US',
	'W',
	'For the row to be entered, a record with the same start and end months already exists.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0030' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0030',
	'en_US',
	'W',
	'There is an overlapping period between entered data.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0031' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0031',
	'en_US',
	'W',
	'There is an overlapping period between data to be entered.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0032' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0032',
	'en_US',
	'W',
	'There is an overlapping period between the data to be entered and the entered data.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0033' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0033',
	'en_US',
	'D',
	'Skipping the amount calculation processing.\nUnit price: {1}\nQty.: {2}\nNumber of decimal places: {3}\nRounding type (Amount): {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0034' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0034',
	'en_US',
	'D',
	'Skipping the unit price calculation processing.\nAmount: {1}\nQty.: {2}\nUnit price number of decimal places: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0035' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0035',
	'en_US',
	'D',
	'Skipping the tax amount calculation processing.\nAmount: {1}\nTax rate: {2}\nAmount number of decimal places: {3}\nTax amount rounding type: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0036' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0036',
	'en_US',
	'W',
	'The newly added row has already been entered.\nModule: {1}\nTable: {2}\nKey: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0037' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0037',
	'en_US',
	'W',
	'Could not acquire the cost company parameter information.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0039' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0039',
	'en_US',
	'W',
	'The Item cd. is invalid.\nItem cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0040' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0040',
	'en_US',
	'W',
	'The item number cannot be {1}.\nItem cd.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0041' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0041',
	'en_US',
	'W',
	'The branch No. 1 cannot be {1}.\nItem cd.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0042' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0042',
	'en_US',
	'W',
	'The branch No. 2 cannot be {1}.\nItem cd.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0043' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0043',
	'en_US',
	'W',
	'The branch No. 3 cannot be {1}.\nItem cd.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0044' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0044',
	'en_US',
	'W',
	'The item number exceeds the allowed number of characters.\nItem cd.: {1}\nItem number: {2}\nNumber of characters in item number: {3}\nMax. allowed number of characters: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0045' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0045',
	'en_US',
	'W',
	'The branch No. 1 exceeds the allowed number of characters.\nItem cd.: {1}\nBranch No. 1: {2}\nNumber of characters in branch No. 1: {3}\nMax. allowed number of characters: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0046' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0046',
	'en_US',
	'W',
	'The branch No. 2 exceeds the allowed number of characters.\nItem cd.: {1}\nBranch No. 2: {2}\nNumber of characters in branch No. 2: {3}\nMax. allowed number of characters: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0047' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0047',
	'en_US',
	'W',
	'The branch No. 3 exceeds the allowed number of characters.\nItem cd.: {1}\nBranch No. 3: {2}\nNumber of characters in branch No. 3: {3}\nMax. allowed number of characters: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0048' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0048',
	'en_US',
	'W',
	'The Item cd. exceeds the allowed number of characters.\nItem cd.: {1}\nNumber of characters in the Item cd.: {2}\nMax. allowed number of characters: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0049' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0049',
	'en_US',
	'W',
	'The Item cd. does not contain a character indicating the end of an item number.\nItem cd.: {1}\nCharacter indicating end of item number: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0050' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0050',
	'en_US',
	'W',
	'The Item cd. does not contain a character indicating the end of branch No. 1.\nItem cd.: {1}\nCharacter indicating end of branch No. 1: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0051' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0051',
	'en_US',
	'W',
	'The Item cd. does not contain a character indicating the end of branch No. 2.\nItem cd.: {1}\nCharacter indicating end of branch No. 2: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0053' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0053',
	'en_US',
	'W',
	'The item number has not been set yet.\nItem cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0054' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0054',
	'en_US',
	'W',
	'The branch No. 1 must be set if branch No. 2 is set.\nItem cd.: {1}\nBranch No. 2: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0055' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0055',
	'en_US',
	'W',
	'The branch No. 2 must be set if branch No. 3 is set.\nItem cd.: {1}\nBranch No. 3: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0056' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0056',
	'en_US',
	'W',
	'Cannot update the data access control information because there is a running processing. Wait until the processing completes, or log out and then log in again.\nLogin sequence: {1}\nServer request No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0057' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0057',
	'en_US',
	'W',
	'There are remaining records after the assignment processing.\nRemaining qty.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0058' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0058',
	'en_US',
	'W',
	'Could not acquire the main dept. of the PIC from the PIC Authority master.\nPIC cd.: {1}\nMaster application date: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0059' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0059',
	'en_US',
	'W',
	'No update authority.\ndept. cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0060' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0060',
	'en_US',
	'W',
	'No update authority.\nDistribution group cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0061' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0061',
	'en_US',
	'W',
	'No update authority.\nLocation cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0062' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0062',
	'en_US',
	'W',
	'No update authority.\nWG cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0063' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0063',
	'en_US',
	'W',
	'No update authority.\nGross allocation location group cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0106' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0106',
	'en_US',
	'W',
	'Could not acquire the system parameter information. See the setting of the System Parameter master.\nParameter key: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0107' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0107',
	'en_US',
	'E',
	'A dept. to be checked is not specified.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0108' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0108',
	'en_US',
	'E',
	'A distribution group to be checked is not specified.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0109' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0109',
	'en_US',
	'E',
	'A location to be checked is not specified.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0110' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0110',
	'en_US',
	'E',
	'A WG to be checked is not specified.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0111' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0111',
	'en_US',
	'D',
	'Skipping the currency translation processing.\nUnit price or amount: {1}\nExchange rate: {2}\nNumber of decimal places: {3}\nExchange rounding type: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0112' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0112',
	'en_US',
	'W',
	'The specified locale cd. does not exist in locale entries.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0113' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0113',
	'en_US',
	'E',
	'A gross allocation location group to be checked is not specified.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0114' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0114',
	'en_US',
	'I',
	'The batch processing has started.\nprocessing group name: {1}\nLog No.: {2}\nLogic name: {3}\nOperation name: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0115' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0115',
	'en_US',
	'I',
	'The batch processing has been completed.\nprocessing group name: {1}\nLog No.: {2}\nLogic name: {3}\nOperation name: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0116' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0116',
	'en_US',
	'W',
	'An error occurred in the batch processing.\nprocessing group name: {1}\nLog No.: {2}\nLogic name: {3}\nOperation name: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0117' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0117',
	'en_US',
	'W',
	'Could not update the allocation information because the Cost Management is not installed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0118' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0118',
	'en_US',
	'W',
	'Not entered as a valid dept. at the specified date.\nDept.: {1}\nDate: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0119' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0119',
	'en_US',
	'W',
	'The IF process type or the Executed company cd. is not set.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0120' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0120',
	'en_US',
	'W',
	'Cannot update the data because the Executed company cd. does not match.\nIF process type: {1}\nCompany cd.: {2}\nExecuted company cd.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0121' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCL0121',
	'en_US',
	'W',
	'Update processing of BI Link batch control has been failed.\nIf process type: {1}\nCompany cd.: {2}\nExecuted company cd.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0001',
	'en_US',
	'W',
	'Cannot find the information for the specified term.\nSpecified term: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0022',
	'en_US',
	'W',
	'Failed to set the value.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0023',
	'en_US',
	'W',
	'Exceeded the upper limit for the input value check.\nInput value ({1}): {2}\nUpper limit ({3}*{4}): {5}\n{6}\n{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0024',
	'en_US',
	'W',
	'Fall down the lower limit of input value check.\nInput value ({1}): {2}\nLower limit ({3}*{4}): {5}\n{6}\n{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0025',
	'en_US',
	'I',
	'{1}:{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0031' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0031',
	'en_US',
	'W',
	'A character not allowed for the item is included.\nItem: {1}\nCharacter not allowed: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0032' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0032',
	'en_US',
	'W',
	'A character not allowed for the branch No. 1 is included.\nBranch No. 1: {1}\nCharacter not allowed: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0033' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0033',
	'en_US',
	'W',
	'A character not allowed for the branch No. 2 is included.\nBranch No. 2: {1}\nCharacter not allowed: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0034' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0034',
	'en_US',
	'W',
	'While the Nth delimiter for the Item cd. is not set, one or more values are set after the branch No. N.\nBranch No. 1: {1}\nBranch No. 2: {2}\nBranch No. 3: {3}\nN: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0035' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0035',
	'en_US',
	'D',
	'Skipping the conversion processing to the base unit.\nQty.: {1}\nUnit conversion factor: {2}\nNumber of decimal places: {3}\nUnit conversion rounding type: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0036' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0036',
	'en_US',
	'D',
	'Skipping the unit conversion processing.\nBase unit qty.: {1}\nUnit conversion factor: {2}\nNumber of decimal places: {3}\nUnit conversion rounding type: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0037' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0037',
	'en_US',
	'D',
	'Skipping the unit conversion processing.\nQty.: {1}\nFactor in convert-from unit: {2}\nFactor in convert-to unit: {2}\nNumber of decimal places: {3}\nUnit conversion rounding type: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0038' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0038',
	'en_US',
	'D',
	'Skipping the conversion processing to the active ingredient unit.\nBase unit qty.: {1}\nActive ingredient coefficient: {2}\nActive ingredient number of decimal places: {3}\nRounding type (Active ingredient conversion): {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0039' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0039',
	'en_US',
	'D',
	'Skipping the conversion processing from the active ingredient unit to the base unit.\nActive ingredient: {1}\nActive ingredient coefficient: {2}\nBase unit number of decimal places: {3}\nBase unit rounding type: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0040' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0040',
	'en_US',
	'D',
	'Skipping the calculation processing of the active ingredient coefficient.\nBase unit qty.: {1}\nActive ingredient: {2}\nActive ingredient number of decimal places: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0041' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0041',
	'en_US',
	'D',
	'Skipping the currency translation processing.\nUnit price or amount: {1}\nExchange rate: {2}\nNumber of decimal places: {3}\nExchange rounding type: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0047' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0047',
	'en_US',
	'D',
	'Skipping the amount calculation processing.\nUnit price: {1}\nQty.: {2}\nNumber of decimal places: {3}\nRounding type (Amount): {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0048' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0048',
	'en_US',
	'D',
	'Skipping the unit price calculation processing.\nAmount: {1}\nQty.: {2}\nUnit price number of decimal places: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0049' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0049',
	'en_US',
	'D',
	'Skipping the tax amount calculation processing.\nAmount: {1}\nTax rate: {2}\nAmount number of decimal places: {3}\nTax amount rounding type: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0050' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0050',
	'en_US',
	'D',
	'Skipping the amount calculation in base currency processing.\nAmount: {1}\nExchange rate: {2}\nNumber of decimal places: {3}\nRounding type: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0051' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0051',
	'en_US',
	'D',
	'Skipping the unit price calculation in base currency processing.\nUnit price: {1}\nExchange rate: {2}\nNumber of decimal places: {3}\nRounding type: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0052' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0052',
	'en_US',
	'D',
	'Skipping the tax amount calculation in base currency processing.\nTax amount: {1}\nExchange rate: {2}\nNumber of decimal places: {3}\nRounding type: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0053' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0053',
	'en_US',
	'W',
	'Cannot find the term information for the specified start month.\nSpecified term start month: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0056' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0056',
	'en_US',
	'E',
	'The list of proportion targets does not exist or it has no records.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0057' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0057',
	'en_US',
	'E',
	'There is no data in the column to store assignment ratio in the list of proportion targets.\nColumn name where assignment ratio is stored: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0062' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0062',
	'en_US',
	'W',
	'There is an overlapping period in the start and end months.\nRow: {1}\nRow: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0063' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0063',
	'en_US',
	'W',
	'An overlapping period in the start and end months was found and automatically adjusted.\nRow: {1}\nRow: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0064' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0064',
	'en_US',
	'W',
	'There is an overlapping period in the start and end months.\nCould not be automatically adjusted because of the same start months.\nRow: {1}\nRow: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0067' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0067',
	'en_US',
	'W',
	'There are remaining records after the assignment processing. Remaining qty.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0068' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0068',
	'en_US',
	'W',
	'The main dept. of the login user could not be acquired from the PIC Authority master.\nMaster application date: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0069' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0069',
	'en_US',
	'W',
	'The total value exceeded the upper limit for the input value check.\nInput value ({1}): {2}\nEntered result value ({3}): {4}\nTotal value (input value + entered result value): {5}\nUpper limit ({6}*{7}): {8}\n{9}\n{10}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0070' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0070',
	'en_US',
	'W',
	'The total value fell down the lower limit for the input value check.\nInput value ({1}): {2}\nEntered result value ({3}): {4}\nTotal value (input value + entered result value): {5}\nLower limit ({6}*{7}): {8}\n{9}\n{10}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0307' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0307',
	'en_US',
	'W',
	'Specify a year in the range of {1} to {2}.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0331' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0331',
	'en_US',
	'W',
	'There is an overlapping period in the start and end dates.\nRow: {1}\nRow: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0332' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0332',
	'en_US',
	'W',
	'An overlapping period in the start and end dates was found and automatically adjusted.\nRow: {1}\nRow: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0333' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCP0333',
	'en_US',
	'W',
	'There is an overlapping period in the start and end dates. Could not be automatically adjusted because of the same start dates.\nRow: {1}\nRow: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0001',
	'en_US',
	'W',
	'A constant cannot be converted to a numeric value.\nConstant name: {1}\nSetting value: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0002',
	'en_US',
	'W',
	'It is the object name already in use.\nSetting value: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0003',
	'en_US',
	'W',
	'The string specified as a constant exceeds the precision of the specified numerical value. Constant name: {1} Setting value: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0004',
	'en_US',
	'T',
	'Changing the Sequence type of the argument.\nOld: {1}\nNew: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0005',
	'en_US',
	'W',
	'Failed to lock the Numbering Info. table.(Error code: {1})\nNumbering operation type: {2}\nNumbering pattern cd.: {3}\nElement type: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0006',
	'en_US',
	'W',
	'Failed to generate a sequence with the numbering logic. (Error code: {1})\nNumbering operation type: {2}\nNumbering pattern: {3}\nElement type: {4}\nSequence name: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0007',
	'en_US',
	'W',
	'A counter for which the automatic setting is not permitted exceeded the max. value in the Numbering Info. table.\nNumbering operation type: {1}\nNumbering pattern: {2}\nElement type: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0008',
	'en_US',
	'W',
	'Not entered in the Location master.\nLocation: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0009',
	'en_US',
	'W',
	'An exclusive processing error occurred in the Numbering Info. table.\nNumbering operation type: {1}\nNumbering pattern cd.: {2}\nElement type: {3}\nSequence type (before): {4}\nSequence type (now): {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0010',
	'en_US',
	'W',
	'An unexpected value was set for the Element type.\nNumbering operation type: {1}\nNumbering pattern: {2}\nElement type: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0011',
	'en_US',
	'W',
	'Cannot find it in the Numbering Pattern master.\nNumbering operation type: {1}\nNumbering pattern: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0012',
	'en_US',
	'W',
	'An unexpected value was set for the Sequence type.\nNumbering operation type: {1}\nNumbering pattern: {2}\nElement type: {3}\nSequence type: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0013',
	'en_US',
	'W',
	'The digits of the numbering result exceeded ones of a string for a hidden column.\nNumbering operation type: {1}\nNumbering pattern cd.: {2}\nColumn name: {3}\nJoin string 1: {4}\nJoin string 2: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0014',
	'en_US',
	'W',
	'Invalid setting value in the Numbering Info. table (min. value is larger than max. value).\nNumbering operation type: {1}\nNumbering pattern cd.: {2}\nElement type: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0015',
	'en_US',
	'W',
	'Sequence numbering processing failed (Error code: {1}\nSequence name: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0016',
	'en_US',
	'W',
	'Not entered in the Company master.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0017',
	'en_US',
	'W',
	'Failed to create a sequence.\nThe default min. value of a constant for a numbering processing needs to be less than the max. value.\nMin. value default: {1}\nMax. value default: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0018',
	'en_US',
	'W',
	'Rounding failed due to the incorrect Rounding type.\nRounding type: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0019',
	'en_US',
	'W',
	'Could not acquire any valid gradings from the Grading master.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0020',
	'en_US',
	'W',
	'For the Transaction pattern type, the transaction with the Adopt at auto could not be acquired from the Transaction master.\nTransaction pattern type: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0021',
	'en_US',
	'W',
	'Business reasons whose Constant loss is on could not be acquired from the Business Reason master.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0022',
	'en_US',
	'W',
	'The digits of the numbering result exceeded ones of the string for display.\nNumbering operation type: {1}\nNumbering pattern cd.: {2}\nColumn name: {3}\nJoin string 1: {4}\nJoin string 2: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0023',
	'en_US',
	'W',
	'Could not acquire the Currency master.\nCurrency cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0024',
	'en_US',
	'W',
	'Could not acquire the Exchange Rate master.\nExchange-from currency cd.: {1}\nExchange-to currency cd.: {2}\nExchange rate cd: {3}\nBase date: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0025',
	'en_US',
	'W',
	'As a result of an exchange rate conversion, an overflow occurred. See the input values and the setting in masters.\nAmount: {1}\nExchange rate: {2}\nConversion result: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0026',
	'en_US',
	'W',
	'Could not number because lot No. is not specified.\nNumbering operation type: {1}\nNumbering pattern cd.: {2}\nElement type: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0027' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0027',
	'en_US',
	'W',
	'Could not number because SEIBAN No. 1 is not specified.\nNumbering operation type: {1}\nNumbering pattern cd.: {2}\nElement type: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0028' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0028',
	'en_US',
	'W',
	'Could not number because SEIBAN No. 2 is not specified.\nNumbering operation type: {1}\nNumbering pattern cd.: {2}\nElement type: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0029' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0029',
	'en_US',
	'W',
	'Could not number because SEIBAN No. 3 is not specified.\nNumbering operation type: {1}\nNumbering pattern cd.: {2}\nElement type: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0030' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0030',
	'en_US',
	'W',
	'Could not number because SEIBAN No. 4 is not specified.\nNumbering operation type: {1}\nNumbering pattern cd.: {2}\nElement type: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0031' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0031',
	'en_US',
	'W',
	'Could not number because a numbering pattern is not specified.\nNumbering operation type: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0032' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0032',
	'en_US',
	'W',
	'Could not number because no value is specified for a column serving as a numbering element.\nColumn: {1}\nNumbering operation type: {2}\nNumbering pattern cd.: {3}\nElement type: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0033' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0033',
	'en_US',
	'W',
	'Could not number because no target record exists in the Item master (factory/distribution warehouse). \nNumbering operation type: {1}\nNumbering pattern cd.: {2}\nElement type: {3}\nItem: {4}\nFactory/Distribution warehouse cd.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0034' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0034',
	'en_US',
	'W',
	'Numbering cannot be done because no target record exists in the Item master.\nNumbering operation type: {1}\nNumbering pattern cd.: {2}\nElement type: {3}\nItem: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0035' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUCD0035',
	'en_US',
	'W',
	'Could not number because no target record exists in the BP master.\nNumbering operation type: {1}\nNumbering pattern cd.: {2}\nElement type: {3}\nBP cd.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDD0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDD0001',
	'en_US',
	'E',
	'MAM_ITM_UNIT is not available. Use MAVM_ITM_UNIT.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDD0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDD0002',
	'en_US',
	'E',
	'MAM_ITM_WG is not available. Use MAVM_ITM_WG.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDD0311' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDD0311',
	'en_US',
	'W',
	'Cannot find the Numbering Pattern master.\nNumbering operation type: {1}\nNumbering pattern: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0001',
	'en_US',
	'I',
	'{1}:{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0002',
	'en_US',
	'I',
	'Row number: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0003',
	'en_US',
	'W',
	'The following data already exists:\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0004',
	'en_US',
	'W',
	'Failed to update.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0005',
	'en_US',
	'W',
	'Failed to cancel.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0006',
	'en_US',
	'W',
	'Failed to delete.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0007',
	'en_US',
	'W',
	'There is no breakdown row of details associated with the header.\nInclude at least 1 row of details associated with the header.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0008',
	'en_US',
	'I',
	'No target data exists for this batch process.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0009',
	'en_US',
	'W',
	'An error has occurred. See the error details in the Batch Log Check.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0010',
	'en_US',
	'W',
	'An error has occurred during the processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0011',
	'en_US',
	'W',
	'Failed to issue.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0012',
	'en_US',
	'W',
	'There is no breakdown row of details associated with the details.\nInclude at least one row of breakdowns of details associated with the details.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0013',
	'en_US',
	'W',
	'An error has occurred in the related row.\nError row: {1}\nRelated row: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0021',
	'en_US',
	'E',
	'An argument for numbering is invalid.\nNumbering operation type: {1}\nArgument information: \n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0029' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0029',
	'en_US',
	'W',
	'There is no data to be printed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0324' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0324',
	'en_US',
	'W',
	'For a row to be entered, a record with the same start and end dates already exists.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0379' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0379',
	'en_US',
	'W',
	'The period is overlapped in the entered data.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0380' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0380',
	'en_US',
	'W',
	'The period is overlapped in the data to be entered');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0381' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0381',
	'en_US',
	'W',
	'The period is overlapped between the data to be entered and the entered data.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0382' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0382',
	'en_US',
	'W',
	'The period is overlapped (same periods) between the data to be entered and the entered data.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0401' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0401',
	'en_US',
	'E',
	'The MCList to be output to a file is not specified.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0402' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0402',
	'en_US',
	'W',
	'You do not have the download authority.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0403' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0403',
	'en_US',
	'E',
	'An output destination is specified in an unsupported file format.\nOutput destination: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0404' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0404',
	'en_US',
	'W',
	'Data exceeding the upper limit of columns in a file is specified.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0405' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0405',
	'en_US',
	'W',
	'Data exceeding the upper limit was searched. Acquiring some of them.\nUpper limit number: {1}\nNumber of searches: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0406' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0406',
	'en_US',
	'I',
	'The processing started.\nLogic ID: {1}\nOperation ID: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0407' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0407',
	'en_US',
	'I',
	'The processing ended.\nLogic ID: {1}\nOperation ID: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0408' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0408',
	'en_US',
	'W',
	'The check processing stopped because the number of errors exceeded the upper limit.\nUpper limit number: {1}\nNumber of errors: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0409' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0409',
	'en_US',
	'I',
	'{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0410' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0410',
	'en_US',
	'W',
	'Many errors have occurred. See the error details on the Batch Log Check screen.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0411' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0411',
	'en_US',
	'W',
	'You do not have the update authority for the specified Company cd.\nCompany cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0412' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0412',
	'en_US',
	'W',
	'The specified External system cd. does not exist.\nExternal system cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0413' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0413',
	'en_US',
	'W',
	'The External system type of the specified External system cd. is invalid.\nExternal system cd.: {1}\nExternal system type: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0414' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0414',
	'en_US',
	'W',
	'You cannot execute the processing since the batch processing is currently running. \nIF process type: {1}\nCompany cd.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0415' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDL0415',
	'en_US',
	'W',
	'Cannot create a DB container.\nClass: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0001',
	'en_US',
	'I',
	'Executing the processing ({1}). Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0002',
	'en_US',
	'I',
	'The processing ({1}) completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0003',
	'en_US',
	'W',
	'The processing ({1}) failed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0004',
	'en_US',
	'W',
	'Could not access to the file.\nThe file does not exist.\nFile name: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0005',
	'en_US',
	'I',
	'The check processing before updating completed.\nExecute the update processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0006',
	'en_US',
	'W',
	'Could not execute the check processing before updating.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0007',
	'en_US',
	'W',
	'Data of the previous rev. cannot be changed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0008',
	'en_US',
	'E',
	'The Search type was specified which does not allow starting the input assist screen.\nSearch type: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0009',
	'en_US',
	'W',
	'The canceled data cannot be changed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0010',
	'en_US',
	'W',
	'If a common column is to be entered, the following column cannot be specified:\nColumn: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0012',
	'en_US',
	'W',
	'Failed to enter.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0013',
	'en_US',
	'W',
	'The following data already exists:\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0014',
	'en_US',
	'W',
	'The following data is used in "{1}":\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0038' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0038',
	'en_US',
	'W',
	'Select data for the processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0039' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0039',
	'en_US',
	'E',
	'Type conversion error.\nThe argument must be specified with a substitution-compatible Row class that is contained in the list corresponding to a return value of getCheckedRowListBlock(). \nRow class that is contained in the list corresponding to a return value of getCheckedRowListBlock(): {1}\nClass specified by the argument: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0068' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0068',
	'en_US',
	'D',
	'Starting checkInvisibleRowInUpParam.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0069' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0069',
	'en_US',
	'D',
	'checkInvisibleRowInUpParam completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0087' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0087',
	'en_US',
	'W',
	'Cannot acquire the company.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0092' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0092',
	'en_US',
	'W',
	'The following data does not exist in "{1}". The master has been changed or deleted.\nValue: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0093' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0093',
	'en_US',
	'I',
	'Received a message below: Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0094' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0094',
	'en_US',
	'W',
	'No update authority.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0095' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0095',
	'en_US',
	'W',
	'No update authority.\nRow: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0098' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0098',
	'en_US',
	'I',
	'Executing the cancel process. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0099' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0099',
	'en_US',
	'I',
	'Canceled.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0100' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0100',
	'en_US',
	'W',
	'Failed to cancel.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0106' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0106',
	'en_US',
	'D',
	'Starting clear.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0107' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0107',
	'en_US',
	'D',
	'Finished clear.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0108' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0108',
	'en_US',
	'D',
	'Starting beforeCallParts.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0109' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0109',
	'en_US',
	'D',
	'Finished beforeCallParts.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0110' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0110',
	'en_US',
	'D',
	'Starting setupParam.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0111' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0111',
	'en_US',
	'D',
	'Finished setupParam.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0112' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0112',
	'en_US',
	'D',
	'Starting beforeCall.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0113' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0113',
	'en_US',
	'D',
	'Finished beforeCall.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0114' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0114',
	'en_US',
	'D',
	'Starting setLimitParamSize.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0115' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0115',
	'en_US',
	'D',
	'Finished setLimitParamSize.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0118' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0118',
	'en_US',
	'D',
	'Starting call.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0119' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0119',
	'en_US',
	'D',
	'Finished call.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0120' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0120',
	'en_US',
	'D',
	'Starting handleMCEx.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0121' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0121',
	'en_US',
	'D',
	'Starting setModeNoDown.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0122' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0122',
	'en_US',
	'D',
	'Finished setModeNoDown.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0123' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0123',
	'en_US',
	'D',
	'Starting moveFocusNoDown.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0124' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0124',
	'en_US',
	'D',
	'Finished moveFocusNoDown.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0125' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0125',
	'en_US',
	'D',
	'Starting afterCapError.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0126' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0126',
	'en_US',
	'D',
	'Finished afterCapError.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0127' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0127',
	'en_US',
	'D',
	'Starting afterCall.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0128' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0128',
	'en_US',
	'D',
	'Finished afterCall.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0129' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0129',
	'en_US',
	'D',
	'Starting show.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0130' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0130',
	'en_US',
	'D',
	'Finished show.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0131' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0131',
	'en_US',
	'D',
	'Starting adjustList.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0132' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0132',
	'en_US',
	'D',
	'Finished adjustList.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0133' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0133',
	'en_US',
	'D',
	'Starting setMode.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0134' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0134',
	'en_US',
	'D',
	'Finished setMode.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0135' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0135',
	'en_US',
	'D',
	'Starting moveFocus.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0136' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0136',
	'en_US',
	'D',
	'Finished moveFocus.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0137' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0137',
	'en_US',
	'D',
	'Starting showMsg.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0138' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0138',
	'en_US',
	'D',
	'Finished showMsg.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0139' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0139',
	'en_US',
	'D',
	'Starting print.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0140' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0140',
	'en_US',
	'D',
	'Finished print.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0141' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0141',
	'en_US',
	'D',
	'Starting resultSuccess.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0142' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0142',
	'en_US',
	'D',
	'Finished resultSuccess.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0143' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0143',
	'en_US',
	'D',
	'Starting setModeNoDown.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0144' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0144',
	'en_US',
	'D',
	'Finished setModeNoDown.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0145' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0145',
	'en_US',
	'D',
	'Starting moveFocusNoDown.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0146' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0146',
	'en_US',
	'D',
	'Finished moveFocusNoDown.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0147' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0147',
	'en_US',
	'D',
	'Starting showNoDownDataMsg.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0148' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0148',
	'en_US',
	'D',
	'Finished showNoDownDataMsg.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0149' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0149',
	'en_US',
	'D',
	'Starting resultNoDataFound.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0150' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0150',
	'en_US',
	'D',
	'Finished resultNoDataFound.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0155' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0155',
	'en_US',
	'D',
	'Starting afterCallParts.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0156' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0156',
	'en_US',
	'D',
	'Finished afterCallParts.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0157' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0157',
	'en_US',
	'D',
	'Starting sort.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0158' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0158',
	'en_US',
	'D',
	'Finished sort.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0159' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0159',
	'en_US',
	'D',
	'Starting showMerge.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0160' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0160',
	'en_US',
	'D',
	'Finished showMerge.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0161' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0161',
	'en_US',
	'W',
	'Specify a number other than 0.\nColumn: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0162' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0162',
	'en_US',
	'W',
	'Specify a number other than 0.\nColumn: {1}\nRow: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0164' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0164',
	'en_US',
	'D',
	'Starting showCanceledMsg.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0165' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0165',
	'en_US',
	'D',
	'Finished showCanceledMsg.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0166' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0166',
	'en_US',
	'D',
	'Starting checkLimitULSize.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0167' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0167',
	'en_US',
	'D',
	'Finished checkLimitULSize.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0168' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0168',
	'en_US',
	'I',
	'Executing approval process. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0169' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0169',
	'en_US',
	'I',
	'Approval process has been executed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0170' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0170',
	'en_US',
	'I',
	'Executing approval cancellation process. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0171' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0171',
	'en_US',
	'I',
	'Approval cancellation process has been executed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0172' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0172',
	'en_US',
	'I',
	'Executing decision process. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0173' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0173',
	'en_US',
	'I',
	'Decision process has been executed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0174' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0174',
	'en_US',
	'I',
	'Executing cancel decision process. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0175' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0175',
	'en_US',
	'I',
	'Cancel decision process has been executed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0176' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0176',
	'en_US',
	'I',
	'Executing rejection cancellation process. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0177' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0177',
	'en_US',
	'I',
	'Rejection cancellation process has been executed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0311' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0311',
	'en_US',
	'W',
	'An end year cannot be specified as a year smaller than a start year.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0321' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0321',
	'en_US',
	'W',
	'Specify a year in the range of {1} to {2}.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0372' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0372',
	'en_US',
	'W',
	'Correction failed because a record in the same period was already entered.\nSearch again to check.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0373' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0373',
	'en_US',
	'W',
	'The applicable period of the entered row has been corrected because it is overlapping with the counterpart of the row to be entered.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0374' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0374',
	'en_US',
	'W',
	'A record with a overlapping period was found between entered rows. Correct the applicable period.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0375' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0375',
	'en_US',
	'I',
	'No data with an overlapping period to be corrected was found.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0376' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0376',
	'en_US',
	'I',
	'Do you want to correct the overlapping period?');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0377' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0377',
	'en_US',
	'I',
	'Overlapping period correction was executed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0401' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0401',
	'en_US',
	'I',
	'Starting the download. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0402' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0402',
	'en_US',
	'I',
	'Executing the download in the background.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0403' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0403',
	'en_US',
	'I',
	'Cancel a waiting download and continue the process?\nTarget: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0404' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0404',
	'en_US',
	'I',
	'The download is completed.\nTarget: {1}\nOutput destination: {2}\nFile name: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0405' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0405',
	'en_US',
	'W',
	'The specified output description directory is an invalid path.\nDirectory: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0406' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0406',
	'en_US',
	'I',
	'Data exceeding the upper limit was searched. Some of them are shown on the screen. Do you want to acquire all the data as a file?\nUpper limit number: {1}\nNumber of searches: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0407' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0407',
	'en_US',
	'I',
	'Data exceeding the upper limit was searched. Some of them are shown on the screen.\nUpper limit number: {1}\nNumber of searches: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0408' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0408',
	'en_US',
	'W',
	'Failed to download.\nIf the specified file is open, close it before downloading it.\nSpecified file: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0409' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0409',
	'en_US',
	'I',
	'Row number: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0410' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0410',
	'en_US',
	'W',
	'Specify a date range so that it is within {1} days.');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0411' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MAUDP0411',
	'en_US',
	'W',
	'Specify a year month range so that it is within {1} months.');
