package mcframe.commonMG.meta;

import mcframe.commonCore.meta.MCMeta;

/**
 * 共有項目メタの定義クラスです。
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
abstract public class MG_META_MC_A {
	/**
	 * 展開優先順位.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>9,0</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta EXP_PRIO = MCMeta.createNumberMeta("EXP_PRIO", "", 9, 0);

	/**
	 * 優先順位.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>3,0</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SLS_UNIT_PRIO = MCMeta.createNumberMeta("SLS_UNIT_PRIO", "", 3, 0);

	/**
	 * 製造実績ＩＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ACT_MFG_ID = MCMeta.createStringMeta("ACT_MFG_ID", "", 20);

	/**
	 * 製造原価比率.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>21,8</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta MFG_COST_RATIO = MCMeta.createNumberMeta("MFG_COST_RATIO", "", 21, 8);

	/**
	 * 購買実績ＩＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ACT_PURC_ID = MCMeta.createStringMeta("ACT_PURC_ID", "", 20);

	/**
	 * 投入実績ＩＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ACT_INPT_ID = MCMeta.createStringMeta("ACT_INPT_ID", "", 20);

	/**
	 * 投入実績ＩＤ枝番.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>3</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ACT_INPT_ID_SUB = MCMeta.createStringMeta("ACT_INPT_ID_SUB", "", 3);

	/**
	 * 個別評価区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta REC_EVAL_TYP = MCMeta.createStringMeta("REC_EVAL_TYP", "", 1);

	/**
	 * 個別評価区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta REC_EVAL_TYP_NM = MCMeta.createStringMeta("REC_EVAL_TYP_NM", "");

	/**
	 * 指図工数実績ＩＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ACT_INST_WK_ID = MCMeta.createStringMeta("ACT_INST_WK_ID", "", 20);

	/**
	 * 指図外工数実績ＩＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ACT_OTHER_WK_ID = MCMeta.createStringMeta("ACT_OTHER_WK_ID", "", 20);

	/**
	 * 入出庫実績ＩＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ACT_IO_ID = MCMeta.createStringMeta("ACT_IO_ID", "", 20);

	/**
	 * 入出庫実績ＩＤ枝番.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>3</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ACT_IO_ID_SUB = MCMeta.createStringMeta("ACT_IO_ID_SUB", "", 3);

	/**
	 * 振替比率.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>21,8</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta TRD_RATIO = MCMeta.createNumberMeta("TRD_RATIO", "", 21, 8);

	/**
	 * 売上実績ＩＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ACT_SLS_ID = MCMeta.createStringMeta("ACT_SLS_ID", "", 20);

	/**
	 * 売上実績ＩＤ枝番.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>3</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ACT_SLS_ID_SUB = MCMeta.createStringMeta("ACT_SLS_ID_SUB", "", 3);

	/**
	 * 品目拡張.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ITM_EXT = MCMeta.createStringMeta("ITM_EXT", "", 100);

	/**
	 * 一次配賦比率.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>21,8</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta PRE_ALC_RATE = MCMeta.createNumberMeta("PRE_ALC_RATE", "", 21, 8);

	/**
	 * 費用発生区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ALC_REC_TYP = MCMeta.createStringMeta("ALC_REC_TYP", "", 1);

	/**
	 * 費用発生区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ALC_REC_TYP_NM = MCMeta.createStringMeta("ALC_REC_TYP_NM", "");

	/**
	 * 計算回数.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>2,0</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta CALC_CNT = MCMeta.createNumberMeta("CALC_CNT", "", 2, 0);

	/**
	 * ログリクエストＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>15</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta LOG_REQ_NO = MCMeta.createStringMeta("LOG_REQ_NO", "", 15);

	/**
	 * シーケンスＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>9,0</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SEQ_NO = MCMeta.createNumberMeta("SEQ_NO", "", 9, 0);

	/**
	 * ログ時間（テキスト）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>15</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta LOG_TIME = MCMeta.createStringMeta("LOG_TIME", "", 15);

	/**
	 * 原価バッチ区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>2</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BATCH_TYP = MCMeta.createStringMeta("BATCH_TYP", "", 2);

	/**
	 * 原価バッチ区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>40</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BATCH_TYP_NM = MCMeta.createStringMeta("BATCH_TYP_NM", "");

	/**
	 * 計算実行順序.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>3,0</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CALC_ACT_SEQ = MCMeta.createNumberMeta("CALC_ACT_SEQ", "", 3, 0);

	/**
	 * 入力費用区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta INPT_ALC_TYP = MCMeta.createStringMeta("INPT_ALC_TYP", "", 1);

	/**
	 * 入力費用区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta INPT_ALC_TYP_NM = MCMeta.createStringMeta("INPT_ALC_TYP_NM", "");

	/**
	 * 金額追加区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta AMT_ADD_TYP = MCMeta.createStringMeta("AMT_ADD_TYP", "", 1);

	/**
	 * 金額追加区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta AMT_ADD_TYP_NM = MCMeta.createStringMeta("AMT_ADD_TYP_NM", "");

	/**
	 * 金額判定区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta AMT_DCSN_TYP = MCMeta.createStringMeta("AMT_DCSN_TYP", "", 1);

	/**
	 * 金額判定区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta AMT_DCSN_TYP_NM = MCMeta.createStringMeta("AMT_DCSN_TYP_NM", "");

	/**
	 * 数量判定区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta QTY_DCSN_TYP = MCMeta.createStringMeta("QTY_DCSN_TYP", "", 1);

	/**
	 * 数量判定区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta QTY_DCSN_TYP_NM = MCMeta.createStringMeta("QTY_DCSN_TYP_NM", "");

	/**
	 * 共通データ種類区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CT_DATA_TYP = MCMeta.createStringMeta("CT_DATA_TYP", "", 1);

	/**
	 * 共通データ種類区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CT_DATA_TYP_NM = MCMeta.createStringMeta("CT_DATA_TYP_NM", "");

	/**
	 * ＩＦデータ詳細区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>15</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_DTL_TYP = MCMeta.createStringMeta("IF_DTL_TYP", "", 15);

	/**
	 * ＩＦデータ詳細区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_DTL_TYP_NM = MCMeta.createStringMeta("IF_DTL_TYP_NM", "");

	/**
	 * ＩＦデータ種類区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_DATA_TYP = MCMeta.createStringMeta("IF_DATA_TYP", "", 1);

	/**
	 * ＩＦデータ種類区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_DATA_TYP_NM = MCMeta.createStringMeta("IF_DATA_TYP_NM", "");

	/**
	 * 原価実績種類区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta COST_ACT_TYP = MCMeta.createStringMeta("COST_ACT_TYP", "", 1);

	/**
	 * 原価実績種類区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta COST_ACT_TYP_NM = MCMeta.createStringMeta("COST_ACT_TYP_NM", "");

	/**
	 * テーブルカテゴリ区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>2</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta TAB_CTG_TYP = MCMeta.createStringMeta("TAB_CTG_TYP", "", 2);

	/**
	 * テーブルカテゴリ区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta TAB_CTG_TYP_NM = MCMeta.createStringMeta("TAB_CTG_TYP_NM", "");

	/**
	 * 原価コピー対象区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>30</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta COST_COPY_TYP = MCMeta.createStringMeta("COST_COPY_TYP", "", 30);

	/**
	 * 原価コピー対象区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta COST_COPY_TYP_NM = MCMeta.createStringMeta("COST_COPY_TYP_NM", "");

	/**
	 * 受払レコード区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>2,0</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IO_REC_TYP = MCMeta.createNumberMeta("IO_REC_TYP", "", 2, 0);

	/**
	 * 受払レコード区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IO_REC_TYP_NM = MCMeta.createStringMeta("IO_REC_TYP_NM", "");

	/**
	 * 構成/工程パタン設定区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta PTN_SET_TYP = MCMeta.createStringMeta("PTN_SET_TYP", "", 1);

	/**
	 * 構成/工程パタン設定区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>30</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PTN_SET_TYP_NM = MCMeta.createStringMeta("PTN_SET_TYP_NM", "");

	/**
	 * 一次配賦対象値合計.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>21,8</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta PRE_ALC_TOTAL = MCMeta.createNumberMeta("PRE_ALC_TOTAL", "", 21, 8);

	/**
	 * 一次配賦率.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>21,8</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta PRE_ALC_CALC_RATE = MCMeta.createNumberMeta("PRE_ALC_CALC_RATE", "", 21, 8);

	/**
	 * 配賦グループＩＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>9,0</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta ALC_GRP_ID = MCMeta.createNumberMeta("ALC_GRP_ID", "", 9, 0);

	/**
	 * 配賦対象.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>21,8</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta ALC_TGT_VAL = MCMeta.createNumberMeta("ALC_TGT_VAL", "", 21, 8);

	/**
	 * 最上位レコードＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>9,0</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta TOP_REC_NO = MCMeta.createNumberMeta("TOP_REC_NO", "", 9, 0);

	/**
	 * 展開階層.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>3,0</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta CALC_LVL = MCMeta.createNumberMeta("CALC_LVL", "", 3, 0);

	/**
	 * 工程レコードＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>9,0</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta OPER_REC_NO = MCMeta.createNumberMeta("OPER_REC_NO", "", 9, 0);

	/**
	 * 投入レコードＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>9,0</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta INPT_REC_NO = MCMeta.createNumberMeta("INPT_REC_NO", "", 9, 0);

	/**
	 * 集計投入レコードＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>13,0</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta SML_INPT_REC_NO = MCMeta.createNumberMeta("SML_INPT_REC_NO", "", 13, 0);

	/**
	 * 工数レコードＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>9,0</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta WK_REC_NO = MCMeta.createNumberMeta("WK_REC_NO", "", 9, 0);

	/**
	 * 実績ＩＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ACT_ID = MCMeta.createStringMeta("ACT_ID", "", 20);

	/**
	 * 実績ＩＤ枝番.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>3</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ACT_ID_SUB = MCMeta.createStringMeta("ACT_ID_SUB", "", 3);

	/**
	 * 集計キー.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta SML_KEY = MCMeta.createStringMeta("SML_KEY", "", 50);

	/**
	 * 計算順序.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>3,0</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CALC_SEQ = MCMeta.createNumberMeta("CALC_SEQ", "", 3, 0);

	/**
	 * 実績ＩＦ連番.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>3,0</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta ACT_IF_SEQ = MCMeta.createNumberMeta("ACT_IF_SEQ", "", 3, 0);

	/**
	 * 計算レコード区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CALC_REC_TYP = MCMeta.createStringMeta("CALC_REC_TYP", "", 1);

	/**
	 * 計算レコード区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CALC_REC_TYP_NM = MCMeta.createStringMeta("CALC_REC_TYP_NM", "");

	/**
	 * マスタ取込処理区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IMP_OPE_TYP = MCMeta.createStringMeta("IMP_OPE_TYP", "", 1);

	/**
	 * マスタ取込処理区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IMP_OPE_TYP_NM = MCMeta.createStringMeta("IMP_OPE_TYP_NM", "");

	/**
	 * レポート値.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>21,8</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta RPT_VAL = MCMeta.createNumberMeta("RPT_VAL", "", 21, 8);

	/**
	 * レコードＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>15,0</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta ROW_NO = MCMeta.createNumberMeta("ROW_NO", "", 15, 0);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目情報<br>
	 */
	public static final MCMeta ITM_RMRKS = MCMeta.createStringMeta("ITM_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目情報<br>
	 */
	public static final MCMeta ITM_SUB_CHAR1 = MCMeta.createStringMeta("ITM_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目情報<br>
	 */
	public static final MCMeta ITM_SUB_CHAR2 = MCMeta.createStringMeta("ITM_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目情報<br>
	 */
	public static final MCMeta ITM_SUB_CHAR3 = MCMeta.createStringMeta("ITM_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目詳細情報<br>
	 */
	public static final MCMeta ITM_DTL_RMRKS = MCMeta.createStringMeta("ITM_DTL_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目詳細情報<br>
	 */
	public static final MCMeta ITM_DTL_SUB_CHAR1 = MCMeta.createStringMeta("ITM_DTL_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目詳細情報<br>
	 */
	public static final MCMeta ITM_DTL_SUB_CHAR2 = MCMeta.createStringMeta("ITM_DTL_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目詳細情報<br>
	 */
	public static final MCMeta ITM_DTL_SUB_CHAR3 = MCMeta.createStringMeta("ITM_DTL_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目工程情報<br>
	 */
	public static final MCMeta ITM_OPER_RMRKS = MCMeta.createStringMeta("ITM_OPER_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目工程情報<br>
	 */
	public static final MCMeta ITM_OPER_SUB_CHAR1 = MCMeta.createStringMeta("ITM_OPER_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目工程情報<br>
	 */
	public static final MCMeta ITM_OPER_SUB_CHAR2 = MCMeta.createStringMeta("ITM_OPER_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目工程情報<br>
	 */
	public static final MCMeta ITM_OPER_SUB_CHAR3 = MCMeta.createStringMeta("ITM_OPER_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価ＢＯＭ情報<br>
	 */
	public static final MCMeta BOM_RMRKS = MCMeta.createStringMeta("BOM_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価ＢＯＭ情報<br>
	 */
	public static final MCMeta BOM_SUB_CHAR1 = MCMeta.createStringMeta("BOM_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価ＢＯＭ情報<br>
	 */
	public static final MCMeta BOM_SUB_CHAR2 = MCMeta.createStringMeta("BOM_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価ＢＯＭ情報<br>
	 */
	public static final MCMeta BOM_SUB_CHAR3 = MCMeta.createStringMeta("BOM_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目工数情報<br>
	 */
	public static final MCMeta ITM_WK_RMRKS = MCMeta.createStringMeta("ITM_WK_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目工数情報<br>
	 */
	public static final MCMeta ITM_WK_SUB_CHAR1 = MCMeta.createStringMeta("ITM_WK_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目工数情報<br>
	 */
	public static final MCMeta ITM_WK_SUB_CHAR2 = MCMeta.createStringMeta("ITM_WK_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目工数情報<br>
	 */
	public static final MCMeta ITM_WK_SUB_CHAR3 = MCMeta.createStringMeta("ITM_WK_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目購買単価情報<br>
	 */
	public static final MCMeta ITM_PURC_RMRKS = MCMeta.createStringMeta("ITM_PURC_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目購買単価情報<br>
	 */
	public static final MCMeta ITM_PURC_SUB_CHAR1 = MCMeta.createStringMeta("ITM_PURC_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目購買単価情報<br>
	 */
	public static final MCMeta ITM_PURC_SUB_CHAR2 = MCMeta.createStringMeta("ITM_PURC_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目購買単価情報<br>
	 */
	public static final MCMeta ITM_PURC_SUB_CHAR3 = MCMeta.createStringMeta("ITM_PURC_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目加工単価情報<br>
	 */
	public static final MCMeta ITM_PROC_RMRKS = MCMeta.createStringMeta("ITM_PROC_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目加工単価情報<br>
	 */
	public static final MCMeta ITM_PROC_SUB_CHAR1 = MCMeta.createStringMeta("ITM_PROC_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目加工単価情報<br>
	 */
	public static final MCMeta ITM_PROC_SUB_CHAR2 = MCMeta.createStringMeta("ITM_PROC_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目加工単価情報<br>
	 */
	public static final MCMeta ITM_PROC_SUB_CHAR3 = MCMeta.createStringMeta("ITM_PROC_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目支給単価情報<br>
	 */
	public static final MCMeta ITM_PROV_RMRKS = MCMeta.createStringMeta("ITM_PROV_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目支給単価情報<br>
	 */
	public static final MCMeta ITM_PROV_SUB_CHAR1 = MCMeta.createStringMeta("ITM_PROV_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目支給単価情報<br>
	 */
	public static final MCMeta ITM_PROV_SUB_CHAR2 = MCMeta.createStringMeta("ITM_PROV_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目支給単価情報<br>
	 */
	public static final MCMeta ITM_PROV_SUB_CHAR3 = MCMeta.createStringMeta("ITM_PROV_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目販売単価情報<br>
	 */
	public static final MCMeta ITM_SLS_RMRKS = MCMeta.createStringMeta("ITM_SLS_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目販売単価情報<br>
	 */
	public static final MCMeta ITM_SLS_SUB_CHAR1 = MCMeta.createStringMeta("ITM_SLS_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目販売単価情報<br>
	 */
	public static final MCMeta ITM_SLS_SUB_CHAR2 = MCMeta.createStringMeta("ITM_SLS_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目販売単価情報<br>
	 */
	public static final MCMeta ITM_SLS_SUB_CHAR3 = MCMeta.createStringMeta("ITM_SLS_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目指値情報<br>
	 */
	public static final MCMeta ITM_FIX_RMRKS = MCMeta.createStringMeta("ITM_FIX_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目指値情報<br>
	 */
	public static final MCMeta ITM_FIX_SUB_CHAR1 = MCMeta.createStringMeta("ITM_FIX_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目指値情報<br>
	 */
	public static final MCMeta ITM_FIX_SUB_CHAR2 = MCMeta.createStringMeta("ITM_FIX_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価品目指値情報<br>
	 */
	public static final MCMeta ITM_FIX_SUB_CHAR3 = MCMeta.createStringMeta("ITM_FIX_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 標準配賦率情報<br>
	 */
	public static final MCMeta STD_ALC_RATE_RMRKS = MCMeta.createStringMeta("STD_ALC_RATE_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 標準配賦率情報<br>
	 */
	public static final MCMeta STD_ALC_RATE_SUB_CHAR1 = MCMeta.createStringMeta("STD_ALC_RATE_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 標準配賦率情報<br>
	 */
	public static final MCMeta STD_ALC_RATE_SUB_CHAR2 = MCMeta.createStringMeta("STD_ALC_RATE_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 標準配賦率情報<br>
	 */
	public static final MCMeta STD_ALC_RATE_SUB_CHAR3 = MCMeta.createStringMeta("STD_ALC_RATE_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 月次計画<br>
	 */
	public static final MCMeta PLN_RQMT_RMRKS = MCMeta.createStringMeta("PLN_RQMT_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 月次計画<br>
	 */
	public static final MCMeta PLN_RQMT_SUB_CHAR1 = MCMeta.createStringMeta("PLN_RQMT_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 月次計画<br>
	 */
	public static final MCMeta PLN_RQMT_SUB_CHAR2 = MCMeta.createStringMeta("PLN_RQMT_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 月次計画<br>
	 */
	public static final MCMeta PLN_RQMT_SUB_CHAR3 = MCMeta.createStringMeta("PLN_RQMT_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 製造計画<br>
	 */
	public static final MCMeta PLN_MFG_RMRKS = MCMeta.createStringMeta("PLN_MFG_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 製造計画<br>
	 */
	public static final MCMeta PLN_MFG_SUB_CHAR1 = MCMeta.createStringMeta("PLN_MFG_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 製造計画<br>
	 */
	public static final MCMeta PLN_MFG_SUB_CHAR2 = MCMeta.createStringMeta("PLN_MFG_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 製造計画<br>
	 */
	public static final MCMeta PLN_MFG_SUB_CHAR3 = MCMeta.createStringMeta("PLN_MFG_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 購買計画<br>
	 */
	public static final MCMeta PLN_PURC_RMRKS = MCMeta.createStringMeta("PLN_PURC_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 購買計画<br>
	 */
	public static final MCMeta PLN_PURC_SUB_CHAR1 = MCMeta.createStringMeta("PLN_PURC_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 購買計画<br>
	 */
	public static final MCMeta PLN_PURC_SUB_CHAR2 = MCMeta.createStringMeta("PLN_PURC_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 購買計画<br>
	 */
	public static final MCMeta PLN_PURC_SUB_CHAR3 = MCMeta.createStringMeta("PLN_PURC_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 品目工数計画<br>
	 */
	public static final MCMeta PLN_ITM_WK_RMRKS = MCMeta.createStringMeta("PLN_ITM_WK_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 品目工数計画<br>
	 */
	public static final MCMeta PLN_ITM_WK_SUB_CHAR1 = MCMeta.createStringMeta("PLN_ITM_WK_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 品目工数計画<br>
	 */
	public static final MCMeta PLN_ITM_WK_SUB_CHAR2 = MCMeta.createStringMeta("PLN_ITM_WK_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 品目工数計画<br>
	 */
	public static final MCMeta PLN_ITM_WK_SUB_CHAR3 = MCMeta.createStringMeta("PLN_ITM_WK_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 品目外工数計画<br>
	 */
	public static final MCMeta PLN_OTHER_WK_RMRKS = MCMeta.createStringMeta("PLN_OTHER_WK_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 品目外工数計画<br>
	 */
	public static final MCMeta PLN_OTHER_WK_SUB_CHAR1 = MCMeta.createStringMeta("PLN_OTHER_WK_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 品目外工数計画<br>
	 */
	public static final MCMeta PLN_OTHER_WK_SUB_CHAR2 = MCMeta.createStringMeta("PLN_OTHER_WK_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 品目外工数計画<br>
	 */
	public static final MCMeta PLN_OTHER_WK_SUB_CHAR3 = MCMeta.createStringMeta("PLN_OTHER_WK_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 投入計画<br>
	 */
	public static final MCMeta PLN_INPT_RMRKS = MCMeta.createStringMeta("PLN_INPT_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 投入計画<br>
	 */
	public static final MCMeta PLN_INPT_SUB_CHAR1 = MCMeta.createStringMeta("PLN_INPT_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 投入計画<br>
	 */
	public static final MCMeta PLN_INPT_SUB_CHAR2 = MCMeta.createStringMeta("PLN_INPT_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 投入計画<br>
	 */
	public static final MCMeta PLN_INPT_SUB_CHAR3 = MCMeta.createStringMeta("PLN_INPT_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 売上計画<br>
	 */
	public static final MCMeta PLN_SLS_RMRKS = MCMeta.createStringMeta("PLN_SLS_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 売上計画<br>
	 */
	public static final MCMeta PLN_SLS_SUB_CHAR1 = MCMeta.createStringMeta("PLN_SLS_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 売上計画<br>
	 */
	public static final MCMeta PLN_SLS_SUB_CHAR2 = MCMeta.createStringMeta("PLN_SLS_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 売上計画<br>
	 */
	public static final MCMeta PLN_SLS_SUB_CHAR3 = MCMeta.createStringMeta("PLN_SLS_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 品目製造指図情報<br>
	 */
	public static final MCMeta ITM_MFG_INST_RMRKS = MCMeta.createStringMeta("ITM_MFG_INST_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 品目製造指図情報<br>
	 */
	public static final MCMeta ITM_MFG_INST_SUB_CHAR1 = MCMeta.createStringMeta("ITM_MFG_INST_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 品目製造指図情報<br>
	 */
	public static final MCMeta ITM_MFG_INST_SUB_CHAR2 = MCMeta.createStringMeta("ITM_MFG_INST_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 品目製造指図情報<br>
	 */
	public static final MCMeta ITM_MFG_INST_SUB_CHAR3 = MCMeta.createStringMeta("ITM_MFG_INST_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 指図工程情報<br>
	 */
	public static final MCMeta INST_OPER_RMRKS = MCMeta.createStringMeta("INST_OPER_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 指図工程情報<br>
	 */
	public static final MCMeta INST_OPER_SUB_CHAR1 = MCMeta.createStringMeta("INST_OPER_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 指図工程情報<br>
	 */
	public static final MCMeta INST_OPER_SUB_CHAR2 = MCMeta.createStringMeta("INST_OPER_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 指図工程情報<br>
	 */
	public static final MCMeta INST_OPER_SUB_CHAR3 = MCMeta.createStringMeta("INST_OPER_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 製造実績<br>
	 */
	public static final MCMeta ACT_MFG_RMRKS = MCMeta.createStringMeta("ACT_MFG_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 製造実績<br>
	 */
	public static final MCMeta ACT_MFG_SUB_CHAR1 = MCMeta.createStringMeta("ACT_MFG_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 製造実績<br>
	 */
	public static final MCMeta ACT_MFG_SUB_CHAR2 = MCMeta.createStringMeta("ACT_MFG_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 製造実績<br>
	 */
	public static final MCMeta ACT_MFG_SUB_CHAR3 = MCMeta.createStringMeta("ACT_MFG_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 購買実績<br>
	 */
	public static final MCMeta ACT_PURC_RMRKS = MCMeta.createStringMeta("ACT_PURC_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 購買実績<br>
	 */
	public static final MCMeta ACT_PURC_SUB_CHAR1 = MCMeta.createStringMeta("ACT_PURC_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 購買実績<br>
	 */
	public static final MCMeta ACT_PURC_SUB_CHAR2 = MCMeta.createStringMeta("ACT_PURC_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 購買実績<br>
	 */
	public static final MCMeta ACT_PURC_SUB_CHAR3 = MCMeta.createStringMeta("ACT_PURC_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 投入実績<br>
	 */
	public static final MCMeta ACT_INPT_RMRKS = MCMeta.createStringMeta("ACT_INPT_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 投入実績<br>
	 */
	public static final MCMeta ACT_INPT_SUB_CHAR1 = MCMeta.createStringMeta("ACT_INPT_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 投入実績<br>
	 */
	public static final MCMeta ACT_INPT_SUB_CHAR2 = MCMeta.createStringMeta("ACT_INPT_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 投入実績<br>
	 */
	public static final MCMeta ACT_INPT_SUB_CHAR3 = MCMeta.createStringMeta("ACT_INPT_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 指図工数実績<br>
	 */
	public static final MCMeta ACT_INST_WK_RMRKS = MCMeta.createStringMeta("ACT_INST_WK_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 指図工数実績<br>
	 */
	public static final MCMeta ACT_INST_WK_SUB_CHAR1 = MCMeta.createStringMeta("ACT_INST_WK_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 指図工数実績<br>
	 */
	public static final MCMeta ACT_INST_WK_SUB_CHAR2 = MCMeta.createStringMeta("ACT_INST_WK_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 指図工数実績<br>
	 */
	public static final MCMeta ACT_INST_WK_SUB_CHAR3 = MCMeta.createStringMeta("ACT_INST_WK_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 指図外工数実績<br>
	 */
	public static final MCMeta ACT_OTHER_WK_RMRKS = MCMeta.createStringMeta("ACT_OTHER_WK_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 指図外工数実績<br>
	 */
	public static final MCMeta ACT_OTHER_WK_SUB_CHAR1 = MCMeta.createStringMeta("ACT_OTHER_WK_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 指図外工数実績<br>
	 */
	public static final MCMeta ACT_OTHER_WK_SUB_CHAR2 = MCMeta.createStringMeta("ACT_OTHER_WK_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 指図外工数実績<br>
	 */
	public static final MCMeta ACT_OTHER_WK_SUB_CHAR3 = MCMeta.createStringMeta("ACT_OTHER_WK_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 指図仕掛実績<br>
	 */
	public static final MCMeta ACT_INST_WIP_RMRKS = MCMeta.createStringMeta("ACT_INST_WIP_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 指図仕掛実績<br>
	 */
	public static final MCMeta ACT_INST_WIP_SUB_CHAR1 = MCMeta.createStringMeta("ACT_INST_WIP_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 指図仕掛実績<br>
	 */
	public static final MCMeta ACT_INST_WIP_SUB_CHAR2 = MCMeta.createStringMeta("ACT_INST_WIP_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 指図仕掛実績<br>
	 */
	public static final MCMeta ACT_INST_WIP_SUB_CHAR3 = MCMeta.createStringMeta("ACT_INST_WIP_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 入出庫実績<br>
	 */
	public static final MCMeta ACT_IO_RMRKS = MCMeta.createStringMeta("ACT_IO_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 入出庫実績<br>
	 */
	public static final MCMeta ACT_IO_SUB_CHAR1 = MCMeta.createStringMeta("ACT_IO_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 入出庫実績<br>
	 */
	public static final MCMeta ACT_IO_SUB_CHAR2 = MCMeta.createStringMeta("ACT_IO_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 入出庫実績<br>
	 */
	public static final MCMeta ACT_IO_SUB_CHAR3 = MCMeta.createStringMeta("ACT_IO_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 売上実績<br>
	 */
	public static final MCMeta ACT_SLS_RMRKS = MCMeta.createStringMeta("ACT_SLS_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 売上実績<br>
	 */
	public static final MCMeta ACT_SLS_SUB_CHAR1 = MCMeta.createStringMeta("ACT_SLS_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 売上実績<br>
	 */
	public static final MCMeta ACT_SLS_SUB_CHAR2 = MCMeta.createStringMeta("ACT_SLS_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 売上実績<br>
	 */
	public static final MCMeta ACT_SLS_SUB_CHAR3 = MCMeta.createStringMeta("ACT_SLS_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 在庫実績<br>
	 */
	public static final MCMeta ACT_STK_RMRKS = MCMeta.createStringMeta("ACT_STK_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 在庫実績<br>
	 */
	public static final MCMeta ACT_STK_SUB_CHAR1 = MCMeta.createStringMeta("ACT_STK_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 在庫実績<br>
	 */
	public static final MCMeta ACT_STK_SUB_CHAR2 = MCMeta.createStringMeta("ACT_STK_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 在庫実績<br>
	 */
	public static final MCMeta ACT_STK_SUB_CHAR3 = MCMeta.createStringMeta("ACT_STK_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 汎用配賦対象情報<br>
	 */
	public static final MCMeta GP_ALC_RMRKS = MCMeta.createStringMeta("GP_ALC_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 汎用配賦対象情報<br>
	 */
	public static final MCMeta GP_ALC_SUB_CHAR1 = MCMeta.createStringMeta("GP_ALC_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 汎用配賦対象情報<br>
	 */
	public static final MCMeta GP_ALC_SUB_CHAR2 = MCMeta.createStringMeta("GP_ALC_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 汎用配賦対象情報<br>
	 */
	public static final MCMeta GP_ALC_SUB_CHAR3 = MCMeta.createStringMeta("GP_ALC_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 月初在庫数<br>
	 */
	public static final MCMeta ST_STK_RMRKS = MCMeta.createStringMeta("ST_STK_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 月初在庫数<br>
	 */
	public static final MCMeta ST_STK_SUB_CHAR1 = MCMeta.createStringMeta("ST_STK_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 月初在庫数<br>
	 */
	public static final MCMeta ST_STK_SUB_CHAR2 = MCMeta.createStringMeta("ST_STK_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 月初在庫数<br>
	 */
	public static final MCMeta ST_STK_SUB_CHAR3 = MCMeta.createStringMeta("ST_STK_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 月初仕掛数<br>
	 */
	public static final MCMeta ST_WIP_RMRKS = MCMeta.createStringMeta("ST_WIP_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 月初仕掛数<br>
	 */
	public static final MCMeta ST_WIP_SUB_CHAR1 = MCMeta.createStringMeta("ST_WIP_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 月初仕掛数<br>
	 */
	public static final MCMeta ST_WIP_SUB_CHAR2 = MCMeta.createStringMeta("ST_WIP_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 月初仕掛数<br>
	 */
	public static final MCMeta ST_WIP_SUB_CHAR3 = MCMeta.createStringMeta("ST_WIP_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 月末在庫評価<br>
	 */
	public static final MCMeta STK_EVAL_RMRKS = MCMeta.createStringMeta("STK_EVAL_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 月末在庫評価<br>
	 */
	public static final MCMeta STK_EVAL_SUB_CHAR1 = MCMeta.createStringMeta("STK_EVAL_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 月末在庫評価<br>
	 */
	public static final MCMeta STK_EVAL_SUB_CHAR2 = MCMeta.createStringMeta("STK_EVAL_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 月末在庫評価<br>
	 */
	public static final MCMeta STK_EVAL_SUB_CHAR3 = MCMeta.createStringMeta("STK_EVAL_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 製造実績ＩＦ<br>
	 */
	public static final MCMeta ACT_MFG_IF_RMRKS = MCMeta.createStringMeta("ACT_MFG_IF_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 製造実績ＩＦ<br>
	 */
	public static final MCMeta ACT_MFG_IF_SUB_CHAR1 = MCMeta.createStringMeta("ACT_MFG_IF_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 製造実績ＩＦ<br>
	 */
	public static final MCMeta ACT_MFG_IF_SUB_CHAR2 = MCMeta.createStringMeta("ACT_MFG_IF_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 製造実績ＩＦ<br>
	 */
	public static final MCMeta ACT_MFG_IF_SUB_CHAR3 = MCMeta.createStringMeta("ACT_MFG_IF_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 購買実績ＩＦ<br>
	 */
	public static final MCMeta ACT_PURC_IF_RMRKS = MCMeta.createStringMeta("ACT_PURC_IF_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 購買実績ＩＦ<br>
	 */
	public static final MCMeta ACT_PURC_IF_SUB_CHAR1 = MCMeta.createStringMeta("ACT_PURC_IF_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 購買実績ＩＦ<br>
	 */
	public static final MCMeta ACT_PURC_IF_SUB_CHAR2 = MCMeta.createStringMeta("ACT_PURC_IF_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 購買実績ＩＦ<br>
	 */
	public static final MCMeta ACT_PURC_IF_SUB_CHAR3 = MCMeta.createStringMeta("ACT_PURC_IF_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 投入実績ＩＦ<br>
	 */
	public static final MCMeta ACT_INPT_IF_RMRKS = MCMeta.createStringMeta("ACT_INPT_IF_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 投入実績ＩＦ<br>
	 */
	public static final MCMeta ACT_INPT_IF_SUB_CHAR1 = MCMeta.createStringMeta("ACT_INPT_IF_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 投入実績ＩＦ<br>
	 */
	public static final MCMeta ACT_INPT_IF_SUB_CHAR2 = MCMeta.createStringMeta("ACT_INPT_IF_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 投入実績ＩＦ<br>
	 */
	public static final MCMeta ACT_INPT_IF_SUB_CHAR3 = MCMeta.createStringMeta("ACT_INPT_IF_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 指図工数実績ＩＦ<br>
	 */
	public static final MCMeta ACT_INST_WK_IF_RMRKS = MCMeta.createStringMeta("ACT_INST_WK_IF_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 指図工数実績ＩＦ<br>
	 */
	public static final MCMeta ACT_INST_WK_IF_SUB_CHAR1 = MCMeta.createStringMeta("ACT_INST_WK_IF_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 指図工数実績ＩＦ<br>
	 */
	public static final MCMeta ACT_INST_WK_IF_SUB_CHAR2 = MCMeta.createStringMeta("ACT_INST_WK_IF_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 指図工数実績ＩＦ<br>
	 */
	public static final MCMeta ACT_INST_WK_IF_SUB_CHAR3 = MCMeta.createStringMeta("ACT_INST_WK_IF_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 指図外工数実績ＩＦ<br>
	 */
	public static final MCMeta ACT_OTHER_WK_IF_RMRKS = MCMeta.createStringMeta("ACT_OTHER_WK_IF_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 指図外工数実績ＩＦ<br>
	 */
	public static final MCMeta ACT_OTHER_WK_IF_SUB_CHAR1 = MCMeta.createStringMeta("ACT_OTHER_WK_IF_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 指図外工数実績ＩＦ<br>
	 */
	public static final MCMeta ACT_OTHER_WK_IF_SUB_CHAR2 = MCMeta.createStringMeta("ACT_OTHER_WK_IF_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 指図外工数実績ＩＦ<br>
	 */
	public static final MCMeta ACT_OTHER_WK_IF_SUB_CHAR3 = MCMeta.createStringMeta("ACT_OTHER_WK_IF_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 指図仕掛実績ＩＦ<br>
	 */
	public static final MCMeta ACT_INST_WIP_IF_RMRKS = MCMeta.createStringMeta("ACT_INST_WIP_IF_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 指図仕掛実績ＩＦ<br>
	 */
	public static final MCMeta ACT_INST_WIP_IF_SUB_CHAR1 = MCMeta.createStringMeta("ACT_INST_WIP_IF_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 指図仕掛実績ＩＦ<br>
	 */
	public static final MCMeta ACT_INST_WIP_IF_SUB_CHAR2 = MCMeta.createStringMeta("ACT_INST_WIP_IF_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 指図仕掛実績ＩＦ<br>
	 */
	public static final MCMeta ACT_INST_WIP_IF_SUB_CHAR3 = MCMeta.createStringMeta("ACT_INST_WIP_IF_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 入出庫実績ＩＦ<br>
	 */
	public static final MCMeta ACT_IO_IF_RMRKS = MCMeta.createStringMeta("ACT_IO_IF_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 入出庫実績ＩＦ<br>
	 */
	public static final MCMeta ACT_IO_IF_SUB_CHAR1 = MCMeta.createStringMeta("ACT_IO_IF_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 入出庫実績ＩＦ<br>
	 */
	public static final MCMeta ACT_IO_IF_SUB_CHAR2 = MCMeta.createStringMeta("ACT_IO_IF_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 入出庫実績ＩＦ<br>
	 */
	public static final MCMeta ACT_IO_IF_SUB_CHAR3 = MCMeta.createStringMeta("ACT_IO_IF_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 売上実績ＩＦ<br>
	 */
	public static final MCMeta ACT_SLS_IF_RMRKS = MCMeta.createStringMeta("ACT_SLS_IF_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 売上実績ＩＦ<br>
	 */
	public static final MCMeta ACT_SLS_IF_SUB_CHAR1 = MCMeta.createStringMeta("ACT_SLS_IF_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 売上実績ＩＦ<br>
	 */
	public static final MCMeta ACT_SLS_IF_SUB_CHAR2 = MCMeta.createStringMeta("ACT_SLS_IF_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 売上実績ＩＦ<br>
	 */
	public static final MCMeta ACT_SLS_IF_SUB_CHAR3 = MCMeta.createStringMeta("ACT_SLS_IF_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 在庫実績ＩＦ<br>
	 */
	public static final MCMeta ACT_STK_IF_RMRKS = MCMeta.createStringMeta("ACT_STK_IF_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 在庫実績ＩＦ<br>
	 */
	public static final MCMeta ACT_STK_IF_SUB_CHAR1 = MCMeta.createStringMeta("ACT_STK_IF_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 在庫実績ＩＦ<br>
	 */
	public static final MCMeta ACT_STK_IF_SUB_CHAR2 = MCMeta.createStringMeta("ACT_STK_IF_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 在庫実績ＩＦ<br>
	 */
	public static final MCMeta ACT_STK_IF_SUB_CHAR3 = MCMeta.createStringMeta("ACT_STK_IF_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 一次配賦期間比率<br>
	 */
	public static final MCMeta PRE_RATE_TERM_RMRKS = MCMeta.createStringMeta("PRE_RATE_TERM_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 一次配賦期間比率<br>
	 */
	public static final MCMeta PRE_RATE_TERM_SUB_CHAR1 = MCMeta.createStringMeta("PRE_RATE_TERM_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 一次配賦期間比率<br>
	 */
	public static final MCMeta PRE_RATE_TERM_SUB_CHAR2 = MCMeta.createStringMeta("PRE_RATE_TERM_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 一次配賦期間比率<br>
	 */
	public static final MCMeta PRE_RATE_TERM_SUB_CHAR3 = MCMeta.createStringMeta("PRE_RATE_TERM_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 一次配賦月次比率<br>
	 */
	public static final MCMeta PRE_RATE_MLY_RMRKS = MCMeta.createStringMeta("PRE_RATE_MLY_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 一次配賦月次比率<br>
	 */
	public static final MCMeta PRE_RATE_MLY_SUB_CHAR1 = MCMeta.createStringMeta("PRE_RATE_MLY_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 一次配賦月次比率<br>
	 */
	public static final MCMeta PRE_RATE_MLY_SUB_CHAR2 = MCMeta.createStringMeta("PRE_RATE_MLY_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 一次配賦月次比率<br>
	 */
	public static final MCMeta PRE_RATE_MLY_SUB_CHAR3 = MCMeta.createStringMeta("PRE_RATE_MLY_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 予定配賦率<br>
	 */
	public static final MCMeta ALC_RATE_RMRKS = MCMeta.createStringMeta("ALC_RATE_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 予定配賦率<br>
	 */
	public static final MCMeta ALC_RATE_SUB_CHAR1 = MCMeta.createStringMeta("ALC_RATE_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 予定配賦率<br>
	 */
	public static final MCMeta ALC_RATE_SUB_CHAR2 = MCMeta.createStringMeta("ALC_RATE_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 予定配賦率<br>
	 */
	public static final MCMeta ALC_RATE_SUB_CHAR3 = MCMeta.createStringMeta("ALC_RATE_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 配賦費用実績<br>
	 */
	public static final MCMeta ACT_ALC_AMT_RMRKS = MCMeta.createStringMeta("ACT_ALC_AMT_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 配賦費用実績<br>
	 */
	public static final MCMeta ACT_ALC_AMT_SUB_CHAR1 = MCMeta.createStringMeta("ACT_ALC_AMT_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 配賦費用実績<br>
	 */
	public static final MCMeta ACT_ALC_AMT_SUB_CHAR2 = MCMeta.createStringMeta("ACT_ALC_AMT_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 配賦費用実績<br>
	 */
	public static final MCMeta ACT_ALC_AMT_SUB_CHAR3 = MCMeta.createStringMeta("ACT_ALC_AMT_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 配賦費用計画<br>
	 */
	public static final MCMeta PLN_ALC_AMT_RMRKS = MCMeta.createStringMeta("PLN_ALC_AMT_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 配賦費用計画<br>
	 */
	public static final MCMeta PLN_ALC_AMT_SUB_CHAR1 = MCMeta.createStringMeta("PLN_ALC_AMT_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 配賦費用計画<br>
	 */
	public static final MCMeta PLN_ALC_AMT_SUB_CHAR2 = MCMeta.createStringMeta("PLN_ALC_AMT_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 配賦費用計画<br>
	 */
	public static final MCMeta PLN_ALC_AMT_SUB_CHAR3 = MCMeta.createStringMeta("PLN_ALC_AMT_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象原価計算パラメータ情報<br>
	 */
	public static final MCMeta CALC_PARM_RMRKS = MCMeta.createStringMeta("CALC_PARM_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象原価計算パラメータ情報<br>
	 */
	public static final MCMeta CALC_PARM_SUB_CHAR1 = MCMeta.createStringMeta("CALC_PARM_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象原価計算パラメータ情報<br>
	 */
	public static final MCMeta CALC_PARM_SUB_CHAR2 = MCMeta.createStringMeta("CALC_PARM_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象原価計算パラメータ情報<br>
	 */
	public static final MCMeta CALC_PARM_SUB_CHAR3 = MCMeta.createStringMeta("CALC_PARM_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目情報<br>
	 */
	public static final MCMeta CALC_ITM_RMRKS = MCMeta.createStringMeta("CALC_ITM_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目情報<br>
	 */
	public static final MCMeta CALC_ITM_SUB_CHAR1 = MCMeta.createStringMeta("CALC_ITM_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目情報<br>
	 */
	public static final MCMeta CALC_ITM_SUB_CHAR2 = MCMeta.createStringMeta("CALC_ITM_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目情報<br>
	 */
	public static final MCMeta CALC_ITM_SUB_CHAR3 = MCMeta.createStringMeta("CALC_ITM_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目詳細情報<br>
	 */
	public static final MCMeta CALC_ITM_DTL_RMRKS = MCMeta.createStringMeta("CALC_ITM_DTL_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目詳細情報<br>
	 */
	public static final MCMeta CALC_ITM_DTL_SUB_CHAR1 = MCMeta.createStringMeta("CALC_ITM_DTL_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目詳細情報<br>
	 */
	public static final MCMeta CALC_ITM_DTL_SUB_CHAR2 = MCMeta.createStringMeta("CALC_ITM_DTL_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目詳細情報<br>
	 */
	public static final MCMeta CALC_ITM_DTL_SUB_CHAR3 = MCMeta.createStringMeta("CALC_ITM_DTL_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目工程情報<br>
	 */
	public static final MCMeta CALC_ITM_OPER_RMRKS = MCMeta.createStringMeta("CALC_ITM_OPER_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目工程情報<br>
	 */
	public static final MCMeta CALC_ITM_OPER_SUB_CHAR1 = MCMeta.createStringMeta("CALC_ITM_OPER_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目工程情報<br>
	 */
	public static final MCMeta CALC_ITM_OPER_SUB_CHAR2 = MCMeta.createStringMeta("CALC_ITM_OPER_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目工程情報<br>
	 */
	public static final MCMeta CALC_ITM_OPER_SUB_CHAR3 = MCMeta.createStringMeta("CALC_ITM_OPER_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象ＢＯＭ情報<br>
	 */
	public static final MCMeta CALC_BOM_RMRKS = MCMeta.createStringMeta("CALC_BOM_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象ＢＯＭ情報<br>
	 */
	public static final MCMeta CALC_BOM_SUB_CHAR1 = MCMeta.createStringMeta("CALC_BOM_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象ＢＯＭ情報<br>
	 */
	public static final MCMeta CALC_BOM_SUB_CHAR2 = MCMeta.createStringMeta("CALC_BOM_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象ＢＯＭ情報<br>
	 */
	public static final MCMeta CALC_BOM_SUB_CHAR3 = MCMeta.createStringMeta("CALC_BOM_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目工数情報<br>
	 */
	public static final MCMeta CALC_ITM_WK_RMRKS = MCMeta.createStringMeta("CALC_ITM_WK_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目工数情報<br>
	 */
	public static final MCMeta CALC_ITM_WK_SUB_CHAR1 = MCMeta.createStringMeta("CALC_ITM_WK_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目工数情報<br>
	 */
	public static final MCMeta CALC_ITM_WK_SUB_CHAR2 = MCMeta.createStringMeta("CALC_ITM_WK_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目工数情報<br>
	 */
	public static final MCMeta CALC_ITM_WK_SUB_CHAR3 = MCMeta.createStringMeta("CALC_ITM_WK_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目購買単価情報<br>
	 */
	public static final MCMeta CALC_ITM_PURC_RMRKS = MCMeta.createStringMeta("CALC_ITM_PURC_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目購買単価情報<br>
	 */
	public static final MCMeta CALC_ITM_PURC_SUB_CHAR1 = MCMeta.createStringMeta("CALC_ITM_PURC_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目購買単価情報<br>
	 */
	public static final MCMeta CALC_ITM_PURC_SUB_CHAR2 = MCMeta.createStringMeta("CALC_ITM_PURC_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目購買単価情報<br>
	 */
	public static final MCMeta CALC_ITM_PURC_SUB_CHAR3 = MCMeta.createStringMeta("CALC_ITM_PURC_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目加工単価情報<br>
	 */
	public static final MCMeta CALC_ITM_PROC_RMRKS = MCMeta.createStringMeta("CALC_ITM_PROC_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目加工単価情報<br>
	 */
	public static final MCMeta CALC_ITM_PROC_SUB_CHAR1 = MCMeta.createStringMeta("CALC_ITM_PROC_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目加工単価情報<br>
	 */
	public static final MCMeta CALC_ITM_PROC_SUB_CHAR2 = MCMeta.createStringMeta("CALC_ITM_PROC_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目加工単価情報<br>
	 */
	public static final MCMeta CALC_ITM_PROC_SUB_CHAR3 = MCMeta.createStringMeta("CALC_ITM_PROC_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目支給単価情報<br>
	 */
	public static final MCMeta CALC_ITM_PROV_RMRKS = MCMeta.createStringMeta("CALC_ITM_PROV_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目支給単価情報<br>
	 */
	public static final MCMeta CALC_ITM_PROV_SUB_CHAR1 = MCMeta.createStringMeta("CALC_ITM_PROV_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目支給単価情報<br>
	 */
	public static final MCMeta CALC_ITM_PROV_SUB_CHAR2 = MCMeta.createStringMeta("CALC_ITM_PROV_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目支給単価情報<br>
	 */
	public static final MCMeta CALC_ITM_PROV_SUB_CHAR3 = MCMeta.createStringMeta("CALC_ITM_PROV_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目販売単価情報<br>
	 */
	public static final MCMeta CALC_ITM_SLS_RMRKS = MCMeta.createStringMeta("CALC_ITM_SLS_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目販売単価情報<br>
	 */
	public static final MCMeta CALC_ITM_SLS_SUB_CHAR1 = MCMeta.createStringMeta("CALC_ITM_SLS_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目販売単価情報<br>
	 */
	public static final MCMeta CALC_ITM_SLS_SUB_CHAR2 = MCMeta.createStringMeta("CALC_ITM_SLS_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目販売単価情報<br>
	 */
	public static final MCMeta CALC_ITM_SLS_SUB_CHAR3 = MCMeta.createStringMeta("CALC_ITM_SLS_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目指値情報<br>
	 */
	public static final MCMeta CALC_ITM_FIX_RMRKS = MCMeta.createStringMeta("CALC_ITM_FIX_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目指値情報<br>
	 */
	public static final MCMeta CALC_ITM_FIX_SUB_CHAR1 = MCMeta.createStringMeta("CALC_ITM_FIX_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目指値情報<br>
	 */
	public static final MCMeta CALC_ITM_FIX_SUB_CHAR2 = MCMeta.createStringMeta("CALC_ITM_FIX_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算対象品目指値情報<br>
	 */
	public static final MCMeta CALC_ITM_FIX_SUB_CHAR3 = MCMeta.createStringMeta("CALC_ITM_FIX_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 標準確定品目詳細ワーク<br>
	 */
	public static final MCMeta FIX_ITM_DTL_RMRKS = MCMeta.createStringMeta("FIX_ITM_DTL_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 標準確定品目詳細ワーク<br>
	 */
	public static final MCMeta FIX_ITM_DTL_SUB_CHAR1 = MCMeta.createStringMeta("FIX_ITM_DTL_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 標準確定品目詳細ワーク<br>
	 */
	public static final MCMeta FIX_ITM_DTL_SUB_CHAR2 = MCMeta.createStringMeta("FIX_ITM_DTL_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 標準確定品目詳細ワーク<br>
	 */
	public static final MCMeta FIX_ITM_DTL_SUB_CHAR3 = MCMeta.createStringMeta("FIX_ITM_DTL_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>30</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価計算設定情報<br>
	 */
	public static final MCMeta CALC_ARG_RMRKS = MCMeta.createStringMeta("CALC_ARG_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価計算設定情報<br>
	 */
	public static final MCMeta CALC_ARG_SUB_CHAR1 = MCMeta.createStringMeta("CALC_ARG_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価計算設定情報<br>
	 */
	public static final MCMeta CALC_ARG_SUB_CHAR2 = MCMeta.createStringMeta("CALC_ARG_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価計算設定情報<br>
	 */
	public static final MCMeta CALC_ARG_SUB_CHAR3 = MCMeta.createStringMeta("CALC_ARG_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算実行パタン構成<br>
	 */
	public static final MCMeta ACT_PTN_CONFIG_RMRKS = MCMeta.createStringMeta("ACT_PTN_CONFIG_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算実行パタン構成<br>
	 */
	public static final MCMeta ACT_PTN_CONFIG_SUB_CHAR1 = MCMeta.createStringMeta("ACT_PTN_CONFIG_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算実行パタン構成<br>
	 */
	public static final MCMeta ACT_PTN_CONFIG_SUB_CHAR2 = MCMeta.createStringMeta("ACT_PTN_CONFIG_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 計算実行パタン構成<br>
	 */
	public static final MCMeta ACT_PTN_CONFIG_SUB_CHAR3 = MCMeta.createStringMeta("ACT_PTN_CONFIG_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 処理対象外バッチ情報<br>
	 */
	public static final MCMeta BATCH_OUT_RMRKS = MCMeta.createStringMeta("BATCH_OUT_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 処理対象外バッチ情報<br>
	 */
	public static final MCMeta BATCH_OUT_SUB_CHAR1 = MCMeta.createStringMeta("BATCH_OUT_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 処理対象外バッチ情報<br>
	 */
	public static final MCMeta BATCH_OUT_SUB_CHAR2 = MCMeta.createStringMeta("BATCH_OUT_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 処理対象外バッチ情報<br>
	 */
	public static final MCMeta BATCH_OUT_SUB_CHAR3 = MCMeta.createStringMeta("BATCH_OUT_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価計算パラメータ<br>
	 */
	public static final MCMeta PARM_RMRKS = MCMeta.createStringMeta("PARM_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価計算パラメータ<br>
	 */
	public static final MCMeta PARM_SUB_CHAR1 = MCMeta.createStringMeta("PARM_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価計算パラメータ<br>
	 */
	public static final MCMeta PARM_SUB_CHAR2 = MCMeta.createStringMeta("PARM_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価計算パラメータ<br>
	 */
	public static final MCMeta PARM_SUB_CHAR3 = MCMeta.createStringMeta("PARM_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価計算パラメータ<br>
	 */
	public static final MCMeta PARM_REMARK_RMRKS = MCMeta.createStringMeta("PARM_REMARK_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価計算パラメータ<br>
	 */
	public static final MCMeta PARM_REMARK_SUB_CHAR1 = MCMeta.createStringMeta("PARM_REMARK_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価計算パラメータ<br>
	 */
	public static final MCMeta PARM_REMARK_SUB_CHAR2 = MCMeta.createStringMeta("PARM_REMARK_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価計算パラメータ<br>
	 */
	public static final MCMeta PARM_REMARK_SUB_CHAR3 = MCMeta.createStringMeta("PARM_REMARK_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価計算任意チェック<br>
	 */
	public static final MCMeta CALC_CHK_RMRKS = MCMeta.createStringMeta("CALC_CHK_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価計算任意チェック<br>
	 */
	public static final MCMeta CALC_CHK_SUB_CHAR1 = MCMeta.createStringMeta("CALC_CHK_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価計算任意チェック<br>
	 */
	public static final MCMeta CALC_CHK_SUB_CHAR2 = MCMeta.createStringMeta("CALC_CHK_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価計算任意チェック<br>
	 */
	public static final MCMeta CALC_CHK_SUB_CHAR3 = MCMeta.createStringMeta("CALC_CHK_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価為替レート<br>
	 */
	public static final MCMeta CUR_XRATE_RMRKS = MCMeta.createStringMeta("CUR_XRATE_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価為替レート<br>
	 */
	public static final MCMeta CUR_XRATE_SUB_CHAR1 = MCMeta.createStringMeta("CUR_XRATE_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価為替レート<br>
	 */
	public static final MCMeta CUR_XRATE_SUB_CHAR2 = MCMeta.createStringMeta("CUR_XRATE_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 原価為替レート<br>
	 */
	public static final MCMeta CUR_XRATE_SUB_CHAR3 = MCMeta.createStringMeta("CUR_XRATE_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 配賦費用実績ＩＦ<br>
	 */
	public static final MCMeta ACT_ALC_AMT_IF_RMRKS = MCMeta.createStringMeta("ACT_ALC_AMT_IF_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 配賦費用実績ＩＦ<br>
	 */
	public static final MCMeta ACT_ALC_AMT_IF_SUB_CHAR1 = MCMeta.createStringMeta("ACT_ALC_AMT_IF_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 配賦費用実績ＩＦ<br>
	 */
	public static final MCMeta ACT_ALC_AMT_IF_SUB_CHAR2 = MCMeta.createStringMeta("ACT_ALC_AMT_IF_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 配賦費用実績ＩＦ<br>
	 */
	public static final MCMeta ACT_ALC_AMT_IF_SUB_CHAR3 = MCMeta.createStringMeta("ACT_ALC_AMT_IF_SUB_CHAR3", "", 20);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 配賦費用計画ＩＦ<br>
	 */
	public static final MCMeta PLN_ALC_AMT_IF_RMRKS = MCMeta.createStringMeta("PLN_ALC_AMT_IF_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 配賦費用計画ＩＦ<br>
	 */
	public static final MCMeta PLN_ALC_AMT_IF_SUB_CHAR1 = MCMeta.createStringMeta("PLN_ALC_AMT_IF_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 配賦費用計画ＩＦ<br>
	 */
	public static final MCMeta PLN_ALC_AMT_IF_SUB_CHAR2 = MCMeta.createStringMeta("PLN_ALC_AMT_IF_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 配賦費用計画ＩＦ<br>
	 */
	public static final MCMeta PLN_ALC_AMT_IF_SUB_CHAR3 = MCMeta.createStringMeta("PLN_ALC_AMT_IF_SUB_CHAR3", "", 20);

	/**
	 * パラメータ概要.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>4000</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PARM_REMARK = MCMeta.createStringMeta("PARM_REMARK", "", 4000);

	/**
	 * 業務分類.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PARM_BIZ_GRP = MCMeta.createStringMeta("PARM_BIZ_GRP", "", 100);

	/**
	 * 結合品目文字列.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>60</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 品目ＣＤ+区切り文字+枝番１+区切り文字+枝番２+区切り文字+枝番３の桁数<br>
	 */
	public static final MCMeta CONCAT_ITM = MCMeta.createStringMeta("CONCAT_ITM", "", 60);

	/**
	 * 結合品目製造指図文字列.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>90</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 品目ＣＤ+区切り文字+枝番１+区切り文字+枝番２+区切り文字+枝番３+区切り文字+品目製造指図ＮＯ+区切り文字+製造実績ＮＯの桁数<br>
	 */
	public static final MCMeta CONCAT_ITM_MFG_INST = MCMeta.createStringMeta("CONCAT_ITM_MFG_INST", "", 90);

	/**
	 * 結合品目工程実績文字列.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>106</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 品目ＣＤ+区切り文字+枝番１+区切り文字+枝番２+区切り文字+枝番３+区切り文字+品目製造指図ＮＯ+区切り文字+製造実績ＮＯ+区切り文字+工程実績ＮＯの桁数<br>
	 */
	public static final MCMeta CONCAT_OPER_ACT = MCMeta.createStringMeta("CONCAT_OPER_ACT", "", 106);

	/**
	 * 受払区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>5</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IO_ACT_TYP = MCMeta.createStringMeta("IO_ACT_TYP", "", 5);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 滞留在庫情報<br>
	 */
	public static final MCMeta NON_MOV_RMRKS = MCMeta.createStringMeta("NON_MOV_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 滞留在庫情報<br>
	 */
	public static final MCMeta NON_MOV_SUB_CHAR1 = MCMeta.createStringMeta("NON_MOV_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 滞留在庫情報<br>
	 */
	public static final MCMeta NON_MOV_SUB_CHAR2 = MCMeta.createStringMeta("NON_MOV_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 滞留在庫情報<br>
	 */
	public static final MCMeta NON_MOV_SUB_CHAR3 = MCMeta.createStringMeta("NON_MOV_SUB_CHAR3", "", 20);

	/**
	 * 製造実績グループ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta MFG_ACT_GRP = MCMeta.createStringMeta("MFG_ACT_GRP", "", 100);

	/**
	 * 買戻義務区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta REPURC_OBLI_TYP = MCMeta.createStringMeta("REPURC_OBLI_TYP", "", 1);

	/**
	 * 買戻義務区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta REPURC_OBLI_TYP_NM = MCMeta.createStringMeta("REPURC_OBLI_TYP_NM", "");

	/**
	 * 原価受払区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>3</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 受払実績受信ＩＦ<br>
	 */
	public static final MCMeta COST_IO_ACT_TYP = MCMeta.createStringMeta("COST_IO_ACT_TYP", "", 3);

	/**
	 * 備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 * <br>
	 * 受払実績受信ＩＦ<br>
	 */
	public static final MCMeta COST_IO_RMRKS = MCMeta.createStringMeta("COST_IO_RMRKS", "", 100);

	/**
	 * 予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 受払実績受信ＩＦ<br>
	 */
	public static final MCMeta COST_IO_SUB_CHAR1 = MCMeta.createStringMeta("COST_IO_SUB_CHAR1", "", 20);

	/**
	 * 予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 受払実績受信ＩＦ<br>
	 */
	public static final MCMeta COST_IO_SUB_CHAR2 = MCMeta.createStringMeta("COST_IO_SUB_CHAR2", "", 20);

	/**
	 * 予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 受払実績受信ＩＦ<br>
	 */
	public static final MCMeta COST_IO_SUB_CHAR3 = MCMeta.createStringMeta("COST_IO_SUB_CHAR3", "", 20);

}

