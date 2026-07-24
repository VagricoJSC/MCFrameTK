\encoding UTF-8

COMMENT ON VIEW msvm_ship_to_id IS '送付先識別ビュー // Receiving point identification view';


COMMENT ON COLUMN msvm_ship_to_id.ship_to_id_typ IS '送付先識別区分 // #MS.SHIP_TO_ID_TYP // Receiving point identification type';


COMMENT ON COLUMN msvm_ship_to_id.ship_to_id_cd IS '送付先識別ＣＤ // #MS.SHIP_TO_ID_CD // Receiving point identification cd.';


COMMENT ON COLUMN msvm_ship_to_id.ship_to_id_nm IS '送付先識別名 // #MS.SHIP_TO_ID_NM // Receiving point Identification name';


COMMENT ON COLUMN msvm_ship_to_id.ship_to_id_alt_nm1 IS '送付先識別別名１ // #MA.BP_ALT_NM1 // Receiving point identification alias name 1';


COMMENT ON COLUMN msvm_ship_to_id.ship_to_id_alt_nm2 IS '送付先識別別名２ // #MA.BP_ALT_NM2 // Receiving point identification alias name 2';


COMMENT ON COLUMN msvm_ship_to_id.ship_to_id_alt_nm3 IS '送付先識別別名３ // #MA.BP_ALT_NM3 // Receiving point identification alias name 3';


COMMENT ON COLUMN msvm_ship_to_id.ship_to_id_alt_nm4 IS '送付先識別別名４ // #MA.BP_ALT_NM4 // Receiving point identification alias name 4';


COMMENT ON COLUMN msvm_ship_to_id.ship_to_sundry_flg IS '送付先諸口ＦＬＧ // #MA.FLG // Miscellaneous receiving point flg.';


COMMENT ON COLUMN msvm_ship_to_id.via_dlv_typ IS '配送先経由区分 // #MA.VIA_DLV_TYP // Receiving point stopover type';


COMMENT ON COLUMN msvm_ship_to_id.cntry_cd IS '国ＣＤ // #MA.CNTRY_CD // Country cd.';


COMMENT ON COLUMN msvm_ship_to_id.cntry_nm IS '国名 // #MA.CNTRY_NM // Country name';


COMMENT ON COLUMN msvm_ship_to_id.site_cd IS '工場・物流倉庫ＣＤ // #MA.SITE_CD // Factory/Distribution warehouse cd.';


COMMENT ON COLUMN msvm_ship_to_id.site_nm IS '工場・物流倉庫名 // #MA.SITE_NM // Factory/Distribution warehouse name';


COMMENT ON COLUMN msvm_ship_to_id.lg_grp_cd IS '物流グループＣＤ // #MA.LG_GRP_CD // Distribution group cd.';


COMMENT ON COLUMN msvm_ship_to_id.lg_grp_nm IS '物流グループ名 // #MA.LG_GRP_NM // Distribution group name';


COMMENT ON COLUMN msvm_ship_to_id.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN msvm_ship_to_id.sppl_nm IS '発注先名 // #MA.BP_NM // Supplier name';


COMMENT ON COLUMN msvm_ship_to_id.str_ln_tgt_flg IS '棚・ライン対象ＦＬＧ // #MA.FLG // For rack/line flg.';


COMMENT ON COLUMN msvm_ship_to_id.pri_prnt_flg IS '価格印字ＦＬＧ // #MA.FLG // Print price flg.';


COMMENT ON COLUMN msvm_ship_to_id.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN msvm_ship_to_id.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN msvm_ship_to_id.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN msvm_ship_to_id.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';

