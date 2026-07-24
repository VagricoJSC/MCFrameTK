package mcframe.serverMGBD.MGBDL5410;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"CopyItmDtl_Upd01_Dtl"コンテナListクラスです。<p>
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
 *  	<td>calc_ctg_cd</td>
 *  	<td>Calculation category cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#CALC_CTG_CD CALC_CTG_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>wg_cd</td>
 *  	<td>WG cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#WG_CD WG_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>term</td>
 *  	<td>Term</td>
 *  	<td>Date</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#YM YM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>itm_cd</td>
 *  	<td>Item cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_CD ITM_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>itm_sub1</td>
 *  	<td>Branch No. 1</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_SUB1 ITM_SUB1}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>itm_sub2</td>
 *  	<td>Branch No. 2</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_SUB2 ITM_SUB2}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>itm_sub3</td>
 *  	<td>Branch No. 3</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_SUB3 ITM_SUB3}]</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 *
 * @see mcframe.serverMGBD.MGBDL5410.CopyItmDtl_Upd01_DtlR
 */
@EI
public class CopyItmDtl_Upd01_DtlL<E extends CopyItmDtl_Upd01_DtlR> extends CopyItmDtl_Upd01_DtlL_MC_A<E> {

	/**
	 * 新しいListを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static <T extends CopyItmDtl_Upd01_DtlR> CopyItmDtl_Upd01_DtlL<T> createMG_MGBDL5410_CopyItmDtl_Upd01_Dtl(Class<T> clazz) {
		CopyItmDtl_Upd01_DtlL<T> ls = new CopyItmDtl_Upd01_DtlL<T>(clazz);
		return ls;
	}

	/**
	 * 新しいListを生成します。
	 *
	 * @param initCapacity 初期容量
	 * @return 新しいインスタンス
	 */
	public static <T extends CopyItmDtl_Upd01_DtlR> CopyItmDtl_Upd01_DtlL<T> createMG_MGBDL5410_CopyItmDtl_Upd01_Dtl(Class<T> clazz, int initCapacity) {
		CopyItmDtl_Upd01_DtlL<T> ls = new CopyItmDtl_Upd01_DtlL<T>(clazz, initCapacity);
		return ls;
	}


	/**
	 * 新しいListを生成し別のListのRowを複製して追加します。
	 *
	 * @param proto 複製するRowを格納したList
	 * @return 複製したRowを追加した新しいインスタンス
	 */
	public static <T extends CopyItmDtl_Upd01_DtlR> CopyItmDtl_Upd01_DtlL<T> createMG_MGBDL5410_CopyItmDtl_Upd01_DtlByName(Class<T> clazz, MCList<? extends MCRow> proto) {
		CopyItmDtl_Upd01_DtlL<T> ls = CopyItmDtl_Upd01_DtlL.createMG_MGBDL5410_CopyItmDtl_Upd01_Dtl(clazz);
		copyByName(ls, proto);
		return ls;
	}


	/**
	 * コンストラクタです。
	 */
	protected CopyItmDtl_Upd01_DtlL(Class<E> rowc) {
		super(rowc);
	}

	/**
	 * コンストラクタです。
	 */
	protected CopyItmDtl_Upd01_DtlL(Class<E> rowc, int initCapacity) {
		super(rowc, initCapacity);
	}

}