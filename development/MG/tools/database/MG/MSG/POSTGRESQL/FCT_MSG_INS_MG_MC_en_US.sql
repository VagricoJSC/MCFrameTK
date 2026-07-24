DELETE FROM FCT_MSG WHERE MSGID = 'MGBAD0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBAD0001',
	'en_US',
	'W',
	'Not entered as the Simulation No. for general purpose simulation.\nSimulation No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBAD0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBAD0002',
	'en_US',
	'W',
	'Not entered as a valid item in the Item master.\nItem: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBAD0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBAD0003',
	'en_US',
	'W',
	'Since the item is not entered as an asset management item in the Item master, it is not imported.\nItem: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBAD0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBAD0004',
	'en_US',
	'W',
	'Not entered as a valid location in the Location master.\nLocation cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBAD0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBAD0005',
	'en_US',
	'W',
	'Not entered as a valid BP in the BP master.\nSupplier cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBAD0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBAD0006',
	'en_US',
	'W',
	'Not entered as a valid BP in the BP master.\nCustomer cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBAD0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBAD0007',
	'en_US',
	'W',
	'Not entered as a valid BP in the BP master.\nDelivery destination cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBAD0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBAD0008',
	'en_US',
	'W',
	'Not entered as a valid BP in the BP master.\nDistribution channel cd. 1: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBAD0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBAD0009',
	'en_US',
	'W',
	'Not entered as a valid BP in the BP master.\nDistribution channel cd. 2: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBAD0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBAD0010',
	'en_US',
	'W',
	'Not entered as a valid BP in the BP master.\nDistribution channel cd. 3: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBP0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBP0004',
	'en_US',
	'W',
	'Copy source data and copy destination data are the same. Specify a different calculation group or the year and month.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBL0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBL0001',
	'en_US',
	'W',
	'Cannot enter since the total amount of the cost elements is 0.\nMake sure that the total amount is other than 0.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBL0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBL0002',
	'en_US',
	'W',
	'The following columns can be specified only if an item not subject to asset management is selected.\nColumn: Allocation location cd., Allocation operation cd., Allocation item category cd.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBL0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBL0003',
	'en_US',
	'W',
	'Cannot update the order information since no SCM module has been installed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBL0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBL0004',
	'en_US',
	'W',
	'Cannot check the data to be imported since no SCM module has been installed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBL0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBL0022',
	'en_US',
	'W',
	'Copy source data and copy destination data are the same. Specify a different calculation group or the year and month.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBL0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBL0023',
	'en_US',
	'W',
	'If a manufacturing result group is specified, the following columns cannot be specified.\nColumn: Dept. cd., Item category cd., Location cd., Operation cd., Lot No., Sublot No., SEIBAN No.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBL0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBL0024',
	'en_US',
	'W',
	'Repurchase obligation can be selected only for the own assets inventory for which BP is set.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBL0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBL0025',
	'en_US',
	'W',
	'Cannot enter since the total amount of the cost elements is 0.\nMake sure that the total amount is other than 0.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBL0026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBL0026',
	'en_US',
	'W',
	'Cannot process since the cost calculation result for this month has already been firmed.\nCalculation category cd.: {1}\nWG cd.: {2}\nYear month: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0001',
	'en_US',
	'W',
	'Several calculation groups and months are specified.\nEvaluation change process can process only one calculation group and month.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0002',
	'en_US',
	'W',
	'None of the standard unit costs in the calculation categories set for items in the group to be calculated are firmed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0003',
	'en_US',
	'W',
	'Cannot process since there are items for which the standard cost is not firmed.\nSee the log screen.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0004',
	'en_US',
	'W',
	'Cannot process since target data is under revaluation process.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0005',
	'en_US',
	'W',
	'Not entered in the Inventory Revaluation master.\nInventory revaluation cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0006',
	'en_US',
	'W',
	'Cannot perform the processing for the data to be evaluated by the evaluation rate.\nInventory revaluation cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0007',
	'en_US',
	'W',
	'Cannot process since the Unit price setting type is not specified.\nInventory revaluation cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0008',
	'en_US',
	'W',
	'Not entered in the Cost Dept. master.\nTable: {1}\nDept. cd.: {2}\nTerm: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0009',
	'en_US',
	'W',
	'Not entered in the BP master.\nTable: {1}\nBP master: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0010',
	'en_US',
	'W',
	'Not entered in the Location master.\nTable: {1}\nLocation cd.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0011',
	'en_US',
	'W',
	'Not entered in the Item master.\nTable: {1}\nItem: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0012',
	'en_US',
	'W',
	'An error has occurred while checking masters. {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0013',
	'en_US',
	'W',
	'Cannot set the transfer ratio since the unit price could not be acquired from the Standard Unit Cost master.\nWG cd.: {1}\nItem: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0014',
	'en_US',
	'W',
	'According to the setting of the Expenses Allocation Transfer master, the purchase result should be transferred to the allocation expense result. However, the data cannot be transferred since the transfer destination has already been processed.\nTarget: {1}\nCalculation category cd.: {2}\nTransfer destination WG cd.: {3}\nWG cd.: {4}\nYear month: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0016',
	'en_US',
	'W',
	'Cannot transfer to the input since none of the corresponding input result exists. If the allocation account is set in the GR/GI Result Transfer master, allocation transfer processing is performed.\nGR/GI result ID: {1}\nItem: {2}\nDept. cd.: {3}\nQty.: {4}\nAllocation account cd.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0017',
	'en_US',
	'W',
	'Failed to acquire the target dept. required by importing processing of GR/GI results.\nSlip No.: {1}\nSlip sequence: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0018',
	'en_US',
	'W',
	'Failed to acquire the target WG required by importing processing of GR/GI results.\nSlip No.: {1}\nSlip sequence number: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0019',
	'en_US',
	'W',
	'According to the setting of the Expenses Allocation Transfer master,\nthe purchase result should be transferred to the allocable expense result. However, the data cannot be transferred since the allocable expense result has already been firmed.\nTarget: {1}\nCalculation group cd.: {2}\nCalculation category cd.: {3}\nTransfer destination WG cd.: {4}\nWG cd.: {5}\nYear month: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0020',
	'en_US',
	'I',
	'Failed to acquire the target WG required by importing processing of GR/GI results. Cannot import the records.\nNot import the record.\nSlip No.: {1}\nSlip sequence number: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0022',
	'en_US',
	'I',
	'The number of GR/GI results imported: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0023',
	'en_US',
	'I',
	'The number of man-hour info. imported: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0024',
	'en_US',
	'I',
	'The number of WIP info. imported: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0025',
	'en_US',
	'I',
	'The number of inventory info. imported: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0026',
	'en_US',
	'I',
	'The number of item mfg. order info. created: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0027' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0027',
	'en_US',
	'I',
	'The number of order operation info. created: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0028' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0028',
	'en_US',
	'I',
	'The number of Mfg. Result IF created: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0029' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0029',
	'en_US',
	'I',
	'The number of Purchase Result IF created: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0030' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0030',
	'en_US',
	'I',
	'The number of Input Result IF created: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0031' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0031',
	'en_US',
	'I',
	'The number of GR/GI Result IF created: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0032' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0032',
	'en_US',
	'I',
	'The number of Sales Result IF created: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0033' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0033',
	'en_US',
	'I',
	'The number of Order Direct Man-Hour Result IF created: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0034' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0034',
	'en_US',
	'I',
	'The number of Indirect Man-Hour Result IF created: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0035' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0035',
	'en_US',
	'I',
	'The number of Inventory Result IF created: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0036' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0036',
	'en_US',
	'I',
	'The number of In Process Order Result IF created: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0037' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0037',
	'en_US',
	'I',
	'Starting the GR/GI result import processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0038' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0038',
	'en_US',
	'I',
	'Starting the man-hour information import processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0039' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0039',
	'en_US',
	'I',
	'Starting the WIP information import processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0040' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0040',
	'en_US',
	'I',
	'Starting the inventory information import processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0041' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0041',
	'en_US',
	'W',
	'Cannot create the cost by cost element since the latest weighted average unit price cannot be acquired.\nCalculation group cd.: {1}\nYear month: {2}\nWG cd.: {3}\nManagement dept. cd.: {4}\nItem: {5}\nLot No.: {6}\nSublot No.: {7}\nSEIBAN No.: {8}\nAsset type: {9}\nResult ID: {10}\nResult ID branch No.: {11}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0042' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0042',
	'en_US',
	'I',
	'Cannot create the cost by cost element since the latest weighted average unit price cannot be acquired.\nEvaluate on standard unit cost.\nCalculation group cd.: {1}\nYear month: {2}\nWG cd.: {3}\nManagement department cd.: {4}\nItem: {5}\nLot No.: {6}\nSublot No.: {7}\nSEIBAN No.: {8}\nAsset type: {9}\nResult ID: {10}\nResult ID branch No.: {11}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0043' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0043',
	'en_US',
	'W',
	'There is data whose calculation category, WG, or month is different from the one in the data to be entered.\nDelete the data of the calculation category, WG, or month.\nCalculation category cd.: {1}\nWG cd.: {2}\nYear month: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0044' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0044',
	'en_US',
	'I',
	'An item whose asset is not managed is entered for the target Accounting slip type. It will not be imported.\nItem: {1}\nAccounting slip type: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0045' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0045',
	'en_US',
	'I',
	'A parent/charged item whose asset is not managed is entered for the target Accounting slip type. It will not be imported.\nParent/charged item: {1}\nAccounting slip type: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0046' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0046',
	'en_US',
	'W',
	'A parent/charged item is entered in the Not Costing Item master. Since this item is will not be imported, a child item will not be issued.\nTable: {1}\nParent/charged item: {2}\nItem: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0047' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0047',
	'en_US',
	'W',
	'The parent/charged item is not entered in the Item master. Since this item is will not be imported, a child item will not be issued.\nTable: {1}\nParent/charged item: {2}\nItem: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0048' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0048',
	'en_US',
	'W',
	'Cannot transfer to input since none of the corresponding cost BOM info. exists.\nGR/GI result ID: {1}\nMfg. result group: {2}\nInventory company cd.: {3}\nItem: {4}\nQty.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0049' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0049',
	'en_US',
	'W',
	'Cannot transfer to order man-hour since none of the corresponding cost item man-hour info. exists.\nIndirect man-hour result ID: {1}\nMfg. result group: {2}\nWork element cd.: {3}\nMan-hour: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0050' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0050',
	'en_US',
	'W',
	'Cannot transfer to input since none of the corresponding Mfg. Result IF exists.\nGR/GI result ID: {1}\nMfg. result group: {2}\nInventory company cd.: {3}\nItem: {4}\nQty.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0051' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0051',
	'en_US',
	'W',
	'Cannot transfer to order man-hour since none of the corresponding Mfg. Result IF exists.\nIndirect man-hour result ID: {1}\nMfg. result group: {2}\nWork element cd.: {3}\nMan-hour: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0052' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0052',
	'en_US',
	'I',
	'Since all amounts by cost element calculated from the latest firmed weighted average unit price are 0, it is evaluated as 0.\nCalculation group cd.: {1}\nYear month: {2}\nWG cd.: {3}\nManagement dept. cd.: {4}\nItem: {5}\nLot No.: {6}\nSublot No.: {7}\nSEIBAN No.: {8}\nAsset type: {9}\nResult ID: {10}\nResult ID branch No.: {11}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDP0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDP0001',
	'en_US',
	'W',
	'Specify a different calculation category for the calculation category (Copy from) and (Copy to).');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDP0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDP0002',
	'en_US',
	'W',
	'Specify a different term for the term (Copy from) and (Copy to).');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDP0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDP0004',
	'en_US',
	'W',
	'Specify a different value for the calculation category (Copy from) and (Copy to), or the month (Copy from) and (Copy to).');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDP0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDP0005',
	'en_US',
	'W',
	'Specify only one Calculation No. to carry over unallocated amount.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDP0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDP0006',
	'en_US',
	'W',
	'Specify different items for parent and child items.\nItem: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDP0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDP0007',
	'en_US',
	'W',
	'This will delete a record that cannot be deleted or that have been firmed. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0001',
	'en_US',
	'W',
	'The cost calculation engine did not run properly.\nCalculation group cd.: {1}\nCalculation No.: {2}\n{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0002',
	'en_US',
	'W',
	'An error has occurred during the cost calculation related process.\nCalculation group cd.: {1}\nCalculation No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0003',
	'en_US',
	'I',
	'The cost calculation engine completed successfully.\nCalculation group cd.: {1}\nCalculation No.: {2}\n{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0004',
	'en_US',
	'W',
	'Cannot apply since the calculation source record has been updated.\nRe-calculate it first.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0005',
	'en_US',
	'W',
	'The processing stopped since the data to be applied has already been processed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0006',
	'en_US',
	'W',
	'There is no record to be cancelled under specified condition.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0007',
	'en_US',
	'W',
	'Cannot apply since the standard allocation rate to be updated has already been firmed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0008',
	'en_US',
	'W',
	'Cannot enter since the same user is calculating using the same calculation group.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0009',
	'en_US',
	'W',
	'Cannot copy since there is data whose standard allocation rate has been firmed in the copy destination.\nTarget: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0010',
	'en_US',
	'W',
	'Cannot copy since there is data whose standard unit cost has been firmed in the copy destination.\nTarget: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0012',
	'en_US',
	'W',
	'There is data which has already been processed in the allocable expense data used for the departmental allocation calculation. Cancel the processed data.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0013',
	'en_US',
	'W',
	'The processing stopped since data of carry-over destination has already been processed.\nWG cd.: {1}\nYear month: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0014',
	'en_US',
	'W',
	'Carried-over data contains data having been carried over from other calculation result. Cancel data having been carried over.\nWG cd.: {1}\nYear month: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0015',
	'en_US',
	'W',
	'Only if a location in the company (a location where a supplier is not set for in the Location master)\nis specified as the location, a value other than 1 can be set to the yield mfg. qty.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0016',
	'en_US',
	'W',
	'Only if a location in the company (a location where a supplier is not set for in the Location master)\nis specified as the location, a value other than 1 can be specified to the ideal mfg. qty.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0019',
	'en_US',
	'W',
	'Cannot delete the row.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0020',
	'en_US',
	'W',
	'If the location is specified, the BOM pattern is required.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0021',
	'en_US',
	'W',
	'Cannot enter or delete since the standard unit cost which uses the target data has been firmed.\nTerm: {1}\nCalculation category cd.: {2}\nWG cd.: {3}\nItem: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0022',
	'en_US',
	'W',
	'Multiprocessing is not available for the cost calculation information which has the same calculation group and month.\nCalculation group cd.: {1}\nYear month: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0023',
	'en_US',
	'W',
	'Cannot delete since the standard unit cost of the item to be deleted has been firmed.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0024',
	'en_US',
	'I',
	'The cost calculation processing started.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0025',
	'en_US',
	'I',
	'The cost calculation processing completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0026',
	'en_US',
	'W',
	'If a location is specified, no allocation dept. can be specified.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0027' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0027',
	'en_US',
	'W',
	'Cannot correct since the standard allocation rate has been firmed.\nTerm: {1}\nCalculation category cd.: {2}\nWG cd.: {3}\nAllocation account cd: {4}\nDept. cd.: {5}\nLocation cd.: {6}\nOperation cd.: {7}\nBP cd.: {8}\nItem category cd.: {9}\nItem: {10}\n{11}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0028' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0028',
	'en_US',
	'W',
	'Cannot correct since the exchange rate has been firmed.\nTerm: {1}\nExchange-from currency cd.: {2}\nExchange-to currency cd.: {3}\nExchange rate cd.: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0029' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0029',
	'en_US',
	'W',
	'Select the first month for the calculation from the following:\n{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0030' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0030',
	'en_US',
	'W',
	'Select the last month for the calculation from the following:\n{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0031' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0031',
	'en_US',
	'W',
	'If an item not for asset management is specified, "3. Self supply" can only be specified as the Supply type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0032' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0032',
	'en_US',
	'W',
	'If an item not for asset management is specified, no location can be specified.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0033' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0033',
	'en_US',
	'W',
	'The following can be specified only if a location is specified.\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0034' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0034',
	'en_US',
	'W',
	'Only if a location in the company (a location where a supplier is not set in the Location master) is specified as a location, the following columns can be specified.\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0035' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0035',
	'en_US',
	'W',
	'Specify a different calculation category for calculation category (Copy from) and (Copy to).');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0036' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0036',
	'en_US',
	'W',
	'Specify a different term for term (Copy from) and (Copy to).');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0037' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0037',
	'en_US',
	'W',
	'Specify a different value for calculation category (Copy from) and (Copy to), or month (Copy from) and (Copy to).');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0038' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0038',
	'en_US',
	'W',
	'Cannot import since the item in the Item Details master to be imported is not entered in the Item master, or the Calculation pattern in the Item master is not set.\nItem: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0039' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0039',
	'en_US',
	'W',
	'There is no calculation run pattern configuration to be executed.\nCalculation run pattern cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0040' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0040',
	'en_US',
	'I',
	'A record containing a dept. which does not exist in the Cost Dept. master has been copied.\nTarget: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0041' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0041',
	'en_US',
	'W',
	'If the operation pattern is specified, the operation is required.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0042' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0042',
	'en_US',
	'W',
	'If the operation pattern is specified, the operation sequence number is required.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0043' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0043',
	'en_US',
	'W',
	'Cannot enter since the standard unit cost has been firmed.\nTerm: {1}\nItem: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0044' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0044',
	'en_US',
	'W',
	'The same value cannot be specified in the parent and child items.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0045' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0045',
	'en_US',
	'W',
	'The specified BOM pattern has already been entered. Change the operation category to "Modify" before searching.\nCalculation category: {1}\nWG: {2}\nTerm: {3}\nParent Item: {4}\nBOM pattern: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0046' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0046',
	'en_US',
	'W',
	'Cannot be entered since the WG is different from the WG for the location.\nWG cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0047' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0047',
	'en_US',
	'W',
	'Specify different items for parent and child items.\nItem: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0048' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0048',
	'en_US',
	'W',
	'Cannot be entered since the parent and child items have the same value.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0049' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0049',
	'en_US',
	'W',
	'The following data already exists.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0050' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0050',
	'en_US',
	'I',
	'Starting the import target creation process (Item details).');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0051' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0051',
	'en_US',
	'I',
	'Ending the import target creation process (Item details).');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0052' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0052',
	'en_US',
	'I',
	'Starting the import target creation process (Item operation).');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0053' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0053',
	'en_US',
	'I',
	'Ending the import target creation process (Item operation).');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0054' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0054',
	'en_US',
	'I',
	'Starting the import target creation process (BOM).');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0055' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0055',
	'en_US',
	'I',
	'Ending the import target creation process (BOM).');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0056' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0056',
	'en_US',
	'I',
	'Starting the import target creation process (Item man-hour).');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0057' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0057',
	'en_US',
	'I',
	'Ending the import target creation process (Item man-hour).');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0058' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0058',
	'en_US',
	'I',
	'Starting the import target creation process (Purchase unit price).');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0059' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0059',
	'en_US',
	'I',
	'Ending the import target creation process (Purchase unit price).');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0060' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0060',
	'en_US',
	'I',
	'Starting the import target creation process (Processing unit price).');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0061' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0061',
	'en_US',
	'I',
	'Ending the import target creation process (Processing unit price).');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0062' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0062',
	'en_US',
	'I',
	'Starting the import target creation process (Supply unit price).');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0063' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0063',
	'en_US',
	'I',
	'Ending the import target creation process (Supply unit price).');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0064' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0064',
	'en_US',
	'I',
	'Starting the import target creation process (Sales unit price).');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0065' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0065',
	'en_US',
	'I',
	'Ending the import target creation process (Sales unit price).');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0066' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0066',
	'en_US',
	'I',
	'Starting the cost calculation engine processing.\nCalculation group cd.: {1}\nCost calculation No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0067' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0067',
	'en_US',
	'I',
	'The cost calculation engine processing completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0068' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0068',
	'en_US',
	'W',
	'Cannot import since the child item in the BOM master to be imported is not entered in the Item master, or the calculation pattern is not set in the Item master.\nItem: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0069' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0069',
	'en_US',
	'W',
	'No import data meets the condition.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0070' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0070',
	'en_US',
	'W',
	'Cannot import since the calculation pattern of the item to be imported is not set in the Item master.\nItem: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0071' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0071',
	'en_US',
	'W',
	'Specify a value different from the WG in the requested WG.\nWG cd.: {1}\nRequested WG cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0001',
	'en_US',
	'W',
	'The processing stopped since the number of calculation result records exceeds the maximum number of departmental allocation records. \nThe number of calculation result records: {1}\nThe max. number of departmental allocation records: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0002',
	'en_US',
	'I',
	'The processing stopped since the maximum hierarchy of departmental allocation is exceeded.\nThe max. hierarchy of departmental allocation: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0003',
	'en_US',
	'W',
	'Cannot allocate since there is no Departmental Alloc. Basis Selection master.\nWG cd.: {1}\nDepartment cd.: {2}\nAllocation account cd.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0004',
	'en_US',
	'W',
	'Cannot allocate since a valid allocation destination does not exist for the Departmental allocation basis cd.\nSee the setting of the departmental alloc. fixed ratio and the setting of the Departmental Alloc. Destination Dept. master.\nTerm: {1}\nDepartmental alloc. basis cd.: {2}\nWG cd.: {3}\nAllocation source dept. cd.: {4}\nAllocation destination department pattern: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0005',
	'en_US',
	'W',
	'Cannot allocate since the total value of data to be allocated is 0.\nSee the setting of the departmental alloc. fixed ratio and the setting of the Departmental Alloc. Destination Dept. master.\nTerm: {1}\nDepartmental alloc. basis: {2}\nWG: {3}\nAllocation source dept.: {4}\nAllocation destination department pattern: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0006',
	'en_US',
	'W',
	'Cannot allocate since a valid allocation destination does not exist for the Departmental alloc. basis cd.\nSee the setting of the departmental alloc. fixed ratio and the setting of the Departmental Alloc. Destination Dept. master.\nYear month: {1}\nDepartmental alloc. basis cd.: {2}\nWG cd.: {3}\nAllocation source dept.: {4}\nAllocated destination department pattern: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0007',
	'en_US',
	'W',
	'Cannot allocate since the total value of data to be allocated is 0.\nSee the setting of the departmental alloc. variable ratio and the setting of the Departmental Alloc. Destination Dept. master.\nYear month: {1}\nDepartmental alloc. basis cd.: {2}\nWG cd.: {3}\nAllocation source dept.: {4}\nAllocated destination department pattern: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0008',
	'en_US',
	'I',
	'Target number\nTable: {1}\nNumber of rows: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0009',
	'en_US',
	'W',
	'The same user cannot perform multiple cost calculation processes simultaneously for the same calculation group.\nCalculation group cd.: {1}\nPIC: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0010',
	'en_US',
	'W',
	'There are records in which the departmental alloc. calculation result is reflected or the unallocated amount is carried over. Cannot be deleted.\nCalculation group cd.: {1}\nCalculation No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0011',
	'en_US',
	'W',
	'There are records in which the standard allocation rate has been firmed. Cannot be deleted.\nCalculation group cd.: {1}\nCalculation No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0013',
	'en_US',
	'W',
	'Cannot delete since there are records which has been journalized.\nCalculation group cd.: {1}\nYear month {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0014',
	'en_US',
	'W',
	'No valid record is entered in the Cost Accounting Slip Type Journal master.\nCalculation group cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0015',
	'en_US',
	'I',
	'The number of data for sending: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0016',
	'en_US',
	'W',
	'No valid record is entered in the Accounting Dept. master.\nAccounting dept. cd.: {1}\nApplication date: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0017',
	'en_US',
	'W',
	'In the Calculation Group master, an uncalculated group which is in the same calculation sequence group and has the smaller calculation sequence number exists.\nCalculation group cd.: {1}\nComputation sequence group: {2}\nCalculation sequence: {3}\nPriority calculation group cd.: {4}\nPriority calculation sequence: {5}\nYear month: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0018',
	'en_US',
	'W',
	'Cannot process since the calculation result of the acquisition source data has not been firmed.\nFirm the calculation result whose calculation sequence number is smaller.\nAcquisition calculation group cd.: {1}\nAcquisition calculation No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0019',
	'en_US',
	'W',
	'Cannot process since the calculation result of linkage destination has already been firmed.\nCancel the firmed calculation result whose calculation sequence number is larger.\nLink-to calculation group cd.: {1}\nLink-to calculation No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0020',
	'en_US',
	'W',
	'The processing stopped since a loop occurred in the departmental alloc. calculation.\nTop sequence number: {1}\nLoop sequence number 1: {2}\nLoop sequence number 2: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0021',
	'en_US',
	'W',
	'The processing stopped since the maximum hierarchy of departmental allocation is exceeded.\nDepartmental alloc. max. hierarchy: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0022',
	'en_US',
	'I',
	'Data that affects the firmed standard unit cost is included. The data will not be imported, and deleted from import target.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0023',
	'en_US',
	'W',
	'Not entered as a valid item in the Item master.\nItem: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0024',
	'en_US',
	'W',
	'Not entered as an item for asset management in the Item master. Not be imported.\nItem: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0025',
	'en_US',
	'W',
	'Not entered as a valid location in the Location master.\nLocation cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0026',
	'en_US',
	'W',
	'Not entered as a valid BP in the BP master.\nBP cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0027' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0027',
	'en_US',
	'W',
	'Cannot set a location to an item not for asset management.\nItem: {1}\nLocation cd.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0028' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0028',
	'en_US',
	'W',
	'Specify only one of the following: a location, a supplier, or a requested WG.\nItem: {1}\nLocation cd.: {2}\nSupplier cd.: {3}\nRequested WG cd.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0029' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0029',
	'en_US',
	'W',
	'The following columns will be required if the operation control unit is specified: Operation management unit, Operation base unit qty., Operation conversion unit qty., Significant digit in decimal places, and Rounding type (Conversion)\nItem: {1}\nWG cd.: {2}\nTerm: {3}\nCalculation category cd.: {4}\nOperation management unit cd.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0030' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0030',
	'en_US',
	'W',
	'Specify a positive number in the operation base unit qty.\nItem: {1}\nWG cd.: {2}\nTerm: {3}\nCalculation category cd.: {4}\nOperation management unit cd.: {5}\nOperation base unit quantity: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0031' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0031',
	'en_US',
	'W',
	'Specify a value of 0 or higher in the operation conversion unit qty.\nItem: {1}\nWG cd.: {2}\nTerm: {3}\nCalculation category cd.: {4}\nOperation management unit cd.: {5}\nOperation conversion unit qty.: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0032' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0032',
	'en_US',
	'W',
	'Specify an integer between 0 and 8 as the significant digits in the decimal places.\nItem: {1}\nWG cd.: {2}\nTerm: {3}\nCalculation category cd.: {4}\nOperation management unit cd.: {5}\nSignificant digits in decimal places: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0033' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0033',
	'en_US',
	'W',
	'Specify different items for the parent and child items.\nItem: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0034' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0034',
	'en_US',
	'W',
	'When specifying an alternative group, specify the alternative item ratio.\nParent item: {1}\nBOM pattern: {2}\nTerm: {3}\nCalculation category cd.: {4}\nAlternative group cd.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0035' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0035',
	'en_US',
	'W',
	'For the Supply type, specify "2. Chargeable supply" or "3. Self supply".\nItem: {1}\nWG cd.: {2}\nTerm: {3}\nCalculation category cd.: {4}\nSupply type: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0037' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0037',
	'en_US',
	'W',
	'Specify a positive number in the base number.\nItem: {1}\nWG cd.: {2}\nTerm: {3}\nCalculation category cd.: {4}\nBase qty.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0039' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0039',
	'en_US',
	'W',
	'Specify a positive number in the parent required number.\nParent item: {1}\nBOM pattern: {2}\nTerm: {3}\nCalculation category cd.: {4}\nChild item: {5}\nParent required number: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0040' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0040',
	'en_US',
	'W',
	'Specify a number other than 0 in the unit price.\nItem: {1}\nWG cd.: {2}\nTerm: {3}\nCalculation category cd.: {4}\nUnit price: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0044' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0044',
	'en_US',
	'W',
	'Not entered as an item for asset management in the Item master. Not subject to the parent item.\nParent item: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0045' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0045',
	'en_US',
	'W',
	'Not entered as a valid item in the Item master.\nParent item: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0046' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0046',
	'en_US',
	'W',
	'Not entered as a valid item in the Item master.\nChild item: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0048' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0048',
	'en_US',
	'W',
	'Neither location, supplier, nor requested WG is set in the data to be imported.\nItem: {1}\nWG cd.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0051' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0051',
	'en_US',
	'W',
	'Cannot set the sales unit prince since the data cannot be acquired from the Standard Sales Unit Price master or the Currency master even through the rate is specified.\nItem: {1}\nCustomer cd.: {2}\nDelivery destination cd.: {3}\nCurrency cd.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0052' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0052',
	'en_US',
	'W',
	'Cannot convert the tax excluding unit price since the data cannot be acquired from the Tax master or the Currency master.\nItem: {1}\nCustomer cd.: {2}\nDelivery destination cd.: {3}\nTax cd.: {4}\nCurrency cd.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0053' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0053',
	'en_US',
	'W',
	'Cannot convert the tax excluding unit price since the data cannot be acquired from the Tax master or the Currency master.\nItem: {1}\nSupplier cd.: {2}\nTax cd.: {3}\nCurrency cd.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0055' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0055',
	'en_US',
	'W',
	'Specify a positive number in the base number.\nItem: {1}\nWG cd.: {2}\nTerm: {3}\nCalculation category cd.: {4}\nBase qty.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0056' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0056',
	'en_US',
	'W',
	'Cannot acquire the calculation category. Set the default calculation category in the Cost Company Parameter master.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0057' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0057',
	'en_US',
	'W',
	'An error has occurred during importing the master. See the log file. Note that the imported data is updated.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0058' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0058',
	'en_US',
	'W',
	'An error has occurred during creating import data. See the log file. Note that the data is created.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0059' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0059',
	'en_US',
	'W',
	'Not entered as a valid BP in the BP master.\nSupplier cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0060' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0060',
	'en_US',
	'W',
	'Not entered as a valid BP in the BP master.\nSubcontractor cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0061' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0061',
	'en_US',
	'W',
	'Not entered as a valid BP in the BP master.\nCustomer cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0062' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0062',
	'en_US',
	'W',
	'Not entered as a valid BP in the BP master.\nDelivery destination cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0063' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0063',
	'en_US',
	'W',
	'Not entered as a valid BP in the BP master.\nDistribution channel cd. 1: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0064' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0064',
	'en_US',
	'W',
	'Not entered as a valid BP in the BP master.\nDistribution channel cd. 2: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0065' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0065',
	'en_US',
	'W',
	'Not entered as a valid BP in the BP master.\nDistribution channel cd. 3: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0066' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0066',
	'en_US',
	'W',
	'Not entered as a valid WG in the WG master.\nRequested WG cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0067' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0067',
	'en_US',
	'W',
	'Cannot specify the same value as the WG in the requested WG.\nRequested WG cd.: {1}\nWG cd.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBED0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBED0001',
	'en_US',
	'I',
	'The number of firmed items: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBED0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBED0002',
	'en_US',
	'W',
	'There is an item whose standard unit price was firmed by different calculation.\nRecalculate it first, and execute the firm processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBED0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBED0003',
	'en_US',
	'W',
	'Cannot process cost calculation results where an error has occurred.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBED0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBED0004',
	'en_US',
	'W',
	'Since the standard unit cost has been firmed in the calculation for which the target standard allocation rate data is used, cannot cancel the firmed standard allocation rate.\nCancel the firmed standard unit price for the target item.\nTerm: {1}\nCalculation category cd.: {2}\nWG cd.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBED0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBED0005',
	'en_US',
	'W',
	'There is data which has not been firmed for standard alloc. rate data to be calculated.\nExecute the firming process for the standard alloc. rate.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBED0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBED0006',
	'en_US',
	'W',
	'There is an item whose standard alloc. rate was firmed by different calculation.\nRecalculate it first, and execute the firming processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBED0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBED0007',
	'en_US',
	'W',
	'No item to be firmed exists.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBED0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBED0008',
	'en_US',
	'W',
	'No item to be unfirmed exists.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBED0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBED0009',
	'en_US',
	'W',
	'An unfirm child item exists.\nItem: {1}\nCalculation category cd.: {2}\nWG cd.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBED0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBED0010',
	'en_US',
	'W',
	'Failed to firm the standard unit cost.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBFP0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBFP0002',
	'en_US',
	'W',
	'It is not the cost calculation result which can be seen in the Cost Breakdown List.\nA calculation result which can be seen is the one which has been firmed in the last month of the calculation period, or the one of the latest calculation.\nCalculation group cd.: {1}\nCalculation No.: {2}\nYear month: {3}\nTarget calculation No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBFL0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBFL0001',
	'en_US',
	'W',
	'The revaluation loss is entered by using multiple cost calculation results for the same calculation group and the year and month.\nCannot record the revaluation loss using multiple cost calculation results.\nRevaluation loss on calculation No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBFD0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBFD0001',
	'en_US',
	'W',
	'Cannot aggregate values since no record to be aggregated is entered in the Custom T Account Column master, even though the GR/GI aggregated unit type is set as other than "1. GR/GI unit".\nGR/GI list ID: {1}\nGR/GI column: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBGP0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBGP0001',
	'en_US',
	'W',
	'If there is no key, multiple rows cannot be entered.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBGP0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBGP0002',
	'en_US',
	'W',
	'Specify the range of periods up to 5.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBGP0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBGP0003',
	'en_US',
	'W',
	'Specify the range of months up to 60.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBGL0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBGL0001',
	'en_US',
	'W',
	'Cannot reflect the data since the reflection destination data has already been processed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBGL0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBGL0002',
	'en_US',
	'W',
	'There are multiple records which has the same value in the column below.\nUnselect the To import of unnecessary records.\nData row No.: {1}\nColumn: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBGL0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBGL0003',
	'en_US',
	'W',
	'If there is no key, multiple rows cannot be entered.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBGL0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBGL0004',
	'en_US',
	'I',
	'Data No.: {1}\nThe number of data: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBGD0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBGD0001',
	'en_US',
	'W',
	'Cannot process since it is not entered in the Departmental Alloc. Basis master, or no Ratio setting type has been set in the master.\nDepartmental alloc. basis cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBGD0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBGD0002',
	'en_US',
	'W',
	'Cannot create plan ratio data since the monthly ratio is not set in the Departmental Alloc. Basis master.\nDepartmental alloc. basis cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBGD0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBGD0003',
	'en_US',
	'W',
	'Cannot create result ratio data since the monthly ratio result is not set in the Departmental Alloc. Basis master.\nDepartmental alloc. basis cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBGD0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBGD0004',
	'en_US',
	'W',
	'Cannot process since it is not entered in the Departmental Alloc. Basis Category master.\nTerm: {1}\nWG cd.: {2}\nCalculation category cd.: {3}\nDepartmental alloc. basis cd.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBGD0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBGD0005',
	'en_US',
	'W',
	'Cannot process since no records to be used are set in the Departmental Alloc. Basis Man-Hour master.\nTerm: {1}\nWG cd.: {2}\nCalculation category cd.: {3}\nDepartmental alloc. basis cd.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBGD0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBGD0006',
	'en_US',
	'W',
	'None of key info. has been acquired for the target departmental alloc. variable ratio.\nPlan/Result type: {1}\nYear month: {2}\nWG cd.: {3}\nCalculation category cd.: {4}\nDepartmental alloc. basis cd.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBGD0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBGD0007',
	'en_US',
	'W',
	'Acquired the key info. Based on the departmental alloc. monthly rate. However, there is a value in a column which is set as exclude in the Departmental Alloc. Pattern master.\nUpdate the data.\nPlan/Result type: {1}\nYear month: {2}\nWG cd.: {3}\nCalculation category cd.: {4}\nDepartmental alloc. basis cd.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBPP0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBPP0001',
	'en_US',
	'D',
	'The conversion from the base unit to the operation unit skipped.\nBase unit qty.: {1}\nOperation conversion unit qty.: {2}\nOperation base unit qty. : {3}\nSignificant digit in decimal places: {4}\nUnit conversion rounding type: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXL0031' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXL0031',
	'en_US',
	'W',
	'The Accounting slip type is invalid.\nAccounting slip type: {1}\nAccounting slip type that can be entered: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXL0049' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXL0049',
	'en_US',
	'W',
	'To set the value for the column below, "3. Target" must be set for the column in the Departmental Alloc. Pattern master.\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0001',
	'en_US',
	'I',
	'The processing started. {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0002',
	'en_US',
	'I',
	'The processing completed. {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0003',
	'en_US',
	'I',
	'The processing completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0004',
	'en_US',
	'W',
	'An SQL error has occurred. {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0005',
	'en_US',
	'W',
	'Cannot process since the cost calculation result for this month has already been firmed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0006',
	'en_US',
	'W',
	'Fail to acquire the calculation No.\nCalculation group cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0007',
	'en_US',
	'W',
	'No actual cost calculation result to be processed exist.\nCalculation group cd.: {1}\nCalculation No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0008',
	'en_US',
	'W',
	'The data is not entered are the cost exchange rate.\nCurrency cd.: {1}\nBase currency cd.: {2}\nExchange rate cd: {3}\nPeriod: {4}\nTarget table: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0009',
	'en_US',
	'W',
	'Cannot process the data since it is being processing.\nCalculation group cd.: {1}\nCalculation No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0010',
	'en_US',
	'W',
	'Cannot process the data since it is being processing.\nCalculation group cd.: {1}\nYear month: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0011',
	'en_US',
	'W',
	'No firmed information to be processed exist.\nCalculation group cd.: {1}\nYear month: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0012',
	'en_US',
	'I',
	'Starting the cost report generation processing.\nCalculation group cd.: {1}\nCalculation No.: {2}\nReport Pattern cd.: {3}\nReport Key cd.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0013',
	'en_US',
	'I',
	'Starting the custom T account generation processing.\nCalculation group cd.: {1}\nCalculation No.: {2}\nGR/GI list ID: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0014',
	'en_US',
	'W',
	'Cannot process since the actual cost calculation result for the target data has already been firmed.\nCalculation group cd.: {1}\nYear month: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0015',
	'en_US',
	'W',
	'The firm standard unit cost does not exist.\nTerm: {1}\nItem: {2}\nWG cd.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0016',
	'en_US',
	'W',
	'Cannot process since the actual cost calculation result for the target data has already been firmed .\nTarget: {1}\nCalculation group cd.: {2}\nCalculation category cd.: {3}\nWG cd.: {4}\nYear month: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0017',
	'en_US',
	'W',
	'There is no data for this processing in the Calculation Group Report master.\nCalculation group cd.: {1}\nReport pattern cd.: {2}\nReport key cd.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0018',
	'en_US',
	'I',
	'Starting the Departmental alloc. ratio creation processing.\nPlan/Result type: {1}\nYear month: {2}\nWG cd.: {3}\nCalculation category cd.: {4}\nDepartmental alloc. basis cd.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0019',
	'en_US',
	'W',
	'Cannot process since a month later than the specified month is firmed.\nCalculation group cd.: {1}\nYear month: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0020',
	'en_US',
	'W',
	'Cannot firm data whose maximum calculation moth is 0.\nCalculation group cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0021',
	'en_US',
	'W',
	'There is no corresponding record in the Custom T Account master.\nGR/GI list ID: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0022',
	'en_US',
	'W',
	'There is no corresponding record in the Custom T Account Configuration master.\nGR/GI list ID: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0023',
	'en_US',
	'W',
	'There is no target data in the Calculation Group GR/GI List master.\nCalculation group cd.: {1}\nGR/GI list ID: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0024',
	'en_US',
	'W',
	'A loop has occurred in the Cost Report Row Aggregated master.\nReport pattern cd.: {1}\nAggregated report row cd: {2}\nReport row cd: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0025',
	'en_US',
	'W',
	'Cannot process since the input result has already been firmed, even though input transfer is set in the GR/GI Result Transfer master.\nTarget: {1}\nCalculation group cd.: {2}\nCalculation category cd.: {3}\nWG cd.: {4}\nYear month: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0026',
	'en_US',
	'W',
	'Cannot process since the cost calculation result which uses the target cost data has already been firmed.\nCalculation group cd.: {1}\nCalculation category cd.: {2}\nWG cd.: {3}\nYear month: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0027' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0027',
	'en_US',
	'W',
	'Revaluation loss is recorded with another cost calculation No. Execute the firm processing for the data for which the revaluation loss is recorded.\nCalculation group cd.: {1}\nYear month: {2}\nTarget calculation No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0028' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0028',
	'en_US',
	'I',
	'Stating the generation processing of inventory revaluation unit price data.\nCalculation category cd.: {1}\nWG cd.: {2}\nYear month: {3}\nInventory revaluation cd: {4}\nCalculation group cd.: {5}\nCalculation No.: {6}\nYear month FROM: {7}\nYear month TO: {8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0029' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0029',
	'en_US',
	'W',
	'Cannot process the target data since it is being processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0030' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0030',
	'en_US',
	'I',
	'Starting the processing.\nCalculation group cd.: {1}\nYear month: {2}\nCalculation No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0031' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0031',
	'en_US',
	'W',
	'Cannot copy the data since the cost item details info. contains data whose standard unit cost has already been firmed.\nCalculation category cd.: {1}\nWG cd.: {2}\nTerm: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0032' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0032',
	'en_US',
	'W',
	'Cannot copy the data since the cost item operation info. contains data whose standard unit cost has already been firmed.\nCalculation category cd.: {1}\nWG cd.: {2}\nTerm: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0033' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0033',
	'en_US',
	'W',
	'Cannot copy the data since the cost BOM info. contains data whose standard unit cost has already been firmed.\nCalculation category cd.: {1}\nWG cd.: {2}\nTerm: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0034' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0034',
	'en_US',
	'W',
	'Cannot copy the data since the cost item man-hour info. contains data whose standard unit cost has already been firmed.\nCalculation category cd.: {1}\nWG cd.: {2}\nTerm: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0035' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0035',
	'en_US',
	'W',
	'Cannot copy the data since the cost item purchase unit price info. contains data whose standard unit cost has already been firmed.\nCalculation category cd.: {1}\nWG cd.: {2}\nTerm: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0036' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0036',
	'en_US',
	'W',
	'Cannot copy the data since the cost item purchase unit price info. contains data whose standard unit cost has already been firmed.\nCalculation category cd.: {1}\nWG cd.: {2}\nTerm: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0037' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0037',
	'en_US',
	'W',
	'An error has occurred. See the log file. Note that the imported data has been updated. {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0038' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0038',
	'en_US',
	'W',
	'The Cost Company Parameter master is not entered.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0039' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0039',
	'en_US',
	'W',
	'A problem such as overflow of digits has occurred as a result of unit conversion.\nQty.: {1}\nConversion base qty.: {2}\nConverted qty.: {3}\nSignificant digit in decimal places: {4}\nRounding type: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0040' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0040',
	'en_US',
	'W',
	'Cannot copy the data since the cost item subcontracting unit price info. contains data whose standard unit cost has already been firmed.\nCalculation category cd.: {1}\nWG cd.: {2}\nTerm: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0041' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0041',
	'en_US',
	'W',
	'Not entered in the Cost Dept. master.\nDept. cd.: {1}\nPeriod: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0042' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0042',
	'en_US',
	'W',
	'Not entered in the Calculation Group master.\nCalculation group cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0043' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0043',
	'en_US',
	'W',
	'Not entered in the Item master.\nItem: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0044' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0044',
	'en_US',
	'W',
	'Not entered in the Currency master.\nCurrency cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0045' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0045',
	'en_US',
	'W',
	'Not entered in the Departmental Alloc. Basis master.\nDepartmental alloc. basis cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0046' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0046',
	'en_US',
	'W',
	'Not entered in the Departmental Alloc. Pattern master.\nDepartmental alloc. pattern cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0047' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0047',
	'en_US',
	'W',
	'Cannot process since a WG which you do not have the update authority exists in the Calculation Group WG master.\nCalculation group cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0048' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0048',
	'en_US',
	'W',
	'Cannot process since the input result has already been firmed, even though data in which mfg. result group is set exists on the GR/GI Result IF.\nCalculation group cd.: {1}\nCalculation category cd.: {2}\nWG cd.: {3}\nYear month: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0049' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0049',
	'en_US',
	'I',
	'GI amounts are set to be transferred to departmental allocation expenses, but the GI amount is zero.\nYear month: {1}\nWG cd.: {2}\nManagement dept. cd.: {3}\nItem: {4}\nLot No.: {5}\nSublot No.: {6}\nSEIBAN No.: {7}\nAsset type: {8}\nAllocation account cd.: {9}\nResult ID: {10}\nResult ID branch No.: {11}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGLAB0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAB0001',
	'en_US',
	'W',
	'No value is set for the IF process type: bi_ope.\nIF process type: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGLAB0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAB0002',
	'en_US',
	'W',
	'Invalid value is set for the IF process type: bi_ope.\nIF process type: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGLAB0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAB0003',
	'en_US',
	'W',
	'"The specified IF process type does not exist.\nIF process type: {1}"');
DELETE FROM FCT_MSG WHERE MSGID = 'MGLAB0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAB0004',
	'en_US',
	'W',
	'The specified IF process type is not subject to the processing.\nIF process type: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGLAB0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAB0005',
	'en_US',
	'I',
	'Starting the BI Link batch processing.\nIF process type: {1}\nExternal system cd.: {2}\nYear and month: {3}\nCalculation group cd.: {4}\nCalculation No.: {5}\nFirm only: {6}\nCompany cd.: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGLAB0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAB0006',
	'en_US',
	'I',
	'The BI Link batch processing completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAL0001',
	'en_US',
	'W',
	'Invalid value is set for the IF process type. \nIF process type: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAL0002',
	'en_US',
	'W',
	'If the Firm only flg. is turned on, you cannot specify the Calculation No.\nIF process type: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAL0003',
	'en_US',
	'I',
	'Starting the Actual Cost Calculation Result Export IF processing.\nCompany cd.: {1}\nIF process type: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAL0004',
	'en_US',
	'I',
	'The Actual Cost Calculation Result Export IF processing completed.\nCompany cd.: {1}\nProcessed: {2}\nNumber of entries: {3}\nNumber of errors: {4}\nNumber of skipped records: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAL0005',
	'en_US',
	'W',
	'There is data that failed to set the Batch log No., the Log subkey 1, and the Log subkey 2.\nSee the IF Data Export Status screen for details.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAL0006',
	'en_US',
	'I',
	'Starting the T Account Export processing.\nCompany cd.: {1}\nIF process type: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAL0007',
	'en_US',
	'I',
	'The T Account Export processing completed.\nCompany cd.: {1}\nProcessed: {2}\nNumber of entries: {3}\nNumber of errors: {4}\nNumber of skipped records: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAL0008',
	'en_US',
	'I',
	'Starting the Operation Cost Calculation Result Export IF processing.\nCompany cd.: {1}\nIF process type: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAL0009',
	'en_US',
	'I',
	'The Operation Cost Calculation Result Export IF processing completed.\nCompany cd.: {1}\nProcessed: {2}\nNumber of entries: {3}\nNumber of errors: {4}\nNumber of skipped records: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAL0010',
	'en_US',
	'I',
	'Starting the Actual Cost Calculation Result Export IF processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAL0011',
	'en_US',
	'I',
	'The Actual Cost Calculation Result Export IF processing completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAL0012',
	'en_US',
	'I',
	'Starting the T Account Export processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAL0013',
	'en_US',
	'I',
	'The T Account Export processing completed.\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAL0014',
	'en_US',
	'I',
	'Starting the Operation Cost Calculation Result Export IF processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAL0015',
	'en_US',
	'I',
	'The Operation Cost Calculation Result Export IF processing completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGUAL0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUAL0001',
	'en_US',
	'W',
	'Not entered in the Inventory Revaluation master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGUAL0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUAL0002',
	'en_US',
	'W',
	'The departmental alloc. basis for the following condition is not entered in the Departmental Alloc. Basis master.\nCalculation category cd.: {1}\nWG cd.: {2}\nTerm: {3}\n{4}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MGUAL0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUAL0003',
	'en_US',
	'W',
	'The departmental alloc. basis which does not exist in the departmental alloc. fixed ratio for\nthe following condition is not set in the Departmental Alloc. Basis master.\nCalculation category cd.: {1}\nWG cd.: {2}\nTerm: {3}\n{4}\n\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MGUAL0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUAL0004',
	'en_US',
	'W',
	'The departmental alloc. basis which does not exist in the departmental alloc. variable ratio for the following condition is not set in the Departmental Alloc. Basis master.\nCalculation category cd.: {1}\nWG cd.: {2}\nTerm: {3}\nYear month: {4}\nPlan/Result type: {5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGUCL0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUCL0001',
	'en_US',
	'W',
	'Could not acquire the cost company parameter info.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGUCL0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUCL0002',
	'en_US',
	'W',
	'Cannot enter or delete since the standard allocation ratio which uses the target allocation pattern has already been firmed.\nTerm: {1}\nAllocation pattern: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGUCL0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUCL0003',
	'en_US',
	'W',
	'No actual cost calculation result to be processed exist.\nCalculation group cd.: {1}\nCalculation No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGUCD0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUCD0001',
	'en_US',
	'W',
	'Could not convert the target dept. to the cost dept.\nDepartment: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGUCD0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUCD0002',
	'en_US',
	'W',
	'Could not acquire the calculation category for the target dept.\nDept.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGUDL0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUDL0001',
	'en_US',
	'W',
	'Only "1. Own company (sales)" or "2. Own company (production)" can be specified for the Asset type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGUDL0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUDL0002',
	'en_US',
	'W',
	'Cannot process since the actual cost calculation result for the target data has already been firmed.\nCalculation group cd.: {1}\nYear month: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGUDL0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUDL0003',
	'en_US',
	'W',
	'Only "1. Standard unit cost" or "2. 0 evaluation" can be specified for the Individual evaluation type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGUDL0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUDL0004',
	'en_US',
	'W',
	'If "Common" is specified for the entry target, the columns below should be specified.\nColumn: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGUDL0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUDL0005',
	'en_US',
	'W',
	'If the Operation result No. is specified, the columns below should be specified.\nColumn: Operation cd., Operation sequence number\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGUDL0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUDL0006',
	'en_US',
	'W',
	'The columns below can be specified only if the Operation result No. is specified.\nColumn: Operation cd., Operation sequence number\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MGUDP0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUDP0001',
	'en_US',
	'W',
	'Specify the year and month to be within {1} months.');
DELETE FROM FCT_MSG WHERE MSGID = 'MGUDP0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUDP0002',
	'en_US',
	'W',
	'Specify the term to be within {1} terms.');
