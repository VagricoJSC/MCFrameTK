package mcframe.serverMGBD.MGBDL0030;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"Srch02_Dtl"コンテナListクラスです。<p>
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
 *  	<td>menu_no</td>
 *  	<td>Menu placement number</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#MENU_NO MENU_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>module_id</td>
 *  	<td>Module ID</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#MODULE_ID MODULE_ID}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>scrn_id</td>
 *  	<td>Screen ID</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SCREEN_ID SCREEN_ID}]</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 *
 * @see mcframe.serverMGBD.MGBDL0030.Srch02_DtlR
 */
@EI
public class Srch02_DtlL<E extends Srch02_DtlR> extends Srch02_DtlL_MC_A<E> {

	/**
	 * 新しいListを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static <T extends Srch02_DtlR> Srch02_DtlL<T> createMG_MGBDL0030_Srch02_Dtl(Class<T> clazz) {
		Srch02_DtlL<T> ls = new Srch02_DtlL<T>(clazz);
		return ls;
	}

	/**
	 * 新しいListを生成します。
	 *
	 * @param initCapacity 初期容量
	 * @return 新しいインスタンス
	 */
	public static <T extends Srch02_DtlR> Srch02_DtlL<T> createMG_MGBDL0030_Srch02_Dtl(Class<T> clazz, int initCapacity) {
		Srch02_DtlL<T> ls = new Srch02_DtlL<T>(clazz, initCapacity);
		return ls;
	}


	/**
	 * 新しいListを生成し別のListのRowを複製して追加します。
	 *
	 * @param proto 複製するRowを格納したList
	 * @return 複製したRowを追加した新しいインスタンス
	 */
	public static <T extends Srch02_DtlR> Srch02_DtlL<T> createMG_MGBDL0030_Srch02_DtlByName(Class<T> clazz, MCList<? extends MCRow> proto) {
		Srch02_DtlL<T> ls = Srch02_DtlL.createMG_MGBDL0030_Srch02_Dtl(clazz);
		copyByName(ls, proto);
		return ls;
	}


	/**
	 * コンストラクタです。
	 */
	protected Srch02_DtlL(Class<E> rowc) {
		super(rowc);
	}

	/**
	 * コンストラクタです。
	 */
	protected Srch02_DtlL(Class<E> rowc, int initCapacity) {
		super(rowc, initCapacity);
	}

}