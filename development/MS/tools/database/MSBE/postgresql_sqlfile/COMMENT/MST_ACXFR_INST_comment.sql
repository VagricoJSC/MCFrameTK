\encoding UTF-8

COMMENT ON VIEW mst_acxfr_inst IS '他勘定振替指図ヘッダ // Other accounting transfer order header';


COMMENT ON COLUMN mst_acxfr_inst.acxfr_inst_no IS '他勘定振替指図ＮＯ // #MA.ACXFR_INST_NO // Other accounting transfer order No.';


COMMENT ON COLUMN mst_acxfr_inst.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_acxfr_inst.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_acxfr_inst.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mst_acxfr_inst.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_acxfr_inst.acxfr_inst_dt IS '他勘定振替指図日 // #MA.DT // Other accounting transfer order date';


COMMENT ON COLUMN mst_acxfr_inst.inst_dpt_cd IS '指図部門ＣＤ // #MA.DPT_CD // Order dept. cd.';


COMMENT ON COLUMN mst_acxfr_inst.inst_usr_cd IS '指図担当者ＣＤ // #MA.USR_CD // Order PIC cd.';


COMMENT ON COLUMN mst_acxfr_inst.intr_rmrks IS '内部備考 // #MS.ACXFR_INST_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_acxfr_inst.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mst_acxfr_inst.inst_rmrks IS '指図備考 // #MS.ACXFR_INST_RMRKS // Order remarks';


COMMENT ON COLUMN mst_acxfr_inst.sub_char1 IS '予備１ // #MS.ACXFR_INST_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_acxfr_inst.sub_char2 IS '予備２ // #MS.ACXFR_INST_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_acxfr_inst.sub_char3 IS '予備３ // #MS.ACXFR_INST_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_acxfr_inst.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_acxfr_inst.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_acxfr_inst.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_acxfr_inst.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_acxfr_inst.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_acxfr_inst.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_acxfr_inst.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_acxfr_inst.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_acxfr_inst.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_acxfr_inst.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

