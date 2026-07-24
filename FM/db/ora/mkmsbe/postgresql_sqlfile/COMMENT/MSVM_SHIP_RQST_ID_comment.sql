\encoding UTF-8

COMMENT ON VIEW msvm_ship_rqst_id IS '出荷依頼先識別ビュー // Shipping requested identification view';


COMMENT ON COLUMN msvm_ship_rqst_id.ship_rqst_id_typ IS '出荷依頼先識別区分 // #MS.SHIP_RQST_ID_TYP // Shipping requested identification type';


COMMENT ON COLUMN msvm_ship_rqst_id.ship_rqst_id_cd IS '出荷依頼先識別ＣＤ // #MS.SHIP_RQST_ID_CD // Shipping requested alias cd.';


COMMENT ON COLUMN msvm_ship_rqst_id.ship_rqst_id_nm IS '出荷依頼先識別名 // #MS.SHIP_RQST_ID_NM // Shipping requested alias name';


COMMENT ON COLUMN msvm_ship_rqst_id.ship_rqst_id_alt_nm1 IS '出荷依頼先識別別名１ // #MA.BP_ALT_NM1 // Shipping requested identification alias name 1';


COMMENT ON COLUMN msvm_ship_rqst_id.ship_rqst_id_alt_nm2 IS '出荷依頼先識別別名２ // #MA.BP_ALT_NM2 // Shipping requested identification alias name 2';


COMMENT ON COLUMN msvm_ship_rqst_id.ship_rqst_id_alt_nm3 IS '出荷依頼先識別別名３ // #MA.BP_ALT_NM3 // Shipping requested identification alias name 3';


COMMENT ON COLUMN msvm_ship_rqst_id.ship_rqst_id_alt_nm4 IS '出荷依頼先識別別名４ // #MA.BP_ALT_NM4 // Shipping requested identification alias name 4';


COMMENT ON COLUMN msvm_ship_rqst_id.cntry_cd IS '国ＣＤ // #MA.CNTRY_CD // Country cd.';


COMMENT ON COLUMN msvm_ship_rqst_id.cntry_nm IS '国名 // #MA.CNTRY_NM // Country name';


COMMENT ON COLUMN msvm_ship_rqst_id.site_cd IS '工場・物流倉庫ＣＤ // #MA.SITE_CD // Factory/Distribution warehouse cd.';


COMMENT ON COLUMN msvm_ship_rqst_id.site_nm IS '工場・物流倉庫名 // #MA.SITE_NM // Factory/Distribution warehouse name';


COMMENT ON COLUMN msvm_ship_rqst_id.lg_grp_cd IS '物流グループＣＤ // #MA.LG_GRP_CD // Distribution group cd.';


COMMENT ON COLUMN msvm_ship_rqst_id.lg_grp_nm IS '物流グループ名 // #MA.LG_GRP_NM // Distribution group name';


COMMENT ON COLUMN msvm_ship_rqst_id.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN msvm_ship_rqst_id.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN msvm_ship_rqst_id.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN msvm_ship_rqst_id.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';

