\encoding UTF-8

COMMENT ON VIEW mst_acxfr_act_p IS '他勘定振替実績ヘッダ（改訂履歴） // Other accounting transfer result header (Rev. history)';


COMMENT ON COLUMN mst_acxfr_act_p.acxfr_act_no IS '他勘定振替実績ＮＯ // #MA.ACXFR_ACT_NO // Other accounting transfer result No.';


COMMENT ON COLUMN mst_acxfr_act_p.acxfr_act_rev IS '他勘定振替実績改訂番号 // #MA.SLIP_REV // Other accounting transfer result rev. number';


COMMENT ON COLUMN mst_acxfr_act_p.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_acxfr_act_p.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_acxfr_act_p.acxfr_inst_no IS '他勘定振替指図ＮＯ // #MA.ACXFR_INST_NO // Other accounting transfer order No.';


COMMENT ON COLUMN mst_acxfr_act_p.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mst_acxfr_act_p.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_acxfr_act_p.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mst_acxfr_act_p.acxfr_act_tm IS '他勘定振替実績日時 // #MA.TM // Actual other accounting transfer date and time';


COMMENT ON COLUMN mst_acxfr_act_p.act_dpt_cd IS '実施部門ＣＤ // #MA.DPT_CD // Implement dept. cd.';


COMMENT ON COLUMN mst_acxfr_act_p.act_usr_cd IS '実施担当者ＣＤ // #MA.USR_CD // Implementation PIC cd.';


COMMENT ON COLUMN mst_acxfr_act_p.prnt_flg IS '伝票発行済ＦＬＧ // #MA.FLG // Slip issued flg.';


COMMENT ON COLUMN mst_acxfr_act_p.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mst_acxfr_act_p.intr_rmrks IS '内部備考 // #MS.ACXFR_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_acxfr_act_p.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mst_acxfr_act_p.sub_char1 IS '予備１ // #MS.ACXFR_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_acxfr_act_p.sub_char2 IS '予備２ // #MS.ACXFR_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_acxfr_act_p.sub_char3 IS '予備３ // #MS.ACXFR_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_acxfr_act_p.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_acxfr_act_p.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_acxfr_act_p.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_acxfr_act_p.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_acxfr_act_p.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_acxfr_act_p.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_acxfr_act_p.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_acxfr_act_p.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_acxfr_act_p.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_acxfr_act_p.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

