package mcframe.commonPFBB.PFBBR5220;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"Dtl"コンテナRowクラスです。<p>
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
 *  	<td>departmenttype</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>1,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>code</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>name</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>activeflag</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>1,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>extension</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>2</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>searchcharacter</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>1</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>zip</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>50</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>address1</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>250</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>address2</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>250</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>tel1</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>50</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>tel2</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>50</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>fax</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>50</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>paymentwarehouse</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>location</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>bookno_numbering_flag</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>mfgflg</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>1,0</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class DtlR extends DtlR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static DtlR create() {
		DtlR row = new DtlR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> DtlR createByName(T proto) {
		DtlR row = DtlR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public DtlR(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}
}