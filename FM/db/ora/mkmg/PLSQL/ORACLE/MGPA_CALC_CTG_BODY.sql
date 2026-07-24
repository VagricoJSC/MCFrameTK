CREATE OR REPLACE PACKAGE BODY MGPA_CALC_CTG
IS
	PROCEDURE P_SET_WORK (
		I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
		I_CALC_CTG_TYP	IN MAPA_META.CALC_CTG_TYP%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		対象となる計算カテゴリＣＤをMGW_CALC_CTGに作成する。
	<REMARKS>
		MAM_GRP_CTGのデータはCTG_PRIO, CALC_CTG_CDで
		ソートした順で優先度を１から順に設定する。
	<ARGUMENTS>
	<IN>	I_CALC_GRP_CD
			計算グループＣＤ
	<IN>	I_CALC_CTG_TYP
			計算カテゴリ区分
	<HISTORY>
	**********************************************************/
	IS
		L_CTG_PRIO	MAPA_META.INT2%TYPE ;
	BEGIN
		DELETE MGW_CALC_CTG ;

		L_CTG_PRIO := 0 ;
		FOR x IN (
			SELECT	m.CALC_CTG_CD	CALC_CTG_CD,
				m.CTG_PRIO	CTG_PRIO
			FROM	MAM_GRP_CTG m
			WHERE	0=0
			AND	m.CALC_GRP_CD = I_CALC_GRP_CD
			AND	m.CALC_CTG_TYP= I_CALC_CTG_TYP
			ORDER BY m.CTG_PRIO, m.CALC_CTG_CD
			)
		LOOP
			L_CTG_PRIO := L_CTG_PRIO + 1 ;
			INSERT INTO MGW_CALC_CTG (
				CALC_CTG_CD,
				CTG_PRIO
				)
			VALUES	(
				x.CALC_CTG_CD,
				L_CTG_PRIO
				)
			;
		END LOOP ;
	END P_SET_WORK ;

	PROCEDURE P_SET_WORK_ALL (
		I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		計算グループＣＤに対して対象となる計算カテゴリ区分ごとに
		計算カテゴリＣＤをMGW_CALC_GRP_CTGに作成する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_CALC_GRP_CD
			計算グループＣＤ
	<HISTORY>
	**********************************************************/
	IS
	BEGIN
		DELETE MGW_CALC_GRP_CTG w ;
		FOR x IN (
			SELECT	DISTINCT m.CALC_CTG_TYP
			FROM	MAM_GRP_CTG m
			WHERE	0=0
			AND	m.CALC_GRP_CD = I_CALC_GRP_CD
			)
		LOOP
			P_SET_WORK(I_CALC_GRP_CD, x.CALC_CTG_TYP) ;

			INSERT INTO MGW_CALC_GRP_CTG (
				CALC_CTG_TYP,
				CALC_CTG_CD,
				CTG_PRIO
				)
			SELECT	x.CALC_CTG_TYP,
				w.CALC_CTG_CD,
				w.CTG_PRIO
			FROM	MGW_CALC_CTG w
			WHERE	0=0
			;
		END LOOP ;
	END P_SET_WORK_ALL ;

END MGPA_CALC_CTG ;
/
