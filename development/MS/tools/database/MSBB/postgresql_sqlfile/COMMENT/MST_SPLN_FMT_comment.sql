\encoding UTF-8

COMMENT ON VIEW mst_spln_fmt IS '販売計画構成 // Sales plan configuration';


COMMENT ON COLUMN mst_spln_fmt.spln_fmt_no IS '販売計画構成ＮＯ // #MA.SPLN_FMT_NO // Sales plan configuration No.';


COMMENT ON COLUMN mst_spln_fmt.dpt_cd IS '部門ＣＤ // #MA.DPT_CD // Dept. cd.';


COMMENT ON COLUMN mst_spln_fmt.cst_cd IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN mst_spln_fmt.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mst_spln_fmt.spln_itm_cd IS '計画品目ＣＤ // #MA.SPLN_ITM_CD // Plan item cd.';


COMMENT ON COLUMN mst_spln_fmt.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_spln_fmt.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_spln_fmt.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_spln_fmt.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_spln_fmt.cur_cd IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN mst_spln_fmt.spln_set_typ IS '販売計画設定区分 // #MA.SPLN_SET_TYP // Sales plan setting classification';


COMMENT ON COLUMN mst_spln_fmt.cst_cd_unit_flg IS '得意先別集計ＦＬＧ // #MA.FLG // Aggregated flg. by customer';


COMMENT ON COLUMN mst_spln_fmt.wrk_no_unit_flg IS '案件ＮＯ別集計ＦＬＧ // #MA.FLG // Aggregated flg. by sales project No.';


COMMENT ON COLUMN mst_spln_fmt.disp_seq IS '表示順 // #MA.INT4 // Display order';


COMMENT ON COLUMN mst_spln_fmt.st_ym IS '適用開始年月 // #MA.YM // Application start month';


COMMENT ON COLUMN mst_spln_fmt.end_ym IS '適用終了年月 // #MA.YM // Application end month';


COMMENT ON COLUMN mst_spln_fmt.intr_rmrks IS '内部備考 // #MS.SPLN_FMT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_spln_fmt.sub_char1 IS '予備１ // #MS.SPLN_FMT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_spln_fmt.sub_char2 IS '予備２ // #MS.SPLN_FMT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_spln_fmt.sub_char3 IS '予備３ // #MS.SPLN_FMT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_spln_fmt.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_spln_fmt.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_spln_fmt.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_spln_fmt.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_spln_fmt.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_spln_fmt.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_spln_fmt.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_spln_fmt.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_spln_fmt.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_spln_fmt.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

