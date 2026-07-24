CREATE OR REPLACE PACKAGE BODY MGPA_ACT_COPY_ITM_INFO
IS
	G_YM_FROM		MAPA_META.YM%TYPE ;
	G_YM_TO			MAPA_META.YM%TYPE ;
	G_CALC_CTG_CD	MAPA_META.CALC_CTG_CD%TYPE ;
	G_TERM			MAPA_META.YM%TYPE ;
	G_PTN_SET_TYP	MGPA_META.PTN_SET_TYP%TYPE ;
	G_BASE_CUR_CD		MAPA_META.CUR_CD%TYPE ;
	G_UPRI_DEC_PLACE	MAPA_META.DEC_PLACE%TYPE ;
	G_AMT_DEC_PLACE		MAPA_META.DEC_PLACE%TYPE ;
	G_ITM	MAPA_META.FLG%TYPE ;
	G_DTL	MAPA_META.FLG%TYPE ;
	G_OPER	MAPA_META.FLG%TYPE ;
	G_BOM	MAPA_META.FLG%TYPE ;
	G_WK	MAPA_META.FLG%TYPE ;
	G_PURC	MAPA_META.FLG%TYPE ;
	G_PROC	MAPA_META.FLG%TYPE ;
	G_PROV	MAPA_META.FLG%TYPE ;
	G_SLS	MAPA_META.FLG%TYPE ;
	G_DEF_WG_CNT	INTEGER ;

	C_MAX_CNT	CONSTANT INTEGER := 10000 ; --バルクインサートでの最大レコード数
	C_OFF		CONSTANT MAPA_META.FLG%TYPE := '0' ;
	C_ON		CONSTANT MAPA_META.FLG%TYPE := '1' ;
	C_NULL_VAL	CONSTANT MAPA_META.STR20%TYPE := MAC_STR.NULL_VAL ;
	C_RND_TYP	CONSTANT MAPA_META.RND_TYP%TYPE := MAC_RND_TYP.RNDOFF ; -- 四捨五入
	C_PTN_ITM	CONSTANT MGPA_META.PTN_SET_TYP%TYPE := MGC_PTN_SET_TYP.ITM ; -- 品目毎
	C_PTN_IN_OUT	CONSTANT MGPA_META.PTN_SET_TYP%TYPE := MGC_PTN_SET_TYP.IN_OUT ; -- 外注内製
	C_PTN_LOC	CONSTANT MGPA_META.PTN_SET_TYP%TYPE := MGC_PTN_SET_TYP.LOC ; -- 場所毎
	C_PTN1		CONSTANT MAPA_META.BOM_PTN%TYPE := '1' ;
	C_PTN2		CONSTANT MAPA_META.BOM_PTN%TYPE := '2' ;
	C_PURC		CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.PURC ;		--仕入
	C_PURC_RET	CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.PURC_RET ;		--仕入返品
	C_PURC_DSCNT	CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.PURC_DSCNT ;	--仕入値引
	C_PURC_XTRA	CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.PURC_XTRA ;	--仕入値増

	TYPE LIST_PTN_LOC IS TABLE OF MAPA_META.BOM_PTN%TYPE INDEX BY MAPA_META.LOC_CD%TYPE;
	PTN_LOC	LIST_PTN_LOC ;

	j	INTEGER := 0 ;

PROCEDURE P_FIX_CHK
/**************************************************************************
<SYNOPSIS>
	コピー先情報確定チェック
<REMARKS>

<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS
	L_MSG	FCPA_ERR.MSG_BINDER ;
BEGIN

	FOR x IN (
		SELECT
			w.WG_CD
		FROM
			MGW_WG w
		)
	LOOP
		IF G_DTL = C_ON THEN
			IF MGPA_FIX_CHK.F_DTL_M(G_TERM, G_CALC_CTG_CD, x.WG_CD) = C_ON THEN
				L_MSG := FCPA_ERR.MSG_BINDER(G_CALC_CTG_CD, x.WG_CD, FCPA_DATE_UTIL.F_TO_CHAR(G_TERM, FCPA_DATE_UTIL.Y4M)) ;
				--原価品目詳細情報に標準単価が確定しているデータがあるのでコピーできません。計算カテゴリ：{1} ワーキンググループ：{2} 期：{3}
				FCPA_ERR.RAISE_APP_ERR('MGBXD0031', L_MSG) ;
			END IF ;
		END IF ;
	
		IF G_OPER = C_ON THEN
			IF MGPA_FIX_CHK.F_OPER_M(G_TERM, G_CALC_CTG_CD, x.WG_CD) = C_ON THEN
				L_MSG := FCPA_ERR.MSG_BINDER(G_CALC_CTG_CD, x.WG_CD, FCPA_DATE_UTIL.F_TO_CHAR(G_TERM, FCPA_DATE_UTIL.Y4M)) ;
				--原価品目工程情報に標準単価が確定しているデータがあるのでコピーできません。計算カテゴリ：{1} ワーキンググループ：{2} 期：{3}
				FCPA_ERR.RAISE_APP_ERR('MGBXD0032', L_MSG) ;
			END IF ;
		END IF ;
	
		IF G_BOM = C_ON THEN
			IF MGPA_FIX_CHK.F_BOM_M(G_TERM, G_CALC_CTG_CD, x.WG_CD) = C_ON THEN
				L_MSG := FCPA_ERR.MSG_BINDER(G_CALC_CTG_CD, x.WG_CD, FCPA_DATE_UTIL.F_TO_CHAR(G_TERM, FCPA_DATE_UTIL.Y4M)) ;
				--原価ＢＯＭ情報に標準単価が確定しているデータがあるのでコピーできません。計算カテゴリ：{1} ワーキンググループ：{2} 期：{3}
				FCPA_ERR.RAISE_APP_ERR('MGBXD0033', L_MSG) ;
			END IF ;
		END IF ;
	
		IF G_WK = C_ON THEN
			IF MGPA_FIX_CHK.F_WK_M(G_TERM, G_CALC_CTG_CD, x.WG_CD) = C_ON THEN
				L_MSG := FCPA_ERR.MSG_BINDER(G_CALC_CTG_CD, x.WG_CD, FCPA_DATE_UTIL.F_TO_CHAR(G_TERM, FCPA_DATE_UTIL.Y4M)) ;
				--原価品目工数情報に標準単価が確定しているデータがあるのでコピーできません。計算カテゴリ：{1} ワーキンググループ：{2} 期：{3}
				FCPA_ERR.RAISE_APP_ERR('MGBXD0034', L_MSG) ;
			END IF ;
		END IF ;
	
		IF G_PURC = C_ON THEN
			IF MGPA_FIX_CHK.F_PURC_M(G_TERM, G_CALC_CTG_CD, x.WG_CD) = C_ON THEN
				L_MSG := FCPA_ERR.MSG_BINDER(G_CALC_CTG_CD, x.WG_CD, FCPA_DATE_UTIL.F_TO_CHAR(G_TERM, FCPA_DATE_UTIL.Y4M)) ;
				--原価品目購買単価情報に標準単価が確定しているデータがあるのでコピーできません。計算カテゴリ：{1} ワーキンググループ：{2} 期：{3}
				FCPA_ERR.RAISE_APP_ERR('MGBXD0035', L_MSG) ;
			END IF ;
		END IF ;
	
		IF G_PROC = C_ON THEN
			IF MGPA_FIX_CHK.F_PROC_M(G_TERM, G_CALC_CTG_CD, x.WG_CD) = C_ON THEN
				L_MSG := FCPA_ERR.MSG_BINDER(G_CALC_CTG_CD, x.WG_CD, FCPA_DATE_UTIL.F_TO_CHAR(G_TERM, FCPA_DATE_UTIL.Y4M)) ;
				--原価品目加工単価情報に標準単価が確定しているデータがあるのでコピーできません。計算カテゴリ：{1} ワーキンググループ：{2} 期：{3}
				FCPA_ERR.RAISE_APP_ERR('MGBXD0040', L_MSG) ;
			END IF ;
		END IF ;
	
		IF G_PROV = C_ON THEN
			IF MGPA_FIX_CHK.F_PROV_M(G_TERM, G_CALC_CTG_CD, x.WG_CD) = C_ON THEN
				L_MSG := FCPA_ERR.MSG_BINDER(G_CALC_CTG_CD, x.WG_CD, FCPA_DATE_UTIL.F_TO_CHAR(G_TERM, FCPA_DATE_UTIL.Y4M)) ;
				--原価品目支給情報に標準単価が確定しているデータがあるのでコピーできません。計算カテゴリ：{1} ワーキンググループ：{2} 期：{3}
				FCPA_ERR.RAISE_APP_ERR('MGBXD0036', L_MSG) ;
			END IF ;
		END IF ;
	END LOOP ;

END P_FIX_CHK ;

PROCEDURE P_ITM
/*********************************************************
<SYNOPSIS>
	原価品目情報コピー処理
<REMARKS>

<ARGUMENTS>
<HISTORY>
**********************************************************/
AS
	C_ASSET_MNG_MNG		CONSTANT MAPA_META.ASSET_MNG_TYP%TYPE := MAC_ASSET_MNG_TYP.MNG ; --資産管理する

	C_PURC_XPNS			CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.PURC_XPNS ; --経費購買
	C_PURC_RET_XPNS		CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.PURC_RET_XPNS ; --経費返品
	C_PURC_DSCNT_XPNS	CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.PURC_DSCNT_XPNS ; --経費値引
	C_PURC_XTRA_XPNS	CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.PURC_XTRA_XPNS ; --経費値増
	
	C_FFR_PROV			CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.FFR_PROV ; --無償支給
	C_FFR_PRVR			CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.FFR_PRVR ; --無償支給戻
	C_ONR_PROV			CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.ONR_PROV ; --有償支給
	C_ONR_PRVR			CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.ONR_PRVR ; --有償支給戻
	C_SHIP				CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.SHIP ; --出荷
	C_SHIP_RET			CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.SHIP_RET ; --出荷返品
	C_PROD_ITM_SO		CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.PROD_ITM_SO ; --販売倉入
	C_PROD_ITM_RET_SO	CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.PROD_ITM_RET_SO ; --生産戻入
	C_DPT_XFR_SO		CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.DPT_XFR_SO ; --部門間移動
	
	C_INSP_SMPL			CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.INSP_SMPL ; --検査抜取
	C_DISP_SCRP			CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.DISP_SCRP ; --廃棄
	C_SO_STKTK			CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.SO_STKTK ; --棚卸出庫
	C_OTH_CCN_SO		CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.OTH_CCN_SO ; --他勘定出庫
	C_IN_STKTK			CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.IN_STKTK ; --棚卸入庫
	C_OTH_CCN_GR		CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.OTH_CCN_GR ; --他勘定入庫
	C_STK_SW_SO			CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.STK_SW_SO ; --在庫振替出庫
	C_STK_SW_GR			CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.STK_SW_GR ; --在庫振替入庫

	TYPE LIST_ITM IS TABLE OF MGT_ITM%ROWTYPE INDEX BY BINARY_INTEGER ;
	rec	LIST_ITM ;
	i	INTEGER := 0 ;

/**********************************************************/
PROCEDURE P_INS_ITM
AS
BEGIN
	IF i > 0 THEN
		FORALL t IN 1..i
			INSERT INTO MGT_ITM VALUES rec(t) ;
		rec.DELETE ;
		i := 0 ;
	END IF ;
END ;
/**********************************************************/
BEGIN

	FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0001', 'MGPA_ACT_COPY_ITM_INFO.P_ITM') ;

	FOR x IN (
		SELECT
			T.WG_CD,
			T.ITM_CD,
			T.ITM_SUB1,
			T.ITM_SUB2,
			T.ITM_SUB3,
			M.CALC_PTN_CD,
			NVL(M.COST_STD_QTY, 1) COST_STD_QTY
		FROM (
			SELECT DISTINCT
				t1.WG_CD,
				t1.ITM_CD,
				t1.ITM_SUB1,
				t1.ITM_SUB2,
				t1.ITM_SUB3
			FROM
				MGT_ACT_MFG_IF t1,
				MGW_CALC_CTG w,
				MGW_WG w2
			WHERE 0=0
				AND t1.CALC_CTG_CD = w.CALC_CTG_CD
				AND t1.WG_CD = w2.WG_CD
				AND t1.YM BETWEEN G_YM_FROM AND G_YM_TO
				AND NOT EXISTS (
					SELECT 'X' FROM MGT_ITM x
					WHERE x.TERM = G_TERM
					AND x.CALC_CTG_CD = G_CALC_CTG_CD
					AND x.WG_CD = t1.WG_CD
					AND x.ITM_CD = t1.ITM_CD
					AND x.ITM_SUB1 = t1.ITM_SUB1
					AND x.ITM_SUB2 = t1.ITM_SUB2
					AND x.ITM_SUB3 = t1.ITM_SUB3)
				AND t1.NO_ITM_INFO_FLG = C_OFF
			UNION
			SELECT DISTINCT
				t1.WG_CD,
				t1.ITM_CD,
				t1.ITM_SUB1,
				t1.ITM_SUB2,
				t1.ITM_SUB3
			FROM
				MGT_ACT_INST_WIP_IF t1,
				MGW_CALC_CTG w,
				MGW_WG w2
			WHERE 0=0
				AND t1.CALC_CTG_CD = w.CALC_CTG_CD
				AND t1.WG_CD = w2.WG_CD
				AND t1.YM BETWEEN G_YM_FROM AND G_YM_TO
				AND NOT EXISTS (
					SELECT 'X' FROM MGT_ITM x
					WHERE x.TERM = G_TERM
					AND x.CALC_CTG_CD = G_CALC_CTG_CD
					AND x.WG_CD = t1.WG_CD
					AND x.ITM_CD = t1.ITM_CD
					AND x.ITM_SUB1 = t1.ITM_SUB1
					AND x.ITM_SUB2 = t1.ITM_SUB2
					AND x.ITM_SUB3 = t1.ITM_SUB3)
			UNION
			SELECT DISTINCT
				t1.WG_CD,
				t1.ITM_CD,
				t1.ITM_SUB1,
				t1.ITM_SUB2,
				t1.ITM_SUB3
			FROM
				MGT_ACT_PURC_IF t1,
				MGW_CALC_CTG w,
				MGW_WG w2,
				MAM_ITM m
			WHERE 0=0
				AND t1.CALC_CTG_CD = w.CALC_CTG_CD
				AND t1.WG_CD = w2.WG_CD
				AND t1.ITM_CD = m.ITM_CD
				AND t1.ITM_SUB1 = m.ITM_SUB1
				AND t1.ITM_SUB2 = m.ITM_SUB2
				AND t1.ITM_SUB3 = m.ITM_SUB3
				AND t1.YM BETWEEN G_YM_FROM AND G_YM_TO
				AND NOT EXISTS (
					SELECT 'X' FROM MGT_ITM x
					WHERE x.TERM = G_TERM
					AND x.CALC_CTG_CD = G_CALC_CTG_CD
					AND x.WG_CD = t1.WG_CD
					AND x.ITM_CD = t1.ITM_CD
					AND x.ITM_SUB1 = t1.ITM_SUB1
					AND x.ITM_SUB2 = t1.ITM_SUB2
					AND x.ITM_SUB3 = t1.ITM_SUB3)
				AND t1.NO_ITM_INFO_FLG = C_OFF
				AND m.CALC_PTN_CD IS NOT NULL
				AND m.ASSET_MNG_TYP = C_ASSET_MNG_MNG
				AND t1.AC_SLIP_TYP NOT IN (C_PURC_XPNS, C_PURC_RET_XPNS, C_PURC_DSCNT_XPNS, C_PURC_XTRA_XPNS)
			UNION
			SELECT DISTINCT
				t1.WG_CD,
				t1.PAR_ITM_CD	ITM_CD,
				t1.PAR_ITM_SUB1	ITM_SUB1,
				t1.PAR_ITM_SUB2	ITM_SUB2,
				t1.PAR_ITM_SUB3	ITM_SUB3
			FROM
				MGT_ACT_INPT_IF t1,
				MGW_CALC_CTG w,
				MGW_WG w2
			WHERE 0=0
				AND t1.CALC_CTG_CD = w.CALC_CTG_CD
				AND t1.WG_CD = w2.WG_CD
				AND t1.YM BETWEEN G_YM_FROM AND G_YM_TO
				AND NOT EXISTS (
					SELECT 'X' FROM MGT_ITM x
					WHERE x.TERM = G_TERM
					AND x.CALC_CTG_CD = G_CALC_CTG_CD
					AND x.WG_CD = t1.WG_CD
					AND x.ITM_CD = t1.PAR_ITM_CD
					AND x.ITM_SUB1 = t1.PAR_ITM_SUB1
					AND x.ITM_SUB2 = t1.PAR_ITM_SUB2
					AND x.ITM_SUB3 = t1.PAR_ITM_SUB3)
				AND t1.NO_ITM_INFO_FLG = C_OFF
			UNION
			SELECT DISTINCT
				t1.WG_CD,
				t1.ITM_CD,
				t1.ITM_SUB1,
				t1.ITM_SUB2,
				t1.ITM_SUB3
			FROM
				MGT_ACT_INPT_IF t1,
				MGW_CALC_CTG w,
				MGW_WG w2
			WHERE 0=0
				AND t1.CALC_CTG_CD = w.CALC_CTG_CD
				AND t1.WG_CD = w2.WG_CD
				AND t1.YM BETWEEN G_YM_FROM AND G_YM_TO
				AND NOT EXISTS (
					SELECT 'X' FROM MGT_ITM x
					WHERE x.TERM = G_TERM
					AND x.CALC_CTG_CD = G_CALC_CTG_CD
					AND x.WG_CD = t1.WG_CD
					AND x.ITM_CD = t1.ITM_CD
					AND x.ITM_SUB1 = t1.ITM_SUB1
					AND x.ITM_SUB2 = t1.ITM_SUB2
					AND x.ITM_SUB3 = t1.ITM_SUB3)
				AND t1.NO_ITM_INFO_FLG = C_OFF
			UNION
			SELECT DISTINCT
				t1.WG_CD,
				t1.ITM_CD,
				t1.ITM_SUB1,
				t1.ITM_SUB2,
				t1.ITM_SUB3
			FROM
				MGT_ACT_INST_WK_IF t1,
				MGW_CALC_CTG w,
				MGW_WG w2
			WHERE 0=0
				AND t1.CALC_CTG_CD = w.CALC_CTG_CD
				AND t1.WG_CD = w2.WG_CD
				AND t1.YM BETWEEN G_YM_FROM AND G_YM_TO
				AND NOT EXISTS (
					SELECT 'X' FROM MGT_ITM x
					WHERE x.TERM = G_TERM
					AND x.CALC_CTG_CD = G_CALC_CTG_CD
					AND x.WG_CD = t1.WG_CD
					AND x.ITM_CD = t1.ITM_CD
					AND x.ITM_SUB1 = t1.ITM_SUB1
					AND x.ITM_SUB2 = t1.ITM_SUB2
					AND x.ITM_SUB3 = t1.ITM_SUB3)
				AND t1.NO_ITM_INFO_FLG = C_OFF
			UNION
			SELECT DISTINCT
				t1.WG_CD,
				t1.ITM_CD,
				t1.ITM_SUB1,
				t1.ITM_SUB2,
				t1.ITM_SUB3
			FROM
				MGT_ACT_SLS_IF t1,
				MGW_CALC_CTG w,
				MGW_WG w2
			WHERE 0=0
				AND t1.CALC_CTG_CD = w.CALC_CTG_CD
				AND t1.WG_CD = w2.WG_CD
				AND t1.YM BETWEEN G_YM_FROM AND G_YM_TO
				AND NOT EXISTS (
					SELECT 'X' FROM MGT_ITM x
					WHERE x.TERM = G_TERM
					AND x.CALC_CTG_CD = G_CALC_CTG_CD
					AND x.WG_CD = t1.WG_CD
					AND x.ITM_CD = t1.ITM_CD
					AND x.ITM_SUB1 = t1.ITM_SUB1
					AND x.ITM_SUB2 = t1.ITM_SUB2
					AND x.ITM_SUB3 = t1.ITM_SUB3)
				AND t1.NO_ITM_INFO_FLG = C_OFF
			UNION
			SELECT DISTINCT
				w2.WG_CD,
				t1.ITM_CD,
				t1.ITM_SUB1,
				t1.ITM_SUB2,
				t1.ITM_SUB3
			FROM
				MGT_ACT_IO_IF t1,
				MGW_CALC_CTG w,
				MGW_WG w2
			WHERE 0=0
				AND t1.CALC_CTG_CD = w.CALC_CTG_CD
				AND t1.YM BETWEEN G_YM_FROM AND G_YM_TO
				AND NOT EXISTS (
					SELECT 'X' FROM MGT_ITM x
					WHERE x.TERM = G_TERM
					AND x.CALC_CTG_CD = G_CALC_CTG_CD
					AND x.WG_CD = w2.WG_CD
					AND x.ITM_CD = t1.ITM_CD
					AND x.ITM_SUB1 = t1.ITM_SUB1
					AND x.ITM_SUB2 = t1.ITM_SUB2
					AND x.ITM_SUB3 = t1.ITM_SUB3)
				AND t1.NO_ITM_INFO_FLG = C_OFF
				AND (
					((t1.WG_CD = w2.WG_CD OR t1.OTHER_WG_CD = w2.WG_CD)
						AND t1.AC_SLIP_TYP IN (C_FFR_PROV, C_FFR_PRVR, C_ONR_PROV, C_ONR_PRVR, C_SHIP, C_SHIP_RET, C_PROD_ITM_SO, C_PROD_ITM_RET_SO, C_DPT_XFR_SO))
					OR
					(t1.WG_CD = w2.WG_CD
						AND t1.AC_SLIP_TYP IN (C_INSP_SMPL, C_DISP_SCRP, C_SO_STKTK, C_OTH_CCN_SO, C_IN_STKTK, C_OTH_CCN_GR, C_STK_SW_SO, C_STK_SW_GR))
					)
			UNION
			SELECT DISTINCT
				w2.WG_CD,
				t1.ALC_ITM_CD,
				t1.ALC_ITM_SUB1,
				t1.ALC_ITM_SUB2,
				t1.ALC_ITM_SUB3
			FROM
				MGT_ACT_IO_IF t1,
				MGW_CALC_CTG w,
				MGW_WG w2
			WHERE 0=0
				AND t1.CALC_CTG_CD = w.CALC_CTG_CD
				AND t1.YM BETWEEN G_YM_FROM AND G_YM_TO
				AND NOT EXISTS (
					SELECT 'X' FROM MGT_ITM x
					WHERE x.TERM = G_TERM
					AND x.CALC_CTG_CD = G_CALC_CTG_CD
					AND x.WG_CD = w2.WG_CD
					AND x.ITM_CD = t1.ALC_ITM_CD
					AND x.ITM_SUB1 = t1.ALC_ITM_SUB1
					AND x.ITM_SUB2 = t1.ALC_ITM_SUB2
					AND x.ITM_SUB3 = t1.ALC_ITM_SUB3)
				AND t1.NO_ITM_INFO_FLG = C_OFF
				AND (
					((t1.WG_CD = w2.WG_CD OR t1.OTHER_WG_CD = w2.WG_CD)
						AND t1.AC_SLIP_TYP IN (C_FFR_PROV, C_FFR_PRVR, C_ONR_PROV, C_ONR_PRVR, C_SHIP, C_SHIP_RET, C_PROD_ITM_SO, C_PROD_ITM_RET_SO, C_DPT_XFR_SO))
					OR
					(t1.WG_CD = w2.WG_CD
						AND t1.AC_SLIP_TYP IN (C_INSP_SMPL, C_DISP_SCRP, C_SO_STKTK, C_OTH_CCN_SO, C_IN_STKTK, C_OTH_CCN_GR, C_STK_SW_SO, C_STK_SW_GR))
					)
			) T,
			MAM_ITM M
		WHERE 0=0
			AND T.ITM_CD = M.ITM_CD
			AND T.ITM_SUB1 = M.ITM_SUB1
			AND T.ITM_SUB2 = M.ITM_SUB2
			AND T.ITM_SUB3 = M.ITM_SUB3
			AND M.CALC_PTN_CD IS NOT NULL
		)
	LOOP
		i := i + 1 ;

		rec(i).ITM_CD	:= x.ITM_CD ;
		rec(i).ITM_SUB1	:= x.ITM_SUB1 ;
		rec(i).ITM_SUB2	:= x.ITM_SUB2 ;
		rec(i).ITM_SUB3	:= x.ITM_SUB3 ;
		rec(i).TERM	:= G_TERM ;
		rec(i).CALC_CTG_CD	:= G_CALC_CTG_CD ;
		rec(i).WG_CD	:= x.WG_CD ;
		rec(i).CALC_PTN_CD	:= x.CALC_PTN_CD ;
		rec(i).STD_QTY	:= x.COST_STD_QTY ;
		rec(i).CMN_UPRI_FLG	:= C_OFF ;
		rec(i).FIX_FLG	:= C_OFF ;
		rec(i).NON_CALC_FLG	:= C_OFF ;

		IF i > C_MAX_CNT THEN
			P_INS_ITM() ;
		END IF ;

		<<NEXT_LOOP>>
			NULL ;

	END LOOP ;

	P_INS_ITM() ;

	FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0002', 'MGPA_ACT_COPY_ITM_INFO.P_ITM') ;

END P_ITM ;

PROCEDURE P_DTL
/*********************************************************
<SYNOPSIS>
	原価品目詳細情報コピー処理
<REMARKS>

<ARGUMENTS>
<HISTORY>
**********************************************************/
AS
	TYPE LIST_DTL IS TABLE OF MGT_ITM_DTL%ROWTYPE INDEX BY BINARY_INTEGER ;
	rec	LIST_DTL ;
	i	INTEGER := 0 ;

	C_DPT_XFR_SO	CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.DPT_XFR_SO ;	--部門間移動

	L_WG_CD		MAPA_META.WG_CD%TYPE ;
	L_ITM_CD	MAPA_META.ITM_CD%TYPE ;
	L_ITM_SUB1	MAPA_META.ITM_SUB1%TYPE ;
	L_ITM_SUB2	MAPA_META.ITM_SUB2%TYPE ;
	L_ITM_SUB3	MAPA_META.ITM_SUB3%TYPE ;
	L_EXP_PRIO	MGPA_META.EXP_PRIO%TYPE ;
	L_PTN		MAPA_META.BOM_PTN%TYPE;
/**********************************************************/
PROCEDURE P_INS_DTL
AS
BEGIN
	IF i > 0 THEN
		FORALL t IN 1..i
			INSERT INTO MGT_ITM_DTL VALUES rec(t) ;
		rec.DELETE ;
		i := 0 ;
	END IF ;
END ;
/**********************************************************/
BEGIN

	FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0001', 'MGPA_ACT_COPY_ITM_INFO.P_DTL') ;

	DELETE	MGT_ITM_DTL t
	WHERE	0=0
	AND	t.TERM = G_TERM
	AND	t.CALC_CTG_CD = G_CALC_CTG_CD
	AND EXISTS (
		SELECT 'X'
		FROM	MGW_WG w
		WHERE	0=0
			AND w.WG_CD = t.WG_CD
		)
	;

	L_WG_CD := NULL ;
	L_ITM_CD := NULL ;
	L_ITM_SUB1 := NULL ;
	L_ITM_SUB2 := NULL ;
	L_ITM_SUB3 := NULL ;

	FOR x IN (
		SELECT
			t1.WG_CD,
			t1.ITM_CD,
			t1.ITM_SUB1,
			t1.ITM_SUB2,
			t1.ITM_SUB3,
			t1.LOC_CD,
			C_NULL_VAL SPPL_CD,
			C_NULL_VAL RQST_WG_CD,
			MIN(DECODE(G_PTN_SET_TYP,
				C_PTN_ITM, C_PTN1,
				C_PTN_LOC, t1.LOC_CD,
				DECODE(t2.SPPL_CD, NULL, C_PTN1, C_PTN2))) PTN,
			MIN(t3.OPER_CD) AS OPER_CD,
			SUM(t1.QTY) AS QTY
		FROM
			MGT_ACT_MFG_IF t1,
			MGT_ITM_MFG_INST t2,
			MGT_INST_OPER t3,
			MAM_ITM m1,
			MGW_CALC_CTG w,
			MGW_WG w2
		WHERE 0=0
			AND t1.CALC_CTG_CD = w.CALC_CTG_CD
			AND t1.WG_CD = w2.WG_CD
			AND t1.CALC_CTG_CD = t2.CALC_CTG_CD
			AND t1.ITM_CD = t2.ITM_CD
			AND t1.ITM_SUB1 = t2.ITM_SUB1
			AND t1.ITM_SUB2 = t2.ITM_SUB2
			AND t1.ITM_SUB3 = t2.ITM_SUB3
			AND t1.ITM_MFG_INST_NO = t2.ITM_MFG_INST_NO
			AND t1.MFG_ACT_NO = t2.MFG_ACT_NO
			AND t1.CALC_CTG_CD = t3.CALC_CTG_CD(+)
			AND t1.ITM_CD = t3.ITM_CD(+)
			AND t1.ITM_SUB1 = t3.ITM_SUB1(+)
			AND t1.ITM_SUB2 = t3.ITM_SUB2(+)
			AND t1.ITM_SUB3 = t3.ITM_SUB3(+)
			AND t1.ITM_MFG_INST_NO = t3.ITM_MFG_INST_NO(+)
			AND t1.MFG_ACT_NO = t3.MFG_ACT_NO(+)
			AND t1.OPER_ACT_NO = t3.OPER_ACT_NO(+)
			AND t1.YM BETWEEN G_YM_FROM AND G_YM_TO
			AND t1.NO_ITM_INFO_FLG = C_OFF
			AND t1.ITM_CD = m1.ITM_CD
			AND t1.ITM_SUB1 = m1.ITM_SUB1
			AND t1.ITM_SUB2 = m1.ITM_SUB2
			AND t1.ITM_SUB3 = m1.ITM_SUB3
		GROUP BY
			t1.WG_CD,
			t1.ITM_CD,
			t1.ITM_SUB1,
			t1.ITM_SUB2,
			t1.ITM_SUB3,
			t1.LOC_CD
		UNION ALL
		SELECT
			t1.WG_CD,
			t1.ITM_CD,
			t1.ITM_SUB1,
			t1.ITM_SUB2,
			t1.ITM_SUB3,
			C_NULL_VAL LOC_CD,
			t1.SPPL_CD,
			C_NULL_VAL RQST_WG_CD,
			NULL AS PTN,
			NULL AS OPER_CD,
			SUM(t1.QTY) AS QTY
		FROM
			MGT_ACT_PURC_IF t1,
			MAM_ITM m1,
			MGW_CALC_CTG w,
			MGW_WG w2
		WHERE 0=0
			AND t1.CALC_CTG_CD = w.CALC_CTG_CD
			AND t1.WG_CD = w2.WG_CD
			AND t1.YM BETWEEN G_YM_FROM AND G_YM_TO
			AND t1.NO_ITM_INFO_FLG = C_OFF
			AND t1.ITM_CD = m1.ITM_CD
			AND t1.ITM_SUB1 = m1.ITM_SUB1
			AND t1.ITM_SUB2 = m1.ITM_SUB2
			AND t1.ITM_SUB3 = m1.ITM_SUB3
		GROUP BY
			t1.WG_CD,
			t1.ITM_CD,
			t1.ITM_SUB1,
			t1.ITM_SUB2,
			t1.ITM_SUB3,
			t1.SPPL_CD
		UNION ALL
		SELECT
			t1.OTHER_WG_CD WG_CD,
			t1.ITM_CD,
			t1.ITM_SUB1,
			t1.ITM_SUB2,
			t1.ITM_SUB3,
			C_NULL_VAL LOC_CD,
			C_NULL_VAL SPPL_CD,
			t1.WG_CD RQST_WG_CD,
			NULL AS PTN,
			NULL AS OPER_CD,
			SUM(t1.QTY) AS QTY
		FROM
			MGT_ACT_IO_IF t1,
			MAM_ITM m1,
			MGW_CALC_CTG w,
			MGW_WG w2
		WHERE 0=0
			AND t1.CALC_CTG_CD = w.CALC_CTG_CD
			AND t1.OTHER_WG_CD = w2.WG_CD
			AND t1.YM BETWEEN G_YM_FROM AND G_YM_TO
			AND t1.NO_ITM_INFO_FLG = C_OFF
			AND t1.ITM_CD = m1.ITM_CD
			AND t1.ITM_SUB1 = m1.ITM_SUB1
			AND t1.ITM_SUB2 = m1.ITM_SUB2
			AND t1.ITM_SUB3 = m1.ITM_SUB3
			AND t1.AC_SLIP_TYP = C_DPT_XFR_SO
			AND t1.WG_CD <> t1.OTHER_WG_CD
		GROUP BY
			t1.WG_CD,
			t1.ITM_CD,
			t1.ITM_SUB1,
			t1.ITM_SUB2,
			t1.ITM_SUB3,
			t1.OTHER_WG_CD
		ORDER BY WG_CD, ITM_CD, ITM_SUB1, ITM_SUB2, ITM_SUB3, QTY DESC, LOC_CD, SPPL_CD, RQST_WG_CD
		)
	LOOP
		-- 数量(=原価比率)が負となる場合は対象外
		IF x.QTY < 0 THEN
			GOTO NEXT_LOOP ;
		END IF ;

		IF L_WG_CD IS NULL AND L_ITM_CD IS NULL
			OR L_WG_CD <> x.WG_CD
			OR L_ITM_CD <> x.ITM_CD
			OR L_ITM_SUB1 <> x.ITM_SUB1
			OR L_ITM_SUB2 <> x.ITM_SUB2
			OR L_ITM_SUB3 <> x.ITM_SUB3 THEN

			L_WG_CD := x.WG_CD ;
			L_ITM_CD := x.ITM_CD ;
			L_ITM_SUB1  := x.ITM_SUB1 ;
			L_ITM_SUB2  := x.ITM_SUB2 ;
			L_ITM_SUB3  := x.ITM_SUB3 ;
			L_EXP_PRIO := 1 ;
		ELSE
			L_EXP_PRIO := L_EXP_PRIO + 1 ;
		END IF ;

		IF G_PTN_SET_TYP = C_PTN_LOC AND x.PTN IS NOT NULL THEN
			IF PTN_LOC.EXISTS(x.PTN) THEN
				L_PTN := PTN_LOC(x.PTN);
			ELSE
				j := j + 1 ;
				L_PTN := TO_CHAR(j) ;
				PTN_LOC(x.PTN) := L_PTN ;
			END IF;
		ELSE
			L_PTN := x.PTN;
		END IF;

		i := i + 1 ;

		rec(i).ITM_CD	:= x.ITM_CD ;
		rec(i).ITM_SUB1	:= x.ITM_SUB1 ;
		rec(i).ITM_SUB2	:= x.ITM_SUB2 ;
		rec(i).ITM_SUB3	:= x.ITM_SUB3 ;
		rec(i).LOC_CD	:= x.LOC_CD ;
		rec(i).SPPL_CD 	:= x.SPPL_CD ;
		rec(i).RQST_WG_CD 	:= x.RQST_WG_CD ;
		rec(i).TERM	:= G_TERM ;
		rec(i).CALC_CTG_CD	:= G_CALC_CTG_CD ;
		rec(i).WG_CD	:= x.WG_CD ;
		rec(i).COST_RATIO	:= x.QTY ;
		rec(i).OPER_PTN	:= L_PTN ;
		IF x.OPER_CD IS NULL THEN
			rec(i).OPER_PTN	:= NULL;
		END IF ;
		rec(i).BOM_PTN	:= NVL(L_PTN, C_NULL_VAL) ;
		rec(i).EXP_PRIO	:= L_EXP_PRIO ;

		rec(i).MIN_LOT_QTY	:= 0 ;
		rec(i).BATCH_LOT_QTY	:= 0 ;
		rec(i).FXD_LOT_QTY	:= 0 ;
		rec(i).FXD_YIELD_QTY	:= 0 ;
		rec(i).NMR_QTY	:= 1 ;
		rec(i).DNM_QTY	:= 1 ;
		rec(i).ALC_DPT_CD	:= NULL ;
		rec(i).EXP_DPT_CD	:= NULL ;
		rec(i).MAX_QTY	:= NULL ;
		rec(i).ALC_VAL1	:= NULL ;
		rec(i).ALC_VAL2	:= NULL ;
		rec(i).ALC_VAL3	:= NULL ;
		rec(i).ALC_VAL4	:= NULL ;
		rec(i).ALC_VAL5	:= NULL ;
		rec(i).RMRKS	:= NULL ;
		rec(i).SUB_CHAR1	:= NULL ;
		rec(i).SUB_CHAR2	:= NULL ;
		rec(i).SUB_CHAR3	:= NULL ;
		rec(i).NON_CALC_FLG	:= C_OFF ;

		IF i > C_MAX_CNT THEN
			P_INS_DTL() ;
		END IF ;

		<<NEXT_LOOP>>
			NULL ;

	END LOOP ;

	P_INS_DTL() ;

	FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0002', 'MGPA_ACT_COPY_ITM_INFO.P_DTL') ;

END P_DTL ;

PROCEDURE P_OPER
/*********************************************************
<SYNOPSIS>
	原価品目工程情報コピー処理
<REMARKS>

<ARGUMENTS>
<HISTORY>
**********************************************************/
AS
	TYPE LIST_OPER IS TABLE OF MGT_ITM_OPER%ROWTYPE INDEX BY BINARY_INTEGER ;
	rec	LIST_OPER ;
	i	INTEGER := 0 ;

	L_PTN		MAPA_META.OPER_PTN%TYPE;
/**********************************************************/
PROCEDURE P_INS_OPER
AS
BEGIN
	IF i > 0 THEN
		FORALL t IN 1..i
			INSERT INTO MGT_ITM_OPER VALUES rec(t) ;
		rec.DELETE ;
		i := 0 ;
	END IF ;
END ;
/**********************************************************/
BEGIN

	FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0001', 'MGPA_ACT_COPY_ITM_INFO.P_OPER') ;

	DELETE	MGT_ITM_OPER t
	WHERE	0=0
	AND	t.TERM = G_TERM
	AND	t.CALC_CTG_CD = G_CALC_CTG_CD
	AND EXISTS (
		SELECT 'X'
		FROM	MGW_WG w
		WHERE	0=0
			AND w.WG_CD = t.WG_CD
		)
	;

	FOR x IN (
		SELECT
			t4.WG_CD,
			t1.ITM_CD,
			t1.ITM_SUB1,
			t1.ITM_SUB2,
			t1.ITM_SUB3,
			t4.LOC_CD,
			DECODE(G_PTN_SET_TYP,
				C_PTN_ITM, C_PTN1,
				C_PTN_LOC, t4.LOC_CD,
				DECODE(t2.SPPL_CD, NULL, C_PTN1, C_PTN2)) OPER_PTN,
			t1.OPER_CD,
			MIN(t1.OPER_SEQ) OPER_SEQ,
			MIN(t1.DISP_SEQ) DISP_SEQ,
			MIN(t3.ITM_CD) YIELD
		FROM
			MGT_INST_OPER t1,
			MGT_ITM_MFG_INST t2,
			(
			SELECT
				y.WG_CD,
				y.ITM_CD,
				y.ITM_SUB1,
				y.ITM_SUB2,
				y.ITM_SUB3,
				y.ITM_MFG_INST_NO,
				y.MFG_ACT_NO,
				y.OPER_ACT_NO
			FROM
				MGT_ACT_MFG_IF y,
				MGW_CALC_CTG w,
				MGW_WG w2
			WHERE 0=0
				AND y.CALC_CTG_CD = w.CALC_CTG_CD
				AND y.WG_CD = w2.WG_CD
				AND y.YM BETWEEN G_YM_FROM AND G_YM_TO
				AND y.NO_ITM_INFO_FLG = C_OFF
			) t3,
			(
			SELECT
				z.WG_CD,
				z.ITM_CD,
				z.ITM_SUB1,
				z.ITM_SUB2,
				z.ITM_SUB3,
				z.ITM_MFG_INST_NO,
				z.MFG_ACT_NO,
				MIN(z.LOC_CD) LOC_CD
			FROM
				MGT_ACT_MFG_IF z,
				MGW_CALC_CTG w,
				MGW_WG w2
			WHERE 0=0
				AND z.CALC_CTG_CD = w.CALC_CTG_CD
				AND z.WG_CD = w2.WG_CD
				AND z.YM BETWEEN G_YM_FROM AND G_YM_TO
				AND z.NO_ITM_INFO_FLG = C_OFF
			GROUP BY
				z.WG_CD,
				z.ITM_CD,
				z.ITM_SUB1,
				z.ITM_SUB2,
				z.ITM_SUB3,
				z.ITM_MFG_INST_NO,
				z.MFG_ACT_NO
			) t4,
			MAM_ITM m1,
			MGW_CALC_CTG w
		WHERE 0=0
			AND t1.CALC_CTG_CD = w.CALC_CTG_CD
			AND t2.CALC_CTG_CD = w.CALC_CTG_CD
			AND t1.ITM_CD = t2.ITM_CD
			AND t1.ITM_SUB1 = t2.ITM_SUB1
			AND t1.ITM_SUB2 = t2.ITM_SUB2
			AND t1.ITM_SUB3 = t2.ITM_SUB3
			AND t1.ITM_MFG_INST_NO = t2.ITM_MFG_INST_NO
			AND t1.MFG_ACT_NO = t2.MFG_ACT_NO
			AND t1.ITM_CD = t3.ITM_CD(+)
			AND t1.ITM_SUB1 = t3.ITM_SUB1(+)
			AND t1.ITM_SUB2 = t3.ITM_SUB2(+)
			AND t1.ITM_SUB3 = t3.ITM_SUB3(+)
			AND t1.ITM_MFG_INST_NO = t3.ITM_MFG_INST_NO(+)
			AND t1.MFG_ACT_NO = t3.MFG_ACT_NO(+)
			AND t1.OPER_ACT_NO = t3.OPER_ACT_NO(+)
			AND t3.WG_CD(+) = t4.WG_CD
			AND t1.ITM_CD = t4.ITM_CD
			AND t1.ITM_SUB1 = t4.ITM_SUB1
			AND t1.ITM_SUB2 = t4.ITM_SUB2
			AND t1.ITM_SUB3 = t4.ITM_SUB3
			AND t1.ITM_MFG_INST_NO = t4.ITM_MFG_INST_NO
			AND t1.MFG_ACT_NO = t4.MFG_ACT_NO
			AND t1.ITM_CD = m1.ITM_CD
			AND t1.ITM_SUB1 = m1.ITM_SUB1
			AND t1.ITM_SUB2 = m1.ITM_SUB2
			AND t1.ITM_SUB3 = m1.ITM_SUB3
		GROUP BY
			t4.WG_CD,
			t1.ITM_CD,
			t1.ITM_SUB1,
			t1.ITM_SUB2,
			t1.ITM_SUB3,
			t4.LOC_CD,
			DECODE(G_PTN_SET_TYP,
				C_PTN_ITM, C_PTN1,
				C_PTN_LOC, t4.LOC_CD,
				DECODE(t2.SPPL_CD, NULL, C_PTN1, C_PTN2)),
			t1.OPER_CD
		)
	LOOP
		IF G_PTN_SET_TYP = C_PTN_LOC AND x.OPER_PTN IS NOT NULL THEN
			IF PTN_LOC.EXISTS(x.OPER_PTN) THEN
				L_PTN := PTN_LOC(x.OPER_PTN);
			ELSE
				j := j + 1 ;
				L_PTN := TO_CHAR(j) ;
				PTN_LOC(x.OPER_PTN) := L_PTN ;
			END IF;
		ELSE
			L_PTN := x.OPER_PTN;
		END IF;

		i := i + 1 ;

		rec(i).ITM_CD	:= x.ITM_CD ;
		rec(i).ITM_SUB1	:= x.ITM_SUB1 ;
		rec(i).ITM_SUB2	:= x.ITM_SUB2 ;
		rec(i).ITM_SUB3	:= x.ITM_SUB3 ;
		rec(i).LOC_CD	:= x.LOC_CD ;
		rec(i).OPER_PTN	:= L_PTN ;
		rec(i).OPER_CD 	:= x.OPER_CD ;
		rec(i).OPER_SEQ 	:= x.OPER_SEQ ;
		rec(i).TERM	:= G_TERM ;
		rec(i).CALC_CTG_CD	:= G_CALC_CTG_CD ;
		rec(i).WG_CD	:= x.WG_CD ;
		rec(i).DISP_SEQ	:= x.DISP_SEQ ;
		rec(i).NMR_QTY	:= 1 ;
		rec(i).DNM_QTY	:= 1 ;

		IF x.YIELD IS NULL THEN
			rec(i).YIELD_OPER_FLG	:= C_OFF ;
		ELSE
			rec(i).YIELD_OPER_FLG	:= C_ON ;
		END IF;

		rec(i).OPER_UNIT_CD	:= NULL ;
		rec(i).OPER_STD_QTY	:= NULL ;
		rec(i).OPER_CONV_QTY	:= NULL ;
		rec(i).DEC_PLACE	:= NULL ;
		rec(i).UNIT_CONV_RND_TYP	:= NULL ;
		rec(i).RMRKS	:= NULL ;
		rec(i).SUB_CHAR1	:= NULL ;
		rec(i).SUB_CHAR2	:= NULL ;
		rec(i).SUB_CHAR3	:= NULL ;
		rec(i).NON_CALC_FLG	:= C_OFF ;

		IF i > C_MAX_CNT THEN
			P_INS_OPER() ;
		END IF ;

	END LOOP ;

	P_INS_OPER() ;

	FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0002', 'MGPA_ACT_COPY_ITM_INFO.P_OPER') ;

END P_OPER ;

PROCEDURE P_BOM
/*********************************************************
<SYNOPSIS>
	原価ＢＯＭ情報コピー処理
<REMARKS>

<ARGUMENTS>
<HISTORY>
**********************************************************/
AS
	TYPE LIST_BOM IS TABLE OF MGT_BOM%ROWTYPE INDEX BY BINARY_INTEGER ;
	rec	LIST_BOM ;
	i	INTEGER := 0 ;

	L_WG_CD			MAPA_META.WG_CD%TYPE ;
	L_PAR_ITM_CD	MAPA_META.ITM_CD%TYPE ;
	L_PAR_ITM_SUB1	MAPA_META.ITM_SUB1%TYPE ;
	L_PAR_ITM_SUB2	MAPA_META.ITM_SUB2%TYPE ;
	L_PAR_ITM_SUB3	MAPA_META.ITM_SUB3%TYPE ;
	L_BOM_PTN	MAPA_META.BOM_PTN%TYPE ;
	L_PTN		MAPA_META.BOM_PTN%TYPE;
	L_DISP_SEQ	NUMBER ;
/**********************************************************/
PROCEDURE P_INS_BOM
AS
BEGIN
	IF i > 0 THEN
		FORALL t IN 1..i
			INSERT INTO MGT_BOM VALUES rec(t) ;
		rec.DELETE ;
		i := 0 ;
	END IF ;
END ;
/**********************************************************/
BEGIN

	FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0001', 'MGPA_ACT_COPY_ITM_INFO.P_BOM') ;

	DELETE	MGT_BOM t
	WHERE	0=0
	AND	t.TERM = G_TERM
	AND	t.CALC_CTG_CD = G_CALC_CTG_CD
	AND (
		G_DEF_WG_CNT > 0 AND t.WG_CD = C_NULL_VAL
		OR
		G_DEF_WG_CNT = 0
		AND EXISTS (
			SELECT 'X'
			FROM	MGW_WG w
			WHERE	0=0
			AND	w.WG_CD = t.WG_CD
			)
	)
	;

	L_WG_CD := NULL ;
	L_PAR_ITM_CD := NULL ;
	L_PAR_ITM_SUB1 := NULL ;
	L_PAR_ITM_SUB2 := NULL ;
	L_PAR_ITM_SUB3 := NULL ;
	L_BOM_PTN := NULL ;
	FOR x IN (
		SELECT
			t1.*,
			t2.QTY P_QTY,
			NVL(m1.COST_STD_QTY, 1) BASE_QTY,
			NVL(m2.DEC_PLACE, 0) DEC_PLACE
		FROM
			(
			SELECT
				DECODE(G_DEF_WG_CNT, 0, t1.WG_CD, C_NULL_VAL) AS WG_CD,
				t1.PAR_ITM_CD,
				t1.PAR_ITM_SUB1,
				t1.PAR_ITM_SUB2,
				t1.PAR_ITM_SUB3,
				DECODE(G_PTN_SET_TYP,
					C_PTN_ITM, C_PTN1,
					C_PTN_LOC, t1.LOC_CD,
					DECODE(t2.SPPL_CD, NULL, C_PTN1, C_PTN2)) BOM_PTN,
				t1.ITM_CD,
				t1.ITM_SUB1,
				t1.ITM_SUB2,
				t1.ITM_SUB3,
				t1.EXPNS_CD,
				t3.OPER_CD,
				MIN(t3.OPER_SEQ) AS OPER_SEQ,
				SUM(t1.QTY) AS QTY
			FROM
				MGT_ACT_INPT_IF t1,
				MGT_ITM_MFG_INST t2,
				MGT_INST_OPER t3,
				MGW_CALC_CTG w,
				MGW_WG w2
			WHERE 0=0
				AND t1.CALC_CTG_CD = w.CALC_CTG_CD
				AND t1.WG_CD = w2.WG_CD
				AND t1.CALC_CTG_CD = t2.CALC_CTG_CD
				AND t1.PAR_ITM_CD = t2.ITM_CD
				AND t1.PAR_ITM_SUB1 = t2.ITM_SUB1
				AND t1.PAR_ITM_SUB2 = t2.ITM_SUB2
				AND t1.PAR_ITM_SUB3 = t2.ITM_SUB3
				AND t1.ITM_MFG_INST_NO = t2.ITM_MFG_INST_NO
				AND t1.MFG_ACT_NO = t2.MFG_ACT_NO
				AND t1.CALC_CTG_CD = t3.CALC_CTG_CD(+)
				AND t1.PAR_ITM_CD = t3.ITM_CD(+)
				AND t1.PAR_ITM_SUB1 = t3.ITM_SUB1(+)
				AND t1.PAR_ITM_SUB2 = t3.ITM_SUB2(+)
				AND t1.PAR_ITM_SUB3 = t3.ITM_SUB3(+)
				AND t1.ITM_MFG_INST_NO = t3.ITM_MFG_INST_NO(+)
				AND t1.MFG_ACT_NO = t3.MFG_ACT_NO(+)
				AND t1.OPER_ACT_NO = t3.OPER_ACT_NO(+)
				AND t1.YM BETWEEN G_YM_FROM AND G_YM_TO
				AND t1.NO_ITM_INFO_FLG = C_OFF
				AND (t1.PAR_ITM_CD <> t1.ITM_CD
						OR t1.PAR_ITM_SUB1 <> t1.ITM_SUB1
						OR t1.PAR_ITM_SUB2 <> t1.ITM_SUB2
						OR t1.PAR_ITM_SUB3 <> t1.ITM_SUB3)
			GROUP BY
				DECODE(G_DEF_WG_CNT, 0, t1.WG_CD, C_NULL_VAL),
				t1.PAR_ITM_CD,
				t1.PAR_ITM_SUB1,
				t1.PAR_ITM_SUB2,
				t1.PAR_ITM_SUB3,
				DECODE(G_PTN_SET_TYP,
					C_PTN_ITM, C_PTN1,
					C_PTN_LOC, t1.LOC_CD,
					DECODE(t2.SPPL_CD, NULL, C_PTN1, C_PTN2)),
				t1.ITM_CD,
				t1.ITM_SUB1,
				t1.ITM_SUB2,
				t1.ITM_SUB3,
				t1.EXPNS_CD,
				t3.OPER_CD
			) t1,
			(
			SELECT
				DECODE(G_DEF_WG_CNT, 0, t1.WG_CD, C_NULL_VAL) AS WG_CD,
				t1.ITM_CD,
				t1.ITM_SUB1,
				t1.ITM_SUB2,
				t1.ITM_SUB3,
				DECODE(G_PTN_SET_TYP,
					C_PTN_ITM, C_PTN1,
					C_PTN_LOC, t1.LOC_CD,
					DECODE(t2.SPPL_CD, NULL, C_PTN1, C_PTN2)) BOM_PTN,
				SUM(t1.QTY) AS QTY
			FROM
				MGT_ACT_MFG_IF t1,
				MGT_ITM_MFG_INST t2,
				MGW_CALC_CTG w,
				MGW_WG w2
			WHERE 0=0
				AND t1.CALC_CTG_CD = w.CALC_CTG_CD
				AND t1.WG_CD = w2.WG_CD
				AND t1.CALC_CTG_CD = t2.CALC_CTG_CD
				AND t1.ITM_CD = t2.ITM_CD
				AND t1.ITM_SUB1 = t2.ITM_SUB1
				AND t1.ITM_SUB2 = t2.ITM_SUB2
				AND t1.ITM_SUB3 = t2.ITM_SUB3
				AND t1.ITM_MFG_INST_NO = t2.ITM_MFG_INST_NO
				AND t1.MFG_ACT_NO = t2.MFG_ACT_NO
				AND t1.YM BETWEEN G_YM_FROM AND G_YM_TO
				AND t1.NO_ITM_INFO_FLG = C_OFF
			GROUP BY
				DECODE(G_DEF_WG_CNT, 0, t1.WG_CD, C_NULL_VAL),
				t1.ITM_CD,
				t1.ITM_SUB1,
				t1.ITM_SUB2,
				t1.ITM_SUB3,
				DECODE(G_PTN_SET_TYP,
					C_PTN_ITM, C_PTN1,
					C_PTN_LOC, t1.LOC_CD,
					DECODE(t2.SPPL_CD, NULL, C_PTN1, C_PTN2))
			) t2,
			MAM_ITM m1,
			MAM_ITM m2
		WHERE 0=0
			AND t1.WG_CD = t2.WG_CD
			AND t1.PAR_ITM_CD = t2.ITM_CD
			AND t1.PAR_ITM_SUB1 = t2.ITM_SUB1
			AND t1.PAR_ITM_SUB2 = t2.ITM_SUB2
			AND t1.PAR_ITM_SUB3 = t2.ITM_SUB3
			AND t1.BOM_PTN = t2.BOM_PTN
			AND t1.PAR_ITM_CD = m1.ITM_CD
			AND t1.PAR_ITM_SUB1 = m1.ITM_SUB1
			AND t1.PAR_ITM_SUB2 = m1.ITM_SUB2
			AND t1.PAR_ITM_SUB3 = m1.ITM_SUB3
			AND t1.ITM_CD = m2.ITM_CD
			AND t1.ITM_SUB1 = m2.ITM_SUB1
			AND t1.ITM_SUB2 = m2.ITM_SUB2
			AND t1.ITM_SUB3 = m2.ITM_SUB3
			AND t2.QTY <> 0
		ORDER BY
			t1.WG_CD, t1.PAR_ITM_CD, t1.PAR_ITM_SUB1, t1.PAR_ITM_SUB2, t1.PAR_ITM_SUB3, t1.BOM_PTN,
			t1.ITM_CD, t1.ITM_SUB1, t1.ITM_SUB2, t1.ITM_SUB3, t1.OPER_CD, t1.EXPNS_CD
		)
	LOOP
		IF L_WG_CD IS NULL AND L_PAR_ITM_CD IS NULL AND L_BOM_PTN IS NULL
		OR L_WG_CD <> x.WG_CD
		OR L_PAR_ITM_CD <> x.PAR_ITM_CD
		OR L_PAR_ITM_SUB1 <> x.PAR_ITM_SUB1
		OR L_PAR_ITM_SUB2 <> x.PAR_ITM_SUB2
		OR L_PAR_ITM_SUB3 <> x.PAR_ITM_SUB3
		OR L_BOM_PTN <> x.BOM_PTN
		THEN
			L_WG_CD := x.WG_CD ;
			L_PAR_ITM_CD := x.PAR_ITM_CD ;
			L_PAR_ITM_SUB1 := x.PAR_ITM_SUB1 ;
			L_PAR_ITM_SUB2 := x.PAR_ITM_SUB2 ;
			L_PAR_ITM_SUB3 := x.PAR_ITM_SUB3 ;
			L_BOM_PTN := x.BOM_PTN ;
			L_DISP_SEQ := 1 ;
		ELSE
			L_DISP_SEQ := L_DISP_SEQ + 1 ;
		END IF ;

		IF G_PTN_SET_TYP = C_PTN_LOC AND x.BOM_PTN IS NOT NULL THEN
			IF PTN_LOC.EXISTS(x.BOM_PTN) THEN
				L_PTN := PTN_LOC(x.BOM_PTN);
			ELSE
				j := j + 1 ;
				L_PTN := TO_CHAR(j) ;
				PTN_LOC(x.BOM_PTN) := L_PTN ;
			END IF;
		ELSE
			L_PTN := x.BOM_PTN;
		END IF;

		i := i + 1 ;

		rec(i).PAR_ITM_CD	:= x.PAR_ITM_CD ;
		rec(i).PAR_ITM_SUB1	:= x.PAR_ITM_SUB1 ;
		rec(i).PAR_ITM_SUB2	:= x.PAR_ITM_SUB2 ;
		rec(i).PAR_ITM_SUB3	:= x.PAR_ITM_SUB3 ;
		rec(i).BOM_PTN	:= L_PTN ;
		rec(i).OPER_CD	:= x.OPER_CD ;
		rec(i).OPER_SEQ	:= x.OPER_SEQ ;
		rec(i).CHD_ITM_CD	:= x.ITM_CD ;
		rec(i).CHD_ITM_SUB1	:= x.ITM_SUB1 ;
		rec(i).CHD_ITM_SUB2	:= x.ITM_SUB2 ;
		rec(i).CHD_ITM_SUB3	:= x.ITM_SUB3 ;
		rec(i).ALT_GRP_CD 	:= NULL ;
		rec(i).EXPNS_CD	:= x.EXPNS_CD ;
		rec(i).TERM	:= G_TERM ;
		rec(i).CALC_CTG_CD	:= G_CALC_CTG_CD ;
		rec(i).WG_CD	:= x.WG_CD ;
		rec(i).DISP_SEQ	:= L_DISP_SEQ ;
		rec(i).PAR_RQMT_QTY	:= x.BASE_QTY ;
		rec(i).CHD_RQMT_QTY	:= MAPA_CALC.F_RND((x.QTY / x.P_QTY) * x.BASE_QTY, x.DEC_PLACE, C_RND_TYP) ;
		rec(i).CHD_BASE_QTY	:= rec(i).CHD_RQMT_QTY ;

		rec(i).FXD_CHD_RQMT_QTY	:= 0;
		rec(i).CHD_MIN_QTY	:= 0 ;
		rec(i).CHD_BATCH_QTY	:= 0 ;
		rec(i).ALT_ITM_RATIO	:= NULL ;
		rec(i).RMRKS	:= NULL ;
		rec(i).SUB_CHAR1	:= NULL ;
		rec(i).SUB_CHAR2	:= NULL ;
		rec(i).SUB_CHAR3	:= NULL ;
		rec(i).NON_CALC_FLG	:= C_OFF ;

		IF i > C_MAX_CNT THEN
			P_INS_BOM() ;
		END IF ;

	END LOOP ;

	P_INS_BOM() ;

	FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0002', 'MGPA_ACT_COPY_ITM_INFO.P_BOM') ;

END P_BOM ;

PROCEDURE P_WK
/*********************************************************
<SYNOPSIS>
	原価品目工数情報コピー処理
<REMARKS>

<ARGUMENTS>
<HISTORY>
**********************************************************/
AS
	TYPE LIST_WK IS TABLE OF MGT_ITM_WK%ROWTYPE INDEX BY BINARY_INTEGER ;
	rec	LIST_WK ;
	i	INTEGER := 0 ;

	L_PTN		MAPA_META.OPER_PTN%TYPE;
/**********************************************************/
PROCEDURE P_INS_WK
AS
BEGIN
	IF i > 0 THEN
		FORALL t IN 1..i
			INSERT INTO MGT_ITM_WK VALUES rec(t) ;
		rec.DELETE ;
		i := 0 ;
	END IF ;
END ;
/**********************************************************/
BEGIN

	FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0001', 'MGPA_ACT_COPY_ITM_INFO.P_WK') ;

	DELETE	MGT_ITM_WK t
	WHERE	0=0
	AND	t.TERM = G_TERM
	AND	t.CALC_CTG_CD = G_CALC_CTG_CD
	AND EXISTS (
		SELECT 'X'
		FROM	MGW_WG w
		WHERE	0=0
			AND w.WG_CD = t.WG_CD
		)
	;

	FOR x IN (
		SELECT
			x1.WG_CD,
			x1.ITM_CD,
			x1.ITM_SUB1,
			x1.ITM_SUB2,
			x1.ITM_SUB3,
			x1.LOC_CD,
			x1.OPER_PTN,
			x1.OPER_CD,
			x1.OPER_SEQ,
			x1.WK_COST_CD,
			NVL(m1.COST_STD_QTY, 1) BASE_QTY,
			MAPA_CALC.F_RND((x1.WK_COST / x2.QTY) * NVL(m1.COST_STD_QTY, 1), NVL(m2.DEC_PLACE, 0), C_RND_TYP)	WK_COST
		FROM
			(
			SELECT
				t1.WG_CD,
				t1.ITM_CD,
				t1.ITM_SUB1,
				t1.ITM_SUB2,
				t1.ITM_SUB3,
				t1.LOC_CD,
				DECODE(G_PTN_SET_TYP,
					C_PTN_ITM, C_PTN1,
					C_PTN_LOC, t1.LOC_CD,
					DECODE(t3.SPPL_CD, NULL, C_PTN1, C_PTN2)) OPER_PTN,
				NVL(t2.OPER_CD, C_NULL_VAL) OPER_CD,
				NVL(MIN(t2.OPER_SEQ), 1) OPER_SEQ,
				t1.WK_COST_CD,
				SUM(t1.WK_COST) WK_COST
			FROM
				MGT_ACT_INST_WK_IF t1,
				MGT_INST_OPER t2,
				MGT_ITM_MFG_INST t3,
				MGW_CALC_CTG w,
				MGW_WG w2
			WHERE 0=0
				AND t1.CALC_CTG_CD = w.CALC_CTG_CD
				AND t1.WG_CD = w2.WG_CD
				AND t1.CALC_CTG_CD = t2.CALC_CTG_CD(+)
				AND t1.ITM_CD = t2.ITM_CD(+)
				AND t1.ITM_SUB1 = t2.ITM_SUB1(+)
				AND t1.ITM_SUB2 = t2.ITM_SUB2(+)
				AND t1.ITM_SUB3 = t2.ITM_SUB3(+)
				AND t1.ITM_MFG_INST_NO = t2.ITM_MFG_INST_NO(+)
				AND t1.MFG_ACT_NO = t2.MFG_ACT_NO(+)
				AND t1.OPER_ACT_NO = t2.OPER_ACT_NO(+)
				AND t1.CALC_CTG_CD = t3.CALC_CTG_CD
				AND t1.ITM_CD = t3.ITM_CD
				AND t1.ITM_SUB1 = t3.ITM_SUB1
				AND t1.ITM_SUB2 = t3.ITM_SUB2
				AND t1.ITM_SUB3 = t3.ITM_SUB3
				AND t1.ITM_MFG_INST_NO = t3.ITM_MFG_INST_NO
				AND t1.MFG_ACT_NO = t3.MFG_ACT_NO
				AND t1.YM BETWEEN G_YM_FROM AND G_YM_TO
				AND t1.NO_ITM_INFO_FLG = C_OFF
			GROUP BY
				t1.WG_CD,
				t1.ITM_CD,
				t1.ITM_SUB1,
				t1.ITM_SUB2,
				t1.ITM_SUB3,
				t1.LOC_CD,
				DECODE(G_PTN_SET_TYP,
					C_PTN_ITM, C_PTN1,
					C_PTN_LOC, t1.LOC_CD,
					DECODE(t3.SPPL_CD, NULL, C_PTN1, C_PTN2)),
				t2.OPER_CD,
				t1.WK_COST_CD
			) x1,
			(
			SELECT
				t1.WG_CD,
				t1.ITM_CD,
				t1.ITM_SUB1,
				t1.ITM_SUB2,
				t1.ITM_SUB3,
				t1.LOC_CD,
				DECODE(G_PTN_SET_TYP,
					C_PTN_ITM, C_PTN1,
					C_PTN_LOC, t1.LOC_CD,
					DECODE(t2.SPPL_CD, NULL, C_PTN1, C_PTN2)) OPER_PTN,
				SUM(t1.QTY) QTY
			FROM
				MGT_ACT_MFG_IF t1,
				MGT_ITM_MFG_INST t2,
				MGW_CALC_CTG w,
				MGW_WG w2
			WHERE 0=0
				AND t1.CALC_CTG_CD = w.CALC_CTG_CD
				AND t1.CALC_CTG_CD = t2.CALC_CTG_CD
				AND t1.WG_CD = w2.WG_CD
				AND t1.ITM_CD = t2.ITM_CD
				AND t1.ITM_SUB1 = t2.ITM_SUB1
				AND t1.ITM_SUB2 = t2.ITM_SUB2
				AND t1.ITM_SUB3 = t2.ITM_SUB3
				AND t1.ITM_MFG_INST_NO = t2.ITM_MFG_INST_NO
				AND t1.MFG_ACT_NO = t2.MFG_ACT_NO
				AND t1.YM BETWEEN G_YM_FROM AND G_YM_TO
				AND t1.NO_ITM_INFO_FLG = C_OFF
			GROUP BY
				t1.WG_CD,
				t1.ITM_CD,
				t1.ITM_SUB1,
				t1.ITM_SUB2,
				t1.ITM_SUB3,
				t1.LOC_CD,
				DECODE(G_PTN_SET_TYP,
					C_PTN_ITM, C_PTN1,
					C_PTN_LOC, t1.LOC_CD,
					DECODE(t2.SPPL_CD, NULL, C_PTN1, C_PTN2))
			) x2,
			MAM_ITM m1,
			MAM_WK_COST m2
		WHERE 0=0
			AND x1.WG_CD = x2.WG_CD
			AND x1.ITM_CD = x2.ITM_CD
			AND x1.ITM_SUB1 = x2.ITM_SUB1
			AND x1.ITM_SUB2 = x2.ITM_SUB2
			AND x1.ITM_SUB3 = x2.ITM_SUB3
			AND x1.LOC_CD = x2.LOC_CD
			AND x1.OPER_PTN = x2.OPER_PTN
			AND x1.ITM_CD = m1.ITM_CD
			AND x1.ITM_SUB1 = m1.ITM_SUB1
			AND x1.ITM_SUB2 = m1.ITM_SUB2
			AND x1.ITM_SUB3 = m1.ITM_SUB3
			AND x1.WK_COST_CD = m2.WK_COST_CD(+)
			AND m2.DEL_FLG(+) = C_OFF
			AND x2.QTY <> 0
		)
	LOOP
		IF G_PTN_SET_TYP = C_PTN_LOC AND x.OPER_PTN IS NOT NULL THEN
			IF PTN_LOC.EXISTS(x.OPER_PTN) THEN
				L_PTN := PTN_LOC(x.OPER_PTN);
			ELSE
				j := j + 1 ;
				L_PTN := TO_CHAR(j) ;
				PTN_LOC(x.OPER_PTN) := L_PTN ;
			END IF;
		ELSE
			L_PTN := x.OPER_PTN;
		END IF;
		IF x.OPER_CD = C_NULL_VAL THEN
			L_PTN := C_NULL_VAL;
		END IF ;

		i := i + 1 ;

		rec(i).ITM_CD	:= x.ITM_CD ;
		rec(i).ITM_SUB1	:= x.ITM_SUB1 ;
		rec(i).ITM_SUB2	:= x.ITM_SUB2 ;
		rec(i).ITM_SUB3	:= x.ITM_SUB3 ;
		rec(i).LOC_CD	:= x.LOC_CD ;
		rec(i).OPER_PTN	:= L_PTN ;
		rec(i).OPER_CD 	:= x.OPER_CD ;
		rec(i).OPER_SEQ 	:= x.OPER_SEQ ;
		rec(i).WK_COST_CD 	:= x.WK_COST_CD ;
		rec(i).TERM	:= G_TERM ;
		rec(i).CALC_CTG_CD	:= G_CALC_CTG_CD ;
		rec(i).WG_CD	:= x.WG_CD ;

		rec(i).BASE_QTY	:= x.BASE_QTY ;
		rec(i).FXD_WK_COST	:= 0 ;
		rec(i).WK_COST	:= x.WK_COST ;
		rec(i).MIN_WK_COST	:= 0 ;
		rec(i).BATCH_WK_COST	:= 0 ;
		rec(i).RMRKS	:= NULL ;
		rec(i).SUB_CHAR1	:= NULL ;
		rec(i).SUB_CHAR2	:= NULL ;
		rec(i).SUB_CHAR3	:= NULL ;
		rec(i).NON_CALC_FLG	:= C_OFF ;

		IF i > C_MAX_CNT THEN
			P_INS_WK() ;
		END IF ;

	END LOOP ;

	P_INS_WK() ;

	FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0002', 'MGPA_ACT_COPY_ITM_INFO.P_WK') ;

END P_WK ;

PROCEDURE P_PURC
/*********************************************************
<SYNOPSIS>
	原価品目購買単価情報コピー処理
<REMARKS>

<ARGUMENTS>
<HISTORY>
**********************************************************/
AS
BEGIN
	FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0001', 'MGPA_ACT_COPY_ITM_INFO.P_PURC') ;

	DELETE	MGT_ITM_PURC t
	WHERE	0=0
	AND	t.TERM = G_TERM
	AND	t.CALC_CTG_CD = G_CALC_CTG_CD
	AND (
		G_DEF_WG_CNT > 0 AND t.WG_CD = C_NULL_VAL
		OR
		G_DEF_WG_CNT = 0
		AND EXISTS (
			SELECT 'X'
			FROM	MGW_WG w
			WHERE	0=0
			AND	w.WG_CD = t.WG_CD
			)
	)
	;

	INSERT INTO MGT_ITM_PURC (
		ITM_CD,
		ITM_SUB1,
		ITM_SUB2,
		ITM_SUB3,
		SPPL_CD,
		TERM,
		CALC_CTG_CD,
		WG_CD,
		BASE_QTY,
		CUR_CD,
		UPRI,
		COST_RATIO,
		RMRKS, SUB_CHAR1, SUB_CHAR2, SUB_CHAR3,
		NON_CALC_FLG
		)
	SELECT
		x.ITM_CD,
		x.ITM_SUB1,
		x.ITM_SUB2,
		x.ITM_SUB3,
		x.SPPL_CD,
		G_TERM,
		G_CALC_CTG_CD,
		x.WG_CD,
		NVL(m.COST_STD_QTY, 1),
		G_BASE_CUR_CD,
		MAPA_CALC.F_RND((x.AMT / x.QTY) * NVL(m.COST_STD_QTY, 1), G_UPRI_DEC_PLACE, C_RND_TYP),
		NULL,
		NULL, NULL, NULL, NULL,
		C_OFF
	FROM
		(
		SELECT
			DECODE(G_DEF_WG_CNT, 0, t.WG_CD, C_NULL_VAL) AS WG_CD,
			t.ITM_CD,
			t.ITM_SUB1,
			t.ITM_SUB2,
			t.ITM_SUB3,
			t.SPPL_CD,
			SUM(DECODE(SIGN(t.QTY), -1, -1 * t.AMT, t.AMT)) AS AMT, --数量が負の場合のみ反転
			SUM(DECODE(SIGN(t.QTY), -1, -1 * t.QTY, t.QTY)) AS QTY  --数量が負の場合は反転
		FROM
			MGT_ACT_PURC_IF t,
			MGW_CALC_CTG w,
			MGW_WG w2
		WHERE 0=0
			AND t.CALC_CTG_CD = w.CALC_CTG_CD
			AND t.WG_CD = w2.WG_CD
			AND t.YM BETWEEN G_YM_FROM AND G_YM_TO
			AND t.NO_ITM_INFO_FLG = C_OFF
		GROUP BY
			DECODE(G_DEF_WG_CNT, 0, t.WG_CD, C_NULL_VAL),
			t.ITM_CD,
			t.ITM_SUB1,
			t.ITM_SUB2,
			t.ITM_SUB3,
			t.SPPL_CD
		) x,
		MAM_ITM m
	WHERE 0=0
		AND x.ITM_CD = m.ITM_CD
		AND x.ITM_SUB1 = m.ITM_SUB1
		AND x.ITM_SUB2 = m.ITM_SUB2
		AND x.ITM_SUB3 = m.ITM_SUB3
		AND x.QTY <> 0
	;

	DELETE	MGT_ITM_PURC t
	WHERE	0=0
	AND	t.TERM = G_TERM
	AND	t.CALC_CTG_CD = G_CALC_CTG_CD
	AND (
		G_DEF_WG_CNT > 0 AND t.WG_CD = C_NULL_VAL
		OR
		G_DEF_WG_CNT = 0
		AND EXISTS (
			SELECT 'X'
			FROM	MGW_WG w
			WHERE	0=0
			AND	w.WG_CD = t.WG_CD
			)
	)
	AND	t.UPRI = 0
	;

	FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0002', 'MGPA_ACT_COPY_ITM_INFO.P_PURC') ;
END P_PURC ;

PROCEDURE P_PROC
/*********************************************************
<SYNOPSIS>
	原価品目加工単価情報コピー処理
<REMARKS>

<ARGUMENTS>
<HISTORY>
**********************************************************/
AS
	C_SLIP_ONR_PROV	CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.ONR_PROV ;	--有償支給
	C_SLIP_ONR_PRVR	CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.ONR_PRVR ;	--有償支給戻
	C_SLIP_IN_ONR	CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.IN_ONR ;		--投入(有償)
	C_OUTSRC_PROC	CONSTANT MAPA_META.OUTSRC_UPRI_TYP%TYPE := MAC_OUTSRC_UPRI_TYP.PROC ;	--加工単価
	L_CO	MAM_CO%ROWTYPE := MAPA_CO.F_GET_CO_REC() ;
BEGIN
	FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0001', 'MGPA_ACT_COPY_ITM_INFO.P_PROC') ;

	DELETE	MGT_ITM_PROC t
	WHERE	0=0
	AND	t.TERM = G_TERM
	AND	t.CALC_CTG_CD = G_CALC_CTG_CD
	AND (
		G_DEF_WG_CNT > 0 AND t.WG_CD = C_NULL_VAL
		OR
		G_DEF_WG_CNT = 0
		AND EXISTS (
			SELECT 'X'
			FROM	MGW_WG w
			WHERE	0=0
			AND	w.WG_CD = t.WG_CD
			)
	)
	;

	INSERT INTO MGT_ITM_PROC (
		ITM_CD,
		ITM_SUB1,
		ITM_SUB2,
		ITM_SUB3,
		SPPL_CD,
		TERM,
		CALC_CTG_CD,
		WG_CD,
		BASE_QTY,
		CUR_CD,
		UPRI,
		COST_RATIO,
		RMRKS, SUB_CHAR1, SUB_CHAR2, SUB_CHAR3,
		NON_CALC_FLG
		)
	SELECT
		x.ITM_CD,
		x.ITM_SUB1,
		x.ITM_SUB2,
		x.ITM_SUB3,
		x.SPPL_CD,
		G_TERM,
		G_CALC_CTG_CD,
		x.WG_CD,
		NVL(m.COST_STD_QTY, 1),
		G_BASE_CUR_CD,
		MAPA_CALC.F_RND(
			DECODE(
				DECODE(m2.ONR_PRSPPL_FLG, '0', C_OUTSRC_PROC, NVL(m2.OUTSRC_UPRI_TYP, L_CO.OUTSRC_UPRI_TYP)),
				C_OUTSRC_PROC, x.AMT, x.AMT-NVL(x2.AMT, 0)
			) / x.QTY * NVL(m.COST_STD_QTY, 1),
			G_UPRI_DEC_PLACE,
			C_RND_TYP),
		NULL,
		NULL, NULL, NULL, NULL,
		C_OFF
	FROM
		(
		SELECT
			DECODE(G_DEF_WG_CNT, 0, t1.WG_CD, C_NULL_VAL) AS WG_CD,
			t1.ITM_CD,
			t1.ITM_SUB1,
			t1.ITM_SUB2,
			t1.ITM_SUB3,
			t2.SPPL_CD,
			SUM(DECODE(SIGN(t1.QTY), -1, -1 * t1.AMT, t1.AMT)) AS AMT, --数量が負の場合のみ反転
			SUM(DECODE(SIGN(t1.QTY), -1, -1 * t1.QTY, t1.QTY)) AS QTY  --数量が負の場合は反転
		FROM
			MGT_ACT_MFG_IF t1,
			MGT_ITM_MFG_INST t2,
			MGW_CALC_CTG w,
			MGW_WG w2
		WHERE 0=0
			AND t1.CALC_CTG_CD = w.CALC_CTG_CD
			AND t1.WG_CD = w2.WG_CD
			AND t1.AC_SLIP_TYP IN (C_PURC, C_PURC_RET, C_PURC_DSCNT, C_PURC_XTRA)
			AND t1.CALC_CTG_CD = t2.CALC_CTG_CD
			AND t1.ITM_CD = t2.ITM_CD
			AND t1.ITM_SUB1 = t2.ITM_SUB1
			AND t1.ITM_SUB2 = t2.ITM_SUB2
			AND t1.ITM_SUB3 = t2.ITM_SUB3
			AND t1.ITM_MFG_INST_NO = t2.ITM_MFG_INST_NO
			AND t1.MFG_ACT_NO = t2.MFG_ACT_NO
			AND t1.YM BETWEEN G_YM_FROM AND G_YM_TO
			AND t1.NO_ITM_INFO_FLG = C_OFF
			AND t1.AMT IS NOT NULL
			AND t2.SPPL_CD IS NOT NULL
		GROUP BY
			DECODE(G_DEF_WG_CNT, 0, t1.WG_CD, C_NULL_VAL),
			t1.ITM_CD,
			t1.ITM_SUB1,
			t1.ITM_SUB2,
			t1.ITM_SUB3,
			t2.SPPL_CD
		) x,
		(
		SELECT
			DECODE(G_DEF_WG_CNT, 0, v1.WG_CD, C_NULL_VAL) AS WG_CD,
			v1.PAR_ITM_CD,
			v1.PAR_ITM_SUB1,
			v1.PAR_ITM_SUB2,
			v1.PAR_ITM_SUB3,
			v1.SPPL_CD,
			SUM(v2.AMT/v2.QTY*v1.QTY) AMT
		FROM
			(
			SELECT -- 投入（有償）
				t1.WG_CD,
				t1.PAR_ITM_CD,
				t1.PAR_ITM_SUB1,
				t1.PAR_ITM_SUB2,
				t1.PAR_ITM_SUB3,
				t1.ITM_CD,
				t1.ITM_SUB1,
				t1.ITM_SUB2,
				t1.ITM_SUB3,
				t2.SPPL_CD,
				SUM(DECODE(SIGN(t1.QTY), -1, -1 * t1.QTY, t1.QTY)) QTY  --数量が負の場合は反転
			FROM
				MGT_ACT_INPT_IF t1,
				MGT_ITM_MFG_INST t2,
				MGW_CALC_CTG w,
				MGW_WG w2
			WHERE 0=0
				AND t1.CALC_CTG_CD = w.CALC_CTG_CD
				AND t1.WG_CD = w2.WG_CD
				AND t1.CALC_CTG_CD = t2.CALC_CTG_CD
				AND t1.PAR_ITM_CD = t2.ITM_CD
				AND t1.PAR_ITM_SUB1 = t2.ITM_SUB1
				AND t1.PAR_ITM_SUB2 = t2.ITM_SUB2
				AND t1.PAR_ITM_SUB3 = t2.ITM_SUB3
				AND t1.ITM_MFG_INST_NO = t2.ITM_MFG_INST_NO
				AND t1.MFG_ACT_NO = t2.MFG_ACT_NO
				AND t1.YM BETWEEN G_YM_FROM AND G_YM_TO
				AND t1.AC_SLIP_TYP IN (C_SLIP_IN_ONR)
				AND t1.NO_ITM_INFO_FLG = C_OFF
				AND t1.QTY IS NOT NULL
				AND t2.SPPL_CD IS NOT NULL
			GROUP BY
				t1.WG_CD,
				t1.PAR_ITM_CD,
				t1.PAR_ITM_SUB1,
				t1.PAR_ITM_SUB2,
				t1.PAR_ITM_SUB3,
				t1.ITM_CD,
				t1.ITM_SUB1,
				t1.ITM_SUB2,
				t1.ITM_SUB3,
				t2.SPPL_CD
			) v1,
			(
			SELECT -- 有償支給、有償支給戻し
				t.WG_CD,
				t.ITM_CD,
				t.ITM_SUB1,
				t.ITM_SUB2,
				t.ITM_SUB3,
				t.BP_CD AS SPPL_CD,
				SUM(DECODE(SIGN(T.QTY), -1, -1 * t.AMT, t.AMT)) AMT, --数量が負の場合のみ反転
				SUM(DECODE(SIGN(T.QTY), -1, -1 * t.QTY, t.QTY)) QTY  --数量が負の場合は反転
			FROM
				MGT_ACT_IO_IF t,
				MGW_CALC_CTG w,
				MGW_WG w2
			WHERE 0=0
				AND t.CALC_CTG_CD = w.CALC_CTG_CD
				AND t.WG_CD = w2.WG_CD
				AND t.YM BETWEEN G_YM_FROM AND G_YM_TO
				AND t.AC_SLIP_TYP IN (C_SLIP_ONR_PROV, C_SLIP_ONR_PRVR)
				AND t.NO_ITM_INFO_FLG = C_OFF
				AND t.AMT IS NOT NULL
				AND t.BP_CD IS NOT NULL
			GROUP BY
				t.WG_CD,
				t.ITM_CD,
				t.ITM_SUB1,
				t.ITM_SUB2,
				t.ITM_SUB3,
				t.BP_CD
			) v2
		WHERE 0=0
			AND v2.WG_CD = v1.WG_CD
			AND v2.ITM_CD = v1.ITM_CD
			AND v2.ITM_SUB1 = v1.ITM_SUB1
			AND v2.ITM_SUB2 = v1.ITM_SUB2
			AND v2.ITM_SUB3 = v1.ITM_SUB3
			AND v2.SPPL_CD = v1.SPPL_CD
			AND v1.QTY <> 0
			AND v2.QTY <> 0
		GROUP BY
			DECODE(G_DEF_WG_CNT, 0, v1.WG_CD, C_NULL_VAL),
			v1.PAR_ITM_CD,
			v1.PAR_ITM_SUB1,
			v1.PAR_ITM_SUB2,
			v1.PAR_ITM_SUB3,
			v1.SPPL_CD
		) x2,
		MAM_ITM m,
		MAM_BP m2
	WHERE 0=0
		AND x.WG_CD = x2.WG_CD(+)
		AND x.ITM_CD = x2.PAR_ITM_CD(+)
		AND x.ITM_SUB1 = x2.PAR_ITM_SUB1(+)
		AND x.ITM_SUB2 = x2.PAR_ITM_SUB2(+)
		AND x.ITM_SUB3 = x2.PAR_ITM_SUB3(+)
		AND x.SPPL_CD = x2.SPPL_CD(+)
		AND x.ITM_CD = m.ITM_CD
		AND x.ITM_SUB1 = m.ITM_SUB1
		AND x.ITM_SUB2 = m.ITM_SUB2
		AND x.ITM_SUB3 = m.ITM_SUB3
		AND x.SPPL_CD = m2.BP_CD
		AND x.QTY <> 0
	;

	DELETE	MGT_ITM_PROC t
	WHERE	0=0
	AND	t.TERM = G_TERM
	AND	t.CALC_CTG_CD = G_CALC_CTG_CD
	AND (
		G_DEF_WG_CNT > 0 AND t.WG_CD = C_NULL_VAL
		OR
		G_DEF_WG_CNT = 0
		AND EXISTS (
			SELECT 'X'
			FROM	MGW_WG w
			WHERE	0=0
			AND	w.WG_CD = t.WG_CD
			)
	)
	AND	t.UPRI = 0
	;

	FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0002', 'MGPA_ACT_COPY_ITM_INFO.P_PROC') ;
END P_PROC ;

PROCEDURE P_PROV
/*********************************************************
<SYNOPSIS>
	原価品目支給単価情報コピー処理
<REMARKS>

<ARGUMENTS>
<HISTORY>
**********************************************************/
AS
	C_SLIP_ONR_PROV	CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.ONR_PROV ;	--有償支給
	C_SLIP_ONR_PRVR	CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.ONR_PRVR ;	--有償支給戻
	C_SLIP_IN_SS	CONSTANT MAPA_META.AC_SLIP_TYP%TYPE := MAC_AC_SLIP_TYP.IN_SS ;	--投入(自給)
	C_ONR_PROV	CONSTANT MAPA_META.PROV_TYP%TYPE := MAC_PROV_TYP.ONR_PROV ;	--支給区分.有償支給
	C_SS		CONSTANT MAPA_META.PROV_TYP%TYPE := MAC_PROV_TYP.SS ;		--支給区分.自給
BEGIN
	FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0001', 'MGPA_ACT_COPY_ITM_INFO.P_PROV') ;

	DELETE	MGT_ITM_PROV t
	WHERE	0=0
	AND	t.TERM = G_TERM
	AND	t.CALC_CTG_CD = G_CALC_CTG_CD
	AND (
		G_DEF_WG_CNT > 0 AND t.WG_CD = C_NULL_VAL
		OR
		G_DEF_WG_CNT = 0
		AND EXISTS (
			SELECT 'X'
			FROM	MGW_WG w
			WHERE	0=0
			AND	w.WG_CD = t.WG_CD
			)
	)
	;

	--有償支給
	INSERT INTO MGT_ITM_PROV (
		ITM_CD,
		ITM_SUB1,
		ITM_SUB2,
		ITM_SUB3,
		PRSPPL_CD,
		TERM,
		CALC_CTG_CD,
		WG_CD,
		PROV_TYP,
		BASE_QTY,
		CUR_CD,
		UPRI,
		RMRKS, SUB_CHAR1, SUB_CHAR2, SUB_CHAR3,
		NON_CALC_FLG
		)
	SELECT
		x.ITM_CD,
		x.ITM_SUB1,
		x.ITM_SUB2,
		x.ITM_SUB3,
		x.PRSPPL_CD,
		G_TERM,
		G_CALC_CTG_CD,
		x.WG_CD,
		C_ONR_PROV,
		NVL(m.COST_STD_QTY, 1),
		G_BASE_CUR_CD,
		MAPA_CALC.F_RND((x.AMT / x.QTY) * NVL(m.COST_STD_QTY, 1), G_UPRI_DEC_PLACE, C_RND_TYP),
		NULL, NULL, NULL, NULL,
		C_OFF
	FROM
		(
		SELECT
			DECODE(G_DEF_WG_CNT, 0, t.WG_CD, C_NULL_VAL) AS WG_CD,
			t.ITM_CD,
			t.ITM_SUB1,
			t.ITM_SUB2,
			t.ITM_SUB3,
			t.BP_CD AS PRSPPL_CD,
			SUM(DECODE(SIGN(T.QTY), -1, -1 * t.AMT, t.AMT)) AMT, --数量が負の場合のみ反転
			SUM(DECODE(SIGN(T.QTY), -1, -1 * t.QTY, t.QTY)) QTY  --数量が負の場合は反転
		FROM
			MGT_ACT_IO_IF t,
			MGW_CALC_CTG w,
			MGW_WG w2
		WHERE 0=0
			AND t.CALC_CTG_CD = w.CALC_CTG_CD
			AND t.WG_CD = w2.WG_CD
			AND t.YM BETWEEN G_YM_FROM AND G_YM_TO
			AND t.AC_SLIP_TYP IN (C_SLIP_ONR_PROV, C_SLIP_ONR_PRVR)
			AND t.NO_ITM_INFO_FLG = C_OFF
			AND t.AMT IS NOT NULL
			AND t.BP_CD IS NOT NULL
		GROUP BY
			DECODE(G_DEF_WG_CNT, 0, t.WG_CD, C_NULL_VAL),
			t.ITM_CD,
			t.ITM_SUB1,
			t.ITM_SUB2,
			t.ITM_SUB3,
			t.BP_CD
		) x,
		MAM_ITM m
	WHERE 0=0
		AND x.ITM_CD = m.ITM_CD
		AND x.ITM_SUB1 = m.ITM_SUB1
		AND x.ITM_SUB2 = m.ITM_SUB2
		AND x.ITM_SUB3 = m.ITM_SUB3
		AND x.QTY <> 0
	;


	--自給
	INSERT INTO MGT_ITM_PROV (
		ITM_CD,
		ITM_SUB1,
		ITM_SUB2,
		ITM_SUB3,
		PRSPPL_CD,
		TERM,
		CALC_CTG_CD,
		WG_CD,
		PROV_TYP,
		BASE_QTY,
		CUR_CD,
		UPRI,
		RMRKS, SUB_CHAR1, SUB_CHAR2, SUB_CHAR3,
		NON_CALC_FLG
		)
	SELECT
		x.ITM_CD,
		x.ITM_SUB1,
		x.ITM_SUB2,
		x.ITM_SUB3,
		x.PRSPPL_CD,
		G_TERM,
		G_CALC_CTG_CD,
		x.WG_CD,
		C_SS,
		NVL(m.COST_STD_QTY, 1),
		G_BASE_CUR_CD,
		MAPA_CALC.F_RND((x.AMT / x.QTY) * NVL(m.COST_STD_QTY, 1), G_UPRI_DEC_PLACE, C_RND_TYP),
		NULL, NULL, NULL, NULL,
		C_OFF
	FROM
		(
		SELECT
			DECODE(G_DEF_WG_CNT, 0, t1.WG_CD, C_NULL_VAL) AS WG_CD,
			t1.ITM_CD,
			t1.ITM_SUB1,
			t1.ITM_SUB2,
			t1.ITM_SUB3,
			t2.SPPL_CD AS PRSPPL_CD,
			SUM(DECODE(SIGN(t1.QTY), -1, -1 * t1.AMT, t1.AMT)) AMT, --数量が負の場合のみ反転
			SUM(DECODE(SIGN(t1.QTY), -1, -1 * t1.QTY, t1.QTY)) QTY  --数量が負の場合は反転
		FROM
			MGT_ACT_INPT_IF t1,
			MGT_ITM_MFG_INST t2,
			MGW_CALC_CTG w,
			MGW_WG w2
		WHERE 0=0
			AND t1.CALC_CTG_CD = w.CALC_CTG_CD
			AND t1.WG_CD = w2.WG_CD
			AND t1.CALC_CTG_CD = t2.CALC_CTG_CD
			AND t1.PAR_ITM_CD = t2.ITM_CD
			AND t1.PAR_ITM_SUB1 = t2.ITM_SUB1
			AND t1.PAR_ITM_SUB2 = t2.ITM_SUB2
			AND t1.PAR_ITM_SUB3 = t2.ITM_SUB3
			AND t1.ITM_MFG_INST_NO = t2.ITM_MFG_INST_NO
			AND t1.MFG_ACT_NO = t2.MFG_ACT_NO
			AND t1.YM BETWEEN G_YM_FROM AND G_YM_TO
			AND t1.AC_SLIP_TYP IN (C_SLIP_IN_SS)
			AND t1.NO_ITM_INFO_FLG = C_OFF
			AND t1.AMT IS NOT NULL
			AND t2.SPPL_CD IS NOT NULL
		GROUP BY
			DECODE(G_DEF_WG_CNT, 0, t1.WG_CD, C_NULL_VAL),
			t1.ITM_CD,
			t1.ITM_SUB1,
			t1.ITM_SUB2,
			t1.ITM_SUB3,
			t2.SPPL_CD
		) x,
		MAM_ITM m
	WHERE 0=0
		AND x.ITM_CD = m.ITM_CD
		AND x.ITM_SUB1 = m.ITM_SUB1
		AND x.ITM_SUB2 = m.ITM_SUB2
		AND x.ITM_SUB3 = m.ITM_SUB3
		AND x.QTY <> 0
		AND NOT EXISTS (
			SELECT 'X'
			FROM	MGT_ITM_PROV y
			WHERE	0=0
				AND y.ITM_CD = x.ITM_CD
				AND y.ITM_SUB1 = x.ITM_SUB1
				AND y.ITM_SUB2 = x.ITM_SUB2
				AND y.ITM_SUB3 = x.ITM_SUB3
				AND y.PRSPPL_CD = x.PRSPPL_CD
				AND y.TERM = G_TERM
				AND y.CALC_CTG_CD = G_CALC_CTG_CD
				AND y.WG_CD = x.WG_CD
			)
	;


	FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0002', 'MGPA_ACT_COPY_ITM_INFO.P_PROV') ;
END P_PROV ;

PROCEDURE P_SLS
/*********************************************************
<SYNOPSIS>
	原価品目販売単価情報コピー処理
<REMARKS>

<ARGUMENTS>
<HISTORY>
**********************************************************/
AS

BEGIN
	FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0001', 'MGPA_ACT_COPY_ITM_INFO.P_SLS') ;

	DELETE MGT_ITM_SLS t
	WHERE	0=0
	AND	t.TERM = G_TERM
	AND	t.CALC_CTG_CD = G_CALC_CTG_CD
	AND (
		G_DEF_WG_CNT > 0 AND t.WG_CD = C_NULL_VAL
		OR
		G_DEF_WG_CNT = 0
		AND EXISTS (
			SELECT 'X'
			FROM	MGW_WG w
			WHERE	0=0
			AND	w.WG_CD = t.WG_CD
			)
	)
	;

	INSERT INTO MGT_ITM_SLS (
		ITM_CD,
		ITM_SUB1,
		ITM_SUB2,
		ITM_SUB3,
		DPT_CD,
		CST_CD,
		DLV_CD,
		DEST_CD1,
		DEST_CD2,
		DEST_CD3,
		TERM,
		CALC_CTG_CD,
		WG_CD,
		BASE_QTY,
		CUR_CD,
		UPRI,
		ALC_VAL1, ALC_VAL2, ALC_VAL3, ALC_VAL4, ALC_VAL5,
		RMRKS,
		SUB_CHAR1,
		SUB_CHAR2,
		SUB_CHAR3,
		NON_CALC_FLG
		)
	SELECT
		x.ITM_CD,
		x.ITM_SUB1,
		x.ITM_SUB2,
		x.ITM_SUB3,
		NVL(x.DPT_CD, C_NULL_VAL),
		NVL(x.CST_CD, C_NULL_VAL),
		NVL(x.DLV_CD, C_NULL_VAL),
		NVL(x.DEST_CD1, C_NULL_VAL),
		NVL(x.DEST_CD2, C_NULL_VAL),
		NVL(x.DEST_CD3, C_NULL_VAL),
		G_TERM,
		G_CALC_CTG_CD,
		x.WG_CD,
		NVL(m.COST_STD_QTY, 1),
		G_BASE_CUR_CD,
		MAPA_CALC.F_RND((x.AMT / x.QTY) * NVL(m.COST_STD_QTY, 1), G_UPRI_DEC_PLACE, C_RND_TYP),
		NULL, NULL, NULL, NULL, NULL,
		NULL,
		NULL,
		NULL,
		NULL,
		C_OFF
	FROM
		(
		SELECT
			DECODE(G_DEF_WG_CNT, 0, t.WG_CD, C_NULL_VAL) AS WG_CD,
			t.ITM_CD,
			t.ITM_SUB1,
			t.ITM_SUB2,
			t.ITM_SUB3,
			t.SLS_DPT_CD AS DPT_CD,
			t.CST_CD,
			t.DLV_CD,
			t.DEST_CD1,
			t.DEST_CD2,
			t.DEST_CD3,
			SUM(DECODE(SIGN(t.QTY), -1, -1 * t.AMT, t.AMT)) AS AMT, --数量が負の場合のみ反転
			SUM(DECODE(SIGN(t.QTY), -1, -1 * t.QTY, t.QTY)) AS QTY  --数量が負の場合は反転
		FROM
			MGT_ACT_SLS_IF t,
			MGW_CALC_CTG w,
			MGW_WG w2
		WHERE 0=0
			AND t.CALC_CTG_CD = w.CALC_CTG_CD
			AND t.WG_CD = w2.WG_CD
			AND t.YM BETWEEN G_YM_FROM AND G_YM_TO
			AND t.NO_ITM_INFO_FLG = C_OFF
		GROUP BY
			DECODE(G_DEF_WG_CNT, 0, t.WG_CD, C_NULL_VAL),
			t.ITM_CD,
			t.ITM_SUB1,
			t.ITM_SUB2,
			t.ITM_SUB3,
			t.SLS_DPT_CD,
			t.CST_CD,
			t.DLV_CD,
			t.DEST_CD1,
			t.DEST_CD2,
			t.DEST_CD3
		) x,
		MAM_ITM m
	WHERE 0=0
		AND x.ITM_CD = m.ITM_CD
		AND x.ITM_SUB1 = m.ITM_SUB1
		AND x.ITM_SUB2 = m.ITM_SUB2
		AND x.ITM_SUB3 = m.ITM_SUB3
		AND x.QTY <> 0
	;

	DELETE	MGT_ITM_SLS t
	WHERE	0=0
	AND	t.TERM = G_TERM
	AND	t.CALC_CTG_CD = G_CALC_CTG_CD
	AND (
		G_DEF_WG_CNT > 0 AND t.WG_CD = C_NULL_VAL
		OR
		G_DEF_WG_CNT = 0
		AND EXISTS (
			SELECT 'X'
			FROM	MGW_WG w
			WHERE	0=0
			AND	w.WG_CD = t.WG_CD
			)
	)
	AND	t.UPRI = 0
	;

	FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0002', 'MGPA_ACT_COPY_ITM_INFO.P_SLS') ;
END P_SLS ;

PROCEDURE P_MAIN (
	I_YM_FROM	IN MAPA_META.YM%TYPE,
	I_YM_TO		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_TERM		IN MAPA_META.YM%TYPE,
	I_ITM		IN MAPA_META.FLG%TYPE,
	I_DTL		IN MAPA_META.FLG%TYPE,
	I_OPER		IN MAPA_META.FLG%TYPE,
	I_BOM		IN MAPA_META.FLG%TYPE,
	I_WK		IN MAPA_META.FLG%TYPE,
	I_PURC		IN MAPA_META.FLG%TYPE,
	I_PROC		IN MAPA_META.FLG%TYPE,
	I_PROV		IN MAPA_META.FLG%TYPE,
	I_SLS		IN MAPA_META.FLG%TYPE,
	I_PTN_SET_TYP	IN MGPA_META.PTN_SET_TYP%TYPE
)
/*********************************************************
<SYNOPSIS>
	原価実績品目情報コピー処理
<REMARKS>
	事前にMGW_CALC_CTG、MGW_WGを作成しておく必要がある
<ARGUMENTS>
<IN>	I_YM_FROM
		コピー元年月Ｆｒｏｍ
<IN>	I_YM_TO
		コピー元年月Ｔｏ
<IN>	I_CALC_CTG_CD
		コピー先計算カテゴリＣＤ
<IN>	I_TERM
		コピー先期
<IN>	I_ITM
		原価品目情報ＦＬＧ
<IN>	I_DTL
		原価品目詳細ＦＬＧ
<IN>	I_OPER
		原価品目工程ＦＬＧ
<IN>	I_BOM
		原価ＢＯＭＦＬＧ
<IN>	I_WK
		原価品目工数ＦＬＧ
<IN>	I_PURC
		原価品目購買単価ＦＬＧ
<IN>	I_PROC
		原価品目加工単価ＦＬＧ
<IN>	I_PROV
		原価品目支給単価ＦＬＧ
<IN>	I_SLS
		原価品目販売単価ＦＬＧ
<IN>	I_PTN_SET_TYP
		構成/工程パタン設定区分
<HISTORY>
**********************************************************/
AS

BEGIN
	--処理を開始しました。{1}
	FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0001', 'MGPA_ACT_COPY_ITM_INFO.P_MAIN') ;

	G_YM_FROM := I_YM_FROM ;
	G_YM_TO := I_YM_TO ;
	G_CALC_CTG_CD := I_CALC_CTG_CD ;
	G_TERM := I_TERM ;
	G_PTN_SET_TYP := I_PTN_SET_TYP ;
	G_ITM := I_ITM ;
	G_DTL := I_DTL ;
	G_OPER := I_OPER ;
	G_BOM := I_BOM ;
	G_WK := I_WK ;
	G_PURC := I_PURC ;
	G_PROC := I_PROC ;
	G_PROV := I_PROV ;
	G_SLS := I_SLS ;

	SELECT	COUNT(*)
	INTO	G_DEF_WG_CNT
	FROM	MAM_SYS_PARM m
	WHERE	0=0
	AND	m.PARM_KEY = 'DEF_WG_CD'
	AND	m.PARM_VAL IS NOT NULL
	AND	m.PARM_VAL != C_NULL_VAL
	;

	--確定チェック
	P_FIX_CHK() ;

	--基準通貨情報の取得
	MAPA_XCHNG.P_GET_BASE_CUR_INFO(G_BASE_CUR_CD, G_UPRI_DEC_PLACE, G_AMT_DEC_PLACE) ;

	--各品目情報コピー処理
	IF G_ITM = C_ON THEN
		P_ITM() ;
	END IF ;

	IF G_DTL = C_ON THEN
		P_DTL() ;
	END IF ;

	IF G_OPER = C_ON THEN
		P_OPER() ;
	END IF ;

	IF G_BOM = C_ON THEN
		P_BOM() ;
	END IF ;

	IF G_WK = C_ON THEN
		P_WK() ;
	END IF ;

	IF G_PURC = C_ON THEN
		P_PURC() ;
	END IF ;

	IF G_PROC = C_ON THEN
		P_PROC() ;
	END IF ;

	IF G_PROV = C_ON THEN
		P_PROV() ;
	END IF ;

	IF G_SLS = C_ON THEN
		P_SLS() ;
	END IF ;

	PTN_LOC.DELETE;

	--処理が終了しました。{1}
	FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0002', 'MGPA_ACT_COPY_ITM_INFO.P_MAIN') ;

END P_MAIN ;

END MGPA_ACT_COPY_ITM_INFO ;
/
