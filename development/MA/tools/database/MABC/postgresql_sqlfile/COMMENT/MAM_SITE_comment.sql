\encoding UTF-8

COMMENT ON VIEW mam_site IS '工場・物流倉庫マスタ // Factory/Distribution warehouse master';


COMMENT ON COLUMN mam_site.site_cd IS '工場・物流倉庫ＣＤ // #MA.SITE_CD // Factory/Distribution warehouse cd.';


COMMENT ON COLUMN mam_site.site_nm IS '工場・物流倉庫名 // #MA.SITE_NM // Factory/Distribution warehouse name';


COMMENT ON COLUMN mam_site.base_site_nm IS '工場・物流倉庫名（ベース） // #MA.SITE_NM // Factory/Distribution warehouse name(Base)';


COMMENT ON COLUMN mam_site.arr_flg IS '入荷ＦＬＧ // #MA.FLG // Receipt flg.';


COMMENT ON COLUMN mam_site.zip_cd IS '郵便番号 // #MA.ZIP_CD // Zip code';


COMMENT ON COLUMN mam_site.base_zip_cd IS '郵便番号（ベース） // #MA.ZIP_CD // Zip code(Base)';


COMMENT ON COLUMN mam_site.addr1 IS '住所１ // #MA.ADDR1 // Address 1';


COMMENT ON COLUMN mam_site.base_addr1 IS '住所１（ベース） // #MA.ADDR1 // Address 1(Base)';


COMMENT ON COLUMN mam_site.addr2 IS '住所２ // #MA.ADDR2 // Address 2';


COMMENT ON COLUMN mam_site.base_addr2 IS '住所２（ベース） // #MA.ADDR2 // Address 2(Base)';


COMMENT ON COLUMN mam_site.addr3 IS '住所３ // #MA.ADDR3 // Address 3';


COMMENT ON COLUMN mam_site.base_addr3 IS '住所３（ベース） // #MA.ADDR3 // Address 3(Base)';


COMMENT ON COLUMN mam_site.addr4 IS '住所４ // #MA.ADDR4 // Address 4';


COMMENT ON COLUMN mam_site.base_addr4 IS '住所４（ベース） // #MA.ADDR4 // Address 4(Base)';


COMMENT ON COLUMN mam_site.tel IS 'ＴＥＬ // #MA.TEL // TEL';


COMMENT ON COLUMN mam_site.base_tel IS 'ＴＥＬ（ベース） // #MA.TEL // TEL(Base)';


COMMENT ON COLUMN mam_site.fax IS 'ＦＡＸ // #MA.TEL // FAX';


COMMENT ON COLUMN mam_site.base_fax IS 'ＦＡＸ（ベース） // #MA.TEL // FAX(Base)';


COMMENT ON COLUMN mam_site.def_loc_grp_cd IS '製造場所グループＣＤ // #MA.LOC_GRP_CD // Mfg. location group cd.';


COMMENT ON COLUMN mam_site.def_alloc_grp_cd IS '総量引当場所グループＣＤ // #MA.ALLOC_GRP_CD // Gross allocation location group cd.';


COMMENT ON COLUMN mam_site.def_lg_grp_cd IS '物流グループＣＤ // #MA.LG_GRP_CD // Distribution group cd.';


COMMENT ON COLUMN mam_site.def_cal_cd IS 'カレンダＣＤ // #MA.CAL_CD // Calendar cd.';


COMMENT ON COLUMN mam_site.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_site.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_site.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_site.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_site.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_site.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_site.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_site.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_site.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_site.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_site.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_site.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_site.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_site.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_site.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_site.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_site.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

