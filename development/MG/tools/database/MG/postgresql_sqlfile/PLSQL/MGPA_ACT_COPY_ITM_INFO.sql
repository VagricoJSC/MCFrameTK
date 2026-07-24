\encoding UTF-8

CREATE OR REPLACE PROCEDURE mgpa_act_copy_itm_info$p_fix_chk (
	 IN i_calc_ctg_cd	VARCHAR,
	 IN i_term	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_dtl	CHARACTER,
	 IN i_bom	CHARACTER,
	 IN i_oper	CHARACTER,
	 IN i_wk	CHARACTER,
	 IN i_purc	CHARACTER,
	 IN i_proc	CHARACTER,
	 IN i_prov	CHARACTER
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	コピー先情報確定チェック
<REMARKS>

<ARGUMENTS>
<IN>	i_calc_ctg_cd
		コピー先計算カテゴリＣＤ
<IN>	i_term
		コピー先期
<IN>	i_dtl
		原価品目詳細ＦＬＧ
<IN>	i_oper
		原価品目工程ＦＬＧ
<IN>	i_bom
		原価ＢＯＭＦＬＧ
<IN>	i_wk
		原価品目工数ＦＬＧ
<IN>	i_purc
		原価品目購買単価ＦＬＧ
<IN>	i_proc
		原価品目加工単価ＦＬＧ
<IN>	i_prov
		原価品目支給単価ＦＬＧ
<HISTORY>
**************************************************************************/
DECLARE
	c_on	CONSTANT CHAR(1) := '1' ;

	l_msg	VARCHAR[] ;
	x RECORD ;
BEGIN

	FOR x IN
		SELECT	w.wg_cd
		FROM	mgw_wg w
	LOOP
		IF i_dtl = c_on THEN
			IF mgpa_fix_chk$f_dtl_m(i_term::TIMESTAMP(0) WITHOUT TIME ZONE, i_calc_ctg_cd, x.wg_cd) = c_on THEN
				l_msg := fcpa_err$msg_binder(i_calc_ctg_cd, x.wg_cd, fcpa_date_util$f_to_char(i_term::TIMESTAMP(0) WITHOUT TIME ZONE, fcpa_date_util$y4m())) ;
				/* 原価品目詳細情報に標準単価が確定しているデータがあるのでコピーできません。計算カテゴリ：{1} ワーキンググループ：{2} 期：{3} */
				CALL fcpa_err$raise_app_err('MGBXD0031', l_msg) ;
			END IF ;
		END IF ;

		IF i_oper = c_on THEN
			IF mgpa_fix_chk$f_oper_m(i_term::TIMESTAMP(0) WITHOUT TIME ZONE, i_calc_ctg_cd, x.wg_cd) = c_on THEN
				l_msg := fcpa_err$msg_binder(i_calc_ctg_cd, x.wg_cd, fcpa_date_util$f_to_char(i_term::TIMESTAMP(0) WITHOUT TIME ZONE, fcpa_date_util$y4m())) ;
				/* 原価品目工程情報に標準単価が確定しているデータがあるのでコピーできません。計算カテゴリ：{1} ワーキンググループ：{2} 期：{3} */
				CALL fcpa_err$raise_app_err('MGBXD0032', l_msg) ;
			END IF ;
		END IF ;

		IF i_bom = c_on THEN
			IF mgpa_fix_chk$f_bom_m(i_term::TIMESTAMP(0) WITHOUT TIME ZONE, i_calc_ctg_cd, x.wg_cd) = c_on THEN
				l_msg := fcpa_err$msg_binder(i_calc_ctg_cd, x.wg_cd, fcpa_date_util$f_to_char(i_term::TIMESTAMP(0) WITHOUT TIME ZONE, fcpa_date_util$y4m())) ;
				/* 原価ＢＯＭ情報に標準単価が確定しているデータがあるのでコピーできません。計算カテゴリ：{1} ワーキンググループ：{2} 期：{3} */
				CALL fcpa_err$raise_app_err('MGBXD0033', l_msg) ;
			END IF ;
		END IF ;

		IF i_wk = c_on THEN
			IF mgpa_fix_chk$f_wk_m(i_term::TIMESTAMP(0) WITHOUT TIME ZONE, i_calc_ctg_cd, x.wg_cd) = c_on THEN
				l_msg := fcpa_err$msg_binder(i_calc_ctg_cd, x.wg_cd, fcpa_date_util$f_to_char(i_term::TIMESTAMP(0) WITHOUT TIME ZONE, fcpa_date_util$y4m())) ;
				/* 原価品目工数情報に標準単価が確定しているデータがあるのでコピーできません。計算カテゴリ：{1} ワーキンググループ：{2} 期：{3} */
				CALL fcpa_err$raise_app_err('MGBXD0034', l_msg) ;
			END IF ;
		END IF ;

		IF i_purc = c_on THEN
			IF mgpa_fix_chk$f_purc_m(i_term::TIMESTAMP(0) WITHOUT TIME ZONE, i_calc_ctg_cd, x.wg_cd) = c_on THEN
				l_msg := fcpa_err$msg_binder(i_calc_ctg_cd, x.wg_cd, fcpa_date_util$f_to_char(i_term::TIMESTAMP(0) WITHOUT TIME ZONE, fcpa_date_util$y4m())) ;
				/* 原価品目購買単価情報に標準単価が確定しているデータがあるのでコピーできません。計算カテゴリ：{1} ワーキンググループ：{2} 期：{3} */
				CALL fcpa_err$raise_app_err('MGBXD0035', l_msg) ;
			END IF ;
		END IF ;

		IF i_proc = c_on THEN
			IF mgpa_fix_chk$f_proc_m(i_term::TIMESTAMP(0) WITHOUT TIME ZONE, i_calc_ctg_cd, x.wg_cd) = c_on THEN
				l_msg :=fcpa_err$msg_binder(i_calc_ctg_cd, x.wg_cd, fcpa_date_util$f_to_char(i_term::TIMESTAMP(0) WITHOUT TIME ZONE, fcpa_date_util$y4m())) ;
				/* 原価品目加工単価情報に標準単価が確定しているデータがあるのでコピーできません。計算カテゴリ：{1} ワーキンググループ：{2} 期：{3} */
				CALL fcpa_err$raise_app_err('MGBXD0040', l_msg) ;
			END IF ;
		END IF ;

		IF i_prov = c_on THEN
			if mgpa_fix_chk$f_prov_m(i_term::TIMESTAMP(0) WITHOUT TIME ZONE, i_calc_ctg_cd, x.wg_cd) = c_on then
				l_msg := fcpa_err$msg_binder(i_calc_ctg_cd, x.wg_cd, fcpa_date_util$f_to_char(i_term::TIMESTAMP(0) WITHOUT TIME ZONE, fcpa_date_util$y4m())) ;
				/* 原価品目支給情報に標準単価が確定しているデータがあるのでコピーできません。計算カテゴリ：{1} ワーキンググループ：{2} 期：{3} */
				CALL fcpa_err$raise_app_err('MGBXD0036', l_msg) ;
			END IF ;
		END IF ;
	END LOOP ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_act_copy_itm_info$p_ins_itm (
	 INOUT o_rec	mgt_itm[]
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	mgt_itmの作成
<REMARKS>

<ARGUMENTS>
<INOUT>	o_rec
		mgt_itmの配列
<HISTORY>
**************************************************************************/
BEGIN

	IF COALESCE(array_length(o_rec, 1), 0) = 0 THEN
		RETURN ;
	END IF ;
	INSERT INTO mgt_itm SELECT * FROM UNNEST(o_rec);
	o_rec := '{}' ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_act_copy_itm_info$p_itm (
	 IN i_ym_from	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ym_to	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_calc_ctg_cd	VARCHAR,
	 IN i_term TIMESTAMP	WITHOUT TIME ZONE
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	原価品目情報コピー処理
<REMARKS>

<ARGUMENTS>
<IN>	i_ym_from
		コピー元年月Ｆｒｏｍ
<IN>	i_ym_to
		コピー元年月Ｔｏ
<IN>	i_calc_ctg_cd
		コピー先計算カテゴリＣＤ
<IN>	i_term
		コピー先期
<HISTORY>
**********************************************************/
DECLARE
	c_max_cnt		CONSTANT INTEGER := 10000 ;	/* バルクインサートでの最大レコード数 */
	c_off			CONSTANT CHAR(1) := '0' ;
	c_null_val		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;

	c_asset_mng_mng CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASSET_MNG_TYP','MNG');

	c_purc_xpns CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PURC_XPNS');
	c_purc_ret_xpns CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PURC_RET_XPNS');
	c_purc_dscnt_xpns CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PURC_DSCNT_XPNS');
	c_purc_xtra_xpns CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PURC_XTRA_XPNS');

	c_ffr_prov CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','FFR_PROV');
	c_ffr_prvr CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','FFR_PRVR');
	c_onr_prov CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','ONR_PROV');
	c_onr_prvr CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','ONR_PRVR');
	c_ship CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','SHIP');
	c_ship_ret CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','SHIP_RET');
	c_prod_itm_so CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PROD_ITM_SO');
	c_prod_itm_ret_so CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PROD_ITM_RET_SO');
	c_dpt_xfr_so CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DPT_XFR_SO');

	c_insp_smpl CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','INSP_SMPL');
	c_disp_scrp CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DISP_SCRP');
	c_so_stktk CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','SO_STKTK');
	c_oth_ccn_so CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','OTH_CCN_SO');
	c_in_stktk CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','IN_STKTK');
	c_oth_ccn_gr CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','OTH_CCN_GR');
	c_stk_sw_so CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','STK_SW_SO');
	c_stk_sw_gr CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','STK_SW_GR');

	l_rec		mgt_itm[] ;
	l_tmp_rec	mgt_itm%ROWTYPE ;
	x	RECORD ;
BEGIN

	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_ACT_COPY_ITM_INFO.P_ITM') ;

	FOR x IN
		SELECT
			t.wg_cd,
			t.itm_cd,
			t.itm_sub1,
			t.itm_sub2,
			t.itm_sub3,
			m.calc_ptn_cd,
			COALESCE(m.cost_std_qty, 1) AS cost_std_qty
		FROM (
			SELECT DISTINCT
				t1.wg_cd,
				t1.itm_cd,
				t1.itm_sub1,
				t1.itm_sub2,
				t1.itm_sub3
			FROM
				mgt_act_mfg_if t1,
				mgw_calc_ctg w,
				mgw_wg w2
			WHERE 0=0
				AND t1.calc_ctg_cd = w.calc_ctg_cd
				AND t1.wg_cd = w2.wg_cd
				AND t1.ym BETWEEN i_ym_from::TIMESTAMP(0) WITHOUT TIME ZONE AND i_ym_to::TIMESTAMP(0) WITHOUT TIME ZONE
				AND NOT EXISTS (
					SELECT 'x' FROM mgt_itm w
					WHERE w.term = i_term::TIMESTAMP(0) WITHOUT TIME ZONE
					AND w.calc_ctg_cd = i_calc_ctg_cd
					AND w.wg_cd = t1.wg_cd
					AND w.itm_cd = t1.itm_cd
					AND w.itm_sub1 = t1.itm_sub1
					AND w.itm_sub2 = t1.itm_sub2
					AND w.itm_sub3 = t1.itm_sub3)
				AND t1.no_itm_info_flg = c_off
			UNION
			SELECT DISTINCT
				t1.wg_cd,
				t1.itm_cd,
				t1.itm_sub1,
				t1.itm_sub2,
				t1.itm_sub3
			FROM
				mgt_act_inst_wip_if t1,
				mgw_calc_ctg w,
				mgw_wg w2
			WHERE 0=0
				AND t1.calc_ctg_cd = w.calc_ctg_cd
				AND t1.wg_cd = w2.wg_cd
				AND t1.ym BETWEEN i_ym_from::TIMESTAMP(0) WITHOUT TIME ZONE AND i_ym_to::TIMESTAMP(0) WITHOUT TIME ZONE
				AND NOT EXISTS (
					SELECT 'x' FROM mgt_itm w
					WHERE w.term = i_term::TIMESTAMP(0) WITHOUT TIME ZONE
					AND w.calc_ctg_cd = i_calc_ctg_cd
					AND w.wg_cd = t1.wg_cd
					AND w.itm_cd = t1.itm_cd
					AND w.itm_sub1 = t1.itm_sub1
					AND w.itm_sub2 = t1.itm_sub2
					AND w.itm_sub3 = t1.itm_sub3)
			UNION
			SELECT DISTINCT
				t1.wg_cd,
				t1.itm_cd,
				t1.itm_sub1,
				t1.itm_sub2,
				t1.itm_sub3
			FROM
				mgt_act_purc_if t1,
				mgw_calc_ctg w,
				mgw_wg w2,
				mam_itm m
			WHERE 0=0
				AND t1.calc_ctg_cd = w.calc_ctg_cd
				AND t1.wg_cd = w2.wg_cd
				AND t1.itm_cd = m.itm_cd
				AND t1.itm_sub1 = m.itm_sub1
				AND t1.itm_sub2 = m.itm_sub2
				AND t1.itm_sub3 = m.itm_sub3
				AND t1.ym BETWEEN i_ym_from::TIMESTAMP(0) WITHOUT TIME ZONE AND i_ym_to::TIMESTAMP(0) WITHOUT TIME ZONE
				AND NOT EXISTS (
					SELECT 'x' FROM mgt_itm w
					WHERE w.term = i_term::TIMESTAMP(0) WITHOUT TIME ZONE
					AND w.calc_ctg_cd = i_calc_ctg_cd
					AND w.wg_cd = t1.wg_cd
					AND w.itm_cd = t1.itm_cd
					AND w.itm_sub1 = t1.itm_sub1
					AND w.itm_sub2 = t1.itm_sub2
					AND w.itm_sub3 = t1.itm_sub3)
				AND t1.no_itm_info_flg = c_off
				AND m.calc_ptn_cd IS NOT NULL
				AND m.asset_mng_typ = c_asset_mng_mng
				AND t1.ac_slip_typ NOT IN (c_purc_xpns, c_purc_ret_xpns, c_purc_dscnt_xpns, c_purc_xtra_xpns)
			UNION
			SELECT DISTINCT
				t1.wg_cd,
				t1.par_itm_cd	itm_cd,
				t1.par_itm_sub1	itm_sub1,
				t1.par_itm_sub2	itm_sub2,
				t1.par_itm_sub3	itm_sub3
			FROM
				mgt_act_inpt_if t1,
				mgw_calc_ctg w,
				mgw_wg w2
			WHERE 0=0
				AND t1.calc_ctg_cd = w.calc_ctg_cd
				AND t1.wg_cd = w2.wg_cd
				AND t1.ym BETWEEN i_ym_from::TIMESTAMP(0) WITHOUT TIME ZONE AND i_ym_to::TIMESTAMP(0) WITHOUT TIME ZONE
				AND NOT EXISTS (
					SELECT 'x' FROM mgt_itm w
					WHERE w.term = i_term::TIMESTAMP(0) WITHOUT TIME ZONE
					AND w.calc_ctg_cd = i_calc_ctg_cd
					AND w.wg_cd = t1.wg_cd
					AND w.itm_cd = t1.par_itm_cd
					AND w.itm_sub1 = t1.par_itm_sub1
					AND w.itm_sub2 = t1.par_itm_sub2
					AND w.itm_sub3 = t1.par_itm_sub3)
				AND t1.no_itm_info_flg = c_off
			UNION
			SELECT DISTINCT
				t1.wg_cd,
				t1.itm_cd,
				t1.itm_sub1,
				t1.itm_sub2,
				t1.itm_sub3
			FROM
				mgt_act_inpt_if t1,
				mgw_calc_ctg w,
				mgw_wg w2
			WHERE 0=0
				AND t1.calc_ctg_cd = w.calc_ctg_cd
				AND t1.wg_cd = w2.wg_cd
				AND t1.ym BETWEEN i_ym_from::TIMESTAMP(0) WITHOUT TIME ZONE AND i_ym_to::TIMESTAMP(0) WITHOUT TIME ZONE
				AND NOT EXISTS (
					SELECT 'x' FROM mgt_itm w
					WHERE w.term = i_term::TIMESTAMP(0) WITHOUT TIME ZONE
					AND w.calc_ctg_cd = i_calc_ctg_cd
					AND w.wg_cd = t1.wg_cd
					AND w.itm_cd = t1.itm_cd
					AND w.itm_sub1 = t1.itm_sub1
					AND w.itm_sub2 = t1.itm_sub2
					AND w.itm_sub3 = t1.itm_sub3)
				AND t1.no_itm_info_flg = c_off
			UNION
			SELECT DISTINCT
				t1.wg_cd,
				t1.itm_cd,
				t1.itm_sub1,
				t1.itm_sub2,
				t1.itm_sub3
			FROM
				mgt_act_inst_wk_if t1,
				mgw_calc_ctg w,
				mgw_wg w2
			WHERE 0=0
				AND t1.calc_ctg_cd = w.calc_ctg_cd
				AND t1.wg_cd = w2.wg_cd
				AND t1.ym BETWEEN i_ym_from::TIMESTAMP(0) WITHOUT TIME ZONE AND i_ym_to::TIMESTAMP(0) WITHOUT TIME ZONE
				AND NOT EXISTS (
					SELECT 'x' FROM mgt_itm w
					WHERE w.term = i_term::TIMESTAMP(0) WITHOUT TIME ZONE
					AND w.calc_ctg_cd = i_calc_ctg_cd
					AND w.wg_cd = t1.wg_cd
					AND w.itm_cd = t1.itm_cd
					AND w.itm_sub1 = t1.itm_sub1
					AND w.itm_sub2 = t1.itm_sub2
					AND w.itm_sub3 = t1.itm_sub3)
				AND t1.no_itm_info_flg = c_off
			UNION
			SELECT DISTINCT
				t1.wg_cd,
				t1.itm_cd,
				t1.itm_sub1,
				t1.itm_sub2,
				t1.itm_sub3
			FROM
				mgt_act_sls_if t1,
				mgw_calc_ctg w,
				mgw_wg w2
			WHERE 0=0
				AND t1.calc_ctg_cd = w.calc_ctg_cd
				AND t1.wg_cd = w2.wg_cd
				AND t1.ym BETWEEN i_ym_from::TIMESTAMP(0) WITHOUT TIME ZONE AND i_ym_to::TIMESTAMP(0) WITHOUT TIME ZONE
				AND NOT EXISTS (
					SELECT 'x' FROM mgt_itm w
					WHERE w.term = i_term::TIMESTAMP(0) WITHOUT TIME ZONE
					AND w.calc_ctg_cd = i_calc_ctg_cd
					AND w.wg_cd = t1.wg_cd
					AND w.itm_cd = t1.itm_cd
					AND w.itm_sub1 = t1.itm_sub1
					AND w.itm_sub2 = t1.itm_sub2
					AND w.itm_sub3 = t1.itm_sub3)
				AND t1.no_itm_info_flg = c_off
			UNION
			SELECT DISTINCT
				w2.wg_cd,
				t1.itm_cd,
				t1.itm_sub1,
				t1.itm_sub2,
				t1.itm_sub3
			FROM
				mgt_act_io_if t1,
				mgw_calc_ctg w,
				mgw_wg w2
			WHERE 0=0
				AND t1.calc_ctg_cd = w.calc_ctg_cd
				AND t1.ym BETWEEN i_ym_from::TIMESTAMP(0) WITHOUT TIME ZONE AND i_ym_to::TIMESTAMP(0) WITHOUT TIME ZONE
				AND NOT EXISTS (
					SELECT 'x' FROM mgt_itm w
					WHERE w.term = i_term::TIMESTAMP(0) WITHOUT TIME ZONE
					AND w.calc_ctg_cd = i_calc_ctg_cd
					AND w.wg_cd = w2.wg_cd
					AND w.itm_cd = t1.itm_cd
					AND w.itm_sub1 = t1.itm_sub1
					AND w.itm_sub2 = t1.itm_sub2
					AND w.itm_sub3 = t1.itm_sub3)
				AND t1.no_itm_info_flg = c_off
				AND (
					((t1.wg_cd = w2.wg_cd OR t1.other_wg_cd = w2.wg_cd)
						AND t1.ac_slip_typ IN (c_ffr_prov, c_ffr_prvr, c_onr_prov, c_onr_prvr, c_ship, c_ship_ret, c_prod_itm_so, c_prod_itm_ret_so, c_dpt_xfr_so))
					OR
					(t1.wg_cd = w2.wg_cd
						AND t1.ac_slip_typ IN (c_insp_smpl, c_disp_scrp, c_so_stktk, c_oth_ccn_so, c_in_stktk, c_oth_ccn_gr, c_stk_sw_so, c_stk_sw_gr))
					)
			UNION
			SELECT DISTINCT
				w2.wg_cd,
				t1.alc_itm_cd,
				t1.alc_itm_sub1,
				t1.alc_itm_sub2,
				t1.alc_itm_sub3
			FROM
				mgt_act_io_if t1,
				mgw_calc_ctg w,
				mgw_wg w2
			WHERE 0=0
				AND t1.calc_ctg_cd = w.calc_ctg_cd
				AND t1.ym BETWEEN i_ym_from::TIMESTAMP(0) WITHOUT TIME ZONE AND i_ym_to::TIMESTAMP(0) WITHOUT TIME ZONE
				AND NOT EXISTS (
					SELECT 'x' FROM mgt_itm w
					WHERE w.term = i_term::TIMESTAMP(0) WITHOUT TIME ZONE
					AND w.calc_ctg_cd = i_calc_ctg_cd
					AND w.wg_cd = w2.wg_cd
					AND w.itm_cd = t1.alc_itm_cd
					AND w.itm_sub1 = t1.alc_itm_sub1
					AND w.itm_sub2 = t1.alc_itm_sub2
					AND w.itm_sub3 = t1.alc_itm_sub3)
				AND t1.no_itm_info_flg = c_off
				AND (
					((t1.wg_cd = w2.wg_cd OR t1.other_wg_cd = w2.wg_cd)
						AND t1.ac_slip_typ IN (c_ffr_prov, c_ffr_prvr, c_onr_prov, c_onr_prvr, c_ship, c_ship_ret, c_prod_itm_so, c_prod_itm_ret_so, c_dpt_xfr_so))
					OR
					(t1.wg_cd = w2.wg_cd
						AND t1.ac_slip_typ IN (c_insp_smpl, c_disp_scrp, c_so_stktk, c_oth_ccn_so, c_in_stktk, c_oth_ccn_gr, c_stk_sw_so, c_stk_sw_gr))
					)
			) t,
			mam_itm m
		WHERE 0=0
			AND t.itm_cd = m.itm_cd
			AND t.itm_sub1 = m.itm_sub1
			AND t.itm_sub2 = m.itm_sub2
			AND t.itm_sub3 = m.itm_sub3
			AND m.calc_ptn_cd IS NOT NULL
	LOOP

		l_tmp_rec.itm_cd	:= x.itm_cd ;
		l_tmp_rec.itm_sub1	:= x.itm_sub1 ;
		l_tmp_rec.itm_sub2	:= x.itm_sub2 ;
		l_tmp_rec.itm_sub3	:= x.itm_sub3 ;
		l_tmp_rec.term	:= i_term ;
		l_tmp_rec.calc_ctg_cd	:= i_calc_ctg_cd ;
		l_tmp_rec.wg_cd	:= x.wg_cd ;
		l_tmp_rec.calc_ptn_cd	:= x.calc_ptn_cd ;
		l_tmp_rec.std_qty	:= x.cost_std_qty ;
		l_tmp_rec.cmn_upri_flg	:= c_off ;
		l_tmp_rec.fix_flg	:= c_off ;
		l_tmp_rec.non_calc_flg	:= c_off ;

		l_rec[COALESCE(array_length(l_rec, 1), 0) + 1] := l_tmp_rec ;

		IF COALESCE(array_length(l_rec, 1), 0) > c_max_cnt THEN
			CALL mgpa_act_copy_itm_info$p_ins_itm(l_rec) ;
		END IF ;

	END LOOP ;

	CALL mgpa_act_copy_itm_info$p_ins_itm(l_rec) ;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_ACT_COPY_ITM_INFO.P_ITM') ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_act_copy_itm_info$p_ins_dtl (
	 INOUT o_rec	mgt_itm_dtl[]
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	mgt_itm_dtlの作成
<REMARKS>

<ARGUMENTS>
<INOUT>	o_rec
		mgt_itm_dtlの配列
<HISTORY>
**************************************************************************/
BEGIN

	IF COALESCE(array_length(o_rec, 1), 0) = 0 THEN
		RETURN ;
	END IF ;
	INSERT INTO mgt_itm_dtl SELECT * FROM UNNEST(o_rec);
	o_rec := '{}' ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_act_copy_itm_info$p_dtl (
	 IN i_ym_from	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ym_to	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_calc_ctg_cd	VARCHAR,
	 IN i_term TIMESTAMP	WITHOUT TIME ZONE,
	 IN i_ptn_set_typ	VARCHAR
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	原価品目詳細情報コピー処理
<REMARKS>

<ARGUMENTS>
<IN>	i_ym_from
		コピー元年月Ｆｒｏｍ
<IN>	i_ym_to
		コピー元年月Ｔｏ
<IN>	i_calc_ctg_cd
		コピー先計算カテゴリＣＤ
<IN>	i_term
		コピー先期
<IN>	i_ptn_set_typ
		構成/工程パタン設定区分
<HISTORY>
**********************************************************/
DECLARE
	c_max_cnt		CONSTANT INTEGER := 10000 ;	/* バルクインサートでの最大レコード数 */
	c_off			CONSTANT CHAR(1) := '0' ;
	c_null_val		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	c_ptn_itm		CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_PTN_SET_TYP','ITM') ;	/* 品目毎 */
	c_ptn_loc		CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_PTN_SET_TYP','LOC') ;	/* 場所毎 */
	c_dpt_xfr_so	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DPT_XFR_SO') ;	/* 部門間移動 */
	c_ptn1			CONSTANT VARCHAR := '1' ;
	c_ptn2			CONSTANT VARCHAR := '2' ;

	l_rec		mgt_itm_dtl[] ;
	l_tmp_rec	mgt_itm_dtl%ROWTYPE ;
	l_wg_cd		mam_wg.wg_cd%TYPE ;
	l_itm_cd	mam_itm.itm_cd%tYPE ;
	l_itm_sub1	mam_itm.itm_sub1%TYPE ;
	l_itm_sub2	mam_itm.itm_sub2%TYPE ;
	l_itm_sub3	mam_itm.itm_sub3%TYPE ;
	l_exp_prio	mgt_itm_dtl.exp_prio%TYPE ;
	l_ptn		mgt_itm_dtl.oper_ptn%TYPE ;
	x	RECORD ;
BEGIN

	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_ACT_COPY_ITM_INFO.P_DTL') ;

	DELETE FROM	mgt_itm_dtl t
	WHERE	0=0
	AND	t.term = i_term::TIMESTAMP(0) WITHOUT TIME ZONE
	AND	t.calc_ctg_cd = i_calc_ctg_cd
	AND	EXISTS (
		SELECT	'X'
		FROM	mgw_wg w
		WHERE	0=0
		AND	w.wg_cd = t.wg_cd
		)
	;

	l_wg_cd := NULL ;
	l_itm_cd := NULL ;
	l_itm_sub1 := NULL ;
	l_itm_sub2 := NULL ;
	l_itm_sub3 := NULL ;

	FOR x IN
		SELECT
			t1.wg_cd,
			t1.itm_cd,
			t1.itm_sub1,
			t1.itm_sub2,
			t1.itm_sub3,
			t1.loc_cd,
			c_null_val AS sppl_cd,
			c_null_val AS rqst_wg_cd,
			MIN(
				CASE i_ptn_set_typ
					WHEN c_ptn_itm THEN c_ptn1
					WHEN c_ptn_loc THEN t1.loc_cd
					ELSE
						CASE
							WHEN t2.sppl_cd IS NULL THEN c_ptn1
							ELSE c_ptn2
						END
				END
				) AS ptn,
			MIN(t3.oper_cd) AS oper_cd,
			SUM(t1.qty) AS qty
		FROM
			mgt_itm_mfg_inst t2,
			mam_itm m1,
			mgw_calc_ctg w,
			mgw_wg w2,
			mgt_act_mfg_if t1
			LEFT OUTER JOIN mgt_inst_oper t3
				ON (t1.calc_ctg_cd = t3.calc_ctg_cd
					AND t1.itm_cd = t3.itm_cd
					AND t1.itm_sub1 = t3.itm_sub1
					AND t1.itm_sub2 = t3.itm_sub2
					AND t1.itm_sub3 = t3.itm_sub3
					AND t1.itm_mfg_inst_no = t3.itm_mfg_inst_no
					AND t1.mfg_act_no = t3.mfg_act_no
					AND t1.oper_act_no = t3.oper_act_no
					)
		WHERE	0=0
		AND	t1.calc_ctg_cd = w.calc_ctg_cd
		AND	t1.wg_cd = w2.wg_cd
		AND	t1.calc_ctg_cd = t2.calc_ctg_cd
		AND	t1.itm_cd = t2.itm_cd
		AND	t1.itm_sub1 = t2.itm_sub1
		AND	t1.itm_sub2 = t2.itm_sub2
		AND	t1.itm_sub3 = t2.itm_sub3
		AND	t1.itm_mfg_inst_no = t2.itm_mfg_inst_no
		AND	t1.mfg_act_no = t2.mfg_act_no
		AND	t1.ym BETWEEN i_ym_from::TIMESTAMP(0) WITHOUT TIME ZONE AND i_ym_to::TIMESTAMP(0) WITHOUT TIME ZONE
		AND	t1.no_itm_info_flg = c_off
		AND	t1.itm_cd = m1.itm_cd
		AND	t1.itm_sub1 = m1.itm_sub1
		AND	t1.itm_sub2 = m1.itm_sub2
		AND	t1.itm_sub3 = m1.itm_sub3
		GROUP BY
			t1.wg_cd,
			t1.itm_cd,
			t1.itm_sub1,
			t1.itm_sub2,
			t1.itm_sub3,
			t1.loc_cd
		UNION ALL
		SELECT
			t1.wg_cd,
			t1.itm_cd,
			t1.itm_sub1,
			t1.itm_sub2,
			t1.itm_sub3,
			c_null_val AS loc_cd,
			t1.sppl_cd,
			c_null_val AS rqst_wg_cd,
			NULL AS ptn,
			NULL AS oper_cd,
			SUM(t1.qty) AS qty
		FROM
			mgt_act_purc_if t1,
			mam_itm m1,
			mgw_calc_ctg w,
			mgw_wg w2
		WHERE	0=0
		AND	t1.calc_ctg_cd = w.calc_ctg_cd
		AND	t1.wg_cd = w2.wg_cd
		AND	t1.ym BETWEEN i_ym_from::TIMESTAMP(0) WITHOUT TIME ZONE AND i_ym_to::TIMESTAMP(0) WITHOUT TIME ZONE
		AND	t1.no_itm_info_flg = c_off
		AND	t1.itm_cd = m1.itm_cd
		AND	t1.itm_sub1 = m1.itm_sub1
		AND	t1.itm_sub2 = m1.itm_sub2
		AND	t1.itm_sub3 = m1.itm_sub3
		GROUP BY
			t1.wg_cd,
			t1.itm_cd,
			t1.itm_sub1,
			t1.itm_sub2,
			t1.itm_sub3,
			t1.sppl_cd
		UNION ALL
		SELECT
			t1.other_wg_cd AS wg_cd,
			t1.itm_cd,
			t1.itm_sub1,
			t1.itm_sub2,
			t1.itm_sub3,
			c_null_val AS loc_cd,
			c_null_val AS sppl_cd,
			t1.wg_cd AS rqst_wg_cd,
			NULL AS ptn,
			NULL AS oper_cd,
			SUM(t1.qty) AS qty
		FROM
			mgt_act_io_if t1,
			mam_itm m1,
			mgw_calc_ctg w,
			mgw_wg w2
		WHERE	0=0
		AND	t1.calc_ctg_cd = w.calc_ctg_cd
		AND	t1.other_wg_cd = w2.wg_cd
		AND	t1.ym BETWEEN i_ym_from::TIMESTAMP(0) WITHOUT TIME ZONE AND i_ym_to::TIMESTAMP(0) WITHOUT TIME ZONE
		AND	t1.no_itm_info_flg = c_OFF
		AND	t1.itm_cd = m1.itm_cd
		AND	t1.itm_sub1 = m1.itm_sub1
		AND	t1.itm_sub2 = m1.itm_sub2
		AND	t1.itm_sub3 = m1.itm_sub3
		AND	t1.ac_slip_typ = c_dpt_xfr_so
		AND	t1.wg_cd <> t1.other_wg_cd
		GROUP BY
			t1.wg_cd,
			t1.itm_cd,
			t1.itm_sub1,
			t1.itm_sub2,
			t1.itm_sub3,
			t1.other_wg_cd
		ORDER BY
			wg_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			qty DESC,
			loc_cd,
			sppl_cd,
			rqst_wg_cd
	LOOP
		<<NEXT_LOOP>>
		BEGIN
			/* 数量(=原価比率)が負となる場合は対象外 */
			IF x.qty < 0 THEN
				EXIT NEXT_LOOP ;
			END IF ;

			IF l_wg_cd IS NULL AND l_itm_cd IS NULL
				OR l_wg_cd <> x.wg_cd
				OR l_itm_cd <> x.itm_cd
				OR l_itm_sub1 <> x.itm_sub1
				OR l_itm_sub2 <> x.itm_sub2
				OR l_itm_sub3 <> x.itm_sub3 THEN

				l_wg_cd := x.wg_cd ;
				l_itm_cd := x.itm_cd ;
				l_itm_sub1 := x.itm_sub1 ;
				l_itm_sub2 := x.itm_sub2 ;
				l_itm_sub3 := x.itm_sub3 ;
				l_exp_prio := 1 ;
			ELSE
				l_exp_prio := l_exp_prio + 1 ;
			END IF ;

			IF i_ptn_set_typ = c_ptn_loc AND x.ptn IS NOT NULL THEN
				IF (SELECT COUNT(*) FROM mgpa_act_copy_itm_info$ptn_loc WHERE _index_ = x.ptn) > 0 THEN
					SELECT	_elem_
					INTO STRICT	l_ptn 
					FROM	mgpa_act_copy_itm_info$ptn_loc
					WHERE	_index_ = x.ptn
					;
				ELSE
					l_ptn := ((SELECT COUNT(*) FROM mgpa_act_copy_itm_info$ptn_loc) + 1)::VARCHAR ;
					INSERT INTO mgpa_act_copy_itm_info$ptn_loc (_elem_, _index_) VALUES (l_ptn, x.ptn) ;
				END IF;
			ELSE
				l_ptn := x.ptn;
			END IF;

			l_tmp_rec.itm_cd	:= x.itm_cd ;
			l_tmp_rec.itm_sub1	:= x.itm_sub1 ;
			l_tmp_rec.itm_sub2	:= x.itm_sub2 ;
			l_tmp_rec.itm_sub3	:= x.itm_sub3 ;
			l_tmp_rec.loc_cd	:= x.loc_cd ;
			l_tmp_rec.sppl_cd 	:= x.sppl_cd ;
			l_tmp_rec.rqst_wg_cd 	:= x.rqst_wg_cd ;
			l_tmp_rec.term	:= i_term ;
			l_tmp_rec.calc_ctg_cd	:= i_calc_ctg_cd ;
			l_tmp_rec.wg_cd	:= x.wg_cd ;
			l_tmp_rec.cost_ratio	:= x.qty ;
			l_tmp_rec.oper_ptn	:= l_ptn ;
			IF x.oper_cd IS NULL THEN
				l_tmp_rec.oper_ptn	:= NULL;
			END IF ;
			l_tmp_rec.bom_ptn	:= COALESCE(l_ptn, c_null_val) ;
			l_tmp_rec.exp_prio	:= l_exp_prio ;

			l_tmp_rec.min_lot_qty	:= 0 ;
			l_tmp_rec.batch_lot_qty	:= 0 ;
			l_tmp_rec.fxd_lot_qty	:= 0 ;
			l_tmp_rec.fxd_yield_qty	:= 0 ;
			l_tmp_rec.nmr_qty	:= 1 ;
			l_tmp_rec.dnm_qty	:= 1 ;
			l_tmp_rec.alc_dpt_cd	:= NULL ;
			l_tmp_rec.exp_dpt_cd	:= NULL ;
			l_tmp_rec.max_qty	:= NULL ;
			l_tmp_rec.alc_val1	:= NULL ;
			l_tmp_rec.alc_val2	:= NULL ;
			l_tmp_rec.alc_val3	:= NULL ;
			l_tmp_rec.alc_val4	:= NULL ;
			l_tmp_rec.alc_val5	:= NULL ;
			l_tmp_rec.rmrks	:= NULL ;
			l_tmp_rec.sub_char1	:= NULL ;
			l_tmp_rec.sub_char2	:= NULL ;
			l_tmp_rec.sub_char3	:= NULL ;
			l_tmp_rec.non_calc_flg	:= c_off ;

			l_rec[COALESCE(array_length(l_rec, 1), 0) + 1] := l_tmp_rec ;

			IF COALESCE(array_length(l_rec, 1), 0) > c_max_cnt THEN
				CALL mgpa_act_copy_itm_info$p_ins_dtl(l_rec) ;
			END IF ;

		END ;
	END LOOP ;

	CALL mgpa_act_copy_itm_info$p_ins_dtl(l_rec) ;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_ACT_COPY_ITM_INFO.P_DTL') ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_act_copy_itm_info$p_ins_oper (
	 INOUT o_rec	mgt_itm_oper[]
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	mgt_itm_operの作成
<REMARKS>

<ARGUMENTS>
<INOUT>	o_rec
		mgt_itm_operの配列
<HISTORY>
**************************************************************************/
BEGIN

	IF COALESCE(array_length(o_rec, 1), 0) = 0 THEN
		RETURN ;
	END IF ;
	INSERT INTO mgt_itm_oper SELECT * FROM UNNEST(o_rec);
	o_rec := '{}' ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_act_copy_itm_info$p_oper (
	 IN i_ym_from	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ym_to	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_calc_ctg_cd	VARCHAR,
	 IN i_term TIMESTAMP	WITHOUT TIME ZONE,
	 IN i_ptn_set_typ	VARCHAR
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	原価品目工程情報コピー処理
<REMARKS>

<ARGUMENTS>
<IN>	i_ym_from
		コピー元年月Ｆｒｏｍ
<IN>	i_ym_to
		コピー元年月Ｔｏ
<IN>	i_calc_ctg_cd
		コピー先計算カテゴリＣＤ
<IN>	i_term
		コピー先期
<IN>	i_ptn_set_typ
		構成/工程パタン設定区分
<HISTORY>
**********************************************************/
DECLARE
	c_max_cnt		CONSTANT INTEGER := 10000 ;	/* バルクインサートでの最大レコード数 */
	c_off			CONSTANT CHAR(1) := '0' ;
	c_on			CONSTANT CHAR(1) := '1' ;
	c_null_val		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	c_ptn_itm		CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_PTN_SET_TYP','ITM') ;	/* 品目毎 */
	c_ptn_loc		CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_PTN_SET_TYP','LOC') ;	/* 場所毎 */
	c_ptn1			CONSTANT VARCHAR := '1' ;
	c_ptn2			CONSTANT VARCHAR := '2' ;

	l_rec		mgt_itm_oper[] ;
	l_tmp_rec	mgt_itm_oper%ROWTYPE ;
	l_ptn		mgt_itm_oper.oper_ptn%TYPE ;
	x	RECORD ;
BEGIN

	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_ACT_COPY_ITM_INFO.P_OPER') ;

	DELETE FROM	mgt_itm_oper t
	WHERE	0=0
	AND	t.term = i_term::TIMESTAMP(0) WITHOUT TIME ZONE
	AND	t.calc_ctg_cd = i_calc_ctg_cd
	AND	EXISTS (
		SELECT	'X'
		FROM	mgw_wg w
		WHERE	0=0
		AND	w.wg_cd = t.wg_cd
		)
	;

	FOR x IN
		SELECT
			t4.wg_cd,
			t1.itm_cd,
			t1.itm_sub1,
			t1.itm_sub2,
			t1.itm_sub3,
			t4.loc_cd,
			CASE i_ptn_set_typ
				WHEN c_ptn_itm THEN c_ptn1
				WHEN c_ptn_loc THEN t4.loc_cd
				ELSE
					CASE
						WHEN t2.sppl_cd IS NULL THEN c_ptn1
						ELSE c_ptn2
					END
			END AS oper_ptn,
			t1.oper_cd,
			MIN(t1.oper_seq) AS oper_seq,
			MIN(t1.disp_seq) AS disp_seq,
			MIN(t3.itm_cd) AS yield
		FROM
			mgt_inst_oper t1
			INNER JOIN mgt_itm_mfg_inst t2 ON
				(0=0
				AND t1.itm_cd = t2.itm_cd
				AND t1.itm_sub1 = t2.itm_sub1
				AND t1.itm_sub2 = t2.itm_sub2
				AND t1.itm_sub3 = t2.itm_sub3
				AND t1.itm_mfg_inst_no = t2.itm_mfg_inst_no
				AND t1.mfg_act_no = t2.mfg_act_no
				)
			INNER JOIN mgw_calc_ctg w ON (t1.calc_ctg_cd = w.calc_ctg_cd AND t2.calc_ctg_cd = w.calc_ctg_cd)
			INNER JOIN mam_itm m1 ON
				(0=0
				AND t1.itm_cd = m1.itm_cd
				AND t1.itm_sub1 = m1.itm_sub1
				AND t1.itm_sub2 = m1.itm_sub2
				AND t1.itm_sub3 = m1.itm_sub3
				)
			INNER JOIN (
				SELECT
					z.wg_cd,
					z.itm_cd,
					z.itm_sub1,
					z.itm_sub2,
					z.itm_sub3,
					z.itm_mfg_inst_no,
					z.mfg_act_no,
					MIN(z.loc_cd) AS loc_cd
				FROM
					mgt_act_mfg_if z,
					mgw_calc_ctg w,
					mgw_wg w2
				WHERE 0=0
				AND z.calc_ctg_cd = w.calc_ctg_cd
				AND z.wg_cd = w2.wg_cd
				AND z.ym BETWEEN i_ym_from::TIMESTAMP(0) WITHOUT TIME ZONE AND i_ym_to::TIMESTAMP(0) WITHOUT TIME ZONE
				AND z.no_itm_info_flg = c_off
				GROUP BY
					z.wg_cd,
					z.itm_cd,
					z.itm_sub1,
					z.itm_sub2,
					z.itm_sub3,
					z.itm_mfg_inst_no,
					z.mfg_act_no
				) t4
				ON (0=0
					AND t1.itm_cd = t4.itm_cd
					AND t1.itm_sub1 = t4.itm_sub1
					AND t1.itm_sub2 = t4.itm_sub2
					AND t1.itm_sub3 = t4.itm_sub3
					AND t1.itm_mfg_inst_no = t4.itm_mfg_inst_no
					AND t1.mfg_act_no = t4.mfg_act_no
					)
			LEFT OUTER JOIN
				(
				SELECT
					y.wg_cd,
					y.itm_cd,
					y.itm_sub1,
					y.itm_sub2,
					y.itm_sub3,
					y.itm_mfg_inst_no,
					y.mfg_act_no,
					y.oper_act_no
				FROM
					mgt_act_mfg_if y,
					mgw_calc_ctg w,
					mgw_wg w2
				WHERE 0=0
				AND y.calc_ctg_cd = w.calc_ctg_cd
				AND y.wg_cd = w2.wg_cd
				AND y.ym BETWEEN i_ym_from::TIMESTAMP(0) WITHOUT TIME ZONE AND i_ym_to::TIMESTAMP(0) WITHOUT TIME ZONE
				AND y.no_itm_info_flg = c_off
				) t3
				ON (0=0
					AND t1.itm_cd = t3.itm_cd
					AND t1.itm_sub1 = t3.itm_sub1
					AND t1.itm_sub2 = t3.itm_sub2
					AND t1.itm_sub3 = t3.itm_sub3
					AND t1.itm_mfg_inst_no = t3.itm_mfg_inst_no
					AND t1.mfg_act_no = t3.mfg_act_no
					AND t1.oper_act_no = t3.oper_act_no
					)
		GROUP BY
			t4.wg_cd,
			t1.itm_cd,
			t1.itm_sub1,
			t1.itm_sub2,
			t1.itm_sub3,
			t4.LOC_CD,
			CASE i_ptn_set_typ
				WHEN c_ptn_itm THEN c_ptn1
				WHEN c_ptn_loc THEN t4.loc_cd
				ELSE
					CASE
						WHEN t2.sppl_cd IS NULL THEN c_ptn1
						ELSE c_ptn2
					END
			END,
			t1.oper_cd
	LOOP
		IF i_ptn_set_typ = c_ptn_loc AND x.oper_ptn IS NOT NULL THEN
			IF (SELECT COUNT(*) FROM mgpa_act_copy_itm_info$ptn_loc WHERE _index_ = x.oper_ptn) > 0 THEN
				SELECT	_elem_
				INTO STRICT	l_ptn 
				FROM	mgpa_act_copy_itm_info$ptn_loc
				WHERE	_index_ = x.oper_ptn
				;
			ELSE
				l_ptn := ((SELECT COUNT(*) FROM mgpa_act_copy_itm_info$ptn_loc) + 1)::VARCHAR ;
				INSERT INTO mgpa_act_copy_itm_info$ptn_loc (_elem_, _index_) VALUES (l_ptn, x.oper_ptn) ;
			END IF;
		ELSE
			l_ptn := x.oper_ptn;
		END IF;

		l_tmp_rec.itm_cd	:= x.itm_cd ;
		l_tmp_rec.itm_sub1	:= x.itm_sub1 ;
		l_tmp_rec.itm_sub2	:= x.itm_sub2 ;
		l_tmp_rec.itm_sub3	:= x.itm_sub3 ;
		l_tmp_rec.loc_cd	:= x.loc_cd ;
		l_tmp_rec.oper_ptn	:= l_ptn ;
		l_tmp_rec.oper_cd 	:= x.oper_cd ;
		l_tmp_rec.oper_seq 	:= x.oper_seq ;
		l_tmp_rec.term	:= i_term ;
		l_tmp_rec.calc_ctg_cd	:= i_calc_ctg_cd ;
		l_tmp_rec.wg_cd	:= x.wg_cd ;
		l_tmp_rec.disp_seq	:= x.disp_seq ;
		l_tmp_rec.nmr_qty	:= 1 ;
		l_tmp_rec.dnm_qty	:= 1 ;

		IF x.yield IS NULL THEN
			l_tmp_rec.yield_oper_flg	:= c_off ;
		ELSE
			l_tmp_rec.yield_oper_flg	:= c_on ;
		END IF;

		l_tmp_rec.oper_unit_cd	:= NULL ;
		l_tmp_rec.oper_std_qty	:= NULL ;
		l_tmp_rec.oper_conv_qty	:= NULL ;
		l_tmp_rec.dec_place	:= NULL ;
		l_tmp_rec.unit_conv_rnd_typ	:= NULL ;
		l_tmp_rec.rmrks	:= NULL ;
		l_tmp_rec.sub_char1	:= NULL ;
		l_tmp_rec.sub_char2	:= NULL ;
		l_tmp_rec.sub_char3	:= NULL ;
		l_tmp_rec.non_calc_flg	:= c_off ;

		l_rec[COALESCE(array_length(l_rec, 1), 0) + 1] := l_tmp_rec ;

		IF COALESCE(array_length(l_rec, 1), 0) > c_max_cnt THEN
			CALL mgpa_act_copy_itm_info$p_ins_oper(l_rec) ;
		END IF ;

	END LOOP ;

	CALL mgpa_act_copy_itm_info$p_ins_oper(l_rec) ;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_ACT_COPY_ITM_INFO.P_OPER') ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_act_copy_itm_info$p_ins_bom (
	 INOUT o_rec	mgt_bom[]
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	mgt_bomの作成
<REMARKS>

<ARGUMENTS>
<INOUT>	o_rec
		mgt_bomの配列
<HISTORY>
**************************************************************************/
BEGIN

	IF COALESCE(array_length(o_rec, 1), 0) = 0 THEN
		RETURN ;
	END IF ;
	INSERT INTO mgt_bom SELECT * FROM UNNEST(o_rec);
	o_rec := '{}' ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_act_copy_itm_info$p_bom (
	 IN i_ym_from	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ym_to	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_calc_ctg_cd	VARCHAR,
	 IN i_term TIMESTAMP	WITHOUT TIME ZONE,
	 IN i_ptn_set_typ	VARCHAR
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	原価ＢＯＭ情報コピー処理
<REMARKS>

<ARGUMENTS>
<IN>	i_ym_from
		コピー元年月Ｆｒｏｍ
<IN>	i_ym_to
		コピー元年月Ｔｏ
<IN>	i_calc_ctg_cd
		コピー先計算カテゴリＣＤ
<IN>	i_term
		コピー先期
<IN>	i_ptn_set_typ
		構成/工程パタン設定区分
<HISTORY>
**********************************************************/
DECLARE
	c_max_cnt		CONSTANT INTEGER := 10000 ;	/* バルクインサートでの最大レコード数 */
	c_off			CONSTANT CHAR(1) := '0' ;
	c_null_val		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	c_rnd_typ		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RND_TYP','RNDOFF') ;	/* 四捨五入 */
	c_ptn_itm		CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_PTN_SET_TYP','ITM') ;	/* 品目毎 */
	c_ptn_loc		CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_PTN_SET_TYP','LOC') ;	/* 場所毎 */
	c_ptn1			CONSTANT VARCHAR := '1' ;
	c_ptn2			CONSTANT VARCHAR := '2' ;

	l_rec		mgt_bom[] ;
	l_tmp_rec	mgt_bom%ROWTYPE ;
	l_wg_cd	mam_wg.wg_cd%TYPE ;
	l_par_itm_cd	mam_itm.itm_cd%TYPE ;
	l_par_itm_sub1	mam_itm.itm_sub1%TYPE ;
	l_par_itm_sub2	mam_itm.itm_sub2%TYPE ;
	l_par_itm_sub3	mam_itm.itm_sub3%TYPE ;
	l_bom_ptn	mgt_bom.bom_ptn%TYPE ;
	l_ptn		mgt_bom.bom_ptn%TYPE ;
	l_disp_seq	NUMERIC ;
	l_def_wg_cnt	INTEGER ;
	x RECORD ;
BEGIN

	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_ACT_COPY_ITM_INFO.P_BOM') ;

	SELECT	COUNT(*)
	INTO STRICT	l_def_wg_cnt
	FROM	mam_sys_parm m
	WHERE	0=0
	AND	m.parm_key = 'DEF_WG_CD'
	AND	m.parm_val IS NOT NULL
	AND	m.parm_val != c_null_val
	;

	DELETE FROM	mgt_bom t
	WHERE	0=0
	AND	t.term = i_term::TIMESTAMP(0) WITHOUT TIME ZONE
	AND	t.calc_ctg_cd = i_calc_ctg_cd
	AND	(
		l_def_wg_cnt > 0 AND t.wg_cd = c_null_val
		OR
		l_def_wg_cnt = 0
		AND	EXISTS (
			SELECT	'X'
			FROM	mgw_wg w
			WHERE	0=0
			AND	w.wg_cd = t.wg_cd
			)
	)
	;

	l_wg_cd := NULL ;
	l_par_itm_cd := NULL ;
	l_par_itm_sub1 := NULL ;
	l_par_itm_sub2 := NULL ;
	l_par_itm_sub3 := NULL ;
	l_bom_ptn := NULL ;

	FOR x IN
		SELECT
			t1.*,
			t2.qty AS p_qty,
			COALESCE(m1.cost_std_qty, 1) AS base_qty,
			COALESCE(m2.dec_place, 0) AS dec_place
		FROM
			(
			SELECT
				CASE WHEN l_def_wg_cnt = 0 THEN t1.wg_cd ELSE c_null_val END AS wg_cd,
				t1.par_itm_cd,
				t1.par_itm_sub1,
				t1.par_itm_sub2,
				t1.par_itm_sub3,
				CASE i_ptn_set_typ
					WHEN c_ptn_itm THEN c_ptn1
					WHEN c_ptn_loc THEN t1.loc_cd
					ELSE
						CASE
							WHEN t2.sppl_cd IS NULL THEN c_ptn1
							ELSE c_ptn2
						END
				END AS bom_ptn,
				t1.itm_cd,
				t1.itm_sub1,
				t1.itm_sub2,
				t1.itm_sub3,
				t1.expns_cd,
				t3.oper_cd,
				MIN(t3.oper_seq) AS oper_seq,
				SUM(t1.qty) AS qty
			FROM
				mgt_itm_mfg_inst t2,
				mgw_calc_ctg w,
				mgw_wg w2,
				mgt_act_inpt_if t1
				LEFT OUTER JOIN mgt_inst_oper t3
					ON (t1.calc_ctg_cd = t3.calc_ctg_cd
							AND	t1.par_itm_cd = t3.itm_cd
							AND	t1.par_itm_sub1 = t3.itm_sub1
							AND	t1.par_itm_sub2 = t3.itm_sub2
							AND	t1.par_itm_sub3 = t3.itm_sub3
							AND	t1.itm_mfg_inst_no = t3.itm_mfg_inst_no
							AND	t1.mfg_act_no = t3.mfg_act_no
							AND	t1.oper_act_no = t3.oper_act_no
						)
			WHERE	0=0
			AND	t1.calc_ctg_cd = w.calc_ctg_cd
			AND	t1.wg_cd = w2.wg_cd
			AND	t1.calc_ctg_cd = t2.calc_ctg_cd
			AND	t1.par_itm_cd = t2.itm_cd
			AND	t1.par_itm_sub1 = t2.itm_sub1
			AND	t1.par_itm_sub2 = t2.itm_sub2
			AND	t1.par_itm_sub3 = t2.itm_sub3
			AND	t1.itm_mfg_inst_no = t2.itm_mfg_inst_no
			AND	t1.mfg_act_no = t2.mfg_act_no
			AND	t1.ym BETWEEN i_ym_from::TIMESTAMP(0) WITHOUT TIME ZONE AND i_ym_to::TIMESTAMP(0) WITHOUT TIME ZONE
			AND	t1.no_itm_info_flg = c_off
			AND	(t1.par_itm_cd <> t1.itm_cd
				OR t1.par_itm_sub1 <> t1.itm_sub1
				OR t1.par_itm_sub2 <> t1.itm_sub2
				OR t1.par_itm_sub3 <> t1.itm_sub3)
			GROUP BY
				CASE WHEN l_def_wg_cnt = 0 THEN t1.wg_cd ELSE c_null_val END,
				t1.par_itm_cd,
				t1.par_itm_sub1,
				t1.par_itm_sub2,
				t1.par_itm_sub3,
				CASE i_PTN_SET_TYP
					WHEN c_ptn_itm THEN c_ptn1
					WHEN c_ptn_loc THEN t1.loc_cd
					ELSE
					CASE
						WHEN t2.sppl_cd IS NULL THEN c_ptn1
						ELSE c_ptn2
					END
				END,
				t1.itm_cd,
				t1.itm_sub1,
				t1.itm_sub2,
				t1.itm_sub3,
				t1.expns_cd,
				t3.oper_cd
			) t1,
			(
			SELECT
				CASE WHEN l_def_wg_cnt = 0 THEN t1.wg_cd ELSE c_null_val END AS wg_cd,
				t1.itm_cd,
				t1.itm_sub1,
				t1.itm_sub2,
				t1.itm_sub3,
				CASE i_ptn_set_typ
					WHEN c_ptn_itm THEN c_ptn1
					WHEN c_ptn_loc THEN t1.loc_cd
					ELSE
						CASE
							WHEN t2.sppl_cd IS NULL THEN c_ptn1
							ELSE c_ptn2
						END
				END AS bom_ptn,
				SUM(t1.qty) AS qty
			FROM
				mgt_act_mfg_if t1,
				mgt_itm_mfg_inst t2,
				mgw_calc_ctg w,
				mgw_wg w2
			WHERE	0=0
			AND	t1.calc_ctg_cd = w.calc_ctg_cd
			AND	t1.wg_cd = w2.wg_cd
			AND	t1.calc_ctg_cd = t2.calc_ctg_cd
			AND	t1.itm_cd = t2.itm_cd
			AND	t1.itm_sub1 = t2.itm_sub1
			AND	t1.itm_sub2 = t2.itm_sub2
			AND	t1.itm_sub3 = t2.itm_sub3
			AND	t1.itm_mfg_inst_no = t2.itm_mfg_inst_no
			AND	t1.mfg_act_no = t2.mfg_act_no
			AND	t1.ym BETWEEN i_ym_from::TIMESTAMP(0) WITHOUT TIME ZONE AND i_ym_to::TIMESTAMP(0) WITHOUT TIME ZONE
			AND	t1.no_itm_info_flg = c_off
			GROUP BY
				CASE WHEN l_def_wg_cnt = 0 THEN t1.wg_cd ELSE c_null_val END,
				t1.itm_cd,
				t1.itm_sub1,
				t1.itm_sub2,
				t1.itm_sub3,
				CASE i_ptn_set_typ
					WHEN c_ptn_itm THEN c_ptn1
					WHEN c_ptn_loc THEN t1.loc_cd
					ELSE
						CASE
							WHEN t2.sppl_cd IS NULL THEN c_ptn1
							ELSE c_ptn2
						END
				END
			) t2,
			mam_itm m1,
			mam_itm m2
		WHERE	0=0
		AND	t1.wg_cd = t2.wg_cd
		AND	t1.par_itm_cd = t2.itm_cd
		AND	t1.par_itm_sub1 = t2.itm_sub1
		AND	t1.par_itm_sub2 = t2.itm_sub2
		AND	t1.par_itm_sub3 = t2.itm_sub3
		AND	t1.bom_ptn = t2.bom_ptn
		AND	t1.par_itm_cd = m1.itm_cd
		AND	t1.par_itm_sub1 = m1.itm_sub1
		AND	t1.par_itm_sub2 = m1.itm_sub2
		AND	t1.par_itm_sub3 = m1.itm_sub3
		AND	t1.itm_cd = m2.itm_cd
		AND	t1.itm_sub1 = m2.itm_sub1
		AND	t1.itm_sub2 = m2.itm_sub2
		AND	t1.itm_sub3 = m2.itm_sub3
		AND	t2.qty <> 0
		ORDER BY
			t1.wg_cd, t1.par_itm_cd, t1.par_itm_sub1, t1.par_itm_sub2, t1.par_itm_sub3, t1.bom_ptn,
			t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3, t1.oper_cd, t1.expns_cd
	LOOP
		IF l_wg_cd IS NULL AND l_par_itm_cd IS NULL AND l_bom_ptn IS NULL
		OR l_wg_cd <> x.wg_cd
		OR l_par_itm_cd <> x.par_itm_cd
		OR l_par_itm_sub1 <> x.par_itm_sub1
		OR l_par_itm_sub2 <> x.par_itm_sub2
		OR l_par_itm_sub3 <> x.par_itm_sub3
		OR l_bom_ptn <> x.bom_ptn
		THEN
			l_wg_cd := x.wg_cd ;
			l_par_itm_cd := x.par_itm_cd ;
			l_par_itm_sub1 := x.par_itm_sub1 ;
			l_par_itm_sub2 := x.par_itm_sub2 ;
			l_par_itm_sub3 := x.par_itm_sub3 ;
			l_bom_ptn := x.bom_ptn ;
			l_disp_seq := 1 ;
		ELSE
			l_disp_seq := l_disp_seq + 1 ;
		END IF ;

		IF i_ptn_set_typ = c_ptn_loc AND x.bom_ptn IS NOT NULL THEN
			IF (SELECT COUNT(*) FROM mgpa_act_copy_itm_info$ptn_loc WHERE _index_ = x.bom_ptn) > 0 THEN
				SELECT	_elem_
				INTO STRICT	l_ptn 
				FROM	mgpa_act_copy_itm_info$ptn_loc
				WHERE	_index_ = x.bom_ptn
				;
			ELSE
				l_ptn := ((SELECT COUNT(*) FROM mgpa_act_copy_itm_info$ptn_loc) + 1)::VARCHAR ;
				INSERT INTO mgpa_act_copy_itm_info$ptn_loc (_elem_, _index_) VALUES (l_ptn, x.bom_ptn) ;
			END IF;
		ELSE
			l_ptn := x.bom_ptn;
		END IF;

		l_tmp_rec.par_itm_cd	:= x.par_itm_cd ;
		l_tmp_rec.par_itm_sub1	:= x.par_itm_sub1 ;
		l_tmp_rec.par_itm_sub2	:= x.par_itm_sub2 ;
		l_tmp_rec.par_itm_sub3	:= x.par_itm_sub3 ;
		l_tmp_rec.bom_ptn	:= l_ptn ;
		l_tmp_rec.oper_cd	:= x.oper_cd ;
		l_tmp_rec.oper_seq	:= x.oper_seq ;
		l_tmp_rec.chd_itm_cd	:= x.itm_cd ;
		l_tmp_rec.chd_itm_sub1	:= x.itm_sub1 ;
		l_tmp_rec.chd_itm_sub2	:= x.itm_sub2 ;
		l_tmp_rec.chd_itm_sub3	:= x.itm_sub3 ;
		l_tmp_rec.alt_grp_cd 	:= NULL ;
		l_tmp_rec.expns_cd	:= x.expns_cd ;
		l_tmp_rec.term	:= i_term ;
		l_tmp_rec.calc_ctg_cd	:= i_calc_ctg_cd ;
		l_tmp_rec.wg_cd	:= x.wg_cd ;
		l_tmp_rec.disp_seq	:= l_disp_seq ;
		l_tmp_rec.par_rqmt_qty	:= x.base_qty ;
		l_tmp_rec.chd_rqmt_qty	:= mapa_calc$f_rnd((x.qty / x.p_qty) * x.base_qty, x.dec_place, c_rnd_typ) ;
		l_tmp_rec.chd_base_qty	:= l_tmp_rec.chd_rqmt_qty ;

		l_tmp_rec.fxd_chd_rqmt_qty	:= 0;
		l_tmp_rec.chd_min_qty	:= 0 ;
		l_tmp_rec.chd_batch_qty	:= 0 ;
		l_tmp_rec.alt_itm_ratio	:= nuLL ;
		l_tmp_rec.rmrks	:= NULL ;
		l_tmp_rec.sub_char1	:= NULL ;
		l_tmp_rec.sub_char2	:= NULL ;
		l_tmp_rec.sub_char3	:= NULL ;
		l_tmp_rec.non_calc_flg	:= c_off ;

		l_rec[COALESCE(array_length(l_rec, 1), 0) + 1] := l_tmp_rec ;

		IF COALESCE(array_length(l_rec, 1), 0) > c_max_cnt THEN
			CALL mgpa_act_copy_itm_info$p_ins_bom(l_rec) ;
		END IF ;

	END LOOP ;

	CALL mgpa_act_copy_itm_info$p_ins_bom(l_rec) ;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_ACT_COPY_ITM_INFO.P_BOM') ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_act_copy_itm_info$p_ins_wk (
	 INOUT o_rec	mgt_itm_wk[]
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	mgt_itm_wkの作成
<REMARKS>

<ARGUMENTS>
<INOUT>	o_rec
		mgt_itm_wkの配列
<HISTORY>
**************************************************************************/
BEGIN

	IF COALESCE(array_length(o_rec, 1), 0) = 0 THEN
		RETURN ;
	END IF ;
	INSERT INTO mgt_itm_wk SELECT * FROM UNNEST(o_rec);
	o_rec := '{}' ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_act_copy_itm_info$p_wk (
	 IN i_ym_from	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ym_to	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_calc_ctg_cd	VARCHAR,
	 IN i_term TIMESTAMP	WITHOUT TIME ZONE,
	 IN i_ptn_set_typ	VARCHAR
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	原価品目工数情報コピー処理
<REMARKS>

<ARGUMENTS>
<IN>	i_ym_from
		コピー元年月Ｆｒｏｍ
<IN>	i_ym_to
		コピー元年月Ｔｏ
<IN>	i_calc_ctg_cd
		コピー先計算カテゴリＣＤ
<IN>	i_term
		コピー先期
<IN>	i_ptn_set_typ
		構成/工程パタン設定区分
<HISTORY>
**********************************************************/
DECLARE
	c_max_cnt		CONSTANT INTEGER := 10000 ;	/* バルクインサートでの最大レコード数 */
	c_off			CONSTANT CHAR(1) := '0' ;
	c_null_val		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	c_rnd_typ		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RND_TYP','RNDOFF') ;	/* 四捨五入 */
	c_ptn_itm		CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_PTN_SET_TYP','ITM') ;	/* 品目毎 */
	c_ptn_loc		CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_PTN_SET_TYP','LOC') ;	/* 場所毎 */
	c_ptn1			CONSTANT VARCHAR := '1' ;
	c_ptn2			CONSTANT VARCHAR := '2' ;

	l_rec		mgt_itm_wk[] ;
	l_tmp_rec	mgt_itm_wk%ROWTYPE ;
	l_ptn	mgt_itm_wk.oper_ptn%TYPE ;
	x RECORD ;
BEGIN

	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_ACT_COPY_ITM_INFO.P_WK') ;

	DELETE FROM	mgt_itm_wk t
	WHERE	0=0
	AND	t.term = i_term::TIMESTAMP(0) WITHOUT TIME ZONE
	AND	t.calc_ctg_cd = i_calc_ctg_cd
	AND	EXISTS (
		SELECT	'X'
		FROM	mgw_wg w
		WHERE	0=0
		AND	w.wg_cd = t.wg_cd
		)
	;

	FOR x IN
		SELECT
			x1.wg_cd,
			x1.itm_cd,
			x1.itm_sub1,
			x1.itm_sub2,
			x1.itm_sub3,
			x1.loc_cd,
			x1.oper_ptn,
			x1.oper_cd,
			x1.oper_seq,
			x1.wk_cost_cd,
			COALESCE(m1.cost_std_qty, 1) AS base_qty,
			mapa_calc$f_rnd((x1.wk_cost / x2.qty) * COALESCE(m1.cost_std_qty, 1), COALESCE(m2.dec_place, 0), c_rnd_typ) AS wk_cost
		FROM
			(
			SELECT
				t1.wg_cd,
				t1.itm_cd,
				t1.itm_sub1,
				t1.itm_sub2,
				t1.itm_sub3,
				t1.loc_cd,
				CASE i_ptn_set_typ
					WHEN c_ptn_itm THEN c_ptn1
					WHEN c_ptn_loc THEN t1.loc_cd
					ELSE
						CASE
							WHEN t2.sppl_cd IS NULL THEN c_ptn1
							ELSE c_ptn2
						END
				END AS oper_ptn,
				SUM(t1.qty) AS qty
			FROM
				mgt_act_mfg_if t1,
				mgt_itm_mfg_inst t2,
				mgw_calc_ctg w,
				mgw_wg w2
			WHERE	0=0
			AND	t1.calc_ctg_cd = w.calc_ctg_cd
			AND	t1.calc_ctg_cd = t2.calc_ctg_cd
			AND	t1.wg_cd = w2.wg_cd
			AND	t1.itm_cd = t2.itm_cd
			AND	t1.itm_sub1 = t2.itm_sub1
			AND	t1.itm_sub2 = t2.itm_sub2
			AND	t1.itm_sub3 = t2.itm_sub3
			AND	t1.itm_mfg_inst_no = t2.itm_mfg_inst_no
			AND	t1.mfg_act_no = t2.mfg_act_no
			AND	t1.ym BETWEEN i_ym_from::TIMESTAMP(0) WITHOUT TIME ZONE AND i_ym_to::TIMESTAMP(0) WITHOUT TIME ZONE
			AND	t1.no_itm_info_flg = c_off
			GROUP BY t1.wg_cd,
			t1.itm_cd,
			t1.itm_sub1,
			t1.itm_sub2,
			t1.itm_sub3,
			t1.loc_cd,
			CASE i_ptn_set_typ
				WHEN c_ptn_itm THEN c_ptn1
				WHEN c_ptn_loc THEN t1.loc_cd
				ELSE
					CASE
						WHEN t2.sppl_cd IS NULL THEN c_ptn1
						ELSE c_ptn2
					END
			END) x2,
			mam_itm m1,
			(
			SELECT
				t1.wg_cd,
				t1.itm_cd,
				t1.itm_sub1,
				t1.itm_sub2,
				t1.itm_sub3,
				t1.loc_cd,
				CASE i_ptn_set_typ
					WHEN c_ptn_itm THEN c_ptn1
					WHEN c_ptn_loc THEN t1.loc_cd
					ELSE
						CASE
							WHEN t3.sppl_cd IS NULL THEN c_ptn1
							ELSE c_ptn2
						END
				END AS oper_ptn,
				COALESCE(t2.oper_cd, c_null_val) AS oper_cd,
				COALESCE(MIN(t2.oper_seq), 1) AS oper_seq,
				t1.wk_cost_cd,
				SUM(t1.wk_cost) AS wk_cost
			FROM
				mgt_itm_mfg_inst t3,
				mgw_calc_ctg w,
				mgw_wg w2,
				mgt_act_inst_wk_if t1
				LEFT OUTER JOIN mgt_inst_oper AS t2
					ON (t1.calc_ctg_cd = t2.calc_ctg_cd
						AND	t1.itm_cd = t2.itm_cd
						AND	t1.itm_sub1 = t2.itm_sub1
						AND	t1.itm_sub2 = t2.itm_sub2
						AND	t1.itm_sub3 = t2.itm_sub3
						AND	t1.itm_mfg_inst_no = t2.itm_mfg_inst_no
						AND	t1.mfg_act_no = t2.mfg_act_no
						AND	t1.oper_act_no = t2.oper_act_no
						)
			WHERE	0=0
			AND	t1.calc_ctg_cd = w.calc_ctg_cd
			AND	t1.wg_cd = w2.wg_cd
			AND	t1.calc_ctg_cd = t3.calc_ctg_cd
			AND	t1.itm_cd = t3.itm_cd
			AND	t1.itm_sub1 = t3.itm_sub1
			AND	t1.itm_sub2 = t3.itm_sub2
			AND	t1.itm_sub3 = t3.itm_sub3
			AND	t1.itm_mfg_inst_no = t3.itm_mfg_inst_no
			AND	t1.mfg_act_no = t3.mfg_act_no
			AND	t1.ym BETWEEN i_ym_from::TIMESTAMP(0) WITHOUT TIME ZONE AND i_ym_to::TIMESTAMP(0) WITHOUT TIME ZONE
			AND	t1.no_itm_info_flg = c_off
			GROUP BY
				t1.wg_cd,
				t1.itm_cd,
				t1.itm_sub1,
				t1.itm_sub2,
				t1.itm_sub3,
				t1.loc_cd,
				CASE i_ptn_set_typ
					WHEN c_ptn_itm THEN c_ptn1
					WHEN c_ptn_loc THEN t1.loc_cd
					ELSE
						CASE
							WHEN t3.sppl_cd IS NULL THEN c_ptn1
							ELSE c_ptn2
						END
				END,
				t2.oper_cd,
				t1.wk_cost_cd
			) x1
			LEFT OUTER JOIN mam_wk_cost m2 ON (x1.wk_cost_cd = m2.wk_cost_cd AND m2.del_flg = c_off)
		WHERE	0=0
		AND	x1.wg_cd = x2.wg_cd
		AND	x1.itm_cd = x2.itm_cd
		AND	x1.itm_sub1 = x2.itm_sub1
		AND	x1.itm_sub2 = x2.itm_sub2
		AND	x1.itm_sub3 = x2.itm_sub3
		AND	x1.loc_cd = x2.loc_cd
		AND	x1.oper_ptn = x2.oper_ptn
		AND	x1.itm_cd = m1.itm_cd
		AND	x1.itm_sub1 = m1.itm_sub1
		AND	x1.itm_sub2 = m1.itm_sub2
		AND	x1.itm_sub3 = m1.itm_sub3
		AND	x2.qty <> 0
	LOOP
		IF i_ptn_set_typ = c_ptn_loc AND x.oper_ptn IS NOT NULL THEN
			IF (SELECT COUNT(*) FROM mgpa_act_copy_itm_info$ptn_loc WHERE _index_ = x.oper_ptn) > 0 THEN
				SELECT	_elem_
				INTO STRICT	l_ptn 
				FROM	mgpa_act_copy_itm_info$ptn_loc
				WHERE	_index_ = x.oper_ptn
				;
			ELSE
				l_ptn := ((SELECT COUNT(*) FROM mgpa_act_copy_itm_info$ptn_loc) + 1)::VARCHAR ;
				INSERT INTO mgpa_act_copy_itm_info$ptn_loc (_elem_, _index_) VALUES (l_ptn, x.oper_ptn) ;
			END IF;
		ELSE
			l_ptn := x.oper_ptn;
		END IF;
		IF x.oper_cd = c_null_val THEN
			l_ptn := c_null_val;
		END IF ;

		l_tmp_rec.itm_cd	:= x.itm_cd ;
		l_tmp_rec.itm_sub1	:= x.itm_sub1 ;
		l_tmp_rec.itm_sub2	:= x.itm_sub2 ;
		l_tmp_rec.itm_sub3	:= x.itm_sub3 ;
		l_tmp_rec.loc_cd	:= x.loc_cd ;
		l_tmp_rec.oper_ptn	:= l_ptn ;
		l_tmp_rec.oper_cd 	:= x.oper_cd ;
		l_tmp_rec.oper_seq 	:= x.oper_seq ;
		l_tmp_rec.wk_cost_cd 	:= x.wk_cost_cd ;
		l_tmp_rec.term	:= i_term ;
		l_tmp_rec.calc_ctg_cd	:= i_calc_ctg_cd ;
		l_tmp_rec.wg_cd	:= x.wg_cd ;

		l_tmp_rec.base_qty	:= x.base_qty ;
		l_tmp_rec.fxd_wk_cost	:= 0 ;
		l_tmp_rec.wk_cost	:= x.wk_cost ;
		l_tmp_rec.min_wk_cost	:= 0 ;
		l_tmp_rec.batch_wk_cost	:= 0 ;
		l_tmp_rec.rmrks	:= NULL ;
		l_tmp_rec.sub_char1	:= NULL ;
		l_tmp_rec.sub_char2	:= NULL ;
		l_tmp_rec.sub_char3	:= NULL ;
		l_tmp_rec.non_calc_flg	:= c_off ;

		l_rec[COALESCE(array_length(l_rec, 1), 0) + 1] := l_tmp_rec ;

		IF COALESCE(array_length(l_rec, 1), 0) > c_max_cnt THEN
			CALL mgpa_act_copy_itm_info$p_ins_wk(l_rec) ;
		END IF ;

	END LOOP ;

	CALL mgpa_act_copy_itm_info$p_ins_wk(l_rec) ;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_ACT_COPY_ITM_INFO.P_WK') ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_act_copy_itm_info$p_purc (
	 IN i_ym_from	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ym_to	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_calc_ctg_cd	VARCHAR,
	 IN i_term TIMESTAMP	WITHOUT TIME ZONE,
	 IN i_base_cur_cd VARCHAR,
	 IN i_upri_dec_place NUMERIC
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	原価品目購買単価情報コピー処理
<REMARKS>

<ARGUMENTS>
<IN>	i_ym_from
		コピー元年月Ｆｒｏｍ
<IN>	i_ym_to
		コピー元年月Ｔｏ
<IN>	i_calc_ctg_cd
		コピー先計算カテゴリＣＤ
<IN>	i_term
		コピー先期
<IN>	i_base_cur_cd
		基準通貨ＣＤ
<IN>	i_upri_dec_place
		単価小数部有効桁数
<HISTORY>
**********************************************************/
DECLARE
	c_off		CONSTANT CHAR(1) := '0' ;
	c_rnd_typ	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RND_TYP','RNDOFF') ;	/* 四捨五入 */
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	l_def_wg_cnt	INTEGER ;
BEGIN

	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_ACT_COPY_ITM_INFO.P_PURC') ;

	SELECT	COUNT(*)
	INTO STRICT	l_def_wg_cnt
	FROM	mam_sys_parm m
	WHERE	0=0
	AND	m.parm_key = 'DEF_WG_CD'
	AND	m.parm_val IS NOT NULL
	AND	m.parm_val != c_null_val
	;

	DELETE FROM	mgt_itm_purc t
	WHERE	0=0
	AND	t.term = i_term::TIMESTAMP(0) WITHOUT TIME ZONE
	AND	t.calc_ctg_cd = i_calc_ctg_cd
	AND	(
		l_def_wg_cnt > 0 AND t.wg_cd = c_null_val
		OR
		l_def_wg_cnt = 0
		AND	EXISTS (
			SELECT	'X'
			FROM	mgw_wg w
			WHERE	0=0
			AND	w.wg_cd = t.wg_cd
			)
	)
	;

	INSERT INTO mgt_itm_purc (
		itm_cd,
		itm_sub1,
		itm_sub2,
		itm_sub3,
		sppl_cd,
		term,
		calc_ctg_cd,
		wg_cd,
		base_qty,
		cur_cd,
		upri,
		cost_ratio,
		rmrks,
		sub_char1,
		sub_char2,
		sub_char3,
		non_calc_flg
		)
	SELECT
		x.itm_cd,
		x.itm_sub1,
		x.itm_sub2,
		x.itm_sub3,
		x.sppl_cd,
		i_term::TIMESTAMP(0) WITHOUT TIME ZONE,
		i_calc_ctg_cd,
		x.wg_cd,
		COALESCE(m.cost_std_qty, 1),
		i_base_cur_cd,
		mapa_calc$f_rnd((x.amt / x.qty) * COALESCE(m.cost_std_qty, 1), i_upri_dec_place::NUMERIC(2, 0), c_rnd_typ),
		NULL,
		NULL,
		NULL,
		NULL,
		NULL,
		c_off
	FROM
		(
		SELECT
			CASE WHEN l_def_wg_cnt = 0 THEN t.wg_cd ELSE c_null_val END AS wg_cd,
			t.itm_cd,
			t.itm_sub1,
			t.itm_sub2,
			t.itm_sub3,
			t.sppl_cd,
			SUM(CASE SIGN(t.qty)
				WHEN -1 THEN -1 * t.amt
				ELSE t.amt
			END) AS amt,	/* 数量が負の場合のみ反転 */
			SUM(CASE SIGN(t.qty)
				WHEN -1 THEN -1 * t.qty
				ELSE t.qty
			END) AS qty	/* 数量が負の場合は反転 */
		FROM
			mgt_act_purc_if t,
			mgw_calc_ctg w,
			mgw_wg w2
		WHERE	0=0
		AND	t.calc_ctg_cd = w.calc_ctg_cd
		AND	t.wg_cd = w2.wg_cd
		AND	t.ym BETWEEN i_ym_from::TIMESTAMP(0) WITHOUT TIME ZONE AND i_ym_to::TIMESTAMP(0) WITHOUT TIME ZONE
		AND	t.no_itm_info_flg = c_off
		GROUP BY
			CASE WHEN l_def_wg_cnt = 0 THEN t.wg_cd ELSE c_null_val END,
			t.itm_cd,
			t.itm_sub1,
			t.itm_sub2,
			t.itm_sub3,
			t.sppl_cd
		) x,
		mam_itm m
	WHERE	0=0
	AND	x.itm_cd = m.itm_cd
	AND	x.itm_sub1 = m.itm_sub1
	AND	x.itm_sub2 = m.itm_sub2
	AND	x.itm_sub3 = m.itm_sub3
	AND	x.qty <> 0
	;

	DELETE FROM	mgt_itm_purc t
	WHERE	0=0
	AND	t.term = i_term::TIMESTAMP(0) WITHOUT TIME ZONE
	AND	t.calc_ctg_cd = i_calc_ctg_cd
	AND	(
		l_def_wg_cnt > 0 AND t.wg_cd = c_null_val
		OR
		l_def_wg_cnt = 0
		AND	EXISTS (
			SELECT	'X'
			FROM	mgw_wg w
			WHERE	0=0
			AND	w.wg_cd = t.wg_cd
			)
	)
	AND	t.upri = 0
	;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_ACT_COPY_ITM_INFO.P_PURC') ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_act_copy_itm_info$p_proc (
	 IN i_ym_from	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ym_to	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_calc_ctg_cd	VARCHAR,
	 IN i_term TIMESTAMP	WITHOUT TIME ZONE,
	 IN i_base_cur_cd VARCHAR,
	 IN i_upri_dec_place NUMERIC
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	原価品目加工単価情報コピー処理
<REMARKS>

<ARGUMENTS>
<IN>	i_ym_from
		コピー元年月Ｆｒｏｍ
<IN>	i_ym_to
		コピー元年月Ｔｏ
<IN>	i_calc_ctg_cd
		コピー先計算カテゴリＣＤ
<IN>	i_term
		コピー先期
<IN>	i_base_cur_cd
		基準通貨ＣＤ
<IN>	i_upri_dec_place
		単価小数部有効桁数
<HISTORY>
**********************************************************/
DECLARE
	c_off			CONSTANT CHAR(1) := '0' ;
	c_rnd_typ		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RND_TYP','RNDOFF') ;	/* 四捨五入 */
	c_purc			CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PURC') ;		/* 仕入 */
	c_purc_ret		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PURC') ;		/* 仕入返品 */
	c_purc_dscnt	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PURC') ;		/* 仕入値引 */
	c_purc_xtra		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PURC');			/* 仕入値増 */
	c_slip_onr_prov	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','ONR_PROV') ;	/* 有償支給 */
	c_slip_onr_prvr	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','ONR_PRVR') ;	/* 有償支給戻 */
	c_slip_in_onr	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','IN_ONR') ;		/* 投入(有償) */
	c_outsrc_proc	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_OUTSRC_UPRI_TYP','PROC') ;	/* 加工単価 */
	c_null_val		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;

	l_co	mam_co%ROWTYPE := mapa_co$f_get_co_rec() ;
	l_def_wg_cnt	INTEGER ;
BEGIN

	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_ACT_COPY_ITM_INFO.P_PROC') ;

	SELECT	COUNT(*)
	INTO STRICT	l_def_wg_cnt
	FROM	mam_sys_parm m
	WHERE	0=0
	AND	m.parm_key = 'DEF_WG_CD'
	AND	m.parm_val IS NOT NULL
	AND	m.parm_val != c_null_val
	;

	DELETE FROM	mgt_itm_proc t
	WHERE	0=0
	AND	t.term = i_term::TIMESTAMP(0) WITHOUT TIME ZONE
	AND	t.calc_ctg_cd = i_calc_ctg_cd
	AND	(
		l_def_wg_cnt > 0 AND t.wg_cd = c_null_val
		OR
		l_def_wg_cnt = 0
		AND	EXISTS (
			SELECT	'X'
			FROM	mgw_wg w
			WHERE	0=0
			AND	w.wg_cd = t.wg_cd
			)
	)
	;

	INSERT INTO mgt_itm_proc (
		itm_cd,
		itm_sub1,
		itm_sub2,
		itm_sub3,
		sppl_cd,
		term,
		calc_ctg_cd,
		wg_cd,
		base_qty,
		cur_cd,
		upri,
		cost_ratio,
		rmrks,
		sub_char1,
		sub_char2,
		sub_char3,
		non_calc_flg
		)
	SELECT
		x.itm_cd,
		x.itm_sub1,
		x.itm_sub2,
		x.itm_sub3,
		x.sppl_cd,
		i_term::TIMESTAMP(0) WITHOUT TIME ZONE,
		i_calc_ctg_cd,
		x.wg_cd,
		COALESCE(m.cost_std_qty, 1),
		i_base_cur_cd,
		mapa_calc$f_rnd(
			CASE
				CASE m2.onr_prsppl_flg
					WHEN '0' THEN c_outsrc_proc
					ELSE COALESCE(m2.outsrc_upri_typ, l_co.outsrc_upri_typ)
				END
				WHEN c_outsrc_proc THEN x.amt
				ELSE x.amt - COALESCE(x2.amt, 0)
			END / x.qty * COALESCE(m.cost_std_qty, 1), i_upri_dec_place::NUMERIC(2, 0), c_rnd_typ
			),
		NULL,
		NULL,
		NULL,
		NULL,
		NULL,
		c_off
	FROM
		mam_itm m,
		mam_bp m2,
		(
		SELECT
			CASE WHEN l_def_wg_cnt = 0 THEN t1.wg_cd ELSE c_null_val END AS wg_cd,
			t1.itm_cd,
			t1.itm_sub1,
			t1.itm_sub2,
			t1.itm_sub3,
			t2.sppl_cd,
			SUM(CASE SIGN(t1.qty)
				WHEN -1 THEN -1 * t1.amt
				ELSE t1.amt
			END) AS amt,	/* 数量が負の場合のみ反転 */
			SUM(CASE SIGN(t1.qty)
				WHEN -1 THEN -1 * t1.qty
				ELSE t1.qty
			END) AS qty	/* 数量が負の場合は反転 */
		FROM
			mgt_act_mfg_if t1,
			mgt_itm_mfg_inst t2,
			mgw_calc_ctg w,
			mgw_wg w2
	WHERE	0=0
	AND	t1.calc_ctg_cd = w.calc_ctg_cd
	AND	t1.wg_cd = w2.wg_cd
	AND	t1.ac_slip_typ IN (c_purc, c_purc_ret, c_purc_dscnt, c_purc_xtra)
	AND	t1.calc_ctg_cd = t2.calc_ctg_cd
	AND	t1.itm_cd = t2.itm_cd
	AND	t1.itm_sub1 = t2.itm_sub1
	AND	t1.itm_sub2 = t2.itm_sub2
	AND	t1.itm_sub3 = t2.itm_sub3
	AND	t1.itm_mfg_inst_no = t2.itm_mfg_inst_no
	AND	t1.mfg_act_no = t2.mfg_act_no
	AND	t1.ym BETWEEN i_ym_from::TIMESTAMP(0) WITHOUT TIME ZONE AND i_ym_to::TIMESTAMP(0) WITHOUT TIME ZONE
	AND	t1.no_itm_info_flg = c_off
	AND	t1.amt IS NOT NULL
	AND	t2.sppl_cd IS NOT NULL
	GROUP BY
		CASE WHEN l_def_wg_cnt = 0 THEN t1.wg_cd ELSE c_null_val END,
		t1.itm_cd,
		t1.itm_sub1,
		t1.itm_sub2,
		t1.itm_sub3,
		t2.sppl_cd
	) x
	LEFT OUTER JOIN (
		SELECT
			CASE WHEN l_def_wg_cnt = 0 THEN v1.wg_cd ELSE c_null_val END AS wg_cd,
			v1.par_itm_cd,
			v1.par_itm_sub1,
			v1.par_itm_sub2,
			v1.par_itm_sub3,
			v1.sppl_cd,
			SUM(v2.amt / v2.qty * v1.qty) AS amt
		FROM
			(
			/* 投入（有償） */
			SELECT
				t1.wg_cd,
				t1.par_itm_cd,
				t1.par_itm_sub1,
				t1.par_itm_sub2,
				t1.par_itm_sub3,
				t1.itm_cd,
				t1.itm_sub1,
				t1.itm_sub2,
				t1.itm_sub3,
				t2.sppl_cd,
				SUM(CASE SIGN(t1.qty)
						WHEN -1 THEN -1 * t1.qty
						ELSE t1.qty
					END) AS qty	/* 数量が負の場合は反転 */
			FROM
				mgt_act_inpt_if t1,
				mgt_itm_mfg_inst t2,
				mgw_calc_ctg w,
				mgw_wg w2
			WHERE	0=0
			AND	t1.calc_ctg_cd = w.calc_ctg_cd
			AND	t1.wg_cd = w2.wg_cd
			AND	t1.calc_ctg_cd = t2.calc_ctg_cd
			AND	t1.par_itm_cd = t2.itm_cd
			AND	t1.par_itm_sub1 = t2.itm_sub1
			AND	t1.par_itm_sub2 = t2.itm_sub2
			AND	t1.par_itm_sub3 = t2.itm_sub3
			AND	t1.itm_mfg_inst_no = t2.itm_mfg_inst_no
			AND	t1.mfg_act_no = t2.mfg_act_no
			AND	t1.ym BETWEEN i_ym_from::TIMESTAMP(0) WITHOUT TIME ZONE AND i_ym_to::TIMESTAMP(0) WITHOUT TIME ZONE
			AND	t1.ac_slip_typ IN (c_slip_in_onr)
			AND	t1.no_itm_info_flg = c_off
			AND	t1.qty IS NOT NULL
			AND	t2.sppl_cd IS NOT NULL
			GROUP BY
				t1.wg_cd,
				t1.par_itm_cd,
				t1.par_itm_sub1,
				t1.par_itm_sub2,
				t1.par_itm_sub3,
				t1.itm_cd,
				t1.itm_sub1,
				t1.itm_sub2,
				t1.itm_sub3,
				t2.sppl_cd
			) v1,
			(
			/* 有償支給、有償支給戻し */
			SELECT
				t.wg_cd,
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3,
				t.bp_cd AS sppl_cd,
				SUM(CASE SIGN(t.qty)
						WHEN -1 THEN -1 * t.amt
						ELSE t.amt
					END) AS amt,	/* 数量が負の場合のみ反転 */
					SUM(CASE SIGN(t.qty)
						WHEN -1 THEN -1 * t.qty
						ELSE t.qty
					END) AS qty	/* 数量が負の場合は反転 */
			FROM
				mgt_act_io_if t,
				mgw_calc_ctg w,
				mgw_wg w2
			WHERE	0=0
			AND	t.calc_ctg_cd = w.calc_ctg_cd
			AND	t.wg_cd = w2.wg_cd
			AND	t.ym BETWEEN i_ym_from::TIMESTAMP(0) WITHOUT TIME ZONE AND i_ym_to::TIMESTAMP(0) WITHOUT TIME ZONE
			AND	t.ac_slip_typ IN (c_slip_onr_prov, c_slip_onr_prvr)
			AND	t.no_itm_info_flg = c_off
			AND	t.amt IS NOT NULL
			AND	t.bp_cd IS NOT NULL
			GROUP BY
				t.wg_cd,
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3,
				t.bp_cd
			) v2
		WHERE	0=0
		AND	v2.wg_cd = v1.wg_cd
		AND	v2.itm_cd = v1.itm_cd
		AND	v2.itm_sub1 = v1.itm_sub1
		AND	v2.itm_sub2 = v1.itm_sub2
		AND	v2.itm_sub3 = v1.itm_sub3
		AND	v2.sppl_cd = v1.sppl_cd
		AND	v1.qty <> 0
		AND	v2.qty <> 0
		GROUP BY
			CASE WHEN l_def_wg_cnt = 0 THEN v1.wg_cd ELSE c_null_val END,
			v1.par_itm_cd,
			v1.par_itm_sub1,
			v1.par_itm_sub2,
			v1.par_itm_sub3,
			v1.sppl_cd
		) x2
			ON (x.wg_cd = x2.wg_cd
				AND	x.itm_cd = x2.par_itm_cd
				AND	x.itm_sub1 = x2.par_itm_sub1
				AND	x.itm_sub2 = x2.par_itm_sub2
				AND	x.itm_sub3 = x2.par_itm_sub3
				AND	x.sppl_cd = x2.sppl_cd
				)
	WHERE	0=0
	AND	x.itm_cd = m.itm_cd
	AND	x.itm_sub1 = m.itm_sub1
	AND	x.itm_sub2 = m.itm_sub2
	AND	x.itm_sub3 = m.itm_sub3
	AND	x.sppl_cd = m2.bp_cd
	AND	x.qty <> 0
	;

	DELETE FROM	mgt_itm_proc t
	WHERE	0=0
	AND	t.term = i_term::TIMESTAMP(0) WITHOUT TIME ZONE
	AND	t.calc_ctg_cd = i_calc_ctg_cd
	AND	(
		l_def_wg_cnt > 0 AND t.wg_cd = c_null_val
		OR
		l_def_wg_cnt = 0
		AND	EXISTS (
			SELECT	'X'
			FROM	mgw_wg w
			WHERE	0=0
			AND	w.wg_cd = t.wg_cd
			)
	)
	AND	t.upri = 0
	;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_ACT_COPY_ITM_INFO.P_PROC') ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_act_copy_itm_info$p_prov (
	 IN i_ym_from	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ym_to	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_calc_ctg_cd	VARCHAR,
	 IN i_term	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_base_cur_cd	VARCHAR,
	 IN i_upri_dec_place	NUMERIC
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	原価品目支給単価情報コピー処理
<REMARKS>

<ARGUMENTS>
<IN>	i_ym_from
		コピー元年月Ｆｒｏｍ
<IN>	i_ym_to
		コピー元年月Ｔｏ
<IN>	i_calc_ctg_cd
		コピー先計算カテゴリＣＤ
<IN>	i_term
		コピー先期
<IN>	i_base_cur_cd
		基準通貨ＣＤ
<IN>	i_upri_dec_place
		単価小数部有効桁数
<HISTORY>
**********************************************************/
DECLARE
	c_off			CONSTANT CHAR(1) := '0' ;
	c_rnd_typ		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RND_TYP','RNDOFF') ;	/* 四捨五入 */
	c_slip_onr_prov	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','ONR_PROV') ;	/* 有償支給 */
	c_slip_onr_prvr	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','ONR_PRVR') ;	/* 有償支給戻 */
	c_slip_in_ss	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','IN_SS') ;	/* 投入(自給) */
	c_onr_prov		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PROV_TYP','ONR_PROV') ;	/* 支給区分.有償支給 */
	c_ss			CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PROV_TYP','SS') ;	/* 支給区分.自給 */
	c_null_val		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;

	l_def_wg_cnt	INTEGER ;
BEGIN

	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_ACT_COPY_ITM_INFO.P_PROV') ;

	SELECT	COUNT(*)
	INTO STRICT	l_def_wg_cnt
	FROM	mam_sys_parm m
	WHERE	0=0
	AND	m.parm_key = 'DEF_WG_CD'
	AND	m.parm_val IS NOT NULL
	AND	m.parm_val != c_null_val
	;

	DELETE FROM	mgt_itm_prov t
	WHERE	0=0
	AND	t.term = i_term::TIMESTAMP(0) WITHOUT TIME ZONE
	AND	t.calc_ctg_cd = i_calc_ctg_cd
	AND	(
		l_def_wg_cnt > 0 AND t.wg_cd = c_null_val
		OR
		l_def_wg_cnt = 0
		AND	EXISTS (
			SELECT	'X'
			FROM	mgw_wg w
			WHERE	0=0
			AND	w.wg_cd = t.wg_cd
			)
	)
	;

	/* 有償支給 */
	INSERT INTO mgt_itm_prov (
		itm_cd,
		itm_sub1,
		itm_sub2,
		itm_sub3,
		prsppl_cd,
		term,
		calc_ctg_cd,
		wg_cd,
		prov_typ,
		base_qty,
		cur_cd,
		upri,
		rmrks,
		sub_char1,
		sub_char2,
		sub_char3,
		non_calc_flg
		)
	SELECT
		x.itm_cd,
		x.itm_sub1,
		x.itm_sub2,
		x.itm_sub3,
		x.prsppl_cd,
		i_term::TIMESTAMP(0) WITHOUT TIME ZONE,
		i_calc_ctg_cd,
		x.wg_cd,
		c_onr_prov,
		COALESCE(m.cost_std_qty, 1),
		i_base_cur_cd,
		mapa_calc$f_rnd((x.amt / x.qty) * COALESCE(m.cost_std_qty, 1), i_upri_dec_place::NUMERIC(2, 0), c_rnd_typ),
		NULL,
		NULL,
		NULL,
		NULL,
		c_off
	FROM	(
		SELECT
			CASE WHEN l_def_wg_cnt = 0 THEN t.wg_cd ELSE c_null_val END AS wg_cd,
			t.itm_cd,t.itm_sub1,
			t.itm_sub2,
			t.itm_sub3,
			t.bp_cd AS prsppl_cd,
			SUM(CASE SIGN(t.qty)
				WHEN -1 THEN -1 * t.amt
				ELSE t.amt
			END) AS amt,	/* 数量が負の場合のみ反転 */
			SUM(CASE SIGN(t.qty)
				WHEN -1 THEN -1 * t.qty
				ELSE t.qty
			END) AS qty	/* 数量が負の場合は反転 */
		FROM
			mgt_act_io_if t,
			mgw_calc_ctg w,
			mgw_wg w2
		WHERE	0=0
		AND	t.calc_ctg_cd = w.calc_ctg_cd
		AND	t.wg_cd = w2.wg_cd
		AND	t.ym BETWEEN i_ym_from::TIMESTAMP(0) WITHOUT TIME ZONE AND i_ym_to::TIMESTAMP(0) WITHOUT TIME ZONE
		AND	t.ac_slip_typ IN (c_slip_onr_prov, c_slip_onr_prvr)
		AND	t.no_itm_info_flg = c_off
		AND	t.amt IS NOT NULL
		AND	t.bp_cd IS NOT NULL
		GROUP BY
			CASE WHEN l_def_wg_cnt = 0 THEN t.wg_cd ELSE c_null_val END,
			t.itm_cd,
			t.itm_sub1,
			t.itm_sub2,
			t.itm_sub3,
			t.bp_cd
		) x,
		mam_itm m
	WHERE	0=0
	AND	x.itm_cd = m.itm_cd
	AND	x.itm_sub1 = m.itm_sub1
	AND	x.itm_sub2 = m.itm_sub2
	AND	x.itm_sub3 = m.itm_sub3
	AND	x.qty <> 0
	;

	/* 自給 */
	INSERT INTO mgt_itm_prov (
		itm_cd,
		itm_sub1,
		itm_sub2,
		itm_sub3,
		prsppl_cd,
		term,
		calc_ctg_cd,
		wg_cd,
		prov_typ,
		base_qty,
		cur_cd,
		upri,
		rmrks,
		sub_char1,
		sub_char2,
		sub_char3,
		non_calc_flg
		)
	SELECT
		x.itm_cd,
		x.itm_sub1,
		x.itm_sub2,
		x.itm_sub3,
		x.prsppl_cd,
		i_term::TIMESTAMP(0) WITHOUT TIME ZONE,
		i_calc_ctg_cd,
		x.wg_cd,
		c_ss,
		COALESCE(m.cost_std_qty, 1),
		i_base_cur_cd,
		mapa_calc$f_rnd((x.amt / x.qty) * COALESCE(m.cost_std_qty, 1), i_upri_dec_place::NUMERIC(2, 0), c_rnd_typ),
		NULL,
		NULL,
		NULL,
		NULL,
		c_off
		FROM
			(
			SELECT
				CASE WHEN l_def_wg_cnt = 0 THEN t1.wg_cd ELSE c_null_val END AS wg_cd,
				t1.itm_cd,
				t1.itm_sub1,
				t1.itm_sub2,
				t1.itm_sub3,
				t2.sppl_cd AS prsppl_cd,
				SUM(CASE SIGN(t1.qty)
					WHEN -1 THEN -1 * t1.amt
					ELSE t1.amt
				END) AS amt,	/* 数量が負の場合のみ反転 */
				SUM(CASE SIGN(t1.qty)
					WHEN -1 THEN -1 * t1.qty
					ELSE t1.qty
				END) AS qty	/* 数量が負の場合は反転 */
			FROM
				mgt_act_inpt_if t1,
				mgt_itm_mfg_inst t2,
				mgw_calc_ctg w,
				mgw_wg w2
			WHERE	0=0
			AND	t1.calc_ctg_cd = w.calc_ctg_cd
			AND	t1.wg_cd = w2.wg_cd
			AND	t1.calc_ctg_cd = t2.calc_ctg_cd
			AND	t1.par_itm_cd = t2.itm_cd
			AND	t1.par_itm_sub1 = t2.itm_sub1
			AND	t1.par_itm_sub2 = t2.itm_sub2
			AND	t1.par_itm_sub3 = t2.itm_sub3
			AND	t1.itm_mfg_inst_no = t2.itm_mfg_inst_no
			AND	t1.mfg_act_no = t2.mfg_act_no
			AND	t1.ym BETWEEN i_ym_from::TIMESTAMP(0) WITHOUT TIME ZONE AND i_ym_to::TIMESTAMP(0) WITHOUT TIME ZONE
			AND	t1.ac_slip_typ IN (c_slip_in_ss)
			AND	t1.no_itm_info_flg = c_off
			AND	t1.amt IS NOT NULL
			AND	t2.sppl_cd IS NOT NULL
			GROUP BY
				CASE WHEN l_def_wg_cnt = 0 THEN t1.wg_cd ELSE c_null_val END,
				t1.itm_cd,
				t1.itm_sub1,
				t1.itm_sub2,
				t1.itm_sub3,
				t2.sppl_cd
			) x,
			mam_itm m
		WHERE	0=0
		AND	x.itm_cd = m.itm_cd
		AND	x.itm_sub1 = m.itm_sub1
		AND	x.itm_sub2 = m.itm_sub2
		AND	x.itm_sub3 = m.itm_sub3
		AND	x.qty <> 0
		AND	NOT EXISTS (
			SELECT	'X'
			FROM	mgt_itm_prov y
			WHERE	0=0
			AND	y.itm_cd = x.itm_cd
			AND	y.itm_sub1 = x.itm_sub1
			AND	y.itm_sub2 = x.itm_sub2
			AND	y.itm_sub3 = x.itm_sub3
			AND	y.prsppl_cd = x.prsppl_cd
			AND	y.term = i_term::TIMESTAMP(0) WITHOUT TIME ZONE
			AND	y.calc_ctg_cd = i_calc_ctg_cd
			AND	y.wg_cd = x.wg_cd
			)
		;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_ACT_COPY_ITM_INFO.P_PROV') ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_act_copy_itm_info$p_sls (
	 IN i_ym_from	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ym_to	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_calc_ctg_cd	VARCHAR,
	 IN i_term	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_base_cur_cd VARCHAR,
	 IN i_upri_dec_place NUMERIC
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	原価品目販売単価情報コピー処理
<REMARKS>

<ARGUMENTS>
<IN>	i_ym_from
		コピー元年月Ｆｒｏｍ
<IN>	i_ym_to
		コピー元年月Ｔｏ
<IN>	i_calc_ctg_cd
		コピー先計算カテゴリＣＤ
<IN>	i_term
		コピー先期
<IN>	i_base_cur_cd
		基準通貨ＣＤ
<IN>	i_upri_dec_place
		単価小数部有効桁数
<HISTORY>
**********************************************************/
DECLARE
	c_off		CONSTANT CHAR(1) := '0' ;
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	c_rnd_typ	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RND_TYP','RNDOFF') ;	/* 四捨五入 */

	l_def_wg_cnt	INTEGER ;
BEGIN

	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_ACT_COPY_ITM_INFO.P_SLS') ;

	SELECT	COUNT(*)
	INTO STRICT	l_def_wg_cnt
	FROM	mam_sys_parm m
	WHERE	0=0
	AND	m.parm_key = 'DEF_WG_CD'
	AND	m.parm_val IS NOT NULL
	AND	m.parm_val != c_null_val
	;

	DELETE FROM	mgt_itm_sls t
	WHERE	0=0
	AND	t.term = i_term::TIMESTAMP(0) WITHOUT TIME ZONE
	AND	t.calc_ctg_cd = i_calc_ctg_cd
	AND	(
		l_def_wg_cnt > 0 AND t.wg_cd = c_null_val
		OR
		l_def_wg_cnt = 0
		AND	EXISTS (
			SELECT	'X'
			FROM	mgw_wg w
			WHERE	0=0
			AND	w.wg_cd = t.wg_cd
			)
	)
	;

	INSERT INTO mgt_itm_sls (
		itm_cd,
		itm_sub1,
		itm_sub2,
		itm_sub3,
		dpt_cd,
		cst_cd,
		dlv_cd,
		dest_cd1,
		dest_cd2,
		dest_cd3,
		term,
		calc_ctg_cd,
		wg_cd,
		base_qty,
		cur_cd,
		upri,
		alc_val1,
		alc_val2,
		alc_val3,
		alc_val4,
		alc_val5,
		rmrks,
		sub_char1,
		sub_char2,
		sub_char3,
		non_calc_flg
		)
	SELECT
		x.itm_cd,
		x.itm_sub1,
		x.itm_sub2,
		x.itm_sub3,
		COALESCE(x.dpt_cd, c_null_val),
		COALESCE(x.cst_cd, c_null_val),
		COALESCE(x.dlv_cd, c_null_val),
		COALESCE(x.dest_cd1, c_null_val),
		COALESCE(x.dest_cd2, c_null_val),
		COALESCE(x.dest_cd3, c_null_val),
		i_term::TIMESTAMP(0) WITHOUT TIME ZONE,
		i_calc_ctg_cd,
		x.wg_cd,
		COALESCE(m.cost_std_qty, 1),
		i_base_cur_cd,
		mapa_calc$f_rnd((x.amt / x.qty) * COALESCE(m.cost_std_qty, 1), i_upri_dec_place::NUMERIC(2, 0), c_rnd_typ),
		NULL,
		NULL,
		NULL,
		NULL,
		NULL,
		NULL,
		NULL,
		NULL,
		NULL,
		c_off
	FROM
		(
		SELECT
			CASE WHEN l_def_wg_cnt = 0 THEN t.wg_cd ELSE c_null_val END AS wg_cd,
			t.itm_cd,
			t.itm_sub1,
			t.itm_sub2,
			t.itm_sub3,
			t.sls_dpt_cd AS dpt_cd,
			t.cst_cd,
			t.dlv_cd,
			t.dest_cd1,
			t.dest_cd2,
			t.dest_cd3,
			SUM(CASE SIGN(t.qty)
				WHEN -1 THEN -1 * t.amt
				ELSE t.amt
			END) AS amt,	/* 数量が負の場合のみ反転 */
			SUM(CASE SIGN(t.qty)
				WHEN -1 THEN -1 * t.qty
				ELSE t.qty
			END) AS qty	/* 数量が負の場合は反転 */
		FROM
			mgt_act_sls_if t,
			mgw_calc_ctg w,
			mgw_wg w2
		WHERE	0=0
		AND	t.calc_ctg_cd = w.calc_ctg_cd
		AND	t.wg_cd = w2.wg_cd
		AND	t.ym BETWEEN i_ym_from::TIMESTAMP(0) WITHOUT TIME ZONE AND i_ym_to::TIMESTAMP(0) WITHOUT TIME ZONE
		AND	t.no_itm_info_flg = c_off
		GROUP BY
			CASE WHEN l_def_wg_cnt = 0 THEN t.wg_cd ELSE c_null_val END,
			t.itm_cd,
			t.itm_sub1,
			t.itm_sub2,
			t.itm_sub3,
			t.sls_dpt_cd,
			t.cst_cd,
			t.dlv_cd,
			t.dest_cd1,
			t.dest_cd2,
			t.dest_cd3
		) x,
		mam_itm m
	WHERE	0=0
	AND	x.itm_cd = m.itm_cd
	AND	x.itm_sub1 = m.itm_sub1
	AND	x.itm_sub2 = m.itm_sub2
	AND	x.itm_sub3 = m.itm_sub3
	AND	x.qty <> 0
	;

	DELETE FROM	mgt_itm_sls t
	WHERE	0=0
	AND	t.term = i_term::TIMESTAMP(0) WITHOUT TIME ZONE
	AND	t.calc_ctg_cd = i_calc_ctg_cd
	AND	(
		l_def_wg_cnt > 0 AND t.wg_cd = c_null_val
		OR
		l_def_wg_cnt = 0
		AND	EXISTS (
			SELECT	'X'
			FROM	mgw_wg w
			WHERE	0=0
			AND	w.wg_cd = t.wg_cd
			)
	)
	AND	t.upri = 0
	;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_ACT_COPY_ITM_INFO.P_SLS') ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_act_copy_itm_info$p_main (
	 IN i_ym_from	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ym_to	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_calc_ctg_cd	VARCHAR,
	 IN i_term	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_itm	CHARACTER,
	 IN i_dtl	CHARACTER,
	 IN i_oper	CHARACTER,
	 IN i_bom	CHARACTER,
	 IN i_wk	CHARACTER,
	 IN i_purc	CHARACTER,
	 IN i_proc	CHARACTER,
	 IN i_prov	CHARACTER,
	 IN i_sls	CHARACTER,
	 IN i_ptn_set_typ	VARCHAR
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	原価実績品目情報コピー処理
<REMARKS>
	事前にmgw_calc_ctg、mgw_wgを作成しておく必要がある
<ARGUMENTS>
<IN>	i_ym_from
		コピー元年月Ｆｒｏｍ
<IN>	i_ym_to
		コピー元年月Ｔｏ
<IN>	i_calc_ctg_cd
		コピー先計算カテゴリＣＤ
<IN>	i_term
		コピー先期
<IN>	i_itm
		原価品目情報ＦＬＧ
<IN>	i_dtl
		原価品目詳細ＦＬＧ
<IN>	i_oper
		原価品目工程ＦＬＧ
<IN>	i_bom
		原価ＢＯＭＦＬＧ
<IN>	i_wk
		原価品目工数ＦＬＧ
<IN>	i_purc
		原価品目購買単価ＦＬＧ
<IN>	i_proc
		原価品目加工単価ＦＬＧ
<IN>	i_prov
		原価品目支給単価ＦＬＧ
<IN>	i_sls
		原価品目販売単価ＦＬＧ
<IN>	i_ptn_set_typ
		構成/工程パタン設定区分
<HISTORY>
**********************************************************/
DECLARE
	c_on		CONSTANT CHAR(1) := '1' ;

	l_base_cur_cd		mam_cur.cur_cd%TYPE ;
	l_upri_dec_place	mam_cur.upri_dec_place%TYPE ;
	l_amt_dec_place		mam_cur.amt_dec_place%TYPE ;
BEGIN
	CALL fcpa_postgres_util$type_is_table_col('mgpa_act_copy_itm_info$ptn_loc', 'VARCHAR', 'VARCHAR') ;

	/* 処理を開始しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_ACT_COPY_ITM_INFO.P_MAIN') ;

	/* 確定チェック */
	CALL mgpa_act_copy_itm_info$p_fix_chk(i_calc_ctg_cd, i_term, i_dtl, i_bom, i_oper, i_wk, i_purc, i_proc, i_prov) ;

	/* 基準通貨情報の取得 */
	CALL mapa_xchng$p_get_base_cur_info(l_base_cur_cd, l_upri_dec_place::NUMERIC(2, 0), l_amt_dec_place::NUMERIC(2, 0)) ;

	/* 各品目情報コピー処理 */
	IF i_itm = c_on THEN
		CALL mgpa_act_copy_itm_info$p_itm(i_ym_from, i_ym_to, i_calc_ctg_cd, i_term) ;
	END IF ;

	IF i_dtl = c_on THEN
		CALL mgpa_act_copy_itm_info$p_dtl(i_ym_from, i_ym_to, i_calc_ctg_cd, i_term, i_ptn_set_typ) ;
	END IF ;

	IF i_oper = c_on THEN
		CALL mgpa_act_copy_itm_info$p_oper(i_ym_from, i_ym_to, i_calc_ctg_cd, i_term, i_ptn_set_typ) ;
	END IF ;

	IF i_bom = c_on THEN
		CALL mgpa_act_copy_itm_info$p_bom(i_ym_from, i_ym_to, i_calc_ctg_cd, i_term, i_ptn_set_typ) ;
	END IF ;

	IF i_wk = c_on THEN
		CALL mgpa_act_copy_itm_info$p_wk(i_ym_from, i_ym_to, i_calc_ctg_cd, i_term, i_ptn_set_typ) ;
	END IF ;

	IF i_purc = c_on THEN
		CALL mgpa_act_copy_itm_info$p_purc(i_ym_from, i_ym_to, i_calc_ctg_cd, i_term, l_base_cur_cd, l_upri_dec_place) ;
	END IF ;

	IF i_proc = c_on THEN
		CALL mgpa_act_copy_itm_info$p_proc(i_ym_from, i_ym_to, i_calc_ctg_cd, i_term, l_base_cur_cd, l_upri_dec_place) ;
	END IF ;

	IF i_prov = c_on THEN
		CALL mgpa_act_copy_itm_info$p_prov(i_ym_from, i_ym_to, i_calc_ctg_cd, i_term, l_base_cur_cd, l_upri_dec_place) ;
	END IF ;

	IF i_sls = c_on THEN
		CALL mgpa_act_copy_itm_info$p_sls(i_ym_from, i_ym_to, i_calc_ctg_cd, i_term, l_base_cur_cd, l_upri_dec_place) ;
	END IF ;

	TRUNCATE TABLE mgpa_act_copy_itm_info$ptn_loc ;

	/* 処理が終了しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_ACT_COPY_ITM_INFO.P_MAIN') ;
END ;
$BODY$
LANGUAGE plpgsql
;

