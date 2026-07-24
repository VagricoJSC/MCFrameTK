SET SQLBLANKLINES ON

CREATE OR REPLACE PACKAGE MSPA_SLO_SLS_SUM
IS

	G_DPT_LVL_CD			MAPA_META.DPT_LVL_CD%TYPE ;
	G_USE_ACT_XRATE_FLG		MAPA_META.FLG%TYPE ;
	G_SLS_BDG_GRP			MSPA_META.SLS_BDG_GRP%TYPE ;
	G_CL_DAY				MAPA_META.CL_DAY%TYPE ;
	G_CL_MON_BASE			MAPA_META.CL_MON_BASE%TYPE ;
	G_BASE_CUR_CD			MAPA_META.CUR_CD%TYPE ;
	G_XRATE_CD				MAPA_META.XRATE_CD%TYPE ;
	G_GM_STD_UPRI_SEL_TYP	MAPA_META.STD_UPRI_SEL_TYP%TYPE ;
	G_BASE_CUR_AMT_DEC_PLACE	MAPA_META.DEC_PLACE%TYPE ;

	PROCEDURE P_SLS_SUM_DPT_MAIN (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE,
		I_DPT_LVL_CD		IN MAPA_META.DPT_LVL_CD%TYPE,
		I_USE_ACT_XRATE_FLG	IN MAPA_META.FLG%TYPE,
		I_SLS_BDG_GRP		IN MSPA_META.SLS_BDG_GRP%TYPE,
		I_XRATE_CD			IN MAPA_META.XRATE_CD%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		指定年月、売上表示期間より部門別用の売上集計受注ワークを作成するメイン処理
	<REMARKS>
		呼び出し元の処理にて、画面で指定された部門階層の部門ＣＤを、レベル１として、
		売上集計部門階層ワークに登録しておく必要がある。
	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<IN>
		I_DPT_LVL_CD
			部門階層ＣＤ
	<IN>
		I_USE_ACT_XRATE_FLG
			実績を売上時レートで換算
	<IN>
		I_SLS_BDG_GRP
			予算分類
	<IN>
		I_XRATE_CD
			為替レートＣＤ
	<HISTORY>
	**************************************************************************/


	PROCEDURE P_INS_DPT_LVL (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE,
		I_DPT_CD			IN MAPA_META.DPT_CD%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		指定年月、売上表示期間、部門ＣＤを条件に売上集計部門階層ワークを作成する
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<IN>
		I_DPT_CD
			部門ＣＤ
	<HISTORY>
	**************************************************************************/


	PROCEDURE P_INS_DPT_LVL (
		I_LVL				IN NUMBER,
		I_BASE_YM			IN MAPA_META.YM%TYPE,
		I_BASE_DT			IN MAPA_META.DT%TYPE,
		I_CRNT_DPT_CD		IN MAPA_META.DPT_CD%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		指定レベルの売上集計部門階層ワークの売上部門ＣＤをもとに、下位階層の
		部門ＣＤを取得し、売上集計部門階層ワークに登録する。
		最下層の部門ＣＤまで同じ処理を繰り返し行う。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_LVL
			レベル
	<IN>
		I_BASE_YM
			基準月
	<IN>
		I_BASE_DT
			基準日
	<HISTORY>
	**************************************************************************/


	PROCEDURE P_INS_SLS_SUM_DPT (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		売上集計テーブルから部門をキーとした情報を取得し、売上集計受注ワークに
		登録する。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<HISTORY>
	**************************************************************************/


	PROCEDURE P_INS_SLO_SUM_DPT (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		受注集計テーブルから部門をキーとした情報を取得し、売上集計受注ワークに
		登録する。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<HISTORY>
	**************************************************************************/

	PROCEDURE P_INS_SLO_BL_DPT (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		売上予定テーブルから部門をキーとした情報を取得し、売上集計受注ワークに
		登録する。部門については、部門変換マスタで最新の部門に変換する。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<HISTORY>
	**************************************************************************/

	PROCEDURE P_INS_SLS_BDG_DPT (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		販売予算テーブルから部門をキーとした情報を取得し、売上集計受注ワークに
		登録する。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<HISTORY>
	**************************************************************************/


	PROCEDURE P_INS_SPLN_SUM_DPT (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		販売計画集計テーブルから部門をキーとした情報を取得し、売上集計受注ワークに
		登録する。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<HISTORY>
	**************************************************************************/


	PROCEDURE P_SLS_SUM_IG_MAIN (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE,
		I_SLS_ITM_GRP_LVL	IN MAPA_META.INT4%TYPE,
		I_USE_ACT_XRATE_FLG	IN MAPA_META.FLG%TYPE,
		I_SLS_BDG_GRP		IN MSPA_META.SLS_BDG_GRP%TYPE,
		I_XRATE_CD			IN MAPA_META.XRATE_CD%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		指定年月、売上表示期間より品目体系別用の売上集計受注ワークを作成する
		メイン処理
	<REMARKS>
		呼び出し元の処理にて、画面で指定された品目階層の品目階層ＣＤを、
		レベル１として売上集計品目体系階層ワークに登録しておく必要がある。
	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<IN>
		I_SLS_ITM_GRP_LVL
			品目体系階層
	<IN>
		I_USE_ACT_XRATE_FLG
			実績を売上時レートで換算
	<IN>
		I_SLS_BDG_GRP
			予算分類
	<IN>
		I_XRATE_CD
			為替レートＣＤ
	<HISTORY>
	**************************************************************************/


	PROCEDURE P_INS_IG_LVL (
		I_SLS_ITM_GRP_CD	IN MAPA_META.SLS_ITM_GRP_CD%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		指定年月、売上表示期間、部門ＣＤを条件に売上集計部門階層ワークを作成する
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_SLS_ITM_GRP_CD
			品目体系ＣＤ
	<HISTORY>
	**************************************************************************/


	PROCEDURE P_INS_IG_LVL (
		I_LVL					IN NUMBER,
		I_CRNT_SLS_ITM_GRP_CD	IN MAPA_META.SLS_ITM_GRP_CD%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		指定レベルの売上集計品目体系階層ワークの品目体系ＣＤをもとに、下位階層の
		品目体系ＣＤを取得し、売上集計品目体系階層ワークに登録する。
		最下層の品目体系ＣＤまで同じ処理を繰り返し行う。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_LVL
			レベル
	<IN>
		I_CRNT_SLS_ITM_GRP_CD
			指定階層品目体系ＣＤ
	<HISTORY>
	**************************************************************************/


	PROCEDURE P_INS_SLS_SUM_ITM_GRP (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		売上集計テーブルから品目体系をキーとした情報を取得し、売上集計受注ワークに
		登録する。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<HISTORY>
	**************************************************************************/


	PROCEDURE P_INS_SLO_SUM_ITM_GRP (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		受注集計テーブルから品目体系をキーとした情報を取得し、売上集計受注ワークに
		登録する。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<HISTORY>
	**************************************************************************/


	PROCEDURE P_INS_SLO_BL_ITM_GRP (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		売上予定テーブルから品目体系をキーとした情報を取得し、売上集計受注ワークに
		登録する。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<HISTORY>
	**************************************************************************/


	PROCEDURE P_INS_SLS_BDG_ITM_GRP (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		販売予算テーブルから品目体系をキーとした情報を取得し、売上集計受注ワークに
		登録する。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<HISTORY>
	**************************************************************************/


	PROCEDURE P_INS_SPLN_SUM_ITM_GRP (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		販売計画集計テーブルから品目体系をキーとした情報を取得し、売上集計受注ワークに
		登録する。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<HISTORY>
	**************************************************************************/


END MSPA_SLO_SLS_SUM;

/
show errors;


CREATE OR REPLACE PACKAGE BODY MSPA_SLO_SLS_SUM
IS

	PROCEDURE P_SLS_SUM_DPT_MAIN (
		I_YM					IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM			IN MAPA_META.INT%TYPE,
		I_DPT_LVL_CD			IN MAPA_META.DPT_LVL_CD%TYPE,
		I_USE_ACT_XRATE_FLG		IN MAPA_META.FLG%TYPE,
		I_SLS_BDG_GRP			IN MSPA_META.SLS_BDG_GRP%TYPE,
		I_XRATE_CD				IN MAPA_META.XRATE_CD%TYPE
	)
	/**************************************************************************
	<SYNOPSIS>
		指定年月、売上表示期間より部門別用の売上集計受注ワークを作成するメイン処理
	<REMARKS>
		呼び出し元の処理にて、画面で指定された部門階層の部門ＣＤを、レベル１として、
		売上集計部門階層ワークに登録しておく必要がある。
	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<IN>
		I_DPT_LVL_CD
			部門階層ＣＤ
	<IN>
		I_USE_ACT_XRATE_FLG
			実績を売上時レートで換算
	<IN>
		I_SLS_BDG_GRP
			予算分類
	<IN>
		I_XRATE_CD
			為替レートＣＤ
	<HISTORY>
	**************************************************************************/
	IS
		L_CO	MAM_CO%ROWTYPE ;
	BEGIN

		-- 初期設定
		G_DPT_LVL_CD		:= I_DPT_LVL_CD ;
		G_USE_ACT_XRATE_FLG	:= I_USE_ACT_XRATE_FLG ;
		G_SLS_BDG_GRP		:= I_SLS_BDG_GRP ;
		G_XRATE_CD			:= I_XRATE_CD ;

		L_CO				:= MAPA_CO.F_GET_CO_REC() ;
		G_CL_DAY			:= L_CO.AC_CL_DAY ;
		G_CL_MON_BASE		:= L_CO.AC_CL_MON_BASE ;
		G_BASE_CUR_CD		:= L_CO.BASE_CUR_CD ;
		G_GM_STD_UPRI_SEL_TYP		:= L_CO.GM_STD_UPRI_TYP ;

		SELECT AMT_DEC_PLACE INTO G_BASE_CUR_AMT_DEC_PLACE
		FROM MAM_CUR WHERE CUR_CD = G_BASE_CUR_CD;

		FOR x IN (
			SELECT	w.SLS_DPT_CD
			FROM	MSW_SLS_SUM_DPT_LVL w
			WHERE	0=0
			AND	w.LVL = 1
			)
		LOOP
			P_INS_DPT_LVL(I_YM, I_SLS_DISP_TERM, x.SLS_DPT_CD) ;
		END LOOP;

		P_INS_SLS_SUM_DPT(I_YM, I_SLS_DISP_TERM) ;

		P_INS_SLO_SUM_DPT(I_YM, I_SLS_DISP_TERM) ;

		P_INS_SLO_BL_DPT(I_YM, I_SLS_DISP_TERM) ;

		P_INS_SLS_BDG_DPT(I_YM, I_SLS_DISP_TERM) ;

		P_INS_SPLN_SUM_DPT(I_YM, I_SLS_DISP_TERM) ;

	END P_SLS_SUM_DPT_MAIN;


	PROCEDURE P_INS_DPT_LVL (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE,
		I_DPT_CD			IN MAPA_META.DPT_CD%TYPE
	)
	/**************************************************************************
	<SYNOPSIS>
		指定年月、売上表示期間、部門ＣＤを条件に売上集計部門階層ワークを作成する
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<IN>
		I_DPT_CD
			部門ＣＤ
	<HISTORY>
	**************************************************************************/
	IS
		L_CO_REC	MAM_CO%ROWTYPE ;
		L_BASE_YM	MAPA_META.YM%TYPE ;
		L_BASE_DT	MAPA_META.DT%TYPE ;
	BEGIN

		L_CO_REC := MAPA_CO.F_GET_CO_REC ;

		FOR i IN 1..NVL(I_SLS_DISP_TERM, 1) LOOP
			L_BASE_YM := ADD_MONTHS(I_YM, i - 1);
			L_BASE_DT := MAPA_DT.F_GET_YM_ST_DT_NE(L_BASE_YM, L_CO_REC.AC_CL_DAY, L_CO_REC.AC_CL_MON_BASE) ;

			-- 指定年月より後の月の売上部門集計ワークを補完する
			IF i > 1 THEN
				INSERT INTO MSW_SLS_SUM_DPT_LVL VALUES (
						L_BASE_YM,  --年月
						MAPA_DPT.F_GET_DPT_CD_NE(I_DPT_CD, L_BASE_DT),	--売上部門ＣＤ
						MAPA_DPT.F_GET_DPT_CD_NE(I_DPT_CD, L_BASE_DT),	--指定階層部門ＣＤ
						NULL,	--下位部門ＣＤ
						1		--レベル
						) ;
			END IF;

			FOR x IN (
				SELECT	m.DPT_CD
				FROM	MAM_DPT m
				WHERE	0=0
				AND	m.UP_LV_DPT_CD = I_DPT_CD
				AND	L_BASE_DT BETWEEN m.ST_DT AND m.END_DT
				AND	m.SLS_DPT_FLG = '1'
				)
			LOOP

				INSERT INTO MSW_SLS_SUM_DPT_LVL VALUES (
						L_BASE_YM,  --年月
						x.DPT_CD,	--売上部門ＣＤ
						MAPA_DPT.F_GET_DPT_CD_NE(I_DPT_CD, L_BASE_DT),	--指定階層部門ＣＤ
						x.DPT_CD,	--下位部門ＣＤ
						2		--レベル
						) ;
			END LOOP ;

			P_INS_DPT_LVL(2, L_BASE_YM, L_BASE_DT, MAPA_DPT.F_GET_DPT_CD_NE(I_DPT_CD, L_BASE_DT)) ;
		END LOOP;

	END P_INS_DPT_LVL ;


	PROCEDURE P_INS_DPT_LVL (
		I_LVL			IN NUMBER,
		I_BASE_YM		IN MAPA_META.YM%TYPE,
		I_BASE_DT		IN MAPA_META.DT%TYPE,
		I_CRNT_DPT_CD	IN MAPA_META.DPT_CD%TYPE
	)
	/**************************************************************************
	<SYNOPSIS>
		指定レベルの売上集計部門階層ワークの売上部門ＣＤをもとに、下位階層の
		部門ＣＤを取得し、売上集計部門階層ワークに登録する。
		最下層の部門ＣＤまで同じ処理を繰り返し行う。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_LVL
			レベル
	<IN>
		I_BASE_YM
			基準月
	<IN>
		I_BASE_DT
			基準日
	<IN>
		I_CRNT_DPT_CD
			指定階層部門ＣＤ
	<HISTORY>
	**************************************************************************/
	IS
		L_CNT	NUMBER ;
	BEGIN

		SELECT COUNT(*) INTO L_CNT
		FROM MSW_SLS_SUM_DPT_LVL w
		WHERE 0=0
		AND w.YM = I_BASE_YM
		AND w.LVL = I_LVL
		AND w.CRNT_DPT_CD = I_CRNT_DPT_CD ;

		IF L_CNT > 0 THEN
			FOR x IN (
				SELECT w.YM, w.SLS_DPT_CD, w.CRNT_DPT_CD, w.DW_DPT_CD
				FROM MSW_SLS_SUM_DPT_LVL w
				WHERE 0=0
				AND w.YM = I_BASE_YM
				AND w.LVL = I_LVL
				AND w.CRNT_DPT_CD = I_CRNT_DPT_CD
				)
			LOOP

				FOR y IN (
					SELECT m.DPT_CD FROM MAM_DPT m
					WHERE	0=0
						AND m.UP_LV_DPT_CD = x.SLS_DPT_CD
						AND I_BASE_DT BETWEEN m.ST_DT AND m.END_DT
						AND m.SLS_DPT_FLG = '1'
					)
				LOOP
					INSERT INTO MSW_SLS_SUM_DPT_LVL VALUES(
								I_BASE_YM,
								y.DPT_CD,
								x.CRNT_DPT_CD,
								x.DW_DPT_CD,
								I_LVL + 1
								) ;
				END LOOP ;

			END LOOP ;

			P_INS_DPT_LVL(I_LVL + 1, I_BASE_YM, I_BASE_DT, I_CRNT_DPT_CD) ;

		END IF;

	END P_INS_DPT_LVL ;


	PROCEDURE P_INS_SLS_SUM_DPT (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE
	)
	/**************************************************************************
	<SYNOPSIS>
		売上集計テーブルから部門をキーとした情報を取得し、売上集計受注ワークに
		登録する。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<HISTORY>
	**************************************************************************/
	IS
		L_ST_YM			MAPA_META.YM%TYPE;
		L_END_YM		MAPA_META.YM%TYPE;
	BEGIN
		L_ST_YM := I_YM;

		IF I_SLS_DISP_TERM IS NULL THEN
			-- 指定年月のデータのみ抽出
			L_END_YM := I_YM;
		ELSE
			--指定年月から表示期間分のデータを抽出
			L_END_YM := ADD_MONTHS(I_YM, I_SLS_DISP_TERM - 1);
		END IF;

		INSERT INTO MSW_SLO_SLS_SUM (
			YM,
			DPT_LVL_CD,
			SLS_DPT_CD,
			DPT_CD1,
			DPT_CD2,
			SLS_USR_CD,
			CST_CD,
			TRD_CUR_CD,
			XRATE,
			SLS_AMT,
			BASE_CUR_SLS_AMT,
			SLS_COST_AMT,
			NOT_SUM_FLG,
			SPLN_USR_FLG
		)
		SELECT
			t.YM,
			G_DPT_LVL_CD,
			t.SLS_DPT_CD,
			w.CRNT_DPT_CD,
			w.DW_DPT_CD,
			t.SLS_USR_CD,
			t.CST_CD,
			t.CUR_CD,
			MAPA_XCHNG.F_GET_XRATE(
							t.CUR_CD,
							G_BASE_CUR_CD,
							G_XRATE_CD,
							MAPA_DT.F_GET_YM_ST_DT_NE(t.YM, G_CL_DAY, G_CL_MON_BASE)),
			t.TRD_CUR_SLS_AMT,
			t.BASE_CUR_SLS_AMT,
			t.COST_AMT,
			'0',
			'0'
		FROM
			MST_SLS_SUM t
			INNER JOIN MSW_SLS_SUM_DPT_LVL w ON (t.SLS_DPT_CD = w.SLS_DPT_CD AND t.YM = w.YM)
		WHERE 0=0
			AND t.YM BETWEEN L_ST_YM AND L_END_YM
		;
	END P_INS_SLS_SUM_DPT ;


	PROCEDURE P_INS_SLO_SUM_DPT (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE
	)
	/**************************************************************************
	<SYNOPSIS>
		受注集計テーブルから部門をキーとした情報を取得し、売上集計受注ワークに
		登録する。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<HISTORY>
	**************************************************************************/
	IS
		L_ST_YM			MAPA_META.YM%TYPE;
		L_END_YM		MAPA_META.YM%TYPE;
	BEGIN
		L_ST_YM := I_YM;

		IF I_SLS_DISP_TERM IS NULL THEN
			-- 指定年月のデータのみ抽出
			L_END_YM := I_YM;
		ELSE
			--指定年月から表示期間分のデータを抽出
			L_END_YM := ADD_MONTHS(I_YM, I_SLS_DISP_TERM - 1);
		END IF;

		INSERT INTO MSW_SLO_SLS_SUM (
			YM,
			DPT_LVL_CD,
			SLS_DPT_CD,
			DPT_CD1,
			DPT_CD2,
			SLS_USR_CD,
			CST_CD,
			TRD_CUR_CD,
			XRATE,
			SLO_AMT,
			SLO_COST_AMT,
			NOT_SUM_FLG,
			SPLN_USR_FLG
		)
		SELECT
			t.YM,
			G_DPT_LVL_CD,
			w.SLS_DPT_CD,
			w.CRNT_DPT_CD,
			w.DW_DPT_CD,
			t.SLS_USR_CD,
			t.CST_CD,
			t.TRD_CUR_CD,
			MAPA_XCHNG.F_GET_XRATE(
							t.TRD_CUR_CD,
							G_BASE_CUR_CD,
							G_XRATE_CD,
							MAPA_DT.F_GET_YM_ST_DT_NE(t.YM, G_CL_DAY, G_CL_MON_BASE)),
			CASE
				WHEN M1.DSCNT_ITM_FLG = '1' THEN (t.TRD_CUR_SLO_AMT + t.TRD_CUR_PRE_SLO_AMT) * -1
				ELSE t.TRD_CUR_SLO_AMT + t.TRD_CUR_PRE_SLO_AMT
			END,
			t.SLO_COST_AMT + t.PRE_SLO_COST_AMT,
			'0',
			'0'
		FROM
			MST_FRCST_SLO_SUM t
            LEFT JOIN MAM_DPT D ON (t.SLS_DPT_CD = D.DPT_CD AND MAPA_DT.F_GET_YM_ST_DT_NE(t.YM, G_CL_DAY, G_CL_MON_BASE) BETWEEN D.ST_DT AND D.END_DT)
            LEFT JOIN MAM_DPT_MAP DM ON (t.SLS_DPT_CD = DM.OLD_DPT_CD AND MAPA_DT.F_GET_YM_ST_DT_NE(t.YM, G_CL_DAY, G_CL_MON_BASE) BETWEEN DM.ST_DT AND DM.END_DT)
			INNER JOIN MSW_SLS_SUM_DPT_LVL w ON (NVL2(D.DPT_CD, D.DPT_CD, DM.NEW_DPT_CD) = w.SLS_DPT_CD AND t.YM = w.YM)
			LEFT JOIN MAM_ITM M1 ON (t.itm_cd = M1.itm_cd AND t.itm_sub1 = M1.itm_sub1 AND t.itm_sub2 = M1.itm_sub2 AND t.itm_sub3 = M1.itm_sub3)
		WHERE 0=0
			AND t.YM BETWEEN L_ST_YM AND L_END_YM
		;
	END P_INS_SLO_SUM_DPT ;

	PROCEDURE P_INS_SLO_BL_DPT (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE
	)
	/**************************************************************************
	<SYNOPSIS>
		売上予定テーブルから部門をキーとした情報を取得し、売上集計受注ワークに
		登録する。部門については、部門変換マスタで最新の部門に変換する。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<HISTORY>
	**************************************************************************/
	IS
		L_ST_DT			MAPA_META.DT%TYPE;
		L_END_DT		MAPA_META.DT%TYPE;
	BEGIN
		L_ST_DT := MAPA_DT.F_GET_YM_ST_DT_NE(I_YM, G_CL_DAY, G_CL_MON_BASE);

		IF I_SLS_DISP_TERM IS NULL THEN
			-- 指定年月のデータのみ抽出
			L_END_DT := MAPA_DT.F_GET_YM_END_DT_NE(I_YM, G_CL_DAY, G_CL_MON_BASE);
		ELSE
			--指定年月から表示期間分のデータを抽出
			L_END_DT := MAPA_DT.F_GET_YM_END_DT_NE(ADD_MONTHS(I_YM, I_SLS_DISP_TERM - 1), G_CL_DAY, G_CL_MON_BASE);
		END IF;

		INSERT INTO MSW_SLO_SLS_SUM (
			YM,
			DPT_LVL_CD,
			SLS_DPT_CD,
			DPT_CD1,
			DPT_CD2,
			SLS_USR_CD,
			CST_CD,
			TRD_CUR_CD,
			XRATE,
			SLO_BL_AMT,
			SLO_BL_COST_AMT,
			NOT_SUM_FLG,
			SPLN_USR_FLG
		)
		SELECT
			V2.YM
			,G_DPT_LVL_CD
			,V2.SLS_DPT_CD
			,V2.CRNT_DPT_CD
			,V2.DW_DPT_CD
			,V2.SLS_USR_CD
			,V2.CST_CD
			,V2.TRD_CUR_CD
			,MAPA_XCHNG.F_GET_XRATE(
				V2.TRD_CUR_CD,
				G_BASE_CUR_CD,
				G_XRATE_CD,
				MAPA_DT.F_GET_YM_ST_DT_NE(V2.YM, G_CL_DAY, G_CL_MON_BASE)) XRATE
			,SUM(V2.SLO_BL_AMT) SLO_BL_AMT
			,SUM(V2.SLO_BL_COST_AMT) SLO_BL_COST_AMT
			,'0' NOT_SUM_FLG
			,'0' SPLN_USR_FLG
		FROM (
			SELECT
				V1.YM
				,V1.CST_CD
				,V1.SLS_DPT_CD
				,V1.CRNT_DPT_CD
				,V1.DW_DPT_CD
				,V1.SLS_USR_CD
				,V1.TRD_CUR_CD
				,MAPA_AMT.F_GET_EXC_TAX_AMT(V1.TRD_CUR_UPRI, V1.TRD_UNIT_REM_QTY, M2.SLS_AMT_RND_TYP,
					M2.SLS_TAX_RND_TYP, M3.AMT_DEC_PLACE, M1.INC_TAX_FLG, M1.TAX_RATE,
					MAPA_CALC.F_RND_NE(V1.TRD_CUR_DSCNT_AMT * BASE_UNIT_REM_QTY / DSCNT_BASE_QTY, M3.AMT_DEC_PLACE, MAC_RND_TYP.RNDOFF)
				 ) SLO_BL_AMT
				,MAPA_CALC.F_RND_NE(V1.COST_UPRI * V1.BASE_UNIT_REM_QTY, G_BASE_CUR_AMT_DEC_PLACE , MAC_RND_TYP.RNDOFF) SLO_BL_COST_AMT
			FROM
				(
				-- 未出荷指図、未出荷実績（出荷指図対象外）、仕入直送、インボイス取引（行追加除く）の売上予定
				SELECT
					MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) YM
					,T3.CST_CD
					,w.SLS_DPT_CD
					,w.CRNT_DPT_CD
					,w.DW_DPT_CD
					,T3.SLS_USR_CD
					,T3.TRD_CUR_CD
					,CASE
						WHEN M2.DSCNT_ITM_FLG = '1' THEN T2.TRD_CUR_UPRI * -1
						ELSE T2.TRD_CUR_UPRI
					END TRD_CUR_UPRI
					,T2.COST_UPRI
					,T2.TAX_CD
					,T2.TRD_CUR_DSCNT_AMT
					,T1.TRD_UNIT_QTY
					,CASE
					  WHEN CST.CST_IV_FLG = '1' THEN
						CASE
						 WHEN T2.TRD_UNIT_CD = T2.BASE_UNIT_CD THEN T4.BASE_UNIT_QTY - T4.SHIP_SCHD_ABORT_QTY - T4.SHIP_RET_QTY - GREATEST(T4.IV_SCHD_QTY, T4.SHIP_INST_QTY, T4.SHIP_ACT_QTY)
						 ELSE (T4.BASE_UNIT_QTY - T4.SHIP_SCHD_ABORT_QTY - T4.SHIP_RET_QTY - GREATEST(T4.IV_SCHD_QTY, T4.SHIP_INST_QTY, T4.SHIP_ACT_QTY)) * CONV_BASE_QTY / CONV_QTY
						END
					  ELSE
						CASE
						 WHEN T2.TRD_UNIT_CD = T1.BASE_UNIT_CD THEN T1.BASE_UNIT_QTY - T1.BASE_UNIT_ABORT_QTY - T1.BASE_UNIT_SLS_QTY
						 ELSE (T1.BASE_UNIT_QTY - T1.BASE_UNIT_ABORT_QTY - T1.BASE_UNIT_SLS_QTY) * CONV_BASE_QTY / CONV_QTY
						END
					END TRD_UNIT_REM_QTY
					,CASE
					  WHEN CST.CST_IV_FLG = '1' THEN T4.BASE_UNIT_QTY - T4.SHIP_SCHD_ABORT_QTY - T4.SHIP_RET_QTY - GREATEST(T4.IV_SCHD_QTY, T4.SHIP_INST_QTY, T4.SHIP_ACT_QTY)
					  ELSE T1.BASE_UNIT_QTY - T1.BASE_UNIT_ABORT_QTY - T1.BASE_UNIT_SLS_QTY
					END BASE_UNIT_REM_QTY
					,T2.BASE_UNIT_QTY DSCNT_BASE_QTY
				FROM
					MST_SLS_SCHD T1
					INNER JOIN MST_SLO_D T2 ON (T1.SLO_D_NO = T2.SLO_D_NO)
					INNER JOIN MST_SLO T3 ON (T2.SLO_NO = T3.SLO_NO)
                    LEFT JOIN MAM_DPT D ON (T3.SLS_DPT_CD = D.DPT_CD AND MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) BETWEEN D.ST_DT AND D.END_DT)
                    LEFT JOIN MAM_DPT_MAP DM ON (T3.SLS_DPT_CD = DM.OLD_DPT_CD AND MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) BETWEEN DM.ST_DT AND DM.END_DT)
					INNER JOIN MSW_SLS_SUM_DPT_LVL w ON (NVL2(D.DPT_CD, D.DPT_CD, DM.NEW_DPT_CD) = w.SLS_DPT_CD AND MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) = w.YM)
					LEFT JOIN MAVM_ITM_UNIT M1 ON (T2.ITM_CD = M1.ITM_CD AND T2.ITM_SUB1 = M1.ITM_SUB1 AND T2.ITM_SUB2 = M1.ITM_SUB2 AND T2.ITM_SUB3 = M1.ITM_SUB3 AND T2.TRD_UNIT_CD = M1.UNIT_CD)
					LEFT JOIN MAM_ITM M2 ON (T2.ITM_CD = M2.ITM_CD AND T2.ITM_SUB1 = M2.ITM_SUB1 AND T2.ITM_SUB2 = M2.ITM_SUB2 AND T2.ITM_SUB3 = M2.ITM_SUB3)
					LEFT JOIN MAM_BP CST ON (T3.CST_CD = CST.BP_CD AND CST.CST_FLG = '1')
					LEFT JOIN MST_SHIP_PR T4 ON (T2.SLO_D_NO = T4.SLO_D_NO)
				WHERE
				    0 = 0
				AND T1.CMPL_FLG = '0'
				AND T1.SLS_SCHD_DT BETWEEN L_ST_DT AND L_END_DT
				AND T1.SLO_D_NO IS NOT NULL
				AND T1.SHIP_INST_D_NO IS NULL
				AND T1.DLV_SLIP_D_NO IS NULL
				AND T1.IV_D_NO IS NULL
				AND CASE
					  WHEN CST.CST_IV_FLG = '1' THEN T4.BASE_UNIT_QTY - T4.SHIP_SCHD_ABORT_QTY - T4.SHIP_RET_QTY - GREATEST(T4.IV_SCHD_QTY, T4.SHIP_INST_QTY, T4.SHIP_ACT_QTY)
					  ELSE T1.BASE_UNIT_QTY - T1.BASE_UNIT_ABORT_QTY - T1.BASE_UNIT_SLS_QTY 
					END > 0
				UNION ALL
				-- 出荷指図の売上予定（出荷実績後は除く）
				-- 納品書明細と出荷引当状況から適切な取引単位残数が計算できないので、常に基準単位からの逆換算とする
				SELECT
					MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) YM
					,T5.BP_CD CST_CD
					,w.SLS_DPT_CD
					,w.CRNT_DPT_CD
					,w.DW_DPT_CD
					,T5.USR_CD SLS_USR_CD
					,T5.TRD_CUR_CD
					,CASE
						WHEN M2.DSCNT_ITM_FLG = '1' THEN T4.TRD_CUR_UPRI * -1
						ELSE T4.TRD_CUR_UPRI
					END TRD_CUR_UPRI
					,T6.COST_UPRI
					,T4.TAX_CD
					,T4.TRD_CUR_DSCNT_AMT
					,T4.TRD_UNIT_QTY
					,SUM(T3.BASE_UNIT_QTY - T3.SHIP_ACT_QTY) * CONV_BASE_QTY / CONV_QTY TRD_UNIT_REM_QTY
					,SUM(T3.BASE_UNIT_QTY - T3.SHIP_ACT_QTY) BASE_UNIT_REM_QTY
					,T4.BASE_UNIT_QTY DSCNT_BASE_QTY
				FROM
					MST_SLS_SCHD T1
					JOIN MST_SHIP_SCHD T2 ON (T1.SHIP_SCHD_NO = T2.SHIP_SCHD_NO)
					JOIN MST_SHIP_ALLOC_STS T3 ON (T2.SHIP_SCHD_NO = T3.SHIP_SCHD_NO)
					JOIN MST_DLV_SLIP_D T4 ON (T3.DLV_SLIP_D_NO = T4.DLV_SLIP_D_NO AND T3.DLV_SLIP_NO = T4.DLV_SLIP_NO AND T3.DLV_SLIP_SEQ = T4.DLV_SLIP_SEQ)
					JOIN MST_DLV_SLIP T5 ON (T4.DLV_SLIP_NO = T5.DLV_SLIP_NO AND T4.DLV_SLIP_SEQ = T5.DLV_SLIP_SEQ)
					JOIN MST_SLO_D T6 ON (T1.SLO_D_NO = T6.SLO_D_NO)
                    LEFT JOIN MAM_DPT D ON (T5.DPT_CD = D.DPT_CD AND MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) BETWEEN D.ST_DT AND D.END_DT)
                    LEFT JOIN MAM_DPT_MAP DM ON (T5.DPT_CD = DM.OLD_DPT_CD AND MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) BETWEEN DM.ST_DT AND DM.END_DT)
					INNER JOIN MSW_SLS_SUM_DPT_LVL w ON (NVL2(D.DPT_CD, D.DPT_CD, DM.NEW_DPT_CD) = w.SLS_DPT_CD AND MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) = w.YM)
					LEFT JOIN MAVM_ITM_UNIT M1 ON (T2.ITM_CD = M1.ITM_CD AND T2.ITM_SUB1 = M1.ITM_SUB1 AND T2.ITM_SUB2 = M1.ITM_SUB2 AND T2.ITM_SUB3 = M1.ITM_SUB3 AND T1.TRD_UNIT_CD = M1.UNIT_CD)
					LEFT JOIN MAM_ITM M2 ON (T2.ITM_CD = M2.ITM_CD AND T2.ITM_SUB1 = M2.ITM_SUB1 AND T2.ITM_SUB2 = M2.ITM_SUB2 AND T2.ITM_SUB3 = M2.ITM_SUB3)
				WHERE
					0 = 0
				AND T1.CMPL_FLG = '0'
				AND T1.SLS_SCHD_DT BETWEEN L_ST_DT AND L_END_DT
				AND T1.DLV_SLIP_D_NO IS NULL
				AND T3.SHIP_INST_D_NO IS NOT NULL
				AND T3.SHIP_ACT_QTY < T3.BASE_UNIT_QTY
				AND T5.SLIP_STS_TYP IN (MAC_SLIP_STS_TYP.CRT, MAC_SLIP_STS_TYP.DIS)
				GROUP BY
					T1.SLS_SCHD_DT
					,T5.BP_CD
					,w.SLS_DPT_CD
					,w.CRNT_DPT_CD
					,w.DW_DPT_CD
					,T5.USR_CD
					,T5.TRD_CUR_CD
					,T4.TRD_CUR_UPRI
					,T6.COST_UPRI
					,T4.TAX_CD
					,T4.TRD_CUR_DSCNT_AMT
					,T4.TRD_UNIT_QTY
					,T4.BASE_UNIT_QTY
					,M1.CONV_QTY
					,M1.CONV_BASE_QTY
					,M2.DSCNT_ITM_FLG
				UNION ALL
				-- 出荷実績後の売上予定（インボイス取引除く）
				-- 出荷実績以降、受注なしの出荷実績も対象となる
				SELECT
					MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) YM
					,T3.BP_CD CST_CD
					,w.SLS_DPT_CD
					,w.CRNT_DPT_CD
					,w.DW_DPT_CD
					,T3.USR_CD SLS_USR_CD
					,T3.TRD_CUR_CD
					,CASE
						WHEN M3.DSCNT_ITM_FLG = '1' THEN T2.TRD_CUR_UPRI * -1
						ELSE T2.TRD_CUR_UPRI
					END TRD_CUR_UPRI
					,CASE
					  WHEN T4.SLO_D_NO IS NOT NULL THEN T4.COST_UPRI
					  ELSE MAPA_STD_COST.F_GET_STD_UPRI(T2.itm_cd, T2.itm_sub1, T2.itm_sub2, T2.itm_sub3, T3.ship_tm, M2.WG_CD, G_GM_STD_UPRI_SEL_TYP)
					 END COST_UPRI
					,T2.TAX_CD
					,T2.TRD_CUR_DSCNT_AMT
					,T1.TRD_UNIT_QTY
					,CASE
					  WHEN T1.TRD_UNIT_CD = T1.BASE_UNIT_CD THEN T1.BASE_UNIT_QTY - T1.BASE_UNIT_ABORT_QTY - T1.BASE_UNIT_SLS_QTY
					  ELSE (T1.BASE_UNIT_QTY - T1.BASE_UNIT_ABORT_QTY - T1.BASE_UNIT_SLS_QTY) * CONV_BASE_QTY / CONV_QTY
					 END TRD_UNIT_REM_QTY
					,T1.BASE_UNIT_QTY - T1.BASE_UNIT_ABORT_QTY - T1.BASE_UNIT_SLS_QTY BASE_UNIT_REM_QTY
					,T2.BASE_UNIT_QTY DSCNT_BASE_QTY
				FROM
					MST_SLS_SCHD T1
					INNER JOIN MST_DLV_SLIP_D T2 ON (T1.DLV_SLIP_D_NO = T2.DLV_SLIP_D_NO)
					INNER JOIN MST_DLV_SLIP T3 ON (T2.DLV_SLIP_NO = T3.DLV_SLIP_NO AND T2.DLV_SLIP_SEQ = T3.DLV_SLIP_SEQ)
					LEFT JOIN MST_SLO_D T4 ON (T1.SLO_D_NO = T4.SLO_D_NO)
                    LEFT JOIN MAM_DPT D ON (T3.DPT_CD = D.DPT_CD AND MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) BETWEEN D.ST_DT AND D.END_DT)
                    LEFT JOIN MAM_DPT_MAP DM ON (T3.DPT_CD = DM.OLD_DPT_CD AND MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) BETWEEN DM.ST_DT AND DM.END_DT)
					INNER JOIN MSW_SLS_SUM_DPT_LVL w ON (NVL2(D.DPT_CD, D.DPT_CD, DM.NEW_DPT_CD) = w.SLS_DPT_CD AND MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) = w.YM)
					LEFT JOIN MAVM_ITM_UNIT M1 ON (T2.ITM_CD = M1.ITM_CD AND T2.ITM_SUB1 = M1.ITM_SUB1 AND T2.ITM_SUB2 = M1.ITM_SUB2 AND T2.ITM_SUB3 = M1.ITM_SUB3 AND T1.TRD_UNIT_CD = M1.UNIT_CD)
					LEFT JOIN MAM_DPT M2 ON (T3.DPT_CD = M2.DPT_CD AND T3.SHIP_TM BETWEEN M2.ST_DT AND M2.END_DT)
					LEFT JOIN MAM_ITM M3 ON (T2.ITM_CD = M3.ITM_CD AND T2.ITM_SUB1 = M3.ITM_SUB1 AND T2.ITM_SUB2 = M3.ITM_SUB2 AND T2.ITM_SUB3 = M3.ITM_SUB3)
				WHERE
				0 = 0
				AND T1.CMPL_FLG = '0'
				AND T1.SLS_SCHD_DT IS NOT NULL
				AND T1.SLS_SCHD_DT BETWEEN L_ST_DT AND L_END_DT
				AND T1.DLV_SLIP_D_NO IS NOT NULL
				AND T1.IV_D_NO IS NULL
				AND T2.DLV_SLIP_D_SEQ = (
					SELECT MAX(W2.DLV_SLIP_D_SEQ)
					FROM MST_SHIP_ACT_D W1
					INNER JOIN MST_DLV_SLIP_D W2 ON (
						W2.DLV_SLIP_D_NO = W1.DLV_SLIP_D_NO AND W2.DLV_SLIP_NO = W1.DLV_SLIP_NO AND W2.DLV_SLIP_SEQ = W1.DLV_SLIP_SEQ
					)
					WHERE W1.DLV_SLIP_D_NO = T1.DLV_SLIP_D_NO AND W1.CAN_FLG = '0'
				)
				UNION ALL
				-- 追加したインボイス明細に対応する売上予定（受注がないので、インボイストランから取得する）
				-- 追加したインボイス明細には一部売上はない
				SELECT
					MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) YM
					,T3.SHIP_RQST_ID_CD CST_CD
					,w.SLS_DPT_CD
					,w.CRNT_DPT_CD
					,w.DW_DPT_CD
					,T2.SLS_USR_CD
					,T3.TRD_CUR_CD
					,CASE
						WHEN M3.DSCNT_ITM_FLG = '1' THEN T2.TRD_CUR_UPRI * -1
						ELSE T2.TRD_CUR_UPRI
					END TRD_CUR_UPRI
					,MAPA_STD_COST.F_GET_STD_UPRI(T2.itm_cd, T2.itm_sub1, T2.itm_sub2, T2.itm_sub3, T3.iv_dt, M2.WG_CD, G_GM_STD_UPRI_SEL_TYP) COST_UPRI
					,T2.TAX_CD
					,T2.TRD_CUR_DSCNT_AMT
					,T1.TRD_UNIT_QTY
					,T1.TRD_UNIT_QTY TRD_UNIT_REM_QTY
					,T1.BASE_UNIT_QTY BASE_UNIT_REM_QTY
					,T2.BASE_UNIT_QTY DSCNT_BASE_QTY
				FROM
					MST_SLS_SCHD T1
					INNER JOIN MST_IV_D T2 ON (T1.IV_D_NO = T2.IV_D_NO)
					INNER JOIN MST_IV T3 ON (T2.IV_MNG_NO = T3.IV_MNG_NO)
                    LEFT JOIN MAM_DPT D ON (T2.SLS_DPT_CD = D.DPT_CD AND MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) BETWEEN D.ST_DT AND D.END_DT)
                    LEFT JOIN MAM_DPT_MAP DM ON (T2.SLS_DPT_CD = DM.OLD_DPT_CD AND MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) BETWEEN DM.ST_DT AND DM.END_DT)
					INNER JOIN MSW_SLS_SUM_DPT_LVL w ON (NVL2(D.DPT_CD, D.DPT_CD, DM.NEW_DPT_CD) = w.SLS_DPT_CD AND MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) = w.YM)
					LEFT JOIN MAM_DPT M2 ON (T2.SLS_DPT_CD = M2.DPT_CD AND T3.IV_DT BETWEEN M2.ST_DT AND M2.END_DT)
					LEFT JOIN MAM_ITM M3 ON (T2.ITM_CD = M3.ITM_CD AND T2.ITM_SUB1 = M3.ITM_SUB1 AND T2.ITM_SUB2 = M3.ITM_SUB2 AND T2.ITM_SUB3 = M3.ITM_SUB3)
				WHERE
				0 = 0
				AND T1.CMPL_FLG = '0'
				AND T1.SLS_SCHD_DT BETWEEN L_ST_DT AND L_END_DT
				UNION ALL
				-- 出荷指図の売上予定（インボイス取引。出荷実績後、インボイス登録済は除く）
				-- 納品書明細と出荷引当状況から適切な取引単位残数が計算できないので、常に基準単位からの逆換算とする
				SELECT
					MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) YM
					,T5.BP_CD CST_CD
					,w.SLS_DPT_CD
					,w.CRNT_DPT_CD
					,w.DW_DPT_CD
					,T5.USR_CD SLS_USR_CD
					,T5.TRD_CUR_CD
					,CASE
						WHEN M2.DSCNT_ITM_FLG = '1' THEN T4.TRD_CUR_UPRI * -1
						ELSE T4.TRD_CUR_UPRI
					END TRD_CUR_UPRI
					,T6.COST_UPRI
					,T4.TAX_CD
					,T4.TRD_CUR_DSCNT_AMT
					,T4.TRD_UNIT_QTY
					,SUM(T3.BASE_UNIT_QTY - GREATEST(NVL(V1.IV_QTY, 0), T3.SHIP_ACT_QTY)) * CONV_BASE_QTY / CONV_QTY TRD_UNIT_REM_QTY
					,SUM(T3.BASE_UNIT_QTY - GREATEST(NVL(V1.IV_QTY, 0), T3.SHIP_ACT_QTY)) BASE_UNIT_REM_QTY
					,T4.BASE_UNIT_QTY DSCNT_BASE_QTY
				FROM
					MST_SLS_SCHD T1
					JOIN MST_SHIP_PR T7 ON (T1.SLO_D_NO = T7.SLO_D_NO)
					JOIN MST_SHIP_SCHD T2 ON (T7.SHIP_PR_NO = T2.SHIP_PR_NO)
					JOIN MST_SHIP_ALLOC_STS T3 ON (T2.SHIP_SCHD_NO = T3.SHIP_SCHD_NO)
					JOIN MST_DLV_SLIP_D T4 ON (T3.DLV_SLIP_NO = T4.DLV_SLIP_NO AND T3.DLV_SLIP_SEQ = T4.DLV_SLIP_SEQ AND T3.DLV_SLIP_D_NO = T4.DLV_SLIP_D_NO)
					JOIN MST_DLV_SLIP T5 ON (T4.DLV_SLIP_NO = T5.DLV_SLIP_NO AND T4.DLV_SLIP_SEQ = T5.DLV_SLIP_SEQ)
					JOIN MST_SLO_D T6 ON (T1.SLO_D_NO = T6.SLO_D_NO)
					LEFT OUTER JOIN(
						SELECT
							ST1.SHIP_ALLOC_STS_NO,
							SUM(ST1.BASE_UNIT_QTY) IV_QTY
						FROM
							MST_IV_SHIP_INST_MAP ST1
						GROUP BY
							ST1.SHIP_ALLOC_STS_NO
					) V1 ON (T3.SHIP_ALLOC_STS_NO = V1.SHIP_ALLOC_STS_NO)
					LEFT JOIN MAM_DPT D ON (T5.DPT_CD = D.DPT_CD AND MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) BETWEEN D.ST_DT AND D.END_DT)
					LEFT JOIN MAM_DPT_MAP DM ON (T5.DPT_CD = DM.OLD_DPT_CD AND MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) BETWEEN DM.ST_DT AND DM.END_DT)
					INNER JOIN MSW_SLS_SUM_DPT_LVL w ON (NVL2(D.DPT_CD, D.DPT_CD, DM.NEW_DPT_CD) = w.SLS_DPT_CD AND MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) = w.YM)
					LEFT JOIN MAVM_ITM_UNIT M1 ON (T2.ITM_CD = M1.ITM_CD AND T2.ITM_SUB1 = M1.ITM_SUB1 AND T2.ITM_SUB2 = M1.ITM_SUB2 AND T2.ITM_SUB3 = M1.ITM_SUB3 AND T1.TRD_UNIT_CD = M1.UNIT_CD)
					LEFT JOIN MAM_ITM M2 ON (T2.ITM_CD = M2.ITM_CD AND T2.ITM_SUB1 = M2.ITM_SUB1 AND T2.ITM_SUB2 = M2.ITM_SUB2 AND T2.ITM_SUB3 = M2.ITM_SUB3)
					LEFT JOIN MAM_BP CST ON (T5.BP_CD = CST.BP_CD AND CST.CST_FLG = '1')
				WHERE
					0 = 0
				AND T1.CMPL_FLG = '0'
				AND T1.SLS_SCHD_DT BETWEEN L_ST_DT AND L_END_DT
				AND T1.IV_D_NO IS NULL
				AND T3.SHIP_INST_D_NO IS NOT NULL
				AND CST.CST_IV_FLG = '1'
				AND T3.SHIP_ACT_QTY < T3.BASE_UNIT_QTY
				AND T3.BASE_UNIT_QTY - GREATEST(NVL(V1.IV_QTY, 0), T3.SHIP_ACT_QTY) > 0
				AND T5.SLIP_STS_TYP IN (MAC_SLIP_STS_TYP.CRT, MAC_SLIP_STS_TYP.DIS)
				GROUP BY
					T1.SLS_SCHD_DT
					,T5.BP_CD
					,w.SLS_DPT_CD
					,w.CRNT_DPT_CD
					,w.DW_DPT_CD
					,T5.USR_CD
					,T5.TRD_CUR_CD
					,T4.TRD_CUR_UPRI
					,T6.COST_UPRI
					,T4.TAX_CD
					,T4.TRD_CUR_DSCNT_AMT
					,T4.TRD_UNIT_QTY
					,T4.BASE_UNIT_QTY
					,M1.CONV_QTY
					,M1.CONV_BASE_QTY
					,M2.DSCNT_ITM_FLG
				UNION ALL
				-- 出荷実績の売上予定（インボイス取引。出荷実績後は除く）
				-- 納品書明細と出荷引当状況から適切な取引単位残数が計算できないので、常に基準単位からの逆換算とする
				SELECT
					MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) YM
					,T5.BP_CD CST_CD
					,w.SLS_DPT_CD
					,w.CRNT_DPT_CD
					,w.DW_DPT_CD
					,T5.USR_CD SLS_USR_CD
					,T5.TRD_CUR_CD
					,CASE
						WHEN M2.DSCNT_ITM_FLG = '1' THEN T4.TRD_CUR_UPRI * -1
						ELSE T4.TRD_CUR_UPRI
					END TRD_CUR_UPRI
					,T6.COST_UPRI
					,T4.TAX_CD
					,T4.TRD_CUR_DSCNT_AMT
					,T4.TRD_UNIT_QTY
					,SUM(T8.BASE_UNIT_QTY - T8.SHIP_RET_QTY - NVL(V1.IV_QTY, 0)) * CONV_BASE_QTY / CONV_QTY TRD_UNIT_REM_QTY
					,SUM(T8.BASE_UNIT_QTY - T8.SHIP_RET_QTY - NVL(V1.IV_QTY, 0)) BASE_UNIT_REM_QTY
					,T4.BASE_UNIT_QTY DSCNT_BASE_QTY
				FROM
					MST_SLS_SCHD T1
					JOIN MST_SHIP_PR T7 ON (T1.SLO_D_NO = T7.SLO_D_NO)
					JOIN MST_SHIP_SCHD T2 ON (T7.SHIP_PR_NO = T2.SHIP_PR_NO)
					JOIN MST_SHIP_ALLOC_STS T3 ON (T2.SHIP_SCHD_NO = T3.SHIP_SCHD_NO)
					JOIN MST_SHIP_ACT_D T8 ON (T3.SHIP_ALLOC_STS_NO = T8.SHIP_ALLOC_STS_NO)
					JOIN MST_DLV_SLIP_D T4 ON (T8.DLV_SLIP_NO = T4.DLV_SLIP_NO AND T8.DLV_SLIP_SEQ = T4.DLV_SLIP_SEQ AND T8.DLV_SLIP_D_NO = T4.DLV_SLIP_D_NO)
					JOIN MST_DLV_SLIP T5 ON (T4.DLV_SLIP_NO = T5.DLV_SLIP_NO AND T4.DLV_SLIP_SEQ = T5.DLV_SLIP_SEQ)
					JOIN MST_SLO_D T6 ON (T1.SLO_D_NO = T6.SLO_D_NO)
					LEFT OUTER JOIN(
						SELECT
							ST1.SHIP_ALLOC_STS_NO,
							SUM(ST1.BASE_UNIT_QTY) IV_QTY
						FROM
							MST_IV_SHIP_ACT_MAP ST1
						GROUP BY
							ST1.SHIP_ALLOC_STS_NO
					) V1 ON (T3.SHIP_ALLOC_STS_NO = V1.SHIP_ALLOC_STS_NO)
					LEFT JOIN MAM_DPT D ON (T5.DPT_CD = D.DPT_CD AND MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) BETWEEN D.ST_DT AND D.END_DT)
					LEFT JOIN MAM_DPT_MAP DM ON (T5.DPT_CD = DM.OLD_DPT_CD AND MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) BETWEEN DM.ST_DT AND DM.END_DT)
					INNER JOIN MSW_SLS_SUM_DPT_LVL w ON (NVL2(D.DPT_CD, D.DPT_CD, DM.NEW_DPT_CD) = w.SLS_DPT_CD AND MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) = w.YM)
					LEFT JOIN MAVM_ITM_UNIT M1 ON (T2.ITM_CD = M1.ITM_CD AND T2.ITM_SUB1 = M1.ITM_SUB1 AND T2.ITM_SUB2 = M1.ITM_SUB2 AND T2.ITM_SUB3 = M1.ITM_SUB3 AND T1.TRD_UNIT_CD = M1.UNIT_CD)
					LEFT JOIN MAM_ITM M2 ON (T2.ITM_CD = M2.ITM_CD AND T2.ITM_SUB1 = M2.ITM_SUB1 AND T2.ITM_SUB2 = M2.ITM_SUB2 AND T2.ITM_SUB3 = M2.ITM_SUB3)
					LEFT JOIN MAM_BP CST ON (T5.BP_CD = CST.BP_CD AND CST.CST_FLG = '1')
				WHERE
					0 = 0
				AND T1.CMPL_FLG = '0'
				AND T1.SLS_SCHD_DT BETWEEN L_ST_DT AND L_END_DT
				AND T1.IV_D_NO IS NULL
				AND CST.CST_IV_FLG = '1'
				AND T8.BASE_UNIT_QTY - T8.SHIP_RET_QTY - NVL(V1.IV_QTY, 0) > 0
				AND T5.SLIP_STS_TYP IN (MAC_SLIP_STS_TYP.CRT, MAC_SLIP_STS_TYP.DIS)
				AND T8.CAN_FLG = '0'
				GROUP BY
					T1.SLS_SCHD_DT
					,T5.BP_CD
					,w.SLS_DPT_CD
					,w.CRNT_DPT_CD
					,w.DW_DPT_CD
					,T5.USR_CD
					,T5.TRD_CUR_CD
					,T4.TRD_CUR_UPRI
					,T6.COST_UPRI
					,T4.TAX_CD
					,T4.TRD_CUR_DSCNT_AMT
					,T4.TRD_UNIT_QTY
					,T4.BASE_UNIT_QTY
					,M1.CONV_QTY
					,M1.CONV_BASE_QTY
					,M2.DSCNT_ITM_FLG
				) V1
				LEFT JOIN MAM_TAX M1 ON (V1.TAX_CD = M1.TAX_CD)
				LEFT JOIN MAM_BP M2 ON (V1.CST_CD = M2.BP_CD)
				LEFT JOIN MAM_CUR M3 ON (V1.TRD_CUR_CD = M3.CUR_CD)
			) V2
		WHERE
			0 = 0
		GROUP BY
			V2.YM
			,V2.SLS_DPT_CD
			,V2.CRNT_DPT_CD
			,V2.DW_DPT_CD
			,V2.SLS_USR_CD
			,V2.CST_CD
			,V2.TRD_CUR_CD
		;

	END P_INS_SLO_BL_DPT ;

	PROCEDURE P_INS_SLS_BDG_DPT (
		I_YM			IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE
	)
	/**************************************************************************
	<SYNOPSIS>
		販売予算テーブルから部門をキーとした情報を取得し、売上集計受注ワークに
		登録する。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<HISTORY>
	**************************************************************************/
	IS
		L_ST_YM			MAPA_META.YM%TYPE;
		L_END_YM		MAPA_META.YM%TYPE;
	BEGIN
		L_ST_YM := I_YM;

		IF I_SLS_DISP_TERM IS NULL THEN
			-- 指定年月のデータのみ抽出
			L_END_YM := I_YM;
		ELSE
			--指定年月から表示期間分のデータを抽出
			L_END_YM := ADD_MONTHS(I_YM, I_SLS_DISP_TERM - 1);
		END IF;

		INSERT INTO MSW_SLO_SLS_SUM (
			YM,
			DPT_LVL_CD,
			SLS_DPT_CD,
			DPT_CD1,
			DPT_CD2,
			SLS_USR_CD,
			CST_CD,
			TRD_CUR_CD,
			SLS_ITM_GRP_CD,
			WRK_NO,
			XRATE,
			BDG_SLS_AMT,
			BDG_SLS_PROF_AMT,
			NOT_SUM_FLG,
			SPLN_USR_FLG
		)
		SELECT
			t.YM,
			G_DPT_LVL_CD,
			t.SLS_DPT_CD,
			w.CRNT_DPT_CD,
			w.DW_DPT_CD,
			t.SLS_USR_CD,
			t.CST_CD,
			t.TRD_CUR_CD,
			SLS_ITM_GRP_CD,
			t.WRK_NO,
			MAPA_XCHNG.F_GET_XRATE(
							t.TRD_CUR_CD,
							G_BASE_CUR_CD,
							G_XRATE_CD,
							MAPA_DT.F_GET_YM_ST_DT_NE(t.YM, G_CL_DAY, G_CL_MON_BASE)),
			t.BDG_SLS_AMT,
			t.BDG_SLS_PROF_AMT,
			t.NOT_SUM_FLG,
			'0'
		FROM
			MST_SLS_BDG t
			INNER JOIN MSW_SLS_SUM_DPT_LVL w ON (t.SLS_DPT_CD = w.SLS_DPT_CD AND t.YM = w.YM)
		WHERE 0=0
			AND t.YM BETWEEN L_ST_YM AND L_END_YM
			AND (t.SLS_BDG_GRP = G_SLS_BDG_GRP OR t.SLS_BDG_GRP IS NULL AND G_SLS_BDG_GRP IS NULL)
		;
	END P_INS_SLS_BDG_DPT;


	PROCEDURE P_INS_SPLN_SUM_DPT (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE
	)
	/**************************************************************************
	<SYNOPSIS>
		販売計画集計テーブルから部門をキーとした情報を取得し、売上集計受注ワークに
		登録する。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<HISTORY>
	**************************************************************************/
	IS
		L_ST_YM			MAPA_META.YM%TYPE;
		L_END_YM		MAPA_META.YM%TYPE;
	BEGIN
		L_ST_YM := I_YM;

		IF I_SLS_DISP_TERM IS NULL THEN
			-- 指定年月のデータのみ抽出
			L_END_YM := I_YM;
		ELSE
			--指定年月から表示期間分のデータを抽出
			L_END_YM := ADD_MONTHS(I_YM, I_SLS_DISP_TERM - 1);
		END IF;

		-- 担当者含まない
		INSERT INTO MSW_SLO_SLS_SUM (
			YM,
			DPT_LVL_CD,
			SLS_DPT_CD,
			DPT_CD1,
			DPT_CD2,
			SLS_USR_CD,
			CST_CD,
			TRD_CUR_CD,
			XRATE,
			SPLN_AMT,
			NOT_SUM_FLG,
			SPLN_USR_FLG
		)
		SELECT
			t.SPLN_YM,
			G_DPT_LVL_CD,
			t.DPT_CD,
			w.CRNT_DPT_CD,
			w.DW_DPT_CD,
			NULL,
			t.CST_CD,
			t.CUR_CD,
			MAPA_XCHNG.F_GET_XRATE(
							t.CUR_CD,
							G_BASE_CUR_CD,
							G_XRATE_CD,
							MAPA_DT.F_GET_YM_ST_DT_NE(t.SPLN_YM, G_CL_DAY, G_CL_MON_BASE)),
			t.SPLN_AMT,
			'0',
			'0'
		FROM
			MST_SPLN_SUM_ITM_NEW t
			INNER JOIN MSW_SLS_SUM_DPT_LVL w ON (t.DPT_CD = w.SLS_DPT_CD AND t.SPLN_YM = w.YM)
		WHERE 0=0
			AND t.SPLN_YM BETWEEN L_ST_YM AND L_END_YM
		;

		-- 担当者含む
		INSERT INTO MSW_SLO_SLS_SUM (
			YM,
			DPT_LVL_CD,
			SLS_DPT_CD,
			DPT_CD1,
			DPT_CD2,
			SLS_USR_CD,
			CST_CD,
			TRD_CUR_CD,
			XRATE,
			SPLN_AMT,
			NOT_SUM_FLG,
			SPLN_USR_FLG
		)
		SELECT
			t.SPLN_YM,
			G_DPT_LVL_CD,
			t.DPT_CD,
			w.CRNT_DPT_CD,
			w.DW_DPT_CD,
			t.USR_CD,
			t.CST_CD,
			t.CUR_CD,
			MAPA_XCHNG.F_GET_XRATE(
							t.CUR_CD,
							G_BASE_CUR_CD,
							G_XRATE_CD,
							MAPA_DT.F_GET_YM_ST_DT_NE(t.SPLN_YM, G_CL_DAY, G_CL_MON_BASE)),
			t.SPLN_AMT,
			'0',
			'1'
		FROM
			MST_SPLN_USR_ITM_NEW t
			INNER JOIN MSW_SLS_SUM_DPT_LVL w ON (t.DPT_CD = w.SLS_DPT_CD AND t.SPLN_YM = w.YM)
		WHERE 0=0
			AND t.SPLN_YM BETWEEN L_ST_YM AND L_END_YM
		;

	END P_INS_SPLN_SUM_DPT ;


	PROCEDURE P_SLS_SUM_IG_MAIN (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE,
		I_SLS_ITM_GRP_LVL	IN MAPA_META.INT4%TYPE,
		I_USE_ACT_XRATE_FLG	IN MAPA_META.FLG%TYPE,
		I_SLS_BDG_GRP		IN MSPA_META.SLS_BDG_GRP%TYPE,
		I_XRATE_CD			IN MAPA_META.XRATE_CD%TYPE
	)
	/**************************************************************************
	<SYNOPSIS>
		指定年月、売上表示期間より品目体系別用の売上集計受注ワークを作成する
		メイン処理
	<REMARKS>
		呼び出し元の処理にて、画面で指定された品目階層の品目階層ＣＤを、
		レベル１として売上集計品目体系階層ワークに登録しておく必要がある。
	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<IN>
		I_SLS_ITM_GRP_LVL
			品目体系階層
	<IN>
		I_USE_ACT_XRATE_FLG
			実績を売上時レートで換算
	<IN>
		I_SLS_BDG_GRP
			予算分類
	<IN>
		I_XRATE_CD
			為替レートＣＤ
	<HISTORY>
	**************************************************************************/
	IS
		L_CO	MAM_CO%ROWTYPE ;
	BEGIN

		G_USE_ACT_XRATE_FLG	:= I_USE_ACT_XRATE_FLG;
		G_SLS_BDG_GRP		:= I_SLS_BDG_GRP;
		G_XRATE_CD			:= I_XRATE_CD ;

		L_CO				:= MAPA_CO.F_GET_CO_REC() ;
		G_CL_DAY			:= L_CO.AC_CL_DAY ;
		G_CL_MON_BASE		:= L_CO.AC_CL_MON_BASE ;
		G_BASE_CUR_CD		:= L_CO.BASE_CUR_CD ;
		G_GM_STD_UPRI_SEL_TYP		:= L_CO.GM_STD_UPRI_TYP ;

		SELECT AMT_DEC_PLACE INTO G_BASE_CUR_AMT_DEC_PLACE
		FROM MAM_CUR WHERE CUR_CD = G_BASE_CUR_CD;

		FOR x IN (
			SELECT	w.SLS_ITM_GRP_CD
			FROM	MSW_SLS_SUM_IG_LVL w
			WHERE	0=0
			AND	w.LVL = 1
			)
		LOOP
			P_INS_IG_LVL(x.SLS_ITM_GRP_CD);
		END LOOP;

		P_INS_SLS_SUM_ITM_GRP(I_YM, I_SLS_DISP_TERM) ;

		P_INS_SLO_SUM_ITM_GRP(I_YM, I_SLS_DISP_TERM) ;

		P_INS_SLO_BL_ITM_GRP(I_YM, I_SLS_DISP_TERM) ;

		P_INS_SLS_BDG_ITM_GRP(I_YM, I_SLS_DISP_TERM) ;

		P_INS_SPLN_SUM_ITM_GRP(I_YM, I_SLS_DISP_TERM) ;

	END P_SLS_SUM_IG_MAIN;


	PROCEDURE P_INS_IG_LVL (
		I_SLS_ITM_GRP_CD	IN MAPA_META.SLS_ITM_GRP_CD%TYPE
	)
	/**************************************************************************
	<SYNOPSIS>
		指定年月、売上表示期間、品目体系ＣＤを条件に売上集計部門階層ワークを作成する
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_SLS_ITM_GRP_CD
			品目体系ＣＤ
	<HISTORY>
	**************************************************************************/
	IS
	BEGIN

		FOR x IN (
			SELECT	m.SLS_ITM_GRP_CD
			FROM	MAM_SLS_ITM_GRP m
			WHERE	0=0
			AND	m.UP_SLS_ITM_GRP_CD = I_SLS_ITM_GRP_CD
			)
		LOOP
			INSERT INTO MSW_SLS_SUM_IG_LVL VALUES (
					x.SLS_ITM_GRP_CD,	--品目体系ＣＤ
					I_SLS_ITM_GRP_CD,	--指定階層品目体系ＣＤ
					x.SLS_ITM_GRP_CD,	--下位品目体系ＣＤ
					2					--レベル
					) ;
		END LOOP ;

		P_INS_IG_LVL(2, I_SLS_ITM_GRP_CD) ;

	END P_INS_IG_LVL ;


	PROCEDURE P_INS_IG_LVL (
		I_LVL					IN NUMBER,
		I_CRNT_SLS_ITM_GRP_CD	IN MAPA_META.SLS_ITM_GRP_CD%TYPE
	)
	/**************************************************************************
	<SYNOPSIS>
		指定レベルの売上集計品目体系階層ワークの品目体系ＣＤをもとに、下位階層の
		品目体系ＣＤを取得し、売上集計品目体系階層ワークに登録する。
		最下層の品目体系ＣＤまで同じ処理を繰り返し行う。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_LVL
			レベル
	<IN>
		I_CRNT_SLS_ITM_GRP_CD
			指定階層販売品目体系ＣＤ
	<HISTORY>
	**************************************************************************/
	IS
		L_CNT	NUMBER ;
	BEGIN

		SELECT COUNT(*) INTO L_CNT
		FROM MSW_SLS_SUM_IG_LVL w
		WHERE 0=0
		AND w.LVL = I_LVL AND w.CRNT_SLS_ITM_GRP_CD = I_CRNT_SLS_ITM_GRP_CD;

		IF L_CNT > 0 THEN
			FOR x IN (
				SELECT w.SLS_ITM_GRP_CD, w.CRNT_SLS_ITM_GRP_CD, w.DW_SLS_ITM_GRP_CD
				FROM MSW_SLS_SUM_IG_LVL w
				WHERE 0=0
				AND w.LVL = I_LVL AND w.CRNT_SLS_ITM_GRP_CD = I_CRNT_SLS_ITM_GRP_CD
				)
			LOOP
				FOR y IN (
					SELECT m.SLS_ITM_GRP_CD FROM MAM_SLS_ITM_GRP m
					WHERE	0=0
						AND m.UP_SLS_ITM_GRP_CD = x.SLS_ITM_GRP_CD
					)
				LOOP
					INSERT INTO MSW_SLS_SUM_IG_LVL VALUES(
								y.SLS_ITM_GRP_CD,
								x.CRNT_SLS_ITM_GRP_CD,
								x.DW_SLS_ITM_GRP_CD,
								I_LVL + 1
								) ;
				END LOOP ;

			END LOOP ;

			P_INS_IG_LVL(I_LVL + 1, I_CRNT_SLS_ITM_GRP_CD) ;

		END IF;

	END P_INS_IG_LVL ;


	PROCEDURE P_INS_SLS_SUM_ITM_GRP (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE
	)
	/**************************************************************************
	<SYNOPSIS>
		売上集計テーブルから品目体系ＣＤをキーとした情報を取得し、
		売上集計受注ワークに登録する。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<HISTORY>
	**************************************************************************/
	IS
	BEGIN

		-- 指定年月のデータのみ抽出
		IF I_SLS_DISP_TERM IS NULL THEN
			INSERT INTO MSW_SLO_SLS_SUM (
				YM,
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3,
				SLS_ITM_GRP_CD,
				SLS_ITM_GRP_CD1,
				SLS_ITM_GRP_CD2,
				SLS_USR_CD,
				CST_CD,
				TRD_CUR_CD,
				XRATE,
				SLS_QTY,
				SLS_AMT,
				BASE_CUR_SLS_AMT,
				SLS_COST_AMT,
				NOT_SUM_FLG,
				SPLN_USR_FLG
			)
			SELECT
				t.YM,
				t.ITM_CD,
				t.ITM_SUB1,
				t.ITM_SUB2,
				t.ITM_SUB3,
				w.SLS_ITM_GRP_CD,
				w.CRNT_SLS_ITM_GRP_CD,
				w.DW_SLS_ITM_GRP_CD,
				t.SLS_USR_CD,
				t.CST_CD,
				t.CUR_CD,
				MAPA_XCHNG.F_GET_XRATE(
								t.CUR_CD,
								G_BASE_CUR_CD,
								G_XRATE_CD,
								MAPA_DT.F_GET_YM_ST_DT_NE(t.YM, G_CL_DAY, G_CL_MON_BASE)),
				t.BASE_UNIT_SLS_QTY,
				t.TRD_CUR_SLS_AMT,
				t.BASE_CUR_SLS_AMT,
				t.COST_AMT,
				'0',
				'0'
			FROM
				MST_SLS_SUM t
				INNER JOIN MAM_ITM m ON (t.ITM_CD = m.ITM_CD AND t.ITM_SUB1 = m.ITM_SUB1 AND t.ITM_SUB2 = m.ITM_SUB2 AND t.ITM_SUB3 = m.ITM_SUB3)
				LEFT OUTER JOIN MAM_ITM_SUB SM ON (t.ITM_CD = SM.ITM_CD AND t.ITM_SUB1 = SM.ITM_SUB1 AND t.ITM_SUB2 = SM.ITM_SUB2 AND t.ITM_SUB3 = SM.ITM_SUB3
							AND	t.YM BETWEEN SM.ST_DT AND SM.END_DT AND SM.DEL_FLG = '0')
				INNER JOIN MSW_SLS_SUM_IG_LVL w ON (NVL2(SM.itm_cd, SM.SLS_ITM_GRP_CD, M.SLS_ITM_GRP_CD) = w.SLS_ITM_GRP_CD)
			WHERE 0=0
				AND t.YM = I_YM
			;
		--指定年月から表示期間分のデータを抽出
		ELSE
			INSERT INTO MSW_SLO_SLS_SUM (
				YM,
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3,
				SLS_ITM_GRP_CD,
				SLS_ITM_GRP_CD1,
				SLS_ITM_GRP_CD2,
				SLS_USR_CD,
				CST_CD,
				TRD_CUR_CD,
				XRATE,
				SLS_QTY,
				SLS_AMT,
				BASE_CUR_SLS_AMT,
				SLS_COST_AMT,
				NOT_SUM_FLG,
				SPLN_USR_FLG
			)
			SELECT
				t.YM,
				t.ITM_CD,
				t.ITM_SUB1,
				t.ITM_SUB2,
				t.ITM_SUB3,
				w.SLS_ITM_GRP_CD,
				w.CRNT_SLS_ITM_GRP_CD,
				w.DW_SLS_ITM_GRP_CD,
				t.SLS_USR_CD,
				t.CST_CD,
				t.CUR_CD,
				MAPA_XCHNG.F_GET_XRATE(
								t.CUR_CD,
								G_BASE_CUR_CD,
								G_XRATE_CD,
								MAPA_DT.F_GET_YM_ST_DT_NE(t.YM, G_CL_DAY, G_CL_MON_BASE)),
				t.BASE_UNIT_SLS_QTY,
				t.TRD_CUR_SLS_AMT,
				t.BASE_CUR_SLS_AMT,
				t.COST_AMT,
				'0',
				'0'
			FROM
				MST_SLS_SUM t
				INNER JOIN MAM_ITM m ON (t.ITM_CD = m.ITM_CD AND t.ITM_SUB1 = m.ITM_SUB1 AND t.ITM_SUB2 = m.ITM_SUB2 AND t.ITM_SUB3 = m.ITM_SUB3)
				LEFT OUTER JOIN MAM_ITM_SUB SM ON (t.ITM_CD = SM.ITM_CD AND t.ITM_SUB1 = SM.ITM_SUB1 AND t.ITM_SUB2 = SM.ITM_SUB2 AND t.ITM_SUB3 = SM.ITM_SUB3
								AND	t.YM BETWEEN SM.ST_DT AND SM.END_DT AND SM.DEL_FLG = '0')
				INNER JOIN MSW_SLS_SUM_IG_LVL w ON (NVL2(SM.ITM_CD, SM.SLS_ITM_GRP_CD, M.SLS_ITM_GRP_CD) = w.SLS_ITM_GRP_CD)
			WHERE 0=0
				AND t.YM BETWEEN I_YM AND ADD_MONTHS(I_YM, I_SLS_DISP_TERM - 1)
			;
		END IF;
	END P_INS_SLS_SUM_ITM_GRP ;


	PROCEDURE P_INS_SLO_SUM_ITM_GRP (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE
	)
	/**************************************************************************
	<SYNOPSIS>
		受注集計テーブルから品目体系ＣＤをキーとした情報を取得し、
		売上集計受注ワークに登録する。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<HISTORY>
	**************************************************************************/
	IS
	BEGIN

		-- 指定年月のデータのみ抽出
		IF I_SLS_DISP_TERM IS NULL THEN
			INSERT INTO MSW_SLO_SLS_SUM (
				YM,
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3,
				SLS_ITM_GRP_CD,
				SLS_ITM_GRP_CD1,
				SLS_ITM_GRP_CD2,
				SLS_USR_CD,
				CST_CD,
				TRD_CUR_CD,
				XRATE,
				SLO_QTY,
				SLO_AMT,
				SLO_COST_AMT,
				NOT_SUM_FLG,
				SPLN_USR_FLG
			)
			SELECT
				t.YM,
				t.ITM_CD,
				t.ITM_SUB1,
				t.ITM_SUB2,
				t.ITM_SUB3,
				t.SLS_ITM_GRP_CD,
				w.CRNT_SLS_ITM_GRP_CD,
				w.DW_SLS_ITM_GRP_CD,
				t.SLS_USR_CD,
				t.CST_CD,
				t.TRD_CUR_CD,
				MAPA_XCHNG.F_GET_XRATE(
								t.TRD_CUR_CD,
								G_BASE_CUR_CD,
								G_XRATE_CD,
								MAPA_DT.F_GET_YM_ST_DT_NE(t.YM, G_CL_DAY, G_CL_MON_BASE)),
				t.BASE_UNIT_SLO_QTY + t.BASE_UNIT_PRE_SLO_QTY,
				CASE
					WHEN M1.DSCNT_ITM_FLG = '1' THEN (t.TRD_CUR_SLO_AMT + t.TRD_CUR_PRE_SLO_AMT) * -1
					ELSE t.TRD_CUR_SLO_AMT + t.TRD_CUR_PRE_SLO_AMT
				END,
				t.SLO_COST_AMT + t.PRE_SLO_COST_AMT,
				'0',
				'0'
			FROM
				MST_FRCST_SLO_SUM t
				INNER JOIN MSW_SLS_SUM_IG_LVL w ON (t.SLS_ITM_GRP_CD = w.SLS_ITM_GRP_CD)
				LEFT JOIN MAM_ITM M1 ON (t.itm_cd = M1.itm_cd AND t.itm_sub1 = M1.itm_sub1 AND t.itm_sub2 = M1.itm_sub2 AND t.itm_sub3 = M1.itm_sub3)
			WHERE 0=0
				AND t.YM = I_YM
		;
		--指定年月から表示期間分のデータを抽出
		ELSE
			INSERT INTO MSW_SLO_SLS_SUM (
				YM,
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3,
				SLS_ITM_GRP_CD,
				SLS_ITM_GRP_CD1,
				SLS_ITM_GRP_CD2,
				SLS_USR_CD,
				CST_CD,
				TRD_CUR_CD,
				XRATE,
				SLO_QTY,
				SLO_AMT,
				SLO_COST_AMT,
				NOT_SUM_FLG,
				SPLN_USR_FLG
			)
			SELECT
				t.YM,
				t.ITM_CD,
				t.ITM_SUB1,
				t.ITM_SUB2,
				t.ITM_SUB3,
				t.SLS_ITM_GRP_CD,
				w.CRNT_SLS_ITM_GRP_CD,
				w.DW_SLS_ITM_GRP_CD,
				t.SLS_USR_CD,
				t.CST_CD,
				t.TRD_CUR_CD,
				MAPA_XCHNG.F_GET_XRATE(
								t.TRD_CUR_CD,
								G_BASE_CUR_CD,
								G_XRATE_CD,
								MAPA_DT.F_GET_YM_ST_DT_NE(t.YM, G_CL_DAY, G_CL_MON_BASE)),
				t.BASE_UNIT_SLO_QTY + t.BASE_UNIT_PRE_SLO_QTY,
				CASE
					WHEN M1.DSCNT_ITM_FLG = '1' THEN (t.TRD_CUR_SLO_AMT + t.TRD_CUR_PRE_SLO_AMT) * -1
					ELSE t.TRD_CUR_SLO_AMT + t.TRD_CUR_PRE_SLO_AMT
				END,
				t.SLO_COST_AMT + t.PRE_SLO_COST_AMT,
				'0',
				'0'
			FROM
				MST_FRCST_SLO_SUM t
				INNER JOIN MSW_SLS_SUM_IG_LVL w ON (t.SLS_ITM_GRP_CD = w.SLS_ITM_GRP_CD)
				LEFT JOIN MAM_ITM M1 ON (t.itm_cd = M1.itm_cd AND t.itm_sub1 = M1.itm_sub1 AND t.itm_sub2 = M1.itm_sub2 AND t.itm_sub3 = M1.itm_sub3)
			WHERE 0=0
				AND t.YM BETWEEN I_YM AND ADD_MONTHS(I_YM, I_SLS_DISP_TERM - 1)
			;
		END IF;
	END P_INS_SLO_SUM_ITM_GRP ;

	PROCEDURE P_INS_SLO_BL_ITM_GRP (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE
	)
	/**************************************************************************
	<SYNOPSIS>
		売上予定テーブルから品目体系をキーとした情報を取得し、売上集計受注ワークに
		登録する。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<HISTORY>
	**************************************************************************/
	IS
		L_ST_DT			MAPA_META.DT%TYPE;
		L_END_DT		MAPA_META.DT%TYPE;
	BEGIN
		L_ST_DT := MAPA_DT.F_GET_YM_ST_DT_NE(I_YM, G_CL_DAY, G_CL_MON_BASE);

		IF I_SLS_DISP_TERM IS NULL THEN
			-- 指定年月のデータのみ抽出
			L_END_DT := MAPA_DT.F_GET_YM_END_DT_NE(I_YM, G_CL_DAY, G_CL_MON_BASE);
		ELSE
			--指定年月から表示期間分のデータを抽出
			L_END_DT := MAPA_DT.F_GET_YM_END_DT_NE(ADD_MONTHS(I_YM, I_SLS_DISP_TERM - 1), G_CL_DAY, G_CL_MON_BASE);
		END IF;

		INSERT INTO MSW_SLO_SLS_SUM (
			YM,
			ITM_CD,
			ITM_SUB1,
			ITM_SUB2,
			ITM_SUB3,
			SLS_ITM_GRP_CD,
			SLS_ITM_GRP_CD1,
			SLS_ITM_GRP_CD2,
			SLS_USR_CD,
			CST_CD,
			TRD_CUR_CD,
			XRATE,
			SLO_BL_QTY,
			SLO_BL_AMT,
			SLO_BL_COST_AMT,
			NOT_SUM_FLG,
			SPLN_USR_FLG
		)
		SELECT
			V2.YM,
			V2.ITM_CD,
			V2.ITM_SUB1,
			V2.ITM_SUB2,
			V2.ITM_SUB3,
			V2.SLS_ITM_GRP_CD,
			w.CRNT_SLS_ITM_GRP_CD,
			w.DW_SLS_ITM_GRP_CD,
			V2.SLS_USR_CD,
			V2.CST_CD,
			V2.TRD_CUR_CD
			,MAPA_XCHNG.F_GET_XRATE(
				V2.TRD_CUR_CD,
				G_BASE_CUR_CD,
				G_XRATE_CD,
				MAPA_DT.F_GET_YM_ST_DT_NE(V2.YM, G_CL_DAY, G_CL_MON_BASE)) XRATE
			,SUM(V2.SLO_BL_QTY) SLO_BL_QTY
			,SUM(V2.SLO_BL_AMT) SLO_BL_AMT
			,SUM(V2.SLO_BL_COST_AMT) SLO_BL_COST_AMT
			,'0' NOT_SUM_FLG
			,'0' SPLN_USR_FLG
		FROM (
			SELECT
				V1.YM
				,V1.CST_CD
				,V1.SLS_USR_CD
				,V1.TRD_CUR_CD
				,V1.ITM_CD
				,V1.ITM_SUB1
				,V1.ITM_SUB2
				,V1.ITM_SUB3
				,V1.SLS_ITM_GRP_CD
				,V1.BASE_UNIT_REM_QTY SLO_BL_QTY
				,MAPA_AMT.F_GET_EXC_TAX_AMT(V1.TRD_CUR_UPRI, V1.TRD_UNIT_REM_QTY, M2.SLS_AMT_RND_TYP,
					M2.SLS_TAX_RND_TYP, M3.AMT_DEC_PLACE, M1.INC_TAX_FLG, M1.TAX_RATE,
					MAPA_CALC.F_RND_NE(V1.TRD_CUR_DSCNT_AMT * BASE_UNIT_REM_QTY / DSCNT_BASE_QTY, M3.AMT_DEC_PLACE, MAC_RND_TYP.RNDOFF)
				 ) SLO_BL_AMT
				,MAPA_CALC.F_RND_NE(V1.COST_UPRI * V1.BASE_UNIT_REM_QTY, G_BASE_CUR_AMT_DEC_PLACE , MAC_RND_TYP.RNDOFF) SLO_BL_COST_AMT
			FROM
				(
				-- 未出荷指図、未出荷実績（出荷指図対象外）、仕入直送、インボイス取引（行追加除く）の売上予定
				SELECT
					MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) YM
					,T3.CST_CD
					,T2.ITM_CD
					,T2.ITM_SUB1
					,T2.ITM_SUB2
					,T2.ITM_SUB3
					,NVL2(SM.ITM_CD, SM.SLS_ITM_GRP_CD, M2.SLS_ITM_GRP_CD)	SLS_ITM_GRP_CD
					,T3.SLS_USR_CD
					,T3.TRD_CUR_CD
					,CASE
						WHEN M2.DSCNT_ITM_FLG = '1' THEN T2.TRD_CUR_UPRI * -1
						ELSE T2.TRD_CUR_UPRI
					END TRD_CUR_UPRI
					,T2.COST_UPRI
					,T2.TAX_CD
					,T2.TRD_CUR_DSCNT_AMT
					,T1.TRD_UNIT_QTY
					,CASE
					  WHEN CST.CST_IV_FLG = '1' THEN
						CASE
						 WHEN T2.TRD_UNIT_CD = T2.BASE_UNIT_CD THEN T4.BASE_UNIT_QTY - T4.SHIP_SCHD_ABORT_QTY - T4.SHIP_RET_QTY - GREATEST(T4.IV_SCHD_QTY, T4.SHIP_INST_QTY, T4.SHIP_ACT_QTY)
						 ELSE (T4.BASE_UNIT_QTY - T4.SHIP_SCHD_ABORT_QTY - T4.SHIP_RET_QTY - GREATEST(T4.IV_SCHD_QTY, T4.SHIP_INST_QTY, T4.SHIP_ACT_QTY)) * CONV_BASE_QTY / CONV_QTY
						END 
					  ELSE
						CASE
						 WHEN T2.TRD_UNIT_CD = T1.BASE_UNIT_CD THEN T1.BASE_UNIT_QTY - T1.BASE_UNIT_ABORT_QTY - T1.BASE_UNIT_SLS_QTY
						 ELSE (T1.BASE_UNIT_QTY - T1.BASE_UNIT_ABORT_QTY - T1.BASE_UNIT_SLS_QTY) * CONV_BASE_QTY / CONV_QTY
						END
					END TRD_UNIT_REM_QTY
					,CASE
					  WHEN CST.CST_IV_FLG = '1' THEN T4.BASE_UNIT_QTY - T4.SHIP_SCHD_ABORT_QTY - T4.SHIP_RET_QTY - GREATEST(T4.IV_SCHD_QTY, T4.SHIP_INST_QTY, T4.SHIP_ACT_QTY)
					  ELSE T1.BASE_UNIT_QTY - T1.BASE_UNIT_ABORT_QTY - T1.BASE_UNIT_SLS_QTY
					END BASE_UNIT_REM_QTY
					,T2.BASE_UNIT_QTY DSCNT_BASE_QTY
				FROM
					MST_SLS_SCHD T1
					INNER JOIN MST_SLO_D T2 ON (T1.SLO_D_NO = T2.SLO_D_NO)
					INNER JOIN MST_SLO T3 ON (T2.SLO_NO = T3.SLO_NO)
					LEFT JOIN MAVM_ITM_UNIT M1 ON (T2.ITM_CD = M1.ITM_CD AND T2.ITM_SUB1 = M1.ITM_SUB1 AND T2.ITM_SUB2 = M1.ITM_SUB2 AND T2.ITM_SUB3 = M1.ITM_SUB3 AND T2.TRD_UNIT_CD = M1.UNIT_CD)
					LEFT JOIN MAM_ITM M2 ON (T2.ITM_CD = M2.ITM_CD AND T2.ITM_SUB1 = M2.ITM_SUB1 AND T2.ITM_SUB2 = M2.ITM_SUB2 AND T2.ITM_SUB3 = M2.ITM_SUB3)
					LEFT JOIN MAM_ITM_SUB SM ON (T2.ITM_CD = SM.ITM_CD AND T2.ITM_SUB1 = SM.ITM_SUB1 AND T2.ITM_SUB2 = SM.ITM_SUB2 AND T2.ITM_SUB3 = SM.ITM_SUB3
											AND	MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) BETWEEN SM.ST_DT AND SM.END_DT AND SM.DEL_FLG = '0')
					LEFT JOIN MAM_BP CST ON (T3.CST_CD = CST.BP_CD AND CST.CST_FLG = '1')
					LEFT JOIN MST_SHIP_PR T4 ON (T2.SLO_D_NO = T4.SLO_D_NO)
				WHERE
				    0 = 0
				AND T1.CMPL_FLG = '0'
				AND T1.SLS_SCHD_DT BETWEEN L_ST_DT AND L_END_DT
				AND T1.SLO_D_NO IS NOT NULL
				AND T1.SHIP_INST_D_NO IS NULL
				AND T1.DLV_SLIP_D_NO IS NULL
				AND T1.IV_D_NO IS NULL
				AND CASE
					 WHEN CST.CST_IV_FLG = '1' THEN T4.BASE_UNIT_QTY - T4.SHIP_SCHD_ABORT_QTY - T4.SHIP_RET_QTY - GREATEST(T4.IV_SCHD_QTY, T4.SHIP_INST_QTY, T4.SHIP_ACT_QTY)
					 ELSE T1.BASE_UNIT_QTY - T1.BASE_UNIT_ABORT_QTY - T1.BASE_UNIT_SLS_QTY 
					END > 0
				UNION ALL
				-- 出荷指図の売上予定（出荷実績後は除く）
				-- 納品書明細と出荷引当状況から適切な取引単位残数が計算できないので、常に基準単位からの逆換算とする
				SELECT
					MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) YM
					,T5.BP_CD CST_CD
					,T2.ITM_CD
					,T2.ITM_SUB1
					,T2.ITM_SUB2
					,T2.ITM_SUB3
					,NVL2(SM.ITM_CD, SM.SLS_ITM_GRP_CD, M2.SLS_ITM_GRP_CD)	SLS_ITM_GRP_CD
					,T5.USR_CD SLS_USR_CD
					,T5.TRD_CUR_CD
					,CASE
						WHEN M2.DSCNT_ITM_FLG = '1' THEN T4.TRD_CUR_UPRI * -1
						ELSE T4.TRD_CUR_UPRI
					END TRD_CUR_UPRI
					,T6.COST_UPRI
					,T4.TAX_CD
					,T4.TRD_CUR_DSCNT_AMT
					,T4.TRD_UNIT_QTY
					,SUM(T3.BASE_UNIT_QTY - T3.SHIP_ACT_QTY) * CONV_BASE_QTY / CONV_QTY TRD_UNIT_REM_QTY
					,SUM(T3.BASE_UNIT_QTY - T3.SHIP_ACT_QTY) BASE_UNIT_REM_QTY
					,T4.BASE_UNIT_QTY DSCNT_BASE_QTY
				FROM
					MST_SLS_SCHD T1
					JOIN MST_SHIP_SCHD T2 ON (T1.SHIP_SCHD_NO = T2.SHIP_SCHD_NO)
					JOIN MST_SHIP_ALLOC_STS T3 ON (T2.SHIP_SCHD_NO = T3.SHIP_SCHD_NO)
					JOIN MST_DLV_SLIP_D T4 ON (T3.DLV_SLIP_D_NO = T4.DLV_SLIP_D_NO AND T3.DLV_SLIP_NO = T4.DLV_SLIP_NO AND T3.DLV_SLIP_SEQ = T4.DLV_SLIP_SEQ)
					JOIN MST_DLV_SLIP T5 ON (T4.DLV_SLIP_NO = T5.DLV_SLIP_NO AND T4.DLV_SLIP_SEQ = T5.DLV_SLIP_SEQ)
					JOIN MST_SLO_D T6 ON (T1.SLO_D_NO = T6.SLO_D_NO)
					LEFT JOIN MAVM_ITM_UNIT M1 ON (T2.ITM_CD = M1.ITM_CD AND T2.ITM_SUB1 = M1.ITM_SUB1 AND T2.ITM_SUB2 = M1.ITM_SUB2 AND T2.ITM_SUB3 = M1.ITM_SUB3 AND T1.TRD_UNIT_CD = M1.UNIT_CD)
					LEFT JOIN MAM_ITM M2 ON (T2.ITM_CD = M2.ITM_CD AND T2.ITM_SUB1 = M2.ITM_SUB1 AND T2.ITM_SUB2 = M2.ITM_SUB2 AND T2.ITM_SUB3 = M2.ITM_SUB3)
					LEFT JOIN MAM_ITM_SUB SM ON (T2.ITM_CD = SM.ITM_CD AND T2.ITM_SUB1 = SM.ITM_SUB1 AND T2.ITM_SUB2 = SM.ITM_SUB2 AND T2.ITM_SUB3 = SM.ITM_SUB3
										AND	MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) BETWEEN SM.ST_DT AND SM.END_DT AND SM.DEL_FLG = '0')
				
				WHERE
					0 = 0
				AND T1.CMPL_FLG = '0'
				AND T1.SLS_SCHD_DT BETWEEN L_ST_DT AND L_END_DT
				AND T1.DLV_SLIP_D_NO IS NULL
				AND T3.SHIP_INST_D_NO IS NOT NULL
				AND T3.SHIP_ACT_QTY < T3.BASE_UNIT_QTY
				AND T5.SLIP_STS_TYP IN (MAC_SLIP_STS_TYP.CRT, MAC_SLIP_STS_TYP.DIS)
				GROUP BY
					T1.SLS_SCHD_DT
					,T5.BP_CD
					,T2.ITM_CD
					,T2.ITM_SUB1
					,T2.ITM_SUB2
					,T2.ITM_SUB3
					,NVL2(SM.ITM_CD, SM.SLS_ITM_GRP_CD, M2.SLS_ITM_GRP_CD)
					,T5.USR_CD
					,T5.TRD_CUR_CD
					,T4.TRD_CUR_UPRI
					,T6.COST_UPRI
					,T4.TAX_CD
					,T4.TRD_CUR_DSCNT_AMT
					,T4.TRD_UNIT_QTY
					,T4.BASE_UNIT_QTY
					,M1.CONV_QTY
					,M1.CONV_BASE_QTY
					,M2.DSCNT_ITM_FLG
				UNION ALL
				-- 出荷実績後の売上予定（インボイス取引除く）
				-- 出荷実績以降、受注なしの出荷実績も対象となる
				SELECT
					MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) YM
					,T3.BP_CD CST_CD
					,T2.ITM_CD
					,T2.ITM_SUB1
					,T2.ITM_SUB2
					,T2.ITM_SUB3
					,NVL2(SM.ITM_CD, SM.SLS_ITM_GRP_CD, M3.SLS_ITM_GRP_CD)
					,T3.USR_CD SLS_USR_CD
					,T3.TRD_CUR_CD
					,CASE
						WHEN M3.DSCNT_ITM_FLG = '1' THEN T2.TRD_CUR_UPRI * -1
						ELSE T2.TRD_CUR_UPRI
					END TRD_CUR_UPRI
					,CASE
					  WHEN T4.SLO_D_NO IS NOT NULL THEN T4.COST_UPRI
					  ELSE MAPA_STD_COST.F_GET_STD_UPRI(T2.itm_cd, T2.itm_sub1, T2.itm_sub2, T2.itm_sub3, T3.ship_tm, M2.WG_CD, G_GM_STD_UPRI_SEL_TYP)
					 END COST_UPRI
					,T2.TAX_CD
					,T2.TRD_CUR_DSCNT_AMT
					,T1.TRD_UNIT_QTY
					,CASE
					  WHEN T1.TRD_UNIT_CD = T1.BASE_UNIT_CD THEN T1.BASE_UNIT_QTY - T1.BASE_UNIT_ABORT_QTY - T1.BASE_UNIT_SLS_QTY
					  ELSE (T1.BASE_UNIT_QTY - T1.BASE_UNIT_ABORT_QTY - T1.BASE_UNIT_SLS_QTY) * CONV_BASE_QTY / CONV_QTY
					 END TRD_UNIT_REM_QTY
					,T1.BASE_UNIT_QTY - T1.BASE_UNIT_ABORT_QTY - T1.BASE_UNIT_SLS_QTY BASE_UNIT_REM_QTY
					,T2.BASE_UNIT_QTY DSCNT_BASE_QTY
				FROM
					MST_SLS_SCHD T1
					INNER JOIN MST_DLV_SLIP_D T2 ON (T1.DLV_SLIP_D_NO = T2.DLV_SLIP_D_NO)
					INNER JOIN MST_DLV_SLIP T3 ON (T2.DLV_SLIP_NO = T3.DLV_SLIP_NO AND T2.DLV_SLIP_SEQ = T3.DLV_SLIP_SEQ)
					LEFT JOIN MST_SLO_D T4 ON (T1.SLO_D_NO = T4.SLO_D_NO)
					LEFT JOIN MAVM_ITM_UNIT M1 ON (T2.ITM_CD = M1.ITM_CD AND T2.ITM_SUB1 = M1.ITM_SUB1 AND T2.ITM_SUB2 = M1.ITM_SUB2 AND T2.ITM_SUB3 = M1.ITM_SUB3 AND T1.TRD_UNIT_CD = M1.UNIT_CD)
					LEFT JOIN MAM_DPT M2 ON (T3.DPT_CD = M2.DPT_CD AND T3.SHIP_TM BETWEEN M2.ST_DT AND M2.END_DT)
					LEFT JOIN MAM_ITM M3 ON (T2.ITM_CD = M3.ITM_CD AND T2.ITM_SUB1 = M3.ITM_SUB1 AND T2.ITM_SUB2 = M3.ITM_SUB2 AND T2.ITM_SUB3 = M3.ITM_SUB3)
					LEFT JOIN MAM_ITM_SUB SM ON (T2.ITM_CD = SM.ITM_CD AND T2.ITM_SUB1 = SM.ITM_SUB1 AND T2.ITM_SUB2 = SM.ITM_SUB2 AND T2.ITM_SUB3 = SM.ITM_SUB3
										AND	MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) BETWEEN SM.ST_DT AND SM.END_DT AND SM.DEL_FLG = '0')
				WHERE
				0 = 0
				AND T1.CMPL_FLG = '0'
				AND T1.SLS_SCHD_DT IS NOT NULL
				AND T1.SLS_SCHD_DT BETWEEN L_ST_DT AND L_END_DT
				AND T1.DLV_SLIP_D_NO IS NOT NULL
				AND T1.IV_D_NO IS NULL
				AND T2.DLV_SLIP_D_SEQ = (
					SELECT MAX(W2.DLV_SLIP_D_SEQ)
					FROM MST_SHIP_ACT_D W1
					INNER JOIN MST_DLV_SLIP_D W2 ON (
						W2.DLV_SLIP_D_NO = W1.DLV_SLIP_D_NO AND W2.DLV_SLIP_NO = W1.DLV_SLIP_NO AND W2.DLV_SLIP_SEQ = W1.DLV_SLIP_SEQ
					)
					WHERE W1.DLV_SLIP_D_NO = T1.DLV_SLIP_D_NO AND W1.CAN_FLG = '0'
				)
				UNION ALL
				-- 追加したインボイス明細に対応する売上予定（受注がないので、インボイストランから取得する）
				-- 追加したインボイス明細には一部売上はない
				SELECT
					MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) YM
					,T3.SHIP_RQST_ID_CD CST_CD
					,T2.ITM_CD
					,T2.ITM_SUB1
					,T2.ITM_SUB2
					,T2.ITM_SUB3
					,NVL2(SM.ITM_CD, SM.SLS_ITM_GRP_CD, M3.SLS_ITM_GRP_CD)
					,T2.SLS_USR_CD
					,T3.TRD_CUR_CD
					,CASE
						WHEN M3.DSCNT_ITM_FLG = '1' THEN T2.TRD_CUR_UPRI * -1
						ELSE T2.TRD_CUR_UPRI
					END TRD_CUR_UPRI
					,MAPA_STD_COST.F_GET_STD_UPRI(T2.itm_cd, T2.itm_sub1, T2.itm_sub2, T2.itm_sub3, T3.iv_dt, M2.WG_CD, G_GM_STD_UPRI_SEL_TYP) COST_UPRI
					,T2.TAX_CD
					,T2.TRD_CUR_DSCNT_AMT
					,T1.TRD_UNIT_QTY
					,T1.TRD_UNIT_QTY TRD_UNIT_REM_QTY
					,T1.BASE_UNIT_QTY BASE_UNIT_REM_QTY
					,T2.BASE_UNIT_QTY DSCNT_BASE_QTY
				FROM
					MST_SLS_SCHD T1
					INNER JOIN MST_IV_D T2 ON (T1.IV_D_NO = T2.IV_D_NO)
					INNER JOIN MST_IV T3 ON (T2.IV_MNG_NO = T3.IV_MNG_NO)
					LEFT JOIN MAM_DPT M2 ON (T2.SLS_DPT_CD = M2.DPT_CD AND T3.IV_DT BETWEEN M2.ST_DT AND M2.END_DT)
					LEFT JOIN MAM_ITM M3 ON (T2.ITM_CD = M3.ITM_CD AND T2.ITM_SUB1 = M3.ITM_SUB1 AND T2.ITM_SUB2 = M3.ITM_SUB2 AND T2.ITM_SUB3 = M3.ITM_SUB3)
					LEFT JOIN MAM_ITM_SUB SM ON (T2.ITM_CD = SM.ITM_CD AND T2.ITM_SUB1 = SM.ITM_SUB1 AND T2.ITM_SUB2 = SM.ITM_SUB2 AND T2.ITM_SUB3 = SM.ITM_SUB3
										AND	MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) BETWEEN SM.ST_DT AND SM.END_DT AND SM.DEL_FLG = '0')
				WHERE
				0 = 0
				AND T1.CMPL_FLG = '0'
				AND T1.SLS_SCHD_DT BETWEEN L_ST_DT AND L_END_DT
				UNION ALL
				-- 出荷指図の売上予定（インボイス取引。出荷実績後、インボイス登録済は除く）
				-- 納品書明細と出荷引当状況から適切な取引単位残数が計算できないので、常に基準単位からの逆換算とする
				SELECT
					MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) YM
					,T5.BP_CD CST_CD
					,T2.ITM_CD
					,T2.ITM_SUB1
					,T2.ITM_SUB2
					,T2.ITM_SUB3
					,NVL2(SM.ITM_CD, SM.SLS_ITM_GRP_CD, M2.SLS_ITM_GRP_CD)	SLS_ITM_GRP_CD
					,T5.USR_CD SLS_USR_CD
					,T5.TRD_CUR_CD
					,CASE
						WHEN M2.DSCNT_ITM_FLG = '1' THEN T4.TRD_CUR_UPRI * -1
						ELSE T4.TRD_CUR_UPRI
					END TRD_CUR_UPRI
					,T6.COST_UPRI
					,T4.TAX_CD
					,T4.TRD_CUR_DSCNT_AMT
					,T4.TRD_UNIT_QTY
					,SUM(T3.BASE_UNIT_QTY - GREATEST(NVL(V1.IV_QTY, 0), T3.SHIP_ACT_QTY)) * CONV_BASE_QTY / CONV_QTY TRD_UNIT_REM_QTY
					,SUM(T3.BASE_UNIT_QTY - GREATEST(NVL(V1.IV_QTY, 0), T3.SHIP_ACT_QTY)) BASE_UNIT_REM_QTY
					,T4.BASE_UNIT_QTY DSCNT_BASE_QTY
				FROM
					MST_SLS_SCHD T1
					JOIN MST_SHIP_PR T7 ON (T1.SLO_D_NO = T7.SLO_D_NO)
					JOIN MST_SHIP_SCHD T2 ON (T7.SHIP_PR_NO = T2.SHIP_PR_NO)
					JOIN MST_SHIP_ALLOC_STS T3 ON (T2.SHIP_SCHD_NO = T3.SHIP_SCHD_NO)
					JOIN MST_DLV_SLIP_D T4 ON (T3.DLV_SLIP_NO = T4.DLV_SLIP_NO AND T3.DLV_SLIP_SEQ = T4.DLV_SLIP_SEQ AND T3.DLV_SLIP_D_NO = T4.DLV_SLIP_D_NO)
					JOIN MST_DLV_SLIP T5 ON (T4.DLV_SLIP_NO = T5.DLV_SLIP_NO AND T4.DLV_SLIP_SEQ = T5.DLV_SLIP_SEQ)
					JOIN MST_SLO_D T6 ON (T1.SLO_D_NO = T6.SLO_D_NO)
					LEFT OUTER JOIN(
						SELECT
							ST1.SHIP_ALLOC_STS_NO,
							SUM(ST1.BASE_UNIT_QTY) IV_QTY
						FROM
							MST_IV_SHIP_INST_MAP ST1
						GROUP BY
							ST1.SHIP_ALLOC_STS_NO
					) V1 ON (T3.SHIP_ALLOC_STS_NO = V1.SHIP_ALLOC_STS_NO)
					LEFT JOIN MAVM_ITM_UNIT M1 ON (T2.ITM_CD = M1.ITM_CD AND T2.ITM_SUB1 = M1.ITM_SUB1 AND T2.ITM_SUB2 = M1.ITM_SUB2 AND T2.ITM_SUB3 = M1.ITM_SUB3 AND T1.TRD_UNIT_CD = M1.UNIT_CD)
					LEFT JOIN MAM_ITM M2 ON (T2.ITM_CD = M2.ITM_CD AND T2.ITM_SUB1 = M2.ITM_SUB1 AND T2.ITM_SUB2 = M2.ITM_SUB2 AND T2.ITM_SUB3 = M2.ITM_SUB3)
					LEFT JOIN MAM_ITM_SUB SM ON (T2.ITM_CD = SM.ITM_CD AND T2.ITM_SUB1 = SM.ITM_SUB1 AND T2.ITM_SUB2 = SM.ITM_SUB2 AND T2.ITM_SUB3 = SM.ITM_SUB3
										AND	MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) BETWEEN SM.ST_DT AND SM.END_DT AND SM.DEL_FLG = '0')
					LEFT JOIN MAM_BP CST ON (T5.BP_CD = CST.BP_CD AND CST.CST_FLG = '1')
				WHERE
					0 = 0
				AND T1.CMPL_FLG = '0'
				AND T1.SLS_SCHD_DT BETWEEN L_ST_DT AND L_END_DT
				AND T1.IV_D_NO IS NULL
				AND T3.SHIP_INST_D_NO IS NOT NULL
				AND CST.CST_IV_FLG = '1'
				AND T3.SHIP_ACT_QTY < T3.BASE_UNIT_QTY
				AND T3.BASE_UNIT_QTY - GREATEST(NVL(V1.IV_QTY, 0), T3.SHIP_ACT_QTY) > 0
				AND T5.SLIP_STS_TYP IN (MAC_SLIP_STS_TYP.CRT, MAC_SLIP_STS_TYP.DIS)
				GROUP BY
					T1.SLS_SCHD_DT
					,T5.BP_CD
					,T2.ITM_CD
					,T2.ITM_SUB1
					,T2.ITM_SUB2
					,T2.ITM_SUB3
					,NVL2(SM.ITM_CD, SM.SLS_ITM_GRP_CD, M2.SLS_ITM_GRP_CD)
					,T5.USR_CD
					,T5.TRD_CUR_CD
					,T4.TRD_CUR_UPRI
					,T6.COST_UPRI
					,T4.TAX_CD
					,T4.TRD_CUR_DSCNT_AMT
					,T4.TRD_UNIT_QTY
					,T4.BASE_UNIT_QTY
					,M1.CONV_QTY
					,M1.CONV_BASE_QTY
					,M2.DSCNT_ITM_FLG
				UNION ALL
				-- 出荷実績の売上予定（インボイス取引。出荷実績後は除く）
				-- 納品書明細と出荷引当状況から適切な取引単位残数が計算できないので、常に基準単位からの逆換算とする
				SELECT
					MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) YM
					,T5.BP_CD CST_CD
					,T2.ITM_CD
					,T2.ITM_SUB1
					,T2.ITM_SUB2
					,T2.ITM_SUB3
					,NVL2(SM.ITM_CD, SM.SLS_ITM_GRP_CD, M2.SLS_ITM_GRP_CD)	SLS_ITM_GRP_CD
					,T5.USR_CD SLS_USR_CD
					,T5.TRD_CUR_CD
					,CASE
						WHEN M2.DSCNT_ITM_FLG = '1' THEN T4.TRD_CUR_UPRI * -1
						ELSE T4.TRD_CUR_UPRI
					END TRD_CUR_UPRI
					,T6.COST_UPRI
					,T4.TAX_CD
					,T4.TRD_CUR_DSCNT_AMT
					,T4.TRD_UNIT_QTY
					,SUM(T8.BASE_UNIT_QTY - T8.SHIP_RET_QTY - NVL(V1.IV_QTY, 0)) * CONV_BASE_QTY / CONV_QTY TRD_UNIT_REM_QTY
					,SUM(T8.BASE_UNIT_QTY - T8.SHIP_RET_QTY - NVL(V1.IV_QTY, 0)) BASE_UNIT_REM_QTY
					,T4.BASE_UNIT_QTY DSCNT_BASE_QTY
				FROM
					MST_SLS_SCHD T1
					JOIN MST_SHIP_PR T7 ON (T1.SLO_D_NO = T7.SLO_D_NO)
					JOIN MST_SHIP_SCHD T2 ON (T7.SHIP_PR_NO = T2.SHIP_PR_NO)
					JOIN MST_SHIP_ALLOC_STS T3 ON (T2.SHIP_SCHD_NO = T3.SHIP_SCHD_NO)
					JOIN MST_SHIP_ACT_D T8 ON (T3.SHIP_ALLOC_STS_NO = T8.SHIP_ALLOC_STS_NO)
					JOIN MST_DLV_SLIP_D T4 ON (T8.DLV_SLIP_NO = T4.DLV_SLIP_NO AND T8.DLV_SLIP_SEQ = T4.DLV_SLIP_SEQ AND T8.DLV_SLIP_D_NO = T4.DLV_SLIP_D_NO)
					JOIN MST_DLV_SLIP T5 ON (T4.DLV_SLIP_NO = T5.DLV_SLIP_NO AND T4.DLV_SLIP_SEQ = T5.DLV_SLIP_SEQ)
					JOIN MST_SLO_D T6 ON (T1.SLO_D_NO = T6.SLO_D_NO)
					LEFT OUTER JOIN(
						SELECT
							ST1.SHIP_ALLOC_STS_NO,
							SUM(ST1.BASE_UNIT_QTY) IV_QTY
						FROM
							MST_IV_SHIP_ACT_MAP ST1
						GROUP BY
							ST1.SHIP_ALLOC_STS_NO
					) V1 ON (T3.SHIP_ALLOC_STS_NO = V1.SHIP_ALLOC_STS_NO)
					LEFT JOIN MAVM_ITM_UNIT M1 ON (T2.ITM_CD = M1.ITM_CD AND T2.ITM_SUB1 = M1.ITM_SUB1 AND T2.ITM_SUB2 = M1.ITM_SUB2 AND T2.ITM_SUB3 = M1.ITM_SUB3 AND T1.TRD_UNIT_CD = M1.UNIT_CD)
					LEFT JOIN MAM_ITM M2 ON (T2.ITM_CD = M2.ITM_CD AND T2.ITM_SUB1 = M2.ITM_SUB1 AND T2.ITM_SUB2 = M2.ITM_SUB2 AND T2.ITM_SUB3 = M2.ITM_SUB3)
					LEFT JOIN MAM_ITM_SUB SM ON (T2.ITM_CD = SM.ITM_CD AND T2.ITM_SUB1 = SM.ITM_SUB1 AND T2.ITM_SUB2 = SM.ITM_SUB2 AND T2.ITM_SUB3 = SM.ITM_SUB3
										AND	MAPA_DT.F_GET_AC_YM(T1.SLS_SCHD_DT, G_CL_DAY, G_CL_MON_BASE) BETWEEN SM.ST_DT AND SM.END_DT AND SM.DEL_FLG = '0')
					LEFT JOIN MAM_BP CST ON (T5.BP_CD = CST.BP_CD AND CST.CST_FLG = '1')
				WHERE
					0 = 0
				AND T1.CMPL_FLG = '0'
				AND T1.SLS_SCHD_DT BETWEEN L_ST_DT AND L_END_DT
				AND T1.IV_D_NO IS NULL
				AND CST.CST_IV_FLG = '1'
				AND T8.BASE_UNIT_QTY - T8.SHIP_RET_QTY - NVL(V1.IV_QTY, 0) > 0
				AND T5.SLIP_STS_TYP IN (MAC_SLIP_STS_TYP.CRT, MAC_SLIP_STS_TYP.DIS)
				AND T8.CAN_FLG = '0'
				GROUP BY
					T1.SLS_SCHD_DT
					,T5.BP_CD
					,T2.ITM_CD
					,T2.ITM_SUB1
					,T2.ITM_SUB2
					,T2.ITM_SUB3
					,NVL2(SM.ITM_CD, SM.SLS_ITM_GRP_CD, M2.SLS_ITM_GRP_CD)
					,T5.USR_CD
					,T5.TRD_CUR_CD
					,T4.TRD_CUR_UPRI
					,T6.COST_UPRI
					,T4.TAX_CD
					,T4.TRD_CUR_DSCNT_AMT
					,T4.TRD_UNIT_QTY
					,T4.BASE_UNIT_QTY
					,M1.CONV_QTY
					,M1.CONV_BASE_QTY
					,M2.DSCNT_ITM_FLG
				) V1
				LEFT JOIN MAM_TAX M1 ON (V1.TAX_CD = M1.TAX_CD)
				LEFT JOIN MAM_BP M2 ON (V1.CST_CD = M2.BP_CD)
				LEFT JOIN MAM_CUR M3 ON (V1.TRD_CUR_CD = M3.CUR_CD)
			) V2
		INNER JOIN MSW_SLS_SUM_IG_LVL w ON (V2.SLS_ITM_GRP_CD = w.SLS_ITM_GRP_CD)
		WHERE
			0 = 0
		GROUP BY
			V2.YM
			,V2.ITM_CD
			,V2.ITM_SUB1
			,V2.ITM_SUB2
			,V2.ITM_SUB3
			,V2.SLS_ITM_GRP_CD
			,w.CRNT_SLS_ITM_GRP_CD
			,w.DW_SLS_ITM_GRP_CD
			,V2.SLS_USR_CD
			,V2.CST_CD
			,V2.TRD_CUR_CD
		;

	END P_INS_SLO_BL_ITM_GRP ;

	PROCEDURE P_INS_SLS_BDG_ITM_GRP (
		I_YM			IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE
	)
	/**************************************************************************
	<SYNOPSIS>
		販売予算テーブルから品目体系ＣＤをキーとした情報を取得し、
		売上集計受注ワークに登録する。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<HISTORY>
	**************************************************************************/
	IS
	BEGIN

		-- 指定年月のデータのみ抽出
		IF I_SLS_DISP_TERM IS NULL THEN
			INSERT INTO MSW_SLO_SLS_SUM (
				YM,
				SLS_DPT_CD,
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3,
				SLS_ITM_GRP_CD,
				SLS_ITM_GRP_CD1,
				SLS_ITM_GRP_CD2,
				SLS_USR_CD,
				CST_CD,
				TRD_CUR_CD,
				WRK_NO,
				XRATE,
				BDG_SLS_AMT,
				BDG_SLS_PROF_AMT,
				NOT_SUM_FLG,
				SPLN_USR_FLG
			)
			SELECT
				t.YM,
				t.SLS_DPT_CD,
				null,
				null,
				null,
				null,
				t.SLS_ITM_GRP_CD,
				w.CRNT_SLS_ITM_GRP_CD,
				w.DW_SLS_ITM_GRP_CD,
				t.SLS_USR_CD,
				t.CST_CD,
				t.TRD_CUR_CD,
				t.WRK_NO,
				MAPA_XCHNG.F_GET_XRATE(
								t.TRD_CUR_CD,
								G_BASE_CUR_CD,
								G_XRATE_CD,
								MAPA_DT.F_GET_YM_ST_DT_NE(t.YM, G_CL_DAY, G_CL_MON_BASE)),
				t.BDG_SLS_AMT,
				t.BDG_SLS_PROF_AMT,
				t.NOT_SUM_FLG,
				'0'
			FROM
				MST_SLS_BDG t
				INNER JOIN MSW_SLS_SUM_IG_LVL w ON (t.SLS_ITM_GRP_CD = w.SLS_ITM_GRP_CD)
			WHERE 0=0
				AND t.YM = I_YM
				AND (t.SLS_BDG_GRP = G_SLS_BDG_GRP OR t.SLS_BDG_GRP IS NULL AND G_SLS_BDG_GRP IS NULL)
				AND t.SLS_ITM_GRP_NOT_SUM_FLG = '0'
			;
		--指定年月から表示期間分のデータを抽出
		ELSE
			INSERT INTO MSW_SLO_SLS_SUM (
				YM,
				SLS_DPT_CD,
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3,
				SLS_ITM_GRP_CD,
				SLS_ITM_GRP_CD1,
				SLS_ITM_GRP_CD2,
				SLS_USR_CD,
				CST_CD,
				TRD_CUR_CD,
				WRK_NO,
				XRATE,
				BDG_SLS_AMT,
				BDG_SLS_PROF_AMT,
				NOT_SUM_FLG,
				SPLN_USR_FLG
			)
			SELECT
				t.YM,
				t.SLS_DPT_CD,
				null,
				null,
				null,
				null,
				t.SLS_ITM_GRP_CD,
				w.CRNT_SLS_ITM_GRP_CD,
				w.DW_SLS_ITM_GRP_CD,
				t.SLS_USR_CD,
				t.CST_CD,
				t.TRD_CUR_CD,
				t.WRK_NO,
				MAPA_XCHNG.F_GET_XRATE(
								t.TRD_CUR_CD,
								G_BASE_CUR_CD,
								G_XRATE_CD,
								MAPA_DT.F_GET_YM_ST_DT_NE(t.YM, G_CL_DAY, G_CL_MON_BASE)),
				t.BDG_SLS_AMT,
				t.BDG_SLS_PROF_AMT,
				t.NOT_SUM_FLG,
				'0'
			FROM
				MST_SLS_BDG t
				INNER JOIN MSW_SLS_SUM_IG_LVL w ON (t.SLS_ITM_GRP_CD = w.SLS_ITM_GRP_CD)
			WHERE 0=0
				AND t.YM BETWEEN I_YM AND ADD_MONTHS(I_YM, I_SLS_DISP_TERM - 1)
				AND (t.SLS_BDG_GRP = G_SLS_BDG_GRP OR t.SLS_BDG_GRP IS NULL AND G_SLS_BDG_GRP IS NULL)
				AND t.SLS_ITM_GRP_NOT_SUM_FLG = '0'
			;
		END IF;
	END P_INS_SLS_BDG_ITM_GRP;


	PROCEDURE P_INS_SPLN_SUM_ITM_GRP (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE
	)
	/**************************************************************************
	<SYNOPSIS>
		販売計画集計テーブルから品目体系ＣＤをキーとした情報を取得し、
		売上集計受注ワークに登録する。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<HISTORY>
	**************************************************************************/
	IS
	BEGIN

		-- 指定年月のデータのみ抽出
		IF I_SLS_DISP_TERM IS NULL THEN
			INSERT INTO MSW_SLO_SLS_SUM (
				YM,
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3,
				SLS_ITM_GRP_CD,
				SLS_ITM_GRP_CD1,
				SLS_ITM_GRP_CD2,
				SLS_USR_CD,
				CST_CD,
				TRD_CUR_CD,
				XRATE,
				SPLN_QTY,
				SPLN_AMT,
				NOT_SUM_FLG,
				SPLN_USR_FLG
			)
			SELECT
				t.SPLN_YM,
				t.ITM_CD,
				t.ITM_SUB1,
				t.ITM_SUB2,
				t.ITM_SUB3,
				w.SLS_ITM_GRP_CD,
				w.CRNT_SLS_ITM_GRP_CD,
				w.DW_SLS_ITM_GRP_CD,
				NULL,
				t.CST_CD,
				t.CUR_CD,
				MAPA_XCHNG.F_GET_XRATE(
								t.CUR_CD,
								G_BASE_CUR_CD,
								G_XRATE_CD,
								MAPA_DT.F_GET_YM_ST_DT_NE(t.SPLN_YM, G_CL_DAY, G_CL_MON_BASE)),
				t.SPLN_QTY,
				t.SPLN_AMT,
				'0',
				'0'
			FROM
				MST_SPLN_SUM_ITM_NEW t
				INNER JOIN MAM_ITM m ON (t.ITM_CD = m.ITM_CD AND t.ITM_SUB1 = m.ITM_SUB1 AND t.ITM_SUB2 = m.ITM_SUB2 AND t.ITM_SUB3 = m.ITM_SUB3)
				LEFT JOIN MAM_ITM_SUB SM ON (t.ITM_CD = SM.ITM_CD AND t.ITM_SUB1 = SM.ITM_SUB1 AND t.ITM_SUB2 = SM.ITM_SUB2 AND t.ITM_SUB3 = SM.ITM_SUB3
									AND	t.YM BETWEEN SM.ST_DT AND SM.END_DT AND SM.DEL_FLG = '0')
				INNER JOIN MSW_SLS_SUM_IG_LVL w ON (NVL2(SM.ITM_CD, SM.SLS_ITM_GRP_CD, M.SLS_ITM_GRP_CD) = w.SLS_ITM_GRP_CD)
			WHERE 0=0
				AND t.SPLN_YM = I_YM
			;
		--指定年月から表示期間分のデータを抽出
		ELSE
			INSERT INTO MSW_SLO_SLS_SUM (
				YM,
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3,
				SLS_ITM_GRP_CD,
				SLS_ITM_GRP_CD1,
				SLS_ITM_GRP_CD2,
				SLS_USR_CD,
				CST_CD,
				TRD_CUR_CD,
				XRATE,
				SPLN_QTY,
				SPLN_AMT,
				NOT_SUM_FLG,
				SPLN_USR_FLG
			)
			SELECT
				t.SPLN_YM,
				t.ITM_CD,
				t.ITM_SUB1,
				t.ITM_SUB2,
				t.ITM_SUB3,
				w.SLS_ITM_GRP_CD,
				w.CRNT_SLS_ITM_GRP_CD,
				w.DW_SLS_ITM_GRP_CD,
				NULL,
				t.CST_CD,
				t.CUR_CD,
				MAPA_XCHNG.F_GET_XRATE(
								t.CUR_CD,
								G_BASE_CUR_CD,
								G_XRATE_CD,
								MAPA_DT.F_GET_YM_ST_DT_NE(t.SPLN_YM, G_CL_DAY, G_CL_MON_BASE)),
				t.SPLN_QTY,
				t.SPLN_AMT,
				'0',
				'0'
			FROM
				MST_SPLN_SUM_ITM_NEW t
				INNER JOIN MAM_ITM m ON (t.ITM_CD = m.ITM_CD AND t.ITM_SUB1 = m.ITM_SUB1 AND t.ITM_SUB2 = m.ITM_SUB2 AND t.ITM_SUB3 = m.ITM_SUB3)
				LEFT JOIN MAM_ITM_SUB SM ON (t.ITM_CD = SM.ITM_CD AND t.ITM_SUB1 = SM.ITM_SUB1 AND t.ITM_SUB2 = SM.ITM_SUB2 AND t.ITM_SUB3 = SM.ITM_SUB3
									AND	t.YM BETWEEN SM.ST_DT AND SM.END_DT AND SM.DEL_FLG = '0')
				INNER JOIN MSW_SLS_SUM_IG_LVL w ON (NVL2(SM.ITM_CD, SM.SLS_ITM_GRP_CD, M.SLS_ITM_GRP_CD) = w.SLS_ITM_GRP_CD)
			WHERE 0=0
				AND t.SPLN_YM BETWEEN I_YM AND ADD_MONTHS(I_YM, I_SLS_DISP_TERM - 1)
			;
		END IF;
	END P_INS_SPLN_SUM_ITM_GRP ;

END MSPA_SLO_SLS_SUM ;

/
show errors;


