\encoding UTF-8

COMMENT ON TABLE mst_ver_chg_all IS '版切替情報 // Version change info.';


COMMENT ON COLUMN mst_ver_chg_all.par_itm_cd IS '親品目ＣＤ // #MA.ITM_CD // Parent item cd.';


COMMENT ON COLUMN mst_ver_chg_all.par_itm_sub1 IS '親枝番１ // #MA.ITM_SUB1 // Parent branch No. 1';


COMMENT ON COLUMN mst_ver_chg_all.par_itm_sub2 IS '親枝番２ // #MA.ITM_SUB2 // Parent branch No. 2';


COMMENT ON COLUMN mst_ver_chg_all.par_itm_sub3 IS '親枝番３ // #MA.ITM_SUB3 // Parent branch No. 3';


COMMENT ON COLUMN mst_ver_chg_all.chd_itm_cd IS '子品目ＣＤ // #MA.ITM_CD // Child item cd.';


COMMENT ON COLUMN mst_ver_chg_all.chd_itm_sub1 IS '子枝番１ // #MA.ITM_SUB1 // Child branch No. 1';


COMMENT ON COLUMN mst_ver_chg_all.chd_itm_sub2 IS '子枝番２ // #MA.ITM_SUB2 // Child branch No. 2';


COMMENT ON COLUMN mst_ver_chg_all.chd_itm_sub3 IS '子枝番３ // #MA.ITM_SUB3 // Child branch No. 3';


COMMENT ON COLUMN mst_ver_chg_all.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN mst_ver_chg_all.bom_ptn IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN mst_ver_chg_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_ver_chg_all.site_cd IS '工場・物流倉庫ＣＤ // #MA.SITE_CD // Factory/Distribution warehouse cd.';


COMMENT ON COLUMN mst_ver_chg_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_ver_chg_all.ver_chg_sts_typ IS '版切替状況区分 // #MS.VER_CHG_STS_TYP // Version change status type';


COMMENT ON COLUMN mst_ver_chg_all.first_inst_st_tm IS '切替開始日時（指図） // #MA.TM // Start changing date and time (Order)';


COMMENT ON COLUMN mst_ver_chg_all.first_inst_lot_no IS '開始ロットＮＯ（指図） // #MA.LOT_NO // Start lot No. (Order)';


COMMENT ON COLUMN mst_ver_chg_all.first_inst_sublot_no IS '開始サブロットＮＯ（指図） // #MA.SUBLOT_NO // Start sublot No. (Order)';


COMMENT ON COLUMN mst_ver_chg_all.first_mfg_inst_no IS '開始製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order starting No.';


COMMENT ON COLUMN mst_ver_chg_all.first_act_st_tm IS '切替開始日時（実績） // #MA.TM // Start changing date and time (Result)';


COMMENT ON COLUMN mst_ver_chg_all.first_act_lot_no IS '開始ロットＮＯ（実績） // #MA.LOT_NO // Start lot No. (Result)';


COMMENT ON COLUMN mst_ver_chg_all.first_act_sublot_no IS '開始サブロットＮＯ（実績） // #MA.SUBLOT_NO // Starting sublot No. (Result)';


COMMENT ON COLUMN mst_ver_chg_all.first_mfg_act_no IS '開始製造実績ＮＯ // #MA.MFG_ACT_NO // First mfg. result No.';


COMMENT ON COLUMN mst_ver_chg_all.last_act_st_tm IS '最終着手日時 // #MA.TM // Last start date and time';


COMMENT ON COLUMN mst_ver_chg_all.last_act_lot_no IS '最終ロットＮＯ（実績） // #MA.LOT_NO // Last lot No. (Result)';


COMMENT ON COLUMN mst_ver_chg_all.last_act_sublot_no IS '最終サブロットＮＯ（実績） // #MA.SUBLOT_NO // Last sublot No. (Result)';


COMMENT ON COLUMN mst_ver_chg_all.last_mfg_act_no IS '最終製造実績ＮＯ // #MA.MFG_ACT_NO // Last mfg. result No.';


COMMENT ON COLUMN mst_ver_chg_all.sub_char1 IS '予備１ // #MS.VER_CHG_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_ver_chg_all.sub_char2 IS '予備２ // #MS.VER_CHG_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_ver_chg_all.sub_char3 IS '予備３ // #MS.VER_CHG_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_ver_chg_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_ver_chg_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_ver_chg_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_ver_chg_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_ver_chg_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_ver_chg_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_ver_chg_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_ver_chg_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_ver_chg_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_ver_chg_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

