DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0001',
	'en_US',
	'E',
	'Failed to display the screen.\nThis screen cannot be opened separately.\nUse it as a child screen, or embed it in another screen.\nModule ID: {1}\nScreen ID: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0002',
	'en_US',
	'E',
	'A non-numeric string is defined as an element in the font ratio list.\nThe font ratio list will be created, ignoring this element.\nCheck the definition of the resource.\nElement: {1}\nResource Key: {2}\nResource value: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0003',
	'en_US',
	'E',
	'Failed to display the screen.\nA table must be specified.\nModule ID: {1}\nScreen ID: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0004',
	'en_US',
	'I',
	'The user setting will be discarded and the system setting will be restored. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0005',
	'en_US',
	'I',
	'The system setting has been restored.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0006',
	'en_US',
	'W',
	'The rightmost column cannot be fixed.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0007',
	'en_US',
	'W',
	'You cannot select multiple columns to be fixed.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0008',
	'en_US',
	'I',
	'Do you want to save the screen position and size?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0009',
	'en_US',
	'I',
	'Do you want to save the screen position?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0010',
	'en_US',
	'I',
	'Do you want to save the screen size?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0011',
	'en_US',
	'I',
	'Saved.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0012',
	'en_US',
	'E',
	'Failed to display the screen.\nThis screen is to be used as a child screen.\nTo use this screen, the parent screen must be specified.\nScreen name: {1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0013',
	'en_US',
	'E',
	'Failed to display the screen.\nA screen that uses this screen as an embedded screen must be implemented with the MCSortOrderPanel interface.\nModule ID: {1}\nScreen ID: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0014',
	'en_US',
	'W',
	'The value of the caller screen could not be reflected. The value exceeds the upper limit.\nRow: {1}\nColumn: {2}\nValue: {3}\nNumber of characters: {4}\nUpper limit: {5}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0015',
	'en_US',
	'W',
	'{1} must be entered.\nRow: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0017',
	'en_US',
	'W',
	'Column name is duplicated.\nRow: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0018',
	'en_US',
	'W',
	'The font ratio must be entered.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0019',
	'en_US',
	'W',
	'Check the font ratio setting.\nMin. value: {1}\nMax. value: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0020',
	'en_US',
	'I',
	'The common memo will be deleted. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0021',
	'en_US',
	'I',
	'The user memo will be deleted. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0022',
	'en_US',
	'I',
	'Do you want to enter the common memo?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0023',
	'en_US',
	'I',
	'Do you want to enter the user memo?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0024',
	'en_US',
	'I',
	'The common memo has been deleted.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0025',
	'en_US',
	'I',
	'The user memo has been deleted.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0026',
	'en_US',
	'I',
	'The common memo has been entered.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0027' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0027',
	'en_US',
	'I',
	'The user memo has been entered.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0028' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0028',
	'en_US',
	'I',
	'All menus and screen memos will be reacquired. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0029' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0029',
	'en_US',
	'I',
	'The memo has been changed. Do you want to save it? (If you do not save it, it will revert to the former state.)');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0030' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0030',
	'en_US',
	'W',
	'The memo has not been changed.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0031' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0031',
	'en_US',
	'I',
	'The memo was reacquired.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0032' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0032',
	'en_US',
	'I',
	'All menus and screen memos will be reacquired. \nThe memo you entered will be discarded. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0033' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0033',
	'en_US',
	'I',
	'The notification information will be deleted. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0034' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0034',
	'en_US',
	'I',
	'The notification information has been deleted.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0035' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0035',
	'en_US',
	'W',
	'The start date must be entered.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0036' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0036',
	'en_US',
	'W',
	'The notification end date is earlier than the start date.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0037' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0037',
	'en_US',
	'W',
	'The start and end dates must be entered.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0038' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0038',
	'en_US',
	'W',
	'Do you want to enter?\nIf [Hide] in [Sync with table] is OFF, columns of which [Display status in table] is OFF will be displayed on the chart unless [Hide] is ON.\nChanges made to the column order are enabled when [Column order] in [Sync with table] is OFF.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0039' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0039',
	'en_US',
	'W',
	'The maximum column width is exceeded.\nMax. value: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0040' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0040',
	'en_US',
	'E',
	'Failed to display the screen.\nThis screen is to be used as an embedded screen.\nScreen name: {1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0041' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0041',
	'en_US',
	'E',
	'Failed to display the screen.\nA screen that uses this screen as an embedded screen must be implemented with the IfSyncTableBase interface.\nModule ID: {1}\nScreen ID: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0042' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0042',
	'en_US',
	'W',
	'Failed to add data.\nThe entry target data has already been added. Acquire the latest information.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0043' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0043',
	'en_US',
	'W',
	'The update target has been updated by another process.\nAcquire the latest information.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0044' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0044',
	'en_US',
	'E',
	'Failed to display the screen.\nTo use this screen as a child screen, the IfSrchCndBase interface must be implemented.\nModule ID: {1}\nScreen ID: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0045' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0045',
	'en_US',
	'I',
	'The existing search criteria will be acquired.\nThe data you entered will be cleared. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0046' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0046',
	'en_US',
	'I',
	'The entered search criteria was acquired.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0047' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0047',
	'en_US',
	'E',
	'Failed to display the Select Color Info. screen.\nYou have specified invalid startup arguments. Check the startup arguments.\n\n1st argument: Source screen (or embedded screen). This must implement the IfColorPanelBase interface.\n2nd argument: Row to be processed\n3rd argument: Information to create the color information selection screen (WBP_ColorPanelInfo), or null');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0048' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0048',
	'en_US',
	'E',
	'Failed to display the Filter Info. Setting screen.\nYou have specified invalid startup arguments.\nCheck the startup arguments.\n\n1st argument: Table to be filtered');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0049' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0049',
	'en_US',
	'E',
	'Failed to display the Change Column Order/Size screen.\nYou have specified invalid startup arguments.\nCheck the startup arguments.\n\n1st argument: Table to be set');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0050' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0050',
	'en_US',
	'E',
	'Failed to enter the user memo.\nYour changes will be discarded.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0051' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0051',
	'en_US',
	'W',
	'Failed to reflect the system settings on the screen.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0052' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0052',
	'en_US',
	'E',
	'Failed to display the aggregation information display screen.\nYou have specified invalid startup arguments.\nCheck the startup arguments.\n\n1st argument: Table to be set');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0053' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0053',
	'en_US',
	'W',
	'There is no valid aggregation information.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0054' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0054',
	'en_US',
	'W',
	'Multiple pieces of aggregation information are specified for the initial setting.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0055' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0055',
	'en_US',
	'W',
	'The specified aggregation information has already been entered.\nSetting unit: {1}\nAggregation information name: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0056' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0056',
	'en_US',
	'I',
	'The aggregation information being entered will be cleared. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0057' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0057',
	'en_US',
	'E',
	'Failed to display the Vertical Display (for table).\nYou have specified invalid startup arguments.\nCheck the startup arguments.\n\n1st argument: Table to be displayed vertically.\nThe screen where the table is located must be the XPP_PanelBase class or one of its subclasses. The cell config for the table must be the XPP_CellConfig class or one of its subclasses.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0058' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0058',
	'en_US',
	'E',
	'Failed to display the Vertical Display (for header).\nIts parent screen must be the XPP_PanelBase class or one of its subclasses.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0059' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0059',
	'en_US',
	'I',
	'The setting information being entered will be cleared. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0060' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0060',
	'en_US',
	'W',
	'Multiple pieces of setting information are specified for the initial setting.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0061' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0061',
	'en_US',
	'W',
	'There is no valid setting info.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0062' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0062',
	'en_US',
	'W',
	'The specified setting info. has already been entered.\nSetting unit: {1}\nSetting information name : {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0063' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0063',
	'en_US',
	'I',
	'The setting info. will be entered. Continue?\nSetting unit: {1}\nSetting information name : {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0064' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0064',
	'en_US',
	'I',
	'The setting info. will be deleted. Continue?\nSetting unit: {1}\nSetting information name : {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0065' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0065',
	'en_US',
	'E',
	'Failed to display the task display setting screen.\nYou have specified invalid startup arguments.\nCheck the startup arguments.\n\n1st argument: Gantt chart to be set');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0066' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0066',
	'en_US',
	'W',
	'Select entered setting info.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0067' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0067',
	'en_US',
	'W',
	'The search criteria to be set do not exist.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0068' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0068',
	'en_US',
	'I',
	'The aggregation info. will be deleted. Continue?\nSetting unit: {1}\nAggregation information name: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0069' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0069',
	'en_US',
	'I',
	'The aggregation info. will be entered. Continue?\nSetting unit: {1}\nAggregation information name: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0070' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0070',
	'en_US',
	'W',
	'The screen that does not support mining.\nModule ID: {1}\nScreen ID: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0071' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0071',
	'en_US',
	'W',
	'To set a chart color, set all chart colors.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0072' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0072',
	'en_US',
	'W',
	'The specified setting info. has already been entered.\nSetting info. name: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0073' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0073',
	'en_US',
	'I',
	'The setting info. will be entered. Continue?\nSetting info. name: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0074' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0074',
	'en_US',
	'I',
	'The setting info. will be deleted. Continue?\nSetting info. name: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0075' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0075',
	'en_US',
	'I',
	'The set aggregation information will be deleted. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0076' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0076',
	'en_US',
	'W',
	'Set aggregation criteria.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0077' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0077',
	'en_US',
	'W',
	'To use ranking, set a rank sort type and a valid ranking.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0078' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0078',
	'en_US',
	'W',
	'Set columns to be used for the ranking.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0079' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0079',
	'en_US',
	'W',
	'To use time completion, the grouping column must be one.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0080' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0080',
	'en_US',
	'W',
	'Select the grouping column for time completion.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0081' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0081',
	'en_US',
	'W',
	'You cannot add aggregation criteria and change the aggregation criteria name.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0082' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0082',
	'en_US',
	'W',
	'There is not aggregation criteria to be entered.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0083' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0083',
	'en_US',
	'E',
	'A row must be set for search criteria in the mining Caller.\nScreen: {1}.{2}\nOperation: {3}.{4}.{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0084' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0084',
	'en_US',
	'I',
	'Specify a setting name.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0085' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0085',
	'en_US',
	'W',
	'The mining task for creating cache data for gadgets will also be deleted. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0086' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0086',
	'en_US',
	'W',
	'All columns of search criteria will become uneditable. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0087' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0087',
	'en_US',
	'I',
	'Starting the task. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0088' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0088',
	'en_US',
	'I',
	'The task has started.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0089' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0089',
	'en_US',
	'W',
	'The task before entry cannot be executed.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0090' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0090',
	'en_US',
	'W',
	'The task before entry cannot be copied.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0091' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0091',
	'en_US',
	'W',
	'Columns that are used to the aggregation information are not included in the response message.\nColumn: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0092' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0092',
	'en_US',
	'I',
	'Do you want to continue the setting?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBAC0093' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBAC0093',
	'en_US',
	'W',
	'The aggregation criteria name is duplicated. This cannot be used as a mining definition.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBBC0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBBC0001',
	'en_US',
	'I',
	'The client setting will be discarded and the system setting will be restored. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBBC0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBBC0002',
	'en_US',
	'I',
	'The system setting has been restored.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBBC0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBBC0003',
	'en_US',
	'I',
	'The font setting of the menu bar will be enabled the next time you log in.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBBC0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBBC0004',
	'en_US',
	'W',
	'The printer ID to be deleted is used in the export setting.\nPrinter ID: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBBC0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBBC0005',
	'en_US',
	'W',
	'{1} that you entered cannot be registered because it does not comply with the MCConfig naming conventions.\n{1}: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBBC0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBBC0006',
	'en_US',
	'W',
	'The specified report form directory does not exist.\nCartridge name: {1}\nSetting value: {2}\nExplosion value: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBBC0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBBC0007',
	'en_US',
	'W',
	'The specified report data directory is an invalid path.\nCartridge name: {1}\nSetting value: {2}\nExplosion value: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBBC0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBBC0008',
	'en_US',
	'W',
	'The specified interface file directory is an invalid path.\nSetting value: {1}\nExplosion value : {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBBC0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBBC0009',
	'en_US',
	'I',
	'The setting when the maximum number of characters are input is not applied to the currently displayed screen.\nIt will be applied the next time the screen is displayed.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBBC0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBBC0010',
	'en_US',
	'W',
	'The cartridge name is not set, or it is incorrect.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBBC0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBBC0011',
	'en_US',
	'W',
	'The specified printer ID is not entered.\nPrinter ID: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBBC0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBBC0012',
	'en_US',
	'I',
	'The color setting may not be partially reflected on the screen being displayed.\nIt will be reflected the next time the screen is displayed.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBBC0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBBC0013',
	'en_US',
	'I',
	'The imported setting is not applied to the currently displayed screen.\nIt will be applied the next time the screen is displayed.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBBC0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBBC0014',
	'en_US',
	'W',
	'{1} cannot contain "." (period).');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBBC0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBBC0015',
	'en_US',
	'I',
	'The fast screen opening will be enabled the next time you log in.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBBC0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBBC0016',
	'en_US',
	'W',
	'The import was suspended because of a resource that could not be imported.\nSetting unit: {1}\nFile: {2}\nType: {3}\nResource: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBBC0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBBC0017',
	'en_US',
	'I',
	'The deleted settings will not be applied to the currently displayed screen.\nIt will be applied the next time the screen is displayed.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBBC0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBBC0018',
	'en_US',
	'W',
	'The import was suspended because a file that could not be imported was specified.\nSetting unit: {1}\nFile: {2}\nFile setting unit: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBBC0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBBC0019',
	'en_US',
	'W',
	'The import was suspended because a file that could not be imported was specified.\nFile: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0001',
	'en_US',
	'W',
	'The specified module ID or screen ID is incorrect.\nModule ID: {1}\nScreen ID: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0002',
	'en_US',
	'E',
	'The component screen setting of the main menu has an error, or the specified component screen implementation is not correct.\nModule ID: {1}\nScreen ID: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0003',
	'en_US',
	'E',
	'Failed to control the main menu.\nModule ID: {1}\nScreen ID: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0004',
	'en_US',
	'W',
	'The search criteria must be entered.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0005',
	'en_US',
	'W',
	'Specify a screen.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0006',
	'en_US',
	'W',
	'A menu item to be added must be selected from the existing menu list.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0007',
	'en_US',
	'W',
	'The selected menu is not a menu item.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0008',
	'en_US',
	'W',
	'Sub menu name / screen name must be specified.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0009',
	'en_US',
	'W',
	'The submenu name / screen name cannot contain "." (period) or "," (comma).');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0010',
	'en_US',
	'I',
	'There is no update target.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0011',
	'en_US',
	'W',
	'It cannot be changed because its upper level is to be deleted.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0012',
	'en_US',
	'W',
	'Specify a menu ID.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0013',
	'en_US',
	'W',
	'Specify a module.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0014',
	'en_US',
	'W',
	'Specify either screen or class ID.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0015',
	'en_US',
	'W',
	'You cannot use the same menu ID in the same menu level.\nMenu ID: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0016',
	'en_US',
	'W',
	'The value of the argument does not match the data type.\nData type: {1}\nValue: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0017',
	'en_US',
	'W',
	'The value of the argument does not match the date format of {1} ({2}).\nValue: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0018',
	'en_US',
	'W',
	'If the data type is BOOLEAN, enter "0" or "1".');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0019',
	'en_US',
	'W',
	'You cannot use the same argument name in the same menu.\nArgument name: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0020',
	'en_US',
	'W',
	'Only the sub menu can be created in the first level.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0021',
	'en_US',
	'W',
	'The std. menu definitions cannot be deleted.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0022',
	'en_US',
	'W',
	'Enter a value in company cd.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0023',
	'en_US',
	'W',
	'The menu definition of the specified company already exists.\nCompany cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0024',
	'en_US',
	'W',
	'The file specified for the read menu file does not exist.\nFile: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0025',
	'en_US',
	'W',
	'An error occurred during SQL file output.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0026',
	'en_US',
	'W',
	'The destination directory does not exist, or there is an error.\nFile: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0027' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0027',
	'en_US',
	'I',
	'The SQL file was exported.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0028' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0028',
	'en_US',
	'W',
	'Specify a method name.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0029' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0029',
	'en_US',
	'I',
	'The menu definition will be deleted. Continue?\nCompany cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0030' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0030',
	'en_US',
	'W',
	'You need to set the class name if you specified the class ID.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0031' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0031',
	'en_US',
	'W',
	'The menu title must be specified.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0032' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0032',
	'en_US',
	'W',
	'The menu ID cannot contain "." (period) or "," (comma).');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0033' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0033',
	'en_US',
	'W',
	'The menu title cannot contain "." (period).');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0034' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0034',
	'en_US',
	'W',
	'The common memo management screen cannot be started because the menu info. has not been updated.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0035' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0035',
	'en_US',
	'W',
	'A menu to edit the common memo must be selected from the menu list for editing menu.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0036' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0036',
	'en_US',
	'W',
	'You cannot enter the common memo to the separator and line break.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0037' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0037',
	'en_US',
	'W',
	'The menu definition being selected is only for reference.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0038' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0038',
	'en_US',
	'I',
	'The file was saved.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0039' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0039',
	'en_US',
	'W',
	'The company cd. must be specified for the login user.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0040' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0040',
	'en_US',
	'W',
	'You cannot specify Root in the code.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0041' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0041',
	'en_US',
	'W',
	'There is NO matching screen.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0042' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0042',
	'en_US',
	'W',
	'The company cd. is wrong.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0043' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0043',
	'en_US',
	'W',
	'Set the font ratio to 100%.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0044' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0044',
	'en_US',
	'I',
	'Starting the entry process of menu pattern assignment.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0045' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0045',
	'en_US',
	'I',
	'The entry process of menu pattern assignment has been completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0046' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0046',
	'en_US',
	'I',
	'The entry process of menu pattern assignment has been suspended.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0047' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0047',
	'en_US',
	'I',
	'All the menu pattern assignments including the operation date has been deleted.\nUser: {1}\nCompany: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0048' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0048',
	'en_US',
	'W',
	'This menu pattern is for another company. It cannot be assigned for a user belongs to this company.\nMenu pattern ID: {1}\nCompany CD: {2}\nUser ID: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0049' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0049',
	'en_US',
	'W',
	'Applicable period of the menu pattern is duplicated.\nCompany CD: {1}\nUser ID: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0050' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0050',
	'en_US',
	'I',
	'You are about to delete the assigned menu pattern.\nAll the assignment of menu pattern will also be deleted.\nAre you sure you want to continue updating?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBCC0051' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBCC0051',
	'en_US',
	'W',
	'Menu pattern ID is duplicated.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBDC0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBDC0001',
	'en_US',
	'W',
	'It is not the history target table.\nTable name: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBDC0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBDC0002',
	'en_US',
	'W',
	'Select the updatable table.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBDC0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBDC0003',
	'en_US',
	'W',
	'The history table of the specified table does not exist.\nTable name: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBDC0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBDC0004',
	'en_US',
	'W',
	'The specified table already exists in the history table.\nTable name: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBDC0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBDC0005',
	'en_US',
	'W',
	'The value specified to the inspection value does not match the type of column of the history data. Row: {1} Inspection value: {2} Data type: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBDC0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBDC0006',
	'en_US',
	'W',
	'Input error');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBDC0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBDC0007',
	'en_US',
	'W',
	'The specified criteria already exists.\nCriteria: {1} {2} {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBDC0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBDC0008',
	'en_US',
	'W',
	'Specify a target table.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBDC0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBDC0009',
	'en_US',
	'W',
	'There is no criteria to save.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBDC0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBDC0010',
	'en_US',
	'I',
	'There is no saved criteria.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBDC0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBDC0011',
	'en_US',
	'I',
	'Continue saving?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBDC0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBDC0012',
	'en_US',
	'I',
	'Saved.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBDC0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBDC0013',
	'en_US',
	'I',
	'When you change the target table, the search criteria will be cleared. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBDC0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBDC0014',
	'en_US',
	'W',
	'Select history data.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBDC0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBDC0015',
	'en_US',
	'W',
	'The table you specified is in use for the history management of business data and cannot be deleted from the history target table.\nTable name: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0001',
	'en_US',
	'E',
	'An error occurred during screen generation. Check the log for details.\n({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0003',
	'en_US',
	'E',
	'Failed to read the catalog file. ({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0004',
	'en_US',
	'E',
	'File not found. ({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0005',
	'en_US',
	'W',
	'There is a variance between files. ({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0006',
	'en_US',
	'E',
	'Failed to check the file. ({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0007',
	'en_US',
	'I',
	'The DB process result will be deleted. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0008',
	'en_US',
	'I',
	'The DB process result has been deleted.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0009',
	'en_US',
	'I',
	'This is a file to be updated. It is downloaded when the function is used. ({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0010',
	'en_US',
	'I',
	'This file is downloaded when the function is used. ({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0011',
	'en_US',
	'W',
	'[Display all latest proc. result] and [Extract from latest process result] cannot be selected at a time.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0012',
	'en_US',
	'I',
	'There was a row which was not read. See the client log for details.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0013',
	'en_US',
	'D',
	'Although an error occurred while executing the operation, process continues.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0014',
	'en_US',
	'I',
	'The operation completed. There is an error.\nModule: {1} ({2})\nLogic: {3} ({4})\nOperation: {5} ({6})');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0015',
	'en_US',
	'I',
	'The operation completed.\nModule: {1} ({2})\nLogic: {3} ({4})\nOperation: {5} ({6})');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0016',
	'en_US',
	'I',
	'Starting the operation.\nModule: {1} ({2})\nLogic: {3} ({4})\nOperation: {5} ({6})\nArgument: {7}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0017',
	'en_US',
	'W',
	'General purpose online batch execution has been suspended.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0018',
	'en_US',
	'P',
	'Cannot execute the operation since multiple request message blocks exist.\nModule ID: {1}\nLogic ID: {2}\nOperation ID: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0019',
	'en_US',
	'I',
	'Ending the online execution of the general purpose batch.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0020',
	'en_US',
	'I',
	'Starting the online execution of the general purpose batch.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0021',
	'en_US',
	'W',
	'The process group to be registered has already been registered.\nProcess Group cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0022',
	'en_US',
	'W',
	'The process group to be updated has been updated by another process.\nPlease re-search.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0023',
	'en_US',
	'P',
	'The operation information could not be acquired.\nModule ID: {1}\nLogic ID: {2}\nOperation ID: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0024',
	'en_US',
	'I',
	'The argument information will be cleared. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0025',
	'en_US',
	'I',
	'Updated.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0026',
	'en_US',
	'I',
	'The argument information will be updated. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0027' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0027',
	'en_US',
	'I',
	'Select operation.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0028' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0028',
	'en_US',
	'E',
	'An invalid argument is registered.\nValue: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0029' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0029',
	'en_US',
	'W',
	'A process group must be selected.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0030' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0030',
	'en_US',
	'W',
	'Cannot execute the operation since the operation information is not sufficient.\nExecution order: {1}\nModule ID: {2}\nLogic ID: {3}\nOperation ID: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0031' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0031',
	'en_US',
	'I',
	'Are you sure you want to delete the scenario?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0032' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0032',
	'en_US',
	'I',
	'Are you sure you want to delete the playback data?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0033' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0033',
	'en_US',
	'I',
	'Do you want to overwrite and save the scenario?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0034' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0034',
	'en_US',
	'I',
	'Do you want to overwrite and save the playback data?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0035' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0035',
	'en_US',
	'I',
	'Specify the number of playback.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBEC0036' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBEC0036',
	'en_US',
	'I',
	'Batch process completed. See the following message.\nOperation: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0001',
	'en_US',
	'W',
	'You cannot use this function without the standard user management functions.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0002',
	'en_US',
	'W',
	'A user must be selected.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0003',
	'en_US',
	'W',
	'Licenses of unregistered products cannot be assigned.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0004',
	'en_US',
	'I',
	'Entered. The changes will be enabled the next time the currently logged-in user logs in.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0005',
	'en_US',
	'W',
	'The AC target value of the role target (screen) is duplicated.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0006',
	'en_US',
	'W',
	'The AC target value of the role target (server) is duplicated.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0007',
	'en_US',
	'W',
	'The value of the control target is duplicated.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0008',
	'en_US',
	'W',
	'You cannot enter another row that has the same combination of group 1 and group 2.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0009',
	'en_US',
	'W',
	'A role must be selected.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0010',
	'en_US',
	'W',
	'A parallel process group must be selected.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0011',
	'en_US',
	'W',
	'The license to be deleted must be selected.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0012',
	'en_US',
	'W',
	'You cannot add a user or change user information when using LDAP authentication or Windows SSO authentication.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0013',
	'en_US',
	'W',
	'The default administrator user cannot be deleted.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0014',
	'en_US',
	'I',
	'Are you sure you want to discard the changes?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0015',
	'en_US',
	'W',
	'An assignable license must be entered.\nEnter a license before assignment.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0016',
	'en_US',
	'I',
	'You are about to delete the assigned role.\nAll the assignment of role will also be deleted. Are you sure you want to continue updating?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0017',
	'en_US',
	'I',
	'The log information will be deleted. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0018',
	'en_US',
	'W',
	'To display the latest process result, specify the process name.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0019',
	'en_US',
	'W',
	'The process start time must be entered.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0020',
	'en_US',
	'W',
	'The process time ends at a time earlier than the start.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0021',
	'en_US',
	'W',
	'Select a server status.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0022',
	'en_US',
	'W',
	'Select an entered server status.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0023',
	'en_US',
	'W',
	'The locale of the message is duplicated.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0024',
	'en_US',
	'W',
	'The locale and the message are required.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0025',
	'en_US',
	'I',
	'Log information was deleted.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0026' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0026',
	'en_US',
	'I',
	'Imported.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0027' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0027',
	'en_US',
	'I',
	'Exported.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0028' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0028',
	'en_US',
	'W',
	'You cannot select multiple users.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0029' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0029',
	'en_US',
	'W',
	'The AC target in the [Role target (screen)] tab is required.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0030' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0030',
	'en_US',
	'W',
	'The AC target in the [Role target (server)] tab is required.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0031' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0031',
	'en_US',
	'W',
	'The control target in the [Control column] tab is required.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0032' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0032',
	'en_US',
	'W',
	'Specify a value to one of the columns in the search condition.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0033' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0033',
	'en_US',
	'W',
	'Failed to start up because the SQL trace function is disabled.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0034' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0034',
	'en_US',
	'W',
	'You have attempted to trace a user who does not exist.\nUser ID: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0035' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0035',
	'en_US',
	'I',
	'Entered. Changes made to the role target (server) are reflected immediately.\nOther changes will be enabled the next time the currently logged-in user logs in.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0036' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0036',
	'en_US',
	'W',
	'The child ID value of the role target (child role) is duplicated.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0037' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0037',
	'en_US',
	'W',
	'The child role ID in the [Role target (child role)] tab is required.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0038' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0038',
	'en_US',
	'W',
	'You cannot see the shown temporary password again. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0039' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0039',
	'en_US',
	'W',
	'The process was suspended because a problem was found in the assigned data.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0040' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0040',
	'en_US',
	'W',
	'A non-entered user was specified. ({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0041' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0041',
	'en_US',
	'W',
	'The default administrator user was specified. ({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0042' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0042',
	'en_US',
	'W',
	'A non-entered role was specified. ({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0043' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0043',
	'en_US',
	'I',
	'Role assignments for users to be entered will be replaced with the role assignments in the list. \nThe role assignments for all the companies will be replaced.\nAre you sure you want to continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0044' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0044',
	'en_US',
	'I',
	'Searching.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0045' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0045',
	'en_US',
	'W',
	'Checked only with assignable licenses due to insufficient licenses for all the displayed users.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0046' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0046',
	'en_US',
	'W',
	'A child role for system administrators can be added to a role for system administrators only.\nExclude a child role for system administrators.\nRole ID: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0047' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0047',
	'en_US',
	'W',
	'You are about to delete a role that is set as a child role.\nAll allocation of child roll will be also deleted.\nAre you sure you want to continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0048' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0048',
	'en_US',
	'W',
	'You cannot enter a role that is set as a child role of a role not for system administrators, as a role for system administrators. \nRole ID: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0049' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0049',
	'en_US',
	'W',
	'You cannot add a role target for system administrators to a role not for system administrators.\nExclude a role target for system administrators.\nRole ID: {1}\nRole target to be excluded: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0050' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0050',
	'en_US',
	'W',
	'Locale is duplicated.\nCompany cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0051' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0051',
	'en_US',
	'W',
	'Company must be selected.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0052' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0052',
	'en_US',
	'I',
	'You are about to delete the assigned company.\nAll the assignment of company and the assignment of authority will also be deleted.\nAre you sure you want to continue updating?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0053' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0053',
	'en_US',
	'I',
	'Do you want to discard the changes?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0054' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0054',
	'en_US',
	'I',
	'Passed.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0055' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0055',
	'en_US',
	'I',
	'Rejected.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0056' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0056',
	'en_US',
	'I',
	'Saved.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0057' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0057',
	'en_US',
	'I',
	'Close the screen and then reopen the screen.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0058' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0058',
	'en_US',
	'I',
	'You are about to delete the assigned user group.\nAll the assignment of user group will also be deleted.\nAre you sure you want to continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0059' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0059',
	'en_US',
	'W',
	'A value of locale cd. of the name management tab is duplicated.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0060' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0060',
	'en_US',
	'W',
	'The locale cd. of the name management tab is required.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0061' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0061',
	'en_US',
	'W',
	'The role name of the name management tab is required.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0062' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0062',
	'en_US',
	'I',
	'Role assignments for users to be entered will be replaced with the role assignments in the list. \nThe role assignments for the company you are logging in to will be replaced.\nAre you sure you want to continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0063' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0063',
	'en_US',
	'W',
	'The server status has been deleted.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0064' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0064',
	'en_US',
	'W',
	'A non-entered company was specified. ({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0065' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0065',
	'en_US',
	'I',
	'Operation date\n{1}\n\nmcframe date\n{2}\n\nServer OS date\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0066' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0066',
	'en_US',
	'W',
	'A non-entered group was specified. ({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0067' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0067',
	'en_US',
	'W',
	'This role is for another company. It cannot be assigned for a user belongs to this company.\nRole ID: {1}\nCompany cd.: {2}\nUser ID: {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0068' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0068',
	'en_US',
	'W',
	'This role is for another company. You cannot add it as a child roll.\nRole ID: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0069' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0069',
	'en_US',
	'W',
	'It has been set as a child roll of a roll that has been entered for another company. You cannot enter it as a roll for this company.\nRole ID: {1}\nCompany cd.: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0070' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0070',
	'en_US',
	'W',
	'A user of which management destination is other than mcframe system cannot be entered.\nUser ID: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0071' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0071',
	'en_US',
	'W',
	'Failed to enter. Check the server log.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0072' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0072',
	'en_US',
	'D',
	'Delete process was not executed because a user to be deleted does not exist. (Row: {1})\nUser ID: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0073' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0073',
	'en_US',
	'D',
	'Entry process is executed because a user to be deleted does not exist. (Row: {1})\nUser ID: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0074' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0074',
	'en_US',
	'D',
	'Entry process is executed because a user to be deleted exists. (Row: {1})\nUser ID: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0075' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0075',
	'en_US',
	'W',
	'Select one main responsible company for each user.\nUser ID: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0076' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0076',
	'en_US',
	'W',
	'A user ID that can not be used is specified. (Row: {1})\nUser ID: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0077' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0077',
	'en_US',
	'W',
	'There is a user of which case sensitive ID does not match. (Row: {1})\nUser ID: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0078' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0078',
	'en_US',
	'W',
	'The default administrator user cannot be deleted.\nRow: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0079' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0079',
	'en_US',
	'W',
	'You cannot assign to the default administrator user.\nRow: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0080' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0080',
	'en_US',
	'I',
	'Starting the user entry process.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0081' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0081',
	'en_US',
	'I',
	'The user entry process completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0082' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0082',
	'en_US',
	'I',
	'The user entry process suspended.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0083' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0083',
	'en_US',
	'I',
	'Starting the entry process of license assignment.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0084' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0084',
	'en_US',
	'I',
	'The entry process of license assignment completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0085' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0085',
	'en_US',
	'I',
	'The entry process of license assignment suspended.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0086' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0086',
	'en_US',
	'I',
	'Starting the entry process of company assignment.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0087' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0087',
	'en_US',
	'I',
	'The entry process of company assignment completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0088' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0088',
	'en_US',
	'I',
	'The entry process of company assignment suspended.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0089' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0089',
	'en_US',
	'I',
	'Starting the entry process of role assignment.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0090' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0090',
	'en_US',
	'I',
	'The entry process of role assignment completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0091' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0091',
	'en_US',
	'I',
	'The entry process of role assignment suspended.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0092' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0092',
	'en_US',
	'I',
	'All the role assignments including the operation date has been deleted.\nUser: {1}\nCompany: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0093' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0093',
	'en_US',
	'W',
	'The AC target value of the role target (menu) is duplicated.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0094' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0094',
	'en_US',
	'W',
	'The AC target in the [Role target (menu)] tab is required.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0095' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0095',
	'en_US',
	'I',
	'Menu pattern assignments for users to be entered will be replaced with the menu pattern assignments in the list. \nThe menu pattern assignments for all the companies will be replaced.\nAre you sure you want to continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0096' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0096',
	'en_US',
	'I',
	'Menu pattern assignments for users to be entered will be replaced with the menu pattern assignments in the list. \nThe menu pattern assignments for the company you are logging in to will be replaced.\nAre you sure you want to continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0097' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0097',
	'en_US',
	'W',
	'The function restriction pattern in the [Role target (Function restriction)] tab is required.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0098' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0098',
	'en_US',
	'W',
	'The function restriction pattern of the role target (function restriction) is duplicated.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0099' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0099',
	'en_US',
	'W',
	'Locale is duplicated.\nGroup: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBFC0100' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBFC0100',
	'en_US',
	'W',
	'No group is selected.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBGC0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBGC0001',
	'en_US',
	'W',
	'The specified group ID was not a target of parallel processing control.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBGC0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBGC0002',
	'en_US',
	'W',
	'The specified operation was not a target of parallel processing control.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBGC0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBGC0003',
	'en_US',
	'W',
	'The specified group ID could not be added manually because it is excluded by the operation process currently executed.\n\nCurrent execution\nWait time: {1} ms\nRetry: {2} times');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBGC0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBGC0004',
	'en_US',
	'W',
	'The specified operation could not be added manually because it is excluded by the operation process currently executed. \n\nCurrent execution\nWait time: {1} ms\nRetry: {2} times');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBGC0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBGC0005',
	'en_US',
	'W',
	'Select server process.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBGC0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBGC0006',
	'en_US',
	'W',
	'An unfinished request cannot be confirmed.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBGC0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBGC0007',
	'en_US',
	'W',
	'Failed to acquire the execution result file.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBGC0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBGC0008',
	'en_US',
	'W',
	'The execution result file could not be found.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBGC0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBGC0009',
	'en_US',
	'W',
	'The data confirmation screen has not been set.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBGC0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBGC0010',
	'en_US',
	'E',
	'The data confirmation screen does not implement MCResultViewer. ({1}.{2})');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBGC0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBGC0011',
	'en_US',
	'E',
	'The data confirmation screen does not have the communication definition corresponding to the data. ({1}.{2})');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBGC0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBGC0012',
	'en_US',
	'W',
	'The parallel processing control phase is not set currently.\nTo enable the entries, set the parallel processing control phase.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBGC0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBGC0013',
	'en_US',
	'W',
	'The Server status control phase is not set currently.\nTo enable the entries, set the server status control phase.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBGC0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBGC0014',
	'en_US',
	'I',
	'The deletion target includes server process currently executed.\nThe server process currently executed is to be forcibly suspended.\nAre you sure you want to continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBGC0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBGC0015',
	'en_US',
	'W',
	'The server status to be set was not found.\nServer status ID: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBGC0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBGC0016',
	'en_US',
	'W',
	'The deletion process will be skipped because the server status is not set.\nCompany cd.: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBGC0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBGC0017',
	'en_US',
	'I',
	'The asynchronous process completed.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBGC0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBGC0018',
	'en_US',
	'I',
	'{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBGC0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBGC0019',
	'en_US',
	'W',
	'It cannot be deleted because there is a log being processed.\nLog No. in process : {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBGC0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBGC0020',
	'en_US',
	'I',
	'Operation date will be updated one day.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBGC0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBGC0021',
	'en_US',
	'I',
	'Updated the operation date.\nBefore update: {1}\nAfter update: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBGC0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBGC0022',
	'en_US',
	'E',
	'Failed to update the operation date.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBGC0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBGC0023',
	'en_US',
	'I',
	'The update process was skipped because the operation date is not entered.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBGC0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBGC0024',
	'en_US',
	'W',
	'An error has occurred while requesting the system cache.\nServer: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBGC0025' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBGC0025',
	'en_US',
	'E',
	'An error has occurred while requesting the system cache.\nProcessing No.: {1}\nServer: {2}\nRequest ID: {3}\nRequest No.: {4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBHC0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBHC0001',
	'en_US',
	'W',
	'Locale must be specified.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBHC0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBHC0002',
	'en_US',
	'W',
	'User ID must be specified.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBHC0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBHC0003',
	'en_US',
	'W',
	'Password must be specified.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBHC0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBHC0004',
	'en_US',
	'W',
	'New password and confirmation password do not match.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBHC0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBHC0005',
	'en_US',
	'W',
	'User to change password must be specified.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBHC0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBHC0007',
	'en_US',
	'I',
	'Do you want to log out?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBHC0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBHC0009',
	'en_US',
	'W',
	'The passwords do not match.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBHC0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBHC0011',
	'en_US',
	'I',
	'Password has been changed.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBHC0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBHC0012',
	'en_US',
	'I',
	'Assigned licenses are included.\nLicenses assigned over the number of valid licenses are cancelled.\nAre you sure you want to continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBHC0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBHC0013',
	'en_US',
	'W',
	'A row to edit the assignment must be selected.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBHC0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBHC0014',
	'en_US',
	'W',
	'This exceeds the maximum number of assignments.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBHC0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBHC0015',
	'en_US',
	'W',
	'You cannot change the password from mcframe in the current authentication mode.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBHC0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBHC0016',
	'en_US',
	'I',
	'The selected user forced log out. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBHC0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBHC0017',
	'en_US',
	'I',
	'Forcibly logged out.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBHC0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBHC0018',
	'en_US',
	'W',
	'A user must be selected.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBHC0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBHC0019',
	'en_US',
	'I',
	'You are included in the selected user.\nAre you sure you want to continue log out?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBHC0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBHC0020',
	'en_US',
	'I',
	'A selectable license must be assigned.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBHC0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBHC0021',
	'en_US',
	'I',
	'Data on the screen has been changed.\nAre you sure you want to log out?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBHC0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBHC0022',
	'en_US',
	'I',
	'The file was saved.\nDirectory: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBHC0023' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBHC0023',
	'en_US',
	'I',
	'The file exists in the specified directory. Do you want to overwrite?\nDirectory: {1}\nFile: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBHC0024' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBHC0024',
	'en_US',
	'W',
	'The file could not be saved.\nDirectory: {1}\nFile: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBIC0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBIC0001',
	'en_US',
	'I',
	'Cannot abort the process because a print job is running.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBIC0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBIC0002',
	'en_US',
	'I',
	'Cannot start the process because the print job control class is not specified.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBIC0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBIC0003',
	'en_US',
	'W',
	'A print cartridge must be specified.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBIC0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBIC0004',
	'en_US',
	'W',
	'A print job must be specified.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBIC0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBIC0005',
	'en_US',
	'I',
	'Invalid directory is specified for the report definition directory.\nCheck the settings.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBIC0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBIC0006',
	'en_US',
	'I',
	'Invalid directory is specified for the print data directory.\nCheck the settings.\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBIC0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBIC0007',
	'en_US',
	'W',
	'Select a data file.\nReport ID: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBIC0008' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBIC0008',
	'en_US',
	'W',
	'Select a definition.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBIC0009' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBIC0009',
	'en_US',
	'I',
	'You are about to close the confirmation screen without executing print. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBIC0010' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBIC0010',
	'en_US',
	'I',
	'The print data will be deleted. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBIC0011' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBIC0011',
	'en_US',
	'W',
	'The print start time must be entered.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBIC0012' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBIC0012',
	'en_US',
	'W',
	'The print end time is earlier than the print start time.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBIC0013' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBIC0013',
	'en_US',
	'I',
	'The print data has been deleted.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBIC0014' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBIC0014',
	'en_US',
	'W',
	'The print data must be selected.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBIC0015' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBIC0015',
	'en_US',
	'I',
	'The print process executed.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBIC0016' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBIC0016',
	'en_US',
	'W',
	'The specified print data cannot be deleted because it is permanent data.\nRow: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBIC0017' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBIC0017',
	'en_US',
	'W',
	'A report must be selected.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBIC0018' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBIC0018',
	'en_US',
	'W',
	'The column name is duplicated.\nReport: {1}\nValue: {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBIC0019' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBIC0019',
	'en_US',
	'W',
	'The setting is duplicated.\nReport: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBIC0020' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBIC0020',
	'en_US',
	'W',
	'Select a report to be output.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBIC0021' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBIC0021',
	'en_US',
	'W',
	'No print job is selected.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBIC0022' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBIC0022',
	'en_US',
	'I',
	'Print job will be deleted. Continue?');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBMC0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBMC0001',
	'en_US',
	'W',
	'Failed to lock the message.\nThe message may have been updated or deleted from another screen.\nMessage queue ID: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBMC0002' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBMC0002',
	'en_US',
	'W',
	'The message could not be re-executed.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBMC0003' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBMC0003',
	'en_US',
	'W',
	'The message could not be deleted.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBMC0004' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBMC0004',
	'en_US',
	'W',
	'You can re-execute messages whose status is Abnormal termination.\nMessage queue ID: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBMC0005' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBMC0005',
	'en_US',
	'W',
	'You can delete only messages whose status is Successful completion or only those whose status is Abnormal termination.\nMessage queue ID: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBMC0006' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBMC0006',
	'en_US',
	'W',
	'You can force re-execution of only messages whose status is Running.\nMessage queue ID: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FSBMC0007' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSBMC0007',
	'en_US',
	'W',
	'Forced re-execution of the messages failed.');
DELETE FROM FCT_MSG WHERE MSGID = 'FSUBC0001' AND LOC_CD = 'en_US';
INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'FSUBC0001',
	'en_US',
	'W',
	'{1} is too short.\nMin. value: {2}');
