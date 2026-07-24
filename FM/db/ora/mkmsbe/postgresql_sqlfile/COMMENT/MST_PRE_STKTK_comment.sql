\encoding UTF-8

COMMENT ON VIEW mst_pre_stktk IS '前回棚卸日情報 // Last inventory date info.';


COMMENT ON COLUMN mst_pre_stktk.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mst_pre_stktk.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_pre_stktk.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_pre_stktk.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_pre_stktk.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_pre_stktk.last_stktk_dt IS '前回棚卸日 // #MA.DT // Last inventory date';


COMMENT ON COLUMN mst_pre_stktk.latest_stktk_st_dt IS '最新棚卸開始日 // #MA.DT // Latest inventory start date';


COMMENT ON COLUMN mst_pre_stktk.sub_char1 IS '予備１ // #MS.PRE_STKTK_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_pre_stktk.sub_char2 IS '予備２ // #MS.PRE_STKTK_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_pre_stktk.sub_char3 IS '予備３ // #MS.PRE_STKTK_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_pre_stktk.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_pre_stktk.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_pre_stktk.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_pre_stktk.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_pre_stktk.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_pre_stktk.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_pre_stktk.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_pre_stktk.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_pre_stktk.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_pre_stktk.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

