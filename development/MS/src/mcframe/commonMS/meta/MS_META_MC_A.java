package mcframe.commonMS.meta;

import mcframe.commonCore.meta.MCMeta;

/**
 * 共有項目メタの定義クラスです。
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
abstract public class MS_META_MC_A {
	/**
	 * 品目オーダ負荷状況区分.<p>
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
	public static final MCMeta ITM_ORD_LD_STS_TYP = MCMeta.createStringMeta("ITM_ORD_LD_STS_TYP", "", 1);

	/**
	 * 品目オーダ負荷状況区分名.<p>
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
	public static final MCMeta ITM_ORD_LD_STS_TYP_NM = MCMeta.createStringMeta("ITM_ORD_LD_STS_TYP_NM", "");

	/**
	 * 負荷明細区分.<p>
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
	public static final MCMeta LD_DTL_TYP = MCMeta.createStringMeta("LD_DTL_TYP", "", 1);

	/**
	 * 負荷明細区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>6</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta LD_DTL_TYP_NM = MCMeta.createStringMeta("LD_DTL_TYP_NM", "");

	/**
	 * 負荷内訳計算区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>2</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta LD_SUB_CALC_TYP = MCMeta.createStringMeta("LD_SUB_CALC_TYP", "", 2);

	/**
	 * 負荷内訳計算区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>6</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta LD_SUB_CALC_TYP_NM = MCMeta.createStringMeta("LD_SUB_CALC_TYP_NM", "");

	/**
	 * 負荷内訳ＣＤ.<p>
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
	public static final MCMeta LD_SUB_CD = MCMeta.createStringMeta("LD_SUB_CD", "");

	/**
	 * 負荷内訳名.<p>
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
	public static final MCMeta LD_SUB_NM = MCMeta.createStringMeta("LD_SUB_NM", "");

	/**
	 * 需要区分.<p>
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
	public static final MCMeta DMND_TYP = MCMeta.createStringMeta("DMND_TYP", "", 1);

	/**
	 * 需要区分名.<p>
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
	 */
	public static final MCMeta DMND_TYP_NM = MCMeta.createStringMeta("DMND_TYP_NM", "");

	/**
	 * 受払予定区分.<p>
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
	public static final MCMeta IO_SCHD_TYP = MCMeta.createStringMeta("IO_SCHD_TYP", "", 5);

	/**
	 * 受払予定区分名.<p>
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
	public static final MCMeta IO_SCHD_TYP_NM = MCMeta.createStringMeta("IO_SCHD_TYP_NM", "");

	/**
	 * 入出庫区分.<p>
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
	public static final MCMeta IO_TYP = MCMeta.createStringMeta("IO_TYP", "", 1);

	/**
	 * 入出庫区分名.<p>
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
	public static final MCMeta IO_TYP_NM = MCMeta.createStringMeta("IO_TYP_NM", "");

	/**
	 * 受払予定状況区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>2</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta IO_SCHD_STS_TYP = MCMeta.createStringMeta("IO_SCHD_STS_TYP", "", 2);

	/**
	 * 受払予定状況区分名.<p>
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
	public static final MCMeta IO_SCHD_STS_TYP_NM = MCMeta.createStringMeta("IO_SCHD_STS_TYP_NM", "");

	/**
	 * オーダ生成区分.<p>
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
	public static final MCMeta ORD_GNRT_TYP = MCMeta.createStringMeta("ORD_GNRT_TYP", "", 1);

	/**
	 * オーダ生成区分名.<p>
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
	public static final MCMeta ORD_GNRT_TYP_NM = MCMeta.createStringMeta("ORD_GNRT_TYP_NM", "");

	/**
	 * 日次生産依頼生成区分.<p>
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
	public static final MCMeta RQMT_GNRT_TYP = MCMeta.createStringMeta("RQMT_GNRT_TYP", "", 1);

	/**
	 * 日次生産依頼生成区分名.<p>
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
	public static final MCMeta RQMT_GNRT_TYP_NM = MCMeta.createStringMeta("RQMT_GNRT_TYP_NM", "");

	/**
	 * 品目オーダ区分.<p>
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
	public static final MCMeta ITM_ORD_TYP = MCMeta.createStringMeta("ITM_ORD_TYP", "", 1);

	/**
	 * 品目オーダ区分名.<p>
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
	public static final MCMeta ITM_ORD_TYP_NM = MCMeta.createStringMeta("ITM_ORD_TYP_NM", "");

	/**
	 * 品目オーダ状況区分.<p>
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
	public static final MCMeta ITM_ORD_STS_TYP = MCMeta.createStringMeta("ITM_ORD_STS_TYP", "", 1);

	/**
	 * 品目オーダ状況区分名.<p>
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
	public static final MCMeta ITM_ORD_STS_TYP_NM = MCMeta.createStringMeta("ITM_ORD_STS_TYP_NM", "");

	/**
	 * ＭＲＰ所要区分.<p>
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
	public static final MCMeta MRP_RQMT_TYP = MCMeta.createStringMeta("MRP_RQMT_TYP", "", 1);

	/**
	 * ＭＲＰ所要区分名.<p>
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
	public static final MCMeta MRP_RQMT_TYP_NM = MCMeta.createStringMeta("MRP_RQMT_TYP_NM", "");

	/**
	 * 工程オーダ状況区分.<p>
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
	public static final MCMeta OPER_ORD_STS_TYP = MCMeta.createStringMeta("OPER_ORD_STS_TYP", "", 1);

	/**
	 * 工程オーダ状況区分名.<p>
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
	public static final MCMeta OPER_ORD_STS_TYP_NM = MCMeta.createStringMeta("OPER_ORD_STS_TYP_NM", "");

	/**
	 * ＭＲＰカウンタ区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>10</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta MRP_CNTR_TYP = MCMeta.createStringMeta("MRP_CNTR_TYP", "", 10);

	/**
	 * ＭＲＰカウンタ区分名.<p>
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
	public static final MCMeta MRP_CNTR_TYP_NM = MCMeta.createStringMeta("MRP_CNTR_TYP_NM", "");

	/**
	 * シミュレーションＭＲＰ区分.<p>
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
	public static final MCMeta SIM_MRP_TYP = MCMeta.createStringMeta("SIM_MRP_TYP", "", 1);

	/**
	 * シミュレーションＭＲＰ区分名.<p>
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
	public static final MCMeta SIM_MRP_TYP_NM = MCMeta.createStringMeta("SIM_MRP_TYP_NM", "");

	/**
	 * シミュレーション引当予定区分.<p>
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
	public static final MCMeta SIM_ALLOC_PLN_TYP = MCMeta.createStringMeta("SIM_ALLOC_PLN_TYP", "", 1);

	/**
	 * シミュレーション引当予定区分名.<p>
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
	public static final MCMeta SIM_ALLOC_PLN_TYP_NM = MCMeta.createStringMeta("SIM_ALLOC_PLN_TYP_NM", "");

	/**
	 * 発注点在庫補充方法区分.<p>
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
	public static final MCMeta OP_RPL_MTD_TYP = MCMeta.createStringMeta("OP_RPL_MTD_TYP", "", 1);

	/**
	 * 発注点在庫補充方法区分名.<p>
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
	 */
	public static final MCMeta OP_RPL_MTD_TYP_NM = MCMeta.createStringMeta("OP_RPL_MTD_TYP_NM", "");

	/**
	 * 売上返品予定状況区分.<p>
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
	public static final MCMeta SRET_SCHD_STS_TYP = MCMeta.createStringMeta("SRET_SCHD_STS_TYP", "", 1);

	/**
	 * 売上返品予定状況区分名.<p>
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
	public static final MCMeta SRET_SCHD_STS_TYP_NM = MCMeta.createStringMeta("SRET_SCHD_STS_TYP_NM", "");

	/**
	 * 見積状況区分.<p>
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
	public static final MCMeta QTN_STS_TYP = MCMeta.createStringMeta("QTN_STS_TYP", "", 1);

	/**
	 * 見積状況区分名.<p>
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
	public static final MCMeta QTN_STS_TYP_NM = MCMeta.createStringMeta("QTN_STS_TYP_NM", "");

	/**
	 * 検収状況区分.<p>
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
	public static final MCMeta ACCPT_STS_TYP = MCMeta.createStringMeta("ACCPT_STS_TYP", "", 1);

	/**
	 * 検収状況区分名.<p>
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
	public static final MCMeta ACCPT_STS_TYP_NM = MCMeta.createStringMeta("ACCPT_STS_TYP_NM", "");

	/**
	 * 売上対象区分.<p>
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
	public static final MCMeta SLS_TGT_TYP = MCMeta.createStringMeta("SLS_TGT_TYP", "", 1);

	/**
	 * 売上対象区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>9</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SLS_TGT_TYP_NM = MCMeta.createStringMeta("SLS_TGT_TYP_NM", "");

	/**
	 * 引当状況区分.<p>
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
	public static final MCMeta ALLOC_STS_TYP = MCMeta.createStringMeta("ALLOC_STS_TYP", "", 1);

	/**
	 * 引当状況区分名.<p>
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
	public static final MCMeta ALLOC_STS_TYP_NM = MCMeta.createStringMeta("ALLOC_STS_TYP_NM", "");

	/**
	 * 販売検索対象区分.<p>
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
	public static final MCMeta SLS_SRCH_TGT_TYP = MCMeta.createStringMeta("SLS_SRCH_TGT_TYP", "", 1);

	/**
	 * 販売検索対象区分名.<p>
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
	public static final MCMeta SLS_SRCH_TGT_TYP_NM = MCMeta.createStringMeta("SLS_SRCH_TGT_TYP_NM", "");

	/**
	 * 購買検索対象区分.<p>
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
	public static final MCMeta PURC_SRCH_TGT_TYP = MCMeta.createStringMeta("PURC_SRCH_TGT_TYP", "", 1);

	/**
	 * 購買検索対象区分名.<p>
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
	public static final MCMeta PURC_SRCH_TGT_TYP_NM = MCMeta.createStringMeta("PURC_SRCH_TGT_TYP_NM", "");

	/**
	 * 生産検索対象区分.<p>
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
	public static final MCMeta PROD_SRCH_TGT_TYP = MCMeta.createStringMeta("PROD_SRCH_TGT_TYP", "", 1);

	/**
	 * 生産検索対象区分名.<p>
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
	public static final MCMeta PROD_SRCH_TGT_TYP_NM = MCMeta.createStringMeta("PROD_SRCH_TGT_TYP_NM", "");

	/**
	 * 在庫検索対象区分.<p>
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
	public static final MCMeta STK_SRCH_TGT_TYP = MCMeta.createStringMeta("STK_SRCH_TGT_TYP", "", 1);

	/**
	 * 在庫検索対象区分名.<p>
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
	public static final MCMeta STK_SRCH_TGT_TYP_NM = MCMeta.createStringMeta("STK_SRCH_TGT_TYP_NM", "");

	/**
	 * 品管検索対象区分.<p>
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
	public static final MCMeta INSP_SRCH_TGT_TYP = MCMeta.createStringMeta("INSP_SRCH_TGT_TYP", "", 1);

	/**
	 * 品管検索対象区分名.<p>
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
	public static final MCMeta INSP_SRCH_TGT_TYP_NM = MCMeta.createStringMeta("INSP_SRCH_TGT_TYP_NM", "");

	/**
	 * 検索対象ＮＯ.<p>
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
	public static final MCMeta SRCH_TGT_NO = MCMeta.createStringMeta("SRCH_TGT_NO", "", 15);

	/**
	 * 発注予定作成元区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PO_SCHD_SRC_TYP = MCMeta.createStringMeta("PO_SCHD_SRC_TYP", "", 1);

	/**
	 * 発注予定作成元区分名.<p>
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
	public static final MCMeta PO_SCHD_SRC_TYP_NM = MCMeta.createStringMeta("PO_SCHD_SRC_TYP_NM", "");

	/**
	 * 仕入作成元区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PURC_SRC_TYP = MCMeta.createStringMeta("PURC_SRC_TYP", "", 1);

	/**
	 * 仕入作成元区分名.<p>
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
	public static final MCMeta PURC_SRC_TYP_NM = MCMeta.createStringMeta("PURC_SRC_TYP_NM", "");

	/**
	 * 直納区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta DRCT_DLV_TYP = MCMeta.createStringMeta("DRCT_DLV_TYP", "", 1);

	/**
	 * 直納区分名.<p>
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
	public static final MCMeta DRCT_DLV_TYP_NM = MCMeta.createStringMeta("DRCT_DLV_TYP_NM", "");

	/**
	 * 発注予定変更区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PO_SCHD_CHG_TYP = MCMeta.createStringMeta("PO_SCHD_CHG_TYP", "", 1);

	/**
	 * 発注予定変更区分名.<p>
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
	public static final MCMeta PO_SCHD_CHG_TYP_NM = MCMeta.createStringMeta("PO_SCHD_CHG_TYP_NM", "");

	/**
	 * 発注予定状況区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PO_SCHD_STS_TYP = MCMeta.createStringMeta("PO_SCHD_STS_TYP", "", 1);

	/**
	 * 発注予定状況区分名.<p>
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
	public static final MCMeta PO_SCHD_STS_TYP_NM = MCMeta.createStringMeta("PO_SCHD_STS_TYP_NM", "");

	/**
	 * 単価訂正理由区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta UPRI_MOD_TYP = MCMeta.createStringMeta("UPRI_MOD_TYP", "", 1);

	/**
	 * 単価訂正理由区分名.<p>
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
	public static final MCMeta UPRI_MOD_TYP_NM = MCMeta.createStringMeta("UPRI_MOD_TYP_NM", "");

	/**
	 * 確定ＮＯ区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta FIX_NO_TYP = MCMeta.createStringMeta("FIX_NO_TYP", "", 1);

	/**
	 * 確定ＮＯ区分.<p>
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
	public static final MCMeta FIX_NO_TYP_NM = MCMeta.createStringMeta("FIX_NO_TYP_NM", "");

	/**
	 * 発注訂正理由ＣＤ.<p>
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
	public static final MCMeta PO_CRCT_RSN_CD = MCMeta.createStringMeta("PO_CRCT_RSN_CD", "", 10);

	/**
	 * 発注訂正理由名.<p>
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
	public static final MCMeta PO_CRCT_RSN_NM = MCMeta.createStringMeta("PO_CRCT_RSN_NM", "", 100);

	/**
	 * 発注訂正理由備考.<p>
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
	public static final MCMeta PO_CRCT_RSN_RMRKS = MCMeta.createStringMeta("PO_CRCT_RSN_RMRKS", "", 100);

	/**
	 * 注文書備考.<p>
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
	public static final MCMeta PO_PRINT_RMRKS = MCMeta.createStringMeta("PO_PRINT_RMRKS", "", 100);

	/**
	 * 注文書明細備考.<p>
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
	public static final MCMeta PO_PRINT_D_RMRKS = MCMeta.createStringMeta("PO_PRINT_D_RMRKS", "", 100);

	/**
	 * 仕入返品票備考.<p>
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
	public static final MCMeta PURC_RET_PRINT_RMRKS = MCMeta.createStringMeta("PURC_RET_PRINT_RMRKS", "", 100);

	/**
	 * 仕入返品票明細備考.<p>
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
	public static final MCMeta PURC_RET_PRINT_D_RMRKS = MCMeta.createStringMeta("PURC_RET_PRINT_D_RMRKS", "", 100);

	/**
	 * 納期回答受領明細備考.<p>
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
	public static final MCMeta PRMS_RCPT_D_RMRKS = MCMeta.createStringMeta("PRMS_RCPT_D_RMRKS", "", 100);

	/**
	 * 納入指示書備考.<p>
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
	public static final MCMeta DLV_INST_PRINT_RMRKS = MCMeta.createStringMeta("DLV_INST_PRINT_RMRKS", "", 100);

	/**
	 * 納入指示書明細備考.<p>
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
	public static final MCMeta DLV_INST_PRINT_D_RMRKS = MCMeta.createStringMeta("DLV_INST_PRINT_D_RMRKS", "", 100);

	/**
	 * 取引条件備考１.<p>
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
	public static final MCMeta TTERM_RMRKS1 = MCMeta.createStringMeta("TTERM_RMRKS1", "", 100);

	/**
	 * 取引条件備考２.<p>
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
	public static final MCMeta TTERM_RMRKS2 = MCMeta.createStringMeta("TTERM_RMRKS2", "", 100);

	/**
	 * 取引条件備考３.<p>
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
	public static final MCMeta TTERM_RMRKS3 = MCMeta.createStringMeta("TTERM_RMRKS3", "", 100);

	/**
	 * 販売状況区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SLS_STS_TYP = MCMeta.createStringMeta("SLS_STS_TYP", "", 1);

	/**
	 * 販売状況区分名.<p>
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
	public static final MCMeta SLS_STS_TYP_NM = MCMeta.createStringMeta("SLS_STS_TYP_NM", "");

	/**
	 * 内部備考.<p>
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
	public static final MCMeta SLS_ACT_INTR_RMRKS = MCMeta.createStringMeta("SLS_ACT_INTR_RMRKS", "", 100);

	/**
	 * 内部明細備考.<p>
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
	public static final MCMeta SLS_ACT_D_INTR_RMRKS = MCMeta.createStringMeta("SLS_ACT_D_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta PRE_PRNT_INTR_RMRKS = MCMeta.createStringMeta("PRE_PRNT_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta PO_SCHD_INTR_RMRKS = MCMeta.createStringMeta("PO_SCHD_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta PO_INTR_RMRKS = MCMeta.createStringMeta("PO_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta PO_D_INTR_RMRKS = MCMeta.createStringMeta("PO_D_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta PURC_RET_SCHD_INTR_RMRKS = MCMeta.createStringMeta("PURC_RET_SCHD_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta PURC_RET_SCHD_D_INTR_RMRKS = MCMeta.createStringMeta("PURC_RET_SCHD_D_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta PURC_RET_ACT_INTR_RMRKS = MCMeta.createStringMeta("PURC_RET_ACT_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta PURC_RET_ACT_D_INTR_RMRKS = MCMeta.createStringMeta("PURC_RET_ACT_D_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta PURC_ACT_INTR_RMRKS = MCMeta.createStringMeta("PURC_ACT_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta PURC_ACT_D_INTR_RMRKS = MCMeta.createStringMeta("PURC_ACT_D_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta PRMS_RCPT_INTR_RMRKS = MCMeta.createStringMeta("PRMS_RCPT_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta PRMS_RCPT_D_INTR_RMRKS = MCMeta.createStringMeta("PRMS_RCPT_D_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta DLV_INST_INTR_RMRKS = MCMeta.createStringMeta("DLV_INST_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta DLV_INST_D_INTR_RMRKS = MCMeta.createStringMeta("DLV_INST_D_INTR_RMRKS", "", 100);

	/**
	 * 発注連絡備考.<p>
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
	public static final MCMeta PO_CNT_RMRKS = MCMeta.createStringMeta("PO_CNT_RMRKS", "", 100);

	/**
	 * ＩＦ回答納期受領備考.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta IF_PRMS_RCPT_D_RMRKS = MCMeta.createStringMeta("IF_PRMS_RCPT_D_RMRKS", "", 100);

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
	 * </table>
	 */
	public static final MCMeta SLS_ACT_SUB_CHAR1 = MCMeta.createStringMeta("SLS_ACT_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta SLS_ACT_SUB_CHAR2 = MCMeta.createStringMeta("SLS_ACT_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta SLS_ACT_SUB_CHAR3 = MCMeta.createStringMeta("SLS_ACT_SUB_CHAR3", "", 20);

	/**
	 * 明細予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta SLS_ACT_D_SUB_CHAR1 = MCMeta.createStringMeta("SLS_ACT_D_SUB_CHAR1", "", 20);

	/**
	 * 明細予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta SLS_ACT_D_SUB_CHAR2 = MCMeta.createStringMeta("SLS_ACT_D_SUB_CHAR2", "", 20);

	/**
	 * 明細予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta SLS_ACT_D_SUB_CHAR3 = MCMeta.createStringMeta("SLS_ACT_D_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta SLS_ACT_IO_SUB_CHAR1 = MCMeta.createStringMeta("SLS_ACT_IO_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta SLS_ACT_IO_SUB_CHAR2 = MCMeta.createStringMeta("SLS_ACT_IO_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta SLS_ACT_IO_SUB_CHAR3 = MCMeta.createStringMeta("SLS_ACT_IO_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PRE_PRNT_SUB_CHAR1 = MCMeta.createStringMeta("PRE_PRNT_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PRE_PRNT_SUB_CHAR2 = MCMeta.createStringMeta("PRE_PRNT_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PRE_PRNT_SUB_CHAR3 = MCMeta.createStringMeta("PRE_PRNT_SUB_CHAR3", "", 20);

	/**
	 * 明細予備１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta PRE_PRNT_D_SUB_CHAR1 = MCMeta.createStringMeta("PRE_PRNT_D_SUB_CHAR1", "", 20);

	/**
	 * 明細予備２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta PRE_PRNT_D_SUB_CHAR2 = MCMeta.createStringMeta("PRE_PRNT_D_SUB_CHAR2", "", 20);

	/**
	 * 明細予備３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta PRE_PRNT_D_SUB_CHAR3 = MCMeta.createStringMeta("PRE_PRNT_D_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PO_SCHD_SUB_CHAR1 = MCMeta.createStringMeta("PO_SCHD_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PO_SCHD_SUB_CHAR2 = MCMeta.createStringMeta("PO_SCHD_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PO_SCHD_SUB_CHAR3 = MCMeta.createStringMeta("PO_SCHD_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PO_SUB_CHAR1 = MCMeta.createStringMeta("PO_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PO_SUB_CHAR2 = MCMeta.createStringMeta("PO_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PO_SUB_CHAR3 = MCMeta.createStringMeta("PO_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PO_D_SUB_CHAR1 = MCMeta.createStringMeta("PO_D_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PO_D_SUB_CHAR2 = MCMeta.createStringMeta("PO_D_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PO_D_SUB_CHAR3 = MCMeta.createStringMeta("PO_D_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PURC_RET_SCHD_SUB_CHAR1 = MCMeta.createStringMeta("PURC_RET_SCHD_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PURC_RET_SCHD_SUB_CHAR2 = MCMeta.createStringMeta("PURC_RET_SCHD_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PURC_RET_SCHD_SUB_CHAR3 = MCMeta.createStringMeta("PURC_RET_SCHD_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PURC_RET_SCHD_D_SUB_CHAR1 = MCMeta.createStringMeta("PURC_RET_SCHD_D_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PURC_RET_SCHD_D_SUB_CHAR2 = MCMeta.createStringMeta("PURC_RET_SCHD_D_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PURC_RET_SCHD_D_SUB_CHAR3 = MCMeta.createStringMeta("PURC_RET_SCHD_D_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PURC_RET_SCHD_IO_SUB_CHAR1 = MCMeta.createStringMeta("PURC_RET_SCHD_IO_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PURC_RET_SCHD_IO_SUB_CHAR2 = MCMeta.createStringMeta("PURC_RET_SCHD_IO_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PURC_RET_SCHD_IO_SUB_CHAR3 = MCMeta.createStringMeta("PURC_RET_SCHD_IO_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PURC_RET_ACT_SUB_CHAR1 = MCMeta.createStringMeta("PURC_RET_ACT_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PURC_RET_ACT_SUB_CHAR2 = MCMeta.createStringMeta("PURC_RET_ACT_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PURC_RET_ACT_SUB_CHAR3 = MCMeta.createStringMeta("PURC_RET_ACT_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PURC_RET_ACT_D_SUB_CHAR1 = MCMeta.createStringMeta("PURC_RET_ACT_D_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PURC_RET_ACT_D_SUB_CHAR2 = MCMeta.createStringMeta("PURC_RET_ACT_D_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PURC_RET_ACT_D_SUB_CHAR3 = MCMeta.createStringMeta("PURC_RET_ACT_D_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PURC_RET_ACT_IO_SUB_CHAR1 = MCMeta.createStringMeta("PURC_RET_ACT_IO_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PURC_RET_ACT_IO_SUB_CHAR2 = MCMeta.createStringMeta("PURC_RET_ACT_IO_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PURC_RET_ACT_IO_SUB_CHAR3 = MCMeta.createStringMeta("PURC_RET_ACT_IO_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PURC_ACT_SUB_CHAR1 = MCMeta.createStringMeta("PURC_ACT_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PURC_ACT_SUB_CHAR2 = MCMeta.createStringMeta("PURC_ACT_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PURC_ACT_SUB_CHAR3 = MCMeta.createStringMeta("PURC_ACT_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PURC_ACT_D_SUB_CHAR1 = MCMeta.createStringMeta("PURC_ACT_D_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PURC_ACT_D_SUB_CHAR2 = MCMeta.createStringMeta("PURC_ACT_D_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PURC_ACT_D_SUB_CHAR3 = MCMeta.createStringMeta("PURC_ACT_D_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PURC_ACT_IO_SUB_CHAR1 = MCMeta.createStringMeta("PURC_ACT_IO_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PURC_ACT_IO_SUB_CHAR2 = MCMeta.createStringMeta("PURC_ACT_IO_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PURC_ACT_IO_SUB_CHAR3 = MCMeta.createStringMeta("PURC_ACT_IO_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta DLV_INST_SUB_CHAR1 = MCMeta.createStringMeta("DLV_INST_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta DLV_INST_SUB_CHAR2 = MCMeta.createStringMeta("DLV_INST_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta DLV_INST_SUB_CHAR3 = MCMeta.createStringMeta("DLV_INST_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta DLV_INST_D_SUB_CHAR1 = MCMeta.createStringMeta("DLV_INST_D_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta DLV_INST_D_SUB_CHAR2 = MCMeta.createStringMeta("DLV_INST_D_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta DLV_INST_D_SUB_CHAR3 = MCMeta.createStringMeta("DLV_INST_D_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PRMS_RCPT_SUB_CHAR1 = MCMeta.createStringMeta("PRMS_RCPT_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PRMS_RCPT_SUB_CHAR2 = MCMeta.createStringMeta("PRMS_RCPT_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PRMS_RCPT_SUB_CHAR3 = MCMeta.createStringMeta("PRMS_RCPT_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PRMS_RCPT_SUB_D_CHAR1 = MCMeta.createStringMeta("PRMS_RCPT_SUB_D_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PRMS_RCPT_SUB_D_CHAR2 = MCMeta.createStringMeta("PRMS_RCPT_SUB_D_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PRMS_RCPT_SUB_D_CHAR3 = MCMeta.createStringMeta("PRMS_RCPT_SUB_D_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta CLOSE_SUB_CHAR1 = MCMeta.createStringMeta("CLOSE_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta CLOSE_SUB_CHAR2 = MCMeta.createStringMeta("CLOSE_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta CLOSE_SUB_CHAR3 = MCMeta.createStringMeta("CLOSE_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta AR_PRE_CL_SUB_CHAR1 = MCMeta.createStringMeta("AR_PRE_CL_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta AR_PRE_CL_SUB_CHAR2 = MCMeta.createStringMeta("AR_PRE_CL_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta AR_PRE_CL_SUB_CHAR3 = MCMeta.createStringMeta("AR_PRE_CL_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta AP_PRE_CL_SUB_CHAR1 = MCMeta.createStringMeta("AP_PRE_CL_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta AP_PRE_CL_SUB_CHAR2 = MCMeta.createStringMeta("AP_PRE_CL_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta AP_PRE_CL_SUB_CHAR3 = MCMeta.createStringMeta("AP_PRE_CL_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PURC_SCHD_SUB_CHAR1 = MCMeta.createStringMeta("PURC_SCHD_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PURC_SCHD_SUB_CHAR2 = MCMeta.createStringMeta("PURC_SCHD_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta PURC_SCHD_SUB_CHAR3 = MCMeta.createStringMeta("PURC_SCHD_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta SIM_PRMS_RSLT_SUB_CHAR1 = MCMeta.createStringMeta("SIM_PRMS_RSLT_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta SIM_PRMS_RSLT_SUB_CHAR2 = MCMeta.createStringMeta("SIM_PRMS_RSLT_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta SIM_PRMS_RSLT_SUB_CHAR3 = MCMeta.createStringMeta("SIM_PRMS_RSLT_SUB_CHAR3", "", 20);

	/**
	 * 製造指図状況区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta MFG_STS_TYP = MCMeta.createStringMeta("MFG_STS_TYP", "", 1);

	/**
	 * 製造指図状況区分名.<p>
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
	public static final MCMeta MFG_STS_TYP_NM = MCMeta.createStringMeta("MFG_STS_TYP_NM", "");

	/**
	 * 製造実績状況区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta MFG_ACT_STS_TYP = MCMeta.createStringMeta("MFG_ACT_STS_TYP", "", 1);

	/**
	 * 製造実績状況区分名.<p>
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
	public static final MCMeta MFG_ACT_STS_TYP_NM = MCMeta.createStringMeta("MFG_ACT_STS_TYP_NM", "");

	/**
	 * 生産方法区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta MFG_MTD_TYP = MCMeta.createStringMeta("MFG_MTD_TYP", "", 1);

	/**
	 * 生産方法区分名.<p>
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
	public static final MCMeta MFG_MTD_TYP_NM = MCMeta.createStringMeta("MFG_MTD_TYP_NM", "");

	/**
	 * 製造承認状況区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta MFG_APRV_STS_TYP = MCMeta.createStringMeta("MFG_APRV_STS_TYP", "", 1);

	/**
	 * 製造承認状況区分名.<p>
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
	public static final MCMeta MFG_APRV_STS_TYP_NM = MCMeta.createStringMeta("MFG_APRV_STS_TYP_NM", "");

	/**
	 * 指図再展開区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta RE_EXT_TYP = MCMeta.createStringMeta("RE_EXT_TYP", "", 1);

	/**
	 * 指図再展開区分名.<p>
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
	public static final MCMeta RE_EXT_TYP_NM = MCMeta.createStringMeta("RE_EXT_TYP_NM", "");

	/**
	 * 承認理由.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta APRV_RSN = MCMeta.createStringMeta("APRV_RSN", "", 100);

	/**
	 * 印字用表示期限.<p>
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
	public static final MCMeta DISP_PD = MCMeta.createStringMeta("DISP_PD", "", 60);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta WG_RQST_INTR_RMRKS = MCMeta.createStringMeta("WG_RQST_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta WG_RQST_PRMS_INTR_RMRKS = MCMeta.createStringMeta("WG_RQST_PRMS_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta DMND_INTR_RMRKS = MCMeta.createStringMeta("DMND_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta CST_FRCST_INTR_RMRKS = MCMeta.createStringMeta("CST_FRCST_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta CST_FRCST_D_INTR_RMRKS = MCMeta.createStringMeta("CST_FRCST_D_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta RQMT_INTR_RMRKS = MCMeta.createStringMeta("RQMT_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta IORD_INTR_RMRKS = MCMeta.createStringMeta("IORD_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta MRQMT_INTR_RMRKS = MCMeta.createStringMeta("MRQMT_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta ALLOC_PLN_INTR_RMRKS = MCMeta.createStringMeta("ALLOC_PLN_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta ITM_LNK_INTR_RMRKS = MCMeta.createStringMeta("ITM_LNK_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta OORDER_INTR_RMRKS = MCMeta.createStringMeta("OORDER_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta MRPCNTR_INTR_RMRKS = MCMeta.createStringMeta("MRPCNTR_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta MRPLOG_INTR_RMRKS = MCMeta.createStringMeta("MRPLOG_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta SCHEEXEC_INTR_RMRKS = MCMeta.createStringMeta("SCHEEXEC_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta MLYRQST_INTR_RMRKS = MCMeta.createStringMeta("MLYRQST_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta MFG_INST_INTR_RMRKS = MCMeta.createStringMeta("MFG_INST_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta OPER_INST_INTR_RMRKS = MCMeta.createStringMeta("OPER_INST_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta YIELD_SCHD_INTR_RMRKS = MCMeta.createStringMeta("YIELD_SCHD_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta INPT_SCHD_INTR_RMRKS = MCMeta.createStringMeta("INPT_SCHD_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta WK_SCHD_INTR_RMRKS = MCMeta.createStringMeta("WK_SCHD_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta MFG_ACT_INTR_RMRKS = MCMeta.createStringMeta("MFG_ACT_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta OPER_ACT_INTR_RMRKS = MCMeta.createStringMeta("OPER_ACT_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta YIELD_ACT_INTR_RMRKS = MCMeta.createStringMeta("YIELD_ACT_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta INPT_ACT_INTR_RMRKS = MCMeta.createStringMeta("INPT_ACT_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta WK_ACT_INTR_RMRKS = MCMeta.createStringMeta("WK_ACT_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta LOSS_ACT_INTR_RMRKS = MCMeta.createStringMeta("LOSS_ACT_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta RE_EXT_INTR_RMRKS = MCMeta.createStringMeta("RE_EXT_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta DLY_DMND_INTR_RMRKS = MCMeta.createStringMeta("DLY_DMND_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta DLY_SD_INTR_RMRKS = MCMeta.createStringMeta("DLY_SD_INTR_RMRKS", "", 100);

	/**
	 * 指図書備考.<p>
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
	public static final MCMeta MFG_INST_RPT_RMRKS = MCMeta.createStringMeta("MFG_INST_RPT_RMRKS", "", 100);

	/**
	 * 指図書備考.<p>
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
	public static final MCMeta OPER_INST_RPT_RMRKS = MCMeta.createStringMeta("OPER_INST_RPT_RMRKS", "", 100);

	/**
	 * 指図書備考.<p>
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
	public static final MCMeta YIELD_SCHD_RPT_RMRKS = MCMeta.createStringMeta("YIELD_SCHD_RPT_RMRKS", "", 100);

	/**
	 * 指図書備考.<p>
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
	public static final MCMeta INPT_SCHD_RPT_RMRKS = MCMeta.createStringMeta("INPT_SCHD_RPT_RMRKS", "", 100);

	/**
	 * 記録書備考.<p>
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
	public static final MCMeta MFG_ACT_RPT_RMRKS = MCMeta.createStringMeta("MFG_ACT_RPT_RMRKS", "", 100);

	/**
	 * 記録書備考.<p>
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
	public static final MCMeta OPER_ACT_RPT_RMRKS = MCMeta.createStringMeta("OPER_ACT_RPT_RMRKS", "", 100);

	/**
	 * 記録書備考.<p>
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
	public static final MCMeta YIELD_ACT_RPT_RMRKS = MCMeta.createStringMeta("YIELD_ACT_RPT_RMRKS", "", 100);

	/**
	 * 記録書備考.<p>
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
	public static final MCMeta INPT_ACT_RPT_RMRKS = MCMeta.createStringMeta("INPT_ACT_RPT_RMRKS", "", 100);

	/**
	 * 取消備考.<p>
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
	public static final MCMeta CST_FRCST_CAN_RMRKS = MCMeta.createStringMeta("CST_FRCST_CAN_RMRKS", "", 100);

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
	 * </table>
	 */
	public static final MCMeta CST_FRCST_SUB_CHAR1 = MCMeta.createStringMeta("CST_FRCST_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta CST_FRCST_D_SUB_CHAR1 = MCMeta.createStringMeta("CST_FRCST_D_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta RQMT_SUB_CHAR1 = MCMeta.createStringMeta("RQMT_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta IORD_SUB_CHAR1 = MCMeta.createStringMeta("IORD_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta MRQMT_SUB_CHAR1 = MCMeta.createStringMeta("MRQMT_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta ALLOC_PLN_SUB_CHAR1 = MCMeta.createStringMeta("ALLOC_PLN_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta ITM_LNK_SUB_CHAR1 = MCMeta.createStringMeta("ITM_LNK_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta OORDER_SUB_CHAR1 = MCMeta.createStringMeta("OORDER_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta MRPCNTR_SUB_CHAR1 = MCMeta.createStringMeta("MRPCNTR_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta MRPLOG_SUB_CHAR1 = MCMeta.createStringMeta("MRPLOG_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta SCHEEXEC_SUB_CHAR1 = MCMeta.createStringMeta("SCHEEXEC_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta MLYRQST_SUB_CHAR1 = MCMeta.createStringMeta("MLYRQST_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta ITM_MFG_INST_SUB_CHAR1 = MCMeta.createStringMeta("ITM_MFG_INST_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta MFG_INST_SUB_CHAR1 = MCMeta.createStringMeta("MFG_INST_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta OPER_INST_SUB_CHAR1 = MCMeta.createStringMeta("OPER_INST_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta YIELD_SCHD_SUB_CHAR1 = MCMeta.createStringMeta("YIELD_SCHD_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta INPT_SCHD_SUB_CHAR1 = MCMeta.createStringMeta("INPT_SCHD_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta INPT_ALLOC_SUB_CHAR1 = MCMeta.createStringMeta("INPT_ALLOC_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta WK_SCHD_SUB_CHAR1 = MCMeta.createStringMeta("WK_SCHD_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta MFG_ACT_SUB_CHAR1 = MCMeta.createStringMeta("MFG_ACT_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta OPER_ACT_SUB_CHAR1 = MCMeta.createStringMeta("OPER_ACT_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta YIELD_ACT_SUB_CHAR1 = MCMeta.createStringMeta("YIELD_ACT_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta INPT_ACT_SUB_CHAR1 = MCMeta.createStringMeta("INPT_ACT_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta WK_ACT_SUB_CHAR1 = MCMeta.createStringMeta("WK_ACT_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta LOSS_ACT_SUB_CHAR1 = MCMeta.createStringMeta("LOSS_ACT_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta MLY_WIP_SUB_CHAR1 = MCMeta.createStringMeta("MLY_WIP_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta RE_EXT_SUB_CHAR1 = MCMeta.createStringMeta("RE_EXT_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta DMND_SUB_CHAR1 = MCMeta.createStringMeta("DMND_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta DLY_DMND_SUB_CHAR1 = MCMeta.createStringMeta("DLY_DMND_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta DLY_SD_SUB_CHAR1 = MCMeta.createStringMeta("DLY_SD_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta DMND_REC_MAP_SUB_CHAR1 = MCMeta.createStringMeta("DMND_REC_MAP_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta WG_RQST_SUB_CHAR1 = MCMeta.createStringMeta("WG_RQST_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta WG_RQST_PRMS_SUB_CHAR1 = MCMeta.createStringMeta("WG_RQST_PRMS_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta MFG_ACT_REM_SUB_CHAR1 = MCMeta.createStringMeta("MFG_ACT_REM_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta OPER_ACT_REM_SUB_CHAR1 = MCMeta.createStringMeta("OPER_ACT_REM_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta YIELD_ACT_REM_SUB_CHAR1 = MCMeta.createStringMeta("YIELD_ACT_REM_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta INPT_ACT_REM_SUB_CHAR1 = MCMeta.createStringMeta("INPT_ACT_REM_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta WK_ACT_REM_SUB_CHAR1 = MCMeta.createStringMeta("WK_ACT_REM_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta CST_FRCST_SUB_CHAR2 = MCMeta.createStringMeta("CST_FRCST_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta CST_FRCST_D_SUB_CHAR2 = MCMeta.createStringMeta("CST_FRCST_D_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta RQMT_SUB_CHAR2 = MCMeta.createStringMeta("RQMT_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta IORD_SUB_CHAR2 = MCMeta.createStringMeta("IORD_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta MRQMT_SUB_CHAR2 = MCMeta.createStringMeta("MRQMT_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta ALLOC_PLN_SUB_CHAR2 = MCMeta.createStringMeta("ALLOC_PLN_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta ITM_LNK_SUB_CHAR2 = MCMeta.createStringMeta("ITM_LNK_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta OORDER_SUB_CHAR2 = MCMeta.createStringMeta("OORDER_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta MRPCNTR_SUB_CHAR2 = MCMeta.createStringMeta("MRPCNTR_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta MRPLOG_SUB_CHAR2 = MCMeta.createStringMeta("MRPLOG_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta SCHEEXEC_SUB_CHAR2 = MCMeta.createStringMeta("SCHEEXEC_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta MLYRQST_SUB_CHAR2 = MCMeta.createStringMeta("MLYRQST_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta ITM_MFG_INST_SUB_CHAR2 = MCMeta.createStringMeta("ITM_MFG_INST_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta MFG_INST_SUB_CHAR2 = MCMeta.createStringMeta("MFG_INST_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta OPER_INST_SUB_CHAR2 = MCMeta.createStringMeta("OPER_INST_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta YIELD_SCHD_SUB_CHAR2 = MCMeta.createStringMeta("YIELD_SCHD_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta INPT_SCHD_SUB_CHAR2 = MCMeta.createStringMeta("INPT_SCHD_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta INPT_ALLOC_SUB_CHAR2 = MCMeta.createStringMeta("INPT_ALLOC_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta WK_SCHD_SUB_CHAR2 = MCMeta.createStringMeta("WK_SCHD_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta MFG_ACT_SUB_CHAR2 = MCMeta.createStringMeta("MFG_ACT_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta OPER_ACT_SUB_CHAR2 = MCMeta.createStringMeta("OPER_ACT_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta YIELD_ACT_SUB_CHAR2 = MCMeta.createStringMeta("YIELD_ACT_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta INPT_ACT_SUB_CHAR2 = MCMeta.createStringMeta("INPT_ACT_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta WK_ACT_SUB_CHAR2 = MCMeta.createStringMeta("WK_ACT_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta LOSS_ACT_SUB_CHAR2 = MCMeta.createStringMeta("LOSS_ACT_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta MLY_WIP_SUB_CHAR2 = MCMeta.createStringMeta("MLY_WIP_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta RE_EXT_SUB_CHAR2 = MCMeta.createStringMeta("RE_EXT_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta DMND_SUB_CHAR2 = MCMeta.createStringMeta("DMND_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta DLY_DMND_SUB_CHAR2 = MCMeta.createStringMeta("DLY_DMND_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta DLY_SD_SUB_CHAR2 = MCMeta.createStringMeta("DLY_SD_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta DMND_REC_MAP_SUB_CHAR2 = MCMeta.createStringMeta("DMND_REC_MAP_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta WG_RQST_SUB_CHAR2 = MCMeta.createStringMeta("WG_RQST_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta WG_RQST_PRMS_SUB_CHAR2 = MCMeta.createStringMeta("WG_RQST_PRMS_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta MFG_ACT_REM_SUB_CHAR2 = MCMeta.createStringMeta("MFG_ACT_REM_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta OPER_ACT_REM_SUB_CHAR2 = MCMeta.createStringMeta("OPER_ACT_REM_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta YIELD_ACT_REM_SUB_CHAR2 = MCMeta.createStringMeta("YIELD_ACT_REM_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta INPT_ACT_REM_SUB_CHAR2 = MCMeta.createStringMeta("INPT_ACT_REM_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta WK_ACT_REM_SUB_CHAR2 = MCMeta.createStringMeta("WK_ACT_REM_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta CST_FRCST_SUB_CHAR3 = MCMeta.createStringMeta("CST_FRCST_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta CST_FRCST_D_SUB_CHAR3 = MCMeta.createStringMeta("CST_FRCST_D_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta RQMT_SUB_CHAR3 = MCMeta.createStringMeta("RQMT_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta IORD_SUB_CHAR3 = MCMeta.createStringMeta("IORD_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta MRQMT_SUB_CHAR3 = MCMeta.createStringMeta("MRQMT_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta ALLOC_PLN_SUB_CHAR3 = MCMeta.createStringMeta("ALLOC_PLN_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta ITM_LNK_SUB_CHAR3 = MCMeta.createStringMeta("ITM_LNK_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta OORDER_SUB_CHAR3 = MCMeta.createStringMeta("OORDER_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta MRPCNTR_SUB_CHAR3 = MCMeta.createStringMeta("MRPCNTR_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta MRPLOG_SUB_CHAR3 = MCMeta.createStringMeta("MRPLOG_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta SCHEEXEC_SUB_CHAR3 = MCMeta.createStringMeta("SCHEEXEC_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta MLYRQST_SUB_CHAR3 = MCMeta.createStringMeta("MLYRQST_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta ITM_MFG_INST_SUB_CHAR3 = MCMeta.createStringMeta("ITM_MFG_INST_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta MFG_INST_SUB_CHAR3 = MCMeta.createStringMeta("MFG_INST_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta OPER_INST_SUB_CHAR3 = MCMeta.createStringMeta("OPER_INST_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta YIELD_SCHD_SUB_CHAR3 = MCMeta.createStringMeta("YIELD_SCHD_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta INPT_SCHD_SUB_CHAR3 = MCMeta.createStringMeta("INPT_SCHD_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta INPT_ALLOC_SUB_CHAR3 = MCMeta.createStringMeta("INPT_ALLOC_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta WK_SCHD_SUB_CHAR3 = MCMeta.createStringMeta("WK_SCHD_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta MFG_ACT_SUB_CHAR3 = MCMeta.createStringMeta("MFG_ACT_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta OPER_ACT_SUB_CHAR3 = MCMeta.createStringMeta("OPER_ACT_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta YIELD_ACT_SUB_CHAR3 = MCMeta.createStringMeta("YIELD_ACT_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta INPT_ACT_SUB_CHAR3 = MCMeta.createStringMeta("INPT_ACT_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta WK_ACT_SUB_CHAR3 = MCMeta.createStringMeta("WK_ACT_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta LOSS_ACT_SUB_CHAR3 = MCMeta.createStringMeta("LOSS_ACT_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta MLY_WIP_SUB_CHAR3 = MCMeta.createStringMeta("MLY_WIP_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta RE_EXT_SUB_CHAR3 = MCMeta.createStringMeta("RE_EXT_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta DMND_SUB_CHAR3 = MCMeta.createStringMeta("DMND_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta DLY_DMND_SUB_CHAR3 = MCMeta.createStringMeta("DLY_DMND_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta DLY_SD_SUB_CHAR3 = MCMeta.createStringMeta("DLY_SD_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta DMND_REC_MAP_SUB_CHAR3 = MCMeta.createStringMeta("DMND_REC_MAP_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta WG_RQST_SUB_CHAR3 = MCMeta.createStringMeta("WG_RQST_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta WG_RQST_PRMS_SUB_CHAR3 = MCMeta.createStringMeta("WG_RQST_PRMS_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta MFG_ACT_REM_SUB_CHAR3 = MCMeta.createStringMeta("MFG_ACT_REM_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta OPER_ACT_REM_SUB_CHAR3 = MCMeta.createStringMeta("OPER_ACT_REM_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta YIELD_ACT_REM_SUB_CHAR3 = MCMeta.createStringMeta("YIELD_ACT_REM_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta INPT_ACT_REM_SUB_CHAR3 = MCMeta.createStringMeta("INPT_ACT_REM_SUB_CHAR3", "", 20);

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
	 * </table>
	 */
	public static final MCMeta WK_ACT_REM_SUB_CHAR3 = MCMeta.createStringMeta("WK_ACT_REM_SUB_CHAR3", "", 20);

	/**
	 * 需要連絡備考.<p>
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
	public static final MCMeta DMND_CNT_RMRKS = MCMeta.createStringMeta("DMND_CNT_RMRKS", "", 100);

	/**
	 * 指図・発注連絡備考.<p>
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
	public static final MCMeta INST_PO_CNT_RMRKS = MCMeta.createStringMeta("INST_PO_CNT_RMRKS", "", 100);

	/**
	 * 依頼連絡備考.<p>
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
	public static final MCMeta WG_RQST_CNT_RMRKS = MCMeta.createStringMeta("WG_RQST_CNT_RMRKS", "", 100);

	/**
	 * 再調整依頼連絡備考.<p>
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
	public static final MCMeta WG_RE_RQST_CNT_RMRKS = MCMeta.createStringMeta("WG_RE_RQST_CNT_RMRKS", "", 100);

	/**
	 * 回答備考.<p>
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
	public static final MCMeta WG_RQST_PRMS_RMRKS = MCMeta.createStringMeta("WG_RQST_PRMS_RMRKS", "", 100);

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
	 * </table>
	 */
	public static final MCMeta IO_SCHD_SUB_CHAR1 = MCMeta.createStringMeta("IO_SCHD_SUB_CHAR1", "", 50);

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
	 * </table>
	 */
	public static final MCMeta IO_SCHD_SUB_CHAR2 = MCMeta.createStringMeta("IO_SCHD_SUB_CHAR2", "", 50);

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
	 * </table>
	 */
	public static final MCMeta IO_SCHD_SUB_CHAR3 = MCMeta.createStringMeta("IO_SCHD_SUB_CHAR3", "", 50);

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
	 * </table>
	 */
	public static final MCMeta IO_SCHD_SUB_CHAR4 = MCMeta.createStringMeta("IO_SCHD_SUB_CHAR4", "", 50);

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
	 * </table>
	 */
	public static final MCMeta IO_SCHD_SUB_CHAR5 = MCMeta.createStringMeta("IO_SCHD_SUB_CHAR5", "", 50);

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
	public static final MCMeta IO_SCHD_SUB_NUM1 = MCMeta.createNumberMeta("IO_SCHD_SUB_NUM1", "", 21, 8);

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
	public static final MCMeta IO_SCHD_SUB_NUM2 = MCMeta.createNumberMeta("IO_SCHD_SUB_NUM2", "", 21, 8);

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
	public static final MCMeta IO_SCHD_SUB_NUM3 = MCMeta.createNumberMeta("IO_SCHD_SUB_NUM3", "", 21, 8);

	/**
	 * 受払予定予備区分.<p>
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
	public static final MCMeta IO_SCHD_SUB_TYP = MCMeta.createStringMeta("IO_SCHD_SUB_TYP", "", 2);

	/**
	 * 受払予定予備区分名.<p>
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
	public static final MCMeta IO_SCHD_SUB_TYP_NM = MCMeta.createStringMeta("IO_SCHD_SUB_TYP_NM", "");

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
	 * </table>
	 */
	public static final MCMeta IO_SCHD_TYP_MAP_SUB_CHAR1 = MCMeta.createStringMeta("IO_SCHD_TYP_MAP_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta IO_SCHD_TYP_MAP_SUB_CHAR2 = MCMeta.createStringMeta("IO_SCHD_TYP_MAP_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta IO_SCHD_TYP_MAP_SUB_CHAR3 = MCMeta.createStringMeta("IO_SCHD_TYP_MAP_SUB_CHAR3", "", 20);

	/**
	 * 不足時処理区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SHORT_OPE_TYP = MCMeta.createStringMeta("SHORT_OPE_TYP", "", 1);

	/**
	 * 不足時処理区分名.<p>
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
	public static final MCMeta SHORT_OPE_TYP_NM = MCMeta.createStringMeta("SHORT_OPE_TYP_NM", "");

	/**
	 * 受払予定対象区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IO_SCHD_TGT_TYP = MCMeta.createStringMeta("IO_SCHD_TGT_TYP", "", 1);

	/**
	 * 受払予定対象区分名.<p>
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
	public static final MCMeta IO_SCHD_TGT_TYP_NM = MCMeta.createStringMeta("IO_SCHD_TGT_TYP_NM", "");

	/**
	 * ロット提案区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta LOT_PROP_TYP = MCMeta.createStringMeta("LOT_PROP_TYP", "", 1);

	/**
	 * ロット提案区分名.<p>
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
	public static final MCMeta LOT_PROP_TYP_NM = MCMeta.createStringMeta("LOT_PROP_TYP_NM", "");

	/**
	 * 予定在庫区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SCHD_STK_TYP = MCMeta.createStringMeta("SCHD_STK_TYP", "", 1);

	/**
	 * 予定在庫区分名.<p>
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
	public static final MCMeta SCHD_STK_TYP_NM = MCMeta.createStringMeta("SCHD_STK_TYP_NM", "");

	/**
	 * 積送品区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IN_XFR_TYP = MCMeta.createStringMeta("IN_XFR_TYP", "", 1);

	/**
	 * 積送品区分名.<p>
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
	public static final MCMeta IN_XFR_TYP_NM = MCMeta.createStringMeta("IN_XFR_TYP_NM", "");

	/**
	 * 在庫検査区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta STK_INSP_TYP = MCMeta.createStringMeta("STK_INSP_TYP", "", 1);

	/**
	 * 在庫検査区分名.<p>
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
	public static final MCMeta STK_INSP_TYP_NM = MCMeta.createStringMeta("STK_INSP_TYP_NM", "");

	/**
	 * 在庫識別区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta STK_ID_TYP = MCMeta.createStringMeta("STK_ID_TYP", "", 1);

	/**
	 * 在庫識別区分名.<p>
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
	public static final MCMeta STK_ID_TYP_NM = MCMeta.createStringMeta("STK_ID_TYP_NM", "");

	/**
	 * ＭＲＰ区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta MRP_TYP = MCMeta.createStringMeta("MRP_TYP", "", 1);

	/**
	 * ＭＲＰ区分名.<p>
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
	public static final MCMeta MRP_TYP_NM = MCMeta.createStringMeta("MRP_TYP_NM", "");

	/**
	 * ＭＲＰ用データ区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta MRP_DATA_TYP = MCMeta.createStringMeta("MRP_DATA_TYP", "", 1);

	/**
	 * ＭＲＰ用データ区分名.<p>
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
	public static final MCMeta MRP_DATA_TYP_NM = MCMeta.createStringMeta("MRP_DATA_TYP_NM", "");

	/**
	 * ＭＲＰカウンタ接頭辞.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>3</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta MRP_CNTR_PREFIX = MCMeta.createStringMeta("MRP_CNTR_PREFIX", "", 3);

	/**
	 * ＭＲＰカウンタ.<p>
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
	public static final MCMeta MRP_CNTR = MCMeta.createNumberMeta("MRP_CNTR", "", 15, 0);

	/**
	 * ＷＧ間依頼作成元区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta WG_RQST_SRC_TYP = MCMeta.createStringMeta("WG_RQST_SRC_TYP", "", 1);

	/**
	 * ＷＧ間依頼作成元区分名.<p>
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
	public static final MCMeta WG_RQST_SRC_TYP_NM = MCMeta.createStringMeta("WG_RQST_SRC_TYP_NM", "");

	/**
	 * ＷＧ間依頼通知日区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta WG_RQST_NTC_DAY_TYP = MCMeta.createStringMeta("WG_RQST_NTC_DAY_TYP", "", 1);

	/**
	 * ＷＧ間依頼通知日区分名.<p>
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
	public static final MCMeta WG_RQST_NTC_DAY_TYP_NM = MCMeta.createStringMeta("WG_RQST_NTC_DAY_TYP_NM", "");

	/**
	 * ＷＧ間依頼状況区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta WG_RQST_STS_TYP = MCMeta.createStringMeta("WG_RQST_STS_TYP", "", 1);

	/**
	 * ＷＧ間依頼状況区分名.<p>
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
	public static final MCMeta WG_RQST_STS_TYP_NM = MCMeta.createStringMeta("WG_RQST_STS_TYP_NM", "");

	/**
	 * ＷＧ間依頼種類区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
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
	 * ＷＧ間依頼種類区分名.<p>
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
	 * 移動・移送元区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta XFR_SRC_TYP = MCMeta.createStringMeta("XFR_SRC_TYP", "", 1);

	/**
	 * 移動・移送元区分名.<p>
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
	public static final MCMeta XFR_SRC_TYP_NM = MCMeta.createStringMeta("XFR_SRC_TYP_NM", "");

	/**
	 * 支給元予定区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PROV_SRC_SCHD_TYP = MCMeta.createStringMeta("PROV_SRC_SCHD_TYP", "", 1);

	/**
	 * 支給元予定区分名.<p>
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
	public static final MCMeta PROV_SRC_SCHD_TYP_NM = MCMeta.createStringMeta("PROV_SRC_SCHD_TYP_NM", "");

	/**
	 * 支給元実績区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PROV_SRC_ACT_TYP = MCMeta.createStringMeta("PROV_SRC_ACT_TYP", "", 1);

	/**
	 * 支給元実績区分名.<p>
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
	public static final MCMeta PROV_SRC_ACT_TYP_NM = MCMeta.createStringMeta("PROV_SRC_ACT_TYP_NM", "");

	/**
	 * 納品先識別区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta DLV_ID_TYP = MCMeta.createStringMeta("DLV_ID_TYP", "", 1);

	/**
	 * 納品先識別区分名.<p>
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
	public static final MCMeta DLV_ID_TYP_NM = MCMeta.createStringMeta("DLV_ID_TYP_NM", "");

	/**
	 * 納品先識別ＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
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
	public static final MCMeta DLV_ID_CD = MCMeta.createStringMeta("DLV_ID_CD", "", 20);

	/**
	 * 納品先識別名.<p>
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
	public static final MCMeta DLV_ID_NM = MCMeta.createStringMeta("DLV_ID_NM", "", 100);

	/**
	 * 納入先識別区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IN_TO_ID_TYP = MCMeta.createStringMeta("IN_TO_ID_TYP", "", 1);

	/**
	 * 納入先識別区分名.<p>
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
	public static final MCMeta IN_TO_ID_TYP_NM = MCMeta.createStringMeta("IN_TO_ID_TYP_NM", "");

	/**
	 * 納入先識別ＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
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
	public static final MCMeta IN_TO_ID_CD = MCMeta.createStringMeta("IN_TO_ID_CD", "", 20);

	/**
	 * 納入先識別名.<p>
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
	public static final MCMeta IN_TO_ID_NM = MCMeta.createStringMeta("IN_TO_ID_NM", "", 100);

	/**
	 * 送付先識別区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SHIP_TO_ID_TYP = MCMeta.createStringMeta("SHIP_TO_ID_TYP", "", 1);

	/**
	 * 送付先識別区分名.<p>
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
	public static final MCMeta SHIP_TO_ID_TYP_NM = MCMeta.createStringMeta("SHIP_TO_ID_TYP_NM", "");

	/**
	 * 送付先識別ＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
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
	public static final MCMeta SHIP_TO_ID_CD = MCMeta.createStringMeta("SHIP_TO_ID_CD", "", 20);

	/**
	 * 送付先識別名.<p>
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
	public static final MCMeta SHIP_TO_ID_NM = MCMeta.createStringMeta("SHIP_TO_ID_NM", "", 100);

	/**
	 * 引当順ＮＯ.<p>
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
	public static final MCMeta STK_ALLOC_PRIO = MCMeta.createStringMeta("STK_ALLOC_PRIO", "", 15);

	/**
	 * 出荷依頼先識別区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SHIP_RQST_ID_TYP = MCMeta.createStringMeta("SHIP_RQST_ID_TYP", "", 1);

	/**
	 * 出荷依頼先識別区分名.<p>
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
	public static final MCMeta SHIP_RQST_ID_TYP_NM = MCMeta.createStringMeta("SHIP_RQST_ID_TYP_NM", "");

	/**
	 * 出荷依頼先識別ＣＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
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
	public static final MCMeta SHIP_RQST_ID_CD = MCMeta.createStringMeta("SHIP_RQST_ID_CD", "", 20);

	/**
	 * 出荷依頼先識別名.<p>
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
	public static final MCMeta SHIP_RQST_ID_NM = MCMeta.createStringMeta("SHIP_RQST_ID_NM", "", 100);

	/**
	 * 集計単位区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SUM_UNIT_TYP = MCMeta.createStringMeta("SUM_UNIT_TYP", "", 1);

	/**
	 * 集計単位区分名.<p>
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
	public static final MCMeta SUM_UNIT_TYP_NM = MCMeta.createStringMeta("SUM_UNIT_TYP_NM", "");

	/**
	 * 在庫情報検索区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta STK_INFO_SRCH_TYP = MCMeta.createStringMeta("STK_INFO_SRCH_TYP", "", 1);

	/**
	 * 在庫情報検索区分名.<p>
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
	public static final MCMeta STK_INFO_SRCH_TYP_NM = MCMeta.createStringMeta("STK_INFO_SRCH_TYP_NM", "");

	/**
	 * 在庫情報品目区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta STK_INFO_ITM_TYP = MCMeta.createStringMeta("STK_INFO_ITM_TYP", "", 1);

	/**
	 * 在庫情報品目区分名.<p>
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
	public static final MCMeta STK_INFO_ITM_TYP_NM = MCMeta.createStringMeta("STK_INFO_ITM_TYP_NM", "");

	/**
	 * 在庫情報場所区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta STK_INFO_LOC_TYP = MCMeta.createStringMeta("STK_INFO_LOC_TYP", "", 1);

	/**
	 * 在庫情報場所区分名.<p>
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
	public static final MCMeta STK_INFO_LOC_TYP_NM = MCMeta.createStringMeta("STK_INFO_LOC_TYP_NM", "");

	/**
	 * 販売計画バージョン.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
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
	public static final MCMeta SPLN_VERS = MCMeta.createStringMeta("SPLN_VERS", "", 20);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta SPLN_FMT_INTR_RMRKS = MCMeta.createStringMeta("SPLN_FMT_INTR_RMRKS", "", 100);

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
	 */
	public static final MCMeta SPLN_FMT_SUB_CHAR1 = MCMeta.createStringMeta("SPLN_FMT_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta SPLN_FMT_SUB_CHAR2 = MCMeta.createStringMeta("SPLN_FMT_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta SPLN_FMT_SUB_CHAR3 = MCMeta.createStringMeta("SPLN_FMT_SUB_CHAR3", "", 20);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta SPLN_USR_INTR_RMRKS = MCMeta.createStringMeta("SPLN_USR_INTR_RMRKS", "", 100);

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
	 */
	public static final MCMeta SPLN_USR_SUB_CHAR1 = MCMeta.createStringMeta("SPLN_USR_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta SPLN_USR_SUB_CHAR2 = MCMeta.createStringMeta("SPLN_USR_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta SPLN_USR_SUB_CHAR3 = MCMeta.createStringMeta("SPLN_USR_SUB_CHAR3", "", 20);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta SPLN_SUM_INTR_RMRKS = MCMeta.createStringMeta("SPLN_SUM_INTR_RMRKS", "", 100);

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
	 */
	public static final MCMeta SPLN_SUM_SUB_CHAR1 = MCMeta.createStringMeta("SPLN_SUM_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta SPLN_SUM_SUB_CHAR2 = MCMeta.createStringMeta("SPLN_SUM_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta SPLN_SUM_SUB_CHAR3 = MCMeta.createStringMeta("SPLN_SUM_SUB_CHAR3", "", 20);

	/**
	 * 販売計画明細表示順.<p>
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
	public static final MCMeta SPLN_DISP_SEQ = MCMeta.createNumberMeta("SPLN_DISP_SEQ", "", 5, 0);

	/**
	 * 販売計画明細区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>2</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta SPLN_DTL_TYP = MCMeta.createStringMeta("SPLN_DTL_TYP", "", 2);

	/**
	 * 販売計画明細区分名.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>$free$</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>7</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SPLN_DTL_TYP_NM = MCMeta.createStringMeta("SPLN_DTL_TYP_NM", "");

	/**
	 * 需給調整明細区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>3</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta SD_ADJST_DTL_TYP = MCMeta.createStringMeta("SD_ADJST_DTL_TYP", "", 3);

	/**
	 * 需給調整明細区分名.<p>
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
	public static final MCMeta SD_ADJST_DTL_TYP_NM = MCMeta.createStringMeta("SD_ADJST_DTL_TYP_NM", "");

	/**
	 * 内部明細備考.<p>
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
	public static final MCMeta ACXFR_ACT_INTR_D_RMRKS = MCMeta.createStringMeta("ACXFR_ACT_INTR_D_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta ACXFR_ACT_INTR_RMRKS = MCMeta.createStringMeta("ACXFR_ACT_INTR_RMRKS", "", 100);

	/**
	 * 指図明細備考.<p>
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
	public static final MCMeta ACXFR_INST_D_RMRKS = MCMeta.createStringMeta("ACXFR_INST_D_RMRKS", "", 100);

	/**
	 * 内部明細備考.<p>
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
	public static final MCMeta ACXFR_INST_INTR_D_RMRKS = MCMeta.createStringMeta("ACXFR_INST_INTR_D_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta ACXFR_INST_INTR_RMRKS = MCMeta.createStringMeta("ACXFR_INST_INTR_RMRKS", "", 100);

	/**
	 * 指図備考.<p>
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
	public static final MCMeta ACXFR_INST_RMRKS = MCMeta.createStringMeta("ACXFR_INST_RMRKS", "", 100);

	/**
	 * 解除備考.<p>
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
	public static final MCMeta ALLOC_STOP_LOT_REL_RMRKS = MCMeta.createStringMeta("ALLOC_STOP_LOT_REL_RMRKS", "", 100);

	/**
	 * 禁止備考.<p>
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
	public static final MCMeta ALLOC_STOP_LOT_RMRKS = MCMeta.createStringMeta("ALLOC_STOP_LOT_RMRKS", "", 100);

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
	 */
	public static final MCMeta ALLOC_STOP_LOT_SUB_CHAR1 = MCMeta.createStringMeta("ALLOC_STOP_LOT_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta ALLOC_STOP_LOT_SUB_CHAR2 = MCMeta.createStringMeta("ALLOC_STOP_LOT_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta ALLOC_STOP_LOT_SUB_CHAR3 = MCMeta.createStringMeta("ALLOC_STOP_LOT_SUB_CHAR3", "", 20);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta ARR_ACT_INTR_RMRKS = MCMeta.createStringMeta("ARR_ACT_INTR_RMRKS", "", 100);

	/**
	 * 入荷連絡備考.<p>
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
	public static final MCMeta ARR_CNT_RMRKS = MCMeta.createStringMeta("ARR_CNT_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta ARR_SCHD_INTR_RMRKS = MCMeta.createStringMeta("ARR_SCHD_INTR_RMRKS", "", 100);

	/**
	 * Ｂ／Ｌ備考.<p>
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
	public static final MCMeta BL_RMRKS = MCMeta.createStringMeta("BL_RMRKS", "", 100);

	/**
	 * ケースマーク.<p>
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
	public static final MCMeta CASE_MRK = MCMeta.createStringMeta("CASE_MRK", "", 30);

	/**
	 * 廃棄申請備考.<p>
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
	public static final MCMeta DSPSL_RMRKS = MCMeta.createStringMeta("DSPSL_RMRKS", "", 100);

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
	 * 受払区分名.<p>
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
	public static final MCMeta IO_ACT_TYP_NM = MCMeta.createStringMeta("IO_ACT_TYP_NM", "");

	/**
	 * 内部明細備考.<p>
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
	public static final MCMeta IV_D_INTR_D_RMRKS = MCMeta.createStringMeta("IV_D_INTR_D_RMRKS", "", 100);

	/**
	 * インボイス明細備考.<p>
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
	public static final MCMeta IV_D_RMRKS = MCMeta.createStringMeta("IV_D_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta IV_INTR_RMRKS = MCMeta.createStringMeta("IV_INTR_RMRKS", "", 100);

	/**
	 * インボイス備考.<p>
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
	public static final MCMeta IV_RMRKS = MCMeta.createStringMeta("IV_RMRKS", "", 100);

	/**
	 * Ｌ／Ｃ備考.<p>
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
	public static final MCMeta LC_RMRKS = MCMeta.createStringMeta("LC_RMRKS", "", 100);

	/**
	 * 内部明細備考.<p>
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
	public static final MCMeta PL_D_INTR_D_RMRKS = MCMeta.createStringMeta("PL_D_INTR_D_RMRKS", "", 100);

	/**
	 * パッキングリスト明細備考.<p>
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
	public static final MCMeta PL_D_RMRKS = MCMeta.createStringMeta("PL_D_RMRKS", "", 100);

	/**
	 * パッキングリスト備考.<p>
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
	public static final MCMeta PL_RMRKS = MCMeta.createStringMeta("PL_RMRKS", "", 100);

	/**
	 * 進捗状況区分.<p>
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
	public static final MCMeta PR_STS_TYP = MCMeta.createStringMeta("PR_STS_TYP", "", 4);

	/**
	 * 進捗状況区分名.<p>
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
	public static final MCMeta PR_STS_TYP_NM = MCMeta.createStringMeta("PR_STS_TYP_NM", "");

	/**
	 * 内部備考.<p>
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
	public static final MCMeta PROV_ACT_INTR_RMRKS = MCMeta.createStringMeta("PROV_ACT_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta PROV_SCHD_INTR_RMRKS = MCMeta.createStringMeta("PROV_SCHD_INTR_RMRKS", "", 100);

	/**
	 * 購買状況区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PURC_STS_TYP = MCMeta.createStringMeta("PURC_STS_TYP", "", 1);

	/**
	 * 購買状況区分名.<p>
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
	public static final MCMeta PURC_STS_TYP_NM = MCMeta.createStringMeta("PURC_STS_TYP_NM", "");

	/**
	 * 内部備考.<p>
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
	public static final MCMeta RCPT_IV_INTR_RMRKS = MCMeta.createStringMeta("RCPT_IV_INTR_RMRKS", "", 100);

	/**
	 * 内部明細備考.<p>
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
	public static final MCMeta RCPT_IV_INTR_D_RMRKS = MCMeta.createStringMeta("RCPT_IV_INTR_D_RMRKS", "", 100);

	/**
	 * 依頼連絡備考.<p>
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
	public static final MCMeta RQST_CNT_RMRKS = MCMeta.createStringMeta("RQST_CNT_RMRKS", "", 100);

	/**
	 * 内部明細備考.<p>
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
	public static final MCMeta SHIP_ACT_INTR_D_RMRKS = MCMeta.createStringMeta("SHIP_ACT_INTR_D_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta SHIP_ACT_INTR_RMRKS = MCMeta.createStringMeta("SHIP_ACT_INTR_RMRKS", "", 100);

	/**
	 * 出荷連絡備考.<p>
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
	public static final MCMeta SHIP_CNT_RMRKS = MCMeta.createStringMeta("SHIP_CNT_RMRKS", "", 100);

	/**
	 * 指図明細備考.<p>
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
	public static final MCMeta SHIP_INST_D_RMRKS = MCMeta.createStringMeta("SHIP_INST_D_RMRKS", "", 100);

	/**
	 * 内部明細備考.<p>
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
	public static final MCMeta SHIP_INST_INTR_D_RMRKS = MCMeta.createStringMeta("SHIP_INST_INTR_D_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta SHIP_INST_INTR_RMRKS = MCMeta.createStringMeta("SHIP_INST_INTR_RMRKS", "", 100);

	/**
	 * 指図備考.<p>
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
	public static final MCMeta SHIP_INST_RMRKS = MCMeta.createStringMeta("SHIP_INST_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta SHIP_SCHD_INTR_RMRKS = MCMeta.createStringMeta("SHIP_SCHD_INTR_RMRKS", "", 100);

	/**
	 * 内部明細備考.<p>
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
	public static final MCMeta STK_XFR_ACT_INTR_D_RMRKS = MCMeta.createStringMeta("STK_XFR_ACT_INTR_D_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta STK_XFR_ACT_INTR_RMRKS = MCMeta.createStringMeta("STK_XFR_ACT_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta STKTK_ACT_INTR_RMRKS = MCMeta.createStringMeta("STKTK_ACT_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta STKTK_INTR_RMRKS = MCMeta.createStringMeta("STKTK_INTR_RMRKS", "", 100);

	/**
	 * 棚卸表備考.<p>
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
	public static final MCMeta STKTK_RPT_RMRKS = MCMeta.createStringMeta("STKTK_RPT_RMRKS", "", 100);

	/**
	 * 実棚備考.<p>
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
	public static final MCMeta STKTK_ACT_RMRKS = MCMeta.createStringMeta("STKTK_ACT_RMRKS", "", 100);

	/**
	 * 棚卸状況区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta STKTK_STS_TYP = MCMeta.createStringMeta("STKTK_STS_TYP", "", 1);

	/**
	 * 棚卸状況区分名.<p>
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
	public static final MCMeta STKTK_STS_TYP_NM = MCMeta.createStringMeta("STKTK_STS_TYP_NM", "");

	/**
	 * 棚卸種別区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta STKTK_TYP = MCMeta.createStringMeta("STKTK_TYP", "", 1);

	/**
	 * 棚卸種別区分名.<p>
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
	public static final MCMeta STKTK_TYP_NM = MCMeta.createStringMeta("STKTK_TYP_NM", "");

	/**
	 * トランザクション区分.<p>
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
	public static final MCMeta TRN_TYP = MCMeta.createStringMeta("TRN_TYP", "", 4);

	/**
	 * トランザクション区分名.<p>
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
	public static final MCMeta TRN_TYP_NM = MCMeta.createStringMeta("TRN_TYP_NM", "");

	/**
	 * 指図明細備考.<p>
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
	public static final MCMeta XFR_INST_D_RMRKS = MCMeta.createStringMeta("XFR_INST_D_RMRKS", "", 100);

	/**
	 * 指図備考.<p>
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
	public static final MCMeta XFR_INST_RMRKS = MCMeta.createStringMeta("XFR_INST_RMRKS", "", 100);

	/**
	 * 内部明細備考.<p>
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
	public static final MCMeta XFR_ACT_INTR_D_RMRKS = MCMeta.createStringMeta("XFR_ACT_INTR_D_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta XFR_ACT_INTR_RMRKS = MCMeta.createStringMeta("XFR_ACT_INTR_RMRKS", "", 100);

	/**
	 * 内部明細備考.<p>
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
	public static final MCMeta XFR_INST_INTR_D_RMRKS = MCMeta.createStringMeta("XFR_INST_INTR_D_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta XFR_INST_INTR_RMRKS = MCMeta.createStringMeta("XFR_INST_INTR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta XFR_SCHD_INTR_RMRKS = MCMeta.createStringMeta("XFR_SCHD_INTR_RMRKS", "", 100);

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
	* 	<td bgcolor="#cccccc">表示幅</td><td>25</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IO_ACT_SUB_CHAR1 = MCMeta.createStringMeta("IO_ACT_SUB_CHAR1", "", 50);

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
	* 	<td bgcolor="#cccccc">表示幅</td><td>25</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IO_ACT_SUB_CHAR2 = MCMeta.createStringMeta("IO_ACT_SUB_CHAR2", "", 50);

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
	* 	<td bgcolor="#cccccc">表示幅</td><td>25</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IO_ACT_SUB_CHAR3 = MCMeta.createStringMeta("IO_ACT_SUB_CHAR3", "", 50);

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
	* 	<td bgcolor="#cccccc">表示幅</td><td>25</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IO_ACT_SUB_CHAR4 = MCMeta.createStringMeta("IO_ACT_SUB_CHAR4", "", 50);

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
	* 	<td bgcolor="#cccccc">表示幅</td><td>25</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IO_ACT_SUB_CHAR5 = MCMeta.createStringMeta("IO_ACT_SUB_CHAR5", "", 50);

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
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IO_ACT_SUB_NUM1 = MCMeta.createNumberMeta("IO_ACT_SUB_NUM1", "", 21, 8);

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
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IO_ACT_SUB_NUM2 = MCMeta.createNumberMeta("IO_ACT_SUB_NUM2", "", 21, 8);

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
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IO_ACT_SUB_NUM3 = MCMeta.createNumberMeta("IO_ACT_SUB_NUM3", "", 21, 8);

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
	 */
	public static final MCMeta IV_MAP_SUB_CHAR1 = MCMeta.createStringMeta("IV_MAP_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta IV_MAP_SUB_CHAR2 = MCMeta.createStringMeta("IV_MAP_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta IV_MAP_SUB_CHAR3 = MCMeta.createStringMeta("IV_MAP_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta IV_NO_SUB_CHAR1 = MCMeta.createStringMeta("IV_NO_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta IV_NO_SUB_CHAR2 = MCMeta.createStringMeta("IV_NO_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta IV_NO_SUB_CHAR3 = MCMeta.createStringMeta("IV_NO_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta IV_SHIP_ACT_D_SUB_CHAR1 = MCMeta.createStringMeta("IV_SHIP_ACT_D_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta IV_SHIP_ACT_D_SUB_CHAR2 = MCMeta.createStringMeta("IV_SHIP_ACT_D_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta IV_SHIP_ACT_D_SUB_CHAR3 = MCMeta.createStringMeta("IV_SHIP_ACT_D_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta MLY_STK_DTL_SUB_CHAR1 = MCMeta.createStringMeta("MLY_STK_DTL_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta MLY_STK_DTL_SUB_CHAR2 = MCMeta.createStringMeta("MLY_STK_DTL_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta MLY_STK_DTL_SUB_CHAR3 = MCMeta.createStringMeta("MLY_STK_DTL_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta NON_MOV_STK_SUB_CHAR1 = MCMeta.createStringMeta("NON_MOV_STK_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta NON_MOV_STK_SUB_CHAR2 = MCMeta.createStringMeta("NON_MOV_STK_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta NON_MOV_STK_SUB_CHAR3 = MCMeta.createStringMeta("NON_MOV_STK_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta PROV_ACT_SUB_CHAR1 = MCMeta.createStringMeta("PROV_ACT_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta PROV_ACT_SUB_CHAR2 = MCMeta.createStringMeta("PROV_ACT_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta PROV_ACT_SUB_CHAR3 = MCMeta.createStringMeta("PROV_ACT_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta PROV_SCHD_SUB_CHAR1 = MCMeta.createStringMeta("PROV_SCHD_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta PROV_SCHD_SUB_CHAR2 = MCMeta.createStringMeta("PROV_SCHD_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta PROV_SCHD_SUB_CHAR3 = MCMeta.createStringMeta("PROV_SCHD_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta PROV_USE_STS_SUB_CHAR1 = MCMeta.createStringMeta("PROV_USE_STS_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta PROV_USE_STS_SUB_CHAR2 = MCMeta.createStringMeta("PROV_USE_STS_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta PROV_USE_STS_SUB_CHAR3 = MCMeta.createStringMeta("PROV_USE_STS_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta RCPT_IV_SUB_CHAR1 = MCMeta.createStringMeta("RCPT_IV_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta RCPT_IV_SUB_CHAR2 = MCMeta.createStringMeta("RCPT_IV_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta RCPT_IV_SUB_CHAR3 = MCMeta.createStringMeta("RCPT_IV_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta RCPT_IV_D_SUB_CHAR1 = MCMeta.createStringMeta("RCPT_IV_D_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta RCPT_IV_D_SUB_CHAR2 = MCMeta.createStringMeta("RCPT_IV_D_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta RCPT_IV_D_SUB_CHAR3 = MCMeta.createStringMeta("RCPT_IV_D_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta STK_SUB_CHAR1 = MCMeta.createStringMeta("STK_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta STK_SUB_CHAR2 = MCMeta.createStringMeta("STK_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta STK_SUB_CHAR3 = MCMeta.createStringMeta("STK_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta XFR_ACT_D_SUB_CHAR1 = MCMeta.createStringMeta("XFR_ACT_D_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta XFR_ACT_D_SUB_CHAR2 = MCMeta.createStringMeta("XFR_ACT_D_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta XFR_ACT_D_SUB_CHAR3 = MCMeta.createStringMeta("XFR_ACT_D_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta XFR_ACT_SUB_CHAR1 = MCMeta.createStringMeta("XFR_ACT_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta XFR_ACT_SUB_CHAR2 = MCMeta.createStringMeta("XFR_ACT_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta XFR_ACT_SUB_CHAR3 = MCMeta.createStringMeta("XFR_ACT_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta XFR_ALLOC_STS_SUB_CHAR1 = MCMeta.createStringMeta("XFR_ALLOC_STS_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta XFR_ALLOC_STS_SUB_CHAR2 = MCMeta.createStringMeta("XFR_ALLOC_STS_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta XFR_ALLOC_STS_SUB_CHAR3 = MCMeta.createStringMeta("XFR_ALLOC_STS_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta XFR_INST_D_SUB_CHAR1 = MCMeta.createStringMeta("XFR_INST_D_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta XFR_INST_D_SUB_CHAR2 = MCMeta.createStringMeta("XFR_INST_D_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta XFR_INST_D_SUB_CHAR3 = MCMeta.createStringMeta("XFR_INST_D_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta XFR_INST_SUB_CHAR1 = MCMeta.createStringMeta("XFR_INST_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta XFR_INST_SUB_CHAR2 = MCMeta.createStringMeta("XFR_INST_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta XFR_INST_SUB_CHAR3 = MCMeta.createStringMeta("XFR_INST_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta XFR_SCHD_SUB_CHAR1 = MCMeta.createStringMeta("XFR_SCHD_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta XFR_SCHD_SUB_CHAR2 = MCMeta.createStringMeta("XFR_SCHD_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta XFR_SCHD_SUB_CHAR3 = MCMeta.createStringMeta("XFR_SCHD_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta ACXFR_SCHD_SUB_CHAR1 = MCMeta.createStringMeta("ACXFR_SCHD_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta ACXFR_SCHD_SUB_CHAR2 = MCMeta.createStringMeta("ACXFR_SCHD_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta ACXFR_SCHD_SUB_CHAR3 = MCMeta.createStringMeta("ACXFR_SCHD_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta ACXFR_INST_SUB_CHAR1 = MCMeta.createStringMeta("ACXFR_INST_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta ACXFR_INST_SUB_CHAR2 = MCMeta.createStringMeta("ACXFR_INST_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta ACXFR_INST_SUB_CHAR3 = MCMeta.createStringMeta("ACXFR_INST_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta ACXFR_INST_D_SUB_CHAR1 = MCMeta.createStringMeta("ACXFR_INST_D_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta ACXFR_INST_D_SUB_CHAR2 = MCMeta.createStringMeta("ACXFR_INST_D_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta ACXFR_INST_D_SUB_CHAR3 = MCMeta.createStringMeta("ACXFR_INST_D_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta ACXFR_ACT_SUB_CHAR1 = MCMeta.createStringMeta("ACXFR_ACT_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta ACXFR_ACT_SUB_CHAR2 = MCMeta.createStringMeta("ACXFR_ACT_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta ACXFR_ACT_SUB_CHAR3 = MCMeta.createStringMeta("ACXFR_ACT_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta ACXFR_ACT_D_SUB_CHAR1 = MCMeta.createStringMeta("ACXFR_ACT_D_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta ACXFR_ACT_D_SUB_CHAR2 = MCMeta.createStringMeta("ACXFR_ACT_D_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta ACXFR_ACT_D_SUB_CHAR3 = MCMeta.createStringMeta("ACXFR_ACT_D_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta STK_XFR_ACT_SUB_CHAR1 = MCMeta.createStringMeta("STK_XFR_ACT_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta STK_XFR_ACT_SUB_CHAR2 = MCMeta.createStringMeta("STK_XFR_ACT_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta STK_XFR_ACT_SUB_CHAR3 = MCMeta.createStringMeta("STK_XFR_ACT_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta STK_XFR_ACT_D_SUB_CHAR1 = MCMeta.createStringMeta("STK_XFR_ACT_D_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta STK_XFR_ACT_D_SUB_CHAR2 = MCMeta.createStringMeta("STK_XFR_ACT_D_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta STK_XFR_ACT_D_SUB_CHAR3 = MCMeta.createStringMeta("STK_XFR_ACT_D_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta ARR_PR_SUB_CHAR1 = MCMeta.createStringMeta("ARR_PR_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta ARR_PR_SUB_CHAR2 = MCMeta.createStringMeta("ARR_PR_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta ARR_PR_SUB_CHAR3 = MCMeta.createStringMeta("ARR_PR_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta ARR_SCHD_SUB_CHAR1 = MCMeta.createStringMeta("ARR_SCHD_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta ARR_SCHD_SUB_CHAR2 = MCMeta.createStringMeta("ARR_SCHD_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta ARR_SCHD_SUB_CHAR3 = MCMeta.createStringMeta("ARR_SCHD_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta ARR_ACT_SUB_CHAR1 = MCMeta.createStringMeta("ARR_ACT_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta ARR_ACT_SUB_CHAR2 = MCMeta.createStringMeta("ARR_ACT_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta ARR_ACT_SUB_CHAR3 = MCMeta.createStringMeta("ARR_ACT_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta SHIP_PR_SUB_CHAR1 = MCMeta.createStringMeta("SHIP_PR_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta SHIP_PR_SUB_CHAR2 = MCMeta.createStringMeta("SHIP_PR_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta SHIP_PR_SUB_CHAR3 = MCMeta.createStringMeta("SHIP_PR_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta SHIP_SCHD_SUB_CHAR1 = MCMeta.createStringMeta("SHIP_SCHD_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta SHIP_SCHD_SUB_CHAR2 = MCMeta.createStringMeta("SHIP_SCHD_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta SHIP_SCHD_SUB_CHAR3 = MCMeta.createStringMeta("SHIP_SCHD_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta SHIP_ALLOC_STS_SUB_CHAR1 = MCMeta.createStringMeta("SHIP_ALLOC_STS_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta SHIP_ALLOC_STS_SUB_CHAR2 = MCMeta.createStringMeta("SHIP_ALLOC_STS_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta SHIP_ALLOC_STS_SUB_CHAR3 = MCMeta.createStringMeta("SHIP_ALLOC_STS_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta SHIP_INST_SUB_CHAR1 = MCMeta.createStringMeta("SHIP_INST_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta SHIP_INST_SUB_CHAR2 = MCMeta.createStringMeta("SHIP_INST_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta SHIP_INST_SUB_CHAR3 = MCMeta.createStringMeta("SHIP_INST_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta SHIP_INST_D_SUB_CHAR1 = MCMeta.createStringMeta("SHIP_INST_D_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta SHIP_INST_D_SUB_CHAR2 = MCMeta.createStringMeta("SHIP_INST_D_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta SHIP_INST_D_SUB_CHAR3 = MCMeta.createStringMeta("SHIP_INST_D_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta SHIP_ACT_SUB_CHAR1 = MCMeta.createStringMeta("SHIP_ACT_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta SHIP_ACT_SUB_CHAR2 = MCMeta.createStringMeta("SHIP_ACT_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta SHIP_ACT_SUB_CHAR3 = MCMeta.createStringMeta("SHIP_ACT_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta SHIP_ACT_D_SUB_CHAR1 = MCMeta.createStringMeta("SHIP_ACT_D_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta SHIP_ACT_D_SUB_CHAR2 = MCMeta.createStringMeta("SHIP_ACT_D_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta SHIP_ACT_D_SUB_CHAR3 = MCMeta.createStringMeta("SHIP_ACT_D_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta DLV_SLIP_SUB_CHAR1 = MCMeta.createStringMeta("DLV_SLIP_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta DLV_SLIP_SUB_CHAR2 = MCMeta.createStringMeta("DLV_SLIP_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta DLV_SLIP_SUB_CHAR3 = MCMeta.createStringMeta("DLV_SLIP_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta DLV_SLIP_D_SUB_CHAR1 = MCMeta.createStringMeta("DLV_SLIP_D_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta DLV_SLIP_D_SUB_CHAR2 = MCMeta.createStringMeta("DLV_SLIP_D_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta DLV_SLIP_D_SUB_CHAR3 = MCMeta.createStringMeta("DLV_SLIP_D_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta SHIP_LOT_SUB_CHAR1 = MCMeta.createStringMeta("SHIP_LOT_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta SHIP_LOT_SUB_CHAR2 = MCMeta.createStringMeta("SHIP_LOT_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta SHIP_LOT_SUB_CHAR3 = MCMeta.createStringMeta("SHIP_LOT_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta IV_SUB_CHAR1 = MCMeta.createStringMeta("IV_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta IV_SUB_CHAR2 = MCMeta.createStringMeta("IV_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta IV_SUB_CHAR3 = MCMeta.createStringMeta("IV_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta IV_D_SUB_CHAR1 = MCMeta.createStringMeta("IV_D_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta IV_D_SUB_CHAR2 = MCMeta.createStringMeta("IV_D_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta IV_D_SUB_CHAR3 = MCMeta.createStringMeta("IV_D_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta PL_D_SUB_CHAR1 = MCMeta.createStringMeta("PL_D_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta PL_D_SUB_CHAR2 = MCMeta.createStringMeta("PL_D_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta PL_D_SUB_CHAR3 = MCMeta.createStringMeta("PL_D_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta STKTK_SUB_CHAR1 = MCMeta.createStringMeta("STKTK_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta STKTK_SUB_CHAR2 = MCMeta.createStringMeta("STKTK_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta STKTK_SUB_CHAR3 = MCMeta.createStringMeta("STKTK_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta STKTK_ACT_SUB_CHAR1 = MCMeta.createStringMeta("STKTK_ACT_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta STKTK_ACT_SUB_CHAR2 = MCMeta.createStringMeta("STKTK_ACT_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta STKTK_ACT_SUB_CHAR3 = MCMeta.createStringMeta("STKTK_ACT_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta PRE_STKTK_SUB_CHAR1 = MCMeta.createStringMeta("PRE_STKTK_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta PRE_STKTK_SUB_CHAR2 = MCMeta.createStringMeta("PRE_STKTK_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta PRE_STKTK_SUB_CHAR3 = MCMeta.createStringMeta("PRE_STKTK_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta OP_BATCH_RSLT_SUB_CHAR1 = MCMeta.createStringMeta("OP_BATCH_RSLT_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta OP_BATCH_RSLT_SUB_CHAR2 = MCMeta.createStringMeta("OP_BATCH_RSLT_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta OP_BATCH_RSLT_SUB_CHAR3 = MCMeta.createStringMeta("OP_BATCH_RSLT_SUB_CHAR3", "", 20);

	/**
	 * 梱包番号.<p>
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
	public static final MCMeta CNTNR_NO = MCMeta.createNumberMeta("CNTNR_NO", "", 3, 0);

	/**
	 * 帳票備考.<p>
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
	public static final MCMeta PF_HDR_RPT_RMRKS = MCMeta.createStringMeta("PF_HDR_RPT_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta PF_HDR_INTR_RMRKS = MCMeta.createStringMeta("PF_HDR_INTR_RMRKS", "", 100);

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
	 */
	public static final MCMeta PF_HDR_SUB_CHAR1 = MCMeta.createStringMeta("PF_HDR_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta PF_HDR_SUB_CHAR2 = MCMeta.createStringMeta("PF_HDR_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta PF_HDR_SUB_CHAR3 = MCMeta.createStringMeta("PF_HDR_SUB_CHAR3", "", 20);

	/**
	 * 帳票備考.<p>
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
	public static final MCMeta PF_FIX_RPT_RMRKS = MCMeta.createStringMeta("PF_FIX_RPT_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta PF_FIX_INTR_RMRKS = MCMeta.createStringMeta("PF_FIX_INTR_RMRKS", "", 100);

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
	 */
	public static final MCMeta PF_FIX_SUB_CHAR1 = MCMeta.createStringMeta("PF_FIX_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta PF_FIX_SUB_CHAR2 = MCMeta.createStringMeta("PF_FIX_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta PF_FIX_SUB_CHAR3 = MCMeta.createStringMeta("PF_FIX_SUB_CHAR3", "", 20);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta PF_BAL_INTR_RMRKS = MCMeta.createStringMeta("PF_BAL_INTR_RMRKS", "", 100);

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
	 */
	public static final MCMeta PF_BAL_SUB_CHAR1 = MCMeta.createStringMeta("PF_BAL_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta PF_BAL_SUB_CHAR2 = MCMeta.createStringMeta("PF_BAL_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta PF_BAL_SUB_CHAR3 = MCMeta.createStringMeta("PF_BAL_SUB_CHAR3", "", 20);

	/**
	 * 購買内示明細区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PF_DTL_TYP = MCMeta.createStringMeta("PF_DTL_TYP", "", 1);

	/**
	 * 購買内示明細区分名.<p>
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
	 */
	public static final MCMeta PF_DTL_TYP_NM = MCMeta.createStringMeta("PF_DTL_TYP_NM", "");

	/**
	 * 分割連番.<p>
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
	public static final MCMeta DIV_SEQ = MCMeta.createNumberMeta("DIV_SEQ", "", 3, 0);

	/**
	 * 検査種類区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta INSP_TYP = MCMeta.createStringMeta("INSP_TYP", "", 1);

	/**
	 * 検査種類区分名.<p>
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
	public static final MCMeta INSP_TYP_NM = MCMeta.createStringMeta("INSP_TYP_NM", "");

	/**
	 * 検査回数.<p>
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
	public static final MCMeta INSP_FREQ = MCMeta.createNumberMeta("INSP_FREQ", "", 9, 0);

	/**
	 * 検査予定状況区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta INSP_STS_TYP = MCMeta.createStringMeta("INSP_STS_TYP", "", 1);

	/**
	 * 検査予定状況区分名.<p>
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
	public static final MCMeta INSP_STS_TYP_NM = MCMeta.createStringMeta("INSP_STS_TYP_NM", "");

	/**
	 * 検査連絡備考.<p>
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
	public static final MCMeta INSP_CNT_RMRKS = MCMeta.createStringMeta("INSP_CNT_RMRKS", "", 100);

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
	 */
	public static final MCMeta INSP_SCHD_SUB_CHAR1 = MCMeta.createStringMeta("INSP_SCHD_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta INSP_SCHD_SUB_CHAR2 = MCMeta.createStringMeta("INSP_SCHD_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta INSP_SCHD_SUB_CHAR3 = MCMeta.createStringMeta("INSP_SCHD_SUB_CHAR3", "", 20);

	/**
	 * 検査承認状況区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta INSP_APRV_STS_TYP = MCMeta.createStringMeta("INSP_APRV_STS_TYP", "", 1);

	/**
	 * 検査承認状況区分名.<p>
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
	public static final MCMeta INSP_APRV_STS_TYP_NM = MCMeta.createStringMeta("INSP_APRV_STS_TYP_NM", "");

	/**
	 * 承認理由.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta INSP_INST_APRV_RSN = MCMeta.createStringMeta("INSP_INST_APRV_RSN", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta INSP_INST_INTR_RMRKS = MCMeta.createStringMeta("INSP_INST_INTR_RMRKS", "", 100);

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
	 */
	public static final MCMeta INSP_INST_SUB_CHAR1 = MCMeta.createStringMeta("INSP_INST_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta INSP_INST_SUB_CHAR2 = MCMeta.createStringMeta("INSP_INST_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta INSP_INST_SUB_CHAR3 = MCMeta.createStringMeta("INSP_INST_SUB_CHAR3", "", 20);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta INSP_ACT_INTR_RMRKS = MCMeta.createStringMeta("INSP_ACT_INTR_RMRKS", "", 100);

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
	 */
	public static final MCMeta INSP_ACT_SUB_CHAR1 = MCMeta.createStringMeta("INSP_ACT_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta INSP_ACT_SUB_CHAR2 = MCMeta.createStringMeta("INSP_ACT_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta INSP_ACT_SUB_CHAR3 = MCMeta.createStringMeta("INSP_ACT_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta INSP_STT_D_SUB_CHAR1 = MCMeta.createStringMeta("INSP_STT_D_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta INSP_STT_D_SUB_CHAR2 = MCMeta.createStringMeta("INSP_STT_D_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta INSP_STT_D_SUB_CHAR3 = MCMeta.createStringMeta("INSP_STT_D_SUB_CHAR3", "", 20);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta INSP_ACT_D_INTR_RMRKS = MCMeta.createStringMeta("INSP_ACT_D_INTR_RMRKS", "", 100);

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
	 */
	public static final MCMeta INSP_ACT_D_SUB_CHAR1 = MCMeta.createStringMeta("INSP_ACT_D_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta INSP_ACT_D_SUB_CHAR2 = MCMeta.createStringMeta("INSP_ACT_D_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta INSP_ACT_D_SUB_CHAR3 = MCMeta.createStringMeta("INSP_ACT_D_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta INSP_JUDG_D_SUB_CHAR1 = MCMeta.createStringMeta("INSP_JUDG_D_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta INSP_JUDG_D_SUB_CHAR2 = MCMeta.createStringMeta("INSP_JUDG_D_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta INSP_JUDG_D_SUB_CHAR3 = MCMeta.createStringMeta("INSP_JUDG_D_SUB_CHAR3", "", 20);

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
	public static final MCMeta INSP_SMPL_ACT_TRD_RMRKS = MCMeta.createStringMeta("INSP_SMPL_ACT_TRD_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta INSP_SMPL_ACT_INTR_RMRKS = MCMeta.createStringMeta("INSP_SMPL_ACT_INTR_RMRKS", "", 100);

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
	 */
	public static final MCMeta INSP_SMPL_ACT_SUB_CHAR1 = MCMeta.createStringMeta("INSP_SMPL_ACT_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta INSP_SMPL_ACT_SUB_CHAR2 = MCMeta.createStringMeta("INSP_SMPL_ACT_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta INSP_SMPL_ACT_SUB_CHAR3 = MCMeta.createStringMeta("INSP_SMPL_ACT_SUB_CHAR3", "", 20);

	/**
	 * ロット備考.<p>
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
	public static final MCMeta LOT_RMRKS = MCMeta.createStringMeta("LOT_RMRKS", "", 100);

	/**
	 * ロット予備（文字列）１.<p>
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
	public static final MCMeta LOT_SUB_CHAR1 = MCMeta.createStringMeta("LOT_SUB_CHAR1", "", 1000);

	/**
	 * ロット予備（文字列）２.<p>
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
	public static final MCMeta LOT_SUB_CHAR2 = MCMeta.createStringMeta("LOT_SUB_CHAR2", "", 1000);

	/**
	 * ロット予備（文字列）３.<p>
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
	public static final MCMeta LOT_SUB_CHAR3 = MCMeta.createStringMeta("LOT_SUB_CHAR3", "", 1000);

	/**
	 * ロット予備（文字列）４.<p>
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
	public static final MCMeta LOT_SUB_CHAR4 = MCMeta.createStringMeta("LOT_SUB_CHAR4", "", 1000);

	/**
	 * ロット予備（文字列）５.<p>
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
	public static final MCMeta LOT_SUB_CHAR5 = MCMeta.createStringMeta("LOT_SUB_CHAR5", "", 1000);

	/**
	 * ロット予備（数値）１.<p>
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
	public static final MCMeta LOT_SUB_NUM1 = MCMeta.createNumberMeta("LOT_SUB_NUM1", "", 21, 8);

	/**
	 * ロット予備（数値）２.<p>
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
	public static final MCMeta LOT_SUB_NUM2 = MCMeta.createNumberMeta("LOT_SUB_NUM2", "", 21, 8);

	/**
	 * ロット予備（数値）３.<p>
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
	public static final MCMeta LOT_SUB_NUM3 = MCMeta.createNumberMeta("LOT_SUB_NUM3", "", 21, 8);

	/**
	 * ロット予備（数値）４.<p>
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
	public static final MCMeta LOT_SUB_NUM4 = MCMeta.createNumberMeta("LOT_SUB_NUM4", "", 21, 8);

	/**
	 * ロット予備（数値）５.<p>
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
	public static final MCMeta LOT_SUB_NUM5 = MCMeta.createNumberMeta("LOT_SUB_NUM5", "", 21, 8);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta STD_INSP_INST_INTR_RMRKS = MCMeta.createStringMeta("STD_INSP_INST_INTR_RMRKS", "", 100);

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
	 */
	public static final MCMeta STD_INSP_INST_SUB_CHAR1 = MCMeta.createStringMeta("STD_INSP_INST_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta STD_INSP_INST_SUB_CHAR2 = MCMeta.createStringMeta("STD_INSP_INST_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta STD_INSP_INST_SUB_CHAR3 = MCMeta.createStringMeta("STD_INSP_INST_SUB_CHAR3", "", 20);

	/**
	 * 定性検査値.<p>
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
	public static final MCMeta QL_INSP_VAL = MCMeta.createStringMeta("QL_INSP_VAL", "", 50);

	/**
	 * 実績内部備考.<p>
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
	public static final MCMeta STD_INSP_ACT_INTR_RMRKS = MCMeta.createStringMeta("STD_INSP_ACT_INTR_RMRKS", "", 100);

	/**
	 * 確認内部備考.<p>
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
	public static final MCMeta STD_INSP_CNF_INTR_RMRKS = MCMeta.createStringMeta("STD_INSP_CNF_INTR_RMRKS", "", 100);

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
	 */
	public static final MCMeta STD_INSP_ACT_SUB_CHAR1 = MCMeta.createStringMeta("STD_INSP_ACT_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta STD_INSP_ACT_SUB_CHAR2 = MCMeta.createStringMeta("STD_INSP_ACT_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta STD_INSP_ACT_SUB_CHAR3 = MCMeta.createStringMeta("STD_INSP_ACT_SUB_CHAR3", "", 20);

	/**
	 * 工場出荷承認状況区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PLNT_APRV_STS_TYP = MCMeta.createStringMeta("PLNT_APRV_STS_TYP", "", 1);

	/**
	 * 工場出荷承認状況区分名.<p>
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
	public static final MCMeta PLNT_APRV_STS_TYP_NM = MCMeta.createStringMeta("PLNT_APRV_STS_TYP_NM", "");

	/**
	 * 承認理由.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta PLNT_APRV_RSN = MCMeta.createStringMeta("PLNT_APRV_RSN", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta PLNT_APRV_INTR_RMRKS = MCMeta.createStringMeta("PLNT_APRV_INTR_RMRKS", "", 100);

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
	 */
	public static final MCMeta PLNT_APRV_SUB_CHAR1 = MCMeta.createStringMeta("PLNT_APRV_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta PLNT_APRV_SUB_CHAR2 = MCMeta.createStringMeta("PLNT_APRV_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta PLNT_APRV_SUB_CHAR3 = MCMeta.createStringMeta("PLNT_APRV_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta PLNT_APRV_D_SUB_CHAR1 = MCMeta.createStringMeta("PLNT_APRV_D_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta PLNT_APRV_D_SUB_CHAR2 = MCMeta.createStringMeta("PLNT_APRV_D_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta PLNT_APRV_D_SUB_CHAR3 = MCMeta.createStringMeta("PLNT_APRV_D_SUB_CHAR3", "", 20);

	/**
	 * 市場出荷判定状況区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta MRKT_JUDG_STS_TYP = MCMeta.createStringMeta("MRKT_JUDG_STS_TYP", "", 1);

	/**
	 * 市場出荷判定状況区分名.<p>
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
	public static final MCMeta MRKT_JUDG_STS_TYP_NM = MCMeta.createStringMeta("MRKT_JUDG_STS_TYP_NM", "");

	/**
	 * 製造所出荷承認結果区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta MFG_SO_APRV_TYP = MCMeta.createStringMeta("MFG_SO_APRV_TYP", "", 1);

	/**
	 * 製造所出荷承認結果区分名.<p>
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
	 */
	public static final MCMeta MFG_SO_APRV_TYP_NM = MCMeta.createStringMeta("MFG_SO_APRV_TYP_NM", "");

	/**
	 * 品質管理結果区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta QUALITY_MNG_TYP = MCMeta.createStringMeta("QUALITY_MNG_TYP", "", 1);

	/**
	 * 品質管理結果区分名.<p>
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
	 */
	public static final MCMeta QUALITY_MNG_TYP_NM = MCMeta.createStringMeta("QUALITY_MNG_TYP_NM", "");

	/**
	 * 製造管理結果区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta MFG_MNG_TYP = MCMeta.createStringMeta("MFG_MNG_TYP", "", 1);

	/**
	 * 製造管理結果区分名.<p>
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
	 */
	public static final MCMeta MFG_MNG_TYP_NM = MCMeta.createStringMeta("MFG_MNG_TYP_NM", "");

	/**
	 * 逸脱区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta DEVIANT_TYP = MCMeta.createStringMeta("DEVIANT_TYP", "", 1);

	/**
	 * 逸脱区分名.<p>
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
	 */
	public static final MCMeta DEVIANT_TYP_NM = MCMeta.createStringMeta("DEVIANT_TYP_NM", "");

	/**
	 * 逸脱措置区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta DEVIANT_MSR_TYP = MCMeta.createStringMeta("DEVIANT_MSR_TYP", "", 1);

	/**
	 * 逸脱措置区分名.<p>
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
	 */
	public static final MCMeta DEVIANT_MSR_TYP_NM = MCMeta.createStringMeta("DEVIANT_MSR_TYP_NM", "");

	/**
	 * 製品品質情報区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PROD_ITM_INFO_TYP = MCMeta.createStringMeta("PROD_ITM_INFO_TYP", "", 1);

	/**
	 * 製品品質情報区分名.<p>
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
	 */
	public static final MCMeta PROD_ITM_INFO_TYP_NM = MCMeta.createStringMeta("PROD_ITM_INFO_TYP_NM", "");

	/**
	 * 原材料品質情報区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CHD_ITM_INFO_TYP = MCMeta.createStringMeta("CHD_ITM_INFO_TYP", "", 1);

	/**
	 * 原材料品質情報区分名.<p>
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
	 */
	public static final MCMeta CHD_ITM_INFO_TYP_NM = MCMeta.createStringMeta("CHD_ITM_INFO_TYP_NM", "");

	/**
	 * 判定理由.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta MRKT_JUDG_RSN = MCMeta.createStringMeta("MRKT_JUDG_RSN", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta MRKT_JUDG_INTR_RMRKS = MCMeta.createStringMeta("MRKT_JUDG_INTR_RMRKS", "", 100);

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
	 */
	public static final MCMeta MRKT_JUDG_SUB_CHAR1 = MCMeta.createStringMeta("MRKT_JUDG_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta MRKT_JUDG_SUB_CHAR2 = MCMeta.createStringMeta("MRKT_JUDG_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta MRKT_JUDG_SUB_CHAR3 = MCMeta.createStringMeta("MRKT_JUDG_SUB_CHAR3", "", 20);

	/**
	 * 市場出荷判定作成元区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta MRKT_JUDG_SRC_TYP = MCMeta.createStringMeta("MRKT_JUDG_SRC_TYP", "", 1);

	/**
	 * 市場出荷判定作成元区分名.<p>
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
	public static final MCMeta MRKT_JUDG_SRC_TYP_NM = MCMeta.createStringMeta("MRKT_JUDG_SRC_TYP_NM", "");

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
	 */
	public static final MCMeta MRKT_JUDG_D_SUB_CHAR1 = MCMeta.createStringMeta("MRKT_JUDG_D_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta MRKT_JUDG_D_SUB_CHAR2 = MCMeta.createStringMeta("MRKT_JUDG_D_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta MRKT_JUDG_D_SUB_CHAR3 = MCMeta.createStringMeta("MRKT_JUDG_D_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta LOT_TRACE_GR_SUB_CHAR1 = MCMeta.createStringMeta("LOT_TRACE_GR_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta LOT_TRACE_GR_SUB_CHAR2 = MCMeta.createStringMeta("LOT_TRACE_GR_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta LOT_TRACE_GR_SUB_CHAR3 = MCMeta.createStringMeta("LOT_TRACE_GR_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta LOT_TRACE_GI_SUB_CHAR1 = MCMeta.createStringMeta("LOT_TRACE_GI_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta LOT_TRACE_GI_SUB_CHAR2 = MCMeta.createStringMeta("LOT_TRACE_GI_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta LOT_TRACE_GI_SUB_CHAR3 = MCMeta.createStringMeta("LOT_TRACE_GI_SUB_CHAR3", "", 20);

	/**
	 * 規格検査結果区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta STD_INSP_RSLT_TYP = MCMeta.createStringMeta("STD_INSP_RSLT_TYP", "", 1);

	/**
	 * 規格検査結果区分名.<p>
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
	public static final MCMeta STD_INSP_RSLT_TYP_NM = MCMeta.createStringMeta("STD_INSP_RSLT_TYP_NM", "");

	/**
	 * 検査判定結果区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta INSP_JUDG_RSLT_TYP = MCMeta.createStringMeta("INSP_JUDG_RSLT_TYP", "", 1);

	/**
	 * 検査判定結果区分名.<p>
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
	public static final MCMeta INSP_JUDG_RSLT_TYP_NM = MCMeta.createStringMeta("INSP_JUDG_RSLT_TYP_NM", "");

	/**
	 * 判定理由.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta INSP_JUDG_RSN = MCMeta.createStringMeta("INSP_JUDG_RSN", "", 100);

	/**
	 * 予定実績区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SCHD_ACT_TYP = MCMeta.createStringMeta("SCHD_ACT_TYP", "", 1);

	/**
	 * 予定実績区分名.<p>
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
	public static final MCMeta SCHD_ACT_TYP_NM = MCMeta.createStringMeta("SCHD_ACT_TYP_NM", "");

	/**
	 * 構成品検査区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta COMP_ITM_INSP_TYP = MCMeta.createStringMeta("COMP_ITM_INSP_TYP", "", 1);

	/**
	 * 構成品検査区分名.<p>
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
	public static final MCMeta COMP_ITM_INSP_TYP_NM = MCMeta.createStringMeta("COMP_ITM_INSP_TYP_NM", "");

	/**
	 * 構成品良品区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta COMP_ITM_QUALITY_TYP = MCMeta.createStringMeta("COMP_ITM_QUALITY_TYP", "", 1);

	/**
	 * 構成品良品区分名.<p>
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
	public static final MCMeta COMP_ITM_QUALITY_TYP_NM = MCMeta.createStringMeta("COMP_ITM_QUALITY_TYP_NM", "");

	/**
	 * 構成品製造承認区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta COMP_ITM_MFG_APRV_TYP = MCMeta.createStringMeta("COMP_ITM_MFG_APRV_TYP", "", 1);

	/**
	 * 構成品製造承認区分名.<p>
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
	public static final MCMeta COMP_ITM_MFG_APRV_TYP_NM = MCMeta.createStringMeta("COMP_ITM_MFG_APRV_TYP_NM", "");

	/**
	 * 購買帳票発行区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PURC_PRNT_TYP = MCMeta.createStringMeta("PURC_PRNT_TYP", "", 1);

	/**
	 * 購買帳票発行区分名.<p>
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
	public static final MCMeta PURC_PRNT_TYP_NM = MCMeta.createStringMeta("PURC_PRNT_TYP_NM", "");

	/**
	 * ＭＥＳＩＤ.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>3</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta MES_ID = MCMeta.createStringMeta("MES_ID", "", 3);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta SIM_MRP_INTR_RMRKS = MCMeta.createStringMeta("SIM_MRP_INTR_RMRKS", "", 100);

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
	 */
	public static final MCMeta SIM_MRP_SUB_CHAR1 = MCMeta.createStringMeta("SIM_MRP_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta SIM_MRP_SUB_CHAR2 = MCMeta.createStringMeta("SIM_MRP_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta SIM_MRP_SUB_CHAR3 = MCMeta.createStringMeta("SIM_MRP_SUB_CHAR3", "", 20);

	/**
	 * .<p>
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
	public static final MCMeta LOG_TIME = MCMeta.createStringMeta("LOG_TIME", "", 15);

	/**
	 * 債権更新区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta AR_OPE_TYP = MCMeta.createStringMeta("AR_OPE_TYP", "", 1);

	/**
	 * 債権更新区分名.<p>
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
	public static final MCMeta AR_OPE_TYP_NM = MCMeta.createStringMeta("AR_OPE_TYP_NM", "");

	/**
	 * 請求締状況区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BILL_CL_STS_TYP = MCMeta.createStringMeta("BILL_CL_STS_TYP", "", 1);

	/**
	 * 請求締状況区分名.<p>
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
	public static final MCMeta BILL_CL_STS_TYP_NM = MCMeta.createStringMeta("BILL_CL_STS_TYP_NM", "");

	/**
	 * 請求税区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BILL_TAX_CALC_TYP = MCMeta.createStringMeta("BILL_TAX_CALC_TYP", "", 1);

	/**
	 * 請求税区分名.<p>
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
	public static final MCMeta BILL_TAX_CALC_TYP_NM = MCMeta.createStringMeta("BILL_TAX_CALC_TYP_NM", "");

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
	 */
	public static final MCMeta BILL_SUB_CHAR1 = MCMeta.createStringMeta("BILL_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta BILL_SUB_CHAR2 = MCMeta.createStringMeta("BILL_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta BILL_SUB_CHAR3 = MCMeta.createStringMeta("BILL_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta BILL_ACST_SUB_CHAR1 = MCMeta.createStringMeta("BILL_ACST_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta BILL_ACST_SUB_CHAR2 = MCMeta.createStringMeta("BILL_ACST_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta BILL_ACST_SUB_CHAR3 = MCMeta.createStringMeta("BILL_ACST_SUB_CHAR3", "", 20);

	/**
	 * 請求明細区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BILL_D_TYP = MCMeta.createStringMeta("BILL_D_TYP", "", 1);

	/**
	 * 請求明細区分名.<p>
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
	public static final MCMeta BILL_D_TYP_NM = MCMeta.createStringMeta("BILL_D_TYP_NM", "");

	/**
	 * 請求方式区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta BILL_MTD_TYP = MCMeta.createStringMeta("BILL_MTD_TYP", "", 1);

	/**
	 * 請求方式区分名.<p>
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
	public static final MCMeta BILL_MTD_TYP_NM = MCMeta.createStringMeta("BILL_MTD_TYP_NM", "");

	/**
	 * 請求書明細備考.<p>
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
	public static final MCMeta BILL_D_RMRKS = MCMeta.createStringMeta("BILL_D_RMRKS", "", 100);

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
	 */
	public static final MCMeta BILL_D_SUB_CHAR1 = MCMeta.createStringMeta("BILL_D_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta BILL_D_SUB_CHAR2 = MCMeta.createStringMeta("BILL_D_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta BILL_D_SUB_CHAR3 = MCMeta.createStringMeta("BILL_D_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta RCV_SCHD_SUB_CHAR1 = MCMeta.createStringMeta("RCV_SCHD_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta RCV_SCHD_SUB_CHAR2 = MCMeta.createStringMeta("RCV_SCHD_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta RCV_SCHD_SUB_CHAR3 = MCMeta.createStringMeta("RCV_SCHD_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta RCV_APPL_ACT_SUB_CHAR1 = MCMeta.createStringMeta("RCV_APPL_ACT_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta RCV_APPL_ACT_SUB_CHAR2 = MCMeta.createStringMeta("RCV_APPL_ACT_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta RCV_APPL_ACT_SUB_CHAR3 = MCMeta.createStringMeta("RCV_APPL_ACT_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta AR_APPL_SCHD_SUB_CHAR1 = MCMeta.createStringMeta("AR_APPL_SCHD_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta AR_APPL_SCHD_SUB_CHAR2 = MCMeta.createStringMeta("AR_APPL_SCHD_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta AR_APPL_SCHD_SUB_CHAR3 = MCMeta.createStringMeta("AR_APPL_SCHD_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta AR_APPL_ACT_SUB_CHAR1 = MCMeta.createStringMeta("AR_APPL_ACT_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta AR_APPL_ACT_SUB_CHAR2 = MCMeta.createStringMeta("AR_APPL_ACT_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta AR_APPL_ACT_SUB_CHAR3 = MCMeta.createStringMeta("AR_APPL_ACT_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta MLY_AR_BAL_SUB_CHAR1 = MCMeta.createStringMeta("MLY_AR_BAL_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta MLY_AR_BAL_SUB_CHAR2 = MCMeta.createStringMeta("MLY_AR_BAL_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta MLY_AR_BAL_SUB_CHAR3 = MCMeta.createStringMeta("MLY_AR_BAL_SUB_CHAR3", "", 20);

	/**
	 * 債権伝票帳票区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta AR_SLIP_PRNT_TYP = MCMeta.createStringMeta("AR_SLIP_PRNT_TYP", "", 1);

	/**
	 * 債権伝票帳票区分名.<p>
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
	public static final MCMeta AR_SLIP_PRNT_TYP_NM = MCMeta.createStringMeta("AR_SLIP_PRNT_TYP_NM", "");

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
	 */
	public static final MCMeta RCV_ACT_SUB_CHAR1 = MCMeta.createStringMeta("RCV_ACT_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta RCV_ACT_SUB_CHAR2 = MCMeta.createStringMeta("RCV_ACT_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta RCV_ACT_SUB_CHAR3 = MCMeta.createStringMeta("RCV_ACT_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta RCV_ACT_D_SUB_CHAR1 = MCMeta.createStringMeta("RCV_ACT_D_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta RCV_ACT_D_SUB_CHAR2 = MCMeta.createStringMeta("RCV_ACT_D_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta RCV_ACT_D_SUB_CHAR3 = MCMeta.createStringMeta("RCV_ACT_D_SUB_CHAR3", "", 20);

	/**
	 * 入金情報区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta RCV_DAT_TYP = MCMeta.createStringMeta("RCV_DAT_TYP", "", 1);

	/**
	 * 入金情報区分名.<p>
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
	public static final MCMeta RCV_DAT_TYP_NM = MCMeta.createStringMeta("RCV_DAT_TYP_NM", "");

	/**
	 * 入金備考.<p>
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
	public static final MCMeta RCV_RMRKS = MCMeta.createStringMeta("RCV_RMRKS", "", 100);

	/**
	 * 自動消込状況区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta AUTO_APPL_STS_TYP = MCMeta.createStringMeta("AUTO_APPL_STS_TYP", "", 1);

	/**
	 * 自動消込状況区分名.<p>
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
	public static final MCMeta AUTO_APPL_STS_TYP_NM = MCMeta.createStringMeta("AUTO_APPL_STS_TYP_NM", "");

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
	 */
	public static final MCMeta RCV_SUB_CHAR1 = MCMeta.createStringMeta("RCV_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta RCV_SUB_CHAR2 = MCMeta.createStringMeta("RCV_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta RCV_SUB_CHAR3 = MCMeta.createStringMeta("RCV_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta NOTE_SUB_CHAR1 = MCMeta.createStringMeta("NOTE_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta NOTE_SUB_CHAR2 = MCMeta.createStringMeta("NOTE_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta NOTE_SUB_CHAR3 = MCMeta.createStringMeta("NOTE_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta CRED_SUB_CHAR1 = MCMeta.createStringMeta("CRED_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta CRED_SUB_CHAR2 = MCMeta.createStringMeta("CRED_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta CRED_SUB_CHAR3 = MCMeta.createStringMeta("CRED_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta BILL_D_APPL_BAL_SUB_CHAR1 = MCMeta.createStringMeta("BILL_D_APPL_BAL_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta BILL_D_APPL_BAL_SUB_CHAR2 = MCMeta.createStringMeta("BILL_D_APPL_BAL_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta BILL_D_APPL_BAL_SUB_CHAR3 = MCMeta.createStringMeta("BILL_D_APPL_BAL_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta BILL_D_APPL_ACT_SUB_CHAR1 = MCMeta.createStringMeta("BILL_D_APPL_ACT_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta BILL_D_APPL_ACT_SUB_CHAR2 = MCMeta.createStringMeta("BILL_D_APPL_ACT_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta BILL_D_APPL_ACT_SUB_CHAR3 = MCMeta.createStringMeta("BILL_D_APPL_ACT_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta BILL_D_SW_ACT_SUB_CHAR1 = MCMeta.createStringMeta("BILL_D_SW_ACT_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta BILL_D_SW_ACT_SUB_CHAR2 = MCMeta.createStringMeta("BILL_D_SW_ACT_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta BILL_D_SW_ACT_SUB_CHAR3 = MCMeta.createStringMeta("BILL_D_SW_ACT_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta AR_XRATE_REV_HIST_SUB_CHAR1 = MCMeta.createStringMeta("AR_XRATE_REV_HIST_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta AR_XRATE_REV_HIST_SUB_CHAR2 = MCMeta.createStringMeta("AR_XRATE_REV_HIST_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta AR_XRATE_REV_HIST_SUB_CHAR3 = MCMeta.createStringMeta("AR_XRATE_REV_HIST_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta AR_EXC_GAIN_LOSS_SUB_CHAR1 = MCMeta.createStringMeta("AR_EXC_GAIN_LOSS_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta AR_EXC_GAIN_LOSS_SUB_CHAR2 = MCMeta.createStringMeta("AR_EXC_GAIN_LOSS_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta AR_EXC_GAIN_LOSS_SUB_CHAR3 = MCMeta.createStringMeta("AR_EXC_GAIN_LOSS_SUB_CHAR3", "", 20);

	/**
	 * 売上予定作成元区分.<p>
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
	public static final MCMeta SLS_SCHD_SRC_TYP = MCMeta.createStringMeta("SLS_SCHD_SRC_TYP", "", 2);

	/**
	 * 売上予定作成元区分名.<p>
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
	public static final MCMeta SLS_SCHD_SRC_TYP_NM = MCMeta.createStringMeta("SLS_SCHD_SRC_TYP_NM", "");

	/**
	 * 版切替状況区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta VER_CHG_STS_TYP = MCMeta.createStringMeta("VER_CHG_STS_TYP", "", 1);

	/**
	 * 版切替状況区分名.<p>
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
	 */
	public static final MCMeta VER_CHG_STS_TYP_NM = MCMeta.createStringMeta("VER_CHG_STS_TYP_NM", "");

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
	 */
	public static final MCMeta VER_CHG_SUB_CHAR1 = MCMeta.createStringMeta("VER_CHG_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta VER_CHG_SUB_CHAR2 = MCMeta.createStringMeta("VER_CHG_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta VER_CHG_SUB_CHAR3 = MCMeta.createStringMeta("VER_CHG_SUB_CHAR3", "", 20);

	/**
	 * 前受金出荷制御区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ADV_SHIP_CTRL_TYP = MCMeta.createStringMeta("ADV_SHIP_CTRL_TYP", "", 1);

	/**
	 * 前受金出荷制御区分名.<p>
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
	public static final MCMeta ADV_SHIP_CTRL_TYP_NM = MCMeta.createStringMeta("ADV_SHIP_CTRL_TYP_NM", "");

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
	 */
	public static final MCMeta COMP_SPEC_DESC_SUB_CHAR1 = MCMeta.createStringMeta("COMP_SPEC_DESC_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta COMP_SPEC_DESC_SUB_CHAR2 = MCMeta.createStringMeta("COMP_SPEC_DESC_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta COMP_SPEC_DESC_SUB_CHAR3 = MCMeta.createStringMeta("COMP_SPEC_DESC_SUB_CHAR3", "", 20);

	/**
	 * 得意先納入指示明細備考.<p>
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
	public static final MCMeta CST_DLV_INST_D_RMRKS = MCMeta.createStringMeta("CST_DLV_INST_D_RMRKS", "", 100);

	/**
	 * 得意先納入指示備考.<p>
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
	public static final MCMeta CST_DLV_INST_RMRKS = MCMeta.createStringMeta("CST_DLV_INST_RMRKS", "", 100);

	/**
	 * 得意先注文明細備考.<p>
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
	public static final MCMeta CST_PO_D_RMRKS = MCMeta.createStringMeta("CST_PO_D_RMRKS", "", 100);

	/**
	 * 得意先注文備考.<p>
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
	public static final MCMeta CST_PO_RMRKS = MCMeta.createStringMeta("CST_PO_RMRKS", "", 100);

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
	 */
	public static final MCMeta CST_WRK_SUB_CHAR1 = MCMeta.createStringMeta("CST_WRK_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta CST_WRK_SUB_CHAR2 = MCMeta.createStringMeta("CST_WRK_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta CST_WRK_SUB_CHAR3 = MCMeta.createStringMeta("CST_WRK_SUB_CHAR3", "", 20);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta DLV_INST_RCPT_INTR_RMRKS = MCMeta.createStringMeta("DLV_INST_RCPT_INTR_RMRKS", "", 100);

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
	 */
	public static final MCMeta DLV_INST_RCPT_SUB_CHAR1 = MCMeta.createStringMeta("DLV_INST_RCPT_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta DLV_INST_RCPT_SUB_CHAR2 = MCMeta.createStringMeta("DLV_INST_RCPT_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta DLV_INST_RCPT_SUB_CHAR3 = MCMeta.createStringMeta("DLV_INST_RCPT_SUB_CHAR3", "", 20);

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
	 * 品目構成備考.<p>
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
	public static final MCMeta ITM_COMP_RMRKS = MCMeta.createStringMeta("ITM_COMP_RMRKS", "", 100);

	/**
	 * 内示期間区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
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
	 * 内示期間区分名.<p>
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
	 * 内部明細備考.<p>
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
	public static final MCMeta QTN_D_INTR_RMRKS = MCMeta.createStringMeta("QTN_D_INTR_RMRKS", "", 100);

	/**
	 * 見積明細備考.<p>
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
	public static final MCMeta QTN_D_RMRKS = MCMeta.createStringMeta("QTN_D_RMRKS", "", 100);

	/**
	 * 見積明細結果理由備考.<p>
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
	public static final MCMeta QTN_D_RSLT_RSN_RMRKS = MCMeta.createStringMeta("QTN_D_RSLT_RSN_RMRKS", "", 100);

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
	 */
	public static final MCMeta QTN_D_SUB_CHAR1 = MCMeta.createStringMeta("QTN_D_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta QTN_D_SUB_CHAR2 = MCMeta.createStringMeta("QTN_D_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta QTN_D_SUB_CHAR3 = MCMeta.createStringMeta("QTN_D_SUB_CHAR3", "", 20);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta QTN_INTR_RMRKS = MCMeta.createStringMeta("QTN_INTR_RMRKS", "", 100);

	/**
	 * 見積品目構成備考.<p>
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
	public static final MCMeta QTN_ITM_COMP_RMRKS = MCMeta.createStringMeta("QTN_ITM_COMP_RMRKS", "", 100);

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
	 */
	public static final MCMeta QTN_ITM_COMP_SUB_CHAR1 = MCMeta.createStringMeta("QTN_ITM_COMP_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta QTN_ITM_COMP_SUB_CHAR2 = MCMeta.createStringMeta("QTN_ITM_COMP_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta QTN_ITM_COMP_SUB_CHAR3 = MCMeta.createStringMeta("QTN_ITM_COMP_SUB_CHAR3", "", 20);

	/**
	 * 見積備考.<p>
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
	public static final MCMeta QTN_RMRKS = MCMeta.createStringMeta("QTN_RMRKS", "", 100);

	/**
	 * 見積結果理由備考.<p>
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
	public static final MCMeta QTN_RSLT_RSN_RMRKS = MCMeta.createStringMeta("QTN_RSLT_RSN_RMRKS", "", 100);

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
	 */
	public static final MCMeta QTN_SUB_CHAR1 = MCMeta.createStringMeta("QTN_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta QTN_SUB_CHAR2 = MCMeta.createStringMeta("QTN_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta QTN_SUB_CHAR3 = MCMeta.createStringMeta("QTN_SUB_CHAR3", "", 20);

	/**
	 * 見積区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta QTN_TYP = MCMeta.createStringMeta("QTN_TYP", "", 1);

	/**
	 * 見積区分名.<p>
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
	public static final MCMeta QTN_TYP_NM = MCMeta.createStringMeta("QTN_TYP_NM", "");

	/**
	 * 品揃区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SHIP_ASSORT_TYP = MCMeta.createStringMeta("SHIP_ASSORT_TYP", "", 1);

	/**
	 * 品揃区分名.<p>
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
	public static final MCMeta SHIP_ASSORT_TYP_NM = MCMeta.createStringMeta("SHIP_ASSORT_TYP_NM", "");

	/**
	 * 取消備考.<p>
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
	public static final MCMeta SLO_CAN_RMRKS = MCMeta.createStringMeta("SLO_CAN_RMRKS", "", 100);

	/**
	 * 明細取消備考.<p>
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
	public static final MCMeta SLO_D_CAN_RMKRS = MCMeta.createStringMeta("SLO_D_CAN_RMKRS", "", 100);

	/**
	 * 内部明細備考.<p>
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
	public static final MCMeta SLO_D_INTR_RMRKS = MCMeta.createStringMeta("SLO_D_INTR_RMRKS", "", 100);

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
	 */
	public static final MCMeta SLO_D_SUB_CHAR1 = MCMeta.createStringMeta("SLO_D_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta SLO_D_SUB_CHAR2 = MCMeta.createStringMeta("SLO_D_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta SLO_D_SUB_CHAR3 = MCMeta.createStringMeta("SLO_D_SUB_CHAR3", "", 20);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta SLO_INTR_RMRKS = MCMeta.createStringMeta("SLO_INTR_RMRKS", "", 100);

	/**
	 * 受注品目構成備考.<p>
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
	public static final MCMeta SLO_ITM_COMP_RMRKS = MCMeta.createStringMeta("SLO_ITM_COMP_RMRKS", "", 100);

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
	 */
	public static final MCMeta SLO_ITM_COMP_SUB_CHAR1 = MCMeta.createStringMeta("SLO_ITM_COMP_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta SLO_ITM_COMP_SUB_CHAR2 = MCMeta.createStringMeta("SLO_ITM_COMP_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta SLO_ITM_COMP_SUB_CHAR3 = MCMeta.createStringMeta("SLO_ITM_COMP_SUB_CHAR3", "", 20);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta SLO_PRMS_INTR_RMRKS = MCMeta.createStringMeta("SLO_PRMS_INTR_RMRKS", "", 100);

	/**
	 * 回答備考.<p>
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
	public static final MCMeta SLO_PRMS_RMRKS = MCMeta.createStringMeta("SLO_PRMS_RMRKS", "", 100);

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
	 */
	public static final MCMeta SLO_PRMS_SUB_CHAR1 = MCMeta.createStringMeta("SLO_PRMS_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta SLO_PRMS_SUB_CHAR2 = MCMeta.createStringMeta("SLO_PRMS_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta SLO_PRMS_SUB_CHAR3 = MCMeta.createStringMeta("SLO_PRMS_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta SLO_PRMS_H_SUB_CHAR1 = MCMeta.createStringMeta("SLO_PRMS_H_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta SLO_PRMS_H_SUB_CHAR2 = MCMeta.createStringMeta("SLO_PRMS_H_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta SLO_PRMS_H_SUB_CHAR3 = MCMeta.createStringMeta("SLO_PRMS_H_SUB_CHAR3", "", 20);

	/**
	 * 受注取消理由ＣＤ.<p>
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
	 * 受注取消理由名.<p>
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
	 * 受注状況区分.<p>
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
	public static final MCMeta SLO_STS_TYP = MCMeta.createStringMeta("SLO_STS_TYP", "", 3);

	/**
	 * 受注状況区分名.<p>
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
	public static final MCMeta SLO_STS_TYP_NM = MCMeta.createStringMeta("SLO_STS_TYP_NM", "");

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
	 */
	public static final MCMeta SLO_SUB_CHAR1 = MCMeta.createStringMeta("SLO_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta SLO_SUB_CHAR2 = MCMeta.createStringMeta("SLO_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta SLO_SUB_CHAR3 = MCMeta.createStringMeta("SLO_SUB_CHAR3", "", 20);

	/**
	 * 受注区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SLO_TYP = MCMeta.createStringMeta("SLO_TYP", "", 1);

	/**
	 * 受注区分名.<p>
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
	public static final MCMeta SLO_TYP_NM = MCMeta.createStringMeta("SLO_TYP_NM", "");

	/**
	 * 販売予算分類.<p>
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
	public static final MCMeta SLS_BDG_GRP = MCMeta.createStringMeta("SLS_BDG_GRP", "", 100);

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
	 */
	public static final MCMeta SLS_BDG_SUB_CHAR1 = MCMeta.createStringMeta("SLS_BDG_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta SLS_BDG_SUB_CHAR2 = MCMeta.createStringMeta("SLS_BDG_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta SLS_BDG_SUB_CHAR3 = MCMeta.createStringMeta("SLS_BDG_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta SLS_ITM_COMP_SUB_CHAR1 = MCMeta.createStringMeta("SLS_ITM_COMP_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta SLS_ITM_COMP_SUB_CHAR2 = MCMeta.createStringMeta("SLS_ITM_COMP_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta SLS_ITM_COMP_SUB_CHAR3 = MCMeta.createStringMeta("SLS_ITM_COMP_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta SLS_ITM_REF_SUB_CHAR1 = MCMeta.createStringMeta("SLS_ITM_REF_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta SLS_ITM_REF_SUB_CHAR2 = MCMeta.createStringMeta("SLS_ITM_REF_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta SLS_ITM_REF_SUB_CHAR3 = MCMeta.createStringMeta("SLS_ITM_REF_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta SLS_ITM_SPEC_SUB_CHAR1 = MCMeta.createStringMeta("SLS_ITM_SPEC_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta SLS_ITM_SPEC_SUB_CHAR2 = MCMeta.createStringMeta("SLS_ITM_SPEC_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta SLS_ITM_SPEC_SUB_CHAR3 = MCMeta.createStringMeta("SLS_ITM_SPEC_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta SLS_ITM_SUB_CHAR1 = MCMeta.createStringMeta("SLS_ITM_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta SLS_ITM_SUB_CHAR2 = MCMeta.createStringMeta("SLS_ITM_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta SLS_ITM_SUB_CHAR3 = MCMeta.createStringMeta("SLS_ITM_SUB_CHAR3", "", 20);

	/**
	 * 内部明細備考.<p>
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
	public static final MCMeta SLS_RET_SCHD_D_INTR_RMRKS = MCMeta.createStringMeta("SLS_RET_SCHD_D_INTR_RMRKS", "", 100);

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
	 */
	public static final MCMeta SLS_RET_SCHD_D_SUB_CHAR1 = MCMeta.createStringMeta("SLS_RET_SCHD_D_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta SLS_RET_SCHD_D_SUB_CHAR2 = MCMeta.createStringMeta("SLS_RET_SCHD_D_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta SLS_RET_SCHD_D_SUB_CHAR3 = MCMeta.createStringMeta("SLS_RET_SCHD_D_SUB_CHAR3", "", 20);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta SLS_RET_SCHD_INTR_RMRKS = MCMeta.createStringMeta("SLS_RET_SCHD_INTR_RMRKS", "", 100);

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
	 */
	public static final MCMeta SLS_RET_SCHD_SUB_CHAR1 = MCMeta.createStringMeta("SLS_RET_SCHD_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta SLS_RET_SCHD_SUB_CHAR2 = MCMeta.createStringMeta("SLS_RET_SCHD_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta SLS_RET_SCHD_SUB_CHAR3 = MCMeta.createStringMeta("SLS_RET_SCHD_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta SLS_SCHD_SUB_CHAR1 = MCMeta.createStringMeta("SLS_SCHD_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta SLS_SCHD_SUB_CHAR2 = MCMeta.createStringMeta("SLS_SCHD_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta SLS_SCHD_SUB_CHAR3 = MCMeta.createStringMeta("SLS_SCHD_SUB_CHAR3", "", 20);

	/**
	 * 仕様項目備考.<p>
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
	public static final MCMeta SPEC_DESC_RMRKS = MCMeta.createStringMeta("SPEC_DESC_RMRKS", "", 100);

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
	 */
	public static final MCMeta SPEC_DESC_SUB_CHAR1 = MCMeta.createStringMeta("SPEC_DESC_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta SPEC_DESC_SUB_CHAR2 = MCMeta.createStringMeta("SPEC_DESC_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta SPEC_DESC_SUB_CHAR3 = MCMeta.createStringMeta("SPEC_DESC_SUB_CHAR3", "", 20);

	/**
	 * 仕様備考.<p>
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
	public static final MCMeta SPEC_RMRKS = MCMeta.createStringMeta("SPEC_RMRKS", "", 100);

	/**
	 * 活動実績.<p>
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
	public static final MCMeta WRK_ACT_ACT = MCMeta.createStringMeta("WRK_ACT_ACT", "", 100);

	/**
	 * 活動経緯.<p>
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
	public static final MCMeta WRK_ACT_HIST = MCMeta.createStringMeta("WRK_ACT_HIST", "", 100);

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
	 */
	public static final MCMeta WRK_ACT_HIST_SUB_CHAR1 = MCMeta.createStringMeta("WRK_ACT_HIST_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta WRK_ACT_HIST_SUB_CHAR2 = MCMeta.createStringMeta("WRK_ACT_HIST_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta WRK_ACT_HIST_SUB_CHAR3 = MCMeta.createStringMeta("WRK_ACT_HIST_SUB_CHAR3", "", 20);

	/**
	 * 活動予定.<p>
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
	public static final MCMeta WRK_ACT_SCHD = MCMeta.createStringMeta("WRK_ACT_SCHD", "", 100);

	/**
	 * 競合情報.<p>
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
	public static final MCMeta WRK_COMP_INFO = MCMeta.createStringMeta("WRK_COMP_INFO", "", 100);

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
	 */
	public static final MCMeta WRK_COMP_SUB_CHAR1 = MCMeta.createStringMeta("WRK_COMP_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta WRK_COMP_SUB_CHAR2 = MCMeta.createStringMeta("WRK_COMP_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta WRK_COMP_SUB_CHAR3 = MCMeta.createStringMeta("WRK_COMP_SUB_CHAR3", "", 20);

	/**
	 * 案件概要.<p>
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
	public static final MCMeta WRK_DESC = MCMeta.createStringMeta("WRK_DESC", "", 1000);

	/**
	 * 失注理由.<p>
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
	public static final MCMeta WRK_FAIL_RSN = MCMeta.createStringMeta("WRK_FAIL_RSN", "", 100);

	/**
	 * 案件管理ＣＤ.<p>
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
	public static final MCMeta WRK_MNG_CD = MCMeta.createStringMeta("WRK_MNG_CD", "", 10);

	/**
	 * 案件管理名.<p>
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
	public static final MCMeta WRK_MNG_NM = MCMeta.createStringMeta("WRK_MNG_NM", "", 100);

	/**
	 * 案件管理区分.<p>
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
	public static final MCMeta WRK_MNG_TYP = MCMeta.createStringMeta("WRK_MNG_TYP", "", 2);

	/**
	 * 案件管理区分名.<p>
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
	public static final MCMeta WRK_MNG_TYP_NM = MCMeta.createStringMeta("WRK_MNG_TYP_NM", "");

	/**
	 * 案件備考.<p>
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
	public static final MCMeta WRK_RMRKS = MCMeta.createStringMeta("WRK_RMRKS", "", 100);

	/**
	 * 受注理由.<p>
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
	public static final MCMeta WRK_SLO_RSN = MCMeta.createStringMeta("WRK_SLO_RSN", "", 100);

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
	 */
	public static final MCMeta WRK_SUB_CHAR1 = MCMeta.createStringMeta("WRK_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta WRK_SUB_CHAR2 = MCMeta.createStringMeta("WRK_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta WRK_SUB_CHAR3 = MCMeta.createStringMeta("WRK_SUB_CHAR3", "", 20);

	/**
	 * 契約条件.<p>
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
	public static final MCMeta WRK_TERM_COND = MCMeta.createStringMeta("WRK_TERM_COND", "", 100);

	/**
	 * 文字列１.<p>
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
	public static final MCMeta WRK_STR1 = MCMeta.createStringMeta("WRK_STR1", "", 100);

	/**
	 * 文字列２.<p>
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
	public static final MCMeta WRK_STR2 = MCMeta.createStringMeta("WRK_STR2", "", 100);

	/**
	 * 文字列３.<p>
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
	public static final MCMeta WRK_STR3 = MCMeta.createStringMeta("WRK_STR3", "", 100);

	/**
	 * 数値１.<p>
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
	public static final MCMeta WRK_NUM1 = MCMeta.createNumberMeta("WRK_NUM1", "", 21, 8);

	/**
	 * 数値２.<p>
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
	public static final MCMeta WRK_NUM2 = MCMeta.createNumberMeta("WRK_NUM2", "", 21, 8);

	/**
	 * 数値３.<p>
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
	public static final MCMeta WRK_NUM3 = MCMeta.createNumberMeta("WRK_NUM3", "", 21, 8);

	/**
	 * 与信更新区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CRED_UPD_TYP = MCMeta.createStringMeta("CRED_UPD_TYP", "", 1);

	/**
	 * 指図区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta INST_TYP = MCMeta.createStringMeta("INST_TYP", "", 1);

	/**
	 * 指図区分名.<p>
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
	public static final MCMeta INST_TYP_NM = MCMeta.createStringMeta("INST_TYP_NM", "", 10);

	/**
	 * 売上調整区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta SLS_ADJST_TYP = MCMeta.createStringMeta("SLS_ADJST_TYP", "", 1);

	/**
	 * 売上調整区分名.<p>
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
	public static final MCMeta SLS_ADJST_TYP_NM = MCMeta.createStringMeta("SLS_ADJST_TYP_NM", "");

	/**
	 * 仕入調整区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PURC_ADJST_TYP = MCMeta.createStringMeta("PURC_ADJST_TYP", "", 1);

	/**
	 * 仕入調整区分名.<p>
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
	public static final MCMeta PURC_ADJST_TYP_NM = MCMeta.createStringMeta("PURC_ADJST_TYP_NM", "");

	/**
	 * 調整方法区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ADJST_MTD_TYP = MCMeta.createStringMeta("ADJST_MTD_TYP", "", 1);

	/**
	 * 調整方法区分名.<p>
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
	public static final MCMeta ADJST_MTD_TYP_NM = MCMeta.createStringMeta("ADJST_MTD_TYP_NM", "");

	/**
	 * 得意先抽出区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta CST_SLCT_TYP = MCMeta.createStringMeta("CST_SLCT_TYP", "", 1);

	/**
	 * 得意先抽出区分名.<p>
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
	public static final MCMeta CST_SLCT_TYP_NM = MCMeta.createStringMeta("CST_SLCT_TYP_NM", "");

	/**
	 * .<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta DLV_BP_CD = MCMeta.createStringMeta("DLV_BP_CD", "", 20);

	/**
	 * .<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta DLV_BP_NM = MCMeta.createStringMeta("DLV_BP_NM", "", 100);

	/**
	 * .<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta DLV_SLIP_PO_NO = MCMeta.createStringMeta("DLV_SLIP_PO_NO", "", 20);

	/**
	 * .<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>20</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta DLV_SLIP_PO_D_NO = MCMeta.createStringMeta("DLV_SLIP_PO_D_NO", "", 20);

	/**
	 * .<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>40</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta DLV_SLIP_ITM_CD = MCMeta.createStringMeta("DLV_SLIP_ITM_CD", "", 40);

	/**
	 * .<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>100</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta DLV_SLIP_ITM_NM = MCMeta.createStringMeta("DLV_SLIP_ITM_NM", "", 100);

	/**
	 * ＥＩＡＪ納品書用バーコード１.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>26</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta B_EIAJ1 = MCMeta.createStringMeta("B_EIAJ1", "", 26);

	/**
	 * ＥＩＡＪ納品書用バーコード２.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>43</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta B_EIAJ2 = MCMeta.createStringMeta("B_EIAJ2", "", 43);

	/**
	 * ＥＩＡＪ納品書用バーコード３.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>32</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta B_EIAJ3 = MCMeta.createStringMeta("B_EIAJ3", "", 32);

	/**
	 * ＥＩＡＪ納品書用バーコード４.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>43</td>
	 * </tr>
	 * </table>
	 */
	public static final MCMeta B_EIAJ4 = MCMeta.createStringMeta("B_EIAJ4", "", 43);

	/**
	 * 案件処理区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta WRK_OPE_TYP = MCMeta.createStringMeta("WRK_OPE_TYP", "", 1);

	/**
	 * 案件処理区分名.<p>
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
	public static final MCMeta WRK_OPE_TYP_NM = MCMeta.createStringMeta("WRK_OPE_TYP_NM", "");

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
	 */
	public static final MCMeta ARR_MAP_SUB_CHAR1 = MCMeta.createStringMeta("ARR_MAP_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta ARR_MAP_SUB_CHAR2 = MCMeta.createStringMeta("ARR_MAP_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta ARR_MAP_SUB_CHAR3 = MCMeta.createStringMeta("ARR_MAP_SUB_CHAR3", "", 20);

	/**
	 * オーダ展開データ区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta ORD_EXT_DAT_TYP = MCMeta.createStringMeta("ORD_EXT_DAT_TYP", "", 1);

	/**
	 * オーダ展開データ区分名.<p>
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
	public static final MCMeta ORD_EXT_DAT_TYP_NM = MCMeta.createStringMeta("ORD_EXT_DAT_TYP_NM", "");

	/**
	 * ＩＦ投入区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta IF_INPT_TYP = MCMeta.createStringMeta("IF_INPT_TYP", "", 1);

	/**
	 * ＩＦ投入区分名.<p>
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
	public static final MCMeta IF_INPT_TYP_NM = MCMeta.createStringMeta("IF_INPT_TYP_NM", "");

	/**
	 * 内部備考.<p>
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
	public static final MCMeta IF_INTR_RMRKS = MCMeta.createStringMeta("IF_INTR_RMRKS", "", 100);

	/**
	 * 内部明細備考.<p>
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
	public static final MCMeta IF_INTR_D_RMRKS = MCMeta.createStringMeta("IF_INTR_D_RMRKS", "", 100);

	/**
	 * 記録書備考.<p>
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
	public static final MCMeta IF_RPT_RMRKS = MCMeta.createStringMeta("IF_RPT_RMRKS", "", 100);

	/**
	 * 支払通知書明細備考.<p>
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
	public static final MCMeta PAY_NTC_D_PRINT_RMRKS = MCMeta.createStringMeta("PAY_NTC_D_PRINT_RMRKS", "", 100);

	/**
	 * 支払予定明細備考.<p>
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
	public static final MCMeta PAY_SCHD_D_PRINT_RMRKS = MCMeta.createStringMeta("PAY_SCHD_D_PRINT_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta AP_D_INTR_RMRKS = MCMeta.createStringMeta("AP_D_INTR_RMRKS", "", 100);

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
	 */
	public static final MCMeta AP_D_SUB_CHAR1 = MCMeta.createStringMeta("AP_D_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta AP_D_SUB_CHAR2 = MCMeta.createStringMeta("AP_D_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta AP_D_SUB_CHAR3 = MCMeta.createStringMeta("AP_D_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta MLY_AP_BAL_SUB_CHAR1 = MCMeta.createStringMeta("MLY_AP_BAL_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta MLY_AP_BAL_SUB_CHAR2 = MCMeta.createStringMeta("MLY_AP_BAL_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta MLY_AP_BAL_SUB_CHAR3 = MCMeta.createStringMeta("MLY_AP_BAL_SUB_CHAR3", "", 20);

	/**
	 * 支払予定明細備考.<p>
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
	public static final MCMeta PAY_SCHD_D_PRINT_HDR_RMRKS = MCMeta.createStringMeta("PAY_SCHD_D_PRINT_HDR_RMRKS", "", 100);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta PAY_CHK_INTR_RMRKS = MCMeta.createStringMeta("PAY_CHK_INTR_RMRKS", "", 100);

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
	 */
	public static final MCMeta PAY_CHK_SUB_CHAR1 = MCMeta.createStringMeta("PAY_CHK_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta PAY_CHK_SUB_CHAR2 = MCMeta.createStringMeta("PAY_CHK_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta PAY_CHK_SUB_CHAR3 = MCMeta.createStringMeta("PAY_CHK_SUB_CHAR3", "", 20);

	/**
	 * 支払方式区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PAY_MTD_TYP = MCMeta.createStringMeta("PAY_MTD_TYP", "", 1);

	/**
	 * 支払方式区分名.<p>
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
	public static final MCMeta PAY_MTD_TYP_NM = MCMeta.createStringMeta("PAY_MTD_TYP_NM", "");

	/**
	 * 支払状況区分.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td>String</td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>1</td>
	 * </tr>
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>@</td>
	* </tr>
	 * </table>
	 */
	public static final MCMeta PAY_STS_TYP = MCMeta.createStringMeta("PAY_STS_TYP", "", 1);

	/**
	 * 支払状況区分名.<p>
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
	public static final MCMeta PAY_STS_TYP_NM = MCMeta.createStringMeta("PAY_STS_TYP_NM", "");

	/**
	 * 内部備考.<p>
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
	public static final MCMeta PAY_SCHD_INTR_RMRKS = MCMeta.createStringMeta("PAY_SCHD_INTR_RMRKS", "", 100);

	/**
	 * 支払予定票備考.<p>
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
	public static final MCMeta PAY_SCHD_PRINT_RMRKS = MCMeta.createStringMeta("PAY_SCHD_PRINT_RMRKS", "", 100);

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
	 */
	public static final MCMeta PAY_SCHD_SUB_CHAR1 = MCMeta.createStringMeta("PAY_SCHD_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta PAY_SCHD_SUB_CHAR2 = MCMeta.createStringMeta("PAY_SCHD_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta PAY_SCHD_SUB_CHAR3 = MCMeta.createStringMeta("PAY_SCHD_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta PAY_ACT_SUB_CHAR1 = MCMeta.createStringMeta("PAY_ACT_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta PAY_ACT_SUB_CHAR2 = MCMeta.createStringMeta("PAY_ACT_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta PAY_ACT_SUB_CHAR3 = MCMeta.createStringMeta("PAY_ACT_SUB_CHAR3", "", 20);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta PAY_ACT_INTR_RMRKS = MCMeta.createStringMeta("PAY_ACT_INTR_RMRKS", "", 100);

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
	 */
	public static final MCMeta PAY_ACT_D_SUB_CHAR1 = MCMeta.createStringMeta("PAY_ACT_D_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta PAY_ACT_D_SUB_CHAR2 = MCMeta.createStringMeta("PAY_ACT_D_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta PAY_ACT_D_SUB_CHAR3 = MCMeta.createStringMeta("PAY_ACT_D_SUB_CHAR3", "", 20);

	/**
	 * 内部明細備考.<p>
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
	public static final MCMeta PAY_ACT_D_INTR_RMRKS = MCMeta.createStringMeta("PAY_ACT_D_INTR_RMRKS", "", 100);

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
	 */
	public static final MCMeta PAY_NOTE_SUB_CHAR1 = MCMeta.createStringMeta("PAY_NOTE_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta PAY_NOTE_SUB_CHAR2 = MCMeta.createStringMeta("PAY_NOTE_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta PAY_NOTE_SUB_CHAR3 = MCMeta.createStringMeta("PAY_NOTE_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta MLY_ONR_PROV_BAL_SUB_CHAR1 = MCMeta.createStringMeta("MLY_ONR_PROV_BAL_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta MLY_ONR_PROV_BAL_SUB_CHAR2 = MCMeta.createStringMeta("MLY_ONR_PROV_BAL_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta MLY_ONR_PROV_BAL_SUB_CHAR3 = MCMeta.createStringMeta("MLY_ONR_PROV_BAL_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta AP_APPL_SCHD_SUB_CHAR1 = MCMeta.createStringMeta("AP_APPL_SCHD_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta AP_APPL_SCHD_SUB_CHAR2 = MCMeta.createStringMeta("AP_APPL_SCHD_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta AP_APPL_SCHD_SUB_CHAR3 = MCMeta.createStringMeta("AP_APPL_SCHD_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta AP_XRATE_REV_HIST_SUB_CHAR1 = MCMeta.createStringMeta("AP_XRATE_REV_HIST_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta AP_XRATE_REV_HIST_SUB_CHAR2 = MCMeta.createStringMeta("AP_XRATE_REV_HIST_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta AP_XRATE_REV_HIST_SUB_CHAR3 = MCMeta.createStringMeta("AP_XRATE_REV_HIST_SUB_CHAR3", "", 20);

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
	 */
	public static final MCMeta AP_EXC_GAIN_LOSS_SUB_CHAR1 = MCMeta.createStringMeta("AP_EXC_GAIN_LOSS_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta AP_EXC_GAIN_LOSS_SUB_CHAR2 = MCMeta.createStringMeta("AP_EXC_GAIN_LOSS_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta AP_EXC_GAIN_LOSS_SUB_CHAR3 = MCMeta.createStringMeta("AP_EXC_GAIN_LOSS_SUB_CHAR3", "", 20);

	/**
	 * 内部備考.<p>
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
	public static final MCMeta ADV_PAY_ACT_INTR_RMRKS = MCMeta.createStringMeta("ADV_PAY_ACT_INTR_RMRKS", "", 100);

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
	 */
	public static final MCMeta ADV_PAY_ACT_SUB_CHAR1 = MCMeta.createStringMeta("ADV_PAY_ACT_SUB_CHAR1", "", 20);

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
	 */
	public static final MCMeta ADV_PAY_ACT_SUB_CHAR2 = MCMeta.createStringMeta("ADV_PAY_ACT_SUB_CHAR2", "", 20);

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
	 */
	public static final MCMeta ADV_PAY_ACT_SUB_CHAR3 = MCMeta.createStringMeta("ADV_PAY_ACT_SUB_CHAR3", "", 20);

	/**
	 * 制御対象区分.<p>
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
	public static final MCMeta CTL_TGT_TYP = MCMeta.createStringMeta("CTL_TGT_TYP", "", 5);

	/**
	 * 納入指示ＧＮＯ.<p>
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
	public static final MCMeta DLV_INST_GRP_NO = MCMeta.createStringMeta("DLV_INST_GRP_NO", "", 15);

	/**
	 * 納期回答受領ＧＮＯ.<p>
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
	public static final MCMeta PRMS_RCPT_GRP_NO = MCMeta.createStringMeta("PRMS_RCPT_GRP_NO", "", 15);

	/**
	 * 納期回答備考.<p>
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
	public static final MCMeta PRMS_RMRKS = MCMeta.createStringMeta("PRMS_RMRKS", "", 100);

	/**
	 * 納品書管理ＮＯ.<p>
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
	public static final MCMeta DLV_SLIP_MNG_NO = MCMeta.createStringMeta("DLV_SLIP_MNG_NO", "", 15);

	/**
	 * 納品書管理明細ＮＯ.<p>
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
	public static final MCMeta DLV_SLIP_MNG_D_NO = MCMeta.createStringMeta("DLV_SLIP_MNG_D_NO", "", 15);

	/**
	 * 購買納品書作成元区分.<p>
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
	public static final MCMeta PURC_DLV_SLIP_SRC_TYP = MCMeta.createStringMeta("PURC_DLV_SLIP_SRC_TYP", "", 4);

	/**
	 * 購買納品書作成元区分名.<p>
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
	public static final MCMeta PURC_DLV_SLIP_SRC_TYP_NM = MCMeta.createStringMeta("PURC_DLV_SLIP_SRC_TYP_NM", "");

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
	 * </table>
	 */
	public static final MCMeta DLV_INST_H_SUB_CHAR1 = MCMeta.createStringMeta("DLV_INST_H_SUB_CHAR1", "", 20);

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
	 * </table>
	 */
	public static final MCMeta DLV_INST_H_SUB_CHAR2 = MCMeta.createStringMeta("DLV_INST_H_SUB_CHAR2", "", 20);

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
	 * </table>
	 */
	public static final MCMeta DLV_INST_H_SUB_CHAR3 = MCMeta.createStringMeta("DLV_INST_H_SUB_CHAR3", "", 20);

	/**
	 * インボイス作成元区分.<p>
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
	public static final MCMeta IV_SRC_TYP = MCMeta.createStringMeta("IV_SRC_TYP", "", 2);

	/**
	 * インボイス作成元区分名.<p>
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
	public static final MCMeta IV_SRC_TYP_NM = MCMeta.createStringMeta("IV_SRC_TYP_NM", "");

	/**
	 * 受領インボイス作成元区分.<p>
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
	public static final MCMeta RCPT_IV_SRC_TYP = MCMeta.createStringMeta("RCPT_IV_SRC_TYP", "", 2);

	/**
	 * 受領インボイス作成元区分名.<p>
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
	public static final MCMeta RCPT_IV_SRC_TYP_NM = MCMeta.createStringMeta("RCPT_IV_SRC_TYP_NM", "");

	/**
	 * 連携スケジューラ区分.<p>
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
	public static final MCMeta IF_SCHEDULER_TYP = MCMeta.createStringMeta("IF_SCHEDULER_TYP", "", 2);

	/**
	 * 連携スケジューラ区分名.<p>
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
	public static final MCMeta IF_SCHEDULER_TYP_NM = MCMeta.createStringMeta("IF_SCHEDULER_TYP_NM", "");

	/**
	 * リンクキー.<p>
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
	public static final MCMeta LINK_KEY = MCMeta.createStringMeta("LINK_KEY", "", 300);

}

