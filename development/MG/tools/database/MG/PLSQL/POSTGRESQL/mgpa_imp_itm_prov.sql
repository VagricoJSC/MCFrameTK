CREATE OR REPLACE PROCEDURE mgpa_imp_itm_prov$p_ins_mgw_main(
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
		品目支給マスタ用のデータをコピー用ワークテーブルに作成する
<REMARKS>
		ワークテーブル作成メイン処理用プロシージャ

		1.基準通貨の情報
		2.単価の高い順
		3.通貨ＣＤの小さい順
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
	i INTEGER := 0;
	l_calc_ctg_cd mam_calc_ctg.calc_ctg_cd%TYPE;
	l_wg_cd mam_wg.wg_cd%TYPE;
	l_co mam_co%ROWTYPE := mapa_co$f_get_co_rec();
	
	x RECORD;
	
	c_off CONSTANT CHAR(1) := '0' ;
	c_on CONSTANT CHAR(1) := '1' ;
	c_max_cnt CONSTANT INTEGER := 50000; /* バルクインサートでの最大レコード数 */
	c_mycur CONSTANT VARCHAR := mapa_xchng$f_get_base_cur_cd();
	c_prov_onr CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PROV_TYP','ONR_PROV') ;
	c_prov_ss CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PROV_TYP','SS') ;
	c_interactive CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_IMP_OPE_TYP','INTERACTIVE');
	c_batch CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_IMP_OPE_TYP','BATCH');
BEGIN
	CALL fcpa_postgres_util$type_is_table_row('mgpa_imp_itm_prov$p_ins_mgw_main$l_ins', 'mgw_imp_itm_prov', 'integer') ;
	
	IF i_imp_ope_typ = c_interactive THEN
		/* デフォルトの計算カテゴリＣＤを使い、ワーキンググループＣＤは無視する */
		l_calc_ctg_cd := mgpa_co_parm$f_get_calc_ctg_cd(NULL);
		l_wg_cd := NULL;
	ELSE
		l_calc_ctg_cd := i_calc_ctg;
		l_wg_cd := i_wg_cd;
	END IF;
	
	DELETE FROM	mgw_imp_itm_prov w
	WHERE	0=0 
	AND w.calc_ctg_cd = l_calc_ctg_cd 
	AND w.term = i_term 
	AND (l_wg_cd IS NULL OR w.wg_cd = l_wg_cd) 
	AND (i_imp_ope_typ = c_batch 
		OR EXISTS (
 			SELECT 'X'
			FROM	mgw_imp_interactive_key wk
			WHERE	0=0 
			AND wk.itm_cd = w.itm_cd 
			AND wk.itm_sub1 = w.itm_sub1 
			AND wk.itm_sub2 = w.itm_sub2 
			AND wk.itm_sub3 = w.itm_sub3 
			AND wk.wg_cd = w.wg_cd
		)
	);
	
	/* ＳＣＭのマスタからコピーする */
	FOR x IN
		SELECT
			m01.itm_cd, 
			m01.itm_sub1, 
			m01.itm_sub2, 
			m01.itm_sub3, 
			m01.prsppl_cd, 
			m01.term, 
			l_calc_ctg_cd AS calc_ctg_cd, 
			m01.wg_cd, 
			m01.prov_typ, 
			1 AS base_qty, 
			m01.cur_cd, 
			m01.upri, 
			m01.memo1 AS rmrks, 
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
				m11.itm_cd, 
				m11.itm_sub1, 
				m11.itm_sub2, 
				m11.itm_sub3, 
				m11.prsppl_cd, 
				m11.term, 
				m11.wg_cd, 
				m11.prov_typ, 
				m11.cur_cd, 
				m11.upri, 
				m11.memo1, 
				ROW_NUMBER() OVER (
					PARTITION BY 
						m11.itm_cd, 
						m11.itm_sub1, 
						m11.itm_sub2, 
						m11.itm_sub3, 
						m11.prsppl_cd, 
						m11.wg_cd 
					ORDER BY 
						m11.unit_cur_prio, 
						m11.base_cur_upri desc nulls last, 
						m11.cur_cd
				) AS rn
			FROM	(
				SELECT
					m21.itm_cd, 
					m21.itm_sub1, 
					m21.itm_sub2, 
					m21.itm_sub3, 
					m21.prsppl_cd, 
					m23.term, 
					m21.wg_cd, 
					m21.prov_typ, 
					m21.cur_cd, 
					m21.upri, 
					m21.memo1,
					CASE WHEN m21.cur_cd = c_mycur THEN 1 ELSE 2
					END AS unit_cur_prio, 
					mapa_xchng$f_xchng(
						m21.upri, 
						mapa_xchng$f_get_prov_xrate_ne(m21.cur_cd, COALESCE(i_dt, fcpa_postgres_util$greatest(m23.term, m21.st_dt))), 
						m25.upri_dec_place, 
						l_co.xrate_rnd_typ
					) AS base_cur_upri, 
					ROW_NUMBER() OVER (
						PARTITION BY 
							m21.itm_cd, 
							m21.itm_sub1, 
							m21.itm_sub2, 
							m21.itm_sub3, 
							m21.prsppl_cd, 
							m21.cur_cd, 
							m21.wg_cd 
						ORDER BY 
							m21.st_dt
					) AS st_dt_rn
				FROM	mam_prov_upri_ m21, mam_itm_srch m22, mam_term m23, mam_cur m25
				WHERE	0=0 
				AND m21.itm_cd = m22.itm_cd 
				AND m21.itm_sub1 = m22.itm_sub1 
				AND m21.itm_sub2 = m22.itm_sub2 
				AND m21.itm_sub3 = m22.itm_sub3 
				AND m22.del_flg = c_off
				AND (
					i_dt IS NOT NULL AND m21.st_dt <= i_dt AND m21.end_dt >= i_dt 
					OR 
					i_dt IS NULL AND m21.st_dt < m23.term_end_ym AND m21.end_dt >= m23.term
					) 
				AND m21.cur_cd = m25.cur_cd 
				AND m21.prov_typ IN (c_prov_ss, c_prov_onr) 
				AND m21.del_flg = c_off
				AND m23.term = i_term 
				AND (l_wg_cd IS NULL OR m21.wg_cd = l_wg_cd) 
				AND (i_imp_ope_typ = c_batch 
					OR EXISTS (
						SELECT 'X'
						FROM	mgw_imp_interactive_key wk
						WHERE	0=0 
						AND wk.itm_cd = m21.itm_cd 
						AND wk.itm_sub1 = m21.itm_sub1 
						AND wk.itm_sub2 = m21.itm_sub2 
						AND wk.itm_sub3 = m21.itm_sub3 
						AND wk.wg_cd = m21.wg_cd
					)
				)
			) m11
			WHERE	0=0 
			AND m11.st_dt_rn = 1
		) m01
		WHERE	0=0 
		AND	m01.rn = 1
		ORDER BY m01.itm_cd, m01.itm_sub1, m01.itm_sub2, m01.itm_sub3, m01.prsppl_cd
	LOOP
		i := i + 1;

		INSERT INTO mgpa_imp_itm_prov$p_ins_mgw_main$l_ins (
			itm_cd ,
			itm_sub1 ,
			itm_sub2 ,
			itm_sub3 ,
			prsppl_cd ,
			term ,
			calc_ctg_cd ,
			wg_cd ,
			prov_typ ,
			base_qty ,
			cur_cd ,
			upri ,
			rmrks ,
			sub_char1 ,
			sub_char2 ,
			sub_char3 ,
			non_calc_flg ,
			imp_err_flg ,
			imp_flg 
		) VALUES (
			x.itm_cd ,
			x.itm_sub1 ,
			x.itm_sub2 ,
			x.itm_sub3 ,
			x.prsppl_cd ,
			x.term ,
			x.calc_ctg_cd ,
			x.wg_cd ,
			x.prov_typ ,
			x.base_qty ,
			x.cur_cd ,
			x.upri ,
			x.rmrks ,
			x.sub_char1 ,
			x.sub_char2 ,
			x.sub_char3 ,
			x.non_calc_flg ,
			x.imp_err_flg ,
			x.imp_flg 
		);
		
		IF i > c_max_cnt THEN
			INSERT INTO mgw_imp_itm_prov 
			(
				itm_cd ,
				itm_sub1 ,
				itm_sub2 ,
				itm_sub3 ,
				prsppl_cd ,
				term ,
				calc_ctg_cd ,
				wg_cd ,
				prov_typ ,
				base_qty ,
				cur_cd ,
				upri ,
				rmrks ,
				sub_char1 ,
				sub_char2 ,
				sub_char3 ,
				non_calc_flg ,
				imp_err_flg ,
				imp_flg 
			)
			SELECT 
				w.itm_cd ,
				w.itm_sub1 ,
				w.itm_sub2 ,
				w.itm_sub3 ,
				w.prsppl_cd ,
				w.term ,
				w.calc_ctg_cd ,
				w.wg_cd ,
				w.prov_typ ,
				w.base_qty ,
				w.cur_cd ,
				w.upri ,
				w.rmrks ,
				w.sub_char1 ,
				w.sub_char2 ,
				w.sub_char3 ,
				w.non_calc_flg ,
				w.imp_err_flg ,
				w.imp_flg 
			FROM	mgpa_imp_itm_prov$p_ins_mgw_main$l_ins w
			;

			TRUNCATE TABLE mgpa_imp_itm_prov$p_ins_mgw_main$l_ins ;

		END IF ;
	END LOOP ;

	IF i > 0 THEN
		
		INSERT INTO mgw_imp_itm_prov 
		(
			itm_cd ,
			itm_sub1 ,
			itm_sub2 ,
			itm_sub3 ,
			prsppl_cd ,
			term ,
			calc_ctg_cd ,
			wg_cd ,
			prov_typ ,
			base_qty ,
			cur_cd ,
			upri ,
			rmrks ,
			sub_char1 ,
			sub_char2 ,
			sub_char3 ,
			non_calc_flg ,
			imp_err_flg ,
			imp_flg 
		)
		SELECT 
			w.itm_cd ,
			w.itm_sub1 ,
			w.itm_sub2 ,
			w.itm_sub3 ,
			w.prsppl_cd ,
			w.term ,
			w.calc_ctg_cd ,
			w.wg_cd ,
			w.prov_typ ,
			w.base_qty ,
			w.cur_cd ,
			w.upri ,
			w.rmrks ,
			w.sub_char1 ,
			w.sub_char2 ,
			w.sub_char3 ,
			w.non_calc_flg ,
			w.imp_err_flg ,
			w.imp_flg 
		FROM mgpa_imp_itm_prov$p_ins_mgw_main$l_ins w
		;

		TRUNCATE TABLE mgpa_imp_itm_prov$p_ins_mgw_main$l_ins ;

	END IF ;

	TRUNCATE TABLE mgpa_imp_itm_prov$p_ins_mgw_main$l_ins ;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_imp_itm_prov$p_imp_mgt_main(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_imp_ope_typ VARCHAR,
	 IN i_usr VARCHAR,
	 INOUT o_err_flg CHAR
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
		原価マスタ取込(品目支給)
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
	i INTEGER := 0;
	k INTEGER := 0;
	
	l_chk_flg CHAR(1);
	l_parm mam_sys_parm.parm_val%TYPE;
	l_calc_ctg_cd mam_calc_ctg.calc_ctg_cd%TYPE;
	l_log_no fct_batch_log_msg.batch_log_no%TYPE ;
	l_log_sub_key1 fct_batch_log_msg.log_sub_key1%TYPE ;
	l_log_sub_key2 fct_batch_log_msg.log_sub_key2%TYPE ;
	
	j RECORD;
	x RECORD;
	y RECORD;
	
	c_max_cnt CONSTANT INTEGER := 50000; /* バルクインサートでの最大レコード数 */
	c_mng CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASSET_MNG_TYP','MNG') ;
	c_prov_onr CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PROV_TYP','ONR_PROV') ;
	c_prov_ss CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PROV_TYP','SS') ;
	c_interactive CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_IMP_OPE_TYP','INTERACTIVE');
	c_batch CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_IMP_OPE_TYP','BATCH');
	c_off CONSTANT CHAR(1) := '0' ;
	c_on CONSTANT CHAR(1) := '1' ;

	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');
BEGIN
	
	CALL fcpa_postgres_util$type_is_table_row('mgpa_imp_itm_prov$p_imp_mgt_main$l_imp', 'mgw_imp_itm_prov', 'integer') ;
	CALL fcpa_postgres_util$type_is_table_row('mgpa_imp_itm_prov$p_imp_mgt_main$l_imp_tmp', 'mgw_imp_itm_prov', 'integer') ;
	
	/* 確定品目は削除 */
	CALL mgpa_fix_del$p_itm_prov(i_usr, i_term);
	l_parm := mapa_comm$f_get_parm('ITM_SUB_TYP');
	
	/* 個別取込ならデフォルトの計算カテゴリＣＤを使う */
	/* 通常取込なら無視する */
	IF i_imp_ope_typ = c_interactive THEN
		l_calc_ctg_cd := mgpa_co_parm$f_get_calc_ctg_cd(NULL);
	ELSE
		l_calc_ctg_cd := NULL;
	END IF;

	FOR x IN
		SELECT	t.*, 
			m.asset_mng_typ AS asset_mng_typ
		FROM	(
			SELECT DISTINCT
				w.itm_cd, 
				w.itm_sub1, 
				w.itm_sub2, 
				w.itm_sub3, 
				w.wg_cd, 
				w.term, 
				w.calc_ctg_cd
			FROM	mgw_imp_itm_prov w
			WHERE	0=0 
			AND w.imp_flg = c_on 
			AND w.upd_usr_id = i_usr 
			AND w.term = i_term 
			AND (l_calc_ctg_cd IS NULL OR w.calc_ctg_cd = l_calc_ctg_cd) 
			AND (i_imp_ope_typ = c_batch 
					AND w.upd_srv_req_no = fcpa_context$f_get_processid()
				OR EXISTS (
					SELECT 'X'
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
		ON (
			t.itm_cd = m.itm_cd 
			AND t.itm_sub1 = m.itm_sub1 
			AND t.itm_sub2 = m.itm_sub2 
			AND t.itm_sub3 = m.itm_sub3 
			AND m.del_flg = c_off
		)
		WHERE	0=0
	LOOP
		/* 品目チェック処理、エラーとなった品目と同じ品目のワークのデータは全件をエラーとして、取り込まない */
		<<NEXT_LOOP>>
		BEGIN
			IF x.asset_mng_typ IS NULL THEN
				/* 品目マスタに有効な品目として登録されていません。品目：{1} */
				CALL fcpa_batch_log$p_data_log(
					'MGBDD0023', 
					l_log_no, 
					l_log_sub_key1, 
					l_log_sub_key2, 
					mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm)
				);
				
				UPDATE mgw_imp_itm_prov w
				SET imp_err_flg = c_on
				WHERE	0=0 
				AND w.itm_cd = x.itm_cd 
				AND w.itm_sub1 = x.itm_sub1 
				AND w.itm_sub2 = x.itm_sub2 
				AND w.itm_sub3 = x.itm_sub3 
				AND w.wg_cd = x.wg_cd 
				AND w.calc_ctg_cd = x.calc_ctg_cd 
				AND w.imp_flg = c_on 
				AND w.term = i_term 
				AND w.upd_usr_id = i_usr
				;

				o_err_flg := c_on ;
				EXIT NEXT_LOOP;
			END IF ;

			k := 0 ;
			FOR y IN
				SELECT
					w.itm_cd, 
					w.itm_sub1, 
					w.itm_sub2, 
					w.itm_sub3, 
					w.prsppl_cd, 
					w.term, 
					w.calc_ctg_cd, 
					w.wg_cd,
					CASE x.asset_mng_typ
						WHEN c_mng THEN w.prov_typ
						ELSE c_prov_ss
					END AS prov_typ, 
					w.base_qty, 
					w.cur_cd, 
					w.upri, 
					w.rmrks, 
					w.sub_char1, 
					w.sub_char2, 
					w.sub_char3, 
					w.non_calc_flg, 
					w.imp_err_flg, 
					w.imp_flg, 
					m.bp_cd AS mam_bp_cd
				FROM	mgw_imp_itm_prov w
					LEFT OUTER JOIN mam_bp m ON (w.prsppl_cd = m.bp_cd)
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
				/* 取込対象データのチェック、品目、ワーキンググループ、期、計算カテゴリ、ユーザ単位でチェックする */
				IF y.prov_typ NOT IN (c_prov_onr, c_prov_ss) THEN
					/* 支給区分には 2：有償支給ないしは 3：自給を設定してください。 */
					/* 品目：{1} ワーキンググループ：{2} 期：{3} 計算カテゴリ：{4} 支給区分：{5} */
					CALL fcpa_batch_log$p_data_log(
						'MGBDD0035', 
						l_log_no, 
						l_log_sub_key1, 
						l_log_sub_key2,  
						mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm), 
						x.wg_cd, 
						fcpa_date_util$f_to_char(x.term, fcpa_date_util$y4m()), 
						x.calc_ctg_cd, 
						y.prov_typ
					);
					
					l_chk_flg := c_on;
				END IF;

				IF y.base_qty <= 0 THEN
					/* 基準数には正の数字を設定してください。 */
					/* 品目：{1} ワーキンググループ：{2} 期：{3} 計算カテゴリ：{4} 基準数：{5} */
					CALL fcpa_batch_log$p_data_log(
						'MGBDD0037', 
						l_log_no, 
						l_log_sub_key1, 
						l_log_sub_key2, 
						mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm), 
						x.wg_cd, 
						fcpa_date_util$f_to_char(x.term, fcpa_date_util$y4m()), 
						x.calc_ctg_cd, 
						y.base_qty::VARCHAR
					);
					
					l_chk_flg := c_on;
				END IF;

				IF y.prsppl_cd <> c_null_val AND y.mam_bp_cd IS NULL THEN
					/* 取引先マスタに有効な取引先として登録されていません。支給先：{1} */
					CALL fcpa_batch_log$p_data_log(
						'MGBDD0060', 
						l_log_no, 
						l_log_sub_key1, 
						l_log_sub_key2, 
						y.prsppl_cd
					);
					
					l_chk_flg := c_on;
				END IF;

				IF l_chk_flg = c_on THEN
					UPDATE mgw_imp_itm_prov w
					SET imp_err_flg = c_on
					WHERE	0=0 
					AND w.itm_cd = x.itm_cd 
					AND w.itm_sub1 = x.itm_sub1 
					AND w.itm_sub2 = x.itm_sub2 
					AND w.itm_sub3 = x.itm_sub3 
					AND w.wg_cd = x.wg_cd 
					AND w.term = x.term 
					AND w.calc_ctg_cd = x.calc_ctg_cd 
					AND w.upd_usr_id = i_usr
					;

					o_err_flg := c_on ;
					EXIT NEXT_LOOP;
				END IF ;

				k := k + 1 ;

				INSERT INTO mgpa_imp_itm_prov$p_imp_mgt_main$l_imp_tmp(
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
					non_calc_flg, 
					_index_
				) VALUES (
					y.itm_cd, 
					y.itm_sub1, 
					y.itm_sub2, 
					y.itm_sub3, 
					y.prsppl_cd, 
					y.term, 
					y.calc_ctg_cd, 
					y.wg_cd, 
					y.prov_typ, 
					y.base_qty, 
					y.cur_cd, 
					y.upri, 
					y.rmrks, 
					y.sub_char1, 
					y.sub_char2, 
					y.sub_char3, 
					y.non_calc_flg, 
					k
				);
				
			END LOOP;

			FOR l IN 1..k LOOP
				i := i + 1;
				INSERT INTO mgpa_imp_itm_prov$p_imp_mgt_main$l_imp(
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
					non_calc_flg, 
					_index_
				) 
				SELECT
					w.itm_cd, 
					w.itm_sub1, 
					w.itm_sub2, 
					w.itm_sub3, 
					w.prsppl_cd, 
					w.term, 
					w.calc_ctg_cd, 
					w.wg_cd, 
					w.prov_typ, 
					w.base_qty, 
					w.cur_cd, 
					w.upri, 
					w.rmrks, 
					w.sub_char1, 
					w.sub_char2, 
					w.sub_char3, 
					w.non_calc_flg, 
					i
				FROM	mgpa_imp_itm_prov$p_imp_mgt_main$l_imp_tmp w
				WHERE	0=0
				AND	w._index_ = l
				;
			END LOOP ;

			IF i > c_max_cnt THEN
				FOR j IN
					SELECT * FROM mgpa_imp_itm_prov$p_imp_mgt_main$l_imp ORDER BY _index_ ASC
				LOOP
					DELETE FROM mgt_itm_prov m
					WHERE	0=0
					AND m.itm_cd = j.itm_cd 
					AND m.itm_sub1 = j.itm_sub1 
					AND m.itm_sub2 = j.itm_sub2 
					AND m.itm_sub3 = j.itm_sub3 
					AND m.term = j.term 
					AND m.calc_ctg_cd = j.calc_ctg_cd 
					AND m.wg_cd = j.wg_cd
					;
				END LOOP;
				
				INSERT INTO mgt_itm_prov 
				(
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
					w.itm_cd, 
					w.itm_sub1, 
					w.itm_sub2, 
					w.itm_sub3, 
					w.prsppl_cd, 
					w.term, 
					w.calc_ctg_cd, 
					w.wg_cd, 
					w.prov_typ, 
					w.base_qty, 
					w.cur_cd, 
					w.upri, 
					w.rmrks, 
					w.sub_char1, 
					w.sub_char2, 
					w.sub_char3, 
					w.non_calc_flg 
				FROM mgpa_imp_itm_prov$p_imp_mgt_main$l_imp w
				;

				TRUNCATE TABLE mgpa_imp_itm_prov$p_imp_mgt_main$l_imp ;
				i := 0;
			END IF ;
		END ;
		TRUNCATE TABLE mgpa_imp_itm_prov$p_imp_mgt_main$l_imp_tmp ;
	END LOOP ;

	IF i > 0 THEN
		FOR j IN
			SELECT * FROM mgpa_imp_itm_prov$p_imp_mgt_main$l_imp ORDER BY _index_ ASC
		LOOP
			DELETE FROM mgt_itm_prov m
			WHERE	0=0
			AND m.itm_cd = j.itm_cd 
			AND m.itm_sub1 = j.itm_sub1 
			AND m.itm_sub2 = j.itm_sub2 
			AND m.itm_sub3 = j.itm_sub3 
			AND m.term = j.term 
			AND m.calc_ctg_cd = j.calc_ctg_cd 
			AND m.wg_cd = j.wg_cd
			;
		END LOOP ;

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
			w.itm_cd, 
			w.itm_sub1, 
			w.itm_sub2, 
			w.itm_sub3, 
			w.prsppl_cd, 
			w.term, 
			w.calc_ctg_cd, 
			w.wg_cd, 
			w.prov_typ, 
			w.base_qty, 
			w.cur_cd, 
			w.upri, 
			w.rmrks, 
			w.sub_char1, 
			w.sub_char2, 
			w.sub_char3, 
			w.non_calc_flg 
		FROM mgpa_imp_itm_prov$p_imp_mgt_main$l_imp w
		;

		TRUNCATE TABLE mgpa_imp_itm_prov$p_imp_mgt_main$l_imp ;

	END IF;

	TRUNCATE TABLE mgpa_imp_itm_prov$p_imp_mgt_main$l_imp ;
	TRUNCATE TABLE mgpa_imp_itm_prov$p_imp_mgt_main$l_imp_tmp ;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_imp_itm_prov$p_ins_mgw(
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
		品目支給マスタ用のデータをコピー用ワークテーブルに作成する
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
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_IMP_ITM_PROV.P_INS_MGW');

	l_calc_ctg := mgpa_co_parm$f_get_calc_ctg_cd(i_calc_ctg);

	/* メイン処理の起動 */
	CALL mgpa_imp_itm_prov$p_ins_mgw_main(l_calc_ctg, i_wg_cd, i_term, i_dt, i_imp_ope_typ);

	/* 処理が終了しました。 */
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_IMP_ITM_PROV.P_INS_MGW');
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_imp_itm_prov$p_imp_mgt(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_imp_ope_typ VARCHAR DEFAULT '2'
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
		原価マスタ取込(品目支給)
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
	c_on CONSTANT CHAR(1) := '1' ;
	c_off CONSTANT CHAR(1) := '0' ;
	c_batch CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_IMP_OPE_TYP','BATCH');
	
	l_usr VARCHAR;
	l_err_flg CHAR(1);
BEGIN
	
	/* 処理を開始しました。 */
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_IMP_ITM_PROV.P_IMP_MGT');
	
	l_usr := fcpa_context$f_get_userid();
	
	l_err_flg := c_off;
	
	/* メイン処理の起動 */
	CALL mgpa_imp_itm_prov$p_imp_mgt_main(i_term, i_imp_ope_typ, l_usr, l_err_flg);
	
	/* エラーデータ以外は削除 */
	DELETE FROM	mgw_imp_itm_prov w
	WHERE	0=0 
	AND w.imp_flg = c_on 
	AND w.imp_err_flg = c_off 
	AND w.upd_usr_id = l_usr 
	AND w.term = i_term 
	AND (i_imp_ope_typ = c_batch 
			AND w.upd_srv_req_no = fcpa_context$f_get_processid()
		OR EXISTS (
			SELECT 'X'
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
		UPDATE mgw_imp_itm_prov w
		SET imp_flg = c_off
		WHERE	0=0 
		AND w.imp_flg = c_on 
		AND w.imp_err_flg = c_on 
		AND w.upd_usr_id = l_usr 
		AND w.term = i_term 
		AND (i_imp_ope_typ = c_batch 
				AND w.upd_srv_req_no = fcpa_context$f_get_processid()
			OR EXISTS (
				SELECT 'X'
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
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_IMP_ITM_PROV.P_IMP_MGT');
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_imp_itm_prov$p_set_key(
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
	l_term_end_ym mam_term.term%TYPE;
	c_off CONSTANT CHAR(1) := '0' ;
BEGIN
	SELECT	MAX(m.term_end_ym)
	INTO	STRICT l_term_end_ym
	FROM	mam_term m
	WHERE	0=0
	AND	m.term = i_term
	;
	
	DELETE FROM mgw_imp_interactive_key ;
	INSERT INTO mgw_imp_interactive_key (
		itm_cd, 
		itm_sub1, 
		itm_sub2, 
		itm_sub3, 
		wg_cd
	)
	SELECT 
		DISTINCT
		x.itm_cd, 
		x.itm_sub1, 
		x.itm_sub2, 
		x.itm_sub3, 
		x.wg_cd
	FROM	maw_imp_itm w, mam_prov_upri_ x
	WHERE	0=0 
	AND w.itm_cd = x.itm_cd 
	AND w.itm_sub1 = x.itm_sub1 
	AND w.itm_sub2 = x.itm_sub2 
	AND w.itm_sub3 = x.itm_sub3 
	AND (
		i_dt IS NOT NULL AND x.st_dt <= i_dt AND x.end_dt >= i_dt 
		OR 
		i_dt IS NULL AND x.st_dt < l_term_end_ym AND x.end_dt >= i_term
		) 
	AND x.del_flg = c_off;
END;
$BODY$
LANGUAGE plpgsql
;
