package mcframe.commonMA.meta;

import mcframe.commonCore.meta.MCMeta;

/**
 * 共有項目メタの定義クラスです。
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
abstract public class MA_META_MC_A {
	/**
	 * 年.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>Y</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta Y = MCMeta.createDateMeta("Y", "");
	public static final String Y_FORMAT = "Y";

	/**
	 * 年月.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YM</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta YM = MCMeta.createDateMeta("YM", "");
	public static final String YM_FORMAT = "YM";

	/**
	 * 年月日.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta DT = MCMeta.createDateMeta("DT", "");
	public static final String DT_FORMAT = "YMD";

	/**
	 * 年月日時分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMDHM</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta TM = MCMeta.createDateMeta("TM", "");
	public static final String TM_FORMAT = "YMDHM";

	/**
	 * 年月日時分秒（DATE型）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMDHMS</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta YMDHMS = MCMeta.createDateMeta("YMDHMS", "");
	public static final String YMDHMS_FORMAT = "YMDHMS";

	/**
	 * 年月日時分秒（TIMESTAMP型）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Timestamp</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMDHMS</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SYS_TS = MCMeta.createTimestampMeta("SYS_TS", "");
	public static final String SYS_TS_FORMAT = "YMDHMS";

	/**
	 * 時分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>HM</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta HM = MCMeta.createDateMeta("HM", "");
	public static final String HM_FORMAT = "HM";

	/**
	 * 時分（文字列）.<p>
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
	 * <br>
	 * HH:MM<br>
	 */
	public static final MCMeta CHAR_HM = MCMeta.createStringMeta("CHAR_HM", "", 4);

	/**
	 * 年月日（文字列）.<p>
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
	public static final MCMeta CHAR_YMD = MCMeta.createStringMeta("CHAR_YMD", "", 20);

	/**
	 * フラグ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Boolean</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta FLG = MCMeta.createBooleanMeta("FLG", "");

	/**
	 * 整数.<p>
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
	 * <br>
	 * ９桁までの整数<br>
	 */
	public static final MCMeta INT = MCMeta.createNumberMeta("INT", "", 9, 0);

	/**
	 * 整数.<p>
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
	 * <br>
	 * ２桁までの整数<br>
	 */
	public static final MCMeta INT2 = MCMeta.createNumberMeta("INT2", "", 2, 0);

	/**
	 * 整数.<p>
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
	 * <br>
	 * ３桁までの整数<br>
	 */
	public static final MCMeta INT3 = MCMeta.createNumberMeta("INT3", "", 3, 0);

	/**
	 * 整数.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>4,0</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * ４桁までの整数<br>
	 */
	public static final MCMeta INT4 = MCMeta.createNumberMeta("INT4", "", 4, 0);

	/**
	 * 文字列.<p>
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
	 * ２０桁までの文字列<br>
	 */
	public static final MCMeta STR20 = MCMeta.createStringMeta("STR20", "", 20);

	/**
	 * 数量.<p>
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
	public static final MCMeta QTY = MCMeta.createNumberMeta("QTY", "", 21, 8);

	/**
	 * 金額、単価.<p>
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
	public static final MCMeta MONEY = MCMeta.createNumberMeta("MONEY", "", 21, 8);

	/**
	 * パーセント.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>5,2</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * １００分率<br>
	 */
	public static final MCMeta PER = MCMeta.createNumberMeta("PER", "", 5, 2);

	/**
	 * 小数部有効桁数.<p>
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
	public static final MCMeta DEC_PLACE = MCMeta.createNumberMeta("DEC_PLACE", "", 2, 0);

	/**
	 * ロットＮＯ.<p>
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
	public static final MCMeta LOT_NO = MCMeta.createStringMeta("LOT_NO", "", 15);

	/**
	 * サブロットＮＯ.<p>
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
	public static final MCMeta SUBLOT_NO = MCMeta.createStringMeta("SUBLOT_NO", "", 15);

	/**
	 * 手配ＮＯ１.<p>
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
	public static final MCMeta SNO1 = MCMeta.createStringMeta("SNO1", "", 15);

	/**
	 * 手配ＮＯ２.<p>
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
	public static final MCMeta SNO2 = MCMeta.createStringMeta("SNO2", "", 15);

	/**
	 * 手配ＮＯ３.<p>
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
	public static final MCMeta SNO3 = MCMeta.createStringMeta("SNO3", "", 15);

	/**
	 * 手配ＮＯ４.<p>
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
	public static final MCMeta SNO4 = MCMeta.createStringMeta("SNO4", "", 15);

	/**
	 * マスタメモ１.<p>
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
	public static final MCMeta MST_MEMO1 = MCMeta.createStringMeta("MST_MEMO1", "", 100);

	/**
	 * マスタメモ２.<p>
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
	public static final MCMeta MST_MEMO2 = MCMeta.createStringMeta("MST_MEMO2", "", 100);

	/**
	 * マスタメモ３.<p>
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
	public static final MCMeta MST_MEMO3 = MCMeta.createStringMeta("MST_MEMO3", "", 100);

	/**
	 * 申請メモ.<p>
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
	public static final MCMeta MST_APL_MEMO = MCMeta.createStringMeta("MST_APL_MEMO", "", 100);

	/**
	 * テキスト.<p>
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
	public static final MCMeta TXT = MCMeta.createStringMeta("TXT", "", 100);

	/**
	 * オラクルオブジェクト名.<p>
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
	 * <br>
	 * 半角英数字<br>
	 */
	public static final MCMeta ORA_OBJ_NM = MCMeta.createStringMeta("ORA_OBJ_NM", "", 30);

	/**
	 * イメージ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Binary</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IMG = MCMeta.createBinaryMeta("IMG", "");

	/**
	 * 日数.<p>
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
	public static final MCMeta DAYS = MCMeta.createNumberMeta("DAYS", "", 3, 0);

	/**
	 * 月数.<p>
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
	public static final MCMeta MONS = MCMeta.createNumberMeta("MONS", "", 2, 0);

	/**
	 * 月（ＭＭ）.<p>
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
	 * <br>
	 * 1～12<br>
	 */
	public static final MCMeta MON = MCMeta.createNumberMeta("MON", "", 2, 0);

	/**
	 * 締日（ＤＤ）.<p>
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
	 * <br>
	 * 1～31（99は末日）<br>
	 */
	public static final MCMeta CL_DAY = MCMeta.createNumberMeta("CL_DAY", "", 2, 0);

	/**
	 * 月度基準.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1,0</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>2</td>
	* </tr>
	 * </table>
	 * <br>
	 * 0：当月、-1：前月<br>
	 */
	public static final MCMeta CL_MON_BASE = MCMeta.createNumberMeta("CL_MON_BASE", "", 1, 0);

	/**
	 * バイナリ項目.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Binary</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BIN = MCMeta.createBinaryMeta("BIN", "");

	/**
	 * モジュールＩＤ.<p>
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
	public static final MCMeta MODULE_ID = MCMeta.createStringMeta("MODULE_ID", "", 3);

	/**
	 * モジュール名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta MODULE_NM = MCMeta.createStringMeta("MODULE_NM", "");

	/**
	 * 画面ＩＤ.<p>
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
	public static final MCMeta SCREEN_ID = MCMeta.createStringMeta("SCREEN_ID", "", 10);

	/**
	 * 画面名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SCREEN_NM = MCMeta.createStringMeta("SCREEN_NM", "", 40);

	/**
	 * 帳票ＩＤ.<p>
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
	public static final MCMeta REPORT_ID = MCMeta.createStringMeta("REPORT_ID", "", 100);

	/**
	 * 帳票名.<p>
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
	public static final MCMeta REPORT_NM = MCMeta.createStringMeta("REPORT_NM", "");

	/**
	 * 帳票ＩＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SLIP_FORM_ID = MCMeta.createStringMeta("SLIP_FORM_ID", "", 20);

	/**
	 * 伝票帳票ＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SLIP_FORM_CD = MCMeta.createStringMeta("SLIP_FORM_CD", "", 20);

	/**
	 * 伝票帳票名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>30</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SLIP_FORM_NM = MCMeta.createStringMeta("SLIP_FORM_NM", "", 40);

	/**
	 * ログインシーケンス.<p>
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
	public static final MCMeta LOGIN_SEQ = MCMeta.createStringMeta("LOGIN_SEQ", "", 50);

	/**
	 * サーバリクエストＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SRV_REQ_NO = MCMeta.createStringMeta("SRV_REQ_NO", "", 50);

	/**
	 * 更新カウンタ.<p>
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
	public static final MCMeta UPD_CNT = MCMeta.createNumberMeta("UPD_CNT", "", 9, 0);

	/**
	 * ユーザＩＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>500</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 * <br>
	 * インフラのユーザＩＤと同じ桁にする<br>
	 */
	public static final MCMeta USR_ID = MCMeta.createStringMeta("USR_ID", "", 500);

	/**
	 * ユーザＩＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>500</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 * <br>
	 * インフラのユーザＩＤと同じ桁にする<br>
	 */
	public static final MCMeta FCM_USR_ID = MCMeta.createStringMeta("FCM_USR_ID", "", 500);

	/**
	 * ユーザ名.<p>
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
	 * <br>
	 * インフラのユーザ名と同じ桁にする<br>
	 */
	public static final MCMeta FCM_USR_NM = MCMeta.createStringMeta("FCM_USR_NM", "", 100);

	/**
	 * 担当者ＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>500</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 * <br>
	 * FCM_USR_IDと同じ桁にする<br>
	 */
	public static final MCMeta USR_CD = MCMeta.createStringMeta("USR_CD", "", 500);

	/**
	 * 担当者名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 * <br>
	 * FCM_USR_NMと同じ桁にする<br>
	 */
	public static final MCMeta USR_NM = MCMeta.createStringMeta("USR_NM", "", 100);

	/**
	 * 機能ＩＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta FUNC_ID = MCMeta.createStringMeta("FUNC_ID", "", 50);

	/**
	 * 機能名.<p>
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
	public static final MCMeta FUNC_NM = MCMeta.createStringMeta("FUNC_NM", "", 100);

	/**
	 * ロケールＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>7</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta LCL_CD = MCMeta.createStringMeta("LCL_CD", "", 7);

	/**
	 * ロケール名.<p>
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
	public static final MCMeta LCL_NM = MCMeta.createStringMeta("LCL_NM", "");

	/**
	 * 権限文字列.<p>
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
	public static final MCMeta AUTH_STR = MCMeta.createStringMeta("AUTH_STR", "", 20);

	/**
	 * 数値丸め区分.<p>
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
	public static final MCMeta BIG_NUM_RND_TYP = MCMeta.createStringMeta("BIG_NUM_RND_TYP", "", 1);

	/**
	 * 数値丸め区分名.<p>
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
	public static final MCMeta BIG_NUM_RND_TYP_NM = MCMeta.createStringMeta("BIG_NUM_RND_TYP_NM", "");

	/**
	 * ＰＧ実行状況区分.<p>
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
	public static final MCMeta EXE_STS_TYP = MCMeta.createStringMeta("EXE_STS_TYP", "", 1);

	/**
	 * ＰＧ実行状況区分名.<p>
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
	public static final MCMeta EXE_STS_TYP_NM = MCMeta.createStringMeta("EXE_STS_TYP_NM", "");

	/**
	 * バッチログＮＯ.<p>
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
	public static final MCMeta BATCH_LOG_NO = MCMeta.createStringMeta("BATCH_LOG_NO", "", 15);

	/**
	 * バッチログ連番.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>22,0</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BATCH_LOG_SEQ = MCMeta.createNumberMeta("BATCH_LOG_SEQ", "", 22, 0);

	/**
	 * バッチログサブキー１.<p>
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
	public static final MCMeta BATCH_LOG_SUB_KEY1 = MCMeta.createNumberMeta("BATCH_LOG_SUB_KEY1", "", 9, 0);

	/**
	 * バッチログサブキー２.<p>
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
	public static final MCMeta BATCH_LOG_SUB_KEY2 = MCMeta.createNumberMeta("BATCH_LOG_SUB_KEY2", "", 9, 0);

	/**
	 * バッチデータＮＯ.<p>
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
	public static final MCMeta BATCH_DATA_NO = MCMeta.createStringMeta("BATCH_DATA_NO", "", 20);

	/**
	 * 処理グループＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 * <br>
	 * インフラの処理グループＣＤと同じ桁にする<br>
	 */
	public static final MCMeta GP_BATCH_GRP_CD = MCMeta.createStringMeta("GP_BATCH_GRP_CD", "", 50);

	/**
	 * 処理グループ名.<p>
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
	 * インフラの処理グループ名と同じ桁にする<br>
	 */
	public static final MCMeta GP_BATCH_GRP_NM = MCMeta.createStringMeta("GP_BATCH_GRP_NM", "", 100);

	/**
	 * バッチログ区分.<p>
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
	public static final MCMeta BATCH_LOG_TYP = MCMeta.createStringMeta("BATCH_LOG_TYP", "", 1);

	/**
	 * バッチログ区分名.<p>
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
	public static final MCMeta BATCH_LOG_TYP_NM = MCMeta.createStringMeta("BATCH_LOG_TYP_NM", "");

	/**
	 * メッセージレベル.<p>
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
	public static final MCMeta MSG_LVL = MCMeta.createStringMeta("MSG_LVL", "", 1);

	/**
	 * ＦＬＧ文字列.<p>
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
	public static final MCMeta FLG_STR = MCMeta.createStringMeta("FLG_STR", "", 1);

	/**
	 * 帳票ステータス区分.<p>
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
	public static final MCMeta RPT_STS_TYP = MCMeta.createStringMeta("RPT_STS_TYP", "", 1);

	/**
	 * 帳票ステータス区分名.<p>
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
	public static final MCMeta RPT_STS_TYP_NM = MCMeta.createStringMeta("RPT_STS_TYP_NM", "");

	/**
	 * 処理結果状況区分.<p>
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
	public static final MCMeta RTN_STS_TYP = MCMeta.createStringMeta("RTN_STS_TYP", "", 1);

	/**
	 * 処理結果状況区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>4</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta RTN_STS_TYP_NM = MCMeta.createStringMeta("RTN_STS_TYP_NM", "");

	/**
	 * 取引先宛先区分.<p>
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
	public static final MCMeta BP_ADDR_TYP = MCMeta.createStringMeta("BP_ADDR_TYP", "", 2);

	/**
	 * 取引先宛先区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>4</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BP_ADDR_NM = MCMeta.createStringMeta("BP_ADDR_NM", "");

	/**
	 * 場所宛先区分.<p>
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
	public static final MCMeta LOC_ADDR_TYP = MCMeta.createStringMeta("LOC_ADDR_TYP", "", 2);

	/**
	 * 場所宛先区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>4</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta LOC_ADDR_NM = MCMeta.createStringMeta("LOC_ADDR_NM", "");

	/**
	 * プッシュ通知区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PUSH_NTC_TYP = MCMeta.createStringMeta("PUSH_NTC_TYP", "", 50);

	/**
	 * プッシュ通知区分名.<p>
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
	public static final MCMeta PUSH_NTC_TYP_NM = MCMeta.createStringMeta("PUSH_NTC_TYP_NM", "");

	/**
	 * メッセージ重要度区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta MSG_IMP_TYP = MCMeta.createStringMeta("MSG_IMP_TYP", "", 1);

	/**
	 * メッセージ重要度区分名.<p>
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
	public static final MCMeta MSG_IMP_TYP_NM = MCMeta.createStringMeta("MSG_IMP_TYP_NM", "");

	/**
	 * プッシュ受信方式区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PUSH_TYP = MCMeta.createStringMeta("PUSH_TYP", "", 1);

	/**
	 * プッシュ受信方式区分名.<p>
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
	public static final MCMeta PUSH_TYP_NM = MCMeta.createStringMeta("PUSH_TYP_NM", "");

	/**
	 * プッシュ通知ＮＯ.<p>
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
	public static final MCMeta PUSH_NTC_NO = MCMeta.createStringMeta("PUSH_NTC_NO", "", 15);

	/**
	 * 連結文字列.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>4000</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 * <br>
	 * プッシュ通知機能用<br>
	 */
	public static final MCMeta IC_STR = MCMeta.createStringMeta("IC_STR", "", 4000);

	/**
	 * クライアント区分.<p>
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
	public static final MCMeta CLIENT_TYP = MCMeta.createStringMeta("CLIENT_TYP", "", 1);

	/**
	 * クライアント区分名.<p>
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
	public static final MCMeta CLIENT_TYP_NM = MCMeta.createStringMeta("CLIENT_TYP_NM", "");

	/**
	 * プッシュ連携区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PUSH_TRANS_TYP = MCMeta.createStringMeta("PUSH_TRANS_TYP", "", 50);

	/**
	 * プッシュ連携区分名.<p>
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
	public static final MCMeta PUSH_TRANS_TYP_NM = MCMeta.createStringMeta("PUSH_TRANS_TYP_NM", "");

	/**
	 * ROWID.<p>
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
	public static final MCMeta ROW_ID = MCMeta.createStringMeta("ROW_ID", "", 20);

	/**
	 * 品目ＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ITM_CD = MCMeta.createStringMeta("ITM_CD", "", 40);

	/**
	 * 枝番１.<p>
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
	public static final MCMeta ITM_SUB1 = MCMeta.createStringMeta("ITM_SUB1", "", 5);

	/**
	 * 枝番２.<p>
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
	public static final MCMeta ITM_SUB2 = MCMeta.createStringMeta("ITM_SUB2", "", 5);

	/**
	 * 枝番３.<p>
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
	public static final MCMeta ITM_SUB3 = MCMeta.createStringMeta("ITM_SUB3", "", 5);

	/**
	 * 品名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>40</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ITM_NM = MCMeta.createStringMeta("ITM_NM", "", 100);

	/**
	 * 品目別名１.<p>
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
	 */
	public static final MCMeta ITM_ALT_NM1 = MCMeta.createStringMeta("ITM_ALT_NM1", "", 100);

	/**
	 * 品目別名２.<p>
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
	 */
	public static final MCMeta ITM_ALT_NM2 = MCMeta.createStringMeta("ITM_ALT_NM2", "", 100);

	/**
	 * 品目別名３.<p>
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
	 */
	public static final MCMeta ITM_ALT_NM3 = MCMeta.createStringMeta("ITM_ALT_NM3", "", 100);

	/**
	 * 品目別名４.<p>
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
	 */
	public static final MCMeta ITM_ALT_NM4 = MCMeta.createStringMeta("ITM_ALT_NM4", "", 100);

	/**
	 * 届出名.<p>
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
	public static final MCMeta NTFY_NM = MCMeta.createStringMeta("NTFY_NM", "", 100);

	/**
	 * 計画品目ＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SPLN_ITM_CD = MCMeta.createStringMeta("SPLN_ITM_CD", "", 40);

	/**
	 * 計画品名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>40</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SPLN_ITM_NM = MCMeta.createStringMeta("SPLN_ITM_NM", "", 100);

	/**
	 * 取引先ＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BP_CD = MCMeta.createStringMeta("BP_CD", "", 20);

	/**
	 * 取引先名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>25</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BP_NM = MCMeta.createStringMeta("BP_NM", "", 100);

	/**
	 * 取引先別名１.<p>
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
	 */
	public static final MCMeta BP_ALT_NM1 = MCMeta.createStringMeta("BP_ALT_NM1", "", 100);

	/**
	 * 取引先別名２.<p>
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
	 */
	public static final MCMeta BP_ALT_NM2 = MCMeta.createStringMeta("BP_ALT_NM2", "", 100);

	/**
	 * 取引先別名３.<p>
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
	 */
	public static final MCMeta BP_ALT_NM3 = MCMeta.createStringMeta("BP_ALT_NM3", "", 100);

	/**
	 * 取引先別名４.<p>
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
	 */
	public static final MCMeta BP_ALT_NM4 = MCMeta.createStringMeta("BP_ALT_NM4", "", 100);

	/**
	 * 部門ＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta DPT_CD = MCMeta.createStringMeta("DPT_CD", "", 20);

	/**
	 * 部門名.<p>
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
	public static final MCMeta DPT_NM = MCMeta.createStringMeta("DPT_NM", "", 100);

	/**
	 * 組織変更備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>200</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta DPT_HIS_RMRKS = MCMeta.createStringMeta("DPT_HIS_RMRKS", "", 200);

	/**
	 * マスタ設定区分.<p>
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
	public static final MCMeta MST_SET_TYP = MCMeta.createStringMeta("MST_SET_TYP", "", 1);

	/**
	 * マスタ設定区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>8</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta MST_SET_TYP_NM = MCMeta.createStringMeta("MST_SET_TYP_NM", "");

	/**
	 * 会社ＣＤ.<p>
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
	 * <br>
	 * インフラの会社ＣＤと同じ桁にする<br>
	 */
	public static final MCMeta CO_CD = MCMeta.createStringMeta("CO_CD", "", 10);

	/**
	 * 会社名.<p>
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
	 * <br>
	 * インフラの会社名と同じ桁にする<br>
	 */
	public static final MCMeta CO_NM = MCMeta.createStringMeta("CO_NM", "", 100);

	/**
	 * 会社別名１.<p>
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
	 */
	public static final MCMeta CO_ALT_NM1 = MCMeta.createStringMeta("CO_ALT_NM1", "", 100);

	/**
	 * 会社別名２.<p>
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
	 */
	public static final MCMeta CO_ALT_NM2 = MCMeta.createStringMeta("CO_ALT_NM2", "", 100);

	/**
	 * 会社別名３.<p>
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
	 */
	public static final MCMeta CO_ALT_NM3 = MCMeta.createStringMeta("CO_ALT_NM3", "", 100);

	/**
	 * 会社別名４.<p>
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
	 */
	public static final MCMeta CO_ALT_NM4 = MCMeta.createStringMeta("CO_ALT_NM4", "", 100);

	/**
	 * 会社別名１.<p>
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
	 */
	public static final MCMeta CO_LNM1 = MCMeta.createStringMeta("CO_LNM1", "", 100);

	/**
	 * 会社別名２.<p>
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
	 */
	public static final MCMeta CO_LNM2 = MCMeta.createStringMeta("CO_LNM2", "", 100);

	/**
	 * 会社別名３.<p>
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
	 */
	public static final MCMeta CO_LNM3 = MCMeta.createStringMeta("CO_LNM3", "", 100);

	/**
	 * 会社別名４.<p>
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
	 */
	public static final MCMeta CO_LNM4 = MCMeta.createStringMeta("CO_LNM4", "", 100);

	/**
	 * 郵便番号.<p>
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
	public static final MCMeta ZIP_CD = MCMeta.createStringMeta("ZIP_CD", "", 10);

	/**
	 * 住所１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>250</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>40</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ADDR1 = MCMeta.createStringMeta("ADDR1", "", 250);

	/**
	 * 住所２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>250</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>40</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ADDR2 = MCMeta.createStringMeta("ADDR2", "", 250);

	/**
	 * 住所３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>250</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>40</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ADDR3 = MCMeta.createStringMeta("ADDR3", "", 250);

	/**
	 * 住所４.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>250</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>40</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ADDR4 = MCMeta.createStringMeta("ADDR4", "", 250);

	/**
	 * ＴＥＬ，ＦＡＸ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>30</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta TEL = MCMeta.createStringMeta("TEL", "", 30);

	/**
	 * 代表者名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_REPL_NM = MCMeta.createStringMeta("CO_REPL_NM", "", 50);

	/**
	 * 遅延日数.<p>
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
	public static final MCMeta DELAY_DAYS = MCMeta.createNumberMeta("DELAY_DAYS", "", 2, 0);

	/**
	 * 前後区分.<p>
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
	public static final MCMeta BA_TYP = MCMeta.createStringMeta("BA_TYP", "", 1);

	/**
	 * 前後区分名.<p>
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
	public static final MCMeta BA_TYP_NM = MCMeta.createStringMeta("BA_TYP_NM", "");

	/**
	 * 端数処理区分.<p>
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
	public static final MCMeta RND_TYP = MCMeta.createStringMeta("RND_TYP", "", 1);

	/**
	 * 端数処理区分名.<p>
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
	public static final MCMeta RND_TYP_NM = MCMeta.createStringMeta("RND_TYP_NM", "");

	/**
	 * 売上計上区分.<p>
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
	public static final MCMeta SLS_BASIS_TYP = MCMeta.createStringMeta("SLS_BASIS_TYP", "", 1);

	/**
	 * 売上計上区分名.<p>
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
	public static final MCMeta SLS_BASIS_TYP_NM = MCMeta.createStringMeta("SLS_BASIS_TYP_NM", "");

	/**
	 * 請求起算区分.<p>
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
	public static final MCMeta BILL_BASIS_TYP = MCMeta.createStringMeta("BILL_BASIS_TYP", "", 1);

	/**
	 * 請求起算区分名.<p>
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
	public static final MCMeta BILL_BASIS_TYP_NM = MCMeta.createStringMeta("BILL_BASIS_TYP_NM", "");

	/**
	 * 出荷予定分割区分.<p>
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
	public static final MCMeta SHIP_SCHD_SPLIT_TYP = MCMeta.createStringMeta("SHIP_SCHD_SPLIT_TYP", "", 1);

	/**
	 * 出荷予定分割区分名.<p>
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
	public static final MCMeta SHIP_SCHD_SPLIT_TYP_NM = MCMeta.createStringMeta("SHIP_SCHD_SPLIT_TYP_NM", "");

	/**
	 * 部門階層ＣＤ.<p>
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
	public static final MCMeta DPT_LVL_CD = MCMeta.createStringMeta("DPT_LVL_CD", "", 10);

	/**
	 * 部門階層名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>30</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta DPT_LVL_NM = MCMeta.createStringMeta("DPT_LVL_NM", "", 40);

	/**
	 * 担当者別名１.<p>
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
	 */
	public static final MCMeta USR_ALT_NM1 = MCMeta.createStringMeta("USR_ALT_NM1", "", 100);

	/**
	 * 担当者別名２.<p>
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
	 */
	public static final MCMeta USR_ALT_NM2 = MCMeta.createStringMeta("USR_ALT_NM2", "", 100);

	/**
	 * 担当者別名３.<p>
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
	 */
	public static final MCMeta USR_ALT_NM3 = MCMeta.createStringMeta("USR_ALT_NM3", "", 100);

	/**
	 * 担当者別名４.<p>
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
	 */
	public static final MCMeta USR_ALT_NM4 = MCMeta.createStringMeta("USR_ALT_NM4", "", 100);

	/**
	 * Ｅ－ｍａｉｌ.<p>
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
	public static final MCMeta EMAIL = MCMeta.createStringMeta("EMAIL", "", 100);

	/**
	 * 社員区分.<p>
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
	public static final MCMeta USR_COM_TYP = MCMeta.createStringMeta("USR_COM_TYP", "", 1);

	/**
	 * 社員区分名.<p>
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
	public static final MCMeta USR_COM_TYP_NM = MCMeta.createStringMeta("USR_COM_TYP_NM", "");

	/**
	 * 所属会社.<p>
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
	public static final MCMeta USR_COM = MCMeta.createStringMeta("USR_COM", "", 100);

	/**
	 * 担当者情報１.<p>
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
	public static final MCMeta USR_INFO1 = MCMeta.createStringMeta("USR_INFO1", "", 100);

	/**
	 * 担当者情報２.<p>
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
	public static final MCMeta USR_INFO2 = MCMeta.createStringMeta("USR_INFO2", "", 100);

	/**
	 * 担当者情報３.<p>
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
	public static final MCMeta USR_INFO3 = MCMeta.createStringMeta("USR_INFO3", "", 100);

	/**
	 * 担当者情報４.<p>
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
	public static final MCMeta USR_INFO4 = MCMeta.createStringMeta("USR_INFO4", "", 100);

	/**
	 * 担当者情報５.<p>
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
	public static final MCMeta USR_INFO5 = MCMeta.createStringMeta("USR_INFO5", "", 100);

	/**
	 * 担当者情報６.<p>
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
	public static final MCMeta USR_INFO6 = MCMeta.createStringMeta("USR_INFO6", "", 100);

	/**
	 * 担当者情報７.<p>
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
	public static final MCMeta USR_INFO7 = MCMeta.createStringMeta("USR_INFO7", "", 100);

	/**
	 * 担当者情報８.<p>
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
	public static final MCMeta USR_INFO8 = MCMeta.createStringMeta("USR_INFO8", "", 100);

	/**
	 * 担当者情報９.<p>
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
	public static final MCMeta USR_INFO9 = MCMeta.createStringMeta("USR_INFO9", "", 100);

	/**
	 * 担当者情報１０.<p>
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
	public static final MCMeta USR_INFO10 = MCMeta.createStringMeta("USR_INFO10", "", 100);

	/**
	 * 担当者情報１１.<p>
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
	public static final MCMeta USR_INFO11 = MCMeta.createStringMeta("USR_INFO11", "", 100);

	/**
	 * 担当者情報１２.<p>
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
	public static final MCMeta USR_INFO12 = MCMeta.createStringMeta("USR_INFO12", "", 100);

	/**
	 * 担当者情報１３.<p>
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
	public static final MCMeta USR_INFO13 = MCMeta.createStringMeta("USR_INFO13", "", 100);

	/**
	 * 担当者情報１４.<p>
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
	public static final MCMeta USR_INFO14 = MCMeta.createStringMeta("USR_INFO14", "", 100);

	/**
	 * 担当者情報１５.<p>
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
	public static final MCMeta USR_INFO15 = MCMeta.createStringMeta("USR_INFO15", "", 100);

	/**
	 * 担当者情報１６.<p>
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
	public static final MCMeta USR_INFO16 = MCMeta.createStringMeta("USR_INFO16", "", 100);

	/**
	 * 担当者情報１７.<p>
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
	public static final MCMeta USR_INFO17 = MCMeta.createStringMeta("USR_INFO17", "", 100);

	/**
	 * 担当者情報１８.<p>
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
	public static final MCMeta USR_INFO18 = MCMeta.createStringMeta("USR_INFO18", "", 100);

	/**
	 * 担当者情報１９.<p>
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
	public static final MCMeta USR_INFO19 = MCMeta.createStringMeta("USR_INFO19", "", 100);

	/**
	 * 担当者情報２０.<p>
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
	public static final MCMeta USR_INFO20 = MCMeta.createStringMeta("USR_INFO20", "", 100);

	/**
	 * データアクセスＣＤ.<p>
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
	public static final MCMeta DA_CD = MCMeta.createStringMeta("DA_CD", "", 10);

	/**
	 * データアクセス名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta DA_NM = MCMeta.createStringMeta("DA_NM", "", 40);

	/**
	 * 承認役割ＣＤ.<p>
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
	public static final MCMeta APRV_ROLE_CD = MCMeta.createStringMeta("APRV_ROLE_CD", "", 10);

	/**
	 * 承認役割名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta APRV_ROLE_NM = MCMeta.createStringMeta("APRV_ROLE_NM", "", 40);

	/**
	 * 承認機能区分.<p>
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
	public static final MCMeta APRV_FUNC_TYP = MCMeta.createStringMeta("APRV_FUNC_TYP", "", 2);

	/**
	 * 承認機能区分名.<p>
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
	public static final MCMeta APRV_FUNC_TYP_NM = MCMeta.createStringMeta("APRV_FUNC_TYP_NM", "");

	/**
	 * 承認状況区分.<p>
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
	public static final MCMeta APRV_STS_TYP = MCMeta.createStringMeta("APRV_STS_TYP", "", 1);

	/**
	 * 承認状況区分名.<p>
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
	public static final MCMeta APRV_STS_TYP_NM = MCMeta.createStringMeta("APRV_STS_TYP_NM", "");

	/**
	 * 承認明細状況区分.<p>
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
	public static final MCMeta APRV_D_STS_TYP = MCMeta.createStringMeta("APRV_D_STS_TYP", "", 1);

	/**
	 * 承認明細状況区分名.<p>
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
	public static final MCMeta APRV_D_STS_TYP_NM = MCMeta.createStringMeta("APRV_D_STS_TYP_NM", "");

	/**
	 * 承認ルートパタン.<p>
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
	public static final MCMeta APRV_RT_PTN = MCMeta.createStringMeta("APRV_RT_PTN", "", 10);

	/**
	 * 承認行番号.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>4,0</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta APRV_ROW_NUM = MCMeta.createNumberMeta("APRV_ROW_NUM", "", 4, 0);

	/**
	 * 結合条件区分.<p>
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
	public static final MCMeta BIND_COND_TYP = MCMeta.createStringMeta("BIND_COND_TYP", "", 1);

	/**
	 * 結合条件区分名.<p>
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
	public static final MCMeta BIND_COND_TYP_NM = MCMeta.createStringMeta("BIND_COND_TYP_NM", "");

	/**
	 * 承認拡張項目１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta APRV_EXT_KEY1 = MCMeta.createStringMeta("APRV_EXT_KEY1", "", 20);

	/**
	 * 承認拡張項目２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta APRV_EXT_KEY2 = MCMeta.createStringMeta("APRV_EXT_KEY2", "", 20);

	/**
	 * 承認拡張項目３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta APRV_EXT_KEY3 = MCMeta.createStringMeta("APRV_EXT_KEY3", "", 20);

	/**
	 * パラメータキー.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PARM_KEY = MCMeta.createStringMeta("PARM_KEY", "", 40);

	/**
	 * パラメータ値.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>200</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>50</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PARM_VAL = MCMeta.createStringMeta("PARM_VAL", "", 200);

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
	 * 発番業務区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>12</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta NUM_BIZ_TYP = MCMeta.createStringMeta("NUM_BIZ_TYP", "", 50);

	/**
	 * 発番業務区分名.<p>
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
	public static final MCMeta NUM_BIZ_TYP_NM = MCMeta.createStringMeta("NUM_BIZ_TYP_NM", "");

	/**
	 * 発番システム区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta NUM_SYS_TYP = MCMeta.createStringMeta("NUM_SYS_TYP", "", 50);

	/**
	 * 発番システム区分名.<p>
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
	public static final MCMeta NUM_SYS_TYP_NM = MCMeta.createStringMeta("NUM_SYS_TYP_NM", "");

	/**
	 * 発番パタンＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>10</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>7</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta NUM_PTN_CD = MCMeta.createStringMeta("NUM_PTN_CD", "", 10);

	/**
	 * 発番パタン名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>13</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta NUM_PTN_NM = MCMeta.createStringMeta("NUM_PTN_NM", "", 100);

	/**
	 * 要素区分.<p>
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
	public static final MCMeta ELM_TYP = MCMeta.createStringMeta("ELM_TYP", "", 10);

	/**
	 * 要素区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ELM_TYP_NM = MCMeta.createStringMeta("ELM_TYP_NM", "");

	/**
	 * 要素桁数.<p>
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
	public static final MCMeta NUM_ELM_D = MCMeta.createNumberMeta("NUM_ELM_D", "", 2, 0);

	/**
	 * 発番処理が裏で保持する値.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>45</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 * <br>
	 * CC_NUM_DGT.UNDISPと桁数が一致<br>
	 */
	public static final MCMeta NUMBERING_UNDISP = MCMeta.createStringMeta("NUMBERING_UNDISP", "", 45);

	/**
	 * 発番処理が返す値.<p>
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
	 * CC_NUM_DGT.DISPと桁数が一致<br>
	 */
	public static final MCMeta NUMBERING = MCMeta.createStringMeta("NUMBERING", "", 20);

	/**
	 * 発番桁埋め文字.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>2</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta NUM_PAD_STR = MCMeta.createStringMeta("NUM_PAD_STR", "", 1);

	/**
	 * シーケンス区分.<p>
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
	public static final MCMeta SEQ_TYP = MCMeta.createStringMeta("SEQ_TYP", "", 3);

	/**
	 * シーケンス区分名.<p>
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
	public static final MCMeta SEQ_TYP_NM = MCMeta.createStringMeta("SEQ_TYP_NM", "");

	/**
	 * 発番パタンの文字列要素.<p>
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
	 * NUMMBERING_UNDISPの桁以下<br>
	 */
	public static final MCMeta NUM_STR = MCMeta.createStringMeta("NUM_STR", "", 20);

	/**
	 * 発番パタンの数値要素.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>22,0</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 * <br>
	 * 総桁数がNUMMBERING_UNDISPの桁数以下<br>
	 */
	public static final MCMeta NUM_NUMBER = MCMeta.createNumberMeta("NUM_NUMBER", "", 22, 0);

	/**
	 * 発番のカウントアップする数.<p>
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
	public static final MCMeta NUM_INC = MCMeta.createNumberMeta("NUM_INC", "", 9, 0);

	/**
	 * シーケンスが管理する値.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20,0</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta NUM_SEQ = MCMeta.createNumberMeta("NUM_SEQ", "", 20, 0);

	/**
	 * 発番ＩＤ.<p>
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
	public static final MCMeta NUM_ID = MCMeta.createStringMeta("NUM_ID", "", 5);

	/**
	 * 要素ラベル名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>500</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ELM_LABEL_NM = MCMeta.createStringMeta("ELM_LABEL_NM", "", 500);

	/**
	 * 汎用分類ＣＤ.<p>
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
	public static final MCMeta GP_GRP_CD = MCMeta.createStringMeta("GP_GRP_CD", "", 5);

	/**
	 * 汎用分類名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_GRP_NM = MCMeta.createStringMeta("GP_GRP_NM", "", 40);

	/**
	 * 汎用キー１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_KEY1 = MCMeta.createStringMeta("GP_KEY1", "", 20);

	/**
	 * 汎用キー２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_KEY2 = MCMeta.createStringMeta("GP_KEY2", "", 20);

	/**
	 * 汎用キー３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_KEY3 = MCMeta.createStringMeta("GP_KEY3", "", 20);

	/**
	 * 汎用キー４.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_KEY4 = MCMeta.createStringMeta("GP_KEY4", "", 20);

	/**
	 * 汎用キー５.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_KEY5 = MCMeta.createStringMeta("GP_KEY5", "", 20);

	/**
	 * 汎用キー６.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_KEY6 = MCMeta.createStringMeta("GP_KEY6", "", 20);

	/**
	 * 汎用キー７.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_KEY7 = MCMeta.createStringMeta("GP_KEY7", "", 20);

	/**
	 * 汎用キー８.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_KEY8 = MCMeta.createStringMeta("GP_KEY8", "", 20);

	/**
	 * 汎用キー９.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_KEY9 = MCMeta.createStringMeta("GP_KEY9", "", 20);

	/**
	 * 汎用キー１０.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_KEY10 = MCMeta.createStringMeta("GP_KEY10", "", 20);

	/**
	 * 汎用文字列１.<p>
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
	public static final MCMeta GP_CHAR1 = MCMeta.createStringMeta("GP_CHAR1", "", 100);

	/**
	 * 汎用文字列２.<p>
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
	public static final MCMeta GP_CHAR2 = MCMeta.createStringMeta("GP_CHAR2", "", 100);

	/**
	 * 汎用文字列３.<p>
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
	public static final MCMeta GP_CHAR3 = MCMeta.createStringMeta("GP_CHAR3", "", 100);

	/**
	 * 汎用文字列４.<p>
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
	public static final MCMeta GP_CHAR4 = MCMeta.createStringMeta("GP_CHAR4", "", 100);

	/**
	 * 汎用文字列５.<p>
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
	public static final MCMeta GP_CHAR5 = MCMeta.createStringMeta("GP_CHAR5", "", 100);

	/**
	 * 汎用文字列６.<p>
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
	public static final MCMeta GP_CHAR6 = MCMeta.createStringMeta("GP_CHAR6", "", 100);

	/**
	 * 汎用文字列７.<p>
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
	public static final MCMeta GP_CHAR7 = MCMeta.createStringMeta("GP_CHAR7", "", 100);

	/**
	 * 汎用文字列８.<p>
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
	public static final MCMeta GP_CHAR8 = MCMeta.createStringMeta("GP_CHAR8", "", 100);

	/**
	 * 汎用文字列９.<p>
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
	public static final MCMeta GP_CHAR9 = MCMeta.createStringMeta("GP_CHAR9", "", 100);

	/**
	 * 汎用文字列１０.<p>
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
	public static final MCMeta GP_CHAR10 = MCMeta.createStringMeta("GP_CHAR10", "", 100);

	/**
	 * 汎用文字列１１.<p>
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
	public static final MCMeta GP_CHAR11 = MCMeta.createStringMeta("GP_CHAR11", "", 100);

	/**
	 * 汎用文字列１２.<p>
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
	public static final MCMeta GP_CHAR12 = MCMeta.createStringMeta("GP_CHAR12", "", 100);

	/**
	 * 汎用文字列１３.<p>
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
	public static final MCMeta GP_CHAR13 = MCMeta.createStringMeta("GP_CHAR13", "", 100);

	/**
	 * 汎用文字列１４.<p>
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
	public static final MCMeta GP_CHAR14 = MCMeta.createStringMeta("GP_CHAR14", "", 100);

	/**
	 * 汎用文字列１５.<p>
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
	public static final MCMeta GP_CHAR15 = MCMeta.createStringMeta("GP_CHAR15", "", 100);

	/**
	 * 汎用文字列１６.<p>
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
	public static final MCMeta GP_CHAR16 = MCMeta.createStringMeta("GP_CHAR16", "", 100);

	/**
	 * 汎用文字列１７.<p>
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
	public static final MCMeta GP_CHAR17 = MCMeta.createStringMeta("GP_CHAR17", "", 100);

	/**
	 * 汎用文字列１８.<p>
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
	public static final MCMeta GP_CHAR18 = MCMeta.createStringMeta("GP_CHAR18", "", 100);

	/**
	 * 汎用文字列１９.<p>
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
	public static final MCMeta GP_CHAR19 = MCMeta.createStringMeta("GP_CHAR19", "", 100);

	/**
	 * 汎用文字列２０.<p>
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
	public static final MCMeta GP_CHAR20 = MCMeta.createStringMeta("GP_CHAR20", "", 100);

	/**
	 * 汎用数値１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>21,8</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_NUM1 = MCMeta.createNumberMeta("GP_NUM1", "", 21, 8);

	/**
	 * 汎用数値２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>21,8</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_NUM2 = MCMeta.createNumberMeta("GP_NUM2", "", 21, 8);

	/**
	 * 汎用数値３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>21,8</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_NUM3 = MCMeta.createNumberMeta("GP_NUM3", "", 21, 8);

	/**
	 * 汎用数値４.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>21,8</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_NUM4 = MCMeta.createNumberMeta("GP_NUM4", "", 21, 8);

	/**
	 * 汎用数値５.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>21,8</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_NUM5 = MCMeta.createNumberMeta("GP_NUM5", "", 21, 8);

	/**
	 * 汎用数値６.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>21,8</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_NUM6 = MCMeta.createNumberMeta("GP_NUM6", "", 21, 8);

	/**
	 * 汎用数値７.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>21,8</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_NUM7 = MCMeta.createNumberMeta("GP_NUM7", "", 21, 8);

	/**
	 * 汎用数値８.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>21,8</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_NUM8 = MCMeta.createNumberMeta("GP_NUM8", "", 21, 8);

	/**
	 * 汎用数値９.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>21,8</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_NUM9 = MCMeta.createNumberMeta("GP_NUM9", "", 21, 8);

	/**
	 * 汎用数値１０.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>21,8</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_NUM10 = MCMeta.createNumberMeta("GP_NUM10", "", 21, 8);

	/**
	 * 汎用日付１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_DT1 = MCMeta.createDateMeta("GP_DT1", "");
	public static final String GP_DT1_FORMAT = "YMD";

	/**
	 * 汎用日付２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_DT2 = MCMeta.createDateMeta("GP_DT2", "");
	public static final String GP_DT2_FORMAT = "YMD";

	/**
	 * 汎用日付３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_DT3 = MCMeta.createDateMeta("GP_DT3", "");
	public static final String GP_DT3_FORMAT = "YMD";

	/**
	 * 汎用日付４.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_DT4 = MCMeta.createDateMeta("GP_DT4", "");
	public static final String GP_DT4_FORMAT = "YMD";

	/**
	 * 汎用日付５.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_DT5 = MCMeta.createDateMeta("GP_DT5", "");
	public static final String GP_DT5_FORMAT = "YMD";

	/**
	 * 汎用日付６.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_DT6 = MCMeta.createDateMeta("GP_DT6", "");
	public static final String GP_DT6_FORMAT = "YMD";

	/**
	 * 汎用日付７.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_DT7 = MCMeta.createDateMeta("GP_DT7", "");
	public static final String GP_DT7_FORMAT = "YMD";

	/**
	 * 汎用日付８.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_DT8 = MCMeta.createDateMeta("GP_DT8", "");
	public static final String GP_DT8_FORMAT = "YMD";

	/**
	 * 汎用日付９.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_DT9 = MCMeta.createDateMeta("GP_DT9", "");
	public static final String GP_DT9_FORMAT = "YMD";

	/**
	 * 汎用日付１０.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_DT10 = MCMeta.createDateMeta("GP_DT10", "");
	public static final String GP_DT10_FORMAT = "YMD";

	/**
	 * 期名称.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta TERM_NM = MCMeta.createStringMeta("TERM_NM", "", 40);

	/**
	 * 国ＣＤ.<p>
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
	public static final MCMeta CNTRY_CD = MCMeta.createStringMeta("CNTRY_CD", "", 2);

	/**
	 * 国名.<p>
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
	public static final MCMeta CNTRY_NM = MCMeta.createStringMeta("CNTRY_NM", "", 60);

	/**
	 * 地域ＣＤ.<p>
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
	public static final MCMeta AREA_CD = MCMeta.createStringMeta("AREA_CD", "", 3);

	/**
	 * 地域名.<p>
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
	public static final MCMeta AREA_NM = MCMeta.createStringMeta("AREA_NM", "", 60);

	/**
	 * 通貨ＣＤ.<p>
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
	public static final MCMeta CUR_CD = MCMeta.createStringMeta("CUR_CD", "", 3);

	/**
	 * 通貨名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CUR_NM = MCMeta.createStringMeta("CUR_NM", "", 40);

	/**
	 * 税ＣＤ.<p>
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
	public static final MCMeta TAX_CD = MCMeta.createStringMeta("TAX_CD", "", 5);

	/**
	 * 税名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta TAX_NM = MCMeta.createStringMeta("TAX_NM", "", 40);

	/**
	 * 税区分.<p>
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
	public static final MCMeta TAX_TYP = MCMeta.createStringMeta("TAX_TYP", "", 1);

	/**
	 * 税区分名.<p>
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
	public static final MCMeta TAX_TYP_NM = MCMeta.createStringMeta("TAX_TYP_NM", "");

	/**
	 * 税率.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>5,2</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta TAX_RATE = MCMeta.createNumberMeta("TAX_RATE", "", 5, 2);

	/**
	 * 銀行ＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>15</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BANK_CD = MCMeta.createStringMeta("BANK_CD", "", 15);

	/**
	 * 銀行名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BANK_NM = MCMeta.createStringMeta("BANK_NM", "", 40);

	/**
	 * 銀行支店ＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>15</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BANK_BRANCH_CD = MCMeta.createStringMeta("BANK_BRANCH_CD", "", 15);

	/**
	 * 銀行支店名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BANK_BRANCH_NM = MCMeta.createStringMeta("BANK_BRANCH_NM", "", 40);

	/**
	 * 口座ＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>7</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BANK_AC_CD = MCMeta.createStringMeta("BANK_AC_CD", "", 40);

	/**
	 * 口座名.<p>
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
	public static final MCMeta BANK_AC_NM = MCMeta.createStringMeta("BANK_AC_NM", "", 60);

	/**
	 * 口座番号.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BANK_AC_NO = MCMeta.createStringMeta("BANK_AC_NO", "", 40);

	/**
	 * 口座区分.<p>
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
	public static final MCMeta BANK_AC_TYP = MCMeta.createStringMeta("BANK_AC_TYP", "", 1);

	/**
	 * 口座区分名.<p>
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
	public static final MCMeta BANK_AC_TYP_NM = MCMeta.createStringMeta("BANK_AC_TYP_NM", "");

	/**
	 * 口座名義人.<p>
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
	public static final MCMeta BANK_AC_HOLDER = MCMeta.createStringMeta("BANK_AC_HOLDER", "", 100);

	/**
	 * 口座名義人サブ.<p>
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
	public static final MCMeta BANK_AC_HOLDER_SUB = MCMeta.createStringMeta("BANK_AC_HOLDER_SUB", "", 100);

	/**
	 * カレンダＣＤ.<p>
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
	public static final MCMeta CAL_CD = MCMeta.createStringMeta("CAL_CD", "", 10);

	/**
	 * カレンダ名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CAL_NM = MCMeta.createStringMeta("CAL_NM", "", 40);

	/**
	 * 為替レートＣＤ.<p>
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
	public static final MCMeta XRATE_CD = MCMeta.createStringMeta("XRATE_CD", "", 2);

	/**
	 * 為替レート名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta XRATE_NM = MCMeta.createStringMeta("XRATE_NM", "", 40);

	/**
	 * 為替レート.<p>
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
	public static final MCMeta XRATE = MCMeta.createNumberMeta("XRATE", "", 21, 8);

	/**
	 * 単位ＣＤ.<p>
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
	public static final MCMeta UNIT_CD = MCMeta.createStringMeta("UNIT_CD", "", 5);

	/**
	 * 単位名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta UNIT_NM = MCMeta.createStringMeta("UNIT_NM", "", 40);

	/**
	 * ＨＳ 分類ＣＤ.<p>
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
	public static final MCMeta HS_GRP_CD = MCMeta.createStringMeta("HS_GRP_CD", "", 4);

	/**
	 * ＨＳ 分類名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>500</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta HS_GRP_NM = MCMeta.createStringMeta("HS_GRP_NM", "", 500);

	/**
	 * ＨＳ 区分.<p>
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
	public static final MCMeta HS_TYP = MCMeta.createStringMeta("HS_TYP", "", 2);

	/**
	 * ＨＳ ＣＤ.<p>
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
	public static final MCMeta HS_CD = MCMeta.createStringMeta("HS_CD", "", 10);

	/**
	 * ＨＳ 内容.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>500</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>30</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta HS_NM = MCMeta.createStringMeta("HS_NM", "", 500);

	/**
	 * 品目分類区分.<p>
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
	public static final MCMeta ITM_GRP_TYP = MCMeta.createStringMeta("ITM_GRP_TYP", "", 2);

	/**
	 * 品目分類区分名.<p>
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
	public static final MCMeta ITM_GRP_TYP_NM = MCMeta.createStringMeta("ITM_GRP_TYP_NM", "");

	/**
	 * 品目分類ＣＤ.<p>
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
	public static final MCMeta ITM_ANLY_CD = MCMeta.createStringMeta("ITM_ANLY_CD", "", 10);

	/**
	 * 品目分類名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ITM_ANLY_NM = MCMeta.createStringMeta("ITM_ANLY_NM", "", 40);

	/**
	 * 品目区分.<p>
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
	public static final MCMeta ITM_TYP = MCMeta.createStringMeta("ITM_TYP", "", 1);

	/**
	 * 品目区分名.<p>
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
	public static final MCMeta ITM_TYP_NM = MCMeta.createStringMeta("ITM_TYP_NM", "");

	/**
	 * 品目区分詳細ＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>10</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>8</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ITM_TYP_D_CD = MCMeta.createStringMeta("ITM_TYP_D_CD", "", 10);

	/**
	 * 品目区分詳細名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ITM_TYP_D_NM = MCMeta.createStringMeta("ITM_TYP_D_NM", "", 40);

	/**
	 * 品目仕訳ＣＤ.<p>
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
	public static final MCMeta ITM_JNL_CD = MCMeta.createStringMeta("ITM_JNL_CD", "", 5);

	/**
	 * 品目仕訳名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ITM_JNL_NM = MCMeta.createStringMeta("ITM_JNL_NM", "", 40);

	/**
	 * 会計品目分類ＣＤ.<p>
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
	public static final MCMeta AC_ITM_GRP_CD = MCMeta.createStringMeta("AC_ITM_GRP_CD", "", 10);

	/**
	 * 会計品目分類名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta AC_ITM_GRP_NM = MCMeta.createStringMeta("AC_ITM_GRP_NM", "", 40);

	/**
	 * 会計理由ＣＤ.<p>
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
	public static final MCMeta AC_RSN_CD = MCMeta.createStringMeta("AC_RSN_CD", "", 10);

	/**
	 * 会計理由名.<p>
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
	public static final MCMeta AC_RSN_NM = MCMeta.createStringMeta("AC_RSN_NM", "", 100);

	/**
	 * 手形理由ＣＤ.<p>
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
	public static final MCMeta NOTE_RSN_CD = MCMeta.createStringMeta("NOTE_RSN_CD", "", 10);

	/**
	 * 手形理由名.<p>
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
	public static final MCMeta NOTE_RSN_NM = MCMeta.createStringMeta("NOTE_RSN_NM", "", 100);

	/**
	 * 業務理由ＣＤ.<p>
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
	public static final MCMeta BIZ_RSN_CD = MCMeta.createStringMeta("BIZ_RSN_CD", "", 10);

	/**
	 * 業務理由名.<p>
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
	public static final MCMeta BIZ_RSN_NM = MCMeta.createStringMeta("BIZ_RSN_NM", "", 100);

	/**
	 * 注文書表示ＣＤ.<p>
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
	public static final MCMeta PO_PRINT_CD = MCMeta.createStringMeta("PO_PRINT_CD", "", 5);

	/**
	 * 注文書表示名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PO_PRINT_NM = MCMeta.createStringMeta("PO_PRINT_NM", "", 40);

	/**
	 * 注文書表示テキスト.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1000</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>50</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PO_PRINT_TXT = MCMeta.createStringMeta("PO_PRINT_TXT", "", 1000);

	/**
	 * データ更新区分.<p>
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
	public static final MCMeta DATA_CRUD_TYP = MCMeta.createStringMeta("DATA_CRUD_TYP", "", 1);

	/**
	 * データ更新区分名.<p>
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
	public static final MCMeta DATA_CRUD_TYP_NM = MCMeta.createStringMeta("DATA_CRUD_TYP_NM", "");

	/**
	 * ＩＦデータＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>15,0</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_DATA_NO = MCMeta.createNumberMeta("IF_DATA_NO", "", 15, 0);

	/**
	 * ＩＦデータ行ＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>15,0</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_DATA_LNO = MCMeta.createNumberMeta("IF_DATA_LNO", "", 15, 0);

	/**
	 * ＩＦ外部システムデータＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>15,0</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_EXT_DATA_NO = MCMeta.createNumberMeta("IF_EXT_DATA_NO", "", 15, 0);

	/**
	 * ＩＦ外部システムデータ行ＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>15,0</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_EXT_DATA_LNO = MCMeta.createNumberMeta("IF_EXT_DATA_LNO", "", 15, 0);

	/**
	 * ＩＦ外部システムＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>500</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_EXT_SYS_CD = MCMeta.createStringMeta("IF_EXT_SYS_CD", "", 500);

	/**
	 * ＩＦ外部システム名.<p>
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
	public static final MCMeta IF_EXT_SYS_NM = MCMeta.createStringMeta("IF_EXT_SYS_NM", "", 100);

	/**
	 * 品目入力補助検索区分.<p>
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
	public static final MCMeta ITM_IS_SRCH_TYP = MCMeta.createStringMeta("ITM_IS_SRCH_TYP", "", 3);

	/**
	 * 品目入力補助検索区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>25</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ITM_IS_SRCH_TYP_NM = MCMeta.createStringMeta("ITM_IS_SRCH_TYP_NM", "");

	/**
	 * 取引先入力補助検索区分.<p>
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
	public static final MCMeta BP_IS_SRCH_TYP = MCMeta.createStringMeta("BP_IS_SRCH_TYP", "", 3);

	/**
	 * 取引先入力補助検索区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>25</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BP_IS_SRCH_TYP_NM = MCMeta.createStringMeta("BP_IS_SRCH_TYP_NM", "");

	/**
	 * 場所入力補助検索区分.<p>
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
	public static final MCMeta LOC_IS_SRCH_TYP = MCMeta.createStringMeta("LOC_IS_SRCH_TYP", "", 3);

	/**
	 * 場所入力補助検索区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>25</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta LOC_IS_SRCH_TYP_NM = MCMeta.createStringMeta("LOC_IS_SRCH_TYP_NM", "");

	/**
	 * 部門入力補助検索区分.<p>
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
	public static final MCMeta DPT_IS_SRCH_TYP = MCMeta.createStringMeta("DPT_IS_SRCH_TYP", "", 3);

	/**
	 * 部門入力補助検索区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>25</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta DPT_IS_SRCH_TYP_NM = MCMeta.createStringMeta("DPT_IS_SRCH_TYP_NM", "");

	/**
	 * 階層レベル.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>3,0</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>3</td>
	* </tr>
	 * </table>
	 * <br>
	 * 階層部品のレベル<br>
	 */
	public static final MCMeta TREE_LVL = MCMeta.createNumberMeta("TREE_LVL", "", 3, 0);

	/**
	 * 階層レベル文字列.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>5</td>
	* </tr>
	 * </table>
	 * <br>
	 * 階層部品のレベル用文字列<br>
	 */
	public static final MCMeta TREE_LVL_STR = MCMeta.createStringMeta("TREE_LVL_STR", "");

	/**
	 * 階層インデント表示用.<p>
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
	 * <br>
	 * ブランクを付けて階層表示するため表示幅は仕様画面ごとに調整すること<br>
	 */
	public static final MCMeta LEAF_STR = MCMeta.createStringMeta("LEAF_STR", "");

	/**
	 * 請求繰越回数.<p>
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
	public static final MCMeta CRRYOVR_TIMES = MCMeta.createNumberMeta("CRRYOVR_TIMES", "", 2, 0);

	/**
	 * 標準有効成分係数.<p>
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
	public static final MCMeta STD_CONT_FCTR = MCMeta.createNumberMeta("STD_CONT_FCTR", "", 21, 8);

	/**
	 * 実際有効成分係数.<p>
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
	public static final MCMeta ACT_CONT_FCTR = MCMeta.createNumberMeta("ACT_CONT_FCTR", "", 21, 8);

	/**
	 * 有効成分.<p>
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
	public static final MCMeta CONT_QTY = MCMeta.createNumberMeta("CONT_QTY", "", 21, 8);

	/**
	 * 仕入有効成分.<p>
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
	public static final MCMeta PURC_CONT_QTY = MCMeta.createNumberMeta("PURC_CONT_QTY", "", 21, 8);

	/**
	 * 仕入有効成分係数.<p>
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
	public static final MCMeta PURC_CONT_FCTR = MCMeta.createNumberMeta("PURC_CONT_FCTR", "", 21, 8);

	/**
	 * 容積.<p>
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
	public static final MCMeta DIM = MCMeta.createNumberMeta("DIM", "", 21, 8);

	/**
	 * 重量.<p>
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
	public static final MCMeta WT = MCMeta.createNumberMeta("WT", "", 21, 8);

	/**
	 * 摘要.<p>
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
	public static final MCMeta ABSTRACT_M = MCMeta.createStringMeta("ABSTRACT_M", "", 40);

	/**
	 * 手形摘要区分.<p>
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
	public static final MCMeta ABS_B_TYP = MCMeta.createStringMeta("ABS_B_TYP", "", 1);

	/**
	 * 手形摘要区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ABS_B_TYP_NM = MCMeta.createStringMeta("ABS_B_TYP_NM", "");

	/**
	 * 摘要区分.<p>
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
	public static final MCMeta ABS_TYP = MCMeta.createStringMeta("ABS_TYP", "", 1);

	/**
	 * 摘要区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>22</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ABS_TYP_NM = MCMeta.createStringMeta("ABS_TYP_NM", "");

	/**
	 * 勘定科目区分.<p>
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
	public static final MCMeta AC_CD_TYP = MCMeta.createStringMeta("AC_CD_TYP", "", 1);

	/**
	 * 勘定科目区分名.<p>
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
	public static final MCMeta AC_CD_TYP_NM = MCMeta.createStringMeta("AC_CD_TYP_NM", "");

	/**
	 * 会計部門ＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>7</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta AC_DPT_CD = MCMeta.createStringMeta("AC_DPT_CD", "", 20);

	/**
	 * 会計部門名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>14</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta AC_DPT_NM = MCMeta.createStringMeta("AC_DPT_NM", "", 100);

	/**
	 * 会計ＩＦ区分.<p>
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
	public static final MCMeta AC_IF_TYP = MCMeta.createStringMeta("AC_IF_TYP", "", 1);

	/**
	 * 会計ＩＦ区分名.<p>
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
	public static final MCMeta AC_IF_TYP_NM = MCMeta.createStringMeta("AC_IF_TYP_NM", "");

	/**
	 * 勘定科目ＣＤ.<p>
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
	public static final MCMeta AC_CD = MCMeta.createStringMeta("AC_CD", "", 10);

	/**
	 * 勘定科目名称.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta AC_NM = MCMeta.createStringMeta("AC_NM", "", 40);

	/**
	 * 勘定科目略名.<p>
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
	public static final MCMeta AC_NM2 = MCMeta.createStringMeta("AC_NM2", "", 20);

	/**
	 * 会計伝票区分.<p>
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
	public static final MCMeta AC_SLIP_TYP = MCMeta.createStringMeta("AC_SLIP_TYP", "", 5);

	/**
	 * 会計伝票区分名.<p>
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
	public static final MCMeta AC_SLIP_TYP_NM = MCMeta.createStringMeta("AC_SLIP_TYP_NM", "");

	/**
	 * 予備科目区分.<p>
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
	public static final MCMeta AC_SUBTYP = MCMeta.createStringMeta("AC_SUBTYP", "", 2);

	/**
	 * 予備科目区分名.<p>
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
	public static final MCMeta AC_SUBTYP_NM = MCMeta.createStringMeta("AC_SUBTYP_NM", "");

	/**
	 * 科目区分値.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>10</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>5</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta AC_TYP = MCMeta.createStringMeta("AC_TYP", "", 10);

	/**
	 * 科目区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta AC_TYP_NM = MCMeta.createStringMeta("AC_TYP_NM", "", 40);

	/**
	 * 金額符号区分.<p>
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
	public static final MCMeta AMT_SIGN_TYP = MCMeta.createStringMeta("AMT_SIGN_TYP", "", 1);

	/**
	 * 金額符号区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>19</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta AMT_SIGN_TYP_NM = MCMeta.createStringMeta("AMT_SIGN_TYP_NM", "");

	/**
	 * 仕訳金額区分.<p>
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
	public static final MCMeta AMT_TYP = MCMeta.createStringMeta("AMT_TYP", "", 1);

	/**
	 * 仕訳金額区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>25</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta AMT_TYP_NM = MCMeta.createStringMeta("AMT_TYP_NM", "");

	/**
	 * 資産管理区分.<p>
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
	public static final MCMeta ASSET_MNG_TYP = MCMeta.createStringMeta("ASSET_MNG_TYP", "", 1);

	/**
	 * 資産管理区分名.<p>
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
	public static final MCMeta ASSET_MNG_TYP_NM = MCMeta.createStringMeta("ASSET_MNG_TYP_NM", "");

	/**
	 * 資産区分.<p>
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
	public static final MCMeta ASST_TYP = MCMeta.createStringMeta("ASST_TYP", "", 1);

	/**
	 * 資産区分名.<p>
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
	public static final MCMeta ASST_TYP_NM = MCMeta.createStringMeta("ASST_TYP_NM", "");

	/**
	 * 付加情報キー１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ATTACH_INFO_KEY1 = MCMeta.createStringMeta("ATTACH_INFO_KEY1", "", 50);

	/**
	 * 付加情報キー２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ATTACH_INFO_KEY2 = MCMeta.createStringMeta("ATTACH_INFO_KEY2", "", 50);

	/**
	 * 付加情報キー３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ATTACH_INFO_KEY3 = MCMeta.createStringMeta("ATTACH_INFO_KEY3", "", 50);

	/**
	 * 付加情報キー４.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ATTACH_INFO_KEY4 = MCMeta.createStringMeta("ATTACH_INFO_KEY4", "", 50);

	/**
	 * 付加情報キー５.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ATTACH_INFO_KEY5 = MCMeta.createStringMeta("ATTACH_INFO_KEY5", "", 50);

	/**
	 * 付加情報ＩＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ATTACH_INFO_ID = MCMeta.createStringMeta("ATTACH_INFO_ID", "", 20);

	/**
	 * 付加情報見出し.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>50</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ATTACH_INFO_RMRKS = MCMeta.createStringMeta("ATTACH_INFO_RMRKS", "", 100);

	/**
	 * 付加情報パス.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>200</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ATTACH_INFO_PATH = MCMeta.createStringMeta("ATTACH_INFO_PATH", "", 200);

	/**
	 * 付加情報バイナリデータ名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>200</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ATTACH_INFO_BIN_NM = MCMeta.createStringMeta("ATTACH_INFO_BIN_NM", "", 200);

	/**
	 * 付加情報区分.<p>
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
	public static final MCMeta ATTACH_INFO_TYP = MCMeta.createStringMeta("ATTACH_INFO_TYP", "", 1);

	/**
	 * 付加情報区分名.<p>
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
	public static final MCMeta ATTACH_INFO_TYP_NM = MCMeta.createStringMeta("ATTACH_INFO_TYP_NM", "");

	/**
	 * 自動仕訳グループ.<p>
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
	public static final MCMeta AUTO_JNL_GRP = MCMeta.createStringMeta("AUTO_JNL_GRP", "", 5);

	/**
	 * 自動仕訳キーＣＤ.<p>
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
	public static final MCMeta AUTO_JNL_KEY_CD = MCMeta.createStringMeta("AUTO_JNL_KEY_CD", "", 5);

	/**
	 * 自動仕訳キー名称.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta AUTO_JNL_KEY_NM = MCMeta.createStringMeta("AUTO_JNL_KEY_NM", "", 40);

	/**
	 * 請求部門区分.<p>
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
	public static final MCMeta BILL_DPT_TYP = MCMeta.createStringMeta("BILL_DPT_TYP", "", 1);

	/**
	 * 請求部門区分名.<p>
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
	public static final MCMeta BILL_DPT_TYP_NM = MCMeta.createStringMeta("BILL_DPT_TYP_NM", "");

	/**
	 * 債権部門区分.<p>
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
	public static final MCMeta AR_DPT_TYP = MCMeta.createStringMeta("AR_DPT_TYP", "", 1);

	/**
	 * 債権部門区分名.<p>
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
	public static final MCMeta AR_DPT_TYP_NM = MCMeta.createStringMeta("AR_DPT_TYP_NM", "");

	/**
	 * 請求書宛先.<p>
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
	public static final MCMeta BILL_BCST_NM = MCMeta.createStringMeta("BILL_BCST_NM", "", 100);

	/**
	 * 請求締処理区分.<p>
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
	public static final MCMeta BILL_CL_TYP = MCMeta.createStringMeta("BILL_CL_TYP", "", 1);

	/**
	 * 請求締処理区分名.<p>
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
	public static final MCMeta BILL_CL_TYP_NM = MCMeta.createStringMeta("BILL_CL_TYP_NM", "");

	/**
	 * 請求書明細改頁区分.<p>
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
	public static final MCMeta BILL_DTL_BRK_TYP = MCMeta.createStringMeta("BILL_DTL_BRK_TYP", "", 1);

	/**
	 * 請求書明細改頁区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BILL_DTL_BRK_TYP_NM = MCMeta.createStringMeta("BILL_DTL_BRK_TYP_NM", "");

	/**
	 * 請求書明細並順区分.<p>
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
	public static final MCMeta BILL_DTL_SORT_TYP = MCMeta.createStringMeta("BILL_DTL_SORT_TYP", "", 1);

	/**
	 * 請求書明細並順区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BILL_DTL_SORT_TYP_NM = MCMeta.createStringMeta("BILL_DTL_SORT_TYP_NM", "");

	/**
	 * 請求書明細小計区分.<p>
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
	public static final MCMeta BILL_DTL_SUBTTL_TYP = MCMeta.createStringMeta("BILL_DTL_SUBTTL_TYP", "", 1);

	/**
	 * 請求書明細小計区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BILL_DTL_SUBTTL_TYP_NM = MCMeta.createStringMeta("BILL_DTL_SUBTTL_TYP_NM", "");

	/**
	 * 座席区分.<p>
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
	public static final MCMeta BK_TYP = MCMeta.createStringMeta("BK_TYP", "", 1);

	/**
	 * 座席区分名.<p>
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
	public static final MCMeta BK_TYP_NM = MCMeta.createStringMeta("BK_TYP_NM", "");

	/**
	 * 構成パタン.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_PTN = MCMeta.createStringMeta("BOM_PTN", "", 40);

	/**
	 * ＢＯＭ階層.<p>
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
	public static final MCMeta BOM_LVL = MCMeta.createNumberMeta("BOM_LVL", "", 3, 0);

	/**
	 * 取引先配賦グループ.<p>
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
	public static final MCMeta BP_ALC_GRP = MCMeta.createStringMeta("BP_ALC_GRP", "", 10);

	/**
	 * 請求書送付部署.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>35</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BP_CNTCT_DPT = MCMeta.createStringMeta("BP_CNTCT_DPT", "", 100);

	/**
	 * 請求書送付担当者名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>35</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BP_CNTCT_PSN = MCMeta.createStringMeta("BP_CNTCT_PSN", "", 100);

	/**
	 * 支払通知書宛先.<p>
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
	public static final MCMeta PAY_NTC_BSPPL_NM = MCMeta.createStringMeta("PAY_NTC_BSPPL_NM", "", 100);

	/**
	 * 支払通知書送付部署名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>35</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PAY_NTC_BSPPL_DPT = MCMeta.createStringMeta("PAY_NTC_BSPPL_DPT", "", 100);

	/**
	 * 支払通知書送付担当者名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>35</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PAY_NTC_BSPPL_PSN = MCMeta.createStringMeta("PAY_NTC_BSPPL_PSN", "", 100);

	/**
	 * 支払通知書明細改頁区分.<p>
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
	public static final MCMeta PAY_NTC_DTL_BRK_TYP = MCMeta.createStringMeta("PAY_NTC_DTL_BRK_TYP", "", 1);

	/**
	 * 支払通知書明細改頁区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PAY_NTC_DTL_BRK_TYP_NM = MCMeta.createStringMeta("PAY_NTC_DTL_BRK_TYP_NM", "");

	/**
	 * 支払通知書明細並順区分.<p>
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
	public static final MCMeta PAY_NTC_DTL_SORT_TYP = MCMeta.createStringMeta("PAY_NTC_DTL_SORT_TYP", "", 1);

	/**
	 * 支払通知書明細並順区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PAY_NTC_DTL_SORT_TYP_NM = MCMeta.createStringMeta("PAY_NTC_DTL_SORT_TYP_NM", "");

	/**
	 * 支払通知書明細小計区分.<p>
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
	public static final MCMeta PAY_NTC_DTL_SUBTTL_TYP = MCMeta.createStringMeta("PAY_NTC_DTL_SUBTTL_TYP", "", 1);

	/**
	 * 支払通知書明細小計区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PAY_NTC_DTL_SUBTTL_TYP_NM = MCMeta.createStringMeta("PAY_NTC_DTL_SUBTTL_TYP_NM", "");

	/**
	 * 支払通知書取消伝票表示区分.<p>
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
	public static final MCMeta PAY_NTC_CAN_SLIP_TYP = MCMeta.createStringMeta("PAY_NTC_CAN_SLIP_TYP", "", 1);

	/**
	 * 支払通知書取消伝票表示区分名.<p>
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
	public static final MCMeta PAY_NTC_CAN_SLIP_TYP_NM = MCMeta.createStringMeta("PAY_NTC_CAN_SLIP_TYP_NM", "");

	/**
	 * 取引先分類ＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>10</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>8</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BP_GRP_CD = MCMeta.createStringMeta("BP_GRP_CD", "", 10);

	/**
	 * 取引先分類名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BP_GRP_NM = MCMeta.createStringMeta("BP_GRP_NM", "", 40);

	/**
	 * 取引先分類区分.<p>
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
	public static final MCMeta BP_GRP_TYP = MCMeta.createStringMeta("BP_GRP_TYP", "", 2);

	/**
	 * 取引先分類区分名.<p>
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
	public static final MCMeta BP_GRP_TYP_NM = MCMeta.createStringMeta("BP_GRP_TYP_NM", "");

	/**
	 * 販売分析ＣＤ.<p>
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
	public static final MCMeta SLS_ANLY_CD = MCMeta.createStringMeta("SLS_ANLY_CD", "", 10);

	/**
	 * 販売分析名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SLS_ANLY_NM = MCMeta.createStringMeta("SLS_ANLY_NM", "", 40);

	/**
	 * 販売分析区分.<p>
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
	public static final MCMeta SLS_ANLY_TYP = MCMeta.createStringMeta("SLS_ANLY_TYP", "", 1);

	/**
	 * 販売分析区分名.<p>
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
	public static final MCMeta SLS_ANLY_TYP_NM = MCMeta.createStringMeta("SLS_ANLY_TYP_NM", "");

	/**
	 * 得意先担当者敬称.<p>
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
	public static final MCMeta BP_PSN_TITLE = MCMeta.createStringMeta("BP_PSN_TITLE", "", 10);

	/**
	 * 取引先出力区分.<p>
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
	public static final MCMeta BP_SET_TYP = MCMeta.createStringMeta("BP_SET_TYP", "", 1);

	/**
	 * 取引先出力区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BP_SET_TYP_NM = MCMeta.createStringMeta("BP_SET_TYP_NM", "");

	/**
	 * 取消理由ＣＤ.<p>
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
	public static final MCMeta CAN_RSN_CD = MCMeta.createStringMeta("CAN_RSN_CD", "", 10);

	/**
	 * 取消理由名.<p>
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
	public static final MCMeta CAN_RSN_NM = MCMeta.createStringMeta("CAN_RSN_NM", "", 100);

	/**
	 * 能力単位名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CAPACITY_UNIT_NM = MCMeta.createStringMeta("CAPACITY_UNIT_NM", "", 40);

	/**
	 * 決算仕訳区分.<p>
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
	public static final MCMeta CLS_JNL_TYP = MCMeta.createStringMeta("CLS_JNL_TYP", "", 1);

	/**
	 * 決算仕訳区分名.<p>
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
	public static final MCMeta CLS_JNL_TYP_NM = MCMeta.createStringMeta("CLS_JNL_TYP_NM", "");

	/**
	 * 相手先部署.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>35</td>
	* </tr>
	 * </table>
	 * <br>
	 * 発注先や得意先の部署<br>
	 */
	public static final MCMeta CNTCT_DPT = MCMeta.createStringMeta("CNTCT_DPT", "", 100);

	/**
	 * 相手先担当者.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>35</td>
	* </tr>
	 * </table>
	 * <br>
	 * 発注先や得意先の担当者<br>
	 */
	public static final MCMeta CNTCT_PSN = MCMeta.createStringMeta("CNTCT_PSN", "", 100);

	/**
	 * 梱包容器ＣＤ.<p>
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
	public static final MCMeta CNTNR_CD = MCMeta.createStringMeta("CNTNR_CD", "", 5);

	/**
	 * 梱包容器名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CNTNR_NM = MCMeta.createStringMeta("CNTNR_NM", "", 40);

	/**
	 * 原価部門ＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>13</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta COST_DPT_CD = MCMeta.createStringMeta("COST_DPT_CD", "", 20);

	/**
	 * 原価部門名.<p>
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
	public static final MCMeta COST_DPT_NM = MCMeta.createStringMeta("COST_DPT_NM", "", 100);

	/**
	 * 限度額超過処理区分.<p>
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
	public static final MCMeta CRED_ACT_TYP = MCMeta.createStringMeta("CRED_ACT_TYP", "", 1);

	/**
	 * 限度額超過処理区分名.<p>
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
	public static final MCMeta CRED_ACT_TYP_NM = MCMeta.createStringMeta("CRED_ACT_TYP_NM", "");

	/**
	 * 売上税計算区分.<p>
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
	public static final MCMeta TAX_CALC_TYP = MCMeta.createStringMeta("TAX_CALC_TYP", "", 1);

	/**
	 * 売上税計算区分名.<p>
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
	public static final MCMeta TAX_CALC_TYP_NM = MCMeta.createStringMeta("TAX_CALC_TYP_NM", "");

	/**
	 * 貸借区分.<p>
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
	public static final MCMeta DC_TYP = MCMeta.createStringMeta("DC_TYP", "", 1);

	/**
	 * 貸借区分名.<p>
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
	public static final MCMeta DC_TYP_NM = MCMeta.createStringMeta("DC_TYP_NM", "");

	/**
	 * 需要ＣＤ.<p>
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
	public static final MCMeta DEMAND_CD = MCMeta.createStringMeta("DEMAND_CD", "", 10);

	/**
	 * 需要名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta DEMAND_NM = MCMeta.createStringMeta("DEMAND_NM", "", 40);

	/**
	 * 物流グループＣＤ.<p>
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
	public static final MCMeta LG_GRP_CD = MCMeta.createStringMeta("LG_GRP_CD", "", 10);

	/**
	 * 物流グループ名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta LG_GRP_NM = MCMeta.createStringMeta("LG_GRP_NM", "", 40);

	/**
	 * 仕訳部門区分.<p>
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
	public static final MCMeta DPT_TYP = MCMeta.createStringMeta("DPT_TYP", "", 1);

	/**
	 * 仕訳部門区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta DPT_TYP_NM = MCMeta.createStringMeta("DPT_TYP_NM", "");

	/**
	 * 法人番号.<p>
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
	public static final MCMeta EIN = MCMeta.createStringMeta("EIN", "", 13);

	/**
	 * 輸出入諸掛区分.<p>
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
	public static final MCMeta EXIM_XPNS_TYP = MCMeta.createStringMeta("EXIM_XPNS_TYP", "", 1);

	/**
	 * 輸出入諸掛区分名.<p>
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
	public static final MCMeta EXIM_XPNS_TYP_NM = MCMeta.createStringMeta("EXIM_XPNS_TYP_NM", "");

	/**
	 * 国外取引区分.<p>
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
	public static final MCMeta FOREIGN_TYP = MCMeta.createStringMeta("FOREIGN_TYP", "", 1);

	/**
	 * 国外取引区分名.<p>
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
	public static final MCMeta FOREIGN_TYP_NM = MCMeta.createStringMeta("FOREIGN_TYP_NM", "");

	/**
	 * ＧＴＩＮ ＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>14</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GTIN_CD = MCMeta.createStringMeta("GTIN_CD", "", 14);

	/**
	 * 伝票ＩＤ区分.<p>
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
	public static final MCMeta ID_TYP = MCMeta.createStringMeta("ID_TYP", "", 1);

	/**
	 * 伝票ＩＤ区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>12</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ID_TYP_NM = MCMeta.createStringMeta("ID_TYP_NM", "");

	/**
	 * 在庫場所区分.<p>
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
	public static final MCMeta INV_LOC_TYP = MCMeta.createStringMeta("INV_LOC_TYP", "", 1);

	/**
	 * 在庫場所区分名.<p>
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
	public static final MCMeta INV_LOC_TYP_NM = MCMeta.createStringMeta("INV_LOC_TYP_NM", "");

	/**
	 * ＩＴＦ ＣＤ.<p>
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
	public static final MCMeta ITF_CD = MCMeta.createStringMeta("ITF_CD", "", 16);

	/**
	 * 品目出荷グループＣＤ.<p>
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
	public static final MCMeta ITM_SHIP_GRP_CD = MCMeta.createStringMeta("ITM_SHIP_GRP_CD", "", 5);

	/**
	 * 品目出荷グループ名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ITM_SHIP_GRP_NM = MCMeta.createStringMeta("ITM_SHIP_GRP_NM", "", 40);

	/**
	 * 品目構成グループＣＤ.<p>
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
	public static final MCMeta ITM_COMP_GRP_CD = MCMeta.createStringMeta("ITM_COMP_GRP_CD", "", 10);

	/**
	 * 品目構成グループ名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ITM_COMP_GRP_NM = MCMeta.createStringMeta("ITM_COMP_GRP_NM", "", 40);

	/**
	 * 品目分類ＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>10</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>8</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ITM_GRP_CD = MCMeta.createStringMeta("ITM_GRP_CD", "", 10);

	/**
	 * 品目分類名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ITM_GRP_NM = MCMeta.createStringMeta("ITM_GRP_NM", "", 40);

	/**
	 * 販売品目体系ＣＤ.<p>
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
	public static final MCMeta SLS_ITM_GRP_CD = MCMeta.createStringMeta("SLS_ITM_GRP_CD", "", 10);

	/**
	 * 販売品目体系名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SLS_ITM_GRP_NM = MCMeta.createStringMeta("SLS_ITM_GRP_NM", "", 40);

	/**
	 * 販売品目体系パス.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1000</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SLS_ITM_GRP_PATH = MCMeta.createStringMeta("SLS_ITM_GRP_PATH", "", 1000);

	/**
	 * 品目出力区分.<p>
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
	public static final MCMeta ITM_SET_TYP = MCMeta.createStringMeta("ITM_SET_TYP", "", 1);

	/**
	 * 品目出力区分名.<p>
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
	public static final MCMeta ITM_SET_TYP_NM = MCMeta.createStringMeta("ITM_SET_TYP_NM", "");

	/**
	 * 品目仕様分類ＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>10</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>8</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ITM_SPEC_GRP_CD = MCMeta.createStringMeta("ITM_SPEC_GRP_CD", "", 10);

	/**
	 * 品目仕様分類名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ITM_SPEC_GRP_NM = MCMeta.createStringMeta("ITM_SPEC_GRP_NM", "", 40);

	/**
	 * ＪＡＮ ＣＤ.<p>
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
	public static final MCMeta JAN_CD = MCMeta.createStringMeta("JAN_CD", "", 13);

	/**
	 * ＪＡＮ区分.<p>
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
	public static final MCMeta JAN_TYP = MCMeta.createStringMeta("JAN_TYP", "", 1);

	/**
	 * ＪＡＮ区分名.<p>
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
	public static final MCMeta JAN_TYP_NM = MCMeta.createStringMeta("JAN_TYP_NM", "");

	/**
	 * 仕訳実行ＣＤ.<p>
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
	public static final MCMeta JNL_ACT_CD = MCMeta.createStringMeta("JNL_ACT_CD", "", 1);

	/**
	 * 仕訳実行名称.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta JNL_ACT_NM = MCMeta.createStringMeta("JNL_ACT_NM", "", 40);

	/**
	 * 仕訳グループＣＤ.<p>
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
	public static final MCMeta JNL_GRP_CD = MCMeta.createStringMeta("JNL_GRP_CD", "", 5);

	/**
	 * 仕訳グループ名称.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>30</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta JNL_GRP_NM = MCMeta.createStringMeta("JNL_GRP_NM", "", 40);

	/**
	 * 仕訳キー項目１.<p>
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
	public static final MCMeta JNL_KEY1 = MCMeta.createStringMeta("JNL_KEY1", "", 20);

	/**
	 * 仕訳キー項目２.<p>
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
	public static final MCMeta JNL_KEY2 = MCMeta.createStringMeta("JNL_KEY2", "", 20);

	/**
	 * 仕訳キー項目３.<p>
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
	public static final MCMeta JNL_KEY3 = MCMeta.createStringMeta("JNL_KEY3", "", 20);

	/**
	 * 仕訳キー項目４.<p>
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
	public static final MCMeta JNL_KEY4 = MCMeta.createStringMeta("JNL_KEY4", "", 20);

	/**
	 * 仕訳キー項目５.<p>
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
	public static final MCMeta JNL_KEY5 = MCMeta.createStringMeta("JNL_KEY5", "", 20);

	/**
	 * 仕訳キー項目６.<p>
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
	public static final MCMeta JNL_KEY6 = MCMeta.createStringMeta("JNL_KEY6", "", 20);

	/**
	 * 仕訳キー項目７.<p>
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
	public static final MCMeta JNL_KEY7 = MCMeta.createStringMeta("JNL_KEY7", "", 20);

	/**
	 * 仕訳キー項目８.<p>
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
	public static final MCMeta JNL_KEY8 = MCMeta.createStringMeta("JNL_KEY8", "", 20);

	/**
	 * 仕訳キー項目９.<p>
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
	public static final MCMeta JNL_KEY9 = MCMeta.createStringMeta("JNL_KEY9", "", 20);

	/**
	 * 仕訳キー項目１０.<p>
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
	public static final MCMeta JNL_KEY10 = MCMeta.createStringMeta("JNL_KEY10", "", 20);

	/**
	 * 仕訳パタンＣＤ.<p>
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
	public static final MCMeta JNL_PTN_CD = MCMeta.createStringMeta("JNL_PTN_CD", "", 20);

	/**
	 * 仕訳パタン名称.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta JNL_PTN_NM = MCMeta.createStringMeta("JNL_PTN_NM", "", 40);

	/**
	 * 場所配賦グループ.<p>
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
	public static final MCMeta LOC_ALC_GRP = MCMeta.createStringMeta("LOC_ALC_GRP", "", 10);

	/**
	 * 場所ＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta LOC_CD = MCMeta.createStringMeta("LOC_CD", "", 20);

	/**
	 * 場所名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta LOC_NM = MCMeta.createStringMeta("LOC_NM", "", 40);

	/**
	 * 製造場所グループＣＤ.<p>
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
	public static final MCMeta LOC_GRP_CD = MCMeta.createStringMeta("LOC_GRP_CD", "", 10);

	/**
	 * 製造場所グループ名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta LOC_GRP_NM = MCMeta.createStringMeta("LOC_GRP_NM", "", 40);

	/**
	 * 管轄区分.<p>
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
	public static final MCMeta LOC_MNG_TYP = MCMeta.createStringMeta("LOC_MNG_TYP", "", 1);

	/**
	 * 管轄区分名.<p>
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
	public static final MCMeta LOC_MNG_TYP_NM = MCMeta.createStringMeta("LOC_MNG_TYP_NM", "");

	/**
	 * ロット逆転禁止区分.<p>
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
	public static final MCMeta LOT_BACK_STOP_TYP = MCMeta.createStringMeta("LOT_BACK_STOP_TYP", "", 1);

	/**
	 * ロット逆転禁止区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta LOT_BACK_STOP_TYP_NM = MCMeta.createStringMeta("LOT_BACK_STOP_TYP_NM", "");

	/**
	 * ロット管理区分.<p>
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
	public static final MCMeta LOT_MNG_TYP = MCMeta.createStringMeta("LOT_MNG_TYP", "", 1);

	/**
	 * ロット管理区分名.<p>
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
	public static final MCMeta LOT_MNG_TYP_NM = MCMeta.createStringMeta("LOT_MNG_TYP_NM", "");

	/**
	 * ロットＮＯ発番区分.<p>
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
	public static final MCMeta LOT_NO_TYP = MCMeta.createStringMeta("LOT_NO_TYP", "", 1);

	/**
	 * ロットＮＯ発番区分名.<p>
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
	public static final MCMeta LOT_NO_TYP_NM = MCMeta.createStringMeta("LOT_NO_TYP_NM", "");

	/**
	 * 工程配賦グループ.<p>
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
	public static final MCMeta OPER_ALC_GRP = MCMeta.createStringMeta("OPER_ALC_GRP", "", 10);

	/**
	 * 工程ＣＤ.<p>
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
	public static final MCMeta OPER_CD = MCMeta.createStringMeta("OPER_CD", "", 10);

	/**
	 * 工程名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta OPER_NM = MCMeta.createStringMeta("OPER_NM", "", 40);

	/**
	 * 仕訳パタン設定区分.<p>
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
	public static final MCMeta PTN_TYP = MCMeta.createStringMeta("PTN_TYP", "", 1);

	/**
	 * 仕訳パタン設定区分名.<p>
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
	public static final MCMeta PTN_TYP_NM = MCMeta.createStringMeta("PTN_TYP_NM", "");

	/**
	 * 購買内示グループＣＤ.<p>
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
	public static final MCMeta PF_GRP_CD = MCMeta.createStringMeta("PF_GRP_CD", "", 5);

	/**
	 * 購買内示グループ名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PF_GRP_NM = MCMeta.createStringMeta("PF_GRP_NM", "", 40);

	/**
	 * 購買内示期間.<p>
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
	public static final MCMeta PF_PERIOD = MCMeta.createNumberMeta("PF_PERIOD", "", 2, 0);

	/**
	 * ワーキンググループＣＤ.<p>
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
	public static final MCMeta WG_CD = MCMeta.createStringMeta("WG_CD", "", 10);

	/**
	 * ワーキンググループ名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta WG_NM = MCMeta.createStringMeta("WG_NM", "", 40);

	/**
	 * 港ＣＤ.<p>
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
	public static final MCMeta PORT_CD = MCMeta.createStringMeta("PORT_CD", "", 5);

	/**
	 * 港名.<p>
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
	public static final MCMeta PORT_NM = MCMeta.createStringMeta("PORT_NM", "", 100);

	/**
	 * ＭＲＰ発番用接頭語.<p>
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
	public static final MCMeta MRP_PREFIX = MCMeta.createStringMeta("MRP_PREFIX", "", 1);

	/**
	 * 支給計上区分.<p>
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
	public static final MCMeta PROV_BASIS_TYP = MCMeta.createStringMeta("PROV_BASIS_TYP", "", 1);

	/**
	 * 支給計上区分名.<p>
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
	public static final MCMeta PROV_BASIS_TYP_NM = MCMeta.createStringMeta("PROV_BASIS_TYP_NM", "");

	/**
	 * 支給積送管理区分.<p>
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
	public static final MCMeta PROV_RCV_TYP = MCMeta.createStringMeta("PROV_RCV_TYP", "", 1);

	/**
	 * 支給積送管理区分名.<p>
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
	public static final MCMeta PROV_RCV_TYP_NM = MCMeta.createStringMeta("PROV_RCV_TYP_NM", "");

	/**
	 * 支払先備考.<p>
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
	public static final MCMeta PSPPL_RMRKS = MCMeta.createStringMeta("PSPPL_RMRKS", "", 100);

	/**
	 * 購買区分.<p>
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
	public static final MCMeta PURC_TYP = MCMeta.createStringMeta("PURC_TYP", "", 1);

	/**
	 * 購買区分名.<p>
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
	public static final MCMeta PURC_TYP_NM = MCMeta.createStringMeta("PURC_TYP_NM", "");

	/**
	 * 在庫良品区分.<p>
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
	public static final MCMeta QUALITY_TYP = MCMeta.createStringMeta("QUALITY_TYP", "", 1);

	/**
	 * 在庫良品区分名.<p>
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
	public static final MCMeta QUALITY_TYP_NM = MCMeta.createStringMeta("QUALITY_TYP_NM", "");

	/**
	 * 納品先チャネル１.<p>
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
	public static final MCMeta DLV_CHNNL1 = MCMeta.createStringMeta("DLV_CHNNL1", "", 10);

	/**
	 * 納品先チャネル２.<p>
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
	public static final MCMeta DLV_CHNNL2 = MCMeta.createStringMeta("DLV_CHNNL2", "", 10);

	/**
	 * 納品先チャネル３.<p>
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
	public static final MCMeta DLV_CHNNL3 = MCMeta.createStringMeta("DLV_CHNNL3", "", 10);

	/**
	 * 相殺グループＣＤ.<p>
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
	public static final MCMeta SETOFF_GRP_CD = MCMeta.createStringMeta("SETOFF_GRP_CD", "", 20);

	/**
	 * 相殺グループ名.<p>
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
	public static final MCMeta SETOFF_GRP_NM = MCMeta.createStringMeta("SETOFF_GRP_NM", "", 100);

	/**
	 * 設定項目区分.<p>
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
	public static final MCMeta SET_COL_TYP = MCMeta.createStringMeta("SET_COL_TYP", "", 3);

	/**
	 * 設定項目区分名.<p>
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
	public static final MCMeta SET_COL_TYP_NM = MCMeta.createStringMeta("SET_COL_TYP_NM", "");

	/**
	 * 出荷指図区分.<p>
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
	 * 出荷指図区分名.<p>
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
	public static final MCMeta SHIP_INST_TYP_NM = MCMeta.createStringMeta("SHIP_INST_TYP_NM", "");

	/**
	 * 出荷有効期限グループＣＤ.<p>
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
	public static final MCMeta SHIP_VALID_GRP_CD = MCMeta.createStringMeta("SHIP_VALID_GRP_CD", "", 5);

	/**
	 * 出荷有効期限グループ名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SHIP_VALID_GRP_NM = MCMeta.createStringMeta("SHIP_VALID_GRP_NM", "", 40);

	/**
	 * 工場・物流倉庫ＣＤ.<p>
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
	public static final MCMeta SITE_CD = MCMeta.createStringMeta("SITE_CD", "", 10);

	/**
	 * 工場・物流倉庫名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SITE_NM = MCMeta.createStringMeta("SITE_NM", "", 40);

	/**
	 * 取引ＣＤ.<p>
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
	public static final MCMeta TRD_CD = MCMeta.createStringMeta("TRD_CD", "", 4);

	/**
	 * 取引名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta TRD_NM = MCMeta.createStringMeta("TRD_NM", "", 40);

	/**
	 * 伝票グループＩＤ.<p>
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
	public static final MCMeta SLIP_CNT_ID = MCMeta.createStringMeta("SLIP_CNT_ID", "", 3);

	/**
	 * ロット明細分割区分.<p>
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
	public static final MCMeta SLIP_EACH_LOT_TYP = MCMeta.createStringMeta("SLIP_EACH_LOT_TYP", "", 1);

	/**
	 * ロット明細分割区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SLIP_EACH_LOT_TYP_NM = MCMeta.createStringMeta("SLIP_EACH_LOT_TYP_NM", "");

	/**
	 * スロット.<p>
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
	public static final MCMeta SLOT = MCMeta.createStringMeta("SLOT", "", 2);

	/**
	 * 受注手配区分.<p>
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
	public static final MCMeta SLO_PROC_TYP = MCMeta.createStringMeta("SLO_PROC_TYP", "", 1);

	/**
	 * 受注手配区分名.<p>
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
	public static final MCMeta SLO_PROC_TYP_NM = MCMeta.createStringMeta("SLO_PROC_TYP_NM", "");

	/**
	 * 見積受注理由ＣＤ.<p>
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
	public static final MCMeta SLO_RSN_CD = MCMeta.createStringMeta("SLO_RSN_CD", "", 10);

	/**
	 * 見積受注理由名.<p>
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
	public static final MCMeta SLO_RSN_NM = MCMeta.createStringMeta("SLO_RSN_NM", "", 100);

	/**
	 * 売上明細書出力区分.<p>
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
	public static final MCMeta SLS_DTL_OUTP_TYP = MCMeta.createStringMeta("SLS_DTL_OUTP_TYP", "", 1);

	/**
	 * 売上明細書出力区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SLS_DTL_OUTP_TYP_NM = MCMeta.createStringMeta("SLS_DTL_OUTP_TYP_NM", "");

	/**
	 * 販売単価分類ＣＤ.<p>
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
	public static final MCMeta SLS_UPRI_GRP_CD = MCMeta.createStringMeta("SLS_UPRI_GRP_CD", "", 5);

	/**
	 * 販売単価分類名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SLS_UPRI_GRP_NM = MCMeta.createStringMeta("SLS_UPRI_GRP_NM", "", 40);

	/**
	 * 販売単価ランクＣＤ.<p>
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
	public static final MCMeta SLS_UPRI_RANK_CD = MCMeta.createStringMeta("SLS_UPRI_RANK_CD", "", 5);

	/**
	 * 販売単価ランク名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SLS_UPRI_RANK_NM = MCMeta.createStringMeta("SLS_UPRI_RANK_NM", "", 40);

	/**
	 * 手配ＮＯ管理区分.<p>
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
	public static final MCMeta SNO_MNG_TYP = MCMeta.createStringMeta("SNO_MNG_TYP", "", 1);

	/**
	 * 手配ＮＯ管理区分名.<p>
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
	public static final MCMeta SNO_MNG_TYP_NM = MCMeta.createStringMeta("SNO_MNG_TYP_NM", "");

	/**
	 * 手配ＮＯ発番区分.<p>
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
	public static final MCMeta SNO_NUM_TYP = MCMeta.createStringMeta("SNO_NUM_TYP", "", 1);

	/**
	 * 手配ＮＯ発番区分名.<p>
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
	public static final MCMeta SNO_NUM_TYP_NM = MCMeta.createStringMeta("SNO_NUM_TYP_NM", "");

	/**
	 * 手配ＮＯ区分.<p>
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
	public static final MCMeta SNO_TYP = MCMeta.createStringMeta("SNO_TYP", "", 1);

	/**
	 * 手配ＮＯ区分名.<p>
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
	public static final MCMeta SNO_TYP_NM = MCMeta.createStringMeta("SNO_TYP_NM", "");

	/**
	 * 仕様ＣＤ.<p>
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
	public static final MCMeta SPEC_CD = MCMeta.createStringMeta("SPEC_CD", "", 10);

	/**
	 * 仕様名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SPEC_NM = MCMeta.createStringMeta("SPEC_NM", "", 40);

	/**
	 * 仕様項目ＣＤ.<p>
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
	public static final MCMeta SPEC_DESC_CD = MCMeta.createStringMeta("SPEC_DESC_CD", "", 10);

	/**
	 * 仕様項目名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SPEC_DESC_NM = MCMeta.createStringMeta("SPEC_DESC_NM", "", 40);

	/**
	 * 格付ＣＤ.<p>
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
	public static final MCMeta STK_GD_CD = MCMeta.createStringMeta("STK_GD_CD", "", 2);

	/**
	 * 格付名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta STK_GD_NM = MCMeta.createStringMeta("STK_GD_NM", "", 40);

	/**
	 * 在庫管理区分.<p>
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
	public static final MCMeta STK_MNG_TYP = MCMeta.createStringMeta("STK_MNG_TYP", "", 1);

	/**
	 * 在庫管理区分名.<p>
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
	public static final MCMeta STK_MNG_TYP_NM = MCMeta.createStringMeta("STK_MNG_TYP_NM", "");

	/**
	 * 棚・ラインＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>10</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>5</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta STR_LN_CD = MCMeta.createStringMeta("STR_LN_CD", "", 10);

	/**
	 * 棚・ライン名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta STR_LN_NM = MCMeta.createStringMeta("STR_LN_NM", "", 40);

	/**
	 * サブロット管理区分.<p>
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
	public static final MCMeta SUBLOT_MNG_TYP = MCMeta.createStringMeta("SUBLOT_MNG_TYP", "", 1);

	/**
	 * サブロット管理区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SUBLOT_MNG_TYP_NM = MCMeta.createStringMeta("SUBLOT_MNG_TYP_NM", "");

	/**
	 * 補助勘定科目ＣＤ.<p>
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
	public static final MCMeta SUB_AC_CD = MCMeta.createStringMeta("SUB_AC_CD", "", 10);

	/**
	 * 補助勘定科目名称.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SUB_AC_NM = MCMeta.createStringMeta("SUB_AC_NM", "", 40);

	/**
	 * 補助勘定科目略名.<p>
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
	public static final MCMeta SUB_AC_NM2 = MCMeta.createStringMeta("SUB_AC_NM2", "", 20);

	/**
	 * デフォルトＣＤ.<p>
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
	public static final MCMeta SUMMARY_CD = MCMeta.createStringMeta("SUMMARY_CD", "", 20);

	/**
	 * 集計区分.<p>
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
	public static final MCMeta SUMMARY_TYP = MCMeta.createStringMeta("SUMMARY_TYP", "", 1);

	/**
	 * 集計区分名.<p>
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
	public static final MCMeta SUMMARY_TYP_NM = MCMeta.createStringMeta("SUMMARY_TYP_NM", "");

	/**
	 * 集計項目区分.<p>
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
	public static final MCMeta SUM_COL_TYP = MCMeta.createStringMeta("SUM_COL_TYP", "", 3);

	/**
	 * 集計項目区分名.<p>
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
	public static final MCMeta SUM_COL_TYP_NM = MCMeta.createStringMeta("SUM_COL_TYP_NM", "");

	/**
	 * 会計税ＣＤ.<p>
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
	public static final MCMeta AC_TAX_CD = MCMeta.createStringMeta("AC_TAX_CD", "", 5);

	/**
	 * 会計税名称.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta AC_TAX_NM = MCMeta.createStringMeta("AC_TAX_NM", "", 40);

	/**
	 * 会計税区分.<p>
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
	public static final MCMeta AC_TAX_TYP = MCMeta.createStringMeta("AC_TAX_TYP", "", 1);

	/**
	 * 会計税区分名.<p>
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
	public static final MCMeta AC_TAX_TYP_NM = MCMeta.createStringMeta("AC_TAX_TYP_NM", "");

	/**
	 * 取引パタン区分.<p>
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
	public static final MCMeta TRD_PTN_TYP = MCMeta.createStringMeta("TRD_PTN_TYP", "", 4);

	/**
	 * 取引パタン区分名.<p>
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
	public static final MCMeta TRD_PTN_TYP_NM = MCMeta.createStringMeta("TRD_PTN_TYP_NM", "");

	/**
	 * 輸送方法ＣＤ.<p>
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
	public static final MCMeta TRNSPT_CD = MCMeta.createStringMeta("TRNSPT_CD", "", 5);

	/**
	 * 輸送方法名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta TRNSPT_NM = MCMeta.createStringMeta("TRNSPT_NM", "", 40);

	/**
	 * 出荷条件ＣＤ.<p>
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
	public static final MCMeta SHIP_TERM_CD = MCMeta.createStringMeta("SHIP_TERM_CD", "", 5);

	/**
	 * 出荷条件名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SHIP_TERM_NM = MCMeta.createStringMeta("SHIP_TERM_NM", "", 40);

	/**
	 * 出荷作業ＣＤ.<p>
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
	public static final MCMeta SHIP_WK_CD = MCMeta.createStringMeta("SHIP_WK_CD", "", 5);

	/**
	 * 出荷作業名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SHIP_WK_NM = MCMeta.createStringMeta("SHIP_WK_NM", "", 40);

	/**
	 * 出荷作業グループＣＤ.<p>
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
	public static final MCMeta SHIP_WK_GRP_CD = MCMeta.createStringMeta("SHIP_WK_GRP_CD", "", 5);

	/**
	 * 出荷作業グループ名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SHIP_WK_GRP_NM = MCMeta.createStringMeta("SHIP_WK_GRP_NM", "", 40);

	/**
	 * 取引条件ＣＤ.<p>
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
	public static final MCMeta TTERM_CD = MCMeta.createStringMeta("TTERM_CD", "", 5);

	/**
	 * 取引条件名.<p>
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
	public static final MCMeta TTERM_NM = MCMeta.createStringMeta("TTERM_NM", "", 100);

	/**
	 * 取引条件区分.<p>
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
	public static final MCMeta TTERM_TYP = MCMeta.createStringMeta("TTERM_TYP", "", 1);

	/**
	 * 取引条件区分名.<p>
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
	public static final MCMeta TTERM_TYP_NM = MCMeta.createStringMeta("TTERM_TYP_NM", "");

	/**
	 * 金額未確定区分.<p>
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
	public static final MCMeta UN_FIX_TYP = MCMeta.createStringMeta("UN_FIX_TYP", "", 1);

	/**
	 * 金額未確定区分名.<p>
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
	public static final MCMeta UN_FIX_TYP_NM = MCMeta.createStringMeta("UN_FIX_TYP_NM", "");

	/**
	 * ＵＲＬ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>500</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta URL = MCMeta.createStringMeta("URL", "", 500);

	/**
	 * ＵＲＬ見出し.<p>
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
	public static final MCMeta URL_RMRKS = MCMeta.createStringMeta("URL_RMRKS", "", 100);

	/**
	 * 担当者別名１.<p>
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
	 */
	public static final MCMeta USR_LNM1 = MCMeta.createStringMeta("USR_LNM1", "", 100);

	/**
	 * 担当者別名２.<p>
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
	 */
	public static final MCMeta USR_LNM2 = MCMeta.createStringMeta("USR_LNM2", "", 100);

	/**
	 * 担当者別名３.<p>
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
	 */
	public static final MCMeta USR_LNM3 = MCMeta.createStringMeta("USR_LNM3", "", 100);

	/**
	 * 担当者別名４.<p>
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
	 */
	public static final MCMeta USR_LNM4 = MCMeta.createStringMeta("USR_LNM4", "", 100);

	/**
	 * 工数管理ＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>10</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>5</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta WK_COST_CD = MCMeta.createStringMeta("WK_COST_CD", "", 10);

	/**
	 * 工数管理名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta WK_COST_NM = MCMeta.createStringMeta("WK_COST_NM", "", 40);

	/**
	 * 工数管理単位名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta WK_COST_UNIT_NM = MCMeta.createStringMeta("WK_COST_UNIT_NM", "", 40);

	/**
	 * 資源ＣＤ.<p>
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
	public static final MCMeta RSRC_CD = MCMeta.createStringMeta("RSRC_CD", "", 10);

	/**
	 * 資源名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta RSRC_NM = MCMeta.createStringMeta("RSRC_NM", "", 40);

	/**
	 * 資源単位名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta RSRC_UNIT_NM = MCMeta.createStringMeta("RSRC_UNIT_NM", "", 40);

	/**
	 * 勤務種類ＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>10</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>5</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta WK_DAY_CD = MCMeta.createStringMeta("WK_DAY_CD", "", 10);

	/**
	 * 勤務種類名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta WK_DAY_NM = MCMeta.createStringMeta("WK_DAY_NM", "", 40);

	/**
	 * 工数理由ＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>10</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>5</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta WK_RSN_CD = MCMeta.createStringMeta("WK_RSN_CD", "", 10);

	/**
	 * 工数理由名.<p>
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
	public static final MCMeta WK_RSN_NM = MCMeta.createStringMeta("WK_RSN_NM", "", 100);

	/**
	 * 設備.<p>
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
	public static final MCMeta FCLTY = MCMeta.createStringMeta("FCLTY", "", 100);

	/**
	 * 振込人名.<p>
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
	public static final MCMeta XFR_PSN = MCMeta.createStringMeta("XFR_PSN", "", 100);

	/**
	 * 販売単価取得区分.<p>
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
	public static final MCMeta SLS_UPRI_REQ_TYP = MCMeta.createStringMeta("SLS_UPRI_REQ_TYP", "", 1);

	/**
	 * 販売単価取得区分名.<p>
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
	public static final MCMeta SLS_UPRI_REQ_TYP_NM = MCMeta.createStringMeta("SLS_UPRI_REQ_TYP_NM", "");

	/**
	 * 購買単価取得区分.<p>
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
	public static final MCMeta PURC_UPRI_REQ_TYP = MCMeta.createStringMeta("PURC_UPRI_REQ_TYP", "", 1);

	/**
	 * 購買単価取得区分名.<p>
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
	public static final MCMeta PURC_UPRI_REQ_TYP_NM = MCMeta.createStringMeta("PURC_UPRI_REQ_TYP_NM", "");

	/**
	 * 債権区分.<p>
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
	public static final MCMeta AR_TYP = MCMeta.createStringMeta("AR_TYP", "", 1);

	/**
	 * 債権区分名.<p>
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
	public static final MCMeta AR_TYP_NM = MCMeta.createStringMeta("AR_TYP_NM", "");

	/**
	 * 債務区分.<p>
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
	public static final MCMeta AP_TYP = MCMeta.createStringMeta("AP_TYP", "", 1);

	/**
	 * 債務区分名.<p>
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
	public static final MCMeta AP_TYP_NM = MCMeta.createStringMeta("AP_TYP_NM", "");

	/**
	 * 引当制御区分.<p>
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
	public static final MCMeta ALLOC_CTL_TYP = MCMeta.createStringMeta("ALLOC_CTL_TYP", "", 1);

	/**
	 * 引当制御区分名.<p>
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
	public static final MCMeta ALLOC_CTL_TYP_NM = MCMeta.createStringMeta("ALLOC_CTL_TYP_NM", "");

	/**
	 * 投入制御区分.<p>
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
	public static final MCMeta INPT_CTL_TYP = MCMeta.createStringMeta("INPT_CTL_TYP", "", 1);

	/**
	 * 投入制御区分名.<p>
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
	public static final MCMeta INPT_CTL_TYP_NM = MCMeta.createStringMeta("INPT_CTL_TYP_NM", "");

	/**
	 * 入荷パタン区分.<p>
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
	public static final MCMeta ARR_PTN_TYP = MCMeta.createStringMeta("ARR_PTN_TYP", "", 1);

	/**
	 * 入荷パタン区分名.<p>
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
	public static final MCMeta ARR_PTN_TYP_NM = MCMeta.createStringMeta("ARR_PTN_TYP_NM", "");

	/**
	 * 総量引当場所グループＣＤ.<p>
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
	public static final MCMeta ALLOC_GRP_CD = MCMeta.createStringMeta("ALLOC_GRP_CD", "", 10);

	/**
	 * 総量引当場所グループ名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ALLOC_GRP_NM = MCMeta.createStringMeta("ALLOC_GRP_NM", "", 40);

	/**
	 * 請求書発行区分.<p>
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
	public static final MCMeta BILL_PRNT_TYP = MCMeta.createStringMeta("BILL_PRNT_TYP", "", 1);

	/**
	 * 請求書発行区分名.<p>
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
	public static final MCMeta BILL_PRNT_TYP_NM = MCMeta.createStringMeta("BILL_PRNT_TYP_NM", "");

	/**
	 * 品揃グループＣＤ.<p>
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
	public static final MCMeta SET_GRP_CD = MCMeta.createStringMeta("SET_GRP_CD", "", 10);

	/**
	 * 品揃グループ名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SET_GRP_NM = MCMeta.createStringMeta("SET_GRP_NM", "", 40);

	/**
	 * 外部システムＮＯ（品目）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta EXT_SYS_NO_ITM = MCMeta.createStringMeta("EXT_SYS_NO_ITM", "", 20);

	/**
	 * 外部システムＮＯ（品目付加）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta EXT_SYS_NO_ATTACH = MCMeta.createStringMeta("EXT_SYS_NO_ATTACH", "", 20);

	/**
	 * 外部システムＮＯ（ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta EXT_SYS_NO_BOM = MCMeta.createStringMeta("EXT_SYS_NO_BOM", "", 20);

	/**
	 * カレンダ日付（VIEW）.<p>
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
	public static final MCMeta CAL_DT_VIEW = MCMeta.createStringMeta("CAL_DT_VIEW", "", 2);

	/**
	 * 標準企業コード.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta STD_CO_CD = MCMeta.createStringMeta("STD_CO_CD", "", 20);

	/**
	 * 事業者ＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BIZ_CO_NO = MCMeta.createStringMeta("BIZ_CO_NO", "", 20);

	/**
	 * 請求書取消伝票表示区分.<p>
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
	public static final MCMeta BILL_CAN_SLIP_TYP = MCMeta.createStringMeta("BILL_CAN_SLIP_TYP", "", 1);

	/**
	 * 請求書取消伝票表示区分名.<p>
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
	public static final MCMeta BILL_CAN_SLIP_TYP_NM = MCMeta.createStringMeta("BILL_CAN_SLIP_TYP_NM", "");

	/**
	 * 外部システム場所区分.<p>
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
	public static final MCMeta EXT_SYS_LOC_TYP = MCMeta.createStringMeta("EXT_SYS_LOC_TYP", "", 1);

	/**
	 * 外部システム場所区分名.<p>
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
	public static final MCMeta EXT_SYS_LOC_TYP_NM = MCMeta.createStringMeta("EXT_SYS_LOC_TYP_NM", "");

	/**
	 * 期間区分.<p>
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
	public static final MCMeta PERIOD_TYP = MCMeta.createStringMeta("PERIOD_TYP", "", 1);

	/**
	 * 期間区分名.<p>
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
	public static final MCMeta PERIOD_TYP_NM = MCMeta.createStringMeta("PERIOD_TYP_NM", "");

	/**
	 * ＢＯＭ展開表示順.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>3000</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta BOM_EX_SORT = MCMeta.createStringMeta("BOM_EX_SORT", "", 3000);

	/**
	 * 生産計画立案区分.<p>
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
	public static final MCMeta PROD_PLN_TYP = MCMeta.createStringMeta("PROD_PLN_TYP", "", 1);

	/**
	 * 生産計画立案区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PROD_PLN_TYP_NM = MCMeta.createStringMeta("PROD_PLN_TYP_NM", "");

	/**
	 * 伝票タイトル区分.<p>
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
	public static final MCMeta SLIP_TITLE_TYP = MCMeta.createStringMeta("SLIP_TITLE_TYP", "", 1);

	/**
	 * 伝票タイトル区分名.<p>
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
	public static final MCMeta SLIP_TITLE_TYP_NM = MCMeta.createStringMeta("SLIP_TITLE_TYP_NM", "");

	/**
	 * 標準単価取得区分.<p>
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
	public static final MCMeta STD_UPRI_SEL_TYP = MCMeta.createStringMeta("STD_UPRI_SEL_TYP", "", 1);

	/**
	 * 標準単価取得区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta STD_UPRI_SEL_TYP_NM = MCMeta.createStringMeta("STD_UPRI_SEL_TYP_NM", "");

	/**
	 * ワーキンググループ間依頼種類区分.<p>
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
	public static final MCMeta WG_RQST_TYP = MCMeta.createStringMeta("WG_RQST_TYP", "", 1);

	/**
	 * ワーキンググループ間依頼種類区分名.<p>
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
	public static final MCMeta WG_RQST_TYP_NM = MCMeta.createStringMeta("WG_RQST_TYP_NM", "");

	/**
	 * 引当優先順.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>4,0</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ALLOC_PRIO = MCMeta.createNumberMeta("ALLOC_PRIO", "", 4, 0);

	/**
	 * 代替品目比率.<p>
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
	public static final MCMeta ALT_ITM_RATIO = MCMeta.createNumberMeta("ALT_ITM_RATIO", "", 9, 0);

	/**
	 * 子品目必要比率.<p>
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
	public static final MCMeta CHD_RATIO = MCMeta.createNumberMeta("CHD_RATIO", "", 21, 8);

	/**
	 * 原価比率.<p>
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
	public static final MCMeta COST_RATIO = MCMeta.createNumberMeta("COST_RATIO", "", 21, 8);

	/**
	 * 検査順序.<p>
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
	public static final MCMeta INSP_SEQ = MCMeta.createNumberMeta("INSP_SEQ", "", 3, 0);

	/**
	 * 定量値整数部桁数.<p>
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
	public static final MCMeta INT_DIGIT = MCMeta.createNumberMeta("INT_DIGIT", "", 2, 0);

	/**
	 * 使用期間.<p>
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
	public static final MCMeta LMT_PD = MCMeta.createNumberMeta("LMT_PD", "", 6, 0);

	/**
	 * 曜日まとめ期間（週）.<p>
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
	public static final MCMeta SZ_WEEK = MCMeta.createNumberMeta("SZ_WEEK", "", 3, 0);

	/**
	 * ロットまとめ期間（日）.<p>
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
	public static final MCMeta LOT_SZ_PD = MCMeta.createNumberMeta("LOT_SZ_PD", "", 3, 0);

	/**
	 * オーダ自動確定期間（日）.<p>
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
	public static final MCMeta ORD_FIX_PD = MCMeta.createNumberMeta("ORD_FIX_PD", "", 3, 0);

	/**
	 * リーダタイム.<p>
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
	public static final MCMeta LT = MCMeta.createNumberMeta("LT", "", 9, 0);

	/**
	 * 投入オフセット.<p>
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
	public static final MCMeta OFFST = MCMeta.createNumberMeta("OFFST", "", 9, 0);

	/**
	 * 工程連番.<p>
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
	public static final MCMeta OPER_SEQ = MCMeta.createNumberMeta("OPER_SEQ", "", 9, 0);

	/**
	 * オーダ比率.<p>
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
	public static final MCMeta ORDER_RATIO = MCMeta.createNumberMeta("ORDER_RATIO", "", 21, 8);

	/**
	 * 入金・支払サイト.<p>
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
	public static final MCMeta CRRYOVR_MONS = MCMeta.createNumberMeta("CRRYOVR_MONS", "", 3, 0);

	/**
	 * 支払予定日.<p>
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
	 * <br>
	 * 1～31（99は末日）<br>
	 */
	public static final MCMeta PAY_DAY = MCMeta.createNumberMeta("PAY_DAY", "", 2, 0);

	/**
	 * 日ばらし案分比率.<p>
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
	public static final MCMeta PROD_RATE = MCMeta.createNumberMeta("PROD_RATE", "", 21, 8);

	/**
	 * 日ばらし開始日.<p>
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
	public static final MCMeta PROD_BEGIN_DAY = MCMeta.createNumberMeta("PROD_BEGIN_DAY", "", 2, 0);

	/**
	 * 定量規格値.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>21,8</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>QN_INSP_VAL</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta QN_INSP_VAL = MCMeta.createNumberMeta("QN_INSP_VAL", "", 21, 8);
	public static final String QN_INSP_VAL_FORMAT = "QN_INSP_VAL";

	/**
	 * 進捗率.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>5,2</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta RATE = MCMeta.createNumberMeta("RATE", "", 5, 2);

	/**
	 * 予実比下限.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>8,4</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta RATE_LMT = MCMeta.createNumberMeta("RATE_LMT", "", 8, 4);

	/**
	 * 入金予定日.<p>
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
	 * <br>
	 * 1～31（99は末日）<br>
	 */
	public static final MCMeta RCV_DAY = MCMeta.createNumberMeta("RCV_DAY", "", 2, 0);

	/**
	 * ＢＯＭキー.<p>
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
	public static final MCMeta BOM_KEY = MCMeta.createStringMeta("BOM_KEY", "", 15);

	/**
	 * 有効期限日数.<p>
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
	public static final MCMeta SHIP_VALID_DAYS = MCMeta.createNumberMeta("SHIP_VALID_DAYS", "", 9, 0);

	/**
	 * 有効期間.<p>
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
	public static final MCMeta VLD_PD = MCMeta.createNumberMeta("VLD_PD", "", 6, 0);

	/**
	 * 工数（固定）.<p>
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
	public static final MCMeta WK_COST_QTY = MCMeta.createNumberMeta("WK_COST_QTY", "", 21, 8);

	/**
	 * 品目下限収率.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>6,3</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta YIELD = MCMeta.createNumberMeta("YIELD", "", 6, 3);

	/**
	 * 出来高工程比率.<p>
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
	public static final MCMeta YIELD_OPER_RATIO = MCMeta.createNumberMeta("YIELD_OPER_RATIO", "", 9, 0);

	/**
	 * 代替グループＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ALT_GRP_CD = MCMeta.createStringMeta("ALT_GRP_CD", "", 40);

	/**
	 * 代替グループ名.<p>
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
	public static final MCMeta ALT_GRP_NM = MCMeta.createStringMeta("ALT_GRP_NM", "", 100);

	/**
	 * 代替品目選択区分.<p>
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
	public static final MCMeta ALT_ITM_TYP = MCMeta.createStringMeta("ALT_ITM_TYP", "", 1);

	/**
	 * 代替品目選択区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ALT_ITM_TYP_NM = MCMeta.createStringMeta("ALT_ITM_TYP_NM", "");

	/**
	 * 債務相殺先区分.<p>
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
	public static final MCMeta AP_SETOFF_TYP = MCMeta.createStringMeta("AP_SETOFF_TYP", "", 1);

	/**
	 * 債務相殺先区分名.<p>
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
	public static final MCMeta AP_SETOFF_TYP_NM = MCMeta.createStringMeta("AP_SETOFF_TYP_NM", "");

	/**
	 * 債務決済区分.<p>
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
	public static final MCMeta AP_STTL_TYP = MCMeta.createStringMeta("AP_STTL_TYP", "", 1);

	/**
	 * 債務決済区分名.<p>
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
	public static final MCMeta AP_STTL_TYP_NM = MCMeta.createStringMeta("AP_STTL_TYP_NM", "");

	/**
	 * 債権決済区分.<p>
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
	public static final MCMeta AR_STTL_TYP = MCMeta.createStringMeta("AR_STTL_TYP", "", 1);

	/**
	 * 債権決済区分名.<p>
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
	public static final MCMeta AR_STTL_TYP_NM = MCMeta.createStringMeta("AR_STTL_TYP_NM", "");

	/**
	 * バックフラッシュ区分.<p>
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
	public static final MCMeta BKF_TYP = MCMeta.createStringMeta("BKF_TYP", "", 1);

	/**
	 * バックフラッシュ区分名.<p>
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
	public static final MCMeta BKF_TYP_NM = MCMeta.createStringMeta("BKF_TYP_NM", "");

	/**
	 * 取引先品目ＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BP_ITM_CD = MCMeta.createStringMeta("BP_ITM_CD", "", 40);

	/**
	 * 取引先品名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>40</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BP_ITM_NM = MCMeta.createStringMeta("BP_ITM_NM", "", 100);

	/**
	 * 期間計算区分.<p>
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
	public static final MCMeta CALC_PD_TYP = MCMeta.createStringMeta("CALC_PD_TYP", "", 1);

	/**
	 * 期間計算区分名.<p>
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
	public static final MCMeta CALC_PD_TYP_NM = MCMeta.createStringMeta("CALC_PD_TYP_NM", "");

	/**
	 * サイト区分.<p>
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
	public static final MCMeta CRRYOVR_MONS_TYP = MCMeta.createStringMeta("CRRYOVR_MONS_TYP", "", 1);

	/**
	 * サイト区分名.<p>
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
	public static final MCMeta CRRYOVR_MONS_TYP_NM = MCMeta.createStringMeta("CRRYOVR_MONS_TYP_NM", "");

	/**
	 * 日ばらし区分.<p>
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
	public static final MCMeta DATE_DIV_TYP = MCMeta.createStringMeta("DATE_DIV_TYP", "", 1);

	/**
	 * 日ばらし区分名.<p>
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
	public static final MCMeta DATE_DIV_TYP_NM = MCMeta.createStringMeta("DATE_DIV_TYP_NM", "");

	/**
	 * 曜日区分.<p>
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
	public static final MCMeta DAY_WEEK_TYP = MCMeta.createStringMeta("DAY_WEEK_TYP", "", 1);

	/**
	 * 曜日区分名.<p>
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
	public static final MCMeta DAY_WEEK_TYP_NM = MCMeta.createStringMeta("DAY_WEEK_TYP_NM", "");

	/**
	 * 債権債務先識別区分.<p>
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
	public static final MCMeta DEBT_CRED_ID_TYP = MCMeta.createStringMeta("DEBT_CRED_ID_TYP", "", 1);

	/**
	 * 債権債務先識別区分名.<p>
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
	public static final MCMeta DEBT_CRED_ID_TYP_NM = MCMeta.createStringMeta("DEBT_CRED_ID_TYP_NM", "");

	/**
	 * エンジニアリング変更ＮＯ.<p>
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
	public static final MCMeta ECNO = MCMeta.createStringMeta("ECNO", "", 20);

	/**
	 * 機能区分.<p>
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
	public static final MCMeta FUNC_TYP = MCMeta.createStringMeta("FUNC_TYP", "", 2);

	/**
	 * 機能区分名.<p>
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
	public static final MCMeta FUNC_TYP_NM = MCMeta.createStringMeta("FUNC_TYP_NM", "");

	/**
	 * 検査実施単位区分.<p>
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
	public static final MCMeta INSP_BIND_TYP = MCMeta.createStringMeta("INSP_BIND_TYP", "", 1);

	/**
	 * 検査実施単位区分名.<p>
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
	public static final MCMeta INSP_BIND_TYP_NM = MCMeta.createStringMeta("INSP_BIND_TYP_NM", "");

	/**
	 * 検査指図タイミング区分.<p>
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
	public static final MCMeta INSP_INST_ISSUE_TYP = MCMeta.createStringMeta("INSP_INST_ISSUE_TYP", "", 1);

	/**
	 * 検査指図タイミング区分名.<p>
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
	public static final MCMeta INSP_INST_ISSUE_TYP_NM = MCMeta.createStringMeta("INSP_INST_ISSUE_TYP_NM", "");

	/**
	 * 検査方法区分.<p>
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
	public static final MCMeta INSP_MTD_TYP = MCMeta.createStringMeta("INSP_MTD_TYP", "", 1);

	/**
	 * 検査方法区分名.<p>
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
	public static final MCMeta INSP_MTD_TYP_NM = MCMeta.createStringMeta("INSP_MTD_TYP_NM", "");

	/**
	 * 検査項目ＣＤ.<p>
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
	public static final MCMeta INSP_POINT_CD = MCMeta.createStringMeta("INSP_POINT_CD", "", 5);

	/**
	 * 検査項目名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta INSP_POINT_NM = MCMeta.createStringMeta("INSP_POINT_NM", "", 40);

	/**
	 * 検査パタンＣＤ.<p>
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
	public static final MCMeta INSP_PTN_CD = MCMeta.createStringMeta("INSP_PTN_CD", "", 2);

	/**
	 * 検査パタン名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta INSP_PTN_NM = MCMeta.createStringMeta("INSP_PTN_NM", "", 40);

	/**
	 * 定性定量区分.<p>
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
	public static final MCMeta INSP_QLQN_TYP = MCMeta.createStringMeta("INSP_QLQN_TYP", "", 1);

	/**
	 * 定性定量区分名.<p>
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
	public static final MCMeta INSP_QLQN_TYP_NM = MCMeta.createStringMeta("INSP_QLQN_TYP_NM", "");

	/**
	 * 規格書ＮＯ.<p>
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
	public static final MCMeta INSP_STD_NO = MCMeta.createStringMeta("INSP_STD_NO", "", 10);

	/**
	 * 期限管理種別.<p>
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
	public static final MCMeta LMT_CTL_CATEG = MCMeta.createStringMeta("LMT_CTL_CATEG", "", 10);

	/**
	 * 期限起算日区分.<p>
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
	public static final MCMeta LMT_DT_FRM_TYP = MCMeta.createStringMeta("LMT_DT_FRM_TYP", "", 1);

	/**
	 * 期限起算日区分名.<p>
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
	public static final MCMeta LMT_DT_FRM_TYP_NM = MCMeta.createStringMeta("LMT_DT_FRM_TYP_NM", "");

	/**
	 * 継承項目区分.<p>
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
	public static final MCMeta LOT_INH_COL_TYP = MCMeta.createStringMeta("LOT_INH_COL_TYP", "", 30);

	/**
	 * 継承項目区分名.<p>
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
	public static final MCMeta LOT_INH_COL_TYP_NM = MCMeta.createStringMeta("LOT_INH_COL_TYP_NM", "");

	/**
	 * 継承方法区分.<p>
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
	public static final MCMeta LOT_INH_TYP = MCMeta.createStringMeta("LOT_INH_TYP", "", 1);

	/**
	 * 継承方法区分名.<p>
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
	public static final MCMeta LOT_INH_TYP_NM = MCMeta.createStringMeta("LOT_INH_TYP_NM", "");

	/**
	 * ロット発番タイミング区分.<p>
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
	public static final MCMeta LOT_ISSUE_TYP = MCMeta.createStringMeta("LOT_ISSUE_TYP", "", 1);

	/**
	 * ロット発番タイミング区分名.<p>
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
	public static final MCMeta LOT_ISSUE_TYP_NM = MCMeta.createStringMeta("LOT_ISSUE_TYP_NM", "");

	/**
	 * ＭＰＳグループＣＤ.<p>
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
	public static final MCMeta MPS_GRP_CD = MCMeta.createStringMeta("MPS_GRP_CD", "", 10);

	/**
	 * ＭＰＳグループ名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta MPS_GRP_NM = MCMeta.createStringMeta("MPS_GRP_NM", "", 40);

	/**
	 * ＭＲＰ処理区分.<p>
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
	public static final MCMeta MRP_PROC_TYP = MCMeta.createStringMeta("MRP_PROC_TYP", "", 1);

	/**
	 * ＭＲＰ処理区分名.<p>
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
	public static final MCMeta MRP_PROC_TYP_NM = MCMeta.createStringMeta("MRP_PROC_TYP_NM", "");

	/**
	 * 投入オフセット区分.<p>
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
	public static final MCMeta OFFST_TYP = MCMeta.createStringMeta("OFFST_TYP", "", 1);

	/**
	 * 投入オフセット区分名.<p>
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
	public static final MCMeta OFFST_TYP_NM = MCMeta.createStringMeta("OFFST_TYP_NM", "");

	/**
	 * 工程指図ＧＲＰ.<p>
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
	public static final MCMeta OPER_INST_GRP = MCMeta.createStringMeta("OPER_INST_GRP", "", 10);

	/**
	 * 工程パタン.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta OPER_PTN = MCMeta.createStringMeta("OPER_PTN", "", 40);

	/**
	 * 投入切替区分.<p>
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
	public static final MCMeta PROD_CHNG_TYP = MCMeta.createStringMeta("PROD_CHNG_TYP", "", 1);

	/**
	 * 投入切替区分名.<p>
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
	public static final MCMeta PROD_CHNG_TYP_NM = MCMeta.createStringMeta("PROD_CHNG_TYP_NM", "");

	/**
	 * 製造指図単位区分.<p>
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
	public static final MCMeta MFG_INST_UNIT_TYP = MCMeta.createStringMeta("MFG_INST_UNIT_TYP", "", 1);

	/**
	 * 製造指図単位区分名.<p>
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
	public static final MCMeta MFG_INST_UNIT_TYP_NM = MCMeta.createStringMeta("MFG_INST_UNIT_TYP_NM", "");

	/**
	 * 購買識別区分.<p>
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
	public static final MCMeta PURC_ID_TYP = MCMeta.createStringMeta("PURC_ID_TYP", "", 1);

	/**
	 * 購買識別区分名.<p>
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
	public static final MCMeta PURC_ID_TYP_NM = MCMeta.createStringMeta("PURC_ID_TYP_NM", "");

	/**
	 * 支給区分.<p>
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
	public static final MCMeta PROV_TYP = MCMeta.createStringMeta("PROV_TYP", "", 1);

	/**
	 * 支給区分名.<p>
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
	public static final MCMeta PROV_TYP_NM = MCMeta.createStringMeta("PROV_TYP_NM", "");

	/**
	 * 購買確定タイミング区分.<p>
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
	public static final MCMeta PURC_FIX_TYP = MCMeta.createStringMeta("PURC_FIX_TYP", "", 1);

	/**
	 * 購買確定タイミング区分名.<p>
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
	public static final MCMeta PURC_FIX_TYP_NM = MCMeta.createStringMeta("PURC_FIX_TYP_NM", "");

	/**
	 * 定性規格値.<p>
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
	public static final MCMeta QL_STD_VAL = MCMeta.createStringMeta("QL_STD_VAL", "", 30);

	/**
	 * 入金登録区分.<p>
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
	public static final MCMeta RCV_REG_TYP = MCMeta.createStringMeta("RCV_REG_TYP", "", 1);

	/**
	 * 入金登録区分名.<p>
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
	public static final MCMeta RCV_REG_TYP_NM = MCMeta.createStringMeta("RCV_REG_TYP_NM", "");

	/**
	 * 規格符号区分.<p>
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
	public static final MCMeta SIGN_TYP = MCMeta.createStringMeta("SIGN_TYP", "", 2);

	/**
	 * 規格符号区分名.<p>
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
	public static final MCMeta SIGN_TYP_NM = MCMeta.createStringMeta("SIGN_TYP_NM", "");

	/**
	 * 引当区分.<p>
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
	public static final MCMeta ALLOC_TYP = MCMeta.createStringMeta("ALLOC_TYP", "", 1);

	/**
	 * 引当区分名.<p>
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
	public static final MCMeta ALLOC_TYP_NM = MCMeta.createStringMeta("ALLOC_TYP_NM", "");

	/**
	 * 引当範囲区分.<p>
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
	public static final MCMeta ALLOC_SCOPE_TYP = MCMeta.createStringMeta("ALLOC_SCOPE_TYP", "", 1);

	/**
	 * 引当範囲区分名.<p>
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
	public static final MCMeta ALLOC_SCOPE_TYP_NM = MCMeta.createStringMeta("ALLOC_SCOPE_TYP_NM", "");

	/**
	 * 売上仕入税区分.<p>
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
	public static final MCMeta SLS_PURC_TYP = MCMeta.createStringMeta("SLS_PURC_TYP", "", 1);

	/**
	 * 売上仕入税区分名.<p>
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
	public static final MCMeta SLS_PURC_TYP_NM = MCMeta.createStringMeta("SLS_PURC_TYP_NM", "");

	/**
	 * 決済方法ＣＤ.<p>
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
	public static final MCMeta STTL_CD = MCMeta.createStringMeta("STTL_CD", "", 10);

	/**
	 * 決済方法名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta STTL_NM = MCMeta.createStringMeta("STTL_NM", "", 40);

	/**
	 * 版ＮＯ.<p>
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
	public static final MCMeta VER_NO = MCMeta.createStringMeta("VER_NO", "", 10);

	/**
	 * 積送在庫管轄先区分.<p>
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
	public static final MCMeta XFR_STK_MNG_TYP = MCMeta.createStringMeta("XFR_STK_MNG_TYP", "", 1);

	/**
	 * 積送在庫管轄先区分名.<p>
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
	public static final MCMeta XFR_STK_MNG_TYP_NM = MCMeta.createStringMeta("XFR_STK_MNG_TYP_NM", "");

	/**
	 * 先行検査引継区分.<p>
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
	public static final MCMeta PRE_INSP_INF_TYP = MCMeta.createStringMeta("PRE_INSP_INF_TYP", "", 1);

	/**
	 * 先行検査引継区分名.<p>
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
	public static final MCMeta PRE_INSP_INF_TYP_NM = MCMeta.createStringMeta("PRE_INSP_INF_TYP_NM", "");

	/**
	 * 構成・仕様管理区分.<p>
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
	public static final MCMeta COMP_SPEC_TYP = MCMeta.createStringMeta("COMP_SPEC_TYP", "", 1);

	/**
	 * 構成・仕様管理区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta COMP_SPEC_TYP_NM = MCMeta.createStringMeta("COMP_SPEC_TYP_NM", "");

	/**
	 * 出来高区分.<p>
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
	public static final MCMeta YIELD_TYP = MCMeta.createStringMeta("YIELD_TYP", "", 1);

	/**
	 * 出来高区分名.<p>
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
	public static final MCMeta YIELD_TYP_NM = MCMeta.createStringMeta("YIELD_TYP_NM", "");

	/**
	 * 販売計画設定区分.<p>
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
	public static final MCMeta SPLN_SET_TYP = MCMeta.createStringMeta("SPLN_SET_TYP", "", 1);

	/**
	 * 販売計画設定区分名.<p>
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
	public static final MCMeta SPLN_SET_TYP_NM = MCMeta.createStringMeta("SPLN_SET_TYP_NM", "");

	/**
	 * 販売計画計算比率.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>13,0</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SPLN_CALC_RATE = MCMeta.createNumberMeta("SPLN_CALC_RATE", "", 13, 0);

	/**
	 * 販売計画計算順序.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>5,0</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SPLN_CALC_SEQ = MCMeta.createNumberMeta("SPLN_CALC_SEQ", "", 5, 0);

	/**
	 * 所要区分.<p>
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
	public static final MCMeta RQMT_TYP = MCMeta.createStringMeta("RQMT_TYP", "", 1);

	/**
	 * 所要区分名.<p>
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
	public static final MCMeta RQMT_TYP_NM = MCMeta.createStringMeta("RQMT_TYP_NM", "");

	/**
	 * ＢＯＭ区分.<p>
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
	public static final MCMeta BOM_TYP = MCMeta.createStringMeta("BOM_TYP", "", 1);

	/**
	 * ＢＯＭ区分名.<p>
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
	public static final MCMeta BOM_TYP_NM = MCMeta.createStringMeta("BOM_TYP_NM", "");

	/**
	 * 予備ＣＨＡＲ項目１（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_CHAR1 = MCMeta.createStringMeta("BOM_SUB_CHAR1", "", 50);

	/**
	 * 予備ＣＨＡＲ項目２（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_CHAR2 = MCMeta.createStringMeta("BOM_SUB_CHAR2", "", 50);

	/**
	 * 予備ＣＨＡＲ項目３（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_CHAR3 = MCMeta.createStringMeta("BOM_SUB_CHAR3", "", 50);

	/**
	 * 予備ＣＨＡＲ項目４（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_CHAR4 = MCMeta.createStringMeta("BOM_SUB_CHAR4", "", 50);

	/**
	 * 予備ＣＨＡＲ項目５（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_CHAR5 = MCMeta.createStringMeta("BOM_SUB_CHAR5", "", 50);

	/**
	 * 予備ＣＨＡＲ項目６（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_CHAR6 = MCMeta.createStringMeta("BOM_SUB_CHAR6", "", 50);

	/**
	 * 予備ＣＨＡＲ項目７（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_CHAR7 = MCMeta.createStringMeta("BOM_SUB_CHAR7", "", 50);

	/**
	 * 予備ＣＨＡＲ項目８（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_CHAR8 = MCMeta.createStringMeta("BOM_SUB_CHAR8", "", 50);

	/**
	 * 予備ＣＨＡＲ項目９（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_CHAR9 = MCMeta.createStringMeta("BOM_SUB_CHAR9", "", 50);

	/**
	 * 予備ＣＨＡＲ項目１０（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_CHAR10 = MCMeta.createStringMeta("BOM_SUB_CHAR10", "", 50);

	/**
	 * 予備ＣＨＡＲ項目１１（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_CHAR11 = MCMeta.createStringMeta("BOM_SUB_CHAR11", "", 50);

	/**
	 * 予備ＣＨＡＲ項目１２（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_CHAR12 = MCMeta.createStringMeta("BOM_SUB_CHAR12", "", 50);

	/**
	 * 予備ＣＨＡＲ項目１３（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_CHAR13 = MCMeta.createStringMeta("BOM_SUB_CHAR13", "", 50);

	/**
	 * 予備ＣＨＡＲ項目１４（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_CHAR14 = MCMeta.createStringMeta("BOM_SUB_CHAR14", "", 50);

	/**
	 * 予備ＣＨＡＲ項目１５（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_CHAR15 = MCMeta.createStringMeta("BOM_SUB_CHAR15", "", 50);

	/**
	 * 予備ＣＨＡＲ項目１６（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_CHAR16 = MCMeta.createStringMeta("BOM_SUB_CHAR16", "", 50);

	/**
	 * 予備ＣＨＡＲ項目１７（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_CHAR17 = MCMeta.createStringMeta("BOM_SUB_CHAR17", "", 50);

	/**
	 * 予備ＣＨＡＲ項目１８（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_CHAR18 = MCMeta.createStringMeta("BOM_SUB_CHAR18", "", 50);

	/**
	 * 予備ＣＨＡＲ項目１９（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_CHAR19 = MCMeta.createStringMeta("BOM_SUB_CHAR19", "", 50);

	/**
	 * 予備ＣＨＡＲ項目２０（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_CHAR20 = MCMeta.createStringMeta("BOM_SUB_CHAR20", "", 50);

	/**
	 * 予備ＣＨＡＲ項目２１（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_CHAR21 = MCMeta.createStringMeta("BOM_SUB_CHAR21", "", 50);

	/**
	 * 予備ＣＨＡＲ項目２２（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_CHAR22 = MCMeta.createStringMeta("BOM_SUB_CHAR22", "", 50);

	/**
	 * 予備ＣＨＡＲ項目２３（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_CHAR23 = MCMeta.createStringMeta("BOM_SUB_CHAR23", "", 50);

	/**
	 * 予備ＣＨＡＲ項目２４（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_CHAR24 = MCMeta.createStringMeta("BOM_SUB_CHAR24", "", 50);

	/**
	 * 予備ＣＨＡＲ項目２５（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_CHAR25 = MCMeta.createStringMeta("BOM_SUB_CHAR25", "", 50);

	/**
	 * 予備ＣＨＡＲ項目２６（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_CHAR26 = MCMeta.createStringMeta("BOM_SUB_CHAR26", "", 50);

	/**
	 * 予備ＣＨＡＲ項目２７（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_CHAR27 = MCMeta.createStringMeta("BOM_SUB_CHAR27", "", 50);

	/**
	 * 予備ＣＨＡＲ項目２８（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_CHAR28 = MCMeta.createStringMeta("BOM_SUB_CHAR28", "", 50);

	/**
	 * 予備ＣＨＡＲ項目２９（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_CHAR29 = MCMeta.createStringMeta("BOM_SUB_CHAR29", "", 50);

	/**
	 * 予備ＣＨＡＲ項目３０（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_CHAR30 = MCMeta.createStringMeta("BOM_SUB_CHAR30", "", 50);

	/**
	 * 予備ＮＵＭ項目１（汎用ＢＯＭ）.<p>
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
	public static final MCMeta BOM_SUB_NUM1 = MCMeta.createNumberMeta("BOM_SUB_NUM1", "", 21, 8);

	/**
	 * 予備ＮＵＭ項目２（汎用ＢＯＭ）.<p>
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
	public static final MCMeta BOM_SUB_NUM2 = MCMeta.createNumberMeta("BOM_SUB_NUM2", "", 21, 8);

	/**
	 * 予備ＮＵＭ項目３（汎用ＢＯＭ）.<p>
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
	public static final MCMeta BOM_SUB_NUM3 = MCMeta.createNumberMeta("BOM_SUB_NUM3", "", 21, 8);

	/**
	 * 予備ＮＵＭ項目４（汎用ＢＯＭ）.<p>
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
	public static final MCMeta BOM_SUB_NUM4 = MCMeta.createNumberMeta("BOM_SUB_NUM4", "", 21, 8);

	/**
	 * 予備ＮＵＭ項目５（汎用ＢＯＭ）.<p>
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
	public static final MCMeta BOM_SUB_NUM5 = MCMeta.createNumberMeta("BOM_SUB_NUM5", "", 21, 8);

	/**
	 * 予備ＤＡＴＥ項目１（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_DT1 = MCMeta.createDateMeta("BOM_SUB_DT1", "");
	public static final String BOM_SUB_DT1_FORMAT = "YMD";

	/**
	 * 予備ＤＡＴＥ項目２（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_DT2 = MCMeta.createDateMeta("BOM_SUB_DT2", "");
	public static final String BOM_SUB_DT2_FORMAT = "YMD";

	/**
	 * 予備ＤＡＴＥ項目３（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_DT3 = MCMeta.createDateMeta("BOM_SUB_DT3", "");
	public static final String BOM_SUB_DT3_FORMAT = "YMD";

	/**
	 * 予備ＤＡＴＥ項目４（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_DT4 = MCMeta.createDateMeta("BOM_SUB_DT4", "");
	public static final String BOM_SUB_DT4_FORMAT = "YMD";

	/**
	 * 予備ＤＡＴＥ項目５（汎用ＢＯＭ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_SUB_DT5 = MCMeta.createDateMeta("BOM_SUB_DT5", "");
	public static final String BOM_SUB_DT5_FORMAT = "YMD";

	/**
	 * 切替備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>250</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>50</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ITM_VER_VLD_RMRKS = MCMeta.createStringMeta("ITM_VER_VLD_RMRKS", "", 250);

	/**
	 * 需要分割比率.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>9,0</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta DMND_DIV_RATIO = MCMeta.createNumberMeta("DMND_DIV_RATIO", "", 9, 0);

	/**
	 * 配賦率.<p>
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
	public static final MCMeta ALC_RATE = MCMeta.createNumberMeta("ALC_RATE", "", 21, 8);

	/**
	 * 配賦基準値１.<p>
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
	public static final MCMeta ALC_VAL1 = MCMeta.createNumberMeta("ALC_VAL1", "", 21, 8);

	/**
	 * 配賦基準値２.<p>
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
	public static final MCMeta ALC_VAL2 = MCMeta.createNumberMeta("ALC_VAL2", "", 21, 8);

	/**
	 * 配賦基準値３.<p>
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
	public static final MCMeta ALC_VAL3 = MCMeta.createNumberMeta("ALC_VAL3", "", 21, 8);

	/**
	 * 配賦基準値４.<p>
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
	public static final MCMeta ALC_VAL4 = MCMeta.createNumberMeta("ALC_VAL4", "", 21, 8);

	/**
	 * 配賦基準値５.<p>
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
	public static final MCMeta ALC_VAL5 = MCMeta.createNumberMeta("ALC_VAL5", "", 21, 8);

	/**
	 * 配賦係数値.<p>
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
	public static final MCMeta COEF_VAL = MCMeta.createNumberMeta("COEF_VAL", "", 21, 8);

	/**
	 * 受払表ＩＤ.<p>
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
	public static final MCMeta COST_IO_ID = MCMeta.createNumberMeta("COST_IO_ID", "", 2, 0);

	/**
	 * 受払表名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta COST_IO_NM = MCMeta.createStringMeta("COST_IO_NM", "", 40);

	/**
	 * 金額小数部表示桁.<p>
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
	public static final MCMeta DISP_DIGIT = MCMeta.createNumberMeta("DISP_DIGIT", "", 1, 0);

	/**
	 * 最大計算月数.<p>
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
	public static final MCMeta MAX_MONS = MCMeta.createNumberMeta("MAX_MONS", "", 2, 0);

	/**
	 * メニュー配置番号.<p>
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
	public static final MCMeta MENU_NO = MCMeta.createNumberMeta("MENU_NO", "", 2, 0);

	/**
	 * 一次配賦最大配賦階層.<p>
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
	public static final MCMeta PRE_ALC_MAX_LVL = MCMeta.createNumberMeta("PRE_ALC_MAX_LVL", "", 3, 0);

	/**
	 * 一次配賦最大レコード数.<p>
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
	public static final MCMeta PRE_ALC_MAX_REC = MCMeta.createNumberMeta("PRE_ALC_MAX_REC", "", 9, 0);

	/**
	 * 前景色（Ｒ）.<p>
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
	public static final MCMeta RGB = MCMeta.createNumberMeta("RGB", "", 3, 0);

	/**
	 * 計算実行パタンＣＤ.<p>
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
	public static final MCMeta ACT_PTN_CD = MCMeta.createStringMeta("ACT_PTN_CD", "", 10);

	/**
	 * 計算実行パタン名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ACT_PTN_NM = MCMeta.createStringMeta("ACT_PTN_NM", "", 40);

	/**
	 * セグメント実績区分.<p>
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
	public static final MCMeta ACT_SET_TYP = MCMeta.createStringMeta("ACT_SET_TYP", "", 1);

	/**
	 * セグメント実績区分名.<p>
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
	public static final MCMeta ACT_SET_TYP_NM = MCMeta.createStringMeta("ACT_SET_TYP_NM", "");

	/**
	 * 費用計画パタンＣＤ.<p>
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
	public static final MCMeta AC_PLN_PTN_CD = MCMeta.createStringMeta("AC_PLN_PTN_CD", "", 20);

	/**
	 * 費用計画パタン名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta AC_PLN_PTN_NM = MCMeta.createStringMeta("AC_PLN_PTN_NM", "", 40);

	/**
	 * 端数調整区分.<p>
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
	public static final MCMeta ADJ_TYP = MCMeta.createStringMeta("ADJ_TYP", "", 1);

	/**
	 * 端数調整区分名.<p>
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
	public static final MCMeta ADJ_TYP_NM = MCMeta.createStringMeta("ADJ_TYP_NM", "");

	/**
	 * 振替配賦科目ＣＤ.<p>
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
	public static final MCMeta ALC_AC_CD = MCMeta.createStringMeta("ALC_AC_CD", "", 20);

	/**
	 * 配賦科目名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ALC_AC_NM = MCMeta.createStringMeta("ALC_AC_NM", "", 40);

	/**
	 * 配賦科目グループＣＤ.<p>
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
	public static final MCMeta ALC_AC_GRP_CD = MCMeta.createStringMeta("ALC_AC_GRP_CD", "", 10);

	/**
	 * 配賦科目グループ名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ALC_AC_GRP_NM = MCMeta.createStringMeta("ALC_AC_GRP_NM", "", 40);

	/**
	 * 配賦科目グループ区分.<p>
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
	public static final MCMeta ALC_AC_GRP_TYP = MCMeta.createStringMeta("ALC_AC_GRP_TYP", "", 1);

	/**
	 * 配賦科目グループ区分名.<p>
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
	public static final MCMeta ALC_AC_GRP_TYP_NM = MCMeta.createStringMeta("ALC_AC_GRP_TYP_NM", "");

	/**
	 * 配賦率計算区分.<p>
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
	public static final MCMeta ALC_CALC_TYP = MCMeta.createStringMeta("ALC_CALC_TYP", "", 1);

	/**
	 * 配賦率計算区分名.<p>
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
	public static final MCMeta ALC_CALC_TYP_NM = MCMeta.createStringMeta("ALC_CALC_TYP_NM", "");

	/**
	 * 配賦係数ＣＤ.<p>
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
	public static final MCMeta ALC_COEF_CD = MCMeta.createStringMeta("ALC_COEF_CD", "", 20);

	/**
	 * 配賦係数名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ALC_COEF_NM = MCMeta.createStringMeta("ALC_COEF_NM", "", 40);

	/**
	 * 配賦パタンＣＤ.<p>
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
	public static final MCMeta ALC_PTN_CD = MCMeta.createStringMeta("ALC_PTN_CD", "", 10);

	/**
	 * 配賦パタン名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ALC_PTN_NM = MCMeta.createStringMeta("ALC_PTN_NM", "", 40);

	/**
	 * 配賦方法区分.<p>
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
	public static final MCMeta ALC_RULE_TYP = MCMeta.createStringMeta("ALC_RULE_TYP", "", 1);

	/**
	 * 配賦方法区分名.<p>
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
	public static final MCMeta ALC_RULE_TYP_NM = MCMeta.createStringMeta("ALC_RULE_TYP_NM", "");

	/**
	 * 配賦対象区分.<p>
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
	public static final MCMeta ALC_TGT_TYP = MCMeta.createStringMeta("ALC_TGT_TYP", "", 1);

	/**
	 * 配賦対象区分名.<p>
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
	public static final MCMeta ALC_TGT_TYP_NM = MCMeta.createStringMeta("ALC_TGT_TYP_NM", "");

	/**
	 * 配賦基準値区分.<p>
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
	public static final MCMeta ALC_VAL_TYP = MCMeta.createStringMeta("ALC_VAL_TYP", "", 1);

	/**
	 * 配賦基準値区分名.<p>
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
	public static final MCMeta ALC_VAL_TYP_NM = MCMeta.createStringMeta("ALC_VAL_TYP_NM", "");

	/**
	 * 金額設定区分.<p>
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
	public static final MCMeta AMT_SET_TYP = MCMeta.createStringMeta("AMT_SET_TYP", "", 1);

	/**
	 * 金額設定区分名.<p>
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
	public static final MCMeta AMT_SET_TYP_NM = MCMeta.createStringMeta("AMT_SET_TYP_NM", "");

	/**
	 * 差額計算区分.<p>
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
	public static final MCMeta BAL_CALC_TYP = MCMeta.createStringMeta("BAL_CALC_TYP", "", 1);

	/**
	 * 差額計算区分名.<p>
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
	public static final MCMeta BAL_CALC_TYP_NM = MCMeta.createStringMeta("BAL_CALC_TYP_NM", "");

	/**
	 * 内訳集計区分.<p>
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
	public static final MCMeta BD_AGG_TYP = MCMeta.createStringMeta("BD_AGG_TYP", "", 1);

	/**
	 * 内訳集計区分名.<p>
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
	public static final MCMeta BD_AGG_TYP_NM = MCMeta.createStringMeta("BD_AGG_TYP_NM", "");

	/**
	 * 計算カテゴリＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>10</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>7</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CALC_CTG_CD = MCMeta.createStringMeta("CALC_CTG_CD", "", 10);

	/**
	 * 計算カテゴリ名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CALC_CTG_NM = MCMeta.createStringMeta("CALC_CTG_NM", "", 40);

	/**
	 * 計算カテゴリ区分.<p>
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
	public static final MCMeta CALC_CTG_TYP = MCMeta.createStringMeta("CALC_CTG_TYP", "", 2);

	/**
	 * 計算カテゴリ区分名.<p>
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
	public static final MCMeta CALC_CTG_TYP_NM = MCMeta.createStringMeta("CALC_CTG_TYP_NM", "");

	/**
	 * 計算グループＣＤ.<p>
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
	public static final MCMeta CALC_GRP_CD = MCMeta.createStringMeta("CALC_GRP_CD", "", 10);

	/**
	 * 計算グループ名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CALC_GRP_NM = MCMeta.createStringMeta("CALC_GRP_NM", "", 40);

	/**
	 * 原価計算ＮＯ.<p>
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
	public static final MCMeta CALC_NO = MCMeta.createStringMeta("CALC_NO", "", 15);

	/**
	 * パラメータ.<p>
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
	public static final MCMeta CALC_PARM_KEY = MCMeta.createStringMeta("CALC_PARM_KEY", "", 20);

	/**
	 * パラメータ値.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>200</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CALC_PARM_VAL = MCMeta.createStringMeta("CALC_PARM_VAL", "", 200);

	/**
	 * 計算パタンＣＤ.<p>
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
	public static final MCMeta CALC_PTN_CD = MCMeta.createStringMeta("CALC_PTN_CD", "", 10);

	/**
	 * 計算パタン名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CALC_PTN_NM = MCMeta.createStringMeta("CALC_PTN_NM", "", 40);

	/**
	 * 計算順序グループ.<p>
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
	public static final MCMeta CALC_SEQ_GRP = MCMeta.createStringMeta("CALC_SEQ_GRP", "", 10);

	/**
	 * 比較パタンＣＤ.<p>
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
	public static final MCMeta CMP_PTN_CD = MCMeta.createStringMeta("CMP_PTN_CD", "", 20);

	/**
	 * 比較パタン名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CMP_PTN_NM = MCMeta.createStringMeta("CMP_PTN_NM", "", 40);

	/**
	 * 配賦係数構成区分.<p>
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
	public static final MCMeta COEF_CONFIG_TYP = MCMeta.createStringMeta("COEF_CONFIG_TYP", "", 1);

	/**
	 * 配賦係数構成区分名.<p>
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
	public static final MCMeta COEF_CONFIG_TYP_NM = MCMeta.createStringMeta("COEF_CONFIG_TYP_NM", "");

	/**
	 * 項目ＣＤ.<p>
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
	public static final MCMeta COL_CD = MCMeta.createStringMeta("COL_CD", "", 10);

	/**
	 * 項目名.<p>
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
	public static final MCMeta COL_NM = MCMeta.createStringMeta("COL_NM", "", 100);

	/**
	 * 項目処理区分.<p>
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
	public static final MCMeta COL_PROC_TYP = MCMeta.createStringMeta("COL_PROC_TYP", "", 1);

	/**
	 * 項目処理区分名.<p>
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
	public static final MCMeta COL_PROC_TYP_NM = MCMeta.createStringMeta("COL_PROC_TYP_NM", "");

	/**
	 * 計算区分.<p>
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
	public static final MCMeta COST_CALC_TYP = MCMeta.createStringMeta("COST_CALC_TYP", "", 1);

	/**
	 * 計算区分名.<p>
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
	public static final MCMeta COST_CALC_TYP_NM = MCMeta.createStringMeta("COST_CALC_TYP_NM", "");

	/**
	 * 品群ＣＤ.<p>
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
	public static final MCMeta COST_CTG_CD = MCMeta.createStringMeta("COST_CTG_CD", "", 20);

	/**
	 * 品群名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta COST_CTG_NM = MCMeta.createStringMeta("COST_CTG_NM", "", 40);

	/**
	 * 原価入出庫区分.<p>
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
	public static final MCMeta COST_IO_TYP = MCMeta.createStringMeta("COST_IO_TYP", "", 2);

	/**
	 * 原価入出庫区分名.<p>
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
	public static final MCMeta COST_IO_TYP_NM = MCMeta.createStringMeta("COST_IO_TYP_NM", "");

	/**
	 * 原価パタン.<p>
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
	public static final MCMeta COST_PTN = MCMeta.createStringMeta("COST_PTN", "", 20);

	/**
	 * 売上分類ＣＤ.<p>
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
	public static final MCMeta COST_SLS_CD = MCMeta.createStringMeta("COST_SLS_CD", "", 10);

	/**
	 * 売上分類名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta COST_SLS_NM = MCMeta.createStringMeta("COST_SLS_NM", "", 40);

	/**
	 * 売上分類区分.<p>
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
	public static final MCMeta COST_SLS_TYP = MCMeta.createStringMeta("COST_SLS_TYP", "", 1);

	/**
	 * 売上分類区分名.<p>
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
	public static final MCMeta COST_SLS_TYP_NM = MCMeta.createStringMeta("COST_SLS_TYP_NM", "");

	/**
	 * 原価テーブル区分.<p>
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
	public static final MCMeta COST_TABLE_TYP = MCMeta.createStringMeta("COST_TABLE_TYP", "", 30);

	/**
	 * 原価テーブル区分名.<p>
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
	public static final MCMeta COST_TABLE_TYP_NM = MCMeta.createStringMeta("COST_TABLE_TYP_NM", "");

	/**
	 * 品群配賦グループ.<p>
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
	public static final MCMeta CTG_ALC_GRP = MCMeta.createStringMeta("CTG_ALC_GRP", "", 10);

	/**
	 * 品群構成区分.<p>
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
	public static final MCMeta CTG_CONFIG_TYP = MCMeta.createStringMeta("CTG_CONFIG_TYP", "", 1);

	/**
	 * 品群構成区分名.<p>
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
	public static final MCMeta CTG_CONFIG_TYP_NM = MCMeta.createStringMeta("CTG_CONFIG_TYP_NM", "");

	/**
	 * 品群グループＣＤ.<p>
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
	public static final MCMeta CTG_GRP_CD = MCMeta.createStringMeta("CTG_GRP_CD", "", 20);

	/**
	 * 品群グループ名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CTG_GRP_NM = MCMeta.createStringMeta("CTG_GRP_NM", "", 40);

	/**
	 * 差異計算区分.<p>
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
	public static final MCMeta DIFF_CALC_TYP = MCMeta.createStringMeta("DIFF_CALC_TYP", "", 1);

	/**
	 * 差異計算区分名.<p>
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
	public static final MCMeta DIFF_CALC_TYP_NM = MCMeta.createStringMeta("DIFF_CALC_TYP_NM", "");

	/**
	 * 差異使用区分.<p>
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
	public static final MCMeta DIFF_USE_TYP = MCMeta.createStringMeta("DIFF_USE_TYP", "", 1);

	/**
	 * 差異使用区分名.<p>
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
	public static final MCMeta DIFF_USE_TYP_NM = MCMeta.createStringMeta("DIFF_USE_TYP_NM", "");

	/**
	 * 直間区分.<p>
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
	public static final MCMeta DIRECT_TYP = MCMeta.createStringMeta("DIRECT_TYP", "", 1);

	/**
	 * 直間区分名.<p>
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
	public static final MCMeta DIRECT_TYP_NM = MCMeta.createStringMeta("DIRECT_TYP_NM", "");

	/**
	 * 部門配賦グループ.<p>
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
	public static final MCMeta DPT_ALC_GRP = MCMeta.createStringMeta("DPT_ALC_GRP", "", 10);

	/**
	 * 部門構成区分.<p>
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
	public static final MCMeta DPT_CONFIG_TYP = MCMeta.createStringMeta("DPT_CONFIG_TYP", "", 1);

	/**
	 * 部門構成区分名.<p>
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
	public static final MCMeta DPT_CONFIG_TYP_NM = MCMeta.createStringMeta("DPT_CONFIG_TYP_NM", "");

	/**
	 * 金額評価区分.<p>
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
	public static final MCMeta EVAL_TYP = MCMeta.createStringMeta("EVAL_TYP", "", 1);

	/**
	 * 金額評価区分名.<p>
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
	public static final MCMeta EVAL_TYP_NM = MCMeta.createStringMeta("EVAL_TYP_NM", "");

	/**
	 * 費目ＣＤ.<p>
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
	public static final MCMeta EXPNS_CD = MCMeta.createStringMeta("EXPNS_CD", "", 20);

	/**
	 * 費目名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta EXPNS_NM = MCMeta.createStringMeta("EXPNS_NM", "", 40);

	/**
	 * 費目グループＣＤ.<p>
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
	public static final MCMeta EXPNS_GRP_CD = MCMeta.createStringMeta("EXPNS_GRP_CD", "", 10);

	/**
	 * 費目グループ名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta EXPNS_GRP_NM = MCMeta.createStringMeta("EXPNS_GRP_NM", "", 40);

	/**
	 * 費目区分.<p>
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
	public static final MCMeta EXPNS_TYP = MCMeta.createStringMeta("EXPNS_TYP", "", 1);

	/**
	 * 費目区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>12</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta EXPNS_TYP_NM = MCMeta.createStringMeta("EXPNS_TYP_NM", "");

	/**
	 * 展開割付区分.<p>
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
	public static final MCMeta EXP_ALLOC_TYP = MCMeta.createStringMeta("EXP_ALLOC_TYP", "", 1);

	/**
	 * 展開割付区分名.<p>
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
	public static final MCMeta EXP_ALLOC_TYP_NM = MCMeta.createStringMeta("EXP_ALLOC_TYP_NM", "");

	/**
	 * 展開計算区分.<p>
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
	public static final MCMeta EXP_CALC_TYP = MCMeta.createStringMeta("EXP_CALC_TYP", "", 1);

	/**
	 * 展開計算区分名.<p>
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
	public static final MCMeta EXP_CALC_TYP_NM = MCMeta.createStringMeta("EXP_CALC_TYP_NM", "");

	/**
	 * セグメント展開区分.<p>
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
	public static final MCMeta EXP_SET_TYP = MCMeta.createStringMeta("EXP_SET_TYP", "", 1);

	/**
	 * セグメント展開区分名.<p>
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
	public static final MCMeta EXP_SET_TYP_NM = MCMeta.createStringMeta("EXP_SET_TYP_NM", "");

	/**
	 * 指値パタン.<p>
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
	public static final MCMeta FIX_PTN = MCMeta.createStringMeta("FIX_PTN", "", 20);

	/**
	 * 汎用配賦分類ＣＤ.<p>
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
	public static final MCMeta GP_ALC_CD = MCMeta.createStringMeta("GP_ALC_CD", "", 10);

	/**
	 * 汎用配賦分類名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta GP_ALC_NM = MCMeta.createStringMeta("GP_ALC_NM", "", 40);

	/**
	 * 投入対象区分.<p>
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
	public static final MCMeta INPT_ITM_TYP = MCMeta.createStringMeta("INPT_ITM_TYP", "", 1);

	/**
	 * 投入対象区分名.<p>
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
	public static final MCMeta INPT_ITM_TYP_NM = MCMeta.createStringMeta("INPT_ITM_TYP_NM", "");

	/**
	 * 投入場所区分.<p>
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
	public static final MCMeta INPT_LOC_TYP = MCMeta.createStringMeta("INPT_LOC_TYP", "", 1);

	/**
	 * 投入場所区分名.<p>
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
	public static final MCMeta INPT_LOC_TYP_NM = MCMeta.createStringMeta("INPT_LOC_TYP_NM", "");

	/**
	 * 受払項目ＣＤ.<p>
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
	public static final MCMeta IO_COL_CD = MCMeta.createStringMeta("IO_COL_CD", "", 10);

	/**
	 * 受払項目名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IO_COL_NM = MCMeta.createStringMeta("IO_COL_NM", "", 40);

	/**
	 * 受払集計単位区分.<p>
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
	public static final MCMeta IO_SML_TYP = MCMeta.createStringMeta("IO_SML_TYP", "", 1);

	/**
	 * 受払集計単位区分名.<p>
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
	public static final MCMeta IO_SML_TYP_NM = MCMeta.createStringMeta("IO_SML_TYP_NM", "");

	/**
	 * 受払対象区分.<p>
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
	public static final MCMeta IO_TGT_TYP = MCMeta.createStringMeta("IO_TGT_TYP", "", 1);

	/**
	 * 受払対象区分名.<p>
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
	public static final MCMeta IO_TGT_TYP_NM = MCMeta.createStringMeta("IO_TGT_TYP_NM", "");

	/**
	 * 入出庫振替区分.<p>
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
	public static final MCMeta IO_TRANS_TYP = MCMeta.createStringMeta("IO_TRANS_TYP", "", 1);

	/**
	 * 入出庫振替区分名.<p>
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
	public static final MCMeta IO_TRANS_TYP_NM = MCMeta.createStringMeta("IO_TRANS_TYP_NM", "");

	/**
	 * 品目配賦グループ.<p>
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
	public static final MCMeta ITM_ALC_GRP = MCMeta.createStringMeta("ITM_ALC_GRP", "", 10);

	/**
	 * 品目分析区分.<p>
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
	public static final MCMeta ITM_ANLY_TYP = MCMeta.createStringMeta("ITM_ANLY_TYP", "", 1);

	/**
	 * 品目分析区分名.<p>
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
	public static final MCMeta ITM_ANLY_TYP_NM = MCMeta.createStringMeta("ITM_ANLY_TYP_NM", "");

	/**
	 * 管理部門評価区分.<p>
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
	public static final MCMeta LOSS_EVAL_TYP = MCMeta.createStringMeta("LOSS_EVAL_TYP", "", 1);

	/**
	 * 管理部門評価区分 名.<p>
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
	public static final MCMeta LOSS_EVAL_TYP_NM = MCMeta.createStringMeta("LOSS_EVAL_TYP_NM", "");

	/**
	 * メニューＣＤ.<p>
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
	public static final MCMeta MENU_CD = MCMeta.createStringMeta("MENU_CD", "", 10);

	/**
	 * メニュー名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta MENU_NM = MCMeta.createStringMeta("MENU_NM", "", 40);

	/**
	 * メッセージＩＤ.<p>
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
	public static final MCMeta MSG_ID = MCMeta.createStringMeta("MSG_ID", "", 10);

	/**
	 * メッセージ内容.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1000</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>40</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta MSG = MCMeta.createStringMeta("MSG", "", 1000);

	/**
	 * 工程管理ＮＯ.<p>
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
	public static final MCMeta OPER_CTL_NO = MCMeta.createStringMeta("OPER_CTL_NO", "", 10);

	/**
	 * 一次配賦計算区分.<p>
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
	public static final MCMeta PRE_ALC_CALC_TYP = MCMeta.createStringMeta("PRE_ALC_CALC_TYP", "", 1);

	/**
	 * 一次配賦計算区分名.<p>
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
	public static final MCMeta PRE_ALC_CALC_TYP_NM = MCMeta.createStringMeta("PRE_ALC_CALC_TYP_NM", "");

	/**
	 * 配賦先部門パタン.<p>
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
	public static final MCMeta PRE_ALC_DPT_PTN = MCMeta.createStringMeta("PRE_ALC_DPT_PTN", "", 10);

	/**
	 * 一次配賦パタンＣＤ.<p>
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
	public static final MCMeta PRE_ALC_PTN_CD = MCMeta.createStringMeta("PRE_ALC_PTN_CD", "", 10);

	/**
	 * 一次配賦パタン名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PRE_ALC_PTN_NM = MCMeta.createStringMeta("PRE_ALC_PTN_NM", "", 40);

	/**
	 * 一次配賦基準ＣＤ.<p>
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
	public static final MCMeta PRE_ALC_RATE_CD = MCMeta.createStringMeta("PRE_ALC_RATE_CD", "", 20);

	/**
	 * 一次配賦基準名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PRE_ALC_RATE_NM = MCMeta.createStringMeta("PRE_ALC_RATE_NM", "", 40);

	/**
	 * 比率設定区分.<p>
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
	public static final MCMeta PRE_ALC_SET_TYP = MCMeta.createStringMeta("PRE_ALC_SET_TYP", "", 1);

	/**
	 * 比率設定区分名.<p>
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
	public static final MCMeta PRE_ALC_SET_TYP_NM = MCMeta.createStringMeta("PRE_ALC_SET_TYP_NM", "");

	/**
	 * 部門配賦区分.<p>
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
	public static final MCMeta PRE_ALC_TYP = MCMeta.createStringMeta("PRE_ALC_TYP", "", 1);

	/**
	 * 部門配賦区分名.<p>
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
	public static final MCMeta PRE_ALC_TYP_NM = MCMeta.createStringMeta("PRE_ALC_TYP_NM", "");

	/**
	 * プロジェクトＣＤ.<p>
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
	public static final MCMeta PRJ_CD = MCMeta.createStringMeta("PRJ_CD", "", 20);

	/**
	 * プロジェクト名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PRJ_NM = MCMeta.createStringMeta("PRJ_NM", "", 40);

	/**
	 * プロジェクトグループＣＤ.<p>
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
	public static final MCMeta PRJ_GRP_CD = MCMeta.createStringMeta("PRJ_GRP_CD", "", 20);

	/**
	 * プロジェクトグループ名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PRJ_GRP_NM = MCMeta.createStringMeta("PRJ_GRP_NM", "", 40);

	/**
	 * プロジェクトグループ区分.<p>
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
	public static final MCMeta PRJ_GRP_TYP = MCMeta.createStringMeta("PRJ_GRP_TYP", "", 1);

	/**
	 * プロジェクトグループ区分名.<p>
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
	public static final MCMeta PRJ_GRP_TYP_NM = MCMeta.createStringMeta("PRJ_GRP_TYP_NM", "");

	/**
	 * プロジェクト備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1000</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PRJ_RMRKS = MCMeta.createStringMeta("PRJ_RMRKS", "", 1000);

	/**
	 * プロジェクト対象区分.<p>
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
	public static final MCMeta PRJ_TGT_TYP = MCMeta.createStringMeta("PRJ_TGT_TYP", "", 1);

	/**
	 * プロジェクト対象区分名.<p>
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
	public static final MCMeta PRJ_TGT_TYP_NM = MCMeta.createStringMeta("PRJ_TGT_TYP_NM", "");

	/**
	 * 製造購買区分.<p>
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
	public static final MCMeta MFG_PURC_TYP = MCMeta.createStringMeta("MFG_PURC_TYP", "", 1);

	/**
	 * 製造購買区分名.<p>
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
	public static final MCMeta MFG_PURC_TYP_NM = MCMeta.createStringMeta("MFG_PURC_TYP_NM", "");

	/**
	 * 支給パタン.<p>
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
	public static final MCMeta PROV_PTN = MCMeta.createStringMeta("PROV_PTN", "", 20);

	/**
	 * 購買パタン.<p>
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
	public static final MCMeta PURC_PTN = MCMeta.createStringMeta("PURC_PTN", "", 20);

	/**
	 * 数量単位区分.<p>
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
	public static final MCMeta QTY_UNIT_TYP = MCMeta.createStringMeta("QTY_UNIT_TYP", "", 1);

	/**
	 * 数量単位区分名.<p>
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
	public static final MCMeta QTY_UNIT_TYP_NM = MCMeta.createStringMeta("QTY_UNIT_TYP_NM", "");

	/**
	 * 改訂番号.<p>
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
	public static final MCMeta REV_NO = MCMeta.createStringMeta("REV_NO", "", 10);

	/**
	 * レポートキーＣＤ.<p>
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
	public static final MCMeta RPT_KEY_CD = MCMeta.createStringMeta("RPT_KEY_CD", "", 5);

	/**
	 * レポートキー名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta RPT_KEY_NM = MCMeta.createStringMeta("RPT_KEY_NM", "", 40);

	/**
	 * レポートキー区分.<p>
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
	public static final MCMeta RPT_KEY_TYP = MCMeta.createStringMeta("RPT_KEY_TYP", "", 1);

	/**
	 * レポートキー区分名.<p>
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
	public static final MCMeta RPT_KEY_TYP_NM = MCMeta.createStringMeta("RPT_KEY_TYP_NM", "");

	/**
	 * 接頭語.<p>
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
	public static final MCMeta RPT_PRE_WORD = MCMeta.createStringMeta("RPT_PRE_WORD", "", 10);

	/**
	 * レポートパタンＣＤ.<p>
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
	public static final MCMeta RPT_PTN_CD = MCMeta.createStringMeta("RPT_PTN_CD", "", 10);

	/**
	 * レポートパタン名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta RPT_PTN_NM = MCMeta.createStringMeta("RPT_PTN_NM", "", 40);

	/**
	 * レポート行ＣＤ.<p>
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
	public static final MCMeta RPT_ROW_CD = MCMeta.createStringMeta("RPT_ROW_CD", "", 10);

	/**
	 * レポート行名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta RPT_ROW_NM = MCMeta.createStringMeta("RPT_ROW_NM", "", 40);

	/**
	 * レポート対象区分.<p>
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
	public static final MCMeta RPT_TGT_TYP = MCMeta.createStringMeta("RPT_TGT_TYP", "", 1);

	/**
	 * レポート対象区分名.<p>
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
	public static final MCMeta RPT_TGT_TYP_NM = MCMeta.createStringMeta("RPT_TGT_TYP_NM", "");

	/**
	 * 予実区分.<p>
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
	public static final MCMeta SA_TYP = MCMeta.createStringMeta("SA_TYP", "", 1);

	/**
	 * 予実区分名.<p>
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
	public static final MCMeta SA_TYP_NM = MCMeta.createStringMeta("SA_TYP_NM", "");

	/**
	 * セグメント１.<p>
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
	public static final MCMeta SEG1 = MCMeta.createStringMeta("SEG1", "", 20);

	/**
	 * セグメント２.<p>
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
	public static final MCMeta SEG2 = MCMeta.createStringMeta("SEG2", "", 20);

	/**
	 * セグメント３.<p>
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
	public static final MCMeta SEG3 = MCMeta.createStringMeta("SEG3", "", 20);

	/**
	 * セグメント４.<p>
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
	public static final MCMeta SEG4 = MCMeta.createStringMeta("SEG4", "", 20);

	/**
	 * セグメント５.<p>
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
	public static final MCMeta SEG5 = MCMeta.createStringMeta("SEG5", "", 20);

	/**
	 * セグメント設定区分.<p>
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
	public static final MCMeta SEG_SET_TYP = MCMeta.createStringMeta("SEG_SET_TYP", "", 1);

	/**
	 * セグメント設定区分名.<p>
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
	public static final MCMeta SEG_SET_TYP_NM = MCMeta.createStringMeta("SEG_SET_TYP_NM", "");

	/**
	 * 生販使用区分.<p>
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
	public static final MCMeta PS_USE_TYP = MCMeta.createStringMeta("PS_USE_TYP", "", 1);

	/**
	 * 生販使用区分名.<p>
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
	public static final MCMeta PS_USE_TYP_NM = MCMeta.createStringMeta("PS_USE_TYP_NM", "");

	/**
	 * 設定対象区分.<p>
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
	public static final MCMeta SET_TGT_TYP = MCMeta.createStringMeta("SET_TGT_TYP", "", 1);

	/**
	 * 設定対象区分名.<p>
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
	public static final MCMeta SET_TGT_TYP_NM = MCMeta.createStringMeta("SET_TGT_TYP_NM", "");

	/**
	 * 販売パタン.<p>
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
	public static final MCMeta SLS_PTN = MCMeta.createStringMeta("SLS_PTN", "", 20);

	/**
	 * 在庫評価ＣＤ.<p>
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
	public static final MCMeta STK_EVAL_CD = MCMeta.createStringMeta("STK_EVAL_CD", "", 10);

	/**
	 * 在庫評価名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta STK_EVAL_NM = MCMeta.createStringMeta("STK_EVAL_NM", "", 40);

	/**
	 * 対象項目区分.<p>
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
	public static final MCMeta TGT_COL_TYP = MCMeta.createStringMeta("TGT_COL_TYP", "", 30);

	/**
	 * 対象項目区分名.<p>
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
	public static final MCMeta TGT_COL_TYP_NM = MCMeta.createStringMeta("TGT_COL_TYP_NM", "");

	/**
	 * 部門計算区分.<p>
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
	public static final MCMeta UNIT_CALC_TYP = MCMeta.createStringMeta("UNIT_CALC_TYP", "", 1);

	/**
	 * 部門計算区分名.<p>
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
	public static final MCMeta UNIT_CALC_TYP_NM = MCMeta.createStringMeta("UNIT_CALC_TYP_NM", "");

	/**
	 * 単価設定区分.<p>
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
	public static final MCMeta UPRI_SET_TYP = MCMeta.createStringMeta("UPRI_SET_TYP", "", 1);

	/**
	 * 単価設定区分名.<p>
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
	public static final MCMeta UPRI_SET_TYP_NM = MCMeta.createStringMeta("UPRI_SET_TYP_NM", "");

	/**
	 * 固変区分.<p>
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
	public static final MCMeta VAR_TYP = MCMeta.createStringMeta("VAR_TYP", "", 1);

	/**
	 * 固変区分名.<p>
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
	public static final MCMeta VAR_TYP_NM = MCMeta.createStringMeta("VAR_TYP_NM", "");

	/**
	 * 仕掛区分.<p>
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
	public static final MCMeta WIP_TYP = MCMeta.createStringMeta("WIP_TYP", "", 1);

	/**
	 * 仕掛区分名.<p>
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
	public static final MCMeta WIP_TYP_NM = MCMeta.createStringMeta("WIP_TYP_NM", "");

	/**
	 * 工数パタン.<p>
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
	public static final MCMeta WK_PTN = MCMeta.createStringMeta("WK_PTN", "", 20);

	/**
	 * 月次計画取込区分.<p>
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
	public static final MCMeta RQMT_PLN_IMP_TYP = MCMeta.createStringMeta("RQMT_PLN_IMP_TYP", "", 1);

	/**
	 * 月次計画取込区分名.<p>
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
	public static final MCMeta RQMT_PLN_IMP_TYP_NM = MCMeta.createStringMeta("RQMT_PLN_IMP_TYP_NM", "");

	/**
	 * 製造計画取込区分.<p>
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
	public static final MCMeta MFG_PLN_IMP_TYP = MCMeta.createStringMeta("MFG_PLN_IMP_TYP", "", 1);

	/**
	 * 製造計画取込区分名.<p>
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
	public static final MCMeta MFG_PLN_IMP_TYP_NM = MCMeta.createStringMeta("MFG_PLN_IMP_TYP_NM", "");

	/**
	 * 購買計画取込区分.<p>
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
	public static final MCMeta PURC_PLN_IMP_TYP = MCMeta.createStringMeta("PURC_PLN_IMP_TYP", "", 1);

	/**
	 * 購買計画取込区分名.<p>
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
	public static final MCMeta PURC_PLN_IMP_TYP_NM = MCMeta.createStringMeta("PURC_PLN_IMP_TYP_NM", "");

	/**
	 * 売上計画取込区分.<p>
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
	public static final MCMeta SLS_PLN_IMP_TYP = MCMeta.createStringMeta("SLS_PLN_IMP_TYP", "", 1);

	/**
	 * 売上計画取込区分名.<p>
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
	public static final MCMeta SLS_PLN_IMP_TYP_NM = MCMeta.createStringMeta("SLS_PLN_IMP_TYP_NM", "");

	/**
	 * 販売単価取込区分.<p>
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
	public static final MCMeta SLS_UPRI_IMP_TYP = MCMeta.createStringMeta("SLS_UPRI_IMP_TYP", "", 1);

	/**
	 * 販売単価取込区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>27</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SLS_UPRI_IMP_TYP_NM = MCMeta.createStringMeta("SLS_UPRI_IMP_TYP_NM", "");

	/**
	 * 費用振替最大階層.<p>
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
	public static final MCMeta ALC_TRANS_MAX_LVL = MCMeta.createNumberMeta("ALC_TRANS_MAX_LVL", "", 3, 0);

	/**
	 * 費用振替最大レコード数.<p>
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
	public static final MCMeta ALC_TRANS_MAX_REC = MCMeta.createNumberMeta("ALC_TRANS_MAX_REC", "", 9, 0);

	/**
	 * 連結計算順序.<p>
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
	public static final MCMeta CON_CALC_SEQ = MCMeta.createNumberMeta("CON_CALC_SEQ", "", 3, 0);

	/**
	 * 会社数値０１.<p>
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
	public static final MCMeta CO_NUM01 = MCMeta.createNumberMeta("CO_NUM01", "", 21, 8);

	/**
	 * 会社数値０２.<p>
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
	public static final MCMeta CO_NUM02 = MCMeta.createNumberMeta("CO_NUM02", "", 21, 8);

	/**
	 * 会社数値０３.<p>
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
	public static final MCMeta CO_NUM03 = MCMeta.createNumberMeta("CO_NUM03", "", 21, 8);

	/**
	 * 会社数値０４.<p>
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
	public static final MCMeta CO_NUM04 = MCMeta.createNumberMeta("CO_NUM04", "", 21, 8);

	/**
	 * 会社数値０５.<p>
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
	public static final MCMeta CO_NUM05 = MCMeta.createNumberMeta("CO_NUM05", "", 21, 8);

	/**
	 * 会社数値０６.<p>
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
	public static final MCMeta CO_NUM06 = MCMeta.createNumberMeta("CO_NUM06", "", 21, 8);

	/**
	 * 会社数値０７.<p>
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
	public static final MCMeta CO_NUM07 = MCMeta.createNumberMeta("CO_NUM07", "", 21, 8);

	/**
	 * 会社数値０８.<p>
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
	public static final MCMeta CO_NUM08 = MCMeta.createNumberMeta("CO_NUM08", "", 21, 8);

	/**
	 * 会社数値０９.<p>
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
	public static final MCMeta CO_NUM09 = MCMeta.createNumberMeta("CO_NUM09", "", 21, 8);

	/**
	 * 会社数値１０.<p>
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
	public static final MCMeta CO_NUM10 = MCMeta.createNumberMeta("CO_NUM10", "", 21, 8);

	/**
	 * 会社数値１１.<p>
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
	public static final MCMeta CO_NUM11 = MCMeta.createNumberMeta("CO_NUM11", "", 21, 8);

	/**
	 * 会社数値１２.<p>
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
	public static final MCMeta CO_NUM12 = MCMeta.createNumberMeta("CO_NUM12", "", 21, 8);

	/**
	 * 会社数値１３.<p>
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
	public static final MCMeta CO_NUM13 = MCMeta.createNumberMeta("CO_NUM13", "", 21, 8);

	/**
	 * 会社数値１４.<p>
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
	public static final MCMeta CO_NUM14 = MCMeta.createNumberMeta("CO_NUM14", "", 21, 8);

	/**
	 * 会社数値１５.<p>
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
	public static final MCMeta CO_NUM15 = MCMeta.createNumberMeta("CO_NUM15", "", 21, 8);

	/**
	 * 会社数値１６.<p>
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
	public static final MCMeta CO_NUM16 = MCMeta.createNumberMeta("CO_NUM16", "", 21, 8);

	/**
	 * 会社数値１７.<p>
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
	public static final MCMeta CO_NUM17 = MCMeta.createNumberMeta("CO_NUM17", "", 21, 8);

	/**
	 * 会社数値１８.<p>
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
	public static final MCMeta CO_NUM18 = MCMeta.createNumberMeta("CO_NUM18", "", 21, 8);

	/**
	 * 会社数値１９.<p>
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
	public static final MCMeta CO_NUM19 = MCMeta.createNumberMeta("CO_NUM19", "", 21, 8);

	/**
	 * 会社数値２０.<p>
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
	public static final MCMeta CO_NUM20 = MCMeta.createNumberMeta("CO_NUM20", "", 21, 8);

	/**
	 * 従業員数.<p>
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
	public static final MCMeta EMP_QTY = MCMeta.createNumberMeta("EMP_QTY", "", 9, 0);

	/**
	 * 会社日付０１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_DT01 = MCMeta.createDateMeta("CO_DT01", "");
	public static final String CO_DT01_FORMAT = "YMD";

	/**
	 * 会社日付０２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_DT02 = MCMeta.createDateMeta("CO_DT02", "");
	public static final String CO_DT02_FORMAT = "YMD";

	/**
	 * 会社日付０３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_DT03 = MCMeta.createDateMeta("CO_DT03", "");
	public static final String CO_DT03_FORMAT = "YMD";

	/**
	 * 会社日付０４.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_DT04 = MCMeta.createDateMeta("CO_DT04", "");
	public static final String CO_DT04_FORMAT = "YMD";

	/**
	 * 会社日付０５.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_DT05 = MCMeta.createDateMeta("CO_DT05", "");
	public static final String CO_DT05_FORMAT = "YMD";

	/**
	 * 会社日付０６.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_DT06 = MCMeta.createDateMeta("CO_DT06", "");
	public static final String CO_DT06_FORMAT = "YMD";

	/**
	 * 会社日付０７.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_DT07 = MCMeta.createDateMeta("CO_DT07", "");
	public static final String CO_DT07_FORMAT = "YMD";

	/**
	 * 会社日付０８.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_DT08 = MCMeta.createDateMeta("CO_DT08", "");
	public static final String CO_DT08_FORMAT = "YMD";

	/**
	 * 会社日付０９.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_DT09 = MCMeta.createDateMeta("CO_DT09", "");
	public static final String CO_DT09_FORMAT = "YMD";

	/**
	 * 会社日付１０.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_DT10 = MCMeta.createDateMeta("CO_DT10", "");
	public static final String CO_DT10_FORMAT = "YMD";

	/**
	 * 会社日付１１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_DT11 = MCMeta.createDateMeta("CO_DT11", "");
	public static final String CO_DT11_FORMAT = "YMD";

	/**
	 * 会社日付１２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_DT12 = MCMeta.createDateMeta("CO_DT12", "");
	public static final String CO_DT12_FORMAT = "YMD";

	/**
	 * 会社日付１３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_DT13 = MCMeta.createDateMeta("CO_DT13", "");
	public static final String CO_DT13_FORMAT = "YMD";

	/**
	 * 会社日付１４.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_DT14 = MCMeta.createDateMeta("CO_DT14", "");
	public static final String CO_DT14_FORMAT = "YMD";

	/**
	 * 会社日付１５.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_DT15 = MCMeta.createDateMeta("CO_DT15", "");
	public static final String CO_DT15_FORMAT = "YMD";

	/**
	 * 会社日付１６.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_DT16 = MCMeta.createDateMeta("CO_DT16", "");
	public static final String CO_DT16_FORMAT = "YMD";

	/**
	 * 会社日付１７.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_DT17 = MCMeta.createDateMeta("CO_DT17", "");
	public static final String CO_DT17_FORMAT = "YMD";

	/**
	 * 会社日付１８.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_DT18 = MCMeta.createDateMeta("CO_DT18", "");
	public static final String CO_DT18_FORMAT = "YMD";

	/**
	 * 会社日付１９.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_DT19 = MCMeta.createDateMeta("CO_DT19", "");
	public static final String CO_DT19_FORMAT = "YMD";

	/**
	 * 会社日付２０.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_DT20 = MCMeta.createDateMeta("CO_DT20", "");
	public static final String CO_DT20_FORMAT = "YMD";

	/**
	 * 住所.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>250</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ADDR = MCMeta.createStringMeta("ADDR", "", 250);

	/**
	 * 費用振替計算区分.<p>
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
	public static final MCMeta ALC_TRANS_CALC_TYP = MCMeta.createStringMeta("ALC_TRANS_CALC_TYP", "", 1);

	/**
	 * 費用振替計算区分名.<p>
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
	public static final MCMeta ALC_TRANS_CALC_TYP_NM = MCMeta.createStringMeta("ALC_TRANS_CALC_TYP_NM", "");

	/**
	 * 費用振替パタンＣＤ.<p>
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
	public static final MCMeta ALC_TRANS_PTN_CD = MCMeta.createStringMeta("ALC_TRANS_PTN_CD", "", 10);

	/**
	 * 費用振替パタン名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ALC_TRANS_PTN_NM = MCMeta.createStringMeta("ALC_TRANS_PTN_NM", "", 40);

	/**
	 * 費用振替方法ＣＤ.<p>
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
	public static final MCMeta ALC_TRANS_RULE_CD = MCMeta.createStringMeta("ALC_TRANS_RULE_CD", "", 20);

	/**
	 * 費用振替方法名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ALC_TRANS_RULE_NM = MCMeta.createStringMeta("ALC_TRANS_RULE_NM", "", 40);

	/**
	 * 連結配賦グループ振替区分.<p>
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
	public static final MCMeta ALC_TRANS_TYP = MCMeta.createStringMeta("ALC_TRANS_TYP", "", 1);

	/**
	 * 連結配賦グループ振替区分名.<p>
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
	public static final MCMeta ALC_TRANS_TYP_NM = MCMeta.createStringMeta("ALC_TRANS_TYP_NM", "");

	/**
	 * 拠点ＣＤ.<p>
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
	public static final MCMeta BASE_CD = MCMeta.createStringMeta("BASE_CD", "", 20);

	/**
	 * 拠点名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BASE_NM = MCMeta.createStringMeta("BASE_NM", "", 40);

	/**
	 * 拠点グループＣＤ.<p>
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
	public static final MCMeta BASE_GRP_CD = MCMeta.createStringMeta("BASE_GRP_CD", "", 10);

	/**
	 * 拠点グループ名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BASE_GRP_NM = MCMeta.createStringMeta("BASE_GRP_NM", "", 40);

	/**
	 * 拠点グループ区分.<p>
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
	public static final MCMeta BASE_GRP_TYP = MCMeta.createStringMeta("BASE_GRP_TYP", "", 1);

	/**
	 * 拠点グループ区分名.<p>
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
	public static final MCMeta BASE_GRP_TYP_NM = MCMeta.createStringMeta("BASE_GRP_TYP_NM", "");

	/**
	 * 連結配賦グループＣＤ.<p>
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
	public static final MCMeta CON_ALC_GRP_CD = MCMeta.createStringMeta("CON_ALC_GRP_CD", "", 20);

	/**
	 * 連結配賦グループ名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CON_ALC_GRP_NM = MCMeta.createStringMeta("CON_ALC_GRP_NM", "", 40);

	/**
	 * 連結資産区分.<p>
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
	public static final MCMeta CON_ASST_TYP = MCMeta.createStringMeta("CON_ASST_TYP", "", 1);

	/**
	 * 連結資産区分名.<p>
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
	public static final MCMeta CON_ASST_TYP_NM = MCMeta.createStringMeta("CON_ASST_TYP_NM", "");

	/**
	 * 連結計算バッチＣＤ.<p>
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
	public static final MCMeta CON_BATCH_CD = MCMeta.createStringMeta("CON_BATCH_CD", "", 10);

	/**
	 * 連結計算バッチ名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CON_BATCH_NM = MCMeta.createStringMeta("CON_BATCH_NM", "", 40);

	/**
	 * 連結計算グループＣＤ.<p>
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
	public static final MCMeta CON_CALC_GRP_CD = MCMeta.createStringMeta("CON_CALC_GRP_CD", "", 10);

	/**
	 * 連結計算グループ名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CON_CALC_GRP_NM = MCMeta.createStringMeta("CON_CALC_GRP_NM", "", 40);

	/**
	 * 連結計算パタンＣＤ.<p>
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
	public static final MCMeta CON_CALC_PTN_CD = MCMeta.createStringMeta("CON_CALC_PTN_CD", "", 10);

	/**
	 * 連結計算パタン名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CON_CALC_PTN_NM = MCMeta.createStringMeta("CON_CALC_PTN_NM", "", 40);

	/**
	 * 連結計算順序グループ.<p>
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
	public static final MCMeta CON_CALC_SEQ_GRP = MCMeta.createStringMeta("CON_CALC_SEQ_GRP", "", 10);

	/**
	 * 連結計算区分.<p>
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
	public static final MCMeta CON_CALC_TYP = MCMeta.createStringMeta("CON_CALC_TYP", "", 1);

	/**
	 * 連結計算区分名.<p>
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
	public static final MCMeta CON_CALC_TYP_NM = MCMeta.createStringMeta("CON_CALC_TYP_NM", "");

	/**
	 * 連結部門ＣＤ.<p>
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
	public static final MCMeta CON_DPT_CD = MCMeta.createStringMeta("CON_DPT_CD", "", 20);

	/**
	 * 連結部門名.<p>
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
	public static final MCMeta CON_DPT_NM = MCMeta.createStringMeta("CON_DPT_NM", "", 100);

	/**
	 * 連結部門グループＣＤ.<p>
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
	public static final MCMeta CON_DPT_GRP_CD = MCMeta.createStringMeta("CON_DPT_GRP_CD", "", 10);

	/**
	 * 連結部門グループ名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CON_DPT_GRP_NM = MCMeta.createStringMeta("CON_DPT_GRP_NM", "", 40);

	/**
	 * 連結部門グループ区分.<p>
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
	public static final MCMeta CON_DPT_GRP_TYP = MCMeta.createStringMeta("CON_DPT_GRP_TYP", "", 1);

	/**
	 * 連結部門グループ区分名.<p>
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
	public static final MCMeta CON_DPT_GRP_TYP_NM = MCMeta.createStringMeta("CON_DPT_GRP_TYP_NM", "");

	/**
	 * 連結展開計算区分.<p>
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
	public static final MCMeta CON_EXP_CALC_TYP = MCMeta.createStringMeta("CON_EXP_CALC_TYP", "", 1);

	/**
	 * 連結展開計算区分名.<p>
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
	public static final MCMeta CON_EXP_CALC_TYP_NM = MCMeta.createStringMeta("CON_EXP_CALC_TYP_NM", "");

	/**
	 * 連結受払明細ＣＤ.<p>
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
	public static final MCMeta CON_IO_DTL_CD = MCMeta.createStringMeta("CON_IO_DTL_CD", "", 20);

	/**
	 * 連結受払明細名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CON_IO_DTL_NM = MCMeta.createStringMeta("CON_IO_DTL_NM", "", 40);

	/**
	 * 連結受払区分.<p>
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
	public static final MCMeta CON_IO_TYP = MCMeta.createStringMeta("CON_IO_TYP", "", 5);

	/**
	 * 連結受払区分名.<p>
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
	public static final MCMeta CON_IO_TYP_NM = MCMeta.createStringMeta("CON_IO_TYP_NM", "");

	/**
	 * 連結レポートキーＣＤ.<p>
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
	public static final MCMeta CON_RPT_KEY_CD = MCMeta.createStringMeta("CON_RPT_KEY_CD", "", 5);

	/**
	 * 連結レポートキー名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CON_RPT_KEY_NM = MCMeta.createStringMeta("CON_RPT_KEY_NM", "", 40);

	/**
	 * 連結レポートキー区分.<p>
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
	public static final MCMeta CON_RPT_KEY_TYP = MCMeta.createStringMeta("CON_RPT_KEY_TYP", "", 2);

	/**
	 * 連結レポートキー区分名.<p>
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
	public static final MCMeta CON_RPT_KEY_TYP_NM = MCMeta.createStringMeta("CON_RPT_KEY_TYP_NM", "");

	/**
	 * 連結レポートパタンＣＤ.<p>
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
	public static final MCMeta CON_RPT_PTN_CD = MCMeta.createStringMeta("CON_RPT_PTN_CD", "", 10);

	/**
	 * 連結レポートパタン名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CON_RPT_PTN_NM = MCMeta.createStringMeta("CON_RPT_PTN_NM", "", 40);

	/**
	 * 連結レポート行ＣＤ.<p>
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
	public static final MCMeta CON_RPT_ROW_CD = MCMeta.createStringMeta("CON_RPT_ROW_CD", "", 10);

	/**
	 * 連結レポート行名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CON_RPT_ROW_NM = MCMeta.createStringMeta("CON_RPT_ROW_NM", "", 40);

	/**
	 * 連結レポート対象区分.<p>
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
	public static final MCMeta CON_RPT_TGT_TYP = MCMeta.createStringMeta("CON_RPT_TGT_TYP", "", 1);

	/**
	 * 連結レポート対象区分名.<p>
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
	public static final MCMeta CON_RPT_TGT_TYP_NM = MCMeta.createStringMeta("CON_RPT_TGT_TYP_NM", "");

	/**
	 * 連結セグメントＣＤ.<p>
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
	public static final MCMeta CON_SEG_CD = MCMeta.createStringMeta("CON_SEG_CD", "", 20);

	/**
	 * 連結セグメント名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CON_SEG_NM = MCMeta.createStringMeta("CON_SEG_NM", "", 40);

	/**
	 * 連結セグメント区分.<p>
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
	public static final MCMeta CON_SEG_TYP = MCMeta.createStringMeta("CON_SEG_TYP", "", 1);

	/**
	 * 連結セグメント区分名.<p>
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
	public static final MCMeta CON_SEG_TYP_NM = MCMeta.createStringMeta("CON_SEG_TYP_NM", "");

	/**
	 * 連結入出庫区分.<p>
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
	public static final MCMeta CON_STK_IO_TYP = MCMeta.createStringMeta("CON_STK_IO_TYP", "", 2);

	/**
	 * 連結入出庫区分名.<p>
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
	public static final MCMeta CON_STK_IO_TYP_NM = MCMeta.createStringMeta("CON_STK_IO_TYP_NM", "");

	/**
	 * 会社文字列０１.<p>
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
	public static final MCMeta CO_CHAR01 = MCMeta.createStringMeta("CO_CHAR01", "", 100);

	/**
	 * 会社文字列０２.<p>
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
	public static final MCMeta CO_CHAR02 = MCMeta.createStringMeta("CO_CHAR02", "", 100);

	/**
	 * 会社文字列０３.<p>
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
	public static final MCMeta CO_CHAR03 = MCMeta.createStringMeta("CO_CHAR03", "", 100);

	/**
	 * 会社文字列０４.<p>
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
	public static final MCMeta CO_CHAR04 = MCMeta.createStringMeta("CO_CHAR04", "", 100);

	/**
	 * 会社文字列０５.<p>
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
	public static final MCMeta CO_CHAR05 = MCMeta.createStringMeta("CO_CHAR05", "", 100);

	/**
	 * 会社文字列０６.<p>
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
	public static final MCMeta CO_CHAR06 = MCMeta.createStringMeta("CO_CHAR06", "", 100);

	/**
	 * 会社文字列０７.<p>
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
	public static final MCMeta CO_CHAR07 = MCMeta.createStringMeta("CO_CHAR07", "", 100);

	/**
	 * 会社文字列０８.<p>
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
	public static final MCMeta CO_CHAR08 = MCMeta.createStringMeta("CO_CHAR08", "", 100);

	/**
	 * 会社文字列０９.<p>
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
	public static final MCMeta CO_CHAR09 = MCMeta.createStringMeta("CO_CHAR09", "", 100);

	/**
	 * 会社文字列１０.<p>
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
	public static final MCMeta CO_CHAR10 = MCMeta.createStringMeta("CO_CHAR10", "", 100);

	/**
	 * 会社文字列１１.<p>
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
	public static final MCMeta CO_CHAR11 = MCMeta.createStringMeta("CO_CHAR11", "", 100);

	/**
	 * 会社文字列１２.<p>
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
	public static final MCMeta CO_CHAR12 = MCMeta.createStringMeta("CO_CHAR12", "", 100);

	/**
	 * 会社文字列１３.<p>
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
	public static final MCMeta CO_CHAR13 = MCMeta.createStringMeta("CO_CHAR13", "", 100);

	/**
	 * 会社文字列１４.<p>
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
	public static final MCMeta CO_CHAR14 = MCMeta.createStringMeta("CO_CHAR14", "", 100);

	/**
	 * 会社文字列１５.<p>
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
	public static final MCMeta CO_CHAR15 = MCMeta.createStringMeta("CO_CHAR15", "", 100);

	/**
	 * 会社文字列１６.<p>
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
	public static final MCMeta CO_CHAR16 = MCMeta.createStringMeta("CO_CHAR16", "", 100);

	/**
	 * 会社文字列１７.<p>
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
	public static final MCMeta CO_CHAR17 = MCMeta.createStringMeta("CO_CHAR17", "", 100);

	/**
	 * 会社文字列１８.<p>
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
	public static final MCMeta CO_CHAR18 = MCMeta.createStringMeta("CO_CHAR18", "", 100);

	/**
	 * 会社文字列１９.<p>
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
	public static final MCMeta CO_CHAR19 = MCMeta.createStringMeta("CO_CHAR19", "", 100);

	/**
	 * 会社文字列２０.<p>
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
	public static final MCMeta CO_CHAR20 = MCMeta.createStringMeta("CO_CHAR20", "", 100);

	/**
	 * 会社グループＣＤ.<p>
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
	public static final MCMeta CO_GRP_CD = MCMeta.createStringMeta("CO_GRP_CD", "", 10);

	/**
	 * 会社グループ名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_GRP_NM = MCMeta.createStringMeta("CO_GRP_NM", "", 40);

	/**
	 * 会社グループ区分.<p>
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
	public static final MCMeta CO_GRP_TYP = MCMeta.createStringMeta("CO_GRP_TYP", "", 1);

	/**
	 * 会社グループ区分名.<p>
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
	public static final MCMeta CO_GRP_TYP_NM = MCMeta.createStringMeta("CO_GRP_TYP_NM", "");

	/**
	 * 会社テキスト０１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1000</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_TEXT01 = MCMeta.createStringMeta("CO_TEXT01", "", 1000);

	/**
	 * 会社テキスト０２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1000</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_TEXT02 = MCMeta.createStringMeta("CO_TEXT02", "", 1000);

	/**
	 * 会社テキスト０３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1000</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_TEXT03 = MCMeta.createStringMeta("CO_TEXT03", "", 1000);

	/**
	 * 会社テキスト０４.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1000</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_TEXT04 = MCMeta.createStringMeta("CO_TEXT04", "", 1000);

	/**
	 * 会社テキスト０５.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1000</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_TEXT05 = MCMeta.createStringMeta("CO_TEXT05", "", 1000);

	/**
	 * 会社テキスト０６.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1000</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_TEXT06 = MCMeta.createStringMeta("CO_TEXT06", "", 1000);

	/**
	 * 会社テキスト０７.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1000</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_TEXT07 = MCMeta.createStringMeta("CO_TEXT07", "", 1000);

	/**
	 * 会社テキスト０８.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1000</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_TEXT08 = MCMeta.createStringMeta("CO_TEXT08", "", 1000);

	/**
	 * 会社テキスト０９.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1000</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_TEXT09 = MCMeta.createStringMeta("CO_TEXT09", "", 1000);

	/**
	 * 会社テキスト１０.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1000</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CO_TEXT10 = MCMeta.createStringMeta("CO_TEXT10", "", 1000);

	/**
	 * 管理会社ＣＤ.<p>
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
	public static final MCMeta MNG_CO_CD = MCMeta.createStringMeta("MNG_CO_CD", "", 10);

	/**
	 * 管理会社名.<p>
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
	public static final MCMeta MNG_CO_NM = MCMeta.createStringMeta("MNG_CO_NM", "", 100);

	/**
	 * 管理会社別名１.<p>
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
	 */
	public static final MCMeta MNG_CO_LNM1 = MCMeta.createStringMeta("MNG_CO_LNM1", "", 100);

	/**
	 * 管理会社別名２.<p>
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
	 */
	public static final MCMeta MNG_CO_LNM2 = MCMeta.createStringMeta("MNG_CO_LNM2", "", 100);

	/**
	 * 管理会社別名３.<p>
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
	 */
	public static final MCMeta MNG_CO_LNM3 = MCMeta.createStringMeta("MNG_CO_LNM3", "", 100);

	/**
	 * 管理会社別名４.<p>
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
	 */
	public static final MCMeta MNG_CO_LNM4 = MCMeta.createStringMeta("MNG_CO_LNM4", "", 100);

	/**
	 * 仕訳実行回数.<p>
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
	public static final MCMeta JNL_FIN_CNT = MCMeta.createNumberMeta("JNL_FIN_CNT", "", 2, 0);

	/**
	 * 予備ＮＵＭ項目１.<p>
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
	public static final MCMeta SUB_NUM1 = MCMeta.createNumberMeta("SUB_NUM1", "", 21, 8);

	/**
	 * 予備ＮＵＭ項目２.<p>
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
	public static final MCMeta SUB_NUM2 = MCMeta.createNumberMeta("SUB_NUM2", "", 21, 8);

	/**
	 * 予備ＮＵＭ項目３.<p>
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
	public static final MCMeta SUB_NUM3 = MCMeta.createNumberMeta("SUB_NUM3", "", 21, 8);

	/**
	 * 請求書ＮＯ.<p>
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
	public static final MCMeta BILL_NO = MCMeta.createStringMeta("BILL_NO", "", 15);

	/**
	 * 請求明細ＮＯ.<p>
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
	public static final MCMeta BILL_D_NO = MCMeta.createStringMeta("BILL_D_NO", "", 15);

	/**
	 * 振出人名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta DRAWER_NM = MCMeta.createStringMeta("DRAWER_NM", "", 40);

	/**
	 * データＮＯ.<p>
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
	public static final MCMeta IT_DAT_NO = MCMeta.createStringMeta("IT_DAT_NO", "", 15);

	/**
	 * 仕訳処理ＮＯ.<p>
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
	public static final MCMeta JNL_PROC_NO = MCMeta.createStringMeta("JNL_PROC_NO", "", 10);

	/**
	 * 引受人.<p>
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
	public static final MCMeta NOTE_ACCPTR = MCMeta.createStringMeta("NOTE_ACCPTR", "", 30);

	/**
	 * 裏書人.<p>
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
	public static final MCMeta NOTE_ENDRSR = MCMeta.createStringMeta("NOTE_ENDRSR", "", 30);

	/**
	 * 手形番号.<p>
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
	public static final MCMeta NOTE_NO = MCMeta.createStringMeta("NOTE_NO", "", 20);

	/**
	 * 手形区分.<p>
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
	public static final MCMeta NOTE_TYP = MCMeta.createStringMeta("NOTE_TYP", "", 1);

	/**
	 * 手形区分名.<p>
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
	public static final MCMeta NOTE_TYP_NM = MCMeta.createStringMeta("NOTE_TYP_NM", "");

	/**
	 * 支払ＮＯ.<p>
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
	public static final MCMeta PAY_CHK_NO = MCMeta.createStringMeta("PAY_CHK_NO", "", 15);

	/**
	 * 発注ＮＯ.<p>
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
	public static final MCMeta PO_NO = MCMeta.createStringMeta("PO_NO", "", 15);

	/**
	 * 伝票ＮＯ.<p>
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
	public static final MCMeta SLIP_NO = MCMeta.createStringMeta("SLIP_NO", "", 15);

	/**
	 * 受注ＮＯ.<p>
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
	public static final MCMeta SLO_NO = MCMeta.createStringMeta("SLO_NO", "", 15);

	/**
	 * 受注明細ＮＯ.<p>
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
	public static final MCMeta SLO_D_NO = MCMeta.createStringMeta("SLO_D_NO", "", 15);

	/**
	 * 予備ＣＨＡＲ項目１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SUB_CHAR1 = MCMeta.createStringMeta("SUB_CHAR1", "", 50);

	/**
	 * 予備ＣＨＡＲ項目２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SUB_CHAR2 = MCMeta.createStringMeta("SUB_CHAR2", "", 50);

	/**
	 * 予備ＣＨＡＲ項目３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SUB_CHAR3 = MCMeta.createStringMeta("SUB_CHAR3", "", 50);

	/**
	 * 予備ＣＨＡＲ項目４.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SUB_CHAR4 = MCMeta.createStringMeta("SUB_CHAR4", "", 50);

	/**
	 * 予備ＣＨＡＲ項目５.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SUB_CHAR5 = MCMeta.createStringMeta("SUB_CHAR5", "", 50);

	/**
	 * 予備ＣＨＡＲ項目６.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SUB_CHAR6 = MCMeta.createStringMeta("SUB_CHAR6", "", 50);

	/**
	 * 予備ＣＨＡＲ項目７.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SUB_CHAR7 = MCMeta.createStringMeta("SUB_CHAR7", "", 50);

	/**
	 * 予備ＣＨＡＲ項目８.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SUB_CHAR8 = MCMeta.createStringMeta("SUB_CHAR8", "", 50);

	/**
	 * 予備ＣＨＡＲ項目９.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SUB_CHAR9 = MCMeta.createStringMeta("SUB_CHAR9", "", 50);

	/**
	 * 予備ＣＨＡＲ項目１０.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SUB_CHAR10 = MCMeta.createStringMeta("SUB_CHAR10", "", 50);

	/**
	 * 受払ＩＦ備考１.<p>
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
	public static final MCMeta TRAN_IF_RMRKS1 = MCMeta.createStringMeta("TRAN_IF_RMRKS1", "", 100);

	/**
	 * 受払ＩＦ備考２.<p>
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
	public static final MCMeta TRAN_IF_RMRKS2 = MCMeta.createStringMeta("TRAN_IF_RMRKS2", "", 100);

	/**
	 * 入金実績ＩＦ備考１.<p>
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
	public static final MCMeta RCV_ACT_IF_RMRKS1 = MCMeta.createStringMeta("RCV_ACT_IF_RMRKS1", "", 100);

	/**
	 * 入金実績ＩＦ備考２.<p>
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
	public static final MCMeta RCV_ACT_IF_RMRKS2 = MCMeta.createStringMeta("RCV_ACT_IF_RMRKS2", "", 100);

	/**
	 * 振替グループ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta TRD_GRP = MCMeta.createStringMeta("TRD_GRP", "", 50);

	/**
	 * 申請ＮＯ.<p>
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
	public static final MCMeta APL_NO = MCMeta.createStringMeta("APL_NO", "", 15);

	/**
	 * 承認ＮＯ.<p>
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
	public static final MCMeta APRV_NO = MCMeta.createStringMeta("APRV_NO", "", 15);

	/**
	 * 承認ＮＯ連番.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>9,0</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta APRV_NO_SEQ = MCMeta.createNumberMeta("APRV_NO_SEQ", "", 9, 0);

	/**
	 * 承認作成元ＮＯ.<p>
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
	public static final MCMeta APRV_SRC_NO = MCMeta.createStringMeta("APRV_SRC_NO", "", 15);

	/**
	 * 承認明細備考.<p>
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
	public static final MCMeta APRV_D_RMRKS = MCMeta.createStringMeta("APRV_D_RMRKS", "", 100);

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
	 * 承認情報ヘッダ<br>
	 */
	public static final MCMeta APRV_SUB_CHAR1 = MCMeta.createStringMeta("APRV_SUB_CHAR1", "", 20);

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
	 * 承認情報ヘッダ<br>
	 */
	public static final MCMeta APRV_SUB_CHAR2 = MCMeta.createStringMeta("APRV_SUB_CHAR2", "", 20);

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
	 * 承認情報ヘッダ<br>
	 */
	public static final MCMeta APRV_SUB_CHAR3 = MCMeta.createStringMeta("APRV_SUB_CHAR3", "", 20);

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
	 * 承認情報明細<br>
	 */
	public static final MCMeta APRV_D_SUB_CHAR1 = MCMeta.createStringMeta("APRV_D_SUB_CHAR1", "", 20);

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
	 * 承認情報明細<br>
	 */
	public static final MCMeta APRV_D_SUB_CHAR2 = MCMeta.createStringMeta("APRV_D_SUB_CHAR2", "", 20);

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
	 * 承認情報明細<br>
	 */
	public static final MCMeta APRV_D_SUB_CHAR3 = MCMeta.createStringMeta("APRV_D_SUB_CHAR3", "", 20);

	/**
	 * 変更ＮＯ.<p>
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
	public static final MCMeta CHNG_NO = MCMeta.createStringMeta("CHNG_NO", "", 20);

	/**
	 * 変更ＮＯ.<p>
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
	 * 削除予定<br>
	 */
	public static final MCMeta CNG_NO = MCMeta.createStringMeta("CNG_NO", "", 20);

	/**
	 * 加工単価区分.<p>
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
	public static final MCMeta PROC_UPRI_TYP = MCMeta.createStringMeta("PROC_UPRI_TYP", "", 1);

	/**
	 * 加工単価区分名.<p>
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
	public static final MCMeta PROC_UPRI_TYP_NM = MCMeta.createStringMeta("PROC_UPRI_TYP_NM", "");

	/**
	 * 投入品追加許可区分.<p>
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
	public static final MCMeta INPT_ITM_ADD_TYP = MCMeta.createStringMeta("INPT_ITM_ADD_TYP", "", 1);

	/**
	 * 投入品追加許可区分名.<p>
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
	public static final MCMeta INPT_ITM_ADD_TYP_NM = MCMeta.createStringMeta("INPT_ITM_ADD_TYP_NM", "");

	/**
	 * 投入品削除許可区分.<p>
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
	public static final MCMeta INPT_ITM_DEL_TYP = MCMeta.createStringMeta("INPT_ITM_DEL_TYP", "", 1);

	/**
	 * 投入品削除許可区分名.<p>
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
	public static final MCMeta INPT_ITM_DEL_TYP_NM = MCMeta.createStringMeta("INPT_ITM_DEL_TYP_NM", "");

	/**
	 * スケジューラ対象区分.<p>
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
	public static final MCMeta SCH_TGT_TYP = MCMeta.createStringMeta("SCH_TGT_TYP", "", 1);

	/**
	 * スケジューラ対象区分名.<p>
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
	public static final MCMeta SCH_TGT_TYP_NM = MCMeta.createStringMeta("SCH_TGT_TYP_NM", "");

	/**
	 * 代替グループＩＤ.<p>
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
	public static final MCMeta ALT_GRP_ID = MCMeta.createStringMeta("ALT_GRP_ID", "", 15);

	/**
	 * ＢＯＭ切替区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>2</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_CHNG_TYP = MCMeta.createStringMeta("BOM_CHNG_TYP", "", 1);

	/**
	 * ＢＯＭ切替区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>80</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BOM_CHNG_TYP_NM = MCMeta.createStringMeta("BOM_CHNG_TYP_NM", "");

	/**
	 * 外部システムＣＤ.<p>
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
	public static final MCMeta EXT_SYS_CD = MCMeta.createStringMeta("EXT_SYS_CD", "", 10);

	/**
	 * 外部システム名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta EXT_SYS_NM = MCMeta.createStringMeta("EXT_SYS_NM", "", 40);

	/**
	 * 外部システムユーザＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>500</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 * <br>
	 * FCM_USR_IDと同じ桁にする<br>
	 */
	public static final MCMeta EXT_SYS_USR_CD = MCMeta.createStringMeta("EXT_SYS_USR_CD", "", 500);

	/**
	 * 外部システムパスワード.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1000</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta EXT_SYS_PASS = MCMeta.createStringMeta("EXT_SYS_PASS", "", 1000);

	/**
	 * 外部システム接続情報１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1000</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta EXT_SYS_STR1 = MCMeta.createStringMeta("EXT_SYS_STR1", "", 1000);

	/**
	 * 外部システム接続情報２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1000</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta EXT_SYS_STR2 = MCMeta.createStringMeta("EXT_SYS_STR2", "", 1000);

	/**
	 * 外部システム接続情報３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1000</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta EXT_SYS_STR3 = MCMeta.createStringMeta("EXT_SYS_STR3", "", 1000);

	/**
	 * 外部システム接続情報４.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1000</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta EXT_SYS_STR4 = MCMeta.createStringMeta("EXT_SYS_STR4", "", 1000);

	/**
	 * 外部システム接続情報５.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1000</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta EXT_SYS_STR5 = MCMeta.createStringMeta("EXT_SYS_STR5", "", 1000);

	/**
	 * ＩＦ制御区分.<p>
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
	public static final MCMeta IF_CTL_TYP = MCMeta.createStringMeta("IF_CTL_TYP", "", 30);

	/**
	 * ＩＦ制御区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>50</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_CTL_TYP_NM = MCMeta.createStringMeta("IF_CTL_TYP_NM", "");

	/**
	 * 内容（文字列）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>300</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta VAR_STR = MCMeta.createStringMeta("VAR_STR", "", 300);

	/**
	 * 内容（数値）.<p>
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
	public static final MCMeta VAR_NUM = MCMeta.createNumberMeta("VAR_NUM", "", 21, 8);

	/**
	 * ＩＦ処理区分.<p>
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
	public static final MCMeta IF_PROC_TYP = MCMeta.createStringMeta("IF_PROC_TYP", "", 10);

	/**
	 * ＩＦ処理区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>25</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_PROC_TYP_NM = MCMeta.createStringMeta("IF_PROC_TYP_NM", "");

	/**
	 * オペレーション.<p>
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
	public static final MCMeta OPERATION = MCMeta.createStringMeta("OPERATION", "", 100);

	/**
	 * ＩＦ項目区分.<p>
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
	public static final MCMeta IF_COL_TYP = MCMeta.createStringMeta("IF_COL_TYP", "", 30);

	/**
	 * ＩＦ項目区分名.<p>
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
	public static final MCMeta IF_COL_TYP_NM = MCMeta.createStringMeta("IF_COL_TYP_NM", "");

	/**
	 * 項目変換区分.<p>
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
	public static final MCMeta COL_CONV_TYP = MCMeta.createStringMeta("COL_CONV_TYP", "", 1);

	/**
	 * 項目変換区分名.<p>
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
	public static final MCMeta COL_CONV_TYP_NM = MCMeta.createStringMeta("COL_CONV_TYP_NM", "");

	/**
	 * 自社ＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>500</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_COL_CD = MCMeta.createStringMeta("IF_COL_CD", "", 500);

	/**
	 * 相手先ＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>500</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CONV_CD = MCMeta.createStringMeta("CONV_CD", "", 500);

	/**
	 * 外部システム区分.<p>
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
	public static final MCMeta EXT_SYS_TYP = MCMeta.createStringMeta("EXT_SYS_TYP", "", 1);

	/**
	 * 外部システム区分名.<p>
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
	public static final MCMeta EXT_SYS_TYP_NM = MCMeta.createStringMeta("EXT_SYS_TYP_NM", "");

	/**
	 * ＩＦ更新区分.<p>
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
	public static final MCMeta IF_UPD_TYP = MCMeta.createStringMeta("IF_UPD_TYP", "", 1);

	/**
	 * ＩＦ更新区分名.<p>
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
	public static final MCMeta IF_UPD_TYP_NM = MCMeta.createStringMeta("IF_UPD_TYP_NM", "");

	/**
	 * 発注予定ＮＯ.<p>
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
	public static final MCMeta PO_SCHD_NO = MCMeta.createStringMeta("PO_SCHD_NO", "", 15);

	/**
	 * 発注明細ＮＯ.<p>
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
	public static final MCMeta PO_D_NO = MCMeta.createStringMeta("PO_D_NO", "", 15);

	/**
	 * 仕入予定ＮＯ.<p>
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
	public static final MCMeta PURC_SCHD_NO = MCMeta.createStringMeta("PURC_SCHD_NO", "", 15);

	/**
	 * 仕入返品予定ＮＯ.<p>
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
	public static final MCMeta PURC_RET_SCHD_NO = MCMeta.createStringMeta("PURC_RET_SCHD_NO", "", 15);

	/**
	 * 仕入返品予定明細ＮＯ.<p>
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
	public static final MCMeta PURC_RET_SCHD_D_NO = MCMeta.createStringMeta("PURC_RET_SCHD_D_NO", "", 15);

	/**
	 * 仕入実績ＮＯ.<p>
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
	public static final MCMeta PURC_ACT_NO = MCMeta.createStringMeta("PURC_ACT_NO", "", 15);

	/**
	 * 仕入実績明細ＮＯ.<p>
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
	public static final MCMeta PURC_ACT_D_NO = MCMeta.createStringMeta("PURC_ACT_D_NO", "", 15);

	/**
	 * 仕入返品実績ＮＯ.<p>
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
	public static final MCMeta PURC_RET_ACT_NO = MCMeta.createStringMeta("PURC_RET_ACT_NO", "", 15);

	/**
	 * 仕入返品実績明細ＮＯ.<p>
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
	public static final MCMeta PURC_RET_ACT_D_NO = MCMeta.createStringMeta("PURC_RET_ACT_D_NO", "", 15);

	/**
	 * 仕入返品実績受払ＮＯ.<p>
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
	public static final MCMeta PURC_RET_ACT_IO_NO = MCMeta.createStringMeta("PURC_RET_ACT_IO_NO", "", 15);

	/**
	 * 仕入返品予定受払ＮＯ.<p>
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
	public static final MCMeta PURC_RET_SCHD_IO_NO = MCMeta.createStringMeta("PURC_RET_SCHD_IO_NO", "", 15);

	/**
	 * 仕入実績受払ＮＯ.<p>
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
	public static final MCMeta PURC_ACT_IO_NO = MCMeta.createStringMeta("PURC_ACT_IO_NO", "", 15);

	/**
	 * 納入指示ＮＯ.<p>
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
	public static final MCMeta DLV_INST_NO = MCMeta.createStringMeta("DLV_INST_NO", "", 15);

	/**
	 * 納入指示明細ＮＯ.<p>
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
	public static final MCMeta DLV_INST_D_NO = MCMeta.createStringMeta("DLV_INST_D_NO", "", 15);

	/**
	 * 納期回答受領ＮＯ.<p>
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
	public static final MCMeta PRMS_RCPT_NO = MCMeta.createStringMeta("PRMS_RCPT_NO", "", 15);

	/**
	 * 納期回答受領明細ＮＯ.<p>
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
	public static final MCMeta PRMS_RCPT_D_NO = MCMeta.createStringMeta("PRMS_RCPT_D_NO", "", 15);

	/**
	 * 仕入作成元ＮＯ.<p>
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
	public static final MCMeta PURC_SRC_NO = MCMeta.createStringMeta("PURC_SRC_NO", "", 15);

	/**
	 * 発注予定作成元ＮＯ.<p>
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
	public static final MCMeta PO_SCHD_SRC_NO = MCMeta.createStringMeta("PO_SCHD_SRC_NO", "", 15);

	/**
	 * 納品書ＮＯ.<p>
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
	public static final MCMeta DLV_SLIP_NO = MCMeta.createStringMeta("DLV_SLIP_NO", "", 15);

	/**
	 * 納品書明細ＮＯ.<p>
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
	public static final MCMeta DLV_SLIP_D_NO = MCMeta.createStringMeta("DLV_SLIP_D_NO", "", 15);

	/**
	 * インボイスＮＯ.<p>
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
	 * <br>
	 * 桁数を変更する場合はIF_DLV_SLIP_NOも変更する必要がある<br>
	 */
	public static final MCMeta IV_NO = MCMeta.createStringMeta("IV_NO", "", 15);

	/**
	 * インボイス明細ＮＯ.<p>
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
	 * <br>
	 * 桁数を変更する場合はIF_DLV_SLIP_D_NOも変更する必要がある<br>
	 */
	public static final MCMeta IV_D_NO = MCMeta.createStringMeta("IV_D_NO", "", 15);

	/**
	 * 業者納品書ＮＯ.<p>
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
	 * <br>
	 * 桁数を変更する場合はIF_DLV_SLIP_NOも変更する必要がある<br>
	 */
	public static final MCMeta BP_DLV_SLIP_NO = MCMeta.createStringMeta("BP_DLV_SLIP_NO", "", 15);

	/**
	 * 業者納品書明細ＮＯ.<p>
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
	 * <br>
	 * 桁数を変更する場合はIF_DLV_SLIP_D_NOも変更する必要がある<br>
	 */
	public static final MCMeta BP_DLV_SLIP_D_NO = MCMeta.createStringMeta("BP_DLV_SLIP_D_NO", "", 15);

	/**
	 * ＩＦ納品書ＮＯ.<p>
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
	 * <br>
	 * 業者納品書ＮＯあるいはインボイスＮＯ<br>
	 * 桁数を変更する場合はIV_NO及びBP_DLV_SLIP_NOも変更する必要がある<br>
	 */
	public static final MCMeta IF_DLV_SLIP_NO = MCMeta.createStringMeta("IF_DLV_SLIP_NO", "", 15);

	/**
	 * ＩＦ納品書明細ＮＯ.<p>
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
	 * <br>
	 * 業者納品書明細ＮＯあるいはインボイス明細ＮＯ<br>
	 * 桁数を変更する場合はIV_D_NO及びBP_DLV_SLIP_D_NOも変更する必要がある<br>
	 */
	public static final MCMeta IF_DLV_SLIP_D_NO = MCMeta.createStringMeta("IF_DLV_SLIP_D_NO", "", 15);

	/**
	 * 品目製造指図ＮＯ.<p>
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
	public static final MCMeta ITM_MFG_INST_NO = MCMeta.createStringMeta("ITM_MFG_INST_NO", "", 15);

	/**
	 * 製造指図ＮＯ.<p>
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
	public static final MCMeta MFG_INST_NO = MCMeta.createStringMeta("MFG_INST_NO", "", 15);

	/**
	 * 工程オーダＮＯ.<p>
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
	public static final MCMeta OPER_ORD_NO = MCMeta.createStringMeta("OPER_ORD_NO", "", 15);

	/**
	 * 工程指図ＮＯ.<p>
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
	public static final MCMeta OPER_INST_NO = MCMeta.createStringMeta("OPER_INST_NO", "", 15);

	/**
	 * 工程実績ＮＯ.<p>
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
	public static final MCMeta OPER_ACT_NO = MCMeta.createStringMeta("OPER_ACT_NO", "", 15);

	/**
	 * 実績受払ＮＯ.<p>
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
	public static final MCMeta ACT_IO_NO = MCMeta.createStringMeta("ACT_IO_NO", "", 15);

	/**
	 * 受払予定伝票ＮＯ.<p>
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
	public static final MCMeta SCHD_SLIP_NO = MCMeta.createStringMeta("SCHD_SLIP_NO", "", 15);

	/**
	 * 受払予定ＮＯ.<p>
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
	public static final MCMeta SCHD_IO_HIS_NO = MCMeta.createStringMeta("SCHD_IO_HIS_NO", "", 15);

	/**
	 * 受払予定予備ＮＯ.<p>
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
	public static final MCMeta SCHD_IO_HIS_SUB_NO = MCMeta.createStringMeta("SCHD_IO_HIS_SUB_NO", "", 15);

	/**
	 * 受払進捗管理ＮＯ.<p>
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
	public static final MCMeta IO_SCHD_PR_NO = MCMeta.createStringMeta("IO_SCHD_PR_NO", "", 15);

	/**
	 * 明細実績ＮＯ.<p>
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
	public static final MCMeta ACT_D_NO = MCMeta.createStringMeta("ACT_D_NO", "", 15);

	/**
	 * ヘッダ実績ＮＯ.<p>
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
	public static final MCMeta ACT_NO = MCMeta.createStringMeta("ACT_NO", "", 15);

	/**
	 * 他勘定振替実績明細ＮＯ.<p>
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
	public static final MCMeta ACXFR_ACT_D_NO = MCMeta.createStringMeta("ACXFR_ACT_D_NO", "", 15);

	/**
	 * 他勘定振替実績ＮＯ.<p>
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
	public static final MCMeta ACXFR_ACT_NO = MCMeta.createStringMeta("ACXFR_ACT_NO", "", 15);

	/**
	 * 他勘定振替指図明細ＮＯ.<p>
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
	public static final MCMeta ACXFR_INST_D_NO = MCMeta.createStringMeta("ACXFR_INST_D_NO", "", 15);

	/**
	 * 他勘定振替指図ＮＯ.<p>
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
	public static final MCMeta ACXFR_INST_NO = MCMeta.createStringMeta("ACXFR_INST_NO", "", 15);

	/**
	 * 他勘定振替予定ＮＯ.<p>
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
	public static final MCMeta ACXFR_SCHD_NO = MCMeta.createStringMeta("ACXFR_SCHD_NO", "", 15);

	/**
	 * 入荷実績ＮＯ.<p>
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
	public static final MCMeta ARR_ACT_NO = MCMeta.createStringMeta("ARR_ACT_NO", "", 15);

	/**
	 * 入荷進捗ＮＯ.<p>
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
	public static final MCMeta ARR_PR_NO = MCMeta.createStringMeta("ARR_PR_NO", "", 15);

	/**
	 * 入荷予定ＮＯ.<p>
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
	public static final MCMeta ARR_SCHD_NO = MCMeta.createStringMeta("ARR_SCHD_NO", "", 15);

	/**
	 * Ｂ／ＬＮＯ.<p>
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
	public static final MCMeta BL_NO = MCMeta.createStringMeta("BL_NO", "", 15);

	/**
	 * 業者ロットＮＯ.<p>
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
	public static final MCMeta BP_LOT_NO = MCMeta.createStringMeta("BP_LOT_NO", "", 15);

	/**
	 * 得意先注文明細ＮＯ.<p>
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
	public static final MCMeta CST_PO_D_NO = MCMeta.createStringMeta("CST_PO_D_NO", "", 20);

	/**
	 * 得意先注文ＮＯ.<p>
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
	public static final MCMeta CST_PO_NO = MCMeta.createStringMeta("CST_PO_NO", "", 20);

	/**
	 * 表示順.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>5,0</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta DISP_SEQ = MCMeta.createNumberMeta("DISP_SEQ", "", 5, 0);

	/**
	 * 納品実績ＮＯ.<p>
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
	public static final MCMeta DLV_ACT_NO = MCMeta.createStringMeta("DLV_ACT_NO", "", 15);

	/**
	 * 納入指示受領ＮＯ.<p>
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
	public static final MCMeta DLV_INST_RCPT_NO = MCMeta.createStringMeta("DLV_INST_RCPT_NO", "", 15);

	/**
	 * 廃棄申請ＮＯ.<p>
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
	public static final MCMeta DSPSL_NO = MCMeta.createStringMeta("DSPSL_NO", "", 15);

	/**
	 * 確定ＮＯ.<p>
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
	public static final MCMeta FIX_NO = MCMeta.createStringMeta("FIX_NO", "", 15);

	/**
	 * 受領インボイス管理ＮＯ.<p>
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
	public static final MCMeta RCPT_IV_MNG_NO = MCMeta.createStringMeta("RCPT_IV_MNG_NO", "", 15);

	/**
	 * 受領インボイス明細ＮＯ.<p>
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
	public static final MCMeta RCPT_IV_D_NO = MCMeta.createStringMeta("RCPT_IV_D_NO", "", 15);

	/**
	 * インボイス管理ＮＯ.<p>
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
	public static final MCMeta IV_MNG_NO = MCMeta.createStringMeta("IV_MNG_NO", "", 15);

	/**
	 * 受払予定ＮＯ.<p>
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
	public static final MCMeta IO_SCHD_NO = MCMeta.createStringMeta("IO_SCHD_NO", "", 15);

	/**
	 * インボイス出荷実績明細ＮＯ.<p>
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
	public static final MCMeta IV_SHIP_ACT_D_NO = MCMeta.createStringMeta("IV_SHIP_ACT_D_NO", "", 15);

	/**
	 * Ｌ／ＣＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>32</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta LC_NO = MCMeta.createStringMeta("LC_NO", "", 32);

	/**
	 * パッキングリスト明細ＮＯ.<p>
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
	public static final MCMeta PL_D_NO = MCMeta.createStringMeta("PL_D_NO", "", 15);

	/**
	 * 支給実績ＮＯ.<p>
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
	public static final MCMeta PROV_ACT_NO = MCMeta.createStringMeta("PROV_ACT_NO", "", 15);

	/**
	 * 支給予定ＮＯ.<p>
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
	public static final MCMeta PROV_SCHD_NO = MCMeta.createStringMeta("PROV_SCHD_NO", "", 15);

	/**
	 * 支給伝票ＮＯ.<p>
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
	public static final MCMeta PROV_SLIP_NO = MCMeta.createStringMeta("PROV_SLIP_NO", "", 15);

	/**
	 * 支給元実績ＮＯ.<p>
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
	public static final MCMeta PROV_SRC_ACT_NO = MCMeta.createStringMeta("PROV_SRC_ACT_NO", "", 15);

	/**
	 * 支給元予定ＮＯ.<p>
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
	public static final MCMeta PROV_SRC_SCHD_NO = MCMeta.createStringMeta("PROV_SRC_SCHD_NO", "", 15);

	/**
	 * リクエストＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>21,3</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta RQST_NO = MCMeta.createNumberMeta("RQST_NO", "", 21, 3);

	/**
	 * 品揃グループＮＯ.<p>
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
	public static final MCMeta SET_ITM_GRP_NO = MCMeta.createNumberMeta("SET_ITM_GRP_NO", "", 3, 0);

	/**
	 * 出荷実績ＮＯ.<p>
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
	public static final MCMeta SHIP_ACT_NO = MCMeta.createStringMeta("SHIP_ACT_NO", "", 15);

	/**
	 * 出荷実績明細ＮＯ.<p>
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
	public static final MCMeta SHIP_ACT_D_NO = MCMeta.createStringMeta("SHIP_ACT_D_NO", "", 15);

	/**
	 * 出荷引当状況ＮＯ.<p>
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
	public static final MCMeta SHIP_ALLOC_STS_NO = MCMeta.createStringMeta("SHIP_ALLOC_STS_NO", "", 15);

	/**
	 * 出荷指図ＮＯ.<p>
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
	public static final MCMeta SHIP_INST_NO = MCMeta.createStringMeta("SHIP_INST_NO", "", 15);

	/**
	 * 出荷指図明細ＮＯ.<p>
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
	public static final MCMeta SHIP_INST_D_NO = MCMeta.createStringMeta("SHIP_INST_D_NO", "", 15);

	/**
	 * 出荷進捗ＮＯ.<p>
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
	public static final MCMeta SHIP_PR_NO = MCMeta.createStringMeta("SHIP_PR_NO", "", 15);

	/**
	 * 出荷予定ＮＯ.<p>
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
	public static final MCMeta SHIP_SCHD_NO = MCMeta.createStringMeta("SHIP_SCHD_NO", "", 15);

	/**
	 * 伝票グループＮＯ.<p>
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
	public static final MCMeta SLIP_GRP_NO = MCMeta.createStringMeta("SLIP_GRP_NO", "", 15);

	/**
	 * 伝票行数最大値.<p>
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
	public static final MCMeta SLIP_LINE_MAX = MCMeta.createStringMeta("SLIP_LINE_MAX", "", 4);

	/**
	 * 改訂番号.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>4,0</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>3</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SLIP_REV = MCMeta.createNumberMeta("SLIP_REV", "", 4, 0);

	/**
	 * 受払予定伝票ＮＯ.<p>
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
	public static final MCMeta SLIP_SCHD_NO = MCMeta.createStringMeta("SLIP_SCHD_NO", "", 15);

	/**
	 * 連番.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>4,0</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SLIP_SEQ = MCMeta.createNumberMeta("SLIP_SEQ", "", 4, 0);

	/**
	 * 伝票状況区分.<p>
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
	public static final MCMeta SLIP_STS_TYP = MCMeta.createStringMeta("SLIP_STS_TYP", "", 1);

	/**
	 * 伝票状況区分名.<p>
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
	public static final MCMeta SLIP_STS_TYP_NM = MCMeta.createStringMeta("SLIP_STS_TYP_NM", "");

	/**
	 * 売上実績明細ＮＯ.<p>
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
	public static final MCMeta SLS_ACT_D_NO = MCMeta.createStringMeta("SLS_ACT_D_NO", "", 15);

	/**
	 * 在庫振替実績ＮＯ.<p>
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
	public static final MCMeta STK_XFR_ACT_NO = MCMeta.createStringMeta("STK_XFR_ACT_NO", "", 15);

	/**
	 * 在庫振替実績明細ＮＯ.<p>
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
	public static final MCMeta STK_XFR_ACT_D_NO = MCMeta.createStringMeta("STK_XFR_ACT_D_NO", "", 15);

	/**
	 * 棚卸実績ＮＯ.<p>
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
	public static final MCMeta STKTK_ACT_NO = MCMeta.createStringMeta("STKTK_ACT_NO", "", 15);

	/**
	 * 取引明細備考.<p>
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
	public static final MCMeta TRD_D_RMRKS = MCMeta.createStringMeta("TRD_D_RMRKS", "", 100);

	/**
	 * 取引備考.<p>
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
	public static final MCMeta TRD_RMRKS = MCMeta.createStringMeta("TRD_RMRKS", "", 100);

	/**
	 * 配送先経由区分.<p>
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
	public static final MCMeta VIA_DLV_TYP = MCMeta.createStringMeta("VIA_DLV_TYP", "", 1);

	/**
	 * 配送先経由区分名.<p>
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
	public static final MCMeta VIA_DLV_TYP_NM = MCMeta.createStringMeta("VIA_DLV_TYP_NM", "");

	/**
	 * 船名／便名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta VSSL_FLGHT = MCMeta.createStringMeta("VSSL_FLGHT", "", 40);

	/**
	 * 案件ＮＯ.<p>
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
	public static final MCMeta WRK_NO = MCMeta.createStringMeta("WRK_NO", "", 15);

	/**
	 * 案件名.<p>
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
	public static final MCMeta WRK_NM = MCMeta.createStringMeta("WRK_NM", "", 100);

	/**
	 * 源泉税率.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>5,2</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta WTAX_RATE = MCMeta.createNumberMeta("WTAX_RATE", "", 5, 2);

	/**
	 * 移動実績明細ＮＯ.<p>
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
	public static final MCMeta XFR_ACT_D_NO = MCMeta.createStringMeta("XFR_ACT_D_NO", "", 15);

	/**
	 * 移動実績ＮＯ.<p>
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
	public static final MCMeta XFR_ACT_NO = MCMeta.createStringMeta("XFR_ACT_NO", "", 15);

	/**
	 * 移動引当状況ＮＯ.<p>
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
	public static final MCMeta XFR_ALLOC_STS_NO = MCMeta.createStringMeta("XFR_ALLOC_STS_NO", "", 15);

	/**
	 * 移動指図ＮＯ.<p>
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
	public static final MCMeta XFR_INST_NO = MCMeta.createStringMeta("XFR_INST_NO", "", 15);

	/**
	 * 移動指図明細ＮＯ.<p>
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
	public static final MCMeta XFR_INST_D_NO = MCMeta.createStringMeta("XFR_INST_D_NO", "", 15);

	/**
	 * 移動・移送予定ＮＯ.<p>
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
	public static final MCMeta XFR_SCHD_NO = MCMeta.createStringMeta("XFR_SCHD_NO", "", 15);

	/**
	 * 移動・移送元ＮＯ.<p>
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
	public static final MCMeta XFR_SRC_NO = MCMeta.createStringMeta("XFR_SRC_NO", "", 15);

	/**
	 * 出来高指図ＮＯ.<p>
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
	public static final MCMeta YIELD_INST_NO = MCMeta.createStringMeta("YIELD_INST_NO", "", 15);

	/**
	 * 納品伝票実績ＮＯ.<p>
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
	public static final MCMeta DLV_SLIP_ACT_NO = MCMeta.createStringMeta("DLV_SLIP_ACT_NO", "", 15);

	/**
	 * 納品伝票実績明細ＮＯ.<p>
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
	public static final MCMeta DLV_SLIP_ACT_D_NO = MCMeta.createStringMeta("DLV_SLIP_ACT_D_NO", "", 15);

	/**
	 * 納品伝票指図ＮＯ.<p>
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
	public static final MCMeta DLV_SLIP_INST_NO = MCMeta.createStringMeta("DLV_SLIP_INST_NO", "", 15);

	/**
	 * 納品伝票指図明細ＮＯ.<p>
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
	public static final MCMeta DLV_SLIP_INST_D_NO = MCMeta.createStringMeta("DLV_SLIP_INST_D_NO", "", 15);

	/**
	 * 受払予定予備ＮＯ.<p>
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
	public static final MCMeta IO_SCHD_SUB_NO = MCMeta.createStringMeta("IO_SCHD_SUB_NO", "", 15);

	/**
	 * 受注納期回答ＮＯ.<p>
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
	public static final MCMeta SLO_PRMS_NO = MCMeta.createStringMeta("SLO_PRMS_NO", "", 15);

	/**
	 * 売上返品予定ＮＯ.<p>
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
	public static final MCMeta SLS_RET_SCHD_NO = MCMeta.createStringMeta("SLS_RET_SCHD_NO", "", 15);

	/**
	 * 売上返品予定明細ＮＯ.<p>
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
	public static final MCMeta SLS_RET_SCHD_D_NO = MCMeta.createStringMeta("SLS_RET_SCHD_D_NO", "", 15);

	/**
	 * 製造実績ＮＯ.<p>
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
	public static final MCMeta MFG_ACT_NO = MCMeta.createStringMeta("MFG_ACT_NO", "", 15);

	/**
	 * 品目オーダＮＯ.<p>
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
	public static final MCMeta ITM_ORD_NO = MCMeta.createStringMeta("ITM_ORD_NO", "", 15);

	/**
	 * 出荷依頼ＮＯ.<p>
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
	public static final MCMeta SHIP_RQST_NO = MCMeta.createStringMeta("SHIP_RQST_NO", "", 15);

	/**
	 * 入金実績ＩＦＮＯ.<p>
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
	public static final MCMeta RCV_ACT_IF_NO = MCMeta.createStringMeta("RCV_ACT_IF_NO", "", 15);

	/**
	 * 手形情報ＩＦＮＯ.<p>
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
	public static final MCMeta NOTE_IF_NO = MCMeta.createStringMeta("NOTE_IF_NO", "", 15);

	/**
	 * 購買内示ＮＯ.<p>
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
	public static final MCMeta PURC_FRCST_NO = MCMeta.createStringMeta("PURC_FRCST_NO", "", 15);

	/**
	 * 購買内示明細ＮＯ.<p>
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
	public static final MCMeta PURC_FRCST_D_NO = MCMeta.createStringMeta("PURC_FRCST_D_NO", "", 15);

	/**
	 * 購買内示確定ＮＯ.<p>
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
	public static final MCMeta PURC_FRCST_FIX_NO = MCMeta.createStringMeta("PURC_FRCST_FIX_NO", "", 15);

	/**
	 * 購買内示書ＮＯ.<p>
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
	public static final MCMeta PF_RPT_NO = MCMeta.createStringMeta("PF_RPT_NO", "", 15);

	/**
	 * 購買内示書ＩＤ.<p>
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
	public static final MCMeta PF_RPT_ID = MCMeta.createStringMeta("PF_RPT_ID", "", 15);

	/**
	 * 検査予定ＮＯ.<p>
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
	public static final MCMeta INSP_SCHD_NO = MCMeta.createStringMeta("INSP_SCHD_NO", "", 15);

	/**
	 * 作成元ＮＯ.<p>
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
	public static final MCMeta SRC_NO = MCMeta.createStringMeta("SRC_NO", "", 15);

	/**
	 * 検査ＮＯ.<p>
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
	public static final MCMeta INSP_NO = MCMeta.createStringMeta("INSP_NO", "", 15);

	/**
	 * 検査指図リストＮＯ.<p>
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
	public static final MCMeta INSP_LST_NO = MCMeta.createStringMeta("INSP_LST_NO", "", 15);

	/**
	 * 検査実績ＮＯ.<p>
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
	public static final MCMeta INSP_ACT_NO = MCMeta.createStringMeta("INSP_ACT_NO", "", 15);

	/**
	 * 検査着手明細ＮＯ.<p>
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
	public static final MCMeta INSP_STT_D_NO = MCMeta.createStringMeta("INSP_STT_D_NO", "", 15);

	/**
	 * 検査判定明細ＮＯ.<p>
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
	public static final MCMeta INSP_JUDG_D_NO = MCMeta.createStringMeta("INSP_JUDG_D_NO", "", 15);

	/**
	 * 検査実績明細ＮＯ.<p>
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
	public static final MCMeta INSP_ACT_D_NO = MCMeta.createStringMeta("INSP_ACT_D_NO", "", 15);

	/**
	 * 検査抜取実績ＮＯ.<p>
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
	public static final MCMeta INSP_SMPL_ACT_NO = MCMeta.createStringMeta("INSP_SMPL_ACT_NO", "", 15);

	/**
	 * ロットシーケンス.<p>
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
	public static final MCMeta LOT_SEQ = MCMeta.createStringMeta("LOT_SEQ", "", 15);

	/**
	 * 規格検査指図ＮＯ.<p>
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
	public static final MCMeta STD_INSP_INST_NO = MCMeta.createStringMeta("STD_INSP_INST_NO", "", 15);

	/**
	 * 規格検査実績ＮＯ.<p>
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
	public static final MCMeta STD_INSP_ACT_NO = MCMeta.createStringMeta("STD_INSP_ACT_NO", "", 15);

	/**
	 * 工場出荷承認ＮＯ.<p>
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
	public static final MCMeta PLNT_APRV_NO = MCMeta.createStringMeta("PLNT_APRV_NO", "", 15);

	/**
	 * 工場出荷承認明細ＮＯ.<p>
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
	public static final MCMeta PLNT_APRV_D_NO = MCMeta.createStringMeta("PLNT_APRV_D_NO", "", 15);

	/**
	 * 市場出荷判定ＮＯ.<p>
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
	public static final MCMeta MRKT_JUDG_NO = MCMeta.createStringMeta("MRKT_JUDG_NO", "", 15);

	/**
	 * 市場出荷判定明細ＮＯ.<p>
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
	public static final MCMeta MRKT_JUDG_D_NO = MCMeta.createStringMeta("MRKT_JUDG_D_NO", "", 15);

	/**
	 * 市場出荷判定作成元ＮＯ.<p>
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
	public static final MCMeta MRKT_JUDG_SRC_NO = MCMeta.createStringMeta("MRKT_JUDG_SRC_NO", "", 15);

	/**
	 * 売掛消込実績ＮＯ.<p>
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
	public static final MCMeta AR_APPL_ACT_NO = MCMeta.createStringMeta("AR_APPL_ACT_NO", "", 15);

	/**
	 * 売掛消込予定ＮＯ.<p>
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
	public static final MCMeta AR_APPL_SCHD_NO = MCMeta.createStringMeta("AR_APPL_SCHD_NO", "", 15);

	/**
	 * 債権取引グループ区分.<p>
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
	public static final MCMeta AR_TRD_GRP_TYP = MCMeta.createStringMeta("AR_TRD_GRP_TYP", "", 3);

	/**
	 * 債権取引グループ区分名.<p>
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
	public static final MCMeta AR_TRD_GRP_TYP_NM = MCMeta.createStringMeta("AR_TRD_GRP_TYP_NM", "");

	/**
	 * 請求管理ＮＯ.<p>
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
	public static final MCMeta BILL_MNG_NO = MCMeta.createStringMeta("BILL_MNG_NO", "", 15);

	/**
	 * 売掛別請求ＮＯ.<p>
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
	public static final MCMeta BILL_ACST_NO = MCMeta.createStringMeta("BILL_ACST_NO", "", 15);

	/**
	 * 販売品目構成仕様項目ＮＯ.<p>
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
	public static final MCMeta COMP_SPEC_DESC_NO = MCMeta.createStringMeta("COMP_SPEC_DESC_NO", "", 15);

	/**
	 * 得意先納入指示ＮＯ.<p>
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
	public static final MCMeta CST_DLV_INST_NO = MCMeta.createStringMeta("CST_DLV_INST_NO", "", 20);

	/**
	 * 得意先納入指示明細ＮＯ.<p>
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
	public static final MCMeta CST_DLV_INST_D_NO = MCMeta.createStringMeta("CST_DLV_INST_D_NO", "", 20);

	/**
	 * 得意先見積依頼ＮＯ.<p>
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
	public static final MCMeta CST_QTN_RQST_NO = MCMeta.createStringMeta("CST_QTN_RQST_NO", "", 15);

	/**
	 * 得意先見積依頼明細ＮＯ.<p>
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
	public static final MCMeta CST_QTN_RQST_D_NO = MCMeta.createStringMeta("CST_QTN_RQST_D_NO", "", 15);

	/**
	 * 品目構成行ＮＯ.<p>
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
	public static final MCMeta ITM_COMP_LNO = MCMeta.createStringMeta("ITM_COMP_LNO", "", 3);

	/**
	 * 品目構成改訂番号.<p>
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
	public static final MCMeta ITM_COMP_REV_NO = MCMeta.createStringMeta("ITM_COMP_REV_NO", "", 2);

	/**
	 * 手形管理ＮＯ.<p>
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
	public static final MCMeta NOTE_MNG_NO = MCMeta.createStringMeta("NOTE_MNG_NO", "", 15);

	/**
	 * 支払実績ＮＯ.<p>
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
	public static final MCMeta PAY_ACT_NO = MCMeta.createStringMeta("PAY_ACT_NO", "", 15);

	/**
	 * プロジェクトＮＯ.<p>
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
	public static final MCMeta PRJ_NO = MCMeta.createStringMeta("PRJ_NO", "", 20);

	/**
	 * 見積ＮＯ.<p>
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
	public static final MCMeta QTN_NO = MCMeta.createStringMeta("QTN_NO", "", 15);

	/**
	 * 見積明細ＮＯ.<p>
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
	public static final MCMeta QTN_D_NO = MCMeta.createStringMeta("QTN_D_NO", "", 15);

	/**
	 * 見積品目構成ＮＯ.<p>
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
	public static final MCMeta QTN_ITM_COMP_NO = MCMeta.createStringMeta("QTN_ITM_COMP_NO", "", 15);

	/**
	 * 入金実績ＮＯ.<p>
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
	public static final MCMeta RCV_ACT_NO = MCMeta.createStringMeta("RCV_ACT_NO", "", 15);

	/**
	 * 入金実績明細ＮＯ.<p>
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
	public static final MCMeta RCV_ACT_D_NO = MCMeta.createStringMeta("RCV_ACT_D_NO", "", 15);

	/**
	 * 入金ＮＯ.<p>
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
	public static final MCMeta RCV_NO = MCMeta.createStringMeta("RCV_NO", "", 15);

	/**
	 * 入金予定ＮＯ.<p>
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
	public static final MCMeta RCV_SCHD_NO = MCMeta.createStringMeta("RCV_SCHD_NO", "", 15);

	/**
	 * 入金予定消込実績ＮＯ.<p>
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
	public static final MCMeta RCV_SCHD_APPL_ACT_NO = MCMeta.createStringMeta("RCV_SCHD_APPL_ACT_NO", "", 15);

	/**
	 * 受注品目構成ＮＯ.<p>
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
	public static final MCMeta SLO_ITM_COMP_NO = MCMeta.createStringMeta("SLO_ITM_COMP_NO", "", 15);

	/**
	 * 受注状況ＮＯ.<p>
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
	public static final MCMeta SLO_STS_NO = MCMeta.createStringMeta("SLO_STS_NO", "", 15);

	/**
	 * 売上実績ＮＯ.<p>
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
	public static final MCMeta SLS_ACT_NO = MCMeta.createStringMeta("SLS_ACT_NO", "", 15);

	/**
	 * 売上実績受払ＮＯ.<p>
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
	public static final MCMeta SLS_ACT_IO_NO = MCMeta.createStringMeta("SLS_ACT_IO_NO", "", 15);

	/**
	 * 販売品目ＮＯ.<p>
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
	public static final MCMeta SLS_ITM_NO = MCMeta.createStringMeta("SLS_ITM_NO", "", 15);

	/**
	 * 販売品目構成ＮＯ.<p>
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
	public static final MCMeta SLS_ITM_COMP_NO = MCMeta.createStringMeta("SLS_ITM_COMP_NO", "", 15);

	/**
	 * 販売品目仕様ＮＯ.<p>
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
	public static final MCMeta SLS_ITM_SPEC_NO = MCMeta.createStringMeta("SLS_ITM_SPEC_NO", "", 15);

	/**
	 * 売上予定ＮＯ.<p>
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
	 * 販売品目仕様項目ＮＯ.<p>
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
	public static final MCMeta SPEC_DESC_NO = MCMeta.createStringMeta("SPEC_DESC_NO", "", 15);

	/**
	 * 債権為替レート評価替履歴ＮＯ.<p>
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
	public static final MCMeta AR_XRATE_REV_HIST_NO = MCMeta.createStringMeta("AR_XRATE_REV_HIST_NO", "", 15);

	/**
	 * 外部入金ＮО.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>300</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>30</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta EXT_RCV_NO = MCMeta.createStringMeta("EXT_RCV_NO", "", 300);

	/**
	 * 出来高予定ＮＯ.<p>
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
	public static final MCMeta YIELD_SCHD_NO = MCMeta.createStringMeta("YIELD_SCHD_NO", "", 15);

	/**
	 * 投入予定ＮＯ.<p>
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
	public static final MCMeta INPT_SCHD_NO = MCMeta.createStringMeta("INPT_SCHD_NO", "", 15);

	/**
	 * 投入引当状況ＮＯ.<p>
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
	public static final MCMeta INPT_ALLOC_STS_NO = MCMeta.createStringMeta("INPT_ALLOC_STS_NO", "", 15);

	/**
	 * 工数予定ＮＯ.<p>
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
	public static final MCMeta WK_SCHD_NO = MCMeta.createStringMeta("WK_SCHD_NO", "", 15);

	/**
	 * 出来高実績ＮＯ.<p>
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
	public static final MCMeta YIELD_ACT_NO = MCMeta.createStringMeta("YIELD_ACT_NO", "", 15);

	/**
	 * 投入実績ＮＯ.<p>
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
	public static final MCMeta INPT_ACT_NO = MCMeta.createStringMeta("INPT_ACT_NO", "", 15);

	/**
	 * ロス実績ＮＯ.<p>
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
	public static final MCMeta LOSS_ACT_NO = MCMeta.createStringMeta("LOSS_ACT_NO", "", 15);

	/**
	 * 工数実績ＮＯ.<p>
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
	public static final MCMeta WK_ACT_NO = MCMeta.createStringMeta("WK_ACT_NO", "", 15);

	/**
	 * 設計変更連絡備考.<p>
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
	public static final MCMeta PLM_CNT_RMRKS = MCMeta.createStringMeta("PLM_CNT_RMRKS", "", 20);

	/**
	 * 所要ＮＯ.<p>
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
	public static final MCMeta RQMT_NO = MCMeta.createStringMeta("RQMT_NO", "", 15);

	/**
	 * シミュレーションＮＯ.<p>
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
	public static final MCMeta SIM_MRP_NO = MCMeta.createStringMeta("SIM_MRP_NO", "", 15);

	/**
	 * ＭＲＰ計算ＮＯ.<p>
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
	public static final MCMeta MRP_CALC_NO = MCMeta.createStringMeta("MRP_CALC_NO", "", 15);

	/**
	 * 顧客期間内示ＮＯ.<p>
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
	public static final MCMeta CST_FRCST_NO = MCMeta.createStringMeta("CST_FRCST_NO", "", 15);

	/**
	 * 得意先内示書ＮＯ.<p>
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
	public static final MCMeta CST_FRCST_SLIP_NO = MCMeta.createStringMeta("CST_FRCST_SLIP_NO", "", 15);

	/**
	 * 得意先内示書明細ＮＯ.<p>
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
	public static final MCMeta CST_FRCST_SLIP_D_NO = MCMeta.createStringMeta("CST_FRCST_SLIP_D_NO", "", 15);

	/**
	 * 顧客期間内示明細ＮＯ.<p>
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
	public static final MCMeta CST_FRCST_D_NO = MCMeta.createStringMeta("CST_FRCST_D_NO", "", 15);

	/**
	 * 顧客期間内示レコードＮＯ.<p>
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
	public static final MCMeta CST_FRCST_R_NO = MCMeta.createStringMeta("CST_FRCST_R_NO", "", 15);

	/**
	 * 需要ＮＯ.<p>
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
	public static final MCMeta DMND_NO = MCMeta.createStringMeta("DMND_NO", "", 15);

	/**
	 * ワーキンググループ間依頼元識別ＮＯ.<p>
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
	public static final MCMeta WG_RQST_SRC_NO = MCMeta.createStringMeta("WG_RQST_SRC_NO", "", 15);

	/**
	 * ワーキンググループ間依頼回答ＮＯ.<p>
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
	public static final MCMeta WG_RQST_PRMS_NO = MCMeta.createStringMeta("WG_RQST_PRMS_NO", "", 15);

	/**
	 * ワーキンググループ間依頼ＮＯ.<p>
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
	public static final MCMeta WG_RQST_NO = MCMeta.createStringMeta("WG_RQST_NO", "", 15);

	/**
	 * 販売計画構成ＮＯ.<p>
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
	public static final MCMeta SPLN_FMT_NO = MCMeta.createStringMeta("SPLN_FMT_NO", "", 15);

	/**
	 * 日次需要ＮＯ.<p>
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
	public static final MCMeta DLY_DMND_NO = MCMeta.createStringMeta("DLY_DMND_NO", "", 15);

	/**
	 * 日次供給ＮＯ.<p>
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
	public static final MCMeta DLY_SD_NO = MCMeta.createStringMeta("DLY_SD_NO", "", 15);

	/**
	 * 品目仕様行ＮＯ.<p>
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
	public static final MCMeta ITM_SPEC_LNO = MCMeta.createStringMeta("ITM_SPEC_LNO", "", 3);

	/**
	 * 予備ＣＨＡＲ項目１（インターフェース）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_SUB_CHAR1 = MCMeta.createStringMeta("IF_SUB_CHAR1", "", 50);

	/**
	 * 予備ＣＨＡＲ項目２（インターフェース）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_SUB_CHAR2 = MCMeta.createStringMeta("IF_SUB_CHAR2", "", 50);

	/**
	 * 予備ＣＨＡＲ項目３（インターフェース）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_SUB_CHAR3 = MCMeta.createStringMeta("IF_SUB_CHAR3", "", 50);

	/**
	 * 予備ＣＨＡＲ項目４（インターフェース）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_SUB_CHAR4 = MCMeta.createStringMeta("IF_SUB_CHAR4", "", 50);

	/**
	 * 予備ＣＨＡＲ項目５（インターフェース）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_SUB_CHAR5 = MCMeta.createStringMeta("IF_SUB_CHAR5", "", 50);

	/**
	 * 予備ＣＨＡＲ項目６（インターフェース）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_SUB_CHAR6 = MCMeta.createStringMeta("IF_SUB_CHAR6", "", 50);

	/**
	 * 予備ＣＨＡＲ項目７（インターフェース）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_SUB_CHAR7 = MCMeta.createStringMeta("IF_SUB_CHAR7", "", 50);

	/**
	 * 予備ＣＨＡＲ項目８（インターフェース）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_SUB_CHAR8 = MCMeta.createStringMeta("IF_SUB_CHAR8", "", 50);

	/**
	 * 予備ＣＨＡＲ項目９（インターフェース）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_SUB_CHAR9 = MCMeta.createStringMeta("IF_SUB_CHAR9", "", 50);

	/**
	 * 予備ＣＨＡＲ項目１０（インターフェース）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_SUB_CHAR10 = MCMeta.createStringMeta("IF_SUB_CHAR10", "", 50);

	/**
	 * 予備ＣＨＡＲ項目１１（インターフェース）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_SUB_CHAR11 = MCMeta.createStringMeta("IF_SUB_CHAR11", "", 50);

	/**
	 * 予備ＣＨＡＲ項目１２（インターフェース）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_SUB_CHAR12 = MCMeta.createStringMeta("IF_SUB_CHAR12", "", 50);

	/**
	 * 予備ＣＨＡＲ項目１３（インターフェース）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_SUB_CHAR13 = MCMeta.createStringMeta("IF_SUB_CHAR13", "", 50);

	/**
	 * 予備ＣＨＡＲ項目１４（インターフェース）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_SUB_CHAR14 = MCMeta.createStringMeta("IF_SUB_CHAR14", "", 50);

	/**
	 * 予備ＣＨＡＲ項目１５（インターフェース）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_SUB_CHAR15 = MCMeta.createStringMeta("IF_SUB_CHAR15", "", 50);

	/**
	 * 予備ＣＨＡＲ項目１６（インターフェース）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_SUB_CHAR16 = MCMeta.createStringMeta("IF_SUB_CHAR16", "", 50);

	/**
	 * 予備ＣＨＡＲ項目１７（インターフェース）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_SUB_CHAR17 = MCMeta.createStringMeta("IF_SUB_CHAR17", "", 50);

	/**
	 * 予備ＣＨＡＲ項目１８（インターフェース）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_SUB_CHAR18 = MCMeta.createStringMeta("IF_SUB_CHAR18", "", 50);

	/**
	 * 予備ＣＨＡＲ項目１９（インターフェース）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_SUB_CHAR19 = MCMeta.createStringMeta("IF_SUB_CHAR19", "", 50);

	/**
	 * 予備ＣＨＡＲ項目２０（インターフェース）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_SUB_CHAR20 = MCMeta.createStringMeta("IF_SUB_CHAR20", "", 50);

	/**
	 * 予備ＣＨＡＲ項目２１（インターフェース）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_SUB_CHAR21 = MCMeta.createStringMeta("IF_SUB_CHAR21", "", 50);

	/**
	 * 予備ＣＨＡＲ項目２２（インターフェース）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_SUB_CHAR22 = MCMeta.createStringMeta("IF_SUB_CHAR22", "", 50);

	/**
	 * 予備ＣＨＡＲ項目２３（インターフェース）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_SUB_CHAR23 = MCMeta.createStringMeta("IF_SUB_CHAR23", "", 50);

	/**
	 * 予備ＣＨＡＲ項目２４（インターフェース）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_SUB_CHAR24 = MCMeta.createStringMeta("IF_SUB_CHAR24", "", 50);

	/**
	 * 予備ＣＨＡＲ項目２５（インターフェース）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_SUB_CHAR25 = MCMeta.createStringMeta("IF_SUB_CHAR25", "", 50);

	/**
	 * 予備ＣＨＡＲ項目２６（インターフェース）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_SUB_CHAR26 = MCMeta.createStringMeta("IF_SUB_CHAR26", "", 50);

	/**
	 * 予備ＣＨＡＲ項目２７（インターフェース）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_SUB_CHAR27 = MCMeta.createStringMeta("IF_SUB_CHAR27", "", 50);

	/**
	 * 予備ＣＨＡＲ項目２８（インターフェース）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_SUB_CHAR28 = MCMeta.createStringMeta("IF_SUB_CHAR28", "", 50);

	/**
	 * 予備ＣＨＡＲ項目２９（インターフェース）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_SUB_CHAR29 = MCMeta.createStringMeta("IF_SUB_CHAR29", "", 50);

	/**
	 * 予備ＣＨＡＲ項目３０（インターフェース）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_SUB_CHAR30 = MCMeta.createStringMeta("IF_SUB_CHAR30", "", 50);

	/**
	 * 予備ＮＵＭ項目１（インターフェース）.<p>
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
	public static final MCMeta IF_SUB_NUM1 = MCMeta.createNumberMeta("IF_SUB_NUM1", "", 21, 8);

	/**
	 * 予備ＮＵＭ項目２（インターフェース）.<p>
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
	public static final MCMeta IF_SUB_NUM2 = MCMeta.createNumberMeta("IF_SUB_NUM2", "", 21, 8);

	/**
	 * 予備ＮＵＭ項目３（インターフェース）.<p>
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
	public static final MCMeta IF_SUB_NUM3 = MCMeta.createNumberMeta("IF_SUB_NUM3", "", 21, 8);

	/**
	 * 予備ＮＵＭ項目４（インターフェース）.<p>
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
	public static final MCMeta IF_SUB_NUM4 = MCMeta.createNumberMeta("IF_SUB_NUM4", "", 21, 8);

	/**
	 * 予備ＮＵＭ項目５（インターフェース）.<p>
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
	public static final MCMeta IF_SUB_NUM5 = MCMeta.createNumberMeta("IF_SUB_NUM5", "", 21, 8);

	/**
	 * 帳票連番.<p>
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
	public static final MCMeta PRNT_SEQ = MCMeta.createNumberMeta("PRNT_SEQ", "", 3, 0);

	/**
	 * 予備CHAR項目１（入金実績ＩＦ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta RCV_ACT_IF_SUB_CHAR1 = MCMeta.createStringMeta("RCV_ACT_IF_SUB_CHAR1", "", 50);

	/**
	 * 予備CHAR項目２（入金実績ＩＦ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta RCV_ACT_IF_SUB_CHAR2 = MCMeta.createStringMeta("RCV_ACT_IF_SUB_CHAR2", "", 50);

	/**
	 * 予備CHAR項目３（入金実績ＩＦ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta RCV_ACT_IF_SUB_CHAR3 = MCMeta.createStringMeta("RCV_ACT_IF_SUB_CHAR3", "", 50);

	/**
	 * 予備CHAR項目４（入金実績ＩＦ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta RCV_ACT_IF_SUB_CHAR4 = MCMeta.createStringMeta("RCV_ACT_IF_SUB_CHAR4", "", 50);

	/**
	 * 予備CHAR項目５（入金実績ＩＦ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta RCV_ACT_IF_SUB_CHAR5 = MCMeta.createStringMeta("RCV_ACT_IF_SUB_CHAR5", "", 50);

	/**
	 * 予備CHAR項目６（入金実績ＩＦ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta RCV_ACT_IF_SUB_CHAR6 = MCMeta.createStringMeta("RCV_ACT_IF_SUB_CHAR6", "", 50);

	/**
	 * 予備CHAR項目７（入金実績ＩＦ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta RCV_ACT_IF_SUB_CHAR7 = MCMeta.createStringMeta("RCV_ACT_IF_SUB_CHAR7", "", 50);

	/**
	 * 予備CHAR項目８（入金実績ＩＦ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta RCV_ACT_IF_SUB_CHAR8 = MCMeta.createStringMeta("RCV_ACT_IF_SUB_CHAR8", "", 50);

	/**
	 * 予備CHAR項目９（入金実績ＩＦ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta RCV_ACT_IF_SUB_CHAR9 = MCMeta.createStringMeta("RCV_ACT_IF_SUB_CHAR9", "", 50);

	/**
	 * 予備CHAR項目１０（入金実績ＩＦ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta RCV_ACT_IF_SUB_CHAR10 = MCMeta.createStringMeta("RCV_ACT_IF_SUB_CHAR10", "", 50);

	/**
	 * 予備数値項目１（入金実績ＩＦ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>21,8</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta RCV_ACT_IF_SUB_NUM1 = MCMeta.createNumberMeta("RCV_ACT_IF_SUB_NUM1", "", 21, 8);

	/**
	 * 予備数値項目２（入金実績ＩＦ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>21,8</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta RCV_ACT_IF_SUB_NUM2 = MCMeta.createNumberMeta("RCV_ACT_IF_SUB_NUM2", "", 21, 8);

	/**
	 * 予備数値項目３（入金実績ＩＦ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>21,8</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta RCV_ACT_IF_SUB_NUM3 = MCMeta.createNumberMeta("RCV_ACT_IF_SUB_NUM3", "", 21, 8);

	/**
	 * 予備CHAR項目１（手形情報ＩＦ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta NOTE_IF_SUB_CHAR1 = MCMeta.createStringMeta("NOTE_IF_SUB_CHAR1", "", 50);

	/**
	 * 予備CHAR項目２（手形情報ＩＦ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta NOTE_IF_SUB_CHAR2 = MCMeta.createStringMeta("NOTE_IF_SUB_CHAR2", "", 50);

	/**
	 * 予備CHAR項目３（手形情報ＩＦ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta NOTE_IF_SUB_CHAR3 = MCMeta.createStringMeta("NOTE_IF_SUB_CHAR3", "", 50);

	/**
	 * 予備CHAR項目４（手形情報ＩＦ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta NOTE_IF_SUB_CHAR4 = MCMeta.createStringMeta("NOTE_IF_SUB_CHAR4", "", 50);

	/**
	 * 予備CHAR項目５（手形情報ＩＦ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta NOTE_IF_SUB_CHAR5 = MCMeta.createStringMeta("NOTE_IF_SUB_CHAR5", "", 50);

	/**
	 * 予備CHAR項目６（手形情報ＩＦ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta NOTE_IF_SUB_CHAR6 = MCMeta.createStringMeta("NOTE_IF_SUB_CHAR6", "", 50);

	/**
	 * 予備CHAR項目７（手形情報ＩＦ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta NOTE_IF_SUB_CHAR7 = MCMeta.createStringMeta("NOTE_IF_SUB_CHAR7", "", 50);

	/**
	 * 予備CHAR項目８（手形情報ＩＦ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta NOTE_IF_SUB_CHAR8 = MCMeta.createStringMeta("NOTE_IF_SUB_CHAR8", "", 50);

	/**
	 * 予備CHAR項目９（手形情報ＩＦ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta NOTE_IF_SUB_CHAR9 = MCMeta.createStringMeta("NOTE_IF_SUB_CHAR9", "", 50);

	/**
	 * 予備CHAR項目１０（手形情報ＩＦ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta NOTE_IF_SUB_CHAR10 = MCMeta.createStringMeta("NOTE_IF_SUB_CHAR10", "", 50);

	/**
	 * 予備数値項目１（手形情報ＩＦ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>21,8</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta NOTE_IF_SUB_NUM1 = MCMeta.createNumberMeta("NOTE_IF_SUB_NUM1", "", 21, 8);

	/**
	 * 予備数値項目２（手形情報ＩＦ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>21,8</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta NOTE_IF_SUB_NUM2 = MCMeta.createNumberMeta("NOTE_IF_SUB_NUM2", "", 21, 8);

	/**
	 * 予備数値項目３（手形情報ＩＦ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>21,8</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta NOTE_IF_SUB_NUM3 = MCMeta.createNumberMeta("NOTE_IF_SUB_NUM3", "", 21, 8);

	/**
	 * データ状況区分.<p>
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
	public static final MCMeta DATA_TYP = MCMeta.createStringMeta("DATA_TYP", "", 1);

	/**
	 * データ状況区分名.<p>
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
	public static final MCMeta DATA_TYP_NM = MCMeta.createStringMeta("DATA_TYP_NM", "");

	/**
	 * 会計ＩＦテーブル区分.<p>
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
	public static final MCMeta AC_TABLE_TYP = MCMeta.createStringMeta("AC_TABLE_TYP", "", 1);

	/**
	 * 会計ＩＦテーブル区分名.<p>
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
	public static final MCMeta AC_TABLE_TYP_NM = MCMeta.createStringMeta("AC_TABLE_TYP_NM", "");

	/**
	 * 仕訳グループＮＯ.<p>
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
	public static final MCMeta JNL_GRP_NO = MCMeta.createStringMeta("JNL_GRP_NO", "", 10);

	/**
	 * 仕訳伝票ＮＯ.<p>
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
	public static final MCMeta JNL_NO = MCMeta.createStringMeta("JNL_NO", "", 20);

	/**
	 * 仕訳伝票明細番号.<p>
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
	public static final MCMeta JNL_NO_SEQ = MCMeta.createNumberMeta("JNL_NO_SEQ", "", 9, 0);

	/**
	 * 請求／支払ＮＯ.<p>
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
	public static final MCMeta BILL_PAY_NO = MCMeta.createStringMeta("BILL_PAY_NO", "", 15);

	/**
	 * 摘要.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>40</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ABSTRACT_T = MCMeta.createStringMeta("ABSTRACT_T", "", 100);

	/**
	 * 仕訳単位.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>80</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta JNL_UNIT = MCMeta.createStringMeta("JNL_UNIT", "", 80);

	/**
	 * 仕訳備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>40</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta JNL_RMRKS = MCMeta.createStringMeta("JNL_RMRKS", "", 100);

	/**
	 * 連番.<p>
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
	public static final MCMeta JNL_SEQ = MCMeta.createNumberMeta("JNL_SEQ", "", 2, 0);

	/**
	 * マスタ連携区分.<p>
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
	public static final MCMeta MASTER_TYP = MCMeta.createStringMeta("MASTER_TYP", "", 1);

	/**
	 * マスタ連携区分名.<p>
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
	public static final MCMeta MASTER_TYP_NM = MCMeta.createStringMeta("MASTER_TYP_NM", "");

	/**
	 * 削除区分.<p>
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
	public static final MCMeta DEL_TYP = MCMeta.createStringMeta("DEL_TYP", "", 1);

	/**
	 * 削除区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>12</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta DEL_TYP_NM = MCMeta.createStringMeta("DEL_TYP_NM", "");

	/**
	 * マスタ送信区分.<p>
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
	public static final MCMeta MASTER_SEND_TYP = MCMeta.createStringMeta("MASTER_SEND_TYP", "", 1);

	/**
	 * マスタ送信区分名.<p>
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
	public static final MCMeta MASTER_SEND_TYP_NM = MCMeta.createStringMeta("MASTER_SEND_TYP_NM", "");

	/**
	 * マスタ取込区分.<p>
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
	public static final MCMeta MASTER_IMP_TYP = MCMeta.createStringMeta("MASTER_IMP_TYP", "", 1);

	/**
	 * マスタ取込区分名.<p>
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
	public static final MCMeta MASTER_IMP_TYP_NM = MCMeta.createStringMeta("MASTER_IMP_TYP_NM", "");

	/**
	 * ファイルＩＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>15,0</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta FILE_ID = MCMeta.createNumberMeta("FILE_ID", "", 15, 0);

	/**
	 * ファイルパス.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>200</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta FILE_PATH = MCMeta.createStringMeta("FILE_PATH", "", 200);

	/**
	 * ファイル名.<p>
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
	public static final MCMeta FILE_NM = MCMeta.createStringMeta("FILE_NM", "", 100);

	/**
	 * ファイル処理区分.<p>
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
	public static final MCMeta FPROC_TYP = MCMeta.createStringMeta("FPROC_TYP", "", 2);

	/**
	 * ファイル処理区分名.<p>
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
	public static final MCMeta FPROC_TYP_NM = MCMeta.createStringMeta("FPROC_TYP_NM", "");

	/**
	 * 送受信状況区分.<p>
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
	public static final MCMeta SDRV_STS_TYP = MCMeta.createStringMeta("SDRV_STS_TYP", "", 2);

	/**
	 * 送受信状況区分名.<p>
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
	public static final MCMeta SDRV_STS_TYP_NM = MCMeta.createStringMeta("SDRV_STS_TYP_NM", "");

	/**
	 * 送受信ＩＦ備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>40</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SDRV_IF_RMRKS = MCMeta.createStringMeta("SDRV_IF_RMRKS", "", 100);

	/**
	 * 予備CHAR項目１（送受信ＩＦ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SDRV_IF_SUB_CHAR1 = MCMeta.createStringMeta("SDRV_IF_SUB_CHAR1", "", 50);

	/**
	 * 予備CHAR項目２（送受信ＩＦ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SDRV_IF_SUB_CHAR2 = MCMeta.createStringMeta("SDRV_IF_SUB_CHAR2", "", 50);

	/**
	 * 予備CHAR項目３（送受信ＩＦ）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SDRV_IF_SUB_CHAR3 = MCMeta.createStringMeta("SDRV_IF_SUB_CHAR3", "", 50);

	/**
	 * 業務データＩＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BIZ_DAT_ID = MCMeta.createStringMeta("BIZ_DAT_ID", "", 50);

	/**
	 * 業務データ名.<p>
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
	 */
	public static final MCMeta BIZ_DAT_NM = MCMeta.createStringMeta("BIZ_DAT_NM", "", 100);

	/**
	 * 業務データ備考.<p>
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
	public static final MCMeta BIZ_DAT_RMRKS = MCMeta.createStringMeta("BIZ_DAT_RMRKS", "", 1000);

	/**
	 * 業務データ取得区分.<p>
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
	public static final MCMeta BIZ_DAT_GET_TYP = MCMeta.createStringMeta("BIZ_DAT_GET_TYP", "", 1);

	/**
	 * リソースパス.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1024</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>60</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PATH = MCMeta.createStringMeta("PATH", "", 1024);

	/**
	 * ＳＱＬ文.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String(CLOB)</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>60</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SQL_SRC = MCMeta.createStringMeta("SQL_SRC", "");

	/**
	 * 条件項目名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>30</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>15</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta COND_COL = MCMeta.createStringMeta("COND_COL", "", 30);

	/**
	 * ファイル種類区分.<p>
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
	public static final MCMeta BIZ_DAT_FILE_TYP = MCMeta.createStringMeta("BIZ_DAT_FILE_TYP", "", 1);

	/**
	 * 実行時間（秒）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>8,3</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta EXEC_TIME = MCMeta.createNumberMeta("EXEC_TIME", "", 8, 3);

	/**
	 * ロジックＩＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta LOGIC_ID = MCMeta.createStringMeta("LOGIC_ID", "", 50);

	/**
	 * 業務データダウンロード履歴備考.<p>
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
	public static final MCMeta BIZ_DAT_DL_HST_RMRKS = MCMeta.createStringMeta("BIZ_DAT_DL_HST_RMRKS", "", 1000);

	/**
	 * 機能種別.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>10</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>10</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta FUNC_ACTYP = MCMeta.createStringMeta("FUNC_ACTYP", "", 10);

	/**
	 * 数値.<p>
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
	 * <br>
	 * 特に意味づけのない場合に使用すること<br>
	 */
	public static final MCMeta NUM = MCMeta.createNumberMeta("NUM", "", 21, 8);

	/**
	 * ＳＱＬバインド.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1000</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>100</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SQL_BIND = MCMeta.createStringMeta("SQL_BIND", "", 1000);

	/**
	 * 汎用結果表示（文字列）.<p>
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
	public static final MCMeta DISP_STR = MCMeta.createStringMeta("DISP_STR", "");

	/**
	 * 汎用結果表示（日付）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Date</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td></td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>YMD</td>
	* </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta DISP_DT = MCMeta.createDateMeta("DISP_DT", "");
	public static final String DISP_DT_FORMAT = "YMD";

	/**
	 * 汎用結果表示（数値）.<p>
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
	public static final MCMeta DISP_NUM = MCMeta.createNumberMeta("DISP_NUM", "", 21, 8);

	/**
	 * 汎用結果表示（ラベル）.<p>
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
	public static final MCMeta DISP_LBL = MCMeta.createStringMeta("DISP_LBL", "");

	/**
	 * カートリッジ名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1000</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CARTRIDGE = MCMeta.createStringMeta("CARTRIDGE", "", 1000);

	/**
	 * カートリッジ表示名称.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1000</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CARTRIDGE_NM = MCMeta.createStringMeta("CARTRIDGE_NM", "", 1000);

	/**
	 * 印刷関連ファイル名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1024</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PRINT_FILE_NAME = MCMeta.createStringMeta("PRINT_FILE_NAME", "", 1024);

	/**
	 * ロジック名.<p>
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
	public static final MCMeta LOGIC_NM = MCMeta.createStringMeta("LOGIC_NM", "");

	/**
	 * 通知タイトル.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1000</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta NTC_TITLE = MCMeta.createStringMeta("NTC_TITLE", "", 1000);

	/**
	 * 仕訳キー項目.<p>
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
	public static final MCMeta JNL_KEY = MCMeta.createStringMeta("JNL_KEY", "", 20);

	/**
	 * 仕訳キー項目区分.<p>
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
	public static final MCMeta JNL_KEY_COL_TYP = MCMeta.createStringMeta("JNL_KEY_COL_TYP", "", 2);

	/**
	 * 仕訳キー項目区分名.<p>
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
	public static final MCMeta JNL_KEY_COL_TYP_NM = MCMeta.createStringMeta("JNL_KEY_COL_TYP_NM", "");

	/**
	 * 仕訳キー設定項目区分.<p>
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
	public static final MCMeta JNL_KEY_SET_COL_TYP = MCMeta.createStringMeta("JNL_KEY_SET_COL_TYP", "", 5);

	/**
	 * 仕訳キー設定項目区分名.<p>
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
	public static final MCMeta JNL_KEY_SET_COL_TYP_NM = MCMeta.createStringMeta("JNL_KEY_SET_COL_TYP_NM", "");

	/**
	 * 品目製造指図ＮＯ設定区分.<p>
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
	public static final MCMeta ITM_MFG_INST_NO_SET_TYP = MCMeta.createStringMeta("ITM_MFG_INST_NO_SET_TYP", "", 1);

	/**
	 * 品目製造指図ＮＯ設定区分名.<p>
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
	public static final MCMeta ITM_MFG_INST_NO_SET_TYP_NM = MCMeta.createStringMeta("ITM_MFG_INST_NO_SET_TYP_NM", "");

	/**
	 * 製造実績ＮＯ設定区分.<p>
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
	public static final MCMeta MFG_ACT_NO_SET_TYP = MCMeta.createStringMeta("MFG_ACT_NO_SET_TYP", "", 1);

	/**
	 * 製造実績ＮＯ設定区分名.<p>
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
	public static final MCMeta MFG_ACT_NO_SET_TYP_NM = MCMeta.createStringMeta("MFG_ACT_NO_SET_TYP_NM", "");

	/**
	 * 工程実績ＮＯ設定区分.<p>
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
	public static final MCMeta OPER_ACT_NO_SET_TYP = MCMeta.createStringMeta("OPER_ACT_NO_SET_TYP", "", 1);

	/**
	 * 工程実績ＮＯ設定区分名.<p>
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
	public static final MCMeta OPER_ACT_NO_SET_TYP_NM = MCMeta.createStringMeta("OPER_ACT_NO_SET_TYP_NM", "");

	/**
	 * 価格印字区分.<p>
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
	public static final MCMeta PRI_PRNT_TYP = MCMeta.createStringMeta("PRI_PRNT_TYP", "", 1);

	/**
	 * ＩＦ取引種別ＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>5</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta IF_TRD_TYP_CD = MCMeta.createStringMeta("IF_TRD_TYP_CD", "", 5);

	/**
	 * ＩＦ取引種別名.<p>
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
	public static final MCMeta IF_TRD_TYP_NM = MCMeta.createStringMeta("IF_TRD_TYP_NM", "");

	/**
	 * コンピュータ名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 * <br>
	 * インフラのコンピュータ名と同じ桁にする<br>
	 */
	public static final MCMeta MACHINE = MCMeta.createStringMeta("MACHINE", "", 50);

	/**
	 * 外部入荷実績ＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>300</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>30</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta EXT_ARR_ACT_NO = MCMeta.createStringMeta("EXT_ARR_ACT_NO", "", 300);

	/**
	 * 外部出荷実績ＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>300</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>30</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta EXT_SHIP_ACT_NO = MCMeta.createStringMeta("EXT_SHIP_ACT_NO", "", 300);

	/**
	 * 外部移動実績ＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>300</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>30</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta EXT_XFR_ACT_NO = MCMeta.createStringMeta("EXT_XFR_ACT_NO", "", 300);

	/**
	 * 外部工程実績ＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>300</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>30</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta EXT_OPER_ACT_NO = MCMeta.createStringMeta("EXT_OPER_ACT_NO", "", 300);

	/**
	 * 外部出来高実績ＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>300</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>30</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta EXT_YIELD_ACT_NO = MCMeta.createStringMeta("EXT_YIELD_ACT_NO", "", 300);

	/**
	 * 外部投入実績ＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>300</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>30</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta EXT_INPT_ACT_NO = MCMeta.createStringMeta("EXT_INPT_ACT_NO", "", 300);

	/**
	 * 外部工数実績ＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>300</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>30</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta EXT_WK_ACT_NO = MCMeta.createStringMeta("EXT_WK_ACT_NO", "", 300);

	/**
	 * 外部発注ＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>300</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>30</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta EXT_PO_NO = MCMeta.createStringMeta("EXT_PO_NO", "", 300);

	/**
	 * 外部発注明細ＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>300</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>30</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta EXT_PO_D_NO = MCMeta.createStringMeta("EXT_PO_D_NO", "", 300);

	/**
	 * テーブルカテゴリ.<p>
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
	public static final MCMeta TABLE_CTG = MCMeta.createStringMeta("TABLE_CTG", "", 10);

	/**
	 * テーブルカテゴリ名.<p>
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
	public static final MCMeta TABLE_CTG_NM = MCMeta.createStringMeta("TABLE_CTG_NM", "", 100);

	/**
	 * テーブルＩＤ.<p>
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
	public static final MCMeta TABLE_ID = MCMeta.createStringMeta("TABLE_ID", "", 30);

	/**
	 * テーブル名称.<p>
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
	 */
	public static final MCMeta TABLE_NM = MCMeta.createStringMeta("TABLE_NM", "", 100);

	/**
	 * クラスパス.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1024</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta CLASS_PATH = MCMeta.createStringMeta("CLASS_PATH", "", 1024);

	/**
	 * 倉庫事業者ＣＤ.<p>
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
	public static final MCMeta SITE_CO_CD = MCMeta.createStringMeta("SITE_CO_CD", "", 10);

	/**
	 * 倉庫事業者名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SITE_CO_NM = MCMeta.createStringMeta("SITE_CO_NM", "", 40);

	/**
	 * 外部他勘定振替実績ＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>300</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>30</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta EXT_ACXFR_ACT_NO = MCMeta.createStringMeta("EXT_ACXFR_ACT_NO", "", 300);

	/**
	 * 買掛明細ＮＯ.<p>
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
	public static final MCMeta AP_D_NO = MCMeta.createStringMeta("AP_D_NO", "", 15);

	/**
	 * 支払照合管理ＮＯ.<p>
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
	public static final MCMeta PAY_CHK_MNG_NO = MCMeta.createStringMeta("PAY_CHK_MNG_NO", "", 15);

	/**
	 * 支払実績明細ＮＯ.<p>
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
	public static final MCMeta PAY_ACT_D_NO = MCMeta.createStringMeta("PAY_ACT_D_NO", "", 15);

	/**
	 * 支払予定ＮＯ.<p>
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
	public static final MCMeta PAY_SCHD_NO = MCMeta.createStringMeta("PAY_SCHD_NO", "", 15);

	/**
	 * 相手先請求書ＮＯ.<p>
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
	public static final MCMeta RCV_BILL_NO = MCMeta.createStringMeta("RCV_BILL_NO", "", 15);

	/**
	 * 支払手形管理ＮＯ.<p>
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
	public static final MCMeta PAY_NOTE_MNG_NO = MCMeta.createStringMeta("PAY_NOTE_MNG_NO", "", 15);

	/**
	 * 支払債務区分.<p>
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
	public static final MCMeta PAY_AP_TYP = MCMeta.createStringMeta("PAY_AP_TYP", "", 1);

	/**
	 * 支払債務区分名.<p>
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
	public static final MCMeta PAY_AP_TYP_NM = MCMeta.createStringMeta("PAY_AP_TYP_NM", "");

	/**
	 * 外部マスタ連携区分.<p>
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
	public static final MCMeta EXT_MASTER_TYP = MCMeta.createStringMeta("EXT_MASTER_TYP", "", 3);

	/**
	 * 外部マスタ連携区分名.<p>
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
	public static final MCMeta EXT_MASTER_TYP_NM = MCMeta.createStringMeta("EXT_MASTER_TYP_NM", "");

	/**
	 * 買掛消込予定ＮＯ.<p>
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
	public static final MCMeta AP_APPL_SCHD_NO = MCMeta.createStringMeta("AP_APPL_SCHD_NO", "", 15);

	/**
	 * 債務為替レート評価替履歴ＮＯ.<p>
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
	public static final MCMeta AP_XRATE_REV_HIST_NO = MCMeta.createStringMeta("AP_XRATE_REV_HIST_NO", "", 15);

	/**
	 * 業務データダウンロード実行履歴ＮＯ.<p>
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
	public static final MCMeta BIZ_DAT_DL_HST_NO = MCMeta.createStringMeta("BIZ_DAT_DL_HST_NO", "", 15);

	/**
	 * 業務データダウンロード実行状況区分.<p>
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
	public static final MCMeta BIZ_DAT_DL_STS_TYP = MCMeta.createStringMeta("BIZ_DAT_DL_STS_TYP", "", 1);

	/**
	 * 業務データダウンロード実行状況区分名.<p>
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
	public static final MCMeta BIZ_DAT_DL_STS_TYP_NM = MCMeta.createStringMeta("BIZ_DAT_DL_STS_TYP_NM", "");

	/**
	 * ファイルサイズ.<p>
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
	public static final MCMeta FILE_SIZE = MCMeta.createNumberMeta("FILE_SIZE", "", 9, 0);

	/**
	 * 業務データダウンロード検索条件.<p>
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
	public static final MCMeta BIZ_DAT_DL_COND = MCMeta.createStringMeta("BIZ_DAT_DL_COND", "", 1000);

	/**
	 * 支払実績ＩＦＮＯ.<p>
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
	public static final MCMeta PAY_ACT_IF_NO = MCMeta.createStringMeta("PAY_ACT_IF_NO", "", 15);

	/**
	 * 支払予定ＩＦＮＯ.<p>
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
	public static final MCMeta PAY_SCHD_IF_NO = MCMeta.createStringMeta("PAY_SCHD_IF_NO", "", 15);

	/**
	 * 複合仕訳区分.<p>
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
	public static final MCMeta COMPOUND_JNL_TYP = MCMeta.createStringMeta("COMPOUND_JNL_TYP", "", 1);

	/**
	 * 複合仕訳区分名.<p>
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
	public static final MCMeta COMPOUND_JNL_TYP_NM = MCMeta.createStringMeta("COMPOUND_JNL_TYP_NM", "");

	/**
	 * 外注単価区分.<p>
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
	public static final MCMeta OUTSRC_UPRI_TYP = MCMeta.createStringMeta("OUTSRC_UPRI_TYP", "", 1);

	/**
	 * 外注単価区分名.<p>
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
	public static final MCMeta OUTSRC_UPRI_TYP_NM = MCMeta.createStringMeta("OUTSRC_UPRI_TYP_NM", "");

	/**
	 * ＨＴＴＰヘッダ名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta HTTP_HEADER_NM = MCMeta.createStringMeta("HTTP_HEADER_NM", "", 40);

	/**
	 * ＨＴＴＰヘッダ値.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>200</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>50</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta HTTP_HEADER_VAL = MCMeta.createStringMeta("HTTP_HEADER_VAL", "", 200);

	/**
	 * 改訂履歴データ区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>6</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta REV_DATA_TYP = MCMeta.createStringMeta("REV_DATA_TYP", "", 6);

	/**
	 * 仕入計上区分.<p>
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
	public static final MCMeta PURC_BASIS_TYP = MCMeta.createStringMeta("PURC_BASIS_TYP", "", 1);

	/**
	 * 仕入計上区分名.<p>
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
	public static final MCMeta PURC_BASIS_TYP_NM = MCMeta.createStringMeta("PURC_BASIS_TYP_NM", "");

	/**
	 * 売上伝票ＮＯ.<p>
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
	public static final MCMeta SLS_SLIP_NO = MCMeta.createStringMeta("SLS_SLIP_NO", "", 20);

	/**
	 * 売上伝票行ＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>4,0</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SLS_SLIP_LNO = MCMeta.createNumberMeta("SLS_SLIP_LNO", "", 4, 0);

	/**
	 * 仕入伝票ＮＯ.<p>
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
	public static final MCMeta PURC_SLIP_NO = MCMeta.createStringMeta("PURC_SLIP_NO", "", 20);

	/**
	 * 仕入伝票行ＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>Number</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>4,0</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PURC_SLIP_LNO = MCMeta.createNumberMeta("PURC_SLIP_LNO", "", 4, 0);

	/**
	 * 外部品目オーダＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>300</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>30</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta EXT_ITM_ORD_NO = MCMeta.createStringMeta("EXT_ITM_ORD_NO", "", 300);

	/**
	 * 外部工程オーダＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>300</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>30</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta EXT_OPER_ORD_NO = MCMeta.createStringMeta("EXT_OPER_ORD_NO", "", 300);

	/**
	 * 帳票発行区分.<p>
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
	public static final MCMeta PRNT_TYP = MCMeta.createStringMeta("PRNT_TYP", "", 1);

	/**
	 * 帳票発行区分名.<p>
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
	public static final MCMeta PRNT_TYP_NM = MCMeta.createStringMeta("PRNT_TYP_NM", "");

	/**
	 * 工程資源.<p>
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
	public static final MCMeta OPER_RSRC = MCMeta.createStringMeta("OPER_RSRC", "", 100);

	/**
	 * 先行請求書ＮＯ.<p>
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
	public static final MCMeta PRE_BILL_NO = MCMeta.createStringMeta("PRE_BILL_NO", "", 15);

	/**
	 * 請求受領ＮＯ.<p>
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
	public static final MCMeta BILL_RCPT_NO = MCMeta.createStringMeta("BILL_RCPT_NO", "", 15);

	/**
	 * 請求受領明細ＮＯ.<p>
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
	public static final MCMeta BILL_RCPT_D_NO = MCMeta.createStringMeta("BILL_RCPT_D_NO", "", 15);

	/**
	 * 支払通知書履歴ＮＯ.<p>
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
	public static final MCMeta PAY_NTC_HIS_NO = MCMeta.createStringMeta("PAY_NTC_HIS_NO", "", 15);

	/**
	 * 支払通知書明細履歴ＮＯ.<p>
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
	public static final MCMeta PAY_NTC_D_HIS_NO = MCMeta.createStringMeta("PAY_NTC_D_HIS_NO", "", 15);

	/**
	 * 支払通知書明細履歴区分.<p>
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
	public static final MCMeta PAY_NTC_D_HIS_TYP = MCMeta.createStringMeta("PAY_NTC_D_HIS_TYP", "", 1);

	/**
	 * 業務区分.<p>
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
	public static final MCMeta BIZ_TYP = MCMeta.createStringMeta("BIZ_TYP", "", 2);

	/**
	 * 業務区分名.<p>
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
	public static final MCMeta BIZ_TYP_NM = MCMeta.createStringMeta("BIZ_TYP_NM", "");

	/**
	 * 業務キー.<p>
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
	public static final MCMeta BIZ_KEY = MCMeta.createStringMeta("BIZ_KEY", "", 15);

	/**
	 * ドキュメントＩＤ.<p>
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
	public static final MCMeta DOC_ID = MCMeta.createStringMeta("DOC_ID", "", 15);

	/**
	 * 添付ファイル備考.<p>
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
	public static final MCMeta ATTACHMENT_RMRKS = MCMeta.createStringMeta("ATTACHMENT_RMRKS", "", 100);

	/**
	 * 帳票属性１（添付ファイル）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ATTACHMENT_RPT_ATTR1 = MCMeta.createStringMeta("ATTACHMENT_RPT_ATTR1", "", 50);

	/**
	 * 帳票属性２（添付ファイル）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ATTACHMENT_RPT_ATTR2 = MCMeta.createStringMeta("ATTACHMENT_RPT_ATTR2", "", 50);

	/**
	 * 帳票属性３（添付ファイル）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ATTACHMENT_RPT_ATTR3 = MCMeta.createStringMeta("ATTACHMENT_RPT_ATTR3", "", 50);

	/**
	 * 帳票属性４（添付ファイル）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ATTACHMENT_RPT_ATTR4 = MCMeta.createStringMeta("ATTACHMENT_RPT_ATTR4", "", 50);

	/**
	 * 帳票属性５（添付ファイル）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ATTACHMENT_RPT_ATTR5 = MCMeta.createStringMeta("ATTACHMENT_RPT_ATTR5", "", 50);

	/**
	 * 帳票属性６（添付ファイル）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ATTACHMENT_RPT_ATTR6 = MCMeta.createStringMeta("ATTACHMENT_RPT_ATTR6", "", 50);

	/**
	 * 帳票属性７（添付ファイル）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ATTACHMENT_RPT_ATTR7 = MCMeta.createStringMeta("ATTACHMENT_RPT_ATTR7", "", 50);

	/**
	 * 帳票属性８（添付ファイル）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ATTACHMENT_RPT_ATTR8 = MCMeta.createStringMeta("ATTACHMENT_RPT_ATTR8", "", 50);

	/**
	 * 帳票属性９（添付ファイル）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ATTACHMENT_RPT_ATTR9 = MCMeta.createStringMeta("ATTACHMENT_RPT_ATTR9", "", 50);

	/**
	 * 帳票属性１０（添付ファイル）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ATTACHMENT_RPT_ATTR10 = MCMeta.createStringMeta("ATTACHMENT_RPT_ATTR10", "", 50);

	/**
	 * 帳票属性１１（添付ファイル）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ATTACHMENT_RPT_ATTR11 = MCMeta.createStringMeta("ATTACHMENT_RPT_ATTR11", "", 50);

	/**
	 * 帳票属性１２（添付ファイル）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ATTACHMENT_RPT_ATTR12 = MCMeta.createStringMeta("ATTACHMENT_RPT_ATTR12", "", 50);

	/**
	 * 帳票属性１３（添付ファイル）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ATTACHMENT_RPT_ATTR13 = MCMeta.createStringMeta("ATTACHMENT_RPT_ATTR13", "", 50);

	/**
	 * 帳票属性１４（添付ファイル）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ATTACHMENT_RPT_ATTR14 = MCMeta.createStringMeta("ATTACHMENT_RPT_ATTR14", "", 50);

	/**
	 * 帳票属性１５（添付ファイル）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ATTACHMENT_RPT_ATTR15 = MCMeta.createStringMeta("ATTACHMENT_RPT_ATTR15", "", 50);

	/**
	 * 帳票属性１６（添付ファイル）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ATTACHMENT_RPT_ATTR16 = MCMeta.createStringMeta("ATTACHMENT_RPT_ATTR16", "", 50);

	/**
	 * 帳票属性１７（添付ファイル）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ATTACHMENT_RPT_ATTR17 = MCMeta.createStringMeta("ATTACHMENT_RPT_ATTR17", "", 50);

	/**
	 * 帳票属性１８（添付ファイル）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ATTACHMENT_RPT_ATTR18 = MCMeta.createStringMeta("ATTACHMENT_RPT_ATTR18", "", 50);

	/**
	 * 帳票属性１９（添付ファイル）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ATTACHMENT_RPT_ATTR19 = MCMeta.createStringMeta("ATTACHMENT_RPT_ATTR19", "", 50);

	/**
	 * 帳票属性２０（添付ファイル）.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>50</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ATTACHMENT_RPT_ATTR20 = MCMeta.createStringMeta("ATTACHMENT_RPT_ATTR20", "", 50);

	/**
	 * メッセージキューＩＤ.<p>
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
	public static final MCMeta MSG_QUEUE_ID = MCMeta.createStringMeta("MSG_QUEUE_ID", "", 100);

	/**
	 * 請求書履歴ＮＯ.<p>
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
	public static final MCMeta BILL_HIS_NO = MCMeta.createStringMeta("BILL_HIS_NO", "", 15);

	/**
	 * 請求書明細履歴ＮＯ.<p>
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
	public static final MCMeta BILL_D_HIS_NO = MCMeta.createStringMeta("BILL_D_HIS_NO", "", 15);

	/**
	 * 請求書明細履歴区分.<p>
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
	public static final MCMeta BILL_D_HIS_TYP = MCMeta.createStringMeta("BILL_D_HIS_TYP", "", 1);

	/**
	 * 帳票名称要素区分.<p>
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
	public static final MCMeta RPT_NM_ELM_TYP = MCMeta.createStringMeta("RPT_NM_ELM_TYP", "", 3);

	/**
	 * 帳票名称要素区分名.<p>
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
	public static final MCMeta RPT_NM_ELM_TYP_NM = MCMeta.createStringMeta("RPT_NM_ELM_TYP_NM", "");

	/**
	 * 帳票属性区分.<p>
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
	public static final MCMeta RPT_ATTR_TYP = MCMeta.createStringMeta("RPT_ATTR_TYP", "", 2);

	/**
	 * 帳票属性区分名.<p>
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
	public static final MCMeta RPT_ATTR_TYP_NM = MCMeta.createStringMeta("RPT_ATTR_TYP_NM", "");

	/**
	 * 帳票属性設定区分.<p>
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
	public static final MCMeta RPT_ATTR_SET_TYP = MCMeta.createStringMeta("RPT_ATTR_SET_TYP", "", 3);

	/**
	 * 帳票属性設定区分名.<p>
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
	public static final MCMeta RPT_ATTR_SET_TYP_NM = MCMeta.createStringMeta("RPT_ATTR_SET_TYP_NM", "");

	/**
	 * 帳票保存先パス.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>200</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>20</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta REPORT_STRG_PATH = MCMeta.createStringMeta("REPORT_STRG_PATH", "", 200);

	/**
	 * 受注納期回答ヘッダＮＯ.<p>
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
	public static final MCMeta SLO_PRMS_H_NO = MCMeta.createStringMeta("SLO_PRMS_H_NO", "", 15);

	/**
	 * マスタメモ４.<p>
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
	public static final MCMeta MST_MEMO4 = MCMeta.createStringMeta("MST_MEMO4", "", 100);

	/**
	 * マスタメモ５.<p>
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
	public static final MCMeta MST_MEMO5 = MCMeta.createStringMeta("MST_MEMO5", "", 100);

	/**
	 * マスタメモ６.<p>
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
	public static final MCMeta MST_MEMO6 = MCMeta.createStringMeta("MST_MEMO6", "", 100);

	/**
	 * マスタメモ７.<p>
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
	public static final MCMeta MST_MEMO7 = MCMeta.createStringMeta("MST_MEMO7", "", 100);

	/**
	 * マスタメモ８.<p>
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
	public static final MCMeta MST_MEMO8 = MCMeta.createStringMeta("MST_MEMO8", "", 100);

	/**
	 * マスタメモ９.<p>
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
	public static final MCMeta MST_MEMO9 = MCMeta.createStringMeta("MST_MEMO9", "", 100);

	/**
	 * マスタメモ１０.<p>
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
	public static final MCMeta MST_MEMO10 = MCMeta.createStringMeta("MST_MEMO10", "", 100);

	/**
	 * マスタメモ１１.<p>
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
	public static final MCMeta MST_MEMO11 = MCMeta.createStringMeta("MST_MEMO11", "", 100);

	/**
	 * マスタメモ１２.<p>
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
	public static final MCMeta MST_MEMO12 = MCMeta.createStringMeta("MST_MEMO12", "", 100);

	/**
	 * マスタメモ１３.<p>
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
	public static final MCMeta MST_MEMO13 = MCMeta.createStringMeta("MST_MEMO13", "", 100);

	/**
	 * マスタメモ１４.<p>
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
	public static final MCMeta MST_MEMO14 = MCMeta.createStringMeta("MST_MEMO14", "", 100);

	/**
	 * マスタメモ１５.<p>
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
	public static final MCMeta MST_MEMO15 = MCMeta.createStringMeta("MST_MEMO15", "", 100);

	/**
	 * マスタメモ１６.<p>
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
	public static final MCMeta MST_MEMO16 = MCMeta.createStringMeta("MST_MEMO16", "", 100);

	/**
	 * マスタメモ１７.<p>
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
	public static final MCMeta MST_MEMO17 = MCMeta.createStringMeta("MST_MEMO17", "", 100);

	/**
	 * マスタメモ１８.<p>
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
	public static final MCMeta MST_MEMO18 = MCMeta.createStringMeta("MST_MEMO18", "", 100);

	/**
	 * マスタメモ１９.<p>
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
	public static final MCMeta MST_MEMO19 = MCMeta.createStringMeta("MST_MEMO19", "", 100);

	/**
	 * マスタメモ２０.<p>
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
	public static final MCMeta MST_MEMO20 = MCMeta.createStringMeta("MST_MEMO20", "", 100);

	/**
	 * ファイル種類区分名.<p>
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
	public static final MCMeta BIZ_DAT_FILE_TYP_NM = MCMeta.createStringMeta("BIZ_DAT_FILE_TYP_NM", "");

	/**
	 * 原価センタ.<p>
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
	public static final MCMeta COST_CENTER = MCMeta.createStringMeta("COST_CENTER", "", 10);

	/**
	 * 利益センタ.<p>
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
	public static final MCMeta PROFIT_CENTER = MCMeta.createStringMeta("PROFIT_CENTER", "", 10);

	/**
	 * 連番.<p>
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
	public static final MCMeta SEQ = MCMeta.createStringMeta("SEQ", "", 15);

	/**
	 * 仕訳タイプ.<p>
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
	public static final MCMeta AC_DOC_TYP = MCMeta.createStringMeta("AC_DOC_TYP", "", 2);

	/**
	 * 会計期間.<p>
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
	public static final MCMeta FISCAL_PERIOD = MCMeta.createStringMeta("FISCAL_PERIOD", "", 2);

	/**
	 * 伝票ヘッダテキスト.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>25</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta DOC_HEADER_TEXT = MCMeta.createStringMeta("DOC_HEADER_TEXT", "", 25);

	/**
	 * 元帳グループ.<p>
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
	public static final MCMeta LEDGER_GROUP = MCMeta.createStringMeta("LEDGER_GROUP", "", 4);

	/**
	 * 参照伝票ＩＤ.<p>
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
	public static final MCMeta DOC_REF_ID = MCMeta.createStringMeta("DOC_REF_ID", "", 16);

	/**
	 * パートナー事業領域.<p>
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
	public static final MCMeta PARTNER_BUSINESS_AREA = MCMeta.createStringMeta("PARTNER_BUSINESS_AREA", "", 4);

	/**
	 * 税自動計算.<p>
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
	public static final MCMeta TAX_AUTO_CALC = MCMeta.createStringMeta("TAX_AUTO_CALC", "", 1);

	/**
	 * 明細テキスト.<p>
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
	public static final MCMeta DOC_ITM_TEXT = MCMeta.createStringMeta("DOC_ITM_TEXT", "", 50);

	/**
	 * 税管轄.<p>
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
	public static final MCMeta TAX_JURISDICTION = MCMeta.createStringMeta("TAX_JURISDICTION", "", 15);

	/**
	 * 指図番号.<p>
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
	public static final MCMeta ORDER_ID = MCMeta.createStringMeta("ORDER_ID", "", 12);

	/**
	 * ＷＢＳエレメント.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>24</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta WBS_ELEMENT = MCMeta.createStringMeta("WBS_ELEMENT", "", 24);

	/**
	 * ソートキー.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>18</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ASSIGNMENT_REFERENCE = MCMeta.createStringMeta("ASSIGNMENT_REFERENCE", "", 18);

	/**
	 * 取引パートナー.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>6</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta TRADING_PARTNER = MCMeta.createStringMeta("TRADING_PARTNER", "", 6);

	/**
	 * セグメント.<p>
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
	public static final MCMeta SEGMENT = MCMeta.createStringMeta("SEGMENT", "", 10);

	/**
	 * 外部検査実績ＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>300</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>30</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta EXT_INSP_ACT_NO = MCMeta.createStringMeta("EXT_INSP_ACT_NO", "", 300);

	/**
	 * 外部検査実績明細ＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>300</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>30</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta EXT_INSP_ACT_D_NO = MCMeta.createStringMeta("EXT_INSP_ACT_D_NO", "", 300);

	/**
	 * 外部検査抜取実績ＮＯ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>300</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>30</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta EXT_INSP_SMPL_ACT_NO = MCMeta.createStringMeta("EXT_INSP_SMPL_ACT_NO", "", 300);

}

