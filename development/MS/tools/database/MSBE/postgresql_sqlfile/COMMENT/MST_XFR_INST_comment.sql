\encoding UTF-8

COMMENT ON VIEW mst_xfr_inst IS '移動指図ヘッダ // Movement order header';


COMMENT ON COLUMN mst_xfr_inst.xfr_inst_no IS '移動指図ＮＯ // #MA.XFR_INST_NO // Movement order No.';


COMMENT ON COLUMN mst_xfr_inst.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_xfr_inst.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_xfr_inst.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_xfr_inst.lg_grp_cd IS '物流グループＣＤ // #MA.LG_GRP_CD // Distribution group cd.';


COMMENT ON COLUMN mst_xfr_inst.gr_loc_cd IS '入庫場所ＣＤ // #MA.LOC_CD // GR location cd.';


COMMENT ON COLUMN mst_xfr_inst.gr_stk_arrv_bp_cd IS '入庫在庫着荷先ＣＤ // #MA.BP_CD // GR inventory arriving point cd.';


COMMENT ON COLUMN mst_xfr_inst.xfr_schd_dt IS '移動予定日 // #MA.DT // Scheduled movement date';


COMMENT ON COLUMN mst_xfr_inst.xfr_inst_dt IS '移動指図日 // #MA.DT // Movement order date';


COMMENT ON COLUMN mst_xfr_inst.inst_usr_cd IS '指図担当者ＣＤ // #MA.USR_CD // Order PIC cd.';


COMMENT ON COLUMN mst_xfr_inst.inst_dpt_cd IS '指図部門ＣＤ // #MA.DPT_CD // Order dept. cd.';


COMMENT ON COLUMN mst_xfr_inst.inst_prnt_flg IS '指図書発行済ＦＬＧ // #MA.FLG // Order sheet issued flg.';


COMMENT ON COLUMN mst_xfr_inst.inst_prnt_tm IS '指図書発行日時 // #MA.TM // Order sheet issued date and time';


COMMENT ON COLUMN mst_xfr_inst.pick_prnt_flg IS 'ピッキングリスト発行済ＦＬＧ // #MA.FLG // Picking list issued flg.';


COMMENT ON COLUMN mst_xfr_inst.pick_prnt_tm IS 'ピッキングリスト発行日時 // #MA.TM // Picking list issue date and time';


COMMENT ON COLUMN mst_xfr_inst.dlv_prnt_flg IS '納品書発行済ＦＬＧ // #MA.FLG // Delivery note issued flg.';


COMMENT ON COLUMN mst_xfr_inst.dlv_prnt_tm IS '納品書発行日時 // #MA.TM // Delivery note issue date and time';


COMMENT ON COLUMN mst_xfr_inst.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mst_xfr_inst.inst_rmrks IS '指図備考 // #MS.XFR_INST_RMRKS // Order remarks';


COMMENT ON COLUMN mst_xfr_inst.intr_rmrks IS '内部備考 // #MS.XFR_INST_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_xfr_inst.sub_char1 IS '予備１ // #MS.XFR_INST_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_xfr_inst.sub_char2 IS '予備２ // #MS.XFR_INST_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_xfr_inst.sub_char3 IS '予備３ // #MS.XFR_INST_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_xfr_inst.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_xfr_inst.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_xfr_inst.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_xfr_inst.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_xfr_inst.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_xfr_inst.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_xfr_inst.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_xfr_inst.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_xfr_inst.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_xfr_inst.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

