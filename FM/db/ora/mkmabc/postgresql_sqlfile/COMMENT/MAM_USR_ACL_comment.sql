\encoding UTF-8

COMMENT ON VIEW mam_usr_acl IS '担当者権限マスタ // PIC authority master';


COMMENT ON COLUMN mam_usr_acl.usr_cd IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN mam_usr_acl.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mam_usr_acl.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mam_usr_acl.da_cd IS 'データアクセスＣＤ // #MA.DA_CD // Data access cd.';


COMMENT ON COLUMN mam_usr_acl.pre_cl_usr_flg IS '仮締訂正可能ＦＬＧ // #MA.FLG // Allow data correction after temporary closing flg.';


COMMENT ON COLUMN mam_usr_acl.cl_usr_flg IS '本締訂正可能ＦＬＧ // #MA.FLG // Allow data correction after final closing flg.';


COMMENT ON COLUMN mam_usr_acl.dpt_cd IS '主部門ＣＤ // #MA.DPT_CD // Main dept. cd.';


COMMENT ON COLUMN mam_usr_acl.add_dpt_cd1 IS '兼務部門ＣＤ１ // #MA.DPT_CD // Concurrent dept. cd.1';


COMMENT ON COLUMN mam_usr_acl.add_dpt_cd2 IS '兼務部門ＣＤ２ // #MA.DPT_CD // Concurrent dept. cd.2';


COMMENT ON COLUMN mam_usr_acl.add_dpt_cd3 IS '兼務部門ＣＤ３ // #MA.DPT_CD // Concurrent dept. cd.3';


COMMENT ON COLUMN mam_usr_acl.add_dpt_cd4 IS '兼務部門ＣＤ４ // #MA.DPT_CD // Concurrent dept. cd.4';


COMMENT ON COLUMN mam_usr_acl.add_dpt_cd5 IS '兼務部門ＣＤ５ // #MA.DPT_CD // Concurrent dept. cd.5';


COMMENT ON COLUMN mam_usr_acl.add_dpt_cd6 IS '兼務部門ＣＤ６ // #MA.DPT_CD // Concurrent dept. cd.6';


COMMENT ON COLUMN mam_usr_acl.add_dpt_cd7 IS '兼務部門ＣＤ７ // #MA.DPT_CD // Concurrent dept. cd.7';


COMMENT ON COLUMN mam_usr_acl.add_dpt_cd8 IS '兼務部門ＣＤ８ // #MA.DPT_CD // Concurrent dept. cd.8';


COMMENT ON COLUMN mam_usr_acl.add_dpt_cd9 IS '兼務部門ＣＤ９ // #MA.DPT_CD // Concurrent dept. cd.9';


COMMENT ON COLUMN mam_usr_acl.aprv_role_cd IS '承認役割ＣＤ（主） // #MA.APRV_ROLE_CD // Approval role cd. (Main)';


COMMENT ON COLUMN mam_usr_acl.aprv_role_cd1 IS '承認役割ＣＤ１（主） // #MA.APRV_ROLE_CD // Approval role cd. 1 (Main)';


COMMENT ON COLUMN mam_usr_acl.aprv_role_cd2 IS '承認役割ＣＤ２（主） // #MA.APRV_ROLE_CD // Approval role cd. 2 (Main)';


COMMENT ON COLUMN mam_usr_acl.aprv_role_cd3 IS '承認役割ＣＤ３（主） // #MA.APRV_ROLE_CD // Approval role cd. 3 (Main)';


COMMENT ON COLUMN mam_usr_acl.aprv_role_cd4 IS '承認役割ＣＤ４（主） // #MA.APRV_ROLE_CD // Approval role cd. 4 (Main)';


COMMENT ON COLUMN mam_usr_acl.aprv_role_cd5 IS '承認役割ＣＤ５（主） // #MA.APRV_ROLE_CD // Approval role cd. 5 (Main)';


COMMENT ON COLUMN mam_usr_acl.aprv_role_cd6 IS '承認役割ＣＤ６（主） // #MA.APRV_ROLE_CD // Approval role cd. 6 (Main)';


COMMENT ON COLUMN mam_usr_acl.aprv_role_cd7 IS '承認役割ＣＤ７（主） // #MA.APRV_ROLE_CD // Approval role cd. 7 (Main)';


COMMENT ON COLUMN mam_usr_acl.aprv_role_cd8 IS '承認役割ＣＤ８（主） // #MA.APRV_ROLE_CD // Approval role cd. 8 (Main)';


COMMENT ON COLUMN mam_usr_acl.aprv_role_cd9 IS '承認役割ＣＤ９（主） // #MA.APRV_ROLE_CD // Approval role cd. 9 (Main)';


COMMENT ON COLUMN mam_usr_acl.sub_aprv_role_cd IS '承認役割ＣＤ（副） // #MA.APRV_ROLE_CD // Approval role cd. (Sub)';


COMMENT ON COLUMN mam_usr_acl.sub_aprv_role_cd1 IS '承認役割ＣＤ１（副） // #MA.APRV_ROLE_CD // Approval role cd. 1 (Sub)';


COMMENT ON COLUMN mam_usr_acl.sub_aprv_role_cd2 IS '承認役割ＣＤ２（副） // #MA.APRV_ROLE_CD // Approval role cd. 2 (Sub)';


COMMENT ON COLUMN mam_usr_acl.sub_aprv_role_cd3 IS '承認役割ＣＤ３（副） // #MA.APRV_ROLE_CD // Approval role cd. 3 (Sub)';


COMMENT ON COLUMN mam_usr_acl.sub_aprv_role_cd4 IS '承認役割ＣＤ４（副） // #MA.APRV_ROLE_CD // Approval role cd. 4 (Sub)';


COMMENT ON COLUMN mam_usr_acl.sub_aprv_role_cd5 IS '承認役割ＣＤ５（副） // #MA.APRV_ROLE_CD // Approval role cd. 5 (Sub)';


COMMENT ON COLUMN mam_usr_acl.sub_aprv_role_cd6 IS '承認役割ＣＤ６（副） // #MA.APRV_ROLE_CD // Approval role cd. 6 (Sub)';


COMMENT ON COLUMN mam_usr_acl.sub_aprv_role_cd7 IS '承認役割ＣＤ７（副） // #MA.APRV_ROLE_CD // Approval role cd. 7 (Sub)';


COMMENT ON COLUMN mam_usr_acl.sub_aprv_role_cd8 IS '承認役割ＣＤ８（副） // #MA.APRV_ROLE_CD // Approval role cd. 8 (Sub)';


COMMENT ON COLUMN mam_usr_acl.sub_aprv_role_cd9 IS '承認役割ＣＤ９（副） // #MA.APRV_ROLE_CD // Approval role cd. 9 (Sub)';


COMMENT ON COLUMN mam_usr_acl.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_usr_acl.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_usr_acl.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_usr_acl.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_usr_acl.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_usr_acl.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_usr_acl.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_usr_acl.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_usr_acl.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_usr_acl.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_usr_acl.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_usr_acl.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_usr_acl.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_usr_acl.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_usr_acl.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_usr_acl.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_usr_acl.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

