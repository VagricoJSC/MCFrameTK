\encoding UTF-8

CREATE OR REPLACE PROCEDURE mgpa_imp_bom$p_ex_ph(
	IN i_ph_bom mgw_imp_bom_ex,
	IN i_term TIMESTAMP WITHOUT TIME ZONE,
	IN i_dt TIMESTAMP WITHOUT TIME ZONE,
	IN i_wg_cd VARCHAR,
	INOUT i INTEGER
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	ファントム品の展開処理（正展開）
<REMARKS>
<ARGUMENTS>
<IN>	I_PH_BOM

<IN>	I_TERM
		期
<IN>	I_DT
		対象日
<IN>	I_WG_CD
		ワーキンググループＣＤ
<INOUT>	I
		カウンタ
<HISTORY>
**********************************************************/
DECLARE
	c_off CONSTANT CHAR(1) := '0' ;
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');

	l_tmp_bom mgw_imp_bom_ex;
	x RECORD;
BEGIN
	FOR x IN
		SELECT
			m0.*
		FROM	(
			SELECT
				m1.oper_cd,
				m1.oper_seq,
				m1.chd_itm_cd,
				m1.chd_itm_sub1,
				m1.chd_itm_sub2,
				m1.chd_itm_sub3,
				m1.bom_ptn,
				m1.ph_flg,
				m1.ph_bom_ptn,
				m1.alt_grp_cd,
				m1.alt_itm_ratio,
				m1.par_inst_qty,
				m1.chd_rqmt_qty,
				m1.chd_inpt_qty,
				m1.fxd_chd_rqmt_qty,
				m1.byprod_flg,
				m1.inpt_ctl_typ,
				m1.disp_seq,
				m1.not_cost_flg,
				m1.st_dt,
				m1.end_dt,
				m1.bom_key,
				RANK() OVER (
					PARTITION BY
						m1.par_itm_cd,
						m1.par_itm_sub1,
						m1.par_itm_sub2,
						m1.par_itm_sub3,
						m1.bom_ptn,
						m1.oper_cd,
						m1.oper_seq,
						m1.chd_itm_cd,
						m1.chd_itm_sub1,
						m1.chd_itm_sub2,
						m1.chd_itm_sub3,
						m1.alt_grp_cd,
						m1.wg_cd,
						CASE WHEN i_dt IS NULL THEN NULL ELSE m1.bom_key END
					ORDER BY
						m1.st_dt
				) AS st_dt_rk,
				RANK() OVER (
					PARTITION BY
						m1.par_itm_cd,
						m1.par_itm_sub1,
						m1.par_itm_sub2,
						m1.par_itm_sub3,
						m1.bom_ptn
					ORDER BY
						CASE m1.wg_cd WHEN c_null_val THEN NULL ELSE m1.wg_cd END
				) AS wg_rk
			FROM	mavm_bom m1
				JOIN mam_itm_srch m2 ON
					(0=0
					AND m1.chd_itm_cd = m2.itm_cd
					AND m1.chd_itm_sub1 = m2.itm_sub1
					AND m1.chd_itm_sub2 = m2.itm_sub2
					AND m1.chd_itm_sub3 = m2.itm_sub3
					AND m2.del_flg = c_off
					)
				JOIN mam_term m3 ON (m3.term = i_term)
			WHERE	0=0
			AND m1.not_cost_flg = c_off
			AND m1.wg_cd IN (c_null_val, i_wg_cd)
			AND m1.par_itm_cd = i_ph_bom.itm_cd
			AND m1.par_itm_sub1 = i_ph_bom.itm_sub1
			AND m1.par_itm_sub2 = i_ph_bom.itm_sub2
			AND m1.par_itm_sub3 = i_ph_bom.itm_sub3
			AND m1.bom_ptn = i_ph_bom.bom_ptn
			AND (
				i_dt IS NOT NULL AND m1.st_dt <= i_dt AND m1.end_dt >= i_dt
				OR
				i_dt IS NULL AND m1.st_dt < m3.term_end_ym AND m1.end_dt >= m3.term
				)
			AND (
				i_ph_bom.oper_cd IS NOT NULL AND m1.oper_cd = i_ph_bom.oper_cd AND m1.oper_seq = i_ph_bom.oper_seq
				OR
				i_ph_bom.oper_cd IS NULL
				OR
				m1.oper_cd IS NULL
				)
			) m0
		WHERE	0=0
		AND st_dt_rk = 1
		AND wg_rk = 1
	LOOP

		l_tmp_bom.bom_lvl := i_ph_bom.bom_lvl;
		l_tmp_bom.wg_cd := i_wg_cd;
		l_tmp_bom.itm_cd := x.chd_itm_cd;
		l_tmp_bom.itm_sub1 := x.chd_itm_sub1;
		l_tmp_bom.itm_sub2 := x.chd_itm_sub2;
		l_tmp_bom.itm_sub3 := x.chd_itm_sub3;
		IF x.ph_flg = '1' THEN
			l_tmp_bom.bom_ptn := x.ph_bom_ptn;
		ELSE
			l_tmp_bom.bom_ptn := x.bom_ptn;
		END IF;
		IF i_ph_bom.oper_cd IS NOT NULL THEN
			l_tmp_bom.oper_cd := i_ph_bom.oper_cd;
			l_tmp_bom.oper_seq := i_ph_bom.oper_seq;
		ELSE
			l_tmp_bom.oper_cd := x.oper_cd;
			l_tmp_bom.oper_seq := x.oper_seq;
		END IF;
		l_tmp_bom.ph_flg := x.ph_flg;
		l_tmp_bom.ph_bom_ptn := i_ph_bom.ph_bom_ptn;
		l_tmp_bom.alt_grp_cd := x.alt_grp_cd;
		l_tmp_bom.alt_itm_ratio := x.alt_itm_ratio;
		l_tmp_bom.par_inst_qty := i_ph_bom.par_inst_qty;
		IF x.par_inst_qty = 0 THEN
			l_tmp_bom.chd_rqmt_qty := 0;
			l_tmp_bom.chd_inpt_qty := 0;
			l_tmp_bom.fxd_chd_rqmt_qty := x.fxd_chd_rqmt_qty;
		ELSE
			l_tmp_bom.chd_rqmt_qty := i_ph_bom.chd_rqmt_qty * x.chd_rqmt_qty / x.par_inst_qty;
			l_tmp_bom.chd_inpt_qty := i_ph_bom.chd_inpt_qty * x.chd_inpt_qty / x.par_inst_qty;
			l_tmp_bom.fxd_chd_rqmt_qty := i_ph_bom.fxd_chd_rqmt_qty * x.chd_rqmt_qty / x.par_inst_qty + x.fxd_chd_rqmt_qty; /* MRPにあわせる */
		END IF;
		l_tmp_bom.byprod_flg := x.byprod_flg;
		l_tmp_bom.inpt_ctl_typ := x.inpt_ctl_typ;
		l_tmp_bom.disp_seq := x.disp_seq;
		l_tmp_bom.not_cost_flg := x.not_cost_flg;
		l_tmp_bom.st_dt := x.st_dt;
		l_tmp_bom.end_dt := x.end_dt;
		l_tmp_bom.par_itm_cd := i_ph_bom.par_itm_cd;
		l_tmp_bom.par_itm_sub1 := i_ph_bom.par_itm_sub1;
		l_tmp_bom.par_itm_sub2 := i_ph_bom.par_itm_sub2;
		l_tmp_bom.par_itm_sub3 := i_ph_bom.par_itm_sub3;

		IF x.ph_flg = '1' AND x.ph_bom_ptn IS NOT NULL THEN
			CALL mgpa_imp_bom$p_ex_ph(l_tmp_bom, i_term, i_dt, i_wg_cd, i);
		ELSE
			i := i + 1;

			INSERT INTO mgpa_imp_bom$l_bom (
				bom_lvl,
				wg_cd,
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				bom_ptn,
				oper_cd,
				oper_seq,
				ph_flg,
				ph_bom_ptn,
				alt_grp_cd,
				par_inst_qty,
				chd_rqmt_qty,
				chd_inpt_qty,
				fxd_chd_rqmt_qty,
				byprod_flg,
				alt_itm_ratio,
				inpt_ctl_typ,
				disp_seq,
				not_cost_flg,
				st_dt,
				end_dt,
				par_itm_cd,
				par_itm_sub1,
				par_itm_sub2,
				par_itm_sub3,
				_index_
				)
			VALUES (
				l_tmp_bom.bom_lvl,
				l_tmp_bom.wg_cd,
				l_tmp_bom.itm_cd,
				l_tmp_bom.itm_sub1,
				l_tmp_bom.itm_sub2,
				l_tmp_bom.itm_sub3,
				l_tmp_bom.bom_ptn,
				l_tmp_bom.oper_cd,
				l_tmp_bom.oper_seq,
				l_tmp_bom.ph_flg,
				l_tmp_bom.ph_bom_ptn,
				l_tmp_bom.alt_grp_cd,
				l_tmp_bom.par_inst_qty,
				l_tmp_bom.chd_rqmt_qty,
				l_tmp_bom.chd_inpt_qty,
				l_tmp_bom.fxd_chd_rqmt_qty,
				l_tmp_bom.byprod_flg,
				l_tmp_bom.alt_itm_ratio,
				l_tmp_bom.inpt_ctl_typ,
				l_tmp_bom.disp_seq,
				l_tmp_bom.not_cost_flg,
				l_tmp_bom.st_dt,
				l_tmp_bom.end_dt,
				l_tmp_bom.par_itm_cd,
				l_tmp_bom.par_itm_sub1,
				l_tmp_bom.par_itm_sub2,
				l_tmp_bom.par_itm_sub3,
				i
				);
		END IF;
	END LOOP;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_imp_bom$p_ins_bom_ex(
	IN i_wg_cd VARCHAR,
	IN i_term TIMESTAMP WITHOUT TIME ZONE,
	IN i_dt TIMESTAMP WITHOUT TIME ZONE,
	IN i_imp_ope_typ VARCHAR
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	ＢＯＭ正展開結果を一時表（MGW_IMP_BOM_EX）に格納する
<REMARKS>
<ARGUMENTS>
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_TERM
		期
<IN>	I_DT
		対象日
<IN>	I_IMP_OPE_TYP
		マスタ取込処理区分
<HISTORY>
**********************************************************/
DECLARE
	c_off CONSTANT CHAR(1) := '0' ;
	c_on CONSTANT CHAR(1) := '1' ;

	c_max_cnt CONSTANT INTEGER := 50000; /* バルクインサートでの最大レコード数 */
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');
	c_mng CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASSET_MNG_TYP','MNG');
	c_batch CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_IMP_OPE_TYP','BATCH');
	c_no_mrp_inst CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_INPT_CTL_TYP','NO_MRP_INST');

	i INTEGER;

	l_tmp_bom mgw_imp_bom_ex;
	x RECORD;
BEGIN
	CALL fcpa_postgres_util$type_is_table_row('mgpa_imp_bom$l_bom', 'mgw_imp_bom_ex', 'integer');

	DELETE FROM	mgw_imp_bom_ex;

	/* 展開の起点として子品目が架空品のレコードを取得する */
	IF i_imp_ope_typ = c_batch THEN
		INSERT INTO mgw_imp_bom_ex (
			bom_lvl,
			wg_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			bom_ptn
			)
		SELECT DISTINCT
			0,
			i_wg_cd, /* NULLでなくかつNULL文字でないWG_CDから始める */
			t.chd_itm_cd,
			t.chd_itm_sub1,
			t.chd_itm_sub2,
			t.chd_itm_sub3,
			t.ph_bom_ptn
		FROM (
				SELECT
					m1.chd_itm_cd,
					m1.chd_itm_sub1,
					m1.chd_itm_sub2,
					m1.chd_itm_sub3,
					m1.ph_bom_ptn,
					RANK() OVER (
						PARTITION BY
							m1.par_itm_cd,
							m1.par_itm_sub1,
							m1.par_itm_sub2,
							m1.par_itm_sub3,
							m1.bom_ptn
						ORDER BY
							CASE m1.wg_cd WHEN c_null_val THEN NULL ELSE m1.wg_cd END
					) AS rk
				FROM
					mavm_bom m1,
					mam_itm_srch m2,
					mam_itm_srch m3,
					mam_term m4
				WHERE 0=0
				AND m2.itm_cd = m1.par_itm_cd
				AND m2.itm_sub1 = m1.par_itm_sub1
				AND m2.itm_sub2 = m1.par_itm_sub2
				AND m2.itm_sub3 = m1.par_itm_sub3
				AND m2.del_flg = c_off
				AND m2.asset_mng_typ = c_mng
				AND m3.itm_cd = m1.chd_itm_cd
				AND m3.itm_sub1 = m1.chd_itm_sub1
				AND m3.itm_sub2 = m1.chd_itm_sub2
				AND m3.itm_sub3 = m1.chd_itm_sub3
				AND m3.del_flg = c_off
				AND m4.term = i_term
				AND (
					i_dt IS NOT NULL AND m1.st_dt <= i_dt AND m1.end_dt >= i_dt
					OR
					i_dt IS NULL AND m4.term <= m1.end_dt AND m4.term_end_ym > m1.st_dt
					)
				AND m1.not_cost_flg = c_off
				AND m1.ph_flg = c_on
				AND m1.inpt_ctl_typ <> c_no_mrp_inst
				AND (m1.chd_rqmt_qty > 0 OR m1.chd_inpt_qty > 0 OR m1.fxd_chd_rqmt_qty > 0)
				AND m1.wg_cd = i_wg_cd
			) t
		WHERE t.rk = 1;
	ELSE
		INSERT INTO mgw_imp_bom_ex (
			bom_lvl,
			wg_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			bom_ptn
			)
		SELECT DISTINCT
			0,
			t.wg_cd,
			t.chd_itm_cd,
			t.chd_itm_sub1,
			t.chd_itm_sub2,
			t.chd_itm_sub3,
			t.ph_bom_ptn
		FROM (
				SELECT
					m1.wg_cd,
					m1.chd_itm_cd,
					m1.chd_itm_sub1,
					m1.chd_itm_sub2,
					m1.chd_itm_sub3,
					m1.ph_bom_ptn,
					RANK() OVER (
						PARTITION BY
							m1.par_itm_cd,
							m1.par_itm_sub1,
							m1.par_itm_sub2,
							m1.par_itm_sub3,
							m1.bom_ptn,
							wk.wg_cd
						ORDER BY
							CASE m1.wg_cd WHEN c_null_val THEN NULL ELSE m1.wg_cd END
					) AS rk
				FROM
					mavm_bom m1,
					mam_itm_srch m2,
					mam_itm_srch m3,
					mam_term m4,
					mgw_imp_interactive_key wk
				WHERE 0=0
				AND m2.itm_cd = m1.par_itm_cd
				AND m2.itm_sub1 = m1.par_itm_sub1
				AND m2.itm_sub2 = m1.par_itm_sub2
				AND m2.itm_sub3 = m1.par_itm_sub3
				AND m2.del_flg = c_off
				AND m2.asset_mng_typ = c_mng
				AND m3.itm_cd = m1.chd_itm_cd
				AND m3.itm_sub1 = m1.chd_itm_sub1
				AND m3.itm_sub2 = m1.chd_itm_sub2
				AND m3.itm_sub3 = m1.chd_itm_sub3
				AND m3.del_flg = c_off
				AND m4.term = i_term
				AND (
					i_dt IS NOT NULL AND m1.st_dt <= i_dt AND m1.end_dt >= i_dt
					OR
					i_dt IS NULL AND m4.term <= m1.end_dt AND m4.term_end_ym > m1.st_dt
					)
				AND wk.itm_cd = m1.par_itm_cd
				AND wk.itm_sub1 = m1.par_itm_sub1
				AND wk.itm_sub2 = m1.par_itm_sub2
				AND wk.itm_sub3 = m1.par_itm_sub3
				AND m1.wg_cd IN (c_null_val, wk.wg_cd)
				AND m1.not_cost_flg = c_off
				AND m1.ph_flg = c_on
				AND m1.inpt_ctl_typ <> c_no_mrp_inst
				AND (m1.chd_rqmt_qty > 0 OR m1.chd_inpt_qty > 0 OR m1.fxd_chd_rqmt_qty > 0)
			) t
		WHERE t.rk = 1;
	END IF;

	TRUNCATE TABLE mgpa_imp_bom$l_bom;
	i := 0;

	FOR x IN
		SELECT
			m0.*
		FROM	(
			SELECT
				m1.oper_cd,
				m1.oper_seq,
				m1.chd_itm_cd,
				m1.chd_itm_sub1,
				m1.chd_itm_sub2,
				m1.chd_itm_sub3,
				m1.bom_ptn,
				m1.ph_flg,
				m1.ph_bom_ptn,
				m1.alt_grp_cd,
				m1.alt_itm_ratio,
				m1.par_inst_qty,
				m1.chd_rqmt_qty,
				m1.chd_inpt_qty,
				m1.fxd_chd_rqmt_qty,
				m1.byprod_flg,
				m1.inpt_ctl_typ,
				m1.disp_seq,
				m1.not_cost_flg,
				m1.st_dt,
				m1.end_dt,
				m1.par_itm_cd,
				m1.par_itm_sub1,
				m1.par_itm_sub2,
				m1.par_itm_sub3,
				w.wg_cd,
				RANK() OVER (
					PARTITION BY
						m1.par_itm_cd,
						m1.par_itm_sub1,
						m1.par_itm_sub2,
						m1.par_itm_sub3,
						m1.bom_ptn,
						m1.oper_cd,
						m1.oper_seq,
						m1.chd_itm_cd,
						m1.chd_itm_sub1,
						m1.chd_itm_sub2,
						m1.chd_itm_sub3,
						m1.alt_grp_cd,
						m1.wg_cd,
						CASE WHEN i_dt IS NULL THEN NULL ELSE m1.bom_key END
					ORDER BY
						m1.st_dt
				) AS st_dt_rk,
				RANK() OVER (
					PARTITION BY
						m1.par_itm_cd,
						m1.par_itm_sub1,
						m1.par_itm_sub2,
						m1.par_itm_sub3,
						m1.bom_ptn,
						w.wg_cd
					ORDER BY
						CASE m1.wg_cd WHEN c_null_val THEN NULL ELSE m1.wg_cd END
				) AS wg_rk
			FROM	mgw_imp_bom_ex w
				JOIN mavm_bom m1 ON
					(0=0
					AND m1.wg_cd IN (c_null_val, w.wg_cd)
					AND w.bom_ptn = m1.bom_ptn
					AND w.itm_cd = m1.par_itm_cd
					AND w.itm_sub1 = m1.par_itm_sub1
					AND w.itm_sub2 = m1.par_itm_sub2
					AND w.itm_sub3 = m1.par_itm_sub3
					AND m1.not_cost_flg = c_off
					)
				JOIN mam_itm_srch m2 ON
					(0=0
					AND m1.chd_itm_cd = m2.itm_cd
					AND m1.chd_itm_sub1 = m2.itm_sub1
					AND m1.chd_itm_sub2 = m2.itm_sub2
					AND m1.chd_itm_sub3 = m2.itm_sub3
					AND m2.del_flg = c_off
					)
				JOIN mam_term m3 ON (m3.term = i_term)
			WHERE 0=0
			AND (
				i_dt IS NOT NULL AND m1.st_dt <= i_dt AND m1.end_dt >= i_dt
				OR
				i_dt IS NULL AND m1.st_dt < m3.term_end_ym AND m1.end_dt >= m3.term
				)
			) m0
		WHERE 0=0
		AND st_dt_rk = 1
		AND wg_rk = 1
	LOOP

		l_tmp_bom.bom_lvl := 1;
		l_tmp_bom.wg_cd := x.wg_cd;
		l_tmp_bom.itm_cd := x.chd_itm_cd;
		l_tmp_bom.itm_sub1 := x.chd_itm_sub1;
		l_tmp_bom.itm_sub2 := x.chd_itm_sub2;
		l_tmp_bom.itm_sub3 := x.chd_itm_sub3;
		IF x.ph_flg = '1' THEN
			l_tmp_bom.bom_ptn := x.ph_bom_ptn;
		ELSE
			l_tmp_bom.bom_ptn := x.bom_ptn;
		END IF;
		l_tmp_bom.oper_cd := x.oper_cd;
		l_tmp_bom.oper_seq := x.oper_seq;
		l_tmp_bom.ph_flg := x.ph_flg;
		l_tmp_bom.ph_bom_ptn := x.bom_ptn;
		l_tmp_bom.alt_grp_cd := x.alt_grp_cd;
		l_tmp_bom.alt_itm_ratio := x.alt_itm_ratio;
		l_tmp_bom.par_inst_qty := x.par_inst_qty;
		l_tmp_bom.chd_rqmt_qty := x.chd_rqmt_qty;
		l_tmp_bom.chd_inpt_qty := x.chd_inpt_qty;
		l_tmp_bom.fxd_chd_rqmt_qty := x.fxd_chd_rqmt_qty;
		l_tmp_bom.byprod_flg := x.byprod_flg;
		l_tmp_bom.inpt_ctl_typ := x.inpt_ctl_typ;
		l_tmp_bom.disp_seq := x.disp_seq;
		l_tmp_bom.not_cost_flg := x.not_cost_flg;
		l_tmp_bom.st_dt := x.st_dt;
		l_tmp_bom.end_dt := x.end_dt;
		l_tmp_bom.par_itm_cd := x.par_itm_cd;
		l_tmp_bom.par_itm_sub1 := x.par_itm_sub1;
		l_tmp_bom.par_itm_sub2 := x.par_itm_sub2;
		l_tmp_bom.par_itm_sub3 := x.par_itm_sub3;

		IF x.ph_flg = '1' AND x.ph_bom_ptn IS NOT NULL THEN
			CALL mgpa_imp_bom$p_ex_ph(l_tmp_bom, i_term, i_dt, x.wg_cd, i);
		ELSE
			i := i + 1;

			INSERT INTO mgpa_imp_bom$l_bom (
				bom_lvl,
				wg_cd,
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				bom_ptn,
				oper_cd,
				oper_seq,
				ph_flg,
				ph_bom_ptn,
				alt_grp_cd,
				par_inst_qty,
				chd_rqmt_qty,
				chd_inpt_qty,
				fxd_chd_rqmt_qty,
				byprod_flg,
				alt_itm_ratio,
				inpt_ctl_typ,
				disp_seq,
				not_cost_flg,
				st_dt,
				end_dt,
				par_itm_cd,
				par_itm_sub1,
				par_itm_sub2,
				par_itm_sub3,
				_index_
				)
			VALUES (
				l_tmp_bom.bom_lvl,
				l_tmp_bom.wg_cd,
				l_tmp_bom.itm_cd,
				l_tmp_bom.itm_sub1,
				l_tmp_bom.itm_sub2,
				l_tmp_bom.itm_sub3,
				l_tmp_bom.bom_ptn,
				l_tmp_bom.oper_cd,
				l_tmp_bom.oper_seq,
				l_tmp_bom.ph_flg,
				l_tmp_bom.ph_bom_ptn,
				l_tmp_bom.alt_grp_cd,
				l_tmp_bom.par_inst_qty,
				l_tmp_bom.chd_rqmt_qty,
				l_tmp_bom.chd_inpt_qty,
				l_tmp_bom.fxd_chd_rqmt_qty,
				l_tmp_bom.byprod_flg,
				l_tmp_bom.alt_itm_ratio,
				l_tmp_bom.inpt_ctl_typ,
				l_tmp_bom.disp_seq,
				l_tmp_bom.not_cost_flg,
				l_tmp_bom.st_dt,
				l_tmp_bom.end_dt,
				l_tmp_bom.par_itm_cd,
				l_tmp_bom.par_itm_sub1,
				l_tmp_bom.par_itm_sub2,
				l_tmp_bom.par_itm_sub3,
				i
				);
		END IF;

		IF i > c_max_cnt THEN
			INSERT INTO mgw_imp_bom_ex (
				bom_lvl,
				wg_cd,
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				bom_ptn,
				oper_cd,
				oper_seq,
				ph_flg,
				ph_bom_ptn,
				alt_grp_cd,
				par_inst_qty,
				chd_rqmt_qty,
				chd_inpt_qty,
				fxd_chd_rqmt_qty,
				byprod_flg,
				alt_itm_ratio,
				inpt_ctl_typ,
				disp_seq,
				not_cost_flg,
				st_dt,
				end_dt,
				par_itm_cd,
				par_itm_sub1,
				par_itm_sub2,
				par_itm_sub3
				)
			SELECT
				bom_lvl,
				wg_cd,
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				bom_ptn,
				oper_cd,
				oper_seq,
				ph_flg,
				ph_bom_ptn,
				alt_grp_cd,
				par_inst_qty,
				chd_rqmt_qty,
				chd_inpt_qty,
				fxd_chd_rqmt_qty,
				byprod_flg,
				alt_itm_ratio,
				inpt_ctl_typ,
				disp_seq,
				not_cost_flg,
				st_dt,
				end_dt,
				par_itm_cd,
				par_itm_sub1,
				par_itm_sub2,
				par_itm_sub3
			FROM
				mgpa_imp_bom$l_bom
			ORDER BY _index_ ASC;

			TRUNCATE TABLE mgpa_imp_bom$l_bom;
			i := 0;
		END IF;

	END LOOP;

	INSERT INTO mgw_imp_bom_ex (
		bom_lvl,
		wg_cd,
		itm_cd,
		itm_sub1,
		itm_sub2,
		itm_sub3,
		bom_ptn,
		oper_cd,
		oper_seq,
		ph_flg,
		ph_bom_ptn,
		alt_grp_cd,
		par_inst_qty,
		chd_rqmt_qty,
		chd_inpt_qty,
		fxd_chd_rqmt_qty,
		byprod_flg,
		alt_itm_ratio,
		inpt_ctl_typ,
		disp_seq,
		not_cost_flg,
		st_dt,
		end_dt,
		par_itm_cd,
		par_itm_sub1,
		par_itm_sub2,
		par_itm_sub3
		)
	SELECT
		bom_lvl,
		wg_cd,
		itm_cd,
		itm_sub1,
		itm_sub2,
		itm_sub3,
		bom_ptn,
		oper_cd,
		oper_seq,
		ph_flg,
		ph_bom_ptn,
		alt_grp_cd,
		par_inst_qty,
		chd_rqmt_qty,
		chd_inpt_qty,
		fxd_chd_rqmt_qty,
		byprod_flg,
		alt_itm_ratio,
		inpt_ctl_typ,
		disp_seq,
		not_cost_flg,
		st_dt,
		end_dt,
		par_itm_cd,
		par_itm_sub1,
		par_itm_sub2,
		par_itm_sub3
	FROM
		mgpa_imp_bom$l_bom
	ORDER BY _index_ ASC;

	TRUNCATE TABLE mgpa_imp_bom$l_bom;
	i := 0;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_imp_bom$p_ins_mgw_main(
	IN i_calc_ctg VARCHAR,
	IN i_wg_cd VARCHAR,
	IN i_term TIMESTAMP WITHOUT TIME ZONE,
	IN i_dt TIMESTAMP WITHOUT TIME ZONE,
	IN i_imp_ope_typ VARCHAR
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		ＢＯＭマスタ用のデータをコピー用ワークテーブルに作成する
<REMARKS>
		ワークテーブル作成メイン処理用プロシージャ
<ARGUMENTS>
<IN>	I_CALC_CTG
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_TERM
		期
<IN>	I_DT
		対象日
<IN>	I_IMP_OPE_TYP
		マスタ取込処理区分
<HISTORY>
**********************************************************/
DECLARE
	c_off CONSTANT CHAR(1) := '0' ;
	c_on CONSTANT CHAR(1) := '1' ;

	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');

	c_interactive CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_IMP_OPE_TYP','INTERACTIVE');
	c_batch CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_IMP_OPE_TYP','BATCH');
	c_mng CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASSET_MNG_TYP','MNG');
	c_not_mng CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASSET_MNG_TYP','NOT_MNG');
	c_no_mrp_inst CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_INPT_CTL_TYP','NO_MRP_INST');

	l_calc_ctg_cd mam_calc_ctg.calc_ctg_cd%TYPE;
	l_wg_cd mam_wg.wg_cd%TYPE;
BEGIN
	IF i_imp_ope_typ = c_interactive THEN
		/* デフォルトの計算カテゴリＣＤを使い、ワーキンググループＣＤは無視する */
		l_calc_ctg_cd := mgpa_co_parm$f_get_calc_ctg_cd(NULL);
		l_wg_cd := NULL;
	ELSE
		l_calc_ctg_cd := i_calc_ctg;
		l_wg_cd := i_wg_cd;
	END IF;

	DELETE FROM	mgw_imp_bom w
	WHERE	0=0
	AND w.calc_ctg_cd = l_calc_ctg_cd
	AND w.term = i_term
	AND (l_wg_cd IS NULL OR w.wg_cd = l_wg_cd)
	AND (i_imp_ope_typ = c_batch
			OR EXISTS (
				SELECT	'X'
				FROM	mgw_imp_interactive_key wk
				WHERE	0=0
				AND wk.itm_cd = w.par_itm_cd
				AND wk.itm_sub1 = w.par_itm_sub1
				AND wk.itm_sub2 = w.par_itm_sub2
				AND wk.itm_sub3 = w.par_itm_sub3
				AND wk.wg_cd = w.wg_cd
			)
		);

	/* 架空品を展開した一時表を作成する */
	CALL mgpa_imp_bom$p_ins_bom_ex(l_wg_cd, i_term, i_dt, i_imp_ope_typ);

	/*** ＳＣＭのマスタからコピーする ***/
	INSERT INTO mgw_imp_bom (
		par_itm_cd,
		par_itm_sub1,
		par_itm_sub2,
		par_itm_sub3,
		bom_ptn,
		oper_cd,
		oper_seq,
		chd_itm_cd,
		chd_itm_sub1,
		chd_itm_sub2,
		chd_itm_sub3,
		alt_grp_cd,
		expns_cd,
		term,
		calc_ctg_cd,
		wg_cd,
		disp_seq,
		par_rqmt_qty,
		chd_rqmt_qty,
		chd_base_qty,
		fxd_chd_rqmt_qty,
		chd_min_qty,
		chd_batch_qty,
		alt_itm_ratio,
		rmrks,
		sub_char1,
		sub_char2,
		sub_char3,
		non_calc_flg,
		imp_err_flg,
		imp_flg
		)
	SELECT
		m01.par_itm_cd,
		m01.par_itm_sub1,
		m01.par_itm_sub2,
		m01.par_itm_sub3,
		m01.bom_ptn,
		m01.oper_cd,
		m01.oper_seq,
		m01.chd_itm_cd,
		m01.chd_itm_sub1,
		m01.chd_itm_sub2,
		m01.chd_itm_sub3,
		m01.alt_grp_cd,
		NULL AS expns_cd,
		m01.term,
		l_calc_ctg_cd AS calc_ctg_cd,
		m01.wg_cd,
		m01.disp_seq,
		m01.max_par_inst_qty AS par_rqmt_qty,
		mapa_calc$f_rnd_ne(SUM(m01.chd_rqmt_qty * m01.max_par_inst_qty / m01.par_inst_qty), m01.dec_place, m01.rnd_typ) AS chd_rqmt_qty,
		mapa_calc$f_rnd_ne(SUM(m01.chd_inpt_qty * m01.max_par_inst_qty / m01.par_inst_qty), m01.dec_place, m01.rnd_typ) AS chd_base_qty,
		mapa_calc$f_rnd_ne(SUM(m01.fxd_chd_rqmt_qty), m01.dec_place, m01.rnd_typ) AS fxd_chd_rqmt_qty,
		0 AS chd_min_qty,
		0 AS chd_batch_qty,
		SUM(m01.alt_itm_ratio) AS alt_itm_ratio,
		NULL AS rmrks,
		NULL AS sub_char1,
		NULL AS sub_char2,
		NULL AS sub_char3,
		c_off AS non_calc_flg,
		c_off AS imp_err_flg,
		CASE i_imp_ope_typ
			WHEN c_interactive THEN c_on
			ELSE c_off
		END AS imp_flg
	FROM	(
		SELECT
			m11.par_itm_cd,
			m11.par_itm_sub1,
			m11.par_itm_sub2,
			m11.par_itm_sub3,
			m11.bom_ptn,
			m11.oper_cd,
			m11.oper_seq,
			m11.chd_itm_cd,
			m11.chd_itm_sub1,
			m11.chd_itm_sub2,
			m11.chd_itm_sub3,
			m11.alt_grp_cd,
			m11.term,
			m11.wg_cd,
			m11.dec_place,
			m11.rnd_typ,
			MIN(m11.disp_seq) OVER (
				PARTITION BY
					m11.par_itm_cd,
					m11.par_itm_sub1,
					m11.par_itm_sub2,
					m11.par_itm_sub3,
					m11.bom_ptn,
					m11.oper_cd,
					m11.oper_seq,
					m11.chd_itm_cd,
					m11.chd_itm_sub1,
					m11.chd_itm_sub2,
					m11.chd_itm_sub3,
					m11.alt_grp_cd,
					m11.term,
					m11.wg_cd
			) AS disp_seq,
			m11.par_inst_qty,
			m11.chd_rqmt_qty,
			m11.chd_inpt_qty,
			m11.fxd_chd_rqmt_qty,
			m11.alt_itm_ratio,
			MAX(m11.par_inst_qty) OVER (
				PARTITION BY
					m11.par_itm_cd,
					m11.par_itm_sub1,
					m11.par_itm_sub2,
					m11.par_itm_sub3,
					m11.bom_ptn,
					m11.oper_cd,
					m11.oper_seq,
					m11.chd_itm_cd,
					m11.chd_itm_sub1,
					m11.chd_itm_sub2,
					m11.chd_itm_sub3,
					m11.alt_grp_cd,
					m11.term,
					m11.wg_cd
			) AS max_par_inst_qty
		FROM	(
			/* 通常品(架空品フラグオフ) */
			SELECT
				m21.par_itm_cd,
				m21.par_itm_sub1,
				m21.par_itm_sub2,
				m21.par_itm_sub3,
				m21.bom_ptn,
				m21.oper_cd,
				m21.oper_seq,
				m21.chd_itm_cd,
				m21.chd_itm_sub1,
				m21.chd_itm_sub2,
				m21.chd_itm_sub3,
				m21.alt_grp_cd,
				m21.term,
				m21.wg_cd,
				m21.disp_seq,
				m21.par_inst_qty,
				m21.chd_rqmt_qty * (CASE m21.byprod_flg WHEN c_on THEN -1 ELSE 1 END) AS chd_rqmt_qty,
				m21.chd_inpt_qty * (CASE m21.byprod_flg WHEN c_on THEN -1 ELSE 1 END) AS chd_inpt_qty,
				m21.fxd_chd_rqmt_qty * (CASE m21.byprod_flg WHEN c_on THEN -1 ELSE 1 END) AS fxd_chd_rqmt_qty,
				m21.alt_itm_ratio,
				m21.ph_bom_ptn,
				m21.dec_place,
				m21.rnd_typ
			FROM	(
				SELECT
					m31.par_itm_cd,
					m31.par_itm_sub1,
					m31.par_itm_sub2,
					m31.par_itm_sub3,
					m31.bom_ptn,
					m31.oper_cd,
					m31.oper_seq,
					m31.chd_itm_cd,
					m31.chd_itm_sub1,
					m31.chd_itm_sub2,
					m31.chd_itm_sub3,
					m31.alt_grp_cd,
					m33.term,
					m31.wg_cd,
					m31.disp_seq,
					m31.par_inst_qty,
					m31.chd_rqmt_qty,
					m31.chd_inpt_qty,
					m31.fxd_chd_rqmt_qty,
					m31.alt_itm_ratio,
					m31.ph_bom_ptn,
					m31.byprod_flg,
					m34.dec_place,
					m34.rnd_typ,
					RANK() OVER (
						PARTITION BY
							m31.par_itm_cd,
							m31.par_itm_sub1,
							m31.par_itm_sub2,
							m31.par_itm_sub3,
							m31.bom_ptn,
							m31.oper_cd,
							m31.oper_seq,
							m31.chd_itm_cd,
							m31.chd_itm_sub1,
							m31.chd_itm_sub2,
							m31.chd_itm_sub3,
							m31.alt_grp_cd,
							m31.wg_cd,
							CASE WHEN i_dt IS NULL THEN NULL ELSE m31.bom_key END
						ORDER BY
							m31.st_dt
					) AS st_dt_rk
				FROM
					mavm_bom m31,
					mam_itm_srch m32,
					mam_term m33,
					mam_itm_srch m34
				WHERE	0=0
				AND m31.par_itm_cd = m32.itm_cd
				AND m31.par_itm_sub1 = m32.itm_sub1
				AND m31.par_itm_sub2 = m32.itm_sub2
				AND m31.par_itm_sub3 = m32.itm_sub3
				AND m32.del_flg = c_off
				AND (
					i_dt IS NOT NULL AND m31.st_dt <= i_dt AND m31.end_dt >= i_dt
					OR
					i_dt IS NULL AND m31.st_dt < m33.term_end_ym AND m31.end_dt >= m33.term
					)
				AND m31.del_flg = c_off
				AND m31.ph_flg = c_off
				AND m31.not_cost_flg = c_off
				AND m32.asset_mng_typ = c_mng
				AND m33.term = i_term
				AND m31.chd_itm_cd = m34.itm_cd
				AND m31.chd_itm_sub1 = m34.itm_sub1
				AND m31.chd_itm_sub2 = m34.itm_sub2
				AND m31.chd_itm_sub3 = m34.itm_sub3
				AND m34.del_flg = c_off
				AND (
					m34.asset_mng_typ = c_mng
					OR
					m31.byprod_flg = c_off AND m34.asset_mng_typ = c_not_mng
					)
				AND m31.inpt_ctl_typ <> c_no_mrp_inst
				AND (m31.chd_rqmt_qty > 0 OR m31.chd_inpt_qty > 0 OR m31.fxd_chd_rqmt_qty > 0)
				AND (l_wg_cd IS NULL OR m31.wg_cd = l_wg_cd)
				AND (i_imp_ope_typ = c_batch
						OR EXISTS (
							SELECT	'X'
							FROM	mgw_imp_interactive_key wk
							WHERE	0=0
							AND wk.itm_cd = m31.par_itm_cd
							AND wk.itm_sub1 = m31.par_itm_sub1
							AND wk.itm_sub2 = m31.par_itm_sub2
							AND wk.itm_sub3 = m31.par_itm_sub3
							AND wk.wg_cd = m31.wg_cd
						)
					)
				) m21
			WHERE	0=0
			AND m21.st_dt_rk = 1
			UNION ALL
			/* 架空品(架空品フラグオン) */
			SELECT
				m21.par_itm_cd,
				m21.par_itm_sub1,
				m21.par_itm_sub2,
				m21.par_itm_sub3,
				m21.bom_ptn,
				m21.oper_cd,
				m21.oper_seq,
				m21.itm_cd,
				m21.itm_sub1,
				m21.itm_sub2,
				m21.itm_sub3,
				m21.alt_grp_cd,
				m21.term,
				m21.wg_cd,
				m21.disp_seq,
				m21.par_inst_qty,
				m21.chd_rqmt_qty,
				m21.chd_inpt_qty,
				m21.fxd_chd_rqmt_qty,
				m21.alt_itm_ratio,
				m21.ph_bom_ptn,
				m21.dec_place,
				m21.rnd_typ
			FROM	(
				SELECT
					m31.par_itm_cd,
					m31.par_itm_sub1,
					m31.par_itm_sub2,
					m31.par_itm_sub3,
					m31.bom_ptn,
					CASE WHEN w31.oper_cd IS NULL THEN m31.oper_cd ELSE w31.oper_cd END AS oper_cd,
					CASE WHEN w31.oper_cd IS NULL THEN m31.oper_seq ELSE w31.oper_seq END AS oper_seq,
					w31.itm_cd,
					w31.itm_sub1,
					w31.itm_sub2,
					w31.itm_sub3,
					w31.alt_grp_cd,
					m33.term,
					w31.wg_cd,
					w31.disp_seq,
					m31.par_inst_qty,
					CASE m31.par_inst_qty WHEN 0 THEN 0
						ELSE (m31.chd_rqmt_qty * w31.chd_rqmt_qty / w31.par_inst_qty) * (CASE w31.byprod_flg WHEN c_on THEN -1 ELSE 1 END) END AS chd_rqmt_qty,
					CASE m31.par_inst_qty WHEN 0 THEN 0
						ELSE (m31.chd_inpt_qty * w31.chd_inpt_qty / w31.par_inst_qty) * (CASE w31.byprod_flg WHEN c_on THEN -1 ELSE 1 END) END AS chd_inpt_qty,
					CASE m31.par_inst_qty WHEN 0 THEN 0
						ELSE (m31.fxd_chd_rqmt_qty * w31.chd_rqmt_qty / w31.par_inst_qty + w31.fxd_chd_rqmt_qty) * (CASE w31.byprod_flg WHEN c_on THEN -1 ELSE 1 END) END AS fxd_chd_rqmt_qty, /* MRPにあわせる */
					w31.alt_itm_ratio,
					w31.ph_bom_ptn,
					w31.byprod_flg,
					m34.dec_place,
					m34.rnd_typ,
					RANK() OVER (
						PARTITION BY
							m31.par_itm_cd,
							m31.par_itm_sub1,
							m31.par_itm_sub2,
							m31.par_itm_sub3,
							m31.bom_ptn,
							m31.oper_cd,
							m31.oper_seq,
							m31.chd_itm_cd,
							m31.chd_itm_sub1,
							m31.chd_itm_sub2,
							m31.chd_itm_sub3,
							m31.alt_grp_cd,
							w31.wg_cd,
							CASE WHEN i_dt IS NULL THEN NULL ELSE m31.bom_key END
						ORDER BY
							m31.st_dt
					) AS st_dt_rk,
					RANK() OVER (
						PARTITION BY
							m31.par_itm_cd,
							m31.par_itm_sub1,
							m31.par_itm_sub2,
							m31.par_itm_sub3,
							m31.bom_ptn,
							w31.wg_cd
						ORDER BY
							CASE m31.wg_cd WHEN c_null_val THEN NULL ELSE m31.wg_cd END
					) AS wg_rk
				FROM
					mavm_bom m31,
					mam_itm_srch m32,
					mam_term m33,
					mam_itm_srch m34,
					mgw_imp_bom_ex w31
				WHERE	0=0
				AND m31.par_itm_cd = m32.itm_cd
				AND m31.par_itm_sub1 = m32.itm_sub1
				AND m31.par_itm_sub2 = m32.itm_sub2
				AND m31.par_itm_sub3 = m32.itm_sub3
				AND m32.del_flg = c_off
				AND (
					i_dt IS NOT NULL AND m31.st_dt <= i_dt AND m31.end_dt >= i_dt
					OR
					i_dt IS NULL AND m31.st_dt < m33.term_end_ym AND m31.end_dt >= m33.term
					)
				AND m31.chd_itm_cd = w31.par_itm_cd
				AND m31.chd_itm_sub1 = w31.par_itm_sub1
				AND m31.chd_itm_sub2 = w31.par_itm_sub2
				AND m31.chd_itm_sub3 = w31.par_itm_sub3
				AND m31.ph_bom_ptn = w31.ph_bom_ptn
				AND m31.wg_cd = w31.wg_cd
				AND w31.itm_cd = m34.itm_cd
				AND w31.itm_sub1 = m34.itm_sub1
				AND w31.itm_sub2 = m34.itm_sub2
				AND w31.itm_sub3 = m34.itm_sub3
				AND m34.del_flg = c_off
				AND (m34.asset_mng_typ = c_mng
					OR
					w31.byprod_flg = c_off AND m34.asset_mng_typ = c_not_mng
					)
				AND w31.bom_lvl = 1
				AND m31.del_flg = c_off
				AND m31.ph_flg = c_on
				AND m31.not_cost_flg = c_off
				AND m32.asset_mng_typ = c_mng
				AND m33.term = i_term
				AND (l_wg_cd IS NULL OR m31.wg_cd IN (c_null_val, l_wg_cd))
				AND (
					w31.oper_cd IS NOT NULL AND w31.oper_cd = m31.oper_cd AND w31.oper_seq = m31.oper_seq
					OR
					m31.oper_cd IS NULL
					OR
					w31.oper_cd IS NULL
					)
				AND (i_imp_ope_typ = c_batch
						OR EXISTS (
							SELECT	'X'
							FROM	mgw_imp_interactive_key wk
							WHERE	0=0
							AND wk.itm_cd = m31.par_itm_cd
							AND wk.itm_sub1 = m31.par_itm_sub1
							AND wk.itm_sub2 = m31.par_itm_sub2
							AND wk.itm_sub3 = m31.par_itm_sub3
							AND m31.wg_cd IN (c_null_val, wk.wg_cd)
						)
					)
				) m21
			WHERE	0=0
			AND m21.st_dt_rk = 1
			AND m21.wg_rk = 1
			) m11
		WHERE	0=0
		) m01
	WHERE	0=0
	GROUP BY
		m01.par_itm_cd,
		m01.par_itm_sub1,
		m01.par_itm_sub2,
		m01.par_itm_sub3,
		m01.bom_ptn,
		m01.oper_cd,
		m01.oper_seq,
		m01.chd_itm_cd,
		m01.chd_itm_sub1,
		m01.chd_itm_sub2,
		m01.chd_itm_sub3,
		m01.alt_grp_cd,
		m01.term,
		m01.wg_cd,
		m01.max_par_inst_qty,
		m01.disp_seq,
		m01.dec_place,
		m01.rnd_typ
	ORDER BY
		m01.par_itm_cd,
		m01.par_itm_sub1,
		m01.par_itm_sub2,
		m01.par_itm_sub3,
		m01.bom_ptn,
		m01.oper_cd,
		m01.oper_seq,
		m01.chd_itm_cd,
		m01.chd_itm_sub1,
		m01.chd_itm_sub2,
		m01.chd_itm_sub3,
		m01.alt_grp_cd,
		m01.term,
		m01.wg_cd;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_imp_bom$p_imp_mgt_main(
	IN i_term TIMESTAMP WITHOUT TIME ZONE,
	IN i_imp_ope_typ VARCHAR,
	IN i_usr VARCHAR,
	INOUT o_err_flg CHAR
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		原価マスタ取込(ＢＯＭ)
<REMARKS>
		取込メイン処理用プロシージャ
<ARGUMENTS>
<IN>	I_TERM
		期
<IN>	I_IMP_OPE_TYP
		マスタ取込処理区分
<IN>	I_USR
		ユーザＩＤ
<INOUT>	O_ERR_FLG
		エラーフラグ
<HISTORY>
**********************************************************/
DECLARE
	c_off CONSTANT CHAR(1) := '0' ;
	c_on CONSTANT CHAR(1) := '1' ;

	c_max_cnt CONSTANT INTEGER := 50000; /* バルクインサートでの最大レコード数 */

	c_mng CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASSET_MNG_TYP','MNG');
	c_interactive CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_IMP_OPE_TYP','INTERACTIVE');
	c_batch CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_IMP_OPE_TYP','BATCH');

	l_log_no fct_batch_log_msg.batch_log_no%TYPE;
	l_log_sub_key1 fct_batch_log_msg.log_sub_key1%TYPE;
	l_log_sub_key2 fct_batch_log_msg.log_sub_key2%TYPE;

	i INTEGER := 0;
	k INTEGER := 0;
	d INTEGER := 0;

	l_chk_flg CHAR(1);
	l_parm mam_sys_parm.parm_val%TYPE;
	l_calc_ctg_cd mam_calc_ctg.calc_ctg_cd%TYPE;

	l RECORD;
	x RECORD;
	y RECORD;
	z RECORD;
BEGIN
	CALL fcpa_postgres_util$type_is_table_row('mgpa_imp_bom$p_imp_mgt_main$l_imp', 'mgt_bom', 'integer');
	CALL fcpa_postgres_util$type_is_table_row('mgpa_imp_bom$p_imp_mgt_main$l_imp_tmp', 'mgt_bom', 'integer');
	CALL fcpa_postgres_util$type_is_table_row('mgpa_imp_bom$p_imp_mgt_main$l_del', 'mgt_bom', 'integer');

	/* 確定品目は削除 */
	CALL mgpa_fix_del$p_bom(i_usr, i_term);

	l_parm := mapa_comm$f_get_parm('ITM_SUB_TYP');

	/* 個別取込ならデフォルトの計算カテゴリＣＤを使う */
	/* 通常取込なら無視する */
	IF i_imp_ope_typ = c_interactive THEN
		l_calc_ctg_cd := mgpa_co_parm$f_get_calc_ctg_cd(NULL);
	ELSE
		l_calc_ctg_cd := NULL;
	END IF;

	FOR z IN
		SELECT
			t.*,
			m.asset_mng_typ AS asset_mng_typ
		FROM	(
			SELECT DISTINCT
				w.par_itm_cd,
				w.par_itm_sub1,
				w.par_itm_sub2,
				w.par_itm_sub3
			FROM	mgw_imp_bom w
			WHERE	0=0
			AND w.imp_flg = c_on
			AND w.upd_usr_id = i_usr
			AND w.term = i_term
			AND (l_calc_ctg_cd IS NULL OR w.calc_ctg_cd = l_calc_ctg_cd)
			AND (i_imp_ope_typ = c_batch
						AND w.upd_srv_req_no = fcpa_context$f_get_processid()
					OR EXISTS (
						SELECT	'X'
						FROM	mgw_imp_interactive_key wk
						WHERE	0=0
						AND wk.itm_cd = w.par_itm_cd
						AND wk.itm_sub1 = w.par_itm_sub1
						AND wk.itm_sub2 = w.par_itm_sub2
						AND wk.itm_sub3 = w.par_itm_sub3
						AND wk.wg_cd = w.wg_cd
					)
				)
			) t
			LEFT OUTER JOIN mam_itm_srch m
				ON (t.par_itm_cd = m.itm_cd
					AND t.par_itm_sub1 = m.itm_sub1
					AND t.par_itm_sub2 = m.itm_sub2
					AND t.par_itm_sub3 = m.itm_sub3
					AND m.del_flg = c_off)
		WHERE	0=0
	LOOP
		/*** 品目チェック処理、エラーとなった品目と同じ品目のワークのデータは全件をエラーとして、取り込まない ***/
		IF z.asset_mng_typ IS NULL OR z.asset_mng_typ <> c_mng THEN
			IF z.asset_mng_typ IS NULL THEN
				/* 品目マスタに有効な品目として登録されていません。親品目：{1} */
				CALL fcpa_batch_log$p_data_log('MGBDD0045', l_log_no, l_log_sub_key1, l_log_sub_key2,
					mapa_comm$f_to_disp_itm(z.par_itm_cd, z.par_itm_sub1, z.par_itm_sub2, z.par_itm_sub3, l_parm));
			ELSIF z.asset_mng_typ <> c_mng THEN
				/* 品目マスタに資産管理可能な品目として登録されていません。親品目の対象にはなりません。親品目：{1} */
				CALL fcpa_batch_log$p_data_log('MGBDD0044', l_log_no, l_log_sub_key1, l_log_sub_key2,
					mapa_comm$f_to_disp_itm(z.par_itm_cd, z.par_itm_sub1, z.par_itm_sub2, z.par_itm_sub3, l_parm));
			END IF;

			UPDATE mgw_imp_bom w
			SET imp_err_flg = c_on
			WHERE	0=0
			AND w.par_itm_cd = z.par_itm_cd
			AND w.par_itm_sub1 = z.par_itm_sub1
			AND w.par_itm_sub2 = z.par_itm_sub2
			AND w.par_itm_sub3 = z.par_itm_sub3
			AND w.imp_flg = c_on
			AND w.upd_usr_id = i_usr
			AND w.term = i_term;

			o_err_flg := c_on;

		END IF;
	END LOOP;

	FOR x IN
		SELECT DISTINCT
			w.par_itm_cd,
			w.par_itm_sub1,
			w.par_itm_sub2,
			w.par_itm_sub3,
			w.wg_cd,
			w.term,
			w.calc_ctg_cd
		FROM	mgw_imp_bom w
		WHERE	0=0
		AND w.imp_flg = c_on
		AND w.imp_err_flg = c_off
		AND w.upd_usr_id = i_usr
		AND w.term = i_term
		AND (l_calc_ctg_cd IS NULL OR w.calc_ctg_cd = l_calc_ctg_cd)
		AND (i_imp_ope_typ = c_batch
					AND w.upd_srv_req_no = fcpa_context$f_get_processid()
				OR EXISTS (
					SELECT	'X'
					FROM	mgw_imp_interactive_key wk
					WHERE	0=0
					AND wk.itm_cd = w.par_itm_cd
					AND wk.itm_sub1 = w.par_itm_sub1
					AND wk.itm_sub2 = w.par_itm_sub2
					AND wk.itm_sub3 = w.par_itm_sub3
					AND wk.wg_cd = w.wg_cd
				)
			)
	LOOP
		<<NEXT_LOOP>>
		BEGIN
			k := 0;
			FOR y IN
				SELECT
					w.par_itm_cd,
					w.par_itm_sub1,
					w.par_itm_sub2,
					w.par_itm_sub3,
					w.bom_ptn,
					w.oper_cd,
					w.oper_seq,
					w.chd_itm_cd,
					w.chd_itm_sub1,
					w.chd_itm_sub2,
					w.chd_itm_sub3,
					w.alt_grp_cd,
					w.expns_cd,
					w.term,
					w.calc_ctg_cd,
					w.wg_cd,
					w.disp_seq,
					w.par_rqmt_qty,
					w.chd_rqmt_qty,
					w.chd_base_qty,
					w.fxd_chd_rqmt_qty,
					w.chd_min_qty,
					w.chd_batch_qty,
					CASE
						WHEN w.alt_grp_cd IS NULL THEN NULL
						ELSE w.alt_itm_ratio
					END AS alt_itm_ratio,
					w.rmrks,
					w.sub_char1,
					w.sub_char2,
					w.sub_char3,
					w.non_calc_flg,
					m1.itm_cd AS mam_chd_itm_cd
				FROM	mgw_imp_bom w
					LEFT OUTER JOIN mam_itm_srch m1
						ON (w.chd_itm_cd = m1.itm_cd
							AND w.chd_itm_sub1 = m1.itm_sub1
							AND w.chd_itm_sub2 = m1.itm_sub2
							AND w.chd_itm_sub3 = m1.itm_sub3
							AND m1.del_flg = c_off)
				WHERE	0=0
				AND w.par_itm_cd = x.par_itm_cd
				AND w.par_itm_sub1 = x.par_itm_sub1
				AND w.par_itm_sub2 = x.par_itm_sub2
				AND w.par_itm_sub3 = x.par_itm_sub3
				AND w.wg_cd = x.wg_cd
				AND w.term = x.term
				AND w.calc_ctg_cd = x.calc_ctg_cd
				AND w.upd_usr_id = i_usr
				AND w.imp_flg = c_on
			LOOP
				l_chk_flg := c_off;

				IF x.par_itm_cd = y.chd_itm_cd
					AND x.par_itm_sub1 = y.chd_itm_sub1
					AND x.par_itm_sub2 = y.chd_itm_sub2
					AND x.par_itm_sub3 = y.chd_itm_sub3 THEN
					/* 親品目と子品目は異なる品目を指定してください。品目：{1} */
					CALL fcpa_batch_log$p_data_log('MGBDD0033', l_log_no, l_log_sub_key1, l_log_sub_key2,
						mapa_comm$f_to_disp_itm(x.par_itm_cd, x.par_itm_sub1, x.par_itm_sub2, x.par_itm_sub3, l_parm));
					l_chk_flg := c_on;
				END IF;

				IF y.alt_grp_cd IS NOT NULL AND y.alt_itm_ratio IS NULL THEN
					/* 代替Ｇを設定する場合は、代替品目比率を設定してください。 */
					/* 親品目：{1} 構成パタン：{2} 期：{3} 計算カテゴリ：{4} 代替Ｇ：{5} */
					CALL fcpa_batch_log$p_data_log('MGBDD0034', l_log_no, l_log_sub_key1, l_log_sub_key2,
						mapa_comm$f_to_disp_itm(x.par_itm_cd, x.par_itm_sub1, x.par_itm_sub2, x.par_itm_sub3, l_parm),
						y.bom_ptn,
						fcpa_date_util$f_to_char(x.term, fcpa_date_util$y4m()),
						y.calc_ctg_cd,
						y.alt_grp_cd);
					l_chk_flg := c_on;
				END IF;

				IF y.par_rqmt_qty <= 0 THEN
					/* 親必要数には正の数字を設定してください。 */
					/* 親品目：{1} 構成パタン：{2} 期：{3} 計算カテゴリ：{4} 子品目：{5} 親必要数：{6} */
					CALL fcpa_batch_log$p_data_log('MGBDD0039', l_log_no, l_log_sub_key1, l_log_sub_key2,
						mapa_comm$f_to_disp_itm(x.par_itm_cd, x.par_itm_sub1, x.par_itm_sub2, x.par_itm_sub3, l_parm),
						y.bom_ptn,
						fcpa_date_util$f_to_char(x.term, fcpa_date_util$y4m()),
						y.calc_ctg_cd,
						mapa_comm$f_to_disp_itm(y.chd_itm_cd, y.chd_itm_sub1, y.chd_itm_sub2, y.chd_itm_sub3, l_parm),
						y.par_rqmt_qty::VARCHAR);
					l_chk_flg := c_on;
				END IF;

				IF y.mam_chd_itm_cd IS NULL THEN
					/* 品目マスタに有効な品目として登録されていません。子品目：{1} */
					CALL fcpa_batch_log$p_data_log('MGBDD0046', l_log_no, l_log_sub_key1, l_log_sub_key2,
						mapa_comm$f_to_disp_itm(y.chd_itm_cd, y.chd_itm_sub1, y.chd_itm_sub2, y.chd_itm_sub3, l_parm));
					l_chk_flg := c_on;
				END IF;

				IF l_chk_flg = c_on THEN
					UPDATE mgw_imp_bom w
					SET imp_err_flg = c_on
					WHERE	0=0
					AND w.par_itm_cd = x.par_itm_cd
					AND w.par_itm_sub1 = x.par_itm_sub1
					AND w.par_itm_sub2 = x.par_itm_sub2
					AND w.par_itm_sub3 = x.par_itm_sub3
					AND w.wg_cd = x.wg_cd
					AND w.term = x.term
					AND w.calc_ctg_cd = x.calc_ctg_cd
					AND w.upd_usr_id = i_usr;

					o_err_flg := c_on;

					EXIT NEXT_LOOP;
				END IF;

				k := k + 1;

				INSERT INTO mgpa_imp_bom$p_imp_mgt_main$l_imp_tmp (
					par_itm_cd,
					par_itm_sub1,
					par_itm_sub2,
					par_itm_sub3,
					bom_ptn,
					oper_cd,
					oper_seq,
					chd_itm_cd,
					chd_itm_sub1,
					chd_itm_sub2,
					chd_itm_sub3,
					alt_grp_cd,
					expns_cd,
					term,
					calc_ctg_cd,
					wg_cd,
					disp_seq,
					par_rqmt_qty,
					chd_rqmt_qty,
					chd_base_qty,
					fxd_chd_rqmt_qty,
					chd_min_qty,
					chd_batch_qty,
					alt_itm_ratio,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					non_calc_flg,
					_index_
					)
				VALUES (
					y.par_itm_cd,
					y.par_itm_sub1,
					y.par_itm_sub2,
					y.par_itm_sub3,
					y.bom_ptn,
					y.oper_cd,
					y.oper_seq,
					y.chd_itm_cd,
					y.chd_itm_sub1,
					y.chd_itm_sub2,
					y.chd_itm_sub3,
					y.alt_grp_cd,
					y.expns_cd,
					y.term,
					y.calc_ctg_cd,
					y.wg_cd,
					y.disp_seq,
					y.par_rqmt_qty,
					y.chd_rqmt_qty,
					y.chd_base_qty,
					y.fxd_chd_rqmt_qty,
					y.chd_min_qty,
					y.chd_batch_qty,
					y.alt_itm_ratio,
					y.rmrks,
					y.sub_char1,
					y.sub_char2,
					y.sub_char3,
					y.non_calc_flg,
					k
					);
			END LOOP;

			d := d + 1;
			INSERT INTO mgpa_imp_bom$p_imp_mgt_main$l_del (
				par_itm_cd,
				par_itm_sub1,
				par_itm_sub2,
				par_itm_sub3,
				term,
				calc_ctg_cd,
				wg_cd,
				_index_
				)
			VALUES (
				x.par_itm_cd,
				x.par_itm_sub1,
				x.par_itm_sub2,
				x.par_itm_sub3,
				x.term,
				x.calc_ctg_cd,
				x.wg_cd,
				d
				);

			FOR l IN
				SELECT * FROM mgpa_imp_bom$p_imp_mgt_main$l_imp_tmp ORDER BY _index_ ASC
			LOOP
				i := i + 1;
				INSERT INTO mgpa_imp_bom$p_imp_mgt_main$l_imp (
					par_itm_cd,
					par_itm_sub1,
					par_itm_sub2,
					par_itm_sub3,
					bom_ptn,
					oper_cd,
					oper_seq,
					chd_itm_cd,
					chd_itm_sub1,
					chd_itm_sub2,
					chd_itm_sub3,
					alt_grp_cd,
					expns_cd,
					term,
					calc_ctg_cd,
					wg_cd,
					disp_seq,
					par_rqmt_qty,
					chd_rqmt_qty,
					chd_base_qty,
					fxd_chd_rqmt_qty,
					chd_min_qty,
					chd_batch_qty,
					alt_itm_ratio,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					non_calc_flg,
					_index_
					)
				VALUES (
					l.par_itm_cd,
					l.par_itm_sub1,
					l.par_itm_sub2,
					l.par_itm_sub3,
					l.bom_ptn,
					l.oper_cd,
					l.oper_seq,
					l.chd_itm_cd,
					l.chd_itm_sub1,
					l.chd_itm_sub2,
					l.chd_itm_sub3,
					l.alt_grp_cd,
					l.expns_cd,
					l.term,
					l.calc_ctg_cd,
					l.wg_cd,
					l.disp_seq,
					l.par_rqmt_qty,
					l.chd_rqmt_qty,
					l.chd_base_qty,
					l.fxd_chd_rqmt_qty,
					l.chd_min_qty,
					l.chd_batch_qty,
					l.alt_itm_ratio,
					l.rmrks,
					l.sub_char1,
					l.sub_char2,
					l.sub_char3,
					l.non_calc_flg,
					i
					);
			END LOOP;

			IF i > c_max_cnt THEN
				DELETE FROM	mgt_bom m
				USING	mgpa_imp_bom$p_imp_mgt_main$l_del j
				WHERE	0=0
				AND	m.par_itm_cd = j.par_itm_cd
				AND	m.par_itm_sub1 = j.par_itm_sub1
				AND	m.par_itm_sub2 = j.par_itm_sub2
				AND	m.par_itm_sub3 = j.par_itm_sub3
				AND	m.term = j.term
				AND	m.calc_ctg_cd = j.calc_ctg_cd
				AND	m.wg_cd = j.wg_cd;

				TRUNCATE TABLE mgpa_imp_bom$p_imp_mgt_main$l_del;
				d := 0;

				INSERT INTO mgt_bom (
					par_itm_cd,
					par_itm_sub1,
					par_itm_sub2,
					par_itm_sub3,
					bom_ptn,
					oper_cd,
					oper_seq,
					chd_itm_cd,
					chd_itm_sub1,
					chd_itm_sub2,
					chd_itm_sub3,
					alt_grp_cd,
					expns_cd,
					term,
					calc_ctg_cd,
					wg_cd,
					disp_seq,
					par_rqmt_qty,
					chd_rqmt_qty,
					chd_base_qty,
					fxd_chd_rqmt_qty,
					chd_min_qty,
					chd_batch_qty,
					alt_itm_ratio,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					non_calc_flg
					)
				SELECT
					par_itm_cd,
					par_itm_sub1,
					par_itm_sub2,
					par_itm_sub3,
					bom_ptn,
					oper_cd,
					oper_seq,
					chd_itm_cd,
					chd_itm_sub1,
					chd_itm_sub2,
					chd_itm_sub3,
					alt_grp_cd,
					expns_cd,
					term,
					calc_ctg_cd,
					wg_cd,
					disp_seq,
					par_rqmt_qty,
					chd_rqmt_qty,
					chd_base_qty,
					fxd_chd_rqmt_qty,
					chd_min_qty,
					chd_batch_qty,
					alt_itm_ratio,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					non_calc_flg
				FROM
					mgpa_imp_bom$p_imp_mgt_main$l_imp;

				TRUNCATE TABLE mgpa_imp_bom$p_imp_mgt_main$l_imp;
				i := 0;
			END IF;
		END;

		TRUNCATE TABLE mgpa_imp_bom$p_imp_mgt_main$l_imp_tmp;
	END LOOP;

	IF i > 0 THEN
		DELETE FROM	mgt_bom m
		USING	mgpa_imp_bom$p_imp_mgt_main$l_del j
		WHERE	0=0
		AND	m.par_itm_cd = j.par_itm_cd
		AND	m.par_itm_sub1 = j.par_itm_sub1
		AND	m.par_itm_sub2 = j.par_itm_sub2
		AND	m.par_itm_sub3 = j.par_itm_sub3
		AND	m.term = j.term
		AND	m.calc_ctg_cd = j.calc_ctg_cd
		AND	m.wg_cd = j.wg_cd;

		TRUNCATE TABLE mgpa_imp_bom$p_imp_mgt_main$l_del;
		d := 0;

		INSERT INTO mgt_bom (
			par_itm_cd,
			par_itm_sub1,
			par_itm_sub2,
			par_itm_sub3,
			bom_ptn,
			oper_cd,
			oper_seq,
			chd_itm_cd,
			chd_itm_sub1,
			chd_itm_sub2,
			chd_itm_sub3,
			alt_grp_cd,
			expns_cd,
			term,
			calc_ctg_cd,
			wg_cd,
			disp_seq,
			par_rqmt_qty,
			chd_rqmt_qty,
			chd_base_qty,
			fxd_chd_rqmt_qty,
			chd_min_qty,
			chd_batch_qty,
			alt_itm_ratio,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3,
			non_calc_flg
			)
		SELECT
			par_itm_cd,
			par_itm_sub1,
			par_itm_sub2,
			par_itm_sub3,
			bom_ptn,
			oper_cd,
			oper_seq,
			chd_itm_cd,
			chd_itm_sub1,
			chd_itm_sub2,
			chd_itm_sub3,
			alt_grp_cd,
			expns_cd,
			term,
			calc_ctg_cd,
			wg_cd,
			disp_seq,
			par_rqmt_qty,
			chd_rqmt_qty,
			chd_base_qty,
			fxd_chd_rqmt_qty,
			chd_min_qty,
			chd_batch_qty,
			alt_itm_ratio,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3,
			non_calc_flg
		FROM
			mgpa_imp_bom$p_imp_mgt_main$l_imp;

		TRUNCATE TABLE mgpa_imp_bom$p_imp_mgt_main$l_imp;
	END IF;

	TRUNCATE TABLE mgpa_imp_bom$p_imp_mgt_main$l_imp_tmp;
	TRUNCATE TABLE mgpa_imp_bom$p_imp_mgt_main$l_imp;
	TRUNCATE TABLE mgpa_imp_bom$p_imp_mgt_main$l_del;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_imp_bom$p_ins_mgw(
	IN i_calc_ctg VARCHAR,
	IN i_wg_cd VARCHAR,
	IN i_term TIMESTAMP WITHOUT TIME ZONE,
	IN i_dt TIMESTAMP WITHOUT TIME ZONE,
	IN i_imp_ope_typ VARCHAR DEFAULT '2'
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		ＢＯＭマスタ用のデータをコピー用ワークテーブルに作成する
<REMARKS>
		メイン処理を起動するプロシージャ
<ARGUMENTS>
<IN>	I_CALC_CTG
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_TERM
		期
<IN>	I_DT
		対象日
<IN>	I_IMP_OPE_TYP
		マスタ取込処理区分
<HISTORY>
**********************************************************/
DECLARE
	l_calc_ctg mam_calc_ctg.calc_ctg_cd%TYPE;
BEGIN
	/* 処理を開始しました。 */
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_IMP_BOM.P_INS_MGW');

	l_calc_ctg := mgpa_co_parm$f_get_calc_ctg_cd(i_calc_ctg);

	/* メイン処理の起動 */
	CALL mgpa_imp_bom$p_ins_mgw_main(l_calc_ctg, i_wg_cd, i_term, i_dt, i_imp_ope_typ);

	/* 処理が終了しました。 */
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_IMP_BOM.P_INS_MGW');
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_imp_bom$p_imp_mgt(
	IN i_term TIMESTAMP WITHOUT TIME ZONE,
	IN i_imp_ope_typ VARCHAR DEFAULT '2'
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		原価マスタ取込(ＢＯＭ)
<REMARKS>
		メイン処理を起動するプロシージャ
<ARGUMENTS>
<IN>	I_TERM
		期
<IN>	I_IMP_OPE_TYP
		マスタ取込処理区分
<HISTORY>
**********************************************************/
DECLARE
	c_off CONSTANT CHAR(1) := '0' ;
	c_on CONSTANT CHAR(1) := '1' ;

	c_batch CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_IMP_OPE_TYP','BATCH');

	l_err_flg CHAR(1);
	l_usr fcm_user.user_id%TYPE;

	l_log_no fct_batch_log_msg.batch_log_no%TYPE;
	l_log_sub_key1 fct_batch_log_msg.log_sub_key1%TYPE;
	l_log_sub_key2 fct_batch_log_msg.log_sub_key2%TYPE;
BEGIN
	/* 処理を開始しました。 */
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_IMP_BOM.P_IMP_MGT');

	l_usr := fcpa_context$f_get_userid();

	l_err_flg := c_off;

	/* メイン処理の起動 */
	CALL mgpa_imp_bom$p_imp_mgt_main(i_term, i_imp_ope_typ, l_usr, l_err_flg);

	/* エラーデータ以外は削除 */
	DELETE FROM	mgw_imp_bom w
	WHERE	0=0
	AND w.imp_flg = c_on
	AND w.imp_err_flg = c_off
	AND w.upd_usr_id = l_usr
	AND w.term = i_term
	AND (i_imp_ope_typ = c_batch
			AND w.upd_srv_req_no = fcpa_context$f_get_processid()
		OR EXISTS (
			SELECT	'X'
			FROM	mgw_imp_interactive_key wk
			WHERE	0=0
			AND wk.itm_cd = w.par_itm_cd
			AND wk.itm_sub1 = w.par_itm_sub1
			AND wk.itm_sub2 = w.par_itm_sub2
			AND wk.itm_sub3 = w.par_itm_sub3
			AND wk.wg_cd = w.wg_cd
			)
		);

	IF l_err_flg = c_on THEN
		UPDATE mgw_imp_bom w
		SET imp_flg = c_off
		WHERE	0=0
		AND w.imp_flg = c_on
		AND w.imp_err_flg = c_on
		AND w.upd_usr_id = l_usr
		AND w.term = i_term
		AND (i_imp_ope_typ = c_batch
				AND w.upd_srv_req_no = fcpa_context$f_get_processid()
			OR EXISTS (
				SELECT	'X'
				FROM	mgw_imp_interactive_key wk
				WHERE	0=0
				AND wk.itm_cd = w.par_itm_cd
				AND wk.itm_sub1 = w.par_itm_sub1
				AND wk.itm_sub2 = w.par_itm_sub2
				AND wk.itm_sub3 = w.par_itm_sub3
				AND wk.wg_cd = w.wg_cd
				)
			);

		COMMIT;
		CALL fcpa_err$raise_app_err('MGBDD0057');
	END IF;

	/* 処理が終了しました。 */
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_IMP_BOM.P_IMP_MGT');
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_imp_bom$p_set_key(
	IN i_term TIMESTAMP WITHOUT TIME ZONE,
	IN i_dt TIMESTAMP WITHOUT TIME ZONE
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		取り込み処理を実行するためのワークテーブルを作成する
<REMARKS>
		MAW_IMP_ITMをもとにMGW_IMP_INTERACTIVE_KEYを作成する
<ARGUMENTS>
<IN>	I_TERM
		期
<IN>	I_DT
		対象日
<HISTORY>
**********************************************************/
DECLARE
	c_off CONSTANT CHAR(1) := '0';

	l_term_end_ym mam_term.term%TYPE;
BEGIN
	SELECT	MAX(m.term_end_ym)
	INTO	STRICT l_term_end_ym
	FROM	mam_term m
	WHERE	0=0
	AND m.term = i_term;

	DELETE FROM	mgw_imp_interactive_key;
	INSERT INTO mgw_imp_interactive_key (
		itm_cd,
		itm_sub1,
		itm_sub2,
		itm_sub3,
		wg_cd
		)
	SELECT DISTINCT
		x.par_itm_cd,
		x.par_itm_sub1,
		x.par_itm_sub2,
		x.par_itm_sub3,
		x.wg_cd
	FROM	maw_imp_itm w, mam_bom x
	WHERE	0=0
	AND w.itm_cd = x.par_itm_cd
	AND w.itm_sub1 = x.par_itm_sub1
	AND w.itm_sub2 = x.par_itm_sub2
	AND w.itm_sub3 = x.par_itm_sub3
	AND (
		i_dt IS NOT NULL AND x.st_dt <= i_dt AND x.end_dt >= i_dt
		OR
		i_dt IS NULL AND x.st_dt < l_term_end_ym AND x.end_dt >= i_term
		)
	AND x.del_flg = c_off
	AND x.not_cost_flg = c_off;
END;
$BODY$
LANGUAGE plpgsql
;

