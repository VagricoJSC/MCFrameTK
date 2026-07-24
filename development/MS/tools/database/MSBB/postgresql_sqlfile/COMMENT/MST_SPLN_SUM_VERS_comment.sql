\encoding UTF-8

COMMENT ON VIEW mst_spln_sum_vers IS '集計別販売計画バージョン // Sales plan version by aggregated';


COMMENT ON COLUMN mst_spln_sum_vers.dpt_cd IS '部門ＣＤ // #MA.DPT_CD // Dept. cd.';


COMMENT ON COLUMN mst_spln_sum_vers.cst_cd IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN mst_spln_sum_vers.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mst_spln_sum_vers.ym IS '計画年月 // #MA.YM // Plan month';


COMMENT ON COLUMN mst_spln_sum_vers.spln_vers IS 'バージョン // #MS.SPLN_VERS // Version';


COMMENT ON COLUMN mst_spln_sum_vers.edited_flg IS '編集済 // #MA.FLG // Edited';


COMMENT ON COLUMN mst_spln_sum_vers.adopted_flg IS '採用ＦＬＧ // #MA.FLG // Adopted flg.';


COMMENT ON COLUMN mst_spln_sum_vers.locked_flg IS '訂正不可ＦＬＧ // #MA.FLG // Uncorrectable flg.';


COMMENT ON COLUMN mst_spln_sum_vers.ref_vers IS '比較バージョン // #MS.SPLN_VERS // Comparison version';


COMMENT ON COLUMN mst_spln_sum_vers.usr_cd IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN mst_spln_sum_vers.intr_rmrks IS '内部備考 // #MS.SPLN_SUM_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_spln_sum_vers.sub_char1 IS '予備１ // #MS.SPLN_SUM_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_spln_sum_vers.sub_char2 IS '予備２ // #MS.SPLN_SUM_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_spln_sum_vers.sub_char3 IS '予備３ // #MS.SPLN_SUM_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_spln_sum_vers.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_spln_sum_vers.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_spln_sum_vers.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_spln_sum_vers.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_spln_sum_vers.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_spln_sum_vers.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_spln_sum_vers.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_spln_sum_vers.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_spln_sum_vers.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_spln_sum_vers.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

