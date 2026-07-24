package mcframe.serverMGBD.MGBDL0020;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"Dtl"コンテナListクラスです。<p>
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
 * @see mcframe.serverMGBD.MGBDL0020.DtlR
 */
@EI
public class DtlL<E extends DtlR> extends DtlL_MC_A<E> {

	/**
	 * 新しいListを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static <T extends DtlR> DtlL<T> createMG_MGBDL0020_Dtl(Class<T> clazz) {
		DtlL<T> ls = new DtlL<T>(clazz);
		return ls;
	}

	/**
	 * 新しいListを生成します。
	 *
	 * @param initCapacity 初期容量
	 * @return 新しいインスタンス
	 */
	public static <T extends DtlR> DtlL<T> createMG_MGBDL0020_Dtl(Class<T> clazz, int initCapacity) {
		DtlL<T> ls = new DtlL<T>(clazz, initCapacity);
		return ls;
	}


	/**
	 * 新しいListを生成し別のListのRowを複製して追加します。
	 *
	 * @param proto 複製するRowを格納したList
	 * @return 複製したRowを追加した新しいインスタンス
	 */
	public static <T extends DtlR> DtlL<T> createMG_MGBDL0020_DtlByName(Class<T> clazz, MCList<? extends MCRow> proto) {
		DtlL<T> ls = DtlL.createMG_MGBDL0020_Dtl(clazz);
		copyByName(ls, proto);
		return ls;
	}


	/**
	 * コンストラクタです。
	 */
	protected DtlL(Class<E> rowc) {
		super(rowc);
	}

	/**
	 * コンストラクタです。
	 */
	protected DtlL(Class<E> rowc, int initCapacity) {
		super(rowc, initCapacity);
	}

}