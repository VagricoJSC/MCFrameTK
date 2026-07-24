\encoding UTF-8

COMMENT ON TABLE mst_std_insp_inst_all IS '規格検査指図 // Specific inspection order';


COMMENT ON COLUMN mst_std_insp_inst_all.std_insp_inst_no IS '規格検査指図ＮＯ // #MA.STD_INSP_INST_NO // Specific inspection order No.';


COMMENT ON COLUMN mst_std_insp_inst_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_std_insp_inst_all.insp_typ IS '検査種類区分 // #MS.INSP_TYP // Inspection classification type';


COMMENT ON COLUMN mst_std_insp_inst_all.insp_no IS '検査ＮＯ // #MA.INSP_NO // Inspection No.';


COMMENT ON COLUMN mst_std_insp_inst_all.insp_freq IS '検査回数 // #MS.INSP_FREQ // Number of inspections';


COMMENT ON COLUMN mst_std_insp_inst_all.insp_seq IS '検査順序 // #MA.INSP_SEQ // Inspection sequence';


COMMENT ON COLUMN mst_std_insp_inst_all.insp_point_cd IS '検査項目ＣＤ // #MA.INSP_POINT_CD // Inspection checkpoint cd.';


COMMENT ON COLUMN mst_std_insp_inst_all.insp_qlqn_typ IS '定性定量区分 // #MA.INSP_QLQN_TYP // Qualitative/quantitative type';


COMMENT ON COLUMN mst_std_insp_inst_all.qn_out_min IS '外規格下限値 // #MA.QN_INSP_VAL // Lower limit of external specification';


COMMENT ON COLUMN mst_std_insp_inst_all.qn_out_max IS '外規格上限値 // #MA.QN_INSP_VAL // Upper limit of external specification';


COMMENT ON COLUMN mst_std_insp_inst_all.sign_out_min_typ IS '外規格下限符号区分 // #MA.SIGN_TYP // Sign type (Lower limit of external specification)';


COMMENT ON COLUMN mst_std_insp_inst_all.sign_out_max_typ IS '外規格上限符号区分 // #MA.SIGN_TYP // Sign type (Upper limit of external specification)';


COMMENT ON COLUMN mst_std_insp_inst_all.qn_in_min IS '内規格下限値 // #MA.QN_INSP_VAL // Lower limit of internal specification';


COMMENT ON COLUMN mst_std_insp_inst_all.qn_in_max IS '内規格上限値 // #MA.QN_INSP_VAL // Upper limit of internal specification';


COMMENT ON COLUMN mst_std_insp_inst_all.sign_in_min_typ IS '内規格下限符号区分 // #MA.SIGN_TYP // Sign type (Lower limit of internal specification)';


COMMENT ON COLUMN mst_std_insp_inst_all.sign_in_max_typ IS '内規格上限符号区分 // #MA.SIGN_TYP // Sign type (Upper limit of internal specification)';


COMMENT ON COLUMN mst_std_insp_inst_all.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_std_insp_inst_all.qn_int_digit IS '定量値整数部桁数 // #MA.INT_DIGIT // Quantitative integer digits';


COMMENT ON COLUMN mst_std_insp_inst_all.qn_int_frac IS '定量値小数部桁数 // #MA.DEC_PLACE // Quantitative decimal digits';


COMMENT ON COLUMN mst_std_insp_inst_all.ql_std_val IS '定性規格値 // #MA.QL_STD_VAL // Qualitative specific value';


COMMENT ON COLUMN mst_std_insp_inst_all.add_point_flg IS '追加項目ＦＬＧ // #MA.FLG // Additional column flg.';


COMMENT ON COLUMN mst_std_insp_inst_all.intr_rmrks IS '内部備考 // #MS.STD_INSP_INST_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_std_insp_inst_all.sub_char1 IS '予備１ // #MS.STD_INSP_INST_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_std_insp_inst_all.sub_char2 IS '予備２ // #MS.STD_INSP_INST_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_std_insp_inst_all.sub_char3 IS '予備３ // #MS.STD_INSP_INST_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_std_insp_inst_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_std_insp_inst_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_std_insp_inst_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_std_insp_inst_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_std_insp_inst_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_std_insp_inst_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_std_insp_inst_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_std_insp_inst_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_std_insp_inst_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_std_insp_inst_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

