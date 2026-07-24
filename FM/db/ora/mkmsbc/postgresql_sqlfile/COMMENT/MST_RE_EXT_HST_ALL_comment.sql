\encoding UTF-8

COMMENT ON TABLE mst_re_ext_hst_all IS '製造指図再展開履歴 // Mfg. order re-explosion history';


COMMENT ON COLUMN mst_re_ext_hst_all.mfg_inst_no IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN mst_re_ext_hst_all.ref_ord IS '反映順 // #MA.INT // Applied sequence';


COMMENT ON COLUMN mst_re_ext_hst_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_re_ext_hst_all.mfg_inst_rev IS '製造指図改訂番号 // #MA.SLIP_REV // Mfg. order rev. number';


COMMENT ON COLUMN mst_re_ext_hst_all.re_ext_typ IS '指図再展開区分 // #MS.RE_EXT_TYP // Order re-explosion type';


COMMENT ON COLUMN mst_re_ext_hst_all.chng_no IS '変更ＮＯ // #MA.CHNG_NO // Change No.';


COMMENT ON COLUMN mst_re_ext_hst_all.oper_chng_flg IS '工程変更ＦＬＧ // #MA.FLG // Operation change flg.';


COMMENT ON COLUMN mst_re_ext_hst_all.intr_rmrks IS '内部備考 // #MS.RE_EXT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_re_ext_hst_all.plm_cnt_rmrks IS '設計変更連絡備考 // #MA.PLM_CNT_RMRKS // Design changes contact remarks';


COMMENT ON COLUMN mst_re_ext_hst_all.sub_char1 IS '予備１ // #MS.RE_EXT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_re_ext_hst_all.sub_char2 IS '予備２ // #MS.RE_EXT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_re_ext_hst_all.sub_char3 IS '予備３ // #MS.RE_EXT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_re_ext_hst_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_re_ext_hst_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_re_ext_hst_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_re_ext_hst_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_re_ext_hst_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_re_ext_hst_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_re_ext_hst_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_re_ext_hst_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_re_ext_hst_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_re_ext_hst_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

