\encoding UTF-8

COMMENT ON VIEW mam_usr IS '担当者マスタ // PIC master';


COMMENT ON COLUMN mam_usr.usr_cd IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN mam_usr.usr_nm IS '担当者名 // #MA.USR_NM // PIC name';


COMMENT ON COLUMN mam_usr.base_usr_nm IS '担当者名（ベース） // #MA.USR_NM // PIC name(Base)';


COMMENT ON COLUMN mam_usr.usr_alt_nm1 IS '担当者別名１ // #MA.USR_LNM1 // PIC alias name 1';


COMMENT ON COLUMN mam_usr.base_usr_alt_nm1 IS '担当者別名１（ベース） // #MA.USR_LNM1 // PIC alias name 1(Base)';


COMMENT ON COLUMN mam_usr.usr_alt_nm2 IS '担当者別名２ // #MA.USR_LNM2 // PIC alias name 2';


COMMENT ON COLUMN mam_usr.base_usr_alt_nm2 IS '担当者別名２（ベース） // #MA.USR_LNM2 // PIC alias name 2(Base)';


COMMENT ON COLUMN mam_usr.usr_alt_nm3 IS '担当者別名３ // #MA.USR_LNM3 // PIC alias name 3';


COMMENT ON COLUMN mam_usr.base_usr_alt_nm3 IS '担当者別名３（ベース） // #MA.USR_LNM3 // PIC alias name 3(Base)';


COMMENT ON COLUMN mam_usr.usr_alt_nm4 IS '担当者別名４ // #MA.USR_LNM4 // PIC alias name 4';


COMMENT ON COLUMN mam_usr.base_usr_alt_nm4 IS '担当者別名４（ベース） // #MA.USR_LNM4 // PIC alias name 4(Base)';


COMMENT ON COLUMN mam_usr.full_da_flg IS 'フルデータアクセスＦＬＧ // #MA.FLG // Full data access';


COMMENT ON COLUMN mam_usr.email1 IS 'Ｅ－ｍａｉｌ１ // #MA.EMAIL // E-mail 1';


COMMENT ON COLUMN mam_usr.email2 IS 'Ｅ－ｍａｉｌ２ // #MA.EMAIL // E-mail 2';


COMMENT ON COLUMN mam_usr.email3 IS 'Ｅ－ｍａｉｌ３ // #MA.EMAIL // E-mail 3';


COMMENT ON COLUMN mam_usr.tel1 IS 'ＴＥＬ１ // #MA.TEL // TEL 1';


COMMENT ON COLUMN mam_usr.tel2 IS 'ＴＥＬ２ // #MA.TEL // TEL 2';


COMMENT ON COLUMN mam_usr.tel3 IS 'ＴＥＬ３ // #MA.TEL // TEL 3';


COMMENT ON COLUMN mam_usr.th_image IS 'サムネイル画像 // #MA.BIN // Thumbnail image';


COMMENT ON COLUMN mam_usr.usr_com_typ IS '社員区分 // #MA.USR_COM_TYP // Employee type';


COMMENT ON COLUMN mam_usr.usr_com IS '所属会社 // #MA.USR_COM // Affiliation company';


COMMENT ON COLUMN mam_usr.wk_cost_cd IS '工数管理ＣＤ // #MA.WK_COST_CD // Work element cd.';


COMMENT ON COLUMN mam_usr.usr_info1 IS '担当者情報１ // #MA.USR_INFO1 // PIC info. 1';


COMMENT ON COLUMN mam_usr.usr_info2 IS '担当者情報２ // #MA.USR_INFO2 // PIC info. 2';


COMMENT ON COLUMN mam_usr.usr_info3 IS '担当者情報３ // #MA.USR_INFO3 // PIC info. 3';


COMMENT ON COLUMN mam_usr.usr_info4 IS '担当者情報４ // #MA.USR_INFO4 // PIC info. 4';


COMMENT ON COLUMN mam_usr.usr_info5 IS '担当者情報５ // #MA.USR_INFO5 // PIC info. 5';


COMMENT ON COLUMN mam_usr.usr_info6 IS '担当者情報６ // #MA.USR_INFO6 // PIC info. 6';


COMMENT ON COLUMN mam_usr.usr_info7 IS '担当者情報７ // #MA.USR_INFO7 // PIC info. 7';


COMMENT ON COLUMN mam_usr.usr_info8 IS '担当者情報８ // #MA.USR_INFO8 // PIC info. 8';


COMMENT ON COLUMN mam_usr.usr_info9 IS '担当者情報９ // #MA.USR_INFO9 // PIC info. 9';


COMMENT ON COLUMN mam_usr.usr_info10 IS '担当者情報１０ // #MA.USR_INFO10 // PIC info. 10';


COMMENT ON COLUMN mam_usr.usr_info11 IS '担当者情報１１ // #MA.USR_INFO11 // PIC info. 11';


COMMENT ON COLUMN mam_usr.usr_info12 IS '担当者情報１２ // #MA.USR_INFO12 // PIC info. 12';


COMMENT ON COLUMN mam_usr.usr_info13 IS '担当者情報１３ // #MA.USR_INFO13 // PIC info. 13';


COMMENT ON COLUMN mam_usr.usr_info14 IS '担当者情報１４ // #MA.USR_INFO14 // PIC info. 14';


COMMENT ON COLUMN mam_usr.usr_info15 IS '担当者情報１５ // #MA.USR_INFO15 // PIC info. 15';


COMMENT ON COLUMN mam_usr.usr_info16 IS '担当者情報１６ // #MA.USR_INFO16 // PIC info. 16';


COMMENT ON COLUMN mam_usr.usr_info17 IS '担当者情報１７ // #MA.USR_INFO17 // PIC info. 17';


COMMENT ON COLUMN mam_usr.usr_info18 IS '担当者情報１８ // #MA.USR_INFO18 // PIC info. 18';


COMMENT ON COLUMN mam_usr.usr_info19 IS '担当者情報１９ // #MA.USR_INFO19 // PIC info. 19';


COMMENT ON COLUMN mam_usr.usr_info20 IS '担当者情報２０ // #MA.USR_INFO20 // PIC info. 20';


COMMENT ON COLUMN mam_usr.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_usr.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_usr.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_usr.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_usr.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_usr.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_usr.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_usr.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_usr.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_usr.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_usr.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_usr.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_usr.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_usr.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_usr.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_usr.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_usr.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

