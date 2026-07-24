\encoding UTF-8

COMMENT ON TABLE mst_mfg_act_rem_all IS '製造実績残 // Remaining mfg. result';


COMMENT ON COLUMN mst_mfg_act_rem_all.mfg_inst_no IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN mst_mfg_act_rem_all.div_seq IS '分割連番 // #MS.DIV_SEQ // Split sequence number';


COMMENT ON COLUMN mst_mfg_act_rem_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_mfg_act_rem_all.mfg_sts_typ IS '製造状況区分 // #MS.MFG_STS_TYP // Mfg. status type';


COMMENT ON COLUMN mst_mfg_act_rem_all.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mst_mfg_act_rem_all.base_unit_mfg_qty IS '基準単位製造着手数量 // #MA.QTY // Base unit mfg. start qty.';


COMMENT ON COLUMN mst_mfg_act_rem_all.base_unit_mfg_rem_qty IS '基準単位製造残数量 // #MA.QTY // Base unit remaining mfg. qty.';


COMMENT ON COLUMN mst_mfg_act_rem_all.base_unit_mfg_abort_qty IS '基準単位製造打切数量 // #MA.QTY // Base unit cancelled remaining mfg. qty.';


COMMENT ON COLUMN mst_mfg_act_rem_all.sub_char1 IS '予備１ // #MS.MFG_ACT_REM_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_mfg_act_rem_all.sub_char2 IS '予備２ // #MS.MFG_ACT_REM_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_mfg_act_rem_all.sub_char3 IS '予備３ // #MS.MFG_ACT_REM_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_mfg_act_rem_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_mfg_act_rem_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_mfg_act_rem_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_mfg_act_rem_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_mfg_act_rem_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_mfg_act_rem_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_mfg_act_rem_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_mfg_act_rem_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_mfg_act_rem_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_mfg_act_rem_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

