\encoding UTF-8

COMMENT ON TABLE mst_pay_note_all IS '支払手形 // Notes payable';


COMMENT ON COLUMN mst_pay_note_all.pay_note_mng_no IS '支払手形管理ＮＯ // #MA.PAY_NOTE_MNG_NO // Notes payable management No.';


COMMENT ON COLUMN mst_pay_note_all.pay_note_mng_seq IS '支払手形管理連番 // #MA.SLIP_SEQ // Notes payable management sequence number';


COMMENT ON COLUMN mst_pay_note_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_pay_note_all.slip_sts_typ IS '伝票状況区分 // #MA.SLIP_STS_TYP // Slip status type';


COMMENT ON COLUMN mst_pay_note_all.note_no IS '手形番号 // #MA.NOTE_NO // Note number';


COMMENT ON COLUMN mst_pay_note_all.note_typ IS '手形区分 // #MA.NOTE_TYP // Note type';


COMMENT ON COLUMN mst_pay_note_all.note_rsn_cd IS '手形理由ＣＤ // #MA.NOTE_RSN_CD // Note reason cd.';


COMMENT ON COLUMN mst_pay_note_all.draw_dt IS '振出日 // #MA.DT // Drawing date';


COMMENT ON COLUMN mst_pay_note_all.due_dt IS '支払期日 // #MA.DT // Payment due date';


COMMENT ON COLUMN mst_pay_note_all.note_days IS '手形サイト // #MA.DAYS // Note sight';


COMMENT ON COLUMN mst_pay_note_all.drawer_nm IS '振出人名 // #MA.DRAWER_NM // Drawer name';


COMMENT ON COLUMN mst_pay_note_all.draw_bank_cd IS '振出銀行ＣＤ // #MA.BANK_CD // Drawing bank cd.';


COMMENT ON COLUMN mst_pay_note_all.draw_branch_cd IS '振出支店ＣＤ // #MA.BANK_BRANCH_CD // Drawing branch cd.';


COMMENT ON COLUMN mst_pay_note_all.endrsr IS '裏書人 // #MA.NOTE_ENDRSR // Endorser';


COMMENT ON COLUMN mst_pay_note_all.accptr IS '引受人 // #MA.NOTE_ACCPTR // Accepted by';


COMMENT ON COLUMN mst_pay_note_all.note_amt IS '手形額 // #MA.MONEY // Note amount';


COMMENT ON COLUMN mst_pay_note_all.cur_cd IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN mst_pay_note_all.pay_act_no IS '支払実績ＮＯ // #MA.PAY_ACT_NO // Payment result No.';


COMMENT ON COLUMN mst_pay_note_all.pay_act_seq IS '支払実績連番 // #MA.SLIP_SEQ // Payment result sequence No.';


COMMENT ON COLUMN mst_pay_note_all.adv_pay_act_no IS '前渡金支払実績ＮＯ // #MA.PAY_ACT_NO // Advance payment amount payment result No.';


COMMENT ON COLUMN mst_pay_note_all.adv_pay_act_seq IS '前渡金支払実績連番 // #MA.SLIP_SEQ // Advance payment amount payment result sequence number';


COMMENT ON COLUMN mst_pay_note_all.a_imp_flg IS '会計ＩＦ取込済ＦＬＧ // #MA.FLG // Accounting IF imported flg.';


COMMENT ON COLUMN mst_pay_note_all.sub_char1 IS '予備１ // #MS.PAY_NOTE_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_pay_note_all.sub_char2 IS '予備２ // #MS.PAY_NOTE_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_pay_note_all.sub_char3 IS '予備３ // #MS.PAY_NOTE_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_pay_note_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_pay_note_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_pay_note_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_pay_note_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_pay_note_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_pay_note_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_pay_note_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_pay_note_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_pay_note_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_pay_note_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

