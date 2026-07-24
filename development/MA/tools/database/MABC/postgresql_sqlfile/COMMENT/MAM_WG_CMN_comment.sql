\encoding UTF-8

COMMENT ON TABLE mam_wg_cmn IS 'ワーキンググループマスタ_（共通）_ // WG master_(Common)_';


COMMENT ON COLUMN mam_wg_cmn.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mam_wg_cmn.wg_nm IS 'ワーキンググループ名 // #MA.WG_NM // WG name';


COMMENT ON COLUMN mam_wg_cmn.sls_flg IS '販売ＦＬＧ // #MA.FLG // Sales flg.';


COMMENT ON COLUMN mam_wg_cmn.lg_flg IS '物流ＦＬＧ // #MA.FLG // Distribution flg.';


COMMENT ON COLUMN mam_wg_cmn.mfg_flg IS '製造ＦＬＧ // #MA.FLG // Mfg. flg.';


COMMENT ON COLUMN mam_wg_cmn.purc_flg IS '購買ＦＬＧ // #MA.FLG // Purchasing flg.';


COMMENT ON COLUMN mam_wg_cmn.ar_flg IS '債権ＦＬＧ // #MA.FLG // AR flg.';


COMMENT ON COLUMN mam_wg_cmn.ap_flg IS '債務ＦＬＧ // #MA.FLG // AP flg.';


COMMENT ON COLUMN mam_wg_cmn.sd_flg IS '需給ＦＬＧ // #MA.FLG // Demand and supply flg.';


COMMENT ON COLUMN mam_wg_cmn.mrp_prefix IS 'ＭＲＰ発番用接頭語 // #MA.MRP_PREFIX // Prefix for MRP numbering';


COMMENT ON COLUMN mam_wg_cmn.mfg_inst_unit_typ IS '製造指図単位区分 // #MA.MFG_INST_UNIT_TYP // Mfg. order unit type';


COMMENT ON COLUMN mam_wg_cmn.mrp_proc_typ IS 'ＭＲＰ処理区分 // #MA.MRP_PROC_TYP // MRP process type';


COMMENT ON COLUMN mam_wg_cmn.alloc_margin_days IS '引当余裕日数 // #MA.DAYS // Allocation extra days';


COMMENT ON COLUMN mam_wg_cmn.not_xfr_flg IS '移動・移送引当対象外ＦＬＧ // #MA.FLG // Not for movement/transport allocation flg.';


COMMENT ON COLUMN mam_wg_cmn.mrp_alloc_margin_days IS 'ＭＲＰ引当余裕日数 // #MA.DAYS // MRP allocation extra days';


COMMENT ON COLUMN mam_wg_cmn.mrp_opn_xfr_days IS 'ＭＲＰ未確定移送依頼考慮日数 // #MA.DAYS // Days to consider unfirm transport request in MRP';


COMMENT ON COLUMN mam_wg_cmn.rqmt_typ IS '所要区分 // #MA.RQMT_TYP // Requirements type';


COMMENT ON COLUMN mam_wg_cmn.prod_pln_typ IS '生産計画立案区分 // #MA.PROD_PLN_TYP // Production planning type';


COMMENT ON COLUMN mam_wg_cmn.dmnd_date_div_mons IS '需要日ばらし月数 // #MA.MONS // Number of months for demand disaggregation by day';


COMMENT ON COLUMN mam_wg_cmn.plm_flg IS 'ＰＬＭ ＦＬＧ // #MA.FLG // PLM flg.';


COMMENT ON COLUMN mam_wg_cmn.calc_seq IS '計算順序 // #MA.INT3 // Calculation sequence';


COMMENT ON COLUMN mam_wg_cmn.cmn_upri_flg IS '共通単価ＦＬＧ // #MA.FLG // Common unit price flg.';


COMMENT ON COLUMN mam_wg_cmn.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_wg_cmn.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_wg_cmn.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_wg_cmn.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_wg_cmn.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_wg_cmn.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_wg_cmn.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_wg_cmn.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_wg_cmn.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_wg_cmn.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_wg_cmn.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_wg_cmn.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_wg_cmn.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_wg_cmn.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_wg_cmn.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_wg_cmn.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_wg_cmn.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

