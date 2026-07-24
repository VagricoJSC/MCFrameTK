\encoding UTF-8

COMMENT ON TABLE mst_dly_dmnd_all IS '日次需要情報 // Daily demand';


COMMENT ON COLUMN mst_dly_dmnd_all.dly_dmnd_no IS '日次需要ＮＯ // #MA.DLY_DMND_NO // Daily demand No.';


COMMENT ON COLUMN mst_dly_dmnd_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_dly_dmnd_all.dmnd_no IS '需要ＮＯ // #MA.DMND_NO // Demand No.';


COMMENT ON COLUMN mst_dly_dmnd_all.dmnd_dt IS '需要日 // #MA.DT // Demand date';


COMMENT ON COLUMN mst_dly_dmnd_all.dmnd_st_dt IS '需要期間開始日 // #MA.DT // Demand period start date';


COMMENT ON COLUMN mst_dly_dmnd_all.dmnd_end_dt IS '需要期間終了日 // #MA.DT // Demand period end date';


COMMENT ON COLUMN mst_dly_dmnd_all.dlv_schd_st_dt IS '納品予定期間開始日 // #MA.DT // Delivery schedule period start date';


COMMENT ON COLUMN mst_dly_dmnd_all.dlv_schd_end_dt IS '納品予定期間終了日 // #MA.DT // Delivery schedule period end date';


COMMENT ON COLUMN mst_dly_dmnd_all.dmnd_period_typ IS '需要期間区分 // #MA.PERIOD_TYP // Demand period type';


COMMENT ON COLUMN mst_dly_dmnd_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_dly_dmnd_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_dly_dmnd_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_dly_dmnd_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_dly_dmnd_all.spln_itm_cd IS '計画品目ＣＤ // #MA.SPLN_ITM_CD // Plan item cd.';


COMMENT ON COLUMN mst_dly_dmnd_all.dmnd_typ IS '需要区分 // #MS.DMND_TYP // Demand type';


COMMENT ON COLUMN mst_dly_dmnd_all.dmnd_qty IS '需要数量 // #MA.QTY // Demand qty.';


COMMENT ON COLUMN mst_dly_dmnd_all.dmnd_dpt_cd IS '需要元部門ＣＤ // #MA.DPT_CD // Demand source dept. cd.';


COMMENT ON COLUMN mst_dly_dmnd_all.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mst_dly_dmnd_all.dmnd_usr_cd IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN mst_dly_dmnd_all.cst_cd IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN mst_dly_dmnd_all.dlv_cd IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN mst_dly_dmnd_all.slo_d_no IS '受注明細ＮＯ // #MA.SLO_D_NO // Sales order details No.';


COMMENT ON COLUMN mst_dly_dmnd_all.slo_no IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN mst_dly_dmnd_all.cst_frcst_d_no IS '顧客期間内示明細ＮＯ // #MA.CST_FRCST_D_NO // Sales forecast details No.';


COMMENT ON COLUMN mst_dly_dmnd_all.cst_frcst_no IS '顧客期間内示ＮＯ // #MA.CST_FRCST_NO // Sales forecast No.';


COMMENT ON COLUMN mst_dly_dmnd_all.ym IS '計画月度 // #MA.YM // Plan month';


COMMENT ON COLUMN mst_dly_dmnd_all.spln_vers IS '販売計画バージョン // #MS.SPLN_VERS // Sales plan version';


COMMENT ON COLUMN mst_dly_dmnd_all.cur_cd IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN mst_dly_dmnd_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_dly_dmnd_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_dly_dmnd_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_dly_dmnd_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_dly_dmnd_all.dmnd_loc_cd IS '需要場所ＣＤ // #MA.LOC_CD // Demand location cd.';


COMMENT ON COLUMN mst_dly_dmnd_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_dly_dmnd_all.intr_rmrks IS '内部備考 // #MS.DLY_DMND_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_dly_dmnd_all.sub_char1 IS '予備１ // #MS.DLY_DMND_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_dly_dmnd_all.sub_char2 IS '予備２ // #MS.DLY_DMND_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_dly_dmnd_all.sub_char3 IS '予備３ // #MS.DLY_DMND_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_dly_dmnd_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_dly_dmnd_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_dly_dmnd_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_dly_dmnd_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_dly_dmnd_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_dly_dmnd_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_dly_dmnd_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_dly_dmnd_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_dly_dmnd_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_dly_dmnd_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

