package mcframe.commonMA.meta;

import mcframe.commonCore.meta.MCMeta;

/**
 * 共有項目メタの定義クラスです。
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
abstract public class MA_META_PJ_A extends mcframe.commonMA.meta.MA_META_MC_A{
	/**
	 * 市場ＣＤ.<p>
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
	public static final MCMeta MRKT_CD = MCMeta.createStringMeta("MRKT_CD", "", 2);

	/**
	 * 市場名.<p>
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
	 */
	public static final MCMeta MRKT_NM = MCMeta.createStringMeta("MRKT_NM", "", 60);

	/**
	 * 小計グループ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>13</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SUBTTL_GRP = MCMeta.createStringMeta("SUBTTL_GRP", "", 13);

	/**
	 * 小計グループ名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>13</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SUBTTL_GRP_NM = MCMeta.createStringMeta("SUBTTL_GRP_NM", "", 13);

	/**
	 * 国別符号.<p>
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
	public static final MCMeta CNTRY_SIGN = MCMeta.createStringMeta("CNTRY_SIGN", "", 3);

	/**
	 * フリガナ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>60</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta FURIGANA = MCMeta.createStringMeta("FURIGANA", "", 60);

	/**
	 * 工事番号区分.<p>
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
	public static final MCMeta CNSTR_NO_TYP = MCMeta.createStringMeta("CNSTR_NO_TYP", "", 1);

	/**
	 * 工事番号区分名.<p>
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
	public static final MCMeta CNSTR_NO_TYP_NM = MCMeta.createStringMeta("CNSTR_NO_TYP_NM", "");

	/**
	 * 工事番号.<p>
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
	public static final MCMeta CNSTR_NO = MCMeta.createStringMeta("CNSTR_NO", "", 15);

	/**
	 * 工事理由区分.<p>
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
	public static final MCMeta CNSTR_RSN_TYP = MCMeta.createStringMeta("CNSTR_RSN_TYP", "", 2);

	/**
	 * 工事理由区分名.<p>
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
	public static final MCMeta CNSTR_RSN_TYP_NM = MCMeta.createStringMeta("CNSTR_RSN_TYP_NM", "");

	/**
	 * 工事完了区分.<p>
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
	public static final MCMeta CNSTR_CMPL_TYP = MCMeta.createStringMeta("CNSTR_CMPL_TYP", "", 1);

	/**
	 * 工事完了区分名.<p>
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
	public static final MCMeta CNSTR_CMPL_TYP_NM = MCMeta.createStringMeta("CNSTR_CMPL_TYP_NM", "");

	/**
	 * 起工部門ＣＤ.<p>
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
	 */
	public static final MCMeta WRK_DPT_CD = MCMeta.createStringMeta("WRK_DPT_CD", "", 20);

	/**
	 * 集計工号.<p>
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
	public static final MCMeta SUM_CNSTR_NO = MCMeta.createStringMeta("SUM_CNSTR_NO", "", 15);

	/**
	 * 統括案件ＮＯ.<p>
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
	public static final MCMeta SV_WRK_NO = MCMeta.createStringMeta("SV_WRK_NO", "", 15);

	/**
	 * 造船所ＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>4</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SHIPYARD_CD = MCMeta.createStringMeta("SHIPYARD_CD", "", 4);

	/**
	 * 造船所名.<p>
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
	public static final MCMeta SHIPYARD_NM = MCMeta.createStringMeta("SHIPYARD_NM", "", 100);

	/**
	 * RoHS区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>2,0</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>2</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ROHS_TYP = MCMeta.createNumberMeta("ROHS_TYP", "", 2, 0);

	/**
	 * RoHS区分名.<p>
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
	public static final MCMeta ROHS_TYP_NM = MCMeta.createStringMeta("ROHS_TYP_NM", "");

	/**
	 * サフィックス.<p>
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
	public static final MCMeta REV_NO = MCMeta.createStringMeta("REV_NO", "", 2);

	/**
	 * 作業区分.<p>
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
	public static final MCMeta WK_TYP = MCMeta.createStringMeta("WK_TYP", "", 2);

	/**
	 * 作業区分名.<p>
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
	public static final MCMeta WK_TYP_NM = MCMeta.createStringMeta("WK_TYP_NM", "");

	/**
	 * 分類区分.<p>
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
	public static final MCMeta CAT_TYP = MCMeta.createStringMeta("CAT_TYP", "", 2);

	/**
	 * 分類名.<p>
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
	public static final MCMeta CAT_TYP_NM = MCMeta.createStringMeta("CAT_TYP_NM", "");

	/**
	 * 制約条件.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>3</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>3</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CONSTR_COND = MCMeta.createStringMeta("CONSTR_COND", "", 3);

	/**
	 * 記事1.<p>
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
	public static final MCMeta SP_RMRKS1 = MCMeta.createStringMeta("SP_RMRKS1", "", 100);

	/**
	 * 記事2.<p>
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
	public static final MCMeta SP_RMRKS2 = MCMeta.createStringMeta("SP_RMRKS2", "", 100);

	/**
	 * 記事3.<p>
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
	public static final MCMeta SP_RMRKS3 = MCMeta.createStringMeta("SP_RMRKS3", "", 100);

	/**
	 * ラベルパタン.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta LABEL_PTN = MCMeta.createStringMeta("LABEL_PTN", "", 50);

	/**
	 * 発注ロット.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>21,8</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PO_LOT = MCMeta.createNumberMeta("PO_LOT", "", 21, 8);

	/**
	 * 工事分類.<p>
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
	public static final MCMeta CNSTR_GRP = MCMeta.createStringMeta("CNSTR_GRP", "", 2);

	/**
	 * 手配ＮＯ１.<p>
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
	 */
	public static final MCMeta SNO1 = MCMeta.createStringMeta("SNO1", "", 20);

	/**
	 * 小日程計画ＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>10</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SM_SCHD_NO = MCMeta.createStringMeta("SM_SCHD_NO", "", 10);

	/**
	 * 塗色.<p>
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
	public static final MCMeta FILL_COLOR = MCMeta.createStringMeta("FILL_COLOR", "", 100);

	/**
	 * 銘版.<p>
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
	public static final MCMeta NM_PLATE = MCMeta.createStringMeta("NM_PLATE", "", 100);

	/**
	 * コメント１.<p>
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
	public static final MCMeta RMRKS1 = MCMeta.createStringMeta("RMRKS1", "", 100);

	/**
	 * コメント２.<p>
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
	public static final MCMeta RMRKS2 = MCMeta.createStringMeta("RMRKS2", "", 100);

	/**
	 * コメント３.<p>
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
	public static final MCMeta RMRKS3 = MCMeta.createStringMeta("RMRKS3", "", 100);

	/**
	 * コメント４.<p>
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
	public static final MCMeta RMRKS4 = MCMeta.createStringMeta("RMRKS4", "", 100);

	/**
	 * コメント５.<p>
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
	public static final MCMeta RMRKS5 = MCMeta.createStringMeta("RMRKS5", "", 100);

	/**
	 * PRASSラベル発行区分.<p>
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
	public static final MCMeta PRASS_LBL_PRNT_TYP = MCMeta.createNumberMeta("PRASS_LBL_PRNT_TYP", "", 2, 0);

	/**
	 * 移動残ありのみ.<p>
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
	public static final MCMeta REMAIN_MOVE_ONLY = MCMeta.createStringMeta("REMAIN_MOVE_ONLY", "", 1);

	/**
	 * トレサビ対象区分.<p>
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
	public static final MCMeta TRACE_TGT_TYP = MCMeta.createStringMeta("TRACE_TGT_TYP", "", 1);

	/**
	 * トレサビ対象区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>10</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta TRACE_TGT_TYP_NM = MCMeta.createStringMeta("TRACE_TGT_TYP_NM", "", 10);

	/**
	 * PRASSラベル発行区分名.<p>
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
	public static final MCMeta PRASS_LBL_PRNT_TYP_NM = MCMeta.createStringMeta("PRASS_LBL_PRNT_TYP_NM", "", 100);

	/**
	 * 照合キー.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>30</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta MATCH_KEY = MCMeta.createStringMeta("MATCH_KEY", "", 30);

	/**
	 * 枝番.<p>
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
	public static final MCMeta SUB = MCMeta.createNumberMeta("SUB", "", 3, 0);

	/**
	 * 区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1,0</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta TYP = MCMeta.createNumberMeta("TYP", "", 1, 0);

	/**
	 * 品目数量.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>6,0</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ITM_QTY = MCMeta.createNumberMeta("ITM_QTY", "", 6, 0);

	/**
	 * 工事要領書番号.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta WORK_PROC_NO = MCMeta.createStringMeta("WORK_PROC_NO", "", 40);

	/**
	 * 注番.<p>
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
	public static final MCMeta ORD_NO = MCMeta.createStringMeta("ORD_NO", "", 15);

	/**
	 * 船番.<p>
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
	public static final MCMeta SHIP_NO = MCMeta.createStringMeta("SHIP_NO", "", 15);

	/**
	 * 検査規格.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>10</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta INSP_STD = MCMeta.createStringMeta("INSP_STD", "", 10);

	/**
	 * SFI番号.<p>
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
	public static final MCMeta SFI_NO = MCMeta.createStringMeta("SFI_NO", "", 15);

	/**
	 * 枝番SEQ.<p>
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
	public static final MCMeta SUB_SEQ = MCMeta.createNumberMeta("SUB_SEQ", "", 9, 0);

	/**
	 * 事業部コード.<p>
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
	public static final MCMeta DEPT_CD = MCMeta.createStringMeta("DEPT_CD", "", 1);

	/**
	 * 製品コード.<p>
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
	public static final MCMeta PROD_CD = MCMeta.createStringMeta("PROD_CD", "", 2);

	/**
	 * 年月（YYMM）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>4</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta YM_STR = MCMeta.createStringMeta("YM_STR", "", 4);

	/**
	 * ＺＯＨＯ販売予定ＮＯ.<p>
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
	public static final MCMeta ZOHO_SALES_PLAN_NO = MCMeta.createStringMeta("ZOHO_SALES_PLAN_NO", "", 15);

	/**
	 * 受付番号.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>16</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta RCPT_NO = MCMeta.createStringMeta("RCPT_NO", "", 16);

	/**
	 * 申請書番号.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta APPL_DOC_NO = MCMeta.createStringMeta("APPL_DOC_NO", "", 50);

	/**
	 * 納入図番号.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>12</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta DLV_DRAW_NO = MCMeta.createStringMeta("DLV_DRAW_NO", "", 12);

	/**
	 * 注番区分.<p>
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
	public static final MCMeta SLO_NUM_TYP = MCMeta.createStringMeta("SLO_NUM_TYP", "", 1);

	/**
	 * 注番区分名.<p>
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
	public static final MCMeta SLO_NUM_TYP_NM = MCMeta.createStringMeta("SLO_NUM_TYP_NM", "");

	/**
	 * 注文番号.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>16</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SLO_NUM = MCMeta.createStringMeta("SLO_NUM", "", 16);

	/**
	 * 塗色.<p>
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
	public static final MCMeta PAINT_CLR = MCMeta.createStringMeta("PAINT_CLR", "", 15);

	/**
	 * 売上条件区分.<p>
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
	public static final MCMeta SALES_COND = MCMeta.createStringMeta("SALES_COND", "", 1);

	/**
	 * 売上条件区分名.<p>
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
	public static final MCMeta SALES_COND_NM = MCMeta.createStringMeta("SALES_COND_NM", "");

	/**
	 * 出荷特別指示区分.<p>
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
	public static final MCMeta SHIP_SP_INSTR_TYP = MCMeta.createStringMeta("SHIP_SP_INSTR_TYP", "", 1);

	/**
	 * 出荷特別指示区分名.<p>
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
	public static final MCMeta SHIP_SP_INSTR_TYP_NM = MCMeta.createStringMeta("SHIP_SP_INSTR_TYP_NM", "");

	/**
	 * 指定納品書区分.<p>
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
	public static final MCMeta SPEC_DLV_NOTE_TYP = MCMeta.createStringMeta("SPEC_DLV_NOTE_TYP", "", 1);

	/**
	 * 指定納品書区分名.<p>
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
	public static final MCMeta SPEC_DLV_NOTE_TYP_NM = MCMeta.createStringMeta("SPEC_DLV_NOTE_TYP_NM", "");

	/**
	 * 船籍.<p>
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
	public static final MCMeta VES_NATL = MCMeta.createStringMeta("VES_NATL", "", 3);

	/**
	 * 船籍名.<p>
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
	public static final MCMeta VES_NATL_NM = MCMeta.createStringMeta("VES_NATL_NM", "");

	/**
	 * 船番.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>30</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta VES_NO = MCMeta.createStringMeta("VES_NO", "", 30);

	/**
	 * 船名.<p>
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
	public static final MCMeta VES_NM = MCMeta.createStringMeta("VES_NM", "", 100);

	/**
	 * 屯数.<p>
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
	 */
	public static final MCMeta TONNAGE = MCMeta.createStringMeta("TONNAGE", "", 20);

	/**
	 * 船種.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>30</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta VES_TYP = MCMeta.createStringMeta("VES_TYP", "", 30);

	/**
	 * ロイヤリティ支払先.<p>
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
	 */
	public static final MCMeta ROYALTY_PSPPL = MCMeta.createStringMeta("ROYALTY_PSPPL", "", 20);

	/**
	 * 仕様書区分.<p>
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
	public static final MCMeta SPEC_DOC_TYP = MCMeta.createStringMeta("SPEC_DOC_TYP", "", 1);

	/**
	 * 仕様書区分名.<p>
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
	public static final MCMeta SPEC_DOC_TYP_NM = MCMeta.createStringMeta("SPEC_DOC_TYP_NM", "");

	/**
	 * 型式和英区分.<p>
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
	public static final MCMeta MODEL_JP_EN_TYP = MCMeta.createStringMeta("MODEL_JP_EN_TYP", "", 1);

	/**
	 * 型式和英区分名.<p>
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
	public static final MCMeta MODEL_JP_EN_TYP_NM = MCMeta.createStringMeta("MODEL_JP_EN_TYP_NM", "");

	/**
	 * 検査成績書（検査成績書区分）.<p>
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
	public static final MCMeta INSP_REP_TYP = MCMeta.createStringMeta("INSP_REP_TYP", "", 1);

	/**
	 * 検査成績書区分名.<p>
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
	public static final MCMeta INSP_REP_TYP_NM = MCMeta.createStringMeta("INSP_REP_TYP_NM", "");

	/**
	 * 協議図（協議図区分）.<p>
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
	public static final MCMeta CONS_DRAW_TYP = MCMeta.createStringMeta("CONS_DRAW_TYP", "", 1);

	/**
	 * 協議図区分名.<p>
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
	public static final MCMeta CONS_DRAW_TYP_NM = MCMeta.createStringMeta("CONS_DRAW_TYP_NM", "");

	/**
	 * 工事図（工事図区分）.<p>
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
	public static final MCMeta CONST_DRAW_TYP = MCMeta.createStringMeta("CONST_DRAW_TYP", "", 1);

	/**
	 * 工事図区分名.<p>
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
	public static final MCMeta CONST_DRAW_TYP_NM = MCMeta.createStringMeta("CONST_DRAW_TYP_NM", "");

	/**
	 * 完成図（完成図区分）.<p>
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
	public static final MCMeta COMP_DRAW_TYP = MCMeta.createStringMeta("COMP_DRAW_TYP", "", 1);

	/**
	 * 完成図区分名.<p>
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
	public static final MCMeta COMP_DRAW_TYP_NM = MCMeta.createStringMeta("COMP_DRAW_TYP_NM", "");

	/**
	 * 取扱説明書（取扱説明書区分）.<p>
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
	public static final MCMeta INST_MANUAL_TYP = MCMeta.createStringMeta("INST_MANUAL_TYP", "", 1);

	/**
	 * 取扱説明書区分名.<p>
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
	public static final MCMeta INST_MANUAL_TYP_NM = MCMeta.createStringMeta("INST_MANUAL_TYP_NM", "");

	/**
	 * 承認図（承認図区分）.<p>
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
	public static final MCMeta APRV_DRAW_TYP = MCMeta.createStringMeta("APRV_DRAW_TYP", "", 1);

	/**
	 * 承認図区分名.<p>
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
	public static final MCMeta APRV_DRAW_TYP_NM = MCMeta.createStringMeta("APRV_DRAW_TYP_NM", "");

	/**
	 * 受注変更理由.<p>
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
	public static final MCMeta SLO_CNG_RSN = MCMeta.createStringMeta("SLO_CNG_RSN", "", 100);

	/**
	 * 代表図番.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta MAIN_DRAW_NO = MCMeta.createStringMeta("MAIN_DRAW_NO", "", 50);

	/**
	 * 元システムキーＮＯ.<p>
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
	public static final MCMeta SLS_SCHD_NO = MCMeta.createStringMeta("SLS_SCHD_NO", "", 15);

	/**
	 * 無償理由ＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>10</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta FRC_RSN_CD = MCMeta.createStringMeta("FRC_RSN_CD", "", 10);

	/**
	 * 無償理由名.<p>
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
	public static final MCMeta FRC_RSN_NM = MCMeta.createStringMeta("FRC_RSN_NM", "", 100);

	/**
	 * 一括売上紐付ＮＯ.<p>
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
	public static final MCMeta BULK_SLS_LNK_NO = MCMeta.createStringMeta("BULK_SLS_LNK_NO", "", 15);

	/**
	 * 受注工号枝番.<p>
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
	 */
	public static final MCMeta WRK_BR_NO = MCMeta.createStringMeta("WRK_BR_NO", "", 20);

	/**
	 * 単価区分.<p>
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
	public static final MCMeta UPRI_TYP = MCMeta.createStringMeta("UPRI_TYP", "", 1);

	/**
	 * 単価区分名.<p>
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
	public static final MCMeta UPRI_TYP_NM = MCMeta.createStringMeta("UPRI_TYP_NM", "");

	/**
	 * 塗色.<p>
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
	public static final MCMeta COLOR = MCMeta.createStringMeta("COLOR", "", 100);

	/**
	 * 銘版.<p>
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
	public static final MCMeta NM_PLT = MCMeta.createStringMeta("NM_PLT", "", 100);

	/**
	 * 受注種別.<p>
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
	public static final MCMeta JIP_SLO_TYP = MCMeta.createStringMeta("JIP_SLO_TYP", "", 1);

	/**
	 * 客先コード.<p>
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
	public static final MCMeta CST_CD = MCMeta.createStringMeta("CST_CD", "", 3);

	/**
	 * 客先品番.<p>
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
	public static final MCMeta CST_ITM_NO = MCMeta.createStringMeta("CST_ITM_NO", "", 3);

	/**
	 * 照合明細キー.<p>
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
	public static final MCMeta MATCH_DTL_KEY = MCMeta.createStringMeta("MATCH_DTL_KEY", "", 3);

	/**
	 * コメント１（明細）.<p>
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
	public static final MCMeta SLO_D_CMNT_1 = MCMeta.createStringMeta("SLO_D_CMNT_1", "", 100);

	/**
	 * コメント２（明細）.<p>
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
	public static final MCMeta SLO_D_CMNT_2 = MCMeta.createStringMeta("SLO_D_CMNT_2", "", 100);

	/**
	 * コメント３（明細）.<p>
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
	public static final MCMeta SLO_D_CMNT_3 = MCMeta.createStringMeta("SLO_D_CMNT_3", "", 100);

	/**
	 * コメント４（明細）.<p>
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
	public static final MCMeta SLO_D_CMNT_4 = MCMeta.createStringMeta("SLO_D_CMNT_4", "", 100);

	/**
	 * コメント５（明細）.<p>
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
	public static final MCMeta SLO_D_CMNT_5 = MCMeta.createStringMeta("SLO_D_CMNT_5", "", 100);

	/**
	 * コメント１（ヘッダ）.<p>
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
	public static final MCMeta SLO_CMNT_1 = MCMeta.createStringMeta("SLO_CMNT_1", "", 100);

	/**
	 * コメント２（ヘッダ）.<p>
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
	public static final MCMeta SLO_CMNT_2 = MCMeta.createStringMeta("SLO_CMNT_2", "", 100);

	/**
	 * コメント３（ヘッダ）.<p>
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
	public static final MCMeta SLO_CMNT_3 = MCMeta.createStringMeta("SLO_CMNT_3", "", 100);

	/**
	 * コメント４（ヘッダ）.<p>
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
	public static final MCMeta SLO_CMNT_4 = MCMeta.createStringMeta("SLO_CMNT_4", "", 100);

	/**
	 * コメント５（ヘッダ）.<p>
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
	public static final MCMeta SLO_CMNT_5 = MCMeta.createStringMeta("SLO_CMNT_5", "", 100);

	/**
	 * 住所1～住所4.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1000</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>60</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SHIP_TO_ADDR = MCMeta.createStringMeta("SHIP_TO_ADDR", "", 1000);

	/**
	 * ユーザ名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta USER_NM = MCMeta.createStringMeta("USER_NM", "", 40);

	/**
	 * パスワード.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta USER_PW = MCMeta.createStringMeta("USER_PW", "", 40);

	/**
	 * 口径.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>4</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta DIAMETER = MCMeta.createStringMeta("DIAMETER", "", 4);

	/**
	 * 仕様ＣＤ.<p>
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
	 */
	public static final MCMeta TK_SPEC_CD = MCMeta.createStringMeta("TK_SPEC_CD", "", 20);

	/**
	 * 外注納入指示ＮＯ.<p>
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
	public static final MCMeta SBCN_DLV_INST_NO = MCMeta.createStringMeta("SBCN_DLV_INST_NO", "", 15);

	/**
	 * 外注納入指示明細ＮＯ.<p>
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
	public static final MCMeta SBCN_DLV_INST_D_NO = MCMeta.createStringMeta("SBCN_DLV_INST_D_NO", "", 15);

	/**
	 * 納入指示備考.<p>
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
	public static final MCMeta DLV_INST_RMRKS = MCMeta.createStringMeta("DLV_INST_RMRKS", "", 100);

	/**
	 * 訂正理由.<p>
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
	 */
	public static final MCMeta CORR_RSN = MCMeta.createStringMeta("CORR_RSN", "", 100);

	/**
	 * 立会検査有無区分.<p>
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
	public static final MCMeta WIT_INSP_TYP = MCMeta.createStringMeta("WIT_INSP_TYP", "", 1);

	/**
	 * 立会検査有無区分名.<p>
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
	public static final MCMeta WIT_INSP_TYP_NM = MCMeta.createStringMeta("WIT_INSP_TYP_NM", "");

	/**
	 * 装備要否区分.<p>
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
	public static final MCMeta EQUIP_TYP = MCMeta.createStringMeta("EQUIP_TYP", "", 1);

	/**
	 * 装備要否区分名.<p>
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
	public static final MCMeta EQUIP_TYP_NM = MCMeta.createStringMeta("EQUIP_TYP_NM", "");

	/**
	 * 測線数.<p>
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
	public static final MCMeta SURV_LINE_QTY = MCMeta.createStringMeta("SURV_LINE_QTY", "", 2);

	/**
	 * 検査成績書部数.<p>
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
	public static final MCMeta INSP_REP_QTY = MCMeta.createNumberMeta("INSP_REP_QTY", "", 3, 0);

	/**
	 * 協議図部数.<p>
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
	public static final MCMeta CONS_DRAW_QTY = MCMeta.createNumberMeta("CONS_DRAW_QTY", "", 3, 0);

	/**
	 * 工事図部数.<p>
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
	public static final MCMeta CONST_DRAW_QTY = MCMeta.createNumberMeta("CONST_DRAW_QTY", "", 3, 0);

	/**
	 * 完成図部数.<p>
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
	public static final MCMeta COMP_DRAW_QTY = MCMeta.createNumberMeta("COMP_DRAW_QTY", "", 3, 0);

	/**
	 * 取扱説明書部数.<p>
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
	public static final MCMeta INST_MANUAL_QTY = MCMeta.createNumberMeta("INST_MANUAL_QTY", "", 3, 0);

	/**
	 * 承認図部数.<p>
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
	public static final MCMeta APRV_DRAW_QTY = MCMeta.createNumberMeta("APRV_DRAW_QTY", "", 3, 0);

	/**
	 * 出荷可否区分.<p>
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
	public static final MCMeta SHIP_ABL_TYP = MCMeta.createStringMeta("SHIP_ABL_TYP", "", 1);

	/**
	 * 出荷指図引当区分.<p>
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
	public static final MCMeta SHIP_INST_TYP = MCMeta.createStringMeta("SHIP_INST_TYP", "", 1);

	/**
	 * 実在庫引当区分.<p>
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
	public static final MCMeta ACT_STK_ALLOC_TYP = MCMeta.createStringMeta("ACT_STK_ALLOC_TYP", "", 1);

	/**
	 * 生産可否区分.<p>
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
	public static final MCMeta PROD_ABL_TYP = MCMeta.createStringMeta("PROD_ABL_TYP", "", 1);

	/**
	 * 購買・外注区分.<p>
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
	public static final MCMeta PURC_OUTSRC_TYP = MCMeta.createStringMeta("PURC_OUTSRC_TYP", "", 1);

	/**
	 * キーＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>10</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta KEY_NO = MCMeta.createStringMeta("KEY_NO", "", 10);

	/**
	 * ＺＯＨＯ販売予定ＮＯ.<p>
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
	public static final MCMeta ZOHO_SLS_SCHD_NO = MCMeta.createStringMeta("ZOHO_SLS_SCHD_NO", "", 15);

	/**
	 * 設置場所.<p>
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
	public static final MCMeta INS_LOC_CD = MCMeta.createStringMeta("INS_LOC_CD", "", 100);

	/**
	 * 商談ＣＤ.<p>
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
	public static final MCMeta DEAL_CD = MCMeta.createStringMeta("DEAL_CD", "", 100);

	/**
	 * 商談名.<p>
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
	public static final MCMeta DEAL_NM = MCMeta.createStringMeta("DEAL_NM", "", 100);

	/**
	 * ＺＯＨＯ販売予定枝番.<p>
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
	public static final MCMeta ZOHO_SLS_SCHD_BR_NO = MCMeta.createStringMeta("ZOHO_SLS_SCHD_BR_NO", "", 5);

}

