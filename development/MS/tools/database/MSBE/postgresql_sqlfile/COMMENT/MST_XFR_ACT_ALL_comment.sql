\encoding UTF-8

COMMENT ON TABLE mst_xfr_act_all IS '移動実績ヘッダ // Movement result header';


COMMENT ON COLUMN mst_xfr_act_all.xfr_act_no IS '移動実績ＮＯ // #MA.XFR_ACT_NO // Movement result No.';


COMMENT ON COLUMN mst_xfr_act_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_xfr_act_all.xfr_inst_no IS '移動指図ＮＯ // #MA.XFR_INST_NO // Movement order No.';


COMMENT ON COLUMN mst_xfr_act_all.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_xfr_act_all.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_xfr_act_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_xfr_act_all.lg_grp_cd IS '物流グループＣＤ // #MA.LG_GRP_CD // Distribution group cd.';


COMMENT ON COLUMN mst_xfr_act_all.gr_loc_cd IS '入庫場所ＣＤ // #MA.LOC_CD // GR location cd.';


COMMENT ON COLUMN mst_xfr_act_all.gr_stk_arrv_bp_cd IS '入庫在庫着荷先ＣＤ // #MA.BP_CD // GR inventory arriving point cd.';


COMMENT ON COLUMN mst_xfr_act_all.xfr_dt IS '移動日 // #MA.DT // Movement day';


COMMENT ON COLUMN mst_xfr_act_all.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mst_xfr_act_all.act_usr_cd IS '実施担当者ＣＤ // #MA.USR_CD // Implementation PIC cd.';


COMMENT ON COLUMN mst_xfr_act_all.act_dpt_cd IS '実施部門ＣＤ // #MA.DPT_CD // Implement dept. cd.';


COMMENT ON COLUMN mst_xfr_act_all.dlv_prnt_flg IS '納品書発行済ＦＬＧ // #MA.FLG // Delivery note issued flg.';


COMMENT ON COLUMN mst_xfr_act_all.dlv_prnt_tm IS '納品書発行日時 // #MA.TM // Delivery note issue date and time';


COMMENT ON COLUMN mst_xfr_act_all.intr_rmrks IS '内部備考 // #MS.XFR_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_xfr_act_all.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mst_xfr_act_all.sub_char1 IS '予備１ // #MS.XFR_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_xfr_act_all.sub_char2 IS '予備２ // #MS.XFR_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_xfr_act_all.sub_char3 IS '予備３ // #MS.XFR_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_xfr_act_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_xfr_act_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_xfr_act_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_xfr_act_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_xfr_act_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_xfr_act_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_xfr_act_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_xfr_act_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_xfr_act_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_xfr_act_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

