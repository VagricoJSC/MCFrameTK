\encoding UTF-8

CREATE OR REPLACE PROCEDURE mapa_bom$p_ex_ph(
	 IN i_ph_bom maw_bom_ex,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_bom_ptn VARCHAR,
	 IN i_bom_ptn_flg CHARACTER,
	 IN i_wg_cd VARCHAR,
	 IN i_sno1 VARCHAR,
	 IN i_sno2 VARCHAR,
	 IN i_sno3 VARCHAR,
	 IN i_sno4 VARCHAR,
	 INOUT io_seq INTEGER,
	 INOUT g_bom maw_bom_ex[],
	 IN i_mfg_flg CHARACTER,
	 IN i_base_unit_qty NUMERIC,
	 IN i_all_sno_flg CHARACTER
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	ファントム品の展開処理（正展開）
<REMARKS>
<ARGUMENTS>
<HISTORY>
**********************************************************/
DECLARE
	c_max_itm	CONSTANT INTEGER := 6 ;
	c_max_itm_num	CONSTANT INTEGER := 999999 ; --c_max_itmの桁に対する最大数
	c_sort_digit	CONSTANT INTEGER := 3000 ;
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;

	l_tmp_bom maw_bom_ex;
	l_wg_bom_cnt INTEGER;
	x RECORD;
BEGIN
	IF i_wg_cd IS NULL THEN
		l_wg_bom_cnt := 0;
	ELSE
		SELECT	COUNT(*)
		INTO	STRICT l_wg_bom_cnt
		FROM	mavm_bom_dply m
		WHERE	0=0
		AND m.wg_cd = i_wg_cd
		AND m.par_itm_cd = i_ph_bom.itm_cd
		AND m.par_itm_sub1 = i_ph_bom.itm_sub1
		AND m.par_itm_sub2 = i_ph_bom.itm_sub2
		AND m.par_itm_sub3 = i_ph_bom.itm_sub3
		AND m.bom_ptn = i_ph_bom.bom_ptn
		;
	END IF;

	FOR x IN
		SELECT DISTINCT
			m1.oper_cd,
			m1.oper_seq,
			m1.chd_itm_cd,
			m1.chd_itm_sub1,
			m1.chd_itm_sub2,
			m1.chd_itm_sub3,
			m2.bom_ptn,
			m1.ver_no,
			m1.ph_flg,
			m1.ph_bom_ptn,
			m1.alt_itm_flg,
			m1.alt_grp_cd,
			m1.alt_itm_typ,
			m1.alt_itm_ratio,
			m1.alt_alloc_prio,
			m1.sno_typ1,
			m1.sno_typ2,
			m1.sno_typ3,
			m1.sno_typ4,
			m1.min_sno1,
			m1.max_sno1,
			m1.min_sno2,
			m1.max_sno2,
			m1.min_sno3,
			m1.max_sno3,
			m1.min_sno4,
			m1.max_sno4,
			m1.par_inst_qty,
			m1.chd_rqmt_qty,
			m1.chd_inpt_qty,
			m1.fxd_chd_rqmt_qty,
			m1.byprod_flg,
			m1.in_offst_typ,
			m1.in_offst,
			m1.bkf_typ,
			m1.inst_lot_fix_flg,
			m1.lot_mix_flg,
			m1.sublot_mix_flg,
			m1.alloc_ctl_typ,
			m1.main_itm_flg,
			m1.inpt_ctl_typ,
			m1.yield_calc_flg,
			m1.disp_seq,
			m1.chng_no,
			m1.ext_sys_no_bom,
			m1.not_cost_flg,
			m1.st_dt,
			m1.end_dt,
			m1.bom_key
		FROM mavm_bom_dply m1
			LEFT OUTER JOIN mavm_itm_dtl_mfg m2 ON
				(0=0
				AND (i_wg_cd = m2.wg_cd OR i_wg_cd IS NULL)
				AND m1.chd_itm_cd = m2.itm_cd
				AND m1.chd_itm_sub1 = m2.itm_sub1
				AND m1.chd_itm_sub2 = m2.itm_sub2
				AND m1.chd_itm_sub3 = m2.itm_sub3
				AND m1.ph_flg = '0'
				AND i_base_dt BETWEEN m2.st_dt
				AND m2.end_dt
				AND m2.bom_ptn <> c_null_val
				)
		WHERE	0=0
		AND m1.wg_cd =
			CASE l_wg_bom_cnt
				WHEN 0 THEN c_null_val
				ELSE i_wg_cd
			END
		AND m1.par_itm_cd = i_ph_bom.itm_cd
		AND m1.par_itm_sub1 = i_ph_bom.itm_sub1
		AND m1.par_itm_sub2 = i_ph_bom.itm_sub2
		AND m1.par_itm_sub3 = i_ph_bom.itm_sub3
		AND m1.bom_ptn = i_ph_bom.bom_ptn
		AND (
			i_ph_bom.oper_cd IS NOT NULL AND m1.oper_cd = i_ph_bom.oper_cd AND m1.oper_seq = i_ph_bom.oper_seq
			OR
			i_ph_bom.oper_cd IS NULL
			OR
			m1.oper_cd IS NULL
			)
		AND i_base_dt BETWEEN m1.st_dt AND m1.end_dt
		AND (i_bom_ptn_flg = '0' OR i_ph_bom.bom_ptn = i_bom_ptn)
		AND (
			i_sno1 IS NULL AND (i_all_sno_flg = '1' OR (m1.min_sno1 IS NULL AND m1.max_sno1 IS NULL))
			OR
			i_sno1 IS NOT NULL
				AND (m1.min_sno1 IS NULL OR m1.min_sno1 <= i_sno1)
				AND (m1.max_sno1 IS NULL OR m1.max_sno1 >= i_sno1)
			)
		AND (
			i_sno2 IS NULL AND (i_all_sno_flg = '1' OR (m1.min_sno2 IS NULL AND m1.max_sno2 IS NULL))
			OR
			i_sno2 IS NOT NULL
				AND (m1.min_sno2 IS NULL OR m1.min_sno2 <= i_sno2)
				AND (m1.max_sno2 IS NULL OR m1.max_sno2 >= i_sno2)
			)
		AND (
			i_sno3 IS NULL AND (i_all_sno_flg = '1' OR (m1.min_sno3 IS NULL AND m1.max_sno3 IS NULL))
			OR
			i_sno3 IS NOT NULL
				AND (m1.min_sno3 IS NULL OR m1.min_sno3 <= i_sno3)
				AND (m1.max_sno3 IS NULL OR m1.max_sno3 >= i_sno3)
			)
		AND (
			i_sno4 IS NULL AND (i_all_sno_flg = '1' OR (m1.min_sno4 IS NULL AND m1.max_sno4 IS NULL))
			OR
			i_sno4 IS NOT NULL
				AND (m1.min_sno4 IS NULL OR m1.min_sno4 <= i_sno4)
				AND (m1.max_sno4 IS NULL OR m1.max_sno4 >= i_sno4)
			)
		ORDER BY m1.oper_cd, m1.oper_seq, m1.disp_seq, m1.alt_grp_cd,
			m1.chd_itm_cd, m1.chd_itm_sub1, m1.chd_itm_sub2, m1.chd_itm_sub3, m1.ver_no
	LOOP
		l_tmp_bom.bom_lvl := i_ph_bom.bom_lvl;
		l_tmp_bom.bottom_flg := '1';
		l_tmp_bom.loop_flg := '0';
		l_tmp_bom.wg_cd := c_null_val;
		l_tmp_bom.itm_cd := x.chd_itm_cd;
		l_tmp_bom.itm_sub1 := x.chd_itm_sub1;
		l_tmp_bom.itm_sub2 := x.chd_itm_sub2;
		l_tmp_bom.itm_sub3 := x.chd_itm_sub3;
		l_tmp_bom.ver_no := x.ver_no;

		IF x.ph_flg = '1' THEN
			l_tmp_bom.bom_ptn := x.ph_bom_ptn;
		ELSE
			l_tmp_bom.bom_ptn := x.bom_ptn;
		END IF;

		IF i_ph_bom.oper_cd IS NOT NULL THEN
			l_tmp_bom.oper_cd := i_ph_bom.oper_cd;
			l_tmp_bom.oper_seq := i_ph_bom.oper_seq;
			l_tmp_bom.disp_seq := i_ph_bom.disp_seq;
		ELSE
			l_tmp_bom.oper_cd := x.oper_cd;
			l_tmp_bom.oper_seq := x.oper_seq;
			l_tmp_bom.disp_seq := x.disp_seq;
		END IF;
		l_tmp_bom.ph_flg := x.ph_flg;
		l_tmp_bom.ph_bom_ptn := x.ph_bom_ptn;
		l_tmp_bom.alt_itm_flg := x.alt_itm_flg;
		l_tmp_bom.alt_grp_cd := x.alt_grp_cd;
		l_tmp_bom.alt_itm_typ := x.alt_itm_typ;
		l_tmp_bom.alt_itm_ratio := x.alt_itm_ratio;
		l_tmp_bom.alt_alloc_prio := x.alt_alloc_prio;
		l_tmp_bom.sno_typ1 := x.sno_typ1;
		l_tmp_bom.sno_typ2 := x.sno_typ2;
		l_tmp_bom.sno_typ3 := x.sno_typ3;
		l_tmp_bom.sno_typ4 := x.sno_typ4;
		l_tmp_bom.min_sno1 := x.min_sno1;
		l_tmp_bom.max_sno1 := x.max_sno1;
		l_tmp_bom.min_sno2 := x.min_sno2;
		l_tmp_bom.max_sno2 := x.max_sno2;
		l_tmp_bom.min_sno3 := x.min_sno3;
		l_tmp_bom.max_sno3 := x.max_sno3;
		l_tmp_bom.min_sno4 := x.min_sno4;
		l_tmp_bom.max_sno4 := x.max_sno4;
		l_tmp_bom.par_inst_qty := i_ph_bom.par_inst_qty;

		IF x.par_inst_qty = 0 THEN
			l_tmp_bom.chd_rqmt_qty := 0;
			l_tmp_bom.chd_inpt_qty := 0;
			l_tmp_bom.fxd_chd_rqmt_qty := x.fxd_chd_rqmt_qty;
		ELSE
			l_tmp_bom.chd_rqmt_qty := i_ph_bom.chd_rqmt_qty * x.chd_rqmt_qty / x.par_inst_qty;
			IF i_mfg_flg = '1' THEN
				l_tmp_bom.chd_inpt_qty := (i_base_unit_qty * i_ph_bom.chd_rqmt_qty / i_ph_bom.par_inst_qty + i_ph_bom.fxd_chd_rqmt_qty) * x.chd_inpt_qty / x.par_inst_qty ;
			ELSE
				l_tmp_bom.chd_inpt_qty := i_ph_bom.chd_inpt_qty * x.chd_inpt_qty / x.par_inst_qty;
			END IF;
			l_tmp_bom.fxd_chd_rqmt_qty := i_ph_bom.fxd_chd_rqmt_qty * x.chd_rqmt_qty / x.par_inst_qty + x.fxd_chd_rqmt_qty;
		END IF;
		l_tmp_bom.byprod_flg := x.byprod_flg;
		l_tmp_bom.in_offst_typ := x.in_offst_typ;
		l_tmp_bom.in_offst := i_ph_bom.in_offst + x.in_offst;
		l_tmp_bom.bkf_typ := x.bkf_typ;
		l_tmp_bom.inst_lot_fix_flg := x.inst_lot_fix_flg;
		l_tmp_bom.lot_mix_flg := x.lot_mix_flg;
		l_tmp_bom.sublot_mix_flg := x.sublot_mix_flg;
		l_tmp_bom.alloc_ctl_typ := x.alloc_ctl_typ;
		l_tmp_bom.main_itm_flg := x.main_itm_flg;
		l_tmp_bom.inpt_ctl_typ := x.inpt_ctl_typ;
		l_tmp_bom.yield_calc_flg := x.yield_calc_flg;
		l_tmp_bom.chng_no := x.chng_no;
		l_tmp_bom.ext_sys_no_bom := x.ext_sys_no_bom;
		l_tmp_bom.not_cost_flg := x.not_cost_flg;
		l_tmp_bom.st_dt := x.st_dt;
		l_tmp_bom.end_dt := x.end_dt;
		l_tmp_bom.par_itm_cd := i_ph_bom.par_itm_cd;
		l_tmp_bom.par_itm_sub1 := i_ph_bom.par_itm_sub1;
		l_tmp_bom.par_itm_sub2 := i_ph_bom.par_itm_sub2;
		l_tmp_bom.par_itm_sub3 := i_ph_bom.par_itm_sub3;
		l_tmp_bom.par_sort_no := i_ph_bom.par_sort_no;

		IF x.ph_flg = '1' AND x.ph_bom_ptn IS NOT NULL THEN
			l_tmp_bom.sort_no := i_ph_bom.sort_no;
			CALL mapa_bom$p_ex_ph(l_tmp_bom, i_base_dt, i_bom_ptn, i_bom_ptn_flg, i_wg_cd, i_sno1, i_sno2, i_sno3, i_sno4, io_seq, g_bom, i_mfg_flg, i_base_unit_qty, i_all_sno_flg);
		ELSE
			io_seq := io_seq + 1;
			IF io_seq > c_max_itm_num THEN
				EXIT;
			END IF;

			l_tmp_bom.sort_no := RPAD(fcpa_postgres_util$substr(i_ph_bom.sort_no, 1, i_ph_bom.bom_lvl * c_max_itm) || LPAD(io_seq::VARCHAR, c_max_itm, '0'), c_sort_digit, '0') ;
			g_bom[COALESCE(array_length(g_bom, 1), 0)+1] := l_tmp_bom;
		END IF;
	END LOOP;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_bom$p_ex_ph_rev(
	 IN i_ph_bom maw_bom_ex,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_bom_ptn VARCHAR,
	 IN i_bom_ptn_flg CHARACTER,
	 IN i_wg_cd VARCHAR,
	 IN i_sno1 VARCHAR,
	 IN i_sno2 VARCHAR,
	 IN i_sno3 VARCHAR,
	 IN i_sno4 VARCHAR,
	 INOUT io_seq INTEGER,
	 INOUT g_bom maw_bom_ex[]
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	ファントム品の展開処理（逆展開）
<REMARKS>
<ARGUMENTS>
<HISTORY>
**********************************************************/
DECLARE
	c_max_itm	CONSTANT INTEGER := 6 ;
	c_max_itm_num	CONSTANT INTEGER := 999999 ; --c_max_itmの桁に対する最大数
	c_sort_digit	CONSTANT INTEGER := 3000 ;
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;

	l_tmp_seq INTEGER;
	l_tmp_bom maw_bom_ex;
	l_chk_bom maw_bom_ex;
	x1 RECORD;
	x RECORD;
BEGIN
	l_chk_bom.wg_cd := NULL;

	FOR x1 IN
		SELECT	t.wg_cd,
			t.par_itm_cd,
			t.par_itm_sub1,
			t.par_itm_sub2,
			t.par_itm_sub3,
			t.bom_ptn
		FROM	(
			SELECT	DISTINCT
				m1.wg_cd,
				m1.par_itm_cd,
				m1.par_itm_sub1,
				m1.par_itm_sub2,
				m1.par_itm_sub3,
				m1.bom_ptn
			FROM	mam_bom m1
			WHERE	0=0
			AND	(m1.wg_cd = c_null_val OR m1.wg_cd = i_wg_cd)
			AND	m1.chd_itm_cd = i_ph_bom.itm_cd
			AND	m1.chd_itm_sub1 = i_ph_bom.itm_sub1
			AND	m1.chd_itm_sub2 = i_ph_bom.itm_sub2
			AND	m1.chd_itm_sub3 = i_ph_bom.itm_sub3
			AND	m1.ph_bom_ptn = i_ph_bom.bom_ptn
			AND	m1.ph_flg = '1'
			AND	(
				i_ph_bom.oper_cd IS NOT NULL AND m1.oper_cd = i_ph_bom.oper_cd AND m1.oper_seq = i_ph_bom.oper_seq
				OR
				i_ph_bom.oper_cd IS NULL OR m1.oper_cd IS NULL
				)
			AND	i_base_dt BETWEEN m1.st_dt AND m1.end_dt
			AND	(
				i_sno1 IS NULL AND m1.min_sno1 IS NULL AND m1.max_sno1 IS NULL
				OR
				i_sno1 IS NOT NULL
					AND (m1.min_sno1 IS NULL OR m1.min_sno1 <= i_sno1)
					AND (m1.max_sno1 IS NULL OR m1.max_sno1 >= i_sno1)
				)
			AND	(
				i_sno2 IS NULL AND m1.min_sno2 IS NULL AND m1.max_sno2 IS NULL
				OR
				i_sno2 IS NOT NULL
					AND (m1.min_sno2 IS NULL OR m1.min_sno2 <= i_sno2)
					AND (m1.max_sno2 IS NULL OR m1.max_sno2 >= i_sno2)
				)
			AND	(
				i_sno3 IS NULL AND m1.min_sno3 IS NULL AND m1.max_sno3 IS NULL
				OR
				i_sno3 IS NOT NULL
					AND (m1.min_sno3 IS NULL OR m1.min_sno3 <= i_sno3)
					AND (m1.max_sno3 IS NULL OR m1.max_sno3 >= i_sno3)
				)
			AND	(
				i_sno4 IS NULL AND m1.min_sno4 IS NULL AND m1.max_sno4 IS NULL
				OR
				i_sno4 IS NOT NULL
					AND (m1.min_sno4 IS NULL OR m1.min_sno4 <= i_sno4)
					AND (m1.max_sno4 IS NULL OR m1.max_sno4 >= i_sno4)
				)
			AND	(i_bom_ptn_flg = '0' OR m1.bom_ptn = i_bom_ptn)
			AND	m1.del_flg = '0'
			) t
		WHERE 0=0
		ORDER BY t.par_itm_cd, t.par_itm_sub1, t.par_itm_sub2, t.par_itm_sub3, t.bom_ptn,
			CASE t.wg_cd
				WHEN c_null_val THEN 999
				ELSE 1
			END, t.wg_cd
	LOOP
		<<NEXT_X1>>
		BEGIN
			IF l_chk_bom.wg_cd IS NOT NULL
			AND l_chk_bom.par_itm_cd = x1.par_itm_cd
			AND l_chk_bom.par_itm_sub1 = x1.par_itm_sub1
			AND l_chk_bom.par_itm_sub2 = x1.par_itm_sub2
			AND l_chk_bom.par_itm_sub3 = x1.par_itm_sub3
			AND l_chk_bom.bom_ptn = x1.bom_ptn
			THEN
				EXIT NEXT_X1;
			ELSE
				l_chk_bom.wg_cd := x1.wg_cd;
				l_chk_bom.par_itm_cd := x1.par_itm_cd;
				l_chk_bom.par_itm_sub1 := x1.par_itm_sub1;
				l_chk_bom.par_itm_sub2 := x1.par_itm_sub2;
				l_chk_bom.par_itm_sub3 := x1.par_itm_sub3;
				l_chk_bom.bom_ptn := x1.bom_ptn;
			END IF;

			FOR x IN
				SELECT	m1.oper_cd, m1.oper_seq,
					m1.par_itm_cd,
					m1.par_itm_sub1, m1.par_itm_sub2, m1.par_itm_sub3,
					m1.bom_ptn,
					m1.ver_no,
					m1.ph_flg,
					m1.ph_bom_ptn,
					m1.alt_itm_flg,
					m1.alt_grp_cd,
					m1.alt_itm_typ,
					m1.alt_itm_ratio,
					m1.alt_alloc_prio,
 					m1.sno_typ1, m1.sno_typ2, m1.sno_typ3, m1.sno_typ4,
					m1.min_sno1, m1.max_sno1,
					m1.min_sno2, m1.max_sno2,
					m1.min_sno3, m1.max_sno3,
					m1.min_sno4, m1.max_sno4,
					m1.par_inst_qty,
					m1.chd_rqmt_qty,
					m1.chd_inpt_qty,
					m1.fxd_chd_rqmt_qty,
					m1.byprod_flg,
					m1.in_offst_typ,
					m1.in_offst,
					m1.bkf_typ,
					m1.inst_lot_fix_flg,
					m1.lot_mix_flg,
					m1.sublot_mix_flg,
					m1.alloc_ctl_typ,
					m1.main_itm_flg,
					m1.inpt_ctl_typ,
					m1.yield_calc_flg,
					m1.disp_seq,
					m1.chng_no,
					m1.ext_sys_no_bom,
					m1.not_cost_flg,
					m1.st_dt,
					m1.end_dt,
					m1.chd_itm_cd,
					m1.chd_itm_sub1,
					m1.chd_itm_sub2,
					m1.chd_itm_sub3
				FROM	mam_bom m1
				WHERE	0=0
				AND	m1.chd_itm_cd = i_ph_bom.itm_cd
				AND	m1.chd_itm_sub1 = i_ph_bom.itm_sub1
				AND	m1.chd_itm_sub2 = i_ph_bom.itm_sub2
				AND	m1.chd_itm_sub3 = i_ph_bom.itm_sub3
				AND	m1.ph_bom_ptn = i_ph_bom.bom_ptn
				AND	m1.ph_flg = '1'
				AND	(
					i_ph_bom.oper_cd IS NOT NULL AND m1.oper_cd = i_ph_bom.oper_cd AND m1.oper_seq = i_ph_bom.oper_seq
					OR
					i_ph_bom.oper_cd IS NULL
					OR
					m1.oper_cd IS NULL
					)
				AND	i_base_dt BETWEEN m1.st_dt AND m1.end_dt
				AND	(
					i_sno1 IS NULL AND m1.min_sno1 IS NULL AND m1.max_sno1 IS NULL
					OR
					i_sno1 IS NOT NULL
						AND (m1.min_sno1 IS NULL OR m1.min_sno1 <= i_sno1)
						AND (m1.max_sno1 IS NULL OR m1.max_sno1 >= i_sno1)
					)
				AND (
					i_sno2 IS NULL AND m1.min_sno2 IS NULL AND m1.max_sno2 IS NULL
					OR
					i_sno2 IS NOT NULL
						AND (m1.min_sno2 IS NULL OR m1.min_sno2 <= i_sno2)
						AND (m1.max_sno2 IS NULL OR m1.max_sno2 >= i_sno2)
					)
				AND	(
					i_sno3 IS NULL AND m1.min_sno3 IS NULL AND m1.max_sno3 IS NULL
					OR
					i_sno3 IS NOT NULL
						AND (m1.min_sno3 IS NULL OR m1.min_sno3 <= i_sno3)
						AND (m1.max_sno3 IS NULL OR m1.max_sno3 >= i_sno3)
					)
				AND	(
					i_sno4 IS NULL AND m1.min_sno4 IS NULL AND m1.max_sno4 IS NULL
					OR
					i_sno4 IS NOT NULL
						AND (m1.min_sno4 IS NULL OR m1.min_sno4 <= i_sno4)
						AND (m1.max_sno4 IS NULL OR m1.max_sno4 >= i_sno4)
					)
				AND	m1.wg_cd = l_chk_bom.wg_cd
				AND	m1.par_itm_cd = l_chk_bom.par_itm_cd
				AND	m1.par_itm_sub1 = l_chk_bom.par_itm_sub1
				AND	m1.par_itm_sub2 = l_chk_bom.par_itm_sub2
				AND	m1.par_itm_sub3 = l_chk_bom.par_itm_sub3
				AND	m1.bom_ptn = l_chk_bom.bom_ptn
				AND	(i_bom_ptn_flg = '0' OR m1.bom_ptn = i_bom_ptn)
				AND	m1.del_flg = '0'
				ORDER BY m1.par_itm_cd, m1.par_itm_sub1, m1.par_itm_sub2, m1.par_itm_sub3,
					m1.oper_cd, m1.oper_seq, m1.disp_seq, m1.alt_grp_cd, m1.ver_no
			LOOP
				l_tmp_bom.bom_lvl := i_ph_bom.bom_lvl;
				l_tmp_bom.bottom_flg := '1';
				l_tmp_bom.loop_flg := '0';
				l_tmp_bom.wg_cd := c_null_val;
				l_tmp_bom.itm_cd := x.par_itm_cd;
				l_tmp_bom.itm_sub1 := x.par_itm_sub1;
				l_tmp_bom.itm_sub2 := x.par_itm_sub2;
				l_tmp_bom.itm_sub3 := x.par_itm_sub3;
				l_tmp_bom.ver_no := x.ver_no;
				l_tmp_bom.bom_ptn := x.bom_ptn;

				IF i_ph_bom.oper_cd IS NOT NULL THEN
					l_tmp_bom.oper_cd := i_ph_bom.oper_cd;
					l_tmp_bom.oper_seq := i_ph_bom.oper_seq;
					l_tmp_bom.disp_seq := i_ph_bom.disp_seq;
				ELSE
					l_tmp_bom.oper_cd := x.oper_cd;
					l_tmp_bom.oper_seq := x.oper_seq;
					l_tmp_bom.disp_seq := x.disp_seq;
				END IF;
				l_tmp_bom.oper_cd := x.oper_cd;
				l_tmp_bom.oper_seq := x.oper_seq;
				l_tmp_bom.ph_flg := '0';
				l_tmp_bom.ph_bom_ptn := NULL;
				l_tmp_bom.alt_itm_flg := x.alt_itm_flg;
				l_tmp_bom.alt_grp_cd := x.alt_grp_cd;
				l_tmp_bom.alt_itm_typ := x.alt_itm_typ;
				l_tmp_bom.alt_itm_ratio := x.alt_itm_ratio;
				l_tmp_bom.alt_alloc_prio := x.alt_alloc_prio;
				l_tmp_bom.sno_typ1 := x.sno_typ1;
				l_tmp_bom.sno_typ2 := x.sno_typ2;
				l_tmp_bom.sno_typ3 := x.sno_typ3;
				l_tmp_bom.sno_typ4 := x.sno_typ4;
				l_tmp_bom.min_sno1 := x.min_sno1;
				l_tmp_bom.max_sno1 := x.max_sno1;
				l_tmp_bom.min_sno2 := x.min_sno2;
				l_tmp_bom.max_sno2 := x.max_sno2;
				l_tmp_bom.min_sno3 := x.min_sno3;
				l_tmp_bom.max_sno3 := x.max_sno3;
				l_tmp_bom.min_sno4 := x.min_sno4;
				l_tmp_bom.max_sno4 := x.max_sno4;
				l_tmp_bom.par_inst_qty := i_ph_bom.par_inst_qty;

				IF x.par_inst_qty = 0 THEN
					l_tmp_bom.chd_rqmt_qty := 0;
					l_tmp_bom.chd_inpt_qty := 0;
					l_tmp_bom.fxd_chd_rqmt_qty := x.fxd_chd_rqmt_qty;
				ELSE
					l_tmp_bom.chd_rqmt_qty := i_ph_bom.chd_rqmt_qty * x.chd_rqmt_qty / x.par_inst_qty;
					l_tmp_bom.chd_inpt_qty := i_ph_bom.chd_inpt_qty * x.chd_inpt_qty / x.par_inst_qty;
					l_tmp_bom.fxd_chd_rqmt_qty := i_ph_bom.fxd_chd_rqmt_qty * x.chd_rqmt_qty / x.par_inst_qty + x.fxd_chd_rqmt_qty;
				END IF;
				l_tmp_bom.byprod_flg := x.byprod_flg;
				l_tmp_bom.in_offst_typ := i_ph_bom.in_offst_typ;
				l_tmp_bom.in_offst := i_ph_bom.in_offst + x.in_offst;
				l_tmp_bom.bkf_typ := x.bkf_typ;
				l_tmp_bom.inst_lot_fix_flg := x.inst_lot_fix_flg;
				l_tmp_bom.lot_mix_flg := x.lot_mix_flg;
				l_tmp_bom.sublot_mix_flg := x.sublot_mix_flg;
				l_tmp_bom.alloc_ctl_typ := x.alloc_ctl_typ;
				l_tmp_bom.main_itm_flg := x.main_itm_flg;
				l_tmp_bom.inpt_ctl_typ := x.inpt_ctl_typ;
				l_tmp_bom.yield_calc_flg := x.yield_calc_flg;
				l_tmp_bom.chng_no := x.chng_no;
				l_tmp_bom.ext_sys_no_bom := x.ext_sys_no_bom;
				l_tmp_bom.not_cost_flg := x.not_cost_flg;
				l_tmp_bom.st_dt := x.st_dt;
				l_tmp_bom.end_dt := x.end_dt;
				l_tmp_bom.par_itm_cd := i_ph_bom.par_itm_cd;
				l_tmp_bom.par_itm_sub1 := i_ph_bom.par_itm_sub1;
				l_tmp_bom.par_itm_sub2 := i_ph_bom.par_itm_sub2;
				l_tmp_bom.par_itm_sub3 := i_ph_bom.par_itm_sub3;
				l_tmp_bom.par_sort_no := i_ph_bom.par_sort_no;

				l_tmp_seq := io_seq;

				l_tmp_bom.sort_no := i_ph_bom.sort_no;
				CALL mapa_bom$p_ex_ph_rev(l_tmp_bom, i_base_dt, i_bom_ptn, i_bom_ptn_flg, i_wg_cd, i_sno1, i_sno2, i_sno3, i_sno4, io_seq, g_bom);

				io_seq := io_seq + 1;
				IF io_seq > c_max_itm_num THEN
					EXIT;
				END IF;

				l_tmp_bom.sort_no := RPAD(fcpa_postgres_util$substr(i_ph_bom.sort_no, 1, i_ph_bom.bom_lvl * c_max_itm) || LPAD(io_seq::VARCHAR, c_max_itm, '0'), c_sort_digit, '0') ;
				IF l_tmp_seq <> io_seq - 1 THEN
					l_tmp_bom.ph_flg := '1';
				END IF;
				g_bom[COALESCE(array_length(g_bom, 1), 0)+1] := l_tmp_bom;
			END LOOP;
		END;
		NULL;
	END LOOP;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_bom$p_ins_rec(
	 INOUT g_bom maw_bom_ex[]
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	maw_bom_exにレコードを作成する
<REMARKS>
<ARGUMENTS>
<HISTORY>
**********************************************************/
BEGIN
	IF COALESCE(array_length(g_bom, 1), 0) = 0 THEN
		RETURN;
	END IF;

	INSERT INTO maw_bom_ex SELECT * FROM UNNEST(g_bom);

	g_bom := '{}';
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_bom$p_sum_rec(
	 IN i_lvl NUMERIC
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	maw_bom_exに対する集計処理
<REMARKS>
<ARGUMENTS>
<IN>	i_lvl
		処理対象のレベル
<HISTORY>
**********************************************************/
DECLARE
	l_qty maw_bom_ex.chd_rqmt_qty%TYPE;
	x RECORD;
	y RECORD;
BEGIN
	/* 一時テーブル（インデックス付き）を作成し、データを移動 */
	CALL fcpa_postgres_util$type_is_table_row('mapa_bom$p_sum_rec$maw_bom_ex', 'maw_bom_ex', 'INTEGER') ;
	INSERT INTO mapa_bom$p_sum_rec$maw_bom_ex SELECT *, ROW_NUMBER() OVER() FROM maw_bom_ex;
	CALL fcpa_postgres_util$p_truncate_work('maw_bom_ex') ;

	FOR x IN (
		SELECT
			t.*
		FROM	mapa_bom$p_sum_rec$maw_bom_ex t
		WHERE	0=0
		AND	t.bom_lvl = i_lvl
		AND	(t.chd_rqmt_qty < 0 OR t.chd_inpt_qty < 0 OR t.fxd_chd_rqmt_qty < 0)
		)
	LOOP

		FOR y IN (
			SELECT
				t._index_,
				t.chd_rqmt_qty,
				t.chd_inpt_qty,
				t.fxd_chd_rqmt_qty
			FROM	mapa_bom$p_sum_rec$maw_bom_ex t
			WHERE	0=0
			AND	t._index_ <> x._index_
			AND	t.bom_lvl = x.bom_lvl
			AND	t.wg_cd = x.wg_cd
			AND	t.itm_cd = x.itm_cd
			AND	t.itm_sub1 = x.itm_sub1
			AND	t.itm_sub2 = x.itm_sub2
			AND	t.itm_sub3 = x.itm_sub3
			AND	(t.ver_no = x.ver_no OR t.ver_no IS NULL AND x.ver_no IS NULL)
			AND	(t.bom_ptn = x.bom_ptn OR t.bom_ptn IS NULL AND x.bom_ptn IS NULL)
			AND	(t.oper_cd = x.oper_cd OR t.oper_cd IS NULL AND x.oper_cd IS NULL)
			AND	(t.oper_seq = x.oper_seq OR t.oper_seq IS NULL AND x.oper_seq IS NULL)
			AND	t.ph_flg = x.ph_flg
			AND	(t.ph_bom_ptn = x.ph_bom_ptn OR t.ph_bom_ptn IS NULL AND x.ph_bom_ptn IS NULL)
			AND	t.alt_itm_flg = x.alt_itm_flg
			AND	(t.alt_grp_cd = x.alt_grp_cd OR t.alt_grp_cd IS NULL AND x.alt_grp_cd IS NULL)
			AND	(t.alt_itm_typ = x.alt_itm_typ OR t.alt_itm_typ IS NULL AND x.alt_itm_typ IS NULL)
			AND	(t.alt_itm_ratio = x.alt_itm_ratio OR t.alt_itm_ratio IS NULL AND x.alt_itm_ratio IS NULL)
			AND	(t.alt_alloc_prio = x.alt_alloc_prio OR t.alt_alloc_prio IS NULL AND x.alt_alloc_prio IS NULL)
			AND	t.par_inst_qty = x.par_inst_qty
			AND	t.byprod_flg = x.byprod_flg
			AND	t.in_offst_typ = x.in_offst_typ
			AND	t.in_offst = x.in_offst
			AND	t.bkf_typ = x.bkf_typ
			AND	t.inst_lot_fix_flg = x.inst_lot_fix_flg
			AND	t.lot_mix_flg = x.lot_mix_flg
			AND	t.sublot_mix_flg = x.sublot_mix_flg
			AND	t.alloc_ctl_typ = x.alloc_ctl_typ
			AND	t.main_itm_flg = x.main_itm_flg
			AND	t.inpt_ctl_typ = x.inpt_ctl_typ
			AND	t.yield_calc_flg = x.yield_calc_flg
			AND	t.par_itm_cd = x.par_itm_cd
			AND	t.par_itm_sub1 = x.par_itm_sub1
			AND	t.par_itm_sub2 = x.par_itm_sub2
			AND	t.par_itm_sub3 = x.par_itm_sub3
			AND	(t.chd_rqmt_qty > 0 OR t.chd_inpt_qty > 0 OR t.fxd_chd_rqmt_qty > 0)
			ORDER BY t.chd_rqmt_qty desc, t.sort_no
			)
		LOOP

			IF x.chd_rqmt_qty < 0 AND y.chd_rqmt_qty > 0 THEN
				IF x.chd_rqmt_qty + y.chd_rqmt_qty <= 0 THEN
					l_qty := y.chd_rqmt_qty ;
					y.chd_rqmt_qty := 0 ;
					x.chd_rqmt_qty := x.chd_rqmt_qty + l_qty ;
				ELSE
					l_qty := x.chd_rqmt_qty ;
					x.chd_rqmt_qty := 0 ;
					y.chd_rqmt_qty := l_qty + y.chd_rqmt_qty ;
				END IF ;
			END IF ;

			IF x.chd_inpt_qty < 0 AND y.chd_inpt_qty > 0 THEN
				IF x.chd_inpt_qty + y.chd_inpt_qty <= 0 THEN
					l_qty := y.chd_inpt_qty ;
					y.chd_inpt_qty := 0 ;
					x.chd_inpt_qty := x.chd_inpt_qty + l_qty ;
				ELSE
					l_qty := x.chd_inpt_qty ;
					x.chd_inpt_qty := 0 ;
					y.chd_inpt_qty := l_qty + y.chd_inpt_qty ;
				END IF ;
			END IF ;

			IF x.fxd_chd_rqmt_qty < 0 AND y.fxd_chd_rqmt_qty > 0 THEN
				IF x.fxd_chd_rqmt_qty + y.fxd_chd_rqmt_qty <= 0 THEN
					l_qty := y.fxd_chd_rqmt_qty ;
					y.fxd_chd_rqmt_qty := 0 ;
					x.fxd_chd_rqmt_qty := x.fxd_chd_rqmt_qty + l_qty ;
				ELSE
					l_qty := x.fxd_chd_rqmt_qty ;
					x.fxd_chd_rqmt_qty := 0 ;
					y.fxd_chd_rqmt_qty := l_qty + y.fxd_chd_rqmt_qty ;
				END IF ;
			END IF ;

			UPDATE mapa_bom$p_sum_rec$maw_bom_ex w
			SET chd_rqmt_qty = y.chd_rqmt_qty,
				chd_inpt_qty = y.chd_inpt_qty,
				fxd_chd_rqmt_qty = y.fxd_chd_rqmt_qty
			WHERE 0=0
			AND w._index_ = y._index_
			;
		END LOOP ;

		IF x.chd_rqmt_qty <= 0 AND x.chd_inpt_qty <= 0 AND x.fxd_chd_rqmt_qty <= 0 THEN
			DELETE FROM mapa_bom$p_sum_rec$maw_bom_ex w WHERE w._index_ = x._index_ ;
		ELSE
			UPDATE mapa_bom$p_sum_rec$maw_bom_ex w
			SET chd_rqmt_qty = x.chd_rqmt_qty,
				chd_inpt_qty = x.chd_inpt_qty,
				fxd_chd_rqmt_qty = x.fxd_chd_rqmt_qty
			WHERE 0=0
			AND w._index_ = x._index_
			;
		END IF ;
	END LOOP;

	/* 一時テーブルのデータを戻す */
 	INSERT INTO maw_bom_ex SELECT
		sort_no,bom_lvl,bottom_flg,loop_flg,wg_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,
		ver_no,bom_ptn,oper_cd,oper_seq,ph_flg,ph_bom_ptn,alt_itm_flg,alt_grp_cd,
		alt_itm_typ,alt_itm_ratio,alt_alloc_prio,sno_typ1,sno_typ2,sno_typ3,sno_typ4,
		min_sno1,max_sno1,min_sno2,max_sno2,min_sno3,max_sno3,min_sno4,max_sno4,
		par_inst_qty,chd_inpt_qty,chd_rqmt_qty,fxd_chd_rqmt_qty,byprod_flg,in_offst_typ,
		in_offst,bkf_typ,inst_lot_fix_flg,lot_mix_flg,sublot_mix_flg,alloc_ctl_typ,
		main_itm_flg,yield_calc_flg,inpt_ctl_typ,disp_seq,chng_no,ext_sys_no_bom,
		not_cost_flg,st_dt,end_dt,par_itm_cd,par_itm_sub1,par_itm_sub2,par_itm_sub3,
		par_sort_no,sno1,sno2,sno3,sno4
	FROM mapa_bom$p_sum_rec$maw_bom_ex;

	/* 一時テーブル削除 */
	TRUNCATE TABLE mapa_bom$p_sum_rec$maw_bom_ex ;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_bom$p_upd_loop(
	 IN i_lvl NUMERIC
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	maw_bom_exのloop_flgを更新する
	maw_bom_exのchd_rqmt_qty,chd_inpt_qty,fxd_chd_rqmt_qty
	がマイナスの場合は０とする
<REMARKS>
<ARGUMENTS>
<IN>	i_lvl
		チェック対象のレベル
<HISTORY>
**********************************************************/
DECLARE
	c_max_itm CONSTANT INTEGER := 6 ;
	x RECORD;
BEGIN
	UPDATE maw_bom_ex t
	SET loop_flg = '1'
	WHERE 0=0
	AND t.bom_lvl = i_lvl
	AND EXISTS (
			SELECT 'X'
			FROM maw_bom_ex w
			WHERE 0=0
			AND w.bom_lvl < t.bom_lvl
			AND w.itm_cd = t.itm_cd
			AND w.itm_sub1 = t.itm_sub1
			AND w.itm_sub2 = t.itm_sub2
			AND w.itm_sub3 = t.itm_sub3
			AND fcpa_postgres_util$substr(w.sort_no, 1, (w.bom_lvl + 1) * c_max_itm) = fcpa_postgres_util$substr(t.sort_no, 1, (w.bom_lvl + 1) * c_max_itm)
		)
	;

	UPDATE	maw_bom_ex t
	SET	chd_rqmt_qty = 0
	WHERE	0=0
	AND	t.bom_lvl = i_lvl
	AND	t.chd_rqmt_qty < 0
	;

	UPDATE	maw_bom_ex t
	SET	chd_inpt_qty = 0
	WHERE	0=0
	AND	t.bom_lvl = i_lvl
	AND	t.chd_inpt_qty < 0
	;

	UPDATE	maw_bom_ex t
	SET	fxd_chd_rqmt_qty = 0
	WHERE	0=0
	AND	t.bom_lvl = i_lvl
	AND	t.fxd_chd_rqmt_qty < 0
	;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_bom$p_ins_bom_ex(
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_bom_ptn VARCHAR,
	 IN i_wg_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ph_ex_flg CHARACTER,
	 IN i_bom_ptn_flg CHARACTER,
	 IN i_max_hrrchy NUMERIC DEFAULT NULL,
	 IN i_sno1 VARCHAR DEFAULT NULL,
	 IN i_sno2 VARCHAR DEFAULT NULL,
	 IN i_sno3 VARCHAR DEFAULT NULL,
	 IN i_sno4 VARCHAR DEFAULT NULL,
	 IN i_mfg_flg CHARACTER DEFAULT NULL,
	 IN i_base_unit_qty NUMERIC DEFAULT NULL,
	 IN i_all_sno_flg CHARACTER DEFAULT NULL)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	ＢＯＭ正展開結果を一時表（MAW_BOM_EX）に格納する
<REMARKS>
	I_WG_CDがNULLの場合はWG共通のＢＯＭのみで展開する
<ARGUMENTS>
<IN>	I_ITM_CD
		品目ＣＤ
<IN>	I_ITM_SUB1
		枝番１
<IN>	I_ITM_SUB2
		枝番２
<IN>	I_ITM_SUB3
		枝番３
<IN>	I_BOM_PTN
		構成パタン
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_BASE_DT
		マスタ適用日
<IN>	I_PH_EX_FLG
		架空展開ＦＬＧ
<IN>	I_BOM_PTN_FLG
		構成パタン引継ぎＦＬＧ
<IN>	I_MAX_HRRCHY
		最大階層
<IN>	I_SNO1
		手配ＮＯ１
<IN>	I_SNO2
		手配ＮＯ２
<IN>	I_SNO3
		手配ＮＯ３
<IN>	I_SNO4
		手配ＮＯ４
<IN>	I_MFG_FLG
		製造ＦＬＧ
<IN>	I_BASE_UNIT_QTY
		基準単位数量
<IN>	I_ALL_SNO_FLG
		全手配ＮＯＦＬＧ
<RETURNVALUE>
<HISTORY>
**********************************************************/
DECLARE
	c_max_lvl	CONSTANT INTEGER := 500 ;
	c_max_itm	CONSTANT INTEGER := 6 ;
	c_max_itm_num	CONSTANT INTEGER := 999999 ; --c_max_itmの桁に対する最大数
	c_sort_digit	CONSTANT INTEGER := 3000 ;
	c_max_cnt	CONSTANT INTEGER := 5000 ; --バルクインサートでの最大レコード数
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	c_inpt_ctl_typ_no_mrp_inst CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_INPT_CTL_TYP','NO_MRP_INST');
	g_bom	maw_bom_ex[];

	l_seq INTEGER;
	l_lvl maw_bom_ex.bom_lvl%TYPE;
	l_tmp_bom maw_bom_ex;
	l_stop_flg CHAR(1);
	x RECORD;
BEGIN
	CALL fcpa_postgres_util$p_truncate_work('maw_bom_ex') ;

	l_seq := 0;
	l_lvl := 0;
	l_stop_flg := '0';

	INSERT INTO maw_bom_ex (sort_no, bom_lvl, bottom_flg, wg_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3, bom_ptn)
	VALUES (LPAD(l_seq::VARCHAR, c_sort_digit, '0'), l_lvl, '1', c_null_val, i_itm_cd, i_itm_sub1, i_itm_sub2, i_itm_sub3, i_bom_ptn);

	LOOP
		l_lvl := l_lvl + 1;

		IF i_max_hrrchy IS NOT NULL AND i_max_hrrchy < l_lvl THEN
			l_stop_flg := '1';
			EXIT;
		END IF;

		l_seq := 0;
		g_bom := '{}';

		/* 同一ＷＧ・親品目・枝番１～３・構成パタンのＢＯＭが存在する場合はインプットのＷＧに対するＢＯＭを参照する */
		IF i_wg_cd IS NOT NULL THEN
			UPDATE maw_bom_ex w
			SET wg_cd = i_wg_cd
			WHERE 0=0 
			AND w.bom_lvl = l_lvl - 1
			AND EXISTS (
					SELECT 'X'
					FROM mam_bom m
					WHERE 0=0
					AND i_wg_cd = m.wg_cd
					AND w.itm_cd = m.par_itm_cd
					AND w.itm_sub1 = m.par_itm_sub1
					AND w.itm_sub2 = m.par_itm_sub2
					AND w.itm_sub3 = m.par_itm_sub3
					AND w.bom_ptn = m.bom_ptn
					AND m.del_flg = '0'
				)
			;
		END IF;

		FOR x IN
		SELECT DISTINCT
			w.sort_no,
			m1.oper_cd,
			m1.oper_seq,
			m1.chd_itm_cd,
			m1.chd_itm_sub1,
			m1.chd_itm_sub2,
			m1.chd_itm_sub3,
			m2.bom_ptn,
			m1.ver_no,
			m1.ph_flg,
			m1.ph_bom_ptn,
			m1.alt_itm_flg,
			m1.alt_grp_cd,
			m1.alt_itm_typ,
			m1.alt_itm_ratio,
			m1.alt_alloc_prio,
			m1.sno_typ1,
			m1.sno_typ2,
			m1.sno_typ3,
			m1.sno_typ4,
			m1.min_sno1,
			m1.max_sno1,
			m1.min_sno2,
			m1.max_sno2,
			m1.min_sno3,
			m1.max_sno3,
			m1.min_sno4,
			m1.max_sno4,
			m1.par_inst_qty,
			m1.chd_rqmt_qty,
			m1.chd_inpt_qty,
			m1.fxd_chd_rqmt_qty,
			m1.byprod_flg,
			m1.in_offst_typ,
			m1.in_offst,
			m1.bkf_typ,
			m1.inst_lot_fix_flg,
			m1.lot_mix_flg,
			m1.sublot_mix_flg,
			m1.alloc_ctl_typ,
			m1.main_itm_flg,
			m1.inpt_ctl_typ,
			m1.yield_calc_flg,
			m1.disp_seq,
			m1.chng_no,
			m1.ext_sys_no_bom,
			m1.not_cost_flg,
			m1.st_dt,
			m1.end_dt,
			m1.par_itm_cd,
			m1.par_itm_sub1,
			m1.par_itm_sub2,
			m1.par_itm_sub3,
			m1.bom_key
		FROM maw_bom_ex w
			JOIN mavm_bom_dply m1 ON
				(0=0
				AND w.wg_cd = m1.wg_cd
				AND w.itm_cd = m1.par_itm_cd
				AND w.itm_sub1 = m1.par_itm_sub1
				AND w.itm_sub2 = m1.par_itm_sub2
				AND w.itm_sub3 = m1.par_itm_sub3
				AND w.bom_ptn = m1.bom_ptn
				AND i_base_dt BETWEEN m1.st_dt AND m1.end_dt
				AND (
					i_sno1 IS NULL AND (i_all_sno_flg = '1' OR (m1.min_sno1 IS NULL AND m1.max_sno1 IS NULL))
					OR
					i_sno1 IS NOT NULL
						AND (m1.min_sno1 IS NULL OR m1.min_sno1 <= i_sno1)
						AND (m1.max_sno1 IS NULL OR m1.max_sno1 >= i_sno1)
					)
				AND (
					i_sno2 IS NULL AND (i_all_sno_flg = '1' OR (m1.min_sno2 IS NULL AND m1.max_sno2 IS NULL))
					OR
					i_sno2 IS NOT NULL
						AND (m1.min_sno2 IS NULL OR m1.min_sno2 <= i_sno2)
						AND (m1.max_sno2 IS NULL OR m1.max_sno2 >= i_sno2)
					)
				AND (
					i_sno3 IS NULL AND (i_all_sno_flg = '1' OR (m1.min_sno3 IS NULL AND m1.max_sno3 IS NULL))
					OR
					i_sno3 IS NOT NULL
						AND (m1.min_sno3 IS NULL OR m1.min_sno3 <= i_sno3)
						AND (m1.max_sno3 IS NULL OR m1.max_sno3 >= i_sno3)
					)
				AND (
					i_sno4 IS NULL AND (i_all_sno_flg = '1' OR (m1.min_sno4 IS NULL AND m1.max_sno4 IS NULL))
					OR
					i_sno4 IS NOT NULL
						AND (m1.min_sno4 IS NULL OR m1.min_sno4 <= i_sno4)
						AND (m1.max_sno4 IS NULL OR m1.max_sno4 >= i_sno4)
					)
				AND (
					w.ph_flg = '0'
					OR
					m1.oper_cd IS NOT NULL AND w.oper_cd = m1.oper_cd AND w.oper_seq = m1.oper_seq
					OR
					m1.oper_cd IS NULL
					OR
					w.oper_cd IS NULL
					)
				)
			LEFT OUTER JOIN mavm_itm_dtl_mfg m2 ON 
				(0=0
				AND (i_wg_cd = m2.wg_cd OR i_wg_cd IS NULL)
				AND m1.chd_itm_cd = m2.itm_cd
				AND m1.chd_itm_sub1 = m2.itm_sub1
				AND m1.chd_itm_sub2 = m2.itm_sub2
				AND m1.chd_itm_sub3 = m2.itm_sub3
				AND m1.ph_flg = '0'
				AND i_base_dt BETWEEN m2.st_dt AND m2.end_dt
				AND m2.bom_ptn <> c_null_val
				AND (i_bom_ptn_flg = '0' OR m2.bom_ptn = i_bom_ptn)
				)
			WHERE 0=0
			AND w.bom_lvl = l_lvl - 1
			AND w.loop_flg = '0'
			AND (i_bom_ptn_flg = '0' OR w.bom_ptn = i_bom_ptn)
			AND w.byprod_flg = '0'
			AND (w.inpt_ctl_typ IS NULL OR w.inpt_ctl_typ <> c_inpt_ctl_typ_no_mrp_inst)
			AND (w.chd_rqmt_qty IS NULL OR w.chd_rqmt_qty > 0 OR w.chd_inpt_qty > 0 OR w.fxd_chd_rqmt_qty > 0)
			ORDER BY m1.oper_cd, m1.oper_seq, m1.disp_seq, m1.alt_grp_cd,
				m1.chd_itm_cd, m1.chd_itm_sub1, m1.chd_itm_sub2, m1.chd_itm_sub3, m1.ver_no, m1.bom_key
		LOOP
			l_tmp_bom.bom_lvl := l_lvl;
			l_tmp_bom.bottom_flg := '1';
			l_tmp_bom.loop_flg := '0';
			l_tmp_bom.wg_cd := c_null_val;
			l_tmp_bom.itm_cd := x.chd_itm_cd;
			l_tmp_bom.itm_sub1 := x.chd_itm_sub1;
			l_tmp_bom.itm_sub2 := x.chd_itm_sub2;
			l_tmp_bom.itm_sub3 := x.chd_itm_sub3;
			l_tmp_bom.ver_no := x.ver_no;

			IF x.ph_flg = '1' THEN
				l_tmp_bom.bom_ptn := x.ph_bom_ptn;
			ELSE
				l_tmp_bom.bom_ptn := x.bom_ptn;
			END IF;
			l_tmp_bom.oper_cd := x.oper_cd;
			l_tmp_bom.oper_seq := x.oper_seq;
			l_tmp_bom.ph_flg := x.ph_flg;
			l_tmp_bom.ph_bom_ptn := x.ph_bom_ptn;
			l_tmp_bom.alt_itm_flg := x.alt_itm_flg;
			l_tmp_bom.alt_grp_cd := x.alt_grp_cd;
			l_tmp_bom.alt_itm_typ := x.alt_itm_typ;
			l_tmp_bom.alt_itm_ratio := x.alt_itm_ratio;
			l_tmp_bom.alt_alloc_prio := x.alt_alloc_prio;
			l_tmp_bom.sno_typ1 := x.sno_typ1;
			l_tmp_bom.sno_typ2 := x.sno_typ2;
			l_tmp_bom.sno_typ3 := x.sno_typ3;
			l_tmp_bom.sno_typ4 := x.sno_typ4;
			l_tmp_bom.min_sno1 := x.min_sno1;
			l_tmp_bom.max_sno1 := x.max_sno1;
			l_tmp_bom.min_sno2 := x.min_sno2;
			l_tmp_bom.max_sno2 := x.max_sno2;
			l_tmp_bom.min_sno3 := x.min_sno3;
			l_tmp_bom.max_sno3 := x.max_sno3;
			l_tmp_bom.min_sno4 := x.min_sno4;
			l_tmp_bom.max_sno4 := x.max_sno4;
			l_tmp_bom.par_inst_qty := x.par_inst_qty;
			l_tmp_bom.chd_rqmt_qty := x.chd_rqmt_qty;
			IF i_mfg_flg = '1' THEN
				l_tmp_bom.chd_inpt_qty := i_base_unit_qty * x.chd_inpt_qty / x.par_inst_qty ;
			ELSE
				l_tmp_bom.chd_inpt_qty := x.chd_inpt_qty;
			END IF ;
			l_tmp_bom.fxd_chd_rqmt_qty := x.fxd_chd_rqmt_qty;
			l_tmp_bom.byprod_flg := x.byprod_flg;
			l_tmp_bom.in_offst_typ := x.in_offst_typ;
			l_tmp_bom.in_offst := x.in_offst;
			l_tmp_bom.bkf_typ := x.bkf_typ;
			l_tmp_bom.inst_lot_fix_flg := x.inst_lot_fix_flg;
			l_tmp_bom.lot_mix_flg := x.lot_mix_flg;
			l_tmp_bom.sublot_mix_flg := x.sublot_mix_flg;
			l_tmp_bom.alloc_ctl_typ := x.alloc_ctl_typ;
			l_tmp_bom.main_itm_flg := x.main_itm_flg;
			l_tmp_bom.inpt_ctl_typ := x.inpt_ctl_typ;
			l_tmp_bom.yield_calc_flg := x.yield_calc_flg;
			l_tmp_bom.disp_seq := x.disp_seq;
			l_tmp_bom.chng_no := x.chng_no;
			l_tmp_bom.ext_sys_no_bom := x.ext_sys_no_bom;
			l_tmp_bom.not_cost_flg := x.not_cost_flg;
			l_tmp_bom.st_dt := x.st_dt;
			l_tmp_bom.end_dt := x.end_dt;
			l_tmp_bom.par_itm_cd := x.par_itm_cd;
			l_tmp_bom.par_itm_sub1 := x.par_itm_sub1;
			l_tmp_bom.par_itm_sub2 := x.par_itm_sub2;
			l_tmp_bom.par_itm_sub3 := x.par_itm_sub3;
			l_tmp_bom.par_sort_no := x.sort_no;

			IF i_ph_ex_flg = '1' AND x.ph_flg = '1' AND x.ph_bom_ptn IS NOT NULL THEN
				l_tmp_bom.sort_no := x.sort_no;
				CALL mapa_bom$p_ex_ph(l_tmp_bom, i_base_dt, i_bom_ptn, i_bom_ptn_flg, i_wg_cd, i_sno1, i_sno2, i_sno3, i_sno4, l_seq, g_bom, i_mfg_flg, i_base_unit_qty, i_all_sno_flg);
			ELSE
				l_seq := l_seq + 1;
				IF l_seq > c_max_itm_num THEN
					EXIT;
				END IF;

				l_tmp_bom.sort_no := RPAD(fcpa_postgres_util$substr(x.sort_no, 1, l_lvl * c_max_itm) || LPAD(l_seq::VARCHAR, c_max_itm, '0'), c_sort_digit, '0') ;
				g_bom[COALESCE(array_length(g_bom, 1), 0)+1] := l_tmp_bom;
			END IF;

			IF COALESCE(array_length(g_bom, 1), 0) > c_max_cnt THEN
				CALL mapa_bom$p_ins_rec(g_bom);
			END IF;
		END LOOP;

		IF l_lvl >= c_max_lvl OR l_seq = 0 THEN
			IF l_lvl >= c_max_lvl THEN
				l_stop_flg := '1';
			END IF;
			EXIT;
		END IF;

		CALL mapa_bom$p_ins_rec(g_bom);
		CALL mapa_bom$p_sum_rec(l_lvl);
		CALL mapa_bom$p_upd_loop(l_lvl);

	END LOOP;

	UPDATE maw_bom_ex w
	SET bottom_flg = '0'
	WHERE 0=0
	AND (
		l_stop_flg = '1' AND w.bom_lvl = i_max_hrrchy
		OR
		EXISTS (
 			SELECT 'X'
			FROM maw_bom_ex w2
			WHERE 0=0
			AND w2.par_sort_no = w.sort_no
			)
		)
	;

	UPDATE maw_bom_ex w
	SET wg_cd = i_wg_cd
	WHERE 0=0
	AND w.wg_cd = c_null_val
	;

	g_bom := '{}';
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_bom$p_ins_bom_ex_rev(
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_bom_ptn VARCHAR,
	 IN i_wg_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ph_ex_flg CHARACTER,
	 IN i_bom_ptn_flg CHARACTER,
	 IN i_max_hrrchy NUMERIC DEFAULT NULL,
	 IN i_ver_no VARCHAR DEFAULT NULL,
	 IN i_sno1 VARCHAR DEFAULT NULL,
	 IN i_sno2 VARCHAR DEFAULT NULL,
	 IN i_sno3 VARCHAR DEFAULT NULL,
	 IN i_sno4 VARCHAR DEFAULT NULL
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	ＢＯＭ逆展開結果を一時表（maw_bom_ex）に格納する
<REMARKS>
	i_wg_cdがNULLの場合はWG共通のＢＯＭのみで展開する
<ARGUMENTS>
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_bom_ptn
		構成パタン
<IN>	i_wg_cd
		ワーキンググループＣＤ
<IN>	i_base_dt
		マスタ適用日
<IN>	i_ph_ex_flg
		架空展開ＦＬＧ
<IN>	i_bom_ptn_flg
		構成パタン引継ぎＦＬＧ
<IN>	i_max_hrrchy
		最大階層
<IN>	i_var_no
		版ＮＯ
<IN>	i_sno1
		手配ＮＯ１
<IN>	i_sno2
		手配ＮＯ２
<IN>	i_sno3
		手配ＮＯ３
<IN>	i_sno4
		手配ＮＯ４
<RETURNVALUE>
<HISTORY>
**********************************************************/
DECLARE
	c_max_lvl	CONSTANT INTEGER := 500 ;
	c_max_itm	CONSTANT INTEGER := 6 ;
	c_max_itm_num	CONSTANT INTEGER := 999999 ; --c_max_itmの桁に対する最大数
	c_sort_digit	CONSTANT INTEGER := 3000 ;
	c_max_cnt	CONSTANT INTEGER := 5000 ; --バルクインサートでの最大レコード数
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	c_inpt_ctl_typ_no_mrp_inst CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_INPT_CTL_TYP','NO_MRP_INST');

	g_bom	maw_bom_ex[];

	l_seq INTEGER;
	l_tmp_seq INTEGER;
	l_lvl maw_bom_ex.bom_lvl%TYPE;
	l_tmp_bom maw_bom_ex;
	l_stop_flg CHAR(1);
	l_cnt INTEGER;
	l_chk_bom maw_bom_ex;
	l_ver_no mam_bom.ver_no%TYPE;
	x1 RECORD;
	x RECORD;
BEGIN
	CALL fcpa_postgres_util$p_truncate_work('maw_bom_ex') ;

	l_seq := 0;
	l_lvl := 0;
	l_stop_flg := '0';

	INSERT INTO maw_bom_ex (
		sort_no,
		bom_lvl, bottom_flg,
		wg_cd,
		itm_cd, itm_sub1, itm_sub2, itm_sub3
		)
	VALUES	(
		LPAD(l_seq::VARCHAR, c_sort_digit, '0'),
		l_lvl, '1',
		c_null_val,
		i_itm_cd, i_itm_sub1, i_itm_sub2, i_itm_sub3
		)
	;

	l_ver_no := i_ver_no;
	LOOP
		IF l_lvl <> 0 THEN
			l_ver_no := NULL;
		END IF;
		l_lvl := l_lvl + 1;

		IF i_max_hrrchy IS NOT NULL AND i_max_hrrchy < l_lvl THEN
			l_stop_flg := '1';
			EXIT;
		END IF;

		l_seq := 0;
		g_bom := '{}';

		l_chk_bom.wg_cd := NULL;
		FOR x1 IN
			SELECT t.wg_cd,
				t.par_itm_cd,
				t.par_itm_sub1, t.par_itm_sub2, t.par_itm_sub3,
				t.bom_ptn
			FROM	(
				SELECT DISTINCT
					m1.wg_cd,
					m1.par_itm_cd,
					m1.par_itm_sub1, m1.par_itm_sub2, m1.par_itm_sub3,
					m1.bom_ptn
				FROM maw_bom_ex w
				JOIN mam_bom m1 ON
					(0=0
					AND	m1.alt_itm_flg = '0'
					AND	(w.wg_cd = m1.wg_cd OR i_wg_cd = m1.wg_cd)
					AND	w.itm_cd = m1.chd_itm_cd
					AND	w.itm_sub1 = m1.chd_itm_sub1
					AND	w.itm_sub2 = m1.chd_itm_sub2
					AND	w.itm_sub3 = m1.chd_itm_sub3
					AND	(l_ver_no IS NULL OR m1.ver_no = l_ver_no)
					AND	i_base_dt BETWEEN m1.st_dt AND m1.end_dt
					AND	(
						i_sno1 IS NULL AND m1.min_sno1 IS NULL AND m1.max_sno1 IS NULL
						OR
						i_sno1 IS NOT NULL
							AND (m1.min_sno1 IS NULL OR m1.min_sno1 <= i_sno1)
							AND (m1.max_sno1 IS NULL OR m1.max_sno1 >= i_sno1)
						)
					AND	(i_sno2 IS NULL AND m1.min_sno2 IS NULL AND m1.max_sno2 IS NULL
						OR
						i_sno2 IS NOT NULL
							AND (m1.min_sno2 IS NULL OR m1.min_sno2 <= i_sno2)
							AND (m1.max_sno2 IS NULL OR m1.max_sno2 >= i_sno2)
						)
					AND	(i_sno3 IS NULL AND m1.min_sno3 IS NULL AND m1.max_sno3 IS NULL
						OR
						i_sno3 IS NOT NULL
							AND (m1.min_sno3 IS NULL OR m1.min_sno3 <= i_sno3)
							AND (m1.max_sno3 IS NULL OR m1.max_sno3 >= i_sno3)
						)
					AND	(i_sno4 IS NULL AND m1.min_sno4 IS NULL AND m1.max_sno4 IS NULL
						OR
						i_sno4 IS NOT NULL
							AND (m1.min_sno4 IS NULL OR m1.min_sno4 <= i_sno4)
							AND (m1.max_sno4 IS NULL OR m1.max_sno4 >= i_sno4)
						)
					AND	(
						l_lvl = 1 AND (i_bom_ptn IS NULL OR m1.bom_ptn = i_bom_ptn)
						OR
						l_lvl > 1 AND (i_bom_ptn_flg = '0' OR m1.bom_ptn = w.bom_ptn)
						)
					AND	(l_lvl = 1 OR m1.inpt_ctl_typ <> c_inpt_ctl_typ_no_mrp_inst AND m1.byprod_flg = '0') 
					AND	(i_ph_ex_flg = '0' OR w.ph_flg = '0' OR m1.ph_flg = '0')
					AND	(
						m1.ph_flg = '0'
						OR
						m1.oper_cd IS NOT NULL AND w.oper_cd = m1.oper_cd AND w.oper_seq = m1.oper_seq
						OR
						m1.oper_cd IS NULL
						OR
						w.oper_cd IS NULL
						)
					AND	m1.del_flg = '0'
					)
				WHERE	0=0
				AND	w.bom_lvl = l_lvl - 1
				AND	w.loop_flg = '0'
				AND	(w.chd_rqmt_qty IS NULL OR w.chd_rqmt_qty > 0 OR w.chd_inpt_qty > 0 OR w.fxd_chd_rqmt_qty > 0)
				UNION ALL
				SELECT DISTINCT
					m1.wg_cd,
					m1.par_itm_cd,
					m1.par_itm_sub1, m1.par_itm_sub2, m1.par_itm_sub3,
					m1.bom_ptn
				FROM maw_bom_ex w
				JOIN mavm_bom_dply m1 ON
					(0=0
					AND m1.alt_itm_flg = '1'
					AND	(w.wg_cd = m1.wg_cd OR i_wg_cd = m1.wg_cd)
					AND	w.itm_cd = m1.chd_itm_cd
					AND	w.itm_sub1 = m1.chd_itm_sub1
					AND	w.itm_sub2 = m1.chd_itm_sub2
					AND	w.itm_sub3 = m1.chd_itm_sub3
					AND	(l_ver_no IS NULL OR m1.ver_no = l_ver_no)
					AND	i_base_dt BETWEEN m1.st_dt AND m1.end_dt
					AND	(
						i_sno1 IS NULL AND m1.min_sno1 IS NULL AND m1.max_sno1 IS NULL
						OR
						i_sno1 IS NOT NULL
							AND (m1.min_sno1 IS NULL OR m1.min_sno1 <= i_sno1)
							AND (m1.max_sno1 IS NULL OR m1.max_sno1 >= i_sno1)
						)
					AND	(i_sno2 IS NULL AND m1.min_sno2 IS NULL AND m1.max_sno2 IS NULL
						OR
						i_sno2 IS NOT NULL
							AND (m1.min_sno2 IS NULL OR m1.min_sno2 <= i_sno2)
							AND (m1.max_sno2 IS NULL OR m1.max_sno2 >= i_sno2)
						)
					AND	(i_sno3 IS NULL AND m1.min_sno3 IS NULL AND m1.max_sno3 IS NULL
						OR
						i_sno3 IS NOT NULL
							AND (m1.min_sno3 IS NULL OR m1.min_sno3 <= i_sno3)
							AND (m1.max_sno3 IS NULL OR m1.max_sno3 >= i_sno3)
						)
					AND	(i_sno4 IS NULL AND m1.min_sno4 IS NULL AND m1.max_sno4 IS NULL
						OR
						i_sno4 IS NOT NULL
							AND (m1.min_sno4 IS NULL OR m1.min_sno4 <= i_sno4)
							AND (m1.max_sno4 IS NULL OR m1.max_sno4 >= i_sno4)
						)
					AND	(
						l_lvl = 1 AND (i_bom_ptn IS NULL OR m1.bom_ptn = i_bom_ptn)
						OR
						l_lvl > 1 AND (i_bom_ptn_flg = '0' OR m1.bom_ptn = w.bom_ptn)
						)
					AND	(l_lvl = 1 OR m1.inpt_ctl_typ <> c_inpt_ctl_typ_no_mrp_inst AND m1.byprod_flg = '0')
					AND	(i_ph_ex_flg = '0' OR w.ph_flg = '0' OR m1.ph_flg = '0')
					AND	(
						m1.ph_flg = '0'
						OR
						m1.oper_cd IS NOT NULL AND w.oper_cd = m1.oper_cd AND w.oper_seq = m1.oper_seq
						OR
						m1.oper_cd IS NULL
						OR
						w.oper_cd IS NULL
						)
					)
				WHERE	0=0 
				AND	w.bom_lvl = l_lvl - 1
				AND	w.loop_flg = '0'
				AND	(w.chd_rqmt_qty IS NULL OR w.chd_rqmt_qty > 0 OR w.chd_inpt_qty > 0 OR w.fxd_chd_rqmt_qty > 0)
				) t
			WHERE 0=0
			ORDER BY t.par_itm_cd, t.par_itm_sub1, t.par_itm_sub2, t.par_itm_sub3, t.bom_ptn,
				CASE t.wg_cd
					WHEN c_null_val THEN 999
					ELSE 1
				END, t.wg_cd
		LOOP
			<<NEXT_X1>>
			BEGIN
				IF l_chk_bom.wg_cd IS NOT NULL
				AND l_chk_bom.par_itm_cd = x1.par_itm_cd
				AND l_chk_bom.par_itm_sub1 = x1.par_itm_sub1
				AND l_chk_bom.par_itm_sub2 = x1.par_itm_sub2
				AND l_chk_bom.par_itm_sub3 = x1.par_itm_sub3
				AND l_chk_bom.bom_ptn = x1.bom_ptn
				THEN
					EXIT NEXT_X1;
				ELSE
					l_chk_bom.wg_cd := x1.wg_cd;
					l_chk_bom.par_itm_cd := x1.par_itm_cd;
					l_chk_bom.par_itm_sub1 := x1.par_itm_sub1;
					l_chk_bom.par_itm_sub2 := x1.par_itm_sub2;
					l_chk_bom.par_itm_sub3 := x1.par_itm_sub3;
					l_chk_bom.bom_ptn := x1.bom_ptn;
				END IF;

				FOR x IN
					SELECT	w.sort_no,
						m1.oper_cd, m1.oper_seq,
						m1.par_itm_cd,
						m1.par_itm_sub1, m1.par_itm_sub2, m1.par_itm_sub3,
						m1.bom_ptn,
						m1.ver_no,
						m1.ph_flg,
						m1.ph_bom_ptn,
						m1.alt_itm_flg,
						m1.alt_grp_cd,
						m1.alt_itm_typ,
						m1.alt_itm_ratio,
						m1.alt_alloc_prio,
						m1.sno_typ1,
						m1.sno_typ2, m1.sno_typ3, m1.sno_typ4,
						m1.min_sno1, m1.max_sno1,
						m1.min_sno2, m1.max_sno2,
						m1.min_sno3, m1.max_sno3,
						m1.min_sno4, m1.max_sno4,
						m1.par_inst_qty,
						m1.chd_rqmt_qty,
						m1.chd_inpt_qty,
						m1.fxd_chd_rqmt_qty,
						m1.byprod_flg,
						m1.in_offst_typ,
						m1.in_offst,
						m1.bkf_typ,
						m1.inst_lot_fix_flg,
						m1.lot_mix_flg,
						m1.sublot_mix_flg,
						m1.alloc_ctl_typ,
						m1.main_itm_flg,
						m1.inpt_ctl_typ,
						m1.yield_calc_flg,
						m1.disp_seq,
						m1.chng_no,
						m1.ext_sys_no_bom,
						m1.not_cost_flg,
						m1.st_dt,
						m1.end_dt,
						m1.chd_itm_cd,
						m1.chd_itm_sub1,
						m1.chd_itm_sub2,
						m1.chd_itm_sub3
					FROM maw_bom_ex w
						JOIN mavm_bom_dply m1 ON
							(0=0
							AND w.itm_cd = m1.chd_itm_cd
							AND	w.itm_sub1 = m1.chd_itm_sub1
							AND	w.itm_sub2 = m1.chd_itm_sub2
							AND	w.itm_sub3 = m1.chd_itm_sub3
							AND	(l_ver_no IS NULL OR m1.ver_no = l_ver_no)
							AND	i_base_dt BETWEEN m1.st_dt AND m1.end_dt
							AND	(
								i_sno1 IS NULL AND m1.min_sno1 IS NULL AND m1.max_sno1 IS NULL
								OR
								i_sno1 IS NOT NULL
									AND (m1.min_sno1 IS NULL OR m1.min_sno1 <= i_sno1)
									AND (m1.max_sno1 IS NULL OR m1.max_sno1 >= i_sno1)
								)
							AND	(
								i_sno2 IS NULL AND m1.min_sno2 IS NULL AND m1.max_sno2 IS NULL
								OR
								i_sno2 IS NOT NULL
									AND (m1.min_sno2 IS NULL OR m1.min_sno2 <= i_sno2)
									AND (m1.max_sno2 IS NULL OR m1.max_sno2 >= i_sno2)
								)
							AND	(
								i_sno3 IS NULL AND m1.min_sno3 IS NULL AND m1.max_sno3 IS NULL
								OR
								i_sno3 IS NOT NULL
									AND (m1.min_sno3 IS NULL OR m1.min_sno3 <= i_sno3)
									AND (m1.max_sno3 IS NULL OR m1.max_sno3 >= i_sno3)
								)
							AND	(
								i_sno4 IS NULL AND m1.min_sno4 IS NULL AND m1.max_sno4 IS NULL
								OR
								i_sno4 IS NOT NULL
									AND (m1.min_sno4 IS NULL OR m1.min_sno4 <= i_sno4)
									AND (m1.max_sno4 IS NULL OR m1.max_sno4 >= i_sno4)
								)
							AND	m1.wg_cd = l_chk_bom.wg_cd
							AND	m1.par_itm_cd = l_chk_bom.par_itm_cd
							AND	m1.par_itm_sub1 = l_chk_bom.par_itm_sub1
							AND	m1.par_itm_sub2 = l_chk_bom.par_itm_sub2
							AND	m1.par_itm_sub3 = l_chk_bom.par_itm_sub3
							AND	m1.bom_ptn = l_chk_bom.bom_ptn
							AND	(
								l_lvl = 1 AND (i_bom_ptn IS NULL OR m1.bom_ptn = i_bom_ptn)
								OR
								l_lvl > 1 AND (i_bom_ptn_flg = '0' OR m1.bom_ptn = w.bom_ptn)
								)
							AND	(l_lvl = 1 OR m1.inpt_ctl_typ <> c_inpt_ctl_typ_no_mrp_inst AND m1.byprod_flg = '0') 
							AND	(i_ph_ex_flg = '0' OR w.ph_flg = '0' OR m1.ph_flg = '0')
							AND	(
								m1.ph_flg = '0'
								OR
								m1.oper_cd IS NOT NULL AND w.oper_cd = m1.oper_cd AND w.oper_seq = m1.oper_seq
								OR
								m1.oper_cd IS NULL
								OR
								w.oper_cd IS NULL
								)
							)
					WHERE	0=0
					AND	w.bom_lvl = l_lvl - 1
					AND	w.loop_flg = '0'
					AND	(w.chd_rqmt_qty IS NULL OR w.chd_rqmt_qty > 0 OR w.chd_inpt_qty > 0 OR w.fxd_chd_rqmt_qty > 0)
					ORDER BY m1.par_itm_cd, m1.par_itm_sub1, m1.par_itm_sub2, m1.par_itm_sub3, 
						m1.oper_cd, m1.oper_seq, m1.disp_seq, m1.alt_grp_cd, m1.ver_no, m1.bom_key
				LOOP
					l_tmp_bom.bom_lvl := l_lvl;
					l_tmp_bom.bottom_flg := '1';
					l_tmp_bom.loop_flg := '0';
					l_tmp_bom.wg_cd := c_null_val;
					l_tmp_bom.itm_cd := x.par_itm_cd;
					l_tmp_bom.itm_sub1 := x.par_itm_sub1;
					l_tmp_bom.itm_sub2 := x.par_itm_sub2;
					l_tmp_bom.itm_sub3 := x.par_itm_sub3;
					l_tmp_bom.ver_no := x.ver_no;
					l_tmp_bom.bom_ptn := x.bom_ptn;
					l_tmp_bom.oper_cd := x.oper_cd;
					l_tmp_bom.oper_seq := x.oper_seq;
					l_tmp_bom.ph_flg := x.ph_flg;
					l_tmp_bom.ph_bom_ptn := x.ph_bom_ptn;
					l_tmp_bom.alt_itm_flg := x.alt_itm_flg;
					l_tmp_bom.alt_grp_cd := x.alt_grp_cd;
					l_tmp_bom.alt_itm_typ := x.alt_itm_typ;
					l_tmp_bom.alt_itm_ratio := x.alt_itm_ratio;
					l_tmp_bom.alt_alloc_prio := x.alt_alloc_prio;
					l_tmp_bom.sno_typ1 := x.sno_typ1;
					l_tmp_bom.sno_typ2 := x.sno_typ2;
					l_tmp_bom.sno_typ3 := x.sno_typ3;
					l_tmp_bom.sno_typ4 := x.sno_typ4;
					l_tmp_bom.min_sno1 := x.min_sno1;
					l_tmp_bom.max_sno1 := x.max_sno1;
					l_tmp_bom.min_sno2 := x.min_sno2;
					l_tmp_bom.max_sno2 := x.max_sno2;
					l_tmp_bom.min_sno3 := x.min_sno3;
					l_tmp_bom.max_sno3 := x.max_sno3;
					l_tmp_bom.min_sno4 := x.min_sno4;
					l_tmp_bom.max_sno4 := x.max_sno4;
					l_tmp_bom.par_inst_qty := x.par_inst_qty;
					l_tmp_bom.chd_rqmt_qty := x.chd_rqmt_qty;
					l_tmp_bom.chd_inpt_qty := x.chd_inpt_qty;
					l_tmp_bom.fxd_chd_rqmt_qty := x.fxd_chd_rqmt_qty;
					l_tmp_bom.byprod_flg := x.byprod_flg;
					l_tmp_bom.in_offst_typ := x.in_offst_typ;
					l_tmp_bom.in_offst := x.in_offst;
					l_tmp_bom.bkf_typ := x.bkf_typ;
					l_tmp_bom.inst_lot_fix_flg := x.inst_lot_fix_flg;
					l_tmp_bom.lot_mix_flg := x.lot_mix_flg;
					l_tmp_bom.sublot_mix_flg := x.sublot_mix_flg;
					l_tmp_bom.alloc_ctl_typ := x.alloc_ctl_typ;
					l_tmp_bom.main_itm_flg := x.main_itm_flg;
					l_tmp_bom.inpt_ctl_typ := x.inpt_ctl_typ;
					l_tmp_bom.yield_calc_flg := x.yield_calc_flg;
					l_tmp_bom.disp_seq := x.disp_seq;
					l_tmp_bom.chng_no := x.chng_no;
					l_tmp_bom.ext_sys_no_bom := x.ext_sys_no_bom;
					l_tmp_bom.not_cost_flg := x.not_cost_flg;
					l_tmp_bom.st_dt := x.st_dt;
					l_tmp_bom.end_dt := x.end_dt;
					l_tmp_bom.par_itm_cd := x.chd_itm_cd;
					l_tmp_bom.par_itm_sub1 := x.chd_itm_sub1;
					l_tmp_bom.par_itm_sub2 := x.chd_itm_sub2;
					l_tmp_bom.par_itm_sub3 := x.chd_itm_sub3;
					l_tmp_bom.par_sort_no := x.sort_no;
					l_tmp_seq := l_seq;

					IF i_ph_ex_flg = '1' THEN
						l_tmp_bom.sort_no := x.sort_no;
						CALL mapa_bom$p_ex_ph_rev(l_tmp_bom, i_base_dt, i_bom_ptn, i_bom_ptn_flg, i_wg_cd, i_sno1, i_sno2, i_sno3, i_sno4, l_seq, g_bom);
					END IF;

					IF l_tmp_seq = l_seq THEN
						l_seq := l_seq + 1;
						IF l_seq > c_max_itm_num THEN
							EXIT;
						END IF;


						l_tmp_bom.sort_no := RPAD(fcpa_postgres_util$substr(x.sort_no, 1, l_lvl * c_max_itm) || LPAD(l_seq::VARCHAR, c_max_itm, '0'), c_sort_digit, '0') ;
						g_bom[COALESCE(array_length(g_bom, 1), 0)+1] := l_tmp_bom;
					END IF;

					IF COALESCE(array_length(g_bom, 1), 0) > c_max_cnt THEN
						CALL mapa_bom$p_ins_rec(g_bom);
					END IF;
				END LOOP;
			END;
		END LOOP;

		IF l_lvl >= c_max_lvl OR l_seq = 0 THEN
			IF l_lvl >= c_max_lvl THEN
				l_stop_flg := '1';
			END IF;
			EXIT;
		END IF;

		CALL mapa_bom$p_ins_rec(g_bom);
		CALL mapa_bom$p_sum_rec(l_lvl);
		CALL mapa_bom$p_upd_loop(l_lvl);

	END LOOP;

	UPDATE maw_bom_ex w
	SET bottom_flg = '0'
	WHERE 0=0
	AND (
		l_stop_flg = '1' AND w.bom_lvl = i_max_hrrchy
		OR
		EXISTS (
			SELECT 'X'
			FROM maw_bom_ex w2
			WHERE 0=0
			AND w2.par_sort_no = w.sort_no
			)
		)
	;

	IF i_ph_ex_flg = '1' THEN
		DELETE FROM maw_bom_ex w
		WHERE 0=0
		AND w.ph_flg = '1'
		AND w.bottom_flg = '1'
		;

		UPDATE maw_bom_ex w
		SET ph_flg = '0'
		WHERE 0=0
		AND w.ph_flg = '1'
		;
	END IF;

	UPDATE maw_bom_ex w
	SET wg_cd = i_wg_cd
	WHERE 0=0
	AND w.wg_cd = c_null_val
	;

	g_bom := '{}';
END;
$BODY$
LANGUAGE plpgsql
;

