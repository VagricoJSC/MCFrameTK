\encoding UTF-8

COMMENT ON VIEW mam_itm_sub IS '品目補助マスタ // Item auxiliary master';


COMMENT ON COLUMN mam_itm_sub.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mam_itm_sub.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mam_itm_sub.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mam_itm_sub.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mam_itm_sub.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mam_itm_sub.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mam_itm_sub.sls_tax_cd IS '売上税ＣＤ // #MA.TAX_CD // Sales tax cd.';


COMMENT ON COLUMN mam_itm_sub.purc_tax_cd IS '仕入税ＣＤ // #MA.TAX_CD // Purchase tax cd.';


COMMENT ON COLUMN mam_itm_sub.prov_tax_cd IS '支給税ＣＤ // #MA.TAX_CD // Supply tax cd.';


COMMENT ON COLUMN mam_itm_sub.sls_itm_grp_cd IS '販売品目体系ＣＤ // #MA.SLS_ITM_GRP_CD // Sales item system cd.';


COMMENT ON COLUMN mam_itm_sub.wtax_rate IS '源泉税率 // #MA.TAX_RATE // Withholding tax rate';


COMMENT ON COLUMN mam_itm_sub.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_itm_sub.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_itm_sub.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_itm_sub.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_itm_sub.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_itm_sub.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_itm_sub.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_itm_sub.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_itm_sub.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_itm_sub.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_itm_sub.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_itm_sub.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_itm_sub.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_itm_sub.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_itm_sub.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_itm_sub.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_itm_sub.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

