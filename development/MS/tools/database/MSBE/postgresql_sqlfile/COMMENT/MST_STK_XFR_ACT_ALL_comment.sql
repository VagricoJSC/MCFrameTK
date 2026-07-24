\encoding UTF-8

COMMENT ON TABLE mst_stk_xfr_act_all IS '在庫振替実績ヘッダ // Inventory transfer result header';


COMMENT ON COLUMN mst_stk_xfr_act_all.stk_xfr_act_no IS '在庫振替実績ＮＯ // #MA.STK_XFR_ACT_NO // Inventory transfer result No.';


COMMENT ON COLUMN mst_stk_xfr_act_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_stk_xfr_act_all.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_stk_xfr_act_all.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_stk_xfr_act_all.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mst_stk_xfr_act_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_stk_xfr_act_all.act_dpt_cd IS '実施部門ＣＤ // #MA.DPT_CD // Implement dept. cd.';


COMMENT ON COLUMN mst_stk_xfr_act_all.act_usr_cd IS '実施担当者ＣＤ // #MA.USR_CD // Implementation PIC cd.';


COMMENT ON COLUMN mst_stk_xfr_act_all.stk_xfr_act_tm IS '在庫振替実績日時 // #MA.TM // Actual inventory transfer date and time';


COMMENT ON COLUMN mst_stk_xfr_act_all.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mst_stk_xfr_act_all.intr_rmrks IS '内部備考 // #MS.STK_XFR_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_stk_xfr_act_all.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mst_stk_xfr_act_all.sub_char1 IS '予備１ // #MS.STK_XFR_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_stk_xfr_act_all.sub_char2 IS '予備２ // #MS.STK_XFR_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_stk_xfr_act_all.sub_char3 IS '予備３ // #MS.STK_XFR_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_stk_xfr_act_all.stk_xfr_rsn_cd IS '在庫振替理由ＣＤ // #MA.BIZ_RSN_CD // Inventory transfer reason cd.';


COMMENT ON COLUMN mst_stk_xfr_act_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_stk_xfr_act_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_stk_xfr_act_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_stk_xfr_act_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_stk_xfr_act_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_stk_xfr_act_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_stk_xfr_act_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_stk_xfr_act_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_stk_xfr_act_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_stk_xfr_act_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

