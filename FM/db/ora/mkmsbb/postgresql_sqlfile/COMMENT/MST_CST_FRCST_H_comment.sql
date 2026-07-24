\encoding UTF-8

COMMENT ON VIEW mst_cst_frcst_h IS '顧客期間内示ヘッダ // Sales forecast header';


COMMENT ON COLUMN mst_cst_frcst_h.cst_frcst_no IS '顧客期間内示ＮＯ // #MA.CST_FRCST_NO // Sales forecast No.';


COMMENT ON COLUMN mst_cst_frcst_h.cst_cd IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN mst_cst_frcst_h.dlv_cd IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN mst_cst_frcst_h.cst_frcst_prnt_dt IS '得意先内示書発行日 // #MA.DT // Customer forecast list issue date';


COMMENT ON COLUMN mst_cst_frcst_h.cst_frcst_slip_no IS '得意先内示書ＮＯ // #MA.CST_FRCST_SLIP_NO // Customer forecast list No.';


COMMENT ON COLUMN mst_cst_frcst_h.frcst_dpt_cd IS '担当部門ＣＤ // #MA.DPT_CD // Dept. in charge cd.';


COMMENT ON COLUMN mst_cst_frcst_h.frcst_usr_cd IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN mst_cst_frcst_h.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mst_cst_frcst_h.rcpt_dt IS '受付日 // #MA.DT // Receiving date';


COMMENT ON COLUMN mst_cst_frcst_h.can_rsn_cd IS '取消理由ＣＤ // #MS.SLO_RSN_CD // Canceling reason cd.';


COMMENT ON COLUMN mst_cst_frcst_h.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mst_cst_frcst_h.can_rmrks IS '取消備考 // #MS.CST_FRCST_CAN_RMRKS // Cancel remarks';


COMMENT ON COLUMN mst_cst_frcst_h.intr_rmrks IS '内部備考 // #MS.CST_FRCST_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_cst_frcst_h.sub_char1 IS '予備１ // #MS.CST_FRCST_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_cst_frcst_h.sub_char2 IS '予備２ // #MS.CST_FRCST_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_cst_frcst_h.sub_char3 IS '予備３ // #MS.CST_FRCST_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_cst_frcst_h.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_cst_frcst_h.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_cst_frcst_h.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_cst_frcst_h.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_cst_frcst_h.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_cst_frcst_h.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_cst_frcst_h.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_cst_frcst_h.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_cst_frcst_h.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_cst_frcst_h.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

