\encoding UTF-8

COMMENT ON VIEW mst_purc_schd IS '仕入予定 // Purchase schedule';


COMMENT ON COLUMN mst_purc_schd.purc_schd_no IS '仕入予定ＮＯ // #MA.PURC_SCHD_NO // Purchase schedule No.';


COMMENT ON COLUMN mst_purc_schd.arr_pr_no IS '入荷進捗ＮＯ // #MA.ARR_PR_NO // Receipt progress No.';


COMMENT ON COLUMN mst_purc_schd.arr_schd_no IS '入荷予定ＮＯ // #MA.ARR_SCHD_NO // Receipt schedule No.';


COMMENT ON COLUMN mst_purc_schd.purc_schd_dt IS '仕入予定日 // #MA.DT // Scheduled purchase date';


COMMENT ON COLUMN mst_purc_schd.trd_unit_schd_qty IS '取引単位予定数量 // #MA.QTY // Transaction unit scheduled qty.';


COMMENT ON COLUMN mst_purc_schd.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_purc_schd.base_unit_schd_qty IS '基準単位予定数量 // #MA.QTY // Base unit scheduled qty.';


COMMENT ON COLUMN mst_purc_schd.base_unit_abort_qty IS '基準単位打切数量 // #MA.QTY // Base unit cancelled remaining qty.';


COMMENT ON COLUMN mst_purc_schd.base_unit_purc_qty IS '基準単位仕入数量 // #MA.QTY // Base unit purchase qty.';


COMMENT ON COLUMN mst_purc_schd.base_unit_temp_purc_qty IS '基準単位仮仕入数量 // #MA.QTY // Base unit temporary purchase qty.';


COMMENT ON COLUMN mst_purc_schd.base_unit_accpt_dfct_qty IS '基準単位検収不良数量 // #MA.QTY // Base unit acceptance detective qty.';


COMMENT ON COLUMN mst_purc_schd.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_purc_schd.non_purc_flg IS '仕入対象外ＦＬＧ // #MA.FLG // Not for purchase flg.';


COMMENT ON COLUMN mst_purc_schd.cmpl_flg IS '完了ＦＬＧ // #MA.FLG // Completed flg.';


COMMENT ON COLUMN mst_purc_schd.abort_flg IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN mst_purc_schd.purc_split_flg IS '仕入分割ＦＬＧ // #MA.FLG // Purchase split flg.';


COMMENT ON COLUMN mst_purc_schd.sub_char1 IS '予備１ // #MS.PURC_SCHD_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_purc_schd.sub_char2 IS '予備２ // #MS.PURC_SCHD_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_purc_schd.sub_char3 IS '予備３ // #MS.PURC_SCHD_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_purc_schd.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_purc_schd.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_purc_schd.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_purc_schd.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_purc_schd.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_purc_schd.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_purc_schd.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_purc_schd.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_purc_schd.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_purc_schd.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

