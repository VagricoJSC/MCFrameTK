
COMMENT ON TABLE MST_VER_CHG_ALL IS '版切替情報 // Version change info.';


COMMENT ON COLUMN MST_VER_CHG_ALL.PAR_ITM_CD IS '親品目ＣＤ // #MA.ITM_CD // Parent item cd.';


COMMENT ON COLUMN MST_VER_CHG_ALL.PAR_ITM_SUB1 IS '親枝番１ // #MA.ITM_SUB1 // Parent branch No. 1';


COMMENT ON COLUMN MST_VER_CHG_ALL.PAR_ITM_SUB2 IS '親枝番２ // #MA.ITM_SUB2 // Parent branch No. 2';


COMMENT ON COLUMN MST_VER_CHG_ALL.PAR_ITM_SUB3 IS '親枝番３ // #MA.ITM_SUB3 // Parent branch No. 3';


COMMENT ON COLUMN MST_VER_CHG_ALL.CHD_ITM_CD IS '子品目ＣＤ // #MA.ITM_CD // Child item cd.';


COMMENT ON COLUMN MST_VER_CHG_ALL.CHD_ITM_SUB1 IS '子枝番１ // #MA.ITM_SUB1 // Child branch No. 1';


COMMENT ON COLUMN MST_VER_CHG_ALL.CHD_ITM_SUB2 IS '子枝番２ // #MA.ITM_SUB2 // Child branch No. 2';


COMMENT ON COLUMN MST_VER_CHG_ALL.CHD_ITM_SUB3 IS '子枝番３ // #MA.ITM_SUB3 // Child branch No. 3';


COMMENT ON COLUMN MST_VER_CHG_ALL.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MST_VER_CHG_ALL.BOM_PTN IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN MST_VER_CHG_ALL.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_VER_CHG_ALL.SITE_CD IS '工場・物流倉庫ＣＤ // #MA.SITE_CD // Factory/Distribution warehouse cd.';


COMMENT ON COLUMN MST_VER_CHG_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_VER_CHG_ALL.VER_CHG_STS_TYP IS '版切替状況区分 // #MS.VER_CHG_STS_TYP // Version change status type';


COMMENT ON COLUMN MST_VER_CHG_ALL.FIRST_INST_ST_TM IS '切替開始日時（指図） // #MA.TM // Start changing date and time (Order)';


COMMENT ON COLUMN MST_VER_CHG_ALL.FIRST_INST_LOT_NO IS '開始ロットＮＯ（指図） // #MA.LOT_NO // Start lot No. (Order)';


COMMENT ON COLUMN MST_VER_CHG_ALL.FIRST_INST_SUBLOT_NO IS '開始サブロットＮＯ（指図） // #MA.SUBLOT_NO // Start sublot No. (Order)';


COMMENT ON COLUMN MST_VER_CHG_ALL.FIRST_MFG_INST_NO IS '開始製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order starting No.';


COMMENT ON COLUMN MST_VER_CHG_ALL.FIRST_ACT_ST_TM IS '切替開始日時（実績） // #MA.TM // Start changing date and time (Result)';


COMMENT ON COLUMN MST_VER_CHG_ALL.FIRST_ACT_LOT_NO IS '開始ロットＮＯ（実績） // #MA.LOT_NO // Start lot No. (Result)';


COMMENT ON COLUMN MST_VER_CHG_ALL.FIRST_ACT_SUBLOT_NO IS '開始サブロットＮＯ（実績） // #MA.SUBLOT_NO // Starting sublot No. (Result)';


COMMENT ON COLUMN MST_VER_CHG_ALL.FIRST_MFG_ACT_NO IS '開始製造実績ＮＯ // #MA.MFG_ACT_NO // First mfg. result No.';


COMMENT ON COLUMN MST_VER_CHG_ALL.LAST_ACT_ST_TM IS '最終着手日時 // #MA.TM // Last start date and time';


COMMENT ON COLUMN MST_VER_CHG_ALL.LAST_ACT_LOT_NO IS '最終ロットＮＯ（実績） // #MA.LOT_NO // Last lot No. (Result)';


COMMENT ON COLUMN MST_VER_CHG_ALL.LAST_ACT_SUBLOT_NO IS '最終サブロットＮＯ（実績） // #MA.SUBLOT_NO // Last sublot No. (Result)';


COMMENT ON COLUMN MST_VER_CHG_ALL.LAST_MFG_ACT_NO IS '最終製造実績ＮＯ // #MA.MFG_ACT_NO // Last mfg. result No.';


COMMENT ON COLUMN MST_VER_CHG_ALL.SUB_CHAR1 IS '予備１ // #MS.VER_CHG_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_VER_CHG_ALL.SUB_CHAR2 IS '予備２ // #MS.VER_CHG_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_VER_CHG_ALL.SUB_CHAR3 IS '予備３ // #MS.VER_CHG_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_VER_CHG_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_VER_CHG_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_VER_CHG_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_VER_CHG_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_VER_CHG_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_VER_CHG_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_VER_CHG_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_VER_CHG_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_VER_CHG_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_VER_CHG_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

