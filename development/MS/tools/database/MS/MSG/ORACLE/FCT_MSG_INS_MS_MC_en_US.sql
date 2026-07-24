DELETE FROM FCT_MSG WHERE MSGID = 'MSBAP0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAP0001',
	'en_US',
	'I',
	'Rows that do not appear on the screen cannot be imported.\nFile row: {1}\nItem: {2}\nLocation: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0001',
	'en_US',
	'W',
	'Cannot enter a request for the same WG.\nRequesting WG cd.: {1}\nRequested WG cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0002',
	'en_US',
	'W',
	'Supplier must be specified.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0003',
	'en_US',
	'W',
	'Requested location must be specified.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0004',
	'en_US',
	'I',
	'Starting the Create Demand batch.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0005',
	'en_US',
	'I',
	'The Create Demand batch has completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0006',
	'en_US',
	'W',
	'Not entered in the Demand Split master or Sales Order Allocation master.\nItem: {1}\nItem shipping group cd.: {2}\nDistribution group cd.: {3}\nWG cd.: {4}\nDpt. cd.: {5}\nApplication date: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0007',
	'en_US',
	'I',
	'Inventory request from other WG has been entered.\nRequesting dept. WG: {1} {2}, Requested WG: {3} {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0008',
	'en_US',
	'I',
	'Inventory request from other WG has been corrected.\nRequesting dept. WG: {1} {2}, Requested WG: {3} {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0009',
	'en_US',
	'I',
	'Inventory request from other WG has been deleted.\nRequesting dept. WG: {1} {2}, Requested WG: {3} {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0010',
	'en_US',
	'I',
	'Reply to the inventory request from other WG has been entered.\nRequesting dept. WG: {1} {2}, Requested WG: {3} {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0011',
	'en_US',
	'I',
	'Reply to the inventory request from other WG has been deleted.\nRequesting dept. WG: {1} {2}, Requested WG: {3} {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0012',
	'en_US',
	'I',
	'Order has been entered to the schedule for the inventory request from other WG.\nRequesting dept. WG: {1} {2}, Requested WG: {3} {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0013',
	'en_US',
	'I',
	'Result has been entered to the schedule for the inventory request from other WG.\nRequesting dept. WG: {1} {2}, Requested WG: {3} {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0014',
	'en_US',
	'I',
	'Order of the schedule has been canceled for the inventory request from other WG.\nRequesting dept. WG: {1} {2}, Requested WG: {3} {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0015',
	'en_US',
	'I',
	'Result of the schedule has been canceled for the inventory request from other WG.\nRequesting dept. WG: {1} {2}, Requested WG: {3} {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0016',
	'en_US',
	'I',
	'Reply qty. for the inventory request from other WG is insufficient.\nRequesting dept. WG: {1} {2}, Requested WG: {3} {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0017',
	'en_US',
	'I',
	'Order promising for the inventory request from other WG has been delayed.\nRequesting dept. WG: {1} {2}, Requested WG: {3} {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0018',
	'en_US',
	'W',
	'Not entered in the Item Details master.\nItem: {1}\nBOM pattern: {2}\nMfg. location cd.: {3}\nSupplier cd.: {4}\nRequested location cd.: {5}\nMaster application date: {6}\n{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0019',
	'en_US',
	'W',
	'Cannot update inventory request from other WG if it is created in the sales order entry.\nNo. of inventory request from other WG: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0020',
	'en_US',
	'W',
	'Cannot update the canceled inventory request from other WG.\nNo. of inventory request from other WG: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0021',
	'en_US',
	'W',
	'Only other demands entered using the Demand List Entry can be updated.\nDemand No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0022',
	'en_US',
	'W',
	'In the case of purchase request regarding direct delivery, only for requested quantities per case can be firmed.\nNo. of inventory request from other WG: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0023',
	'en_US',
	'W',
	'Supplier or requested location cannot be specified since there is no Item Details master.\nItem: {1}\nWG cd.: {2}\nMaster application date: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0024',
	'en_US',
	'W',
	'Shipping inventory request from other WG cannot be entered using the Entry of Inventory Request.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0025',
	'en_US',
	'W',
	'Cannot enter items for asset management if the transaction is expense purchase.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0026',
	'en_US',
	'W',
	'For items for asset management, you cannot set the reason for expense purchase.\nItem: {1}\nReason cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0027' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0027',
	'en_US',
	'W',
	'For items not for asset management, set the reason for expense purchase.\nItem: {1}\nReason cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0028' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0028',
	'en_US',
	'W',
	'No PO info. for charged PO No. is found.\nCharged PO No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0029' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0029',
	'en_US',
	'W',
	'No sales order information for charged sales No. is found.\nCharged sales No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0030' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0030',
	'en_US',
	'W',
	'No invoice information or purchase invoice information corresponding to the charged invoice No. is found.\nCharged invoice No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0031' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0031',
	'en_US',
	'W',
	'Cannot enter the reply that is different from the one when the WG requested.\nRequested WG cd. (request): {1}\nRequested WG cd. (reply): {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0032' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0032',
	'en_US',
	'I',
	'Subsequent work is ongoing. Coordinate with the requested destination if necessary.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0033' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0033',
	'en_US',
	'W',
	'Regarding reply to purchase request, mfg. location cannot be changed from Specified to Unspecified or vice versa.\nTo change it, delete the entered row and then add a new row.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0034' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0034',
	'en_US',
	'I',
	'Demand source dept. is invalid on the target date.\nDemand info. is not subject to be created.\nTarget date: {1}\nDemand source dept. cd.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0035' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0035',
	'en_US',
	'W',
	'Cannot enter the transport request if GR WG and Requested WG are the same.\nGR WG cd.: {1}\nRequested WG cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0036' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0036',
	'en_US',
	'W',
	'Cannot update supply plan if item order linked to the supply plan has been firmed.\nDaily supply No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0100' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0100',
	'en_US',
	'I',
	'Scheduled PO date is earlier than the operation date.\nItem: {1}\nSupplier cd.: {2}\nMaker cd.: {3}\nScheduled PO date: {4}\nOperation date: {5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0101' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0101',
	'en_US',
	'W',
	'No data whose scheduled PO date calculated from the GR request date is set within the applicable period is entered in the Item Details master.\nItem: {1}\nGR WG cd.: {2}\nSupplier cd.: {3}\nMaker cd.: {4}\nMfg. location cd.: {5}\nBOM pattern: {6}\nGR request date and time: {7}\n{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0102' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0102',
	'en_US',
	'W',
	'No data whose scheduled PO date calculated from the replied GR date and time is set within the applicable period are entered in the Item Details master.\nItem: {1}\nGR WG cd.: {2}\nSupplier cd.: {3}\nMaker cd.: {4}\nMfg. location cd.: {5}\nBOM pattern: {6}\nReplied GR date and time: {7}\n{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0103' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBAL0103',
	'en_US',
	'W',
	'No data whose GI request date calculated from the GR request date is set within the applicable period is entered in the Item Details master.\nItem: {1}\nGR WG cd.: {2}\nRequested location cd.: {3}\nGR request date and time: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0001',
	'en_US',
	'I',
	'No specification is selected. Are you sure you want to execute the entry processing?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0002',
	'en_US',
	'W',
	'Specify the period to be within 24 months.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0003',
	'en_US',
	'I',
	'Quantity amount calculation processing will be executed. Continue?\nThe amount (qty.) is calculated from the qty. (amount) of the input target.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0004',
	'en_US',
	'I',
	'The aggregation processing will be executed. Continue?\nThe planned qty. (plan amount) will be calculated by aggregating the qty. (amount) entered by PIC.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0005',
	'en_US',
	'I',
	'The breakdown re-explode processing will be executed. Continue?\nThe qty. of input target (amount) will be calculated from the total qty. (total amount).\nNon-targeted input amount (qty.) will be calculated in the quantity amount calculation process.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0006',
	'en_US',
	'I',
	'The expiration date has passed. Continue?\nExpiration Date: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0007',
	'en_US',
	'W',
	'Reference entry for result via quotation cannot be done.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0008',
	'en_US',
	'W',
	'Reference entry for result via sales order cannot be done.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0009',
	'en_US',
	'W',
	'Reference entry for result via delivery note cannot be done.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0010',
	'en_US',
	'W',
	'There is no target for reacquiring the unit price.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0011',
	'en_US',
	'I',
	'The unit price will be reacquired. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0012',
	'en_US',
	'I',
	'The unit price has been changed.\nUnit price before change: {1}\nUnit price after change: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0013',
	'en_US',
	'W',
	'Specify sales display period more than 1 month, within {1} months.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0014',
	'en_US',
	'W',
	'The specified case has been canceled and cannot be corrected.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0015',
	'en_US',
	'W',
	'Rows that do not appear on the screen cannot be imported.\nFile row: {1}\nDept. cd.: {2}\nCustomer cd.: {3}\nSales project No.: {4}\nPlan item cd.: {5}\nItem: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0016',
	'en_US',
	'W',
	'Plan qty. / plan amount of the specified sales month cannot be entered.\nFile row: {1}\nColumn: {2}\nSales month: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0017',
	'en_US',
	'W',
	'Numeric values exceeding the number of decimal places are specified. \nFile row: {1}\nColumn: {2}\nNumerical value: {3}\nNumber of decimal places: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0018',
	'en_US',
	'I',
	'The reference info. acquisition process will be executed. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0019',
	'en_US',
	'I',
	'The acquire unit price process will be executed. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0020',
	'en_US',
	'I',
	'The acquire unit price process has been executed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0021',
	'en_US',
	'I',
	'The exchange rate acquisition process will be executed. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0022',
	'en_US',
	'I',
	'The exchange rate acquisition process has been executed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0023',
	'en_US',
	'W',
	'No row other than the base currency is selected.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0024',
	'en_US',
	'I',
	'The tax acquisition process will be executed. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0025',
	'en_US',
	'I',
	'The tax acquisition process has been executed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0026',
	'en_US',
	'W',
	'Cannot cancel since there are the detail for received items.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0027' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0027',
	'en_US',
	'W',
	'Canceled data cannot be canceled.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0028' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0028',
	'en_US',
	'W',
	'There are details whose Firm is turned off. These details are not adopted. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0101' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0101',
	'en_US',
	'W',
	'Reference entry for result via invoice cannot be done.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0102' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0102',
	'en_US',
	'W',
	'Specify different values for loading port, unloading port and stopover point, respectively.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0103' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0103',
	'en_US',
	'W',
	'Specify "Header" for the search mode.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0104' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0104',
	'en_US',
	'W',
	'Specify "View result" for the operation type and "Header" for the search mode.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0105' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0105',
	'en_US',
	'W',
	'Specify "View" for the operation type and "Header" for the search mode.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0106' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBP0106',
	'en_US',
	'W',
	'To correct or cancel sales results for invoice transactions, search by Invoice No.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0001',
	'en_US',
	'W',
	'The specified SEIBAN No. is linked with another sales project No.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0002',
	'en_US',
	'W',
	'Specify SEIBAN No. 1 if no auto-numbering is used.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0003',
	'en_US',
	'W',
	'Specify the customer name for the miscellaneous customers.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0004',
	'en_US',
	'W',
	'This item has already been entered.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0005',
	'en_US',
	'W',
	'Cannot enter this item as new, change or correct since it has already been released.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0006',
	'en_US',
	'W',
	'Cannot enter this item as change or correct since it has been used for quotation or sales order.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0007',
	'en_US',
	'W',
	'Cannot update since the specification exists.\nTo change the configuration, perform the configuration revision.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0008',
	'en_US',
	'W',
	'Quotation is prohibited for the specified customer.\nCustomer cd.: {1}\nQuotation date: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0009',
	'en_US',
	'W',
	'The Quotation type cannot be changed to "Creating" since the quotation has already been issued.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0010',
	'en_US',
	'W',
	'The specification of the same SEIBAN No. and the item has already been entered.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0011',
	'en_US',
	'W',
	'Cannot enter this item as change or correct since it has been used for quotation or sales order.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0012',
	'en_US',
	'W',
	'Cannot enter this item as new, change or correct since it has already been released.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0013',
	'en_US',
	'W',
	'Cannot enter this item as change or correct since it is the undefined item.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0014',
	'en_US',
	'W',
	'Quotation is prohibited for this specified item.\nItem: {1}\nQuotation date: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0015',
	'en_US',
	'W',
	'Export of this specified item is prohibited.\nItem: {1}\nCountry cd.: {2}\nBase date: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0016',
	'en_US',
	'W',
	'SEIBAN No. 1 is required when performing the sales project management. Turn on the "Numbering SEIBAN No." or specify SEIBAN No. 1.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0017',
	'en_US',
	'W',
	'The specified SEIBAN No. 1 is pegged with another Sales project No.\nChange SEIBAN No. 1 to another value, or delete the pegging of Sales project No. and SEIBAN No. on the Sales Project Entry screen.\nSEIBAN No.1: {1}\nAnother Sales project No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0018',
	'en_US',
	'W',
	'Cannot update the data to be the approval target since the quotation has been copied to the sales order or results.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0019',
	'en_US',
	'W',
	'The Sales project management is not entered.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0020',
	'en_US',
	'W',
	'The Quotation sales order reason is not entered.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0021',
	'en_US',
	'W',
	'Cannot correct or cancel since a sales plan for the Input PIC corresponding to this sales period has already been entered.\nDept. cd.: {1}\nCustomer cd.: {2}\nSales project No.: {3}\nPlan item: {4}\nItem: {5}\nSales month: {6} - {7}\n{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0022',
	'en_US',
	'W',
	'Cannot correct or cancel since a sales plan for the Aggregation PIC corresponding to this sales period has already been entered.\nDept. cd.: {1}\nCustomer cd.: {2}\nSales project No.: {3}\nPlan item: {4}\nItem: {5}\nSales month: {6} - {7}\n{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0023',
	'en_US',
	'W',
	'Cannot enter this item configuration as a new data since it has already been entered. \nItem: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0024',
	'en_US',
	'W',
	'This configuration cannot be changed since it has been used for other quotation or sales order.\nItem: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0025',
	'en_US',
	'W',
	'This item cannot be revised since it has been used for another sales order.\nItem: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0026',
	'en_US',
	'W',
	'This item cannot be entered as new, change, or revise since it has already been released.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0027' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0027',
	'en_US',
	'W',
	'This specification has already been entered.\nItems: {1}, {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0028' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0028',
	'en_US',
	'W',
	'Cannot change this specification since it is used for other quotation or sales order.\nItems: {1}, {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0029' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0029',
	'en_US',
	'W',
	'Cannot update since there are other specifications for the configuration of this item.\nItem: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0030' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0030',
	'en_US',
	'W',
	'The item not for aggregation cannot be turned on if item system is not specified.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0031' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0031',
	'en_US',
	'W',
	'Cannot enter this department since it has not been set as the Sales dept. in the specified sales month.\nDept. cd.: {1}\nSales month: {2} - {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0032' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0032',
	'en_US',
	'W',
	'Cannot enter this data since it does not match the configuration to enter the sales plan.\nSee the configuration information of the sales plan.\nDept. cd.: {1}\nCustomer cd.: {2}\nSales project No.: {3}\nPlan item cd.: {4}\nItem: {5}\nCurrency cd.: {6}\nSales month: {7}\n{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0033' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0033',
	'en_US',
	'W',
	'This plan item is not set as the planning target for a sales plan in the specified sales month.\nSee the Sales Plan Item Configuration master.\nPlan item: {1}\nSales month: {2} - {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0034' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0034',
	'en_US',
	'W',
	'This item is not set as the planning target for a sales plan during specified sales month.\nSee the Sales Plan Item Configuration master.\nItem: {1}\nSales month: {2} - {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0035' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0035',
	'en_US',
	'W',
	'Cannot enter since there are records with duplicate sales months.\nCorrect the overlapping period.\nPlan item: {1}\nItem: {2}\nOverlapping period: {3} - {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0036' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0036',
	'en_US',
	'W',
	'Cannot specify a different Setting type for the same item. Specify either one.\nDept. cd.: {1}\nItem: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0037' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0037',
	'en_US',
	'W',
	'Budget classification is not entered.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0038' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0038',
	'en_US',
	'W',
	'Not entered as a sales project status in the sales project management.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0039' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0039',
	'en_US',
	'W',
	'Not entered as a sales order accuracy in the sales project management.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0040' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0040',
	'en_US',
	'W',
	'Not entered as an activity status in the sales project management.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0041' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0041',
	'en_US',
	'W',
	'Not entered as a sales order cancellation to quotation sales order reason.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0042' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0042',
	'en_US',
	'W',
	'Not entered as a quotation result to quotation sales order reason.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0043' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0043',
	'en_US',
	'W',
	'Not entered as quotation terms to quotation sales order reason.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0044' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0044',
	'en_US',
	'W',
	'Cannot issue a quotation currently being created.\nQuotation No.: {1} - {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0045' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0045',
	'en_US',
	'W',
	'Cannot issue a quotation until it is approved.\nQuotation No.: {1} - {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0046' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0046',
	'en_US',
	'W',
	'Cannot issue the quotation since it has been canceled.\nQuotation No.: {1} - {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0047' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0047',
	'en_US',
	'W',
	'There is no quotation to be issued.\nQuotation No.: {1} - {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0048' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0048',
	'en_US',
	'W',
	'Sales project No. is not entered.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0049' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0049',
	'en_US',
	'W',
	'Reference sales information with a new Slip status type does not exist.\nReference sales result No.: {1}\nReference sales result sequence number: {2}\nReference sales result details No.: {3}\nReference sales result details sequence number: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0050' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0050',
	'en_US',
	'W',
	'Customer and distribution channel are not unified domestically or internationally.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0051' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0051',
	'en_US',
	'W',
	'Cannot enter since the sales plan has already been set as uncorrectable.\nDept. cd.: {1}\nCustomer cd.: {2}\nSales project No.: {3}\nPlan month: {4}\nVersion: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0052' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0052',
	'en_US',
	'W',
	'Cannot update to turn on the "Adopt" since there is already the adopted version in the same plan month.\nPlan month: {1}\nVersion: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0053' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0053',
	'en_US',
	'W',
	'Cannot place orders since the sales order corresponding to this PO has not been approved.\nSales order No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0054' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0054',
	'en_US',
	'W',
	'Cannot enter since the sales plan of the specified copy-to version already exists.\nDept. cd.: {1}\nCustomer cd.: {2}\nSales project No.: {3}\nPlan month: {4}\nVersion: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0055' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0055',
	'en_US',
	'W',
	'The details of the specified Sales result No. cannot be acquired.\nSales result No.: {1}\nSales result rev. number: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0056' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0056',
	'en_US',
	'W',
	'Cannot enter since the item that is not set in the breakdown of the plan items is specified in the specified period.\nPlan item cd.: {1}\nItem: {2}\nSales month: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0057' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0057',
	'en_US',
	'W',
	'Cannot update since the updatable details data of the aggregated sales plan does not exist.\nPlan item cd.: {1}\nCurrency cd.: {2}\nSales month: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0059' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0059',
	'en_US',
	'W',
	'Specify all items for the plan items in the request message.\nPlan item cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0060' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0060',
	'en_US',
	'W',
	'Specified sales order No. does not exist.\nSales order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0061' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0061',
	'en_US',
	'W',
	'There is no data for the specified sales order No. and/ or sales order details No.\nSales order No.: {1}\nSales order details No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0062' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0062',
	'en_US',
	'W',
	'If the sales order details No. is specified, the sales order No. must be specified.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0063' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0063',
	'en_US',
	'I',
	'Multiple slips have been created.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0064' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0064',
	'en_US',
	'I',
	'Sales result No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0065' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0065',
	'en_US',
	'W',
	'Slip report cannot be acquired.\nCustomer cd.: {1}\nTransaction cd.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0066' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0066',
	'en_US',
	'W',
	'Cannot enter since a slip split has occurred for the approval target.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0067' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0067',
	'en_US',
	'W',
	'Not a location that has been entered in the Sales Order Allocation master.\nDelivery destination cd.: {1}\nReceiving point cd.: {2}\nSales dept. cd.: {3}\nBase date: {4}\nItem: {5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0068' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0068',
	'en_US',
	'W',
	'Not a gross allocation location group that has been entered in the Sales Order Allocation master.\nDelivery destination cd.: {1}\nReceiving point cd.: {2}\nSales dept. cd.: {3}\nBase date: {4}\nItem: {5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0069' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0069',
	'en_US',
	'W',
	'Not a distribution group that has been entered in the Sales Order Allocation master.\nDelivery destination cd.: {1}\nReceiving point cd.: {2}\nSales dept. cd.: {3}\nBase date: {4}\nItem: {5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0070' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0070',
	'en_US',
	'W',
	'Cannot cancel if there are details / breakdown of details that have been canceled.\nCancel after canceling "Cancel remaining".');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0071' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0071',
	'en_US',
	'W',
	'Cannot enter the invoice No. since it has already been entered.\nSpecify invoice No. that has not been entered.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0072' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0072',
	'en_US',
	'W',
	'Do not specify invoice No. when auto-numbering is used.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0073' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0073',
	'en_US',
	'W',
	'For shipping returns, turn on the Simultaneous recording (receipt simultaneously recording).');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0074' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0074',
	'en_US',
	'W',
	'If distribution channel 1 is not specified, distribution channel 2 cannot be specified.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0075' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0075',
	'en_US',
	'W',
	'If distribution channel 2 is not specified, distribution channel 3 cannot be specified.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0076' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0076',
	'en_US',
	'W',
	'Sales keeping customer inventory and Sales not for shipping order are mixed in the same sales order.\nEnter sales recording on the Sales Result List Entry screen.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0077' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0077',
	'en_US',
	'W',
	'For shipping returns, the upper limit of the qty. is up to the qty. that has been entered in shipping results.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0078' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0078',
	'en_US',
	'W',
	'Locations that are in different distribution groups cannot be mixed.\nSpecify the locations that are in the same distribution group.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0079' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0079',
	'en_US',
	'W',
	'The qty. of details and the total qty. of breakdown of details do not match.\nAdjust each qty. manually or apply the details to match these quantities.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0080' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0080',
	'en_US',
	'W',
	'SEIBAN No. for details and SEIBAN No. for breakdown of details do not match.\nSpecify the same SEIBAN No. for details and breakdown of details, or clear the SEIBAN No. for details if breakdown of details includes multiple SEIBAN Nos.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0081' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0081',
	'en_US',
	'W',
	'Lot No. for details and lot. No. for breakdown of details do not match.\nSpecify the same lot No. for details and breakdown of details, or clear the lot No. for details if breakdown of details includes multiple lot Nos.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0082' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0082',
	'en_US',
	'W',
	'Sublot No. for details and sublot No. for breakdown of details do not match.\nSpecify the same sublot No. for details and breakdown of details, or clear sublot No. for details if breakdown of details includes multiple sublot Nos.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0083' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0083',
	'en_US',
	'W',
	'Location for details and location for breakdown of details do not match.\nSpecify the same location for details and breakdown of details, or clear the location for details if breakdown of details includes multiple locations.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0084' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0084',
	'en_US',
	'W',
	'Rack/line for details and rack/line for breakdown of details do not match.\nSpecify the same rack/line for details and breakdown of details, or clear rack/line for details if breakdown of details includes multiple rack/lines.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0085' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0085',
	'en_US',
	'W',
	'Grading for details and grading for breakdown of details do not match.\nSpecify the same grading for details and breakdown of details, or clear the grading for details if breakdown of details includes multiple gradings.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0086' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0086',
	'en_US',
	'W',
	'Grading that is not entered in the Sales Order Allocation Grading master or that is not entered as an orderable item in the Grading master.\nCustomer cd.: {1}\nDelivery destination cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0087' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0087',
	'en_US',
	'W',
	'Cannot process applicable sales result on this screen since it is subject to invoice transactions.\nProcess it on the Sales Result List Entry screen.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0088' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0088',
	'en_US',
	'W',
	'Cannot process applicable sales result on this screen since it is a direct delivery sale.\nProcess it on the Sales Result List Entry screen or the Direct Delivery Sales Result Entry screen.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0089' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0089',
	'en_US',
	'W',
	'The specified customer is prohibited from sales/shipping.\nCustomer cd.: {1}\nSales date: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0090' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0090',
	'en_US',
	'W',
	'The specified item is prohibited from sales/shipping.\nItem: {1}\nSales date: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0091' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0091',
	'en_US',
	'W',
	'There are no details that can be copied.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0092' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0092',
	'en_US',
	'W',
	'Details for the specified quotation cannot be acquired.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0093' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0093',
	'en_US',
	'W',
	'Configuration management items cannot be copied from the quotation.\nCopy it from the sales order.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0094' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0094',
	'en_US',
	'W',
	'Sales order No. is specified, however no details that copied sales order are found.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0095' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0095',
	'en_US',
	'W',
	'Quotation No. is specified, however no details that copied quotation are found.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0096' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0096',
	'en_US',
	'W',
	'Delivery note No. is specified, however no details that copied delivery slip are found.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0097' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0097',
	'en_US',
	'W',
	'Cannot delete rows in the status of cancel remaining since recorded results already exist.\nDelete the rows after canceling the canceled remaining with the Correction type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0098' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0098',
	'en_US',
	'W',
	'Cannot cancel the remaining processing with the qty. set to 0 since recorded results already exist.\nEnter the cancel remaining for entered sales result if you cancel all remaining qty.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0099' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0099',
	'en_US',
	'W',
	'Exceeding the qty. that can be copied from the quotation. Quotation details No.: {1}\nPossible copy qty.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0100' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0100',
	'en_US',
	'W',
	'Cannot enter the sales qty. since it exceeds sales scheduled qty.\nSales scheduled qty.: {1}\nSold qty.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0101' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0101',
	'en_US',
	'W',
	'On/off of the print price has mixed for the same delivery destination.\nUnify the print price for the same delivery destination.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0102' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0102',
	'en_US',
	'W',
	'Cannot enter because it exceeds the qty. available for delivery order received.\nSales order details No.: {1}\nDelivery order received qty.: {2}\nDelivery order received available qty.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0103' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0103',
	'en_US',
	'W',
	'Cannot update or cancel the delivery order since the shipping order (result) has been completed.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0104' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0104',
	'en_US',
	'W',
	'Cannot enter the delivery order received if you cancel the remaining sales order details or all the remaining shipping schedules corresponding to the sales order details.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0105' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0105',
	'en_US',
	'W',
	'Cannot enter the specified delivery order qty. since it exceeds the remaining qty. which has not been canceled.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0106' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0106',
	'en_US',
	'W',
	'Cannot enter the delivery order received since sales order for direct delivery has already been recorded as revenue.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0107' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0107',
	'en_US',
	'W',
	'Cannot update since the specified delivery order qty. is less than the shipping order (result) qty.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0108' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0108',
	'en_US',
	'W',
	'Cannot cancel in the status of cancel remaining. Cancel it after canceling the canceled remaining with the Correction type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0109' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0109',
	'en_US',
	'W',
	'Cannot issue SEIBAN No. since the SEIBAN No.1 numbering pattern is not entered in the Item master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0110' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0110',
	'en_US',
	'W',
	'Cannot issue SEIBAN No. since the SEIBAN No.2 numbering pattern is not entered in the Item master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0111' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0111',
	'en_US',
	'W',
	'Cannot issue SEIBAN No. since the SEIBAN No.3 numbering pattern is not entered in the Item master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0112' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0112',
	'en_US',
	'W',
	'Cannot issue SEIBAN No. since the SEIBAN No.4 numbering pattern is not entered in the Item master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0113' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0113',
	'en_US',
	'W',
	'Cannot mix SEIBAN No.1 that is linked to different sales project No.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0114' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0114',
	'en_US',
	'W',
	'Set the unit price to 0 and the discount amount to "Unspecified" since sales return reason is other account.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0115' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0115',
	'en_US',
	'W',
	'No remaining qty. to be canceled. Turn off the Cancel remaining.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0117' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0117',
	'en_US',
	'W',
	'Cannot delete the shipping schedule since subsequent work is ongoing.\nShipping schedule No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0118' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0118',
	'en_US',
	'W',
	'Cannot delete the canceled shipping schedule. Delete it after canceling the canceled remaining.\nShipping schedule No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0119' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0119',
	'en_US',
	'W',
	'Cannot change a value if it is less than the qty. of subsequent work.\nShipping schedule No.: {1}\nQty. of subsequent work: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0120' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0120',
	'en_US',
	'W',
	'Cannot enter the reschedule shipment if it is the Cancel remaining.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0121' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0121',
	'en_US',
	'W',
	'The total of the shipping scheduled qty. must be the same as the sales order details qty.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0124' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0124',
	'en_US',
	'W',
	'Credit usage amount exceeds the credit limit.\nCredit managed BP cd.: {1}\nCurrency cd.: {2}\nCredit usage amount: {3}\nCredit limit: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0125' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0125',
	'en_US',
	'W',
	'Cannot enter since the original version of sales plan or firmed data does not exist.\nDept. cd.: {1}\nCustomer cd.: {2}\nSales project No.: {3}\nPlan month: {4}\nVersion: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0126' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0126',
	'en_US',
	'W',
	'Cannot correct the specified sales discount / sales surplus data since it is not for approval or is not a final approval.\nSales result No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0127' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0127',
	'en_US',
	'W',
	'Copied sales order details do not exist.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0128' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0128',
	'en_US',
	'W',
	'Specified item is prohibited for sales order.\nItem: {1}\nBase date: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0129' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0129',
	'en_US',
	'W',
	'If the Create lot for details is turned on, the Create lot for breakdown of details cannot be turned off.\nTurn off the Create lot for details or turn on all the Create lots for breakdown of details.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0130' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0130',
	'en_US',
	'W',
	'Shipping point deadline of details and shipping point deadline of breakdown of details do not match.\nSpecify the same shipping point deadline for details and breakdown of details, or clear the shipping point deadline for details if breakdown of details includes multiple shipping point deadlines.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0131' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0131',
	'en_US',
	'W',
	'Version No. for details and version No. for breakdown of details do not match.\nSpecify the same version No. for details and breakdown of details, or clear the version No. for details if breakdown of details includes multiple version Nos.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0132' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0132',
	'en_US',
	'W',
	'Specify the qty. less than or equal to the purchased qty. for recording after purchase.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0133' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0133',
	'en_US',
	'W',
	'Cannot enter since the target sales order is not approved.\nSales order No.: {1}\nApproval status type: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0135' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0135',
	'en_US',
	'W',
	'In the case of simultaneous recording, enter the same date for the receipt date and recording date of all the receipt results included in the same sales result.\nSales result No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0136' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0136',
	'en_US',
	'W',
	'In the case of simultaneous recording, set the same date for the receipt date of all the receipt results included in the same sales result and then cancel it.\nSales result No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0137' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0137',
	'en_US',
	'W',
	'Cannot update since the target sales result details do not exist.\nSales result details No.: {1}\nSales result details sequence number: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0138' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0138',
	'en_US',
	'W',
	'Not entered in the lot management information.\nItem: {1}\nLot No.: {2}\nSublot No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0139' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0139',
	'en_US',
	'W',
	'The Approval status type cannot be updated since approval is in progress.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0140' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0140',
	'en_US',
	'W',
	'For configuration management items, enter the configuration on the Configuration/Specification Entry screen.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0141' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0141',
	'en_US',
	'W',
	'There are components whose unit price is not set. Specify the unit price of the components on the Configuration/Specification Entry screen.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0142' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0142',
	'en_US',
	'W',
	'Specify the specification when SEIBAN No. is specified.\nSEIBAN No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0143' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0143',
	'en_US',
	'W',
	'The configuration cannot be revised since the qty. that can be copied from the quotation has not been met.\nQuotation row No.: {1}\nPossible copy qty.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0144' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0144',
	'en_US',
	'W',
	'If there are details that have divided shipping schedules, assortment shipment cannot be set.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0145' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0145',
	'en_US',
	'W',
	'Cannot specify the Assortment G No. in details with split shipping schedules.\nSales order details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0146' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0146',
	'en_US',
	'W',
	'For consignment shipment, you cannot specify a customer that is for invoice transaction.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0147' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0147',
	'en_US',
	'W',
	'For consignment shipment, you cannot specify a foreign delivery destination.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0148' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0148',
	'en_US',
	'W',
	'Cannot specify a domestic/foreign combination to customer / delivery destination.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0149' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0149',
	'en_US',
	'W',
	'The delivery destination name is required for miscellaneous delivery destination. \n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0150' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0150',
	'en_US',
	'W',
	'Zip code is required for domestic miscellaneous delivery destination.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0151' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0151',
	'en_US',
	'W',
	'Address 1 is required for miscellaneous delivery destination.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0152' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0152',
	'en_US',
	'W',
	'Receiving point name is required for miscellaneous receiving point.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0153' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0153',
	'en_US',
	'W',
	'Receiving point zip code is required for domestic miscellaneous delivery destination.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0154' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0154',
	'en_US',
	'W',
	'Address 1 is required for miscellaneous delivery destination.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0155' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0155',
	'en_US',
	'W',
	'Cannot enter MRO supply item for consignment shipment.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0156' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0156',
	'en_US',
	'W',
	'Item name is required for miscellaneous item.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0157' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0157',
	'en_US',
	'W',
	'Cannot update the sales order since it has been approved.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0158' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0158',
	'en_US',
	'W',
	'Cannot change items in the details that include the canceled shipping schedule.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0159' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0159',
	'en_US',
	'W',
	'Cannot change unit in the details that include the canceled shipping schedule.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0160' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0160',
	'en_US',
	'W',
	'Cannot be deleted since subsequent work is ongoing.\nSales order details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0161' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0161',
	'en_US',
	'W',
	'Cannot cancel since the approval status is either primary approval or final approval.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0162' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0162',
	'en_US',
	'W',
	'Additional data cannot be imported since the approval status is either primary approval or final approval.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0163' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0163',
	'en_US',
	'W',
	'Sales order details of direct delivery cannot be canceled after proceeding to sales recording.\nSales order details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0164' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0164',
	'en_US',
	'W',
	'Sales order details whose Order type is targeted for shipping order cannot be canceled after proceeding to shipping order.\nSales order details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0165' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0165',
	'en_US',
	'W',
	'Sales order details whose Order type is not targeted for shipping order cannot be canceled after proceeding to shipping result.\nSales order details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0166' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0166',
	'en_US',
	'W',
	'No records with default turned on are entered in the Sales Order Allocation master.\nDistribution group cd.: {1}\nItem shipping group cd.: {2}\nWG cd.: {3}\nAllocation location cd.: {4}\nAllocation distribution group cd.: {5}\nGross allocation location group cd.: {6}\n{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0167' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0167',
	'en_US',
	'W',
	'Cannot acquire the supplier data at the time of direct delivery from the Item Details master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0168' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0168',
	'en_US',
	'W',
	'Cannot update data for approval since an order or shipping has been entered for the sales order.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0169' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0169',
	'en_US',
	'W',
	'Cannot update since the sales result (sales discount / Sales markup) to be approved does not exist.\nSales result No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0171' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0171',
	'en_US',
	'W',
	'This specified sales order info. has been canceled.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0172' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0172',
	'en_US',
	'W',
	'Not entered in the Sales Order Allocation master.\nDistribution group cd.: {1}\nItem shipping group cd.: {2}\nWG cd.: {3}\nAllocation location cd.: {4}\nAllocation distribution group cd.: {5}\nGross allocation location group cd.: {6}\n{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0173' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0173',
	'en_US',
	'W',
	'Cannot acquire quotation details corresponding to the sales order details.\nSales order details No.: {1}\nQuotation details No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0174' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0174',
	'en_US',
	'W',
	'Not the location that has been entered in the Sales Order Allocation master.\nDelivery destination cd.: {1}\nReceiving point cd.: {2}\nSales dept. cd.: {3}\nBase date: {4}\nItem: {5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0175' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0175',
	'en_US',
	'W',
	'For market release decision, specify the lot No. on the Purchase Delivery Date Adjustment Entry screen in advance.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0176' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0176',
	'en_US',
	'W',
	'Cannot enter advance received with currency that is different from transaction currency at the time of sales order.\nSales order No.: {1}\nTransaction currency cd. at sales order: {2}\nTransaction currency cd. for advance received: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0177' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0177',
	'en_US',
	'I',
	'The sales unit price is not set or is zero.\nItem: {1}\nCustomer cd.: {2}\nCurrency cd.: {3}\nUnit cd.: {4}\nSales month: {5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0178' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0178',
	'en_US',
	'W',
	'Cannot cancel the specified sales project No. since it has already been entered for quotation.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0179' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0179',
	'en_US',
	'W',
	'Cannot cancel the specified sales project No. since it has already been entered for sales order.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0181' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0181',
	'en_US',
	'W',
	'There is an overlapping period in the start and end months. Autosizing could not be done since the start and end months are the same.\n{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0182' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0182',
	'en_US',
	'W',
	'Cannot change or cancel the purchase schedule since the invoice has been entered.\nPurchase schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0183' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0183',
	'en_US',
	'W',
	'Not entered in the Item Details master.\nItem: {1}\nWG cd.: {2}\nSupplier cd.: {3}\nMaker cd.: {4}\nMaster application date: {5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0184' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0184',
	'en_US',
	'W',
	'The specified SEIBAN No.1 is linked to another sales project No.\nAssign a new SEIBAN No. 1 or delete the linkage on the Sales Project Entry screen.\nSEIBAN No.1: {1}\nAlready linked sales project No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0185' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0185',
	'en_US',
	'W',
	'Specify different values for forecast start period and forecast end period.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0186' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0186',
	'en_US',
	'W',
	'Cannot be corrected except for the Cancel remaining since the receipt is already completed.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0187' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0187',
	'en_US',
	'W',
	'When canceling the remaining processing or releasing the cancellation of the remaining processing, you cannot create, correct, or cancel other columns at the same time.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0188' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0188',
	'en_US',
	'W',
	'Cannot cancel the remaining return schedule if it has unreceived.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0191' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0191',
	'en_US',
	'I',
	'Starting the sales order aggregation processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0192' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0192',
	'en_US',
	'I',
	'The sales order aggregation processing has completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0193' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0193',
	'en_US',
	'W',
	'Requested location is not entered in the Item Details master.\nItem: {1}\nRequested location cd.: {2}\nWG cd.: {3}\nMaster application date: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0194' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0194',
	'en_US',
	'W',
	'Sales orders from the specified customer are prohibited.\nCustomer cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0195' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0195',
	'en_US',
	'W',
	'Cannot enter details only with the Order type "2: Without picking". Select "3: Excluded from order" or enter including details with "1: With picking."');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0196' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0196',
	'en_US',
	'W',
	'Sales orders for the specified items are prohibited.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0197' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0197',
	'en_US',
	'W',
	'For consignment shipment, you cannot specify the customer that is for invoice transaction.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0198' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0198',
	'en_US',
	'W',
	'Cannot update since one of the following has been entered: Shipping order, shipping result,\ninvoice, sales result.\nSales order details No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0199' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0199',
	'en_US',
	'W',
	'Cannot be deleted since one of the following has been entered: Shipping order, shipping result,\ninvoice, sales result.\nSales order details No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0200' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0200',
	'en_US',
	'W',
	'Cannot cancel the remaining processing since one of the following has been entered: Shipping order,\nshipping result, invoice, sales result.\nSales order details No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0201' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0201',
	'en_US',
	'W',
	'Sales order details cannot be added since the invoice has been entered.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0202' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0202',
	'en_US',
	'W',
	'Cannot cancel since one of the following has been entered: Shipping order, shipping result,\ninvoice, sales result.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0203' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0203',
	'en_US',
	'W',
	'Cannot cancel since it includes the canceled sales order details.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0204' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0204',
	'en_US',
	'W',
	'Not all details for the invoice are subject to be updated. In invoice transaction, update the invoice with all details displayed.\nInvoice No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0206' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0206',
	'en_US',
	'W',
	'Cannot enter the delivery order received since the invoice has been entered.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0207' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0207',
	'en_US',
	'W',
	'The values for header columns in the customers forecast information file do not match. {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0208' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0208',
	'en_US',
	'W',
	'Cannot change the Quotation type to "Creating" if the Approval status type is primary approval or final approval.\nChange the status to "Creating" after canceling the approval.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0209' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0209',
	'en_US',
	'W',
	'Failed order cannot be turned on if you change the Quotation type to "Creating".');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0215' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0215',
	'en_US',
	'W',
	'If some qty. for the sales order has been canceled, you cannot cancel the remaining qty.\nSales order details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0216' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0216',
	'en_US',
	'W',
	'Cannot cancel since the shipping schedule corresponding to the delivery order has been firmed.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0217' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0217',
	'en_US',
	'W',
	'Cannot correct the qty. since the shipping schedule corresponding to the delivery order has been firmed.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0218' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0218',
	'en_US',
	'W',
	'Cannot correct the desired delivery date and time since the shipping schedule corresponding to the delivery order has been firmed.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0219' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0219',
	'en_US',
	'W',
	'Cannot enter the record since it already exists with the same receiving date.\nCustomer: {1}\nDelivery destination: {2}\nDept. in charge: {3}\nPIC: {4}\nSales project No.: {5}\nReceiving Date: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0220' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0220',
	'en_US',
	'W',
	'The delivery order cannot be applied to shipping schedule since a firmed shipping schedule exists.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0221' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0221',
	'en_US',
	'W',
	'For customers who are not included in invoice transaction, enter "2: Without stopover" for the Receiving point stopover type.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0222' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0222',
	'en_US',
	'W',
	'Cannot enter the sales order details for the direct delivery if invoice No. is specified.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0223' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0223',
	'en_US',
	'W',
	'Specify "Do not split" for the Shipping schedule split type if invoice No. is specified.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0224' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0224',
	'en_US',
	'W',
	'When invoice No. is specified, you must specify shipping distribution G.\nIf you cannot specify it, see the Sales Order Allocation master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0225' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0225',
	'en_US',
	'W',
	'Cannot add sales order details with specified invoice No. since the shipping order has been done.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0226' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0226',
	'en_US',
	'W',
	'Cannot enter with specified invoice No. since there are several delivery destinations for sales order details.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0227' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0227',
	'en_US',
	'W',
	'Cannot enter with specified invoice No. since there are several receiving points for sales order details.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0228' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0228',
	'en_US',
	'W',
	'Cannot receive a delivery order if you specify invoice No. at the time of sales order.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0229' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0229',
	'en_US',
	'W',
	'Total qty. of shipping schedules for delivery order received does not correspond to the qty. of delivery order received.\nDelivery order received No.: {1}\nShipping schedule qty. total: {2}\nDelivery order received qty.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0230' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0230',
	'en_US',
	'W',
	'The replied qty. and the corresponding the total qty. of shipping schedules do not match.\nReplied qty.: {1}\nShipping schedule qty. total: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0231' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0231',
	'en_US',
	'W',
	'Cannot correct/cancel the sales result since the shipping schedule is divided.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0232' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0232',
	'en_US',
	'W',
	'Cannot enter with specified invoice No. since there are several shipping distributions G for sales order details.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0233' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0233',
	'en_US',
	'W',
	'Adjust shipping schedule within the range of the qty. of sales keeping customer inventory.\nSales result details No.: {1}\nQty. before adjustment.: {2}\nAdjusted qty.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0234' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0234',
	'en_US',
	'W',
	'Cannot correct/cancel the order details or cancel the remaining order details since the sales keeping customer inventory has already been entered.\nSales order details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0235' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0235',
	'en_US',
	'W',
	'Cannot enter since the shipping schedule base unit qty. cannot be converted to the SKU qty. of the sales keeping customer inventory.\nShipping schedule No.: {1}\nBase unit qty.: {2}\nSKU: {3}\nConversion base qty.: {4}\nUnit conversion factor: {5}\nNumber of decimal places: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0236' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0236',
	'en_US',
	'W',
	'Cannot specify consignment shipment and sales keeping customer inventory at the same time.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0237' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0237',
	'en_US',
	'W',
	'For sales keeping customer inventory, you cannot specify a customer that is for invoice transaction.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0238' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0238',
	'en_US',
	'W',
	'When the Assortment type is set to "2: Assort" and assortment G No. is set in the details, specify the same values for the following items in the details of the same assortment G No.: Shipping distribution G, delivery destination, and receiving point.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0239' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0239',
	'en_US',
	'W',
	'Consignment grading in details and consignment grading of breakdown of details do not match.\nSpecify the same consignment grading for details and breakdown of details, or clear the consignment grading for details if breakdown of details includes multiple consignment gradings.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0240' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0240',
	'en_US',
	'W',
	'Cannot coexist "Simultaneous recording" and "Not simultaneous recording".\nFinish all purchase recordings before sales recording.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0241' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0241',
	'en_US',
	'W',
	'Cannot enter all direct delivery sales if a partial purchase of the sales order qty. is made.\nPurchase all of them or cancel the purchase before sales recording.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0242' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0242',
	'en_US',
	'W',
	'The qty. cannot be less than the copy qty.\nQuotation details No.: {1}\nQty.: {2}\nCopy qty.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0243' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0243',
	'en_US',
	'W',
	'Cannot cancel since there are copied details.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0244' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0244',
	'en_US',
	'W',
	'Search again and re-aggregate it since the sales plan for each Input PIC has been changed.\nPlan item: {1}\nItem: {2}\nSales month: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0245' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0245',
	'en_US',
	'W',
	'The total amount cannot be negative.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0246' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0246',
	'en_US',
	'W',
	'Cannot enter the re-shipment for an unshipped sales order.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0247' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0247',
	'en_US',
	'W',
	'Cannot enter the shipping return since the invoice has been entered. Cancel the invoice.\nI/V No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0248' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0248',
	'en_US',
	'W',
	'Partial details and partial qty. cannot be entered for shipping return that corresponds to invoice unit shipping.\nI/V No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0249' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0249',
	'en_US',
	'W',
	'Cannot cancel the remaining shipping return schedule for invoice unit shipping.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0250' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0250',
	'en_US',
	'W',
	'Cannot enter since a return schedule for the same delivery note details has already been entered.\nAlready entered sales return schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0251' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0251',
	'en_US',
	'W',
	'It is a miscellaneous item to manage inventory, however it has not been entered in the Miscellaneous Item master.\nItem: {1}\nSEIBAN No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0252' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0252',
	'en_US',
	'W',
	'Data for the specified sales order No. does not exist, or it is not a sales order for consignment shipping.\nSales order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0253' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0253',
	'en_US',
	'W',
	'Data for the specified sales order No. or sales order details No. does not exist, or it is not a sales order details for consignment shipping.\nSales order No.: {1}\nSales order details No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0254' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0254',
	'en_US',
	'W',
	'Invoice is not entered.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0255' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0255',
	'en_US',
	'W',
	'Cannot change or cancel the qty. of the purchase result since it has already been sold.\nPurchase result details No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0256' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0256',
	'en_US',
	'W',
	'Cannot change or cancel the qty. of the purchase result since the invoice has already been entered.\nPurchase result details No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0257' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0257',
	'en_US',
	'W',
	'If the Create lot for details is turned on, specify the same value for vendor lot No. in breakdown of details.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0258' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0258',
	'en_US',
	'W',
	'Purchase active ingredient in a details row is different from the total purchase active ingredient in a row for breakdown of details.\nDetails row qty.: {1}\nTotal qty. of details row: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0259' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0259',
	'en_US',
	'W',
	'Cannot enter since this entry causes a slip split and unplanned details will be in another slip.\nEnter unplanned sales on the Sales Result Entry screen.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0260' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0260',
	'en_US',
	'W',
	'Cannot enter the specified sales result GR/GI qty. since it exceeds purchase result GR/GI remaining qty.\nTotal qty. of sales result GR/GI: {1}\nPurchase result GR/GI remaining qty.: {2}\nPurchase result GR/GI No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0261' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0261',
	'en_US',
	'W',
	'Cannot correct sales results that were recorded at the same time as shipping result.\nSales result No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0262' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0262',
	'en_US',
	'W',
	'Cannot cancel sales results that were recorded at the same time as shipping result.\nSales result No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0263' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0263',
	'en_US',
	'W',
	'Cannot correct sales results that were recorded at the same time as export result.\nSales result No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0264' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0264',
	'en_US',
	'W',
	'Cannot cancel sales results that were recorded at the same time as export result.\nSales result No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0265' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0265',
	'en_US',
	'W',
	'Consignment location of details and consignment location of breakdown of details do not match.\nSpecify the same consignment location for details and breakdown of details, or clear the consignment location for details if breakdown of details includes multiple consignment locations.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0266' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0266',
	'en_US',
	'W',
	'Consignment rack/line of details and consignment rack/line of breakdown of details do not match.\nSpecify the same consignment rack/line for details and breakdown of details, or clear the consignment rack/line for details if breakdown of details includes multiple consignment rack/lines.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0267' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0267',
	'en_US',
	'W',
	'Cannot enter since there are several return-to information in details.\nUse the same return-to information, or delete the row for details with a different Return-to and enter as another sales return.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0268' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0268',
	'en_US',
	'W',
	'Cannot specify lot if a purchase request is created.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0269' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0269',
	'en_US',
	'W',
	'Cannot record sales returns for partial details or partial qty. if sales return schedule is copied and is subject to invoice transaction.\nSales return schedule No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0270' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0270',
	'en_US',
	'W',
	'Version No. for details and version No. for breakdown of details do not match.\nSpecify the same version No. for details and breakdown of details, or clear the version No. for details if breakdown of details includes multiple version Nos.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0271' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0271',
	'en_US',
	'W',
	'Not entered in the lot management info.\nItem: {1}\nLot No.: {2}\nSublot No.: {3}\nVersion No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0272' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0272',
	'en_US',
	'W',
	'Cannot delete the shipping schedule or cancel the remaining shipping schedule and request readjustments to the shipping request at the same time.\nShipping schedule No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0273' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0273',
	'en_US',
	'W',
	'Cannot enter since there is no target item that divides the plan item qty. / amount.\nDept. cd.: {1}\nPlan item cd.: {2}\nSales month: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0274' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0274',
	'en_US',
	'W',
	'Cannot enter since the location has not been determined.\nEnter a location on the Sales Result Entry screen or specify location on the Shipping Schedule Change Entry screen.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0275' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0275',
	'en_US',
	'W',
	'Cannot cancel since the remaining shipping schedule that corresponds to delivery order has been canceled.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0276' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0276',
	'en_US',
	'W',
	'Cannot correct qty. since the remaining shipping schedules that correspond to the delivery order has been canceled.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0277' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0277',
	'en_US',
	'W',
	'Cannot correct the desired delivery time since the remaining shipping schedules that correspond to the delivery order has been canceled.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0278' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0278',
	'en_US',
	'W',
	'Cannot enter since the total qty. of delivery order received exceeds the qty. of sales order details.\nTotal qty. of delivery order received: {1}\nSales order details qty.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0279' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0279',
	'en_US',
	'I',
	'Sales order promising result has been deleted since shipping schedule has been changed.\nEnter a result again if necessary.\nSales order details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0280' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0280',
	'en_US',
	'W',
	'Sales schedule with multiple breakdowns of details cannot be entered on the Sales Result List Entry screen if it contains at least part of the entered sales results.\nEnter on the Sales Result Entry screen or Direct Delivery Sales Result Entry screen.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0281' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0281',
	'en_US',
	'W',
	'Cannot change the Sales order type to temporary sales order since sales order for direct delivery has been entered.\nSales order No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0282' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0282',
	'en_US',
	'W',
	'Cannot specify lot No. and sublot No. if the Allocation range type is set to "2: Gross allocation".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0283' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0283',
	'en_US',
	'W',
	'Cannot change the consignment.\nSales order No.: {1}\nSales order details No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0284' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0284',
	'en_US',
	'W',
	'A data conflict occurs during data update.\nRe-execute the process.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0290' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0290',
	'en_US',
	'W',
	'Specified invoice No. already exists.\nInvoice No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0291' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0291',
	'en_US',
	'W',
	'To correct the sales return of direct delivery which causes slip split, enter on the Sales Return Entry screen.\nSales result No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0292' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0292',
	'en_US',
	'W',
	'Cannot specify "2: Without picking" for the Order type if the Sales keeping customer inventory is turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0293' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0293',
	'en_US',
	'W',
	'Sales reason is required if unit price is 0.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0294' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0294',
	'en_US',
	'W',
	'Cannot enter since there are several return-to information for the same purchase results.\nUse the same return-to information, or delete the row for details with a different Return-to and enter as another sales return.\nPurchase result No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0295' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0295',
	'en_US',
	'W',
	'Cannot enter since the specified unit cannot be converted to the unit for shipping.\nUnit: {1}\nQty.: {2}\nBase unit: {3}\nBase unit qty.: {4}\nUnit for shipping: {5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0401' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0401',
	'en_US',
	'W',
	'Cannot ship from shipping distribution group specified in shipping schedule to changed receiving point distribution group. Check the Sales Order Allocation master.\nWG cd.: {1}\nItem shipping group cd.: {2}\nShipping distribution group cd.: {3}\nReceiving point distribution group cd.: {4}\nReceiving point cd.: {5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0402' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0402',
	'en_US',
	'W',
	'Cannot ship from shipping distribution group specified in shipping schedule to changed delivery destination distribution group. Check the Sales Order Allocation master.\nWG cd.: {1}\nItem shipping group cd.: {2}\nShipping distribution group cd.: {3}\nDelivery destination distribution group cd.: {4}\nDelivery destination cd.: {5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0403' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0403',
	'en_US',
	'W',
	'Cannot update since the specified delivery destination does not exist in the Sales Order Allocation Grading master.\nCustomer cd.: {1}\nDelivery destination cd.: {2}\nGrading cd.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0404' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0404',
	'en_US',
	'I',
	'Details with the Order type "2: Without picking" cannot be shipped yet.\nTo ship details with the Order type “2: Without picking”, specify the following receiving point for sales order details with the Order type “1: With picking” or shipping schedule.\nSales order No.: {1}\nSales order details No.: {2}\nReceiving point cd.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0405' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0405',
	'en_US',
	'I',
	'Details with the Order type "2: Without picking" cannot be shipped yet.\nTo ship details with the Order type “2: Without picking”, specify the following delivery destination for sales order details with the Order type “1: With picking” or shipping schedule.\nSales order No.: {1}\nSales order details No.: {2}\nDelivery destination cd.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0406' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0406',
	'en_US',
	'W',
	'No records whose request destination scheduled GI date, which is calculated from the scheduled shipping date and time, is within the application period are entered in the Item Details master.\nItem: {1}\nRequested location cd.: {2}\nWG cd.: {3}\nScheduled shipping date and time: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0407' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0407',
	'en_US',
	'W',
	'No records whose scheduled PO date, which is calculated from the scheduled shipping date, is within the applicable period are entered in the Item Details master.\nItem: {1}\nWG cd.: {2}\nBOM pattern: {3}\nMfg. location cd.: {4}\nSupplier cd.: {5}\nMaker cd.: {6}\nScheduled shipping date: {7}\n{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0408' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0408',
	'en_US',
	'W',
	'No records whose scheduled PO date, which is calculated from the desired delivery date, is within the applicable period are entered in the Item Details master.\nItem: {1}\nWG cd.: {2}\nBOM pattern: {3}\nMfg. location cd.: {4}\nSupplier cd.: {5}\nMaker cd.: {6}\nDesired delivery date: {7}\n{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0296' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0296',
	'en_US',
	'W',
	'Could not acquire the allocation location from the Sales Order Allocation master. See the setting of the Location master.\nLocation cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0297' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0297',
	'en_US',
	'W',
	'Could not acquire the shipping location from the Sales Order Allocation master. See the setting of the Location master.\nLocation cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0298' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0298',
	'en_US',
	'W',
	'Could not acquire the allocation distribution G from the Sales Order Allocation master. See the setting of the Distribution Group master.\nDistribution group cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0299' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0299',
	'en_US',
	'W',
	'Could not acquire the gross allocation location G from the Sales Order Allocation master. See the setting of the Gross Allocation Location Group master.\nGross allocation location group cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0301' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0301',
	'en_US',
	'W',
	'An item in other sales result details linked to the same sales result header is not entered as a valid item in the item master.\nSales result details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0302' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0302',
	'en_US',
	'W',
	'In the case of a shipping return with an entered invoice, an upper limit on the qty. is the difference between the qty. entered in the shipping result and the one entered in the invoice.\nUpper limit of the qty.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0303' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0303',
	'en_US',
	'W',
	'Target lot does not exist.\nItem: {1}\nLot No.: {2}\nSublot No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0304' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0304',
	'en_US',
	'W',
	'Cannot change the recording date, sales PIC, and sales dept. since the sales closing has been canceled.\nRecording date before correction: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0305' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0305',
	'en_US',
	'W',
	'Cannot correct the amount to be less than the advance received billing amount since the subsequent task has already been performed.\nAdvance received billing amount: {1}\nTotal advance received payment amount: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0306' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0306',
	'en_US',
	'W',
	'Cannot change the Advance received control shipping type to "Shipping available" since the advance received exists.\nCancel the advance received payment first.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0307' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0307',
	'en_US',
	'W',
	'Cannot cancel since the advance received exists.\nCancel the advance received payment first.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0308' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0308',
	'en_US',
	'W',
	'Version No. for details and version No. for breakdown of details do not match.\nSpecify the same version No. for details and breakdown of details, or clear the version No. for details if breakdown of details includes multiple version Nos.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0309' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0309',
	'en_US',
	'W',
	'The specified recording data is incorrect.\nMake sure that the PIC Authority master is set for the sales PIC and sales department with the specified recording date.\nRecording date: {1}\nSales PIC cd.: {2}\nSales dept. cd.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0310' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0310',
	'en_US',
	'W',
	'Cannot enter sales order details that have different values in any of the shipping distribution G, the delivery destination, or the receiving point when the Assortment type is set to "2: Assort".');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0311' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0311',
	'en_US',
	'W',
	'When specifying the Assortment G No., specify the same value in the shipping distribution G, the delivery destination, and the receiving point in the details with the same Assortment G No. \n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0501' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0501',
	'en_US',
	'W',
	'The previously entered data is not reflected in GA.\nResend the unreflected sales slip from the Sales Slip IF screen.\nData No.: {1}\nSales slip No.: {2}\nInvoice No.: {3}\nSales result No.: {4}\nSupply result No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0502' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0502',
	'en_US',
	'W',
	'Could not acquire the settlement method code used when sending a sales slip for chargeable supply.\nSee the setting of the System Parameter master.\nParameter key: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0503' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0503',
	'en_US',
	'I',
	'Starting the sales result recording processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0504' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0504',
	'en_US',
	'I',
	'The sales result recording processing completed.\nTo process: {1}\nNumber of entries: {2}\nNumber of errors: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0505' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0505',
	'en_US',
	'W',
	'Cannot record the sales result since it is prohibited from sales/shipping.\nSee the setting of the BP Prohibit master.\nCustomer cd.: {1}\nSales date: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0506' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0506',
	'en_US',
	'W',
	'Cannot record the sales result since the scheduled payment receipt date is not specified.\nSales order No.: {1}\nInvoice No.: {2}\nNumber of details: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0507' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0507',
	'en_US',
	'W',
	'The corresponding sales result is not entered in GA.\nYou cannot correct or cancel data that is not entered in GA.\nSales result No.: {1}\nInvoice No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0508' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0508',
	'en_US',
	'W',
	'The corresponding supply result is not entered in GA.\nYou cannot correct or cancel data that is not entered in GA.\nSupply result No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0509' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0509',
	'en_US',
	'W',
	'Cannot record the sales result since it is prohibited from sales/shipping.\nSee the setting of the Item Prohibit master.\nItem: {1}\nSales date: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0510' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0510',
	'en_US',
	'W',
	'The setting of the Payment Receipt Schedule Control master is invalid. Could not calculate the scheduled payment receipt date to be linked to GA.\nSet the same Site type for the WG as of the recording date and the billing closing day.\n\nWG as of the recording date: {1}\nWG as of the billing closing day: {2}\nBilling customer: {3}\nCurrency: {4}\nAmount: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0511' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0511',
	'en_US',
	'W',
	'The setting of the Payment Receipt Schedule Control master is invalid. Could not calculate the scheduled payment receipt date to be linked to GA.\nIf the Billing closing type of the billing customer is "Billing by select manual", or it is "Each time sales invoicing" and the billing customer is not for invoice transaction, specify "Date" in the Site type.\nWG: {1}\nBilling customer: {2}\nCurrency: {3}\nAmount: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0512' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0512',
	'en_US',
	'W',
	'The relationship between the shipping schedule and the order promising is incorrect. Click the Apply delivery schedule button to enter again.\nSales order details No.: {1}\nSales order promising No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0513' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0513',
	'en_US',
	'W',
	'PO details whose Lot No. numbering type is "Manual" and lot No. or sublot No. is not specified are included.\nSpecify a lot No. or sublot No. in the Purchase Delivery Date Adjustment Entry or the Purchase Result Entry before executing the Sales Result Recording batch.\nSales order No.: {1}\nSales order details No.: {2}\nPO No.: {3}\nPO details No.: {4}\nCustomer cd.: {5}\nItem cd.: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0514' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0514',
	'en_US',
	'W',
	'For shipping returns, the upper limit of the qty. is up to the unsold qty.\nQty. (base unit): {1}\nUnsold  qty. (base unit): {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0515' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0515',
	'en_US',
	'W',
	'Cannot change the following columns at the same time as canceling the remaining processing or releasing the canceled remaining processing.\n - Customer\n - Sales PIC\n - Sales dept.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0518' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0518',
	'en_US',
	'W',
	'When a purchase invoice has already been entered, the following columns cannot be updated.\nHeader columns: {1}\nSales order No.: {2}\nSales order details No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0519' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0519',
	'en_US',
	'W',
	'When a purchase invoice has already been entered, the following columns cannot be updated.\nDetails columns: {1}\nSales order No.: {2}\nSales order details No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0601' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0601',
	'en_US',
	'W',
	'Specify the Sales order details No. or the following columns to identify sales order details that correspond to the delivery order received.\nCustomer cd., Customer order No., Customer order details No.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0602' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0602',
	'en_US',
	'W',
	'Cannot identify sales order details that correspond to the delivery order received.\nSales order details No.: {1}\nCustomer cd.: {2}\nCustomer order No.: {3}\nCustomer order details No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0603' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0603',
	'en_US',
	'W',
	'Cannot enter since the location has not been determined.\nUse the Sales Result Entry screen.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0604' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0604',
	'en_US',
	'W',
	'When entering a new invoice on the Sales Result Entry screen, you cannot specify a different delivery destination for each detail.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0605' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0605',
	'en_US',
	'W',
	'Could not acquire sales department. Import by specifying the Sales dept. cd., or enter the data in the Customer PIC master.\nCustomer: {1}\nApplication date: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0606' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0606',
	'en_US',
	'W',
	'Could not acquire sales dept. based on sales PIC. Specify sales dept. for the PIC Authority master.\nSales PIC: {1}\nApplication date: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0607' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0607',
	'en_US',
	'W',
	'For miscellaneous items, the item name is required.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0608' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0608',
	'en_US',
	'W',
	'Could not acquire the default grading.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0609' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0609',
	'en_US',
	'W',
	'Number of decimal places in the qty. is incorrect.\nQty.: {1}\nNumber of decimal places: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0610' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0610',
	'en_US',
	'W',
	'Number of decimal places in the unit price is incorrect.\nUnit price: {1}\nNumber of decimal places: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0611' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0611',
	'en_US',
	'W',
	'The specified unit price is different from the one in the master.\nTo enter a value different from the master, turn on the Manual price entry.\nSpecified unit price: {1}\nMaster unit price: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0612' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0612',
	'en_US',
	'W',
	'Delivery destination name is required in case of miscellaneous delivery destination.\nDelivery destination: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0613' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0613',
	'en_US',
	'W',
	'Receiving point name is required in case of miscellaneous receiving point.\nReceiving point: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0614' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0614',
	'en_US',
	'W',
	'If the discount amount is set, the discount reason is required. Enter the reason for sales adjustment in the Business Reason master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0615' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0615',
	'en_US',
	'W',
	'If an item for asset management and its unit price is 0, sales reason of sales other accounting is required.\nEnter sales reason of sales other accounting in the Business Reason master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0616' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0616',
	'en_US',
	'W',
	'If an item is not subject to asset management and its unit prince is 0, the sales reason other than the sales other accounting is required.\nEnter the sales reason other than the sales other accounting in the Business Reason master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0617' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0617',
	'en_US',
	'W',
	'If an item for asset management and its unit price is 0, the charged dept. is required.\nTo set up a sales dept. as a charged dept., turn on the "Charged dept." in the Dept. master.\nItem: {1}\nSales dept.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0618' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0618',
	'en_US',
	'W',
	'Receiving point is required. Specify the receiving point to import, or enter the standard receiving point in the Distribution Control master.\nDelivery destination: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0619' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0619',
	'en_US',
	'W',
	'The specified temporary unit price is different from the one in the master.\nTo enter a value different from the master, turn on the Manual price entry.\nSpecified temporary unit price: {1}\nMaster temporary unit price: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0620' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0620',
	'en_US',
	'W',
	'Could not import since a sales unit price which is an initial value of invoice unit price could not be acquired.\nIf the item is subject to an invoice transaction and its unit price is 0, the invoice unit price is required.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0621' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0621',
	'en_US',
	'W',
	'Cannot delete since the Approval status type is Preliminary Approved or Final Approved.\nSales order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0622' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0622',
	'en_US',
	'W',
	'You cannot set values for both the requested location and the supplier.\nSet either one of them.\nRequested location cd.: {1}\nSupplier cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0623' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0623',
	'en_US',
	'W',
	'Cannot turn on the manual price entry because the Allow sales unit price change of the Item master and of the BP master are off.\nItem: {1}\nCustomer: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0624' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0624',
	'en_US',
	'W',
	'SEIBAN No. 1 is specified for an item whose SEIBAN No. 1 management type is "Do not manage".\nItem: {1}\nSEIBAN No. 1: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0625' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0625',
	'en_US',
	'W',
	'SEIBAN No. ２is specified for an item whose SEIBAN No.２ management type is "Do not manage".\nItem: {1}\nSEIBAN No.２: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0626' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0626',
	'en_US',
	'W',
	'SEIBAN No.３is specified for an item whose SEIBAN No.３management type is "Do not manage".\nItem: {1}\nSEIBAN No.３: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0627' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0627',
	'en_US',
	'W',
	'SEIBAN No.４is specified for an item whose SEIBAN No.４management type is "Do not manage".\nItem: {1}\nSEIBAN No.４: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0628' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0628',
	'en_US',
	'W',
	'The Allow without SEIBAN No. 1 is specified for an item whose SEIBAN No. 1 management type is "Do not manage" or "Manage (Required)".\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0629' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0629',
	'en_US',
	'W',
	'The Allow without SEIBAN No.２ is specified for an item whose SEIBAN No.２management type is "Do not manage" or "Manage (Required)".\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0630' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0630',
	'en_US',
	'W',
	'The Allow without SEIBAN No.３is specified for an item whose SEIBAN No.３management type is "Do not manage" or "Manage (Required)".\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0631' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0631',
	'en_US',
	'W',
	'The Allow without SEIBAN No.４is specified for an item whose SEIBAN No.４management type is "Do not manage" or "Manage (Required)".\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0632' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0632',
	'en_US',
	'W',
	'Could not identify the item from the specified customer item.\nSet the BP Item master or specify the item.\nMaster application date: {1}\nCustomer: {2}\nCustomer item: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0633' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0633',
	'en_US',
	'W',
	'Quotation No. is specified, however there are no details that can be copied.\nQuotation No.: {1}-{2}\nQuotation details No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0634' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0634',
	'en_US',
	'W',
	'Cannot change from a customer not subject to customer invoice to a customer subject to customer invoice.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0635' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0635',
	'en_US',
	'W',
	'Cannot specify "Without picking" for the Order type for inventory items.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0636' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0636',
	'en_US',
	'W',
	'Cannot process applicable sales result on this screen since it is a direct delivery sale.\nProcess it on the Sales Result List Entry screen.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0637' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0637',
	'en_US',
	'W',
	'To correct or cancel sales results for invoice transactions, search by Invoice No.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0638' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0638',
	'en_US',
	'W',
	'In sales result details linked with the same sales result No., you cannot specify a different Sales PIC cd., Sales dept. cd., and AR dept. cd. for each detail.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0639' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0639',
	'en_US',
	'W',
	'When adding a detail row subject to invoice, you cannot specify a different Sales PIC cd., Sales dept. cd., and AR dept. cd. from those in the entered details.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0640' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0640',
	'en_US',
	'W',
	'Cannot cancel the delivery order received since the invoice has been entered.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0641' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0641',
	'en_US',
	'W',
	'Cannot correct/cancel the sales order details or cancel the remaining sales order details since an invoice has been entered.\nSales order details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0642' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0642',
	'en_US',
	'I',
	'Sales will be recorded with the temporary unit price.\nTo change the temporary unit price to the actual unit price, modify the invoice.\nInvoice No.: {1}\nInvoice details No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0643' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0643',
	'en_US',
	'W',
	'The relationship between the shipping schedule and the order promising result is invalid. It should be updated in sales order details unit.\nSales order details No.: {1}\nSales order promising No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0644' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0644',
	'en_US',
	'W',
	'There is no shipping schedule linked to the order promising result. Delete the order promising result.\nSales order details No.: {1}\nSales order promising No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0645' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0645',
	'en_US',
	'W',
	'Could not acquire a tax.\nSee the settings of the Company master, BP master, and Item master.\nApplication date: {1}\nCustomer: {2}\nPlan item: {3}\nItem: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0646' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0646',
	'en_US',
	'W',
	'There are shipping schedules with Firm On and Off for the same delivery order received.\nUnify the value of Firm of the shipping schedules.\nDelivery order received No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0701' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0701',
	'en_US',
	'W',
	'Cannot process since there are multiple lots on the details where mixing Lot No. is prohibited.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0702' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0702',
	'en_US',
	'W',
	'Cannot process since there are multiple sublots on the details where mixing Sublot No. is prohibited.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0703' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBBL0703',
	'en_US',
	'W',
	'If the unit price is not zero, you cannot specify the sales reason for sales other accounting.\nUnit price: {1}\nSales reason: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCP0001',
	'en_US',
	'I',
	'The numbering SEIBAN No. process will be executed. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCP0002',
	'en_US',
	'W',
	'Specify the period to be within 93 days.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCP0003',
	'en_US',
	'W',
	'Specify the period to be within 60 months.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCP1001',
	'en_US',
	'W',
	'Cannot enter since mfg. order has not been re-exploded after any of the following columns have been changed.\n-Mfg. location\n-Order qty.\n-Output schedule qty.\n-Scheduled start date\n-Scheduled end date\n-SEIBAN No.\n-BOM pattern\n-Operation pattern');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCP1002',
	'en_US',
	'W',
	'Cannot enter since the schedule has not been re-exploded after any of the following columns have been changed.\n-Base unit qty.\n-Scheduled start date\n-Scheduled end date');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCP1004',
	'en_US',
	'W',
	'In order to recalculate, operations for the same operation order No. need to be processed at the same time.\nSelect all processes with the same Operation order No.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCP1005',
	'en_US',
	'W',
	'Cannot delete input items that exist in the BOM master.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCP1006',
	'en_US',
	'W',
	'Turn on the check for lot or sublot.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCP1007',
	'en_US',
	'I',
	'The date calculation process will be executed. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCP1008',
	'en_US',
	'I',
	'The lot numbering process will be executed. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCP1009',
	'en_US',
	'I',
	'The re-explosion process will be executed. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCP1010',
	'en_US',
	'I',
	'The lot suggestion process will be executed. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCP1011',
	'en_US',
	'I',
	'The recalculation process will be executed. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCP1012',
	'en_US',
	'W',
	'Turn on the check box for the Re-explode for re-explode operation.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCP1013',
	'en_US',
	'W',
	'Turn on the check box either for input/man-hour/by-product.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCP1014',
	'en_US',
	'W',
	'Cannot re-explode the schedule since the Item Operation master has been changed.\nExecute re-explosion.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCP1015',
	'en_US',
	'I',
	'Operation order explosion process will be executed. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCP1016',
	'en_US',
	'I',
	'Item actual yield is lower than item min. yield.\nItem actual yield: {1}\nItem min. yield: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCP1017',
	'en_US',
	'I',
	'Item actual yield is higher than item max. yield.\nItem actual yield: {1}\nItem max. yield: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCP1018',
	'en_US',
	'I',
	'Operation actual yield is lower than operation min. yield.\nOperation actual yield: {1}\nOperation min. yield: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCP1019',
	'en_US',
	'I',
	'Operation actual yield is higher than operation max. yield.\nOperation actual yield: {1}\nOperation max. yield: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCP1020',
	'en_US',
	'W',
	'If there is an item with the Alternative item specification turned on for the same operation, alternative group, and alternative group sequence number, you cannot execute the lot suggestion for an item with the Alternative item specification turned off.\nTurn on the check box for the Alternative item specification or turn off the check box for the For lot suggestion.\nInput item: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCP1021',
	'en_US',
	'W',
	'Cannot enter since the same input schedule contains input results with the check boxes of the Cancel remaining turned on and off.\nTo cancel the remaining qty., turn on the check boxes of the Cancel remaining for all selected input results.\nInput item: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCP1022',
	'en_US',
	'W',
	'Cannot enter since the same man-hour schedule contains man-hour results with the check boxes of the Cancel remaining turned on and off.\nTo cancel the remaining qty., turn on the check boxes of the Cancel remaining for all selected man-hour results.\nMan-hour: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCP1023',
	'en_US',
	'I',
	'The standard active ingredient and the actual active ingredient do not match.\nDo you want to apply?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0001',
	'en_US',
	'W',
	'Only remarks and spare columns can be corrected since they have been firmed.\nRequirements No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0002',
	'en_US',
	'W',
	'Cannot cancel since it has been firmed.\nRequirements No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0003',
	'en_US',
	'W',
	'Cannot specify the item since it is not subject to SEIBAN No. management.\nItem: {1}\n{2}:{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0004',
	'en_US',
	'W',
	'The corresponding data is not exist in the Item Details master.\nItem: {1}\nWG cd.: {2}\n{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0005',
	'en_US',
	'W',
	'Entry of requirements are prohibited in the Item Prohibit master.\nItem: {1}\nDelivery date: {2}\nProhibit date: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0006',
	'en_US',
	'W',
	'The corresponding data is not exist in the Item Details master.\nItem: {1}\nWG cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0023',
	'en_US',
	'W',
	'Could not acquire prefix for MRP numbering. See the setting for prefix column in the WG master.\nWG: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0024',
	'en_US',
	'W',
	'There is a WG where MRP is not executed correctly.\nWG cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0025',
	'en_US',
	'W',
	'The prefix you tried to enter for MRP numbering has already been entered for another WG. Check the setting for prefix column in the WG master. \nWG cd.: {1}\nPrefix: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0026',
	'en_US',
	'W',
	'Could not execute MRP since the WG cd.: {1} is in scheduling.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0027' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0027',
	'en_US',
	'W',
	'MRP for the WG cd.: {1} has not been executed correctly.\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0028' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0028',
	'en_US',
	'I',
	'MRP for the WG cd.: {1} has been successfully completed.\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0029' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0029',
	'en_US',
	'W',
	'A new change No. has been added. Search again to confirm.\nMfg. order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0030' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0030',
	'en_US',
	'W',
	'Not entered in the Item Details master.\nItem: {1}\nBOM pattern: {2}\nMfg. location cd.: {3}\nSupplier cd.: {4}\nMaker cd.: {5}\nRequested location cd.: {6}\nWG cd.: {7}\nMaster application date: {8}\n{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0031' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0031',
	'en_US',
	'W',
	'WG specified for the order is not entered in the WG master as a WG having mfg. or distribution function.\nWG cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0032' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0032',
	'en_US',
	'W',
	'Cannot specify a storage location for WG that is different from the WG specified for the order.\nOrder WG cd.: {1}\nStorage location cd.: {2}\nStorage location WG cd.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0033' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0033',
	'en_US',
	'W',
	'Cannot specify a WG location where the storage location and the mfg. location are different.\nStorage location cd.: {1}\nStorage location WG cd.: {2}\nMfg. location cd.: {3}\nMfg. location WG cd.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0034' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0034',
	'en_US',
	'W',
	'Cannot specify a WG location where the storage location and the requested location are different.\nStorage location cd.: {1}\nStorage location WG cd.: {2}\nRequested location cd.: {3}\nRequested location WG cd.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0035' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0035',
	'en_US',
	'W',
	'Cannot specify a distribution G location where the storage location and the requested location are the same.\nStorage location cd.: {1}\nStorage location distribution group cd.: {2}\nRequested location cd.: {3}\nRequested location distribution group cd.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0036' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0036',
	'en_US',
	'W',
	'Cannot specify a WG location where the storage location and the requested location are the same.\nStorage location cd.: {1}\nRequested location cd.: {2}\nWG cd.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0037' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0037',
	'en_US',
	'W',
	'For item order with the Order type "1: Mfg.", the following are required: Scheduled mfg. start date, scheduled mfg. end date,\nscheduled storage completion date, available date.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0038' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0038',
	'en_US',
	'W',
	'For item order with the Order type "2. Purchase", the following are required: Scheduled PO date, scheduled storage completion date, scheduled acceptance date, available date.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0039' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0039',
	'en_US',
	'W',
	'For item order with the Order type "3. Subcontracting", the following are required: Scheduled mfg. start date, scheduled mfg. end date, scheduled PO date, scheduled storage completion date, scheduled acceptance date, available date.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0040' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0040',
	'en_US',
	'W',
	'For item order with the Order type "4. Transport", the following are required: Scheduled GI date, scheduled storage completion date, available date.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0041' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0041',
	'en_US',
	'W',
	'For item order with the Order type "5. Transport between WG", the following are required: Scheduled GI date, scheduled storage completion date, available date.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0042' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0042',
	'en_US',
	'W',
	'For item order to be inspected, scheduled inspection start date and scheduled inspection end date are required.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0043' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0043',
	'en_US',
	'W',
	'The relationship of the following dates is invalid: Scheduled mfg. start date, scheduled mfg. end date, scheduled storage completion date, and available date.\nScheduled mfg. start date: {1}\nScheduled mfg. end date: {2}\nScheduled storage completion date: {3}\nAvailable date: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0044' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0044',
	'en_US',
	'W',
	'The relationship of the following dates is invalid: Scheduled PO date, scheduled storage completion date, scheduled acceptance date, and available date.\nScheduled PO date: {1}\nScheduled storage completion date: {2}\nScheduled acceptance date: {3}\nAvailable date: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0045' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0045',
	'en_US',
	'W',
	'The relationship of the following dates is invalid: Scheduled PO date, scheduled mfg. start date, scheduled mfg. end date, scheduled acceptance date, scheduled storage completion date, and available date.\nScheduled PO date: {1}\nScheduled mfg. start date: {2}\nScheduled mfg. end date: {3}\nScheduled acceptance date: {4}\nScheduled storage completion date: {5}\nAvailable date: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0046' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0046',
	'en_US',
	'W',
	'The relationship of the following dates is invalid: Scheduled GI date, scheduled storage completion date, and available date.\nScheduled GI date: {1}\nScheduled storage completion date: {2}\nAvailable date: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0047' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0047',
	'en_US',
	'W',
	'The relationship of the following dates is invalid: Scheduled inspection start date, scheduled inspection end date, and available date.\nScheduled inspection start date: {1}\nScheduled inspection end date: {2}\nAvailable date: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0048' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0048',
	'en_US',
	'W',
	'The following date does not fulfill the relationship of: scheduled storage completion date ≤ scheduled inspection start date.\nScheduled storage completion date: {1}\nScheduled inspection start date: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0049' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0049',
	'en_US',
	'W',
	'Version No. is required since it is a version controlled item.\nItem: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0050' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0050',
	'en_US',
	'W',
	'Invalid version No.\nItem: {1}\nFactory/Distribution warehouse cd.: {2}\nVersion No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0051' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0051',
	'en_US',
	'W',
	'Cannot make a correction to change WG.\nItem order No.: {1}\nBefore change WG cd.: {2}\nAfter change WG cd.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0052' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0052',
	'en_US',
	'W',
	'Cannot correct or cancel since the item order has been firmed.\nItem order No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0053' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0053',
	'en_US',
	'W',
	'Cannot firm since the procurement is prohibited to the item.\nItem: {1}\nSEIBAN No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0054' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0054',
	'en_US',
	'W',
	'Cannot enter or correct since the item is set as an order prohibited item in the Item Prohibit master.\nItem: {1}\nOrder prohibited date: {2}\nMaster application date: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0055' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0055',
	'en_US',
	'W',
	'SEIBAN No.1 is required since "2. Manage (Required)" is specified for the SEIBAN No.1 management type in the Item master.\nItem: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0056' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0056',
	'en_US',
	'W',
	'SEIBAN No.2 is required since "2. Manage (Required)" is specified for the SEIBAN No.2 management type in the Item master.\nItem: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0057' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0057',
	'en_US',
	'W',
	'SEIBAN No.3 is required since "2. Manage (Required)" is specified for the SEIBAN No.3 management type in the Item master.\nItem: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0058' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0058',
	'en_US',
	'W',
	'SEIBAN No.4 is required since "2. Manage (Required)" is specified for the SEIBAN No.4 management type in the Item master.\nItem: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0059' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0059',
	'en_US',
	'W',
	'Cannot specify SEIBAN No.1 since "1. Do not manage" is specified for the SEIBAN No.1 management type in the Item master.\nItem: {1}\nSEIBAN No.1: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0060' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0060',
	'en_US',
	'W',
	'Cannot specify SEIBAN No.2 since "1. Do not manage" is specified for the SEIBAN No.2 management type in the Item master.\nItem: {1}\nSEIBAN No.2: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0061' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0061',
	'en_US',
	'W',
	'Cannot specify SEIBAN No.3 since "1. Do not manage" is specified for the SEIBAN No.3 management type in the Item master.\nItem: {1}\nSEIBAN No.3: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0062' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0062',
	'en_US',
	'W',
	'Cannot specify SEIBAN No.4 since "1. Do not manage" is specified for the SEIBAN No.4 management type in the Item master.\nItem: {1}\nSEIBAN No.4: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0063' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0063',
	'en_US',
	'W',
	'There is no default operation corresponding to the item order that requires a default operation.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0064' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0064',
	'en_US',
	'W',
	'Cannot update the order since it is currently being executed by the scheduler.\nItem order No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0065' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0065',
	'en_US',
	'W',
	'One of the following dates must be specified:\nScheduled mfg. start date, Scheduled mfg. end date, Scheduled storage completion date, Available date');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0066' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0066',
	'en_US',
	'W',
	'One of the following dates must be specified:\nScheduled PO date, Scheduled storage completion date, Scheduled acceptance date, Available date');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0067' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0067',
	'en_US',
	'W',
	'One of the following dates must be specified:\nScheduled PO date, Scheduled mfg. start date, Scheduled mfg. end date, Scheduled acceptance date, Scheduled storage completion date, Available date');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0068' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0068',
	'en_US',
	'W',
	'One of the following dates must be specified:\nScheduled GI date, Scheduled storage completion date, Available date');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0069' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0069',
	'en_US',
	'W',
	'Master application date must be specified.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0070' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0070',
	'en_US',
	'W',
	'Mfg. location and BOM pattern for mfg. / subcontracting order must be specified.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0071' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0071',
	'en_US',
	'W',
	'Supplier for purchase order must be specified.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0072' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0072',
	'en_US',
	'W',
	'Request destination location for transport / transport between WG order must be specified.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0073' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0073',
	'en_US',
	'W',
	'Storage location must be specified.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0074' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0074',
	'en_US',
	'W',
	'The relationship of the following dates is invalid: Scheduled operation start date and time, and Scheduled operation end date and time.\nScheduled operation start date and time: {1}\nScheduled operation end date and time: {2}\nItem order No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0075' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0075',
	'en_US',
	'W',
	'Operation order status is not unfirm/save.\nItem order No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0076' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0076',
	'en_US',
	'W',
	'Operation location is invalid. It must match the mfg. location for the item order or the operation location in the Item Operation master.\nOperation cd.: {1}\nOperation sequence number: {2}\nOperation location cd.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0077' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0077',
	'en_US',
	'W',
	'The target operation order contains the operation cd. and operation sequence numbers, which do not exist in the Item Operation master.\nOperation cd.: {1}\nOperation sequence number: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0078' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0078',
	'en_US',
	'W',
	'The operation order for necessary operation management No. is insufficient. Check the operation order and the Item Operation master.\nOperation cd.: {1}\nOperation sequence number: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0079' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0079',
	'en_US',
	'W',
	'One of the following must be specified:\nOrder scheduled qty., Output scheduled qty.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0080' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0080',
	'en_US',
	'W',
	'If the Order type is set to something other than "1. Mfg." and order scheduled qty. and output schedule qty. are different,\nset the order scheduled qty. to the output schedule qty.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0081' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0081',
	'en_US',
	'W',
	'Cannot correct/cancel orders once firmed.\nItem order No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0082' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0082',
	'en_US',
	'W',
	'There is no allocatable inventory or GR/GI schedule.\nItem: {1}\nInput location: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0083' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0083',
	'en_US',
	'W',
	'Cannot cancel the applied setting since the target item order has been firmed.\nItem order No.: {1}\n\n {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0084' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0084',
	'en_US',
	'W',
	'Not entered in the MPS Item master.\nItem: {1}\nWG cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0085' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0085',
	'en_US',
	'W',
	'Could not create daily production request for the following qty. since the requested qty. exceeds possible production qty.\nItem: {1}\nMPS Group: {2}\nProduction month: {3}\nRemaining request qty.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0086' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0086',
	'en_US',
	'W',
	'There is no allocatable operating date.\nPeriod start: {1}\nPeriod end: {2}\nCalendar cd.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0087' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0087',
	'en_US',
	'I',
	'Since WG for storage location and that for requested location are the same, the Order type has been changed from "Transport between WG" to "Transport".\nLocation: {1}\nLocation WG: {2}\nRequested location: {3}\nRequested WG: {4}\nItem: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0088' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0088',
	'en_US',
	'I',
	'Since WG for storage location and that for requested location are different, the Order type has been changed from "Transport" to "Transport between WG".\nLocation: {1}\nLocation WG: {2}\nRequested location: {3}\nRequested WG: {4}\nItem: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0089' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0089',
	'en_US',
	'I',
	'Since there is a saved operation order corresponding to item order No., the item order status in the item order has been changed from "Unfirm" to "Save".\nItem order No.: {1}\nItem: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0090' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0090',
	'en_US',
	'W',
	'Operation order qty. for operation order and order scheduled qty. for item order do not match.\nItem order No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0091' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0091',
	'en_US',
	'W',
	'The total operation order qty. and order scheduled qty. do not match.\nOperation cd.: {1}\nOperation sequence number: {2}\nOperation order qty. total: {3}\nOrder scheduled qty.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0092' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0092',
	'en_US',
	'W',
	'Cannot specify the value less than 0 for operation order qty.\nOperation cd.: {1}\nOperation sequence number: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0093' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0093',
	'en_US',
	'W',
	'Specify in the relationship of: Scheduled operation start date and time ≤ Scheduled operation end date and time.\nScheduled operation start date and time: {1}\nScheduled operation end date and time: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0094' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0094',
	'en_US',
	'W',
	'Cannot enter WG storage location different from simulation No. WG. WG: {1} Storage location: {2} {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0095' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0095',
	'en_US',
	'W',
	'Cannot correct the WG. WG: {1} WG before correction: {2} {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0096' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0096',
	'en_US',
	'W',
	'Requirements No. that is not linked to the specified simulation No. is specified.\nSpecified simulation No.: {1}\nRequirements No.: {2}\nSimulation No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0097' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0097',
	'en_US',
	'W',
	'It includes data of unexpected status.\nLoad status type for the item order before change: {1}\nLoad status type for the item order after change: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0098' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0098',
	'en_US',
	'I',
	'Starting the order auto-firming process.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0099' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0099',
	'en_US',
	'I',
	'Order auto-firming process has been completed.\nTo process: {1}\nFirmed number: {2}\nNumber of errors: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0100' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0100',
	'en_US',
	'W',
	'Could not lock the MRP exclusion information. Stop processing.\nWG: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0101' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0101',
	'en_US',
	'W',
	'Could not enter the MRP exclusion information. Stop processing.\nWG: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0102' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0102',
	'en_US',
	'W',
	'Requirements entry is prohibited in the BP Prohibit master.\nBP: {1}\nDue date: {2}\nProhibit date: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0103' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0103',
	'en_US',
	'W',
	'Cannot enter/correct since it is an order prohibited BP in the BP Prohibit master.\nBP: {1}\nOrder prohibited date: {2}\nMaster application date: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0104' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0104',
	'en_US',
	'I',
	'Starting MRP process.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0105' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0105',
	'en_US',
	'I',
	'MRP process has been completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0106' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0106',
	'en_US',
	'I',
	'Starting MRP for Long LT process.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0107' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0107',
	'en_US',
	'I',
	'MRP for Long LT process has been completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0108' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0108',
	'en_US',
	'W',
	'Cannot enter/correct since the Production planning type is not set to "2. Use the monthly production request function".\nItem: {1}\nWG cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0109' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL0109',
	'en_US',
	'I',
	'Since the Production planning type is not set to "2. Use the monthly production request function", it has been excluded from disaggregation by day process.\nItem: {1}\nWG cd.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1001',
	'en_US',
	'W',
	'Operation results for mfg. order No., split sequence number, and operation have not been entered.\nIf mfg. order No., split sequence number, and operation have been specified, corresponding operation results must be entered in advance.\nMfg. order No.: {1}\nSplit sequence number: {2}\nOperation cd.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1002',
	'en_US',
	'W',
	'Operation results for the man-hour schedule has not been entered.\nTo enter man-hour results, operation results must be entered in advance.\nOperation order No.: {1}\nSplit sequence number: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1003',
	'en_US',
	'W',
	'Cannot enter since the invalid Inventory identification type is specified for the input result.\nInventory identification type: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1004',
	'en_US',
	'W',
	'Defective item lot is specified for the input item.\nInput item: {1}\nLot No.: {2}\nSublot No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1005',
	'en_US',
	'W',
	'Sublot No. must be specified for this input item which requires a lot specified at the time of ordering.\nInput item: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1006',
	'en_US',
	'I',
	'Since sublot No. is not specified for this input item which requires a lot specified at the time of ordering, it is entered as Save order in mfg. status.\nInput item: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1007',
	'en_US',
	'W',
	'Cannot process since subcontracting mfg. order is entered as PO correction/cancel disallowed.\nMfg. order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1008',
	'en_US',
	'W',
	'Cannot process since subcontracting mfg. order has been approved.\nMfg. order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1009',
	'en_US',
	'W',
	'Cannot process since subcontracting mfg. result has been entered.\nPO details No.: {1}\nMfg. order No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1010',
	'en_US',
	'W',
	'Cannot process since unordered qty. remains in subcontracting mfg. order.\nPO details No.: {1}\nMfg. order No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1011',
	'en_US',
	'W',
	'Cannot process since subcontracting mfg. order is split.\nPO details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1012',
	'en_US',
	'W',
	'PO schedule that has already been mfg. ordered cannot put together with other PO schedule as the same PO details.\nMfg. order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1013',
	'en_US',
	'W',
	'Cannot process since the subcontracting mfg. order corresponding to scheduled re-receipts is PO correction/cancel disallowed.\nPurchase result details No.: {1}\nMfg. order No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1014',
	'en_US',
	'W',
	'Cannot process since the subcontracting mfg. order corresponding to scheduled re-receipts has been approved.\nPurchase result details No.: {1}\nMfg. order No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1015',
	'en_US',
	'W',
	'Cannot process since the subcontracting mfg. result corresponding to scheduled re-receipts has been entered.\nPurchase result details No.: {1}\nMfg. order No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1016',
	'en_US',
	'W',
	'Cannot cancel the remaining processing since subcontracting mfg. order has been approved.\nReceipt schedule No.: {1}\nMfg. order No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1017',
	'en_US',
	'W',
	'Cannot cancel the remaining processing since subcontracting mfg. result has been entered.\nReceipt schedule No.: {1}\nMfg. order No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1018',
	'en_US',
	'W',
	'Cannot cancel the remaining receipt schedules since the canceled remaining qty. of the receipt schedule and the mfg. order qty. within the same mfg. order do not match.\nCancel the remaining receipt schedules of the same mfg. order at the same time.\nReceipt schedule No.: {1}\nMfg. order No.: {2}\nBase unit qty. of remaining receipt schedule: {3}\nTotal base unit qty. of remaining receipt schedule: {4}\nMfg. order qty.: {5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1019',
	'en_US',
	'W',
	'Mfg. order for the specified mfg. order No. does not exist.\nMfg. order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1020',
	'en_US',
	'W',
	'Cannot cancel the remaining processing since mfg. order No. is not specified.\nReceipt schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1021',
	'en_US',
	'W',
	'Cannot cancel mfg. order approval since mfg. has already been started.\nMfg. order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1022',
	'en_US',
	'W',
	'Cannot process since it is not a mfg. order for mfg. approval.\nMfg. order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1023',
	'en_US',
	'W',
	'Cannot process the subcontractor mfg. location that requires subcontracting mfg. result entry prior to receipt/purchase result entry since the subcontracting mfg. result is not entered.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1024',
	'en_US',
	'W',
	'Cannot process since subcontracting mfg. order is not approved.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1025',
	'en_US',
	'W',
	'Cannot process since subcontracting mfg. result has already been approved.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1026',
	'en_US',
	'W',
	'Lot No. must be specified for this input item which requires a lot specified at the time of ordering.\nInput item: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1027' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1027',
	'en_US',
	'I',
	'Since lot No. is not specified for this input item which requires a lot specified at the time of ordering, it is entered as Save order in mfg. status.\nInput item: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1028' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1028',
	'en_US',
	'W',
	'Cannot process since allocatable inventory / GR schedules do not exist.\nInput item: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1029' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1029',
	'en_US',
	'I',
	'Since allocatable inventory / GR schedules do not exist, it is entered as Save order in mfg. status.\nInput item: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1030' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1030',
	'en_US',
	'W',
	'Cannot process since lots are mixed in input item that cannot contain mixed lot No.\nInput item: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1031' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1031',
	'en_US',
	'W',
	'Cannot process since sublots are mixed in input item that cannot contain mixed sublot No.\nInput item: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1032' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1032',
	'en_US',
	'W',
	'Cannot process since input items are mixed in alternative group that cannot contain mixed input items.\nInput item: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1033' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1033',
	'en_US',
	'W',
	'Cannot add input items that do not exist in the BOM master.\nInput item: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1034' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1034',
	'en_US',
	'W',
	'There is no operation found for this order. Select the operation.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1035' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1035',
	'en_US',
	'W',
	'Mfg. order is prohibited for this item in the Item Prohibit master.\nItem: {1}\nMfg. order date: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1036' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1036',
	'en_US',
	'W',
	'Mfg. order is prohibited for this subcontractor in the BP prohibit master.\nSubcontractor cd.: {1}\nMfg. order date: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1037' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1037',
	'en_US',
	'W',
	'Cannot issue lot No. and sublot No. due to the master setting for the item to issue lot No. at the time of mfg. order.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1038' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1038',
	'en_US',
	'W',
	'Actual start date is specified prior to mfg. order approved date.\nMfg. order approved date: {1}\nActual start date: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1039' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1039',
	'en_US',
	'W',
	'Mfg. location that is not allowed to enter mfg. result prior to subcontracting item receipt/purchase.\nTo allow subcontracting mfg. result to be entered in advance, turn on the "Subcontracting result leading" of the subcontractor mfg. location in the Location master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1040' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1040',
	'en_US',
	'W',
	'Cannot cancel the subcontracting mfg. order which is linked to PO details since PO has been placed.\nPO details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1041' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1041',
	'en_US',
	'W',
	'Cannot cancel the subcontracting mfg. result since receipt/purchase result has already been entered.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1042' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1042',
	'en_US',
	'W',
	'Cannot enter mfg. result since mfg. order has not been approved.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1043' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1043',
	'en_US',
	'W',
	'Cannot correct/cancel mfg. result since it has already been approved.\nMfg. order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1044' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1044',
	'en_US',
	'W',
	'Cannot process since the expiration date of specified lot is prior to the input schedule date.\nExpiration Date: {1}\nScheduled input date: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1045' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1045',
	'en_US',
	'W',
	'Cannot process since the expiration date of specified lot is prior to the input result date.\nExpiration Date: {1}\nActual input date: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1046' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1046',
	'en_US',
	'I',
	'Although the Item Operation master was changed after mfg. order was entered, the result for the operation had already been entered, for this reason, this processing did not re-explode.\nOperation cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1047' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1047',
	'en_US',
	'I',
	'Although the BOM master was changed after mfg. order was entered, the result for the input item had already been entered, for this reason, this processing did not apply the change for the BOM master.\nInput item: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1048' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1048',
	'en_US',
	'I',
	'Although the BOM master was changed after mfg. order was entered, the result for the by-product had already been entered, for this reason, this processing did not apply the change for the BOM master.\nBy-product: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1049' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1049',
	'en_US',
	'I',
	'Although the Operation Man-Hour master was changed after mfg. order was entered, the result for the man-hour schedule had already been entered, for this reason, this processing did not apply the change for the Operation Man-Hour master.\nWork element cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1050' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1050',
	'en_US',
	'W',
	'Turn on the Allocation since the input item requires allocation at the time of order.\nInput item: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1051' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1051',
	'en_US',
	'W',
	'Cannot enter the mfg. result since the PO for the subcontracting item has not been entered.\nMfg. order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1052' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1052',
	'en_US',
	'I',
	'Lot No. has not been numbered since this item is not managed in a lot.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1053' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1053',
	'en_US',
	'I',
	'Sublot No. has not been numbered since this item is not managed in sublot No.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1054' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1054',
	'en_US',
	'W',
	'To enter mfg. results, one or more operation results must be entered.\nMfg. order No.: {1}\nMfg. result No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1055' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1055',
	'en_US',
	'W',
	'The operation/BOM master change list has not been issued because there has been no change since the mfg. order with the last rev. number.\nMfg. order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1056' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1056',
	'en_US',
	'I',
	'Lot No. has not been numbered since it has already been specified.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1057' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1057',
	'en_US',
	'I',
	'Sublot No. has not been numbered since it has already been specified.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1058' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1058',
	'en_US',
	'W',
	'Cannot enter the mfg. result since PO for the subcontracting item has not been approved.\nPO details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1059' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1059',
	'en_US',
	'I',
	'Approval request for the mfg. order has been entered.\nNumber of rows: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1060' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1060',
	'en_US',
	'I',
	'Approval request for the mfg. order has been canceled.\nNumber of rows: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1061' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1061',
	'en_US',
	'I',
	'Mfg. order has been approved.\nNumber of rows: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1062' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1062',
	'en_US',
	'I',
	'Mfg. order approval has been canceled.\nNumber of rows: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1063' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1063',
	'en_US',
	'I',
	'Approval request for the mfg. result has been entered.\nNumber of rows: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1064' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1064',
	'en_US',
	'I',
	'Approval request for the mfg. result has been canceled.\nNumber of rows: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1065' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1065',
	'en_US',
	'I',
	'Mfg. result has been approved.\nNumber of rows: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1066' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1066',
	'en_US',
	'I',
	'Mfg. result approval has been canceled.\nNumber of rows: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1067' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1067',
	'en_US',
	'W',
	'Cannot enter since inventory closing has already been conducted.\nStart recording date: {1}\nMfg. order No.: {2}\nMfg. result No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1068' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1068',
	'en_US',
	'W',
	'Cannot enter since inventory closing has already been conducted.\nEnd recording date: {1}\nMfg. order No.: {2}\nMfg. result No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1069' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1069',
	'en_US',
	'W',
	'Cannot enter since inventory closing has already been conducted.\nStart recording date before update: {1}\nMfg. order No.: {2}\nMfg. result No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1070' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1070',
	'en_US',
	'W',
	'Cannot enter since inventory closing has already been conducted.\nEnd recording date before update: {1}\nMfg. order No.: {2}\nMfg. result No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1071' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1071',
	'en_US',
	'W',
	'Cannot change the input location / inventory arriving point / Inventory identification type since the supply result corresponding to the input result has been entered.\nTo change the setting, delete the input result and then enter it again.\nInput location cd. before update: {1}\nInventory arriving point cd. before update: {2}\nInventory identification type before update: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1072' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1072',
	'en_US',
	'W',
	'Cannot specify order qty. that exceeds PO qty. since PO for the subcontracting item has already been entered.\nPO qty.: {1}\nSpecified order qty.: {2}\nOther mfg. order qty. of the same PO details: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1073' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1073',
	'en_US',
	'W',
	'Approval date before the order date is specified.\nOrder date: {1}\nApproval date: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1074' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1074',
	'en_US',
	'W',
	'Approval date before the completion result date is specified.\nActual completion date: {1}\nApproval date: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1075' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1075',
	'en_US',
	'W',
	'Cannot enter since inventory closing has already been conducted.\nRecording date before update: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1076' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1076',
	'en_US',
	'W',
	'Cannot process since operation result corresponding to the result is not subject to be updated. Make the corresponding operation result updatable.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1077' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1077',
	'en_US',
	'W',
	'Cannot process since available inventory / GR schedule are insufficient.\nInput item: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1078' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1078',
	'en_US',
	'I',
	'Starting the input allocation process.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1079' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1079',
	'en_US',
	'I',
	'Input allocation process has been completed.\nNumber of mfg. orders to process: {1}\nNumber of mfg. orders for all input items successfully allocated: {2}\nNumber of mfg. orders failed in allocation: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1080' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1080',
	'en_US',
	'I',
	'Starting the backflush process.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1081' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1081',
	'en_US',
	'I',
	'The backflush process has been completed.\nOperation result qty. to be processed: {1}\nOperation result qty. for all input items successfully entered: {2}\nOperation result qty. failed to be entered: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1082' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1082',
	'en_US',
	'W',
	'Could not process since WG cd. is not specified.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1083' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1083',
	'en_US',
	'I',
	'There are input items that could not be allocated.\nNumber of input items to be allocated: {1}\nNumber of successful allocations: {2}\nNumber of failed allocations: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1084' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1084',
	'en_US',
	'W',
	'Cannot change the Output type / output reason that will change the setting for with/without output recording.\nTo change the setting, delete the output result and then enter it again.\nOutput result No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1085' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1085',
	'en_US',
	'I',
	'There are input items that could not be entered as results.\nNumber of input items for result entry: {1}\nNumber of input items for results successfully entered: {2}\nNumber of input items for results failed to be entered: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1086' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1086',
	'en_US',
	'W',
	'Cannot enter result since the status of mfg. order is "Save order".\nSet the mfg. order to "Ordered" first.\nMfg. order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1087' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1087',
	'en_US',
	'W',
	'Cannot process since the remaining mfg. order has already been canceled.\nMfg. order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1088' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1088',
	'en_US',
	'W',
	'Cannot specify the actual end date for operation result since output result has not been entered.\nMfg. order No.: {1}\nOperation order No.: {2}\nOutput schedule No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1089' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1089',
	'en_US',
	'W',
	'Cannot specify the actual end date for operation result since by-product result has not been entered.\nMfg. order No.: {1}\nOperation order No.: {2}\nOutput schedule No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1090' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1090',
	'en_US',
	'W',
	'Cannot specify order qty. that exceeds the sum of PO qty. and scheduled re-receipt qty.\nPO qty.: {1}\nScheduled re-receipt qty.: {2}\nSpecified order qty.: {3}\nOther mfg. order qty. of the same PO details: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1091' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1091',
	'en_US',
	'W',
	'Cannot cancel mfg. order linked to scheduled re-receipt.\nMfg. order No.: {1}\nReceipt schedule No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1092' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1092',
	'en_US',
	'W',
	'Cannot process since the subcontracting mfg. order for scheduled re-receipts has been split.\nPurchase result details No.: {1}\nMfg. order No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1093' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1093',
	'en_US',
	'W',
	'Cannot process since mfg. order No. is not specified.\nPurchase result details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1094' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1094',
	'en_US',
	'W',
	'To complete mfg. results, specify actual end date for all operation results and turn off the Uncompleted flag.\nMfg. order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1095' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1095',
	'en_US',
	'W',
	'Cannot issue the mfg. order sheet since the status of mfg. order is "Save order".\nMfg. order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1096' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1096',
	'en_US',
	'W',
	'Cannot issue the mfg. record sheet since mfg. result has not been completed.\nMfg. order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1097' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1097',
	'en_US',
	'W',
	'Cannot delete output result since operation result has been completed.\nTo delete output result, clear the actual end date for operation result or turn on the Uncompleted flag.\nMfg. order No.: {1}\nOperation result No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1098' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1098',
	'en_US',
	'W',
	'Cannot delete by-product result since operation result has been completed.\nTo delete by-product result, clear actual end date for operation result or turn on the Uncompleted flag.\nMfg. order No.: {1}\nOperation result No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1099' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1099',
	'en_US',
	'I',
	'Could not enter input results since available inventory is insufficient.\nInput item: {1}\nMfg. order No.: {2}\nMfg. result No.：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1100' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1100',
	'en_US',
	'I',
	'Could not enter input results since available inventory or GR schedule for input location was insufficient.\nEven for input items that allow negative inventory, there must be available GR schedule in order to enter input results.\nInput item: {1}\nMfg. order No.: {2}\nMfg. result No.：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1101' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1101',
	'en_US',
	'W',
	'In the case of unplanned mfg. order, you cannot cancel the remaining unordered.\nMfg. order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1102' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1102',
	'en_US',
	'W',
	'Cannot issue the mfg. order sheet since the remaining mfg. order has been canceled.\nMfg. order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1103' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1103',
	'en_US',
	'W',
	'Cannot correct mfg. order that has been canceled.\nMfg. order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1104' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1104',
	'en_US',
	'W',
	'Man-hour schedule for specified man-hour schedule No. / split sequence number does not exist.\nMan-hour schedule No.: {1}\nSplit sequence number: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1105' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1105',
	'en_US',
	'W',
	'Cannot specify version No. different from lot information.\nItem: {1}\nSpecified version No.: {2}\nLot information version No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1106' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1106',
	'en_US',
	'W',
	'Cannot change SEIBAN No. for subcontracting mfg. order linked to sales order.\nSales order details No.: {1}\nValue before change\n{2}:{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1107' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1107',
	'en_US',
	'I',
	'Although lot suggestion was conducted by backflush, other input results and lots are mixed, for this reason, input result was not entered.\nInput item: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1108' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1108',
	'en_US',
	'I',
	'Although lot suggestion was conducted by backflush, other input results and sublots are mixed, for this reason, input result was not entered.\nInput item: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1109' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1109',
	'en_US',
	'W',
	'In the case of operation unit mfg. order, in order to cancel mfg. order that was first entered, all mfg. orders that were subsequently entered must be canceled.\nCancel other mfg. orders that are linked to the same item mfg. order No. first.\nMfg. order No.: {1}\nItem mfg. order No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1110' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1110',
	'en_US',
	'I',
	'Could not enter input result since output result used for backflush has not been entered.\nTo backflush based on based on the output, the output result with the quantity greater than 0 must be entered in advance.\nInput item: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1111' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1111',
	'en_US',
	'I',
	'Could not enter input result since operation result used for backflush has not been entered.\nTo backflush based on the operation result, the operation result with the quantity greater than 0 and a specified end date must be entered in advance.\nInput item: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1112' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1112',
	'en_US',
	'W',
	'Cannot allocate input items with the Input control type "3: Not for MRP (Only order sheet)".\nInput item: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1113' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1113',
	'en_US',
	'W',
	'Cannot change the mfg. order qty. in the case of subcontracting mfg. orders for direct delivery.\nMfg. order No.: {1}\nBefore change qty.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1114' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1114',
	'en_US',
	'W',
	'Cannot change the storage location in the case of subcontracting mfg. orders for direct delivery.\nMfg. order No.: {1}\nStorage location before change: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1115' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1115',
	'en_US',
	'W',
	'If there is an item with the Specify alternative item turned on for the same operation, alternative group and alternative group sequence number, you cannot turn on the Allocation flg. for items with the Specify alternative item turned off.\nInput item: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1116' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1116',
	'en_US',
	'W',
	'If there is an item with the Specify alternative item turned on for the same operation, alternative group, and alternative group sequence number, set all input qty., required qty., fixed required qty. for items with the Specify alternative item turned off to 0.\nInput item: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1117' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1117',
	'en_US',
	'W',
	'Enter a value greater than 0 in either the required qty. or the fixed required qty.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1118' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1118',
	'en_US',
	'W',
	'Enter a value greater than 0 in either Man-hour (Qty.-dependent) or Man-hour (Constant).\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1119' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1119',
	'en_US',
	'W',
	'Cannot allocate self supply items.\nInput item: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1120' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1120',
	'en_US',
	'I',
	'Since lot No. could not be automatically issued, the mfg. status has been changed to Save order. \nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1121' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1121',
	'en_US',
	'I',
	'Since sublot No. could not be automatically issued, the mfg. status has been changed to Save order.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1122' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1122',
	'en_US',
	'W',
	'Cannot cancel the mfg. order since the remaining unordered orders have been canceled.\nTurn off the Cancel remaining unordered first.\nMfg. order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1123' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1123',
	'en_US',
	'W',
	'Cannot cancel the mfg. result since the remaining qty. has been canceled.\nTurn off the Cancel remaining qty. first.\nMfg. order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1124' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1124',
	'en_US',
	'W',
	'Cannot correct/cancel the mfg. order since it has already been approved.\nMfg. order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1125' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1125',
	'en_US',
	'W',
	'Cannot cancel the mfg. order since the mfg. result has already been entered.\nMfg. order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1126' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1126',
	'en_US',
	'W',
	'Cannot delete the operation result since the mfg. result has been completed.\nMfg. order No.: {1}\nOperation result No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1127' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1127',
	'en_US',
	'W',
	'Cannot delete since the result has already been entered.\n{1}:{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1128' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1128',
	'en_US',
	'W',
	'Cannot process since there is no output schedule.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1129' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1129',
	'en_US',
	'W',
	'In the case of the operation unit mfg. order, you cannot turn on the Cancel remaining unordered except for a mfg. order that was entered first.\nMfg. order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1130' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1130',
	'en_US',
	'W',
	'There is no data for the specified mfg. order No.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1131' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1131',
	'en_US',
	'W',
	'Lot No. could not be automatically issued.\nItem cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1132' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1132',
	'en_US',
	'W',
	'Sublot No. could not be automatically issued.\nItem cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1133' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1133',
	'en_US',
	'W',
	'Cannot process since available inventory or GR schedule for input location is insufficient.\nEven for input items that allow negative inventory, there must be available GR schedule in order to enter input results.\nInput item: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1134' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1134',
	'en_US',
	'W',
	'If the Cancel remaining is turned off, enter a value greater than 0 in any one of the input qty., loss qty. and constant loss qty.\nInput item: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1135' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1135',
	'en_US',
	'W',
	'If the Cancel remaining is turned off, enter a value greater than 0 for man-hour.\nMan-hour: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1136' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1136',
	'en_US',
	'W',
	'Cannot cancel since man-hour result has been added on the Man-Hour Result List Entry screen. Cancel the added man-hour result first.\nMfg. result No.:{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1137' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1137',
	'en_US',
	'W',
	'Cannot add input items with the Inventory identification type "9. Self supply".\nInput item: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1138' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1138',
	'en_US',
	'W',
	'The end time must be the time between {1} and {2}.\nTo enter man-hour results across a date, you must enter the rows separately for each date.\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1139' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1139',
	'en_US',
	'I',
	'Could not calculate the unit price since the Tax cd. of tax inclusive was set for the subcontracting includes a chargeable supply item as a child item.\nItem: {1}\nSupplier: {2}\nTax:{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1201' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1201',
	'en_US',
	'W',
	'Cannot update since IF has been exported.\nMfg. order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1202' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1202',
	'en_US',
	'I',
	'Starting the operation completion result processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1203' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1203',
	'en_US',
	'I',
	'The operation completion result processing completed.\nOperation result qty. to process: {1}\nOperation result qty. successfully processed : {2}\nOperation result qty. failed to be processed: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1204' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1204',
	'en_US',
	'W',
	'For start qty., enter the value which is less than or equal to the remaining mfg. qty.\nMfg. order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1205' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1205',
	'en_US',
	'W',
	'The following error occurred during closing check for the input item.\nMfg. result No.: {1}\nInput item: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1206' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1206',
	'en_US',
	'W',
	'Cannot specify a subcontracting location as a storage location for an item order with the Order type "1. Mfg.".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1207' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1207',
	'en_US',
	'W',
	'Cannot release the canceled remaining receipt schedules since the canceled receipt schedule qty. which are to be released and the mfg. order qty. within the same mfg. order do not match.\nRelease the canceled remaining receipt schedules of the same mfg. order at the same time.\nReceipt schedule No.: {1}\nMfg. order No.: {2}\nBase unit qty. of canceled receipt schedules which are to be released: {3}\nTotal base unit qty. of canceled receipt schedules which are to be released: {4}\nMfg. order qty.: {5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1208' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1208',
	'en_US',
	'W',
	'Cannot specify an external location as a mfg. location for an item order whose order type is "1. Mfg.".');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1209' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1209',
	'en_US',
	'W',
	'Cannot specify an internal location as a mfg. location for an item order whose order type is "3. Subcontracting".');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1210' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1210',
	'en_US',
	'W',
	'Cannot specify a mfg. location or a supplier for an item order whose order type is "4. Transport".');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1211' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1211',
	'en_US',
	'W',
	'Cannot set the lot mixed or sublot mixed differently for records of the same child item with the same operation No. and operation sequence No.\nInput item: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1212' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1212',
	'en_US',
	'W',
	'The result date specified is earlier than the mfg. order approved date.\nMfg. order approved date: {1}\nResult date: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1213' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1213',
	'en_US',
	'I',
	'Since it is not possible to release a mfg. order for only some of operations tied to the mfg. order, it is saved with the mfg. status as "Save order".\nMfg. order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1214' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1214',
	'en_US',
	'W',
	'Cannot make a correction that changes the value of the output recording operation flg. of an operation order for which a result has been entered.\nCancel the operation result first.\nOperation order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1215' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1215',
	'en_US',
	'W',
	'There is an output schedule associated with the operation to be deleted.\nAfter re-searching, delete the operation manually.\nOperation order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1301' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1301',
	'en_US',
	'W',
	'Specify "In process" or "Completed" in the Mfg. status type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1302' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1302',
	'en_US',
	'W',
	'Cannot enter items which are target of mfg. approval as unplanned results.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1303' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1303',
	'en_US',
	'W',
	'Only mfg. items can be specified as unplanned results.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1304' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1304',
	'en_US',
	'W',
	'Cannot enter an item whose lot No. numbering pattern is copy lot of child item as an unplanned result.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1305' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1305',
	'en_US',
	'W',
	'Cannot specify subcontracting items as unplanned results.\nItem: {1}\nMfg. location: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1306' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1306',
	'en_US',
	'W',
	'Cannot enter since WG for mfg. location and that for storage location are different.\nMfg. location: {1}\nMfg. location WG cd.: {2}\nStorage location: {3}\nStorage location WG cd.: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1308' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1308',
	'en_US',
	'W',
	'The operation has been deleted. All operations entered in the Item Operation master is required to be entered.\nItem: {1}\nOperation pattern: {2}\nLocation: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1309' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1309',
	'en_US',
	'W',
	'The Operation cd. is not entered in the Item Operation master.\nItem: {1}\nOperation pattern: {2}\nLocation: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1310' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1310',
	'en_US',
	'I',
	'A planned order whose scheduled PO date is earlier than the operation date has been firmed.\nItem order No.: {1}\nScheduled PO date: {2}\nOperation date: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1311' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1311',
	'en_US',
	'W',
	'Lot No. or Sublot No. could not be automatically issued.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1312' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1312',
	'en_US',
	'W',
	'Cannot cancel the subcontracting mfg. order linked to PO details since a delivery order or an order promising result received has already been entered.\nPO details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1313' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1313',
	'en_US',
	'W',
	'Cannot specify an order qty. that is less than the total qty. of delivery orders.\nTotal qty. of delivery orders (base unit): {1}\nSpecified order qty.: {2}\nPO details No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1314' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1314',
	'en_US',
	'W',
	'Cannot specify an order qty. that is less than the total qty. of order promising results received.\nTotal qty. of order promising results (base unit): {1}\nSpecified order qty.: {2}\nPO details No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1315' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1315',
	'en_US',
	'W',
	'Cannot update the order on the Order Status Update screen since it was imported by the order IF import processing.\nUse the Manual Order Entry screen to update.\nItem order No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1316' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1316',
	'en_US',
	'W',
	'Not entered as a valid location in the Location master.\nInput location at the time of order release: {1}\nInput schedule No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1317' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1317',
	'en_US',
	'W',
	'Not entered as a valid location in the Location master.\nStorage location at the time of order release: {1}\nOutput schedule No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1318' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1318',
	'en_US',
	'W',
	'Cannot process since lots are mixed in input item that cannot contain mixed lot No.\nMfg. result No.: {1}\nInput schedule No.: {2}\nInput item: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1319' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1319',
	'en_US',
	'W',
	'Cannot process since sublots are mixed in input item that cannot contain mixed sublot No.\nMfg. result No.: {1}\nInput schedule No.: {2}\nInput item: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1320' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1320',
	'en_US',
	'W',
	'Cannot process since input items are mixed in alternative group that cannot contain mixed input items.\nMfg. result No.: {1}\nInput schedule No.: {2}\nInput item: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1321' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1321',
	'en_US',
	'W',
	'Failed to update all data due to an error.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1401' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1401',
	'en_US',
	'W',
	'Cannot update the order since it is subject to scheduler freeze.\nItem order No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1402' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1402',
	'en_US',
	'W',
	'Cannot perform file import since the order is subject to scheduler freeze.\nItem order No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1403' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1403',
	'en_US',
	'W',
	'There is no item order information for the specified Item order No.\nItem order No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1404' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBCL1404',
	'en_US',
	'W',
	'The file could not be saved.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0001',
	'en_US',
	'W',
	'The desired delivery date for the supplier that is a BP targeted to the Subcontract Act must be the same date as scheduled purchase date.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0003',
	'en_US',
	'W',
	'This is a unit that cannot be converted from base unit qty.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0004',
	'en_US',
	'W',
	'Cannot make a transition since selected details have different PO header information.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0005',
	'en_US',
	'I',
	'The unit price has been changed.\nColumn name: {1}\nUnit price before change:{2}\nLatest price: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0006',
	'en_US',
	'I',
	'The location group (WG) for delivery location has been changed.\nContinue processing?\nWG before change: {1}\nWG after change: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0007',
	'en_US',
	'W',
	'Cannot consolidate since the following columns are different from other rows.\n{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0008',
	'en_US',
	'W',
	'There is no target for acquiring the unit price.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0009',
	'en_US',
	'W',
	'Cannot consolidate details for which mfg. order is released.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0010',
	'en_US',
	'I',
	'The carry-over process will be executed. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0011',
	'en_US',
	'W',
	'You are about to inspect an inventory that has failed inspection.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0012',
	'en_US',
	'W',
	'Cannot enter by reference since details for subcontracting items are included.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0013',
	'en_US',
	'I',
	'There is no target for reacquiring the unit price.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0014',
	'en_US',
	'W',
	'The reacquire unit price process will be executed. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0015',
	'en_US',
	'I',
	'Request source information will be applied (delivery location, rack/line, delivery destination information, receiving point information). Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0016',
	'en_US',
	'I',
	'The acquire scheduled date / masters process will be executed. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0017',
	'en_US',
	'I',
	'The target details will be consolidated. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0018',
	'en_US',
	'I',
	'The location group (distribution group) for the delivery location has been changed. Continue?\nDistribution group before change: {1}\nDistribution group after change: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0019',
	'en_US',
	'I',
	'The location group (Mfg. location group) for the delivery location has been changed. Continue?\nMfg. location group before change: {1}\nMfg. location group after change: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0020',
	'en_US',
	'W',
	'There is no target to be consolidated. Select two or more details.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0021',
	'en_US',
	'W',
	'Cannot consolidate details for which receipt result or purchase result has been entered.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0022',
	'en_US',
	'W',
	'Cannot copy since the Purchase identification type is receiving free of charge and it is the receipt result other than VMI.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0023',
	'en_US',
	'I',
	'The acquire unit price process will be executed. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0024',
	'en_US',
	'I',
	'The acquire unit price process has been executed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0025',
	'en_US',
	'I',
	'The exchange rate acquisition process will be executed. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0026',
	'en_US',
	'I',
	'The exchange rate acquisition process has been executed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0027' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0027',
	'en_US',
	'W',
	'No row other than the base currency is selected.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0028' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0028',
	'en_US',
	'I',
	'The tax acquisition process will be executed. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0029' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0029',
	'en_US',
	'I',
	'The tax acquisition process has been executed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0030' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0030',
	'en_US',
	'W',
	'Cannot specify a subcontracted supplier when performing unplanned entry.\nSupplier: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0031' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0031',
	'en_US',
	'W',
	'Cannot specify a supplier that is for invoice transaction on the Purchase Result Entry screen.\nSupplier: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0032' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0032',
	'en_US',
	'W',
	'WG for delivery location in detail rows corresponding to the breakdown of details or the Distribution warehouse cd. does not match in all rows.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0033' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0033',
	'en_US',
	'W',
	'Cannot correct/cancel since it is a purchase return result that has been entered at sales return entry.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0034' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0034',
	'en_US',
	'W',
	'Cannot enter from reference since details of procurement request are included.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0035' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0035',
	'en_US',
	'W',
	'Cannot consolidate details for discount item.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0036' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0036',
	'en_US',
	'I',
	'The unit price has been changed. Since the amount has become a negative value, discount amount and discount reason have been cleared.\nRe-enter the discount amount and discount reason.\nDiscount amount before change: {1}\nDiscount reason before change: {2}\nName of discount reason before change: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0037' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0037',
	'en_US',
	'I',
	'Inspection has not been completed. Continue to enter purchase result?\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0100' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0100',
	'en_US',
	'W',
	'Specify "Header" for the search mode.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0101' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDP0101',
	'en_US',
	'W',
	'Specify "Issue report" or "View return result" for the operation type and "Header" for the search mode.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0001',
	'en_US',
	'W',
	'There is no remaining schedule that can be canceled.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0002',
	'en_US',
	'W',
	'Cannot record purchase results for the purchase schedule that is not for purchase.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0003',
	'en_US',
	'W',
	'Not entered as the PO correction reason.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0004',
	'en_US',
	'W',
	'No corresponding PO information details are found.\nPO No.:　{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0005',
	'en_US',
	'W',
	'For the Inventory identification type, specify one of the following: "Internal inventory", "VMI", "Defective acceptance", "Receiving free of charge", "Chargeable supply".\nInventory identification type: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0006',
	'en_US',
	'W',
	'To specify "Chargeable supply" for the Inventory identification type, specify the subcontracting location as the return-from location.\nReturn-from location cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0007',
	'en_US',
	'W',
	'Specify the currency if own assets inventory is eligible for returns.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0008',
	'en_US',
	'W',
	'Could not acquire the Tax cd. in AP processing for VMI items. Check the master setting.\nItem: {1}\nApplication date: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0009',
	'en_US',
	'W',
	'Could not acquire exchange rate in AP processing for VMI items. See the master setting.\nExchange-from currency: {1}\nExchange-to currency: {2}\nApplication date: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0010',
	'en_US',
	'W',
	'Could not acquire unit price in AP processing for VMI items. See the master setting.\nItem: {1}\nSupplier: {2}\nMaker: {3}\nUnit: {4}\nCurrency: {5}\nWG: {6}\nApplication date: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0011',
	'en_US',
	'W',
	'Cannot enter since it is not split.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0012',
	'en_US',
	'W',
	'Direct delivery cannot be split.\nPO schedule No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0013',
	'en_US',
	'W',
	'Discount item cannot be divided.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0014',
	'en_US',
	'I',
	'Cannot issue PO sheet since PO has not been approved.\nPO No.: {1}\nApproval No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0015',
	'en_US',
	'W',
	'Cannot issue delivery order since PO has not been approved.\nPO No.: {1}\nDelivery order No.: {2}\nApproval No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0016',
	'en_US',
	'I',
	'Cannot issue delivery note since PO has not been approved.\nPO No.: {1}\nApproval No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0017',
	'en_US',
	'W',
	'Cannot cancel purchase return schedule since purchase return result has already been entered.\nPurchase return schedule No.: {1}\nPurchase return result No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0018',
	'en_US',
	'W',
	'There is no unallocated inventory. Cannot use allocated inventory.\nItem: {1}\nLocation: {2}\nRack/line: {3}\nLot No.: {4}\nSublot No.: {5}\nSEIBAN No.: {6}\nSKU: {7}\nGrading: {8}\nConforming type: {9}\nInventory identification type: {10}\nInventory BP: {11}\nInventory arriving point: {12}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0019',
	'en_US',
	'W',
	'The value of details and that of breakdown of details do not match. If a value is set for details, specify the same value for breakdown of details.\nColumn name: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0020',
	'en_US',
	'I',
	'Purchase forecast information entry processing has started.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0021',
	'en_US',
	'I',
	'Purchase forecast information entry processing has been completed.\nTo process: {1}\nNumber of entries: {2}\nNumber of errors: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0022',
	'en_US',
	'W',
	'Could not enter the purchase forecast information since an error has occurred during processing.\nForecast date: {1}\nSupplier cd.: {2}\nWG: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0023',
	'en_US',
	'W',
	'Cannot delete since the report has been issued. Delete it after issuing a cancel report.\nForecast date: {1}\nSupplier cd.: {2}\nWG: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0024',
	'en_US',
	'I',
	'Purchase forecast information delete processing has started.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0025',
	'en_US',
	'I',
	'Purchase forecast information delete processing has been completed.\nTo process: {1}\nNumber of entries: {2}\nNumber of errors: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0026',
	'en_US',
	'W',
	'Could not delete purchase forecast information since an error has occurred during processing.\nForecast date: {1}\nSupplier cd.: {2}\nWG: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0027' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0027',
	'en_US',
	'W',
	'Cannot cancel since details have already been split.\nPO schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0028' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0028',
	'en_US',
	'W',
	'Cannot enter the purchase result since the supplier is prohibited from purchase/receipt.\nSupplier: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0029' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0029',
	'en_US',
	'W',
	'Cannot enter the purchase result since the item is prohibited from purchase/receipt.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0030' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0030',
	'en_US',
	'W',
	'Enter or correct a purchase result for a purchase schedule, whose purchase invoice is entered, in a unit of purchase invoice.\nPurchase invoice management No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0031' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0031',
	'en_US',
	'W',
	'Delete a purchase result for a purchase schedule, whose purchase invoice is entered, in a unit of purchase invoice.\nPurchase invoice management No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0032' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0032',
	'en_US',
	'W',
	'Cannot cancel the remaining purchase schedules if entering or correcting unreceived purchase only.\nPurchase schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0033' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0033',
	'en_US',
	'W',
	'Cannot enter the purchase result only since the receipt result already exists for the schedule.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0034' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0034',
	'en_US',
	'W',
	'Cannot enter a new receipt result since it has already been entered.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0035' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0035',
	'en_US',
	'W',
	'Cannot enter the purchase qty. that exceeds the receipt qty. if you purchase after receipt.\nReceipt result No.: {1}\nReceipt qty. (base unit): {2}\nPurchase qty. (base unit): {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0036' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0036',
	'en_US',
	'W',
	'Cannot cancel receipt at the same time since the number of entries for the corresponding receipt results and the number of entries for the purchase result GR/GI are different.\nReceipt result No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0037' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0037',
	'en_US',
	'W',
	'Cannot correct receipt results at the same time since the receipt qty. of the corresponding receipt results and the purchase qty. of the purchase result GR/GI are different.\nReceipt result No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0038' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0038',
	'en_US',
	'W',
	'Cannot cancel receipt at the same time since the number of entries for the corresponding receipt results and the number of entries for the purchase result GR/GI are different.\nReceipt result No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0039' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0039',
	'en_US',
	'W',
	'Cannot cancel the receipt results at the same time since the receipt qty. of the corresponding receipt results and the purchase qty. of the purchase result GR/GI are different.\nReceipt result No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0040' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0040',
	'en_US',
	'W',
	'Cannot enter purchase qty. that is less than the purchase schedule qty. if you enter only unreceived purchases.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0041' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0041',
	'en_US',
	'W',
	'Cannot correct purchase result qty. / location etc. of the purchase result since the receipt result has already been entered.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0042' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0042',
	'en_US',
	'W',
	'Cannot correct since purchase qty. is less than sales qty. for direct delivery sales.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0043' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0043',
	'en_US',
	'W',
	'Cannot delete since purchase qty. is less than sales qty. for direct delivery sales.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0044' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0044',
	'en_US',
	'W',
	'Cannot change qty. / location etc. of the purchase result GR/GI results since the receipt result has already been entered.\nReceipt result No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0045' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0045',
	'en_US',
	'W',
	'Cannot delete the purchase result GR/GI only since the receipt result has already been entered.\nReceipt result No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0046' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0046',
	'en_US',
	'W',
	'Cannot enter the purchase result since the remaining PO has been canceled.\nPO details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0047' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0047',
	'en_US',
	'W',
	'Cannot cancel remaining processing if the qty. is 0.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0048' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0048',
	'en_US',
	'W',
	'Cannot enter the purchase result since the remaining purchase schedules have been canceled.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0049' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0049',
	'en_US',
	'W',
	'To enter multiple purchase result details for one purchase schedule, select all check boxes of the Cancel remaining.\nPurchase schedule No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0050' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0050',
	'en_US',
	'W',
	'Cannot cancel remaining processing with the qty. exceeding schedule qty.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0051' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0051',
	'en_US',
	'W',
	'Cannot cancel purchase result details whose schedule has been canceled. Release the canceled remaining purchase schedules first.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0052' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0052',
	'en_US',
	'W',
	'Cannot enter the unplanned purchase result for the supplier that is a BP targeted to the Subcontract Act.\nSupplier: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0053' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0053',
	'en_US',
	'W',
	'Cannot enter only the purchase result for the supplier that is a BP targeted to the Subcontract Act.\nSupplier: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0054' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0054',
	'en_US',
	'W',
	'Cannot turn off the Re-receipt since a delivery order or received order promising result has already been entered for the scheduled re-receipt.\nDelivery order No.: {1}\nOrder promising result received No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0055' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0055',
	'en_US',
	'W',
	'Cannot delete purchase result details since a delivery order or received order promising result has already been entered for the schedule re-receipt.\nDelivery order No.: {1}\nOrder promising result received No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0056' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0056',
	'en_US',
	'W',
	'Cannot cancel purchase result details since the receipt result has already been entered for the scheduled re-receipt.\nReceipt schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0057' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0057',
	'en_US',
	'W',
	'Cannot enter the scheduled re-receipt qty. that exceeds the acceptance defective qty.\nScheduled re-receipt qty.: {1}\nAcceptance defective qty.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0058' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0058',
	'en_US',
	'W',
	'Not entered in the Miscellaneous Item master.\nItem: {1}\nSEIBAN No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0059' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0059',
	'en_US',
	'W',
	'Cannot enter a delivery location for WG that is different from WG at the time of scheduling.\nReceipt schedule location: {1}\nReceipt schedule WG: {2}\nDelivery location: {3}\nWG: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0060' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0060',
	'en_US',
	'W',
	'Cannot enter a delivery location that has the Supplier cd. that is different from the one that is set in the delivery location at the time of scheduling.\nReceipt schedule location: {1}\nReceipt schedule location supplier: {2}\nDelivery location: {3}\nDelivery location supplier: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0061' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0061',
	'en_US',
	'W',
	'The specified WG is not set as a WG with purchasing function.\nWG: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0062' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0062',
	'en_US',
	'W',
	'Specify the consecutive term for firm period.\nForecast date: {1}\nSupplier cd.: {2}\nWG cd.: {3}\nItem: {4}\nForecast period start date: {5}\nForecast period end date: {6}\n{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0063' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0063',
	'en_US',
	'W',
	'Cannot specify a period other than the minimum packet as the firm period.\nForecast date: {1}\nSupplier cd.: {2}\nWG cd.: {3}\nItem: {4}\nForecast period start date: {5}\nForecast period end date: {6}\n{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0064' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0064',
	'en_US',
	'W',
	'Processing has been canceled since an error has occurred in purchase forecast No. within the same data.\nPurchase forecast No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0065' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0065',
	'en_US',
	'W',
	'Cannot turn off the Defective acceptance if the Re-receipt is turned on. Turn off the Re-receipt first.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0066' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0066',
	'en_US',
	'W',
	'Cannot specify a delivery location for the distribution group that is different from the distribution group at the time of scheduling.\nReceipt schedule location: {1}\nReceipt schedule distribution G: {2}\nDelivery location: {3}\nDistribution G: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0067' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0067',
	'en_US',
	'W',
	'Cannot specify a delivery location for the mfg. location group that is different from the mfg. location group at the time of scheduling.\nReceipt schedule location: {1}\nReceipt schedule mfg. location G: {2}\nDelivery location: {3}\nMfg. location G: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0068' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0068',
	'en_US',
	'W',
	'The corresponding data does not exist in the Transaction master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0069' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0069',
	'en_US',
	'W',
	'Cannot update PO schedule since PO has been placed.\nPO schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0070' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0070',
	'en_US',
	'W',
	'Cannot update the PO schedule since mfg. order has been released.\nPO schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0071' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0071',
	'en_US',
	'W',
	'Cannot update the PO schedule since it is set not to allow request source update.\nPO schedule No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0072' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0072',
	'en_US',
	'W',
	'Cannot update the PO schedule since it has already been canceled.\nPO schedule No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0073' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0073',
	'en_US',
	'W',
	'Cannot update the PO schedule since it has already been split.\nPO schedule No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0074' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0074',
	'en_US',
	'W',
	'The desired delivery date for the supplier that is a BP targeted to the Subcontract Act must be the same date as scheduled purchase date.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0075' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0075',
	'en_US',
	'W',
	'Cannot issue a forecast list since firmed details do not exist.\nForecast date: {1}\nSupplier: {2}\nWG: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0076' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0076',
	'en_US',
	'W',
	'For the Purchase identification type of subcontracting items, specify "Receiving for a fee" or "Normal purchase".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0077' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0077',
	'en_US',
	'W',
	'For direct supply, VMI cannot be specified for the Purchase identification type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0078' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0078',
	'en_US',
	'W',
	'Cannot undo cancellation since the canceled forecast list has not been printed.\nForecast list No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0079' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0079',
	'en_US',
	'W',
	'Select a purchase reason from expense reasons in the case of expense purchase.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0080' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0080',
	'en_US',
	'W',
	'Cannot purchase subcontracting items as expenses.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0081' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0081',
	'en_US',
	'W',
	'Cannot run aggregation processing and cancel remaining processing at the same time.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0082' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0082',
	'en_US',
	'W',
	'Cannot consolidate details whose mfg. order has been released.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0083' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0083',
	'en_US',
	'W',
	'Cannot select the reason for expenses purchase.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0084' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0084',
	'en_US',
	'W',
	'No PO information corresponding to PO No. is found.\nPO No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0085' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0085',
	'en_US',
	'W',
	'Cannot update since the purchase return result details have already been entered.\nPurchase return schedule details No.: {1}\nPurchase return result details No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0086' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0086',
	'en_US',
	'W',
	'Cannot cancel the remaining processing since the return processing has been completed.\nPurchase return schedule details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0087' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0087',
	'en_US',
	'W',
	'Cannot specify the following details columns if the same column in breakdown of details contains multiple values.\nColumn name: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0088' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0088',
	'en_US',
	'W',
	'Delivery destination or receiving point of the corresponding sales order information has been changed.\nClick the Delivery destination acquisition button and enter again.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0089' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0089',
	'en_US',
	'W',
	'PO is prohibited according to the Item Prohibit master.\nItem: {1}\nPO date: {2}\nProhibit date: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0090' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0090',
	'en_US',
	'W',
	'PO is prohibited according to the BP prohibit master.\nSupplier cd.: {1}\nPO date: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0091' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0091',
	'en_US',
	'W',
	'PO is prohibited according to the BP prohibit master.\nSupplier cd.: {1}\nPO date: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0092' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0092',
	'en_US',
	'W',
	'Cannot enter only discount items.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0093' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0093',
	'en_US',
	'W',
	'Cannot cancel the remaining processing since the next processing (receipt, purchase, purchase invoice entry) has been done.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0094' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0094',
	'en_US',
	'W',
	'Cannot consolidate details since the next processing (receipt, purchase, purchase invoice entry) has been done.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0095' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0095',
	'en_US',
	'W',
	'The Approval status type cannot be updated since approval is in progress.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0096' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0096',
	'en_US',
	'W',
	'Cannot change to a SEIBAN No. that is for a different sales project.\nSales project at PO: {1}\nPO details No.: {2}\nSEIBAN No.1: {3}\nSales project: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0097' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0097',
	'en_US',
	'W',
	'Cannot consolidate multiple sales projects into one PO slip.\nSEIBAN No.1: {1}\nSales project: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0098' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0098',
	'en_US',
	'W',
	'Cannot cancel since the next processing (receipt, purchase, purchase invoice entry) has been done.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0099' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0099',
	'en_US',
	'W',
	'Cannot enter since sales project in header and sales project corresponding to SEIBAN No.1 in details are different.\nSales project in header: {1}\nSales project in details: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0100' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0100',
	'en_US',
	'W',
	'PO schedules which are canceled its remaining schedules cannot be split or cancel the split.\nPO schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0101' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0101',
	'en_US',
	'W',
	'Cannot update data for approval since the next process (delivery order, receive order promising result, purchase invoice entry, receipt, purchase) has been done for this PO.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0102' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0102',
	'en_US',
	'W',
	'The specified slip does not contain details to be discounted.\nReference purchase result No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0103' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0103',
	'en_US',
	'W',
	'The request message is invalid.\nForecast date: {1}\nSupplier: {2}\nWG: {3}\nItem: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0104' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0104',
	'en_US',
	'W',
	'Cannot enter a purchase discount with reference to defective acceptance and all the remaining canceled purchase information.\nPurchase result No.: {1}\nPurchase result details No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0105' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0105',
	'en_US',
	'W',
	'The specified mfg. order No. does not exist.\nMfg. order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0106' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0106',
	'en_US',
	'W',
	'No information corresponding to the specified item, SEIBAN No., mfg. order No. is found.\nItem: {1}\nSEIBAN No.: {2}\nMfg. order No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0107' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0107',
	'en_US',
	'W',
	'No information corresponding to the specified supplier or mfg. order No. is found.\nSupplier: {1}\nMfg. order No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0108' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0108',
	'en_US',
	'W',
	'The asset management dept. corresponding to the mfg. location of the specified mfg. order does not match the charged dept.\nCharged dept.: {1}\nAsset management dept.: {2}\nMfg. order No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0109' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0109',
	'en_US',
	'W',
	'To cancel/correct PO of the subcontracted supplier, the correction reason is required.\nTo cancel it in PO header unit, specify "header" for search mode, specify the correction reason and cancel.\nTo delete some rows for details, correct them on the PO Entry screen.\nPO No.: {1}\nPO details No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0110' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0110',
	'en_US',
	'W',
	'Cannot make a delivery order for a receiving item free of charge or a receiving item for a fee.\nPO details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0111' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0111',
	'en_US',
	'W',
	'Cannot enter a delivery order since the status of Receive order promising result is Receipt schedule applied.\nCancel the applied receipt schedule first.\nPO details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0112' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0112',
	'en_US',
	'W',
	'Cannot correct the delivery order since the status of Receive order promising result is Receipt schedule applied.\nOrder promising result received No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0113' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0113',
	'en_US',
	'W',
	'Cannot cancel the delivery order since the status of Receive order promising result is Receipt schedule applied.\nOrder promising result received No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0114' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0114',
	'en_US',
	'W',
	'Cannot enter delivery orders that exceed unreceived qty.\nPO details No.: {1}\nExcess qty.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0115' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0115',
	'en_US',
	'W',
	'Cannot cancel since results have been recorded for receipt schedule or purchase schedule created according to the delivery order.\nDelivery order details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0116' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0116',
	'en_US',
	'W',
	'Cannot enter delivery order qty. that exceeds mfg. order qty.\nMfg. order No.: {1}\nMfg. order qty. (base unit): {2}\nDelivery order qty. total (base unit): {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0117' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0117',
	'en_US',
	'W',
	'Cannot enter the order promising result date earlier than the delivery order date.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0118' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0118',
	'en_US',
	'W',
	'Cannot cancel since the result has been entered for receipt schedule or purchase schedule.\nOrder promising result received No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0119' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0119',
	'en_US',
	'W',
	'Cannot cancel since the remaining receipt schedule or purchase schedule has been canceled.\nOrder promising result received No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0120' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0120',
	'en_US',
	'W',
	'Cannot update since the PO information has already been canceled.\nPO No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0121' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0121',
	'en_US',
	'W',
	'Cannot update to qty. below the result qty.\nDelivery order details No.: {1}\nResult qty.: {2}\nDelivery order qty.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0122' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0122',
	'en_US',
	'W',
	'Cannot enter order promising result received qty. that exceeds delivery order qty.\nDelivery order details No.: {1}\nDelivery order qty. (base unit): {2}\nReplied qty. total (base unit): {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0123' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0123',
	'en_US',
	'W',
	'There is no row for details linked to the delivery order header.\nThe entry must include at least 1 row of details linked to the header.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0124' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0124',
	'en_US',
	'W',
	'There is no row for details linked to the order promising result received header.\nThe entry must include at least 1 row of details linked to the header.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0125' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0125',
	'en_US',
	'W',
	'To cancel all the remaining receipt schedules / purchase schedules, cancel all remaining schedules at the same time.\nReceipt schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0126' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0126',
	'en_US',
	'W',
	'Purchase acceptance has been completed. Cannot cancel all the remaining receipt schedules.\nReceipt schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0127' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0127',
	'en_US',
	'W',
	'Cannot cancel the remaining schedules at the same time since remaining qty. of receipt schedule and purchase schedule are not the same.\nReceipt schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0128' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0128',
	'en_US',
	'W',
	'Cancel the remaining of receipt schedules and purchase schedules at the same time since they have been entered as results.\nReceipt schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0129' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0129',
	'en_US',
	'W',
	'Cannot display the supplier of the searched PO information on the Purchase Result Entry screen since it is subject to invoice transactions.\nSearch or update on the Purchase Invoice Entry screen.\nSupplier: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0130' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0130',
	'en_US',
	'W',
	'Cannot update the re-receipt qty. to less than the result qty.\nPurchase result details No.: {1}\nReceipt schedule No. (schedule re-receipt) : {2}\nReceipt result qty. (schedule re-receipt): {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0131' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0131',
	'en_US',
	'W',
	'Cannot turn off the Re-receipt since the receipt result has already been entered for the scheduled re-receipt.\nReceipt schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0132' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0132',
	'en_US',
	'W',
	'There is no record with the Expense purchase turned on in the Business Reason master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0133' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0133',
	'en_US',
	'W',
	'Cannot acquire a valid VMI purchasing department.\nInventory BP: {1}\nVMI purchasing dept.: {2}\nMaster application date: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0134' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0134',
	'en_US',
	'W',
	'An error occurred in other details consolidated in the same header.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0135' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0135',
	'en_US',
	'W',
	'The qty. in a row for details and the total qty. in a row for breakdown of details are different.\nDetails row qty. (base unit): {1}\nTotal qty. of breakdown of details rows (base unit): {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0136' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0136',
	'en_US',
	'W',
	'Cannot purchase more than the receipt qty.\nReceipt result No.: {1}\nReceived qty. (base unit): {2}\nTotal purchase qty. (base unit): {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0137' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0137',
	'en_US',
	'W',
	'Cannot enter the order promising result received qty. that exceeds unreceived qty.\nPO details No.: {1}\nExcess qty.: {2}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0138' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0138',
	'en_US',
	'W',
	'Cannot enter the order promising result received qty. that exceeds mfg. order qty.\nMfg. order No.: {1}\nMfg. order qty. (base unit): {2}\nTotal replied qty. (base unit): {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0139' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0139',
	'en_US',
	'W',
	'Cannot update the qty. to less than the result qty.\nOrder promising result received details No.: {1}\nResult qty.: {2}\nOrder promising result received qty.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0140' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0140',
	'en_US',
	'I',
	'Multiple slips have been created.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0141' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0141',
	'en_US',
	'I',
	'Purchase result No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0142' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0142',
	'en_US',
	'W',
	'There is no record with the Adopt at auto turned on in the Transaction master.\nTransaction pattern type: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0143' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0143',
	'en_US',
	'W',
	'To delete all the rows for details, delete the header as well.\nDelivery order header No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0144' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0144',
	'en_US',
	'W',
	'To delete all the rows for details, delete the header as well.\nOrder promising result received header No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0145' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0145',
	'en_US',
	'W',
	'Cannot change the mfg. order No. since the receipt result or purchase result has been entered. {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0146' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0146',
	'en_US',
	'W',
	'Cannot change since multiple dates have been set as recording date of purchase result.\nTo correct the purchase result at the same time in the receipt result list entry, set the same date for all recording dates of receipt results.\nPurchase result No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0147' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0147',
	'en_US',
	'W',
	'Cannot change since multiple dates have been set as purchase date of purchase result.\nTo correct the purchase result at the same time in the receipt result list entry, set the same date for all receipt dates of receipt results.\nPurchase result No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0148' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0148',
	'en_US',
	'W',
	'For items not for asset management, VMI cannot be specified for the Purchase identification type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0149' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0149',
	'en_US',
	'W',
	'Cannot enter items for asset management if the transaction is expense purchase.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0150' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0150',
	'en_US',
	'W',
	'For items for asset management, you cannot set the reason for expense purchase.\nItem: {1}\nReason cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0151' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0151',
	'en_US',
	'W',
	'For items not for asset management, set the reason for expense purchase.\nItem: {1}\nReason cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0152' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0152',
	'en_US',
	'W',
	'Cannot enter a purchase result for defective acceptance if it is unreceived.\nPO details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0153' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0153',
	'en_US',
	'W',
	'The total amount cannot be set to negative.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0154' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0154',
	'en_US',
	'W',
	'PO No. is specified, however no details that copied PO are found.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0155' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0155',
	'en_US',
	'W',
	'In the case of direct delivery, specify normal purchase for the Purchase identification type.\nPurchase identification type: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0156' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0156',
	'en_US',
	'W',
	'Could not issue a forecast list since an error occurred while issuing the forecast list.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0157' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0157',
	'en_US',
	'W',
	'Cannot specify a department whose WG is not set as a charged dept.\nCharged dept.: {1}\nWG: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0158' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0158',
	'en_US',
	'W',
	'For direct supply, defective acceptance cannot be corrected.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0159' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0159',
	'en_US',
	'W',
	'To enter the purchase result corresponding to the receipt result, specify the following value that is the same as the receipt result.\nColumn: {1}\nReceipt result No.: {3}\nReceipt result column: {2}\nReceipt result value: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0160' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0160',
	'en_US',
	'W',
	'The purchase active ingredient in details row is different from the total purchase active ingredient in a row for breakdown of details.\nDetails row qty.: {1}\nTotal qty. of breakdown of details row: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0161' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0161',
	'en_US',
	'W',
	'There is a difference between the sales order for direct delivery qty. and the PO qty.\nSales order qty. (base unit): {1}\nPO qty. (base unit): {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0162' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0162',
	'en_US',
	'W',
	'Cannot cancel the remaining purchase after receipt if receipt qty. and purchase qty. are not the same.\nReceipt qty. (base unit): {1}\nPurchase qty. (base unit): {2}\nReceipt schedule No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0163' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0163',
	'en_US',
	'W',
	'Cannot correct since the receipt result has already been entered.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0164' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0164',
	'en_US',
	'W',
	'Cannot cancel since the receipt result has already been entered.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0165' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0165',
	'en_US',
	'W',
	'Cannot change from internal location to external location.\nLocation before change cd.: {1}\nLocation after change cd.: {2}\nLocation after change supplier cd.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0166' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0166',
	'en_US',
	'W',
	'Cannot change from external location to other locations.\nLocation before change cd.: {1}\nLocation before change supplier cd.: {2}\nLocation before change cd.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0167' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0167',
	'en_US',
	'I',
	'Since all PO details corresponding to the PO are in the state of being canceled or receipt completed (including receipt unnecessary), there is no delivery note to be issued.\nPO No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0168' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0168',
	'en_US',
	'I',
	'Since all PO details corresponding to delivery orders are in the state of being canceled or receipt completed (including receipt unnecessary), there is no delivery note to be issued.\nDelivery order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0169' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0169',
	'en_US',
	'W',
	'Since delivery order has been canceled, there is no delivery note to be issued.\nDelivery order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0170' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0170',
	'en_US',
	'W',
	'Cannot correct or cancel since the searched purchase result has already been canceled.\nPurchase result No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0171' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0171',
	'en_US',
	'W',
	'Cannot correct or cancel since the searched purchase return result has been entered in the Sales Return Entry.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0172' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0172',
	'en_US',
	'W',
	'There is no receipt schedule for which delivery order can be made.\nPO details No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0173' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0173',
	'en_US',
	'W',
	'Cannot delete since either receipt, purchase, or purchase invoice entry has been done.\nOrder promising result received details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0174' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0174',
	'en_US',
	'W',
	'It is a supplier that is for invoice transaction, however there is a purchase schedule for which purchase invoice is not entered. Enter a purchase invoice.\nSupplier: {1}\nPurchase schedule No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0175' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0175',
	'en_US',
	'W',
	'No PO info. for charged PO No. is found.\nCharged PO No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0176' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0176',
	'en_US',
	'W',
	'No sales order information corresponding to sales order No. is found.\nSales order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0177' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0177',
	'en_US',
	'W',
	'No sales order information for charged sales No. is found.\nCharged sales No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0178' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0178',
	'en_US',
	'W',
	'No lot information corresponding to combination of charged item, charged lot No., and charged sublot No. is found.\nCharged item: {1}\nCharged lot No.: {2}\nCharged sublot No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0179' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0179',
	'en_US',
	'W',
	'No invoice information or purchase invoice information corresponding to the charged invoice No. is found.\nCharged invoice No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0180' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0180',
	'en_US',
	'W',
	'The combination of delivery order details No. and purchase result details No. is invalid.\nDelivery order details No.: {1}\nPurchase result details No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0181' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0181',
	'en_US',
	'W',
	'Cannot enter delivery orders that exceed unreceived qty.\nPO details No.: {1}\nPurchase result details No.: {2}\nExcess qty.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0182' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0182',
	'en_US',
	'W',
	'Cannot enter order promising result received qty. that exceeds unreceived qty.\nPO details No.: {1}\nPurchase result details No.: {2}\nExcess qty.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0183' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0183',
	'en_US',
	'W',
	'Cannot correct since purchase invoice has already been entered.\nOrder promising result received details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0184' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0184',
	'en_US',
	'W',
	'Cannot correct since purchase invoice has already been entered.\nDelivery order details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0185' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0185',
	'en_US',
	'W',
	'Cannot correct since purchase invoice has already been entered.\nOrder promising result received No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0186' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0186',
	'en_US',
	'W',
	'Cannot cancel since purchase invoice has already been entered.\nDelivery order details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0187' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0187',
	'en_US',
	'W',
	'Cannot cancel the remaining processing at the qty. that exceeds the scheduled purchase qty.\nScheduled purchase qty. (base unit): {1}\nPurchase qty. (base unit): {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0188' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0188',
	'en_US',
	'W',
	'Cannot cancel the remaining purchase processing since its receipt has not been completed.\nReceipt schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0189' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0189',
	'en_US',
	'W',
	'For receipt unnecessary items, you cannot specify receiving free of charge in the Purchase identification type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0190' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0190',
	'en_US',
	'W',
	'For discount items, specify normal purchase in the Purchase identification type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0191' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0191',
	'en_US',
	'W',
	'Cannot specify discount amount if the unit price is "0".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0192' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0192',
	'en_US',
	'W',
	'Cannot enter since there are other details with the same SEIBAN No. 1 but different sales project.\nSales project details: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0193' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0193',
	'en_US',
	'W',
	'Cannot enter negative amounts.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0194' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0194',
	'en_US',
	'W',
	'Cannot enter items for asset management if the transaction is an expense purchase return.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0195' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0195',
	'en_US',
	'W',
	'Cannot enter items for asset management if the transaction is expenses discount or expenses surplus.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0196' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0196',
	'en_US',
	'I',
	'Purchase return result No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0197' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0197',
	'en_US',
	'W',
	'SKU transfer is implemented for the sampling results in the inspection result entry.\nEnter SKU transferred sampling result as transferring for base unit.\nReceipt result No.: {1}\nSampling result draw out qty.: {2}\nSampling result SKU transfer qty.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0198' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0198',
	'en_US',
	'W',
	'Not entered in the Tax master.\nTax cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0199' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0199',
	'en_US',
	'W',
	'There is no receipt schedule that is available for order promising.\nPO details No.: {1}\nPurchase result details No.: {2}\nMfg. order No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0200' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0200',
	'en_US',
	'W',
	'Cannot change since multiple dates have been set as cancellation recording date of the purchase result.\nTo correct the purchase result at the same time in the Receipt Result List Entry, set the same date for all cancellation recording dates of receipt results. \nPurchase result No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0201' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0201',
	'en_US',
	'W',
	'The desired re-receipt date for the supplier that is a BP targeted to the Subcontract Act must be the same date as scheduled re-receipt purchase date.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0202' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0202',
	'en_US',
	'W',
	'The specified supplier/maker does not match the supplier/maker of the mfg. location in the Location master.\nSpecified supplier: {1}\nSpecified maker: {2}\nLocation master supplier: {3}\nLocation master maker: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0203' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0203',
	'en_US',
	'W',
	'Subsequent work is ongoing for re-receipt schedule.\nCannot correct columns for re-receipt schedule being changed or cancel purchase results.\n-Subsequent work is one of the following:\n  Delivery order, Receive order promising result, Receipt, or Purchase.\n-Columns that cannot be corrected are as follows:\n  Re-receipt, Re-receipt qty., Re-receipt location, Re-receipt rack/line, Desired re-receipt date, Re-receipt purchase schedule date, and Re-receipt simultaneously recording.\nPurchase result details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0204' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0204',
	'en_US',
	'W',
	'Cannot enter PO since it is a temporary sales order.\nSales order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0205' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0205',
	'en_US',
	'W',
	'For purchase invoice entry, enter the result qty. as same as purchase schedule qty.\nPurchase invoice management No.: {1}\nPurchase schedule No.: {2}\nPurchase schedule qty.: {3}\nResult qty. corresponding to purchase schedule: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0301' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0301',
	'en_US',
	'W',
	'Cannot divide rows for details or rows for breakdown of details corresponding to details since receipt schedule is subject to IF export.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0302' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0302',
	'en_US',
	'W',
	'Cannot enter a PO since the received advance payment has not reached the billing amount yet.\nSales order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0303' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0303',
	'en_US',
	'W',
	'Not entered in the Item Journal master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0304' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0304',
	'en_US',
	'W',
	'Not entered as a valid location in the Location master. Delivery location before correction: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0305' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0305',
	'en_US',
	'W',
	'Not entered as a valid location in the Location master. Delivery location in PO schedule: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0306' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0306',
	'en_US',
	'W',
	'Not entered as a valid location in the Location master. Delivery location: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0307' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0307',
	'en_US',
	'W',
	'Not entered in the Item Journal master.\nItem journal cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0308' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0308',
	'en_US',
	'W',
	'Cannot change the recording date since the purchase closing has been canceled.\nRecording date before correction: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0309' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0309',
	'en_US',
	'W',
	'Cannot split the purchase result header in the case of entering or correcting only the purchase of unreceived item.\nChange the date or tax so that the purchase result header will be one record.\nPurchase schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0401' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0401',
	'en_US',
	'I',
	'The PO bulk entry processing has started.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0402' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0402',
	'en_US',
	'I',
	'The PO bulk entry processing has completed.\nNumber of PO schedules to process: {1}\nNumber of PO schedules successfully proceeded: {2}\nNumber of PO schedules failed to be processed: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0403' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0403',
	'en_US',
	'W',
	'Specified purchasing dept. is invalid.\nPurchasing dept.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0404' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0404',
	'en_US',
	'W',
	'The combination of specified purchasing dept. and purchasing PIC is invalid.\nPurchasing PIC: {1}\nPurchasing dept.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0405' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0405',
	'en_US',
	'W',
	'Updated by other processing. Exclude from target.\nPO schedule No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0406' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0406',
	'en_US',
	'W',
	'An error has occurred while checking other details. Stop processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0407' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0407',
	'en_US',
	'W',
	'Cannot update since the specified delivery destination does not exist in the Sales Order Allocation Grading master.\nCustomer cd.: {1}\nDelivery destination cd.: {2}\nGrading cd.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0408' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0408',
	'en_US',
	'W',
	'Purchase invoice has already been entered for the delivery order. Specify the same value as the purchase invoice for the qty. of delivery order details.\nDelivery order details No.: {1}\nPurchase invoice qty.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0409' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0409',
	'en_US',
	'W',
	'Purchase invoice has already been entered for the received order promising result. Specify the same value as the purchase invoice for the qty. of order promising result received details.\nOrder promising result received details No.: {1}\nPurchase invoice qty.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0410' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0410',
	'en_US',
	'W',
	'If the Purchase recording type is "1: Receipt base", the desired delivery date and the scheduled purchase date must be the same.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0411' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0411',
	'en_US',
	'W',
	'If the Purchase recording type is "1: Receipt base", the Simultaneous recording flg. must be turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0412' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0412',
	'en_US',
	'W',
	'If the Purchase recording type is "2: Acceptance base", the Simultaneous recording flg. must be turned off.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0413' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0413',
	'en_US',
	'W',
	'If the Purchase recording type is "1: Receipt base", the desired re-receipt date and the scheduled re-receipt purchase date must be the same.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0414' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0414',
	'en_US',
	'W',
	'If the Purchase recording type is "1: Receipt base", the Re-receipt simultaneously recording flg. must be turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0415' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0415',
	'en_US',
	'W',
	'If the Purchase recording type is "2: Acceptance base", the Re-receipt simultaneously recording flg. must be turned off.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0501' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0501',
	'en_US',
	'W',
	'The total amount of the subcontracting unit price and the chargeable supply unit price is different from the unit price.\nTotal amount of subcontracting unit price and chargeable supply unit price: {1}\nUnit price: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0502' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0502',
	'en_US',
	'W',
	'The data entered last time is not reflected in GA.\nExport the unreflected purchase slip again from the Purchase Slip IF screen.\nData No.: {1}\nPurchase slip No.: {2}\nPurchase invoice No.: {3}\nPurchase invoice management No.: {4}\nPurchase result No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0503' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0503',
	'en_US',
	'W',
	'The corresponding purchase result is not entered in GA.\nYou cannot correct or cancel data that is not entered in GA.\nPurchase result No.: {1}\nPurchase invoice No.: {2}\nPurchase invoice management No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0504' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0504',
	'en_US',
	'W',
	'The setting of the Payment Schedule Control master is invalid. Could not calculate the scheduled payment date to be linked to GA.\nSet the same Site type for the WG as of the recording date and the scheduled payee closing year, month, and date.\n\nWG as of the recording date: {1}\nWG as of the scheduled payee closing year, month, and date: {2}\nScheduled payee: {3}\nCurrency: {4}\nAmount: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0505' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0505',
	'en_US',
	'W',
	'The setting of the Payment Schedule Control master is invalid. Could not calculate the scheduled payment date to be linked to GA.\nIf the Scheduled payee is payment per transaction and not subject to invoice transaction, specify "Date" in the Site type.\nWG: {1}\nScheduled payee: {2}\nCurrency: {3}\nAmount: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0506' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0506',
	'en_US',
	'W',
	'The item unit master does not exist.\nItem: {1}\nUnit: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0507' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0507',
	'en_US',
	'I',
	'Purchase forecast information entry processing has been completed.\nTo process: {1}\nNumber of entries: {2}\nNumber of errors: {3}\nNumber of skips: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0508' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0508',
	'en_US',
	'W',
	'Cannot enter items other than purchased items for unplanned entry.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0509' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0509',
	'en_US',
	'W',
	'The purchasing dept. is invalid.\nCheck if the PIC Authority master has been set for the recording date, purchasing PIC, and purchasing dept.\nRecording date: {1}\nPurchasing PIC cd.: {2}\nPurchasing dept. cd.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0510' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0510',
	'en_US',
	'W',
	'The purchasing dept. is invalid. Check the following:\n- The Dept. master corresponding to the specified dept. and application date must be set\n- The purchasing dept. in the Dept. master must be turned on \nApplication date: {1}\nPurchasing dept. cd.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0601' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0601',
	'en_US',
	'W',
	'If not specify the delivery order details No., you cannot enter the order promising result received qty. that exceeds the delivery order unentered qty.\nCorrect the quantity or specify the delivery order details No.\nPO details No.: {1}\nDelivery order unentered qty. (Base unit): {2}\nTotal replied qty. (Base unit): {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0602' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0602',
	'en_US',
	'W',
	'Cannot enter, correct, or cancel a delivery order because the order promising result has been received.\nPO details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0603' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0603',
	'en_US',
	'W',
	'For intercompany transactions, you cannot enter the Transaction unit cd. differs from the one used at the time of PO.  \nPO details No.: {1}\nTransaction unit cd. at PO: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0604' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0604',
	'en_US',
	'W',
	'If it is an intercompany transaction and a result has been recorded for a receipt schedule or a purchase schedule created in the delivery order, you cannot correct the data.\nDelivery order details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0605' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0605',
	'en_US',
	'W',
	'For intercompany transactions, you cannot enter a delivery order for a re-receipt schedule.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0606' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0606',
	'en_US',
	'W',
	'Cannot enter delivery orders that exceed the qty. for which purchase invoice is not entered.\nPO details No.: {1}\nExcess qty.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0607' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0607',
	'en_US',
	'W',
	'Cannot enter the order promising result received qty. that exceeds the qty. for which purchase invoice is not entered.\nPO details No.: {1}\nExcess qty.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0608' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0608',
	'en_US',
	'W',
	'In the case of simultaneous recording, enter the same date for the receipt date and recording date of all the receipt results included in the same purchase invoice details.\nPurchase invoice details No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0609' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0609',
	'en_US',
	'W',
	'Cannot correct or cancel since the remaining PO details have been canceled. \nTo correct or cancel, release the canceled remaining PO details.\nPO details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0610' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0610',
	'en_US',
	'W',
	'Transaction unit for the PO details does not exist in the Item Unit master.\nItem: {1}\nUnit: {2}\nPO details No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0611' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0611',
	'en_US',
	'W',
	'Transaction unit for the receipt schedule does not exist in the Item Unit master.\nItem: {1}\nUnit: {2}\nReceipt schedule No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0612' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0612',
	'en_US',
	'W',
	'Transaction unit for the order promising result received details does not exist in the Item Unit master.\nItem: {1}\nUnit: {2}\nOrder promising result received details No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0613' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0613',
	'en_US',
	'W',
	'The specified transaction is invalid. Specify a transaction that corresponds to the following Transaction type.\nTransaction cd.: {1}\nTransaction pattern type: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0614' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0614',
	'en_US',
	'W',
	'Cannot save the correction when sales/purchase simultaneous recording data is mixed.\nPurchase result No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0615' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0615',
	'en_US',
	'W',
	'Cannot correct/cancel the sales result because the purchase result, which was entered simultaneously with the sales, contains purchase result details that are not linked to the sales.\nDelete the purchase result details that are not linked to the sales and then, correct/cancel the sales result again.\nSales result details No.: {1}\nPurchase result No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0616' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBDL0616',
	'en_US',
	'W',
	'An error occurred in other details consolidated in the same header.\nFor more details, see other output messages.\nIf the error occurred in an unselected detail, a row No. is not displayed in the error message.\nPurchase result details No.: {1}\nPurchase result details No. where the error occurred: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0001',
	'en_US',
	'W',
	'It has fallen below the lower limit of input value check. \nInput value (Base unit qty.): {1}\nLower limit (movement order qty. * {2}): {3}\nMovement order details No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0002',
	'en_US',
	'W',
	'In the selected rows, the column whose value is different from value of transition source screen is not inherited at the time of screen transition.\nColumn whose value is not inherited: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0003',
	'en_US',
	'W',
	'It has fallen below the lower limit of input value check. \nInput value (Base unit qty.): {1}\nLower limit (movement schedule qty. * {2}): {3}\nMovement allocation status No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0004',
	'en_US',
	'W',
	'Cannot correct/cancel since purchase result has been entered for purchase invoice.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0005',
	'en_US',
	'W',
	'Inventory count cannot be conducted on the specified Control target date or Inventory count month.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0006',
	'en_US',
	'I',
	'Column whose different value specified in the selected rows is not inherited at the time of screen transition.\nColumn whose value is not inherited : {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0007',
	'en_US',
	'I',
	'Do you want to reacquire net weight and volume?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0008',
	'en_US',
	'W',
	'Cannot update the specified invoice since the export result has already been entered.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0009',
	'en_US',
	'W',
	'Different values are specified in the selected rows, but the following columns inherit the values in the selected rows.\nCoumns to inherit values: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0011',
	'en_US',
	'W',
	'Exceeded the upper limit for the input value check. \nInput value (Base unit qty.): {1}\nUpper limit (movement order qty. * {2}): {3}\nMovement order details No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0013',
	'en_US',
	'W',
	'Exceeded the upper limit for the input value check. \nInput value (Base unit qty.): {1}\nUpper limit (movement schedule qty. * {2}): {3}\nMovement allocation status No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0014',
	'en_US',
	'W',
	'Specify different values for loading port, unloading port and stopover point, respectively.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0015',
	'en_US',
	'W',
	'Cannot enter without details or only details with added rows.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0016',
	'en_US',
	'W',
	'Although purchase should be recorded first, recording receipt first here.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0017',
	'en_US',
	'W',
	'Failed to display the screen. The parent screen must be specified.\nModule ID: {1}\nScreen ID: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0018',
	'en_US',
	'W',
	'Failed to display the screen. The parent screen must have the mcframe.clientMSUD. MSUDP0020. IfStkInspBase interface.\nModule ID: {1}\nScreen ID: {2}\nParent screen class: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0019',
	'en_US',
	'W',
	'No value has been set for non-enterable search column. Set the value on the transit source screen.\nSearch column: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0020',
	'en_US',
	'I',
	'The acquire unit price process will be executed. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0021',
	'en_US',
	'I',
	'The acquire unit price process has been executed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0022',
	'en_US',
	'I',
	'The exchange rate acquisition process will be executed. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0023',
	'en_US',
	'I',
	'The exchange rate acquisition process has been executed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0024',
	'en_US',
	'W',
	'No row other than the base currency is selected.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0025',
	'en_US',
	'W',
	'Details to be assorted are not prepared.\nSales order No.: {1}\nAssortment type: {2}\nAssortment group No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0026',
	'en_US',
	'W',
	'The lot suggestion process will be executed. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0027' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0027',
	'en_US',
	'I',
	'The tax acquisition process will be executed. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0028' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0028',
	'en_US',
	'I',
	'The tax acquisition process has been executed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0029' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0029',
	'en_US',
	'W',
	'The qty. of invoice details exceeds shipping scheduled qty.\nInvoice qty. that can be entered: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0030' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0030',
	'en_US',
	'W',
	'Although receipt and purchase should be simultaneously recorded, they will be recorded separately here.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0031' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0031',
	'en_US',
	'W',
	'Although receipt and purchase should be recorded separately, they will be simultaneously recorded here.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0032' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0032',
	'en_US',
	'W',
	'Already shipped. Are you sure you want to cancel the invoice?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0033' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0033',
	'en_US',
	'W',
	'Although receipt should be recorded first, recording purchase first here.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0034' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0034',
	'en_US',
	'W',
	'Reference entry for a result via schedule cannot be done.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0035' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0035',
	'en_US',
	'W',
	'Reference entry for a result via order cannot be done.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0036' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0036',
	'en_US',
	'I',
	'There is a row that exceeds the checked number of identification tags. Do you want to print as it is?\nChecked number of identification tags: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0037' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0037',
	'en_US',
	'W',
	'The suggest lot/location processing will be executed. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0038' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0038',
	'en_US',
	'W',
	'A row that does not create a delivery slip is selected. A delivery slip for the selected row will be created. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0039' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0039',
	'en_US',
	'W',
	'The selected inventory information cannot be applied. Select the inventory information which has the same value for the following column.\nColumn: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0040' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0040',
	'en_US',
	'W',
	'Since the scheduled purchase date cannot be changed when the Purchase recording type is "Receipt base", details with different scheduled purchase dates cannot be consolidated.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0041' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0041',
	'en_US',
	'I',
	'Details with different scheduled purchase date are selected.\nSince the scheduled purchase date cannot be changed when the Purchase recording type is "Receipt base", the scheduled purchase date of details whose the Purchase recording type is "Receipt base" will be copied.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0101' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0101',
	'en_US',
	'W',
	'The qty. of invoice details is exceeding the shipping order qty. \nInvoice qty. that can be entered: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0102' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0102',
	'en_US',
	'W',
	'The qty. of invoice details is exceeding the shipping qty. \nInvoice qty. that can be entered: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0103' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0103',
	'en_US',
	'W',
	'Cannot specify a supplier who is not eligible for invoice transactions on the Purchase Invoice Entry screen.\nSupplier: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0104' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0104',
	'en_US',
	'W',
	'Specify "Header" for the search mode.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0105' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0105',
	'en_US',
	'W',
	'Specify an invoice whose Delivery destination identification type is "Delivery destination".');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0106' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0106',
	'en_US',
	'W',
	'Cannot make reference entry because details for direct delivery are included.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0107' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEP0107',
	'en_US',
	'W',
	'Cannot make reference entry because details that are not subject to purchase are included.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0001',
	'en_US',
	'W',
	'Lot No. must be specified.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0002',
	'en_US',
	'W',
	'Sublot No. must be specified.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0003',
	'en_US',
	'W',
	'Vendor lot No. must be specified.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0004',
	'en_US',
	'W',
	'There is no other accounting transfer schedule in the specified other accounting transfer schedule No.\nOther accounting transfer schedule No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0005',
	'en_US',
	'W',
	'Cannot acquire details of the specified other accounting transfer order No.\nOther accounting transfer order No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0006',
	'en_US',
	'W',
	'Cannot acquire details of the specified other accounting transfer result No.\nOther Accounting transfer result No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0007',
	'en_US',
	'W',
	'Receipt or purchase cannot be conducted at different locations in distribution group.\nLocation cd. before change: {1}\nDistribution group cd. before change: {2}\nLocation cd. before change: {3}\nDistribution group cd. before change: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0008',
	'en_US',
	'W',
	'Cannot receive at a different location in subcontractor.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0009',
	'en_US',
	'W',
	'Cannot acquire lot management information.\nItem: {1}\nLot No.: {2}\nSublot No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0010',
	'en_US',
	'W',
	'Cannot check the expiration date since the expiration date is not specified for the lot.\nItem: {1}\nLot No.: {2}\nSublot No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0011',
	'en_US',
	'W',
	'Cannot check the lot reverse since the expiration date is not specified for the lot.\nItem: {1}\nLot No.: {2}\nSublot No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0012',
	'en_US',
	'W',
	'Specified delivery contents do not satisfy the expiration date.\nCustomer cd.: {1}\nDelivery destination cd.: {2}\nShipping expiration date group cd.: {3}\nDelivery (scheduled) date: {4}\nItem: {5}\nLot No.: {6}\nSublot No.: {7}\nExpiration Date: {8}\nPermitted expiration date: {9}~');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0013',
	'en_US',
	'W',
	'Lot reverse occurred.\nCustomer cd.: {1}\nDelivery destination cd.: {2}\nDelivery (scheduled) date: {3}\nItem: {4}\nLot No.: {5}\nSublot No.: {6}\nExpiration date: {7}\nPermitted expiration date: {8} - {9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0014',
	'en_US',
	'W',
	'Could not enter shipping lot exclusive information. Excluded from processing.\nCustomer cd.: {1}\nDelivery destination cd.: {2}\nItem: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0015',
	'en_US',
	'W',
	'Could not lock shipping lot exclusive information. Excluded from processing.\nCustomer cd.: {1}\nDelivery destination cd.: {2}\nItem: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0016',
	'en_US',
	'W',
	'The specified items is prohibited from shipping.\nItem: {1}\nShipping date: {2}\nSales/Shipping prohibit date: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0017',
	'en_US',
	'W',
	'Transport of the specified items is prohibited.\nItem: {1}\nShipping date: {2}\nTransport/Movement prohibit date: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0018',
	'en_US',
	'W',
	'Export of the specified items is prohibited\nItem: {1}\nDelivery destination country: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0019',
	'en_US',
	'W',
	'Allocation of the specified items is prohibited.\nItem: {1}\nLot: {2}\nSublot No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0020',
	'en_US',
	'W',
	'Item without shipping works is not included in shipping target.\nInclude it in the shipping target before shipping.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0021',
	'en_US',
	'W',
	'No. of the invoice which consolidates shipping schedules is different from the one for sales order.\nInvoice No. (shipping): {1}\nInvoice No. (sales order): {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0022',
	'en_US',
	'W',
	'Cannot be shipped since shipping schedules subject to invoice transaction and shipping schedules not subject to invoice transaction coexist.\nSpecify invoice No. for the shipping schedules subject to invoice transaction.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0023',
	'en_US',
	'W',
	'To specify invoice No., select all shipping schedules of the target invoice.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0024',
	'en_US',
	'W',
	'If the Assortment type is set to "2: Assort", or Assortment group No. is specified, shipping schedule cannot be split.\nSales order No.: {1}\nAssortment type: {2}\nAssortment group No.: {3}\nShipping schedule No.: {4}\nScheduled qty. (base unit): {5}\nShipping qty. (base unit): {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0025',
	'en_US',
	'W',
	'Cannot delete the rows since you have canceled the remaining processing. To delete the rows, undo the canceled remaining first.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0026',
	'en_US',
	'W',
	'Cannot update or cancel since sales is already recorded.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0027' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0027',
	'en_US',
	'W',
	'Cannot update or cancel since receipt is already completed.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0028' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0028',
	'en_US',
	'W',
	'Cannot update or cancel since invoice is already shipped.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0029' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0029',
	'en_US',
	'W',
	'Cannot update or cancel due to shipping return target.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0030' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0030',
	'en_US',
	'W',
	'Cannot cancel since you have canceled the remaining processing. For cancellation, undo the canceled remaining first.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0031' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0031',
	'en_US',
	'W',
	'Shipping schedule No. is not specified. Shipping schedule No. must be specified for shipping other than order-aggregated shipping.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0032' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0032',
	'en_US',
	'W',
	'A shipping schedule with a different shipping result header column is specified.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0033' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0033',
	'en_US',
	'W',
	'Data conflicted during update.\nRe-execute the process.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0034' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0034',
	'en_US',
	'W',
	'Cannot update since inventory qty. is negative.\nItem: {1}\nLocation cd.: {2}\nRack/Line cd.: {3}\nInventory arriving point cd.: {4}\nLot No.: {5}\nSublot No.: {6}\nSEIBAN No.: {7}\nFirm No. type: {8}\nFirm No.: {9}\nSKU cd.: {10}\nGrading cd.: {11}\nIn-transit type: {12}\nConforming type: {13}\nAsset type: {14}\nInventory inspection type: {15}\nInventory identification type: {16}\nInventory BP cd.: {17}\nSKU qty.: {18}\nBase unit qty.: {19}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0035' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0035',
	'en_US',
	'W',
	'Cannot update since ending inventory qty. in monthly GR/GI and inventory is negative.\nYear month: {1}\nGR/GI type: {2}\nItem: {3}\nLocation cd.: {4}\nRack/Line cd.: {5}\nInventory arriving point cd.: {6}\nLot No.: {7}\nSublot No.: {8}\nSEIBAN No.: {9}\nFirm No. type: {10}\nFirm No.: {11}\nSKU cd.: {12}\nGrading cd.: {13}\nIn-transit type: {14}\nConforming type: {15}\nAsset type: {16}\nInventory inspection type: {17}\nInventory identification type: {18}\nInventory BP cd.: {19}\nSKU qty.: {20}\nBase unit qty.: {21}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0036' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0036',
	'en_US',
	'W',
	'Inventory qty. exceeds the number of significant digits.\nItem: {1}\nLocation cd.: {2}\nRack/Line cd.: {3}\nInventory arriving point cd.: {4}\nLot No.: {5}\nSublot No.: {6}\nSEIBAN No.: {7}\nFirm No. type: {8}\nFirm No.: {9}\nSKU cd.: {10}\nGrading cd.: {11}\nIn-transit type: {12}\nConforming type: {13}\nAsset type: {14}\nInventory inspection type: {15}\nInventory identification type: {16}\nInventory BP cd.: {17}\nSKU qty.: {18}\nBase unit qty.: {19}\nSignificant digits in integral places: {20}\nSignificant digits in decimal places : {21}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0037' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0037',
	'en_US',
	'W',
	'Transaction qty. exceeds the number of significant digits.\nYear month: {1}\nGR/GI type: {2}\nItem: {3}\nLocation cd.: {4}\nRack/Line cd.: {5}\nInventory arriving point cd.: {6}\nLot No.: {7}\nSublot No.: {8}\nSEIBAN No.: {9}\nFirm No. type: {10}\nFirm No.: {11}\nSKU cd.: {12}\nGrading cd.: {13}\nIn-transit type: {14}\nConforming type: {15}\nAsset type: {16}\nInventory inspection type: {17}\nInventory identification type: {18}\nInventory BP cd.: {19}\nSKU qty.: {20}\nBase unit qty.: {21}\nSignificant digits in integral places: {22}\nSignificant digits in decimal places : {23}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0038' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0038',
	'en_US',
	'W',
	'Cannot ship since the Pending shipping is specified.\nShipping schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0039' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0039',
	'en_US',
	'W',
	'Could not allocate since there is no allocatable inventory or GR/GI schedule.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0040' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0040',
	'en_US',
	'W',
	'When moving/transporting inventory from own company to own company, specify one of the following for the Inventory identification type: "Internal inventory", "VMI", "Defective acceptance", "Receiving free of charge".\nGI location cd.: {1}\nGR location cd.: {2}\nInventory identification type: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0041' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0041',
	'en_US',
	'W',
	'When moving/transporting inventory from subcontractor to own company, specify one of the following for the Inventory identification type: "Internal inventory",\n"Defective acceptance", "Receiving free of charge", "Chargeable supply".\nGI location cd.: {1}\nGR location cd.: {2}\nInventory identification type: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0042' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0042',
	'en_US',
	'W',
	'When moving/transporting inventory from own company to subcontractor, specify one of the following for the Inventory identification type: "Own company", "VMI", "Receiving free of charge".\nGI location cd.: {1}\nGR location cd.: {2}\nInventory identification type: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0043' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0043',
	'en_US',
	'W',
	'When moving/transporting inventory from subcontractor to subcontractor, specify one of the following for the Inventory identification type: "Own company",\n"Receiving free of charge", "Chargeable supply".\nGI location cd.: {1}\nGR location cd.: {2}\nInventory identification type: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0044' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0044',
	'en_US',
	'W',
	'For an invoice transaction where inventory is moved or transported from own company to own company, specify one of the following for the Inventory identification type: "Internal inventory", "VMI", "Defective acceptance", "Receiving free of charge".\nGI location cd.: {1}\nGR location cd.: {2}\nInventory identification type: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0045' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0045',
	'en_US',
	'W',
	'Receipt is already completed. Receipt schedule cannot be corrected or canceled.\nReceipt schedule No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0046' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0046',
	'en_US',
	'W',
	'Purchase acceptance has already been completed. Receipt schedule cannot be corrected or canceled.\nReceipt schedule No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0047' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0047',
	'en_US',
	'W',
	'Sales has already been recorded. Receipt schedule cannot be corrected or canceled.\nReceipt schedule No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0048' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0048',
	'en_US',
	'W',
	'The remaining receipt schedule has already been canceled. Correct after releasing the canceled remaining.\nReceipt schedule No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0049' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0049',
	'en_US',
	'W',
	'Cannot cancel the remaining receipt schedules since mfg. order No. is not set.\nReceipt schedule No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0050' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0050',
	'en_US',
	'W',
	'When shipping via receiving point, specify receiving point as destination.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0051' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0051',
	'en_US',
	'W',
	'The specified transaction is not available.\nSpecify transaction in which the following Transaction pattern type is specified.\nTransaction pattern type: "Sales　order", "Shipping", "Movement/ Transport", "Movement / Transfer return", "Supply", "Supply return".\nTransaction cd.: {1}\nTransaction pattern type: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0052' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0052',
	'en_US',
	'W',
	'The relationship between transaction and receiving point is invalid.\nWhen using the transaction with the following Transaction pattern type specified, specify "Delivery destination" as receiving point.\nTransaction pattern type: "Sales order" "Shipping"\nTransaction cd.: {1}\nTransaction pattern type: {2}\nReceiving point identification type: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0053' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0053',
	'en_US',
	'W',
	'The relationship between transaction and receiving point is invalid.\nWhen using the transaction with the following Transaction pattern type specified, specify "Location" as receiving point.\nTransaction pattern type: "Movement/Transport", "Movement/Transport return", "Supply", "Supply return"\nTransaction cd.: {1}\nTransaction pattern type: {2}\nReceiving point identification type: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0054' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0054',
	'en_US',
	'W',
	'The relationship between transaction and receiving point is invalid.\nWhen using the transaction with the following Transaction pattern type specified, specify "Delivery destination" as destination.\nTransaction pattern type: "Sales order" "Shipping"\nTransaction cd.: {1}\nTransaction pattern type: {2}\nDelivery destination identification type: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0055' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0055',
	'en_US',
	'W',
	'The relationship between transaction and receiving point is invalid.\nWhen using the transaction with the following Transaction pattern type set, specify "Location" as delivery destination.\nTransaction pattern type: "Movement/Transport", "Movement/Transport return", "Supply", "Supply return"\nTransaction cd.: {1}\nTransaction pattern type: {2}\nDelivery destination identification type: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0056' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0056',
	'en_US',
	'W',
	'Cannot use the specified Inventory inspection type if GR location or GI location is subcontractor.\nGR location cd.: {1}\nGI location cd.: {2}\nInventory inspection type: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0057' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0057',
	'en_US',
	'W',
	'Cannot specify the transport within distribution group.\nReceiving point distribution group cd.: {1}\nShipping point distribution group cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0058' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0058',
	'en_US',
	'W',
	'Cannot order since the specified other accounting transfer schedule is unapproved.\nOther accounting transfer schedule No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0059' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0059',
	'en_US',
	'W',
	'Cannot record a result since the specified other accounting transfer schedule is unapproved.\nOther accounting transfer schedule No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0060' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0060',
	'en_US',
	'W',
	'Cannot set different distribution group for GI location and GR location.\nSet the same distribution group for GI location and GR location.\nGI location cd.: {1} \nGR location cd.: {2}\n{3}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0061' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0061',
	'en_US',
	'W',
	'Cannot acquire GI information of the specified result.\nInventory transfer result No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0062' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0062',
	'en_US',
	'W',
	'Cannot acquire GR information of the specified result.\nInventory transfer result No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0063' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0063',
	'en_US',
	'W',
	'SEIBAN No.1 is specified for items whose SEIBAN No.1 management type is set to "Do not manage" or "Manage (Optional/Not for inventory)".\nItem: {1}\nSEIBAN No. 1 management type: {2}\nSEIBAN No. 1: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0064' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0064',
	'en_US',
	'W',
	'SEIBAN No.2 is specified for items whose SEIBAN No.2 management type is set to "Do not manage" or "Manage (Optional/Not for inventory)".\nItem: {1}\nSEIBAN No. 2 management type: {2}\nSEIBAN No. 2: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0065' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0065',
	'en_US',
	'W',
	'SEIBAN No.3 is specified for items whose SEIBAN No.3 management type is set to "Do not manage" or "Manage (Optional/Not for inventory)".\nItem: {1}\nSEIBAN No. 3 management type: {2}\nSEIBAN No. 3: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0066' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0066',
	'en_US',
	'W',
	'SEIBAN No.4 is specified for items whose SEIBAN No.4 management type is set to "Do not manage" or "Manage (Optional/Not for inventory)".\nItem: {1}\nSEIBAN No. 4 management type: {2}\nSEIBAN No. 4: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0067' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0067',
	'en_US',
	'W',
	'Lot No. is specified for items whose Lot management type is set to "Do not manage lot No.".\nItem: {1}\nLot management type: {2}\nLot No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0068' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0068',
	'en_US',
	'W',
	'Sublot No. is specified for items whose Sublot management type is set to "Not manage sublot No.".\nItem: {1}\nSublot management type: {2}\nSublot No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0069' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0069',
	'en_US',
	'W',
	'Inventory BP is specified for items whose Inventory identification type is set to "Internal inventory".\nItem: {1}\nInventory identification type: {2}\nInventory BP cd.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0070' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0070',
	'en_US',
	'W',
	'Cannot transfer multiple GI details or multiple GR details.\nNumber of GI details: {1}\nNumber of GR details: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0071' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0071',
	'en_US',
	'W',
	'Cannot transfer items in which item for asset management and the one not for asset management coexist.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0072' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0072',
	'en_US',
	'W',
	'Cannot transfer inventory that matches the transfer contents.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0073' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0073',
	'en_US',
	'W',
	'Cannot transfer items that match GR/GI items.\nItem: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0074' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0074',
	'en_US',
	'W',
	'The total of "Base unit qty." in the GI information is different from the total of "Base unit qty." in the GR information.\nGI qty.: {1}\nGR qty.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0075' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0075',
	'en_US',
	'W',
	'Specify the value so that the value in the following column is one type of value.\nColumn name: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0076' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0076',
	'en_US',
	'W',
	'Cannot correct or cancel since the purchase result has been entered for the purchase invoice.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0077' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0077',
	'en_US',
	'W',
	'Specify different values for loading port, unloading port, and stopover point, respectively.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0078' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0078',
	'en_US',
	'W',
	'Could not acquire exchange rates for transaction currency and base currency. Set the Exchange Rate master.\nTransaction currency: {1}\nBase currency: {2}\nApplication date: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0079' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0079',
	'en_US',
	'W',
	'Specified other accounting transfer schedule No. is not unapproved. Cancel the approval status first.\nOther accounting transfer schedule No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0080' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0080',
	'en_US',
	'W',
	'Not entered as a receiving point.\nReceiving point identification type: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0081' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0081',
	'en_US',
	'W',
	'Not entered as a delivery destination.\nDelivery destination identification type: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0082' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0082',
	'en_US',
	'W',
	'Cannot use the specified Inventory identification type in "Other accounting transfer GI". Specify the correct Inventory identification type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0083' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0083',
	'en_US',
	'W',
	'Cannot use the specified Inventory identification type in "Other accounting transfer GR". Specify the correct Inventory identification type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0084' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0084',
	'en_US',
	'W',
	'Cannot use the specified Inventory identification type in "Disposal". Specify the correct Inventory identification type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0085' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0085',
	'en_US',
	'W',
	'There is no unallocated inventory. Cannot use allocated inventory.\nItem: {1}\nLocation: {2}\nRack/Line: {3}\nLot No.: {4}\nSublot No.: {5}\nSEIBAN No.: {6}\nSKU: {7}\nGrading: {8}\nConforming type: {9}\nInventory identification type: {10}\nInventory BP: {11}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0086' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0086',
	'en_US',
	'W',
	'Cannot correct or cancel purchase invoice since it has already been entered.\nInvoice No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0087' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0087',
	'en_US',
	'W',
	'It has already been ordered. Shipping schedule cannot be corrected or canceled.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0088' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0088',
	'en_US',
	'W',
	'It has already been shipped. Shipping schedule cannot be corrected or canceled.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0089' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0089',
	'en_US',
	'W',
	'Cannot correct or cancel the shipping schedule since it has already aggregated in an invoice.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0090' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0090',
	'en_US',
	'W',
	'The remaining shipping schedules have already been canceled. Cancel after releasing the canceled remaining schedules.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0091' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0091',
	'en_US',
	'W',
	'Cannot correct the shipping schedule since order consolidation is conducted.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0092' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0092',
	'en_US',
	'I',
	'Cannot divide shipping schedule for each distribution group since assortment is specified.\nShipping schedule with a different distribution group is consolidated with shipping schedule of a shipping point distribution group.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0093' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0093',
	'en_US',
	'W',
	'Cannot change columns that affect allocation processing, such as item, unit, grading, and lot since there is a firmed shipping schedule.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0094' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0094',
	'en_US',
	'W',
	'Cannot correct a qty. to below the firmed shipping schedule qty.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0095' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0095',
	'en_US',
	'W',
	'Cannot delete since there is a firmed shipping schedule.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0096' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0096',
	'en_US',
	'W',
	'Cannot enter inventory information for the specified base date of inventory count, location, and item.\nBase date of inventory count: {1}\nLocation cd.: {2}\nItem: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0097' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0097',
	'en_US',
	'W',
	'Cannot enter inventory information since it is taking inventory count.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0098' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0098',
	'en_US',
	'W',
	'VMI item is not for inventory count.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0099' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0099',
	'en_US',
	'W',
	'Inventory before return acceptance is not for inventory count.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0100' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0100',
	'en_US',
	'W',
	'Inventory before purchase acceptance is not for inventory count.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0101' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0101',
	'en_US',
	'W',
	'In-transit inventory is not for inventory count.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0102' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0102',
	'en_US',
	'W',
	'Cannot add since inventory already exists.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0103' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0103',
	'en_US',
	'W',
	'Cannot create logical inventory since inventory count was conducted after the specified date.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0104' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0104',
	'en_US',
	'W',
	'Cannot create logical inventory since inventory count started previously has not completed yet.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0105' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0105',
	'en_US',
	'W',
	'Inventory cannot be firmed since counted qty. input is not completed.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0106' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0106',
	'en_US',
	'W',
	'Inventory was updated after logical inventory was created. Re-create logical inventory, or execute with the "Logical inventory check not required" turned on.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0107' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0107',
	'en_US',
	'W',
	'Cannot output since inventory count has not started.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0108' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0108',
	'en_US',
	'W',
	'Cannot update since logical inventory qty. is negative.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0109' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0109',
	'en_US',
	'W',
	'Not entered as Shipping requested.\nShipping requested identification type: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0110' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0110',
	'en_US',
	'W',
	'Cannot enter the movement result since it has already been canceled.\nMovement allocation status No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0111' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0111',
	'en_US',
	'W',
	'Cannot receive unplanned goods in the specified transaction.\nSpecify transaction in which the following Transaction pattern type is specified.\nTransaction pattern type: "Receipt" "Shipping return"\nTransaction cd.: {1}\nTransaction pattern type: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0112' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0112',
	'en_US',
	'W',
	'Cannot receive. The Conforming type of receipt which can be used in\nunplanned receipt ("Receiving free of charge", "VMI", "Consignment inventory GR" and "Consignment return") is "Conforming item" only.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0113' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0113',
	'en_US',
	'W',
	'Unplanned receipt cannot be conducted from supplier that is for invoice transaction.\nSupplier: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0114' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0114',
	'en_US',
	'W',
	'In transit management cannot be performed for the specified Transaction pattern type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0115' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0115',
	'en_US',
	'W',
	'Cannot receive since the lot is unfirmed.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0116' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0116',
	'en_US',
	'W',
	'Cannot cancel the remaining receipts in in-transit management.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0117' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0117',
	'en_US',
	'W',
	'Cannot receive VMI items if receipt location is external.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0118' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0118',
	'en_US',
	'W',
	'Cannot enter since shipping point deadline is not specified.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0119' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0119',
	'en_US',
	'W',
	'Unplanned receipt cannot be conducted from a subcontracted supplier.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0120' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0120',
	'en_US',
	'W',
	'Cannot enter since it is not simultaneous recording. Enter receipt and purchase simultaneously for subcontracted supplier.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0121' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0121',
	'en_US',
	'W',
	'Cannot update since purchase acceptance has been completed.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0122' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0122',
	'en_US',
	'W',
	'In the case of in transit management, specify qty. less than or equal to the purchase qty. as the receipt qty.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0123' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0123',
	'en_US',
	'W',
	'Cannot change the simultaneous recording setting from on to off and vice versa.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0124' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0124',
	'en_US',
	'W',
	'There is no data whose purchase application start date is earlier than the desired delivery date in the Version master.\nItem: {1}\nFactory/Distribution warehouse cd.: {2}\nDesired delivery date: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0125' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0125',
	'en_US',
	'W',
	'In transit management cannot be performed for direct delivery.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0126' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0126',
	'en_US',
	'W',
	'Cannot receive since the mfg. order No. is not set.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0127' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0127',
	'en_US',
	'W',
	'Cannot update since sales have already been recorded.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0128' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0128',
	'en_US',
	'W',
	'Items included in the specified invoice are prohibited from sales/shipping.\nInvoice No.: {1}\nItem: {2}\nCompletion date: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0129' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0129',
	'en_US',
	'W',
	'Cannot receive since distribution group of return-from location is different that of receipt location.\nReturn-from location cd.: {1}\nReturn-from distribution group cd.: {2}\nReceipt location cd.: {3}\nReceipt distribution group cd.: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0130' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0130',
	'en_US',
	'W',
	'Cannot cancel the remaining receipt processing for the following: Transport, transport return, supply, and supply return.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0131' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0131',
	'en_US',
	'W',
	'Cannot cancel since the remaining processing has already been canceled. To cancel, release the canceled remaining processing first.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0132' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0132',
	'en_US',
	'W',
	'Cannot cancel since purchase acceptance has been completed.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0133' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0133',
	'en_US',
	'W',
	'Cannot cancel since sales has already been recorded.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0134' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0134',
	'en_US',
	'W',
	'The specified invoice does not exist.\nInvoice No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0135' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0135',
	'en_US',
	'W',
	'Cannot update the specified invoice since the export result has already been entered.\nInvoice No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0136' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0136',
	'en_US',
	'W',
	'The specified invoice is not for a packing list entry.\nInvoice No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0137' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0137',
	'en_US',
	'W',
	'The total qty. for each of the following does not match with the total qty. in the invoice details: item, item name, SEIBAN No., place of origin, unit, customer order No., customers order details No., customer item and customer item name.\nItem: {1}\nItem Name: {2}\nSEIBAN No.: {3}\nPlace of origin: {4}\nUnit: {5}\nCustomer order No.: {6}\nCustomer order details No.: {7}\nCustomer item: {8}\nCustomer item name: {9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0138' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0138',
	'en_US',
	'W',
	'Excluded since the specified shipping schedule is not inventory.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0139' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0139',
	'en_US',
	'W',
	'Excluded since the specified shipping schedule is not pending.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0140' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0140',
	'en_US',
	'W',
	'Cannot update since delivery note details linked to the same delivery note No. include details with different recording date, tax rate,\nexchange rate, taxpaying exchange rate, withholding tax rate, base currency cd. and taxpaying currency cd.\nDelivery note No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0141' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0141',
	'en_US',
	'W',
	'Excluded since the specified Shipping schedule allocation type is neither "Immediate allocation" nor "Post allocation".');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0142' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0142',
	'en_US',
	'W',
	'There are no changeable shipping schedules and allocatable inventory/GR schedules.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0143' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0143',
	'en_US',
	'W',
	'The shipping requested location of the specified invoice is prohibited from sales/shipping.\nShipping requested: {1}\nCompletion date: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0144' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0144',
	'en_US',
	'W',
	'Cannot enter an export result since it cannot be converted to SKU at the time of shipment.\nInvoice No.: {1}\nInvoice details No.: {2}\nBase unit qty.: {3}\nSKU for shipping: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0145' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0145',
	'en_US',
	'W',
	'Cannot ship for each invoice. A shipping schedule which is the target of invoice consolidation has been released or its result has been entered.\nShipping schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0146' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0146',
	'en_US',
	'W',
	'Cannot specify "{1}" as invoice No.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0147' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0147',
	'en_US',
	'W',
	'Invoice No. to be numbered already exists.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0148' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0148',
	'en_US',
	'W',
	'Cannot cancel the invoice since the packing list is already entered.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0149' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0149',
	'en_US',
	'W',
	'When shipping for each invoice, you cannot change the invoice qty. from the shipping scheduled qty.\nNumber of invoices: {1}\nShipping scheduled qty.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0150' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0150',
	'en_US',
	'W',
	'Cannot transfer qty. that exceeds the allocation qty. of transfer source.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0151' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0151',
	'en_US',
	'W',
	'Cannot enter since the total qty. of allocation transfer exceeds the pending qty. of transfer destination.\nPending qty.: {1}\nTotal of allocation transfer qty.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0152' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0152',
	'en_US',
	'E',
	'The GR/GI type cannot be determined.\nTransaction pattern type: {1}\nTransaction type: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0153' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0153',
	'en_US',
	'W',
	'Cannot specify the qty. whose total is different from shipping scheduled qty.\nShipping schedule No.: {1}\nShipping scheduled qty.: {2}\nTotal of input: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0154' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0154',
	'en_US',
	'W',
	'Cannot cancel all remaining shipping schedules. To cancel all the remaining schedules, cancel sales orders or movement/transport schedules of the request source.\nShipping schedule No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0155' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0155',
	'en_US',
	'W',
	'Not entered in the Distribution Control master.\nReceiving point distribution group cd.: {1}\nShipping point distribution group cd.: {2}\nShipping conditions cd.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0156' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0156',
	'en_US',
	'W',
	'The Shipping point calendar cd. is not set. \nSee the setting of the Distribution Group master or Company master.\nShipping point distribution group cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0157' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0157',
	'en_US',
	'W',
	'The Receiving point calendar cd. is not set. \nSee the setting of the Location master or Company master.\nReceiving point identification type: {1}\nReceiving point identification type cd.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0158' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0158',
	'en_US',
	'W',
	'The Receiving point calendar cd. is not set. \nSee the setting of the BP master or Company master.\nReceiving point identification type: {1}\nReceiving point identification type cd.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0159' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0159',
	'en_US',
	'W',
	'Could not acquire the shippable date.\nReceiving point distribution group cd.: {1}\nShipping point distribution group cd.: {2}\nShipping conditions cd.: {3}\nArrival day of week: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0160' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0160',
	'en_US',
	'W',
	'Could not acquire the shippable date.\nReceiving point distribution group cd.: {1}\nShipping point distribution group cd.: {2}\nShipping conditions cd.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0161' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0161',
	'en_US',
	'W',
	'Could not acquire the deliverable date.\nReceiving point distribution group cd.: {1}\nShipping point distribution group cd.: {2}\nShipping conditions cd.: {3}\nArrival day of week: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0162' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0162',
	'en_US',
	'I',
	'There is a shipping schedule whose scheduled delivery date and time is later than the desired delivery date and time.\nScheduled delivery date and time: {1}\nDesired delivery date and time: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0163' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0163',
	'en_US',
	'I',
	'There is a shipping schedule whose scheduled shipping date and time is later than the desired shipping date and time.\nScheduled shipping date and time: {1}\nDesired shipping date and time: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0164' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0164',
	'en_US',
	'W',
	'These are transfer source details which cannot be allocated to the transfer destination.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0165' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0165',
	'en_US',
	'W',
	'In the case of an invoice transaction where inventory is moved/transported from own company to a subcontractor, specify one of the following as the Inventory identification type: "Own company", "VMI", or "Receiving free of charge".\nGI location cd.: {1}\nGR location cd.: {2}\nInventory identification type: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0166' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0166',
	'en_US',
	'W',
	'Could not acquire exchange rates for transaction currency and tax currency. Set the Exchange Rate master.\nTransaction currency: {1}\nTax currency: {2}\nApplication date: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0167' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0167',
	'en_US',
	'W',
	'The specified transaction is not available.\nSpecify transaction in which the following Transaction pattern type is specified.\nTransaction pattern type: "Purchase", "Expense purchase", "Sales return", "Shipping return",\n"Movement/Transport", "Movement/Transport return", "Supply" "Supply return", "Receipt"\nTransaction cd.: {1}\nTransaction pattern type: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0168' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0168',
	'en_US',
	'W',
	'Items not for asset management in receipt transaction cannot be set for reasons other than expense purchase.\nTransaction cd.: {1}\nItem: {2}\nReason cd.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0169' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0169',
	'en_US',
	'W',
	'There is no consignment inventory satisfying GI qty.\nItem: {1}\nInventory arriving point: {2}\nLot No.: {3}\nSublot No.: {4}\nSEIBAN No.: {5}\nFirm No. type: {6}\nFirm No.: {7}\nSKU: {8}\nGrading: {9}\nIn-transit type: {10}\nConforming type: {11}\nInventory inspection type: {12}\nInventory identification type: {13}\nInventory BP: {14}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0170' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0170',
	'en_US',
	'W',
	'There is no inventory satisfying GI qty.\nItem: {1}\nLocation: {2}\nRack/Line: {3}\nInventory arriving point: {4}\nLot No.: {5}\nSublot No.: {6}\nSEIBAN No.: {7}\nSKU: {8}\nGrading: {9}\nIn-transit type: {10}\nConforming type: {11}\nInventory inspection type: {12}\nInventory identification type: {13}\nInventory BP: {14}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0171' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0171',
	'en_US',
	'W',
	'There is no uninspected inventory.\nItem: {1}\nLocation: {2}\nRack/Line: {3}\nInventory arriving point: {4}\nLot No.: {5}\nSublot No.: {6}\nSEIBAN No.: {7}\nSKU: {8}\nGrading: {9}\nIn-transit type: {10}\nConforming type: {11}\nInventory inspection type: {12}\nInventory identification type: {13}\nInventory BP: {14}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0172' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0172',
	'en_US',
	'W',
	'Cannot cancel since the shipping result has been entered.\nShipping order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0173' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0173',
	'en_US',
	'W',
	'Firm No. is specified for inventory whose Firm No. type is "None".\nFirm No. type: {1}\nFirm No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0174' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0174',
	'en_US',
	'W',
	'Cannot enter since inventory to be shipped has not been firmed.\nShipping order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0175' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0175',
	'en_US',
	'W',
	'Cannot create a receipt schedule since there is no consignment inventory.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0176' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0176',
	'en_US',
	'W',
	'If the Customer extraction type is specified, the Customer must be specified.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0177' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0177',
	'en_US',
	'W',
	'If the Customer is specified, the Customer extraction type must be specified.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0178' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0178',
	'en_US',
	'W',
	'Allocation was not processed because the shipping schedule was updated during the allocation processing. \nRe-execute the process.\nLocation cd.: {1}\nDistribution group cd.: {2}\nGross allocation group cd.: {3}\nItem: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0179' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0179',
	'en_US',
	'I',
	'The inventory bulk allocation processing has completed.\nNumber of processed target: {1}\nNumber of cases which could be 100% allocated: {2}\nNumber of cases which could be allocated partially: {3}\nNumber of cases which could not be allocated: {4}\nNumber of errors: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0180' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0180',
	'en_US',
	'W',
	'Not entered in the Distribution Control master.\nShipping point distribution group cd.: {1}\nReceiving point distribution group cd.: {2}\nShipping conditions cd.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0181' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0181',
	'en_US',
	'I',
	'Staring the inventory re-allocation processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0182' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0182',
	'en_US',
	'I',
	'The inventory re-allocate processing has completed.\nNumber of processed target: {1}\nNumber of cases which can be 100% allocated: {2}\nNumber of cases which can be allocated partially: {3}\nNumber of cases which cannot be allocated: {4}\nNumber of errors: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0183' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0183',
	'en_US',
	'W',
	'Cannot enter self supply items.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0184' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0184',
	'en_US',
	'W',
	'Consignment inventory with firm No. specified is not for inventory count.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0185' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0185',
	'en_US',
	'W',
	'The specified inventory arriving point is not for inventory count.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0186' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0186',
	'en_US',
	'W',
	'Inventory count cannot be conducted on the specified Control target date or Inventory count month.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0187' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0187',
	'en_US',
	'W',
	'Cannot enter the specified values in the following columns together: the Conforming type, Inventory inspection type, In-transit type, Inventory identification type, Inventory BP, Firm No., and Inventory arriving point.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0188' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0188',
	'en_US',
	'W',
	'If supply is selected as a transaction, a subcontractor location must be set as a GR location.\nTransaction cd.: {1}\nGR location cd.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0189' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0189',
	'en_US',
	'W',
	'If supply return is selected as a transaction, an internal location must be set as a GR location.\nTransaction cd.: {1}\nGR location cd.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0190' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0190',
	'en_US',
	'W',
	'If supply return is selected as a transaction, a subcontractor location must be set as a GI location.\nTransaction cd.: {1}\nGI location cd.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0191' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0191',
	'en_US',
	'W',
	'If movement/transport or movement/transport return is selected as a transaction, an internal location must be set as a GR location.\nTransaction cd.: {1}\nGR location cd.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0192' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0192',
	'en_US',
	'W',
	'If movement/transport or movement/transport return is selected as a transaction, an internal location must be set as a GI location.\nTransaction cd.: {1}\nGI location cd.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0194' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0194',
	'en_US',
	'W',
	'Multiple records are entered with the same purchase invoice No.\nSelect the target purchase invoice on the Purchase Invoice List screen, then transit to this screen.\nPurchase invoice No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0195' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0195',
	'en_US',
	'W',
	'Cannot allocate since it is already allocated.\nMovement allocation status No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0196' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0196',
	'en_US',
	'W',
	'Cannot release allocation since it is not allocated.\nMovement allocation status No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0197' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0197',
	'en_US',
	'W',
	'Could not allocate since there is no allocatable inventory or GR/GI schedule.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0198' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0198',
	'en_US',
	'W',
	'Could not acquire the slip report. Check the BP master or Transaction master.\nBP cd.: {1}\nTrading cd.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0199' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0199',
	'en_US',
	'W',
	'GI location is not set. Allocate first or enter the location on the Movement Result Entry screen.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0200' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0200',
	'en_US',
	'W',
	'The total of base unit qty. of Movement/transport schedule No. varies before and after the update.\nMovement/Transport schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0201' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0201',
	'en_US',
	'W',
	'A combination of movement result No., movement result details No. and the Data update type is invalid.\nMovement result No.: {1}\nMovement result details No.: {2}\nData update type: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0202' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0202',
	'en_US',
	'W',
	'Cannot ship for each invoice. A shipping schedule with the same order invoice No. is not included in invoice entry target.\nShipping schedule No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0203' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0203',
	'en_US',
	'W',
	'Could not acquire the shipping schedule of the selected shipping schedule No.\nShipping schedule No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0204' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0204',
	'en_US',
	'W',
	'Cannot ship since invoices for invoice unit shipping are mixed.\nInvoice No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0205' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0205',
	'en_US',
	'W',
	'Cannot ship since the invoice has not been entered for invoice No. specified at the time of the sales order entry.\nInvoice No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0206' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0206',
	'en_US',
	'W',
	'Cannot ship since it contains shipping schedules which were entered as "Invoice unit shipping".\nShipping schedule No.: {1}\nInvoice No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0207' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0207',
	'en_US',
	'W',
	'Cannot enter the shipping order since it contains shipping schedules which were entered as "Invoice unit shipping".\nShipping schedule No.: {1}\nInvoice No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0208' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0208',
	'en_US',
	'W',
	'There is no shipping target.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0209' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0209',
	'en_US',
	'W',
	'Although it is specified as chargeable supply, the unit price could not be acquired from the Supply Unit Price master. Set it to non-chargeable supply, or specify the unit price.\nItem cd.: {1}\nSubcontractor cd.: {2}\nCurrency cd.: {3}\nWG cd.: {4}\nApplication date: {5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0210' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0210',
	'en_US',
	'W',
	'Could not acquire the Supply tax cd. from the BP master, Item master, or Company master. Specify the Supply tax cd.\nItem cd.: {1}\nSubcontractor cd.: {2}\nApplication date: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0211' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0211',
	'en_US',
	'W',
	'Specify different locations for GR and GI locations.\nGR location: {1}\nGI location: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0212' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0212',
	'en_US',
	'W',
	'If you select a transaction of movement/transport, movement/transport return, or supply return, enter an internal location as a delivery destination.\nTransaction cd.: {1}\nDelivery destination identification cd: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0213' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0213',
	'en_US',
	'W',
	'If you select a transaction of supply, enter a subcontracting location as a delivery destination.\nTransaction cd.: {1}\nDelivery destination identification cd: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0214' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0214',
	'en_US',
	'W',
	'If you select a transaction of sales, shipping, movement/transport, or movement/transport return, enter an internal location as a shipping location.\nTransaction cd.: {1}\nShipping location cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0215' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0215',
	'en_US',
	'W',
	'If you select a transaction of supply returns, enter a subcontracting location as a shipping location.\nTransaction cd.: {1}\nShipping location cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0216' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0216',
	'en_US',
	'W',
	'Inventory that can be used for sales or shipping is only "Internal inventory" or "Customer inventory".\nCannot ship the inventory other than the above.\nTransaction cd.: {1}\nInventory identification type: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0217' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0217',
	'en_US',
	'W',
	'Inventory that can be handled in a transaction of movement/transport or movement/transport returns are only "Internal inventory", "Before return acceptance", "Customer inventory", "VMI", "Defective acceptance" or "Receiving free of charge".\nCannot ship the inventory other than the above.\nTransaction cd.: {1}\nInventory identification type: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0218' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0218',
	'en_US',
	'W',
	'Inventory that can be handled in a transaction of supply are only "Internal inventory", "VMI", "Receiving free of charge" or "Chargeable supply".\nCannot ship the inventory other than the above.\nTransaction cd.: {1}\nInventory identification type: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0219' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0219',
	'en_US',
	'W',
	'Inventory that can be handled in a transaction of supply return are only "Internal inventory", "Defective acceptance", "Receiving free of charge" or "Chargeable supply".\nCannot ship the inventory other than the above.\nTransaction cd.: {1}\nInventory identification type: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0220' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0220',
	'en_US',
	'W',
	'In the case of inventory of chargeable or non-chargeable supply, or a transaction of supply returns with defective acceptance and inventory of non-chargeable supply, specify a supplier as an inventory arriving point.\nTransaction cd.: {1}\nInventory identification type: {2}\nInventory arriving point cd.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0221' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0221',
	'en_US',
	'W',
	'Cannot specify self supply for the Supply type. Specify "Non-chargeable supply" or "Chargeable supply".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0222' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0222',
	'en_US',
	'W',
	'For the customer inventory before return acceptance, specify a customer as an inventory BP.\nTransaction cd.: {1}\nInventory identification type: {2}\nInventory BP cd.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0223' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0223',
	'en_US',
	'W',
	'For the inventory for VMI, defective acceptance, non-chargeable supply, or chargeable supply, specify a supplier as an inventory BP.\nTransaction cd.: {1}\nInventory identification type: {2}\nInventory BP cd.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0224' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0224',
	'en_US',
	'W',
	'If the Inventory inspection type is set to something other than "4: Inspected", specify the GI location whose factory/distribution warehouse corresponds to the GR location.\n\nGR factory/distribution warehouse cd.: {1}\nGI warehouse/distribution warehouse cd.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0225' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0225',
	'en_US',
	'W',
	'Cannot use the specified Conforming type if the GR or GI location is a subcontractor.\nGR location cd.: {1}\nGI location cd.: {2}\nConforming type: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0226' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0226',
	'en_US',
	'W',
	'In the case of an invoice transaction, you cannot specify the shipping order qty. that exceeds shipping schedule qty.\nShipping schedule No.: {1}\nShipping order qty.: {2}\nShipping schedule qty.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0227' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0227',
	'en_US',
	'W',
	'Cannot cancel the remaining processing if invoice information has already been entered.\nShipping schedule No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0228' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0228',
	'en_US',
	'W',
	'For invoice unit shipping, you cannot specify the shipping order qty. different from the invoice qty.\nI/V details No.: {1}\nShipping order qty.: {2}\nInvoice qty.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0229' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0229',
	'en_US',
	'W',
	'Allocable inventory or GR/GI schedule was not enough.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0230' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0230',
	'en_US',
	'W',
	'Cannot cancel since there is an order whose result has already been recorded.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0231' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0231',
	'en_US',
	'W',
	'Cannot enter shipping results without sales orders since you cannot acquire the sales unit price.\nSee masters related to the sales unit price, or enter sales orders and then enter shipping results.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0232' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0232',
	'en_US',
	'W',
	'Shipping result qty. of shipping schedules for export does not satisfy target qty. to be exported.\nInvoice No.: {1}\nInvoice details No.: {2}\nShipping schedule No.: {3}\nQty. (base unit): {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0233' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0233',
	'en_US',
	'W',
	'Cannot receive VMI items that is not for asset management.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0234' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0234',
	'en_US',
	'W',
	'It has already been sold. The shipping schedule cannot be corrected or canceled.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0235' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0235',
	'en_US',
	'W',
	'Cannot ship since the sales order to be shipped has not been determined as "Allow shipping". Check the sales order.\nSales order No.: {1}\nShipping schedule No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0236' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0236',
	'en_US',
	'W',
	'Cannot enter the shipping order since "Pending shipping" is specified.\nShipping schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0237' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0237',
	'en_US',
	'W',
	'Cannot enter the shipping order since it has not determined as "Allow shipping".\nShipping schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0238' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0238',
	'en_US',
	'W',
	'For the sales order with the Assortment type "2: Assort" or the sales order with the Assortment group No. specified, you cannot enter the shipping order since some of the details are not included.\nSales order No.: {1}\nAssortment type: {2}\nAssortment group No.: {3}\nShipping schedule No.: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0239' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0239',
	'en_US',
	'W',
	'For the sales order with the Assortment type "2: Assort" or the sales orders with the Assortment group No. specified, you cannot enter the shipping order by dividing the quantity.\nSales order No.: {1}\nAssortment type: {2}\nAssortment group No.: {3}\nShipping schedule No.: {4}\nScheduled qty. (base unit): {5}\nShipping qty. (base unit): {6}\n{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0240' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0240',
	'en_US',
	'W',
	'Cannot create the receipt schedule since there is no inventory for shipping returns.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0241' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0241',
	'en_US',
	'W',
	'Cannot enter the receipt result since the supplier is prohibited from purchase/receipt.\nSupplier: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0242' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0242',
	'en_US',
	'W',
	'Cannot enter the receipt result since the item is prohibited from purchase/receipt.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0243' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0243',
	'en_US',
	'W',
	'Cannot enter the shipping order since the customer is prohibited from creating shipping orders.\nCustomer: {1}\nShipping order date: {2}\nShipping order prohibit date: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0244' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0244',
	'en_US',
	'W',
	'Cannot enter the shipping order since it is the item is prohibited from creating shipping orders.\nItem: {1}\nShipping order date: {2}\nShipping order prohibit date: {3}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0245' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0245',
	'en_US',
	'W',
	'Cannot enter the shipping result since the customer is prohibited from sales/shipping.\nCustomer: {1}\nShipping date: {2}\nSales/Shipping prohibit date: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0246' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0246',
	'en_US',
	'W',
	'Cannot enter the shipping result since the shipping location contains both internal and external locations.\nSpecify only the internal location or the same external location for the shipping location.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0247' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0247',
	'en_US',
	'W',
	'Cannot receive since the receipt qty. is different from the scheduled qty.\nReceipt schedule No.: {1}\nReceipt scheduled qty. (base unit): {2}\nReceipt qty. total (base unit): {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0248' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0248',
	'en_US',
	'W',
	'Cannot specify a customer that is for invoice transactions in unplanned shipping results.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0249' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0249',
	'en_US',
	'W',
	'Multiple data of the specified purchase invoice No. exist. Transit from the Purchase Invoice List screen.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0250' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0250',
	'en_US',
	'W',
	'Cannot enter items not for inventory management.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0251' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0251',
	'en_US',
	'W',
	'Items not for asset management are not subject to chargeable supply.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0252' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0252',
	'en_US',
	'W',
	'Could not acquire the record with the Adopt at auto flg. turned on. See the setting of the Transaction master.\nTransaction pattern type: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0253' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0253',
	'en_US',
	'W',
	'If it is entered as targeted subcontractor in the BP master, set the Supply record type of chargeable supply to "Arrival base" or "Usage criteria".\nBP cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0254' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0254',
	'en_US',
	'W',
	'Enter GI location and GR location so that the former and the latter are different. Similarly, enter GI rack/line and GR rack/line.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0255' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0255',
	'en_US',
	'W',
	'Cannot be updated to change whether distribution group at GR/GI location is changed ("movement" to "transport" or vice versa). Make a new entry after cancellation.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0256' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0256',
	'en_US',
	'W',
	'Cannot update since the progress status such as "Ordered" is in progress.\nMovement/transport schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0257' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0257',
	'en_US',
	'W',
	'Cannot update since the progress status is not "Unordered".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0258' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0258',
	'en_US',
	'W',
	'Cannot ship for each invoice since the shipping point distribution groups are mixed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0259' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0259',
	'en_US',
	'W',
	'Cannot order since the remaining processing has already been canceled.\nMovement allocation status No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0260' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0260',
	'en_US',
	'W',
	'Cannot order since the Shipping order type is not set to "With picking".\nMovement allocation status No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0261' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0261',
	'en_US',
	'W',
	'Could not acquire the distribution standard location. See the setting of the Location master.\nDistribution group cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0262' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0262',
	'en_US',
	'W',
	'Cannot enter the result since it is unordered.\nMovement allocation status No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0263' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0263',
	'en_US',
	'W',
	'Cannot update if the Transaction pattern type has been changed. Make a new entry after cancellation.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0264' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0264',
	'en_US',
	'W',
	'Inventory requests from other WG cannot be added manually.\nEnter from the Entry of Inventory Request screen.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0265' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0265',
	'en_US',
	'W',
	'The number of processing results did not match the expected number.\nExpected number: {1}\nActual number of results: {2}\nTable name: {3}\n{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0266' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0266',
	'en_US',
	'W',
	'Cannot ship since the invoice is not entered.\nFor invoice transactions without passing through the receiving point, enter an invoice by invoice unit shipping before performing the shipping operation.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0267' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0267',
	'en_US',
	'W',
	'Cannot ship since it is not invoice unit shipping.\nFor invoice transactions without passing through the receiving point, enter an invoice by invoice unit shipping.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0268' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0268',
	'en_US',
	'W',
	'Cannot acquire the distribution standard location. Specify GI location, or specify distribution standard location in the Location master.\nDistribution group cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0269' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0269',
	'en_US',
	'W',
	'For GI location, specify the location of the same distribution group as GR location.\nGI location distribution group cd.: {1}\nGR location distribution group cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0270' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0270',
	'en_US',
	'W',
	'To specify "Chargeable supply" for the Supply type, the Chargeable supplier of the subcontractor should be turned on.\nSpecify "Non-chargeable supply" for the Supply type, or turn on the Chargeable supplier in the Transaction master.\nSubcontractor (BP): {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0271' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0271',
	'en_US',
	'W',
	'To specify "Chargeable supply" for the Supply type, the Asset management type of the item should be se to "Manage asset".\nSpecify "Non-chargeable supply", or see the Asset management type in the Item master.\nItem: {1}\nAsset management type: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0272' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0272',
	'en_US',
	'W',
	'Relationship among the transaction, GI location and GR location is invalid.\nIn a transaction where the Transaction pattern type is set to "movement/transport" or "movement/transport return", the internal location must be set as a GI location and GR location (Blank is considered as an internal location).\nTransaction cd.: {1}\nTransaction pattern type: {2}\nGI location cd.: {3}\nGR location cd.: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0273' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0273',
	'en_US',
	'W',
	'Relationship between the transaction and GR location is invalid.\nIn a transaction where the Transaction pattern type is set to "Supply", the subcontracting location must be set as GR location.\nTransaction cd.: {1}\nTransaction pattern type: {2}\nGR location cd.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0274' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0274',
	'en_US',
	'W',
	'Relationship between the transaction and GI location is invalid.\nIn a transaction where the Transaction pattern type is set to "Supply return", the subcontracting location must be set as GI location.\nTransaction cd.: {1}\nTransaction pattern type: {2}\nGI location cd.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0275' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0275',
	'en_US',
	'W',
	'Cannot allocate since it has already been canceled.\nMovement allocation status No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0276' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0276',
	'en_US',
	'W',
	'Cannot release allocation since it has already been canceled.\nMovement allocation status No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0277' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0277',
	'en_US',
	'W',
	'Relationship between the transaction and the Conforming type is invalid.\nIn a transaction where the Transaction pattern type is set to "Supply", "Conforming item" must be set as the Conforming type.\nTransaction cd.: {1}\nTransaction pattern type: {2}\nConforming type: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0278' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0278',
	'en_US',
	'W',
	'Cannot specify GI location.\nIn a transaction where the Transaction pattern type is set to "Supply return", the subcontracting location must be set as GI location.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0279' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0279',
	'en_US',
	'W',
	'A customer must be specified in the BP master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0280' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0280',
	'en_US',
	'W',
	'A supplier must be specified in the BP master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0281' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0281',
	'en_US',
	'W',
	'A valid BP is not entered in the BP master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0282' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0282',
	'en_US',
	'W',
	'Cannot be shipped for each invoice since shipping schedules to be released and not to be released are exist.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0283' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0283',
	'en_US',
	'W',
	'Cannot enter the shipping order since no sales has been entered in the sales keeping customer inventory.\nSales order details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0284' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0284',
	'en_US',
	'W',
	'Cannot cancel the shipping order since it contains the canceled details.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0285' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0285',
	'en_US',
	'W',
	'Cannot enter the shipping order since invoice has not been entered.\nFor an invoice transaction without passing through a receiving point, enter an invoice as the Invoice unit shipping before performing the shipping operation.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0286' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0286',
	'en_US',
	'W',
	'Cannot enter the shipping order since it is not invoice unit shipping.\nFor invoice transactions without passing through receiving point, enter an invoice as the Invoice unit shipping.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0287' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0287',
	'en_US',
	'W',
	'Cannot cancel the invoice unit shipping. The shipping schedule for invoice consolidation has already been released or its result has already been entered.\nShipping schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0288' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0288',
	'en_US',
	'W',
	'The specified item is prohibited from moving in the Item Prohibit master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0289' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0289',
	'en_US',
	'W',
	'Supplier at the specified GR location is prohibited from moving/transporting in the Transaction Prohibit master.\nBP: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0290' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0290',
	'en_US',
	'W',
	'Cannot enter the shipping order since some of the invoice details in which the invoice unit shipping is specified are not included.\nShipping schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0291' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0291',
	'en_US',
	'W',
	'Cannot enter the shipping result since no sales has been entered in the Sales keeping customer inventory.\nSales order details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0292' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0292',
	'en_US',
	'W',
	'Cannot update or cancel since the invoice has been canceled.\nInvoice No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0293' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0293',
	'en_US',
	'W',
	'In the case of a shipping return from a customer who is set to the target of invoice transaction, if the qty. or unit is different from the one expected, the return cannot be received.\nReceipt schedule No.: {1}\nCustomer cd.: {2}\nSchedule transaction unit cd.: {3}\nSchedule transaction unit qty.: {4}\nTransaction unit cd: {5}\nTransaction unit qty.: {6}\n{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0294' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0294',
	'en_US',
	'W',
	'It is the target of packing list, but no packing list is entered.\nInvoice No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0295' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0295',
	'en_US',
	'W',
	'Cannot update or cancel since sales has already been recorded.\nInvoice No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0296' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0296',
	'en_US',
	'W',
	'Cannot update or cancel since the receipt has already been completed.\nInvoice No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0297' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0297',
	'en_US',
	'W',
	'Customer inventory is not for inventory count.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0298' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0298',
	'en_US',
	'W',
	'Defective acceptance inventory is not for inventory count.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0299' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0299',
	'en_US',
	'W',
	'Cannot cancel the invoice since there is shipping schedule in which shipping order has been completed.\nShipping schedule No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0300' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0300',
	'en_US',
	'W',
	'Cannot receive MRO supplies in the following transactions: Shipping return, movement/transport, movement/transport return, supply, supply return or receipt.\nTransaction cd.: {1}\nItem: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0301' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0301',
	'en_US',
	'W',
	'In the case of items for asset management, the Purchase identification types that can be handled in receipt transactions are "Receiving free of charge" and "VMI" only.\nCannot receive items with the Purchase identification type other than mentioned above.\nTransaction cd.: {1}\nItem: {2}\nPurchase identification type: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0302' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0302',
	'en_US',
	'W',
	'In the case of items for asset management in receipt transactions, you cannot set the reason other than purchase or the reason for expense purchase.\nTransaction cd.: {1}\nItem: {2}\nReason cd.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0303' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0303',
	'en_US',
	'W',
	'Only the reason for transport can be set in the transport transaction.\nTransaction cd.: {1}\nReason cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0304' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0304',
	'en_US',
	'W',
	'In a transaction for transport return, supply, or supply return, you cannot set the reason other than transport or the reason for other accounting GI.\nTransaction cd.: {1}\nReason cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0305' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0305',
	'en_US',
	'W',
	'In the shipping return transaction, you cannot set the reason other than sales returns or the reason for sales other accounting.\nTransaction cd.: {1}\nReason cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0306' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0306',
	'en_US',
	'W',
	'In the receipt transaction, you cannot set values for both of the Purchase identification type and customer inventory.\nSet either the Purchase identification type or customer inventory.\nTransaction cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0307' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0307',
	'en_US',
	'W',
	'In the case of items not for asset management, the Purchase identification type that can be handled in receipt transactions is "Receiving free of charge" only.\nCannot receive items with the Purchase identification type other than the above.\nTransaction cd.: {1}\nItem: {2}\nPurchase identification type: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0308' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0308',
	'en_US',
	'W',
	'Cannot use the specified Firm No. type in "Other accounting transfer GI". Specify the correct Firm No. type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0309' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0309',
	'en_US',
	'W',
	'A combination of the specified Location, Conforming type, Inventory identification type, Inventory BP, Firm No. type, and Inventory arriving point cannot be entered.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0310' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0310',
	'en_US',
	'W',
	'Cannot enter qty. larger than approved other accounting transfer schedule.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0311' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0311',
	'en_US',
	'W',
	'Cannot create a lot since it is the item that cannot be entered in a new lot.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0312' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0312',
	'en_US',
	'W',
	'Cannot print since it exceeds maximum number of identification tag printing.\nMaximum number of identification tag printing: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0313' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0313',
	'en_US',
	'W',
	'In invoice transactions, you cannot specify the shipping result qty. that exceeds shipping scheduled qty.\nShipping schedule No.: {1}\nShipping result qty.: {2}\nShipping schedule qty.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0314' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0314',
	'en_US',
	'W',
	'For invoice unit shipping, you cannot specify the shipping result qty. different from the invoice qty.\nI/V details No.: {1}\nShipping result qty.: {2}\nInvoice qty.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0315' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0315',
	'en_US',
	'W',
	'The specified invoice is not for print packing list entry.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0316' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0316',
	'en_US',
	'W',
	'The specified invoice cannot be newly entered since the packing list is already entered.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0317' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0317',
	'en_US',
	'W',
	'The specified invoice is not entered in the packing list.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0318' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0318',
	'en_US',
	'W',
	'Shipping results cannot be entered due to subcontractor of prohibit transport/movement.\nSubcontractor: {1}\nShipping date: {2}\nTransport/movement prohibit date: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0319' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0319',
	'en_US',
	'W',
	'Cannot enter the shipping order since the transport/movement of the supplier is prohibited.\nSubcontractor: {1}\nShipping order date: {2}\nTransport/movement prohibit date: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0320' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0320',
	'en_US',
	'W',
	'The packing list cannot be issued since the invoice has not been entered yet.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0321' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0321',
	'en_US',
	'W',
	'Cannot issue the packing list since it is omitted.\nInvoice No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0322' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0322',
	'en_US',
	'W',
	'Cannot issue the invoice since it is not entered yet.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0323' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0323',
	'en_US',
	'W',
	'Cannot issue the packing list since it is not entered yet.\nInvoice No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0324' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0324',
	'en_US',
	'W',
	'The shipping schedule has been firmed.\nSince partial orders cause a shipping schedule to be divided, you cannot partially order a firmed shipping schedule.\nShipping schedule No.: {1}\nOrder qty. (base unit): {2}\nScheduled qty. (base unit): {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0325' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0325',
	'en_US',
	'W',
	'If you receive from supplier included in invoice transaction, you cannot receive the qty. more than or equal to scheduled qty.\nReceipt schedule No.: {1}\nSupplier cd.: {2}\nScheduled base unit qty.: {3}\nTotal base unit qty.: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0326' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0326',
	'en_US',
	'W',
	'Cannot receive because the receipt qty. is different from the scheduled receipt qty.\nIn receipt for supply, receipt qty. should be the same as receipt schedule and\ndetails of delivery note should be all received (or receipt should be canceled).\nReceipt schedule No.: {1}\nDelivery note No.: {2}\nReceipt scheduled qty. (base unit): {3}\nReceipt qty. total (base unit): {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0327' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0327',
	'en_US',
	'W',
	'Cannot receive since there is insufficient receipt for delivery note of supply.\nIn receipt for supply, details of delivery note should be all aggregated and received (or receipt should be canceled).\nReceipt schedule No.: {1}\nDelivery note No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0328' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0328',
	'en_US',
	'W',
	'Cannot cancel the remaining processing since the total qty. of the results for the schedule is larger than or equal to the scheduled qty.\nScheduled qty. (base unit): {1}\nResult qty. (base unit): {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0329' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0329',
	'en_US',
	'W',
	'If the logical inventory qty. is negative, it will not be the target of inventory count.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0330' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0330',
	'en_US',
	'W',
	'If the Inventory identification type at the subcontracting location is set to "Receiving free of charge" and the inventory arriving point is not specified, it will not be the target of inventory count.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0331' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0331',
	'en_US',
	'W',
	'If the Inventory identification type at own company''s location is "Own company" and the Firm No. type is "None", you cannot specify the inventory arriving point.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0332' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0332',
	'en_US',
	'I',
	'There are order details which cannot be allocated.\nNumber of order details to be allocated: {1}\nNumber of successful allocations: {2}\nNumber of failed allocations: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0333' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0333',
	'en_US',
	'W',
	'Cannot enter the invoice because it is a temporary sales order.\nSales order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0334' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0334',
	'en_US',
	'W',
	'Cannot acquire an AP department from the subcontractor''s AP supplier and date. See the settings of the BP master and BP Auxiliary master.\nSubcontractor cd: {1}\nAP supplier cd.: {2}\nDate: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0335' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0335',
	'en_US',
	'W',
	'Dept. acquired from the AP supplier for the subcontractor is not entered in the Department master for the specified date. See the Department master.\nSubcontractor cd: {1}\nAP supplier cd.: {2}\nDept. cd.: {3}\nDate: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0336' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0336',
	'en_US',
	'W',
	'Not entered in the Department master for the specified date. See the Department master.\nAP det. cd.: {1}\nDate: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0337' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0337',
	'en_US',
	'W',
	'Cannot perform the lot/location suggestion function.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0338' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0338',
	'en_US',
	'W',
	'Suggestion target has been updated by another process. Search again.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0339' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0339',
	'en_US',
	'W',
	'Cannot correct or cancel since the remaining shipping schedules have been canceled. To correct or cancel, release the canceled remaining schedules.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0340' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0340',
	'en_US',
	'W',
	'To enter a movement result from own company to own company, specify one of the following for the Inventory identification type: "Internal inventory",\n"VMI", "Defective acceptance", "Receiving free of charge", "Before return acceptance", "Before purchase acceptance".\nGI location cd.: {1}\nGR location cd.: {2}\nInventory identification type: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0341' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0341',
	'en_US',
	'W',
	'To enter a shipping result from own company to own company, specify one of the following for the Inventory identification type: "Internal inventory",\n"VMI", "Defective acceptance", "Receiving free of charge", "Before return acceptance", "Customer inventory".\nGI location cd.: {1}\nGR location cd.: {2}\nInventory identification type: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0342' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0342',
	'en_US',
	'W',
	'Lot reverse occurred. The permission range of expiration date is reversed. Some lots may have been shipped without a lot check in the past.\nCustomer cd.: {1}\nDelivery destination cd.: {2}\nDelivery (scheduled) date: {3}\nItem: {4}\nLot No.: {5}\nSublot No.: {6}\nExpiration date: {7}\nPermitted expiration date: {8} - {9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0343' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0343',
	'en_US',
	'W',
	'Cannot correct since a movement result is entered.\nMovement allocation status No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0344' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0344',
	'en_US',
	'W',
	'Cannot cancel since a movement result is entered.\nMovement order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0345' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0345',
	'en_US',
	'W',
	'Cannot update since total of shipping schedule qty. is different from sales order details or movement/transport scheduled qty.\nSales order details No.: {1}\nMovement/Transfer schedule No.: {2}\nShipping schedule qty.: {3}\nTotal of input: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0346' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0346',
	'en_US',
	'W',
	'Cannot aggregate the shipping schedule since there are multiple shipping allocation situations linked with the shipping schedule.\nTo consolidate shipping schedules, first set the same shipping allocation status in allocation status mode.\nShipping schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0347' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0347',
	'en_US',
	'W',
	'Could not allocate since there is no allocatable inventory or GR/GI schedule.\nTo change a shipping schedule, first turn off the "Location allocation" of shipping allocation status in allocation status mode, or cancel allocation on the Allocation Release Entry screen.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0348' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0348',
	'en_US',
	'W',
	'For invoice unit shipping, invoice details cannot be consolidated together.\nEnter invoices after consolidating shipping schedules, or enter invoices by shipping schedule.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0349' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0349',
	'en_US',
	'W',
	'If the invoice information has already been entered, the shipping result qty. must be larger than the invoice qty.\nShipping schedule No.: {1}\nShipping result qty.: {2}\nShipping schedule qty.: {3}\nInvoice qty.: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0350' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0350',
	'en_US',
	'W',
	'Cannot cancel the remaining processing since the invoice qty. and the shipping result qty. in the shipping schedule do not match.\nShipping schedule No.: {1}\nShipping result qty.: {2}\nShipping schedule qty.: {3}\nInvoice qty.: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0351' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0351',
	'en_US',
	'W',
	'The item unit master does not exist.\nItem: {1}\nUnit: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0352' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0352',
	'en_US',
	'W',
	'Not entered as a sales tax in the Tax master. \nTax cd.: {1} \n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0353' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0353',
	'en_US',
	'W',
	'Not entered as a supply tax in the Tax master.\nTax cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0354' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0354',
	'en_US',
	'W',
	'Could not acquire the Sales tax cd. from any of the BP master, Item master, or Company master. Specify the Sales tax cd.\nItem cd.: {1}\nBP cd.: {2}\nApplication date: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0355' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0355',
	'en_US',
	'W',
	'Cannot update since the total of scheduled re-shipping qty. is different from the original scheduled re-shipping qty.\nSales order details No.: {1}\nOriginal scheduled re-shipping qty.: {2}\nTotal of input: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0356' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL0356',
	'en_US',
	'W',
	'The charged dept. in a receipt result corresponding to the purchase result is invalid. Check the following:\n- The Dept. master corresponding to the specified dept. and application date must be set\n- The Charged dept. in the Dept. master must be turned on\nApplication date: {1}\nCharged dept. cd.: {2}\nReceipt result No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1001',
	'en_US',
	'I',
	'Starting the replenishment for input item inventory (entry).');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1002',
	'en_US',
	'I',
	'Criteria:\nScheduled input date: {1} - {2}\nGR/GI schedule status: {3}Unfirm {4}Order save {5}Request {6}Schedule {7}Save mfg. order {8}Ordered {9}In process \nTarget: {10}Delete shortage information {11}Delete transport schedule {12}Create shortage information {13}Create transport schedule\nLocation, rack/line: {14}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1003',
	'en_US',
	'I',
	'The replenishment for Input item inventory (entry) is completed.\nNumber of shortage information deleted: {1}\nNumber of transport schedule deleted: {2}\nNumber of GR/GI schedule processed: {3}\nNumber of shortage information created: {4}\nNumber of transport schedule created: {5}\nNumber of transport schedule errors: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1004',
	'en_US',
	'I',
	'Starting the replenishment for input item inventory (deletion).');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1005',
	'en_US',
	'I',
	'Criteria:\nScheduled GR date: {1} - {2}\nTo process: {3}Delete shortage information {4}Delete transport schedule\nLocation, rack/line: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1006',
	'en_US',
	'I',
	'Replenishment for input item inventory (deletion) completed.\nNumber of shortage information deleted: {1}\nNumber of transport schedule deleted: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1007',
	'en_US',
	'W',
	'The processing has been interrupted since the replenishment for input item inventory is in process.\nLocation, rack/line: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1008',
	'en_US',
	'W',
	'Shortage information has been created since input items are insufficient.\nLocation cd.: {1}\nRack/Line cd.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1009',
	'en_US',
	'W',
	'There is no allocatable inventory or GR/GI schedule.\nData No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1010',
	'en_US',
	'W',
	'Allocable inventory or GR/GI schedule was not enough. Partially replenished.\nData No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1012',
	'en_US',
	'I',
	'Starting the replenishment at the reorder point.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1013',
	'en_US',
	'I',
	'The replenishment at the reorder point completed.\nTo process: {1}\nNumber of entries: {2}\nNumber of errors: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1014',
	'en_US',
	'W',
	'Could not enter the PO information since inventory replenishment method is not set in the following item:\nStorage location: {1}\nItem: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1015',
	'en_US',
	'W',
	'Excluded since the specified shipping schedule has already been ordered.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1016',
	'en_US',
	'W',
	'Excluded since the specified shipping schedule has already been shipped.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1017',
	'en_US',
	'W',
	'Excluded since allocatable days do not fall on scheduled shipping date of transfer destination.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1018',
	'en_US',
	'W',
	'Cannot enter since the number of allocatable days has not reached the scheduled shipping date of the transfer destination.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1019',
	'en_US',
	'W',
	'Cannot enter a new shipping result since the shipping has been completed.\nShipping order No.: {1}\nShipping order details No.: {2}\nShipping schedule No.: {3}\nShipping allocation status No.: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1020',
	'en_US',
	'W',
	'Cannot enter a new receipt result since the receipt has been completed.\nReceipt schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1021',
	'en_US',
	'W',
	'Cannot import since it is not required to receive the corresponding shipping schedule information.\nReceipt schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1022',
	'en_US',
	'I',
	'Starting the shipping item inventory replenishment (entry).');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1023',
	'en_US',
	'I',
	'Criteria:\nScheduled shipping time: {1} - {2}\nGR/GI schedule status: {3}Schedule, {4}Sales order, {5}Order promising, {6}Delivery order, {7}Ordered\nProcess target: {8}Delete shortage information, {9}Delete movement schedule, {10}Create shortage information, {11}Create movement schedule, {12Unallocated, {13}Allocation\nShipping conditions cd.: {14}\nShipping operation cd.: {15}\nLocation, rack/line: {16}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1024',
	'en_US',
	'W',
	'The processing has been interrupted since the replenishment for shipping item inventory is in process.\nLocation, rack/line: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1025',
	'en_US',
	'I',
	'The replenishment for shipping item inventory (entry) completed.\nNumber of shortage information deleted: {1}\nNumber of movement schedule deleted: {2}\nNumber of GR/GI schedule processed: {3}\nNumber of shortage information created: {4}\nNumber of movement schedule created: {5}\nNumber of movement schedule errors: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1026',
	'en_US',
	'I',
	'Starting the replenishment for shipping item inventory (deletion).');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1027' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1027',
	'en_US',
	'I',
	'The replenishment for shipping item inventory (deletion) completed.\nNumber of shortage information deleted: {1}\nNumber of movement schedule deleted: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1028' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1028',
	'en_US',
	'W',
	'Cannot enter the shipping result since available inventory is insufficient.\nItem: {1}\nLocation: {2}\nRack/Line: {3}\nLot No.: {4}\nSublot No.: {5}\nSEIBAN No.: {6}\nSKU: {7}\nGrading: {8}\nConforming type: {9}\nInventory identification type: {10}\nInventory BP: {11}\n{12}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1029' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1029',
	'en_US',
	'W',
	'Cannot enter the shipping result since available inventory or GR schedule for input location is insufficient.\nEven for items that allow negative inventory, there must be available GR schedule in order to enter shipping results.\nItem: {1}\nLocation: {2}\nRack/Line: {3}\nLot No.: {4}\nSublot No.: {5}\nSEIBAN No.: {6}\nSKU: {7}\nGrading: {8}\nConforming type: {9}\nInventory identification type: {10}\nInventory BP: {11}\n{12}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1030' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1030',
	'en_US',
	'W',
	'Cannot enter the movement result since available inventory is in short.\nItem: {1}\nLocation: {2}\nRack/Line: {3}\nLot No.: {4}\nSublot No.: {5}\nSEIBAN No.: {6}\nSKU: {7}\nGrading: {8}\nConforming type: {9}\nInventory identification type: {10}\nInventory BP: {11}\n{12}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1031' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1031',
	'en_US',
	'W',
	'Cannot enter the movement result since available inventory or GR schedule for input location is insufficient.\nEven for items that allow negative inventory, there must be available GR schedule in order to enter movement results.\nItem: {1}\nLocation: {2}\nRack/Line: {3}\nLot No.: {4}\nSublot No.: {5}\nSEIBAN No.: {6}\nSKU: {7}\nGrading: {8}\nConforming type: {9}\nInventory identification type: {10}\nInventory BP: {11}\n{12}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1032' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1032',
	'en_US',
	'W',
	'The relationship between the transaction and receiving point is invalid.\nCannot specify "Delivery destination" as receiving point if the transaction with the following Transaction pattern type specified is used.\nTransaction pattern type: "Supply return"\nTransaction cd.: {1}\nTransaction pattern type: {2}\nReceiving point identification type: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1033' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1033',
	'en_US',
	'W',
	'The relationship between the transaction and reason is invalid.\nSpecify the reason for "Sales result" if the transaction with the following Transaction pattern type specified is used.\nTransaction pattern type: "Sales result" "Shipping"\nTransaction cd.: {1}\nTransaction pattern type: {2}\nReason cd.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1034' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1034',
	'en_US',
	'W',
	'The relationship between transaction and reason is invalid.\nCannot specify the reason for "Sales other accounting" if the transaction with the following Transaction pattern type specified is used. \nTransaction pattern type: "Shipping"\nTransaction cd.: {1}\nTransaction pattern type: {2}\nReason cd.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1035' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1035',
	'en_US',
	'W',
	'The relationship between transaction and reason is invalid.\nSpecify the reason for "Transport" if the transaction with the following Transaction pattern type specified is used.\nTransaction pattern type: "Movement/transport", "Movement/transport return", "Supply", "Supply return"\nTransaction cd.: {1}\nTransaction pattern type: {2}\nReason cd.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1036' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1036',
	'en_US',
	'W',
	'The relationship between transaction and reason is invalid.\nCannot specify the reason for "Other accounting GI" if the transaction with the following Transaction pattern type specified is used. \nTransaction pattern type: "Movement/transport return" "Supply" "Supply return"\nTransaction cd.: {1}\nTransaction pattern type: {2}\nReason cd.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1037' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1037',
	'en_US',
	'W',
	'The relationship between transaction and item is invalid.\nSpecify "Inventory management item" if the transaction with the following Transaction pattern type specified is used.\nTransaction pattern type: "Shipping" "Movement/transport" "Movement/transport return" "Supply" "Supply return"\nTransaction cd.: {1}\nTransaction pattern type: {2}\nItem: {3}\nInventory management type: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1038' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1038',
	'en_US',
	'W',
	'SEIBAN No.1 is required since "2. Manage (required)" is specified for the SEIBAN No.1 management type in the Item master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1039' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1039',
	'en_US',
	'W',
	'SEIBAN No.2 is required since "2. Manage (required)" is specified for the SEIBAN No.2 management type in the Item master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1040' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1040',
	'en_US',
	'W',
	'SEIBAN No.3 is required since "2. Manage (required)" is specified for the SEIBAN No.3 management type in the Item master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1041' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1041',
	'en_US',
	'W',
	'SEIBAN No.4 is required since "2. Manage (required)" is specified for the SEIBAN No.4 management type in the Item master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1042' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1042',
	'en_US',
	'W',
	'The remaining receipt from suppliers that is for invoice transaction cannot be canceled.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1043' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1043',
	'en_US',
	'W',
	'The remaining receipt from customers that are for invoice transaction cannot be canceled.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1044' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1044',
	'en_US',
	'W',
	'The remaining receipt of discount item cannot be canceled.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1045' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1045',
	'en_US',
	'W',
	'Cannot update since IF has been exported.\nShipping order No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1046' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1046',
	'en_US',
	'W',
	'If the remaining IF export targets are canceled or canceled targets are released, splitting details and correction for changing the number of details cannot be performed at the same time.\nShipping order details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1047' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1047',
	'en_US',
	'W',
	'Cannot update since IF has been exported.\nMovement order No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1048' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1048',
	'en_US',
	'I',
	'Criteria:\nScheduled GR date and time: {1} - {2}\nTo process: {3}Delete shortage information {4}Delete movement schedule\nLocation, rack/line: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1049' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1049',
	'en_US',
	'W',
	'The specified shipping order does not exist.\nData No.: {1}\nData row No.: {2}\nShipping order No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1050' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1050',
	'en_US',
	'W',
	'Specify the lot No. and sublot No. entered at the time of shipment in a shipping return transaction.\nDelivery note No.: {1}\nDelivery note details No.: {2}\nLot No.: {3}\nSublot No.: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1051' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1051',
	'en_US',
	'W',
	'Cannot return if the qty. is larger than the one entered at the time of shipment in a shipping return transaction.\nDelivery note No.: {1}\nDelivery note details No.: {2}\nLot No.: {3}\nSublot No.: {4}\nQty.: {5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1052' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1052',
	'en_US',
	'W',
	'Items for the specified lot No. and sublot No. are already shipping returned.\nDelivery note No.: {1}\nDelivery note details No.: {2}\nLot No.: {3}\nSublot No.: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1053' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1053',
	'en_US',
	'W',
	'For purchase results of purchase schedules that have already been entered as a purchase invoice, enter them for each purchase invoice.\nCould not enter receipt results as well since you cannot enter purchase result for a receipt when the Simultaneous recording flg. is turned on.\nPurchase invoice No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1054' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1054',
	'en_US',
	'W',
	'The qty. of invoice details exceeds the qty. of purchase invoice not-entered.\nTo enter with the exceeding qty., turn on the Firm flag.\nExcess qty.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1055' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1055',
	'en_US',
	'W',
	'For details with added rows, set items not for inventory management.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1056' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1056',
	'en_US',
	'W',
	'For details with added rows, set items not for asset management.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1057' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1057',
	'en_US',
	'W',
	'For the purchase reason of an item that is not subject to asset management, set a reason for expenses purchase.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1058' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1058',
	'en_US',
	'W',
	'Cannot enter only details with added rows.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1059' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1059',
	'en_US',
	'W',
	'Cannot enter since the qty. of invoice details is less than the receipt qty.\nTo enter with the qty. less than the receipt qty., cancel the purchase invoice and enter a purchase invoice on the Select Purchase Invoice screen with the "Receipt result" mode. \nScheduled purchase qty. (base unit): {1}\nReceipt qty. (base unit): {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1060' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1060',
	'en_US',
	'W',
	'For details with added rows, set the transaction with the Transaction pattern type "Purchase".\nTransaction cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1061' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1061',
	'en_US',
	'W',
	'Cannot enter a purchase invoice since the mfg. order is not linked to the receipt schedule corresponding to the invoice details.\nReceipt schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1062' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1062',
	'en_US',
	'W',
	'It is not entered as a valid customer, in BP master.\nCustomer cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1063' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1063',
	'en_US',
	'W',
	'For receipt schedules which have already been shipped, specify lot No., sublot No., and grading entered at the time of shippment.\nReceipt schedule No.: {1}\nLot No.: {2}\nSublot No.: {3}\nGrading: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1064' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1064',
	'en_US',
	'W',
	'Cannot cancel since it has already been shipped in the unit of invoice.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1065' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1065',
	'en_US',
	'W',
	'Cannot enter details only with the Order type "2: Without picking". Enter including details with "1: With picking."');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1066' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1066',
	'en_US',
	'W',
	'Cannot change the recording date since the purchase closing has been canceled.\nRecording date before correction: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1067' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1067',
	'en_US',
	'W',
	'A revenue recording date has been specified prior to the shipping recording date.\nShipping recording date: {1}\nRevenue recording date: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1068' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1068',
	'en_US',
	'W',
	'A revenue recording date has been specified prior to the shipping recording date.\nShipping recording date: {1}\nRevenue recording date: {2}\nShipping result No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1069' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1069',
	'en_US',
	'W',
	'Cannot cancel the remaining schedules at the same time since remaining qty. of receipt schedule and purchase schedule are not the same.\nReceipt schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1070' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1070',
	'en_US',
	'W',
	'Adjust shipping schedule within the range of the qty. of sales keeping customer inventory.\nSales result details No.: {1}\nShipping schedule No.: {2}\nQty. before adjustment.: {3}\nAdjusted qty.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1071' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1071',
	'en_US',
	'W',
	'Cannot cancel the shipping schedule since the sales keeping customer inventory has already been entered.\nShipping schedule No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1072' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1072',
	'en_US',
	'W',
	'Not entered as a valid location in the Location master.\nReceipt location cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1073' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1073',
	'en_US',
	'W',
	'Could not import since an error occurred while importing the other accounting transfer results for the same header.\nExternal other accounting transfer result No.: {1}\nTransaction: {2}\nLocation: {3}\nActual other accounting transfer date and time: {4}\nImplementation dept.: {5}\nImplementation PIC: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1074' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1074',
	'en_US',
	'W',
	'Defective item lot is specified.\nDefective item lot cannot be specified for the relevant transaction.\nTransaction cd.: {1}\nTransaction pattern type: {2}\nItem: {3}\nLot No.: {4}\nSublot No.: {5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1102' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1102',
	'en_US',
	'W',
	'Cannot correct or cancel since the remaining sales order details have been canceled. \nTo correct or cancel, release the canceled remaining sales order details.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1103' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1103',
	'en_US',
	'W',
	'Cannot correct or cancel since the remaining PO details have been canceled. \nTo correct or cancel, release the canceled remaining PO details.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1104' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1104',
	'en_US',
	'W',
	'Could not acquire the supply recording date of return source from the Return-from delivery note No. or the Return-from supply result No. Review the entered value or enter the Supply recording date (Base) manually.\nReturn-from delivery note No.: {1}\nReturn-from supply result No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1105' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1105',
	'en_US',
	'W',
	'For supply returns, enter the Supply recording date (Base).\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1106' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1106',
	'en_US',
	'W',
	'Do not enter the supply-from information if it is not supply return.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1109' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1109',
	'en_US',
	'W',
	'Multiple data of the specified invoice No. exist. Transit from the Invoice List screen.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1110' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1110',
	'en_US',
	'W',
	'Cannot correct the qty. to be less than the invoice qty. since an invoice has been entered for the shipping order. \nShipping order details No.: {1}\nShipping order qty. (Total): {2}\nInvoice qty. {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1111' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1111',
	'en_US',
	'W',
	'If the invoice information has already been entered, the shipping order qty. must be less than the invoice unordered qty.  \nShipping schedule No.: {1}\nI/V details No.: {2}\nShipping order qty.: {3}\nInvoice unordered qty.: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1112' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1112',
	'en_US',
	'W',
	'Cannot correct the qty. to be less than the invoice qty. since an invoice has been entered for the shipping result. \nShipping result details No.: {1}\nShipping result qty.: {2}\nInvoice qty.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1113' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1113',
	'en_US',
	'W',
	'If the invoice information has already been entered, the shipping result qty. must be less than the invoice unshipped qty. \nShipping schedule No.: {1}\nI/V details No.: {2}\nShipping result qty.: {3}\nInvoice unshipped qty.: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1114' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1114',
	'en_US',
	'W',
	'Cannot specify invoice qty. to be less than the shipping qty. since shipping results have been entered.\nI/V details No.: {1}\nInvoice qty.: {2}\nShipping qty.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1115' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1115',
	'en_US',
	'W',
	'Cannot make a temporary entry for the purchase invoice No. because a purchase invoice has been entered for the specified receipt result.\nReceipt result No.: {1}\nPurchase invoice No.: {2}\nPurchase invoice management No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1116' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1116',
	'en_US',
	'W',
	'Cannot delete or cancel rows since an invoice has been entered for the shipping order.\nShipping order details No.: {1}\nShipping allocation status No.: {2} \n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1117' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1117',
	'en_US',
	'W',
	'Cannot delete or cancel rows since an invoice has been entered for the shipping result.\nShipping result details No.: {1} \n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1118' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1118',
	'en_US',
	'W',
	'Cannot enter because the Purchase invoice No. is duplicated.\nPurchase invoice No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1119' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1119',
	'en_US',
	'W',
	'Cannot specify invoice qty. to be less than the shipping order qty. since shipping orders have been entered.\nI/V details No.: {1}\nInvoice qty.: {2}\nShipping order qty.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1120' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1120',
	'en_US',
	'W',
	'If an added detail has an item that is subject to inventory management or asset management, you cannot change the Firm from on to off.\nDelete the row.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1121' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1121',
	'en_US',
	'W',
	'Cannot delete or cancel rows since shipping orders have been entered.\nI/V details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1122' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1122',
	'en_US',
	'W',
	'Cannot delete or cancel rows since shipping results have been entered.\nI/V details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1123' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1123',
	'en_US',
	'W',
	'Cannot cancel remaining processing with the qty. exceeding schedule qty.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1124' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1124',
	'en_US',
	'W',
	'Cannot ship since no invoice has been entered.\nIf the Sales recording type is "Shipping base", enter an invoice before performing the shipping operation.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1125' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1125',
	'en_US',
	'W',
	'For unplanned shipping results, if the Sales recording type is "Shipping base", you cannot specify a customer who is subject to invoice transactions.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1126' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1126',
	'en_US',
	'W',
	'Cannot ship since no invoice has been entered.\nIf the Sales recording type is "Shipping base", enter an invoice before performing the shipping operation.\nShipping schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1127' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1127',
	'en_US',
	'W',
	'Cannot update or cancel since an invoice has already been entered.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1128' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1128',
	'en_US',
	'W',
	'Cannot correct or cancel since the searched purchase invoice has already been canceled.\nPurchase invoice No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1129' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1129',
	'en_US',
	'I',
	'Turning off Firm clears values for the purchase result. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1130' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1130',
	'en_US',
	'W',
	'If the Sales recording type is "Shipping base" and there is no receiving point stopover, enter the same date for the shipping date and recording date of all the shipping results included in the same invoice.\nInvoice No.: {1}\nShipping order No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1131' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1131',
	'en_US',
	'W',
	'If the Sales recording type is "Shipping base" and there is no receiving point stopover, specify all the targets included in the same invoice.\nInvoice No.: {1}\nShipping order No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1132' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1132',
	'en_US',
	'W',
	'If the Sales recording type is "Shipping base" and there is no receiving point stopover, you cannot enter a partial shipment for the invoice.\nI/V details No.: {1}\nTotal shipping result qty.: {2}\nInvoice qty.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1133' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1133',
	'en_US',
	'I',
	'Details with the temporary unit price are included.\nChange the temporary unit price to the actual unit price before recording sales.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1134' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1134',
	'en_US',
	'I',
	'Details with the temporary unit price are included.\nChange the temporary unit price to the actual unit price before firming the purchase invoice.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1135' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1135',
	'en_US',
	'I',
	'Purchase will be recorded with the temporary unit price.\nChange it to the actual unit price as necessary.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1136' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1136',
	'en_US',
	'W',
	'Cannot enter since a purchase result has been entered for the purchase invoice created based on the receipt schedule.\nPurchase invoice No.: {1}\nReceipt schedule No.: {2}\nPO details No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1201' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1201',
	'en_US',
	'W',
	'Cannot process since there are multiple lots on the shipping schedule where mixing Lot No. is prohibited.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1202' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1202',
	'en_US',
	'W',
	'Cannot process since there are multiple sublots on the shipping schedule where mixing Sublot No. is prohibited.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1203' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1203',
	'en_US',
	'W',
	'To specify "VMI" for the Inventory identification type, specify an own company''s location as a GI location.\nGI location: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1204' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1204',
	'en_US',
	'W',
	'To specify "Before return acceptance", "Customer inventory", or "VMI" for the Inventory identification type, specify an own company''s location as a GI location.\nGI location: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1205' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1205',
	'en_US',
	'W',
	'To specify "Chargeable supply" for the Inventory identification type, specify a subcontracting location as a GI location.\nGI location: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1206' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1206',
	'en_US',
	'W',
	'Could not acquire the shippable date.\nReceiving point distribution group cd.: {1}\nShipping point distribution group cd.: {2}\nShipping conditions cd.: {3}\nArrival day of week: {4}\nShipping operation cd.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1207' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1207',
	'en_US',
	'W',
	'Could not acquire the shippable date.\nReceiving point distribution group cd.: {1}\nShipping point distribution group cd.: {2}\nShipping conditions cd.: {3}\nShipping operation cd.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1208' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1208',
	'en_US',
	'W',
	'Could not acquire the deliverable date.\nReceiving point distribution group cd.: {1}\nShipping point distribution group cd.: {2}\nShipping conditions cd.: {3}\nArrival day of week: {4}\nShipping operation cd.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1209' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1209',
	'en_US',
	'W',
	'Could not acquire the deliverable date.\nReceiving point distribution group cd.: {1}\nShipping point distribution group cd.: {2}\nShipping conditions cd.: {3}\nShipping operation cd.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1301' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1301',
	'en_US',
	'W',
	'The expiration date entered is different from the expiration date set for the lot.\nShipping point deadline: {1}\nExpiration date in the lot management info.: {2}\nUsage expiration date in the lot management info.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1302' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1302',
	'en_US',
	'W',
	'Different expiration dates or expiration base dates have been set for records with the same lot.\nReceipt schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1303' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBEL1303',
	'en_US',
	'W',
	'The retrieved sales unit price is 0.\nSales reason is required if the sales unit price is 0.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFP0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFP0001',
	'en_US',
	'I',
	'Not entered as "Prior inspection valid" in the Item Inspection master.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFP0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFP0002',
	'en_US',
	'W',
	'Cannot transit to the next screen since inspection schedules other than receiving/mfg./lot inspections cannot be consolidated.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFP0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFP0003',
	'en_US',
	'W',
	'Cannot transit to the next screen since inspection schedule cannot be consolidated if an inspection implementation unit is a result unit or undefined.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFP0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFP0004',
	'en_US',
	'W',
	'Cannot transit to the next screen since the inspection schedule that cannot be consolidated is selected.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFP0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFP0005',
	'en_US',
	'I',
	'The Inspection method type is not entered as "4: Sampling specific inspection" in the Item Inspection Pattern master.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFP0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFP0006',
	'en_US',
	'I',
	'There is a rejected inspection column.\nInspection No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFP0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFP0007',
	'en_US',
	'I',
	'There is an inspection column with concession.\nInspection No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0001',
	'en_US',
	'W',
	'Items to be processed or its components contain a lot for which inspection decision has not been conducted. \nSee the lot on the Lot Trace (Explosion) screen.\nItem: {1}\nLot No.: {2}\nSublot No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0002',
	'en_US',
	'W',
	'Items to be processed or its components contain a lot other than conforming items.\nSee the lot on the Lot Trace (Explosion) screen.\nItem: {1}\nLot No.: {2}\nSublot No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0003',
	'en_US',
	'W',
	'Items to be processed or its component contain a lot for which mfg. record approval has not been conducted.\nSee the lot on the Lot trace (Explosion) screen.\nItem: {1}\nLot No.: {2}\nSublot No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0004',
	'en_US',
	'W',
	'There is a lot for which mfg. record approval has not been conducted.\nItem: {1}\nLot No.: {2}\nSublot No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0005',
	'en_US',
	'W',
	'Cannot enter since the specified item is not subject to market release decision.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0006',
	'en_US',
	'W',
	'Cannot make a market release decision for items that are not managed in lots.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0007',
	'en_US',
	'W',
	'The target lot information has already been entered.\nItem: {1}\nLot No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0008',
	'en_US',
	'W',
	'Cannot cancel since market release decision information has been entered.\nItem: {1}\nLot No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0009',
	'en_US',
	'W',
	'Lot which has not been determined to be "Allow shipping" by the market release decision is selected.\nMarket release decision status type: {1}\nItem: {2}\nLot No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0010',
	'en_US',
	'W',
	'Approval role authority for login user is not available.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0011',
	'en_US',
	'W',
	'Could not acquire factory release approval information.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0012',
	'en_US',
	'W',
	'Could not process since the factory release has been approved or rejected.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0013',
	'en_US',
	'W',
	'Cannot approve or reject the shipping since mfg. is not completed.\nItem: {1}\nLot No.: {2}\nSublot No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0014',
	'en_US',
	'W',
	'Items to be processed or its components contain one of the following lots.\n- Lots having no mfg. record approval\n- Lots for which inspection decision is not conducted\n- Lots other than conforming item\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0015',
	'en_US',
	'W',
	'Can update the approved or rejected data only.\nFactory release approval No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0016',
	'en_US',
	'W',
	'There are lot inspection, receiving inspection and mfg. inspection for the applicable sublot.\nItem: {1}\nLot No.: {2}\nSublot No.: {3}\nSEIBAN No.: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0017',
	'en_US',
	'W',
	'Cannot create an inspection schedule for inventory which is at arriving point.\nItem: {1}\nLot No.: {2}\nSublot No.: {3}\nSEIBAN No.: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0018',
	'en_US',
	'W',
	'Cannot cancel the inspection schedule information since it has been re-inspected.\nInspection schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0019',
	'en_US',
	'W',
	'Cannot cancel the inspection schedule since "Lot inspection" is not specified as the Inspection classification type in the inspection schedule.\nInspection schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0020',
	'en_US',
	'W',
	'Cannot cancel the inspection schedule since "Unordered" is not specified as the Inspection schedule status type in the inspection schedule.\nInspection schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0021',
	'en_US',
	'W',
	'Cannot consolidate inspection schedules if the inspection implementation unit is the result unit.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0022',
	'en_US',
	'W',
	'Inspection schedule that cannot be consolidated is specified.\nCheck the contents of the inspection schedule.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0023',
	'en_US',
	'W',
	'Cannot update/cancel the inspection order since the inspection result has already been entered.\nInspection No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0024',
	'en_US',
	'W',
	'Cannot update/cancel the inspection order since the specific inspection result has already been entered.\nInspection No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0025',
	'en_US',
	'W',
	'Cannot cancel the inspection order approval since the specific inspection result has already been entered.\nInspection No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0026',
	'en_US',
	'W',
	'Cannot enter since there is a prior inspection under inspection.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0027' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0027',
	'en_US',
	'W',
	'Cannot set "Operation defective" in the Conforming type.\nInspection No.: {1}\nInspection results No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0028' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0028',
	'en_US',
	'W',
	'The specified prior inspection does not exist.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0029' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0029',
	'en_US',
	'W',
	'Cannot cancel since inspection schedule status type is set to anything other than "Unordered".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0030' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0030',
	'en_US',
	'W',
	'Cannot delete the lot since a valid output order exists.\nItem: {1}\nLot No.: {2}\nSublot No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0031' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0031',
	'en_US',
	'W',
	'Cannot delete the lot since a valid receipt schedule exists.\nItem: {1}\nLot No.: {2}\nSublot No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0032' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0032',
	'en_US',
	'W',
	'Cannot delete the lot since a valid GR result exists.\nItem: {1}\nLot No.: {2}\nSublot No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0033' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0033',
	'en_US',
	'W',
	'Lot No. is duplicated.\nItem: {1}\nLot No.: {2}\nSublot No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0034' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0034',
	'en_US',
	'W',
	'Sublot No. is duplicated.\nItem: {1}\nLot No.: {2}\nSublot No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0035' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0035',
	'en_US',
	'W',
	'The target lot doe not exist.\nItem: {1}\nLot No.: {2}\nSublot No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0036' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0036',
	'en_US',
	'W',
	'Lots which have not been approved by the factory release approval are selected.\nFactory release approval state type: {1}\nItem: {2}\nLot No.: {3}\nSublot No.: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0037' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0037',
	'en_US',
	'W',
	'Could not process since the inspection has been completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0038' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0038',
	'en_US',
	'W',
	'For items subject to market release decision, create lots in advance in the purchase delivery date adjustment entry.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0039' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0039',
	'en_US',
	'W',
	'Cannot acquire specific inspection info. since the valid Item Inspection Specific master is not set.\nItem: {1}\nInspection pattern: {2}\nMaster application date: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0040' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0040',
	'en_US',
	'W',
	'Could not delete since the inspection has been ordered.\nOutput schedule No.: {1}\nOutput result No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0041' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0041',
	'en_US',
	'W',
	'Cannot change the unit/qty. of output results since 100% inspection has already been ordered.\nMfg. order No.: {1}\nItem mfg. order No.: {2}\nOutput schedule No.: {3}\nOutput result No.: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0042' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0042',
	'en_US',
	'W',
	'Can update conforming items only since the inspection has already been ordered.\nMfg. order No.: {1}\nItem mfg. order No.: {2}\nOutput schedule No.: {3}\nOutput result No.: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0043' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0043',
	'en_US',
	'W',
	'Cannot change the Item cd., lot No. and sublot No. since the inspection has already been ordered.\nMfg. order No.: {1}\nItem mfg. order No.: {2}\nOutput schedule No.: {3}\nOutput result No.: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0044' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0044',
	'en_US',
	'W',
	'Cannot change the Item cd. and lot No. since the inspection has already been ordered.\nMfg. order No.: {1}\nItem mfg. order No.: {2}\nOutput schedule No.: {3}\nOutput result No.: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0045' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0045',
	'en_US',
	'W',
	'Cannot change the output grading since the inspection result has already been entered.\nMfg. order No.: {1}\nItem mfg. order No.: {2}\nOutput schedule No.: {3}\nOutput result No.: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0046' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0046',
	'en_US',
	'W',
	'Cannot change the unit of output since the inspection result has already been entered.\nMfg. order No.: {1}\nItem mfg. order No.: {2}\nOutput schedule No.: {3}\nOutput result No.: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0047' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0047',
	'en_US',
	'W',
	'Cannot update the receipt result since the inspection has already been ordered.\nReceipt result No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0048' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0048',
	'en_US',
	'W',
	'Could not process since the factory release has been approved or rejected.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0049' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0049',
	'en_US',
	'W',
	'Cannot cancel the mfg. order approval since the inspection has already been ordered.\nMfg. order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0050' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0050',
	'en_US',
	'W',
	'Cannot cancel the mfg. record approval since factory release approval has already been conducted.\nMfg. order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0051' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0051',
	'en_US',
	'W',
	'Could not process since the inspection has already been completed.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0052' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0052',
	'en_US',
	'W',
	'Cannot enter results if the Inspection status type is set to "Inspection schedule" or "Unordered".\nInspection No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0053' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0053',
	'en_US',
	'W',
	'Cannot enter results if the Inspection approval status type is set to "Order unapproved".\nInspection No.: {1}\nInspection results No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0054' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0054',
	'en_US',
	'W',
	'No decision can be made if the Inspection status type is not set to "Completed".\nInspection No.: {1}\nInspection results No.: {2}\nInspection status type: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0055' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0055',
	'en_US',
	'W',
	'No decision can be made if the Inspection approval status type is not set to "Undecided".\nInspection No.: {1}\nInspection results No.: {2}\nInspection approval status type: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0056' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0056',
	'en_US',
	'W',
	'Could not process since the factory release has been approved or rejected.\nInspection No.: {1}\nInspection results No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0057' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0057',
	'en_US',
	'W',
	'Cannot update results since the re-inspection information has already been ordered.\nInspection No.: {1}\nInspection results No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0058' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0058',
	'en_US',
	'W',
	'Cannot enter results since the inspection order is not approved.\nInspection No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0059' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0059',
	'en_US',
	'W',
	'Cannot confirm since the Specific inspection result type is not set.\nSpecific inspection result No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0060' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0060',
	'en_US',
	'W',
	'Cannot cancel if the inspection is completed and the "Specific inspection required" is turned on.\nInspection No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0061' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0061',
	'en_US',
	'W',
	'Cannot cancel since there is confirmed specific inspection result information.\nInspection No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0062' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0062',
	'en_US',
	'W',
	'Cannot process since the following inspection No. is duplicated.\nInspection No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0063' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0063',
	'en_US',
	'W',
	'Cannot update since the inspection No. of the specific inspection result does not exist in the header.\nInspection No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0064' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0064',
	'en_US',
	'W',
	'Cannot update since specific inspection order No. of the specific inspection result is duplicated.\nSpecific inspection order No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0065' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0065',
	'en_US',
	'W',
	'Cannot update since specific inspection order No. of the specific inspection result does not exist.\nSpecific inspection order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0066' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0066',
	'en_US',
	'W',
	'A numerical value exceeding significant integral digits is specified in {1}.\nNumerical value: {2}\nNumber of significant integral digits: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0067' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0067',
	'en_US',
	'W',
	'There is no lot that meets the condition.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0068' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0068',
	'en_US',
	'W',
	'There are no item mfg. orders or output results that meet the condition.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0069' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0069',
	'en_US',
	'W',
	'Item to be processed is not subject to lot copy.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0070' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0070',
	'en_US',
	'W',
	'If one of the Conforming type, grading, or inspection finish date and time is specified, the columns on the left are all required.\nInspection No.: {1}\nInspection results No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0071' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0071',
	'en_US',
	'W',
	'The SKU qty. of the inspection result details is required.\nInspection No.: {1}\nInspection results No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0072' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0072',
	'en_US',
	'W',
	'The Conforming type of the inspection result derails is required.\nInspection No.: {1}\nInspection results No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0073' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0073',
	'en_US',
	'W',
	'Grading of the inspection result details is required.\nInspection No.: {1}\nInspection results No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0074' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0074',
	'en_US',
	'W',
	'Sampling qty. of sampling inspection results is required.\nInspection No.: {1}\nInspection results No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0075' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0075',
	'en_US',
	'I',
	'Shipping approval result, inspection result, and mfg. management result will be automatically acquired from mfg. site. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0076' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0076',
	'en_US',
	'I',
	'Automatically acquired.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0077' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0077',
	'en_US',
	'W',
	'Cannot update since the inspection No. of the inspection result details does not exist in the header.\nInspection No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0078' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0078',
	'en_US',
	'W',
	'Cannot update since the inspection No. of the sampling inspection result does not exist in the header.\nInspection No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0079' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0079',
	'en_US',
	'W',
	'Multiple rows of the same lot are selected. Select only one row.\nItem: {1}\nLot No.: {2}\nSublot No.: {3}\nSEIBAN No.: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0080' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0080',
	'en_US',
	'W',
	'If the "Sampling specific inspection" is specified for the Inspection method type, you cannot enter unless you specify one or more specific inspection column.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0081' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0081',
	'en_US',
	'W',
	'The applicable data already exists in the lot management information.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0082' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0082',
	'en_US',
	'W',
	'Cannot create lot management information on items which are not managed by lot.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0083' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0083',
	'en_US',
	'W',
	'A lot which is rejected by the factory release approval is selected.\nFactory release approval state type: {1}\nItem: {2}\nLot No.: {3}\nSublot No.: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0084' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0084',
	'en_US',
	'W',
	'A lot that has been determined as "Prohibit shipping" by the market release approval is selected.\nMarket release approval status type: {1}\nItem: {2}\nLot No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0085' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0085',
	'en_US',
	'W',
	'Cannot specify sales location as storage location since it is subject to the factory release approval.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0086' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0086',
	'en_US',
	'I',
	'An approval request for inspection order is entered.\nNumber of rows: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0087' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0087',
	'en_US',
	'I',
	'An approval request for inspection order is canceled.\nNumber of rows: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0088' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0088',
	'en_US',
	'I',
	'Inspection order is approved.\nNumber of rows: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0089' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0089',
	'en_US',
	'I',
	'Approval of inspection order is canceled.\nNumber of rows: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0090' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0090',
	'en_US',
	'I',
	'Decision request for inspection results has been entered.\nNumber of rows: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0091' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0091',
	'en_US',
	'I',
	'Decision request for inspection result has been canceled.\nNumber of rows: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0092' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0092',
	'en_US',
	'I',
	'The inspection result has been decided.\nNumber of rows: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0093' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0093',
	'en_US',
	'I',
	'Decision of inspection results has been canceled.\nNumber of rows: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0094' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0094',
	'en_US',
	'I',
	'Factory release approval request has been entered.\nNumber of rows: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0095' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0095',
	'en_US',
	'I',
	'Factory release has been approved.\nNumber of rows: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0096' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0096',
	'en_US',
	'I',
	'Factory release approval has been canceled.\nNumber of rows: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0097' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0097',
	'en_US',
	'I',
	'Decision request for market release has been entered.\nNumber of rows: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0098' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0098',
	'en_US',
	'I',
	'Market release has been decided.\nNumber of rows: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0099' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0099',
	'en_US',
	'I',
	'Decision of market release has been canceled.\nNumber of rows: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0100' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0100',
	'en_US',
	'I',
	'Decision request for market release has been canceled.\nNumber of rows: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0101' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0101',
	'en_US',
	'I',
	'Approval request for factory release has been canceled.\nNumber of rows: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0102' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0102',
	'en_US',
	'W',
	'In the case of mfg. inspection or receiving inspection,\nyou cannot change from sampling inspection or sampling specific inspection to 100% inspection for inspection order.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0103' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0103',
	'en_US',
	'W',
	'In the case of mfg. inspection or receiving inspection,\nyou cannot change from 100% inspection to sampling inspection or sampling specific inspection at the time of inspection order.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0104' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0104',
	'en_US',
	'W',
	'The target lot doe not exist.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0105' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0105',
	'en_US',
	'W',
	'The target sublot does not exist.\nItem: {1}\nLot No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0106' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0106',
	'en_US',
	'W',
	'For prior inspection, you cannot specify the Inspection method type other than sampling specific inspection.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0107' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0107',
	'en_US',
	'W',
	'In the case of re-inspection for expiration, you cannot specify 100% inspection for the Inspection method type.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0108' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0108',
	'en_US',
	'W',
	'Cannot cancel since the Inspection classification type is not set to "Prior inspection".\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0109' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0109',
	'en_US',
	'W',
	'Cannot complete inspection since undecided specific inspection result exists.\nInspection No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0110' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0110',
	'en_US',
	'W',
	'Cannot complete inspection since unconfirmed specific inspection result exists.\nInspection No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0111' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0111',
	'en_US',
	'W',
	'Cannot enter since the corresponding record is not entered in the Item Inspection master.\nItem: {1}\nMfg. location cd.: {2}\nSupplier cd.: {3}\nMaker cd.: {4}\nMaster application date: {5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0112' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0112',
	'en_US',
	'W',
	'Cannot calculate expiration date and usage expiration date since the corresponding record is not entered in the Item Inspection master.\nInspection No.: {1}\nItem: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0113' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0113',
	'en_US',
	'W',
	'Cannot withdraw 100% amount at start. Withdraw when completed.\nInspection No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0114' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0114',
	'en_US',
	'W',
	'If 100% amount is withdrawn at completion, it cannot be returned during the process. Change the number of withdrawals or delete rows in sampling details.\nInspection No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0115' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0115',
	'en_US',
	'W',
	'Cannot re-inspect since there is no inventory to be re-inspected.\nInspection No.: {1}\nInspection results No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0116' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0116',
	'en_US',
	'I',
	'Could not update GR/GI results of withdrawal since purchase result has already been entered.\nTo update GR/GI results of withdrawal, update purchase result on Purchase Result Entry screen.\nInspection No.: {1}\nPurchase result No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0117' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0117',
	'en_US',
	'W',
	'Cannot specify version No. that is different from the lot information.\nItem: {1}\nSpecified version No.: {2}\nLot information version No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0118' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0118',
	'en_US',
	'W',
	'Cannot acquire factory release approval role. Check the Item master (Factory/distribution warehouse).\nItem: {1}\nFactory/distribution warehouse: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0119' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0119',
	'en_US',
	'W',
	'Cannot cancel since the purchase result has been entered. Cancel the purchase result first.\nInspection No.: {1}\nPurchase result No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0120' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0120',
	'en_US',
	'W',
	'Could not delete since the inspection has been ordered.\nReceipt result No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0121' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0121',
	'en_US',
	'W',
	'The processing has been interrupted since it exceeds the number of combinable characters. Correct the lot information of input items.\nJoin string: {1}\nNumber of combined characters: {2}\nMaximum number of characters: {3}\nCopy column: {4}\nParent item: {5}\nParent lot No.: {6}\nParent sublot No.: {7}\nItem mfg. order No.: {8}\n{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0122' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0122',
	'en_US',
	'I',
	'It has been truncated to the maximum number of characters since it exceeds the number of combinable characters. Correct the lot information of input items.\nJoin string: {1}\nNumber of combined characters: {2}\nMaximum number of characters: {3}\nCopy column: {4}\nParent item: {5}\nParent lot No.: {6}\nParent sublot No.: {7}\nItem mfg. order No.: {8}\n{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0123' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0123',
	'en_US',
	'I',
	'It has been truncated to the maximum number of characters since it exceeds the number of combinable characters.\nJoin string: {1}\nNumber of combined characters: {2}\nMaximum number of characters: {3}\nCopy column: {4}\nParent item: {5}\nParent lot No.: {6}\nParent sublot No.: {7}\nItem mfg. order No.: {8}\n{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0124' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0124',
	'en_US',
	'W',
	'There is no lot that meets the conditions.\nParent item: {1}\nParent lot No.: {2}\nParent sublot No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0125' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0125',
	'en_US',
	'W',
	'There are no item mfg. orders or output results that meet the conditions.\nParent item: {1}\nParent lot No.: {2}\nParent sublot No.: {3}\nWG cd.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0126' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0126',
	'en_US',
	'W',
	'There is no item mfg. order to be processed.\nItem mfg. order No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0127' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0127',
	'en_US',
	'W',
	'Item to be processed is not subject to lot copy.\nParent item: {1}\nBOM pattern: {2}\nWG cd.: {3}\nItem mfg. order No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0128' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0128',
	'en_US',
	'W',
	'If the Conforming type specified at inspection results is other than conforming item, you cannot specify "Passed" or "Concession" as the decision result.\nInspection No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0129' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0129',
	'en_US',
	'W',
	'Cannot specify "Passed" or "Concession" as the decision result since no conforming item row has been entered at inspection results.\nInspection No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0130' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0130',
	'en_US',
	'W',
	'The target lot doe not exist.\nItem: {1}\nLot No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0131' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0131',
	'en_US',
	'W',
	'Cannot change the dates of only some inspection results since multiple inspection results were consolidated when the purchase results were entered at the time of new entry.\nSpecify the same date for all dates of inspection results entered simultaneously on the inspection result list entry, or cancel the inspection results to re-enter.\nInspection result No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0132' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0132',
	'en_US',
	'W',
	'Cannot change the recording date of only some inspection results since multiple inspection result details were consolidated when the purchase results were entered at the time of new entry.\nSpecify the same date for all recording dates of inspection results entered simultaneously on the inspection result list entry, or cancel the inspection results to re-enter.\nInspection result No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0133' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0133',
	'en_US',
	'W',
	'Cannot change lot since valid output orders exist.\nItem: {1}\nLot No.: {2}\nSublot No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0134' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0134',
	'en_US',
	'W',
	'Cannot change lot since valid receipt schedules exist.\nItem: {1}\nLot No.: {2}\nSublot No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0135' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0135',
	'en_US',
	'W',
	'Cannot change lot since valid GR results exist.\nItem: {1}\nLot No.: {2}\nSublot No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0136' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0136',
	'en_US',
	'W',
	'In the case of mfg. inspection or receiving inspection, and meeting either of the following conditions, you cannot change from sampling inspection or sampling specific inspection to 100% inspection at the time of inspection order.\n- Inspection order timing type : Allow before output result\n- Allow inspecting lot use : on\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0137' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0137',
	'en_US',
	'W',
	'There is a re-inspection for expiration for the lot and sublot.\nItem: {1}\nLot No.: {2}\nSublot No.: {3}\nSEIBAN No.: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0138' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0138',
	'en_US',
	'I',
	'The lot was copied with no value set in the copy column of the copy-from lot.\nCopy column: {1}\nItem (Copy-from): {2}\nLot No. (Copy-from): {3}\nSublot No. (Copy-from): {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0139' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0139',
	'en_US',
	'W',
	'There is an inspection schedule for the same lot that can be consolidated.\nSearch again on the Inspection Order List Entry screen and order the inspection all at once.\nInspection schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0140' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0140',
	'en_US',
	'W',
	'The item inspection pattern master or item inspection master cannot be acquired or it is not subject to inspection.\nMfg. order No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0141' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0141',
	'en_US',
	'W',
	'Cannot delete the lot since a valid item mfg. order exists.\nItem: {1}\nLot No.: {2}\nSublot No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0142' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0142',
	'en_US',
	'W',
	'Cannot change the lot since a valid item mfg. order exists.\nItem: {1}\nLot No.: {2}\nSublot No.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0143' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0143',
	'en_US',
	'W',
	'The Item Unit master does not exist.\nItem: {1}\nUnit: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0200' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0200',
	'en_US',
	'W',
	'Cannot update since IF has been exported.\nInspection No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0201' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0201',
	'en_US',
	'W',
	'The expiration date entered is different from the expiration date set for the lot.\nUsage expiration date: {1}\nExpiration date in the lot management info.: {2}\nUsage expiration date in the lot management info.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0202' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBFL0202',
	'en_US',
	'W',
	'Different expiration or expiration base dates have been set for records with the same lot.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGP0001',
	'en_US',
	'I',
	'The information selected on the Select Invoice Details screen will be cleared. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGP0002',
	'en_US',
	'I',
	'The selected details are not found.\nIf you continue, an invoice without details will be issued. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGP0003',
	'en_US',
	'I',
	'Do you want to firm selected billing details?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGP0004',
	'en_US',
	'W',
	'The payment has already been deposited. Cannot update.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGP0005',
	'en_US',
	'W',
	'If the Sales temporary unit price closing of the billing customer is turned off, you cannot select details with temporary unit price.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGP0006',
	'en_US',
	'W',
	'Specify a value less than or equal to the original amount for the partial billing amount.\nOriginal amount: {1}\nSpecified amount: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGP0007',
	'en_US',
	'W',
	'Specify a value less than or equal to the original tax amount for the partial billing tax amount.\nOriginal tax amount: {1}\nSpecified tax amount: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGP0008',
	'en_US',
	'I',
	'Do you want to confirm the reconciliation of the details?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGP0009',
	'en_US',
	'I',
	'There are no details to be reconciled. Are you sure you want to confirm this?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGP0010',
	'en_US',
	'I',
	'The same billing dept., AR customer, AR dept. and sales project are specified for the transfer source and transfer destination. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGP0011',
	'en_US',
	'W',
	'A combination of transaction and payment received info. is invalid.\nIn transactions corresponding to advance received payment, you can only process the payment received info. entered in the payment received entry.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGP0012',
	'en_US',
	'W',
	'A combination of transaction and payment received info. is invalid.\nIn transactions corresponding to suspense received payment, you can only process the payment received info. entered in the payment received entry.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGP0013',
	'en_US',
	'W',
	'A combination of transaction and payment received info. is invalid.\nIn transactions corresponding to suspense received/advance received offset, you can only process the payment received info. entered as a suspense received.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGP0014',
	'en_US',
	'W',
	'A combination of transaction and payment received info. is invalid.\nIn transactions corresponding to suspense received/other accounting offset, you can only process the payment received info. entered as suspense received.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGP0015',
	'en_US',
	'W',
	'A combination of transaction and payment received info. is invalid.\nIn transactions corresponding to advance received/other accounting offset, you can only process the payment received info. entered as advance received.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGP0016',
	'en_US',
	'W',
	'A combination of transaction and payment received info. is invalid.\nIn transactions corresponding to sales payment received, you can only process the payment received info. entered in the payment received entry.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGP0017',
	'en_US',
	'W',
	'A combination of transaction and payment received info. is invalid.\nIn transactions corresponding to advance received offset, you can only process the payment received info. entered as an advance received.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGP0018',
	'en_US',
	'W',
	'A combination of transaction and payment received info. is invalid.\nIn transactions corresponding to suspense received/AR offset, you can only process the payment received info. receipt entered as a suspense received.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGP0019',
	'en_US',
	'W',
	'A combination of transaction and payment received info. is invalid.\nIn transactions corresponding to other accounting/AR offset, you can only process the payment received info. entered as AP amount offset.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGP0020',
	'en_US',
	'W',
	'If payment received is referred, the total amount of payment received cannot be set to 0.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGP0021',
	'en_US',
	'W',
	'If payment received is referred, the total amount of offset cannot be set to 0.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGP0022',
	'en_US',
	'W',
	'Cannot perform auto-reconciliation since {1} and the sign of the total amount to be reconciled are different.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGP0023',
	'en_US',
	'I',
	'The invoice has already been issued, but the payment receipt schedule adjustment entry will be performed. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGP0024',
	'en_US',
	'W',
	'Specify a value less than or equal to the original tax included amount for a tax included partial billing amount.\nOriginal tax included amount: {1}\nSpecified tax included amount: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGP0025',
	'en_US',
	'W',
	'Set a value greater than or equal to 0 and less than the original amount.\nColumn: {1}\nOriginal value: {2}\nSpecified value: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGP0026',
	'en_US',
	'W',
	'Set a value greater than the original amount and less than or equal to zero.\nColumn: {1}\nOriginal value: {2}\nSpecified value: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0027' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGP0027',
	'en_US',
	'W',
	'Enter a value different from the original value for either or both the Partial billing amount and the Partial billing tax amount.\nOriginal amount: {1}\nOriginal tax amount: {2}\nAmount specified: {3}\nTax amount specified: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0028' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGP0028',
	'en_US',
	'W',
	'Enter values so that the total amount and the total tax amount on the details subject to invoice output and subject to billing match.\nDetails result No.: {1}\nTotal amount subject to invoice output: {2}\nTotal tax amount subject to invoice output: {3}\nTotal amount subject to billing: {4}\nTotal tax amount subject to billing: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0001',
	'en_US',
	'W',
	'The payment receipt schedule amount before split does not correspond to the payment receipt schedule amount after split.\nPayment receipt schedule amount before split: {1}\nPayment receipt schedule amount after split: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0002',
	'en_US',
	'W',
	'Cannot enter since there is already a payment receipt schedule with the same scheduled payment receipt date and payment received method.\nScheduled payment receipt date: {1}\nPayment received method: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0003',
	'en_US',
	'W',
	'Cannot process the specified payment received information on this screen.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0004',
	'en_US',
	'W',
	'Cannot process the payment received information for split-to on this screen.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0005',
	'en_US',
	'W',
	'Cannot perform payment received split after specifying the same bill-to customer/billing department.\nBilling customer cd.: {1}\nBilling dept. cd.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0006',
	'en_US',
	'W',
	'For payment received method, specify AR settlement method with the Payment received entry type "1: Not available to enter" or "2: Available to enter" in the Settlement Method master.\nPayment received method: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0007',
	'en_US',
	'W',
	'Cannot modify or cancel since the split process has already been completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0008',
	'en_US',
	'W',
	'The reconciled amount exceeds the reconciled target amount.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0009',
	'en_US',
	'W',
	'The reconciled amount is invalid. See if the reconciled amount exceeds the reconciled target amount.\nReconciled amount: {1}\nUnreconciled amount: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0010',
	'en_US',
	'W',
	'Specify the billing department for the billing customer.\nBilling customer cd.: {1}\nBilling dept. cd.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0011',
	'en_US',
	'W',
	'For payment received method, specify the AR settlement method whose AR settlement type is set to "Cash", "Payment", or "Notes" in the Settlement Method master.\nPayment received method: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0012',
	'en_US',
	'W',
	'Cannot specify the bank account or payment person name if the Payment received method is "Cash" or "Notes".');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0013',
	'en_US',
	'W',
	'Specify the bank account if the Payment received method is "Payment".');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0014',
	'en_US',
	'W',
	'If the Auto-reconciliation target is turned off, you cannot specify the transfer fee or auto-reconciliation base date.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0015',
	'en_US',
	'W',
	'If the Auto-reconciliation target is turned on, specify the auto-reconciliation base date.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0016',
	'en_US',
	'W',
	'If the Payment received method is other than "Notes", you cannot specify the note related columns (note number, note type, drawing date, payment due date, drawer name, endorser, acceptor, Note reason cd., drawing bank,\ndrawing branch, spare 1, spare 2, and spare 3).');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0017',
	'en_US',
	'W',
	'Specify the transfer fee within the transfer fee before change.\nTransfer fee before change: {1}\nTransfer fee after change: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0018',
	'en_US',
	'W',
	'If the Payment received method is "Notes" and the Payment received type is "Notes of exchange", specify an acceptor.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0019',
	'en_US',
	'W',
	'Could not acquire the Payment Receipt Schedule Control master. Set up the Payment Receipt Schedule Control master.\nBilling customer cd.: {1}\nWG cd.: {2}\nTransaction currency cd.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0020',
	'en_US',
	'W',
	'If the unreconciled balance on the Payment received tab is 0, take over the full transfer fee to the payment received of split-to.\nRemaining transfer fee: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0021',
	'en_US',
	'W',
	'Cannot acquire the scheduled payment receipt date {1} and the account receivable turnover period {1} corresponding to the billing closing day {1}.\nSee the setting of the Payment Receipt Schedule Control master.\nBilling customer cd.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0022',
	'en_US',
	'W',
	'AR reconciliation has already been performed for the invoice to be corrected. To correct it, cancel the AR reconciliation first.\nInvoice No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0023',
	'en_US',
	'W',
	'As the payment received amount to be split, specify an amount more than or equal to the processed payment received amount.\nSplit destination payment received No.: {1}\nPayment received amount: {2}\nProcessed payment received amount: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0024',
	'en_US',
	'W',
	'Cannot delete the information on split destination payment received to be deleted since the payment has already been deposited.\nSplit destination payment received No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0025',
	'en_US',
	'I',
	'Excluded from the credit limit management since the corresponding data is not entered in the Credit Limit master.\nCredit managed BP cd.: {1}\nCurrency cd.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0026',
	'en_US',
	'I',
	'The alarm usage rate has been exceeded.\nCredit managed BP cd.: {1}\nCurrency cd.: {2}\nCredit usage amount: {3}\nCredit limit: {4}\nAlarm usage rate: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0027' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0027',
	'en_US',
	'W',
	'Cannot process since the offset method corresponding to withholding tax is not specified.\nTo clear the withholding tax, specify the offset method corresponding to the withholding tax.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0028' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0028',
	'en_US',
	'W',
	'Cannot process since data corresponding to the AR settlement type "7: Transfer" is not entered in the Settlement Method master. \nEnter the data in the Settlement Method master.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0029' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0029',
	'en_US',
	'W',
	'Could not process since the Tax cd. whose Tax inclusive is turned on at the same tax rate as sales tax or purchase tax in the Company master does not exist in the Tax master.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0030' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0030',
	'en_US',
	'W',
	'To specify the billing dept., specify the billing customer.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0031' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0031',
	'en_US',
	'W',
	'Could not enter since it exceeded the credit limit.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0032' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0032',
	'en_US',
	'W',
	'Payment received information with the billing customer and billing dept. specified cannot be processed on this screen.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0033' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0033',
	'en_US',
	'W',
	'Payment received information without a specified payer cannot be processed on this screen.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0034' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0034',
	'en_US',
	'W',
	'Not entered in the Tax master.\nTax cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0035' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0035',
	'en_US',
	'W',
	'The process will be skipped since the total amount to be reconciled is not 0.\nAR dept. cd.: {1}\nAR customer cd.: {2}\nInvoice No.: {3}\nTransaction currency cd.: {4}\nSales project No.: {5}\nAR type: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0036' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0036',
	'en_US',
	'W',
	'Cannot issue the invoice since there are billing details for the temporary unit price.\nSee and change the temporary unit price information in the Correction of Sales Details.\nInvoice No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0037' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0037',
	'en_US',
	'W',
	'To transfer the outstanding billing in the billing details including withholding tax, reconcile all the withholding taxes in AR details first.\nUnreconciled withholding tax amount: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0038' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0038',
	'en_US',
	'W',
	'Offset amount is invalid. To reconcile withholding tax, specify the amount within the unreconciled amount.\nOffset amount: {1}\nUnreconciled amount: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0039' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0039',
	'en_US',
	'W',
	'Cannot issue the invoice since the Invoice issue type of the billing customer is set to "4. Not for issue".\nInvoice No.: {1}\nBilling customer cd.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0040' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0040',
	'en_US',
	'W',
	'AR department of the transfer source is invalid on the specified recording date.\nSelect a transaction that is not for journal, or review the recording date.\nAR dept. cd. of transfer source: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0041' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0041',
	'en_US',
	'W',
	'There is no print data of payment received result header.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0042' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0042',
	'en_US',
	'W',
	'There is no print data of payment received result details information.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0043' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0043',
	'en_US',
	'W',
	'There is no print data of payment received information.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0044' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0044',
	'en_US',
	'I',
	'The credit limit has been exceeded.\nCredit managed BP cd.: {1}\nCurrency cd.: {2}\nCredit usage amount: {3}\nCredit limit: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0045' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0045',
	'en_US',
	'W',
	'Cannot process this transaction on this screen.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0046' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0046',
	'en_US',
	'W',
	'Details to be updated has been reconciled.\nCannot update the billing carry-over count for reconciled details.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0047' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0047',
	'en_US',
	'W',
	'Cannot process since the corresponding Sales purchase tax type in the Settlement Method master is not entered.\nSpecify the Sales purchase tax type for the settlement method whose AR settlement type is set to "4. Offset (debit)".');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0048' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0048',
	'en_US',
	'W',
	'Transfer fee is specified for the payment received information, but the transfer fee was not reconciled.\nPayment received No.: {1}\nPayment received amount: {2}\nTransfer fee: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0049' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0049',
	'en_US',
	'W',
	'Could not acquire the payment received result info. to be processed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0050' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0050',
	'en_US',
	'W',
	'The specified payment received result has already been canceled.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0051' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0051',
	'en_US',
	'W',
	'Cannot change/cancel since reconciliation process has already been executed for the specified payment received result.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0055' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0055',
	'en_US',
	'W',
	'The specified payment received info. has been canceled.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0056' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0056',
	'en_US',
	'W',
	'A combination of transaction and payment received info. is invalid.\nIn transactions corresponding to sales payment received, you can only process the payment received info. entered in the payment received entry.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0057' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0057',
	'en_US',
	'W',
	'A combination of transaction and payment received info. is invalid.\nIn transactions corresponding to advance received payment, you can only process the payment received info. entered in the payment received entry.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0058' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0058',
	'en_US',
	'W',
	'A combination of transaction and payment received info. is invalid.\nIn transactions corresponding to suspense received payment, you can only process the payment received info. entered in the payment received entry.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0059' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0059',
	'en_US',
	'W',
	'A combination of transaction and payment received info. is invalid.\nIn transactions corresponding to advance received offset, you can only process the payment received info. entered as an advance received.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0060' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0060',
	'en_US',
	'W',
	'A combination of transaction and payment received info. is invalid.\nIn transactions corresponding to suspense received/AR offset, you can only process the payment received info. entered as a suspense received.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0061' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0061',
	'en_US',
	'W',
	'A combination of transaction and payment received info. is invalid.\nIn transactions corresponding to suspense received/other accounting offset, you can only process the payment received info. entered as suspense received.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0062' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0062',
	'en_US',
	'W',
	'A combination of transaction and payment received info. is invalid.\nIn transactions corresponding to advance received/other accounting offset, you can only process the payment received info. entered as an advance received.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0063' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0063',
	'en_US',
	'W',
	'A combination of transaction and payment received info. is invalid.\nIn transactions corresponding to suspense received/advance received offset, you can only process the payment received info. entered as a suspense received.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0064' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0064',
	'en_US',
	'W',
	'A combination of transaction and payment received info. is invalid.\nIn transactions corresponding to other accounting/AR offset, you can only process the payment received info. entered as AP amount offset.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0065' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0065',
	'en_US',
	'W',
	'A combination of transaction and payment received info. is invalid.\nThis transaction cannot process payment received information.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0066' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0066',
	'en_US',
	'W',
	'If the Payment received type is "Notes", note No. is required.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0067' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0067',
	'en_US',
	'W',
	'The applicable report format does not exist.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0068' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0068',
	'en_US',
	'W',
	'Cannot transfer to billing customer per sales.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0069' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0069',
	'en_US',
	'W',
	'Billing details of transfer source are updated. \nSearch again.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0070' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0070',
	'en_US',
	'W',
	'Details to be transferred have been reconciled. Cannot transfer the reconciled details.\nTransaction cd.: {1}\nResult No.: {2}\nRev. number: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0071' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0071',
	'en_US',
	'W',
	'The specified payment received method is not entered in the Settlement Method master.\nPayment received entry type: {1}\nPayer cd.: {2}\nAR settlement type: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0072' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0072',
	'en_US',
	'W',
	'Cannot process since data corresponding to the AR settlement type "6: Withholding tax" is not entered in the Settlement Method master.\nEnter the data in the Settlement Method master.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0073' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0073',
	'en_US',
	'W',
	'Cannot create payment receipt schedule information. Check the setting of the Payment Receipt Schedule Control master.\nBilling customer cd.: {1}\nBilling dept. cd.: {2}\nCurrency cd.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0074' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0074',
	'en_US',
	'W',
	'Closing process cannot be performed on the specified billing month / closing date.\nBilling customer cd.: {1}\nBilling dept cd.: {2}\nTransaction currency cd.: {3}\nInvoice No.: {4}\nSales project No.: {5}\nBilling closing day: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0075' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0075',
	'en_US',
	'W',
	'Cannot process billing closing since there are billing details of temporary unit price.\nCheck/change temporary unit price information in the Correction of Sales Details Entry.\nBilling customer cd.: {1}\nBilling dept cd.: {2}\nTransaction currency cd.: {3}\nInvoice No.: {4}\nSales project No.: {5}\nBilling closing day: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0076' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0076',
	'en_US',
	'I',
	'Starting the billing closing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0077' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0077',
	'en_US',
	'I',
	'Billing closing process has been completed.\nTo process: {1}\nNumber of entries: {2}\nNumber of errors: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0078' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0078',
	'en_US',
	'W',
	'Cannot cancel closing for the specified billing.\nCancel closing from the billing with the latest billing closing day.\nBilling customer cd.: {1}\nBilling closing day: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0079' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0079',
	'en_US',
	'W',
	'Billing customer is invalid. Cannot cancel closing.\nBilling customer cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0080' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0080',
	'en_US',
	'W',
	'Details to be billed are not selected for the billing customer in the Billing by Select Manual.\nBilling customer: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0081' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0081',
	'en_US',
	'W',
	'Cannot acquire transaction corresponding to the Transaction pattern type. See the Transaction master.\nTransaction pattern type: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0082' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0082',
	'en_US',
	'W',
	'Cannot process since the specified payment received result has been canceled.\nPayment received result No.: {1}\nRev. number: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0083' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0083',
	'en_US',
	'W',
	'Cannot reconcile multiple payment received results.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0084' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0084',
	'en_US',
	'W',
	'Cannot process since month is not specified.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0085' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0085',
	'en_US',
	'W',
	'The specified transaction is invalid or canceled.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0086' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0086',
	'en_US',
	'W',
	'Cannot process the specified transaction on this screen.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0087' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0087',
	'en_US',
	'W',
	'Transaction for the specified payment received result cannot be processed on this screen.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0088' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0088',
	'en_US',
	'W',
	'A combination of the specified payment received info. and the Transaction pattern type is invalid.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0090' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0090',
	'en_US',
	'W',
	'Cannot process since the note drawing date of the specified payment received info. is after the next day.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0091' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0091',
	'en_US',
	'W',
	'Cannot process the specified payment received info. since unreconciled balance is 0.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0092' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0092',
	'en_US',
	'W',
	'If payment received is referred, the total amount of payment received cannot be set to 0.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0093' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0093',
	'en_US',
	'W',
	'If payment received is referred, the total amount of offset cannot be set to 0.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0094' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0094',
	'en_US',
	'W',
	'There are no details to be reconciled.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0095' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0095',
	'en_US',
	'W',
	'The total amount of AR details reconciliation does not match the AR reconciliation amount.\nAR details reconciliation amount total: {1}\nAR reconciliation amount: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0096' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0096',
	'en_US',
	'W',
	'Unreconciled balance cannot be set to negative.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0097' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0097',
	'en_US',
	'W',
	'Unreconciled balance cannot be larger than offset amount.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0098' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0098',
	'en_US',
	'W',
	'The total of offset amount cannot be set to negative.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0099' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0099',
	'en_US',
	'W',
	'Unreconciled balance cannot be set to positive.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0100' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0100',
	'en_US',
	'W',
	'Offset amount cannot be larger than unreconciled balance.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0101' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0101',
	'en_US',
	'W',
	'The total of offset amount cannot be set to positive.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0102' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0102',
	'en_US',
	'W',
	'Unreconciled balance cannot be saved.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0103' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0103',
	'en_US',
	'W',
	'Unreconciled balance cannot be larger than payment received amount.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0104' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0104',
	'en_US',
	'W',
	'The total of payment received amount cannot be set to negative.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0105' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0105',
	'en_US',
	'W',
	'Could not process the following payer since an error occurred in the auto-reconciliation processing.\nPayer cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0106' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0106',
	'en_US',
	'I',
	'Starting the auto-reconciliation process.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0107' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0107',
	'en_US',
	'I',
	'Auto-reconciliation process completed.\nNumber of processed target: {1}\nNumber of completed records (amount matched): {2}\nNumber of completed records (including fee): {3}\nNumber of completed records (excess payment received): {4}\nNumber of completed records (insufficient payment received amount): {5}\nNumber of records cannot be processed by auto-reconciliation: {6}\nNumber of errors: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0108' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0108',
	'en_US',
	'W',
	'If the Sales project process type is not selected, you cannot select multiple sales projects as transfer source.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0109' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0109',
	'en_US',
	'W',
	'Cannot transfer to an recording month different from recording month of transfer source.\nRecording month of transfer source: {1}\nRecording month of transfer destination: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0110' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0110',
	'en_US',
	'I',
	'Starting settlement of notes receivable.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0111' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0111',
	'en_US',
	'I',
	'Settlement of notes receivable has been completed.\nTo process: {1}\nNumber of entries: {2}\nNumber of errors: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0112' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0112',
	'en_US',
	'W',
	'Cannot acquire details of the specified payment received result.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0113' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0113',
	'en_US',
	'W',
	'Billing closing has been canceled. Search again.\nInvoice No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0114' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0114',
	'en_US',
	'I',
	'Did not print since there was no previous billing amount and no invoice details to be output.\nInvoice No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0115' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0115',
	'en_US',
	'I',
	'Starting the credit amount correction processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0116' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0116',
	'en_US',
	'I',
	'The Credit amount correction processing completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0117' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0117',
	'en_US',
	'W',
	'The specified payment received method is not entered in the Settlement Method master, or the AR settlement type is entered as Note.\nPayment received entry type: {1}\nPayer cd.: {2}\nAR settlement type: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0118' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0118',
	'en_US',
	'W',
	'Could not reconcile all the AR details payment amounts during the auto AR details reconciliation processing.\nManually reconcile the balance of AR details payment amount on the AR Details Reconciliation Entry screen.\nPayment received result details No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0119' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0119',
	'en_US',
	'W',
	'A billing customer whose Invoice issue type is set to "3: Payment receipt schedule adjusted" cannot issue an invoice until the payment receipt schedule is adjusted.\nInvoice No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0120' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0120',
	'en_US',
	'W',
	'The dept. of the copy source is invalid on the specified recording date.\nSelect an offset method that is not for journal, or review the recording date.\nPayment received result No. of copy source : {1}\nDept. cd. of copy source: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0121' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0121',
	'en_US',
	'W',
	'The dept. of the copy source is invalid on the specified recording date.\nEnter after transferring the dept. of payment received result of the copy source, or review the recording date.\nPayment received result No. of copy source: {1}\nDept. cd. of copy source: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0122' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0122',
	'en_US',
	'W',
	'Not entered as a valid AR dept. for the specified date. \nAR dept.: {1}\nDate: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0123' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0123',
	'en_US',
	'W',
	'Set the Payment Receipt Schedule Control master for each billing customer if billing closing dates 2 to 5 in the BP master are specified.\nOr check the settings of account receivable turnover period or scheduled payment receipt date.\nBilling customer cd.: {1}\nWG cd.: {2}\nTransaction currency cd.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0124' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0124',
	'en_US',
	'W',
	'Cannot update/cancel since the payment received info. corresponding to the payment result has already been processed.\nPayment received No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0125' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0125',
	'en_US',
	'W',
	'Specify a settlement method whose AR settlement method is turned on, the AR settlement type is set to "4. Offset (Debit)", and the AR/AP BP identification type is set to "1: Scheduled payee" in the Settlement Method master.\nSettlement method cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0126' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0126',
	'en_US',
	'W',
	'Cannot cancel closing since the unbilled balance transfer has been performed for the carried-over billing details corresponding to the partial billing which is included in the specified billing.\nInvoice No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0127' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0127',
	'en_US',
	'W',
	'Cannot cancel closing since the AP details reconciliation has been performed for the carried-over billing details corresponding to the partial billing which is included in the specified billing.\nInvoice No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0128' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0128',
	'en_US',
	'W',
	'Cannot process billing closing since one or more invalid items are included in the billing details.\nBilling customer cd.: {1}\nBilling dept. cd.: {2}\nTransaction currency cd.: {3}\nInvoice No.: {4}\nSales project No.: {5}\nBilling closing day: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0129' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0129',
	'en_US',
	'W',
	'Cannot cancel closing since one or more invalid items are included in the billing details.\nInvoice No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0130' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0130',
	'en_US',
	'W',
	'It is not entered as a valid AR customer, in BP master.\nAR customer cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0131' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0131',
	'en_US',
	'W',
	'It is not entered as a valid billing customer, in BP master.\nBilling customer cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0132' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0132',
	'en_US',
	'W',
	'The combination of selected billing details is invalid.\nSelect all the billing details that have been reconciled with AR details based on the payment received result details below, or cancel the AR details reconciliation and then perform the billing closing process.\nBilling customer cd.: {1}\nBilling dept. cd.: {2}\nTransaction currency cd.: {3}\nInvoice No.: {4}\nSales project No.: {5}\nBilling closing day: {6}\nPayment received result details No.: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0133' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0133',
	'en_US',
	'W',
	'The billing dept. is invalid. Check the following:\n- The Dept. master corresponding to the specified dept. and application date must be set\n- The AR dept. in the Dept. master must be turned on \n- The specified dept. must be set as a billing dept. for the billing customer in the BP master\nApplication date: {1}\nBilling customer cd.: {2}\nBilling dept. cd.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0300' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0300',
	'en_US',
	'W',
	'To set the base currency as the transaction currency, you cannot specify a numeric value other than 1 for the exchange rate.\nExchange rate: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0301' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0301',
	'en_US',
	'W',
	'Cannot use the payment received method whose AR settlement type is set to other than "Cash", "Payment", or "Notes" in the Settlement Method master.\nPayment received method: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0302' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0302',
	'en_US',
	'W',
	'Cannot specify a bank account or a payment person name if the AR settlement type is "Cash" or "Notes".');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0303' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0303',
	'en_US',
	'W',
	'Specify bank account if the AR settlement type is "Payment".');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0304' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0304',
	'en_US',
	'W',
	'If the AR settlement type is other than "Notes", you cannot specify note related columns (note number, the Note type, drawing date, payment due date, drawer name, endorser, acceptor, the Note reason cd., drawing bank, drawing branch, spare 1, spare 2, and spare 3).');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0305' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0305',
	'en_US',
	'W',
	'Specify an acceptor if the AR settlement type is ”Notes” and the Note type is "Notes of exchange".');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0501' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0501',
	'en_US',
	'W',
	'Cannot process billing closing since there are only advance received. \nTo include advance received in the billing closing, include the billing details of sales or payment received and execute.  \nBilling customer cd.: {1} \nBilling dept. cd.: {2} \nTransaction currency cd.: {3}\nInvoice No.: {4}  \nSales project No.: {5}   \nBilling closing day: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0601' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0601',
	'en_US',
	'W',
	'The specified IF process type is not subject to the processing.\nIF process type: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0602' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0602',
	'en_US',
	'I',
	'Starting the processing. (Execute the billing IF export service)');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0603' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0603',
	'en_US',
	'I',
	'The export processing completed.\nProcessed: {1}\nNumber of transmissions: {2}\nNumber of errors: {3}\nNumber of skips: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0604' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0604',
	'en_US',
	'I',
	'The processing completed. (Execute the billing IF export service)');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0605' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBGL0605',
	'en_US',
	'W',
	'Could not acquire the path to the storage location. Enter a record "without specifying a BP" in the Report Storage Location master.\nBusiness type: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHP0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHP0001',
	'en_US',
	'I',
	'Payment schedule details will be set. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHP0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHP0002',
	'en_US',
	'I',
	'Tax variance will be acquired. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHP0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHP0003',
	'en_US',
	'I',
	'A value different from AP supplier has been entered in the offset destination. Continue?\nOffset destination: {1}\nAP supplier: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHP0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHP0004',
	'en_US',
	'I',
	'Balance to be offset is negative. Continue?\nBalance to be offset: {1}\nAP offset destination type: {2}\nOffset destination: {3}\nOffset dept.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHP0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHP0005',
	'en_US',
	'I',
	'Current chargeable supply amount will be acquired. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHP0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHP0006',
	'en_US',
	'I',
	'Note sight exceeds the note sight upper limit. Continue?\nPayee: {1}\nDrawing date: {2}\nPayment due date: {3}\nNote sight: {4}\nNote sight upper limit: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHP0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHP0007',
	'en_US',
	'W',
	'Cannot correct since the payment schedule has already been entered.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHP0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHP0008',
	'en_US',
	'W',
	'Cannot cancel since the payment schedule has already been entered.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHP0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHP0009',
	'en_US',
	'W',
	'For payment per transaction, AP details with different values in the following columns cannot be consolidated: Scheduled payee, Currency, Sales project No., Purchase result No., Purchase invoice management No.\nIf it is not for payment per transaction, AP details with different values in the following columns cannot be consolidated: Scheduled payee, Currency, Sales project No.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHP0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHP0010',
	'en_US',
	'W',
	'The same values for the following columns are set in transfer source and transfer destination: Dept. in charge of scheduled payee, AP supplier, AP dept., and Sales project. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHP0151' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHP0151',
	'en_US',
	'I',
	'Payment result will be set. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHP0152' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHP0152',
	'en_US',
	'I',
	'Advance payment result will be set. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0001',
	'en_US',
	'W',
	'Could not acquire a dept. in charge of scheduled payee based on the scheduled payee and base date.\nScheduled payee cd.: {1}\nBase date: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0002',
	'en_US',
	'W',
	'Could not calculate the scheduled payee closing year, month, and date.\nScheduled payee cd.: {1}\nPayment base date: {2}\nPayment carry-over count: {3}\n{4}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0003',
	'en_US',
	'W',
	'Cannot enter/correct/cancel anything other than the latest payment schedule.\nSee whether the payment schedule is entered based on the closing year and month after that of the payment schedule to be entered/corrected/canceled.\nScheduled payee cd.: {1}\nCd. of dept. in charge of scheduled payee: {2}\nTransaction currency cd.: {3}\nSales project No.: {4}\nClosing year and month: {5}\nPayment collation No.: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0004',
	'en_US',
	'W',
	'Cannot enter since AP details with temporary unit price are included.\nPurchase result details No.: {1}\nAP details No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0005',
	'en_US',
	'W',
	'Cannot enter/correct/cancel anything other than the latest payment schedule.\nSee whether the payment schedule is entered based on the closing year and month after that of the payment schedule to be entered/corrected/canceled.\nScheduled payee cd.: {1}\nCd. of dept. in charge of scheduled payee (Before correction): {2}\nTransaction currency cd.: {3}\nSales project No.: {4}\nClosing year and month (Before correction): {5}\nPayment collation No.: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0006',
	'en_US',
	'W',
	'The total amount of withholding taxes of AP details does not match the total payment schedule amount whose AP settlement type is set to "Withholding tax".\nScheduled payee cd.: {1}\nTotal amounts of AP details: {2}\nTotal amounts of payment schedule: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0007',
	'en_US',
	'W',
	'To record a payment result simultaneously at the time of payment schedule entry, specify the date prior to operation date in the scheduled payment date.\nThe same date as the scheduled payment date will be set to recording date of payment results.\nScheduled payment date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0008',
	'en_US',
	'W',
	'The result of recalculated tax variance did not match the specified tax variance. Click the Acquire tax variance button to enter again.\nScheduled payee cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0009',
	'en_US',
	'W',
	'An error has occurred in other details consolidated to the same header.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0010',
	'en_US',
	'W',
	'Cannot enter since it contains collated AP details.\nScheduled payee cd.: {1}\nAP details No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0011',
	'en_US',
	'W',
	'Cannot cancel since approval status is preliminary approval or final approval.\nPayment collation No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0012',
	'en_US',
	'W',
	'Could not enter since an error has occurred in the payment schedule which was previously processed for the same scheduled payee.\nScheduled payee cd.: {1}\nClosing date: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0013',
	'en_US',
	'W',
	'Cannot cancel since there is a payment schedule whose Payment status type is Partial payment or Paid. Payment collation No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0014',
	'en_US',
	'W',
	'Cannot cancel since carried-over AP details are collated.\nPayment collation No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0015',
	'en_US',
	'W',
	'The sum of an amount and tax is 0.\nAP details No.: {1}\nPayment method type: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0016',
	'en_US',
	'W',
	'Cannot enter payment schedule since the amounts of AP details for each AP supplier, AP dept. and the AP type do not correspond to the amount of payment schedule.\nAP supplier cd.: {1}\nAP dept. cd.: {2}\nAP type: {3}\nTotal amounts of AP details: {4}\nTotal amounts of payment schedule: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0017',
	'en_US',
	'W',
	'Specify an amount greater than 0 to offset with the advance payment amount.\nAdvance payment amount payment result No.: {1}\nAmount: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0018',
	'en_US',
	'W',
	'Cannot enter only a row of fee.\nScheduled payee cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0019',
	'en_US',
	'I',
	'Starting the payment schedule entry processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0020',
	'en_US',
	'I',
	'The payment schedule entry processing completed.\nProcessed: {1}\nNumber of entries: {2}\nNumber of errors: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0021',
	'en_US',
	'W',
	'AP details info. whose Scheduled payee closing year, month, and date is not set is excluded.\nEnter it on the Payment Schedule Entry screen.\nScheduled payee: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0022',
	'en_US',
	'W',
	'Could not acquire the Payment Schedule Control master. Set the Payment Schedule Control master.\nScheduled payee: {1}\nWG: {2}\nTransaction currency: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0023',
	'en_US',
	'W',
	'Could not enter the payment schedule since an error has occurred during processing to automatically create the payment schedule for payment per transaction.\nEnter the payment schedule manually.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0024',
	'en_US',
	'W',
	'Could not process since the Tax cd. whose Tax inclusive is turned on at the same tax rate as purchase tax in the Company master does not exist in the Tax master.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0025',
	'en_US',
	'W',
	'Cannot process since data corresponding to the AP settlement type "7: Withholding tax" is not entered in the Settlement Method master.\nSet the Settlement Method master.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0026',
	'en_US',
	'W',
	'Could not acquire the BP master corresponding to the scheduled payee. Set the BP master.\nScheduled payee: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0027' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0027',
	'en_US',
	'W',
	'Set a value which is larger than 0 and smaller than the original amount.\nOriginal amount: {1}\nEntered amount: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0028' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0028',
	'en_US',
	'W',
	'Set a value which is smaller than 0 and larger than the original amount.\nOriginal amount: {1}\nEntered amount: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0029' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0029',
	'en_US',
	'W',
	'Set a value which is larger than or equal to 0 and smaller than the original tax amount.\nOriginal tax amount: {1}\nEntered tax amount: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0030' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0030',
	'en_US',
	'W',
	'Set a value which is smaller than or equal to 0 and larger than the original tax amount.\nOriginal tax amount: {1}\nEntered tax amount: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0031' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0031',
	'en_US',
	'W',
	'Cannot issue a payment schedule table for payment schedules to be approved until it is approved.\nPayment schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0032' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0032',
	'en_US',
	'W',
	'Cannot issue payment schedule details for payment schedules to be approved until it is approved.\nPayment collation No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0033' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0033',
	'en_US',
	'W',
	'Could not acquire the scheduled payment date. Set the Payment Schedule Control master.\nScheduled payee cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0034' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0034',
	'en_US',
	'W',
	'Could not acquire the payment dept. Set it to the BP master.\nPayee cd.: {1}\nBase date: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0035' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0035',
	'en_US',
	'W',
	'Cannot enter payment result since payment schedule has not been approved.\nPayment collation No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0036' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0036',
	'en_US',
	'W',
	'Cannot enter since the note sight exceeds the note sight upper limit.\nPayee: {1}\nDrawing date: {2}\nPayment due date: {3}\nNote sight: {4}\nNote sight upper limit: {5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0037' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0037',
	'en_US',
	'W',
	'At least one payment result corresponding to the payment schedule should be included.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0038' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0038',
	'en_US',
	'W',
	'Cannot delete all rows to correct the payment result. Cancel the payment result.\nPayment result No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0039' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0039',
	'en_US',
	'W',
	'Cannot correct purchase result that affects exchange gain/loss since the payment result has been entered. Correct after canceling the payment result.\nPurchase result No.: {1}\nPurchase invoice management No.: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0040' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0040',
	'en_US',
	'W',
	'Cannot correct advance payment result since payment schedule has been entered.\nAdvance payment result No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0041' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0041',
	'en_US',
	'W',
	'Cannot cancel advance payment result since payment schedule has been entered.\nAdvance payment result No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0042' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0042',
	'en_US',
	'W',
	'To offset with advance payment amount, specify the same dept. as the advance payment charged dept. for offset dept. and AP dept.\nOffset dept.: {1}\nAP dept. {2}\nAdvance payment charged dept.: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0043' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0043',
	'en_US',
	'W',
	'Cannot enter payment schedule since the specified advance payment result does not exist.\nAdvance payment result No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0044' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0044',
	'en_US',
	'W',
	'Cannot enter payment result since total payment amount for AP reconciliation schedule exceeds the payment schedule amount.\nAP reconciliation schedule No.: {1}\nTotal payment amount for AP reconciliation schedule: {2}\nPayment schedule amount: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0045' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0045',
	'en_US',
	'W',
	'Cannot enter the payment schedule since the scheduled advance payment offset amount exceeds the advance payment amount.\nScheduled advance payment offset amount: {1}\nAdvance payment amount: {2}\nAdvance payment amount payment result No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0046' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0046',
	'en_US',
	'I',
	'Starting the payment result recording.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0047' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0047',
	'en_US',
	'I',
	'The payment result recording completed.\nProcessed {1}\nNumber of entries: {2}\nNumber of errors: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0048' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0048',
	'en_US',
	'W',
	'Cannot enter the payment schedule since only AP details for tax difference at payment schedule are set.\nScheduled payee cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0049' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0049',
	'en_US',
	'W',
	'Cannot enter payment schedule since there are no AP details corresponding to AP supplier, AP dept. and AP type which are specified in the payment schedule.\nAP supplier cd.: {1}\nAP dept. cd.: {2}\nAP type: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0050' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0050',
	'en_US',
	'W',
	'Cannot enter the AP details for tax difference at payment schedule since the billing closing has already been performed.\nRecording date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0051' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0051',
	'en_US',
	'W',
	'The value specified for the offset destination does not exist in the BP master.\nOffset destination cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0052' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0052',
	'en_US',
	'W',
	'Cannot update data for approval since the next process (entry of payment results) has already been performed for the payment collation.\nPayment collation No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0053' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0053',
	'en_US',
	'W',
	'Excluded from the process since an error has occurred in the previously processed payment schedule.\nScheduled payee cd.: {1}\nCd. of dept. in charge of scheduled payee: {2}\nPurchase result No.: {3}\nPurchase invoice management No.: {4}\nPurchase invoice No.: {5}\nTransaction currency cd.: {6}\nSales project No.: {7}\nClosing year and month: {8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0054' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0054',
	'en_US',
	'W',
	'Cannot enter payment schedule since there are no AP details corresponding to AP supplier, AP dept. and the AP type which are specified in the payment schedule.\nAP supplier cd.: {1}\nAP dept. cd.: {2}\nAP type: {3}\nTotal amounts of payment schedule: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0055' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0055',
	'en_US',
	'W',
	'Specify a number smaller than 0.\nColumn name: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0101' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0101',
	'en_US',
	'W',
	'Could not acquire a sales project.\nSales project No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0102' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0102',
	'en_US',
	'W',
	'Cannot transfer fees.\nPayment schedule No.: {1}\nAP settlement method cd.: {2}\nAP settlement type: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0103' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0103',
	'en_US',
	'W',
	'Cannot transfer a withholding tax.\nPayment schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0104' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0104',
	'en_US',
	'W',
	'Cannot transfer a paid payment schedule.\nPayment schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0105' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0105',
	'en_US',
	'W',
	'Cannot transfer a payment schedule to be approved until it is approved.\nPayment schedule No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0106' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0106',
	'en_US',
	'W',
	'Cannot transfer invalid AP details.\nAP details No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0107' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0107',
	'en_US',
	'W',
	'AP dept. of transfer source is invalid on the specified recording date.\nSelect AP settlement method that is not for journal, or review the recording date.\nPayment schedule No.: {1}\nAP details No.: {2}\nAP dept. cd. : {3}\nRecording date: {4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0108' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0108',
	'en_US',
	'W',
	'Specified AP settlement method cd. is invalid.\nSpecify the AP settlement method cd. corresponding to the following AP settlement type.\nAP settlement method cd.: {1}\nAP settlement type: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0109' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0109',
	'en_US',
	'W',
	'Cannot process since data corresponding to the following AP settlement type is not entered in the Settlement Method master. \nEnter the data in the Settlement Method master.\nAP settlement type: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0110' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0110',
	'en_US',
	'W',
	'Cannot enter payment schedule since the payment schedule corresponding to AP details for each AP supplier, AP dept and AP type is not set. Click the Payment schedule setting button to enter again.\nAP supplier cd.: {1}\nAP dept. cd.: {2}\nAP type: {3}\nTotal amounts of AP details: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0111' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0111',
	'en_US',
	'W',
	'Cannot correct or cancel since carried-over AP details have been transferred.\nPayment collation No.: {1}\nAP details No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0201' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0201',
	'en_US',
	'W',
	'Set a value which is larger than 0 and smaller than the original subcontracting amount.\nOriginal subcontracting amount: {1}\nEntered subcontracting amount: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0202' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0202',
	'en_US',
	'W',
	'Set a value which is smaller than 0 and larger than the original subcontracting amount.\nOriginal subcontracting amount: {1}\nEntered subcontracting amount: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0203' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0203',
	'en_US',
	'W',
	'Set a value which is larger than 0 and smaller than the original chargeable supply amount.\nOriginal chargeable supply amount: {1}\nEntered chargeable supply amount: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0204' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0204',
	'en_US',
	'W',
	'Set a value which is smaller than 0 and larger than the original chargeable supply amount.\nOriginal chargeable supply amount: {1}\nEntered chargeable supply amount: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0205' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0205',
	'en_US',
	'W',
	'The total amount of the subcontracting amount and the chargeable supply amount is different from the amount.\nTotal amount of subcontracting amount and chargeable supply amount: {1}\nAmount: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0251' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0251',
	'en_US',
	'W',
	'Cannot enter the advance payment result since it is linked to another payment conciliation header. \nAdvance payment result No.: {1} \n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0252' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0252',
	'en_US',
	'W',
	'Cannot process payment collation since there are only advance payment. \nTo include advance payment in the payment collation, include the details of payment schedule or payment result and execute.  \nScheduled payee cd.: {1} \nScheduled payee dept. cd.: {2} \nTransaction currency cd.: {3}\nPurchase invoice No.: {4}\nPurchase result No.: {5}\nSales project No.: {6}   \nScheduled payee closing year and month: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0253' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0253',
	'en_US',
	'W',
	'Cannot issue a payment notice for a payment schedule subject to approval until the payment schedule is approved.\nPayment collation No.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0254' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBHL0254',
	'en_US',
	'W',
	'Cannot issue a payment notice since the Payment notice to be issued for the scheduled payee is turned off.\nPayment collation No.: {1}\nScheduled payee cd.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIP0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIP0001',
	'en_US',
	'W',
	'To release temporary closing of AR customers, delete at least one row of AR customers to be temporarily released.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIP0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIP0002',
	'en_US',
	'W',
	'To release temporary closing of AP suppliers, delete at least one row of AP suppliers to be temporarily released.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0001',
	'en_US',
	'W',
	'Sales closing or payment received closing for the previous month has not been completed.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0002',
	'en_US',
	'W',
	'Purchase closing or payment closing of the previous month has not been completed.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0003',
	'en_US',
	'W',
	'Sales closing of the previous month has not been completed.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0004',
	'en_US',
	'W',
	'Payment received closing of the previous month has not been completed.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0005',
	'en_US',
	'W',
	'Purchase closing of the previous month has not been completed.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0006',
	'en_US',
	'W',
	'Payment closing of the previous month has not been completed.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0007',
	'en_US',
	'W',
	'Sales closing or payment received closing for the current month has already been conducted.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0008',
	'en_US',
	'W',
	'Purchase closing or payment closing for the current month has already been conducted.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0009',
	'en_US',
	'W',
	'Sales closing of the current month has already been conducted.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0010',
	'en_US',
	'W',
	'Payment received closing of the current month has already been conducted.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0011',
	'en_US',
	'W',
	'Purchase closing of the current month has already been conducted.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0012',
	'en_US',
	'W',
	'Payment closing of the current month has already been conducted.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0013',
	'en_US',
	'W',
	'Cannot cancel AR temporary closing since AR temporary closing for the next month has already been conducted.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0014',
	'en_US',
	'W',
	'Cannot cancel AP temporary closing since AP temporary closing for the next month has already been conducted.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0015',
	'en_US',
	'W',
	'Sales closing for the next month has already been conducted.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0016',
	'en_US',
	'W',
	'Payment received closing for the next month has already been conducted.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0017',
	'en_US',
	'W',
	'Purchase closing of the next month has already been conducted.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0018',
	'en_US',
	'W',
	'Payment closing for the next month has already been conducted.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0019',
	'en_US',
	'W',
	'There is no target to release the AR temporary closing.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0020',
	'en_US',
	'W',
	'There is no target to release the AP temporary closing.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0021',
	'en_US',
	'W',
	'AR temporary closing is not conducted.\nMonth to process: {1}\nAR customer: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0022',
	'en_US',
	'W',
	'AP temporary closing is not conducted.\nMonth to process: {1}\nAP supplier: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0023',
	'en_US',
	'W',
	'Sales closing for the current month has not been conducted.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0024',
	'en_US',
	'W',
	'Payment received closing for the current month has not been conducted.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0025',
	'en_US',
	'W',
	'Purchase closing for the current month has not been conducted.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0026',
	'en_US',
	'W',
	'Payment closing for the current month has not been conducted.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0027' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0027',
	'en_US',
	'W',
	'Cannot process the sales closing since there are sales result details with temporary unit price.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0028' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0028',
	'en_US',
	'I',
	'There was unprocessed payment received in the closing month.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0029' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0029',
	'en_US',
	'W',
	'Cannot process the purchase closing since there are purchase result details with temporary unit price.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0030' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0030',
	'en_US',
	'W',
	'Cannot process the payment closing since there is unprocessed payment received (AP amount offset).');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0031' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0031',
	'en_US',
	'W',
	'Inventory closing of the previous month has not been completed.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0032' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0032',
	'en_US',
	'W',
	'Inventory closing of the current month has already been conducted.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0033' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0033',
	'en_US',
	'W',
	'Inventory closing of the next month has already been conducted.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0034' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0034',
	'en_US',
	'W',
	'Inventory closing of the current month has not been conducted.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0035' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0035',
	'en_US',
	'W',
	'AR temporary closing of the current month has already been conducted.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0036' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0036',
	'en_US',
	'W',
	'AR temporary closing of the current month has already been conducted.\nMonth to process: {1}\nAR customer: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0037' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0037',
	'en_US',
	'W',
	'AP temporary closing of the current month has already been conducted.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0038' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0038',
	'en_US',
	'W',
	'AP temporary closing of the current month has already been conducted.\nMonth to process: {1}\nAP supplier: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0039' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0039',
	'en_US',
	'W',
	'Cannot enter since GR/GI restriction has been set on the recording date before correction.\nLocation: {1}\nItem: {2}\nRecording date: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0040' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0040',
	'en_US',
	'W',
	'Cannot enter due to GR/GI restrictions.\nLocation: {1}\nItem: {2}\nRecording date: {3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0041' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0041',
	'en_US',
	'W',
	'Cannot enter since sales closing has already been conducted.\nRecording date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0042' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0042',
	'en_US',
	'W',
	'Cannot enter since AR temporary closing has already been conducted.\nRecording date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0043' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0043',
	'en_US',
	'W',
	'Cannot enter since AR temporary closing has already been conducted.\nRecording date: {1}\nAR customer: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0044' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0044',
	'en_US',
	'W',
	'Cannot enter since payment received closing has already been conducted.\nRecording date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0045' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0045',
	'en_US',
	'W',
	'Cannot enter since purchase closing has already been conducted.\nRecording date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0046' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0046',
	'en_US',
	'W',
	'Cannot enter since AP temporary closing has already been conducted.\nRecording date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0047' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0047',
	'en_US',
	'W',
	'Cannot enter since AP temporary closing has already been conducted.\nRecording date: {1}\nAP supplier: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0048' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0048',
	'en_US',
	'W',
	'Cannot enter since payment closing has already been conducted.\nRecording date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0049' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0049',
	'en_US',
	'W',
	'Cannot enter since inventory closing has already been conducted.\nRecording date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0050' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0050',
	'en_US',
	'W',
	'Cannot conduct inventory closing since there is a location under inventory counting.\nInventory closing day: {1}\nControl target date: {2} \nLocation: {3}\nItem: {4}\nInventory count classification type: {5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0051' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0051',
	'en_US',
	'W',
	'An error has occurred during monthly closing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0052' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0052',
	'en_US',
	'I',
	'Starting the monthly closing processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0053' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0053',
	'en_US',
	'I',
	'The monthly closing processing completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0054' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0054',
	'en_US',
	'W',
	'Cannot correct since sales closing has been completed on the recording date before correction.\nRecording date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0055' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0055',
	'en_US',
	'W',
	'Cannot correct since payment received closing has been completed on the recording date before correction.\nRecording date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0056' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0056',
	'en_US',
	'W',
	'Cannot correct since purchase closing has been completed on the recording date before correction.\nRecording date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0057' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0057',
	'en_US',
	'W',
	'Cannot correct since payment closing has been completed on the recording date before correction.\nRecording date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0058' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0058',
	'en_US',
	'W',
	'Cannot correct since inventory closing has been completed on the recording date before correction.\nRecording date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0059' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0059',
	'en_US',
	'W',
	'Cannot cancel sales closing since AR temporary closing of the next month has already been conducted.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0060' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0060',
	'en_US',
	'W',
	'Cannot cancel payment received closing since AR temporary closing of the next month has already been conducted.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0061' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0061',
	'en_US',
	'W',
	'Cannot cancel purchase closing since AP temporary closing of the next month has already been conducted.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0062' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0062',
	'en_US',
	'W',
	'Cannot cancel payment closing since AP temporary closing of the next month has already been conducted.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0063' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0063',
	'en_US',
	'W',
	'Cannot enter since AR temporary closing has been completed on the recording date before correction.\nRecording date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0064' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0064',
	'en_US',
	'W',
	'Cannot enter since AR temporary closing has been completed on the recording date before correction.\nRecording date: {1}\nAR customer: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0065' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0065',
	'en_US',
	'W',
	'Cannot enter since AP temporary closing has been completed on the recording date before correction.\nRecording date: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0066' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0066',
	'en_US',
	'W',
	'Cannot enter since AP temporary closing has been completed on the recording date before correction.\nRecording date: {1}\nAP supplier: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0067' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0067',
	'en_US',
	'W',
	'Cannot enter since the ending inventory qty. is negative in the monthly GR/GI and inventory.\nYear month: {1}\nGR/GI type: {2}\nItem: {3}\nLocation cd.: {4}\nRack/Line cd.: {5}\nInventory arriving point cd.: {6}\nLot No.: {7}\nSublot No.: {8}\nSEIBAN No.: {9}\nFirm No. type: {10}\nFirm No.: {11}\nSKU cd.: {12}\nGrading cd.: {13}\nIn-transit type: {14}\nConforming type: {15}\nAsset type: {16}\nInventory inspection type: {17}\nInventory identification type: {18}\nInventory BP cd.: {19}\nSKU qty.: {20}\nBase unit qty.: {21}\n{22}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0068' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0068',
	'en_US',
	'W',
	'Cannot enter due to GR/GI restrictions.\nLocation: {1}\nRecording date: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0069' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0069',
	'en_US',
	'W',
	'Cannot enter since GR/GI restriction has been set on the recording date before correction.\nLocation: {1}\nRecording date: {2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0070' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0070',
	'en_US',
	'W',
	'Cannot conduct temporary closing since the sales closing or the payment received closing has been conducted on and after the specified month to process.\nMonth to process: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0071' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0071',
	'en_US',
	'W',
	'Cannot conduct temporary closing since the purchase closing has been conducted on and after the specified month to process.\nMonth to process: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0072' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0072',
	'en_US',
	'W',
	'Cannot cancel temporary closing since the sales closing or the payment received closing has been conducted on and after the specified month to process.\nMonth to process: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0073' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0073',
	'en_US',
	'W',
	'Cannot cancel temporary closing since the purchase closing has been conducted on and after the specified month to process.\nMonth to process: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0074' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0074',
	'en_US',
	'W',
	'Purchase closing of the current month has already been conducted.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0075' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSBIL0075',
	'en_US',
	'W',
	'Purchase closing of the current month has not been completed.\nMonth to process: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0001',
	'en_US',
	'I',
	'Starting the sales order IF import processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0002',
	'en_US',
	'I',
	'The sales order IF import processing completed.\nTo process: {1}\nNumber of entries: {2}\nNumber of errors: {3}\nNumber of skips: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0003',
	'en_US',
	'W',
	'Could not import since an error has occurred in the order which was previously processed for the same customer and customer order No.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0004',
	'en_US',
	'W',
	'Skipped since data with a large external system data No. was previously processed for the same customer and customer order No.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0005',
	'en_US',
	'W',
	'An error has occurred in the sale order IF import processing.\nData No.: {1}\nData row No.: {2}\nMessage ID: {3}\nMessage: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0006',
	'en_US',
	'W',
	'Could not import since an error has occurred while importing other order with the same customer and customer order No.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0007',
	'en_US',
	'W',
	'Cannot import since the same customer order details No. exists.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}\nCustomer order details No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0008',
	'en_US',
	'W',
	'Could not acquire sales department. Import by specifying the Sales dept. cd., or enter the data in the Customer PIC master.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nApplication date: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0009',
	'en_US',
	'W',
	'Could not acquire sales dept. based on sales PIC. Specify sales dept. for the PIC Authority master.\nData No.: {1}\nData row No.: {2}\nSales PIC: {3}\nApplication date: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0010',
	'en_US',
	'W',
	'For miscellaneous items, the item name is required.\nData No.: {1}\nData row No.: {2}\nItem: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0011',
	'en_US',
	'W',
	'Could not acquire the default grading.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0012',
	'en_US',
	'W',
	'Number of decimal places in the qty. is incorrect.\nData No.: {1}\nData row No.: {2}\nQty.: {3}\nNumber of decimal places: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0013',
	'en_US',
	'W',
	'Could not determine the tax.\nData No.: {1}\nData row No.: {2}\nTax rate: {3}\nTax Type: {4}\nTax inclusive: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0014',
	'en_US',
	'W',
	'The tax corresponding to the tax rate in placing an order is different the tax calculated from the master.\nData No.: {1}\nData row No.: {2}\nTax corresponding to tax rate in placing an order: {3}\nTax calculated from the master: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0015',
	'en_US',
	'W',
	'Cannot change the header column of the sales order since subsequent work is ongoing.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0016',
	'en_US',
	'W',
	'Number of decimal places in the unit price is incorrect.\nData No.: {1}\nData row No.: {2}\nUnit price: {3}\nNumber of decimal places: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0017',
	'en_US',
	'W',
	'Unit price specified in placing an order is different from that of the master.\nData No.: {1}\nData row No.: {2}\nUnit price specified in placing an order: {3}\nUnit price of master: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0018',
	'en_US',
	'W',
	'Amount specified in placing an order is different from the amount calculated from the master.\nData No.: {1}\nData row No.: {2}\nAmount specified in placing an order: {3}\nAmount calculated from master: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0019',
	'en_US',
	'W',
	'Tax amount specified in placing an order is different from that calculated from the master.\nData No.: {1}\nData row No.: {2}\nTax amount specified in placing an order: {3}\nTax calculated from master: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0020',
	'en_US',
	'W',
	'Cannot import since the same custom order already exists.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}\nCustomer order details No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0021',
	'en_US',
	'W',
	'Cannot import since multiple data of corresponding sales order info. have been acquired.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0022',
	'en_US',
	'W',
	'Cannot import since corresponding sales order information cannot be acquired.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0023',
	'en_US',
	'I',
	'Starting the order promising IF import.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0024',
	'en_US',
	'I',
	'Order promising IF import has been completed.\nTo process: {1}\nNumber of entries: {2}\nNumber of errors: {3}\nNumber of skips: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0025',
	'en_US',
	'W',
	'Cannot import since an error has occurred in the data which was previously processed for the same PO details.\nData No.: {1}\nData row No.: {2}\nPO No.: {3}\nPO details No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0026',
	'en_US',
	'W',
	'Skipped since the data whose external system data No. is larger was previously processed for the same PO details.\nData No.: {1}\nData row No.: {2}\nPO No.: {3}\nPO details No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0027' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0027',
	'en_US',
	'W',
	'Delivery destination name is required in case of miscellaneous delivery destination.\nData No.: {1}\nData row No.: {2}\nDelivery destination: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0028' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0028',
	'en_US',
	'W',
	'Receiving point name is required in case of miscellaneous receiving point.\nData No.: {1}\nData row No.: {2}\nReceiving point: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0029' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0029',
	'en_US',
	'W',
	'Cannot update by changing transaction. Delete the existing data and import it as new data.\nData No.: {1}\nData row No.: {2}\nSales order No.: {3}\nSales order details No.: {4}\nTransaction before change: {5}\nTransaction after change: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0030' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0030',
	'en_US',
	'W',
	'Could not import since an error occurred while importing other order promising for the same PO No. and PO details No.\nData No.: {1}\nData row No.: {2}\nPO: {3}\nPO details No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0031' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0031',
	'en_US',
	'W',
	'An error has occurred in the order promising IF import processing.\nData No.: {1}\nData row No.: {2}\nPO No.: {3}\nPO details No.: {4}\nMessage ID: {5}\nMessage: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0032' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0032',
	'en_US',
	'W',
	'Cannot import the EDI shipping result since delivery order details are canceled.\nData No.: {1}\nData row No.: {2}\nPO No.: {3}\nPO details No.: {4}\nDelivery order details No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0033' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0033',
	'en_US',
	'W',
	'No specified PO exists.\nData No.: {1}\nData row No.: {2}\nPO No.: {3}\nPO rev. number: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0034' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0034',
	'en_US',
	'W',
	'No specified PO exists.\nData No.: {1}\nData row No.: {2}\nPO No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0035' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0035',
	'en_US',
	'W',
	'Supplier different from that in placing an order is specified.\nData No.: {1}\nData row No.: {2}\nPO No.: {3}\nSupplier in place an order: {4}\nSupplier of IF data: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0036' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0036',
	'en_US',
	'W',
	'Cannot import the order promising result since PO is canceled.\nData No.: {1}\nData row No.: {2}\nPO No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0037' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0037',
	'en_US',
	'W',
	'An item different from the one when the order was placed cannot be specified.\nData No.: {1}\nData row No.: {2}\nPO No.: {3}\nPO details No.: {4}\nItem in placing an order: {5}\nItem of IF data: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0038' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0038',
	'en_US',
	'W',
	'Number of decimal places in the replied qty. is incorrect.\nData No.: {1}\nData row No.: {2}\nPO No.: {3}\nPO details No.: {4}\nReplied qty.: {5}\nTransaction unit: {6}\nNumber of decimal places: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0039' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0039',
	'en_US',
	'W',
	'No specified delivery order details exists.\nData No.: {1}\nData row No.: {2}\nPO No.: {3}\nPO details No.: {4}\nDelivery order details No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0040' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0040',
	'en_US',
	'W',
	'Cannot import the order promising result since delivery order details are canceled.\nData No.: {1}\nData row No.: {2}\nPO No.: {3}\nPO details No.: {4}\nDelivery order details No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0041' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0041',
	'en_US',
	'W',
	'If the discount amount is set, the discount reason is required. Enter the reason for sales adjustment in the Business Reason master.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0042' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0042',
	'en_US',
	'W',
	'If an item for asset management and its unit price is 0, sales reason of sales other accounting is required.\nEnter sales reason of sales other accounting in the Business Reason master.\nData No.: {1}\nData row No.: {2}\nItem: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0043' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0043',
	'en_US',
	'W',
	'Could not import since an error occurred while importing the order promising result.\nData No.: {1}\nData row No.: {2}\nPO: {3}\nPO details No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0044' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0044',
	'en_US',
	'W',
	'No item unit master exists.\nData No.: {1}\nData row No.: {2}\nPO No.: {3}\nPO details No.: {4}\nItem: {5}\nUnit: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0045' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0045',
	'en_US',
	'W',
	'If a maker is specified, allocation location should be entered in the Sales Order Allocation master in order to specify a supplier.\nData No.: {1}\nData row No.: {2}\nMaker: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0046' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0046',
	'en_US',
	'W',
	'If the Procurement type is set to Purchase direct-delivery and the maker is specified, the direct delivery relay location should be set in order to specify a supplier.\nData No.: {1}\nData row No.: {2}\nMaker: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0047' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0047',
	'en_US',
	'W',
	'Could not acquire a supplier corresponding to the maker. Set the Item Details master.\nData No.: {1}\nData row No.: {2}\nMaker: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0048' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0048',
	'en_US',
	'I',
	'Starting the receipt result IF import processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0049' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0049',
	'en_US',
	'I',
	'The receipt result IF import processing completed.\nTo process: {1}\nNumber of entries: {2}\nNumber of errors: {3}\nNumber of skips: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0050' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0050',
	'en_US',
	'W',
	'Cannot import since an error has occurred in the receipt results which were previously processed for the same Receipt distribution group, External system cd., and External receipt result No.\nData No.: {1}\nData row No.: {2}\nReceipt distribution group: {3}\nExternal system cd.: {4}\nExternal receipt result No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0051' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0051',
	'en_US',
	'W',
	'Skipped since data whose External system data No. is larger is processed previously in the same Receipt distribution group, External system cd., and External receipt result No.\nData No.: {1}\nData row No.: {2}\nReceipt distribution group: {3}\nExternal system cd.: {4}\nExternal receipt result No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0052' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0052',
	'en_US',
	'W',
	'An error has occurred in the receipt result IF import processing.\nData No.: {1}\nData row No.: {2}\nMessage ID: {3}\nMessage:\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0053' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0053',
	'en_US',
	'W',
	'Could not import since an error occurred while importing the same receipt distribution group and other receipt result for the following No.\nData No.: {1}\nData row No.: {2}\nReceipt distribution group: {3}\nPurchase invoice No.: {4}\nPO No.: {5}\nSales return schedule No.: {6}\nInvoice No.: {7}\nDelivery note No.: {8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0054' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0054',
	'en_US',
	'W',
	'Cannot import since the corresponding receipt schedule info. cannot be acquired.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0055' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0055',
	'en_US',
	'W',
	'Cannot import since a receipt result is already entered for the receipt schedule.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal receipt result No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0056' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0056',
	'en_US',
	'W',
	'Cannot import since receipt result information is already entered.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal receipt result No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0057' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0057',
	'en_US',
	'W',
	'Cannot import since the corresponding receipt result info. cannot be acquired.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal receipt result No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0058' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0058',
	'en_US',
	'W',
	'Cannot import since the receipt distribution group is different from the receipt schedule.\nData No.: {1}\nData row No.: {2}\nReceipt distribution group: {3}\nReceipt distribution group (schedule): {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0059' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0059',
	'en_US',
	'W',
	'Cannot import since the version No. is different from the receipt schedule.\nData No.: {1}\nData row No.: {2}\nVersion No.: {3}\nVersion No. (schedule): {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0060' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0060',
	'en_US',
	'W',
	'Specify in the relationship of: PO date ≤ Replied delivery date.\nData No.: {1}\nData row No.: {2}\nPO No.: {3}\nPO details No.: {4}\nPO date: {5}\nReplied delivery date: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0061' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0061',
	'en_US',
	'W',
	'If an item is not subject to asset management and its unit prince is 0, the sales reason other than the sales other accounting is required.\nEnter the sales reason other than the sales other accounting in the Business Reason master.\nData No.: {1}\nData row No.: {2}\nItem: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0062' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0062',
	'en_US',
	'W',
	'If an item for asset management and its unit price is 0, the charged dept. is required.\nTo set up a sales dept. as a charged dept., turn on the "Charged dept." in the Dept. master.\nData No.: {1}\nData row No.: {2}\nItem: {3}\nSales dept.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0063' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0063',
	'en_US',
	'W',
	'Cannot import the answer since PO details are in one of the following states:\n-Receipt completed\n-Purchase completed\n-Purchase invoice entered\nData No.: {1}\nData row No.: {2}\nPO No.: {3}\nPO details No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0069' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0069',
	'en_US',
	'I',
	'Starting the mfg. result IF import processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0070' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0070',
	'en_US',
	'I',
	'The mfg. result IF import processing completed.\nTo process: {1}\nNumber of entries: {2}\nNumber of errors: {3}\nNumber of skips: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0071' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0071',
	'en_US',
	'I',
	'Skipped since data is not received according to the setting of the SCM Control master.\nIF process type: {1}\nData No.: {2}\nData row No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0072' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0072',
	'en_US',
	'I',
	'Skipped since update data with a larger external system data No. is processed in the same External system cd. and External result No.\nIF process type: {1}\nData No.: {2}\nData row No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0073' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0073',
	'en_US',
	'I',
	'Received cancelation records of operation results. Therefore, results linked to the cancelation records were not imported.\nIF process type: {1}\nData No.: {2}\nData row No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0074' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0074',
	'en_US',
	'I',
	'Skipped importing because the output result of all operation results creation is received.\nIF process type: {1}\nData No.: {2}\nData row No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0075' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0075',
	'en_US',
	'I',
	'Skipped importing because the mfg. is canceled.\nIF process type: {1}\nData No.: {2}\nData row No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0076' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0076',
	'en_US',
	'I',
	'Skipped since the man-hour is not to be processed during importing the mfg. result.\nIF process type: {1}\nData No.: {2}\nData row No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0077' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0077',
	'en_US',
	'W',
	'An error occurred in the import processing of record linked to the same mfg. order. Check the record where the error occurred.\nIF process type: {1}\nData No.: {2}\nData row No.: {3}\nMfg. order No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0078' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0078',
	'en_US',
	'W',
	'Could not import because an error occurred in the import processing of other results with the same External system cd. and External system data No.\nIF process type: {1}\nData No.: {2}\nData row No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0079' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0079',
	'en_US',
	'I',
	'Starting the operation completion processing.\nOperation result qty.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0080' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0080',
	'en_US',
	'I',
	'The operation completion processing completed.\nNumber of successful processes: {1}\nNumber of failures: {2}\nNumber of uncompleted processes: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0083' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0083',
	'en_US',
	'W',
	'An error has occurred in the mfg. result IF import processing.\nIF process type: {1}\nData No.: {2}\nData row No.: {3}\nMessage ID: {4}\nMessage:\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0084' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0084',
	'en_US',
	'W',
	'The target operation of result entry cannot be found.\nIF process type: {1}\nData No.: {2}\nData row No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0085' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0085',
	'en_US',
	'W',
	'There are multiple operation orders that are acquired by a combination of the specified Mfg. order No., Operation cd., and Operation sequence number. Therefore, operation to which the result should be entered could not be identified.\nSpecify the Operation order No. so that the target operation can be identified.\nIF process type: {1}\nData No.: {2}\nData row No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0086' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0086',
	'en_US',
	'W',
	'No operation order to be entered exists.\nIF process type: {1}\nData No.: {2}\nData row No.: {3}\nOperation order No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0087' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0087',
	'en_US',
	'W',
	'The Mfg. order No. set in the mfg. order does not match the Mfg. order No. set in the record to be imported, causing an inconsistency. Check the Mfg. order No. set in the record to be imported.\nIF process type: {1}\nData No.: {2}\nData row No.: {3}\nMfg. order No. of the record to be imported: {4}\nMfg. order No. of the mfg. order: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0088' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0088',
	'en_US',
	'W',
	'The Mfg. order rev. number set in the mfg. order does not match the Mfg. order rev. number set in the record to be imported, causing an inconsistency. Check the Mfg. order rev. number set in the record to be imported.\nIF process type: {1}\nData No.: {2}\nData row No.: {3}\nMfg. order rev. number of the record to be imported: {4}\nMfg. order rev. number of the mfg. order: {5}\nMfg. order No.: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0089' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0089',
	'en_US',
	'W',
	'The Operation cd. set in the operation order does not match the Operation cd. set in the record to be imported, causing an inconsistency. Check the Operation cd. set in the record to be imported.\nIF process type: {1}\nData No.: {2}\nData row No.: {3}\nOperation cd. of the record to be imported: {4}\nOperation cd. of the operation order: {5}\nOperation order No.: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0090' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0090',
	'en_US',
	'W',
	'The Operation sequence number set in the operation order does not match the Operation sequence number set in the record to be imported, causing an inconsistency. Check the Operation sequence number set in the record to be imported.\nIF process type: {1}\nData No.: {2}\nData row No.: {3}\nOperation sequence number of the record to be imported: {4}\nOperation sequence number of the operation order: {5}\nOperation order No.: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0091' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0091',
	'en_US',
	'W',
	'Input schedule not found.\nData No.: {1}\nData row No.: {2}\nInput schedule No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0092' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0092',
	'en_US',
	'W',
	'Man-hour schedule not found.\nData No.: {1}\nData row No.: {2}\nMan-hour schedule No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0093' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0093',
	'en_US',
	'W',
	'Output schedule not found.\nData No.: {1}\nData row No.: {2}\nOutput schedule No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0094' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0094',
	'en_US',
	'W',
	'There is an request message in which nothing is specified.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0095' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0095',
	'en_US',
	'W',
	'Cannot modify and cancel since there is no mfg. result.\nIF process type: {1}\nData No.: {2}\nData row No.: {3}\nMfg. order No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0096' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0096',
	'en_US',
	'W',
	'In the case of mfg. division, MES receiving cannot be performed.\nIF process type: {1}\nData No.: {2}\nData row No.: {3}\nMfg. order No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0097' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0097',
	'en_US',
	'W',
	'Loss qty. for the loss result, or the active ingredient is required.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0098' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0098',
	'en_US',
	'W',
	'Actual start date and time of operation result is required.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0099' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0099',
	'en_US',
	'W',
	'Actual date and time of input result is required.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0100' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0100',
	'en_US',
	'W',
	'Input quantities of input results, or active ingredients is required.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0101' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0101',
	'en_US',
	'W',
	'Recording date of man-hour result is required.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0102' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0102',
	'en_US',
	'W',
	'Actual date and time of output result is required.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0103' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0103',
	'en_US',
	'W',
	'Transaction unit qty. of output result is required.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0104' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0104',
	'en_US',
	'W',
	'Transaction unit cd. of output result is essential.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0105' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0105',
	'en_US',
	'W',
	'Cannot enter multiple operation results with the same External operation result No., and External system cd.\nData No.: {1}\nData row No.: {2}\nExternal operation result No.: {3}\nExternal system cd.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0106' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0106',
	'en_US',
	'W',
	'Cannot enter the operation result since data with the same External operation result No. and External system cd. already exist.\nData No.: {1}\nData row No.: {2}\nExternal operation result No.: {3}\nExternal system cd.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0107' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0107',
	'en_US',
	'W',
	'Cannot enter the result because a result for the operation to be imported has already been entered from the screen. Delete the relevant result from the Mfg. Result Entry screen and import the data again.\nData No.: {1}\nData row No.: {2}\nOperation order No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0108' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0108',
	'en_US',
	'W',
	'Actual operation start date and time should be set prior to actual end date and time.\nData No.: {1}\nData row No.: {2}\nActual start date and time: {3}\nActual end date and time: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0109' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0109',
	'en_US',
	'W',
	'Cannot enter multiple input results with the same External input result No. and External system cd.\nData No.: {1}\nData row No.: {2}\nExternal input result No.: {3}\nExternal system cd.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0110' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0110',
	'en_US',
	'W',
	'Cannot enter the input result since data with the same External input result No. and External system cd. already exist.\nData No.: {1}\nData row No.: {2}\nExternal input result No.: {3}\nExternal system cd.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0111' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0111',
	'en_US',
	'W',
	'In the case of additional input, an item should be specified.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0112' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0112',
	'en_US',
	'W',
	'If there is other accounting transfer qty. for input, a reason for other accounting transfer is required.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0113' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0113',
	'en_US',
	'W',
	'If there is other accounting transfer qty. for input, an other accounting transfer charged dept. is required.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0114' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0114',
	'en_US',
	'W',
	'Cannot enter multiple man-hour results with the same External man-hour result No. and External system cd.\nData No.: {1}\nData row No.: {2}\nExternal man-hour result No.: {3}\nExternal system cd.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0115' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0115',
	'en_US',
	'W',
	'Cannot enter the man-hour result since data with the same External man-hour result No. and External system cd. already exist.\nData No.: {1}\nData row No.: {2}\nExternal man-hour result No.: {3}\nExternal system cd.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0116' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0116',
	'en_US',
	'W',
	'In the case of additional man-hour, a work element cd. should be specified.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0117' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0117',
	'en_US',
	'W',
	'Man-hour start time should be specified to the same day as recording date.\nData No.: {1}\nData row No.: {2}\nRecording date: {3}\nStart time: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0118' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0118',
	'en_US',
	'W',
	'Man-hour end time should be specified to the same day as recording date.\nData No.: {1}\nData row No.: {2}\nRecording date: {3}\nEnd time: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0119' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0119',
	'en_US',
	'W',
	'Man-hour start time should be specified prior to end time.\nData No.: {1}\nData row No.: {2}\nStart time: {3}\nEnd time: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0120' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0120',
	'en_US',
	'W',
	'Cannot enter multiple output results with the same External output result No. and External system cd.\nData No.: {1}\nData row No.: {2}\nExternal output result No.: {3}\nExternal system cd.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0121' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0121',
	'en_US',
	'W',
	'Cannot enter the output result since data with the same External output result No. and External system cd. already exist.\nData No.: {1}\nData row No.: {2}\nExternal output result No.: {3}\nExternal system cd.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0122' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0122',
	'en_US',
	'W',
	'Cannot identify an output schedule to be entered.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0123' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0123',
	'en_US',
	'W',
	'In the case of additional by-product, an item should be specified.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0124' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0124',
	'en_US',
	'W',
	'In the case of additional by-product, a conforming type should be specified.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0125' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0125',
	'en_US',
	'W',
	'In the case of output defective item, a reason for output should be specified.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0126' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0126',
	'en_US',
	'W',
	'Operation result not found.\nData No.: {1}\nData row No.: {2}\nExternal operation result No.: {3}\nExternal system cd.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0127' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0127',
	'en_US',
	'W',
	'Input result not found.\nData No.: {1}\nData row No.: {2}\nExternal input result No.: {3}\nExternal system cd.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0128' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0128',
	'en_US',
	'W',
	'Man-hour result not found.\nData No.: {1}\nData row No.: {2}\nExternal man-hour result No.: {3}\nExternal system cd.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0129' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0129',
	'en_US',
	'W',
	'Output result not found.\nData No.: {1}\nData row No.: {2}\nExternal output result No.: {3}\nExternal system cd.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0130' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0130',
	'en_US',
	'W',
	'Loss item does not match the parent input item.\nData No.: {1}\nData row No.: {2}\nLoss item: {3}\nInput item: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0131' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0131',
	'en_US',
	'W',
	'In the case of additional loss, an item should be specified.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0132' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0132',
	'en_US',
	'W',
	'No loss reason is defined for the loss item.\nData No.: {1}\nData row No.: {2}\nLoss item: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0133' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0133',
	'en_US',
	'W',
	'In the case of process excluding constant loss and initial display loss, a loss reason cd. is required.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0134' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0134',
	'en_US',
	'W',
	'The following loss reason cd. is not defined for the loss item:\nData No.: {1}\nData row No.: {2}\nLoss reason cd.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0135' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0135',
	'en_US',
	'W',
	'Loss result cannot be entered more than or equal to two times due to the same loss reason.\nPrevious data row No.: {1}\nCurrent data row No.: {2}\nLoss reason cd.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0136' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0136',
	'en_US',
	'W',
	'Loss result cannot be canceled more than two times due to the same loss reason. \nPrevious data row No.: {1}\nCurrent data row No.: {2}\nLoss reason cd.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0137' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0137',
	'en_US',
	'W',
	'Cannot enter the loss result since data with the same Reason cd. already exists.\nData No.: {1}\nData row No.: {2}\nLoss reason cd.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0138' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0138',
	'en_US',
	'W',
	'Loss result not found.\nData No.: {1}\nData row No.: {2}\nExternal input result No.: {3}\nExternal system cd.: {4}\nLoss reason cd.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0139' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0139',
	'en_US',
	'W',
	'Input item not found.\nData No.: {1}\nData row No.: {2}\nItem: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0140' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0140',
	'en_US',
	'W',
	'Lot information on the item subject to version control not found.\nData No.: {1}\nData row No.: {2}\nItem: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0141' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0141',
	'en_US',
	'W',
	'In the case of item not subject to active ingredient, an input qty. is required.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0142' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0142',
	'en_US',
	'W',
	'The qty. of loss result should be a positive number.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0143' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0143',
	'en_US',
	'W',
	'Result qty. of operation result is required.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0144' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0144',
	'en_US',
	'W',
	'The mfg. location set in the mfg. order does not match the mfg. location set in the record to be imported, causing an inconsistency. Check the mfg. location set in the record to be imported.\nIF process type: {1}\nData No.: {2}\nData row No.: {3}\nMfg. location of the record to be imported: {4}\nMfg. location of the mfg. order: {5}\nMfg. order No.: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0145' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0145',
	'en_US',
	'W',
	'The mfg. item set in the mfg. order does not match the mfg. item set in the record to be imported, causing an inconsistency. Check the mfg. item set in the record to be imported.\nIF process type: {1}\nData No.: {2}\nData row No.: {3}\nMfg. item of the record to be imported: {4}\nMfg. item of the mfg. order: {5}\nMfg. order No.: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0146' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0146',
	'en_US',
	'W',
	'Cannot import since a result is already entered for the operation order.\nData No.: {1}\nData row No.: {2}\nOperation order No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0147' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0147',
	'en_US',
	'W',
	'Cannot import since a result is already entered for the input schedule.\nData No.: {1}\nData row No.: {2}\nInput schedule No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0148' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0148',
	'en_US',
	'W',
	'Cannot import since a result is already entered for the man-hour schedule.\nData No.: {1}\nData row No.: {2}\nMan-hour schedule No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0149' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0149',
	'en_US',
	'W',
	'Cannot import since a result is already entered for the output schedule.\nData No.: {1}\nData row No.: {2}\nOutput schedule No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0150' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0150',
	'en_US',
	'W',
	'Mfg. order revision number of the imported man-hour does not match the latest mfg. order revision number.\nData No.: {1}\nData row No.: {2}\nMfg. order No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0151' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0151',
	'en_US',
	'I',
	'Starting the man-hour result IF import processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0152' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0152',
	'en_US',
	'I',
	'The man-hour result IF import processing completed.\nTo process: {1}\nNumber of entries: {2}\nNumber of errors: {3}\nNumber of skips: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0153' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0153',
	'en_US',
	'W',
	'An error has occurred in the man-hour result IF import processing.\nData No.: {1}\nData row No.: {2}\nMessage ID: {3}\nMessage:\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0154' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0154',
	'en_US',
	'W',
	'In the case of indirect man-hour, and there is an item, a location cd. is required.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0155' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0155',
	'en_US',
	'W',
	'In the case of indirect man-hour, a dept. cd. is required.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0156' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0156',
	'en_US',
	'I',
	'Starting the SCM result IF bulk import processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0157' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0157',
	'en_US',
	'I',
	'The SCM result IF bulk import processing completed.\nTo process: {1}\nNumber of entries: {2}\nNumber of errors: {3}\nNumber of skips: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0158' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0158',
	'en_US',
	'W',
	'Aborted process since there is a record being processed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0159' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0159',
	'en_US',
	'I',
	'Starting the shipping result IF import processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0160' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0160',
	'en_US',
	'I',
	'The shipping result IF import processing completed.\nTo process: {1}\nNumber of entries: {2}\nNumber of errors: {3}\nNumber of skips: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0161' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0161',
	'en_US',
	'W',
	'Cannot import since an error has occurred in the shipping information which was previously processed for the same Shipping point distribution group and Shipping order No.\nData No.: {1}\nData row No.: {2}\nShipping point distribution group: {3}\nShipping order No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0162' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0162',
	'en_US',
	'W',
	'Skipped since data whose external system data No. is larger is processed previously for the same Shipping point distribution group, External system cd., and External shipping result No.\nData No.: {1}\nData row No.: {2}\nShipping point distribution group: {3}\nExternal system cd.: {4}\nExternal shipping result No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0163' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0163',
	'en_US',
	'W',
	'An error has occurred in the shipping result IF import processing.\nData No.: {1}\nData row No.: {2}\nMessage ID: {3}\nMessage:\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0164' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0164',
	'en_US',
	'W',
	'Could not import since an error occurred while importing other shipping results for the same Shipping point distribution group and Shipping order No.\nData No.: {1}\nData row No.: {2}\nShipping point distribution group: {3}\nShipping order No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0165' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0165',
	'en_US',
	'W',
	'Cannot import since the same External shipping result No. exists.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal shipping result No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0166' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0166',
	'en_US',
	'W',
	'Cannot import since the same External shipping result No. already exists.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal shipping result No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0167' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0167',
	'en_US',
	'W',
	'Cannot import since multiple data of corresponding shipping result info. have been acquired.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0168' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0168',
	'en_US',
	'W',
	'Cannot import since corresponding shipping result info. cannot be acquired.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0169' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0169',
	'en_US',
	'W',
	'Specify one of the following: Shipping allocation status No., Shipping order details No., Invoice details No., Invoice No., Delivery note details No., Delivery note No.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0170' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0170',
	'en_US',
	'W',
	'Cannot identify the shipping allocation status corresponding to the shipping result import IF information.\nData No.: {1}\nData row No.: {2}\nShipping allocation status No.: {3}\nShipping order details No.: {4}\nInvoice details No.: {5}\nInvoice No.: {6}\nDelivery note details No.: {7}\nDelivery note No.: {8}\nShipping location cd.: {9}\nShipping rack/line cd.: {10}\nLot No.: {11}\nSublot No.: {12}\nSEIBAN No.: {13}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0171' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0171',
	'en_US',
	'I',
	'Starting the movement result IF import processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0172' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0172',
	'en_US',
	'I',
	'The movement result IF import processing completed.\nTo process: {1}\nNumber of entries: {2}\nNumber of errors: {3}\nNumber of skips: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0173' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0173',
	'en_US',
	'W',
	'Cannot execute the import IF service since the setting of import operation that corresponds to the IF process type is invalid.\nIF process type: {1}\nImport operation: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0174' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0174',
	'en_US',
	'I',
	'Starting the EDI shipping result IF import processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0175' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0175',
	'en_US',
	'I',
	'The EDI shipping result IF import processing completed.\nTo process: {1}\nNumber of entries: {2}\nNumber of errors: {3}\nNumber of skips: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0176' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0176',
	'en_US',
	'W',
	'The specified PO details does not exist.\nData No.: {1}\nData row No.: {2}\nPO details No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0177' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0177',
	'en_US',
	'W',
	'A supplier different from the one when the order was placed is specified.\nData No.: {1}\nData row No.: {2}\nPO details No.: {3}\nSupplier in place an order: {4}\nSupplier of IF data: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0178' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0178',
	'en_US',
	'W',
	'The Item Unit master does not exist.\nData No.: {1}\nData row No.: {2}\nPO details No.: {3}\nVendor delivery note No.: {4}\nVendor delivery note details No.: {5}\nItem: {6}\nUnit: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0179' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0179',
	'en_US',
	'W',
	'Cannot specify an item which is different from the one when the order was placed.\nData No.: {1}\nData row No.: {2}\nPO details No.: {3}\nItem in placing an order: {4}\nIF data item: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0180' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0180',
	'en_US',
	'W',
	'The specified delivery order does not exist.\nData No.: {1}\nData row No.: {2}\nPO details No.: {3}\nDelivery order No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0181' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0181',
	'en_US',
	'W',
	'Cannot import since the remaining receipt schedules have been canceled.\nData No.: {1}\nData row No.: {2}\nPO details No.: {3}\nVendor delivery note No.: {4}\nVendor delivery note details No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0182' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0182',
	'en_US',
	'W',
	'The External receipt result No. is duplicated.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal receipt result No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0183' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0183',
	'en_US',
	'W',
	'A combination of the Vendor delivery note No. and Vendor delivery note details No. is duplicated.\nData No.: {1}\nData row No.: {2}\nSupplier: {3}\nPO details No.: {4}\nVendor delivery note No.: {5}\nVendor delivery note details No.: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0184' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0184',
	'en_US',
	'W',
	'The number of decimal places in the transaction unit qty. is incorrect.\nData No.: {1}\nData row No.: {2}\nPO details No.: {3}\nVendor delivery note No.: {4}\nVendor delivery note details No.: {5}\nTransaction unit qty.: {6}\nTransaction unit: {7}\nNumber of decimal places: {8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0185' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0185',
	'en_US',
	'W',
	'Cannot import since an error has occurred in the movement result which was previously processed for the same Distribution group, External system cd., and External movement result No.\nData No.: {1}\nData row No.: {2}\nDistribution group cd.: {3}\nExternal system cd.: {4}\nExternal movement result No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0186' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0186',
	'en_US',
	'W',
	'Skipped since data with a large External system data No. was previously processed for the same Distribution group, External system cd., and External movement result No.\nData No.: {1}\nData row No.: {2}\nDistribution group: {3}\nExternal system cd.: {4}\nExternal movement result No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0187' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0187',
	'en_US',
	'W',
	'An error has occurred in the movement result IF import processing.\nData No.: {1}\nData row No.: {2}\nMessage ID: {3}\nMessage:\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0188' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0188',
	'en_US',
	'W',
	'A combination of the PO details No. and Delivery order details No. is invalid.\nData No.: {1}\nData row No.: {2}\nPO details No.: {3}\nDelivery order details No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0189' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0189',
	'en_US',
	'W',
	'Receiving point is required. Specify the receiving point to import, or enter the standard receiving point in the Distribution Control master.\nData No.: {1}\nData row No.: {2}\nDelivery destination: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0190' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0190',
	'en_US',
	'W',
	'Could not import since the item is different from the receipt schedule.\nData No.: {1}\nData row No.: {2}\nItem: {3}\nItem (schedule): {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0191' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0191',
	'en_US',
	'W',
	'Temporary unit price specified when the order was released is different from the one in the master.\nData No.: {1}\nData row No.: {2}\nTemporary unit price specified in placing an order: {3}\nTemporary unit price of master: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0192' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0192',
	'en_US',
	'W',
	'The specified transaction is not available.\nSpecify a transaction in which the following Transaction pattern type is specified.\nTransaction pattern type: "Movement/Transport", "Movement/transport return", "Supply", "Supply return".\nData No.: {1}\nData row No.: {2}\nTransaction cd.: {3}\nTransaction pattern type: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0193' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0193',
	'en_US',
	'W',
	'Cannot import since the corresponding movement allocation status information could not be acquired.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0194' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0194',
	'en_US',
	'W',
	'Cannot import since a movement result has already been entered for the movement order.\nData No.: {1}\nData row No.: {2}\nExternal movement result No.: {3}\nExternal system cd.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0195' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0195',
	'en_US',
	'W',
	'Cannot import since the corresponding movement result information could not be acquired.\nData No.: {1}\nData row No.: {2}\nExternal movement result No.: {3}\nExternal system cd.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0196' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0196',
	'en_US',
	'W',
	'The specified movement order does not exist.\nData No.: {1}\nData row No.: {2}\nMovement order No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0197' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0197',
	'en_US',
	'W',
	'Cannot import since the same movement result already exists.\nData No.: {1}\nData row No.: {2}\nExternal movement result No.: {3}\nExternal system cd.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0198' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0198',
	'en_US',
	'W',
	'Could not import since an error occurred while importing other movement result for the same Distribution group and External system cd.\nData No.: {1}\nData row No.: {2}\nDistribution group: {3}\nExternal system cd.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0199' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0199',
	'en_US',
	'W',
	'Could not import since an error has occurred in the movement results which were previously processed for the same Distribution group, External system cd., and External movement result No.\nData No.: {1}\nData row No.: {2}\nDistribution group cd.: {3}\nExternal system cd.: {4}\nExternal movement result No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0200' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0200',
	'en_US',
	'W',
	'Could not import since a sales unit price which is an initial value of invoice unit price could not be acquired.\nIf the item is subject to an invoice transaction and its unit price is 0, the invoice unit price is required.\nData No.: {1}\nData row No.: {2}\nItem: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0201' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0201',
	'en_US',
	'W',
	'Cannot import since the Approval status type is "Preliminary approval" or "Final approval".\nData No.: {1}\nData row No.: {2}\nCustom order No.: {3}\nSales order No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0202' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0202',
	'en_US',
	'W',
	'The specified delivery order does not exist.\nData No.: {1}\nData row No.: {2}\nPO No.: {3}\nPO details No.: {4}\nDelivery order No.: {5}\nDelivery order rev. number: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0203' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0203',
	'en_US',
	'W',
	'Cannot import an order promising result since the PO details have been canceled.\nData No.: {1}\nData row No.: {2}\nPO details No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0204' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0204',
	'en_US',
	'W',
	'Could not import since an error occurred while importing another shipping result for the same header.\nData No.: {1}\nData row No.: {2}\nShipping point distribution group: {3}\nShipping date and time: ｛4}\nDelivery date and time: {5}\nCustomer: {6}\nRequesting dept.: {7}\nRequesting PIC: {8}\nShipping dept.: {9}\nShipping PIC: {10}\nReceiving point identification type: {11}\nReceiving point identification: {12}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0205' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0205',
	'en_US',
	'W',
	'Error occurred in: {1}\nError occurred at: {2}\nCompany: {3}\nWG cd.: {4}\nCustomer cd.: {5}\nError content: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0206' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0206',
	'en_US',
	'W',
	'Error occurred in: {1}\nError occurred at: {2}\nCompany: {3}\nWG cd.: {4}\nSupplier cd.: {5}\nError content: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0207' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0207',
	'en_US',
	'W',
	'Cannot import since a shipping result has already been entered for the shipping allocation status.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal shipping result No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0208' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0208',
	'en_US',
	'W',
	'No cancelable reply exists.\nData No.: {1}\nData row No.: {2}\nPO details No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0209' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0209',
	'en_US',
	'W',
	'Cannot proceed if the update changes the item. Delete the existing data and then import it as new data.\nData No.: {1}\nData row No.: {2}\nItem before change: {3}\nItem after change: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0210' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0210',
	'en_US',
	'W',
	'The specified invoice No. does not match the invoice No. in the shipping order.\nData No.: {1}\nData row No.: {2}\nSpecified invoice No.: {3}\nInvoice No. with shipping order: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0211' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0211',
	'en_US',
	'W',
	'In the case that the Transaction pattern type is set to "Supply", update process cannot be proceed if it changes the receiving point. Delete the existing data and then import it as new data.\nData No.: {1}\nData row No.: {2}\nReceiving point identification type before change: {3}\nReceiving point identification cd. before change: {4}\nReceiving point identification type after change: {5}\nReceiving point identification cd. after change: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0212' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0212',
	'en_US',
	'W',
	'In the case that the Transaction pattern type is "Supply return", update process cannot be proceed if it changes the shipping location. Delete the existing data and import it as new data.\nData No.: {1}\nData row No.: {2}\nShipping location cd. before change: {3}\nShipping location cd. after change: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0213' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0213',
	'en_US',
	'W',
	'In the case that the Transaction pattern type is "Supply return", update process cannot be proceed if it changes the shipping rack/line. Delete the existing data and then import it as new data.\nData No.: {1}\nData row No.: {2}\nShipping rack/line cd. before change: {3}\nShipping rack/line cd. after change: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0214' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0214',
	'en_US',
	'W',
	'Cannot proceed if the update changes the GR location. Delete the existing data and then import it as new data.\nData No.: {1}\nData row No.: {2}\nGR location cd. before change: {3}\nGR location cd. after change: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0215' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0215',
	'en_US',
	'W',
	'In the case that the Transaction pattern type is "Supply return", update process cannot be proceed if it changes the GI location. Delete the existing data and then import it as new data.\nData No.: {1}\nData row No.: {2}\nGI location cd. before change: {3}\nGI location cd. after change: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0216' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0216',
	'en_US',
	'W',
	'If factory/distribution warehouse is different, you can only specify "Inspected".\nData No.: {1}\nData row No.: {2}\nGR factory/distribution warehouse cd.: {3}\nGI factory/distribution warehouse cd.: {4}\nInventory inspection type: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0217' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0217',
	'en_US',
	'W',
	'Cannot import the movement result since the Shipping order type is Non-target.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0218' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0218',
	'en_US',
	'W',
	'Different PO rev. number has been set in replies for the same PO details.\nData No.: {1}\nData row No.: {2}\nPO No.: {3}\nPO details No.: {4}\nPO rev. number: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0219' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0219',
	'en_US',
	'I',
	'Cannot import since it is not required to receive the receipt schedule. Excluded from the import target.\nData No.: {1}\nData row No.: {2}\nPO details No.: {3}\nVendor delivery note No.: {4}\nVendor delivery note details No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0220' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0220',
	'en_US',
	'W',
	'Cannot import the data with the Purchase identification type "2: Receiving free of charge" or "3: Receiving for a fee".\nData No.: {1}\nData row No.: {2}\nPurchase identification type: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0221' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0221',
	'en_US',
	'W',
	'The specified delivery order does not exist.\nData No.: {1}\nData row No.: {2}\nPO details No.: {3}\nDelivery order No.: {4}\nDelivery order details No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0222' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0222',
	'en_US',
	'W',
	'Cannot enter a result for an input schedule if both the input qty. and the fixed required qty. are 0.\nData No.: {1}\nData row No.: {2}\nInput schedule No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0223' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0223',
	'en_US',
	'W',
	'Cannot enter a result for an input schedule if the Input control type is set to "Not for MRP (Only order sheet)".\nData No.: {1}\nData row No.: {2}\nInput schedule No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0300' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0300',
	'en_US',
	'I',
	'Starting the other accounting transfer result IF import processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0301' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0301',
	'en_US',
	'I',
	'The other accounting result IF import processing completed.\nTo process: {1}\nNumber of entries: {2}\nNumber of errors: {3}\nNumber of skips: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0302' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0302',
	'en_US',
	'W',
	'Could not import since an error has occurred in other accounting transfer info. which was previously processed for the same Other accounting transfer order No.\nData No.: {1}\nData row No.: {2}\nOther accounting transfer order No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0303' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0303',
	'en_US',
	'W',
	'Skipped since data with a large External system data No. was previously processed for the same other accounting transfer derails.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nOther accounting transfer result No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0304' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0304',
	'en_US',
	'W',
	'An error has occurred in the other accounting transfer result IF import processing.\nData No.: {1}\nData row No.: {2}\nMessage ID: {3}\nMessage:\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0305' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0305',
	'en_US',
	'W',
	'Could not import since an error occurred while importing the other accounting transfer results for the same Other accounting transfer order No.\nData No.: {1}\nData row No.: {2}\nOther accounting transfer order No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0306' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0306',
	'en_US',
	'W',
	'Could not import since an error occurred while importing the other accounting transfer results for the same header.\nData No.: {1}\nData row No.: {2}\nTransaction: {3}\nLocation: {4}\nActual other accounting transfer date and time: {5}\nImplementation dept.: {6}\nImplementation PIC: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0307' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0307',
	'en_US',
	'W',
	'Cannot import since the same External other accounting transfer result No. exists.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nOther accounting transfer result No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0308' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0308',
	'en_US',
	'W',
	'Cannot import since the same External other accounting transfer result No. exists.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nOther accounting transfer result No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0309' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0309',
	'en_US',
	'W',
	'The specified other accounting transfer order does not exist.\nData No.: {1}\nData row No.: {2}\nOther accounting transfer order No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0310' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0310',
	'en_US',
	'W',
	'Cannot import since multiple data of the corresponding other accounting transfer result info. have been acquired.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0311' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0311',
	'en_US',
	'W',
	'Cannot import since multiple data of the corresponding other accounting transfer result info. cannot be acquired.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0312' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0312',
	'en_US',
	'W',
	'Cannot identify other accounting transfer order details corresponding to the other accounting transfer result import IF info.\nData No.: {1}\nData row No.: {2}\nOther accounting transfer order No.: {3}\nOther accounting transfer order details No.: ｛4}\nItem: {5}\nRack/Line cd.: {6}\nLot No.: {7}\nSublot No.: {8}\nSEIBAN No.: {9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0313' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0313',
	'en_US',
	'W',
	'Cannot import since an other accounting transfer result has already been entered for the other accounting transfer order details.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nOther accounting transfer result No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0314' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0314',
	'en_US',
	'W',
	'Cannot proceed if the update changes the location. Delete the existing data and then import it as new data.\nData No.: {1}\nData row No.: {2}\nLocation cd. before change: {3}\nLocation cd. after change: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0316' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0316',
	'en_US',
	'W',
	'Could not import since an error has occurred in the other accounting transfer info. which was previously processed for the same External system cd. and External other accounting transfer result No.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nOther accounting transfer result No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0317' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0317',
	'en_US',
	'W',
	'Cannot proceed if the update changes the transaction. Delete the existing data and then import it as new data.\nData No.: {1}\nData row No.: {2}\nLocation cd. before change: {3}\nTransaction pattern cd. after change: {4}\nLocation cd. after change: {5}\nTransaction pattern type after change: {6}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0400' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0400',
	'en_US',
	'I',
	'Starting the acceptance IF import processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0401' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0401',
	'en_US',
	'I',
	'The acceptance IF import processing completed.\nTo process: {1}\nNumber of entries: {2}\nNumber of errors: {3}\nNumber of skips: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0402' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0402',
	'en_US',
	'W',
	'Cannot acquire sales schedule which can be recorded to sales.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}\nCustomer order details No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0403' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0403',
	'en_US',
	'W',
	'Cannot acquire sales schedule which can be recorded to sales.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nInvoice No.: {4}\nInvoice details No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0404' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0404',
	'en_US',
	'W',
	'Cannot acquire sales schedule which can be recorded to sales.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nDelivery note No.: {4}\nDelivery note details No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0405' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0405',
	'en_US',
	'W',
	'Cannot import since the corresponding sales order info. cannot be acquired.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}\nCustomer order details No.: {5}\nItem: {6}\nSEIBAN No.: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0406' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0406',
	'en_US',
	'W',
	'Cannot import since multiple data of corresponding sales order info. have been acquired.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}\nItem : {5}\nSEIBAN No.: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0407' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0407',
	'en_US',
	'W',
	'Cannot import since the corresponding invoice info. cannot be acquired.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nInvoice No.: {4}\nInvoice details No.: {5}\nCustomer order No.: {6}\nCustomer order details No.: {7}\nItem: {8}\nSEIBAN No.: {9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0408' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0408',
	'en_US',
	'W',
	'Cannot import since multiple data of corresponding invoice info. have been acquired.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nInvoice No.: {4}\nInvoice details No.: {5}\nCustomer order No.: {6}\nCustomer order details No.: {7}\nItem: {8}\nSEIBAN No.: {9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0409' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0409',
	'en_US',
	'W',
	'Cannot import since the corresponding delivery slip info. cannot be acquired.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nDelivery note No.: {4}\nDelivery note details No.: {5}\nCustomer order No.: {6}\nCustomer order details No.: {7}\nItem: {8}\nSEIBAN No.: {9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0410' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0410',
	'en_US',
	'W',
	'Cannot import since multiple data of corresponding delivery slip info. have been acquired.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nDelivery note No.: {4}\nDelivery note details No.: {5}\nCustomer order No.: {6}\nCustomer order details No.: {7}\nItem: {8}\nSEIBAN No.: {9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0411' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0411',
	'en_US',
	'I',
	'Skipped due to acceptance defective data.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nDelivery note No.: {4}\nDelivery note details No.: {5}\nCustomer order No.: {6}\nCustomer order details No.: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0412' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0412',
	'en_US',
	'W',
	'Could not import since an error has occurred in the sales which were previously processed for the same Customer, Delivery note No., and Customer order No.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nDelivery note No.: {4}\nCustomer order No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0413' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0413',
	'en_US',
	'W',
	'Skipped since data with the higher External system data No. was previously processed for the same External system cd. and External purchase result details No.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal purchase result details No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0414' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0414',
	'en_US',
	'W',
	'Cannot import since the Revenue recording type is neither Acceptance base sales nor Arrival base sales.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nDelivery note No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0415' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0415',
	'en_US',
	'W',
	'Cannot import since the Revenue recording type is neither Acceptance base sales nor Arrival base sales.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nInvoice No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0416' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0416',
	'en_US',
	'W',
	'Cannot import since the scheduled payment receipt date is not specified.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nInvoice No.: {4}\nInvoice details No.: {5}\nCustomer order No.: {6}\nCustomer order details No.: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0417' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0417',
	'en_US',
	'W',
	'An error has occurred in the acceptance IF import processing.\nData No.: {1}\nData row No.: {2}\nMessage ID: {3}\nMessage: \n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0418' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0418',
	'en_US',
	'W',
	'Could not import since an error occurred while importing other sales for the same Customer, Delivery note No., and Customer order No.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nDelivery not No.: {4}\nCustomer order No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0419' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0419',
	'en_US',
	'W',
	'Could not import since sales order, delivery slip, or invoice cannot be identified, or sales schedule which can be recorded to sales cannot be acquired. \nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}\nCustomer order details No.: {5}\nItem: {6}\nSEIBAN No.: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0420' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0420',
	'en_US',
	'W',
	'Cannot specify a unit different from the invoice unit.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nInvoice No.: {4}\nInvoice details No.: {5}\nInvoice unit: {6}\nIF data unit: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0421' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0421',
	'en_US',
	'W',
	'Cannot specify a unit which does not exist in the Item Unit master.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nDelivery note No.: {4}\nDelivery note details No.: {5}\nCustomer order No.: {6}\nCustomer order details No.: {7}\nIF data unit: {8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0422' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0422',
	'en_US',
	'W',
	'Cannot specify a currency different from the currency at the time of sales order.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}\nCustomer order details No.: {5}\nSales order No.: {6}\nCurrency of sales order: {7}\nIF data currency: {8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0423' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0423',
	'en_US',
	'W',
	'Cannot specify a currency different from the invoice currency.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nInvoice No.: {4}\nInvoice currency: {5}\nIF data currency: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0424' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0424',
	'en_US',
	'W',
	'Cannot specify a currency different from the currency in delivery note.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nDelivery note No.: {4}\nDelivery note currency: {5}\nIF data currency: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0425' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0425',
	'en_US',
	'W',
	'Cannot specify a unit price different from the one at the time of sales order. \nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}\nCustomer order details No.: {5}\nSales order No.: {6}\nSales order details No.: {7}\nUnit price of sales order (after unit conversion): {8}\nIf data unit price: {9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0426' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0426',
	'en_US',
	'W',
	'Cannot specify a unit price different from the one in invoice.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nInvoice No.: {4}\nInvoice details No.: {5}\nInvoice unit price: {6}\nIF data unit price: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0427' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0427',
	'en_US',
	'W',
	'Cannot specify a unit price different from the one in delivery note.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nDelivery note No.: {4}\nDelivery note details No.: {5}\nDelivery note unit price: {6}\nIF data unit price: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0428' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0428',
	'en_US',
	'W',
	'Cannot specify amount different from the amount at the time of sales order.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}\nCustomer order details No.: {5}\nSales order No.: {6}\nSales order details No.: {7}\nSales order amount (after qty. and tax conversion): {8}\nIf data amount: {9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0429' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0429',
	'en_US',
	'W',
	'Cannot specify amount different from the invoice amount.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nInvoice No.: {4}\nInvoice details No.: {5}\nInvoice amount: {6}\nIF data amount: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0430' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0430',
	'en_US',
	'W',
	'Cannot specify amount different from the amount in delivery note.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nDelivery note No.: {4}\nDelivery note details No.: {5}\nDelivery note amount(after qty. and tax conversion): {6}\nIF data amount: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0431' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0431',
	'en_US',
	'W',
	'Cannot specify discount amount different from the one at the time of sales order.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}\nCustomer order details No.: {5}\nSales order No.: {6}\nSales order details No.: {7}\nDiscount amount of sales order (after qty. conversion): {8}\nIf data discount amount: {9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0432' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0432',
	'en_US',
	'W',
	'Cannot specify discount amount different from the one in invoice.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nInvoice No.: {4}\nInvoice details No.: {5}\nInvoice discount amount: {6}\nIF data discount amount: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0433' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0433',
	'en_US',
	'W',
	'Cannot specify discount amount different from the one in delivery note.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nDelivery note No.: {4}\nDelivery note details No.: {5}\nDelivery note discount amount: {6}\nIF data discount amount: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0434' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0434',
	'en_US',
	'W',
	'Cannot specify discount reason different from the one at the time of sales order.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}\nCustomer order details No.: {5}\nSales order No.: {6}\nSales order details No.: {7}\nDiscount reason of sales order: {8}\nIf data discount reason: {9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0435' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0435',
	'en_US',
	'W',
	'Cannot specify discount reason different from the one in invoice.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nInvoice No.: {4}\nInvoice details No.: {5}\nInvoice discount reason: {6}\nIF data discount reason: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0436' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0436',
	'en_US',
	'W',
	'Cannot specify discount reason different from the one for sales order associated with the delivery note.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nDelivery note No.: {4}\nDelivery note details No.: {5}\nSales order No.: {6}\nSales order details No.: {7}\nDiscount reason of sales order: {8}\nIf data discount reason: {9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0437' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0437',
	'en_US',
	'W',
	'If it is subject to tax check, you cannot specify the tax corresponding to the tax rate of IF data and the tax different from the tax rate at the time of sales order.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}\nCustomer order details No.: {5}\nSales order No.: {6}\nSales order details No.: {7}\nTax of sales order: {8}\nTax corresponding to tax rate of If data: {9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0438' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0438',
	'en_US',
	'W',
	'If it is subject to tax check, you cannot specify the tax corresponding to the tax rate of IF data and the tax rate different from the tax rate in invoice.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nInvoice No.: {4}\nInvoice details No.: {5}\nCustomer order No.: {6}\nCustomer order details No.: {7}\nTax of invoice: {8}\nTax corresponding to tax rate of If data: {9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0439' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0439',
	'en_US',
	'W',
	'If it is subject to tax check, you cannot specify the tax corresponding to the tax rate of IF data and the tax different from the tax rate of delivery note.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nDelivery note No.: {4}\nDelivery note details No.: {5}\nDelivery note tax: {6}\nTax corresponding to tax rate of If data: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0440' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0440',
	'en_US',
	'W',
	'If the unit price is 0, it cannot be imported since the sales reason will be required.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nDelivery note No.: {4}\nDelivery note details No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0441' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0441',
	'en_US',
	'W',
	'Cannot import since an error has occurred in other details for the same Sale order No.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}\nCustomer order details No.: {5}\nSales order No.: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0442' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0442',
	'en_US',
	'W',
	'Cannot import since an error has occurred in other details for the same invoice No.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nInvoice No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0443' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0443',
	'en_US',
	'W',
	'Cannot import since an error occurred in other details for the same delivery note No.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nDelivery note No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0444' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0444',
	'en_US',
	'W',
	'If it is recorded after purchase, you cannot specify qty. that exceeds the sales availability qty. of the sales schedule.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}\nCustomer order details No.: {5}\nSales order No.: {6}\nSales order details No.: {7}\nSales availability qty. (base unit): {8}\nIf data qty. (base unit): {9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0445' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0445',
	'en_US',
	'W',
	'In an invoice transaction, you cannot specify a qty. which is different from the invoice qty.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nDelivery note No.: {4}\nDelivery note details No.: {5}\nCustomer order No.: {6}\nCustomer order details No.: {7}\nInvoice qty.: {8}\nIf data qty.: {9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0446' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0446',
	'en_US',
	'W',
	'For the acceptance base sales or arrival base sales, you cannot specify qty. that exceeds the sales availability qty. of sales schedule.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nDelivery note No.: {4}\nDelivery note details No.: {5}\nCustomer order No.: {6}\nCustomer order details No.: {7}\nSales availability qty. (base unit): {8}\nIF data qty. (base unit): {9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0447' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0447',
	'en_US',
	'W',
	'Cannot specify "Cancel remaining" since there is no remaining qty. to be canceled.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}\nCustomer order details No.: {5}\nSales order No.: {6}\nSales order details No.: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0448' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0448',
	'en_US',
	'W',
	'In invoice transaction, you cannot specify "Cancel remaining".\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nDelivery note No.: {4}\nDelivery note details No.: {5}\nCustomer order No.: {6}\nCustomer order details No.: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0449' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0449',
	'en_US',
	'W',
	'Cannot specify "Cancel remaining" since there is no remaining qty. to be canceled.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nDelivery note No.: {4}\nDelivery note details No.: {5}\nCustomer order No.: {6}\nCustomer order details No.: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0450' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0450',
	'en_US',
	'W',
	'Cannot import since some details of the invoice are not subject to the processing.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nDelivery note No.: {4}\nDelivery note details No.: {5}\nCustomer order No.: {6}\nCustomer order details No.: {7}\nExternal system cd.: {8}\nExternal purchase result details No.: {9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0451' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0451',
	'en_US',
	'W',
	'Cannot import since a different scheduled payment receipt date is specified in the same invoice.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nInvoice No.: {4}\nInvoice details No.: {5}\nCustomer order No.: {6}\nCustomer order details No.: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0452' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0452',
	'en_US',
	'W',
	'Cannot import since sales result info. for IF data cannot be acquired.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nDelivery note No.: {4}\nDelivery note details No.: {5}\nCustomer order No.: {6}\nCustomer order details No.: {7}\nItem: {8}\nSEIBAN No.: {9}\nExternal system cd.: {10}\nExternal purchase result details No.: {11}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0453' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0453',
	'en_US',
	'W',
	'Cannot cancel in the status of cancel remaining. Import after releasing the canceled remaining data.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nDelivery note No.: {4}\nDelivery note details No.: {5}\nCustomer order No.: {6}\nCustomer order details No.: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0454' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0454',
	'en_US',
	'W',
	'Cannot import since sales for the target customer are prohibited.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nDelivery note No.: {4}\nDelivery note details No.: {5}\nCustomer order No.: {6}\nCustomer order details No.: {7}\nSales date: {8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0455' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0455',
	'en_US',
	'W',
	'Cannot import since the sales for the target item are prohibited.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nDelivery note No.: {4}\nDelivery note details No.: {5}\nCustomer order No.: {6}\nCustomer order details No.: {7}\nItem: {8}\nSales date: {9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0456' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0456',
	'en_US',
	'W',
	'Cannot import since it has different qty. from purchased qty.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}\nCustomer order details No.: {5}\nPurchased qty.(base unit): {6}\nIf data qty.(base unit): {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0457' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0457',
	'en_US',
	'W',
	'Cannot import newly since sales result for the target external system cd. and external purchase result details No. is already entered.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nDelivery note No.: {4}\nDelivery note details No.: {5}\nCustomer order No.: {6}\nCustomer order details No.: {7}\nExternal system cd.: {8}\nExternal purchase result details No.: {9}\nEntered sales result No.: {10}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0458' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0458',
	'en_US',
	'W',
	'Specify either or both of the following columns:\nDelivery note No., Customer order No.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0459' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0459',
	'en_US',
	'W',
	'The specified tax amount is different from the calculated tax amount.\nData No.: {1}\nData row No.: {2}\nIF data tax amount: {3}\nCalculated tax amount: {4}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0460' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0460',
	'en_US',
	'W',
	'Number of decimal places in the transaction unit qty. is incorrect.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nDelivery note No.: {4}\nDelivery note details No.: {5}\nCustomer order No.: {6}\nCustomer order details No.: {7}\nTransaction unit: {8}\nTransaction unit qty.: {9}\nNumber of decimal places: {10}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0461' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0461',
	'en_US',
	'W',
	'Cannot import since the external system cd. and the external purchase result No. overlap in the same processing group and the same data update type.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nDelivery note No.: {4}\nDelivery note details No.: {5}\nCustomer order No.: {6}\nCustomer order details No.: {7}\nExternal system cd.: {8}\nExternal purchase result details No.: {9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0462' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0462',
	'en_US',
	'W',
	'Cannot import since sales result associated with the external system cd. and the external purchase result No. cannot be identified.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nDelivery note No.: {4}\nDelivery note details No.: {5}\nCustomer order No.: {6}\nCustomer order details No.: {7}\nExternal system cd.: {8}\nExternal purchase result details No.: {9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0463' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0463',
	'en_US',
	'W',
	'Cannot issue and import lot No. and sublot No. since the Lot No. numbering type is Manual.\nEnter lot No. and sublot No. in the Direct Delivery Sales Result Entry or the Sales Result List Entry.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nDelivery note No.: {4}\nDelivery note details No.: {5}\nCustomer order No.: {6}\nCustomer order details No.: {7}\nItem: {8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0464' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0464',
	'en_US',
	'W',
	'The tax info. (Tax rate, Tax type, Tax inclusive) at the time of placing the order is different from the tax calculated from a master.\nData No.: {1}\nData row No.: {2}\nTax rate at PO: {3}\nTax type at PO: {4}\nTax inclusive at PO: {5}\nTax calculated from the master: {6}\nTax rate calculated from the master: {7}\nTax type calculated from the master: {8}\nTax inclusive calculated from the master: {9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0465' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0465',
	'en_US',
	'W',
	'Cannot process since lots are mixed in input items that cannot contain mixed lot No.\nData No.: {1}\nData row No.: {2}\nInput schedule No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0466' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0466',
	'en_US',
	'W',
	'Cannot process since sublots are mixed in input items that cannot contain mixed sublot No.\nData No.: {1}\nData row No.: {2}\nInput schedule No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0467' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0467',
	'en_US',
	'W',
	'Cannot process since input items are mixed in alternative group that cannot contain mixed input items.\nData No.: {1}\nData row No.: {2}\nInput schedule No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0470' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0470',
	'en_US',
	'I',
	'Starting the PO IF import processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0471' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0471',
	'en_US',
	'I',
	'The PO IF import processing completed.\nTo process: {1}\nNumber of entries: {2}\nNumber of errors: {3}\nNumber of skips: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0472' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0472',
	'en_US',
	'W',
	'An error has occurred in the PO IF import processing.\nData No.: {1}\nData row No.: {2}\nMessage ID: {3}\nMessage:\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0473' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0473',
	'en_US',
	'W',
	'Error occurred in: {1}\nError occurred at: {2}\nCompany: {3}\nWG cd.: {4}\nExternal PO No.: {5}\nError content: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0474' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0474',
	'en_US',
	'W',
	'Could not import since an error occurred in the data which was previously processed for the same External system cd. and External PO No.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal PO No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0475' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0475',
	'en_US',
	'I',
	'Skipped since data with a large External system data No. was previously processed for the same External system cd. and External PO No.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal PO No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0476' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0476',
	'en_US',
	'W',
	'Cannot import since the same PO details already exist.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal PO No.: {4}\nExternal PO details No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0477' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0477',
	'en_US',
	'W',
	'Cannot import since the corresponding PO details could not be acquired.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0478' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0478',
	'en_US',
	'W',
	'Cannot import since multiple data of the corresponding PO info. have been acquired.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0479' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0479',
	'en_US',
	'W',
	'Could not import since an error occurred in other PO details with the same External PO No.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0480' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0480',
	'en_US',
	'W',
	'In the data to be imported this time, there is data in which a combination of the External PO No. and External PO details No. is duplicated.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0481' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0481',
	'en_US',
	'W',
	'Cannot enter discount items only.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal PO No.: {4}\nExternal PO details No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0482' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0482',
	'en_US',
	'W',
	'Cannot import since the Approval status type is "Preliminary approval" or "Final approval".\nData No.: {1}\nData row No.: {2}\nExternal PO No.: {3}\nPO No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0483' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0483',
	'en_US',
	'W',
	'Cannot process since details with the same external PO details No. contain details in which the next processing (receipt, purchase, purchase invoice entry) has been performed.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal PO No.: {4}\nExternal PO details No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0484' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0484',
	'en_US',
	'W',
	'PO is prohibited in the BP Prohibit master.\nData No.: {1}\nData row No.: {2}\nSupplier cd.: {3}\nPO date: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0485' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0485',
	'en_US',
	'W',
	'PO is prohibited in the Item Prohibit master.\nData No.: {1}\nData row No.: {2}\nItem: {3}\nPO date: {4}\nProhibit date: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0486' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0486',
	'en_US',
	'W',
	'For the Purchase identification type of subcontracting items, specify "Receiving for a fee" or "Normal purchase".\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal PO No.: {4}\nExternal PO details No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0487' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0487',
	'en_US',
	'W',
	'Expense purchasing cannot be performed for subcontracting items.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal PO No.: {4}\nExternal PO details No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0488' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0488',
	'en_US',
	'W',
	'For discount items, specify "Normal purchase" in the Purchase identification type.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal PO No.: {4}\nExternal PO details No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0489' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0489',
	'en_US',
	'W',
	'For items not for asset management, VMI cannot be specified for the Purchase identification type.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal PO No.: {4}\nExternal PO details No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0490' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0490',
	'en_US',
	'W',
	'For receipt unnecessary items, you cannot specify "Receiving free of charge" in the Purchase identification type.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal PO No.: {4}\nExternal PO details No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0491' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0491',
	'en_US',
	'W',
	'Cannot enter items for asset management if the transaction is expense purchase.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal PO No.: {4}\nExternal PO details No.: {5}\nItem: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0492' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0492',
	'en_US',
	'W',
	'For items for asset management, you cannot set the reason for expense purchase.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal PO No.: {4}\nExternal PO details No.: {5}\nItem: {6}\nReason cd.: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0493' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0493',
	'en_US',
	'W',
	'For items not for asset management, set the reason for expense purchase.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal PO No.: {4}\nExternal PO details No.: {5}\nItem: {6}\nReason cd.: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0494' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0494',
	'en_US',
	'W',
	'The desired delivery date for the supplier that is a BP targeted to the Subcontract Act must be the same date as scheduled purchase date.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal PO No.: {4}\nExternal PO details No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0495' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0495',
	'en_US',
	'W',
	'No PO info. for charged PO No. is found.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal PO No.: {4}\nExternal PO details No.: {5}\nCharged PO No.: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0496' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0496',
	'en_US',
	'W',
	'No sales order information for charged sales No. is found.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal PO No.: {4}\nExternal PO details No.: {5}\nCharged sales No.: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0497' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0497',
	'en_US',
	'W',
	'No invoice information or purchase invoice information corresponding to the charged invoice No. is found.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal PO No.: {4}\nExternal PO details No.: {5}\nCharged invoice No.: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0498' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0498',
	'en_US',
	'W',
	'Cannot import since there are PO details that are not linked to external PO details No.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal PO No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0499' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0499',
	'en_US',
	'W',
	'Cannot import since multiple data of corresponding PO details have been acquired.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0500' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0500',
	'en_US',
	'W',
	'For direct supply, VMI cannot be specified for the Purchase identification type.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal PO No.: {4}\nExternal PO details No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0501' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0501',
	'en_US',
	'W',
	'The specified transaction is not available.\nSpecify transaction in which the following Transaction pattern type is specified.\nTransaction pattern type: "Purchase", "Expense Purchase"\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal PO No.: {4}\nExternal PO details No.: {5}\nTransaction cd.: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0502' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0502',
	'en_US',
	'W',
	'In each details row with the same External PO No., Sales project No. corresponding to SEIBAN No. 1 is different.\nDivide the External PO No. or change SEIBAN No. 1 so that one External PO No. corresponds to one Sales project No.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal PO No.: {4}\nExternal PO details No.: {5}\nSEIBAN No.1: {6}\nSales project No.: {7}\nSales project name: {8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0503' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0503',
	'en_US',
	'W',
	'Cannot correct since a Sales project No. in the PO header is different from a Sales project No. corresponding to the SEIBAN No. 1.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal PO No.: {4}\nExternal PO details No.: {5}\nSEIBAN No.1: {6}\nSales project No.: {7}\nSales project name: {8}\nSales project No. in PO header: {9}\nSales project name in PO header: {10}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0504' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0504',
	'en_US',
	'W',
	'Number of decimal places in the subcontracting unit price is incorrect.\nData No.: {1}\nData row No.: {2}\nUnit price: {3}\nNumber of decimal places: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0505' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0505',
	'en_US',
	'W',
	'Number of decimal places in the chargeable supply unit price is incorrect.\nData No.: {1}\nData row No.: {2}\nUnit price: {3}\nNumber of decimal places: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0506' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0506',
	'en_US',
	'W',
	'Cannot specify unit price since the Allow purchasing unit price change is turned off in both the Item master and the Transaction master.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0507' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0507',
	'en_US',
	'W',
	'Cannot process since details with the same external PO No. include the canceled details.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal PO No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0508' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0508',
	'en_US',
	'W',
	'Number of decimal places in the discount amount is incorrect.\nData No.: {1}\nData row No.: {2}\nDiscount amount: {3}\nNumber of decimal places: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0509' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0509',
	'en_US',
	'W',
	'Shipping order details do not exist.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0510' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0510',
	'en_US',
	'W',
	'The specified shipping order details do not exist.\nData No.: {1}\nData row No.: {2}\nShipping order details No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0512' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0512',
	'en_US',
	'W',
	'External movement result No. is duplicated.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal movement result No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0600' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0600',
	'en_US',
	'I',
	'Starting the payment received IF import processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0601' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0601',
	'en_US',
	'I',
	'The payment received IF import processing completed.\nTo process: {1}\nNumber of entries: {2}\nNumber of errors: {3}\nNumber of skips: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0602' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0602',
	'en_US',
	'W',
	'An error has occurred in the payment received IF import processing.\nData No.: {1}\nData row No.: {2}\nMessage ID: {3}\nMessage:\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0603' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0603',
	'en_US',
	'W',
	'Error occurred in: {1}\nError occurred at: {2}\nCompany: {3}\nWG cd.: {4}\nPayer cd.: {5}\nError content: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0604' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0604',
	'en_US',
	'W',
	'Could not import since an error occurred in the data which was previously processed for the same External system cd. and External payment received No.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal payment received No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0605' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0605',
	'en_US',
	'I',
	'Skipped since data with a large External system No. has been previously processed in the same External system cd. and External payment received No.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal payment received No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0606' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0606',
	'en_US',
	'W',
	'A combination of the specified bank account and bank is not entered in the Bank Account master.\nData No.: {1}\nData row No.: {2}\nBank account: {3}\nBank: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0607' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0607',
	'en_US',
	'W',
	'A combination of the specified AR settlement type and Payment received method is not entered in the Settlement Method master.\nData No.: {1}\nData row No.: {2}\nAR settlement type: {3}\nPayment received method: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0608' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0608',
	'en_US',
	'W',
	'Cannot import since the same payment received already exists.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal payment received No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0609' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0609',
	'en_US',
	'W',
	'Cannot import since multiple data of corresponding payment received info. have been acquired.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal payment received No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0610' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0610',
	'en_US',
	'W',
	'Cannot import since the corresponding payment received info. cannot be acquired.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal payment received No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0611' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0611',
	'en_US',
	'W',
	'Lot No. must be specified.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0612' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0612',
	'en_US',
	'W',
	'Sublot No. must be specified.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0613' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0613',
	'en_US',
	'W',
	'SEIBAN No.1 is required since "2. Manage (Required)" is specified for the SEIBAN No.1 management type in the Item master.\nData No.: {1}\nData row No.: {2}\nItem: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0614' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0614',
	'en_US',
	'W',
	'SEIBAN No.2 is required since "2. Manage (Required)" is specified for the SEIBAN No.2 management type in the Item master.\nData No.: {1}\nData row No.: {2}\nItem: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0615' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0615',
	'en_US',
	'W',
	'SEIBAN No.3 is required since "2. Manage (Required)" is specified for the SEIBAN No.3 management type in the Item master.\nData No.: {1}\nData row No.: {2}\nItem: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0616' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0616',
	'en_US',
	'W',
	'SEIBAN No.4 is required since "2. Manage (Required)" is specified for the SEIBAN No.4 management type in the Item master.\nData No.: {1}\nData row No.: {2}\nItem: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0617' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0617',
	'en_US',
	'W',
	'For new entry of unplanned results, you cannot specify: Output schedule No., Operation order No., Mfg. order No., and Mfg. order revision No.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0618' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0618',
	'en_US',
	'W',
	'Cannot specify By-product as an unplanned result in the Output type.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0619' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0619',
	'en_US',
	'W',
	'The Work element cd. is required for new entry of unplanned results.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0621' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0621',
	'en_US',
	'W',
	'Cannot enter an item whose Lot No. numbering pattern is Copy child item lot as unplanned results.\nData No.: {1}\nData row No.: {2}\nItem: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0622' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0622',
	'en_US',
	'W',
	'Cannot enter an item whose Sublot No. numbering pattern is Copy child item sublot as unplanned results.\nData No.: {1}\nData row No.: {2}\nItem: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0623' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0623',
	'en_US',
	'W',
	'Cannot enter items other than mfg. items as unplanned results.\nData No.: {1}\nData row No.: {2}\nItem: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0624' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0624',
	'en_US',
	'W',
	'Cannot enter subcontracting items as unplanned results.\nData No.: {1}\nData row No.: {2}\nItem: {3}\nMfg. location: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0625' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0625',
	'en_US',
	'W',
	'Cannot specify SEIBAN No.1 since "1. Do not manage" is specified for the SEIBAN No.1 management type in the Item master.\nData No.: {1}\nData row No.: {2}\nItem: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0626' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0626',
	'en_US',
	'W',
	'Cannot specify SEIBAN No.2 since "1. Do not manage" is specified for the SEIBAN No.2 management type in the Item master.\nData No.: {1}\nData row No.: {2}\nItem: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0627' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0627',
	'en_US',
	'W',
	'Cannot specify SEIBAN No.3 since "1. Do not manage" is specified for the SEIBAN No.3 management type in the Item master.\nData No.: {1}\nData row No.: {2}\nItem: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0628' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0628',
	'en_US',
	'W',
	'Cannot specify SEIBAN No.4 since "1. Do not manage" is specified for the SEIBAN No.4 management type in the Item master.\nData No.: {1}\nData row No.: {2}\nItem: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0629' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0629',
	'en_US',
	'W',
	'Cannot enter items for mfg. approval as unplanned results.\nData No.: {1}\nData row No.: {2}\nItem: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0630' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0630',
	'en_US',
	'W',
	'Cannot turn on the "Cancel remaining" for new entry of unplanned results.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0631' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0631',
	'en_US',
	'W',
	'Could not import since an error occurred in the output result IF with the same external output result No.\nIF process type: {1}\nData No.: {2}\nData row No.: {3}\nExternal output result No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0632' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0632',
	'en_US',
	'W',
	'For a payment received method with the Payment received entry type "Not available to enter", you cannot enter payment received info.\nData No.: {1}\nData row No.: {2}\nPayment received method: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0633' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0633',
	'en_US',
	'W',
	'In the data to be imported this time, there is data in which a pair of the External system cd. and External payment received No. is duplicated.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal payment received No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0634' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0634',
	'en_US',
	'W',
	'Cannot import from an external system in which the External system type other than "FB" is specified.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0635' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0635',
	'en_US',
	'I',
	'Starting the order IF import processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0636' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0636',
	'en_US',
	'I',
	'The order IF import processing completed.\nTo process: {1}\nNumber of entries: {2}\nNumber of errors: {3}\nNumber of skips: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0637' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0637',
	'en_US',
	'W',
	'An error has occurred in the order IF import processing. \nData No.: {1} \nData row No.: {2} \nMessage ID: {3} \nMessage: \n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0638' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0638',
	'en_US',
	'W',
	'Could not import since an error occurred in the data which was previously processed for the same External system cd. and External item order No.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal item order No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0639' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0639',
	'en_US',
	'I',
	'Skipped since data with a larger External system data No. was previously processed for the same External system cd. and External item order No.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal item order No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0640' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0640',
	'en_US',
	'W',
	'Cannot import since the same operation order already exist.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal item order No.: {4}\nExternal operation order No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0641' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0641',
	'en_US',
	'W',
	'Cannot import since the corresponding operation order could not be acquired.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0642' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0642',
	'en_US',
	'W',
	'Cannot import since multiple records of the corresponding order info. have been acquired.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0643' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0643',
	'en_US',
	'W',
	'Could not import since an error occurred in another operation order with the same External item order No.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0644' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0644',
	'en_US',
	'W',
	'In the data to be imported this time, there is data in which a combination of the External item order No. and External operation order No. is duplicated.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0645' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0645',
	'en_US',
	'W',
	'Cannot import since there are operation orders that are not linked to the External operation order No.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal item order No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0646' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0646',
	'en_US',
	'W',
	'Cannot import since multiple records of corresponding operation orders have been acquired.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0647' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0647',
	'en_US',
	'W',
	'For the Item order type, specify either "Mfg." or "Subcontracting".\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal item order No.: {4}\nExternal operation order No.: {5}\nItem order type: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0648' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0648',
	'en_US',
	'W',
	'The target operation order contains the operation cd. and operation sequence numbers which do not exist in the Item Operation master.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal item order No.: {4}\nExternal operation order No.: {5}\nOperation cd.: {6}\nOperation sequence number: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0649' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0649',
	'en_US',
	'W',
	'The operation order is insufficient. Check the Item Operation master.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal item order No.: {4}\nLocation cd.: {5}\nItem: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0650' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0650',
	'en_US',
	'W',
	'Cannot import since an error occurred in other details for the same sale order No.\nSee the Batch Log Check for more details.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}\nCustomer order details No.: {5}\nSales order No.: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0651' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0651',
	'en_US',
	'W',
	'Cannot specify a unit which does not exist in the Item Unit master.\nData No.: {1}\nData row No.: {2}\nItem: {3}\nUnit: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0652' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0652',
	'en_US',
	'W',
	'Cannot import since an error has occurred in the shipping information which was previously processed for the same Shipping point distribution group, External system cd., and External shipping result No.\nData No.: {1}\nData row No.: {2}\nShipping point distribution group: {3}\nExternal system cd.: {4}\nExternal shipping result No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0653' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0653',
	'en_US',
	'W',
	'Cannot import since the Tax cd. specified at the time of sales order does not exist in the Tax master.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}\nCustomer order details No.: {5}\nSales order No.: {6}\nSales order details No.: {7}\nTax at the time of sales order: {8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0654' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0654',
	'en_US',
	'W',
	'Cannot import since the Tax cd. specified in the invoice does not exist in the Tax master.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nInvoice No.: {4}\nInvoice details No.: {5}\nCustomer order No.: {6}\nCustomer order details No.: {7}\nTax on invoice: {8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0655' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0655',
	'en_US',
	'W',
	'Cannot import since the Tax cd. specified in the delivery note does not exist in the Tax master.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nDelivery note No.: {4}\nDelivery note details No.: {5}\nTax on delivery note: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0700' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0700',
	'en_US',
	'I',
	'Starting the Item Master Export IF processing.\nExternal system cd.: {1}\nMaster application date: {2}\nWG cd.: {3}\nMfg. location group cd.: {4}\nLinkage scheduler type: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0701' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0701',
	'en_US',
	'I',
	'The Item Master Export IF processing completed.\nProcessed: {1}\nNumber of entries: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0702' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0702',
	'en_US',
	'W',
	'The required columns have not been entered.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0703' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0703',
	'en_US',
	'W',
	'An error occurred in calling the GA API.\nSee the error message on the PO Export (IF) screen.\nData No.: {1}\nPO No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0704' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0704',
	'en_US',
	'W',
	'{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0705' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0705',
	'en_US',
	'W',
	'The data could not be reflected in GA because an error occurred on another voucher while sending multiple POs at once.\nResend the unreflected data from the PO List Entry screen.\nData No.: {1}\nPO No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0706' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0706',
	'en_US',
	'I',
	'Starting the Item Operation Master Export IF processing.\nExternal system cd.: {1}\nMaster application date: {2}\nWG cd.: {3}\nMfg. location group cd.: {4}\nFactory/Distribution warehouse cd.: {5}\nLocation cd.: {6}\nLinkage scheduler type: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0707' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0707',
	'en_US',
	'I',
	'The Item Operation Master Export IF processing completed.\nProcessed: {1}\nNumber of entries: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0708' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0708',
	'en_US',
	'I',
	'Starting the Item Details Master Export IF processing.\nExternal system cd.: {1}\nMaster application date: {2}\nWG cd.: {3}\nMfg. location group cd.: {4}\nFactory/Distribution warehouse cd.: {5}\nMfg. location cd.: {6}\nLinkage scheduler type: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0709' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0709',
	'en_US',
	'I',
	'The Item Details Master Export IF processing completed.\nProcessed: {1}\nNumber of entries: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0710' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0710',
	'en_US',
	'I',
	'Starting the BOM Master Export IF processing.\nExternal system cd.: {1}\nMaster application date: {2}\nWG cd.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0711' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0711',
	'en_US',
	'I',
	'The BOM Master Export IF processing completed.\nProcessed: {1}\nNumber of entries: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0712' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0712',
	'en_US',
	'I',
	'Starting the Location Master Export IF processing.\nExternal system cd.: {1}\nWG cd.: {2}\nFactory/distribution warehouse: {3}\nLocation: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0713' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0713',
	'en_US',
	'I',
	'The Location Master Export IF processing completed.\nProcessed: {1}\nNumber of entries: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0714' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0714',
	'en_US',
	'I',
	'Starting the Work Calendar Master Export IF processing.\nExternal system cd.: {1}\nMaster application date: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0715' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0715',
	'en_US',
	'I',
	'The Work Calendar Master Export IF processing completed.\nProcessed: {1}\nNumber of entries: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0716' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0716',
	'en_US',
	'I',
	'Starting the Temporary Calendar Master Export IF processing.\nExternal system cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0717' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0717',
	'en_US',
	'I',
	'The Temporary Calendar Master Export IF processing completed.\nProcessed: {1}\nNumber of entries: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0718' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0718',
	'en_US',
	'I',
	'Starting the GR Schedule Export IF processing.\nExternal system cd.: {1}\nWG cd.: {2}\nMfg. location group cd.: {3}\nFactory/Distribution warehouse cd.: {4}\nMfg. location cd.: {5}\nTerm FROM: {6}\nTerm TO: {7}\nLinkage scheduler type: {8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0719' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0719',
	'en_US',
	'I',
	'The  GR Schedule Export IF processing completed.\nProcessed: {1}\nNumber of entries: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0720' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0720',
	'en_US',
	'I',
	'Starting the GI Schedule Export IF processing.\nExternal system cd.: {1}\nWG cd.: {2}\nMfg. location group cd.: {3}\nFactory/Distribution warehouse cd.: {4}\nMfg. location cd.: {5}\nTerm FROM: {6}\nTerm TO: {7}\nLinkage scheduler type: {8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0721' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0721',
	'en_US',
	'I',
	'The GI Schedule Export IF processing completed.\nProcessed: {1}\nNumber of entries: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0722' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0722',
	'en_US',
	'I',
	'Starting the Inventory Info. Export IF processing.\nExternal system cd.: {1}\nWG cd.: {2}\nMfg. location group cd.: {3}\nFactory/Distribution warehouse cd.: {4}\nMfg. location cd.: {5}\nLinkage scheduler type: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0723' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0723',
	'en_US',
	'I',
	'The Inventory Info. Export IF processing completed.\nProcessed: {1}\nNumber of entries: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0724' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0724',
	'en_US',
	'I',
	'Starting the Daily Demand Export IF processing.\nExternal system cd.: {1}\nWG cd.: {2}\nFactory/distribution warehouse: {3}\nLocation: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0725' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0725',
	'en_US',
	'I',
	'The Daily Demand Export IF processing completed.\nProcessed: {1}\nNumber of entries: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0726' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0726',
	'en_US',
	'I',
	'Starting the Order Export IF processing.\nExternal system cd.: {1}\nWG cd.: {2}\nMfg. location group cd.: {3}\nFactory/Distribution warehouse cd.: {4}\nMfg. location cd.: {5}\nTerm FROM: {6}\nTerm TO: {7}\nInclude unfirm: {8}\nLinkage scheduler type: {9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0727' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0727',
	'en_US',
	'I',
	'The Order Export IF processing completed.\nProcessed: {1}\nNumber of entries: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0728' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0728',
	'en_US',
	'I',
	'Excluded from the export process because an error has occurred in the previously processed data with the same PO No.\nData No.: {1}\nPO No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0729' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0729',
	'en_US',
	'W',
	'The data could not be reflected in GA because an error occurred on the same PO No. in another PO export processing.\nData No.: {1}\nData row No.: {2}\nPO No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0730' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0730',
	'en_US',
	'I',
	'Starting the Delivery Order IF Import processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0731' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0731',
	'en_US',
	'I',
	'The Delivery Order IF Import processing completed. \nProcessed: {1}\nNumber of entries: {2} \nNumber of errors: {3}\nNumber of skips: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0732' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0732',
	'en_US',
	'W',
	'An error has occurred in the Delivery Order IF Import processing.\nData No.: {1} \nData row No.: {2} \nMessage ID: {3} \nMessage: \n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0733' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0733',
	'en_US',
	'W',
	'Could not import since an error occurred in the importing processing for another delivery order with the same Customer, Customer order No., and Customer order details No. \nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}\nCustomer order details No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0734' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0734',
	'en_US',
	'W',
	'Cannot import since multiple data of corresponding sales order information can be acquired.\nData No.: {1} \nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0735' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0735',
	'en_US',
	'W',
	'Cannot import since the corresponding sales order information cannot be acquired.\nData No.: {1} \nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0736' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0736',
	'en_US',
	'W',
	'Cannot import the delivery order since sales order details have been cancelled.  \nData No.: {1} \nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}\nCustomer order details No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0737' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0737',
	'en_US',
	'W',
	'A different PO rev. number has been set for delivery orders with the same Customer, Customer order No., and Customer order details No.\nData No.: {1} \nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}\nCustomer order details No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0738' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0738',
	'en_US',
	'W',
	'An item different from the one at the time of placing order cannot be specified.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}\nCustomer order details No.: {5}\nItem at the time of placing order: {6}\nItem in IF data: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0739' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0739',
	'en_US',
	'W',
	'Could not import since an error occurred in the Delivery Order IF Import processing.\nData No.: {1}\nData row No.: {2}\nMessage ID: {3}\nMessage: \n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0741' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0741',
	'en_US',
	'W',
	'Cannot import the delivery order since the Shipping order type of sales order details is “Without picking”.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}\nCustomer order details No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0742' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0742',
	'en_US',
	'W',
	'Could not import since an error occurred in data which was previously processed for the same Customer, Customer order No., and Customer order details No. \nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}\nCustomer order details No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0743' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0743',
	'en_US',
	'W',
	'Skipped since data with a larger external system data No. was previously processed for the same Customer, Customer order No., and Customer order details No.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}\nCustomer order details No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0744' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0744',
	'en_US',
	'W',
	'A unit different from the one at the time of placing order cannot be specified.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}\nCustomer order details No.: {5}\nTransaction unit at the time of placing order: {6}\nTransaction unit in IF data: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0745' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0745',
	'en_US',
	'W',
	'The number of decimal places in the transaction unit qty. is incorrect.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}\nCustomer order details No.: {5}\nTransaction unit: {6}\nTransaction unit qty.: {7}\nNumber of decimal places: {8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0747' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0747',
	'en_US',
	'W',
	'Cannot import the delivery order since the remaining sales order details are cancelled. \nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}\nCustomer order details No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0748' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0748',
	'en_US',
	'W',
	'Cannot import since the same customer delivery order already exists.\nData No.: {1}\nData row No.: {2}\nCustomer: {3}\nCustomer order No.: {4}\nCustomer order details No.: {5}\nCustomer delivery order No.: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0750' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0750',
	'en_US',
	'I',
	'Starting the Billing IF Import processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0751' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0751',
	'en_US',
	'I',
	'The Billing IF Import processing completed.\nTo process: {1} \nNumber of entries: {2} \nNumber of errors: {3} \nNumber of skips: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0752' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0752',
	'en_US',
	'W',
	'Could not import since an error occurred in the data which was previously processed for the same billing source, and invoice No.\nData No.: {1} \nData row No.: {2}\nBilling source cd.: {3}\nInvoice No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0753' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0753',
	'en_US',
	'W',
	'Skipped since data with a larger External system data No. was previously processed for the same billing source and invoice No.\nData No.: {1} \nData row No.: {2}\nBilling source cd.: {3}\nInvoice No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0754' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0754',
	'en_US',
	'W',
	'Could not import since an error occurred in the other billing import processing for the same billing source and invoice No. \nData No.: {1} \nData row No.: {2}\nBilling source cd.: {3}\nInvoice No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0755' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0755',
	'en_US',
	'W',
	'An error has occurred in the Billing IF Import processing.\nData No.: {1}\nData row No.: {2}\nMessage ID: {3}\nMessage: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0756' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0756',
	'en_US',
	'W',
	'Cannot import data other than Data update type "New".\nData No.: {1} \nData row No.: {2}\nBilling source cd.: {3}\nInvoice No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0757' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0757',
	'en_US',
	'W',
	'In the data to be imported this time, there is data in which the combination of the billing source cd., invoice No., and billing details No. is duplicated.\nData No.: {1} \nData row No.: {2}\nBilling source cd.: {3}\nInvoice No.: {4}\nBilling details No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0758' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0758',
	'en_US',
	'W',
	'There is data whose header columns values are different from others with the same external system data No., billing source cd., and invoice No.\nData No.: {1}\nData row No. {2}\nBilling source cd.: {3}\nInvoice No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0759' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0759',
	'en_US',
	'W',
	'Error occurred in: {1}\nError occurred at: {2}\nCompany: {3}\nBilling source cd.: {4}\nError content: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0760' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0760',
	'en_US',
	'W',
	'Cannot import data whose Data update type is other than "New" when the Planned order refresh flg. is enabled.\nSet the Data update type of all import target data to "New". \nData No.: {1} \nData row No.: {2} \nExternal system cd.: {3} \nExternal item order No.: {4} \nExternal operation order No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0761' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0761',
	'en_US',
	'I',
	'Billing export IF data has been created.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0762' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0762',
	'en_US',
	'W',
	'Error occurred in: {1}\nError occurred at: {2}\nCompany: {3}\nBilling customer cd.: {4}\nInvoice No.: {5}\nError content: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0763' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0763',
	'en_US',
	'W',
	'The setting of the IF Communication Rules master is incorrect.\nCheck the following in the IF Communication Rules master: \n - FILE_USE_HEADING must be "true" \n - SEND_FILE_GRP must be "2"\nIF process type: {1}\nExternal system cd.: {2}\nData No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0764' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0764',
	'en_US',
	'W',
	'An error has occurred during the export conversion processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0901' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0901',
	'en_US',
	'I',
	'The following argument is invalid for the specified Linkage scheduler type. The condition of the specified argument was ignored.\nLinkage scheduler type: {1}\nArgument name: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0902' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0902',
	'en_US',
	'W',
	'Cannot import since there is no item order info. to be updated.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal item order No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0903' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0903',
	'en_US',
	'W',
	'Cannot import since the Item order status type of item order info. to be updated is not "Save".\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal item order No.: {4}\nItem order status type: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0904' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0904',
	'en_US',
	'W',
	'Cannot import the item order info. to be updated since the order has not been exported. \nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal item order No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0905' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0905',
	'en_US',
	'W',
	'Could not import since an error occurred in the other order import IF data.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal item order No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0906' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0906',
	'en_US',
	'W',
	'Could not firm an item order subject to scheduler freeze since operation orders associated with the item order included operation orders before freezing.\nItem order No.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0907' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0907',
	'en_US',
	'I',
	'Starting the Operation Order Result Export IF processing.\nExternal system cd.: {1}\nWG cd.: {2}\nMfg. location group cd.: {3}\nFactory/Distribution warehouse cd.: {4}\nMfg. location cd.: {5}\nTerm FROM: {6}\nTerm TO: {7}\nLinkage scheduler type: {8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0908' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0908',
	'en_US',
	'I',
	'The Operation Order Result Export IF processing completed.\nTo process: {1}\nNumber of entries: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0909' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0909',
	'en_US',
	'W',
	'The specified Linkage scheduler type is invalid.\nSpecify "2: FLEXSCHE" for the Linkage scheduler type.\nLinkage scheduler type: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0910' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0910',
	'en_US',
	'I',
	'Starting the processing. (Execute the Scheduler IF file linkage service)');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0911' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0911',
	'en_US',
	'W',
	'Set "FLEXSCHE" for the Linkage scheduler type.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0912' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0912',
	'en_US',
	'W',
	'The specified IF process type is not subject to the processing.\nIF process type: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0913' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0913',
	'en_US',
	'W',
	'No path to the linkage target is entered in the resource.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0914' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0914',
	'en_US',
	'W',
	'The path to the linkage target does not exist.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0915' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0915',
	'en_US',
	'W',
	'No file to be linked is entered in the resource.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0916' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0916',
	'en_US',
	'W',
	'The file to be linked does not exist.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0917' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0917',
	'en_US',
	'W',
	'No local directory is set in the IF Communication Rules master.\nExternal system cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0918' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0918',
	'en_US',
	'I',
	'Skipped the export processing since the following file does not exist in the specified folder.\nFile name: {1}\nFolder: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0919' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0919',
	'en_US',
	'I',
	'The processing completed. (Execute the Scheduler IF file linkage service)');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0920' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0920',
	'en_US',
	'I',
	'The export processing completed.\nProcessed: {1}\nNumber of entries: {2}\nNumber of errors: {3}\nNumber of skips: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0921' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0921',
	'en_US',
	'I',
	'The import processing completed.\nProcessed: {1}\nNumber of entries: {2}\nNumber of errors: {3}\nNumber of skips: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0922' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0922',
	'en_US',
	'W',
	'When the Linkage scheduler type is "FLEXSCHE", the Order type is "Subcontracting", and the Allow subcontracting scheduling flag is turned off, various date information cannot be updated.\nTherefore, the import processing cannot be performed for data in which the following information changes after import: the "Scheduled operation start date and time" in the operation order information or the "Available date" in the item order information.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal item order No.: {4}\nScheduled operation start date and time: {5}\nAvailable date: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0923' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0923',
	'en_US',
	'I',
	'Starting the Order Allocation Export IF processing.\nExternal system cd.: {1}\nWG cd.: {2}\nMfg. location group cd.: {3}\nFactory/Distribution warehouse cd.: {4}\nMfg. location cd.: {5}\nTerm FROM: {6}\nTerm TO: {7}\nLinkage scheduler type: {8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0924' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0924',
	'en_US',
	'I',
	'The Order Allocation Export IF processing completed.\nTo process: {1}\nNumber of entries: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0925' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0925',
	'en_US',
	'I',
	'Starting the Item Details BOM Master Export IF proessing.\nExternal system cd.: {1}\nMaster application date: {2}\nWG cd.:{3}\nMfg. location group cd.: {4}\nFactory/distribution warehouse cd.: {5}\nMfg. location cd.: {6}\nLinkage scheduler type: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0926' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0926',
	'en_US',
	'I',
	'The Item Details BOM Master Export IF processing completed.\nTo process: {1}\nNumber of entries: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0927' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0927',
	'en_US',
	'I',
	'Starting the Result Qty. Export IF processing.\nExternal system cd.: {1}\nWG cd.: {2}\nMfg. location group cd.: {3}\nFactory/distribution warehouse cd.: {4}\nMfg. location cd.: {5}\nTerm FROM: {6}\nTerm TO: {7}\nLinkage scheduler type: {8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0928' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0928',
	'en_US',
	'I',
	'The Result Qty. Export IF processing completed.\nTo process: {1}\nNumber of entries: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0929' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0929',
	'en_US',
	'W',
	'Cannot cancel the remaining processing at the same time as new entry. Turn off the Cancel remaining flg. before importing.\nData No.: {1}\nData row No.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0930' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0930',
	'en_US',
	'W',
	'Cannot import since the item in the item order info. to be updated does not match the item in the import target data.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal item order No.: {4}\nItem: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0931' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0931',
	'en_US',
	'W',
	'An error occurred in a record with a different IF process type or External result No. linked to the same mfg. order.\nCheck for other records that have a "MSLAL0095" or "MSLAL0096" error.\nIF process type: {1}\nData No.: {2}\nData row No.: {3}\nMfg. order No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0932' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0932',
	'en_US',
	'W',
	'An error occurred in the import processing of an operation result linked to the same mfg. order. Check the record of the operation result where the error occurred.\nIF process type: {1}\nData No.: {2}\nData row No.: {3}\nMfg. order No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0933' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0933',
	'en_US',
	'W',
	'Cannot import since the tax on the sales date does not exist in the Tax master.\nData No.: {1}\nData row No.: {2}\nTax cd. on the sales date: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0934' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL0934',
	'en_US',
	'W',
	'If it is subject to tax check, you cannot specify a tax different from the one on the sales date.\nData No.: {1}\nData row No.: {2}\nTax cd. on the sales date: {3}\nTax cd. corresponding to the tax rate, tax type, tax inclusive in IF data: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1001',
	'en_US',
	'I',
	'Starting the inspection result IF import processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1002',
	'en_US',
	'I',
	'The inspection result IF import processing completed.\nTo process: {1}\nNumber of entries: {2}\nNumber of errors: {3}\nNumber of skips: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1003',
	'en_US',
	'W',
	'Cannot import the data because the Import decision only flg. cannot be turned on when the Data update type is New.\nData No.: {1}\nData row No.: {2}\nInspection No.: {3}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1004',
	'en_US',
	'W',
	'Cannot import the data because the Import decision only flg. cannot be turned on when the Data update type is Update or Delete and the target records have a value in the External inspection result details No. or External inspection sampling result No.\nData update type: {1}\nData No.: {2}\nData row No.: {3}\nExternal inspection result No.: {4}\nExternal inspection result details No.: {5}\nExternal inspection sampling result No.: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1005',
	'en_US',
	'W',
	'Cannot import the data because both of the External inspection result details No. and the External inspection sampling result No. are specified. Specify only one of them.\nData No.: {1}\nData row No.: {2}\nExternal inspection result details No.: {3}\nExternal inspection sampling result No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1006',
	'en_US',
	'W',
	'Cannot import the data because the Data update type is New and the set External inspection result details No. or External inspection sampling result No. already exist.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal inspection result details No.: {4}\nExternal inspection sampling result No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1007',
	'en_US',
	'W',
	'Cannot import data with Data update type New because the specified External inspection result No. has already been registered and no External inspection result details No. or External inspection sampling result No. is specified.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal inspection result No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1008',
	'en_US',
	'W',
	'Cannot import the data because inspection results associated with the specified External system cd. and External inspection result No. cannot be acquired.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal inspection result No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1009',
	'en_US',
	'W',
	'Cannot import the data because inspection result details associated with the specified External system cd. and External inspection result details No. cannot be acquired.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal inspection result details No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1010',
	'en_US',
	'W',
	'Cannot import the data because inspection sampling details associated with the specified External system cd. and External inspection sampling result No. cannot be acquired.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal inspection sampling result No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1011',
	'en_US',
	'W',
	'Cannot import the data because the specified Inspection No. does not match the Inspection No. acquired from the External inspection result No.\nData No.: {1}\nData row No.: {2}\nSpecified Inspection No.: {3}\nExternal inspection result No.: {4}\nAcquired Inspection No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1012',
	'en_US',
	'W',
	'Cannot import the data because the specified Inspection No. does not match the Inspection No. acquired from the External inspection result details No.\nData No.: {1}\nData row No.: {2}\nSpecified Inspection No.: {3}\nExternal inspection result details No.: {4}\nAcquired Inspection No.: {5}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1013',
	'en_US',
	'W',
	'Cannot import the data because the specified Inspection No. does not match the Inspection No. acquired from the External inspection sampling result No.\nData No.: {1}\nData row No.: {2}\nSpecified Inspection No.: {3}\nExternal inspection sampling result No.: {4}\nAcquired Inspection No.: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1014',
	'en_US',
	'W',
	'Cannot import the data because the header columns in the inspection results acquired from the specified External inspection result No. do not match the header columns of IF records.\nData No.: {1}\nData row No.: {2}\nExternal inspection result No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1015',
	'en_US',
	'W',
	'Cannot import the data because the number (External inspection result details No. or External inspection sampling result No.) that do not match the Inspection method type of inspection order acquired from the specified Inspection No. is specified. Specify as follows.\nFor 100% inspection, External inspection result details No.; For other cases, External inspection sampling result No.\nData No.: {1}\nData row No.: {2}\nInspection No.:{3}\nInspection method type: {4}\nExternal inspection result details No.: {5}\nExternal inspection sampling result No.: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1016',
	'en_US',
	'W',
	'Could not import because an error occurred in the data which was previously processed for the same Inspection No.\nData No.: {1}\nData row No.: {2}\nInspection No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1017',
	'en_US',
	'W',
	'Skipped because data with a larger External system data No. was previously processed for the same Inspection No.\nData No.: {1}\nData row No.: {2}\nInspection No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1018',
	'en_US',
	'W',
	'Cannot enter a decision because the inspection result is uncompleted.\nData No.: {1}\nData row No.: {2}\nInspection No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1019',
	'en_US',
	'W',
	'Cannot import the data because the current inventory information corresponding to the following information cannot be acquired.\nData No.: {1}\nData row No.: {2}\nInspection schedule No.: {3}\nInventory location cd.: {4}\nInventory rack/line cd.: {5}\nSKU cd.: {6}\nBase unit cd.: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1020',
	'en_US',
	'W',
	'Cannot import the data because within the same External system cd., Data No., Data update type, and Inspection No., you cannot mix records with the Import decision only flg. ON and OFF.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal system data No.: {4}\nData update type: {5}\nInspection No.: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1021',
	'en_US',
	'W',
	'Cannot import the data because within the same External system cd., Data No., Data update type, and Inspection No., you cannot mix records with and without specified External inspection result details No. or External inspection sampling result No.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal system data No.: {4}\nData update type: {5}\nInspection No.: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1022',
	'en_US',
	'W',
	'An error occurred in the inspection result IF import processing.\nData No.: {1}\nData row No.: {2}\nMessage ID: {3}\nMessage: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1023',
	'en_US',
	'W',
	'Cannot import the data because the specified Inspection schedule No. was not found in the inspection schedules associated with the Inspection No.\nData No.: {1}\nData row No.: {2}\nInspection No.: {3}\nInspection schedule No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1024',
	'en_US',
	'W',
	'Decisions cannot be entered because only inspection approval PIC can enter decisions.\nData No.: {1}\nData row No.: {2}\nDecision PIC cd.:{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1025',
	'en_US',
	'W',
	'Decisions cannot be entered because the inspection approval function is inactive.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1026',
	'en_US',
	'W',
	'The decision cannot be entered because it is not subject to inspection approval.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nInspection No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1027' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1027',
	'en_US',
	'W',
	'Cannot import the data because there are records with inconsistent header column values within the same External system cd., External system data No., Data update type, External inspection result No.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal system data No.: {4}\nData update type: {5}\nExternal inspection result No.: {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1028' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1028',
	'en_US',
	'W',
	'Cannot import the data because the External inspection result No. is duplicated within the same import unit.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal system data No.: {4}\nData update type: {5}\nInspection No.: {6}\nExternal inspection result No.: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1029' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1029',
	'en_US',
	'W',
	'Cannot import the data because the External inspection result details No. is duplicated within the same import unit.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal system data No.: {4}\nData update type: {5}\nInspection No.: {6}\nExternal inspection result details No.: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1030' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1030',
	'en_US',
	'W',
	'Cannot import the data because the External inspection sampling result No. is duplicated within the same import unit.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nExternal system data No.: {4}\nData update type: {5}\nInspection No.: {6}\nExternal inspection sampling result No.: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1031' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1031',
	'en_US',
	'W',
	'Could not import the data because an error occurred in another inspection result import processing for the same Inspection No.\nData No.: {1}\nData row No.: {2}\nInspection No.: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1032' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLAL1032',
	'en_US',
	'W',
	'Cannot enter a new movement result since the movement has been completed.\nData No.: {1}\nData row No.: {2}\nMovement order No.: {3}\nMovement allocation status No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCB0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCB0001',
	'en_US',
	'W',
	'No value is set for the IF process type: bi_ope.\nIF process type: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCB0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCB0002',
	'en_US',
	'W',
	'Invalid value is set for the IF process type: bi_ope.\nIF process type: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCB0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCB0003',
	'en_US',
	'W',
	'The specified IF process type does not exist.\nIF process type: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCB0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCB0004',
	'en_US',
	'W',
	'The specified IF process type is not subject to the processing.\nIF process type: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCB0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCB0005',
	'en_US',
	'I',
	'Starting the BI Link batch processing.\nIF process type: {1}\nExternal system cd.: {2}\nYear and month: {3}\nCalculation group cd.: {4}\nCalculation No.: {5}\nFirm only: {6}\nCompany cd.: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCB0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCB0006',
	'en_US',
	'I',
	'The BI Link batch processing completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0001',
	'en_US',
	'W',
	'Invalid value is set for the IF process type. \nIF process type: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0002',
	'en_US',
	'I',
	'Starting the GR/GI Schedule Export IF processing.\nCompany cd.: {1}\nIF process type: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0003',
	'en_US',
	'I',
	'The GR/GI Schedule Export IF processing completed.\nCompany cd.: {1}\nProcessed: {2}\nNumber of new records: {3}\nNumber of errors: {4}\nNumber of deleted records: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0004',
	'en_US',
	'I',
	'Starting the Ending Inventory Export IF processing.\nCompany cd.: {1}\nIF process type: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0005',
	'en_US',
	'I',
	'The Ending Inventory Export IF processing completed.\nCompany cd.: {1}\nProcessed: {2}\nNumber of new records: {3}\nNumber of errors: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0006',
	'en_US',
	'I',
	'Starting the GR/GI Result Export IF processing.\nCompany cd.: {1}\nIF process type: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0007',
	'en_US',
	'I',
	'The GR/GI Result Export IF processing completed.\nCompany cd.: {1}\nProcessed: {2}\nNumber of new records: {3}\nNumber of errors: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0008',
	'en_US',
	'I',
	'Starting the Item Order Info. Export IF processing.\nCompany cd.: {1}\nIF process type: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0009',
	'en_US',
	'I',
	'The Item Order Info. Export IF processing completed.\nCompany cd.: {1}\nProcessed: {2}\nNumber of new records: {3}\nNumber of errors: {4}\nNumber of deleted records: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0010',
	'en_US',
	'I',
	'Starting the Shipping Progress Export IF processing.\nCompany cd.: {1}\nIF process type: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0011',
	'en_US',
	'I',
	'The Shipping Progress Export IF processing completed.\nCompany cd.: {1}\nProcessed: {2}\nNumber of new records: {3}\nNumber of errors: {4}\nNumber of deleted records: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0012',
	'en_US',
	'I',
	'Starting the Non-moving Inventory Info. Export IF processing.\nCompany cd.: {1}\nIF process type: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0013',
	'en_US',
	'I',
	'The Non-moving Inventory Info. Export IF processing completed.\nCompany cd.: {1}\nProcessed: {2}\nNumber of new records: {3}\nNumber of errors: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0014',
	'en_US',
	'W',
	'There is data that failed to set the Batch log No., the Log subkey 1, and the Log subkey 2.\nSee the IF Data Export Status screen for details.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0015',
	'en_US',
	'I',
	'Starting the GR/GI Schedule Export IF processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0016',
	'en_US',
	'I',
	'The GR/GI Schedule Export IF processing completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0017',
	'en_US',
	'I',
	'Starting the Ending Inventory Export IF processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0018',
	'en_US',
	'I',
	'The Ending Inventory Export IF processing completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0019',
	'en_US',
	'I',
	'Starting the GR/GI Result Export IF processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0020',
	'en_US',
	'I',
	'The GR/GI Result Export IF processing completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0021',
	'en_US',
	'I',
	'Starting the Item Order Info. Export IF processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0022',
	'en_US',
	'I',
	'The Item Order Info. Export IF processing completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0023',
	'en_US',
	'I',
	'Starting the Shipping Progress Export IF processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0024',
	'en_US',
	'I',
	'The Shipping Progress Export IF processing completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0025',
	'en_US',
	'I',
	'Starting the Non-moving Inventory Info. Export IF processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0026',
	'en_US',
	'I',
	'The Non-moving Inventory Info. Export IF processing completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0101' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0101',
	'en_US',
	'I',
	'Starting the Receipt Progress Export IF processing.\nCompany cd.: {1}\nIF process type: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0102' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0102',
	'en_US',
	'I',
	'The Receipt Progress Export IF processing completed.\nCompany cd.: {1}\nProcessed: {2}\nNumber of new records: {3}\nNumber of errors: {4}\nNumber of deleted records: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0103' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0103',
	'en_US',
	'I',
	'Starting the Inspection Result Export IF processing.\nCompany cd.: {1}\nIF process type: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0104' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0104',
	'en_US',
	'I',
	'The Inspection Result Export IF processing completed.\nCompany cd.: {1}\nProcessed: {2}\nNumber of new records: {3}\nNumber of errors: {4}\nNumber of deleted records: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0105' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0105',
	'en_US',
	'I',
	'Starting the Receipt Progress Export IF processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0106' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0106',
	'en_US',
	'I',
	'The Receipt Progress Export IF processing completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0107' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0107',
	'en_US',
	'I',
	'Starting the Inspection Result Export IF processing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0108' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSLCL0108',
	'en_US',
	'I',
	'The Inspection Result Export IF processing completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUAL0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSUAL0006',
	'en_US',
	'W',
	'Not entered in the Item Details master as a configuration pattern corresponding to the application date, item, WG, and mfg. location.\nApplication date: {1}\nItem: {2}\nWG cd.: {3}\nMfg. location cd.: {4}\nSupplier cd.: {5}\nMaker cd.: {6}\nRequested location cd.: {7}\n{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUAL0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSUAL0007',
	'en_US',
	'W',
	'Not entered as a valid supplier in the Location master.\nLocation cd.: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUAL0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSUAL0008',
	'en_US',
	'W',
	'Not entered in the Item Operation master as a location corresponding to the application date, item, operation pattern, the Operation cd., and operation sequence number.\nApplication date: {1}\nItem: {2}\nOperation pattern: {3}\nOperation cd.: {4}\nOperation sequence number: {5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUBP0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSUBP0001',
	'en_US',
	'W',
	'Implement the mode specification method (setSnoMode).');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUBP0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSUBP0002',
	'en_US',
	'W',
	'No row for screen transition is selected.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCP0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSUCP0001',
	'en_US',
	'W',
	'Specify the period to be within 93 days.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCP0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSUCP0002',
	'en_US',
	'W',
	'Specify the period to be within 60 months.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCP0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSUCP0003',
	'en_US',
	'W',
	'Could not acquire the AP closing month. Perform the purchase closing and the payment closing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCP0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSUCP0004',
	'en_US',
	'W',
	'Could not acquire the AR closing month. Perform the sales closing and the payment received closing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCP0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSUCP0005',
	'en_US',
	'W',
	'Could not acquire the payment closing month. Perform the payment closing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCP0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSUCP0006',
	'en_US',
	'W',
	'Could not acquire the purchase closing month. Perform the purchase closing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCP0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSUCP0007',
	'en_US',
	'W',
	'Could not acquire the payment received closing month. Perform the deposit closing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCP0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSUCP0008',
	'en_US',
	'W',
	'Could not acquire the sales closing month. Perform the sales closing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCP0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSUCP0009',
	'en_US',
	'W',
	'Could not acquire the inventory closing month. Perform the inventory closing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCP0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSUCP0010',
	'en_US',
	'W',
	'If you specify a parent item, also specify a WG, a configuration pattern and a master application date.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCP0101' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSUCP0101',
	'en_US',
	'W',
	'Specify the period to be within 3 years.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCP0102' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSUCP0102',
	'en_US',
	'W',
	'Specify the period to be within 498 days.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCL0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSUCL0001',
	'en_US',
	'W',
	'Cannot process since the required authority for the login user is not entered in the PIC Authority master.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCL0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSUCL0002',
	'en_US',
	'W',
	'Could not acquire the AP closing month. Perform the purchase closing and the payment closing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCL0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSUCL0003',
	'en_US',
	'W',
	'Could not acquire the AR closing month. Perform the sales closing and the payment received closing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCL0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSUCL0004',
	'en_US',
	'W',
	'Could not acquire the payment closing month. Perform the payment closing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCL0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSUCL0005',
	'en_US',
	'W',
	'Could not acquire the purchase closing month. Perform the purchase closing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCL0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSUCL0006',
	'en_US',
	'W',
	'Could not acquire the payment received closing month. Perform the payment received closing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCL0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSUCL0007',
	'en_US',
	'W',
	'Could not acquire the sales closing month. Perform the sales closing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCL0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSUCL0008',
	'en_US',
	'W',
	'Could not acquire the inventory closing month. Perform the inventory closing.');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCL0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSUCL0009',
	'en_US',
	'W',
	'SEIBAN No.1 is required since "2. Manage (required)" is specified for the SEIBAN No.1 management type in the Item master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCL0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSUCL0010',
	'en_US',
	'W',
	'SEIBAN No.2 is required since "2. Manage (required)" is specified for the SEIBAN No.2 management type in the Item master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCL0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSUCL0011',
	'en_US',
	'W',
	'SEIBAN No.3 is required since "2. Manage (required)" is specified for the SEIBAN No.3 management type in the Item master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCL0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSUCL0012',
	'en_US',
	'W',
	'SEIBAN No.4 is required since "2. Manage (required)" is specified for the SEIBAN No.4 management type in the Item master.\nItem: {1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCL0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSUCL0020',
	'en_US',
	'W',
	'There is an error in the header column. See the {1} row for details of the error.\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCL0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MSUCL0021',
	'en_US',
	'W',
	'There is an error in other detail rows linked to the same header.\nRow No. of other details: {1}\n{2}');
