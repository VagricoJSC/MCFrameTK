package mcframe.serverMABC.MABCL1530;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"IfProtocol_DelChk01_Dtl"コンテナRowクラスです。<p>
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
 *  	<td>ext_sys_cd</td>
 *  	<td>External system cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#EXT_SYS_CD EXT_SYS_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>if_proc_typ</td>
 *  	<td>IF process type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_PROC_TYP IF_PROC_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>if_ctl_typ</td>
 *  	<td>IF control type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_CTL_TYP IF_CTL_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>upd_cntr</td>
 *  	<td>Update counter</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#UPD_CNT UPD_CNT}]</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class IfProtocol_DelChk01_DtlR extends IfProtocol_DelChk01_DtlR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static IfProtocol_DelChk01_DtlR create() {
		IfProtocol_DelChk01_DtlR row = new IfProtocol_DelChk01_DtlR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> IfProtocol_DelChk01_DtlR createByName(T proto) {
		IfProtocol_DelChk01_DtlR row = IfProtocol_DelChk01_DtlR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public IfProtocol_DelChk01_DtlR(ConstMetaList<? extends IfProtocol_DelChk01_DtlR> metas) {
		super(metas);
	}
}