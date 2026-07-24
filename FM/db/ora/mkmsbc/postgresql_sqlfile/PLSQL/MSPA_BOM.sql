\encoding UTF-8

CREATE OR REPLACE PROCEDURE mspa_bom$p_ex_ph(
	 IN i_ph_bom msw_bom_exp_rslt,
	 IN i_bom_ptn VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_all_oper_null_flg CHARACTER,	/* これまでの全ての階層において工程がNULLであったかどうか */
	 INOUT o_alt_grp_seq NUMERIC,
	 INOUT o_alt_grp_seq_array msw_bom_exp_rslt[]
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	ファントム品の展開処理
<REMARKS>
<ARGUMENTS>
<HISTORY>
**********************************************************/
DECLARE
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');
	c_sno_typ_extnd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SNO_TYP','EXTND');
	c_sno_typ_extnd_null CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SNO_TYP','EXTND_NULL');

	l_rec_bom msw_bom_exp_rslt%ROWTYPE;
	l_alt_grp_cd mam_alt_grp.alt_grp_cd%TYPE;
	l_alt_itm_flg CHAR(1);
	l_all_oper_null_flg CHAR(1);

	o_alt_grp_seq_array_value msw_bom_exp_rslt%ROWTYPE;
	l_previous_level_alt_grp_seq_array msw_bom_exp_rslt[];
	l_loopcount integer;
	l_exist_flg CHAR(1);

	x RECORD;
BEGIN
	l_exist_flg := '0';
	l_previous_level_alt_grp_seq_array := o_alt_grp_seq_array;

	FOR x IN
		SELECT
			i_ph_bom.peg_no,
			CASE
				WHEN t2.alt_itm_flg = '0' THEN t2.bom_key
				ELSE NULL
			END AS bom_key,
			i_ph_bom.itm_ord_no,
			t2.par_itm_cd,
			t2.par_itm_sub1,
			t2.par_itm_sub2,
			t2.par_itm_sub3,
			t2.chd_itm_cd AS itm_cd,
			t2.chd_itm_sub1 AS itm_sub1,
			t2.chd_itm_sub2 AS itm_sub2,
			t2.chd_itm_sub3 AS itm_sub3,
			t2.ver_no,
			t2.par_inst_qty,
			CASE t2.par_inst_qty
				WHEN 0 THEN 0
				ELSE i_ph_bom.chd_rqmt_qty * t2.chd_rqmt_qty / t2.par_inst_qty
			END AS chd_rqmt_qty,
			CASE t2.par_inst_qty
				WHEN 0 THEN 0
				ELSE i_ph_bom.chd_inpt_qty * t2.chd_inpt_qty / t2.par_inst_qty
			END AS chd_inpt_qty,
			CASE t2.par_inst_qty
				WHEN 0 THEN t2.fxd_chd_rqmt_qty
				ELSE i_ph_bom.fxd_chd_rqmt_qty * t2.chd_rqmt_qty / t2.par_inst_qty + t2.fxd_chd_rqmt_qty
			END AS fxd_chd_rqmt_qty,
			t2.chd_rqmt_ratio,
			t2.chd_inpt_ratio,
			i_ph_bom.rqmt_qty * t2.chd_rqmt_qty / t2.par_inst_qty + t2.fxd_chd_rqmt_qty AS rqmt_qty,
			i_ph_bom.rqmt_qty * t2.chd_rqmt_qty / t2.par_inst_qty AS loss_rqmt_qty,
			i_ph_bom.rqmt_qty * t2.chd_inpt_qty / t2.par_inst_qty AS inpt_qty,
			t2.fxd_chd_rqmt_qty AS fxd_rqmt_qty,
			t2.alt_itm_flg,
			t2.alt_grp_cd,
			t2.alt_itm_typ,
			t2.alt_itm_ratio,
			t2.alt_alloc_prio,
			CASE t2.ph_flg
				WHEN '1' THEN i_ph_bom.sno1
				ELSE
					CASE t2.sno_typ1
						WHEN c_sno_typ_extnd THEN i_ph_bom.sno1
						WHEN c_sno_typ_extnd_null THEN i_ph_bom.sno1
						ELSE c_null_val
					END
			END AS sno1,
			t2.sno_typ1,
			CASE t2.ph_flg
				WHEN '1' THEN i_ph_bom.sno2
				ELSE
					CASE t2.sno_typ2
						WHEN c_sno_typ_extnd THEN i_ph_bom.sno2
						WHEN c_sno_typ_extnd_null THEN i_ph_bom.sno2
						ELSE c_null_val
					END
			END AS sno2,
			t2.sno_typ2,
			CASE t2.ph_flg
				WHEN '1' THEN i_ph_bom.sno3
				ELSE
					CASE t2.sno_typ3
						WHEN c_sno_typ_extnd THEN i_ph_bom.sno3
						WHEN c_sno_typ_extnd_null THEN i_ph_bom.sno3
						ELSE c_null_val
					END
			END AS sno3,
			t2.sno_typ3,
			CASE t2.ph_flg
				WHEN '1' THEN i_ph_bom.sno4
				ELSE
					CASE t2.sno_typ4
						WHEN c_sno_typ_extnd THEN i_ph_bom.sno4
						WHEN c_sno_typ_extnd_null THEN i_ph_bom.sno4
						ELSE c_null_val
					END
			END AS sno4,
			t2.sno_typ4,
			t2.byprod_flg,
			t2.in_offst_typ,
			t2.in_offst,
			t2.bkf_typ,
			t2.inst_lot_fix_flg,
			t2.lot_mix_flg,
			t2.sublot_mix_flg,
			t2.alloc_ctl_typ,
			t2.main_itm_flg,
			t2.yield_calc_flg,
			t2.inpt_ctl_typ,
			t2.disp_seq,
			t2.memo1,
			t2.memo2,
			t2.memo3,
			i_ph_bom.cur_cd AS cur_cd,
			t2.ph_flg,
			t2.ph_bom_ptn,
			t2.oper_cd,
			t2.oper_seq
		FROM	(
			SELECT	t.peg_no,
				t.itm_ord_no,
				t.oper_ord_no,
				t.oper_cd,
				t.oper_seq,
				t.mst_wg_cd AS wg_cd
			FROM	msw_bom_exp t
			WHERE	0=0
			AND	t.peg_no = i_ph_bom.peg_no
			) t1,
			mavm_bom t2,
			mam_itm t3
		WHERE	0=0
		AND	t2.par_itm_cd = i_ph_bom.itm_cd
		AND	t2.par_itm_sub1 = i_ph_bom.itm_sub1
		AND	t2.par_itm_sub2 = i_ph_bom.itm_sub2
		AND	t2.par_itm_sub3 = i_ph_bom.itm_sub3
		AND	t2.bom_ptn = i_bom_ptn
		AND	t2.chd_itm_cd = t3.itm_cd
		AND	t2.chd_itm_sub1 = t3.itm_sub1
		AND	t2.chd_itm_sub2 = t3.itm_sub2
		AND	t2.chd_itm_sub3 = t3.itm_sub3
		AND	(c_null_val = t1.oper_cd
			OR (t1.oper_cd = t2.oper_cd AND t1.oper_seq = t2.oper_seq)
			/* まだ下に架空品が存在する場合は、NULLも展開対象 */
			OR (t2.oper_cd IS NULL AND t2.ph_flg = '1')
			/* 最下層（T2.PH_FLG='0'）の場合、これまでの階層で工程が指定されていなければならない */
			OR (t2.oper_cd IS NULL AND t2.ph_flg = '0' AND i_all_oper_null_flg = '0')
		)
		AND i_base_dt BETWEEN t2.st_dt AND t2.end_dt
		AND (
			t2.min_sno1 IS NULL AND t2.max_sno1 IS NULL
			OR
			(c_null_val <> i_ph_bom.sno1
				AND (t2.min_sno1 <= i_ph_bom.sno1 OR t2.min_sno1 IS NULL)
				AND (t2.max_sno1 >= i_ph_bom.sno1 OR t2.max_sno1 IS NULL)
			)
		)
		AND (
			t2.min_sno2 IS NULL AND t2.max_sno2 IS NULL
			OR
			(c_null_val <> i_ph_bom.sno2
				AND (t2.min_sno2 <= i_ph_bom.sno2 OR t2.min_sno2 IS NULL)
				AND (t2.max_sno2 >= i_ph_bom.sno2 OR t2.max_sno2 IS NULL)
			)
		)
		AND (
			t2.min_sno3 IS NULL AND t2.max_sno3 IS NULL
			OR
			(c_null_val <> i_ph_bom.sno3
				AND (t2.min_sno3 <= i_ph_bom.sno3 OR t2.min_sno3 IS NULL)
				AND (t2.max_sno3 >= i_ph_bom.sno3 OR t2.max_sno3 IS NULL)
			)
		)
		AND (
			t2.min_sno4 IS NULL AND t2.max_sno4 IS NULL
			OR
			(c_null_val <> i_ph_bom.sno4
				AND (t2.min_sno4 <= i_ph_bom.sno4 OR t2.min_sno4 IS NULL)
				AND (t2.max_sno4 >= i_ph_bom.sno4 OR t2.max_sno4 IS NULL)
			)
		)
		AND t1.wg_cd = t2.wg_cd
		AND t2.del_flg = '0'
		-- 代替品目フラグがオンのレコードから先に処理して、架空品は最後に処理する
		ORDER BY t1.peg_no, t2.alt_grp_cd, t2.alt_itm_flg DESC, itm_cd, itm_sub1, itm_sub2, itm_sub3, t2.disp_seq, t2.ph_flg
	LOOP
		IF x.alt_grp_cd IS NULL THEN
			l_rec_bom.alt_grp_seq := NULL;
		ELSE

			-- 配列の中身を参照するに当たり、上記のIF文内ではスコープが合わず、配列の要素が取得できないため、
			-- 代替G連番の採番を以下で行う。
			IF array_length(o_alt_grp_seq_array, 1) IS NOT NULL THEN
				FOR l_loopcount in 1..array_length(o_alt_grp_seq_array, 1) LOOP

					IF x.alt_itm_flg = '1' THEN
						IF o_alt_grp_seq_array[l_loopcount].alt_grp_cd = x.alt_grp_cd AND o_alt_grp_seq_array[l_loopcount].itm_cd = x.itm_cd
							AND o_alt_grp_seq_array[l_loopcount].itm_sub1 = x.itm_sub1 AND o_alt_grp_seq_array[l_loopcount].itm_sub2 = x.itm_sub2
							AND o_alt_grp_seq_array[l_loopcount].itm_sub3 = x.itm_sub3
							AND (o_alt_grp_seq_array[l_loopcount].ver_no = x.ver_no OR (o_alt_grp_seq_array[l_loopcount].ver_no IS NULL AND x.ver_no IS NULL)) THEN
							-- 代替グループCD、品目が同一のものがすでに格納されている場合は格納されている値を使用する。
							o_alt_grp_seq_array_value := o_alt_grp_seq_array[l_loopcount];
							o_alt_grp_seq := o_alt_grp_seq_array_value.alt_grp_seq + 1;
							o_alt_grp_seq_array_value.alt_grp_seq := o_alt_grp_seq;
							o_alt_grp_seq_array[l_loopcount] := o_alt_grp_seq_array_value;
							l_exist_flg := '1';
							EXIT;
						END IF;

					ELSE
						-- 代替品目以外の場合、各代替Ｇで１度だけ連番を増やす
						IF o_alt_grp_seq_array[l_loopcount].alt_grp_cd = x.alt_grp_cd THEN
							IF (l_alt_itm_flg = '1' OR l_alt_grp_cd <> x.alt_grp_cd OR l_alt_grp_cd IS NULL) THEN
								o_alt_grp_seq_array_value := o_alt_grp_seq_array[l_loopcount];
								o_alt_grp_seq := o_alt_grp_seq_array_value.alt_grp_seq + 1;
								o_alt_grp_seq_array_value.alt_grp_seq := o_alt_grp_seq;
								o_alt_grp_seq_array[l_loopcount] := o_alt_grp_seq_array_value;
								l_exist_flg := '1';
							ELSE
								o_alt_grp_seq_array_value := o_alt_grp_seq_array[l_loopcount];
								o_alt_grp_seq := o_alt_grp_seq_array_value.alt_grp_seq;
								l_exist_flg := '1';
								EXIT;
							END IF;
						END IF;
					END IF;
				END LOOP;
			END IF;

			IF l_exist_flg = '0' THEN
				-- l_exist_flgが0の場合、これまでの処理の中で1度も出現していない代替Gの品目であるため連番を1から振りなおす。
				o_alt_grp_seq := 1;
				IF x.alt_itm_flg = '1' AND array_length(l_previous_level_alt_grp_seq_array, 1) IS NOT NULL THEN
					FOR l_loopcount in 1..array_length(l_previous_level_alt_grp_seq_array, 1) LOOP
						IF l_previous_level_alt_grp_seq_array[l_loopcount].alt_grp_cd = x.alt_grp_cd THEN
							o_alt_grp_seq_array_value := l_previous_level_alt_grp_seq_array[l_loopcount];
							o_alt_grp_seq := o_alt_grp_seq_array_value.alt_grp_seq + 1;
							EXIT;
						END IF;
					END LOOP;
				END IF;
			END IF;
			l_rec_bom.alt_grp_seq := o_alt_grp_seq;
			l_alt_grp_cd := x.alt_grp_cd;
			l_alt_itm_flg := x.alt_itm_flg;
		END IF;
		l_rec_bom.peg_no := x.peg_no;
		l_rec_bom.bom_key := x.bom_key;
		l_rec_bom.itm_ord_no := x.itm_ord_no;
		l_rec_bom.itm_cd := x.itm_cd;
		l_rec_bom.itm_sub1 := x.itm_sub1;
		l_rec_bom.itm_sub2 := x.itm_sub2;
		l_rec_bom.itm_sub3 := x.itm_sub3;
		l_rec_bom.ver_no := x.ver_no;
		l_rec_bom.rqmt_qty := x.rqmt_qty;
		l_rec_bom.loss_rqmt_qty := x.loss_rqmt_qty;
		l_rec_bom.inpt_qty := x.inpt_qty;
		l_rec_bom.fxd_rqmt_qty := x.fxd_rqmt_qty;
		l_rec_bom.alt_itm_flg := x.alt_itm_flg;
		l_rec_bom.alt_grp_cd := x.alt_grp_cd;

		l_rec_bom.alt_itm_typ := x.alt_itm_typ;
		l_rec_bom.alt_itm_ratio := x.alt_itm_ratio;
		l_rec_bom.alt_alloc_prio := x.alt_alloc_prio;
		l_rec_bom.sno1 := x.sno1;
		l_rec_bom.sno_typ1 := x.sno_typ1;
		l_rec_bom.sno2 := x.sno2;
		l_rec_bom.sno_typ2 := x.sno_typ2;
		l_rec_bom.sno3 := x.sno3;
		l_rec_bom.sno_typ3 := x.sno_typ3;
		l_rec_bom.sno4 := x.sno4;
		l_rec_bom.sno_typ4 := x.sno_typ4;
		l_rec_bom.par_inst_qty := x.par_inst_qty;
		l_rec_bom.chd_rqmt_qty := x.chd_rqmt_qty;
		l_rec_bom.chd_inpt_qty := x.chd_inpt_qty;
		l_rec_bom.fxd_chd_rqmt_qty := x.fxd_chd_rqmt_qty;
		l_rec_bom.chd_rqmt_ratio := x.chd_rqmt_ratio;
		l_rec_bom.chd_inpt_ratio := x.chd_inpt_ratio;
		l_rec_bom.byprod_flg := x.byprod_flg;
		l_rec_bom.in_offst_typ := x.in_offst_typ;
		l_rec_bom.in_offst := i_ph_bom.in_offst + x.in_offst;
		l_rec_bom.bkf_typ := x.bkf_typ;
		l_rec_bom.inst_lot_fix_flg := x.inst_lot_fix_flg;
		l_rec_bom.lot_mix_flg := x.lot_mix_flg;
		l_rec_bom.sublot_mix_flg := x.sublot_mix_flg;
		l_rec_bom.alloc_ctl_typ := x.alloc_ctl_typ;
		l_rec_bom.main_itm_flg := x.main_itm_flg;
		l_rec_bom.yield_calc_flg := x.yield_calc_flg;
		l_rec_bom.inpt_ctl_typ := x.inpt_ctl_typ;
		l_rec_bom.disp_seq := x.disp_seq;
		l_rec_bom.memo1 := x.memo1;
		l_rec_bom.memo2 := x.memo2;
		l_rec_bom.memo3 := x.memo3;
		l_rec_bom.cur_cd := x.cur_cd;

		IF l_exist_flg = '0' THEN
			o_alt_grp_seq_array := array_prepend(l_rec_bom, o_alt_grp_seq_array);
		ELSE
			l_exist_flg := '0';
		END IF;

		IF x.ph_flg = '1' AND x.ph_bom_ptn IS NOT NULL THEN
			IF i_all_oper_null_flg = '1' AND x.oper_cd IS NULL THEN
				l_all_oper_null_flg := '1';
			ELSE
				l_all_oper_null_flg := '0';
			END IF;
			CALL mspa_bom$p_ex_ph(l_rec_bom, x.ph_bom_ptn, i_base_dt, l_all_oper_null_flg, o_alt_grp_seq, o_alt_grp_seq_array);
		ELSE
			INSERT INTO msw_bom_exp_rslt VALUES (l_rec_bom.*);
		END IF;
	END LOOP;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_bom$p_bom_exp()
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	品目オーダの構成展開処理
<REMARKS>
<ARGUMENTS>
<HISTORY>
**********************************************************/
DECLARE

	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');
	c_sno_typ_extnd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SNO_TYP','EXTND');
	c_sno_typ_extnd_null CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SNO_TYP','EXTND_NULL');

	l_alt_grp_seq msw_bom_exp_rslt.alt_grp_seq%TYPE;
	l_rec_bom msw_bom_exp_rslt%ROWTYPE;
	l_peg_no msw_bom_exp.peg_no%TYPE;
	l_alt_grp_cd mam_alt_grp.alt_grp_cd%TYPE;
	l_alt_itm_flg CHAR(1);
	l_all_oper_null_flg CHAR(1);

	l_alt_grp_seq_array msw_bom_exp_rslt[];
	l_alt_grp_seq_array_value msw_bom_exp_rslt%ROWTYPE;
	l_loopcount integer;
	l_exist_flg CHAR(1);

	x RECORD;
BEGIN
	l_alt_grp_seq := 0;
	l_exist_flg := '0';
	l_alt_grp_seq_array := array[]::msw_bom_exp_rslt[];

	CALL fcpa_postgres_util$p_truncate_work('msw_bom_exp_rslt');

	FOR x IN
		SELECT/*+
				NoSeqScan(mam_bom_mam_bom_all_org)
				*/
			t1.peg_no,
			CASE
				WHEN t2.alt_itm_flg = '0' THEN t2.bom_key
				ELSE NULL
			END AS bom_key,
			t1.itm_ord_no,
			t2.par_itm_cd,
			t2.par_itm_sub1,
			t2.par_itm_sub2,
			t2.par_itm_sub3,
			t2.chd_itm_cd AS itm_cd,
			t2.chd_itm_sub1 AS itm_sub1,
			t2.chd_itm_sub2 AS itm_sub2,
			t2.chd_itm_sub3 AS itm_sub3,
			t2.ver_no,
			t2.par_inst_qty,
			t2.chd_rqmt_qty,
			t2.chd_inpt_qty,
			t2.fxd_chd_rqmt_qty AS fxd_rqmt_qty,
			t2.chd_rqmt_ratio,
			t2.chd_inpt_ratio,
			t1.oper_schd_qty * t2.chd_rqmt_qty / t2.par_inst_qty + t2.fxd_chd_rqmt_qty AS rqmt_qty,
			t1.oper_schd_qty * t2.chd_rqmt_qty / t2.par_inst_qty AS loss_rqmt_qty,
			t1.oper_schd_qty * t2.chd_inpt_qty / t2.par_inst_qty AS inpt_qty,
			t2.fxd_chd_rqmt_qty,
			t2.alt_itm_flg,
			t2.alt_grp_cd,
			t2.alt_itm_typ,
			t2.alt_itm_ratio,
			t2.alt_alloc_prio,
			CASE t2.ph_flg
				WHEN '1' THEN t1.sno1
				ELSE
					CASE t2.sno_typ1
						WHEN c_sno_typ_extnd THEN t1.sno1
						WHEN c_sno_typ_extnd_null THEN t1.sno1
						ELSE c_null_val
					END
			END AS sno1,
			t2.sno_typ1,
			CASE t2.ph_flg
				WHEN '1' THEN t1.sno2
				ELSE
					CASE t2.sno_typ2
						WHEN c_sno_typ_extnd THEN t1.sno2
						WHEN c_sno_typ_extnd_null THEN t1.sno2
						ELSE c_null_val
					END
			END AS sno2,
			t2.sno_typ2,
			CASE t2.ph_flg
				WHEN '1' THEN t1.sno3
				ELSE
					CASE t2.sno_typ3
						WHEN c_sno_typ_extnd THEN t1.sno3
						WHEN c_sno_typ_extnd_null THEN t1.sno3
						ELSE c_null_val
					END
			END AS sno3,
			t2.sno_typ3,
			CASE t2.ph_flg
				WHEN '1' THEN t1.sno4
				ELSE
					CASE t2.sno_typ4
						WHEN c_sno_typ_extnd THEN t1.sno4
						WHEN c_sno_typ_extnd_null THEN t1.sno4
						ELSE c_null_val
					END
			END AS sno4,
			t2.sno_typ4,
			t2.byprod_flg,
			t2.in_offst_typ,
			t2.in_offst,
			t2.bkf_typ,
			t2.inst_lot_fix_flg,
			t2.lot_mix_flg,
			t2.sublot_mix_flg,
			t2.alloc_ctl_typ,
			t2.main_itm_flg,
			t2.yield_calc_flg,
			t2.inpt_ctl_typ,
			t2.disp_seq,
			t2.memo1,
			t2.memo2,
			t2.memo3,
			t1.CUR_CD,
			t2.ph_flg,
			t2.ph_bom_ptn,
			t2.oper_cd AS bom_oper_cd,
			t1.oper_loc_cd,
			t1.oper_cd,
			t1.oper_seq,
			t1.oper_schd_qty,
			t1.mfg_st_schd_dt,
			t1.st_schd_dt,
			t1.end_schd_dt
		FROM	msw_bom_exp t1,
			mavm_bom t2,
			mam_itm t3
		WHERE	0=0
		AND	t1.itm_cd = t2.par_itm_cd
		AND	t1.itm_sub1 = t2.par_itm_sub1
		AND	t1.itm_sub2 = t2.par_itm_sub2
		AND	t1.itm_sub3 = t2.par_itm_sub3
		AND	t1.bom_ptn = t2.bom_ptn
		AND	t2.chd_itm_cd = t3.itm_cd
		AND	t2.chd_itm_sub1 = t3.itm_sub1
		AND	t2.chd_itm_sub2 = t3.itm_sub2
		AND	t2.chd_itm_sub3 = t3.itm_sub3
		AND	(c_null_val = t1.oper_cd
			OR (t1.oper_cd = t2.oper_cd AND t1.oper_seq = t2.oper_seq)
			OR (t2.oper_cd IS NULL AND t2.ph_flg = '1')
		)
		AND	t1.mfg_st_schd_dt BETWEEN t2.st_dt AND t2.end_dt
		AND	(
			t2.min_sno1 IS NULL AND t2.max_sno1 IS NULL
			OR
			(c_null_val <> t1.sno1
				AND	(t2.min_sno1 <= t1.sno1 OR t2.min_sno1 IS NULL)
				AND	(t2.max_sno1 >= t1.sno1 OR t2.max_sno1 IS NULL)
			)
		)
		AND	(
			t2.min_sno2 IS NULL AND t2.max_sno2 IS NULL
			OR
			(c_null_val <> t1.sno2
				AND	(t2.min_sno2 <= t1.sno2 OR t2.min_sno2 IS NULL)
				AND	(t2.max_sno2 >= t1.sno2 OR t2.max_sno2 IS NULL)
			)
		)
		AND	(
			t2.min_sno3 IS NULL AND t2.max_sno3 IS NULL
			OR
			(c_null_val <> t1.sno3
				AND	(t2.min_sno3 <= t1.sno3 OR t2.min_sno3 IS NULL)
				AND	(t2.max_sno3 >= t1.sno3 OR t2.max_sno3 IS NULL)
			)
		)
		AND	(
			t2.min_sno4 IS NULL AND t2.max_sno4 IS NULL
			OR
			(c_null_val <> t1.sno4
				AND	(t2.min_sno4 <= t1.sno4 OR t2.min_sno4 IS NULL)
				AND	(t2.max_sno4 >= t1.sno4 OR t2.max_sno4 IS NULL)
			)
		)
		AND	t1.mst_wg_cd = t2.wg_cd
		AND	t2.del_flg = '0'
		-- 代替品目フラグがオンのレコードから先に処理して、架空品は最後に処理する
		ORDER BY t1.peg_no, t2.alt_grp_cd, t2.alt_itm_flg DESC, itm_cd, itm_sub1, itm_sub2, itm_sub3, t2.disp_seq, t2.ph_flg
	LOOP
		IF x.alt_grp_cd IS NULL THEN
			l_rec_bom.alt_grp_seq := NULL;
		ELSE

			-- 配列の中身を参照するに当たり、上記のIF文内ではスコープが合わず、配列の要素が取得できないため、
			-- 代替G連番の採番を以下で行う。
			IF array_length(l_alt_grp_seq_array, 1) IS NOT NULL THEN
				FOR l_loopcount in 1..array_length(l_alt_grp_seq_array, 1) LOOP

					IF x.alt_itm_flg = '1' THEN
						-- 配列の先頭には常に直前で操作した行データの値を設定しているため、
						-- 同一代替Gの品目で最初に発見したものの代替G連番をカウントアップする
						IF l_alt_grp_seq_array[l_loopcount].alt_grp_cd = x.alt_grp_cd AND l_alt_grp_seq_array[l_loopcount].itm_cd = x.itm_cd
							AND l_alt_grp_seq_array[l_loopcount].itm_sub1 = x.itm_sub1 AND l_alt_grp_seq_array[l_loopcount].itm_sub2 = x.itm_sub2
							AND l_alt_grp_seq_array[l_loopcount].itm_sub3 = x.itm_sub3
							AND (l_alt_grp_seq_array[l_loopcount].ver_no = x.ver_no OR (l_alt_grp_seq_array[l_loopcount].ver_no IS NULL AND x.ver_no IS NULL)) THEN
							l_alt_grp_seq_array_value := l_alt_grp_seq_array[l_loopcount];
							l_alt_grp_seq := l_alt_grp_seq_array_value.alt_grp_seq + 1;
							l_alt_grp_seq_array_value.alt_grp_seq := l_alt_grp_seq;
							l_alt_grp_seq_array[l_loopcount] := l_alt_grp_seq_array_value;
							l_exist_flg := '1';
							EXIT;
						END IF;
						
					ELSE
						-- 代替品目以外の場合、各代替Ｇで１度だけ連番を増やす
						IF l_alt_grp_seq_array[l_loopcount].alt_grp_cd = x.alt_grp_cd THEN
							IF l_alt_itm_flg = '1' OR l_alt_grp_cd <> x.alt_grp_cd OR l_peg_no <> x.peg_no THEN
								l_alt_grp_seq_array_value := l_alt_grp_seq_array[l_loopcount];
								l_alt_grp_seq := l_alt_grp_seq_array_value.alt_grp_seq + 1;
								l_alt_grp_seq_array_value.alt_grp_seq := l_alt_grp_seq;
								l_alt_grp_seq_array[l_loopcount] := l_alt_grp_seq_array_value;
								l_exist_flg := '1';
							ELSE
								l_alt_grp_seq_array_value := l_alt_grp_seq_array[l_loopcount];
								l_alt_grp_seq := l_alt_grp_seq_array_value.alt_grp_seq;
								l_exist_flg := '1';
								EXIT;
							END IF;
						END IF;
					END IF;
				END LOOP;
			END IF;

			IF l_exist_flg = '0' THEN
				-- l_exist_flgが0の場合、これまでの処理の中で1度も出現していない代替Gの品目であるため連番を1から振りなおす。
				l_alt_grp_seq := 1;
			END IF;
			l_rec_bom.alt_grp_seq := l_alt_grp_seq;
			l_alt_grp_cd := x.alt_grp_cd;
			l_alt_itm_flg := x.alt_itm_flg;
			l_peg_no := x.peg_no;
		END IF;
		l_rec_bom.peg_no := x.peg_no;
		l_rec_bom.bom_key := x.bom_key;
		l_rec_bom.itm_ord_no := x.itm_ord_no;
		l_rec_bom.itm_cd := x.itm_cd;
		l_rec_bom.itm_sub1 := x.itm_sub1;
		l_rec_bom.itm_sub2 := x.itm_sub2;
		l_rec_bom.itm_sub3 := x.itm_sub3;
		l_rec_bom.ver_no := x.ver_no;
		l_rec_bom.rqmt_qty := x.rqmt_qty;
		l_rec_bom.loss_rqmt_qty := x.loss_rqmt_qty;
		l_rec_bom.inpt_qty := x.inpt_qty;
		l_rec_bom.fxd_rqmt_qty := x.fxd_rqmt_qty;
		l_rec_bom.alt_itm_flg := x.alt_itm_flg;
		l_rec_bom.alt_grp_cd := x.alt_grp_cd;

		l_rec_bom.alt_itm_typ := x.alt_itm_typ;
		l_rec_bom.alt_itm_ratio := x.alt_itm_ratio;
		l_rec_bom.alt_alloc_prio := x.alt_alloc_prio;
		l_rec_bom.sno1 := x.sno1;
		l_rec_bom.sno_typ1 := x.sno_typ1;
		l_rec_bom.sno2 := x.sno2;
		l_rec_bom.sno_typ2 := x.sno_typ2;
		l_rec_bom.sno3 := x.sno3;
		l_rec_bom.sno_typ3 := x.sno_typ3;
		l_rec_bom.sno4 := x.sno4;
		l_rec_bom.sno_typ4 := x.sno_typ4;
		l_rec_bom.par_inst_qty := x.par_inst_qty;
		l_rec_bom.chd_rqmt_qty := x.chd_rqmt_qty;
		l_rec_bom.chd_inpt_qty := x.chd_inpt_qty;
		l_rec_bom.fxd_chd_rqmt_qty := x.fxd_chd_rqmt_qty;
		l_rec_bom.alt_itm_ratio := x.alt_itm_ratio;
		l_rec_bom.alt_alloc_prio := x.alt_alloc_prio;
		l_rec_bom.byprod_flg := x.byprod_flg;
		l_rec_bom.in_offst_typ := x.in_offst_typ;
		l_rec_bom.in_offst := x.in_offst;
		l_rec_bom.bkf_typ := x.bkf_typ;
		l_rec_bom.inst_lot_fix_flg := x.inst_lot_fix_flg;
		l_rec_bom.lot_mix_flg := x.lot_mix_flg;
		l_rec_bom.sublot_mix_flg := x.sublot_mix_flg;
		l_rec_bom.alloc_ctl_typ := x.alloc_ctl_typ;
		l_rec_bom.main_itm_flg := x.main_itm_flg;
		l_rec_bom.yield_calc_flg := x.yield_calc_flg;
		l_rec_bom.inpt_ctl_typ := x.inpt_ctl_typ;
		l_rec_bom.disp_seq := x.disp_seq;
		l_rec_bom.memo1 := x.memo1;
		l_rec_bom.memo2 := x.memo2;
		l_rec_bom.memo3 := x.memo3;
		l_rec_bom.cur_cd := x.cur_cd;

		IF l_exist_flg = '0' THEN
			l_alt_grp_seq_array := array_prepend(l_rec_bom, l_alt_grp_seq_array);
		ELSE
			l_exist_flg := '0';
		END IF;

		IF x.ph_flg = '1' AND x.ph_bom_ptn IS NOT NULL THEN
			IF x.bom_oper_cd IS NULL THEN
				l_all_oper_null_flg := '1';
			ELSE
				l_all_oper_null_flg := '0';
			END IF;
			CALL mspa_bom$p_ex_ph(l_rec_bom, x.ph_bom_ptn, x.mfg_st_schd_dt, l_all_oper_null_flg, l_alt_grp_seq, l_alt_grp_seq_array);
		ELSE
			INSERT INTO msw_bom_exp_rslt VALUES (l_rec_bom.*);
		END IF;

	END LOOP;

END;
$BODY$
LANGUAGE plpgsql
;
CREATE OR REPLACE PROCEDURE mspa_bom$p_bom_exp_no_recursive()
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	品目オーダの構成展開処理
<REMARKS>
<ARGUMENTS>
<HISTORY>
**********************************************************/
DECLARE

	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');
	c_sno_typ_extnd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SNO_TYP','EXTND');
	c_sno_typ_extnd_null CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SNO_TYP','EXTND_NULL');

	l_alt_grp_seq msw_bom_exp_rslt.alt_grp_seq%TYPE;
	l_rec_bom msw_bom_exp_rslt%ROWTYPE;
	l_peg_no msw_bom_exp.peg_no%TYPE;
	l_alt_grp_cd mam_alt_grp.alt_grp_cd%TYPE;
	l_alt_itm_flg CHAR(1);
	l_all_oper_null_flg CHAR(1);

	l_alt_grp_seq_array msw_bom_exp_rslt[];
	l_alt_grp_seq_array_value msw_bom_exp_rslt%ROWTYPE;
	l_loopcount integer;
	l_exist_flg CHAR(1);

	x RECORD;
	
BEGIN
	
	l_alt_grp_seq := 0;
	l_exist_flg := '0';
	l_alt_grp_seq_array := array[]::msw_bom_exp_rslt[];

	CALL fcpa_postgres_util$p_truncate_work('msw_bom_exp_rslt');

	FOR x IN
		WITH RECURSIVE bom_recursion AS (
			SELECT
				m.par_itm_cd AS master_par_itm_cd,
				m.par_itm_cd,
				m.par_itm_sub1,
				m.par_itm_sub2,
				m.par_itm_sub3,
				m.chd_itm_cd,
				p.bom_ptn,
				m.ph_bom_ptn,
				m.ph_flg,
				CASE m.ph_flg
					WHEN '1' THEN p.sno1
					ELSE
						CASE m.sno_typ1
							WHEN c_sno_typ_extnd THEN p.sno1
							WHEN c_sno_typ_extnd_null THEN p.sno1
							ELSE c_null_val
						END
				END AS sno1,
				CASE m.ph_flg
					WHEN '1' THEN p.sno2
					ELSE
						CASE m.sno_typ2
							WHEN c_sno_typ_extnd THEN p.sno2
							WHEN c_sno_typ_extnd_null THEN p.sno2
							ELSE c_null_val
						END
				END AS sno2,
				CASE m.ph_flg
					WHEN '1' THEN p.sno3
					ELSE
						CASE m.sno_typ3
							WHEN c_sno_typ_extnd THEN p.sno3
							WHEN c_sno_typ_extnd_null THEN p.sno3
							ELSE c_null_val
						END
				END AS sno3,
				CASE m.ph_flg
					WHEN '1' THEN p.sno4
					ELSE
						CASE m.sno_typ4
							WHEN c_sno_typ_extnd THEN p.sno4
							WHEN c_sno_typ_extnd_null THEN p.sno4
							ELSE c_null_val
						END
				END AS sno4,
				chd_itm_sub1, chd_itm_sub2, chd_itm_sub3,
				m.sno_typ1,m.sno_typ2,m.sno_typ3,m.sno_typ4,
				m.bom_key,
				m.par_inst_qty,
				m.fxd_chd_rqmt_qty,
				m.fxd_chd_rqmt_qty AS fxd_rqmt_qty,
				p.oper_schd_qty * m.chd_rqmt_qty / m.par_inst_qty + m.fxd_chd_rqmt_qty AS rqmt_qty,
				p.oper_schd_qty * m.chd_rqmt_qty / m.par_inst_qty AS loss_rqmt_qty,
				p.oper_schd_qty * m.chd_inpt_qty / m.par_inst_qty AS inpt_qty,
				CAST(m.chd_rqmt_qty AS NUMERIC(21,8)) AS chd_rqmt_qty,
				CAST(m.chd_inpt_qty AS NUMERIC(21,8)) AS chd_inpt_qty,
				p.peg_no AS master_peg_no,
				p.oper_cd AS master_oper_cd,
				p.oper_seq As master_oper_seq,
				p.oper_cd,
				p.oper_seq,
				p.mst_wg_cd,
				p.mfg_st_schd_dt,
				CASE
					WHEN m.oper_cd IS NULL THEN '1'
					ELSE '0'
				END AS all_oper_null_flg,
				m.ver_no,
				m.chd_rqmt_ratio,
				m.chd_inpt_ratio,
				m.alt_itm_flg,
				m.alt_grp_cd,
				m.alt_itm_typ,
				m.alt_itm_ratio,
				m.alt_alloc_prio,
				m.byprod_flg,
				m.in_offst_typ,
				m.in_offst,
				m.bkf_typ,
				m.inst_lot_fix_flg,
				m.lot_mix_flg,
				m.sublot_mix_flg,
				m.alloc_ctl_typ,
				m.main_itm_flg,
				m.yield_calc_flg,
				m.inpt_ctl_typ,
				m.disp_seq,
				m.memo1,
				m.memo2,
				m.memo3,
				m.oper_cd AS bom_oper_cd
			FROM
				mavm_bom m
			JOIN
				msw_bom_exp p
			ON
				p.itm_cd = m.par_itm_cd 
				AND p.itm_sub1 = m.par_itm_sub1
				AND p.itm_sub2 = m.par_itm_sub2
				AND p.itm_sub3 = m.par_itm_sub3
				AND p.bom_ptn = m.bom_ptn
			INNER JOIN
				mam_itm mi
			ON
				m.chd_itm_cd = mi.itm_cd
				AND m.chd_itm_sub1 = mi.itm_sub1
				AND m.chd_itm_sub2 = mi.itm_sub2
				AND m.chd_itm_sub3 = mi.itm_sub3
			WHERE 0 = 0
			AND	(c_null_val = p.oper_cd
				OR (p.oper_cd = m.oper_cd AND p.oper_seq = m.oper_seq)
				OR (m.oper_cd IS NULL AND m.ph_flg = '1')
			)
			AND	p.mfg_st_schd_dt BETWEEN m.st_dt AND m.end_dt
			AND	(
				m.min_sno1 IS NULL AND m.max_sno1 IS NULL
				OR
				(c_null_val <> p.sno1
					AND	(m.min_sno1 <= p.sno1 OR m.min_sno1 IS NULL)
					AND	(m.max_sno1 >= p.sno1 OR m.max_sno1 IS NULL)
				)
			)
			AND	(
				m.min_sno2 IS NULL AND m.max_sno2 IS NULL
				OR
				(c_null_val <> p.sno2
					AND	(m.min_sno2 <= p.sno2 OR m.min_sno2 IS NULL)
					AND	(m.max_sno2 >= p.sno2 OR m.max_sno2 IS NULL)
				)
			)
			AND	(
				m.min_sno3 IS NULL AND m.max_sno3 IS NULL
				OR
				(c_null_val <> p.sno3
					AND	(m.min_sno3 <= p.sno3 OR m.min_sno3 IS NULL)
					AND	(m.max_sno3 >= p.sno3 OR m.max_sno3 IS NULL)
				)
			)
			AND	(
				m.min_sno4 IS NULL AND m.max_sno4 IS NULL
				OR
				(c_null_val <> p.sno4
					AND	(m.min_sno4 <= p.sno4 OR m.min_sno4 IS NULL)
					AND	(m.max_sno4 >= p.sno4 OR m.max_sno4 IS NULL)
				)
			)
			AND	p.mst_wg_cd = m.wg_cd
			AND	m.del_flg = '0'
			UNION ALL

			SELECT
				r.master_par_itm_cd,
				b.par_itm_cd,
				b.par_itm_sub1,
				b.par_itm_sub2,
				b.par_itm_sub3,
				b.chd_itm_cd,
				r.bom_ptn,
				b.ph_bom_ptn,
				b.ph_flg,
				CASE b.ph_flg
					WHEN '1' THEN r.sno1
					ELSE
						CASE b.sno_typ1
							WHEN c_sno_typ_extnd THEN r.sno1
							WHEN c_sno_typ_extnd_null THEN r.sno1
							ELSE c_null_val
						END
				END AS sno1,
				CASE b.ph_flg
					WHEN '1' THEN r.sno2
					ELSE
						CASE b.sno_typ2
							WHEN c_sno_typ_extnd THEN r.sno2
							WHEN c_sno_typ_extnd_null THEN r.sno2
							ELSE c_null_val
						END
				END AS sno2,
				CASE b.ph_flg
					WHEN '1' THEN r.sno3
					ELSE
						CASE b.sno_typ3
							WHEN c_sno_typ_extnd THEN r.sno3
							WHEN c_sno_typ_extnd_null THEN r.sno3
							ELSE c_null_val
						END
				END AS sno3,
				CASE b.ph_flg
					WHEN '1' THEN r.sno4
					ELSE
						CASE b.sno_typ4
							WHEN c_sno_typ_extnd THEN r.sno4
							WHEN c_sno_typ_extnd_null THEN r.sno4
							ELSE c_null_val
						END
				END AS sno4,
				b.chd_itm_sub1, b.chd_itm_sub2, b.chd_itm_sub3,
				b.sno_typ1,b.sno_typ2,b.sno_typ3,b.sno_typ4,
				b.bom_key,
				b.par_inst_qty,
				b.fxd_chd_rqmt_qty,
				r.fxd_chd_rqmt_qty AS fxd_rqmt_qty,
				r.rqmt_qty * b.chd_rqmt_qty / b.par_inst_qty + b.fxd_chd_rqmt_qty AS rqmt_qty,
				r.rqmt_qty * b.chd_rqmt_qty / b.par_inst_qty AS loss_rqmt_qty,
				r.rqmt_qty * b.chd_inpt_qty / b.par_inst_qty AS inpt_qty,
				CAST(
					CASE b.par_inst_qty
						WHEN 0 THEN 0
						ELSE r.chd_rqmt_qty * b.chd_rqmt_qty / b.par_inst_qty
					END AS NUMERIC(21,8)
				) AS chd_rqmt_qty,
				CAST(
					CASE b.par_inst_qty
						WHEN 0 THEN 0
						ELSE r.chd_inpt_qty * b.chd_inpt_qty / b.par_inst_qty
					END AS NUMERIC(21,8)
				) AS chd_inpt_qty,
				r.master_peg_no,
				r.master_oper_cd,
				r.master_oper_seq,
				b.oper_cd,
				b.oper_seq,
				r.mst_wg_cd,
				r.mfg_st_schd_dt,
				CASE
					WHEN r.all_oper_null_flg = '1' AND b.oper_cd IS NULL THEN '1'
					ELSE '0'
				END AS all_oper_null_flg,
				b.ver_no,
				b.chd_rqmt_ratio,
				b.chd_inpt_ratio,
				b.alt_itm_flg,
				b.alt_grp_cd,
				b.alt_itm_typ,
				b.alt_itm_ratio,
				b.alt_alloc_prio,
				b.byprod_flg,
				b.in_offst_typ,
				b.in_offst,
				b.bkf_typ,
				b.inst_lot_fix_flg,
				b.lot_mix_flg,
				b.sublot_mix_flg,
				b.alloc_ctl_typ,
				b.main_itm_flg,
				b.yield_calc_flg,
				b.inpt_ctl_typ,
				b.disp_seq,
				b.memo1,
				b.memo2,
				b.memo3,
				b.oper_cd AS bom_oper_cd
			FROM
				mavm_bom b
			INNER JOIN
				bom_recursion r
			ON
				b.par_itm_cd = r.chd_itm_cd 
				AND b.par_itm_sub1 = r.chd_itm_sub1
				AND b.par_itm_sub2 = r.chd_itm_sub2
				AND b.par_itm_sub3 = r.chd_itm_sub3
				AND b.bom_ptn = r.ph_bom_ptn -- チャイルドアイテムのサブコードとBOMパターンも考慮して結合
			INNER JOIN
				mam_itm mi
			ON
				b.chd_itm_cd = mi.itm_cd
				AND b.chd_itm_sub1 = mi.itm_sub1
				AND b.chd_itm_sub2 = mi.itm_sub2
				AND b.chd_itm_sub3 = mi.itm_sub3
			WHERE 0=0
			AND r.mst_wg_cd = b.wg_cd
			AND	(c_null_val = r.master_oper_cd
				OR (r.master_oper_cd = b.oper_cd AND r.master_oper_seq = b.oper_seq)
				/* まだ下に架空品が存在する場合は、NULLも展開対象 */
				OR (b.oper_cd IS NULL AND b.ph_flg = '1')
				/* 最下層（b.PH_FLG='0'）の場合、これまでの階層で工程が指定されていなければならない */
				OR (b.oper_cd IS NULL AND b.ph_flg = '0' AND r.all_oper_null_flg = '0')
			)
			AND r.mfg_st_schd_dt BETWEEN b.st_dt AND b.end_dt
			AND (
				b.min_sno1 IS NULL AND b.max_sno1 IS NULL
				OR
				(c_null_val <> r.sno1
					AND (b.min_sno1 <= r.sno1 OR b.min_sno1 IS NULL)
					AND (b.max_sno1 >= r.sno1 OR b.max_sno1 IS NULL)
				)
			)
			AND (
				b.min_sno2 IS NULL AND b.max_sno2 IS NULL
				OR
				(c_null_val <> r.sno2
					AND (b.min_sno2 <= r.sno2 OR b.min_sno2 IS NULL)
					AND (b.max_sno2 >= r.sno2 OR b.max_sno2 IS NULL)
				)
			)
			AND (
				b.min_sno3 IS NULL AND b.max_sno3 IS NULL
				OR
				(c_null_val <> r.sno3
					AND (b.min_sno3 <= r.sno3 OR b.min_sno3 IS NULL)
					AND (b.max_sno3 >= r.sno3 OR b.max_sno3 IS NULL)
				)
			)
			AND (
				b.min_sno4 IS NULL AND b.max_sno4 IS NULL
				OR
				(c_null_val <> r.sno4
					AND (b.min_sno4 <= r.sno4 OR b.min_sno4 IS NULL)
					AND (b.max_sno4 >= r.sno4 OR b.max_sno4 IS NULL)
				)
			)
				AND r.ph_flg = '1'
		)

		SELECT
			t1.peg_no,
			CASE
				WHEN br.alt_itm_flg = '0' THEN br.bom_key
				ELSE NULL
			END AS bom_key,
			t1.itm_ord_no,
			br.par_itm_cd,
			br.par_itm_sub1,
			br.par_itm_sub2,
			br.par_itm_sub3,
			br.chd_itm_cd AS itm_cd,
			br.chd_itm_sub1 AS itm_sub1,
			br.chd_itm_sub2 AS itm_sub2,
			br.chd_itm_sub3 AS itm_sub3,
			br.ver_no,
			br.par_inst_qty,
			br.chd_rqmt_qty,
			br.chd_inpt_qty,
			br.fxd_chd_rqmt_qty AS fxd_rqmt_qty,
			br.fxd_rqmt_qty AS fxd_chd_rqmt_qty,
			br.chd_rqmt_ratio,
			br.chd_inpt_ratio,
			br.rqmt_qty,
			br.loss_rqmt_qty,
			br.inpt_qty,
			br.alt_itm_flg,
			br.alt_grp_cd,
			br.alt_itm_typ,
			br.alt_itm_ratio,
			br.alt_alloc_prio,
			CASE br.ph_flg
				WHEN '1' THEN t1.sno1
				ELSE
					CASE br.sno_typ1
						WHEN c_sno_typ_extnd THEN t1.sno1
						WHEN c_sno_typ_extnd_null THEN t1.sno1
						ELSE c_null_val
					END
			END AS sno1,
			br.sno_typ1,
			CASE br.ph_flg
				WHEN '1' THEN t1.sno2
				ELSE
					CASE br.sno_typ2
						WHEN c_sno_typ_extnd THEN t1.sno2
						WHEN c_sno_typ_extnd_null THEN t1.sno2
						ELSE c_null_val
					END
			END AS sno2,
			br.sno_typ2,
			CASE br.ph_flg
				WHEN '1' THEN t1.sno3
				ELSE
					CASE br.sno_typ3
						WHEN c_sno_typ_extnd THEN t1.sno3
						WHEN c_sno_typ_extnd_null THEN t1.sno3
						ELSE c_null_val
					END
			END AS sno3,
			br.sno_typ3,
			CASE br.ph_flg
				WHEN '1' THEN t1.sno4
				ELSE
					CASE br.sno_typ4
						WHEN c_sno_typ_extnd THEN t1.sno4
						WHEN c_sno_typ_extnd_null THEN t1.sno4
						ELSE c_null_val
					END
			END AS sno4,
			br.sno_typ4,
			br.byprod_flg,
			br.in_offst_typ,
			br.in_offst,
			br.bkf_typ,
			br.inst_lot_fix_flg,
			br.lot_mix_flg,
			br.sublot_mix_flg,
			br.alloc_ctl_typ,
			br.main_itm_flg,
			br.yield_calc_flg,
			br.inpt_ctl_typ,
			br.disp_seq,
			br.memo1,
			br.memo2,
			br.memo3,
			t1.CUR_CD,
			br.ph_flg,
			br.ph_bom_ptn,
			br.oper_cd AS bom_oper_cd,
			t1.oper_loc_cd,
			t1.oper_cd,
			t1.oper_seq,
			t1.oper_schd_qty,
			t1.mfg_st_schd_dt,
			t1.st_schd_dt,
			t1.end_schd_dt
		FROM
			bom_recursion br
		INNER JOIN
			msw_bom_exp t1
		ON
			t1.itm_cd = br.master_par_itm_cd
			AND t1.itm_sub1 = br.chd_itm_sub1
			AND t1.itm_sub2 = br.chd_itm_sub2
			AND t1.itm_sub3 = br.chd_itm_sub3
			AND t1.peg_no = br.master_peg_no
			AND t1.bom_ptn = br.bom_ptn
		WHERE
			br.ph_flg = '0' -- ファントム部品でないものを選択
		ORDER BY
			t1.peg_no, br.alt_grp_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3, br.disp_seq, br.alt_itm_flg, br.ph_flg
	LOOP

		IF (l_peg_no != x.peg_no) THEN
			l_alt_grp_seq_array := array[]::msw_bom_exp_rslt[];
		END IF;

		IF x.alt_grp_cd IS NULL THEN
			l_rec_bom.alt_grp_seq := NULL;
		ELSE
			IF (l_alt_grp_cd IS NULL OR l_alt_grp_cd <> x.alt_grp_cd OR l_alt_itm_flg <> x.alt_itm_flg) THEN
				l_alt_grp_cd := x.alt_grp_cd;
				l_alt_itm_flg := x.alt_itm_flg;
			END IF;
			
			-- 配列の中身を参照するに当たり、上記のIF文内ではスコープが合わず、配列の要素が取得できないため、
			-- 代替G連番の採番を以下で行う。
			IF array_length(l_alt_grp_seq_array, 1) IS NOT NULL THEN
				FOR l_loopcount in 1..array_length(l_alt_grp_seq_array, 1) LOOP
					-- 配列の先頭には常に直前で操作した行データの値を設定しているため、
					-- 同一代替Gの品目で最初に発見したものの代替G連番をカウントアップする
					IF l_alt_grp_seq_array[l_loopcount].alt_grp_cd = x.alt_grp_cd AND l_alt_grp_seq_array[l_loopcount].itm_cd = x.itm_cd
						AND l_alt_grp_seq_array[l_loopcount].itm_sub1 = x.itm_sub1 AND l_alt_grp_seq_array[l_loopcount].itm_sub2 = x.itm_sub2
						AND l_alt_grp_seq_array[l_loopcount].itm_sub3 = x.itm_sub3
						AND (l_alt_grp_seq_array[l_loopcount].ver_no = x.ver_no OR (l_alt_grp_seq_array[l_loopcount].ver_no IS NULL AND x.ver_no IS NULL)) THEN
						l_alt_grp_seq_array_value := l_alt_grp_seq_array[l_loopcount];
						l_alt_grp_seq := l_alt_grp_seq_array_value.alt_grp_seq + 1;
						l_alt_grp_seq_array_value.alt_grp_seq := l_alt_grp_seq;
						l_alt_grp_seq_array[l_loopcount] := l_alt_grp_seq_array_value;
						l_exist_flg := '1';
						EXIT;
					END IF;
				END LOOP;
			END IF;

			IF l_exist_flg = '0' THEN
				-- l_exist_flgが0の場合、これまでの処理の中で1度も出現していない代替Gの品目であるため連番を1から振りなおす。
				l_alt_grp_seq := 1;
			END IF;

			l_rec_bom.alt_grp_seq := l_alt_grp_seq;
		END IF;
		
		l_rec_bom.peg_no := x.peg_no;
		l_rec_bom.bom_key := x.bom_key;
		l_rec_bom.itm_ord_no := x.itm_ord_no;
		l_rec_bom.itm_cd := x.itm_cd;
		l_rec_bom.itm_sub1 := x.itm_sub1;
		l_rec_bom.itm_sub2 := x.itm_sub2;
		l_rec_bom.itm_sub3 := x.itm_sub3;
		l_rec_bom.ver_no := x.ver_no;
		l_rec_bom.rqmt_qty := x.rqmt_qty;
		l_rec_bom.loss_rqmt_qty := x.loss_rqmt_qty;
		l_rec_bom.inpt_qty := x.inpt_qty;
		l_rec_bom.fxd_rqmt_qty := x.fxd_rqmt_qty;
		l_rec_bom.alt_itm_flg := x.alt_itm_flg;
		l_rec_bom.alt_grp_cd := x.alt_grp_cd;

		l_rec_bom.alt_itm_typ := x.alt_itm_typ;
		l_rec_bom.alt_itm_ratio := x.alt_itm_ratio;
		l_rec_bom.alt_alloc_prio := x.alt_alloc_prio;
		l_rec_bom.sno1 := x.sno1;
		l_rec_bom.sno_typ1 := x.sno_typ1;
		l_rec_bom.sno2 := x.sno2;
		l_rec_bom.sno_typ2 := x.sno_typ2;
		l_rec_bom.sno3 := x.sno3;
		l_rec_bom.sno_typ3 := x.sno_typ3;
		l_rec_bom.sno4 := x.sno4;
		l_rec_bom.sno_typ4 := x.sno_typ4;
		l_rec_bom.par_inst_qty := x.par_inst_qty;
		l_rec_bom.chd_rqmt_qty := x.chd_rqmt_qty;
		l_rec_bom.chd_inpt_qty := x.chd_inpt_qty;
		l_rec_bom.fxd_chd_rqmt_qty := x.fxd_chd_rqmt_qty;
		l_rec_bom.alt_itm_ratio := x.alt_itm_ratio;
		l_rec_bom.alt_alloc_prio := x.alt_alloc_prio;
		l_rec_bom.byprod_flg := x.byprod_flg;
		l_rec_bom.in_offst_typ := x.in_offst_typ;
		l_rec_bom.in_offst := x.in_offst;
		l_rec_bom.bkf_typ := x.bkf_typ;
		l_rec_bom.inst_lot_fix_flg := x.inst_lot_fix_flg;
		l_rec_bom.lot_mix_flg := x.lot_mix_flg;
		l_rec_bom.sublot_mix_flg := x.sublot_mix_flg;
		l_rec_bom.alloc_ctl_typ := x.alloc_ctl_typ;
		l_rec_bom.main_itm_flg := x.main_itm_flg;
		l_rec_bom.yield_calc_flg := x.yield_calc_flg;
		l_rec_bom.inpt_ctl_typ := x.inpt_ctl_typ;
		l_rec_bom.disp_seq := x.disp_seq;
		l_rec_bom.memo1 := x.memo1;
		l_rec_bom.memo2 := x.memo2;
		l_rec_bom.memo3 := x.memo3;
		l_rec_bom.cur_cd := x.cur_cd;

		IF l_exist_flg = '0' THEN
			l_alt_grp_seq_array := array_prepend(l_rec_bom, l_alt_grp_seq_array);
		ELSE
			l_exist_flg := '0';
		END IF;

		INSERT INTO msw_bom_exp_rslt VALUES (l_rec_bom.*);

		l_peg_no := x.peg_no;

	END LOOP;
END;
$BODY$
LANGUAGE plpgsql
;

