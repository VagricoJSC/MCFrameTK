\encoding UTF-8

CREATE OR REPLACE PROCEDURE mgpa_imp_itm_oper$p_ins_mgw_main(
	 IN i_calc_ctg VARCHAR,
	 IN i_wg_cd VARCHAR,
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_imp_ope_typ VARCHAR)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		品目工程マスタ用のデータをコピー用ワークテーブルに作成する
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

	DELETE FROM	mgw_imp_itm_oper w
	WHERE	0=0
	AND w.calc_ctg_cd = l_calc_ctg_cd
	AND w.term = i_term
	AND (l_wg_cd IS NULL OR w.wg_cd = l_wg_cd)
	AND (i_imp_ope_typ = c_batch
			OR EXISTS (
				SELECT	'X'
				FROM	mgw_imp_interactive_key wk
				WHERE	0=0
				AND wk.itm_cd = w.itm_cd
				AND wk.itm_sub1 = w.itm_sub1
				AND wk.itm_sub2 = w.itm_sub2
				AND wk.itm_sub3 = w.itm_sub3
				AND wk.wg_cd = w.wg_cd
			)
		);

	/*** ＳＣＭのマスタからコピーする ***/
	INSERT INTO mgw_imp_itm_oper (
		itm_cd,
		itm_sub1,
		itm_sub2,
		itm_sub3,
		loc_cd,
		oper_ptn,
		oper_cd,
		oper_seq,
		term,
		calc_ctg_cd,
		wg_cd,
		disp_seq,
		nmr_qty,
		dnm_qty,
		yield_oper_flg,
		oper_unit_cd,
		oper_std_qty,
		oper_conv_qty,
		dec_place,
		unit_conv_rnd_typ,
		rmrks,
		sub_char1,
		sub_char2,
		sub_char3,
		non_calc_flg,
		imp_err_flg,
		imp_flg
		)
	SELECT
		m.itm_cd,
		m.itm_sub1,
		m.itm_sub2,
		m.itm_sub3,
		m.loc_cd,
		m.oper_ptn,
		m.oper_cd,
		m.oper_seq,
		m.term,
		l_calc_ctg_cd,
		m.wg_cd,
		m.disp_seq,
		1,
		1,
		m.yield_oper_flg,
		m.oper_unit_cd,
		m.oper_std_qty,
		m.oper_conv_qty,
		m.dec_place,
		m.unit_conv_rnd_typ,
		m.memo1,
		NULL,
		NULL,
		NULL,
		c_off,
		c_off,
		CASE i_imp_ope_typ
			WHEN c_interactive THEN c_on
			ELSE c_off
		END
	FROM	(
		SELECT
			m1.itm_cd,
			m1.itm_sub1,
			m1.itm_sub2,
			m1.itm_sub3,
			m1.loc_cd,
			m1.oper_ptn,
			m1.oper_cd,
			m1.oper_seq,
			m3.term,
			COALESCE(m4.wg_cd, c_null_val) AS wg_cd,
			m1.disp_seq,
			m1.yield_oper_flg,
			m1.oper_unit_cd,
			m1.oper_std_qty,
			m1.oper_conv_qty,
			m1.dec_place,
			m1.unit_conv_rnd_typ,
			m1.memo1,
			ROW_NUMBER() OVER (PARTITION BY
				m1.itm_cd,
				m1.itm_sub1,
				m1.itm_sub2,
				m1.itm_sub3,
				m1.loc_cd,
				m1.oper_ptn,
				m1.oper_cd,
				m1.oper_seq ORDER BY m1.st_dt) AS rn
		FROM	mam_itm_srch m2, mam_term m3, mam_itm_oper m1
			LEFT OUTER JOIN mam_loc m4
				ON (m1.loc_cd = m4.loc_cd)
		WHERE	0=0
		AND m1.itm_cd = m2.itm_cd
		AND m1.itm_sub1 = m2.itm_sub1
		AND m1.itm_sub2 = m2.itm_sub2
		AND m1.itm_sub3 = m2.itm_sub3
		AND m2.del_flg = c_off
		AND (
			i_dt IS NOT NULL AND m1.st_dt <= i_dt AND m1.end_dt >= i_dt
			OR
			i_dt IS NULL AND m1.st_dt < m3.term_end_ym AND m1.end_dt >= m3.term
			)
		AND m1.not_cost_flg = c_off
		AND m2.asset_mng_typ = c_mng
		AND m3.term = i_term
		AND (l_wg_cd IS NULL OR COALESCE(m4.wg_cd, c_null_val) = l_wg_cd)
		AND (i_imp_ope_typ = c_batch
				OR EXISTS (
					SELECT	'X'
					FROM	mgw_imp_interactive_key wk
					WHERE	0=0
					AND wk.itm_cd = m1.itm_cd
					AND wk.itm_sub1 = m1.itm_sub1
					AND wk.itm_sub2 = m1.itm_sub2
					AND wk.itm_sub3 = m1.itm_sub3
					AND wk.wg_cd = COALESCE(m4.wg_cd, c_null_val)
				)
			)
		) m
	WHERE	0=0
	AND m.rn = 1
	ORDER BY
		m.itm_cd, m.itm_sub1, m.itm_sub2, m.itm_sub3,
		m.loc_cd, m.oper_ptn, m.oper_cd, m.oper_seq;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_imp_itm_oper$p_imp_mgt_main(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_imp_ope_typ VARCHAR,
	 IN i_usr VARCHAR,
	 INOUT o_err_flg CHAR)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		原価マスタ取込(品目工程)
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
	j RECORD;
	k INTEGER := 0;
	l RECORD;

	l_chk_flg CHAR(1);
	l_parm mam_sys_parm.parm_val%TYPE;
	l_calc_ctg_cd mam_calc_ctg.calc_ctg_cd%TYPE;

	x RECORD;
	y RECORD;
	z RECORD;
BEGIN
	CALL fcpa_postgres_util$type_is_table_row('mgpa_imp_itm_oper$p_imp_mgt_main$l_imp', 'mgt_itm_oper', 'integer');
	CALL fcpa_postgres_util$type_is_table_row('mgpa_imp_itm_oper$p_imp_mgt_main$l_imp_tmp', 'mgt_itm_oper', 'integer');

	/* 確定品目は削除 */
	CALL mgpa_fix_del$p_itm_oper(i_usr, i_term);

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
			t.*, m.asset_mng_typ AS asset_mng_typ
		FROM	(
			SELECT DISTINCT
				w.itm_cd,
				w.itm_sub1,
				w.itm_sub2,
				w.itm_sub3
			FROM	mgw_imp_itm_oper w
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
						AND wk.itm_cd = w.itm_cd
						AND wk.itm_sub1 = w.itm_sub1
						AND wk.itm_sub2 = w.itm_sub2
						AND wk.itm_sub3 = w.itm_sub3
						AND wk.wg_cd = w.wg_cd
					)
				)
			) t
			LEFT OUTER JOIN mam_itm_srch m
				ON (t.itm_cd = m.itm_cd
				AND t.itm_sub1 = m.itm_sub1
				AND t.itm_sub2 = m.itm_sub2
				AND t.itm_sub3 = m.itm_sub3
				AND m.del_flg = c_off)
		WHERE	0=0
	LOOP
		/*** 品目チェック処理、エラーとなった品目と同じ品目のワークのデータは全件をエラーとして、取り込まない ***/
		IF z.asset_mng_typ IS NULL OR z.asset_mng_typ <> c_mng THEN
			IF z.asset_mng_typ IS NULL THEN
				/* 品目マスタに有効な品目として登録されていません。品目：{1} */
				CALL fcpa_batch_log$p_data_log('MGBDD0023', l_log_no, l_log_sub_key1, l_log_sub_key2,
					mapa_comm$f_to_disp_itm(z.itm_cd, z.itm_sub1, z.itm_sub2, z.itm_sub3, l_parm));
			ELSIF z.asset_mng_typ <> c_mng THEN
				/* 品目マスタに資産管理可能な品目として登録されていません。取込の対象にはなりません。品目：{1} */
				CALL fcpa_batch_log$p_data_log('MGBDD0024', l_log_no, l_log_sub_key1, l_log_sub_key2,
					mapa_comm$f_to_disp_itm(z.itm_cd, z.itm_sub1, z.itm_sub2, z.itm_sub3, l_parm));
			END IF;

			UPDATE mgw_imp_itm_oper w
			SET imp_err_flg = c_on
			WHERE	0=0
			AND w.itm_cd = z.itm_cd
			AND w.itm_sub1 = z.itm_sub1
			AND w.itm_sub2 = z.itm_sub2
			AND w.itm_sub3 = z.itm_sub3
			AND w.imp_flg = c_on
			AND w.upd_usr_id = i_usr
			AND w.term = i_term;

			o_err_flg := c_on;

		END IF;
	END LOOP;

	FOR x IN
		SELECT DISTINCT
			w.itm_cd,
			w.itm_sub1,
			w.itm_sub2,
			w.itm_sub3,
			w.wg_cd,
			w.term,
			w.calc_ctg_cd
		FROM	mgw_imp_itm_oper w
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
					AND wk.itm_cd = w.itm_cd
					AND wk.itm_sub1 = w.itm_sub1
					AND wk.itm_sub2 = w.itm_sub2
					AND wk.itm_sub3 = w.itm_sub3
					AND wk.wg_cd = w.wg_cd
				)
			)
	LOOP
		<<NEXT_LOOP>>
		BEGIN
			k := 0;

			FOR y IN
				SELECT
					w.itm_cd,
					w.itm_sub1,
					w.itm_sub2,
					w.itm_sub3,
					w.loc_cd,
					w.oper_ptn,
					w.oper_cd,
					w.oper_seq,
					w.term,
					w.calc_ctg_cd,
					w.wg_cd,
					w.disp_seq,
					w.nmr_qty,
					w.dnm_qty,
					w.yield_oper_flg,
					w.oper_unit_cd,
					w.oper_std_qty,
					w.oper_conv_qty,
					w.dec_place,
					w.unit_conv_rnd_typ,
					w.rmrks,
					w.sub_char1,
					w.sub_char2,
					w.sub_char3,
					w.non_calc_flg
				FROM	mgw_imp_itm_oper w
				WHERE	0=0
				AND w.itm_cd = x.itm_cd
				AND w.itm_sub1 = x.itm_sub1
				AND w.itm_sub2 = x.itm_sub2
				AND w.itm_sub3 = x.itm_sub3
				AND w.wg_cd = x.wg_cd
				AND w.term = x.term
				AND w.calc_ctg_cd = x.calc_ctg_cd
				AND w.upd_usr_id = i_usr
				AND w.imp_flg = c_on
			LOOP
				l_chk_flg := c_off;

				/*** 取込対象データのチェック、品目、ワーキンググループ、期、計算カテゴリ、ユーザ単位でチェックする ***/
				IF y.oper_unit_cd IS NOT NULL THEN
					IF y.oper_std_qty IS NULL
					OR y.oper_conv_qty IS NULL
					OR y.dec_place IS NULL
					OR y.unit_conv_rnd_typ IS NULL
					THEN
						/* 工程管理単位を設定する場合、次の項目は必須です。 */
						/* 工程管理単位、工程基準単位数量、工程換算単位数量、小数部有効桁数、換算端数処理区分 */
						/* 品目：{1} ワーキンググループ：{2} 期：{3} 計算カテゴリ：{4} 工程管理単位：{5} */
						CALL fcpa_batch_log$p_data_log('MGBDD0029', l_log_no, l_log_sub_key1, l_log_sub_key2,
							mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm),
							x.wg_cd,
							fcpa_date_util$f_to_char(x.term, fcpa_date_util$y4m()),
							x.calc_ctg_cd,
							y.oper_unit_cd);
						l_chk_flg := c_on;
					ELSE
						IF y.oper_std_qty <= 0 THEN
							/* 工程基準単位数量には正の数字を設定してください。 */
							/* 品目：{1} ワーキンググループ：{2} 期：{3} 計算カテゴリ：{4} 工程管理単位：{5} 工程基準単位数量：{6} */
							CALL fcpa_batch_log$p_data_log('MGBDD0030', l_log_no, l_log_sub_key1, l_log_sub_key2,
								mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm),
								x.wg_cd,
								fcpa_date_util$f_to_char(x.term, fcpa_date_util$y4m()),
								x.calc_ctg_cd,
								y.oper_unit_cd,
								y.oper_std_qty::VARCHAR);
							l_chk_flg := c_on;
						END IF;

						IF y.oper_conv_qty < 0 THEN
							/* 工程換算単位数量には0以上の数字を設定してください。 */
							/* 品目：{1} ワーキンググループ：{2} 期：{3} 計算カテゴリ：{4} 工程管理単位：{5} 工程換算単位数量：{6} */
							CALL fcpa_batch_log$p_data_log('MGBDD0031', l_log_no, l_log_sub_key1, l_log_sub_key2,
								mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm),
								x.wg_cd,
								fcpa_date_util$f_to_char(x.term, fcpa_date_util$y4m()),
								x.calc_ctg_cd,
								y.oper_unit_cd,
								y.oper_conv_qty::VARCHAR);
							l_chk_flg := c_on;
						END IF;

						IF y.dec_place < 0 OR y.dec_place > 8 THEN
							/* 小数部有効桁数には0～8の整数を設定してください。 */
							/* 品目：{1} ワーキンググループ：{2} 期：{3} 計算カテゴリ：{4} 工程管理単位：{5} 小数部有効桁数：{6} */
							CALL fcpa_batch_log$p_data_log('MGBDD0032', l_log_no, l_log_sub_key1, l_log_sub_key2,
								mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm),
								x.wg_cd,
								fcpa_date_util$f_to_char(x.term, fcpa_date_util$y4m()),
								x.calc_ctg_cd,
								y.oper_unit_cd,
								y.dec_place::VARCHAR);
							l_chk_flg := c_on;
						END IF;
					END IF;
				END IF;

				IF l_chk_flg = c_on THEN
					UPDATE mgw_imp_itm_oper w
					SET imp_err_flg = c_on
					WHERE	0=0
					AND w.itm_cd = x.itm_cd
					AND w.itm_sub1 = x.itm_sub1
					AND w.itm_sub2 = x.itm_sub2
					AND w.itm_sub3 = x.itm_sub3
					AND w.wg_cd = x.wg_cd
					AND w.term = x.term
					AND w.calc_ctg_cd = x.calc_ctg_cd
					AND w.upd_usr_id = i_usr;

					o_err_flg := c_on ;

					EXIT NEXT_LOOP;
				END IF;

				k := k + 1;

				INSERT INTO mgpa_imp_itm_oper$p_imp_mgt_main$l_imp_tmp (
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					loc_cd,
					oper_ptn,
					oper_cd,
					oper_seq,
					term,
					calc_ctg_cd,
					wg_cd,
					disp_seq,
					nmr_qty,
					dnm_qty,
					yield_oper_flg,
					oper_unit_cd,
					oper_std_qty,
					oper_conv_qty,
					dec_place,
					unit_conv_rnd_typ,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					non_calc_flg,
					_index_
					)
				VALUES (
					y.itm_cd,
					y.itm_sub1,
					y.itm_sub2,
					y.itm_sub3,
					y.loc_cd,
					y.oper_ptn,
					y.oper_cd,
					y.oper_seq,
					y.term,
					y.calc_ctg_cd,
					y.wg_cd,
					y.disp_seq,
					y.nmr_qty,
					y.dnm_qty,
					y.yield_oper_flg,
					y.oper_unit_cd,
					y.oper_std_qty,
					y.oper_conv_qty,
					y.dec_place,
					y.unit_conv_rnd_typ,
					y.rmrks,
					y.sub_char1,
					y.sub_char2,
					y.sub_char3,
					y.non_calc_flg,
					k
					);
			END LOOP;

			FOR l IN
				SELECT * FROM mgpa_imp_itm_oper$p_imp_mgt_main$l_imp_tmp ORDER BY _index_ ASC
			LOOP
				i := i + 1;
				INSERT INTO mgpa_imp_itm_oper$p_imp_mgt_main$l_imp (
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					loc_cd,
					oper_ptn,
					oper_cd,
					oper_seq,
					term,
					calc_ctg_cd,
					wg_cd,
					disp_seq,
					nmr_qty,
					dnm_qty,
					yield_oper_flg,
					oper_unit_cd,
					oper_std_qty,
					oper_conv_qty,
					dec_place,
					unit_conv_rnd_typ,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					non_calc_flg,
					_index_
					)
				VALUES (
					l.itm_cd,
					l.itm_sub1,
					l.itm_sub2,
					l.itm_sub3,
					l.loc_cd,
					l.oper_ptn,
					l.oper_cd,
					l.oper_seq,
					l.term,
					l.calc_ctg_cd,
					l.wg_cd,
					l.disp_seq,
					l.nmr_qty,
					l.dnm_qty,
					l.yield_oper_flg,
					l.oper_unit_cd,
					l.oper_std_qty,
					l.oper_conv_qty,
					l.dec_place,
					l.unit_conv_rnd_typ,
					l.rmrks,
					l.sub_char1,
					l.sub_char2,
					l.sub_char3,
					l.non_calc_flg,
					i
					);
			END LOOP;

			IF i > c_max_cnt THEN
				FOR j IN
					SELECT * FROM mgpa_imp_itm_oper$p_imp_mgt_main$l_imp ORDER BY _index_ ASC
				LOOP
					DELETE FROM mgt_itm_oper m
					WHERE	0=0
					AND	m.itm_cd = j.itm_cd
					AND	m.itm_sub1 = j.itm_sub1
					AND	m.itm_sub2 = j.itm_sub2
					AND	m.itm_sub3 = j.itm_sub3
					AND	m.term = j.term
					AND	m.calc_ctg_cd = j.calc_ctg_cd
					AND	m.wg_cd = j.wg_cd;
				END LOOP;

				INSERT INTO mgt_itm_oper (
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					loc_cd,
					oper_ptn,
					oper_cd,
					oper_seq,
					term,
					calc_ctg_cd,
					wg_cd,
					disp_seq,
					nmr_qty,
					dnm_qty,
					yield_oper_flg,
					oper_unit_cd,
					oper_std_qty,
					oper_conv_qty,
					dec_place,
					unit_conv_rnd_typ,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					non_calc_flg
					)
				SELECT
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					loc_cd,
					oper_ptn,
					oper_cd,
					oper_seq,
					term,
					calc_ctg_cd,
					wg_cd,
					disp_seq,
					nmr_qty,
					dnm_qty,
					yield_oper_flg,
					oper_unit_cd,
					oper_std_qty,
					oper_conv_qty,
					dec_place,
					unit_conv_rnd_typ,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					non_calc_flg
				FROM
					mgpa_imp_itm_oper$p_imp_mgt_main$l_imp;

				TRUNCATE TABLE mgpa_imp_itm_oper$p_imp_mgt_main$l_imp;
				i := 0;
			END IF;
		END;
		TRUNCATE TABLE mgpa_imp_itm_oper$p_imp_mgt_main$l_imp_tmp;
	END LOOP;

	IF i > 0 THEN
		FOR j IN
			SELECT * FROM mgpa_imp_itm_oper$p_imp_mgt_main$l_imp ORDER BY _index_ ASC
		LOOP
			DELETE FROM mgt_itm_oper m
			WHERE	0=0
			AND	m.itm_cd = j.itm_cd
			AND	m.itm_sub1 = j.itm_sub1
			AND	m.itm_sub2 = j.itm_sub2
			AND	m.itm_sub3 = j.itm_sub3
			AND	m.term = j.term
			AND	m.calc_ctg_cd = j.calc_ctg_cd
			AND	m.wg_cd = j.wg_cd;
		END LOOP;

		INSERT INTO mgt_itm_oper (
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			loc_cd,
			oper_ptn,
			oper_cd,
			oper_seq,
			term,
			calc_ctg_cd,
			wg_cd,
			disp_seq,
			nmr_qty,
			dnm_qty,
			yield_oper_flg,
			oper_unit_cd,
			oper_std_qty,
			oper_conv_qty,
			dec_place,
			unit_conv_rnd_typ,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3,
			non_calc_flg
			)
		SELECT
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			loc_cd,
			oper_ptn,
			oper_cd,
			oper_seq,
			term,
			calc_ctg_cd,
			wg_cd,
			disp_seq,
			nmr_qty,
			dnm_qty,
			yield_oper_flg,
			oper_unit_cd,
			oper_std_qty,
			oper_conv_qty,
			dec_place,
			unit_conv_rnd_typ,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3,
			non_calc_flg
		FROM
			mgpa_imp_itm_oper$p_imp_mgt_main$l_imp;
		TRUNCATE TABLE mgpa_imp_itm_oper$p_imp_mgt_main$l_imp;
	END IF;

	TRUNCATE TABLE mgpa_imp_itm_oper$p_imp_mgt_main$l_imp_tmp;
	TRUNCATE TABLE mgpa_imp_itm_oper$p_imp_mgt_main$l_imp;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_imp_itm_oper$p_ins_mgw(
	 IN i_calc_ctg VARCHAR,
	 IN i_wg_cd VARCHAR,
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_imp_ope_typ VARCHAR DEFAULT '2')
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		品目工程マスタ用のデータをコピー用ワークテーブルに作成する
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
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_IMP_ITM_OPER.P_INS_MGW');

	l_calc_ctg := mgpa_co_parm$f_get_calc_ctg_cd(i_calc_ctg);

	/* メイン処理の起動 */
	CALL mgpa_imp_itm_oper$p_ins_mgw_main(l_calc_ctg, i_wg_cd, i_term, i_dt, i_imp_ope_typ);

	/* 処理が終了しました。 */
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_IMP_ITM_OPER.P_INS_MGW');

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_imp_itm_oper$p_imp_mgt(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_imp_ope_typ VARCHAR DEFAULT '2')
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		原価マスタ取込(品目工程)
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
BEGIN
	/* 処理を開始しました。 */
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_IMP_ITM_OPER.P_IMP_MGT');

	l_usr := fcpa_context$f_get_userid();

	l_err_flg := c_off;

	/* メイン処理の起動 */
	CALL mgpa_imp_itm_oper$p_imp_mgt_main(i_term, i_imp_ope_typ, l_usr, l_err_flg);

	/* エラーデータ以外は削除 */
	DELETE FROM	mgw_imp_itm_oper w
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
			AND wk.itm_cd = w.itm_cd
			AND wk.itm_sub1 = w.itm_sub1
			AND wk.itm_sub2 = w.itm_sub2
			AND wk.itm_sub3 = w.itm_sub3
			AND wk.wg_cd = w.wg_cd
			)
		);

	IF l_err_flg = c_on THEN
		UPDATE mgw_imp_itm_oper w
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
				AND wk.itm_cd = w.itm_cd
				AND wk.itm_sub1 = w.itm_sub1
				AND wk.itm_sub2 = w.itm_sub2
				AND wk.itm_sub3 = w.itm_sub3
				AND wk.wg_cd = w.wg_cd
				)
			);

		COMMIT;
		CALL fcpa_err$raise_app_err('MGBDD0057');
	END IF;

	/* 処理が終了しました。 */
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_IMP_ITM_OPER.P_IMP_MGT');

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_imp_itm_oper$p_set_key(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_dt TIMESTAMP WITHOUT TIME ZONE)
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
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');

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
		x.itm_cd,
		x.itm_sub1,
		x.itm_sub2,
		x.itm_sub3,
		CASE x.loc_cd
			WHEN c_null_val THEN c_null_val
			ELSE COALESCE(m.wg_cd, c_null_val)
		END
	FROM	maw_imp_itm w, mam_itm_oper x
		LEFT OUTER JOIN mam_loc m
			ON (x.loc_cd = m.loc_cd)
	WHERE	0=0
	AND w.itm_cd = x.itm_cd
	AND w.itm_sub1 = x.itm_sub1
	AND w.itm_sub2 = x.itm_sub2
	AND w.itm_sub3 = x.itm_sub3
	AND (
		i_dt IS NOT NULL AND x.st_dt <= i_dt AND x.end_dt >= i_dt
		OR
		i_dt IS NULL AND x.st_dt < l_term_end_ym AND x.end_dt >= i_term
		);

END;
$BODY$
LANGUAGE plpgsql
;

