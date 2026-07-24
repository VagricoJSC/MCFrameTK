\encoding UTF-8

COMMENT ON TABLE mam_mps_grp_all IS 'ＭＰＳグループマスタ // MPS group master';


COMMENT ON COLUMN mam_mps_grp_all.mps_grp_cd IS 'ＭＰＳグループＣＤ // #MA.MPS_GRP_CD // MPS group cd.';


COMMENT ON COLUMN mam_mps_grp_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mam_mps_grp_all.mps_grp_nm IS 'ＭＰＳグループ名 // #MA.MPS_GRP_NM // MPS group name';


COMMENT ON COLUMN mam_mps_grp_all.rqmt_mons IS '日次生産依頼作成月数 // #MA.MONS // Daily production request created months';


COMMENT ON COLUMN mam_mps_grp_all.prcd_mons IS '先行手配依頼作成月数 // #MA.MONS // Long LT request creation months';


COMMENT ON COLUMN mam_mps_grp_all.date_div_mons IS '日ばらし月数 // #MA.MONS // Number of months for disaggregation by day';


COMMENT ON COLUMN mam_mps_grp_all.week_div_mons IS '週ばらし月数 // #MA.MONS // Number of months disaggregated by week';


COMMENT ON COLUMN mam_mps_grp_all.period_div_mons IS '旬ばらし月数 // #MA.MONS // Number of months disaggregated by 10 days';


COMMENT ON COLUMN mam_mps_grp_all.date_div_typ IS '日ばらし区分 // #MA.DATE_DIV_TYP // Disaggregation by day type';


COMMENT ON COLUMN mam_mps_grp_all.mon01_prod_qty IS '１月生産可能数量／日 // #MA.QTY // Possible daily production qty. in January';


COMMENT ON COLUMN mam_mps_grp_all.mon02_prod_qty IS '２月生産可能数量／日 // #MA.QTY // Production possible qty. in February/day';


COMMENT ON COLUMN mam_mps_grp_all.mon03_prod_qty IS '３月生産可能数量／日 // #MA.QTY // Production possible qty. in March/day';


COMMENT ON COLUMN mam_mps_grp_all.mon04_prod_qty IS '４月生産可能数量／日 // #MA.QTY // Production possible qty. in April/day';


COMMENT ON COLUMN mam_mps_grp_all.mon05_prod_qty IS '５月生産可能数量／日 // #MA.QTY // Production possible qty. in May/day';


COMMENT ON COLUMN mam_mps_grp_all.mon06_prod_qty IS '６月生産可能数量／日 // #MA.QTY // Production possible qty. in June/day';


COMMENT ON COLUMN mam_mps_grp_all.mon07_prod_qty IS '７月生産可能数量／日 // #MA.QTY // Production possible qty. in July/day';


COMMENT ON COLUMN mam_mps_grp_all.mon08_prod_qty IS '８月生産可能数量／日 // #MA.QTY // Production possible qty. in August/day';


COMMENT ON COLUMN mam_mps_grp_all.mon09_prod_qty IS '９月生産可能数量／日 // #MA.QTY // Production possible qty. in September/day';


COMMENT ON COLUMN mam_mps_grp_all.mon10_prod_qty IS '１０月生産可能数量／日 // #MA.QTY // Production possible qty. in October/day';


COMMENT ON COLUMN mam_mps_grp_all.mon11_prod_qty IS '１１月生産可能数量／日 // #MA.QTY // Production possible qty. in November/day';


COMMENT ON COLUMN mam_mps_grp_all.mon12_prod_qty IS '１２月生産可能数量／日 // #MA.QTY // Production possible qty. in December/day';


COMMENT ON COLUMN mam_mps_grp_all.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_mps_grp_all.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_mps_grp_all.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_mps_grp_all.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_mps_grp_all.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_mps_grp_all.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_mps_grp_all.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_mps_grp_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_mps_grp_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_mps_grp_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_mps_grp_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_mps_grp_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_mps_grp_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_mps_grp_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_mps_grp_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_mps_grp_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_mps_grp_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

