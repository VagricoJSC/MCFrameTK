package mcframe.serverMGBD.MGBDL5010;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"CalcRsltDel_Dtl"コンテナListクラスです。<p>
 *
 * <br>
 *
 * <table border=1 cellspacing=0 cellpadding=2 >
 *  <caption>[項目定義]</caption>
 * 	<tr bgcolor="#cccccc">
 *  	<th>alias</th>
 *  	<th>項目名</th>
 *  	<th>フルネーム</th>
 *  	<th>型</th>
 *  	<th>桁</th>
 *  	<th>INNERROW/COLUMNPATH</th>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>calc_grp_cd</td>
 *  	<td>Calculation group cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#CALC_GRP_CD CALC_GRP_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>calc_no</td>
 *  	<td>Calculation No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#CALC_NO CALC_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>upd_cntr</td>
 *  	<td>Update counter</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#INT INT}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>err_flg</td>
 *  	<td>Error</td>
 *  	<td>Boolean</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#FLG FLG}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>rtn_sts_typ</td>
 *  	<td>Process result status type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#RTN_STS_TYP RTN_STS_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 *
 * @see mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR
 */
@EI
public class CalcRsltDel_DtlL<E extends CalcRsltDel_DtlR> extends CalcRsltDel_DtlL_MC_A<E> {

	/**
	 * 新しいListを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static <T extends CalcRsltDel_DtlR> CalcRsltDel_DtlL<T> createMG_MGBDL5010_CalcRsltDel_Dtl(Class<T> clazz) {
		CalcRsltDel_DtlL<T> ls = new CalcRsltDel_DtlL<T>(clazz);
		return ls;
	}

	/**
	 * 新しいListを生成します。
	 *
	 * @param initCapacity 初期容量
	 * @return 新しいインスタンス
	 */
	public static <T extends CalcRsltDel_DtlR> CalcRsltDel_DtlL<T> createMG_MGBDL5010_CalcRsltDel_Dtl(Class<T> clazz, int initCapacity) {
		CalcRsltDel_DtlL<T> ls = new CalcRsltDel_DtlL<T>(clazz, initCapacity);
		return ls;
	}


	/**
	 * 新しいListを生成し別のListのRowを複製して追加します。
	 *
	 * @param proto 複製するRowを格納したList
	 * @return 複製したRowを追加した新しいインスタンス
	 */
	public static <T extends CalcRsltDel_DtlR> CalcRsltDel_DtlL<T> createMG_MGBDL5010_CalcRsltDel_DtlByName(Class<T> clazz, MCList<? extends MCRow> proto) {
		CalcRsltDel_DtlL<T> ls = CalcRsltDel_DtlL.createMG_MGBDL5010_CalcRsltDel_Dtl(clazz);
		copyByName(ls, proto);
		return ls;
	}


	/**
	 * コンストラクタです。
	 */
	protected CalcRsltDel_DtlL(Class<E> rowc) {
		super(rowc);
	}

	/**
	 * コンストラクタです。
	 */
	protected CalcRsltDel_DtlL(Class<E> rowc, int initCapacity) {
		super(rowc, initCapacity);
	}

}